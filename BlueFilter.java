import java.awt.Color;
/**
 * Write a description of class BlueFilter here.
 *
 * @author Ivana San Pedro
 * @version 4/21/2025
 */
public class BlueFilter extends Filter
{
    /**
     * Constructor for objects of class BlueFilter Filter.
     * @param name The name of the filter.
     */
    public BlueFilter(String name)
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
        //BufferedImage redImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = new Color(image.getRGB(x, y));
                int bluePixVal = pix.getBlue();
                Color blue = new Color(0,0,bluePixVal);
                image.setRGB(x, y, blue.getRGB());
            }
        }
    }
}
