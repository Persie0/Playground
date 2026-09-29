package androidx.profileinstaller;

import android.support.v4.media.session.C0166e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p003a2.C0009a;
import p169i4.C6176b;
import p169i4.C6177c;
import p169i4.C6181g;

/* JADX INFO: renamed from: androidx.profileinstaller.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1095d {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6893a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f6894b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m4050a(C6176b[] c6176bArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (C6176b c6176b : c6176bArr) {
            length += (((((c6176b.f36023g * 2) + 8) - 1) & (-8)) / 8) + (c6176b.f36021e * 2) + m4051b(c6176b.f36017a, c6176b.f36018b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c6176b.f36022f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C6181g.f36034c)) {
            int length2 = c6176bArr.length;
            while (i10 < length2) {
                C6176b c6176b2 = c6176bArr[i10];
                m4061l(byteArrayOutputStream, c6176b2, m4051b(c6176b2.f36017a, c6176b2.f36018b, bArr));
                m4063n(byteArrayOutputStream, c6176b2);
                m4060k(byteArrayOutputStream, c6176b2);
                m4062m(byteArrayOutputStream, c6176b2);
                i10++;
            }
        } else {
            for (C6176b c6176b3 : c6176bArr) {
                m4061l(byteArrayOutputStream, c6176b3, m4051b(c6176b3.f36017a, c6176b3.f36018b, bArr));
            }
            int length3 = c6176bArr.length;
            while (i10 < length3) {
                C6176b c6176b4 = c6176bArr[i10];
                m4063n(byteArrayOutputStream, c6176b4);
                m4060k(byteArrayOutputStream, c6176b4);
                m4062m(byteArrayOutputStream, c6176b4);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX INFO: renamed from: b */
    public static String m4051b(String str, String str2, byte[] bArr) {
        ?? Replace;
        ?? r10;
        ?? Replace2;
        byte[] bArr2 = C6181g.f36036e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C6181g.f36035d;
        ?? r11 = "!";
        ?? r12 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : r11;
        if (str.length() <= 0) {
            if (r11.equals(r12)) {
                return str2.replace(":", r11);
            }
            if (":".equals(r12)) {
                Replace2 = str2;
                Replace2 = str2.replace(r11, ":");
            }
            Replace2 = str2;
            return Replace2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (!str2.contains(r11) && !str2.contains(":")) {
            if (str2.endsWith(".apk")) {
                return str2;
            }
            StringBuilder sbM771r = C0166e.m771r(str);
            if (Arrays.equals(bArr, bArr2)) {
                r10 = ":";
            } else if (Arrays.equals(bArr, bArr3)) {
                r10 = r11;
                r10 = ":";
            }
            r10 = r11;
            return C0009a.m23l(sbM771r, r10, str2);
        }
        if (r11.equals(r12)) {
            return str2.replace(":", r11);
        }
        if (":".equals(r12)) {
            Replace = str2;
            Replace = str2.replace(r11, ":");
        }
        Replace = str2;
        return Replace;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static int m4052c(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw new IllegalStateException("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw new IllegalStateException(C0166e.m761g("Unexpected flag: ", i10));
    }

    /* JADX INFO: renamed from: d */
    public static int[] m4053d(int i10, ByteArrayInputStream byteArrayInputStream) throws IOException {
        int[] iArr = new int[i10];
        int iM12699e = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM12699e += C6177c.m12699e(byteArrayInputStream);
            iArr[i11] = iM12699e;
        }
        return iArr;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static C6176b[] m4054e(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C6176b[] c6176bArr) throws IOException {
        byte[] bArr3 = C6181g.f36037f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C6181g.f36038g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM12699e = C6177c.m12699e(fileInputStream);
            byte[] bArrM12697c = C6177c.m12697c(fileInputStream, (int) C6177c.m12698d(4, fileInputStream), (int) C6177c.m12698d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM12697c);
            try {
                C6176b[] c6176bArrM4056g = m4056g(byteArrayInputStream, bArr2, iM12699e, c6176bArr);
                byteArrayInputStream.close();
                return c6176bArrM4056g;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(C6181g.f36032a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM12698d = (int) C6177c.m12698d(1, fileInputStream);
        byte[] bArrM12697c2 = C6177c.m12697c(fileInputStream, (int) C6177c.m12698d(4, fileInputStream), (int) C6177c.m12698d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM12697c2);
        try {
            C6176b[] c6176bArrM4055f = m4055f(byteArrayInputStream2, iM12698d, c6176bArr);
            byteArrayInputStream2.close();
            return c6176bArrM4055f;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public static C6176b[] m4055f(ByteArrayInputStream byteArrayInputStream, int i10, C6176b[] c6176bArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C6176b[0];
        }
        if (i10 != c6176bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM12699e = C6177c.m12699e(byteArrayInputStream);
            iArr[i11] = C6177c.m12699e(byteArrayInputStream);
            strArr[i11] = new String(C6177c.m12696b(iM12699e, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C6176b c6176b = c6176bArr[i12];
            if (!c6176b.f36018b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c6176b.f36021e = i13;
            c6176b.f36024h = m4053d(i13, byteArrayInputStream);
        }
        return c6176bArr;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public static C6176b[] m4056g(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, C6176b[] c6176bArr) throws IOException {
        C6176b c6176b;
        int[] iArrM4053d;
        if (byteArrayInputStream.available() == 0) {
            return new C6176b[0];
        }
        if (i10 != c6176bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C6177c.m12699e(byteArrayInputStream);
            String str = new String(C6177c.m12696b(C6177c.m12699e(byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jM12698d = C6177c.m12698d(4, byteArrayInputStream);
            int iM12699e = C6177c.m12699e(byteArrayInputStream);
            if (c6176bArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 < c6176bArr.length) {
                        if (c6176bArr[i12].f36018b.equals(strSubstring)) {
                            c6176b = c6176bArr[i12];
                            break;
                        }
                        i12++;
                    }
                }
                if (c6176b != null) {
                    throw new IllegalStateException("Missing profile key: ".concat(str));
                }
                c6176b.f36020d = jM12698d;
                iArrM4053d = m4053d(iM12699e, byteArrayInputStream);
                if (Arrays.equals(bArr, C6181g.f36036e)) {
                    c6176b.f36021e = iM12699e;
                    c6176b.f36024h = iArrM4053d;
                }
            }
            c6176b = null;
            if (c6176b != null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c6176b.f36020d = jM12698d;
            iArrM4053d = m4053d(iM12699e, byteArrayInputStream);
            if (Arrays.equals(bArr, C6181g.f36036e)) {
                c6176b.f36021e = iM12699e;
                c6176b.f36024h = iArrM4053d;
            }
        }
        return c6176bArr;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public static C6176b[] m4057h(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, C6181g.f36033b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM12698d = (int) C6177c.m12698d(1, fileInputStream);
        byte[] bArrM12697c = C6177c.m12697c(fileInputStream, (int) C6177c.m12698d(4, fileInputStream), (int) C6177c.m12698d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM12697c);
        try {
            C6176b[] c6176bArrM4058i = m4058i(byteArrayInputStream, str, iM12698d);
            byteArrayInputStream.close();
            return c6176bArrM4058i;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C6176b[] m4058i(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C6176b[0];
        }
        C6176b[] c6176bArr = new C6176b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM12699e = C6177c.m12699e(byteArrayInputStream);
            int iM12699e2 = C6177c.m12699e(byteArrayInputStream);
            c6176bArr[i11] = new C6176b(str, new String(C6177c.m12696b(iM12699e, byteArrayInputStream), StandardCharsets.UTF_8), C6177c.m12698d(4, byteArrayInputStream), iM12699e2, (int) C6177c.m12698d(4, byteArrayInputStream), (int) C6177c.m12698d(4, byteArrayInputStream), new int[iM12699e2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C6176b c6176b = c6176bArr[i12];
            int iAvailable = byteArrayInputStream.available() - c6176b.f36022f;
            int iM12699e3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c6176b.f36025i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM12699e3 += C6177c.m12699e(byteArrayInputStream);
                treeMap.put(Integer.valueOf(iM12699e3), 1);
                for (int iM12699e4 = C6177c.m12699e(byteArrayInputStream); iM12699e4 > 0; iM12699e4--) {
                    C6177c.m12699e(byteArrayInputStream);
                    int iM12698d = (int) C6177c.m12698d(1, byteArrayInputStream);
                    if (iM12698d != 6 && iM12698d != 7) {
                        while (iM12698d > 0) {
                            C6177c.m12698d(1, byteArrayInputStream);
                            for (int iM12698d2 = (int) C6177c.m12698d(1, byteArrayInputStream); iM12698d2 > 0; iM12698d2--) {
                                C6177c.m12699e(byteArrayInputStream);
                            }
                            iM12698d--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c6176b.f36024h = m4053d(c6176b.f36021e, byteArrayInputStream);
            int i13 = c6176b.f36023g;
            BitSet bitSetValueOf = BitSet.valueOf(C6177c.m12696b(((((i13 * 2) + 8) - 1) & (-8)) / 8, byteArrayInputStream));
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bitSetValueOf.get(m4052c(2, i14, i13)) ? 2 : 0;
                if (bitSetValueOf.get(m4052c(4, i14, i13))) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
        }
        return c6176bArr;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4059j(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C6176b[] c6176bArr) throws IOException {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C6181g.f36032a;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C6181g.f36033b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM4050a = m4050a(c6176bArr, bArr3);
                C6177c.m12700f(byteArrayOutputStream, c6176bArr.length, 1);
                C6177c.m12700f(byteArrayOutputStream, bArrM4050a.length, 4);
                byte[] bArrM12695a = C6177c.m12695a(bArrM4050a);
                C6177c.m12700f(byteArrayOutputStream, bArrM12695a.length, 4);
                byteArrayOutputStream.write(bArrM12695a);
                return true;
            }
            byte[] bArr4 = C6181g.f36035d;
            if (Arrays.equals(bArr, bArr4)) {
                C6177c.m12700f(byteArrayOutputStream, c6176bArr.length, 1);
                for (C6176b c6176b : c6176bArr) {
                    int size = c6176b.f36025i.size() * 4;
                    String strM4051b = m4051b(c6176b.f36017a, c6176b.f36018b, bArr4);
                    C6177c.m12701g(byteArrayOutputStream, strM4051b.getBytes(StandardCharsets.UTF_8).length);
                    C6177c.m12701g(byteArrayOutputStream, c6176b.f36024h.length);
                    C6177c.m12700f(byteArrayOutputStream, size, 4);
                    C6177c.m12700f(byteArrayOutputStream, c6176b.f36019c, 4);
                    byteArrayOutputStream.write(strM4051b.getBytes(StandardCharsets.UTF_8));
                    Iterator<Integer> it = c6176b.f36025i.keySet().iterator();
                    while (it.hasNext()) {
                        C6177c.m12701g(byteArrayOutputStream, it.next().intValue());
                        C6177c.m12701g(byteArrayOutputStream, 0);
                    }
                    for (int i11 : c6176b.f36024h) {
                        C6177c.m12701g(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = C6181g.f36034c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM4050a2 = m4050a(c6176bArr, bArr5);
                C6177c.m12700f(byteArrayOutputStream, c6176bArr.length, 1);
                C6177c.m12700f(byteArrayOutputStream, bArrM4050a2.length, 4);
                byte[] bArrM12695a2 = C6177c.m12695a(bArrM4050a2);
                C6177c.m12700f(byteArrayOutputStream, bArrM12695a2.length, 4);
                byteArrayOutputStream.write(bArrM12695a2);
                return true;
            }
            byte[] bArr6 = C6181g.f36036e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C6177c.m12701g(byteArrayOutputStream, c6176bArr.length);
            for (C6176b c6176b2 : c6176bArr) {
                String strM4051b2 = m4051b(c6176b2.f36017a, c6176b2.f36018b, bArr6);
                C6177c.m12701g(byteArrayOutputStream, strM4051b2.getBytes(StandardCharsets.UTF_8).length);
                TreeMap<Integer, Integer> treeMap = c6176b2.f36025i;
                C6177c.m12701g(byteArrayOutputStream, treeMap.size());
                C6177c.m12701g(byteArrayOutputStream, c6176b2.f36024h.length);
                C6177c.m12700f(byteArrayOutputStream, c6176b2.f36019c, 4);
                byteArrayOutputStream.write(strM4051b2.getBytes(StandardCharsets.UTF_8));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C6177c.m12701g(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i12 : c6176b2.f36024h) {
                    C6177c.m12701g(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C6177c.m12701g(byteArrayOutputStream2, c6176bArr.length);
            int i13 = 2;
            int i14 = 2;
            for (C6176b c6176b3 : c6176bArr) {
                C6177c.m12700f(byteArrayOutputStream2, c6176b3.f36019c, 4);
                C6177c.m12700f(byteArrayOutputStream2, c6176b3.f36020d, 4);
                C6177c.m12700f(byteArrayOutputStream2, c6176b3.f36023g, 4);
                String strM4051b3 = m4051b(c6176b3.f36017a, c6176b3.f36018b, bArr2);
                int length2 = strM4051b3.getBytes(StandardCharsets.UTF_8).length;
                C6177c.m12701g(byteArrayOutputStream2, length2);
                i14 = i14 + 4 + 4 + 4 + 2 + (length2 * 1);
                byteArrayOutputStream2.write(strM4051b3.getBytes(StandardCharsets.UTF_8));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            C1097f c1097f = new C1097f(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c1097f);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            for (int i16 = 0; i16 < c6176bArr.length; i16++) {
                try {
                    C6176b c6176b4 = c6176bArr[i16];
                    C6177c.m12701g(byteArrayOutputStream3, i16);
                    C6177c.m12701g(byteArrayOutputStream3, c6176b4.f36021e);
                    i15 = i15 + 2 + 2 + (c6176b4.f36021e * 2);
                    m4060k(byteArrayOutputStream3, c6176b4);
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i15 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i15 + ", does not match actual size " + byteArray2.length);
            }
            C1097f c1097f2 = new C1097f(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c1097f2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < c6176bArr.length) {
                try {
                    C6176b c6176b5 = c6176bArr[i17];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c6176b5.f36025i.entrySet().iterator();
                    int iIntValue = i10;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m4062m(byteArrayOutputStream5, c6176b5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m4063n(byteArrayOutputStream6, c6176b5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            C6177c.m12701g(byteArrayOutputStream4, i17);
                            int length3 = byteArray3.length + i13 + byteArray4.length;
                            int i19 = i18 + 2 + 4;
                            ArrayList arrayList4 = arrayList3;
                            C6177c.m12700f(byteArrayOutputStream4, length3, 4);
                            C6177c.m12701g(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i18 = i19 + length3;
                            i17++;
                            arrayList3 = arrayList4;
                            i10 = 0;
                            i13 = 2;
                        } catch (Throwable th4) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                } catch (Throwable th8) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th8;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                        throw th8;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            C1097f c1097f3 = new C1097f(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList2.add(c1097f3);
            long j10 = 4;
            long size2 = j10 + j10 + 4 + ((long) (arrayList2.size() * 16));
            C6177c.m12700f(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                C1097f c1097f4 = (C1097f) arrayList2.get(i20);
                C6177c.m12700f(byteArrayOutputStream, c1097f4.f6902a.getValue(), 4);
                C6177c.m12700f(byteArrayOutputStream, size2, 4);
                boolean z10 = c1097f4.f6904c;
                byte[] bArr7 = c1097f4.f6903b;
                if (z10) {
                    long length4 = bArr7.length;
                    byte[] bArrM12695a3 = C6177c.m12695a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM12695a3);
                    C6177c.m12700f(byteArrayOutputStream, bArrM12695a3.length, 4);
                    C6177c.m12700f(byteArrayOutputStream, length4, 4);
                    length = bArrM12695a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    C6177c.m12700f(byteArrayOutputStream, bArr7.length, 4);
                    C6177c.m12700f(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i21));
            }
            return true;
        } catch (Throwable th10) {
            try {
                byteArrayOutputStream2.close();
                throw th10;
            } catch (Throwable th11) {
                th10.addSuppressed(th11);
                throw th10;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m4060k(ByteArrayOutputStream byteArrayOutputStream, C6176b c6176b) throws IOException {
        int iIntValue = 0;
        for (int i10 : c6176b.f36024h) {
            Integer numValueOf = Integer.valueOf(i10);
            C6177c.m12701g(byteArrayOutputStream, numValueOf.intValue() - iIntValue);
            iIntValue = numValueOf.intValue();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4061l(ByteArrayOutputStream byteArrayOutputStream, C6176b c6176b, String str) throws IOException {
        C6177c.m12701g(byteArrayOutputStream, str.getBytes(StandardCharsets.UTF_8).length);
        C6177c.m12701g(byteArrayOutputStream, c6176b.f36021e);
        C6177c.m12700f(byteArrayOutputStream, c6176b.f36022f, 4);
        C6177c.m12700f(byteArrayOutputStream, c6176b.f36019c, 4);
        C6177c.m12700f(byteArrayOutputStream, c6176b.f36023g, 4);
        byteArrayOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: m */
    public static void m4062m(ByteArrayOutputStream byteArrayOutputStream, C6176b c6176b) throws IOException {
        byte[] bArr = new byte[((((c6176b.f36023g * 2) + 8) - 1) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c6176b.f36025i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i10 = iIntValue2 & 2;
            int i11 = c6176b.f36023g;
            if (i10 != 0) {
                int iM4052c = m4052c(2, iIntValue, i11);
                int i12 = iM4052c / 8;
                bArr[i12] = (byte) ((1 << (iM4052c % 8)) | bArr[i12]);
            }
            if ((iIntValue2 & 4) != 0) {
                int iM4052c2 = m4052c(4, iIntValue, i11);
                int i13 = iM4052c2 / 8;
                bArr[i13] = (byte) ((1 << (iM4052c2 % 8)) | bArr[i13]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: n */
    public static void m4063n(ByteArrayOutputStream byteArrayOutputStream, C6176b c6176b) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : c6176b.f36025i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C6177c.m12701g(byteArrayOutputStream, iIntValue - i10);
                C6177c.m12701g(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }
}
