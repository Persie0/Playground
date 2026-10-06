package p000;

import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxu extends gxl {

    /* JADX INFO: renamed from: d */
    private static final nbh f26757d = nbh.m17259h("com/google/android/apps/camera/session/PhotoCaptureSession");

    /* JADX INFO: renamed from: c */
    public mrm f26758c;

    /* JADX INFO: renamed from: e */
    private final egc f26759e;

    /* JADX INFO: renamed from: f */
    private final jwn f26760f;

    /* JADX INFO: renamed from: g */
    private final jwn f26761g;

    /* JADX INFO: renamed from: h */
    private final mrm f26762h;

    /* JADX INFO: renamed from: i */
    private final gdc f26763i;

    /* JADX INFO: renamed from: j */
    private final kbz f26764j;

    /* JADX INFO: renamed from: k */
    private final guk f26765k;

    /* JADX INFO: renamed from: l */
    private mrm f26766l;

    public gxu(gwx gwxVar, egc egcVar, jwn jwnVar, gdc gdcVar, kbz kbzVar, gqq gqqVar, String str, cjr cjrVar, gyn gynVar, mrm mrmVar, jwn jwnVar2, mrm mrmVar2, mrm mrmVar3, gyw gywVar, guk gukVar) {
        super(gwxVar.mo9867a(gywVar, str, cjrVar, gynVar, gqqVar, mrmVar2));
        this.f26758c = mqu.f41450a;
        this.f26759e = egcVar;
        this.f26766l = mrmVar;
        this.f26760f = jwnVar2;
        this.f26761g = jwnVar;
        this.f26762h = mrmVar3;
        this.f26763i = gdcVar;
        dhx dhxVar = dib.f11240a;
        this.f26764j = kbzVar;
        this.f26765k = gukVar;
        this.f26723b.m9916v(new gpn(this, 20));
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: E */
    public final void mo9873E() {
        m9931H("interruptSession");
        m9935o().mo6400b();
    }

    /* JADX INFO: renamed from: K */
    public final InputStream m9942K(InputStream inputStream) {
        mrm mrmVarMo7289a = this.f26759e.mo7289a(mo9906l());
        if (!mrmVarMo7289a.mo16813g()) {
            int i = mo9902h().f26874a;
            return inputStream;
        }
        egd.m7291a((byte[]) mrmVarMo7289a.mo16809c(), mo9907m());
        int i2 = mo9902h().f26874a;
        return new SequenceInputStream(inputStream, new ByteArrayInputStream((byte[]) mrmVarMo7289a.mo16809c()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [dsx] */
    /* JADX WARN: Type inference failed for: r0v9, types: [kbz] */
    /* JADX WARN: Type inference failed for: r2v8, types: [gug, java.lang.Object] */
    /* JADX INFO: renamed from: L */
    public final byte[] m9943L(byte[] bArr) {
        Exception e;
        byte[] bArrM4095d;
        mrm mrmVarM6686a = ((dsx) ((mrq) this.f26762h).f41482a).m6686a(mo9902h());
        if (mrmVarM6686a.mo16813g()) {
            m9931H("Writing depth data into the jpeg image");
            dsx dsxVar = (dsx) mrmVarM6686a.mo16809c();
            try {
                try {
                    this.f26764j.mo13961e("ddepth");
                    bArrM4095d = DynamicDepthUtils.m4095d(bArr, (DynamicDepthResult) dsxVar.f12521a, dsxVar.f12522b);
                    try {
                        ((hjz) mo9905k()).f28079e = true;
                    } catch (Exception e2) {
                        e = e2;
                        ((nbe) ((nbe) ((nbe) f26757d.m17251b()).mo17283h(e)).mo17276G(3360)).mo17290o("Error writing depth data into jpeg.");
                    }
                } catch (Throwable th) {
                    dsxVar.m6690e();
                    this.f26764j.mo13962f();
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bArrM4095d = null;
            }
            dsxVar.m6690e();
            dsxVar = this.f26764j;
            dsxVar.mo13962f();
            if (bArrM4095d != null) {
                return bArrM4095d;
            }
            ((nbe) ((nbe) gxl.f26722a.m17251b()).mo17276G(3335)).mo17301z("[%s] %s", mo9902h(), "Couldn't write depth data, using original stream");
        }
        return bArr;
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: M */
    public final void mo9881M() {
        nkm nkmVarMo8357a;
        this.f26764j.mo13961e("CaptureSessionBase#onCaptureStarted");
        super.mo9881M();
        this.f26764j.mo13963g("enqueueProcessingTask");
        m9930G();
        if (this.f26766l.mo16813g()) {
            this.f26764j.mo13963g("MicrovideoController#collectCaptureStartStats");
            nkmVarMo8357a = ((fgu) this.f26766l.mo16809c()).mo8357a();
            this.f26766l = mqu.f41450a;
        } else {
            nkmVarMo8357a = null;
        }
        this.f26764j.mo13963g("CaptureSessionNotifier#onCaptureStarted");
        m9935o().mo6401c(fdh.m8262b(mo9903i(), nkmVarMo8357a, (Float) this.f26761g.mo3831be()));
        this.f26764j.mo13962f();
        mo9910p().mo2282d(new hde(1), not.INSTANCE);
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: r */
    public final nps mo9912r(byte[] bArr, hln hlnVar) {
        m9931H("saveAndFinish");
        if (m9933J().m2554C()) {
            m9932I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return mo9910p();
        }
        m9933J().m2557F(2, 3);
        hlnVar.f28269d = m9934e().m3829b();
        hlnVar.f28270e = ((Boolean) this.f26760f.mo3831be()).booleanValue();
        hlnVar.f28271f = (gdb) this.f26763i.mo3831be();
        m9933J().m2558G(3);
        mrm mrmVarM9909o = this.f26723b.m9909o(hlnVar, this.f26765k);
        kxk.m14975U(m9938x(), new djq(this, 13), not.INSTANCE);
        m9929F().execute(new apv(this, hlnVar, mrmVarM9909o, bArr, 15));
        return mo9910p();
    }
}
