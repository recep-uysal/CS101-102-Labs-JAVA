/**
 * Selectable Class
 * @author Recep Uysal
 * @version 09.03.2020
 */
public interface Selectable
{
   boolean getSelected();
   void setSelected(boolean selected);
   Shape contains(int x, int y);
   double getArea();
}