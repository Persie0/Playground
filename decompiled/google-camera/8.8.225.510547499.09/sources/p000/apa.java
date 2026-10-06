package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apa {

    /* JADX INFO: renamed from: a */
    public static final byte[] f1973a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f1974b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public static String m1786a(String str, String str2, byte[] bArr) {
        String strM1801a = ape.m1801a(bArr);
        if (str.length() <= 0) {
            return m1794i(str2, strM1801a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m1794i(str2, strM1801a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + ape.m1801a(bArr) + str2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1787b(OutputStream outputStream, aoy aoyVar) throws IOException {
        int iIntValue = 0;
        for (int i : aoyVar.f1959h) {
            Integer numValueOf = Integer.valueOf(i);
            ade.m279l(outputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1788c(OutputStream outputStream, aoy aoyVar) throws IOException {
        byte[] bArr = new byte[m1793h(aoyVar.f1958g)];
        for (Map.Entry entry : aoyVar.f1960i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                m1795j(bArr, 2, iIntValue, aoyVar);
            }
            if ((iIntValue2 & 4) != 0) {
                m1795j(bArr, 4, iIntValue, aoyVar);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: d */
    public static void m1789d(OutputStream outputStream, aoy aoyVar) throws IOException {
        int i = 0;
        for (Map.Entry entry : aoyVar.f1960i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ade.m279l(outputStream, iIntValue - i);
                ade.m279l(outputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m1790e(aoy[] aoyVarArr, byte[] bArr) throws IOException {
        int length;
        int i = 0;
        int i2 = 0;
        int iM1793h = 0;
        while (true) {
            length = aoyVarArr.length;
            if (i2 >= length) {
                break;
            }
            aoy aoyVar = aoyVarArr[i2];
            int iM271d = ade.m271d(m1786a(aoyVar.f1952a, aoyVar.f1953b, bArr)) + 16;
            int i3 = aoyVar.f1956e;
            iM1793h += iM271d + i3 + i3 + aoyVar.f1957f + m1793h(aoyVar.f1958g);
            i2++;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM1793h);
        if (Arrays.equals(bArr, ape.f1984c)) {
            while (i < length) {
                aoy aoyVar2 = aoyVarArr[i];
                m1797l(byteArrayOutputStream, aoyVar2, m1786a(aoyVar2.f1952a, aoyVar2.f1953b, bArr));
                m1796k(byteArrayOutputStream, aoyVar2);
                i++;
            }
        } else {
            for (aoy aoyVar3 : aoyVarArr) {
                m1797l(byteArrayOutputStream, aoyVar3, m1786a(aoyVar3.f1952a, aoyVar3.f1953b, bArr));
            }
            int length2 = aoyVarArr.length;
            while (i < length2) {
                m1796k(byteArrayOutputStream, aoyVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == iM1793h) {
            return byteArrayOutputStream.toByteArray();
        }
        throw ade.m274g("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM1793h);
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m1791f(InputStream inputStream, byte[] bArr) {
        if (!Arrays.equals(bArr, ade.m283p(inputStream, 4))) {
            throw ade.m274g("Invalid magic");
        }
        int i = ape.f1989h;
        return ade.m283p(inputStream, 4);
    }

    /* JADX INFO: renamed from: g */
    public static int[] m1792g(InputStream inputStream, int i) {
        int[] iArr = new int[i];
        int iM269b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM269b += ade.m269b(inputStream);
            iArr[i2] = iM269b;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    private static int m1793h(int i) {
        return (((i + i) + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: i */
    private static String m1794i(String str, String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    /* JADX INFO: renamed from: j */
    private static void m1795j(byte[] bArr, int i, int i2, aoy aoyVar) {
        int i3 = aoyVar.f1958g;
        switch (i) {
            case 2:
                break;
            case 3:
            default:
                throw ade.m274g("Unexpected flag: " + i);
            case 4:
                i2 += i3;
                break;
        }
        int i4 = i2 / 8;
        bArr[i4] = (byte) ((1 << (i2 % 8)) | bArr[i4]);
    }

    /* JADX INFO: renamed from: k */
    private static void m1796k(OutputStream outputStream, aoy aoyVar) throws IOException {
        m1789d(outputStream, aoyVar);
        m1787b(outputStream, aoyVar);
        m1788c(outputStream, aoyVar);
    }

    /* JADX INFO: renamed from: l */
    private static void m1797l(OutputStream outputStream, aoy aoyVar, String str) throws IOException {
        ade.m279l(outputStream, ade.m271d(str));
        ade.m279l(outputStream, aoyVar.f1956e);
        ade.m280m(outputStream, aoyVar.f1957f);
        ade.m280m(outputStream, aoyVar.f1954c);
        ade.m280m(outputStream, aoyVar.f1958g);
        ade.m277j(outputStream, str);
    }
}
