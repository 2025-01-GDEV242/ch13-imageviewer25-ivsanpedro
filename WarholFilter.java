import java.awt.Color;

/**
 * An image filter to mirror (flip) the image horizontally.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 */
public class WarholFilter extends Filter
{
    /**
     * Constructor for objects of class WarholFilter.
     * @param name The name of the filter.
     */
    public WarholFilter(String name)
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
        //top left image
        int height = image.getHeight();
        int width = image.getWidth();
        //bottom left image
        int blHeight = image.getHeight()/2;
        int blWidth = image.getWidth();
        //top right image
        int trHeight = image.getHeight();
        int trWidth = image.getWidth()/2;
        //bottom right image
        int brHeight = image.getHeight()/2;
        int brWidth = image.getWidth()/2;
        
        //OFImage newImage = new OFImage(width, height);
        
        
        //top left
        for(int y = 0; y < height; y+=2) {
                for(int x = 0; x < width; x+=2) {
                    image.setPixel(x/2, y/2, image.getPixel(x, y));
                }
        }
        
        //top right
        // for(int y = 0; y < height; y+=2) {
                // for(int x = trWidth; x < width; x+=2) {
                    // newImage.setPixel(x/2, y/2, image.getPixel(x, y));
                // }
        // }
        // for(int y = 0; y < height; y++) {
            // for(int x = 0; x < width / 2; x++) {
                // Color left = image.getPixel(x, y);
                // image.setPixel(x, y, image.getPixel(width - 1 - x, y));
                // image.setPixel(width - 1 - x, y, left);
            // }
        // }
        
    }
}
