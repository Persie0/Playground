package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class lm6 extends bq1 {
    public static final km6 Companion = new km6();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f49834K;

    /* JADX INFO: renamed from: L */
    public final bl2 f49835L = new bl2(new u70(12), new v70(13));

    public lm6(AbstractC0746d abstractC0746d) {
        this.f49834K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new ui5(1, this, (ArrayList) list), this.f49834K, continuation, false, true);
    }
}
