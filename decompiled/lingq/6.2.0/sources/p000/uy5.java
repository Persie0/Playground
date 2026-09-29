package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class uy5 extends bq1 {
    public static final ty5 Companion = new ty5();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f64534K;

    /* JADX INFO: renamed from: L */
    public final bl2 f64535L = new bl2(new q85(6), new p85(9));

    /* JADX INFO: renamed from: M */
    public final bl2 f64536M = new bl2(new q85(7), new p85(10));

    /* JADX INFO: renamed from: N */
    public final bl2 f64537N = new bl2(new q85(8), new p85(11));

    public uy5(AbstractC0746d abstractC0746d) {
        this.f64534K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new h85(9, this, (ArrayList) list), this.f64534K, continuation, false, true);
    }
}
