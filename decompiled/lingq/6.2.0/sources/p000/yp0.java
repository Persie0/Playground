package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class yp0 extends bq1 {
    public static final xp0 Companion = new xp0();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f70233K;

    /* JADX INFO: renamed from: O */
    public final qn3 f70237O = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final v70 f70234L = new v70(4);

    /* JADX INFO: renamed from: M */
    public final bl2 f70235M = new bl2(new u70(3), new v70(5));

    /* JADX INFO: renamed from: N */
    public final bl2 f70236N = new bl2(new sn0(this, 1), new wp0(this, 0));

    /* JADX INFO: renamed from: P */
    public final bl2 f70238P = new bl2(new u70(4), new v70(3));

    public yp0(AbstractC0746d abstractC0746d) {
        this.f70233K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(8, this, (gr0) obj), this.f70233K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new tp0(this, list, 0), this.f70233K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m25241y0(hs0 hs0Var, Continuation continuation) {
        Object objM2861d = AbstractC0758a.m2861d(new s70(9, this, hs0Var), this.f70233K, continuation, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }
}
