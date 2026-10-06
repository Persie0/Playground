package p000;

import android.os.SystemClock;
import com.pairip.VMRunner;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cvn implements jyt, jyr {

    /* JADX INFO: renamed from: d */
    private static final nbh f9797d = nbh.m17259h("com/google/android/apps/camera/camcorder/media/metadata/TopshotMetadataEncoderImpl");

    /* JADX INFO: renamed from: e */
    private final jys f9801e;

    /* JADX INFO: renamed from: f */
    private final jww f9802f;

    /* JADX INFO: renamed from: g */
    private final czs f9803g;

    /* JADX INFO: renamed from: h */
    private final kba f9804h;

    /* JADX INFO: renamed from: i */
    private final crh f9805i;

    /* JADX INFO: renamed from: k */
    private boolean f9807k;

    /* JADX INFO: renamed from: l */
    private long f9808l;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f9799b = new AtomicLong(-1);

    /* JADX INFO: renamed from: j */
    private boolean f9806j = false;

    /* JADX INFO: renamed from: c */
    public boolean f9800c = true;

    /* JADX INFO: renamed from: n */
    private final Object f9810n = new Object();

    /* JADX INFO: renamed from: a */
    public final String f9798a = "application/microvideo-image-meta";

    /* JADX INFO: renamed from: m */
    private cvm f9809m = cvm.READY;

    public cvn(jys jysVar, jww jwwVar, czs czsVar, crh crhVar) {
        this.f9801e = jysVar;
        this.f9802f = jwwVar;
        this.f9803g = czsVar;
        this.f9804h = jwwVar.mo3830a(new ckv(this, 20), not.INSTANCE);
        this.f9805i = crhVar;
    }

    /* JADX INFO: renamed from: m */
    private final long m5573m(long j) {
        m5574n();
        return j + this.f9808l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final void m5574n() {
        if (this.f9807k) {
            return;
        }
        this.f9808l = (SystemClock.elapsedRealtimeNanos() / 1000) - (SystemClock.uptimeMillis() * 1000);
        this.f9807k = true;
    }

    /* JADX INFO: renamed from: o */
    private void m5575o() {
        VMRunner.invoke("bIdCbQhfSzKeykNZ", new Object[]{this});
    }

    @Override // p000.jzg
    /* JADX INFO: renamed from: a */
    public final void mo5259a(jzf jzfVar) {
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: b */
    public final void mo5576b(long j) {
        czs czsVar = this.f9803g;
        long jM5573m = m5573m(j);
        boolean z = true;
        if (!czsVar.f10143d.isEmpty() && jM5573m < ((Long) mkv.m16515W(czsVar.f10143d)).longValue()) {
            z = false;
        }
        lku.m15613H(z);
        czsVar.f10143d.add(Long.valueOf(jM5573m));
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: c */
    public final void mo5577c() {
        synchronized (this.f9810n) {
            if (this.f9809m == cvm.CLOSED) {
                return;
            }
            this.f9804h.close();
            this.f9809m = cvm.CLOSED;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: d */
    public final void mo5578d(long j) {
        czs czsVar = this.f9803g;
        long jM5573m = m5573m(j);
        boolean z = true;
        if (!czsVar.f10144e.isEmpty() && jM5573m < ((Long) mkv.m16515W(czsVar.f10144e)).longValue()) {
            z = false;
        }
        lku.m15613H(z);
        czsVar.f10144e.add(Long.valueOf(jM5573m));
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: e */
    public final void mo5349e() {
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: f */
    public final void mo5350f() {
        synchronized (this.f9810n) {
            if (this.f9805i.mo5404j()) {
                m5575o();
            }
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: g */
    public final void mo5351g() {
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: h */
    public final void mo5352h() {
        synchronized (this.f9810n) {
            this.f9799b.set(((Long) ((jwf) this.f9802f).f34942d).longValue());
            this.f9803g.m5747a();
            this.f9806j = false;
        }
    }

    @Override // p000.jyt
    /* JADX INFO: renamed from: i */
    public final void mo5353i(long j, long j2) {
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: j */
    public final void mo5579j() {
        synchronized (this.f9810n) {
            if (this.f9809m != cvm.READY) {
                ((nbe) ((nbe) f9797d.m17251b()).mo17276G(728)).mo17293r("Trying to start with state %s", this.f9809m);
            } else {
                this.f9801e.mo13722c(this);
                this.f9809m = cvm.STARTED;
            }
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: k */
    public final void mo5580k() {
        synchronized (this.f9810n) {
            if (this.f9809m != cvm.STARTED) {
                ((nbe) ((nbe) f9797d.m17251b()).mo17276G(730)).mo17293r("Trying to stop with state %s", this.f9809m);
                return;
            }
            this.f9809m = cvm.STOPPED;
            this.f9801e.mo13726g(this);
            if (this.f9799b.get() == -1) {
                ((nbe) ((nbe) f9797d.m17251b()).mo17276G(729)).mo17290o("No video frame is received yet.");
            } else {
                m5575o();
            }
        }
    }

    @Override // p000.jyr
    /* JADX INFO: renamed from: l */
    public final void mo5581l(lrd lrdVar, long j) {
    }
}
