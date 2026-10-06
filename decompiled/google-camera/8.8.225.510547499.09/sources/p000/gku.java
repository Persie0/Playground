package p000;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gku implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f25379a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/commands/PckZslImageCaptureCommandBase");

    /* JADX INFO: renamed from: b */
    private final gof f25380b;

    /* JADX INFO: renamed from: c */
    private final gbi f25381c;

    /* JADX INFO: renamed from: d */
    private final Set f25382d;

    /* JADX INFO: renamed from: e */
    private final kbz f25383e;

    /* JADX INFO: renamed from: f */
    private final gir f25384f;

    public gku(gof gofVar, gbi gbiVar, Set set, kbz kbzVar, gir girVar) {
        this.f25380b = gofVar;
        this.f25381c = gbiVar;
        this.f25382d = set;
        this.f25383e = kbzVar;
        this.f25384f = girVar;
    }

    /* JADX INFO: renamed from: e */
    protected static final void m9387e(List list) {
        nba it = ((mws) list).iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gav, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    private static final void m9388f(gbi gbiVar, List list, gbh gbhVar, glk glkVar) {
        m9387e(list);
        glkVar.f25502c.mo9905k().mo10404f();
        glkVar.f25501b.mo9015h();
        gbiVar.mo7628c(gbhVar, glkVar);
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f25381c.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return jwr.m13637g(fxo.m8929c(mkv.m16499G(this.f25382d)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [gyh, java.lang.Object] */
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
    public void mo7628c(gbh gbhVar, glk glkVar) {
        gbi gbiVar;
        this.f25383e.mo13961e("pckZsl#lockBuffer");
        goe goeVarMo9303a = this.f25380b.mo9303a();
        this.f25380b.mo9314l("Initial");
        try {
            this.f25383e.mo13963g("pckZsl#getFrames");
            List listMo9312j = this.f25380b.mo9312j();
            goeVarMo9303a.mo9302a();
            this.f25383e.mo13962f();
            boolean z = true;
            glkVar.f25502c.mo9871C(true);
            if (((mzr) listMo9312j).f41859c <= 0) {
                ((nbe) ((nbe) f25379a.m17251b()).mo17276G(2887)).mo17290o("Can't execute command, not enough ZSL images");
                m9388f(this.f25381c, listMo9312j, gbhVar, glkVar);
            } else {
                this.f25383e.mo13961e("pckHdrZsl#captureIndicator");
                if (glkVar.f25501b.mo9011d() == null) {
                    glkVar.f25501b.mo9010c().mo9005h();
                }
                this.f25383e.mo13963g("pckZsl#afMetadata");
                this.f25384f.m9296b(glkVar.f25502c);
                this.f25383e.mo13963g("pckZsl#filterFrames");
                mws mwsVarMo9310h = this.f25380b.mo9310h(listMo9312j);
                this.f25383e.mo13962f();
                try {
                    try {
                        this.f25383e.mo13961e("pckZsl#processZslFrames");
                        boolean zMo9370d = mo9370d(mwsVarMo9310h, gbhVar, glkVar);
                        this.f25383e.mo13962f();
                        this.f25380b.mo9314l("Final");
                        if (!zMo9370d) {
                            gbiVar = this.f25381c;
                            m9388f(gbiVar, mwsVarMo9310h, gbhVar, glkVar);
                        }
                    } catch (Throwable th) {
                        this.f25383e.mo13962f();
                        this.f25380b.mo9314l("Final");
                        m9388f(this.f25381c, mwsVarMo9310h, gbhVar, glkVar);
                        throw th;
                    }
                } catch (dos e) {
                    if (e instanceof dop) {
                        ((nbe) ((nbe) ((nbe) f25379a.m17251b()).mo17283h(e)).mo17276G(2886)).mo17290o("Aborted main ZSL shot, not executing fallback");
                        z = false;
                    } else {
                        ((nbe) ((nbe) ((nbe) f25379a.m17251b()).mo17283h(e)).mo17276G(2885)).mo17290o("Error executing main ZSL command, executing fallback");
                    }
                    this.f25383e.mo13962f();
                    this.f25380b.mo9314l("Final");
                    if (z) {
                        gbiVar = this.f25381c;
                        m9388f(gbiVar, mwsVarMo9310h, gbhVar, glkVar);
                    } else {
                        glkVar.f25501b.mo9013f();
                        glkVar.f25502c.mo9870B(ihd.f30944a, e);
                    }
                }
            }
            goeVarMo9303a.mo9302a();
        } catch (Throwable th2) {
            goeVarMo9303a.mo9302a();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    protected abstract boolean mo9370d(List list, gbh gbhVar, glk glkVar);
}
