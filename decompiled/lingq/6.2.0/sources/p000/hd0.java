package p000;

import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0358h;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 extends y27 {

    /* JADX INFO: renamed from: e */
    public final C3185ki f42195e;

    /* JADX INFO: renamed from: f */
    public final long f42196f;

    /* JADX INFO: renamed from: g */
    public int f42197g = 1;

    /* JADX INFO: renamed from: h */
    public final long f42198h;

    /* JADX INFO: renamed from: i */
    public float f42199i;

    /* JADX INFO: renamed from: j */
    public fa1 f42200j;

    public hd0(C3185ki c3185ki, long j) {
        int i;
        this.f42195e = c3185ki;
        this.f42196f = j;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > c3185ki.f47311a.getWidth() || i > c3185ki.f47311a.getHeight()) {
            C3386nv.m17626m("Failed requirement.");
            throw null;
        }
        this.f42198h = j;
        this.f42199i = 1.0f;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: a */
    public final void mo1443a(float f) {
        this.f42199i = f;
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: b */
    public final void mo1444b(fa1 fa1Var) {
        this.f42200j = fa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd0)) {
            return false;
        }
        hd0 hd0Var = (hd0) obj;
        return fa4.m11650l(this.f42195e, hd0Var.f42195e) && f84.m11593b(0L, 0L) && n84.m17279a(this.f42196f, hd0Var.f42196f) && this.f42197g == hd0Var.f42197g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42197g) + ux5.m22981d(this.f42196f, ux5.m22981d(0L, this.f42195e.hashCode() * 31, 31), 31);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: i */
    public final long mo1445i() {
        return omd.m18152h0(this.f42198h);
    }

    @Override // p000.y27
    /* JADX INFO: renamed from: j */
    public final void mo1446j(C0358h c0358h) {
        an0 an0Var = c0358h.f4358a;
        InterfaceC0310a.m1416Z(c0358h, this.f42195e, this.f42196f, (((long) Math.round(Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L)))) & 4294967295L), this.f42199i, this.f42200j, this.f42197g, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f42195e);
        sb.append(", srcOffset=");
        sb.append((Object) f84.m11596e(0L));
        sb.append(", srcSize=");
        sb.append((Object) n84.m17280b(this.f42196f));
        sb.append(", filterQuality=");
        int i = this.f42197g;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "Low";
        } else if (i == 2) {
            str = "Medium";
        } else {
            str = i == 3 ? "High" : "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
