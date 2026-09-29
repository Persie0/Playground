package p000;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class icb {

    /* JADX INFO: renamed from: a */
    public static final byte[] f43946a = new byte[0];

    /* JADX INFO: renamed from: b */
    public static final rz6 f43947b;

    static {
        ByteString byteString = ByteString.f54513d;
        f43947b = do7.m10547w(iy5.m14192g("efbbbf"), iy5.m14192g("feff"), iy5.m14192g("fffe0000"), iy5.m14192g("fffe"), iy5.m14192g("0000feff"));
    }

    /* JADX INFO: renamed from: a */
    public static final void m13765a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM22996s = ux5.m22996s(j, "length=", ", offset=");
            sbM22996s.append(j2);
            sbM22996s.append(", count=");
            sbM22996s.append(j2);
            throw new ArrayIndexOutOfBoundsException(sbM22996s.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13766b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m13767c(d57 d57Var, u33 u33Var) throws IOException {
        u33Var.getClass();
        try {
            IOException iOException = null;
            for (d57 d57Var2 : u33Var.mo266r(d57Var)) {
                try {
                    if (u33Var.m22435u(d57Var2).f60613c) {
                        m13767c(d57Var2, u33Var);
                    }
                    u33Var.mo265n(d57Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m13768d(eh2 eh2Var, d57 d57Var) {
        eh2Var.getClass();
        d57Var.getClass();
        try {
            eh2Var.f57562b.mo265n(d57Var);
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m13769e(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static final int m13770f(String str, int i, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (vk9.m23381d0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m13771g(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final int m13772h(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (fa4.m11651m(cCharAt, 31) <= 0 || fa4.m11651m(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public static final int m13773i(int i, String str, int i2) {
        str.getClass();
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static final int m13774j(int i, String str, int i2) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    public static final String[] m13775k(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m13776l(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    /* JADX INFO: renamed from: m */
    public static final int m13777m(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: n */
    public static final int m13778n(hj0 hj0Var) {
        hj0Var.getClass();
        return (hj0Var.readByte() & 255) | ((hj0Var.readByte() & 255) << 16) | ((hj0Var.readByte() & 255) << 8);
    }

    /* JADX INFO: renamed from: o */
    public static final int m13779o(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
