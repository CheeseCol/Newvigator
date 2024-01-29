package NewvigatorProject;

import NewvigatorProject.HelperPackage.ConfigTreemapInitialiser;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

    //=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
    //Project Author: Simon Fraser
    //Group Members: Crisdean MacQuarrie, Stuart Kinross
    //Project Started: 28/11/2023 - 12:40
    //Phase 1 (MVP) Finished: ??/??/2024 - ??:??
    //Phase 2 Finished (Improved) Finished: ??/??/2024 - ??:??
    //Phase 2 Testing Finished: ??/??/2024 - ??:??
    //Phase 3 (Finalised) Finished: ??/??/2024 - ??:??
    //Phase 3 Testing Finished: ??/??/2024 - ??:??
    //Project Finished: ??/??/2024 - ??:??
    //Project Name: CheeseCo Newvigator.
    //=-==-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=



    /**
     * Range of values:<br>
     * 0 - 1280x720 <br>
     * 1 - 1366x768 <br>
     * 2 - 1440x900 <br>
     * 3 - 1536x864 <br>
     * 4 - 1980x1020 <br>
     * -1 - 640x480 <br>
     * Default setting: 5, this is the most common supported resolution.
     */
    public static int resolutionSetting = 4;



    /**
     * Range of values:<br>
     * 0 - Cumbernauld <br>
     * 1 - Coatbridge <br>
     * 2 - Motherwell <br>
     * 3 - Kirkintilloch <br>
     * 4 - Broadwood <br>
     * Note: this feature may or may not be supported depending on time remaining.<br>
     * Default setting: 1, this is our campus and will be the first one added.
     */
    public static int campusValue = 0;



    /**
     * Range of values:<br>
     * from 0 to X, where X is the number of rooms on the floor.<br>
     * Default setting: 0, this value represents no room being selected.
     */
    public static int selectedRoom = 0;



    /**
     * Range of values:<br>
     * from 0 to X, where X is the number of floors above ground level on the campus.<br>
     * Default setting: 0, this value represents the ground floor.
     */
    public static int selectedFloor = 0;

    
    
    /**
     * Range of values:<br>
     * 0 - No assistance <br>
     * 1 - Voice assistance <br>
     */
    public static int accessibilityValue = 0;



    /**
     * Range of values:<br>
     * between 0 and 360, going above 360, 360 is subtracted, going below 0, 360 is added.<br>
     * Default setting: 0, this value is the default angle for the panorama.
     */
    public static float currRotation = 0.0f;



    /**
     * Range of values:<br>
     * 0 - Main Menu
     * 1 - Settings Screen
     * 2 - Credits Screen
     * 3 - Help Screen
     * 4 - Newvigator Screen
     * Default Value: 0, so the main menu will load on startup.
     */
    public static int activeScreen = 0;



    /**
     * Range of values:<br>
     * 0 - Inactive
     * 1 - Image is not loaded (Map view)
     * 2 - Image is loaded (Room view)
     * 3 - Help menu from map tiles (Map view)
     * 4 - Help menu from loaded image (Room view)
     * Default Value: 0, so the additional UI tiles will not be active.
     */
    public static int userInterfaceValue = 0;



    /**
     * Range of values:<br>
     * -5 - 10%. <br>
     * -4 - 25%. <br>
     * -3 - 35%. <br>
     * -2 - 50%. <br>
     * -1 - 75%. <br>
     * 0 - 100%. <br>
     * 1 - 150%. <br>
     * 2 - 200%. <br>
     * 3 - 250%. <br>
     * 4 - 400%. <br>
     * 5 - 666%. <br>
     * Default Value: 0, or normal mouse sensitivity.
     */
    public static int sensitivitySetting = 0;



    /**
     * Range of values:<br>
     * 0 - Not fullscreen <br>
     * 1 - In Fullscreen <br>
     * Default Value: 0, not in fullscreen. <br>
     * Uses Integer to be compatible with the ArrayList.
     */
    public static int isFullscreen = 0;



    /**
     * Range of values:<br>
     * Integer - Arbitrary values for ordering the collection. <br> <br>
     * ArrayList[Integer]-> An ordered collection of potential configuration options which can be queried by the settings menu, this will override the: <br>
     * [0] campusValue, <br>
     * [1] selectedRoom, <br>
     * [2] selectedFloor, <br>
     * [3] currRotation, <br>
     * [4] activeScreen, <br>
     * [5] accessibilityValue, <br>
     * [6] userInterfaceValue, <br>
     * [7] sensitivitySetting. <br>
     * [8] isFullscreen. <br>
     * [9] resolutionSetting <br><br>
     * See the associated helper class for exact values within the 15 default configurations.
     */
    public static TreeMap<Integer, ArrayList<Integer>> configurationTileValues = new TreeMap<Integer, ArrayList<Integer>>();



    public static void main(String[] args){
        //Initialise Program.
        ConfigTreemapInitialiser.Initialise();
    }
}
