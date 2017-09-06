package example.codeclan.com.composition_start;

/**
 * Created by user on 28/08/2017.
 */

import static org.junit.Assert.*;
import org.junit.*;

import example.codeclan.com.composition_start.wizard_management.*;

public class WizardTest {

    Wizard wizard;
    Wizard wizard2;
    Wizard wizard3;
    Broomstick broomstick;
    Dragon dragon;
    MagicCarpet magicCarpet;

    @Before
    public void before(){
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
        dragon = new Dragon("Draggy");
        wizard2 = new Wizard("Steve", dragon);
        magicCarpet = new MagicCarpet("Red");
        wizard3 = new Wizard("John", magicCarpet);
    }

    @Test
    public void hasName(){
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick(){
        assertEquals("Nimbus", wizard.getRide().getTag());
    }

    @Test
    public void hasMagicCarpet(){
        assertEquals("Red", wizard3.getRide().getTag());
    }

    @Test
    public void hasDragon() { assertEquals("Draggy", wizard2.getRide().getTag() );}

    @Test
    public void canFlyBroomstick(){
        assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
    }

    @Test
    public void canFlyDragon(){
        assertEquals(wizard2.fly(), "Standing up tall, beating wings, lift off!" );
    }

    @Test
    public void canFlyMagicCarpet(){
        assertEquals(wizard3.fly(), "Hovering up, straightening out, flying off!" );
    }
}
