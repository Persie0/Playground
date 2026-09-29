package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ndd {
    /* JADX INFO: renamed from: a */
    public static boolean m17390a(k47 k47Var, p63 p63Var, int i, n63 n63Var) {
        long jM14807B = k47Var.m14807B();
        long j = jM14807B >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jM14807B >> 12) & 15);
        int i3 = (int) ((jM14807B >> 8) & 15);
        int i4 = (int) ((jM14807B >> 4) & 15);
        int i5 = (int) ((jM14807B >> 1) & 7);
        boolean z2 = (jM14807B & 1) == 1;
        if (i4 <= 7) {
            if (i4 != p63Var.f55638g - 1) {
                return false;
            }
        } else if (i4 > 10 || p63Var.f55638g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == p63Var.f55640i) || z2) {
            return false;
        }
        try {
            long jM14813H = k47Var.m14813H();
            if (!z) {
                jM14813H *= (long) p63Var.f55633b;
            }
            long j2 = p63Var.f55641j;
            if (j2 != 0 && jM14813H > j2) {
                return false;
            }
            n63Var.f52394a = jM14813H;
            int iM17391b = m17391b(i2, k47Var);
            long j3 = p63Var.f55641j;
            boolean z3 = j3 == 0 || jM14813H + ((long) iM17391b) >= j3;
            if (iM17391b == -1) {
                return false;
            }
            if ((!z3 && iM17391b < p63Var.f55632a) || iM17391b > p63Var.f55633b) {
                return false;
            }
            int i6 = p63Var.f55636e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != p63Var.f55637f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iM14812G = k47Var.m14812G();
                    if (i3 == 14) {
                        iM14812G *= 10;
                    }
                    if (iM14812G != i6) {
                        return false;
                    }
                } else if (k47Var.m14842z() * DescriptorProtos.Edition.EDITION_2023_VALUE != i6) {
                    return false;
                }
            }
            int iM14842z = k47Var.m14842z();
            int i7 = k47Var.f46701b;
            byte[] bArr = k47Var.f46700a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = k47Var.f46701b; i10 < i8; i10++) {
                i9 = uma.f64088i[i9 ^ (bArr[i10] & 255)];
            }
            String str = uma.f64080a;
            if (iM14842z != i9) {
                return false;
            }
            if (k47Var.m14820a() != 0) {
                int iM14826j = k47Var.m14826j();
                if ((iM14826j & 128) != 0) {
                    return false;
                }
                int i11 = (iM14826j & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    ss5.m21686M("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m17391b(int i, k47 k47Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return k47Var.m14842z() + 1;
            case 7:
                return k47Var.m14812G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m17392c(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbM17742q = AbstractC3393o1.m17742q("<", str2, " threw ");
                    sbM17742q.append(e.getClass().getName());
                    sbM17742q.append(">");
                    string = sbM17742q.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
