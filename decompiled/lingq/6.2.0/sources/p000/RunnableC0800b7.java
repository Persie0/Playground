package p000;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0800b7 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8029a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ArrayList f8030b;

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f8029a;
        ArrayList<dm1> arrayList = this.f8030b;
        switch (i) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    synchronized (((hz8) it.next())) {
                    }
                }
                return;
            case 1:
                wf3.m23892a(4, arrayList);
                return;
            default:
                for (dm1 dm1Var : arrayList) {
                    synchronized (dm1Var) {
                        dm1Var.f35815f.m25092m();
                        break;
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC0800b7(ArrayList arrayList, Activity activity) {
        this.f8030b = arrayList;
    }

    public /* synthetic */ RunnableC0800b7(ArrayList arrayList, boolean z) {
        this.f8030b = arrayList;
    }
}
