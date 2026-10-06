package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hot implements cbu {

    /* JADX INFO: renamed from: e */
    public final dox f28658e;

    /* JADX INFO: renamed from: f */
    public final cbz f28659f;

    /* JADX INFO: renamed from: g */
    public final dhv f28660g;

    /* JADX INFO: renamed from: h */
    public final mrm f28661h;

    /* JADX INFO: renamed from: i */
    public final mrm f28662i;

    /* JADX INFO: renamed from: j */
    public final ccs f28663j;

    /* JADX INFO: renamed from: k */
    public final hqk f28664k;

    /* JADX INFO: renamed from: l */
    public final fvd f28665l;

    /* JADX INFO: renamed from: n */
    public kmd f28667n;

    /* JADX INFO: renamed from: o */
    public kfk f28668o;

    /* JADX INFO: renamed from: p */
    public jvb f28669p;

    /* JADX INFO: renamed from: q */
    public geg f28670q;

    /* JADX INFO: renamed from: r */
    public ScheduledFuture f28671r;

    /* JADX INFO: renamed from: s */
    public nqf f28672s;

    /* JADX INFO: renamed from: u */
    public jfo f28674u;

    /* JADX INFO: renamed from: v */
    public final drj f28675v;

    /* JADX INFO: renamed from: w */
    public final bkn f28676w;

    /* JADX INFO: renamed from: x */
    private final ScheduledExecutorService f28677x;

    /* JADX INFO: renamed from: y */
    private final ggi f28678y;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f28654a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f28655b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f28656c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f28657d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m */
    public final Runnable f28666m = new hmm(this, 15, null);

    /* JADX INFO: renamed from: t */
    public final fup f28673t = new fup(false);

    public hot(drj drjVar, bkn bknVar, dox doxVar, cbz cbzVar, dhv dhvVar, mrm mrmVar, mrm mrmVar2, ccs ccsVar, ScheduledExecutorService scheduledExecutorService, ggi ggiVar, hqk hqkVar, fvd fvdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f28675v = drjVar;
        this.f28676w = bknVar;
        this.f28658e = doxVar;
        this.f28659f = cbzVar;
        this.f28660g = dhvVar;
        this.f28661h = mrmVar;
        this.f28662i = mrmVar2;
        this.f28663j = ccsVar;
        this.f28677x = scheduledExecutorService;
        this.f28678y = ggiVar;
        this.f28664k = hqkVar;
        this.f28665l = fvdVar;
    }

    /* JADX INFO: renamed from: e */
    private final void m10550e() {
        ScheduledFuture scheduledFuture = this.f28671r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f28671r = this.f28677x.schedule(new hmm(this, 14), 2000L, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: b */
    final void m10551b(boolean z, boolean z2) {
        Rect rect = ((gef) this.f28670q.mo3831be()).f24363a;
        MeteringRectangle[] meteringRectangleArr = fuv.f23610a;
        fuv fuvVar = fuu.f23609a;
        MeteringRectangle[] meteringRectangleArr2 = fuv.f23610a;
        this.f28668o.mo14126m(z, z2, !this.f28654a.get());
        kew kewVarMo14115b = this.f28668o.mo14115b();
        if (z) {
            ((kgo) kewVarMo14115b).f35937h = meteringRectangleArr2;
        }
        if (z2) {
            ((kgo) kewVarMo14115b).f35938i = meteringRectangleArr2;
        }
        ((kgo) kewVarMo14115b).f35939j = meteringRectangleArr2;
        this.f28668o.mo14128o(kewVarMo14115b.mo14090a());
        if (z) {
            this.f28663j.m3466c(this.f28666m);
            this.f28656c.set(false);
            this.f28676w.f3651a.mo3415bf(false);
        }
        if (z2) {
            this.f28675v.m6626f();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [dhv, java.lang.Object] */
    @Override // p000.cbu
    /* JADX INFO: renamed from: bh */
    public final cdj mo3409bh(bko bkoVar) {
        this.f28656c.set(true);
        this.f28663j.m3466c(this.f28666m);
        ScheduledFuture scheduledFuture = this.f28671r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        PointF pointF = (PointF) bkoVar.f3652a;
        ccp ccpVarM3453c = ccp.m3453c(pointF, pointF, this.f28667n.mo14553f());
        Rect rect = ((gef) this.f28670q.mo3831be()).f24363a;
        boolean z = !((Boolean) ((jwf) this.f28675v.f12398d).f34942d).booleanValue();
        MeteringRectangle[] meteringRectangleArrMo3457b = ccpVarM3453c.mo3457b(rect);
        kew kewVarMo14115b = this.f28668o.mo14115b();
        kgo kgoVar = (kgo) kewVarMo14115b;
        kgoVar.f35933d = 4;
        kgoVar.f35937h = meteringRectangleArrMo3457b;
        if (z) {
            kgoVar.f35938i = meteringRectangleArrMo3457b;
        }
        kex kexVarMo14090a = kewVarMo14115b.mo14090a();
        kfk kfkVar = this.f28668o;
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14184c(3);
        kgdVarM14187a.m14183b(true != z ? 1 : 3);
        kgdVarM14187a.m14186e(1);
        kfkVar.mo14125l(kexVarMo14090a, kgdVarM14187a.m14182a());
        this.f28672s = nqf.m17621g();
        if (!this.f28660g.mo6184l(diy.f11750g) || !this.f28654a.get()) {
            m10550e();
        } else if (this.f28655b.get()) {
            m10550e();
            this.f28664k.m10602h(false);
        } else if (!this.f28655b.get()) {
            m10550e();
        }
        jfo jfoVar = this.f28674u;
        if (jfoVar != null && jfoVar.f33911b.mo6184l(diy.f11750g) && ((hor) ((hpm) jfoVar.f33910a).f28925j.f34942d).equals(hor.STATE_RECORDING)) {
            ((hpm) jfoVar.f33910a).m10586d();
        }
        return new hos(this, bkoVar, 0, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: renamed from: c */
    public final void m10552c() {
        this.f28654a.set(false);
        this.f28657d.set(false);
        this.f28668o.mo14126m(true, false, true);
        this.f28664k.m10602h(false);
    }

    /* JADX INFO: renamed from: d */
    final void m10553d(boolean z) {
        boolean z2;
        if (this.f28660g.mo6184l(diy.f11750g)) {
            if (this.f28655b.get() == z || z) {
                this.f28655b.get();
                z2 = false;
            } else {
                z2 = true;
            }
            this.f28655b.set(z);
            if (z) {
                if (this.f28654a.get()) {
                    kfk kfkVar = this.f28668o;
                    kgd kgdVarM14187a = kge.m14187a();
                    kgdVarM14187a.m14184c(3);
                    kgdVarM14187a.m14183b(1);
                    kgdVarM14187a.m14186e(1);
                    kfkVar.mo14124k(kgdVarM14187a.m14182a());
                    ScheduledFuture scheduledFuture = this.f28671r;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    this.f28663j.m3466c(this.f28666m);
                }
            } else if (z2) {
                m10551b(true, !((Boolean) ((jwf) this.f28675v.f12398d).f34942d).booleanValue());
            }
            if (this.f28654a.get()) {
                this.f28664k.m10602h(z);
            }
        }
    }
}
