package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class di1 implements ki7 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f35672a;

    public di1(ArrayList arrayList) {
        this.f35672a = arrayList;
    }

    @Override // p000.ki7
    public final boolean test(Object obj) {
        ArrayList arrayList = this.f35672a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((ki7) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}
