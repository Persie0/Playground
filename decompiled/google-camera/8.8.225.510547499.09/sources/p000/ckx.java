package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckx implements cld {

    /* JADX INFO: renamed from: a */
    public final hwx f6067a;

    /* JADX INFO: renamed from: b */
    public final fdl f6068b;

    /* JADX INFO: renamed from: c */
    public final igb f6069c;

    /* JADX INFO: renamed from: d */
    public final ohb f6070d;

    /* JADX INFO: renamed from: e */
    public ikw f6071e = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: f */
    private final eby f6072f;

    /* JADX INFO: renamed from: g */
    private final fek f6073g;

    /* JADX INFO: renamed from: h */
    private final jvd f6074h;

    /* JADX INFO: renamed from: i */
    private final elx f6075i;

    /* JADX INFO: renamed from: j */
    private final hht f6076j;

    /* JADX INFO: renamed from: k */
    private final mrm f6077k;

    /* JADX INFO: renamed from: l */
    private final dgb f6078l;

    /* JADX INFO: renamed from: m */
    private final ebv f6079m;

    /* JADX INFO: renamed from: n */
    private final iuj f6080n;

    /* JADX INFO: renamed from: o */
    private final msi f6081o;

    /* JADX INFO: renamed from: p */
    private final dhv f6082p;

    /* JADX INFO: renamed from: q */
    private final kbz f6083q;

    /* JADX INFO: renamed from: r */
    private final gtd f6084r;

    public ckx(hwx hwxVar, eby ebyVar, fek fekVar, fdl fdlVar, igb igbVar, jvd jvdVar, elx elxVar, ohb ohbVar, hht hhtVar, mrm mrmVar, dgb dgbVar, gtd gtdVar, ebv ebvVar, iuj iujVar, msi msiVar, dhv dhvVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f6067a = hwxVar;
        this.f6072f = ebyVar;
        this.f6073g = fekVar;
        this.f6068b = fdlVar;
        this.f6069c = igbVar;
        this.f6074h = jvdVar;
        this.f6075i = elxVar;
        this.f6070d = ohbVar;
        this.f6076j = hhtVar;
        this.f6077k = mrmVar;
        this.f6078l = dgbVar;
        this.f6084r = gtdVar;
        this.f6079m = ebvVar;
        this.f6080n = iujVar;
        this.f6081o = msiVar;
        this.f6082p = dhvVar;
        this.f6083q = kbzVar;
    }

    /* JADX INFO: renamed from: n */
    private final void m3896n() {
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (this.f6071e.ordinal()) {
            case 1:
                this.f6069c.mo11243o();
                return;
            case 6:
                this.f6069c.mo11244p();
                return;
            default:
                throw new IllegalArgumentException("Finishing Auto Night Sight shutter is not supported in mode ".concat(String.valueOf(String.valueOf(this.f6071e))));
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: a */
    public final void mo3897a() {
        if (this.f6072f.m7102m()) {
            this.f6073g.mo8294bN();
        } else {
            this.f6073g.mo8286a();
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: b */
    public final void mo3898b(boolean z) {
        this.f6068b.m11104f();
        this.f6069c.mo11245q();
        this.f6078l.m6092e();
        if (this.f6077k.mo16813g() && this.f6079m.f13306h) {
            ((clc) this.f6077k.mo16809c()).mo3871b(!z);
        }
        if (z || !((Boolean) this.f6072f.f13316b.mo3831be()).booleanValue()) {
            return;
        }
        m3896n();
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: c */
    public final void mo3899c(boolean z) {
        if (z) {
            jvd jvdVar = this.f6074h;
            fek fekVar = this.f6073g;
            fekVar.getClass();
            jvdVar.execute(new cei(fekVar, 18));
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: d */
    public final void mo3900d() {
        this.f6073g.mo8286a();
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: e */
    public final void mo3901e(ikw ikwVar, jvb jvbVar) {
        this.f6071e = ikwVar;
        this.f6073g.mo5711f();
        this.f6068b.m11103e(this.f6075i);
        jvbVar.m13537d(this.f6068b);
        jvbVar.m13537d(this.f6072f.f13316b.mo3830a(new cdb(this, ikwVar, 5), this.f6074h));
        fek fekVar = this.f6073g;
        fekVar.getClass();
        jvbVar.m13537d(new cft(fekVar, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jwn] */
    @Override // p000.cld
    /* JADX INFO: renamed from: f */
    public final void mo3902f(fuc fucVar, jvb jvbVar) {
        if (this.f6077k.mo16813g()) {
            jvbVar.m13537d(((clc) this.f6077k.mo16809c()).mo3870a(this.f6071e, (gcx) fucVar.mo8575i().f39919g, fucVar.mo8575i().f39913a));
            this.f6072f.m7097h(true);
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: g */
    public final void mo3903g() {
        if (this.f6077k.mo16813g()) {
            this.f6083q.mo13961e("toggle#disableInteraction");
            ((clc) this.f6077k.mo16809c()).mo3875f();
            this.f6083q.mo13962f();
        }
        this.f6083q.mo13961e("lockExtendedSignal");
        this.f6072f.m7095f();
        this.f6083q.mo13962f();
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: h */
    public final void mo3904h() {
        this.f6072f.m7097h(false);
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: i */
    public final void mo3905i(float f, long j) {
        if (this.f6082p.mo6184l(dhi.f11130q) && this.f6071e.equals(ikw.PHOTO)) {
            if (f == 0.0f) {
                this.f6078l.m6093f(new eup(this, 1));
            }
            if (this.f6078l.m6096k()) {
                this.f6068b.m8272b(f);
            }
        } else {
            this.f6068b.m8272b(f);
        }
        int i = (int) (100.0f * f);
        this.f6069c.mo11196D(i, j, false);
        if (this.f6077k.mo16813g() && this.f6079m.f13306h) {
            ((clc) this.f6077k.mo16809c()).mo3893x(Duration.ofMillis(j), i);
        }
        if (f == 1.0f) {
            this.f6084r.m9747l(j);
            m3896n();
            this.f6078l.m6092e();
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: j */
    public final void mo3906j(boolean z, Duration duration) {
        this.f6083q.mo13961e("soundPlayer#play");
        this.f6076j.mo10316b(C0100R.raw.longexposure_start);
        boolean zMo3866D = false;
        if (this.f6077k.mo16813g() && this.f6079m.f13306h) {
            zMo3866D = ((clc) this.f6077k.mo16809c()).mo3866D(duration);
        }
        hzj hzjVar = ((hzp) this.f6081o.mo6051a()).f30074a.f30073i;
        if (!zMo3866D && !hzjVar.equals(hzj.TABLET_LAYOUT) && !hzjVar.equals(hzj.STARFISH_LAYOUT)) {
            this.f6080n.mo11763n();
        }
        this.f6083q.mo13963g("stateChart#takePicture");
        if (z) {
            this.f6073g.mo8290d();
        } else {
            this.f6073g.mo8291i();
        }
        this.f6083q.mo13962f();
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: k */
    public final void mo3907k() {
        if (this.f6077k.mo16813g()) {
            ((clc) this.f6077k.mo16809c()).mo3889t();
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: l */
    public final void mo3908l() {
        if (this.f6077k.mo16813g()) {
            ((clc) this.f6077k.mo16809c()).mo3891v();
            ((clc) this.f6077k.mo16809c()).mo3882m();
        }
    }

    @Override // p000.cld
    /* JADX INFO: renamed from: m */
    public final void mo3909m() {
        if (this.f6077k.mo16813g()) {
            ((clc) this.f6077k.mo16809c()).mo3882m();
        }
        this.f6072f.m7099j();
    }
}
