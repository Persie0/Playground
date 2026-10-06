package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enr implements kbg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f14783a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1058va f14784b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f14785c = new AtomicBoolean(true);

    public enr(C1058va c1058va, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f14784b = c1058va;
        this.f14783a = runnable;
    }

    @Override // p000.kbg
    /* JADX INFO: renamed from: bf */
    public final /* bridge */ /* synthetic */ void mo3415bf(Object obj) {
        Boolean bool = (Boolean) obj;
        if (this.f14785c.compareAndSet(true, false)) {
            return;
        }
        if (!bool.booleanValue() || !((dbr) this.f14784b.f47802a).mo5895d().equals(kmq.f36557a)) {
            this.f14783a.run();
            return;
        }
        ((dbr) this.f14784b.f47802a).m5899h(this.f14783a);
    }
}
