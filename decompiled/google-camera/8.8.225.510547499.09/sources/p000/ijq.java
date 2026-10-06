package p000;

import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.EvCompView;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijq implements ikg, fbp, fbl {

    /* JADX INFO: renamed from: a */
    public final dox f31213a;

    /* JADX INFO: renamed from: b */
    public final dhv f31214b;

    /* JADX INFO: renamed from: c */
    public final idg f31215c;

    /* JADX INFO: renamed from: d */
    public final drj f31216d;

    /* JADX INFO: renamed from: e */
    private final jvd f31217e;

    /* JADX INFO: renamed from: f */
    private final jwn f31218f;

    /* JADX INFO: renamed from: g */
    private final mrm f31219g;

    /* JADX INFO: renamed from: h */
    private final jww f31220h;

    /* JADX INFO: renamed from: i */
    private final oju f31221i;

    /* JADX INFO: renamed from: j */
    private final fan f31222j;

    /* JADX INFO: renamed from: k */
    private final cdu f31223k;

    /* JADX INFO: renamed from: l */
    private final djm f31224l;

    /* JADX INFO: renamed from: m */
    private final bkn f31225m;

    public ijq(dox doxVar, oju ojuVar, drj drjVar, bkn bknVar, djm djmVar, cdu cduVar, jvd jvdVar, dhv dhvVar, jww jwwVar, jww jwwVar2, gdc gdcVar, mrm mrmVar, idg idgVar, jwn jwnVar, fan fanVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f31213a = doxVar;
        this.f31221i = ojuVar;
        this.f31216d = drjVar;
        this.f31225m = bknVar;
        this.f31224l = djmVar;
        this.f31223k = cduVar;
        this.f31217e = jvdVar;
        this.f31214b = dhvVar;
        this.f31220h = jwwVar;
        this.f31219g = mrmVar;
        this.f31215c = idgVar;
        this.f31222j = fanVar;
        this.f31218f = jwr.m13640j(jwr.m13632b(gdcVar, jwwVar2, jwnVar), new hgv(dhvVar, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, jww] */
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
    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        EvCompView evCompView = (EvCompView) ((jfs) ((djm) this.f31221i.get()).f11789c).m13100f(C0100R.id.evcomp);
        dox doxVar = this.f31213a;
        jww jwwVar = this.f31220h;
        drj drjVar = this.f31216d;
        ?? r4 = drjVar.f12397c;
        ?? r5 = drjVar.f12396b;
        ?? r6 = drjVar.f12395a;
        Object obj = this.f31225m.f3651a;
        doxVar.mo6484t(evCompView, jwwVar, r4, r5, r6, this.f31224l, this.f31219g, this.f31215c);
        MainActivityLayout mainActivityLayout = (MainActivityLayout) ((jfs) ((djm) this.f31221i.get()).f11789c).m13100f(C0100R.id.activity_root_view);
        mainActivityLayout.f7262l = mrm.m16829i(this.f31213a);
        mainActivityLayout.m4468i(mainActivityLayout.m4461a().f30073i, mainActivityLayout.m4461a().f30071g, (ikw) mainActivityLayout.f7265o.mo3831be());
        this.f31223k.m3529i().m13537d(this.f31224l.f11788b.mo3830a(new ijp(this, 0), not.INSTANCE));
        this.f31223k.m3529i().m13537d(this.f31216d.f12399e.mo3830a(new hmv(this, 20), this.f31217e));
        this.f31223k.m3529i().m13537d(this.f31224l.f11789c.mo3830a(new hmv(this, 19), not.INSTANCE));
        this.f31223k.m3529i().m13537d(this.f31218f.mo3830a(new ijp(this, 1), this.f31217e));
        this.f31222j.m8097e(this);
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        ((glz) ((mrq) this.f31219g).f41482a).mo9468l(this.f31223k, this.f31218f);
    }
}
