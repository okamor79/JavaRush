package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    private ImageTypes types;

    public static ImageReader getImageReader(ImageTypes types) {
        try {
            if (types.equals(ImageTypes.BMP)) {
                return new BmpReader();
            } else if (types.equals(ImageTypes.JPG)) {
                return new JpgReader();
            } else  if (types.equals(ImageTypes.PNG)) {
                return new PngReader();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return null;
    }
}
