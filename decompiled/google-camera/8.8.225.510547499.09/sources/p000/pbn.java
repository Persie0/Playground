package p000;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class pbn {

    /* JADX INFO: renamed from: a */
    private static final String f47338a = pbn.class.getSimpleName();

    /* JADX INFO: renamed from: c */
    public static List m19303c(Context context) {
        String string;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int identifier = context.getResources().getIdentifier("CronetProviderClassName", "string", context.getPackageName());
        if (identifier != 0 && (string = context.getResources().getString(identifier)) != null && !string.equals("com.google.android.gms.net.PlayServicesCronetProvider") && !string.equals("com.google.android.gms.net.GmsCoreCronetProvider") && !string.equals("org.chromium.net.impl.JavaCronetProvider") && !string.equals("org.chromium.net.impl.NativeCronetProvider") && !m19305g(context, string, linkedHashSet, true)) {
            Log.e(f47338a, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
        }
        m19305g(context, "com.google.android.gms.net.PlayServicesCronetProvider", linkedHashSet, false);
        m19305g(context, "com.google.android.gms.net.GmsCoreCronetProvider", linkedHashSet, false);
        m19305g(context, "org.chromium.net.impl.NativeCronetProvider", linkedHashSet, false);
        m19305g(context, "org.chromium.net.impl.JavaCronetProvider", linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    /* JADX INFO: renamed from: f */
    private static void m19304f(String str, boolean z, Exception exc) {
        if (z) {
            Log.e(f47338a, "Unable to load provider class: ".concat(str), exc);
        }
    }

    /* JADX INFO: renamed from: g */
    private static boolean m19305g(Context context, String str, Set set, boolean z) {
        try {
            set.add((pbn) context.getClassLoader().loadClass(str).asSubclass(pbn.class).getConstructor(Context.class).newInstance(context));
            return true;
        } catch (ClassNotFoundException e) {
            m19304f(str, z, e);
            return false;
        } catch (IllegalAccessException e2) {
            m19304f(str, z, e2);
            return false;
        } catch (InstantiationException e3) {
            m19304f(str, z, e3);
            return false;
        } catch (NoSuchMethodException e4) {
            m19304f(str, z, e4);
            return false;
        } catch (InvocationTargetException e5) {
            m19304f(str, z, e5);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract String m19306a();

    /* JADX INFO: renamed from: b */
    public abstract String m19307b();

    /* JADX INFO: renamed from: d */
    public abstract boolean m19308d();

    /* JADX INFO: renamed from: e */
    public abstract liv m19309e();

    public final String toString() {
        throw null;
    }
}
