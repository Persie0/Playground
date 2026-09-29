package p000;

import android.os.Looper;
import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.sequences.AbstractC3204c;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class dp5 {

    /* JADX INFO: renamed from: a */
    public static final xq3 f36000a;

    static {
        String property;
        int i = zp9.f71940a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        Iterator it = AbstractC3204c.m15421q0(AbstractC3204c.m15413i0(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                ((MainDispatcherFactory) next).getClass();
                do {
                    ((MainDispatcherFactory) it.next()).getClass();
                } while (it.hasNext());
            }
        }
        if (((MainDispatcherFactory) next) == null) {
            C3386nv.m17633t("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            f36000a = new xq3(yq3.m25282a(mainLooper));
        } else {
            C3386nv.m17633t("The main looper is not available");
        }
    }
}
