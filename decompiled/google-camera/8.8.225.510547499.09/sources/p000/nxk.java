package p000;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class nxk {

    /* JADX INFO: renamed from: a */
    private static final Logger f44971a = Logger.getLogger(nxb.class.getName());

    /* JADX INFO: renamed from: b */
    private static final String f44972b = "nwi";

    /* JADX INFO: renamed from: b */
    static nxf m18035b(Class cls) {
        String str;
        ClassLoader classLoader = nxk.class.getClassLoader();
        if (cls.equals(nxf.class)) {
            str = f44972b;
        } else {
            if (!cls.getPackage().equals(nxk.class.getPackage())) {
                throw new IllegalArgumentException(cls.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        }
        try {
            try {
                try {
                    try {
                        return (nxf) cls.cast(((nxk) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo18036a());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (NoSuchMethodException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException e5) {
            Iterator it = ServiceLoader.load(nxk.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((nxf) cls.cast(((nxk) it.next()).mo18036a()));
                } catch (ServiceConfigurationError e6) {
                    f44971a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(String.valueOf(cls.getSimpleName())), (Throwable) e6);
                }
            }
            if (arrayList.size() == 1) {
                return (nxf) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (nxf) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    protected abstract nxf mo18036a();
}
