package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.WordEntity;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class o7b extends bq1 {
    public static final n7b Companion = new n7b();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f53957K;

    /* JADX INFO: renamed from: M */
    public final qn3 f53959M = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final m7b f53958L = new m7b(this, 0);

    /* JADX INFO: renamed from: N */
    public final bl2 f53960N = new bl2(new sn0(this, 6), new m7b(this, 1));

    public o7b(AbstractC0746d abstractC0746d) {
        this.f53957K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new r3a(17, this, (WordEntity) obj), this.f53957K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new l7b(this, list, 0), this.f53957K, continuation, false, true);
    }
}
