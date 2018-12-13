/**
 * 
 */
package dataweavesample.com.upesh;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

/**
 * @author Upesh
 *
 */
public class DataWeaveTest implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		System.out.println(eventContext.getMessage().getPayload().getClass().getName());
		User user=new User("Upesh",40, 40000.00);
		
		return user;
	}

}
