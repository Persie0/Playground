package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gki implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f25279a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleFlashHdrPlusImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final kfk f25280b;

    /* JADX INFO: renamed from: c */
    private final gmo f25281c;

    /* JADX INFO: renamed from: d */
    private final jwn f25282d;

    /* JADX INFO: renamed from: e */
    private final ghg f25283e;

    /* JADX INFO: renamed from: f */
    private final gks f25284f;

    /* JADX INFO: renamed from: g */
    private final kbz f25285g;

    /* JADX INFO: renamed from: h */
    private final kge f25286h;

    /* JADX INFO: renamed from: i */
    private final dhv f25287i;

    /* JADX INFO: renamed from: j */
    private final jvb f25288j;

    public gki(kfk kfkVar, gmo gmoVar, jwn jwnVar, ghg ghgVar, kbz kbzVar, gks gksVar, dhv dhvVar, jvb jvbVar) {
        this.f25280b = kfkVar;
        this.f25281c = gmoVar;
        this.f25282d = jwnVar;
        this.f25283e = ghgVar;
        this.f25285g = kbzVar;
        this.f25284f = gksVar;
        this.f25287i = dhvVar;
        this.f25288j = jvbVar;
        kgd kgdVarM14187a = kge.m14187a();
        kgdVarM14187a.m14183b(3);
        kgdVarM14187a.m14184c(4);
        kgdVarM14187a.m14186e(1);
        kgdVarM14187a.m14185d(true);
        this.f25286h = kgdVarM14187a.m14182a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25282d;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8931e());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x011d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0141  */
    /* JADX WARN: Type inference failed for: r12v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gav, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws Throwable {
        ?? r12;
        ?? r13;
        Object objA = this.f25281c.mo6051a();
        this.f25285g.mo13961e("pckFlashHdr#sessionAnd3A");
        boolean z = false;
        try {
            try {
                kfo kfoVarMo14117d = this.f25280b.mo14117d();
                try {
                    fuw fuwVarM9251b = this.f25283e.m9251b(kfoVarMo14117d, this.f25286h);
                    try {
                        ((fua) glkVar.f25503d).f23579g.mo3415bf(false);
                        this.f25285g.mo13963g("pckFlashHdr#submitCaptureRequest");
                        kfj kfjVarMo14154c = kfoVarMo14117d.mo14154c();
                        kfjVarMo14154c.mo14110b((kho) objA);
                        gmz.m9542j(this.f25287i, kfjVarMo14154c);
                        khl khlVarMo14157f = kfoVarMo14117d.mo14157f(kfjVarMo14154c.mo14109a());
                        glkVar.f25501b.mo9010c().mo9005h();
                        gbhVar.close();
                        fuwVarM9251b.close();
                        kfoVarMo14117d.close();
                        this.f25285g.mo13963g("pckFlashHdr#getFrame");
                        key keyVarM14267a = khlVarMo14157f.m14267a((kho) objA);
                        khlVarMo14157f.close();
                        if (keyVarM14267a != null) {
                            kfv.m14171t(keyVarM14267a);
                            this.f25285g.mo13963g("pckFlashHdr#process");
                            this.f25284f.m9383i(mws.m17097l(keyVarM14267a), gkh.f25274a, glkVar);
                            z = true;
                        }
                        try {
                            fuwVarM9251b.close();
                            kfoVarMo14117d.close();
                            if (!z) {
                                ((nbe) ((nbe) f25279a.m17251b()).mo17276G((char) 2830)).mo17290o("Error capturing image.");
                                glkVar.f25501b.mo9013f();
                                ?? r14 = glkVar.f25502c;
                                if (this.f25288j.mo8995b()) {
                                    r14.mo9917w(new doq((Throwable) null));
                                } else {
                                    r14.mo9870B(ihd.f30944a, new dos("Image capture failed. Aborting capture!"));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            try {
                                kfoVarMo14117d.close();
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fuwVarM9251b.close();
                        } catch (Throwable th4) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (dos e) {
                e = e;
                if (0 == 0) {
                    ((nbe) ((nbe) f25279a.m17251b()).mo17276G((char) 2831)).mo17290o("Error capturing image.");
                    glkVar.f25501b.mo9013f();
                    r13 = glkVar.f25502c;
                    if (this.f25288j.mo8995b()) {
                        r13.mo9917w(new doq(e));
                    } else {
                        r13.mo9870B(ihd.f30944a, e);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                if (0 == 0) {
                    ((nbe) ((nbe) f25279a.m17251b()).mo17276G((char) 2832)).mo17290o("Error capturing image.");
                    glkVar.f25501b.mo9013f();
                    r12 = glkVar.f25502c;
                    if (this.f25288j.mo8995b()) {
                        r12.mo9917w(new doq((Throwable) null));
                    } else {
                        r12.mo9870B(ihd.f30944a, new dos("Image capture failed. Aborting capture!"));
                    }
                }
                gbhVar.close();
                this.f25285g.mo13962f();
                throw th;
            }
        } catch (dos e2) {
            e = e2;
            if (0 == 0) {
                ((nbe) ((nbe) f25279a.m17251b()).mo17276G((char) 2831)).mo17290o("Error capturing image.");
                glkVar.f25501b.mo9013f();
                r13 = glkVar.f25502c;
                if (this.f25288j.mo8995b()) {
                    r13.mo9917w(new doq(e));
                } else {
                    r13.mo9870B(ihd.f30944a, e);
                }
            }
        } catch (Throwable th7) {
            th = th7;
            if (0 == 0) {
                ((nbe) ((nbe) f25279a.m17251b()).mo17276G((char) 2832)).mo17290o("Error capturing image.");
                glkVar.f25501b.mo9013f();
                r12 = glkVar.f25502c;
                if (this.f25288j.mo8995b()) {
                    r12.mo9917w(new doq((Throwable) null));
                } else {
                    r12.mo9870B(ihd.f30944a, new dos("Image capture failed. Aborting capture!"));
                }
            }
            gbhVar.close();
            this.f25285g.mo13962f();
            throw th;
        }
        gbhVar.close();
        this.f25285g.mo13962f();
    }
}
