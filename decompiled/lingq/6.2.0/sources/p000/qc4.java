package p000;

import com.iterable.iterableapi.C1218n;
import com.iterable.iterableapi.C1220p;
import com.iterable.iterableapi.C1221q;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qc4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57563a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1221q f57564b;

    public qc4(C1221q c1221q, C1218n c1218n) {
        this.f57564b = c1221q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f57563a;
        C1221q c1221q = this.f57564b;
        switch (i) {
            case 0:
                Iterator it = c1221q.f14087c.iterator();
                while (it.hasNext()) {
                    ((C1220p) it.next()).m6958e();
                }
                break;
            default:
                for (sr3 sr3Var : c1221q.f14088d) {
                    sr3Var.getClass();
                    eh0.m11135p("HealthMonitor", "DB Error notified to healthMonitor");
                    sr3Var.f61294a = true;
                }
                break;
        }
    }

    public qc4(C1221q c1221q) {
        this.f57564b = c1221q;
    }
}
