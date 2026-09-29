package p000;

import androidx.compose.runtime.internal.C0282a;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kpb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f48306a = new C0282a(-1170133064, false, new od1(0));

    /* JADX INFO: renamed from: a */
    public static C3154jo m15642a(k47 k47Var) {
        String str;
        int iM14829m = k47Var.m14829m();
        if (k47Var.m14829m() != 1684108385) {
            ss5.m21707d0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM14829m2 = k47Var.m14829m();
        byte[] bArr = ai0.f687a;
        int i = iM14829m2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            hn1.m13364n("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        k47Var.m14819N(4);
        int i2 = iM14829m - 16;
        byte[] bArr2 = new byte[i2];
        k47Var.m14827k(bArr2, 0, i2);
        return new C3154jo(str, null, 3, bArr2);
    }

    /* JADX INFO: renamed from: b */
    public static bw9 m15643b(int i, k47 k47Var, String str) {
        int iM14829m = k47Var.m14829m();
        if (k47Var.m14829m() == 1684108385 && iM14829m >= 22) {
            k47Var.m14819N(10);
            int iM14812G = k47Var.m14812G();
            if (iM14812G > 0) {
                String strM22988k = ux5.m22988k(iM14812G, "");
                int iM14812G2 = k47Var.m14812G();
                if (iM14812G2 > 0) {
                    strM22988k = strM22988k + "/" + iM14812G2;
                }
                return new bw9(str, null, ImmutableList.m6291y(strM22988k));
            }
        }
        ss5.m21707d0("MetadataUtil", "Failed to parse index/count attribute: ".concat(bj0.m3750a(i)));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m15644c(k47 k47Var) {
        int iM14829m = k47Var.m14829m();
        if (k47Var.m14829m() == 1684108385) {
            k47Var.m14819N(8);
            int i = iM14829m - 16;
            if (i == 1) {
                return k47Var.m14842z();
            }
            if (i == 2) {
                return k47Var.m14812G();
            }
            if (i == 3) {
                return k47Var.m14808C();
            }
            if (i == 4 && (k47Var.m14826j() & 128) == 0) {
                return k47Var.m14809D();
            }
        }
        ss5.m21707d0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static az3 m15645d(int i, String str, k47 k47Var, boolean z, boolean z2) {
        int iM15644c = m15644c(k47Var);
        if (z2) {
            iM15644c = Math.min(1, iM15644c);
        }
        if (iM15644c >= 0) {
            return z ? new bw9(str, null, ImmutableList.m6291y(Integer.toString(iM15644c))) : new gb1("und", str, Integer.toString(iM15644c));
        }
        ss5.m21707d0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(bj0.m3750a(i)));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static bw9 m15646e(int i, k47 k47Var, String str) {
        int iM14829m = k47Var.m14829m();
        if (k47Var.m14829m() == 1684108385) {
            k47Var.m14819N(8);
            return new bw9(str, null, ImmutableList.m6291y(k47Var.m14838v(iM14829m - 16)));
        }
        ss5.m21707d0("MetadataUtil", "Failed to parse text attribute: ".concat(bj0.m3750a(i)));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static void m15647f(int i, ey5 ey5Var, lc3 lc3Var, ey5 ey5Var2, ey5... ey5VarArr) {
        if (ey5Var2 == null) {
            ey5Var2 = new ey5(new dy5[0]);
        }
        if (ey5Var != null) {
            c14 c14VarM6284m = ImmutableList.m6284m();
            for (dy5 dy5Var : ey5Var.f38074a) {
                if (at5.class.isAssignableFrom(dy5Var.getClass())) {
                    c14VarM6284m.m3157b((dy5) at5.class.cast(dy5Var));
                }
            }
            d14 d14VarListIterator = c14VarM6284m.m4280g().listIterator(0);
            while (d14VarListIterator.hasNext()) {
                at5 at5Var = (at5) d14VarListIterator.next();
                if (!at5Var.f7466a.equals("com.android.capture.fps") || i == 2) {
                    ey5Var2 = ey5Var2.m11386a(at5Var);
                }
            }
        }
        for (ey5 ey5Var3 : ey5VarArr) {
            ey5Var2 = ey5Var2.m11387b(ey5Var3);
        }
        if (ey5Var2.f38074a.length > 0) {
            lc3Var.f49450k = ey5Var2;
        }
    }
}
