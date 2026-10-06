package p000;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fdd implements fdt {

    /* JADX INFO: renamed from: a */
    private long f21408a = -1;

    /* JADX INFO: renamed from: b */
    private final eby f21409b;

    /* JADX INFO: renamed from: c */
    private final hah f21410c;

    /* JADX INFO: renamed from: d */
    private final jwn f21411d;

    /* JADX INFO: renamed from: e */
    private final jwn f21412e;

    /* JADX INFO: renamed from: f */
    private final guk f21413f;

    /* JADX INFO: renamed from: g */
    private final ebv f21414g;

    /* JADX INFO: renamed from: h */
    private boolean f21415h;

    public fdd(eby ebyVar, jwn jwnVar, jwn jwnVar2, ebv ebvVar, guk gukVar, hah hahVar, dhv dhvVar) {
        this.f21409b = ebyVar;
        this.f21410c = hahVar;
        this.f21411d = jwnVar;
        this.f21412e = jwnVar2;
        this.f21413f = gukVar;
        this.f21414g = ebvVar;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6179g();
        dhvVar.mo6179g();
    }

    /* JADX INFO: renamed from: c */
    private final synchronized void m8260c(boolean z, boolean z2, kmq kmqVar, boolean z3, boolean z4) {
        if (this.f21415h) {
            return;
        }
        if (this.f21414g.f13304f) {
            boolean z5 = false;
            if (kmqVar.equals(kmq.f36557a) || ((Integer) this.f21410c.mo10031c(gzy.f27031ao)).equals(Integer.valueOf(inr.m11540l(1))) || this.f21413f.f26433a) {
                z = false;
                z2 = false;
            }
            this.f21409b.mo7091b(z && !z4);
            boolean z6 = z & z3;
            boolean z7 = z2 & z3;
            if (((Float) this.f21412e.mo3831be()).floatValue() < 1.0f) {
                this.f21408a = SystemClock.elapsedRealtimeNanos();
                z7 = false;
            } else if (this.f21408a <= -1 || TimeUnit.NANOSECONDS.toSeconds(SystemClock.elapsedRealtimeNanos() - this.f21408a) >= 3) {
                this.f21408a = -1L;
                z5 = z6;
                z6 = false;
            } else {
                z6 = false;
                z7 = false;
            }
            this.f21409b.mo7090a(z5, z7, z6, !z4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    @Override // p000.fdt
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8225a(boolean z, boolean z2, kmq kmqVar, boolean z3) {
        boolean z4;
        if (!this.f21415h && !this.f21409b.m7103n()) {
            boolean z5 = false;
            if (((Float) this.f21411d.mo3831be()).floatValue() == -999.0f || ((Float) this.f21411d.mo3831be()).floatValue() >= -5.5f) {
                z4 = false;
            } else if (z) {
                z4 = true;
            } else if (z2) {
                z4 = false;
                z5 = true;
            } else {
                z4 = false;
            }
            m8260c(z4, z5, kmqVar, z3, false);
        }
    }

    @Override // p000.fdt
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8226b(boolean z, kmq kmqVar, boolean z2) {
        m8260c(z, false, kmqVar, z2, true);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21415h = true;
        this.f21409b.mo7090a(false, false, false, false);
    }
}
