package p000;

import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dft implements hjk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10813a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10814b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10815c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f10816d;

    public /* synthetic */ dft(AmbientModeSupport.AmbientController ambientController, ohb ohbVar, jwn jwnVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10816d = i;
        this.f10815c = ambientController;
        this.f10813a = ohbVar;
        this.f10814b = jwnVar;
    }

    public /* synthetic */ dft(AmbientModeSupport.AmbientController ambientController, ohb ohbVar, lja ljaVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f10816d = i;
        this.f10815c = ambientController;
        this.f10813a = ohbVar;
        this.f10814b = ljaVar;
    }

    public /* synthetic */ dft(AmbientModeSupport.AmbientController ambientController, oju ojuVar, jvd jvdVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10816d = i;
        this.f10815c = ambientController;
        this.f10813a = ojuVar;
        this.f10814b = jvdVar;
    }

    public /* synthetic */ dft(cdu cduVar, bkn bknVar, oju ojuVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f10816d = i;
        this.f10815c = cduVar;
        this.f10814b = bknVar;
        this.f10813a = ojuVar;
    }

    public /* synthetic */ dft(hah hahVar, AmbientModeSupport.AmbientController ambientController, ohb ohbVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10816d = i;
        this.f10815c = hahVar;
        this.f10814b = ambientController;
        this.f10813a = ohbVar;
    }

    public /* synthetic */ dft(jvd jvdVar, fan fanVar, ohb ohbVar, int i) {
        this.f10816d = i;
        this.f10814b = jvdVar;
        this.f10815c = fanVar;
        this.f10813a = ohbVar;
    }

    public /* synthetic */ dft(jvd jvdVar, fba fbaVar, ohb ohbVar, int i) {
        this.f10816d = i;
        this.f10814b = jvdVar;
        this.f10815c = fbaVar;
        this.f10813a = ohbVar;
    }

    public /* synthetic */ dft(kbz kbzVar, String str, oju ojuVar, int i) {
        this.f10816d = i;
        this.f10815c = kbzVar;
        this.f10814b = str;
        this.f10813a = ojuVar;
    }

    public /* synthetic */ dft(mrm mrmVar, jvd jvdVar, fba fbaVar, int i) {
        this.f10816d = i;
        this.f10813a = mrmVar;
        this.f10814b = jvdVar;
        this.f10815c = fbaVar;
    }

    public /* synthetic */ dft(oju ojuVar, gye gyeVar, cdu cduVar, int i) {
        this.f10816d = i;
        this.f10813a = ojuVar;
        this.f10814b = gyeVar;
        this.f10815c = cduVar;
    }

    public /* synthetic */ dft(oju ojuVar, jvd jvdVar, oju ojuVar2, int i) {
        this.f10816d = i;
        this.f10814b = ojuVar;
        this.f10815c = jvdVar;
        this.f10813a = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v25, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, oju] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10816d) {
            case 0:
                Object obj = this.f10815c;
                ?? r2 = this.f10813a;
                ?? r3 = this.f10814b;
                hes hesVar = (hes) r2.get();
                lja ljaVarM10159a = het.m10159a();
                ljaVarM10159a.f38344c = "SelfieAngleAdvice";
                ljaVarM10159a.m15518h(mxk.m17136H(ikw.PHOTO));
                ljaVarM10159a.m15517g(mxk.m17136H(kmq.f36557a));
                ljaVarM10159a.m15520j(true);
                ljaVarM10159a.m15519i(r3);
                ((AmbientModeSupport.AmbientController) obj).m1661k(hesVar, ljaVarM10159a.m15516f());
                break;
            case 1:
                Object obj2 = this.f10815c;
                ?? r1 = this.f10813a;
                Object obj3 = this.f10814b;
                hes hesVar2 = (hes) r1.get();
                lja ljaVarM10159a2 = het.m10159a();
                ljaVarM10159a2.f38344c = "CameraVisionKit";
                ljaVarM10159a2.f38342a = 5;
                ljaVarM10159a2.m15517g(mxk.m17136H(kmq.BACK));
                ljaVarM10159a2.m15518h(mxk.m17136H(ikw.PHOTO));
                ljaVarM10159a2.f38347f = mrm.m16829i(obj3);
                ((AmbientModeSupport.AmbientController) obj2).m1661k(hesVar2, ljaVarM10159a2.m15516f());
                break;
            case 2:
                Object obj4 = this.f10815c;
                ?? r4 = this.f10813a;
                ?? r5 = this.f10814b;
                hes hesVar3 = (hes) r4.get();
                lja ljaVarM10159a3 = het.m10159a();
                ljaVarM10159a3.f38344c = "CameraLockIndicator";
                ljaVarM10159a3.m15518h(mxk.m17138J(ikw.PHOTO, ikw.LONG_EXPOSURE, ikw.MOTION_BLUR));
                ljaVarM10159a3.m15517g(mxk.m17136H(kmq.BACK));
                ljaVarM10159a3.m15520j(false);
                ljaVarM10159a3.m15519i(r5);
                ljaVarM10159a3.f38346e = mrm.m16829i((hem) r4.get());
                ((AmbientModeSupport.AmbientController) obj4).m1661k(hesVar3, ljaVarM10159a3.m15516f());
                break;
            case 3:
                Object obj5 = this.f10814b;
                Object obj6 = this.f10815c;
                ?? r6 = this.f10813a;
                mrm mrmVarM6617a = ((dra) obj5).m6617a();
                if (mrmVarM6617a.mo16813g()) {
                    ((jvd) obj6).execute(new dgq((oju) r6, mrmVarM6617a, 6));
                }
                break;
            case 4:
                Object obj7 = this.f10815c;
                AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) obj7;
                ambientController.m1661k((hes) this.f10813a.get(), ((lja) this.f10814b).m15516f());
                break;
            case 5:
                Object obj8 = this.f10813a;
                Object obj9 = this.f10814b;
                Object obj10 = this.f10815c;
                mrm mrmVar = (mrm) obj8;
                ((enq) mrmVar.mo16809c()).mo7564b();
                jvd jvdVar = (jvd) obj9;
                fdh.m8265e(jvdVar, (fba) obj10, (fbp) mrmVar.mo16809c());
                break;
            case 6:
                Object obj11 = this.f10814b;
                jvd jvdVar2 = (jvd) obj11;
                jvdVar2.execute(new ekr((fan) this.f10815c, (ohb) this.f10813a, 7));
                break;
            case 7:
                Object obj12 = this.f10815c;
                Object obj13 = this.f10814b;
                bkn bknVar = (bkn) obj13;
                ((cdu) obj12).m3529i().m13537d(bknVar.m2581ad(((fez) this.f10813a).get()));
                break;
            case 8:
                ?? r0 = this.f10813a;
                Object obj14 = this.f10814b;
                Object obj15 = this.f10815c;
                ffh ffhVar = (ffh) r0.get();
                gye gyeVar = (gye) obj14;
                gyeVar.m9966a(ffhVar);
                if (ffhVar.f21617c.mo16813g()) {
                    ((hgo) ffhVar.f21617c.mo16809c()).mo10210a(ffhVar.f21619e);
                    ffhVar.f21615a.set(true);
                }
                ((cdu) obj15).m3529i().m13537d(new eip(gyeVar, ffhVar, 11));
                break;
            case 9:
                ?? r7 = this.f10815c;
                String str = (String) this.f10814b;
                String strConcat = "get:".concat(str);
                ?? r8 = this.f10813a;
                r7.mo13961e(strConcat);
                Runnable runnable = (Runnable) r8.get();
                r7.mo13963g("run:".concat(str));
                runnable.run();
                r7.mo13962f();
                break;
            case 10:
                ?? r9 = this.f10815c;
                Object obj16 = this.f10814b;
                ?? r10 = this.f10813a;
                lja ljaVarM10159a4 = het.m10159a();
                ljaVarM10159a4.f38344c = "Cheetah";
                ljaVarM10159a4.m15518h(mxk.m17136H(ikw.PHOTO));
                ljaVarM10159a4.m15517g(mxk.m17136H(kmq.BACK));
                ljaVarM10159a4.m15519i(jwv.m13644a((Boolean) r9.mo10031c(gzy.f27058q)));
                AmbientModeSupport.AmbientController ambientController2 = (AmbientModeSupport.AmbientController) obj16;
                ambientController2.m1661k((hes) r10.get(), ljaVarM10159a4.m15516f());
                break;
            default:
                Object obj17 = this.f10814b;
                jvd jvdVar3 = (jvd) obj17;
                fdh.m8265e(jvdVar3, (fba) this.f10815c, (fbp) this.f10813a.get());
                break;
        }
    }
}
