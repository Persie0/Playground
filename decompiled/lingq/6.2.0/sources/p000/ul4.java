package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.entity.LanguageContextEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public final class ul4 extends bq1 {
    public static final tl4 Companion = new tl4();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f64042K;

    /* JADX INFO: renamed from: L */
    public final bl2 f64043L;

    /* JADX INFO: renamed from: N */
    public final bl2 f64045N;

    /* JADX INFO: renamed from: M */
    public final qn3 f64044M = new qn3(20);

    /* JADX INFO: renamed from: O */
    public final bl2 f64046O = new bl2(new sv0(13), new qn0(15));

    public ul4(AbstractC0746d abstractC0746d) {
        this.f64042K = abstractC0746d;
        int i = 0;
        this.f64043L = new bl2(new rl4(this, i), new sl4(this, i));
        int i2 = 1;
        this.f64045N = new bl2(new rl4(this, i2), new sl4(this, i2));
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m22789A0(String str, ContinuationImpl continuationImpl) {
        return AbstractC0758a.m2861d(new ol4(str, this, 1), this.f64042K, continuationImpl, true, false);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new ke2(10, this, (LanguageContextEntity) obj), this.f64042K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new nl4(this, (ArrayList) list, 1), this.f64042K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m22790y0(ArrayList arrayList, SuspendLambda suspendLambda) {
        Object objM2861d = AbstractC0758a.m2861d(new pl4(0, AbstractC3393o1.m17736k(")", ux5.m22997t("DELETE FROM LanguageContextEntity WHERE code NOT IN ("), arrayList), arrayList), this.f64042K, suspendLambda, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: z0 */
    public final i93 m22791z0(String str) {
        str.getClass();
        C3704w c3704w = new C3704w(17, str, this);
        return AbstractC3584sr.m21590A(this.f64042K, false, new String[]{"LanguageContextEntity"}, c3704w);
    }
}
