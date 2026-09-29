package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zdb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71423a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BasePendingResult f71424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f71425c;

    public zdb(qfa qfaVar, BasePendingResult basePendingResult) {
        this.f71424b = basePendingResult;
        Objects.requireNonNull(qfaVar);
        this.f71425c = qfaVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m25561a(Status status) {
        q88 q88Var;
        switch (this.f71423a) {
            case 0:
                if (!status.m5282r()) {
                    ((wr9) this.f71425c).m24137a(lda.m16138x(status));
                    return;
                }
                BasePendingResult basePendingResult = this.f71424b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lda.m16132r("Result has already been consumed.", !basePendingResult.f11674g);
                try {
                    if (!basePendingResult.f11669b.await(0L, timeUnit)) {
                        basePendingResult.m5284c(Status.f11660h);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.m5284c(Status.f11658f);
                }
                lda.m16132r("Result is not ready.", basePendingResult.m5285d());
                synchronized (basePendingResult.f11668a) {
                    lda.m16132r("Result has already been consumed.", !basePendingResult.f11674g);
                    lda.m16132r("Result is not ready.", basePendingResult.m5285d());
                    q88Var = basePendingResult.f11672e;
                    basePendingResult.f11672e = null;
                    basePendingResult.f11674g = true;
                    break;
                }
                if (basePendingResult.f11671d.getAndSet(null) != null) {
                    ho2.m13383c();
                    return;
                } else {
                    lda.m16130p(q88Var);
                    ((wr9) this.f71425c).m24138b(null);
                    return;
                }
            default:
                ((Map) ((qfa) this.f71425c).f57705a).remove(this.f71424b);
                return;
        }
    }

    public zdb(BasePendingResult basePendingResult, wr9 wr9Var, mkd mkdVar) {
        this.f71424b = basePendingResult;
        this.f71425c = wr9Var;
    }
}
