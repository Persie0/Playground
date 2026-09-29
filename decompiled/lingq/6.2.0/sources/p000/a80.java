package p000;

import androidx.compose.p002ui.layout.AbstractC0343j;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a80 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f333a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ l87 f334b;

    public /* synthetic */ a80(l87 l87Var, int i) {
        this.f333a = i;
        this.f334b = l87Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f333a;
        l87 l87Var = this.f334b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((AbstractC0343j) obj).m1530f(l87Var, 0, 0, 0.0f);
                break;
            case 1:
                AbstractC0343j.m1525p((AbstractC0343j) obj, this.f334b, 0, 0, null, 12);
                break;
            case 2:
                AbstractC0343j abstractC0343j = (AbstractC0343j) obj;
                abstractC0343j.getClass();
                int i2 = l87Var.f49301a;
                int i3 = l87Var.f49302b;
                abstractC0343j.m1530f(l87Var, (i3 / 2) + ((-i2) / 2), (i2 / 2) + ((-i3) / 2), 0.0f);
                break;
            case 3:
                ((AbstractC0343j) obj).m1530f(l87Var, 0, 0, 0.0f);
                break;
            default:
                ((AbstractC0343j) obj).m1530f(l87Var, 0, 0, 0.0f);
                break;
        }
        return xfaVar;
    }
}
