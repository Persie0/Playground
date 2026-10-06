package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageButton;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.p014ui.mars.MarsSwitch;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.apps.camera.sideline.SidelineInstallerService;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmo implements nph {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f6236a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f6237b;

    public cmo(cmp cmpVar, int i) {
        this.f6237b = i;
        this.f6236a = cmpVar;
    }

    public cmo(cpw cpwVar, int i) {
        this.f6237b = i;
        this.f6236a = cpwVar;
    }

    public cmo(cqg cqgVar, int i) {
        this.f6237b = i;
        this.f6236a = cqgVar;
    }

    public cmo(dbv dbvVar, int i) {
        this.f6237b = i;
        this.f6236a = dbvVar;
    }

    public cmo(dpo dpoVar, int i) {
        this.f6237b = i;
        this.f6236a = dpoVar;
    }

    public cmo(evo evoVar, int i) {
        this.f6237b = i;
        this.f6236a = evoVar;
    }

    public cmo(ezk ezkVar, int i) {
        this.f6237b = i;
        this.f6236a = ezkVar;
    }

    public cmo(fgd fgdVar, int i) {
        this.f6237b = i;
        this.f6236a = fgdVar;
    }

    public cmo(fzh fzhVar, int i) {
        this.f6237b = i;
        this.f6236a = fzhVar;
    }

    public cmo(gwy gwyVar, int i) {
        this.f6237b = i;
        this.f6236a = gwyVar;
    }

    public cmo(hbv hbvVar, int i) {
        this.f6237b = i;
        this.f6236a = hbvVar;
    }

    public cmo(hdt hdtVar, int i) {
        this.f6237b = i;
        this.f6236a = hdtVar;
    }

    public cmo(hpm hpmVar, int i) {
        this.f6237b = i;
        this.f6236a = hpmVar;
    }

    public cmo(ijv ijvVar, int i) {
        this.f6237b = i;
        this.f6236a = ijvVar;
    }

    public cmo(Runnable runnable, int i) {
        this.f6237b = i;
        this.f6236a = runnable;
    }

    public cmo(C1132xu c1132xu, int i) {
        this.f6237b = i;
        this.f6236a = c1132xu;
    }

    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f6237b) {
            case 0:
                ((nbe) ((nbe) ((nbe) cmp.f6238a.m17252c()).mo17283h(th)).mo17276G((char) 270)).mo17290o(BEeWZPor.gZD);
                return;
            case 1:
                ((nbe) ((nbe) ((nbe) cmp.f6238a.m17251b()).mo17283h(th)).mo17276G((char) 268)).mo17290o("Failed to add Media Record");
                return;
            case 2:
            case 3:
            case 4:
                return;
            case 5:
                Object obj = this.f6236a;
                synchronized (((cpw) obj).f8689e) {
                    ((nbe) ((nbe) ((nbe) cpw.f8674a.m17251b()).mo17283h(th)).mo17276G(451)).mo17290o("Failed to startRecording: ");
                    if (((cpw) obj).f8709y != cpv.NO_RECORDING && ((cpw) obj).f8709y != cpv.CLOSED) {
                        cqg cqgVar = ((cpw) obj).f8708x;
                        if (cqgVar != null) {
                            cqgVar.close();
                            ((cpw) obj).f8708x = null;
                        }
                        ((cpw) obj).f8687c.execute(new cmd((cpw) obj, 12));
                        ((cpw) obj).m5269k(cpv.NO_RECORDING);
                        return;
                    }
                    return;
                }
            case 6:
                ((nbe) ((nbe) ((nbe) cqg.f8825a.m17252c()).mo17283h(th)).mo17276G((char) 465)).mo17290o("Failed to capture video cover image.");
                return;
            case 7:
                throw new doc("Failed to open any of the available camera", kcl.CAMERA_ERROR_CODE_UNKNOWN, kmq.BACK, kmq.f36557a);
            case 8:
                throw new kmm();
            case 9:
            case 10:
                return;
            case 11:
                ((nbe) ((nbe) ezk.f21090a.m17252c()).mo17276G((char) 2067)).mo17290o("Failed to check Lens capabilities.");
                fya fyaVar = ((ezk) this.f6236a).f21093d;
                if (fyaVar != null) {
                    fyaVar.m8945a(hzw.m10973a().m10963a());
                    return;
                }
                return;
            case 12:
            case 13:
                return;
            case 14:
                ((nbe) ((nbe) ((nbe) gwy.f26657a.m17251b()).mo17283h(th)).mo17276G((char) 3319)).mo17290o("Failed to update thumbnail");
                return;
            case 15:
                ((nbe) ((nbe) ((nbe) hbv.f27171a.m17251b()).mo17283h(th)).mo17276G((char) 3423)).mo17290o("shouldStartUpdate threw an exception!");
                ((hbv) this.f6236a).f27190t.m15386c(4);
                ((hbv) this.f6236a).m10095c();
                return;
            case 16:
                nbh nbhVar = hbv.f27171a;
                ((hbv) this.f6236a).f27190t.m15386c(4);
                ((hbv) this.f6236a).f27181k.m10099b(-1, 9);
                return;
            case 17:
                return;
            case 18:
                ((nbe) ((nbe) hpm.f28881a.m17251b()).mo17276G((char) 3841)).mo17293r("CamcorderSnapshot is not available: %s", th);
                ((hpm) this.f6236a).f28886E.m10599e();
                hpm hpmVar = (hpm) this.f6236a;
                hpmVar.f28904W.m15535l(th, hpmVar.f28922g.mo5895d());
                return;
            case 19:
                ((C1132xu) this.f6236a).m19591a(false);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v20, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, jwn] */
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
        int i = 16;
        int i2 = 4;
        switch (this.f6237b) {
            case 0:
                ((cmp) this.f6236a).f6268i = ((nax) obj).m17236g();
                cmp cmpVar = (cmp) this.f6236a;
                if (cmpVar.f6268i) {
                    return;
                }
                cmpVar.f6263d.mo4004j();
                return;
            case 1:
                dhv dhvVar = ((cmp) this.f6236a).f6261b;
                dhx dhxVar = dib.f11240a;
                dhvVar.mo6178f();
                return;
            case 2:
                ((cmp) this.f6236a).f6270k.set(((Long) obj).longValue());
                return;
            case 3:
                fta ftaVar = (fta) obj;
                ctj ctjVar = ftaVar.f23538d.isEmpty() ? null : (ctj) ftaVar.f23538d.get(0);
                if (ctjVar != null) {
                    long jM5495a = ctjVar.m5495a();
                    ctjVar.m5495a();
                    if (jM5495a >= 3700000000L) {
                        csr csrVar = ((cpw) this.f6236a).f8688d.f8951f;
                        csrVar.f9378c.execute(new cqr(csrVar, 11));
                        return;
                    }
                }
                ((cpw) this.f6236a).f8688d.m5363d(false);
                return;
            case 4:
                this.f6236a.run();
                return;
            case 5:
                synchronized (((cpw) this.f6236a).f8689e) {
                    if (((cpw) this.f6236a).f8709y == cpv.CLOSED) {
                        return;
                    }
                    ((cpw) this.f6236a).f8699o.m10437h(hlf.RECORD_STARTED);
                    ((cpw) this.f6236a).f8697m.f9678m.run();
                    ((cpw) this.f6236a).m5269k(cpv.RECORDING);
                    if (((cpw) this.f6236a).m5270l()) {
                        ((cpw) this.f6236a).m5262d();
                    }
                    return;
                }
            case 6:
                ((cqg) this.f6236a).f8862n.set((Bitmap) obj);
                return;
            case 7:
                dbv dbvVar = (dbv) this.f6236a;
                dbvVar.m5911d((ddj) obj, dbvVar.f10449a.m5668p(), ((dbv) this.f6236a).f10449a.m5667o(), 3);
                return;
            case 8:
                dbv dbvVar2 = (dbv) this.f6236a;
                dbvVar2.m5911d((ddj) obj, dbvVar2.f10449a.m5666n(), ((dbv) this.f6236a).f10449a.m5665m(), 2);
                return;
            case 9:
                glx glxVar = (glx) obj;
                if (((dot) ((dpo) this.f6236a).f12222e.mo3831be()).equals(dot.SINGLE)) {
                    ((dpo) this.f6236a).m6553k();
                    return;
                }
                Object obj2 = this.f6236a;
                float f = glxVar.f25567a;
                dpo dpoVar = (dpo) obj2;
                dpoVar.f12229l = f;
                dpoVar.f12218a.m4109g(f);
                Object obj3 = this.f6236a;
                float f2 = glxVar.f25568b;
                dpo dpoVar2 = (dpo) obj3;
                dpoVar2.f12230m = f2;
                dpoVar2.f12218a.m4111i(f2);
                dpo dpoVar3 = (dpo) this.f6236a;
                dpoVar3.f12218a.m4110h(dpoVar3.f12229l);
                dpo dpoVar4 = (dpo) this.f6236a;
                dpoVar4.f12218a.m4112j(dpoVar4.f12230m);
                return;
            case 10:
                fmd fmdVar = (fmd) obj;
                Object obj4 = this.f6236a;
                fmdVar.getClass();
                evo evoVar = (evo) obj4;
                evoVar.f20433r = fmdVar;
                evoVar.f20432q.m13537d(fmdVar);
                evf evfVar = ((evo) this.f6236a).f20431p;
                jvd.m13538a();
                evfVar.f20382b.mo3717g();
                jvh.m13562j(fmdVar.mo8575i().f39914b, new cis(this, 14, (byte[]) (null == true ? 1 : 0)), ((evo) this.f6236a).f20422g);
                jvb jvbVar = fmdVar.f22541a;
                jwn jwnVarM8568b = fmdVar.m8568b();
                evo evoVar2 = (evo) this.f6236a;
                evf evfVar2 = evoVar2.f20431p;
                evfVar2.getClass();
                jvbVar.m13537d(jwnVarM8568b.mo3830a(new euz(evfVar2, i2), evoVar2.f20422g));
                jvbVar.m13537d(new eds(this, i, (byte[]) (null == true ? 1 : 0)));
                fmdVar.f22541a.m13537d(((evo) this.f6236a).f20425j.m3417a(fmdVar, fmdVar.f22543c, fmdVar.mo8575i().f39915c, jwr.m13637g(false), false, ((evo) this.f6236a).f20429n.mo16813g(), 1));
                evo evoVar3 = (evo) this.f6236a;
                evoVar3.f20422g.execute(new euj(evoVar3, i));
                idf idfVar = ((evo) this.f6236a).f20428m;
                fmdVar.f22543c.mo14558k();
                kmq kmqVar = kmq.f36557a;
                ikw ikwVar = ikw.UNINITIALIZED;
                idfVar.m11112c();
                return;
            case 11:
                hzw hzwVar = (hzw) obj;
                fya fyaVar = ((ezk) this.f6236a).f21093d;
                if (fyaVar != null) {
                    fyaVar.m8945a(hzwVar);
                    return;
                }
                return;
            case 12:
                ((fgd) this.f6236a).f21813f.m8381c((fgg) obj);
                return;
            case 13:
                fzd fzdVar = (fzd) obj;
                fzdVar.getClass();
                for (glk glkVar : ((fzh) this.f6236a).f23971a) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = glkVar.f25502c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            glkVar.f25501b.mo13942d("ImageSaverTrace does not match any valid strategy: ".concat(arrayList.toString()));
                            glkVar.f25501b.mo13942d("Trace = ".concat(fzdVar.toString()));
                            if (glkVar.f25503d == dja.RELEASE) {
                            }
                            ((jvd) glkVar.f25500a).execute(new fnx(new IllegalStateException("Image Saver Trace did not match any valid ImageSaverStrategy: ".concat(fzdVar.toString())), 20));
                        }
                        fzo fzoVarMo8968a = ((fzc) it.next()).mo8968a(fzdVar);
                        arrayList.add(fzoVarMo8968a);
                        if (fzoVarMo8968a.f23981b.isEmpty()) {
                            glkVar.f25501b.mo13944f("Valid image created:".concat(fzoVarMo8968a.f23980a));
                        }
                        break;
                        break;
                    }
                }
                return;
            case 14:
                ((gwy) this.f6236a).f26671g.mo6403e();
                ((gwy) this.f6236a).m9891W(CswIK.cgGgVrkkjr);
                return;
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    hbv hbvVar = (hbv) this.f6236a;
                    kxk.m14975U(((hbs) hbvVar.f27184n.get()).m10092a(), new cmo(hbvVar, 16), hbvVar.f27178h);
                    return;
                } else {
                    ((hbv) this.f6236a).f27190t.m15386c(4);
                    ((hbv) this.f6236a).m10095c();
                    return;
                }
            case 16:
                if (((Boolean) obj).booleanValue()) {
                    nbh nbhVar = hbv.f27171a;
                    Intent intent = new Intent(((hbv) this.f6236a).f27172b, (Class<?>) SidelineInstallerService.class);
                    intent.setAction(aJFPpVSaoDO.wPKBbPXlcsZSpM);
                    ((hbv) this.f6236a).f27172b.startForegroundService(intent);
                    return;
                }
                ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G(3425)).mo17292q("Not all cameras are available after waiting for %dms. Scheduling update later.", 60000L);
                ((hbv) this.f6236a).f27190t.m15386c(4);
                ((hbv) this.f6236a).f27181k.m10099b(0, 9);
                ((hbv) this.f6236a).m10094b();
                return;
            case 17:
                ((hdt) this.f6236a).f27382f = ((Boolean) obj).booleanValue();
                return;
            case 18:
                cti ctiVar = (cti) obj;
                File file = ctiVar.f9439b;
                ((hpm) this.f6236a).f28921f.m5619b(ctiVar);
                ((hpm) this.f6236a).f28886E.m10599e();
                hpm hpmVar = (hpm) this.f6236a;
                hpmVar.f28904W.m15536m(ctiVar, hpmVar.f28922g.mo5895d());
                return;
            case 19:
                Boolean bool = (Boolean) obj;
                ((C1132xu) this.f6236a).m19591a(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
                return;
            default:
                lrh lrhVar = (lrh) obj;
                if (lrhVar == lrh.DISABLED || lrhVar == lrh.NEEDS_SIGN_IN || lrhVar == lrh.ACCESS_DENIED || lrhVar == lrh.UNSUPPORTED_FOR_ALL_USERS) {
                    return;
                }
                jvd jvdVar = ((ijv) this.f6236a).f31256f;
                final Object[] objArr = null == true ? 1 : 0;
                jvdVar.execute(new Runnable(objArr) { // from class: ijt
                    @Override // java.lang.Runnable
                    public final void run() {
                        cmo cmoVar = this.f31249a;
                        ((ijv) cmoVar.f6236a).f31257g.mo13961e("MarsWirer#mainThread");
                        ijv ijvVar = (ijv) cmoVar.f6236a;
                        ijvVar.f31260j = (MarsSwitch) ((jfs) ((djm) ijvVar.f31254d.get()).f11789c).m13100f(C0100R.id.mars_switch);
                        if (((ijv) cmoVar.f6236a).f31253c.mo6184l(dib.f11361co)) {
                            ijv ijvVar2 = (ijv) cmoVar.f6236a;
                            iak iakVar = ijvVar2.f31252b;
                            MarsSwitch marsSwitch = ijvVar2.f31260j;
                            Context context = ijvVar2.f31251a;
                            gyx gyxVar = gyx.MEDIA_STORE;
                            String string = context.getString(C0100R.string.default_title);
                            String string2 = context.getString(C0100R.string.default_desc);
                            idv idvVar = new idv(mws.m17098m(new idw(gyxVar, string, C0100R.drawable.normal_mode_thumb, string2, string2), new idw(gyx.MARS_STORE, context.getString(C0100R.string.mars_title), C0100R.drawable.quantum_gm_ic_lock_vd_theme_24, context.getString(C0100R.string.mars_desc), context.getString(C0100R.string.mars_not_available_reason_account))), gyx.MEDIA_STORE);
                            ijv ijvVar3 = (ijv) cmoVar.f6236a;
                            htf htfVar = ijvVar3.f31259i;
                            View view = (View) ((iig) ijvVar3.f31255e).get().f31070g.getParent();
                            iakVar.f30158k = marsSwitch;
                            iakVar.f30160m = new idu(iakVar.f30149b, view, idvVar);
                            iakVar.f30160m.m11137c(C0100R.string.mars_menu_title);
                            iakVar.f30160m.f30516k = iakVar.f30149b.getResources().getDimensionPixelSize(C0100R.dimen.mars_anchor_margin);
                            iakVar.f30160m.m11138d(new flr(iakVar, 19));
                            idu iduVar = iakVar.f30160m;
                            if (iduVar != null) {
                                iduVar.f30509d = new iah(iakVar, 0);
                                iduVar.f30517l = new AmbientModeSupport.AmbientController(iakVar);
                                iduVar.m11139e(iakVar.f30157j ? gyx.MARS_STORE : gyx.MEDIA_STORE);
                                iakVar.f30157j = false;
                            }
                            marsSwitch.setVisibility(0);
                            iakVar.m10990g(htfVar);
                        } else {
                            ijv ijvVar4 = (ijv) cmoVar.f6236a;
                            iak iakVar2 = ijvVar4.f31252b;
                            MarsSwitch marsSwitch2 = ijvVar4.f31260j;
                            idq idqVar = new idq(ijvVar4.f31251a);
                            htf htfVar2 = ((ijv) cmoVar.f6236a).f31259i;
                            iakVar2.f30163p = idqVar;
                            iakVar2.f30158k = marsSwitch2;
                            iakVar2.f30159l = marsSwitch2.f7048a;
                            iakVar2.f30159l.m4408d(C0100R.string.mars_menu_title, idqVar);
                            ImageButton imageButton = iakVar2.f30159l.f7094b;
                            imageButton.setVisibility(0);
                            imageButton.setOnClickListener(new flr(iakVar2, 20));
                            iakVar2.f30163p.m11125a(new iag(iakVar2, 0), false);
                            iakVar2.f30163p.m11127c(iakVar2.f30157j ? gyx.MARS_STORE : gyx.MEDIA_STORE);
                            iakVar2.f30157j = false;
                            hre hreVar = new hre(iakVar2, 2);
                            iakVar2.f30156i.mo9121g(hreVar);
                            iakVar2.f30162o.m13537d(new gto(iakVar2, hreVar, 18));
                            iakVar2.f30162o.m13537d(iakVar2.f30155h.mo11233e(new iaj(iakVar2)));
                            marsSwitch2.setVisibility(0);
                            iakVar2.m10990g(htfVar2);
                        }
                        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((jfs) ((djm) ((ijv) cmoVar.f6236a).f31254d.get()).f11789c).m13100f(C0100R.id.activity_root_view);
                        ijv ijvVar5 = (ijv) cmoVar.f6236a;
                        MarsSwitch marsSwitch3 = ijvVar5.f31260j;
                        iak iakVar3 = ijvVar5.f31252b;
                        mainActivityLayout.f7254d = marsSwitch3;
                        mainActivityLayout.f7255e = iakVar3;
                        mainActivityLayout.m4470k(mainActivityLayout.m4461a().f30073i, mainActivityLayout.m4461a().f30071g);
                        ijv ijvVar6 = (ijv) cmoVar.f6236a;
                        MarsSwitch marsSwitch4 = ijvVar6.f31260j;
                        marsSwitch4.f7049b = ((iig) ijvVar6.f31255e).get().f31070g;
                        marsSwitch4.m4373a();
                        iak iakVar4 = ((ijv) cmoVar.f6236a).f31252b;
                        if (!((Boolean) iakVar4.f30152e.mo10031c(gzy.f27037au)).booleanValue() && ((Integer) iakVar4.f30152e.mo10031c(gzy.f27038av)).intValue() < 3) {
                            iakVar4.f30151d.execute(new huh(iakVar4, 17));
                        }
                        ijv ijvVar7 = (ijv) cmoVar.f6236a;
                        ijvVar7.f31258h.m8097e(ijvVar7.f31252b);
                        mainActivityLayout.m4477s(new iju(cmoVar, null));
                        ((ijv) cmoVar.f6236a).f31257g.mo13962f();
                    }
                });
                return;
        }
    }
}
