package p235l5;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p041c5.C1699a0;
import p041c5.C1721s;

/* JADX INFO: renamed from: l5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7255b extends AbstractRunnableC7257d {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1699a0 f40743b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ UUID f40744c;

    public C7255b(C1699a0 c1699a0, UUID uuid) {
        this.f40743b = c1699a0;
        this.f40744c = uuid;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p235l5.AbstractRunnableC7257d
    /* JADX INFO: renamed from: b */
    public final void mo14602b() {
        C1699a0 c1699a0 = this.f40743b;
        WorkDatabase workDatabase = c1699a0.f9477c;
        workDatabase.m4552c();
        try {
            AbstractRunnableC7257d.m14603a(c1699a0, this.f40744c.toString());
            workDatabase.m4568s();
            workDatabase.m4563n();
            C1721s.m5463a(c1699a0.f9476b, c1699a0.f9477c, c1699a0.f9479e);
        } catch (Throwable th2) {
            workDatabase.m4563n();
            throw th2;
        }
    }
}
