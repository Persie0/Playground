package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class wi5 extends bq1 {
    public static final vi5 Companion = new vi5();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f66849K;

    /* JADX INFO: renamed from: L */
    public final bl2 f66850L = new bl2(new q85(4), new p85(7));

    /* JADX INFO: renamed from: M */
    public final bl2 f66851M = new bl2(new q85(5), new p85(8));

    public wi5(AbstractC0746d abstractC0746d) {
        this.f66849K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new C3704w(29, this, (ArrayList) list), this.f66849K, continuation, false, true);
    }
}
