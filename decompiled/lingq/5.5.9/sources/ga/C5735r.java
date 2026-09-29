package ga;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.InterfaceC2409f;
import java.util.Arrays;
import p291o7.C8002l;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: renamed from: ga.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5735r implements InterfaceC2409f {

    /* JADX INFO: renamed from: f */
    public static final String f34797f = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: g */
    public static final String f34798g = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: h */
    public static final C8002l f34799h = new C8002l(15);

    /* JADX INFO: renamed from: a */
    public final int f34800a;

    /* JADX INFO: renamed from: b */
    public final String f34801b;

    /* JADX INFO: renamed from: c */
    public final int f34802c;

    /* JADX INFO: renamed from: d */
    public final C2416m[] f34803d;

    /* JADX INFO: renamed from: e */
    public int f34804e;

    public C5735r() {
        throw null;
    }

    public C5735r(String str, C2416m... c2416mArr) {
        C10129a.m18990b(c2416mArr.length > 0);
        this.f34801b = str;
        this.f34803d = c2416mArr;
        this.f34800a = c2416mArr.length;
        int iM19108h = C10147p.m19108h(c2416mArr[0].f12484l);
        this.f34802c = iM19108h == -1 ? C10147p.m19108h(c2416mArr[0].f12483k) : iM19108h;
        String str2 = c2416mArr[0].f12474c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i10 = c2416mArr[0].f12477e | 16384;
        for (int i11 = 1; i11 < c2416mArr.length; i11++) {
            String str3 = c2416mArr[i11].f12474c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                m12089b("languages", i11, c2416mArr[0].f12474c, c2416mArr[i11].f12474c);
                return;
            } else {
                if (i10 != (c2416mArr[i11].f12477e | 16384)) {
                    m12089b("role flags", i11, Integer.toBinaryString(c2416mArr[0].f12477e), Integer.toBinaryString(c2416mArr[i11].f12477e));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12089b(String str, int i10, String str2, String str3) {
        StringBuilder sbM855o = C0204c.m855o("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbM855o.append(str3);
        sbM855o.append("' (track ");
        sbM855o.append(i10);
        sbM855o.append(")");
        C10145n.m19096d("TrackGroup", "", new IllegalStateException(sbM855o.toString()));
    }

    /* JADX INFO: renamed from: a */
    public final int m12090a(C2416m c2416m) {
        int i10 = 0;
        while (true) {
            C2416m[] c2416mArr = this.f34803d;
            if (i10 >= c2416mArr.length) {
                return -1;
            }
            if (c2416m == c2416mArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5735r.class == obj.getClass()) {
            C5735r c5735r = (C5735r) obj;
            return this.f34801b.equals(c5735r.f34801b) && Arrays.equals(this.f34803d, c5735r.f34803d);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f34804e == 0) {
            this.f34804e = C0166e.m758d(this.f34801b, 527, 31) + Arrays.hashCode(this.f34803d);
        }
        return this.f34804e;
    }
}
