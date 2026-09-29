package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cua {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f34560a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m9899a() {
        LinkedHashMap linkedHashMap = this.f34560a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((wta) it.next()).m24155S2();
        }
        linkedHashMap.clear();
    }
}
