package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmw extends kpt {

    /* JADX INFO: renamed from: a */
    private final AtomicBoolean f36570a;

    public kmw(kpw kpwVar) {
        super(kpwVar);
        this.f36570a = new AtomicBoolean(false);
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (this.f36570a.getAndSet(true)) {
            return;
        }
        super.close();
    }
}
