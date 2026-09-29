package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class wb0 implements gg5 {

    /* JADX INFO: renamed from: a */
    public final gg5 f66577a;

    /* JADX INFO: renamed from: b */
    public int f66578b = 0;

    /* JADX INFO: renamed from: c */
    public int f66579c = -1;

    /* JADX INFO: renamed from: d */
    public int f66580d = -1;

    public wb0(gg5 gg5Var) {
        this.f66577a = gg5Var;
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: a */
    public final void mo12582a(int i, int i2) {
        m23830b();
        this.f66577a.mo12582a(i, i2);
    }

    /* JADX INFO: renamed from: b */
    public final void m23830b() {
        int i = this.f66578b;
        if (i == 0) {
            return;
        }
        gg5 gg5Var = this.f66577a;
        if (i == 1) {
            gg5Var.mo12583c(this.f66579c, this.f66580d);
        } else if (i == 2) {
            gg5Var.mo12584d(this.f66579c, this.f66580d);
        } else if (i == 3) {
            gg5Var.mo12585f(this.f66579c, this.f66580d);
        }
        this.f66578b = 0;
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: c */
    public final void mo12583c(int i, int i2) {
        int i3;
        if (this.f66578b == 1 && i >= (i3 = this.f66579c)) {
            int i4 = this.f66580d;
            if (i <= i3 + i4) {
                this.f66580d = i4 + i2;
                this.f66579c = Math.min(i, i3);
                return;
            }
        }
        m23830b();
        this.f66579c = i;
        this.f66580d = i2;
        this.f66578b = 1;
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: d */
    public final void mo12584d(int i, int i2) {
        int i3;
        if (this.f66578b == 2 && (i3 = this.f66579c) >= i && i3 <= i + i2) {
            this.f66580d += i2;
            this.f66579c = i;
        } else {
            m23830b();
            this.f66579c = i;
            this.f66580d = i2;
            this.f66578b = 2;
        }
    }

    @Override // p000.gg5
    /* JADX INFO: renamed from: f */
    public final void mo12585f(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f66578b == 3 && i <= (i4 = this.f66580d + (i3 = this.f66579c)) && (i5 = i + i2) >= i3) {
            this.f66579c = Math.min(i, i3);
            this.f66580d = Math.max(i4, i5) - this.f66579c;
        } else {
            m23830b();
            this.f66579c = i;
            this.f66580d = i2;
            this.f66578b = 3;
        }
    }
}
