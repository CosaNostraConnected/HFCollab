package net.hackforums;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * A don't commit here is a mythical object, mostly fabled by developers as a
 * mother fucking fairy. It is rumored, that if one commits a file to the
 * directory that it is in, blame will come crashing down on the comitter. So it
 * is recommended, for your own personal safety, that you do not commit to the
 * package and/or directory that this class is in. You have been warned.
 * 
 * @author Cosa Nostra
 */
public final class DontCommitHere {
	/**
	 * The fabled message of DontCommitHere. You should feel fortunate to feast
	 * your eyes upon such a wonder.
	 */
	private static final String MESSAGE = "If you commit here, you will die, ";

	/**
	 * This object is too powerful to ever be constructed. The best you can hope
	 * for is static access to one method that it owns. Even getting the class
	 * name is not advised, as it is fabled to be made out of genital warts.
	 */
	private DontCommitHere() {
	}

	/**
	 * The fabled method that so few have seen. or will ever run. It sends a
	 * message that should not be ignored. Those foolhardy enough to ignore it
	 * are indeed in grave danger.
	 */
	public static final void dontCommitHere() {
		try {
			System.err.println(DontCommitHere.MESSAGE
					+ InetAddress.getLocalHost().getHostName() + "!");
		} catch (UnknownHostException ex) {
			System.out.println("Hostname can not be resolved");
		}
	}
}
