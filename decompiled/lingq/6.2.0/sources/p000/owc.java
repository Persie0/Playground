package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class owc {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f55114a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m18544a() {
        Iterator it = f55114a.values().iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }
}
