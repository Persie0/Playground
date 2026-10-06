package p000;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fpu extends kpt {

    /* JADX INFO: renamed from: a */
    final AtomicBoolean f23141a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ long f23142b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kpw f23143c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ fpv f23144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpu(fpv fpvVar, kpw kpwVar, long j, kpw kpwVar2) {
        super(kpwVar);
        this.f23144d = fpvVar;
        this.f23142b = j;
        this.f23143c = kpwVar2;
        this.f23141a = new AtomicBoolean(false);
    }

    @Override // p000.kpt, p000.kba, java.lang.AutoCloseable
    public final void close() {
        if (!this.f23141a.getAndSet(true)) {
            ((ktz) this.f23144d.f23147c.f23510b).m14852d(new Object[0]);
            ((ktz) this.f23144d.f23147c.f23509a).m14853e(SystemClock.elapsedRealtime() - this.f23142b, new Object[0]);
        }
        this.f23143c.close();
    }
}
