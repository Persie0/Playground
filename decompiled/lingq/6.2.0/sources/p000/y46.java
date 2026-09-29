package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class y46 implements fb2 {

    /* JADX INFO: renamed from: a */
    public rw9 f69277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z46 f69278b;

    public y46(z46 z46Var) {
        this.f69278b = z46Var;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: F0 */
    public final float mo903F0(long j) {
        if (!zx9.m25849d(j)) {
            return mo594a() * mo901B(j);
        }
        z46 z46Var = this.f69278b;
        if (zx9.m25849d(z46Var.f70888l.f66065a.f42265b)) {
            C3386nv.m17633t("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (zx9.m25846a(z46Var.f70888l.f66065a.f42265b, zx9.f72359c)) {
            C3386nv.m17633t("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return zx9.m25848c(j) * mo903F0(z46Var.f70888l.f66065a.f42265b);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        fb2 fb2Var = this.f69278b.f70887k;
        fb2Var.getClass();
        return fb2Var.mo594a();
    }

    /* JADX INFO: renamed from: b */
    public final rw9 m24937b(long j, long j2) {
        long jM25457h;
        z46 z46Var = this.f69278b;
        vx9 vx9Var = z46Var.f70888l;
        long jM124a = zx9.m25849d(j2) ? a56.m124a(z46Var.f70888l.f66065a.f42265b, j2) : j2;
        if (!zx9.m25846a(jM124a, z46Var.f70888l.f66065a.f42265b)) {
            z46Var.m25455f(vx9.m23584b(z46Var.f70888l, 0L, jM124a, null, null, null, 0L, null, null, 0, 0L, null, 16777213));
        }
        if (z46Var.f70882f > 1) {
            LayoutDirection layoutDirection = z46Var.f70890n;
            layoutDirection.getClass();
            jM25457h = z46Var.m25457h(j, layoutDirection);
        } else {
            jM25457h = j;
        }
        LayoutDirection layoutDirection2 = z46Var.f70890n;
        layoutDirection2.getClass();
        w46 w46VarM25451b = z46Var.m25451b(jM25457h, layoutDirection2);
        LayoutDirection layoutDirection3 = z46Var.f70890n;
        layoutDirection3.getClass();
        rw9 rw9VarM25456g = z46Var.m25456g(layoutDirection3, jM25457h, w46VarM25451b);
        this.f69277a = rw9VarM25456g;
        z46Var.m25455f(vx9Var);
        return rw9VarM25456g;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        fb2 fb2Var = this.f69278b.f70887k;
        fb2Var.getClass();
        return fb2Var.mo597d0();
    }
}
