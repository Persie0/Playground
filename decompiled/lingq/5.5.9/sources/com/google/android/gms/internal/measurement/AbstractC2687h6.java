package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2687h6 {

    /* JADX INFO: renamed from: a */
    public static final Logger f14231a = Logger.getLogger(AbstractC2887w5.class.getName());

    /* JADX INFO: renamed from: b */
    public static final String f14232b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: b */
    public static C2589a6 m7869b() {
        String str;
        ClassLoader classLoader = AbstractC2687h6.class.getClassLoader();
        if (C2589a6.class.equals(C2589a6.class)) {
            str = f14232b;
        } else {
            if (!C2589a6.class.getPackage().equals(AbstractC2687h6.class.getPackage())) {
                throw new IllegalArgumentException(C2589a6.class.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", C2589a6.class.getPackage().getName(), C2589a6.class.getSimpleName());
        }
        try {
            try {
                try {
                    return (C2589a6) C2589a6.class.cast(((AbstractC2687h6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).m7870a());
                } catch (IllegalAccessException e10) {
                    throw new IllegalStateException(e10);
                } catch (InstantiationException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(AbstractC2687h6.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C2589a6) C2589a6.class.cast(((AbstractC2687h6) it.next()).m7870a()));
                } catch (ServiceConfigurationError e14) {
                    f14231a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C2589a6.class.getSimpleName()), (Throwable) e14);
                }
            }
            if (arrayList.size() == 1) {
                return (C2589a6) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2589a6) C2589a6.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e15) {
                throw new IllegalStateException(e15);
            } catch (NoSuchMethodException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract C2589a6 m7870a();
}
