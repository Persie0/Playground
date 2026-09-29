package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rj8 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59409a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f59410b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f59411c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f59412d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f59413e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f59414f;

    public /* synthetic */ rj8(k9b k9bVar, int i, l87 l87Var, int i2, jt5 jt5Var) {
        this.f59412d = k9bVar;
        this.f59410b = i;
        this.f59413e = l87Var;
        this.f59411c = i2;
        this.f59414f = jt5Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f59409a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f59414f;
        Object obj3 = this.f59413e;
        Object obj4 = this.f59412d;
        switch (i) {
            case 0:
                l87[] l87VarArr = (l87[]) obj4;
                sj8 sj8Var = (sj8) obj3;
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
                    d32 d32Var = pj8Var != null ? pj8Var.f56323c : null;
                    int i5 = this.f59410b;
                    abstractC0343j.m1530f(l87Var, iArr[i3], d32Var != null ? d32Var.mo10067A(i5, l87Var.f49302b, LayoutDirection.Ltr, l87Var, this.f59411c) : sj8Var.f60940b.m11762a(l87Var.f49302b, i5), 0.0f);
                    i2++;
                    i3 = i4;
                }
                break;
            default:
                l87 l87Var2 = (l87) obj3;
                AbstractC0343j.m1520i((AbstractC0343j) obj, l87Var2, ((f84) ((k9b) obj4).f46919K.invoke(new n84((((long) (this.f59410b - l87Var2.f49301a)) << 32) | (((long) (this.f59411c - l87Var2.f49302b)) & 4294967295L)), ((jt5) obj2).getLayoutDirection())).f38612a);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ rj8(l87[] l87VarArr, sj8 sj8Var, int i, int i2, int[] iArr) {
        this.f59412d = l87VarArr;
        this.f59413e = sj8Var;
        this.f59410b = i;
        this.f59411c = i2;
        this.f59414f = iArr;
    }
}
