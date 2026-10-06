package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kbi {

    /* JADX INFO: renamed from: a */
    public static final Object f35526a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Map f35527b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final Map f35528c = new HashMap();

    private kbi() {
    }

    /* JADX INFO: renamed from: a */
    public static void m13938a(Class cls) {
        m13939b(cls, null);
    }

    /* JADX INFO: renamed from: b */
    public static void m13939b(Class cls, String str) {
        kbh kbhVar;
        synchronized (f35526a) {
            String str2 = (String) f35528c.get(cls);
            if (str2 != null) {
                kbhVar = (kbh) f35527b.get(str2);
            } else if (str != null) {
                Map map = f35527b;
                kbh kbhVar2 = (kbh) map.get(str);
                if (kbhVar2 == null) {
                    kbhVar2 = new kbh(str);
                    map.put(str, kbhVar2);
                }
                kbhVar = kbhVar2;
            } else {
                kbhVar = null;
            }
        }
        if (kbhVar == null) {
            throw new IllegalStateException("JniLoader was null for ".concat(String.valueOf(cls.getName())));
        }
        try {
            kbhVar.m13934b();
        } catch (UnsatisfiedLinkError e) {
            String strMapLibraryName = System.mapLibraryName((String) kbhVar.f35525b);
            String message = e.getMessage();
            if (message != null) {
                if (message.contains("couldn't find \"" + strMapLibraryName + "\"")) {
                    throw new UnsatisfiedLinkError(String.format(null, "Failed to resolve \"%s\" for \"%s\". Did you forget to include the .so or register it with %s.register(%s.class, %s)? \n%s", strMapLibraryName, cls.getSimpleName(), kbi.class.getSimpleName(), cls.getSimpleName(), kbhVar.f35525b, e.getMessage()));
                }
            }
            throw e;
        }
    }
}
