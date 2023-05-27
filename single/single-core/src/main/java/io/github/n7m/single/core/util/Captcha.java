package io.github.n7m.single.core.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Random;

public class Captcha {

    /**
     * 定义图形大小
     */
    private static final int width = 105;
    /**
     * 定义图形大小
     */
    private static final int height = 35;

    /**
     * 定义干扰线数量
     */
    private static final int count = 200;

    /**
     * 干扰线的长度=1.414*lineWidth
     */
    private static final int lineWidth = 2;

    /**
     * 图片格式
     */
    private static final String IMG_FORMAT = "JPEG";

    /**
     * base64 图片前缀
     */
    private static final String BASE64_PRE = "data:image/jpg;base64,";

    /**
     * 生成base64字符串
     * @param resultCode
     * @return
     * @throws IOException
     */
    public static String generate(String resultCode) throws IOException {
        BufferedImage image = getImageBuffer(resultCode);
        ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
        ImageIO.write(image, IMG_FORMAT, byteStream);
        byte[] bytes = byteStream.toByteArray();
        String base64 = Base64.getEncoder().encodeToString(bytes).trim();
        base64 = base64.replaceAll("\n", "").replaceAll("\r", "");//删除 \r\n
        return BASE64_PRE+base64;
    }

    private static BufferedImage getImageBuffer(String resultCode){
        final BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        final Graphics2D graphics = (Graphics2D) image.getGraphics();
        graphics.setColor(Color.WHITE); // ---1
        graphics.fillRect(0, 0, width, height);
        graphics.drawRect(0, 0, width - 1, height - 1);
        final Random random = new Random();
        for (int i = 0; i < count; i++) {
            graphics.setColor(getRandColor(150, 200));
            final int x = random.nextInt(width - lineWidth - 1) + 1;
            final int y = random.nextInt(height - lineWidth - 1) + 1;
            final int xl = random.nextInt(lineWidth);
            final int yl = random.nextInt(lineWidth);
            graphics.drawLine(x, y, x + xl, y + yl);
        }
        // 取随机产生的认证码
        for (int i = 0; i < resultCode.length(); i++) {
            graphics.setColor(Color.BLACK);
            graphics.setFont(new Font("Times New Roman", Font.BOLD, 24));
            graphics.drawString(String.valueOf(resultCode.charAt(i)), (23 * i) + 8, 26);
        }
        graphics.dispose();
        return image;
    }

    private static Color getRandColor(int fc, int bc) { // 取得给定范围随机颜色
        final Random random = new Random();
        if (fc > 255) {
            fc = 255;
        }
        if (bc > 255) {
            bc = 255;
        }
        final int r = fc + random.nextInt(bc - fc);
        final int g = fc + random.nextInt(bc - fc);
        final int b = fc + random.nextInt(bc - fc);
        return new Color(r, g, b);
    }

}
