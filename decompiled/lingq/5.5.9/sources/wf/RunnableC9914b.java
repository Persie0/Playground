package wf;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wf.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9914b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f50556a;

    public RunnableC9914b(ArrayList arrayList, Activity activity) {
        this.f50556a = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f50556a.iterator();
        while (it.hasNext()) {
            ((InterfaceC9916d) it.next()).mo12958d();
        }
    }
}
