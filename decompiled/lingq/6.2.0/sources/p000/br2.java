package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class br2 implements ar2 {

    /* JADX INFO: renamed from: a */
    public final int f8885a;

    /* JADX INFO: renamed from: b */
    public int f8886b = -1;

    /* JADX INFO: renamed from: c */
    public int f8887c = -1;

    public br2(int i) {
        this.f8885a = i;
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: e */
    public final Object mo2998e() {
        return this;
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: h */
    public final boolean mo2999h(CharSequence charSequence, int i, int i2, rda rdaVar) {
        int i3 = this.f8885a;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.f8886b = i;
        this.f8887c = i2;
        return false;
    }
}
