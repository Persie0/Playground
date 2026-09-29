package p000;

import com.google.android.gms.internal.vision.C1031p;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cnc {

    /* JADX INFO: renamed from: a */
    public static final Logger f10338a = Logger.getLogger(C1031p.class.getName());

    /* JADX INFO: renamed from: b */
    public static final String f10339b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX INFO: renamed from: a */
    public static klc m4904a() {
        String str;
        ClassLoader classLoader = cnc.class.getClassLoader();
        if (klc.class.equals(klc.class)) {
            str = f10339b;
        } else {
            if (!klc.class.getPackage().equals(cnc.class.getPackage())) {
                C3386nv.m17626m(klc.class.getName());
                return null;
            }
            str = klc.class.getPackage().getName() + ".BlazeGenerated" + klc.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        g9a.m12435l(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new cnc[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Level level = Level.SEVERE;
                        String simpleName = klc.class.getSimpleName();
                        f10338a.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", simpleName.length() != 0 ? "Unable to load ".concat(simpleName) : new String("Unable to load "), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (klc) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (klc) klc.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    uk9.m22779n(e6);
                    return null;
                } catch (NoSuchMethodException e7) {
                    uk9.m22779n(e7);
                    return null;
                } catch (InvocationTargetException e8) {
                    uk9.m22779n(e8);
                    return null;
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }
}
