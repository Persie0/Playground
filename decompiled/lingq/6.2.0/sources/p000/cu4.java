package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class cu4 implements jt5 {

    /* JADX INFO: renamed from: a */
    public final xt4 f34540a;

    /* JADX INFO: renamed from: b */
    public final qm9 f34541b;

    /* JADX INFO: renamed from: c */
    public final yt4 f34542c;

    /* JADX INFO: renamed from: d */
    public final t56 f34543d;

    public cu4(xt4 xt4Var, qm9 qm9Var) {
        this.f34540a = xt4Var;
        this.f34541b = qm9Var;
        this.f34542c = (yt4) xt4Var.f68703b.mo0a();
        e84.m10917a();
        this.f34543d = new t56();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: B */
    public final float mo901B(long j) {
        return this.f34541b.mo901B(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: D0 */
    public final long mo902D0(long j) {
        return this.f34541b.mo902D0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        return this.f34541b.mo903F0(j);
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M */
    public final it5 mo1623M(int i, int i2, Map map, vi3 vi3Var, vi3 vi3Var2) {
        return this.f34541b.mo1623M(i, i2, map, vi3Var, vi3Var2);
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M0 */
    public final it5 mo9895M0(int i, int i2, Map map, vi3 vi3Var) {
        return this.f34541b.mo9895M0(i, i2, map, vi3Var);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: N */
    public final long mo904N(float f) {
        return this.f34541b.mo904N(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: T */
    public final float mo905T(int i) {
        return this.f34541b.mo905T(i);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: W */
    public final float mo906W(float f) {
        return this.f34541b.mo906W(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f34541b.mo594a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public final List m9896b(int i) {
        t56 t56Var = this.f34543d;
        List list = (List) t56Var.m10152b(i);
        if (list != null) {
            return list;
        }
        yt4 yt4Var = this.f34542c;
        Object objMo15747c = yt4Var.mo15747c(i);
        List listMo20032J = this.f34541b.mo20032J(objMo15747c, this.f34540a.m24674a(i, objMo15747c, yt4Var.mo16527d(i)));
        t56Var.m21850i(i, listMo20032J);
        return listMo20032J;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f34541b.mo597d0();
    }

    @Override // p000.aa4
    /* JADX INFO: renamed from: f0 */
    public final boolean mo211f0() {
        return this.f34541b.mo211f0();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: g0 */
    public final float mo912g0(float f) {
        return this.f34541b.mo912g0(f);
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f34541b.getLayoutDirection();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: q0 */
    public final int mo913q0(long j) {
        return this.f34541b.mo913q0(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: u */
    public final long mo914u(float f) {
        return this.f34541b.mo914u(f);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: v */
    public final long mo915v(long j) {
        return this.f34541b.mo915v(j);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: w0 */
    public final int mo916w0(float f) {
        return this.f34541b.mo916w0(f);
    }
}
