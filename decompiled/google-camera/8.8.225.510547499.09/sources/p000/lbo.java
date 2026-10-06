package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p021j$.util.DesugarCollections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lbo {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f37882a = false;

    /* JADX INFO: renamed from: c */
    private static volatile boolean f37884c = false;

    /* JADX INFO: renamed from: b */
    public static final Map f37883b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public static int m15144a() {
        Map map = f37883b;
        synchronized (map) {
            Iterator it = map.values().iterator();
            if (it.hasNext()) {
                long j = ((lbn) it.next()).f37881a;
                throw null;
            }
        }
        return 0;
    }
}
