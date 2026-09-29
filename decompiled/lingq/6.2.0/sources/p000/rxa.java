package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.AbstractC1323k;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class rxa extends AbstractC1323k {
    public static final qxa Companion = new qxa();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f60013K;

    /* JADX INFO: renamed from: L */
    public final qn3 f60014L = new qn3(20);

    /* JADX INFO: renamed from: M */
    public final bl2 f60015M = new bl2(new sn0(this, 5), new wp0(this, 4));

    /* JADX INFO: renamed from: N */
    public final bl2 f60016N;

    /* JADX INFO: renamed from: O */
    public final bl2 f60017O;

    public rxa(AbstractC0746d abstractC0746d) {
        this.f60013K = abstractC0746d;
        int i = 19;
        this.f60016N = new bl2(new q85(18), new p85(i));
        this.f60017O = new bl2(new q85(i), new p85(20));
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new pxa(this, list, 0), this.f60013K, continuation, false, true);
    }
}
