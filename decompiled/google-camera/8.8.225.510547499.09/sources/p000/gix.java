package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gix implements gbi {

    /* JADX INFO: renamed from: a */
    public static final nbh f24930a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckConvergedCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final kfk f24931b;

    /* JADX INFO: renamed from: c */
    private final kgg f24932c;

    /* JADX INFO: renamed from: d */
    private final fzu f24933d;

    /* JADX INFO: renamed from: e */
    private final int f24934e;

    /* JADX INFO: renamed from: f */
    private final gib f24935f;

    /* JADX INFO: renamed from: g */
    private final ghg f24936g;

    /* JADX INFO: renamed from: h */
    private final kge f24937h;

    /* JADX INFO: renamed from: i */
    private final kbz f24938i;

    /* JADX INFO: renamed from: j */
    private final jwn f24939j;

    /* JADX INFO: renamed from: k */
    private final kho f24940k;

    public gix(kfk kfkVar, kgg kggVar, kho khoVar, fzu fzuVar, int i, gib gibVar, ghg ghgVar, kge kgeVar, kbz kbzVar) {
        this.f24931b = kfkVar;
        this.f24932c = kggVar;
        this.f24940k = khoVar;
        this.f24933d = fzuVar;
        this.f24934e = i;
        this.f24935f = gibVar;
        this.f24936g = ghgVar;
        this.f24937h = kgeVar;
        this.f24938i = kbzVar;
        this.f24939j = jwr.m13635e(khoVar.m14271a(), 1);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f24939j;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8931e());
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws kec {
        fxn fxnVar;
        if (this.f24931b == null || this.f24940k == null) {
            gbhVar.close();
            throw new kec("FrameServer is not available");
        }
        this.f24938i.mo13961e("PckConvergedCaptureCommand");
        this.f24938i.mo13961e(hIAHJKEnGsNbz.hbNu);
        try {
            kfo kfoVarMo14117d = this.f24931b.mo14117d();
            try {
                gia giaVarMo9273a = this.f24935f.mo9273a(kfoVarMo14117d);
                try {
                    fuw fuwVarM9251b = this.f24936g.m9251b(kfoVarMo14117d, this.f24937h);
                    try {
                        kfj kfjVarMo14154c = kfoVarMo14117d.mo14154c();
                        kfjVarMo14154c.mo14110b(this.f24940k);
                        ((fua) glkVar.f25503d).f23579g.mo3415bf(Boolean.valueOf(this.f24935f instanceof gio));
                        this.f24938i.mo13963g("AcquireImageSaverSession");
                        fzt fztVarMo3603a = this.f24933d.mo3603a(glkVar);
                        try {
                            this.f24938i.mo13963g("BuildingFrameRequests");
                            ArrayList arrayList = new ArrayList();
                            int iMax = Math.max(1, Math.min(this.f24934e, ((Integer) this.f24940k.m14271a().mo3831be()).intValue()));
                            for (int i = 0; i < iMax; i++) {
                                kgw kgwVarM14226g = kgw.m14226g((kgw) kfjVarMo14154c);
                                if (i <= 0) {
                                    kgwVarM14226g.mo14114f(new giv(glkVar, null, null));
                                }
                                arrayList.add(kgwVarM14226g.mo14109a());
                            }
                            this.f24938i.mo13963g("SubmittingFrameRequests");
                            arrayList.size();
                            List<khl> listMo14156e = kfoVarMo14117d.mo14156e(arrayList);
                            lku.m15613H(!listMo14156e.isEmpty());
                            giaVarMo9273a.close();
                            fuwVarM9251b.close();
                            kfoVarMo14117d.close();
                            this.f24938i.mo13963g("RetrievingImages");
                            listMo14156e.size();
                            for (khl khlVar : listMo14156e) {
                                this.f24938i.mo13961e("GettingImageFromFrame");
                                key keyVarM14267a = khlVar.m14267a(this.f24940k);
                                if (keyVarM14267a != null) {
                                    kgg kggVar = this.f24932c;
                                    nqf nqfVarM17621g = nqf.m17621g();
                                    keyVarM14267a.mo7050k(new giw(keyVarM14267a, nqfVarM17621g));
                                    try {
                                        try {
                                            kfv.m14172u(keyVarM14267a);
                                            kpw kpwVarMo7043d = keyVarM14267a.mo7043d(kggVar);
                                            if (kpwVarMo7043d == null) {
                                                ((nbe) ((nbe) f24930a.m17252c()).mo17276G(2690)).mo17301z("Failed to get image from %s for frame %s", kggVar, keyVarM14267a);
                                                keyVarM14267a.close();
                                                fxnVar = null;
                                            } else {
                                                fxnVar = new fxn(kpwVarMo7043d, nqfVarM17621g);
                                                keyVarM14267a.close();
                                            }
                                        } catch (Throwable th) {
                                            keyVarM14267a.close();
                                            throw th;
                                        }
                                    } catch (InterruptedException e) {
                                        Thread.currentThread().interrupt();
                                    }
                                    if (fxnVar != null) {
                                        nps npsVarM8924k = fxnVar.m8924k();
                                        npsVarM8924k.getClass();
                                        this.f24938i.mo13963g("AddingImageToImageSaver");
                                        fxnVar.mo7248d();
                                        fztVarMo3603a.mo3602a(fxnVar, npsVarM8924k);
                                    }
                                    keyVarM14267a.close();
                                }
                                khlVar.close();
                                this.f24938i.mo13962f();
                            }
                            gbhVar.close();
                            if (fztVarMo3603a != null) {
                                fztVarMo3603a.close();
                            }
                            fuwVarM9251b.close();
                            if (giaVarMo9273a != null) {
                                giaVarMo9273a.close();
                            }
                            kfoVarMo14117d.close();
                            this.f24938i.mo13962f();
                            this.f24938i.mo13962f();
                            this.f24935f.mo9274b();
                            gbhVar.close();
                        } catch (Throwable th2) {
                            if (fztVarMo3603a != null) {
                                try {
                                    fztVarMo3603a.close();
                                } catch (Throwable th3) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                }
                            }
                            throw th2;
                        }
                    } catch (Throwable th4) {
                        try {
                            fuwVarM9251b.close();
                        } catch (Throwable th5) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    if (giaVarMo9273a != null) {
                        try {
                            giaVarMo9273a.close();
                        } catch (Throwable th7) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                        }
                    }
                    throw th6;
                }
            } catch (Throwable th8) {
                try {
                    kfoVarMo14117d.close();
                } catch (Throwable th9) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                }
                throw th8;
            }
        } catch (Throwable th10) {
            this.f24938i.mo13962f();
            this.f24938i.mo13962f();
            this.f24935f.mo9274b();
            gbhVar.close();
            throw th10;
        }
    }
}
