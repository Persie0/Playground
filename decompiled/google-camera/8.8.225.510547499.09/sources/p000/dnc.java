package p000;

import android.content.Intent;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnc extends dnd implements fbp, fbd, ezx, fbo {

    /* JADX INFO: renamed from: a */
    private final kce f12076a;

    /* JADX INFO: renamed from: b */
    private final ScheduledExecutorService f12077b;

    /* JADX INFO: renamed from: c */
    private final int f12078c;

    /* JADX INFO: renamed from: d */
    private volatile boolean f12079d = true;

    /* JADX INFO: renamed from: e */
    private Future f12080e;

    /* JADX INFO: renamed from: f */
    private final bko f12081f;

    public dnc(bko bkoVar, ScheduledExecutorService scheduledExecutorService, kbz kbzVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f12081f = bkoVar;
        this.f12077b = scheduledExecutorService;
        this.f12076a = kbzVar.mo13958b("StartupViewfinderFrameDeltaMs");
        this.f12078c = ((Integer) dhvVar.mo6173a(dib.f11381w).get()).intValue();
    }

    /* JADX INFO: renamed from: p */
    private final void m6424p() {
        this.f12079d = true;
        this.f12080e = this.f12077b.schedule(new dgt(this, 9), 5L, TimeUnit.SECONDS);
    }

    @Override // p000.ezx
    /* JADX INFO: renamed from: bD */
    public final void mo6425bD(Intent intent) {
        m6424p();
    }

    @Override // p000.fbd
    /* JADX INFO: renamed from: bI */
    public final void mo6422bI() {
        m6424p();
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        if (this.f12079d) {
            m6426i();
        }
    }

    @Override // p000.dnd
    /* JADX INFO: renamed from: g */
    public final void mo6423g(double d) {
        if (this.f12079d) {
            this.f12076a.mo13955c((int) d);
            if (d > this.f12078c) {
                this.f12081f.m2632z();
                m6426i();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m6426i() {
        this.f12079d = false;
        Future future = this.f12080e;
        if (future != null) {
            future.cancel(false);
        }
        this.f12080e = null;
        this.f12076a.mo13955c(0);
    }
}
