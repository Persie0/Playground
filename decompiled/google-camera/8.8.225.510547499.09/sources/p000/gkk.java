package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gkk implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f25297a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckSingleHdrPlusImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final kfk f25298b;

    /* JADX INFO: renamed from: c */
    private final jwn f25299c;

    /* JADX INFO: renamed from: d */
    private final gof f25300d;

    /* JADX INFO: renamed from: e */
    private final gks f25301e;

    /* JADX INFO: renamed from: f */
    private final kbz f25302f;

    /* JADX INFO: renamed from: g */
    private final fwo f25303g;

    /* JADX INFO: renamed from: h */
    private final gir f25304h;

    /* JADX INFO: renamed from: i */
    private final jvb f25305i;

    /* JADX INFO: renamed from: j */
    private final gva f25306j;

    /* JADX INFO: renamed from: k */
    private final bko f25307k;

    public gkk(kfk kfkVar, jwn jwnVar, gof gofVar, kbz kbzVar, gks gksVar, fwo fwoVar, gir girVar, gva gvaVar, jvb jvbVar, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25298b = kfkVar;
        this.f25299c = jwnVar;
        this.f25300d = gofVar;
        this.f25302f = kbzVar;
        this.f25301e = gksVar;
        this.f25303g = fwoVar;
        this.f25304h = girVar;
        this.f25306j = gvaVar;
        this.f25305i = jvbVar;
        this.f25307k = bkoVar;
    }

    /* JADX INFO: renamed from: d */
    private final boolean m9366d(key keyVar) {
        kfv.m14172u(keyVar);
        kfd kfdVarMo7041b = keyVar.mo7041b();
        long j = kfdVarMo7041b == null ? -1L : kfdVarMo7041b.f35811b;
        kpw kpwVarM9496e = this.f25306j.m9784a(keyVar).m9496e();
        if (kpwVarM9496e != null) {
            try {
                if (!this.f25307k.m2625s(j)) {
                    kpwVarM9496e.close();
                    return true;
                }
            } catch (Throwable th) {
                if (kpwVarM9496e != null) {
                    try {
                        kpwVarM9496e.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e) {
                        }
                    }
                }
                throw th;
            }
        }
        keyVar.close();
        if (kpwVarM9496e != null) {
            kpwVarM9496e.close();
        }
        return false;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25299c;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8931e());
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0140  */
    /* JADX WARN: Code duplicated, block: B:50:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [gyh] */
    /* JADX WARN: Type inference failed for: r10v6, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [gir] */
    /* JADX WARN: Type inference failed for: r2v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [gyh, java.lang.Object] */
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
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) throws Throwable {
        ?? r10;
        dos dosVar;
        doq doqVar;
        ?? r11;
        key keyVarMo14130q;
        this.f25302f.mo13961e("pckSingleHdr#acquiringFrame");
        goe goeVarMo9303a = this.f25300d.mo9303a();
        this.f25304h.m9296b(glkVar.f25502c);
        Throwable e = null;
        try {
            gom gomVar = new gom(mxk.m17136H(new got(CaptureResult.SENSOR_TIMESTAMP, this.f25303g.m8903j() - 1000000000)));
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= 3) {
                    keyVarMo14130q = null;
                    break;
                }
                i++;
                keyVarMo14130q = this.f25300d.mo9307e();
                if (keyVarMo14130q != null) {
                    glkVar.f25502c.mo9871C(true);
                    if (!gomVar.mo7269a(keyVarMo14130q)) {
                        keyVarMo14130q.mo7041b();
                        keyVarMo14130q.close();
                        keyVarMo14130q = null;
                        break;
                    } else if (m9366d(keyVarMo14130q)) {
                        break;
                    }
                }
            }
            goeVarMo9303a.mo9302a();
            if (keyVarMo14130q == null) {
                ((nbe) ((nbe) f25297a.m17252c()).mo17276G(2842)).mo17293r("ZSL frame not available, submitting request with available capacity %s.", this.f25300d.mo9316n().m14271a().mo3831be());
                gof gofVar = this.f25300d;
                keyVarMo14130q = null;
                int i2 = 0;
                while (i2 < 3) {
                    kho khoVarMo9316n = gofVar.mo9316n();
                    i2++;
                    mxk mxkVar = khoVarMo9316n.f36067c;
                    khoVarMo9316n.m14271a().mo3831be();
                    keyVarMo14130q = this.f25298b.mo14130q(khoVarMo9316n);
                    if (m9366d(keyVarMo14130q)) {
                        break;
                    }
                }
                keyVarMo14130q.getClass();
            }
            kfv.m14171t(keyVarMo14130q);
            if (keyVarMo14130q.mo7041b() == null || !keyVarMo14130q.mo7047h()) {
                ((nbe) ((nbe) f25297a.m17252c()).mo17276G(2839)).mo17290o("Frame aborted.");
            } else {
                mws mwsVarM17097l = mws.m17097l(keyVarMo14130q);
                glkVar.f25501b.mo9012e().mo9005h();
                this.f25302f.mo13963g("pckSingleHdr#process");
                this.f25301e.m9383i(mwsVarM17097l, gbhVar, glkVar);
                z = true;
            }
            gbhVar.close();
            goeVarMo9303a.mo9302a();
            if (z) {
                return;
            }
            glkVar.f25501b.mo9013f();
            Object obj = glkVar.f25502c;
            doqVar = new doq((Throwable) null);
            r11 = obj;
            r11.mo9917w(doqVar);
        } catch (dos e2) {
            gbhVar.close();
            goeVarMo9303a.mo9302a();
            glkVar.f25501b.mo9013f();
            ?? r12 = glkVar.f25502c;
            if (!this.f25305i.mo8995b()) {
                r12.mo9870B(ihd.f30944a, new dos(e2));
            } else {
                doqVar = new doq(e2);
                r11 = r12;
            }
        } catch (InterruptedException e3) {
            e = e3;
            try {
                throw e;
            } catch (Throwable th) {
                th = th;
                gbhVar.close();
                goeVarMo9303a.mo9302a();
                glkVar.f25501b.mo9013f();
                r10 = glkVar.f25502c;
                if (this.f25305i.mo8995b()) {
                    r10.mo9917w(new doq(e));
                } else {
                    if (e != null) {
                        dosVar = new dos(e);
                    } else {
                        dosVar = new dos("Image capture failed. Aborting capture!");
                    }
                    r10.mo9870B(ihd.f30944a, dosVar);
                }
                throw th;
            }
        } catch (RuntimeException e4) {
            e = e4;
            throw e;
        } catch (Throwable th2) {
            th = th2;
            gbhVar.close();
            goeVarMo9303a.mo9302a();
            glkVar.f25501b.mo9013f();
            r10 = glkVar.f25502c;
            if (this.f25305i.mo8995b()) {
                if (e != null) {
                    dosVar = new dos(e);
                } else {
                    dosVar = new dos("Image capture failed. Aborting capture!");
                }
                r10.mo9870B(ihd.f30944a, dosVar);
            } else {
                r10.mo9917w(new doq(e));
            }
            throw th;
        }
    }
}
