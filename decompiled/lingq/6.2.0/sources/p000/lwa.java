package p000;

import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class lwa {

    /* JADX INFO: renamed from: d */
    public boolean f50224d;

    /* JADX INFO: renamed from: e */
    public boolean f50225e;

    /* JADX INFO: renamed from: f */
    public int[] f50226f;

    /* JADX INFO: renamed from: g */
    public int f50227g;

    /* JADX INFO: renamed from: h */
    public int f50228h;

    /* JADX INFO: renamed from: i */
    public Rect f50229i;

    /* JADX INFO: renamed from: b */
    public long f50222b = -9223372036854775807L;

    /* JADX INFO: renamed from: c */
    public long f50223c = -9223372036854775807L;

    /* JADX INFO: renamed from: a */
    public final int[] f50221a = new int[4];

    /* JADX INFO: renamed from: j */
    public int f50230j = -1;

    /* JADX INFO: renamed from: k */
    public int f50231k = -1;

    /* JADX INFO: renamed from: a */
    public static int m16556a(int[] iArr, int i) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public static int m16557c(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: b */
    public final void m16558b(so0 so0Var, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int i6 = 1;
                int iM21503g = 0;
                while (true) {
                    if (iM21503g >= i6 || i6 > 64) {
                        i = iM21503g & 3;
                        if (iM21503g >= 4) {
                            i2 = iM21503g >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (so0Var.m21498b() < 4) {
                        i = -1;
                        i2 = 0;
                        break;
                    } else {
                        iM21503g = (iM21503g << 4) | so0Var.m21503g(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f50221a[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            so0Var.m21499c();
        }
    }
}
