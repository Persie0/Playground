package p235l5;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p041c5.C1699a0;
import p041c5.C1721s;

/* JADX INFO: renamed from: l5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7256c extends AbstractRunnableC7257d {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1699a0 f40745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f40746c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f40747d = false;

    public C7256c(C1699a0 c1699a0, String str) {
        this.f40745b = c1699a0;
        this.f40746c = str;
    }

    @Override // p235l5.AbstractRunnableC7257d
    /* JADX INFO: renamed from: b */
    public final void mo14602b() {
        C1699a0 c1699a0 = this.f40745b;
        WorkDatabase workDatabase = c1699a0.f9477c;
        workDatabase.m4552c();
        try {
            Iterator it = workDatabase.mo4718z().mo13235m(this.f40746c).iterator();
            while (it.hasNext()) {
                AbstractRunnableC7257d.m14603a(c1699a0, (String) it.next());
            }
            workDatabase.m4568s();
            workDatabase.m4563n();
            if (this.f40747d) {
                C1721s.m5463a(c1699a0.f9476b, c1699a0.f9477c, c1699a0.f9479e);
            }
        } catch (Throwable th2) {
            workDatabase.m4563n();
            throw th2;
        }
    }
}
