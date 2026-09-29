package p000;

import com.google.android.gms.internal.measurement.C0962f;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.RunnableFutureC1123m;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i8d implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43711a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43712b;

    public /* synthetic */ i8d(Object obj, int i) {
        this.f43711a = i;
        this.f43712b = obj;
    }

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) throws IOException {
        int i = this.f43711a;
        Object obj2 = this.f43712b;
        switch (i) {
            case 0:
                t9d t9dVar = (t9d) obj2;
                int i2 = ((zzmk) obj).f11920a;
                if ((i2 == 29501 || i2 == 29537 || i2 == 29538 || i2 == 29539 || i2 == 29540 || i2 == 29541 || i2 == 29542 || i2 == 29543 || i2 == 29544) && !t9dVar.f62035h.m21561J()) {
                    t9dVar.m21919b();
                }
                return y04.f69048b;
            case 1:
                sq5 sq5Var = (sq5) obj2;
                sq5Var.getClass();
                ffb ffbVar = new ffb(4, sq5Var, (udd) obj);
                c26 c26VarM5409a = ((C0962f) sq5Var.f61249c).m5409a();
                RunnableFutureC1123m runnableFutureC1123m = new RunnableFutureC1123m(ffbVar);
                c26VarM5409a.execute(runnableFutureC1123m);
                return runnableFutureC1123m;
            case 2:
                return AbstractC1118h.m6399c(((q8d) obj2).apply(obj));
            case 3:
                return ((ckd) obj2).f10204e.m62e();
            default:
                IOException iOException = (IOException) obj2;
                iOException.addSuppressed((IOException) obj);
                throw iOException;
        }
    }
}
