package p000;

import android.content.ContentValues;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eog implements nph {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f14852a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f14853b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f14854c;

    public eog(bkn bknVar, fzr fzrVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f14854c = i;
        this.f14853b = bknVar;
        this.f14852a = fzrVar;
    }

    public eog(eim eimVar, kgi kgiVar, int i) {
        this.f14854c = i;
        this.f14852a = eimVar;
        this.f14853b = kgiVar;
    }

    public eog(eoi eoiVar, eoh eohVar, int i) {
        this.f14854c = i;
        this.f14853b = eoiVar;
        this.f14852a = eohVar;
    }

    public eog(eqx eqxVar, ept eptVar, int i) {
        this.f14854c = i;
        this.f14853b = eqxVar;
        this.f14852a = eptVar;
    }

    public eog(eus eusVar, kcc kccVar, int i) {
        this.f14854c = i;
        this.f14852a = eusVar;
        this.f14853b = kccVar;
    }

    public eog(eva evaVar, kcc kccVar, int i) {
        this.f14854c = i;
        this.f14852a = evaVar;
        this.f14853b = kccVar;
    }

    public eog(evg evgVar, Uri uri, int i) {
        this.f14854c = i;
        this.f14853b = evgVar;
        this.f14852a = uri;
    }

    public eog(ewa ewaVar, kcc kccVar, int i) {
        this.f14854c = i;
        this.f14852a = ewaVar;
        this.f14853b = kccVar;
    }

    public eog(grn grnVar, gyh gyhVar, int i) {
        this.f14854c = i;
        this.f14852a = grnVar;
        this.f14853b = gyhVar;
    }

    public eog(gyn gynVar, kbb kbbVar, int i) {
        this.f14854c = i;
        this.f14852a = gynVar;
        this.f14853b = kbbVar;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kcc] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f14854c) {
            case 0:
                ((eoi) this.f14853b).m7592j(((eoh) this.f14852a).f14856b, th.getMessage());
                break;
            case 1:
                break;
            case 2:
                ((eqx) this.f14853b).close();
                eqh.m7684m((ept) this.f14852a, "Error compressing primary jpg file", th);
                break;
            case 3:
                this.f14853b.mo13952a();
                ((nbe) ((nbe) ((nbe) eus.f20137b.m17251b()).mo17283h(th)).mo17276G((char) 1947)).mo17290o("Error starting camera");
                break;
            case 4:
                this.f14853b.mo13952a();
                break;
            case 5:
                ((nbe) ((nbe) ((nbe) evg.f20388a.m17251b()).mo17283h(th)).mo17276G(1978)).mo17293r("Failure while saving JPEG image to %s", this.f14852a);
                ((evg) this.f14853b).f20392e.mo3699m();
                break;
            case 6:
                this.f14853b.mo13952a();
                ((nbe) ((nbe) ((nbe) ewa.f20497b.m17251b()).mo17283h(th)).mo17276G((char) 1987)).mo17290o("Error starting camera");
                break;
            case 7:
                ((bkn) this.f14853b).f3651a.mo13942d("Unable to log capture metadata: ".concat(String.valueOf(String.valueOf(th))));
                break;
            case 8:
                ((nbe) ((nbe) ((nbe) grn.f26164e.m17251b()).mo17283h(th)).mo17276G((char) 3210)).mo17290o("Lucky Shot Filter failed to return valid result.");
                break;
            default:
                Object obj = this.f14852a;
                ((gyn) obj).f26856e.mo13947i("Failed to set progress for ".concat(obj.toString()));
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object, kcc] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v20, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v76, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r2v86, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        int i = 8;
        int i2 = 12;
        int i3 = 0;
        short[] sArr = null;
        switch (this.f14854c) {
            case 0:
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    eok eokVar = ((eoh) this.f14852a).f14858d;
                    nbz nbzVar = nch.f41987a;
                    eokVar.f14875a.m9977b();
                    eokVar.f14876b.m9987g();
                    ((hjz) eokVar.f14877c).f28096v.mo14894e(Long.valueOf(SystemClock.elapsedRealtime()));
                    ((eoh) this.f14852a).f14856b.m7218a();
                    ((eoi) this.f14853b).f14860a.remove(((eoh) this.f14852a).f14856b);
                } else {
                    ((eoi) this.f14853b).m7592j(((eoh) this.f14852a).f14856b, "Kepler Controller processing failed.");
                }
                break;
            case 1:
                ((eim) this.f14852a).f14151b.mo13944f("Received SurfaceTexture");
                ((eim) this.f14852a).f14154e.execute(new bmj(this, (SurfaceTexture) obj, (kgi) this.f14853b, 16, (byte[]) null));
                break;
            case 2:
                fxt fxtVar = (fxt) obj;
                ((eqx) this.f14853b).close();
                if (fxtVar == null) {
                    ((nbe) ((nbe) eqh.f15135a.m17251b()).mo17276G(1802)).mo17291p("Error encoding the primary image %d", ((ept) this.f14852a).f15046h);
                } else {
                    ept eptVar = (ept) this.f14852a;
                    eptVar.f15039a = true;
                    eptVar.f15040b.f13675v.f25502c.mo9905k().mo10402d(fxtVar.f23818b.length);
                    ((hjz) ((ept) this.f14852a).f15040b.f13675v.f25502c.mo9905k()).f28081g = fxtVar.f23820d;
                }
                ((ept) this.f14852a).m7646e();
                break;
            case 3:
                fmd fmdVar = (fmd) obj;
                fmdVar.getClass();
                jvh.m13562j(fmdVar.mo8575i().f39914b, new cis(this, i2, (byte[]) (null == true ? 1 : 0)), ((eus) this.f14852a).f20188f);
                eus eusVar = (eus) this.f14852a;
                eusVar.f20156R = fmdVar;
                eusVar.f20187e.mo3693g().mo3717g();
                ((eus) this.f14852a).m7915y(((Boolean) fmdVar.m8568b().mo3831be()).booleanValue());
                eus eusVar2 = (eus) this.f14852a;
                eusVar2.f20148J.m13537d(fmdVar.m8568b().mo3830a(new dsu(this, 20, (byte[]) null), eusVar2.f20188f));
                boolean z = ((eus) this.f14852a).f20195m.mo16813g() && fmdVar.f22543c.mo14558k() == kmq.BACK;
                eus eusVar3 = (eus) this.f14852a;
                fmd fmdVar2 = eusVar3.f20156R;
                fmdVar2.getClass();
                flz flzVar = fmdVar2.f22542b;
                AccessibilityManager accessibilityManager = eusVar3.f20202t;
                dpx dpxVar = eusVar3.f20203u;
                fvu fvuVar = fmdVar2.f22543c;
                ggm ggmVar = eusVar3.f20204v;
                dnr dnrVar = ((ciq) eusVar3.f20187e.mo3693g()).f5818C;
                dhv dhvVar = eusVar3.f20199q;
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6175c();
                eusVar3.f20157S = new hsu(accessibilityManager, dpxVar, fvuVar, ggmVar, flzVar, dnrVar, dhvVar, eusVar3.f20142D, null, null);
                eusVar3.f20148J.m13537d(eusVar3.f20157S.m10716a(fmdVar2.mo8575i().f39917e, eusVar3.f20188f));
                eusVar3.f20157S.m10717b(flzVar.f22532d.f31019a);
                eus eusVar4 = (eus) this.f14852a;
                eusVar4.f20149K = ((ciq) eusVar4.f20187e.mo3693g()).f5844j;
                eusVar4.f20149K.m6429b();
                eus eusVar5 = (eus) this.f14852a;
                if (eusVar5.f20199q.mo6184l(dib.f11357ck)) {
                    fmd fmdVar3 = eusVar5.f20156R;
                    fmdVar3.getClass();
                    eusVar5.f20142D.m10881d(fmdVar3.f22542b.f22532d.f31019a);
                }
                eus eusVar6 = (eus) this.f14852a;
                fmdVar.f22541a.m13537d(eusVar6.f20194l.m3417a(fmdVar, fmdVar.f22543c, fmdVar.mo8575i().f39915c, fmdVar.mo8575i().f39921i, z, eusVar6.f20145G.mo16813g(), 2));
                if (((eus) this.f14852a).f20144F.mo16813g()) {
                    fmdVar.f22541a.m13537d(((hnn) ((eus) this.f14852a).f20144F.mo16809c()).mo10494a(ikw.LONG_EXPOSURE));
                }
                eus eusVar7 = (eus) this.f14852a;
                eusVar7.f20188f.execute(new euj(eusVar7, 2));
                eus eusVar8 = (eus) this.f14852a;
                if (eusVar8.f20141C.f13306h && eusVar8.f20143E.mo16813g()) {
                    eus eusVar9 = (eus) this.f14852a;
                    eusVar9.f20148J.m13537d(((clc) eusVar9.f20143E.mo16809c()).mo3870a(ikw.LONG_EXPOSURE, (gcx) fmdVar.mo8575i().f39919g, fmdVar.mo8575i().f39913a));
                }
                eus eusVar10 = (eus) this.f14852a;
                jvd jvdVar = eusVar10.f20188f;
                eby ebyVar = eusVar10.f20205w;
                ebyVar.getClass();
                jvdVar.execute(new euj(ebyVar, i));
                this.f14853b.mo13952a();
                break;
            case 4:
                fmd fmdVar4 = (fmd) obj;
                fmdVar4.getClass();
                eva evaVar = (eva) this.f14852a;
                evaVar.f20291L = fmdVar4;
                evaVar.f20310d.mo3693g().mo3717g();
                jvh.m13562j(fmdVar4.mo8575i().f39914b, new cis(this, 13, (char[]) (null == true ? 1 : 0)), ((eva) this.f14852a).f20311e);
                eva evaVar2 = (eva) this.f14852a;
                evaVar2.f20287H.m13537d(fmdVar4.m8568b().mo3830a(new euz(this, i3, (byte[]) (null == true ? 1 : 0)), evaVar2.f20311e));
                eva evaVar3 = (eva) this.f14852a;
                fmdVar4.f22541a.m13537d(evaVar3.f20323q.m3417a(fmdVar4, fmdVar4.f22543c, fmdVar4.mo8575i().f39915c, fmdVar4.mo8575i().f39921i, true, evaVar3.f20284E.mo16813g(), 2));
                if (((eva) this.f14852a).f20313g.mo16813g()) {
                    fmdVar4.f22541a.m13537d(((hnn) ((eva) this.f14852a).f20313g.mo16809c()).mo10494a(ikw.MOTION_BLUR));
                }
                eva evaVar4 = (eva) this.f14852a;
                fmd fmdVar5 = evaVar4.f20291L;
                fmdVar5.getClass();
                fvu fvuVar2 = fmdVar5.f22543c;
                flz flzVar2 = fmdVar5.f22542b;
                AccessibilityManager accessibilityManager2 = evaVar4.f20332z;
                dpx dpxVar2 = evaVar4.f20280A;
                ggm ggmVar2 = evaVar4.f20281B;
                dnr dnrVar2 = ((ciq) evaVar4.f20310d.mo3693g()).f5818C;
                dhv dhvVar2 = evaVar4.f20329w;
                dhx dhxVar2 = dib.f11240a;
                dhvVar2.mo6175c();
                evaVar4.f20292M = new hsu(accessibilityManager2, dpxVar2, fvuVar2, ggmVar2, flzVar2, dnrVar2, dhvVar2, evaVar4.f20282C, null, null);
                evaVar4.f20287H.m13537d(evaVar4.f20292M.m10716a(fmdVar5.mo8575i().f39917e, evaVar4.f20311e));
                evaVar4.f20292M.m10717b(flzVar2.f22532d.f31019a);
                eva evaVar5 = (eva) this.f14852a;
                evaVar5.f20311e.execute(new euj(evaVar5, i2));
                this.f14853b.mo13952a();
                break;
            case 5:
                ((evg) this.f14853b).f20392e.mo3700n(new Intent());
                break;
            case 6:
                fmd fmdVar6 = (fmd) obj;
                fmdVar6.getClass();
                ewa ewaVar = (ewa) this.f14852a;
                ewaVar.f20517T = fmdVar6;
                ewaVar.f20547e.mo3693g().mo3717g();
                jvh.m13562j(fmdVar6.mo8575i().f39914b, new cis(this, 15, sArr), ((ewa) this.f14852a).f20548f);
                if (!((ewa) this.f14852a).f20566x.m10799h()) {
                    ((ewa) this.f14852a).f20568z.mo11013l(true);
                    ((ewa) this.f14852a).f20560r.mo11765p();
                }
                ewa ewaVar2 = (ewa) this.f14852a;
                ewaVar2.f20506I.m13537d(fmdVar6.m8568b().mo3830a(new euz(this, i, (char[]) (null == true ? 1 : 0)), ewaVar2.f20548f));
                if (((ewa) this.f14852a).f20501D.mo16813g()) {
                    ((cld) ((ewa) this.f14852a).f20501D.mo16809c()).mo3902f(fmdVar6, ((ewa) this.f14852a).f20506I);
                }
                ewa ewaVar3 = (ewa) this.f14852a;
                fmd fmdVar7 = ewaVar3.f20517T;
                fmdVar7.getClass();
                ewaVar3.f20506I.m13537d(fmdVar7.mo8575i().f39917e.mo3830a(ewaVar3.f20515R, jzn.m13824l("PortFcDet")));
                ewaVar3.f20509L = fmdVar7.mo8575i().f39916d;
                flz flzVar3 = fmdVar7.f22542b;
                AccessibilityManager accessibilityManager3 = ewaVar3.f20558p;
                dpx dpxVar3 = ewaVar3.f20559q;
                fvu fvuVar3 = fmdVar7.f22543c;
                ggm ggmVar3 = ewaVar3.f20557o;
                dnr dnrVar3 = ((ciq) ewaVar3.f20547e.mo3693g()).f5818C;
                dhv dhvVar3 = ewaVar3.f20561s;
                dhx dhxVar3 = dib.f11240a;
                dhvVar3.mo6175c();
                ewaVar3.f20518U = new hsu(accessibilityManager3, dpxVar3, fvuVar3, ggmVar3, flzVar3, dnrVar3, dhvVar3, ewaVar3.f20502E, null, null);
                ewaVar3.f20506I.m13537d(ewaVar3.f20518U.m10716a(fmdVar7.mo8575i().f39917e, ewaVar3.f20548f));
                ewaVar3.f20518U.m10717b(flzVar3.f22532d.f31019a);
                ewa ewaVar4 = (ewa) this.f14852a;
                ewaVar4.f20508K = ((ciq) ewaVar4.f20547e.mo3693g()).f5844j;
                ewaVar4.f20508K.m6429b();
                ewa ewaVar5 = (ewa) this.f14852a;
                if (ewaVar5.f20561s.mo6184l(dib.f11357ck)) {
                    fmd fmdVar8 = ewaVar5.f20517T;
                    fmdVar8.getClass();
                    ewaVar5.f20502E.m10881d(fmdVar8.f22542b.f22532d.f31019a);
                }
                fmdVar6.f22541a.m13537d(((ewa) this.f14852a).f20553k.m3417a(fmdVar6, fmdVar6.f22543c, fmdVar6.mo8575i().f39915c, jwr.m13637g(false), ((ewa) this.f14852a).f20561s.mo6184l(dhu.f11205g), ((ewa) this.f14852a).f20503F.mo16813g(), 2));
                ((ewa) this.f14852a).f20506I.m13537d(fmdVar6.mo8575i().f39915c.mo3830a(new euz(this, 9, (char[]) (null == true ? 1 : 0)), jzn.m13824l("PortAfCb")));
                idf idfVar = ((ewa) this.f14852a).f20555m;
                fmdVar6.f22543c.mo14558k();
                kmq kmqVar = kmq.f36557a;
                ikw ikwVar = ikw.UNINITIALIZED;
                idfVar.m11112c();
                ewa ewaVar6 = (ewa) this.f14852a;
                ewaVar6.f20548f.execute(new euj(ewaVar6, 20));
                this.f14853b.mo13952a();
                break;
            case 7:
                List list = (List) obj;
                list.getClass();
                String str = (String) mkv.m16513U(list, 0);
                String str2 = (String) mkv.m16513U(list, 1);
                ?? r2 = ((bkn) this.f14853b).f3651a;
                mrl mrlVarM16766e = mpw.m16766e("Capture Metadata");
                mrlVarM16766e.m16823b("Input", str);
                mrlVarM16766e.m16823b("Reprocessing", str2);
                mrlVarM16766e.m16823b("NPF", ((fzr) this.f14852a).f23993e);
                r2.mo13946h("Capture Metadata: ".concat(mrlVarM16766e.toString()));
                break;
            case 8:
                Set set = (Set) obj;
                if (set != null) {
                    ((grn) this.f14852a).m9674c(set, this.f14853b);
                }
                break;
            default:
                Uri uri = (Uri) obj;
                if (uri == null || Uri.EMPTY.equals(uri)) {
                    ((gyn) this.f14852a).f26856e.mo13947i("Skipping progress update for empty or null uri: ".concat(String.valueOf(String.valueOf(uri))));
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("progress_status", (Integer) 0);
                    contentValues.put("progress_percentage", Integer.valueOf(((kbb) this.f14853b).f35516e));
                    ((gyn) this.f14852a).f26854c.getContentResolver().update(uri, contentValues, null);
                }
                break;
        }
    }
}
