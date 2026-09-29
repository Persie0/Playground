package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class zca extends bq1 {
    public static final yca Companion = new yca();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f71369K;

    /* JADX INFO: renamed from: N */
    public final bl2 f71372N;

    /* JADX INFO: renamed from: O */
    public final bl2 f71373O;

    /* JADX INFO: renamed from: M */
    public final qn3 f71371M = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final bl2 f71370L = new bl2(new sn0(this, 4), new wp0(this, 3));

    public zca(AbstractC0746d abstractC0746d) {
        this.f71369K = abstractC0746d;
        int i = 17;
        this.f71372N = new bl2(new q85(16), new p85(i));
        this.f71373O = new bl2(new q85(i), new p85(18));
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new wca(this, (ArrayList) list, 0), this.f71369K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m25553y0(ArrayList arrayList, Continuation continuation) {
        return AbstractC0758a.m2861d(new m05(3, AbstractC3393o1.m17736k(")", ux5.m22997t("SELECT * FROM TtsUtteranceEntity WHERE idWithLanguageAndData IN ("), arrayList), arrayList), this.f71369K, continuation, true, true);
    }
}
