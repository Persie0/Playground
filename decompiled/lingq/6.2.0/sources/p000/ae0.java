package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ae0 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f531a;

    /* JADX INFO: renamed from: b */
    public final hy2 f532b;

    public ae0(int i) {
        this.f531a = i;
        switch (i) {
            case 1:
                this.f532b = new p89(35152, "image/png", 2);
                break;
            case 2:
                this.f532b = new bf4();
                break;
            default:
                this.f532b = new p89(16973, "image/bmp", 2);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m291g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m292h() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        switch (this.f531a) {
            case 0:
            case 1:
                break;
            default:
                this.f532b.mo109a();
                break;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        int i = this.f531a;
        hy2 hy2Var = this.f532b;
        switch (i) {
            case 0:
                return ((p89) hy2Var).mo110b(iy2Var, n63Var);
            case 1:
                return ((p89) hy2Var).mo110b(iy2Var, n63Var);
            default:
                return hy2Var.mo110b(iy2Var, n63Var);
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) {
        int i = this.f531a;
        hy2 hy2Var = this.f532b;
        switch (i) {
            case 0:
                return ((p89) hy2Var).mo111c(iy2Var);
            case 1:
                return ((p89) hy2Var).mo111c(iy2Var);
            default:
                return hy2Var.mo111c(iy2Var);
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        int i = this.f531a;
        hy2 hy2Var = this.f532b;
        switch (i) {
            case 0:
                ((p89) hy2Var).mo112d(j, j2);
                break;
            case 1:
                ((p89) hy2Var).mo112d(j, j2);
                break;
            default:
                hy2Var.mo112d(j, j2);
                break;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        int i = this.f531a;
        hy2 hy2Var = this.f532b;
        switch (i) {
            case 0:
                ((p89) hy2Var).mo113f(jy2Var);
                break;
            case 1:
                ((p89) hy2Var).mo113f(jy2Var);
                break;
            default:
                hy2Var.mo113f(jy2Var);
                break;
        }
    }
}
