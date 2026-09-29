package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ec2 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f36990b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36991c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36992d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f36993e;

    public /* synthetic */ ec2(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f36989a = i2;
        this.f36991c = obj;
        this.f36992d = obj2;
        this.f36993e = obj3;
        this.f36990b = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f36989a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f36990b;
        Object obj2 = this.f36993e;
        Object obj3 = this.f36992d;
        Object obj4 = this.f36991c;
        switch (i) {
            case 0:
                k84 k84Var = (k84) obj3;
                d66 d66Var = (d66) obj2;
                if (obj == ((gc2) obj4)) {
                    C3386nv.m17633t("A derived state calculation cannot read itself");
                    return null;
                }
                if (!(obj instanceof ph9)) {
                    return xfaVar;
                }
                int i3 = k84Var.f46854a - i2;
                int iM10125d = d66Var.m10125d(obj);
                d66Var.m10128g(Math.min(i3, iM10125d >= 0 ? d66Var.f35036c[iM10125d] : Integer.MAX_VALUE), obj);
                return xfaVar;
            default:
                lv3 lv3Var = (lv3) obj4;
                jt5 jt5Var = (jt5) obj3;
                l87 l87Var = (l87) obj2;
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                int i4 = lv3Var.f50183b;
                mv9 mv9Var = lv3Var.f50182a;
                n9a n9aVar = lv3Var.f50184c;
                sw9 sw9Var = (sw9) lv3Var.f50185d.mo0a();
                mv9Var.m17057a(Orientation.Horizontal, AbstractC3423or.m18256h(abstractC0343j, i4, n9aVar, sw9Var != null ? sw9Var.f61519a : null, jt5Var.getLayoutDirection() == LayoutDirection.Rtl, l87Var.f49301a), i2, l87Var.f49301a);
                AbstractC0343j.m1521j(abstractC0343j, l87Var, Math.round(-mv9Var.f51891a.m19861h()), 0);
                return xfaVar;
        }
    }
}
