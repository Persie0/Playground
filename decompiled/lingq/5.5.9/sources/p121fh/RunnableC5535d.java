package p121fh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: fh.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5535d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f34223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f34224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f34225c;

    public RunnableC5535d(boolean z10, ArrayList arrayList, boolean z11) {
        this.f34223a = z10;
        this.f34224b = arrayList;
        this.f34225c = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f34223a;
        List list = this.f34224b;
        if (z10) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC5532a) it.next()).mo11774a();
            }
        }
        if (this.f34225c) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC5532a) it2.next()).mo11775g();
            }
        }
    }
}
