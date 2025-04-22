import java.awt.Color;
/**
 * Write a description of class GreenChannel here.
 *
 * @author Ivana San Pedro
 * @version 4/21/2025
 */
public class GreenChannel extends Filter
{
    /**
     * Constructor for objects of class RedChannel Filter.
     * @param name The name of the filter.
     */
    public GreenChannel(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    { 
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                int greenPixelVal = pix.getGreen();
                image.setPixel(x, y, new Color(greenPixelVal, greenPixelVal, greenPixelVal));
            }
        }
    }
}
