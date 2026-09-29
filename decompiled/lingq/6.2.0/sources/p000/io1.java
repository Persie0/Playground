package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class io1 extends bq1 {
    public static final ho1 Companion = new ho1();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f44343K;

    /* JADX INFO: renamed from: N */
    public final bl2 f44346N;

    /* JADX INFO: renamed from: O */
    public final bl2 f44347O;

    /* JADX INFO: renamed from: P */
    public final bl2 f44348P;

    /* JADX INFO: renamed from: M */
    public final qn3 f44345M = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final bl2 f44344L = new bl2(new sn0(this, 2), new wp0(this, 1));

    public io1(AbstractC0746d abstractC0746d) {
        this.f44343K = abstractC0746d;
        int i = 8;
        this.f44346N = new bl2(new sv0(7), new qn0(i));
        sv0 sv0Var = new sv0(i);
        int i2 = 9;
        this.f44347O = new bl2(sv0Var, new qn0(i2));
        this.f44348P = new bl2(new sv0(i2), new qn0(10));
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(25, this, (u85) obj), this.f44343K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new fo1(this, (ArrayList) list, 1), this.f44343K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m14048y0(int i, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new eo1(i, this, 0), this.f44343K, continuationImpl, true, false);
    }
}
