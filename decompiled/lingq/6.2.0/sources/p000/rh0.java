package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59254a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59256c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jt5 f59257d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59258e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59259f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f59260g;

    public /* synthetic */ rh0(l87 l87Var, ct5 ct5Var, jt5 jt5Var, int i, int i2, sh0 sh0Var) {
        this.f59258e = l87Var;
        this.f59259f = ct5Var;
        this.f59257d = jt5Var;
        this.f59255b = i;
        this.f59256c = i2;
        this.f59260g = sh0Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f59254a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f59260g;
        jt5 jt5Var = this.f59257d;
        Object obj3 = this.f59259f;
        Object obj4 = this.f59258e;
        switch (i) {
            case 0:
                qh0.m19964b((AbstractC0343j) obj, (l87) obj4, (ct5) obj3, jt5Var.getLayoutDirection(), this.f59255b, this.f59256c, ((sh0) obj2).f60856a);
                break;
            default:
                l87[] l87VarArr = (l87[]) obj4;
                bb1 bb1Var = (bb1) obj3;
                int[] iArr = (int[]) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int length = l87VarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    l87 l87Var = l87VarArr[i2];
                    int i4 = i3 + 1;
                    l87Var.getClass();
                    Object objMo1509A = l87Var.mo1509A();
                    pj8 pj8Var = objMo1509A instanceof pj8 ? (pj8) objMo1509A : null;
                    LayoutDirection layoutDirection = jt5Var.getLayoutDirection();
                    d32 d32Var = pj8Var != null ? pj8Var.f56323c : null;
                    int i5 = this.f59255b;
                    abstractC0343j.m1530f(l87Var, d32Var != null ? d32Var.mo10067A(i5, l87Var.f49301a, layoutDirection, l87Var, this.f59256c) : bb1Var.f8266b.mo4499a(l87Var.f49301a, i5, layoutDirection), iArr[i3], 0.0f);
                    i2++;
                    i3 = i4;
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rh0(l87[] l87VarArr, bb1 bb1Var, int i, int i2, jt5 jt5Var, int[] iArr) {
        this.f59258e = l87VarArr;
        this.f59259f = bb1Var;
        this.f59255b = i;
        this.f59256c = i2;
        this.f59257d = jt5Var;
        this.f59260g = iArr;
    }
}
