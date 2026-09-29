package p000;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3290l9 implements hy2 {

    /* JADX INFO: renamed from: c */
    public final k47 f49315c;

    /* JADX INFO: renamed from: d */
    public final so0 f49316d;

    /* JADX INFO: renamed from: e */
    public jy2 f49317e;

    /* JADX INFO: renamed from: f */
    public long f49318f;

    /* JADX INFO: renamed from: h */
    public boolean f49320h;

    /* JADX INFO: renamed from: i */
    public boolean f49321i;

    /* JADX INFO: renamed from: a */
    public final C3327m9 f49313a = new C3327m9(null, 0, "audio/mp4a-latm", true);

    /* JADX INFO: renamed from: b */
    public final k47 f49314b = new k47(2048);

    /* JADX INFO: renamed from: g */
    public long f49319g = -1;

    public C3290l9() {
        k47 k47Var = new k47(10);
        this.f49315c = k47Var;
        byte[] bArr = k47Var.f46700a;
        this.f49316d = new so0(bArr.length, bArr);
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: a */
    public final void mo109a() {
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: b */
    public final int mo110b(iy2 iy2Var, n63 n63Var) {
        this.f49317e.getClass();
        iy2Var.getLength();
        k47 k47Var = this.f49314b;
        int i = iy2Var.read(k47Var.f46700a, 0, 2048);
        boolean z = i == -1;
        if (!this.f49321i) {
            this.f49317e.mo2558q(new h60(-9223372036854775807L));
            this.f49321i = true;
        }
        if (z) {
            return -1;
        }
        k47Var.m14818M(0);
        k47Var.m14817L(i);
        boolean z2 = this.f49320h;
        C3327m9 c3327m9 = this.f49313a;
        if (!z2) {
            c3327m9.f50793u = this.f49318f;
            this.f49320h = true;
        }
        c3327m9.mo609b(k47Var);
        return 0;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: c */
    public final boolean mo111c(iy2 iy2Var) throws EOFException, InterruptedIOException {
        k47 k47Var;
        int i = 0;
        while (true) {
            k47Var = this.f49315c;
            iy2Var.mo13085o(k47Var.f46700a, 0, 10);
            k47Var.m14818M(0);
            if (k47Var.m14808C() != 4801587) {
                break;
            }
            k47Var.m14819N(3);
            int iM14841y = k47Var.m14841y();
            i += iM14841y + 10;
            iy2Var.mo13078f(iM14841y);
        }
        iy2Var.mo13080i();
        iy2Var.mo13078f(i);
        if (this.f49319g == -1) {
            this.f49319g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            h62 h62Var = (h62) iy2Var;
            h62Var.mo13076d(k47Var.f46700a, 0, 2, false);
            k47Var.m14818M(0);
            if ((k47Var.m14812G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                so0 so0Var = this.f49316d;
                so0Var.m21509m(14);
                int iM21503g = so0Var.m21503g(13);
                if (iM21503g <= 6) {
                    i4++;
                    h62Var.f41835f = 0;
                    h62Var.m13081j(i4, false);
                } else {
                    h62Var.m13081j(iM21503g - 6, false);
                    i3 += iM21503g;
                }
            } else {
                i4++;
                h62Var.f41835f = 0;
                h62Var.m13081j(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: d */
    public final void mo112d(long j, long j2) {
        this.f49320h = false;
        this.f49313a.mo611d();
        this.f49318f = j2;
    }

    @Override // p000.hy2
    /* JADX INFO: renamed from: f */
    public final void mo113f(jy2 jy2Var) {
        this.f49317e = jy2Var;
        this.f49313a.mo614g(jy2Var, new mca(0, 1));
        jy2Var.mo2551j();
    }
}
