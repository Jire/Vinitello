package net.burtleburtle.bob.rand;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;

/**
 * @author Daniel Berlin
 * @author Thomas Nappo
 */
public final class ISAACProvider extends Provider {
	private static final long serialVersionUID = -3303896859842764050L;

	public static final String NAME    = "ISAACProvider";
	public static final double VERSION = 0.3;
	public static final String INFO    = "Provider for the ISAAC PRNG";

	public ISAACProvider () {
		super (NAME, VERSION, INFO);

		AccessController.doPrivileged(new PrivilegedAction<Object> () {
			@Override
			public Object run () {
				put ("SecureRandom.ISAACRandom", "net.burtleburtle.bob.rand.ISAACEngine");
				return (null);
			}
		});
	}

}