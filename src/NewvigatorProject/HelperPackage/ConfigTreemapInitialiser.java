package NewvigatorProject.HelperPackage;

import java.util.ArrayList;
import java.util.Arrays;

import static NewvigatorProject.Main.configurationTileValues;

public class ConfigTreemapInitialiser {

    private static final ArrayList<Integer> valueZero = new ArrayList<Integer>(Arrays.asList(null, null));
    private static final ArrayList<Integer> exampleTemplate = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 4, 1, 2, -2, 0, -1));
    /*
    values:
    [0] - 0: Cumbernauld Campus
    [1] - 0: There is not a room selected (Goto: default)
    [2] - 0: Ground Floor
    [3] - 0: No rotation
    [4] - 4: Open the Newvigator screen
    [5] - 1: Enables the voice assistant per item setting.
    [6] - 2: The reception is loaded.
    [7] - -2: This is the smallest window size
    [8] - 0: Not fullscreen, windowed
    [9] - -1: The smallest window is 480p
     */









    //TODO: update the values of entry 2,3,4 & 5.
    private static final ArrayList<Integer> smallCumbernauldWindow = new ArrayList<Integer>(Arrays.asList(
            0, //Campus Number [0 = Cumbernauld]
            0, //Room Selection [0 = Default]
            0, //Floor Selection [0x0 = Reception on ground floor]
            0, //Rotation Selection
            4, //Should remain 4 as this will pop open the Newvigator Screen
            0, //Assistance settings - None
            2, //User interface value, 2 is "Image is loaded"
            -2, //Mouse sensitivity, -1 is 50%
            0, //Not fullscreen
            -1)); //Window size 640x480

    private static final ArrayList<Integer> largeCumbernauldWindow = new ArrayList<Integer>(Arrays.asList(
            0, //Campus Number [0 = Cumbernauld]
            0, //Room Selection [0 = Default]
            0, //Floor Selection [0x0 = Reception on ground floor]
            0, //Rotation Selection
            4, //Should remain 4 as this will pop open the Newvigator Screen
            0, //Assistance settings - None
            2, //User interface value, 2 is "Image is loaded"
            1, //Mouse sensitivity, -1 is 150%
            0, //Not fullscreen
            2)); //Window size 1440x900

    private static final ArrayList<Integer> fullscreenCumbernauldWindow = new ArrayList<Integer>(Arrays.asList(
            0, //Campus Number [0 = Cumbernauld]
            0, //Room Selection [0 = Default]
            0, //Floor Selection [0x0 = Reception on ground floor]
            0, //Rotation Selection
            4, //Should remain 4 as this will pop open the Newvigator Screen
            0, //Assistance settings
            2, //User interface value, 2 is "Image is loaded"
            1, //Mouse sensitivity, 1 is 150%
            1, //Fullscreen
            4)); //Window size 1920x1080

    private static final ArrayList<Integer> accessibleCumbernauldWindow = new ArrayList<Integer>(Arrays.asList(
            0, //Campus Number [0 = Cumbernauld]
            0, //Room Selection [0 = Default]
            0, //Floor Selection [0x0 = Reception on ground floor]
            0, //Rotation Selection
            4, //Should remain 4 as this will pop open the Newvigator Screen
            1, //Assistance settings - Voice Enabled
            2, //User interface value, 2 is "Image is loaded"
            0, //Mouse sensitivity, 0 is 100%
            0, //Not fullscreen
            0)); //Window size 1280x720

    private static final ArrayList<Integer> accessibleCumbernauldFullscreen = new ArrayList<Integer>(Arrays.asList(
            0, //Campus Number [0 = Cumbernauld]
            0, //Room Selection [0 = Default]
            0, //Floor Selection [0x0 = Reception on ground floor]
            0, //Rotation Selection
            4, //Should remain 4 as this will pop open the Newvigator Screen
            1, //Assistance settings - Voice Enabled
            2, //User interface value, 2 is "Image is loaded"
            2, //Mouse sensitivity, 2 is 200%
            1, //Fullscreen
            4)); //Window size 1920x1080


    public static void Initialise(){
        configurationTileValues.put(0, valueZero); // value "0" should never be accessed, it will throw a NullPointerException.
        configurationTileValues.put(1, smallCumbernauldWindow); // Cumbernauld Small
        configurationTileValues.put(2, largeCumbernauldWindow); // Cumbernauld Large
        configurationTileValues.put(3, fullscreenCumbernauldWindow); // Cumbernauld Full
        configurationTileValues.put(4, accessibleCumbernauldWindow); // Cumbernauld Accessible Window
        configurationTileValues.put(5, accessibleCumbernauldFullscreen); // Cumbernauld Accessible Full
    }

}
