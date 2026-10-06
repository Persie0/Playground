package p000;

import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ets implements hjk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f19871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f19872b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f19873c;

    public /* synthetic */ ets(AmbientModeSupport.AmbientController ambientController, mrm mrmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19873c = i;
        this.f19872b = ambientController;
        this.f19871a = mrmVar;
    }

    public /* synthetic */ ets(cmp cmpVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19873c = i;
        this.f19872b = cmpVar;
        this.f19871a = ambientController;
    }

    public /* synthetic */ ets(glk glkVar, fvs fvsVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f19873c = i;
        this.f19871a = glkVar;
        this.f19872b = fvsVar;
    }

    public /* synthetic */ ets(ohb ohbVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19873c = i;
        this.f19871a = ohbVar;
        this.f19872b = ambientController;
    }

    public /* synthetic */ ets(oju ojuVar, AmbientModeSupport.AmbientController ambientController, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f19873c = i;
        this.f19871a = ojuVar;
        this.f19872b = ambientController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hes, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oju] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19873c) {
            case 0:
                ((glk) this.f19871a).m9424a((fvs) this.f19872b);
                break;
            case 1:
                ?? r0 = this.f19872b;
                Object obj = this.f19871a;
                cmp cmpVar = (cmp) r0;
                cmpVar.f6264e.execute(new cmd(cmpVar, 5));
                lja ljaVarM10159a = het.m10159a();
                ljaVarM10159a.f38344c = "BeholderExampleGenerator";
                ljaVarM10159a.m15518h(mxk.m17139K(ikw.PHOTO, ikw.PORTRAIT, ikw.LONG_EXPOSURE, ikw.IMAX));
                ljaVarM10159a.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                ((AmbientModeSupport.AmbientController) obj).m1661k(r0, ljaVarM10159a.m15516f());
                break;
            case 2:
                ((glk) this.f19871a).m9424a((fvs) this.f19872b);
                break;
            case 3:
                Object obj2 = this.f19872b;
                mrm mrmVar = (mrm) this.f19871a;
                hes hesVar = (hes) mrmVar.mo16809c();
                lja ljaVarM10159a2 = het.m10159a();
                ljaVarM10159a2.m15518h(mxk.m17139K(ikw.PHOTO, ikw.PORTRAIT, ikw.MOTION_BLUR, ikw.LONG_EXPOSURE));
                ljaVarM10159a2.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                ljaVarM10159a2.f38346e = mrm.m16829i((hem) mrmVar.mo16809c());
                ((AmbientModeSupport.AmbientController) obj2).m1661k(hesVar, ljaVarM10159a2.m15516f());
                break;
            case 4:
                ?? r1 = this.f19871a;
                Object obj3 = this.f19872b;
                hmn hmnVar = (hmn) r1.get();
                lja ljaVarM10159a3 = het.m10159a();
                ljaVarM10159a3.f38344c = "StorageWarning";
                ljaVarM10159a3.m15518h(mxk.m17139K(ikw.PHOTO, ikw.PORTRAIT, ikw.LONG_EXPOSURE, ikw.VIDEO));
                ljaVarM10159a3.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                ljaVarM10159a3.m15520j(false);
                ljaVarM10159a3.m15521k(false);
                ((AmbientModeSupport.AmbientController) obj3).m1661k(hmnVar, ljaVarM10159a3.m15516f());
                break;
            default:
                ?? r2 = this.f19871a;
                Object obj4 = this.f19872b;
                hnj hnjVar = (hnj) r2.get();
                lja ljaVarM10159a4 = het.m10159a();
                ljaVarM10159a4.f38344c = "MacroFocus";
                ljaVarM10159a4.m15518h(mxk.m17138J(ikw.PHOTO, ikw.LONG_EXPOSURE, ikw.VIDEO));
                ljaVarM10159a4.m15517g(mxk.m17136H(kmq.BACK));
                ((AmbientModeSupport.AmbientController) obj4).m1661k(hnjVar, ljaVarM10159a4.m15516f());
                break;
        }
    }
}
