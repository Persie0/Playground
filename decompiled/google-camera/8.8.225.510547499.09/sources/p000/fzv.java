package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fzv extends kpt {

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f23997a;

    public fzv(kpw kpwVar) {
        super(kpwVar);
        this.f23997a = new AtomicBoolean(false);
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.f23997a.getAndSet(true);
    }
}
