package microsim.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

/**
 * Annotate variables of the simulation manager automatically managed by JAS-mine gui
 * to ask parameters to simulation user.  Note that this has been deprecated as the name
 * is misleading.  Please use GUIparameter class instead.
 *  
 * @author Michele Sonnessa
 *
 */
@Deprecated
@Retention(RetentionPolicy.RUNTIME)
@Target( { ElementType.FIELD })		//Added by Ross 
public @interface ModelParameter {

	public String section() default "";
	
	public String name() default "";
	
	public String description() default "";
	
}
