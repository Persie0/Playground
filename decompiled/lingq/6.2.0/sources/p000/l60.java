package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes2.dex */
public final class l60 implements hy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49105a;

    /* JADX INFO: renamed from: b */
    public final k47 f49106b;

    /* JADX INFO: renamed from: c */
    public final p89 f49107c;

    public l60(int i) {
        this.f49105a = i;
        switch (i) {
            case 1:
                this.f49106b = new k47(4);
                this.f49107c = new p89(-1, "image/webp", -1);
                break;
            default:
                this.f49106b = new k47(4);
                this.f49107c = new p89(-1, "image/avif", -1);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m15822g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m15823h() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
        int i = this.f49105a;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        switch (this.f49105a) {
            case 0:
                break;
        }
        return this.f49107c.mo110b(iy2Var, n63Var);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        int i = this.f49105a;
        k47 k47Var = this.f49106b;
        switch (i) {
            case 0:
                h62 h62Var = (h62) iy2Var;
                h62Var.m13081j(4, false);
                k47Var.m14815J(4);
                h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                if (k47Var.m14807B() == 1718909296) {
                    k47Var.m14815J(4);
                    h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                    if (k47Var.m14807B() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                k47Var.m14815J(4);
                h62 h62Var2 = (h62) iy2Var;
                h62Var2.mo13076d(k47Var.f46700a, 0, 4, false);
                if (k47Var.m14807B() == 1380533830) {
                    h62Var2.m13081j(4, false);
                    k47Var.m14815J(4);
                    h62Var2.mo13076d(k47Var.f46700a, 0, 4, false);
                    if (k47Var.m14807B() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        switch (this.f49105a) {
            case 0:
                this.f49107c.mo112d(j, j2);
                break;
            default:
                this.f49107c.mo112d(j, j2);
                break;
        }
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        int i = this.f49105a;
        p89 p89Var = this.f49107c;
        switch (i) {
            case 0:
                p89Var.mo113f(jy2Var);
                break;
            default:
                p89Var.mo113f(jy2Var);
                break;
        }
    }
}
