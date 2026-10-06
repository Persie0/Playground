package p000;

import android.graphics.RectF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwd implements hsh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jwf f23735a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Float[] f23736b;

    public fwd(jwf jwfVar, Float[] fArr) {
        this.f23735a = jwfVar;
        this.f23736b = fArr;
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: s */
    public final void mo3966s() {
    }

    @Override // p000.hsh
    /* JADX INFO: renamed from: t */
    public final void mo3967t() {
        this.f23735a.mo3415bf(this.f23736b);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.hsh
    /* JADX INFO: renamed from: u */
    public final void mo3968u(RectF rectF, float f, hsa hsaVar) {
        jwf jwfVar = this.f23735a;
        Float[] fArr = new Float[1];
        if (hsaVar == hsa.GYRO) {
            f = 0.0f;
        }
        fArr[0] = Float.valueOf(f);
        jwfVar.mo3415bf(fArr);
    }
}
