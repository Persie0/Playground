package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tgd {
    /* JADX INFO: renamed from: a */
    public static void m22031a(ArrayList arrayList, Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m22032b(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !atb.m3037a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* JADX INFO: renamed from: c */
    public static uc4 m22033c(Object obj) {
        return new uc4(obj);
    }
}
