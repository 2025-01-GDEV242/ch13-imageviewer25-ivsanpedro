import java.awt.Color;
/**
 * Write a description of class GreenFilter here.
 *
 * @author Ivana San Pedro
 * @version 4/21/2025
 */
public class GreenFilter extends Filter
{
    /**
     * Constructor for objects of class GreenFilter Filter.
     * @param name The name of the filter.
     */
    public GreenFilter(String name)
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
                Color pix = new Color(image.getRGB(x, y));
                int greenPixVal = pix.getGreen();
                Color green = new Color(0,greenPixVal,0);
                image.setRGB(x, y, green.getRGB());
            }
        }
    }
}
