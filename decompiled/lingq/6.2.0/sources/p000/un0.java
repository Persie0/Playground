package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.CardEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public final class un0 extends bq1 {
    public static final tn0 Companion = new tn0();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f64101K;

    /* JADX INFO: renamed from: L */
    public final qn0 f64102L;

    /* JADX INFO: renamed from: M */
    public final rn0 f64103M;

    /* JADX INFO: renamed from: N */
    public final qn3 f64104N = new qn3(20);

    /* JADX INFO: renamed from: O */
    public final bl2 f64105O;

    public un0(AbstractC0746d abstractC0746d) {
        this.f64101K = abstractC0746d;
        int i = 0;
        this.f64102L = new qn0(i);
        this.f64103M = new rn0(this, i);
        this.f64105O = new bl2(new sn0(this, i), new rn0(this, 1));
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m22833A0(String str, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new nn0(str, this, 1), this.f64101K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: B0 */
    public final Object m22834B0(ArrayList arrayList, ContinuationImpl continuationImpl) {
        StringBuilder sbM22997t = ux5.m22997t("\n    SELECT DISTINCT * FROM CardEntity\n    WHERE CardEntity.termWithLanguage IN (");
        d32.m10005B(arrayList.size(), sbM22997t);
        sbM22997t.append(")");
        sbM22997t.append("\n");
        sbM22997t.append("    AND CardEntity.id != 0");
        return AbstractC0758a.m2861d(new pn0(wq1.m24125u(sbM22997t, "\n", "    ORDER BY CardEntity.termWithLanguage", "\n", "  "), arrayList, this, 2), this.f64101K, continuationImpl, true, true);
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m22835C0(wn0 wn0Var, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new s70(3, this, wn0Var), this.f64101K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(4, this, (CardEntity) obj), this.f64101K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(2, this, list), this.f64101K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m22836y0(ArrayList arrayList, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new s70(5, this, arrayList), this.f64101K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: z0 */
    public final Object m22837z0(String str, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new nn0(str, this, 0), this.f64101K, continuationImpl, true, false);
    }
}
