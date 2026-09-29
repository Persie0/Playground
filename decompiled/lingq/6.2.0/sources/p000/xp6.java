package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class xp6 extends bq1 {
    public static final wp6 Companion = new wp6();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f68493K;

    /* JADX INFO: renamed from: M */
    public final qn3 f68495M = new qn3(20);

    /* JADX INFO: renamed from: L */
    public final bl2 f68494L = new bl2(new sn0(this, 3), new wp0(this, 2));

    public xp6(AbstractC0746d abstractC0746d) {
        this.f68493K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new ui5(3, this, (ArrayList) list), this.f68493K, continuation, false, true);
    }
}
