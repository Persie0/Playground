package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sk4 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60951a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ a85 f60952b;

    public /* synthetic */ sk4(a85 a85Var, int i) {
        this.f60951a = i;
        this.f60952b = a85Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f60951a;
        a85 a85Var = this.f60952b;
        switch (i) {
            case 0:
                z75 z75Var = (z75) a85Var;
                float f = z75Var.f71021d;
                float f2 = z75Var.f71020c;
                return Float.valueOf(f2 > 0.0f ? l70.m15944g(f / f2, 0.0f, 1.0f) : 0.0f);
            default:
                z75 z75Var2 = (z75) a85Var;
                int i2 = z75Var2.f71021d;
                int i3 = z75Var2.f71020c;
                return Float.valueOf(i3 > 0 ? l70.m15944g(i2 / i3, 0.0f, 1.0f) : 0.0f);
        }
    }
}
