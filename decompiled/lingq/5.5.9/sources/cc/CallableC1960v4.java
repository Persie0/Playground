package cc;

import com.google.android.gms.measurement.internal.zzaw;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1960v4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC1987y4 f10259a;

    public CallableC1960v4(BinderC1987y4 binderC1987y4, zzaw zzawVar, String str) {
        this.f10259a = binderC1987y4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        BinderC1987y4 binderC1987y4 = this.f10259a;
        binderC1987y4.f10411a.m5647a();
        C1979x5 c1979x5 = binderC1987y4.f10411a.f9898h;
        C1846i7.m5629H(c1979x5);
        c1979x5.mo5748g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
