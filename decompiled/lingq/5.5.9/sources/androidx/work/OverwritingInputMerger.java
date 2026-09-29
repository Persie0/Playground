package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import p026b5.AbstractC1312e;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC1312e {
    @Override // p026b5.AbstractC1312e
    /* JADX INFO: renamed from: a */
    public final C1244b mo4694a(ArrayList arrayList) {
        C1244b.a aVar = new C1244b.a();
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((C1244b) it.next()).f7824a));
        }
        aVar.m4710c(map);
        return aVar.m4708a();
    }
}
