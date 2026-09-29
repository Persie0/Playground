package p000;

import androidx.compose.runtime.AbstractC0279g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Result;

/* JADX INFO: loaded from: classes.dex */
public abstract class gi5 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0279g f40854a;

    static {
        Object failure;
        try {
            ClassLoader classLoader = ub5.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC0279g) {
                        failure = (AbstractC0279g) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof zb2)) {
                    i++;
                }
                failure = null;
                break;
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        AbstractC0279g vh9Var = (AbstractC0279g) (failure instanceof Result.Failure ? null : failure);
        if (vh9Var == null) {
            vh9Var = new vh9(new uf4(26));
        }
        f40854a = vh9Var;
    }
}
