package p000;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccf extends kfv {

    /* JADX INFO: renamed from: a */
    public final Set f5116a;

    /* JADX INFO: renamed from: b */
    public final cci f5117b;

    /* JADX INFO: renamed from: c */
    private final Executor f5118c;

    /* JADX INFO: renamed from: d */
    private boolean f5119d = false;

    public ccf(jvb jvbVar, eat eatVar, fvu fvuVar, Executor executor, kbo kboVar) {
        cci cciVar = new cci(fvuVar, eatVar, kboVar.mo6314a("gyro-scn-ch"), "scene-ch-".concat(String.valueOf(fvuVar.mo14558k().name())));
        this.f5117b = cciVar;
        this.f5116a = new HashSet();
        this.f5118c = executor;
        jvbVar.m13537d(cciVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3427b(Runnable runnable) {
        this.f5116a.add(runnable);
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        if (this.f5119d) {
            this.f5118c.execute(new bey(this, kppVar, 16));
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m3428c(Runnable runnable) {
        this.f5116a.remove(runnable);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m3429d() {
        this.f5119d = true;
        this.f5117b.m3434b();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m3430e() {
        this.f5119d = false;
        this.f5117b.close();
    }
}
