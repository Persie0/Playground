package p000;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bdq extends bds {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ azp f3001a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ UUID f3002b;

    public bdq(azp azpVar, UUID uuid) {
        this.f3001a = azpVar;
        this.f3002b = uuid;
    }

    @Override // p000.bds
    /* JADX INFO: renamed from: a */
    public final void mo2247a() {
        WorkDatabase workDatabase = this.f3001a.f2782d;
        workDatabase.m1825m();
        try {
            m2249c(this.f3001a, this.f3002b.toString());
            workDatabase.m1829q();
            workDatabase.m1827o();
            m2250d(this.f3001a);
        } catch (Throwable th) {
            workDatabase.m1827o();
            throw th;
        }
    }
}
