package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class dn6 extends bq1 {
    public static final cn6 Companion = new cn6();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f35897K;

    /* JADX INFO: renamed from: L */
    public final bl2 f35898L = new bl2(new q85(9), new p85(12));

    public dn6(AbstractC0746d abstractC0746d) {
        this.f35897K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new h85(19, this, (ArrayList) list), this.f35897K, continuation, false, true);
    }
}
