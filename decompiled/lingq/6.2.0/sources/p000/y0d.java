package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class y0d implements l0d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f69083a;

    public y0d(Context context, c0d c0dVar) {
        ArrayList arrayList = new ArrayList();
        this.f69083a = arrayList;
        c0dVar.getClass();
        arrayList.add(new g2d(context, c0dVar));
    }

    @Override // p000.l0d
    /* JADX INFO: renamed from: a */
    public final void mo12306a(cdb cdbVar) {
        Iterator it = this.f69083a.iterator();
        while (it.hasNext()) {
            ((l0d) it.next()).mo12306a(cdbVar);
        }
    }
}
