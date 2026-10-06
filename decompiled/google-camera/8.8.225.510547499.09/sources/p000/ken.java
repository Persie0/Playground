package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ken {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f35762h = 0;

    /* JADX INFO: renamed from: i */
    private static final Charset f35763i = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: j */
    private static final int[] f35764j = {0, 1, 1, 2, 4, 8, 0, 1, 0, 4, 8};

    /* JADX INFO: renamed from: a */
    public final short f35765a;

    /* JADX INFO: renamed from: b */
    public final short f35766b;

    /* JADX INFO: renamed from: c */
    public boolean f35767c;

    /* JADX INFO: renamed from: d */
    public int f35768d;

    /* JADX INFO: renamed from: e */
    public int f35769e;

    /* JADX INFO: renamed from: f */
    public Object f35770f = null;

    /* JADX INFO: renamed from: g */
    public int f35771g;

    static {
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
    }

    public ken(short s, short s2, int i, int i2, boolean z) {
        this.f35765a = s;
        this.f35766b = s2;
        this.f35768d = i;
        this.f35767c = z;
        this.f35769e = i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m14044c(short s) {
        switch (s) {
            case 1:
                return "UNSIGNED_BYTE";
            case 2:
                return "ASCII";
            case 3:
                return "UNSIGNED_SHORT";
            case 4:
                return "UNSIGNED_LONG";
            case 5:
                return "UNSIGNED_RATIONAL";
            case 6:
            case 8:
            default:
                return "";
            case 7:
                return "UNDEFINED";
            case 9:
                return "LONG";
            case 10:
                return hiCTUJiAxf.tXRUvVFjFmNCipP;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m14045f(int i) {
        return i == 0 || i == 1 || i == 2 || i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: n */
    private final boolean m14046n(int i) {
        return this.f35767c && this.f35768d != i;
    }

    /* JADX INFO: renamed from: a */
    public final int m14047a() {
        return this.f35768d * f35764j[this.f35766b];
    }

    /* JADX INFO: renamed from: b */
    public final long m14048b(int i) {
        Object obj = this.f35770f;
        if (obj instanceof long[]) {
            return ((long[]) obj)[i];
        }
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i];
        }
        throw new IllegalArgumentException("Cannot get integer value from ".concat(m14044c(this.f35766b)));
    }

    /* JADX INFO: renamed from: d */
    public final String m14049d() {
        Object obj = this.f35770f;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof byte[]) {
            byte[] bArrCopyOf = (byte[]) obj;
            int length = bArrCopyOf.length - 1;
            if (bArrCopyOf[length] == 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length);
            }
            return new String(bArrCopyOf, f35763i);
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            return iArr.length == 1 ? String.valueOf(iArr[0]) : Arrays.toString(iArr);
        }
        if (!(obj instanceof long[])) {
            return null;
        }
        long[] jArr = (long[]) obj;
        return jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14050e() {
        return this.f35770f != null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ken)) {
            return false;
        }
        ken kenVar = (ken) obj;
        if (kenVar.f35765a != this.f35765a || kenVar.f35768d != this.f35768d || kenVar.f35766b != this.f35766b) {
            return false;
        }
        Object obj2 = this.f35770f;
        if (obj2 == null) {
            return kenVar.f35770f == null;
        }
        Object obj3 = kenVar.f35770f;
        if (obj3 == null) {
            return false;
        }
        if (obj2 instanceof long[]) {
            if (obj3 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) obj3);
            }
            return false;
        }
        if (obj2 instanceof kaz[]) {
            if (obj3 instanceof kaz[]) {
                return Arrays.equals((kaz[]) obj2, (kaz[]) obj3);
            }
            return false;
        }
        if (!(obj2 instanceof byte[])) {
            return obj2.equals(obj3);
        }
        if (obj3 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) obj3);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14051g(int i) {
        return m14054j(new int[]{i});
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14052h(String str) {
        short s = this.f35766b;
        if (s != 2 && s != 7) {
            return false;
        }
        byte[] bytes = str.getBytes(f35763i);
        int length = bytes.length;
        if (length > 0) {
            if (bytes[length - 1] != 0 && this.f35766b != 7) {
                bytes = Arrays.copyOf(bytes, length + 1);
            }
        } else if (this.f35766b == 2 && this.f35768d == 1) {
            bytes = new byte[]{0};
        }
        int length2 = bytes.length;
        if (m14046n(length2)) {
            return false;
        }
        this.f35768d = length2;
        this.f35770f = bytes;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Short.valueOf(this.f35765a), Short.valueOf(this.f35766b), Boolean.valueOf(this.f35767c), Integer.valueOf(this.f35768d), Integer.valueOf(this.f35769e), this.f35770f, Integer.valueOf(this.f35771g)});
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14053i(byte[] bArr) {
        short s;
        int length = bArr.length;
        if (m14046n(length) || ((s = this.f35766b) != 1 && s != 7)) {
            return false;
        }
        byte[] bArr2 = new byte[length];
        this.f35770f = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        this.f35768d = length;
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m14054j(int[] iArr) {
        int i = 0;
        if (m14046n(iArr.length)) {
            return false;
        }
        short s = this.f35766b;
        if (s == 3) {
            for (int i2 : iArr) {
                if (i2 > 65535 || i2 < 0) {
                    return false;
                }
            }
        } else if (s != 9 && s != 4) {
            return false;
        }
        if (this.f35766b == 4) {
            for (int i3 : iArr) {
                if (i3 < 0) {
                    return false;
                }
            }
        }
        long[] jArr = new long[iArr.length];
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                this.f35770f = jArr;
                this.f35768d = length;
                return true;
            }
            jArr[i] = iArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m14055k(long[] jArr) {
        if (m14046n(jArr.length) || this.f35766b != 4) {
            return false;
        }
        for (long j : jArr) {
            if (j < 0 || j > 4294967295L) {
                return false;
            }
        }
        this.f35770f = jArr;
        this.f35768d = jArr.length;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m14056l(kaz[] kazVarArr) {
        if (m14046n(kazVarArr.length)) {
            return false;
        }
        short s = this.f35766b;
        if (s == 5) {
            for (kaz kazVar : kazVarArr) {
                long j = kazVar.f35504a;
                if (j < 0 || kazVar.f35505b < 0 || j > 4294967295L) {
                    return false;
                }
            }
        } else if (s != 10) {
            return false;
        }
        if (this.f35766b == 10) {
            for (kaz kazVar2 : kazVarArr) {
                long j2 = kazVar2.f35504a;
                if (j2 >= -2147483648L) {
                    long j3 = kazVar2.f35505b;
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                    }
                }
                return false;
            }
        }
        this.f35770f = kazVarArr;
        this.f35768d = kazVarArr.length;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final int[] m14057m() {
        Object obj = this.f35770f;
        int[] iArr = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            iArr = new int[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                iArr[i] = (int) jArr[i];
            }
        }
        return iArr;
    }

    public final String toString() {
        String str = String.format("tag id: %04X\n", Short.valueOf(this.f35765a));
        int i = this.f35769e;
        short s = this.f35766b;
        String strM14044c = m14044c(s);
        int i2 = this.f35768d;
        int i3 = this.f35771g;
        Object obj = this.f35770f;
        String string = "";
        if (obj != null) {
            if (obj instanceof byte[]) {
                string = s == 2 ? new String((byte[]) obj, f35763i) : Arrays.toString((byte[]) obj);
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                string = jArr.length == 1 ? String.valueOf(jArr[0]) : Arrays.toString(jArr);
            } else if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 != null) {
                        string = obj2.toString();
                    }
                } else {
                    string = Arrays.toString(objArr);
                }
            } else {
                string = obj.toString();
            }
        }
        return str + "ifd id: " + i + "\ntype: " + strM14044c + hiCTUJiAxf.VngQohBKjJp + i2 + "\noffset: " + i3 + "\nvalue: " + string + "\n";
    }
}
