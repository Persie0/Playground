package androidx.compose.runtime;

import ae.C0062b;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.ArrayList;
import p081e0.C5296b;
import p081e0.C5342v0;

/* JADX INFO: renamed from: androidx.compose.runtime.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0479d {

    /* JADX INFO: renamed from: a */
    public final C5342v0 f3154a;

    /* JADX INFO: renamed from: b */
    public final int[] f3155b;

    /* JADX INFO: renamed from: c */
    public final int f3156c;

    /* JADX INFO: renamed from: d */
    public final Object[] f3157d;

    /* JADX INFO: renamed from: e */
    public final int f3158e;

    /* JADX INFO: renamed from: f */
    public boolean f3159f;

    /* JADX INFO: renamed from: g */
    public int f3160g;

    /* JADX INFO: renamed from: h */
    public int f3161h;

    /* JADX INFO: renamed from: i */
    public int f3162i;

    /* JADX INFO: renamed from: j */
    public int f3163j;

    /* JADX INFO: renamed from: k */
    public int f3164k;

    /* JADX INFO: renamed from: l */
    public int f3165l;

    public C0479d(C5342v0 c5342v0) {
        C5207g.m11111f(c5342v0, "table");
        this.f3154a = c5342v0;
        this.f3155b = c5342v0.f33624a;
        int i10 = c5342v0.f33625b;
        this.f3156c = i10;
        this.f3157d = c5342v0.f33626c;
        this.f3158e = c5342v0.f33627d;
        this.f3161h = i10;
        this.f3162i = -1;
    }

    /* JADX INFO: renamed from: a */
    public final C5296b m1757a(int i10) {
        ArrayList<C5296b> arrayList = this.f3154a.f33631h;
        int iM323X1 = C0062b.m323X1(arrayList, i10, this.f3156c);
        if (iM323X1 < 0) {
            C5296b c5296b = new C5296b(i10);
            arrayList.add(-(iM323X1 + 1), c5296b);
            return c5296b;
        }
        C5296b c5296b2 = arrayList.get(iM323X1);
        C5207g.m11110e(c5296b2, "get(location)");
        return c5296b2;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1758b(int[] iArr, int i10) {
        int iM249B0;
        if (!C0062b.m408w(iArr, i10)) {
            return InterfaceC0476a.a.f3122a;
        }
        int i11 = i10 * 5;
        if (i11 >= iArr.length) {
            iM249B0 = iArr.length;
        } else {
            iM249B0 = C0062b.m249B0(iArr[i11 + 1] >> 29) + iArr[i11 + 4];
        }
        return this.f3157d[iM249B0];
    }

    /* JADX INFO: renamed from: c */
    public final void m1759c() {
        boolean z10 = true;
        this.f3159f = true;
        C5342v0 c5342v0 = this.f3154a;
        c5342v0.getClass();
        int i10 = c5342v0.f33628e;
        if (i10 <= 0) {
            z10 = false;
        }
        if (z10) {
            c5342v0.f33628e = i10 - 1;
        } else {
            ComposerKt.m1687c("Unexpected reader close()".toString());
            throw null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1760d() {
        if (this.f3163j == 0) {
            if (!(this.f3160g == this.f3161h)) {
                ComposerKt.m1687c("endGroup() not called at the end of a group".toString());
                throw null;
            }
            int i10 = (this.f3162i * 5) + 2;
            int[] iArr = this.f3155b;
            int i11 = iArr[i10];
            this.f3162i = i11;
            this.f3161h = i11 < 0 ? this.f3156c : i11 + iArr[(i11 * 5) + 3];
        }
    }

    /* JADX INFO: renamed from: e */
    public final Object m1761e() {
        int i10 = this.f3160g;
        if (i10 < this.f3161h) {
            return m1758b(this.f3155b, i10);
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final Object m1762f(int i10, int i11) {
        int[] iArr = this.f3155b;
        int iM268G = C0062b.m268G(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iM268G + i11;
        return i13 < (i12 < this.f3156c ? iArr[(i12 * 5) + 4] : this.f3158e) ? this.f3157d[i13] : InterfaceC0476a.a.f3122a;
    }

    /* JADX INFO: renamed from: g */
    public final int m1763g(int i10) {
        return C0062b.m404v(this.f3155b, i10);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1764h(int i10) {
        return C0062b.m416y(this.f3155b, i10);
    }

    /* JADX INFO: renamed from: i */
    public final Object m1765i(int i10) {
        int[] iArr = this.f3155b;
        if (!C0062b.m416y(iArr, i10)) {
            return null;
        }
        if (!C0062b.m416y(iArr, i10)) {
            return InterfaceC0476a.a.f3122a;
        }
        return this.f3157d[iArr[(i10 * 5) + 4]];
    }

    /* JADX INFO: renamed from: j */
    public final int m1766j(int i10) {
        return C0062b.m256D(this.f3155b, i10);
    }

    /* JADX INFO: renamed from: k */
    public final Object m1767k(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) != 0) {
            return this.f3157d[C0062b.m249B0(i12 >> 30) + iArr[i11 + 4]];
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final int m1768l(int i10) {
        return this.f3155b[(i10 * 5) + 2];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public final void m1769m(int i10) {
        if (!(this.f3163j == 0)) {
            ComposerKt.m1687c("Cannot reposition while in an empty region".toString());
            throw null;
        }
        this.f3160g = i10;
        int[] iArr = this.f3155b;
        int i11 = this.f3156c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        this.f3162i = i12;
        if (i12 < 0) {
            this.f3161h = i11;
        } else {
            this.f3161h = C0062b.m404v(iArr, i12) + i12;
        }
        this.f3164k = 0;
        this.f3165l = 0;
    }

    /* JADX INFO: renamed from: n */
    public final int m1770n() {
        int iM256D = 1;
        if (!(this.f3163j == 0)) {
            ComposerKt.m1687c("Cannot skip while in an empty region".toString());
            throw null;
        }
        int i10 = this.f3160g;
        int[] iArr = this.f3155b;
        if (!C0062b.m416y(iArr, i10)) {
            iM256D = C0062b.m256D(iArr, this.f3160g);
        }
        int i11 = this.f3160g;
        this.f3160g = iArr[(i11 * 5) + 3] + i11;
        return iM256D;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final void m1771o() {
        if (this.f3163j == 0) {
            this.f3160g = this.f3161h;
        } else {
            ComposerKt.m1687c("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final void m1772p() {
        if (this.f3163j <= 0) {
            int i10 = this.f3160g;
            int[] iArr = this.f3155b;
            if (!(iArr[(i10 * 5) + 2] == this.f3162i)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            this.f3162i = i10;
            this.f3161h = iArr[(i10 * 5) + 3] + i10;
            int i11 = i10 + 1;
            this.f3160g = i11;
            this.f3164k = C0062b.m268G(iArr, i10);
            this.f3165l = i10 >= this.f3156c - 1 ? this.f3158e : iArr[(i11 * 5) + 4];
        }
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f3160g);
        sb2.append(", key=");
        int i11 = this.f3160g;
        if (i11 < this.f3161h) {
            i10 = this.f3155b[i11 * 5];
        } else {
            i10 = 0;
        }
        sb2.append(i10);
        sb2.append(", parent=");
        sb2.append(this.f3162i);
        sb2.append(", end=");
        return C0204c.m853l(sb2, this.f3161h, ')');
    }
}
