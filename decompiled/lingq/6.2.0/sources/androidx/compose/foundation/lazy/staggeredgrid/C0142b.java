package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.bk1;
import p000.bu4;
import p000.cu4;
import p000.cw4;
import p000.dk1;
import p000.do7;
import p000.dw4;
import p000.eu4;
import p000.gm5;
import p000.gw4;
import p000.it5;
import p000.jc9;
import p000.lda;
import p000.omd;
import p000.pk9;
import p000.qm9;
import p000.qp3;
import p000.sc9;
import p000.t17;
import p000.thb;
import p000.ui3;
import p000.un1;
import p000.uv4;
import p000.vi3;
import p000.xc9;
import p000.xs4;
import p000.zc2;
import p000.zg4;
import p000.zi3;
import p000.zv4;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.staggeredgrid.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0142b implements bu4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0144d f2588a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Orientation f2589b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gw4 f2590c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f2591d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t17 f2592e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f2593f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ un1 f2594g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ qp3 f2595h;

    public C0142b(C0144d c0144d, Orientation orientation, gw4 gw4Var, zg4 zg4Var, t17 t17Var, float f, un1 un1Var, qp3 qp3Var) {
        this.f2588a = c0144d;
        this.f2589b = orientation;
        this.f2590c = gw4Var;
        this.f2591d = zg4Var;
        this.f2592e = t17Var;
        this.f2593f = f;
        this.f2594g = un1Var;
        this.f2595h = qp3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v24, types: [gq] */
    /* JADX WARN: Type inference failed for: r3v37, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Type inference failed for: r8v8 */
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
    @Override // p000.bu4
    /* JADX INFO: renamed from: a */
    public final it5 mo1021a(cu4 cu4Var, long j) {
        xs4 xs4Var;
        float fMo14021d;
        float fMo14018a;
        float fM21643u;
        long j2;
        long j3;
        boolean z;
        Integer numValueOf;
        ?? M18131U;
        int i;
        qm9 qm9Var = cu4Var.f34541b;
        C0144d c0144d = this.f2588a;
        c0144d.f2619v.getValue();
        boolean z2 = c0144d.f2598a || qm9Var.mo211f0();
        Orientation orientation = this.f2589b;
        thb.m22047f(j, orientation);
        gw4 gw4Var = this.f2590c;
        if (gw4Var.f41429d != null && bk1.m3795c(gw4Var.f41427b, j) && gw4Var.f41428c == qm9Var.mo594a()) {
            xs4 xs4Var2 = gw4Var.f41429d;
            xs4Var2.getClass();
            xs4Var = xs4Var2;
        } else {
            gw4Var.f41427b = j;
            gw4Var.f41428c = qm9Var.mo594a();
            xs4 xs4Var3 = (xs4) gw4Var.f41426a.invoke(cu4Var, new bk1(j));
            gw4Var.f41429d = xs4Var3;
            xs4Var = xs4Var3;
        }
        boolean z3 = orientation == Orientation.Vertical;
        uv4 uv4Var = (uv4) this.f2591d.mo0a();
        LayoutDirection layoutDirection = qm9Var.getLayoutDirection();
        int[] iArr = cw4.f34631a;
        int i2 = iArr[orientation.ordinal()];
        t17 t17Var = this.f2592e;
        if (i2 == 1) {
            fMo14021d = t17Var.mo14021d();
        } else {
            if (i2 != 2) {
                gm5.m12750e();
                return null;
            }
            fMo14021d = AbstractC3584sr.m21643u(t17Var, layoutDirection);
        }
        int iMo916w0 = qm9Var.mo916w0(fMo14021d);
        LayoutDirection layoutDirection2 = qm9Var.getLayoutDirection();
        int i3 = iArr[orientation.ordinal()];
        if (i3 == 1) {
            fMo14018a = t17Var.mo14018a();
        } else {
            if (i3 != 2) {
                gm5.m12750e();
                return null;
            }
            fMo14018a = AbstractC3584sr.m21642t(t17Var, layoutDirection2);
        }
        int iMo916w1 = qm9Var.mo916w0(fMo14018a);
        LayoutDirection layoutDirection3 = qm9Var.getLayoutDirection();
        int i4 = iArr[orientation.ordinal()];
        if (i4 == 1) {
            fM21643u = AbstractC3584sr.m21643u(t17Var, layoutDirection3);
        } else {
            if (i4 != 2) {
                gm5.m12750e();
                return null;
            }
            fM21643u = t17Var.mo14021d();
        }
        int iMo916w2 = qm9Var.mo916w0(fM21643u);
        int iM3800h = ((z3 ? bk1.m3800h(j) : bk1.m3801i(j)) - iMo916w0) - iMo916w1;
        if (z3) {
            j2 = ((long) iMo916w2) << 32;
            j3 = iMo916w0;
        } else {
            j2 = ((long) iMo916w0) << 32;
            j3 = iMo916w2;
        }
        long j4 = j2 | (j3 & 4294967295L);
        int iMo916w3 = qm9Var.mo916w0(AbstractC3584sr.m21642t(t17Var, qm9Var.getLayoutDirection()) + AbstractC3584sr.m21643u(t17Var, qm9Var.getLayoutDirection()));
        int iMo916w4 = qm9Var.mo916w0(t17Var.mo14018a() + t17Var.mo14021d());
        List listM10531g = do7.m10531g(uv4Var, c0144d.f2616s, c0144d.f2608k);
        long jM3794b = bk1.m3794b(dk1.m10429g(iMo916w3, j), 0, dk1.m10428f(iMo916w4, j), 0, 10, j);
        int iMo916w5 = qm9Var.mo916w0(this.f2593f);
        boolean zMo211f0 = qm9Var.mo211f0();
        dw4 dw4Var = c0144d.f2599b;
        zv4 zv4Var = new zv4(c0144d, listM10531g, uv4Var, xs4Var, jM3794b, z3, cu4Var, iM3800h, j4, iMo916w0, iMo916w1, iMo916w5, this.f2594g, z2, dw4Var != null ? dw4Var.f36307m : null, this.f2595h);
        zc2 zc2Var = c0144d.f2600c;
        int[] iArr2 = (int[]) zc2Var.f71350c;
        Object obj = zc2Var.f71354g;
        iArr2.getClass();
        if (iArr2.length > 0) {
            z = false;
            numValueOf = Integer.valueOf(iArr2[0]);
        } else {
            z = false;
            numValueOf = null;
        }
        int iM19375m = pk9.m19375m(numValueOf != null ? numValueOf.intValue() : z, uv4Var, obj);
        boolean zM20822P = AbstractC3550rv.m20822P(iArr2, iM19375m);
        int[] iArr3 = iArr2;
        if (!zM20822P) {
            ((eu4) zc2Var.f71355h).m11342c(iM19375m);
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                int[] iArr4 = (int[]) ((LazyStaggeredGridState$scrollPosition$1) ((zi3) zc2Var.f71349b)).invoke(Integer.valueOf(iM19375m), Integer.valueOf(iArr2.length));
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                zc2Var.f71350c = iArr4;
                ((sc9) zc2Var.f71351d).m21223i(zc2.m25549a(iArr4));
                iArr3 = iArr4;
            } catch (Throwable th) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th;
            }
        }
        ?? r2 = (int[]) zc2Var.f71352e;
        int length = iArr3.length;
        int i5 = zv4Var.f72275s;
        ?? r4 = iArr3;
        if (length != i5) {
            ?? r3 = zv4Var.f72274r;
            r3.m12810n();
            ?? r7 = new int[i5];
            for (?? r11 = z; r11 < i5; r11++) {
                if (r11 < iArr3.length && (i = iArr3[r11]) != -1) {
                    M18131U = i;
                } else if (r11 == 0) {
                    M18131U = z;
                    M18131U = i;
                } else {
                    M18131U = omd.m18131U(r7, ((long) r11) & 4294967295L) + 1;
                }
                r7[r11] = M18131U;
                r3.m12811p(M18131U, r11);
            }
            r4 = r7;
        }
        int length2 = r2.length;
        ?? r5 = r2;
        if (length2 != i5) {
            ?? r6 = new int[i5];
            ?? r12 = z;
            while (r12 < i5) {
                r6[r12] = r12 < r2.length ? r2[r12] : r12 == 0 ? z : r6[r12 - 1];
                r12++;
            }
            r5 = r6;
        }
        dw4 dw4VarM18132V = omd.m18132V(zv4Var, Math.round((zMo211f0 || !c0144d.f2598a) ? c0144d.f2612o : ((Number) ((xc9) c0144d.f2620w.f2565b.f8704b).getValue()).floatValue()), r4, r5, true);
        c0144d.m1022f(dw4VarM18132V, qm9Var.mo211f0(), z);
        return dw4VarM18132V;
    }
}
