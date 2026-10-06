package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gjv implements gbi {

    /* JADX INFO: renamed from: a */
    public static final Long f25139a = Long.valueOf(TimeUnit.MILLISECONDS.toNanos(100));

    /* JADX INFO: renamed from: b */
    public static final Duration f25140b = Duration.ofSeconds(2);

    /* JADX INFO: renamed from: c */
    public static final Duration f25141c = Duration.ofMillis(500);

    /* JADX INFO: renamed from: d */
    public final kbo f25142d;

    /* JADX INFO: renamed from: e */
    public final cgb f25143e;

    /* JADX INFO: renamed from: f */
    public final eby f25144f;

    /* JADX INFO: renamed from: g */
    public final ecq f25145g;

    /* JADX INFO: renamed from: h */
    public final kmd f25146h;

    /* JADX INFO: renamed from: i */
    public final boolean f25147i;

    /* JADX INFO: renamed from: j */
    public final kbz f25148j;

    /* JADX INFO: renamed from: k */
    public final ikw f25149k;

    /* JADX INFO: renamed from: l */
    public final kbg f25150l;

    /* JADX INFO: renamed from: m */
    public final ebv f25151m;

    /* JADX INFO: renamed from: n */
    public final fdt f25152n;

    /* JADX INFO: renamed from: o */
    public gvd f25153o;

    /* JADX INFO: renamed from: p */
    public gvd f25154p;

    /* JADX INFO: renamed from: q */
    private final gjp f25155q;

    /* JADX INFO: renamed from: r */
    private final mrm f25156r;

    /* JADX INFO: renamed from: s */
    private final kfk f25157s;

    /* JADX INFO: renamed from: t */
    private final mrm f25158t;

    /* JADX INFO: renamed from: u */
    private final jvb f25159u;

    /* JADX INFO: renamed from: v */
    private jvb f25160v;

    /* JADX INFO: renamed from: w */
    private final mca f25161w;

    public gjv(kbo kboVar, mrm mrmVar, kfk kfkVar, mrm mrmVar2, jvb jvbVar, cgb cgbVar, ecq ecqVar, eby ebyVar, kmd kmdVar, ikw ikwVar, kbz kbzVar, mca mcaVar, jwf jwfVar, ebv ebvVar, fdt fdtVar, gjp gjpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25142d = kboVar.mo6314a(NptsKnlVczSZ.nWELrxosyevzcLR);
        this.f25155q = gjpVar;
        this.f25156r = mrmVar;
        this.f25158t = mrmVar2;
        this.f25157s = kfkVar;
        this.f25143e = cgbVar;
        this.f25159u = jvbVar;
        this.f25144f = ebyVar;
        this.f25145g = ecqVar;
        this.f25146h = kmdVar;
        this.f25147i = ikwVar == ikw.LONG_EXPOSURE;
        this.f25148j = kbzVar;
        this.f25161w = mcaVar;
        this.f25149k = ikwVar;
        this.f25150l = jwfVar;
        this.f25151m = ebvVar;
        this.f25152n = fdtVar;
        gvd gvdVar = this.f25153o;
        if (gvdVar != null) {
            gvdVar.m9786b();
        }
        gvd gvdVar2 = this.f25154p;
        if (gvdVar2 != null) {
            gvdVar2.m9786b();
        }
        if (mrmVar.mo16813g() && mrmVar2.mo16813g()) {
            kfc kfcVarMo14131r = kfkVar.mo14131r((kho) mrmVar2.mo16809c(), 3);
            jvb jvbVarM13536c = jvbVar.m13536c();
            this.f25160v = jvbVarM13536c;
            jvbVarM13536c.m13537d(kfcVarMo14131r);
            kfcVarMo14131r.mo9411k(new dtb(this, 3));
            this.f25160v.m13537d(fdtVar);
        }
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25155q.f25040b;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f25155q.mo7627b();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws Throwable {
        Object obj = glkVar.f25502c;
        this.f25148j.mo13961e("mv-setup");
        mrm mrmVarM16828h = obj instanceof gxr ? mrm.m16828h((gxr) obj) : mqu.f41450a;
        if (!mrmVarM16828h.mo16813g()) {
            this.f25142d.mo13947i("Capture session not a LongExposureCaptureSession: ".concat(String.valueOf(String.valueOf(obj))));
        }
        boolean zMo16813g = mrmVarM16828h.mo16813g();
        fgj fgjVarM16306d = this.f25161w.m16306d(glkVar);
        if (zMo16813g) {
            this.f25148j.mo13961e("mv-beginMoments");
            fgjVarM16306d.m8388b();
            this.f25148j.mo13963g("mv-startMicrovideo");
            mrm mrmVarM8387a = fgjVarM16306d.m8387a();
            if (mrmVarM8387a.mo16813g()) {
                this.f25148j.mo13963g("mv-attachSession");
                ((gxr) mrmVarM16828h.mo16809c()).f26748d = mrm.m16829i((fgv) mrmVarM8387a.mo16809c());
            }
            this.f25148j.mo13962f();
        }
        this.f25148j.mo13962f();
        this.f25148j.mo13961e("captureImage");
        this.f25155q.mo7628c(gbhVar, glkVar);
        this.f25148j.mo13962f();
        if (zMo16813g) {
            this.f25148j.mo13961e("mv-endMoments");
            fgjVarM16306d.m8389c();
            this.f25148j.mo13962f();
        }
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("delegate", this.f25155q);
        return mrlVarM16765d.toString();
    }
}
