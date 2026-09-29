package p000;

import androidx.compose.animation.C0073l;

/* JADX INFO: loaded from: classes.dex */
final class y89 extends i16 {

    /* JADX INFO: renamed from: b */
    public final l43 f69482b;

    public y89(l43 l43Var) {
        this.f69482b = l43Var;
    }

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
    public final boolean equals(Object obj) {
        if (!(obj instanceof y89) || !fa4.m11650l(((y89) obj).f69482b, this.f69482b)) {
            return false;
        }
        gc0 gc0Var = nj0.f52808c;
        return gc0Var.equals(gc0Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new C0073l(this.f69482b);
    }

    public final int hashCode() {
        return (Float.hashCode(-1.0f) + (Float.hashCode(-1.0f) * 31) + (this.f69482b.hashCode() * 31)) * 31;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "animateContentSize";
        z91 z91Var = y64Var.f69367c;
        z91Var.m25511b(this.f69482b, "animationSpec");
        z91Var.m25511b(nj0.f52808c, "alignment");
        z91Var.m25511b(null, "finishedListener");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((C0073l) d16Var).f1593K = this.f69482b;
    }
}
