package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0009a7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f302b;

    public /* synthetic */ RunnableC0009a7(ArrayList arrayList, boolean z) {
        this.f301a = arrayList;
        this.f302b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f301a.iterator();
        while (it.hasNext()) {
            ((hz8) it.next()).m13602g(this.f302b);
        }
    }
}
