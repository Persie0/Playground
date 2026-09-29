package p341qg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: qg.h */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8622h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f46139a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f46140b;

    public RunnableC8622h(ArrayList arrayList, boolean z10) {
        this.f46139a = arrayList;
        this.f46140b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f46139a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8615a) it.next()).mo16830e(this.f46140b);
        }
    }
}
