package p542zo;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;

/* JADX INFO: renamed from: zo.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C10578t {

    /* JADX INFO: renamed from: a */
    public int f52792a;

    /* JADX INFO: renamed from: b */
    public final int[] f52793b = new int[10];

    /* JADX INFO: renamed from: a */
    public final int m19586a() {
        if ((this.f52792a & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
            return this.f52793b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m19587b(C10578t c10578t) {
        C5207g.m11111f(c10578t, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (((1 << i10) & c10578t.f52792a) != 0) {
                m19588c(i10, c10578t.f52793b[i10]);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19588c(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f52793b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f52792a = (1 << i10) | this.f52792a;
            iArr[i10] = i11;
        }
    }
}
