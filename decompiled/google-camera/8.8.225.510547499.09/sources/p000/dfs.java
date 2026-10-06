package p000;

import androidx.wear.ambient.AmbientModeSupport;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dfs implements hjk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f10810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f10811e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f10812f;

    public /* synthetic */ dfs(AmbientModeSupport.AmbientController ambientController, ohb ohbVar, Set set, dhv dhvVar, jwn jwnVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f10812f = i;
        this.f10811e = ambientController;
        this.f10807a = ohbVar;
        this.f10808b = set;
        this.f10809c = dhvVar;
        this.f10810d = jwnVar;
    }

    public /* synthetic */ dfs(kbz kbzVar, jvd jvdVar, fba fbaVar, oju ojuVar, oju ojuVar2, int i) {
        this.f10812f = i;
        this.f10810d = kbzVar;
        this.f10811e = jvdVar;
        this.f10809c = fbaVar;
        this.f10807a = ojuVar;
        this.f10808b = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, oju] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10812f) {
            case 0:
                Object obj = this.f10811e;
                ?? r1 = this.f10807a;
                ?? r2 = this.f10808b;
                ?? r3 = this.f10809c;
                ?? r4 = this.f10810d;
                hes hesVar = (hes) r1.get();
                lja ljaVarM10159a = het.m10159a();
                ljaVarM10159a.f38344c = "UpDownIndicatorHUD";
                ljaVarM10159a.m15518h(mxk.m17134F(r2));
                ljaVarM10159a.m15517g(mxk.m17136H(kmq.BACK));
                ljaVarM10159a.m15520j(!r3.mo6184l(dhi.f11126m));
                ljaVarM10159a.m15519i(r4);
                ljaVarM10159a.f38346e = mrm.m16829i((hem) r1.get());
                ((AmbientModeSupport.AmbientController) obj).m1661k(hesVar, ljaVarM10159a.m15516f());
                break;
            case 1:
                Object obj2 = this.f10811e;
                ?? r5 = this.f10807a;
                ?? r6 = this.f10808b;
                ?? r7 = this.f10809c;
                ?? r8 = this.f10810d;
                hes hesVar2 = (hes) r5.get();
                lja ljaVarM10159a2 = het.m10159a();
                ljaVarM10159a2.f38344c = "PitchRollIndicatorHUD";
                ljaVarM10159a2.m15518h(mxk.m17134F(r6));
                ljaVarM10159a2.m15517g(mxk.m17136H(kmq.BACK));
                ljaVarM10159a2.m15520j(!r7.mo6184l(dhi.f11126m));
                ljaVarM10159a2.m15519i(r8);
                ljaVarM10159a2.f38346e = mrm.m16829i((hem) r5.get());
                ((AmbientModeSupport.AmbientController) obj2).m1661k(hesVar2, ljaVarM10159a2.m15516f());
                break;
            default:
                ?? r0 = this.f10810d;
                Object obj3 = this.f10811e;
                Object obj4 = this.f10809c;
                ?? r9 = this.f10807a;
                ?? r10 = this.f10808b;
                r0.mo13961e("jankmon");
                if (ohp.f46028a.mo6051a().mo18498c() > 0) {
                    fdh.m8265e((jvd) obj3, (fba) obj4, (fbp) r9.get());
                }
                if (ohp.m18493b() > 0) {
                    fdh.m8265e((jvd) obj3, (fba) obj4, (fbp) r10.get());
                }
                r0.mo13962f();
                break;
        }
    }
}
