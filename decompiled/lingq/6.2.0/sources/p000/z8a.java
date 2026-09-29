package p000;

import androidx.media3.common.C0713b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class z8a {

    /* JADX INFO: renamed from: a */
    public final int f71096a;

    /* JADX INFO: renamed from: b */
    public final j8a f71097b;

    /* JADX INFO: renamed from: c */
    public final boolean f71098c;

    /* JADX INFO: renamed from: d */
    public final int[] f71099d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f71100e;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
        uma.m22828w(3);
        uma.m22828w(4);
    }

    public z8a(j8a j8aVar, boolean z, int[] iArr, boolean[] zArr) {
        int i = j8aVar.f45214a;
        this.f71096a = i;
        boolean z2 = false;
        bna.m3969q(i == iArr.length && i == zArr.length);
        this.f71097b = j8aVar;
        if (z && i > 1) {
            z2 = true;
        }
        this.f71098c = z2;
        this.f71099d = (int[]) iArr.clone();
        this.f71100e = (boolean[]) zArr.clone();
    }

    /* JADX INFO: renamed from: a */
    public final j8a m25491a() {
        return this.f71097b;
    }

    /* JADX INFO: renamed from: b */
    public final C0713b m25492b(int i) {
        return this.f71097b.f45217d[i];
    }

    /* JADX INFO: renamed from: c */
    public final int m25493c(int i) {
        return this.f71099d[i];
    }

    /* JADX INFO: renamed from: d */
    public final int m25494d() {
        return this.f71097b.f45216c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25495e() {
        for (boolean z : this.f71100e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z8a.class == obj.getClass()) {
            z8a z8aVar = (z8a) obj;
            if (this.f71098c == z8aVar.f71098c && this.f71097b.equals(z8aVar.f71097b) && Arrays.equals(this.f71099d, z8aVar.f71099d) && Arrays.equals(this.f71100e, z8aVar.f71100e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m25496f(int i) {
        return this.f71100e[i];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f71100e) + ((Arrays.hashCode(this.f71099d) + (((this.f71097b.hashCode() * 31) + (this.f71098c ? 1 : 0)) * 31)) * 31);
    }
}
