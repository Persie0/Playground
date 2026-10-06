package androidx.work;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.C0138dq;
import p000.axt;
import p000.axw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends axw {
    @Override // p000.axw
    /* JADX INFO: renamed from: a */
    public final axt mo1694a(List list) {
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map mapM2092b = ((axt) it.next()).m2092b();
            mapM2092b.getClass();
            linkedHashMap.putAll(mapM2092b);
        }
        C0138dq.m6570f(linkedHashMap, map);
        return C0138dq.m6569e(map);
    }
}
