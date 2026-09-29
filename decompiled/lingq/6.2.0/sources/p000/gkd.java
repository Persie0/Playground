package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gkd implements fkd {

    /* JADX INFO: renamed from: a */
    public final ArrayList f40922a;

    public gkd(Context context, dkd dkdVar) {
        ArrayList arrayList = new ArrayList();
        this.f40922a = arrayList;
        dkdVar.getClass();
        arrayList.add(new ukd(context, dkdVar));
    }

    @Override // p000.fkd
    /* JADX INFO: renamed from: a */
    public final void mo11928a(C3299li c3299li) {
        Iterator it = this.f40922a.iterator();
        while (it.hasNext()) {
            ((fkd) it.next()).mo11928a(c3299li);
        }
    }
}
