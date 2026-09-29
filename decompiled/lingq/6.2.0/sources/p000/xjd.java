package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class xjd implements tjd {

    /* JADX INFO: renamed from: a */
    public final ArrayList f68308a;

    public xjd(Context context, qjd qjdVar) {
        ArrayList arrayList = new ArrayList();
        this.f68308a = arrayList;
        qjdVar.getClass();
        arrayList.add(new hkd(context, qjdVar));
    }

    @Override // p000.tjd
    /* JADX INFO: renamed from: a */
    public final void mo13321a(cdb cdbVar) {
        Iterator it = this.f68308a.iterator();
        while (it.hasNext()) {
            ((tjd) it.next()).mo13321a(cdbVar);
        }
    }
}
