package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekv {

    /* JADX INFO: renamed from: a */
    private static final Map f14522a = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized Object m7427a(Class cls) {
        Object obj;
        obj = f14522a.get(cls);
        if (obj == null) {
            throw new IllegalStateException("No instance for " + cls.getName() + " has been provided.");
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m7428b(Class cls, Object obj) {
        f14522a.put(cls, obj);
    }
}
