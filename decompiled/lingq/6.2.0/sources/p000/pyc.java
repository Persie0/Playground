package p000;

import com.google.android.gms.internal.measurement.C0962f;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.RunnableFutureC1123m;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pyc implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ on9 f57005b;

    public /* synthetic */ pyc(on9 on9Var, int i) {
        this.f57004a = i;
        this.f57005b = on9Var;
    }

    @Override // p000.on9
    public final Object get() {
        int i = this.f57004a;
        on9 on9Var = this.f57005b;
        switch (i) {
            case 0:
                Object obj = C0962f.f11840j;
                return (zcd) ((Optional) on9Var.get()).mo6261f();
            default:
                c26 c26Var = (c26) on9Var.get();
                c26Var.getClass();
                RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m(qed.f57665a);
                return new a26(runnableFutureC1123m, c26Var.f9353b.schedule(runnableFutureC1123m, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
