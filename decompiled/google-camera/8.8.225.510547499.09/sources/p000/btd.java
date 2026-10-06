package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class btd implements bqz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ bte f4418a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C1058va f4419b;

    public btd(bte bteVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f4418a = bteVar;
        this.f4419b = c1058va;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [bqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bra, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bra, java.lang.Object] */
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
    @Override // p000.bqz
    /* JADX INFO: renamed from: b */
    public final void mo2945b(Object obj) {
        if (this.f4418a.m3030e(this.f4419b)) {
            bte bteVar = this.f4418a;
            C1058va c1058va = this.f4419b;
            bsk bskVar = bteVar.f4420a.f4290o;
            if (obj != null && bskVar.mo2996c(c1058va.f47802a.mo2942g())) {
                bteVar.f4422c = obj;
                ((bsf) bteVar.f4421b).m2991e(2);
            } else {
                bsa bsaVar = bteVar.f4421b;
                ?? r3 = c1058va.f47803b;
                ?? r4 = c1058va.f47802a;
                bsaVar.mo2969d(r3, obj, r4, r4.mo2942g(), bteVar.f4423d);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [bra, java.lang.Object] */
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
    @Override // p000.bqz
    /* JADX INFO: renamed from: e */
    public final void mo2946e(Exception exc) {
        if (this.f4418a.m3030e(this.f4419b)) {
            bte bteVar = this.f4418a;
            C1058va c1058va = this.f4419b;
            bsa bsaVar = bteVar.f4421b;
            brz brzVar = bteVar.f4423d;
            ?? r1 = c1058va.f47802a;
            bsaVar.mo2968b(brzVar, exc, r1, r1.mo2942g());
        }
    }
}
