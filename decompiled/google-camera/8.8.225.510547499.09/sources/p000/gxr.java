package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxr extends gxl {

    /* JADX INFO: renamed from: c */
    public final egc f26747c;

    /* JADX INFO: renamed from: d */
    public mrm f26748d;

    /* JADX INFO: renamed from: e */
    private final jwn f26749e;

    public gxr(gwx gwxVar, egc egcVar, jwn jwnVar, gqq gqqVar, String str, cjr cjrVar, gyn gynVar, mrm mrmVar, jwn jwnVar2) {
        super(gwxVar.mo9867a(((Boolean) jwnVar2.mo3831be()).booleanValue() ? gyw.TAXI : gyw.LONG_EXPOSURE, str, cjrVar, gynVar, gqqVar, mrmVar));
        this.f26748d = mqu.f41450a;
        this.f26747c = egcVar;
        this.f26749e = jwnVar;
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: E */
    public final void mo9873E() {
        m9931H("interruptSession");
        m9935o().mo6400b();
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: M */
    public final void mo9881M() {
        super.mo9881M();
        m9930G();
        m9935o().mo6401c(fdh.m8262b(mo9903i(), null, (Float) this.f26749e.mo3831be()));
    }

    @Override // p000.gxl, p000.gyh
    /* JADX INFO: renamed from: r */
    public final nps mo9912r(byte[] bArr, hln hlnVar) {
        bArr.getClass();
        m9931H("saveAndFinish");
        if (m9933J().m2554C()) {
            m9932I("Ignoring saveAndFinish. CaptureSession has been deleted or canceled.");
            return mo9910p();
        }
        m9933J().m2557F(2, 3);
        hlnVar.f28269d = m9934e().m3829b();
        hlnVar.f28270e = false;
        hlnVar.f28271f = gdb.ON;
        m9933J().m2558G(3);
        m9929F().execute(new apv(this, bArr, m9937v(hlnVar), hlnVar, 14));
        return mo9910p();
    }
}
