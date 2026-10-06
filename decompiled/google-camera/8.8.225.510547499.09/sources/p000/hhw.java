package p000;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hhw implements hjk {

    /* JADX INFO: renamed from: a */
    private final kbz f27866a;

    /* JADX INFO: renamed from: b */
    private final hht f27867b;

    /* JADX INFO: renamed from: c */
    private final AtomicBoolean f27868c = new AtomicBoolean(false);

    public hhw(hht hhtVar, kbz kbzVar) {
        this.f27867b = hhtVar;
        this.f27866a = kbzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f27868c.getAndSet(true)) {
            return;
        }
        this.f27866a.mo13961e("AudioInit");
        this.f27867b.mo10318d();
        this.f27866a.mo13962f();
    }
}
