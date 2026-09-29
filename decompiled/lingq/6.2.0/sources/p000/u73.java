package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u73 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63509a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ faa f63510b;

    public /* synthetic */ u73(faa faaVar, int i) {
        this.f63509a = i;
        this.f63510b = faaVar;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f63509a;
        boolean z = true;
        faa faaVar = this.f63510b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Number) faaVar.m11669c()).floatValue() == 0.0f && faaVar.f38741g.m22673h() == Long.MIN_VALUE);
            case 1:
                if (fa4.m11650l(((xc9) faaVar.f38738d).getValue(), faaVar.m11669c()) && faaVar.f38741g.m22673h() == Long.MIN_VALUE && !((Boolean) ((xc9) faaVar.f38742h).getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(faaVar.m11668b());
        }
    }
}
