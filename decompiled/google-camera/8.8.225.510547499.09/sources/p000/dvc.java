package p000;

import android.content.Intent;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.BottomBarController;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvc implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f12626a;

    /* JADX INFO: renamed from: b */
    private final oju f12627b;

    /* JADX INFO: renamed from: c */
    private final oju f12628c;

    /* JADX INFO: renamed from: d */
    private final oju f12629d;

    /* JADX INFO: renamed from: e */
    private final oju f12630e;

    /* JADX INFO: renamed from: f */
    private final oju f12631f;

    /* JADX INFO: renamed from: g */
    private final oju f12632g;

    /* JADX INFO: renamed from: h */
    private final oju f12633h;

    /* JADX INFO: renamed from: i */
    private final oju f12634i;

    /* JADX INFO: renamed from: j */
    private final oju f12635j;

    /* JADX INFO: renamed from: k */
    private final oju f12636k;

    /* JADX INFO: renamed from: l */
    private final /* synthetic */ int f12637l;

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i) {
        this.f12637l = i;
        this.f12626a = ojuVar;
        this.f12627b = ojuVar2;
        this.f12628c = ojuVar3;
        this.f12629d = ojuVar4;
        this.f12630e = ojuVar5;
        this.f12631f = ojuVar6;
        this.f12632g = ojuVar7;
        this.f12633h = ojuVar8;
        this.f12634i = ojuVar9;
        this.f12635j = ojuVar10;
        this.f12636k = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, byte[] bArr) {
        this.f12637l = i;
        this.f12626a = ojuVar;
        this.f12636k = ojuVar2;
        this.f12628c = ojuVar3;
        this.f12635j = ojuVar4;
        this.f12633h = ojuVar5;
        this.f12631f = ojuVar6;
        this.f12629d = ojuVar7;
        this.f12632g = ojuVar8;
        this.f12630e = ojuVar9;
        this.f12634i = ojuVar10;
        this.f12627b = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, char[] cArr) {
        this.f12637l = i;
        this.f12634i = ojuVar;
        this.f12627b = ojuVar2;
        this.f12636k = ojuVar3;
        this.f12631f = ojuVar4;
        this.f12629d = ojuVar5;
        this.f12633h = ojuVar6;
        this.f12630e = ojuVar7;
        this.f12628c = ojuVar8;
        this.f12632g = ojuVar9;
        this.f12635j = ojuVar10;
        this.f12626a = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, float[] fArr) {
        this.f12637l = i;
        this.f12629d = ojuVar;
        this.f12636k = ojuVar2;
        this.f12633h = ojuVar3;
        this.f12630e = ojuVar4;
        this.f12626a = ojuVar5;
        this.f12634i = ojuVar6;
        this.f12627b = ojuVar7;
        this.f12632g = ojuVar8;
        this.f12635j = ojuVar9;
        this.f12628c = ojuVar10;
        this.f12631f = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, int[] iArr) {
        this.f12637l = i;
        this.f12626a = ojuVar;
        this.f12628c = ojuVar2;
        this.f12631f = ojuVar3;
        this.f12627b = ojuVar4;
        this.f12636k = ojuVar5;
        this.f12634i = ojuVar6;
        this.f12629d = ojuVar7;
        this.f12630e = ojuVar8;
        this.f12632g = ojuVar9;
        this.f12633h = ojuVar10;
        this.f12635j = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, short[] sArr) {
        this.f12637l = i;
        this.f12632g = ojuVar;
        this.f12633h = ojuVar2;
        this.f12628c = ojuVar3;
        this.f12629d = ojuVar4;
        this.f12626a = ojuVar5;
        this.f12630e = ojuVar6;
        this.f12627b = ojuVar7;
        this.f12634i = ojuVar8;
        this.f12635j = ojuVar9;
        this.f12631f = ojuVar10;
        this.f12636k = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, boolean[] zArr) {
        this.f12637l = i;
        this.f12635j = ojuVar;
        this.f12627b = ojuVar2;
        this.f12636k = ojuVar3;
        this.f12626a = ojuVar4;
        this.f12634i = ojuVar5;
        this.f12630e = ojuVar6;
        this.f12633h = ojuVar7;
        this.f12629d = ojuVar8;
        this.f12628c = ojuVar9;
        this.f12631f = ojuVar10;
        this.f12632g = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, byte[][] bArr) {
        this.f12637l = i;
        this.f12629d = ojuVar;
        this.f12632g = ojuVar2;
        this.f12631f = ojuVar3;
        this.f12630e = ojuVar4;
        this.f12635j = ojuVar5;
        this.f12636k = ojuVar6;
        this.f12627b = ojuVar7;
        this.f12626a = ojuVar8;
        this.f12634i = ojuVar9;
        this.f12628c = ojuVar10;
        this.f12633h = ojuVar11;
    }

    public dvc(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11, int i, char[][] cArr) {
        this.f12637l = i;
        this.f12628c = ojuVar;
        this.f12633h = ojuVar2;
        this.f12630e = ojuVar3;
        this.f12629d = ojuVar4;
        this.f12635j = ojuVar5;
        this.f12634i = ojuVar6;
        this.f12626a = ojuVar7;
        this.f12627b = ojuVar8;
        this.f12632g = ojuVar9;
        this.f12636k = ojuVar10;
        this.f12631f = ojuVar11;
    }

    /* JADX INFO: renamed from: a */
    public static dvc m6764a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11) {
        return new dvc(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, 1, (byte[]) null);
    }

    /* JADX INFO: renamed from: b */
    public static dvc m6765b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11) {
        return new dvc(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, 6, (float[]) null);
    }

    /* JADX INFO: renamed from: c */
    public static dvc m6766c(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11) {
        return new dvc(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, 7, (byte[][]) null);
    }

    /* JADX INFO: renamed from: d */
    public static dvc m6767d(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8, oju ojuVar9, oju ojuVar10, oju ojuVar11) {
        return new dvc(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, ojuVar7, ojuVar8, ojuVar9, ojuVar10, ojuVar11, 8, (char[][]) null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f12637l) {
            case 0:
                dtj dtjVar = (dtj) this.f12626a.get();
                dtj dtjVar2 = (dtj) this.f12627b.get();
                dtj dtjVar3 = (dtj) this.f12628c.get();
                dtj dtjVar4 = (dtj) this.f12629d.get();
                dtj dtjVar5 = (dtj) this.f12630e.get();
                dtj dtjVar6 = (dtj) this.f12631f.get();
                dtj dtjVar7 = (dtj) this.f12632g.get();
                dtj dtjVar8 = (dtj) this.f12633h.get();
                dtj dtjVar9 = (dtj) this.f12634i.get();
                dtj dtjVar10 = (dtj) this.f12635j.get();
                dtj dtjVar11 = (dtj) this.f12636k.get();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (!Pattern.matches("feature\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+\\.[a-z0-9\\-]+(:\\d+)?", "feature.acmi.derived.topshot-quality")) {
                    throw new IllegalArgumentException("Feature with bad type name 'feature.acmi.derived.topshot-quality'!");
                }
                arrayList.add(dtjVar);
                arrayList.add(dtjVar2);
                arrayList.add(dtjVar3);
                arrayList.add(dtjVar4);
                arrayList.add(dtjVar5);
                arrayList.add(dtjVar6);
                arrayList.add(dtjVar7);
                arrayList.add(dtjVar8);
                arrayList.add(dtjVar9);
                arrayList.add(dtjVar10);
                arrayList.add(dtjVar11);
                return dti.m6727a("feature.acmi.derived.topshot-quality", arrayList, arrayList2);
            case 1:
                kms kmsVar = (kms) this.f12626a.get();
                jvd jvdVar = (jvd) this.f12636k.get();
                dfn dfnVar = (dfn) this.f12628c.get();
                dcl dclVar = (dcl) this.f12635j.get();
                ddq ddqVar = (ddq) this.f12633h.get();
                cwd cwdVar = ((dce) this.f12631f).get();
                doe doeVar = (doe) this.f12629d.get();
                Intent intent = ((eme) this.f12632g).get();
                dhv dhvVar = (dhv) this.f12630e.get();
                jwn jwnVar = (jwn) this.f12634i.get();
                dbw dbwVar = (dbw) this.f12627b.get();
                dbr dbrVar = new dbr(kmsVar, jvdVar, dfnVar, dclVar, ddqVar, cwdVar, doeVar, intent, dhvVar, jwnVar, null, null, null);
                dbwVar.m5912a(dbrVar);
                return dbrVar;
            case 2:
                final AmbientModeSupport.AmbientController ambientController = (AmbientModeSupport.AmbientController) this.f12634i.get();
                final fdc fdcVar = (fdc) this.f12627b.get();
                hah hahVar = (hah) this.f12636k.get();
                final fdq fdqVar = (fdq) this.f12631f.get();
                final fdp fdpVar = (fdp) this.f12633h.get();
                final dhv dhvVar2 = (dhv) this.f12630e.get();
                ((cde) this.f12628c).m3490a().booleanValue();
                final ccs ccsVar = (ccs) this.f12632g.get();
                final jww jwwVar = (jww) this.f12635j.get();
                final cdu cduVar = ((err) this.f12626a).get();
                final jwn jwnVarMo10029a = hahVar.mo10029a(gzy.f27058q);
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                final byte[] bArr4 = null;
                return new hjk(jwnVarMo10029a, ambientController, fdcVar, fdqVar, fdpVar, cduVar, jwwVar, ccsVar, bArr, bArr2, bArr3, bArr4) { // from class: fdf

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ jwn f21419b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ fdc f21420c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ fdq f21421d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ fdp f21422e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ jww f21423f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ ccs f21424g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ cdu f21425h;

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ AmbientModeSupport.AmbientController f21426i;

                    @Override // java.lang.Runnable
                    public final void run() {
                        dhv dhvVar3 = this.f21418a;
                        jwn jwnVar2 = this.f21419b;
                        AmbientModeSupport.AmbientController ambientController2 = this.f21426i;
                        fdc fdcVar2 = this.f21420c;
                        fdq fdqVar2 = this.f21421d;
                        fdp fdpVar2 = this.f21422e;
                        cdu cduVar2 = this.f21425h;
                        jww jwwVar2 = this.f21423f;
                        ccs ccsVar2 = this.f21424g;
                        if (!dhvVar3.mo6184l(did.f11424ac)) {
                            lja ljaVarM10159a = het.m10159a();
                            ljaVarM10159a.f38344c = "Night";
                            ljaVarM10159a.m15518h(mxk.m17136H(ikw.PHOTO));
                            ljaVarM10159a.m15517g(mxk.m17137I(kmq.BACK, kmq.f36557a));
                            ljaVarM10159a.m15519i(jwnVar2);
                            ambientController2.m1661k(fdqVar2, ljaVarM10159a.m15516f());
                            if (dhvVar3.mo6184l(dih.f11518f)) {
                                ljaVarM10159a.m15518h(mxk.m17136H(ikw.PHOTO));
                                ljaVarM10159a.m15517g(mxk.m17136H(kmq.f36557a));
                                ljaVarM10159a.m15519i(jwnVar2);
                                ambientController2.m1661k(fdpVar2, ljaVarM10159a.m15516f());
                            }
                        } else if (dhvVar3.mo6184l(did.f11472z)) {
                            lja ljaVarM10159a2 = het.m10159a();
                            ljaVarM10159a2.f38344c = "Astro";
                            ljaVarM10159a2.m15520j(true);
                            ljaVarM10159a2.m15518h(mxk.m17136H(ikw.PHOTO));
                            ljaVarM10159a2.m15517g(mxk.m17136H(kmq.BACK));
                            ljaVarM10159a2.m15519i(jwnVar2);
                            ambientController2.m1661k(fdcVar2, ljaVarM10159a2.m15516f());
                        }
                        jvb jvbVarM3529i = cduVar2.m3529i();
                        ccsVar2.getClass();
                        jvbVarM3529i.m13537d(jwwVar2.mo3830a(new euz(ccsVar2, 13), jvh.m13554b()));
                    }
                };
            case 3:
                return new fec((igb) this.f12632g.get(), (iey) this.f12633h.get(), (gfa) this.f12628c.get(), (icf) this.f12629d.get(), (BottomBarController) this.f12626a.get(), (ggm) this.f12630e.get(), (eby) this.f12627b.get(), ((ity) this.f12634i).get(), (jwn) this.f12635j.get(), (fds) this.f12631f.get(), (mrm) this.f12636k.get());
            case 4:
                return new foy((chk) this.f12626a.get(), ((cpk) this.f12628c).get(), ((dww) this.f12631f).m6836a(), (BottomBarController) this.f12627b.get(), this.f12636k, (cwt) this.f12634i.get(), this.f12629d, (daj) this.f12630e.get(), (jwf) this.f12632g.get(), ((Boolean) this.f12633h.get()).booleanValue(), (fna) this.f12635j.get());
            case 5:
                return new geo((jww) this.f12635j.get(), (jvd) this.f12627b.get(), (kbz) this.f12636k.get(), ((erp) this.f12626a).get(), (fcp) this.f12634i.get(), (jww) this.f12630e.get(), (hah) this.f12633h.get(), (geh) this.f12629d.get(), ((ohm) this.f12628c).get(), (geq) this.f12631f.get(), (ges) this.f12632g.get());
            case 6:
                ohb ohbVarM18485a = ohh.m18485a(this.f12629d);
                kbc kbcVar = ((fwz) this.f12636k).get();
                gkz gkzVar = ((ebo) this.f12633h).get();
                gva gvaVar = (gva) this.f12630e.get();
                fvu fvuVarM8922a = ((fxj) this.f12626a).m8922a();
                ((ehy) this.f12634i).get();
                return new gnm(ohbVarM18485a, kbcVar, gkzVar, gvaVar, fvuVarM8922a, (Executor) this.f12627b.get(), (bko) this.f12632g.get(), (inm) this.f12635j.get(), (dhv) this.f12628c.get(), (jwn) this.f12631f.get(), null, null, null);
            case 7:
                return new gns((gva) this.f12629d.get(), ((ebo) this.f12632g).get(), (mrm) this.f12631f.get(), ohh.m18485a(this.f12630e), (Executor) this.f12635j.get(), (bko) this.f12636k.get(), (gol) this.f12627b.get(), (efw) this.f12626a.get(), ohh.m18485a(this.f12634i), (dhv) this.f12628c.get(), ((ntb) this.f12633h).get(), null, null, null);
            default:
                return new gny((gva) this.f12628c.get(), (bko) this.f12633h.get(), (gvw) this.f12630e.get(), ((fxj) this.f12629d).m8922a(), (Executor) this.f12635j.get(), (kbz) this.f12634i.get(), (inm) this.f12626a.get(), (dhv) this.f12627b.get(), ((ebo) this.f12632g).get(), ohh.m18485a(this.f12636k), (jwn) this.f12631f.get(), null, null, null);
        }
    }
}
