package oreexcavation.core;

import java.util.ArrayList;
import java.util.List;

/**
 * A container for all the configurable settings in the mod
 */
public class ExcavationSettings
{
	public static int mineSpeed = 128;
	public static int mineLimit = 64;
	public static int mineRange = 16;
	public static float exaustion = 0.1F;
	
	/**
	 * -1 Disabled, 0 = Normal, 1 = Sneak, 2 = Always
	 */
	public static int mineMode = 1;
	
	public static boolean openHand = false;
	public static boolean ignoreTools = false;
	
	public static List<String> toolBlacklist = new ArrayList<String>();
	public static List<String> blockBlacklist = new ArrayList<String>();
}
