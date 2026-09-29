package p000;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public final class u38 extends bq1 {
    public static final t38 Companion = new t38();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f63359K;

    /* JADX INFO: renamed from: L */
    public final bl2 f63360L = new bl2(new u70(13), new v70(14));

    public u38(AbstractC0746d abstractC0746d) {
        this.f63359K = abstractC0746d;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new sx7(5, this, (ArrayList) list), this.f63359K, continuation, false, true);
    }
}
