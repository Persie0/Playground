package p000;

import com.iterable.iterableapi.C1206b;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class hb4 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f42133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1206b f42134b;

    public hb4(C1206b c1206b, vb4 vb4Var, boolean z) {
        this.f42134b = c1206b;
        this.f42133a = z;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        fb4 fb4Var = this.f42134b.f13988a;
        if (fb4Var.f38773d == null && fb4Var.f38774e == null) {
            eh0.m11121R("IterableAuth", "Email or userId is not available. Skipping token refresh");
        } else {
            C1206b c1206bM11692c = fb4Var.m11692c();
            boolean z = this.f42133a;
            synchronized (c1206bM11692c) {
                if (!z) {
                    try {
                        c1206bM11692c.f13991d.getClass();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                fb4.f38769t.m11700m(true);
            }
        }
        this.f42134b.f13992e = false;
    }
}
