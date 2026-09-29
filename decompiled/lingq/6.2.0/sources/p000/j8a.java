package p000;

import android.text.TextUtils;
import androidx.media3.common.C0713b;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class j8a {

    /* JADX INFO: renamed from: a */
    public final int f45214a;

    /* JADX INFO: renamed from: b */
    public final String f45215b;

    /* JADX INFO: renamed from: c */
    public final int f45216c;

    /* JADX INFO: renamed from: d */
    public final C0713b[] f45217d;

    /* JADX INFO: renamed from: e */
    public int f45218e;

    static {
        uma.m22828w(0);
        uma.m22828w(1);
    }

    public j8a(String str, C0713b... c0713bArr) {
        bna.m3969q(c0713bArr.length > 0);
        this.f45215b = str;
        this.f45217d = c0713bArr;
        this.f45214a = c0713bArr.length;
        String str2 = c0713bArr[0].f6406o;
        this.f45216c = TextUtils.isEmpty(str2) ? ez5.m11397g(c0713bArr[0].f6405n) : ez5.m11397g(str2);
        String str3 = c0713bArr[0].f6395d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = c0713bArr[0].f6397f | 16384;
        for (int i2 = 1; i2 < c0713bArr.length; i2++) {
            String str4 = c0713bArr[i2].f6395d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                m14327b("languages", i2, c0713bArr[0].f6395d, c0713bArr[i2].f6395d);
                return;
            } else {
                if (i != (c0713bArr[i2].f6397f | 16384)) {
                    m14327b("role flags", i2, Integer.toBinaryString(c0713bArr[0].f6397f), Integer.toBinaryString(c0713bArr[i2].f6397f));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14327b(String str, int i, String str2, String str3) {
        StringBuilder sbM23000w = ux5.m23000w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM23000w.append(str3);
        sbM23000w.append("' (track ");
        sbM23000w.append(i);
        sbM23000w.append(")");
        ss5.m21724v("TrackGroup", "", new IllegalStateException(sbM23000w.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final C0713b m14328a(int i) {
        return this.f45217d[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j8a.class == obj.getClass()) {
            j8a j8aVar = (j8a) obj;
            if (this.f45215b.equals(j8aVar.f45215b) && Arrays.equals(this.f45217d, j8aVar.f45217d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f45218e == 0) {
            this.f45218e = Arrays.hashCode(this.f45217d) + ux5.m22980c(527, this.f45215b, 31);
        }
        return this.f45218e;
    }

    public final String toString() {
        return this.f45215b + ": " + Arrays.toString(this.f45217d);
    }
}
