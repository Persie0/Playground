package p000;

import androidx.compose.p002ui.graphics.layer.C0312a;

/* JADX INFO: loaded from: classes.dex */
public abstract class l87 {

    /* JADX INFO: renamed from: a */
    public int f49301a;

    /* JADX INFO: renamed from: b */
    public int f49302b;

    /* JADX INFO: renamed from: c */
    public long f49303c = 0;

    /* JADX INFO: renamed from: d */
    public long f49304d = m87.f50757a;

    /* JADX INFO: renamed from: e */
    public long f49305e = 0;

    /* JADX INFO: renamed from: A */
    public Object mo1509A() {
        return null;
    }

    /* JADX INFO: renamed from: V */
    public abstract int mo1630V(AbstractC3608te abstractC3608te);

    /* JADX INFO: renamed from: a0 */
    public int mo1640a0() {
        return (int) (this.f49303c & 4294967295L);
    }

    /* JADX INFO: renamed from: b0 */
    public int mo1642b0() {
        return (int) (this.f49303c >> 32);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m16024e0() {
        this.f49301a = l70.m15945h((int) (this.f49303c >> 32), bk1.m3803k(this.f49304d), bk1.m3801i(this.f49304d));
        int iM15945h = l70.m15945h((int) (this.f49303c & 4294967295L), bk1.m3802j(this.f49304d), bk1.m3800h(this.f49304d));
        this.f49302b = iM15945h;
        int i = this.f49301a;
        long j = this.f49303c;
        this.f49305e = (((long) ((i - ((int) (j >> 32))) / 2)) << 32) | (4294967295L & ((long) ((iM15945h - ((int) (j & 4294967295L))) / 2)));
    }

    /* JADX INFO: renamed from: i0 */
    public abstract void mo1544i0(long j, float f, vi3 vi3Var);

    /* JADX INFO: renamed from: j0 */
    public void mo1545j0(long j, float f, C0312a c0312a) {
        mo1544i0(j, f, null);
    }

    /* JADX INFO: renamed from: k0 */
    public final void m16025k0(long j) {
        if (n84.m17279a(this.f49303c, j)) {
            return;
        }
        this.f49303c = j;
        m16024e0();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m16026m0(long j) {
        if (bk1.m3795c(this.f49304d, j)) {
            return;
        }
        this.f49304d = j;
        m16024e0();
    }
}
