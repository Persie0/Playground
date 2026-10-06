package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class nfc {

    /* JADX INFO: renamed from: a */
    private static final char[] f42169a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f42170b = 0;

    /* JADX INFO: renamed from: e */
    public static int m17440e(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        throw new IllegalArgumentException("Illegal hexadecimal character: " + c);
    }

    /* JADX INFO: renamed from: f */
    public static nfc m17441f(byte[] bArr) {
        return new nfb(bArr);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo17436a();

    /* JADX INFO: renamed from: b */
    public abstract int mo17437b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo17438c(nfc nfcVar);

    /* JADX INFO: renamed from: d */
    public byte[] mo17439d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nfc) {
            nfc nfcVar = (nfc) obj;
            if (mo17437b() == nfcVar.mo17437b() && mo17438c(nfcVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (mo17437b() >= 32) {
            return mo17436a();
        }
        byte[] bArrMo17439d = mo17439d();
        int i = bArrMo17439d[0] & 255;
        for (int i2 = 1; i2 < bArrMo17439d.length; i2++) {
            i |= (bArrMo17439d[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrMo17439d = mo17439d();
        int length = bArrMo17439d.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArrMo17439d) {
            char[] cArr = f42169a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
