package p000;

import android.os.SystemClock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ffy implements fle {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ftn f21771a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ fle f21772b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ fgg f21773c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kyq f21774d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ boolean f21775e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ fgh f21776f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ljf f21777g;

    public ffy(fgh fghVar, ftn ftnVar, fle fleVar, ljf ljfVar, fgg fggVar, kyq kyqVar, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f21776f = fghVar;
        this.f21771a = ftnVar;
        this.f21772b = fleVar;
        this.f21777g = ljfVar;
        this.f21773c = fggVar;
        this.f21774d = kyqVar;
        this.f21775e = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [fmy, java.lang.Object] */
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
    @Override // p000.fle
    /* JADX INFO: renamed from: a */
    public final void mo8368a(fkv fkvVar) {
        this.f21771a.mo8718a();
        this.f21772b.mo8368a(fkvVar);
        this.f21774d.mo8412c();
        this.f21777g.m15532h();
        this.f21773c.f21839s = mrm.m16829i(fkvVar);
        nbh nbhVar = fgh.f21843a;
        if (this.f21775e) {
            if (this.f21773c.f21836p.mo16813g()) {
                this.f21776f.f21872x.m9425b(((bkn) this.f21773c.f21836p.mo16809c()).f3651a);
            } else {
                ((nbe) ((nbe) fgh.f21843a.m17252c()).mo17276G((char) 2182)).mo17290o("Didn't take second shot since UI resources are missing");
            }
        }
        this.f21773c.f21836p = mqu.f41450a;
    }

    @Override // p000.fle
    /* JADX INFO: renamed from: b */
    public final void mo8369b(long j, fli fliVar) {
        this.f21771a.mo8719b(j);
        this.f21772b.mo8369b(j, fliVar);
        this.f21777g.m15532h();
        this.f21773c.f21837q = mrm.m16829i(Long.valueOf(SystemClock.elapsedRealtime()));
        fgg fggVar = this.f21773c;
        if (fggVar.f21835o) {
            fgh fghVar = this.f21776f;
            lku.m15613H(true);
            fghVar.f21863o.postDelayed(new ewo(fghVar, fggVar, 9), fggVar.f21821a, 15000L);
            fgh.m8374d(fggVar.f21827g, fggVar.f21821a, fghVar.f21863o);
        } else {
            fggVar.f21836p = mqu.f41450a;
        }
        nbh nbhVar = fgh.f21843a;
    }
}
