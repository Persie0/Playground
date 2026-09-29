package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.b34;
import p000.cd2;
import p000.fa4;
import p000.ux5;

/* JADX INFO: renamed from: androidx.profileinstaller.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0723a {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6560a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f6561b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m2597a(cd2[] cd2VarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (cd2 cd2Var : cd2VarArr) {
            length += ((((cd2Var.f9911g * 2) + 7) & (-8)) / 8) + (cd2Var.f9909e * 2) + m2598b(cd2Var.f9905a, cd2Var.f9906b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cd2Var.f9910f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, b34.f7844e)) {
            int length2 = cd2VarArr.length;
            while (i < length2) {
                cd2 cd2Var2 = cd2VarArr[i];
                m2607k(byteArrayOutputStream, cd2Var2, m2598b(cd2Var2.f9905a, cd2Var2.f9906b, bArr));
                m2606j(byteArrayOutputStream, cd2Var2);
                i++;
            }
        } else {
            for (cd2 cd2Var3 : cd2VarArr) {
                m2607k(byteArrayOutputStream, cd2Var3, m2598b(cd2Var3.f9905a, cd2Var3.f9906b, bArr));
            }
            int length3 = cd2VarArr.length;
            while (i < length3) {
                m2606j(byteArrayOutputStream, cd2VarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: b */
    public static String m2598b(String str, String str2, byte[] bArr) {
        byte[] bArr2 = b34.f7845f;
        byte[] bArr3 = b34.f7846g;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return AbstractC3393o1.m17738m(ux5.m22997t(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m2599c(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM11631E = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM11631E += (int) fa4.m11631E(byteArrayInputStream, 2);
            iArr[i2] = iM11631E;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static cd2[] m2600d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, cd2[] cd2VarArr) throws IOException {
        byte[] bArr3 = b34.f7847h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, b34.f7848i)) {
                C3386nv.m17633t("Unsupported meta version");
                return null;
            }
            int iM11631E = (int) fa4.m11631E(fileInputStream, 2);
            byte[] bArrM11630D = fa4.m11630D(fileInputStream, (int) fa4.m11631E(fileInputStream, 4), (int) fa4.m11631E(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                C3386nv.m17633t("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM11630D);
            try {
                cd2[] cd2VarArrM2602f = m2602f(byteArrayInputStream, bArr2, iM11631E, cd2VarArr);
                byteArrayInputStream.close();
                return cd2VarArrM2602f;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(b34.f7842c, bArr2)) {
            C3386nv.m17633t("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            C3386nv.m17633t("Unsupported meta version");
            return null;
        }
        int iM11631E2 = (int) fa4.m11631E(fileInputStream, 1);
        byte[] bArrM11630D2 = fa4.m11630D(fileInputStream, (int) fa4.m11631E(fileInputStream, 4), (int) fa4.m11631E(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C3386nv.m17633t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM11630D2);
        try {
            cd2[] cd2VarArrM2601e = m2601e(byteArrayInputStream2, iM11631E2, cd2VarArr);
            byteArrayInputStream2.close();
            return cd2VarArrM2601e;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public static cd2[] m2601e(ByteArrayInputStream byteArrayInputStream, int i, cd2[] cd2VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new cd2[0];
        }
        if (i != cd2VarArr.length) {
            C3386nv.m17633t("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM11631E = (int) fa4.m11631E(byteArrayInputStream, 2);
            iArr[i2] = (int) fa4.m11631E(byteArrayInputStream, 2);
            strArr[i2] = new String(fa4.m11629C(byteArrayInputStream, iM11631E), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            cd2 cd2Var = cd2VarArr[i3];
            if (!cd2Var.f9906b.equals(strArr[i3])) {
                C3386nv.m17633t("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            cd2Var.f9909e = i4;
            cd2Var.f9912h = m2599c(byteArrayInputStream, i4);
        }
        return cd2VarArr;
    }

    /* JADX INFO: renamed from: f */
    public static cd2[] m2602f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, cd2[] cd2VarArr) throws IOException {
        cd2 cd2Var;
        if (byteArrayInputStream.available() == 0) {
            return new cd2[0];
        }
        if (i != cd2VarArr.length) {
            C3386nv.m17633t("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            fa4.m11631E(byteArrayInputStream, 2);
            String str = new String(fa4.m11629C(byteArrayInputStream, (int) fa4.m11631E(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM11631E = fa4.m11631E(byteArrayInputStream, 4);
            int iM11631E = (int) fa4.m11631E(byteArrayInputStream, 2);
            if (cd2VarArr.length <= 0) {
                cd2Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= cd2VarArr.length) {
                    cd2Var = null;
                    break;
                }
                if (cd2VarArr[i3].f9906b.equals(strSubstring)) {
                    cd2Var = cd2VarArr[i3];
                    break;
                }
                i3++;
            }
            if (cd2Var == null) {
                C3386nv.m17633t("Missing profile key: ".concat(str));
                return null;
            }
            cd2Var.f9908d = jM11631E;
            int[] iArrM2599c = m2599c(byteArrayInputStream, iM11631E);
            if (Arrays.equals(bArr, b34.f7846g)) {
                cd2Var.f9909e = iM11631E;
                cd2Var.f9912h = iArrM2599c;
            }
        }
        return cd2VarArr;
    }

    /* JADX INFO: renamed from: g */
    public static cd2[] m2603g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, b34.f7843d)) {
            C3386nv.m17633t("Unsupported version");
            return null;
        }
        int iM11631E = (int) fa4.m11631E(fileInputStream, 1);
        byte[] bArrM11630D = fa4.m11630D(fileInputStream, (int) fa4.m11631E(fileInputStream, 4), (int) fa4.m11631E(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            C3386nv.m17633t("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM11630D);
        try {
            cd2[] cd2VarArrM2604h = m2604h(byteArrayInputStream, str, iM11631E);
            byteArrayInputStream.close();
            return cd2VarArrM2604h;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public static cd2[] m2604h(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new cd2[0];
        }
        cd2[] cd2VarArr = new cd2[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iM11631E = (int) fa4.m11631E(byteArrayInputStream, 2);
            int iM11631E2 = (int) fa4.m11631E(byteArrayInputStream, 2);
            cd2VarArr[i3] = new cd2(str, new String(fa4.m11629C(byteArrayInputStream, iM11631E), StandardCharsets.UTF_8), fa4.m11631E(byteArrayInputStream, 4), iM11631E2, (int) fa4.m11631E(byteArrayInputStream, 4), (int) fa4.m11631E(byteArrayInputStream, 4), new int[iM11631E2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            cd2 cd2Var = cd2VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = cd2Var.f9910f;
            int i6 = cd2Var.f9911g;
            TreeMap treeMap = cd2Var.f9913i;
            int i7 = iAvailable - i5;
            int iM11631E3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iM11631E3 += (int) fa4.m11631E(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM11631E3), 1);
                int iM11631E4 = (int) fa4.m11631E(byteArrayInputStream, 2);
                while (iM11631E4 > 0) {
                    fa4.m11631E(byteArrayInputStream, 2);
                    int iM11631E5 = (int) fa4.m11631E(byteArrayInputStream, 1);
                    if (iM11631E5 != 6 && iM11631E5 != 7) {
                        while (iM11631E5 > 0) {
                            fa4.m11631E(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iM11631E6 = (int) fa4.m11631E(byteArrayInputStream, 1); iM11631E6 > 0; iM11631E6--) {
                                fa4.m11631E(byteArrayInputStream, 2);
                            }
                            iM11631E5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iM11631E4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                C3386nv.m17633t("Read too much data during profile line parse");
                return null;
            }
            cd2Var.f9912h = m2599c(byteArrayInputStream, cd2Var.f9909e);
            BitSet bitSetValueOf = BitSet.valueOf(fa4.m11629C(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return cd2VarArr;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m2605i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, cd2[] cd2VarArr) throws IOException {
        int length;
        byte[] bArr2 = b34.f7846g;
        byte[] bArr3 = b34.f7845f;
        byte[] bArr4 = b34.f7842c;
        int i = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = b34.f7843d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM2597a = m2597a(cd2VarArr, bArr5);
                fa4.m11638L(byteArrayOutputStream, cd2VarArr.length, 1);
                fa4.m11638L(byteArrayOutputStream, bArrM2597a.length, 4);
                byte[] bArrM11653o = fa4.m11653o(bArrM2597a);
                fa4.m11638L(byteArrayOutputStream, bArrM11653o.length, 4);
                byteArrayOutputStream.write(bArrM11653o);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                fa4.m11638L(byteArrayOutputStream, cd2VarArr.length, 1);
                for (cd2 cd2Var : cd2VarArr) {
                    int size = cd2Var.f9913i.size() * 4;
                    String strM2598b = m2598b(cd2Var.f9905a, cd2Var.f9906b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    fa4.m11639M(byteArrayOutputStream, strM2598b.getBytes(charset).length);
                    fa4.m11639M(byteArrayOutputStream, cd2Var.f9912h.length);
                    fa4.m11638L(byteArrayOutputStream, size, 4);
                    fa4.m11638L(byteArrayOutputStream, cd2Var.f9907c, 4);
                    byteArrayOutputStream.write(strM2598b.getBytes(charset));
                    Iterator it = cd2Var.f9913i.keySet().iterator();
                    while (it.hasNext()) {
                        fa4.m11639M(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        fa4.m11639M(byteArrayOutputStream, 0);
                    }
                    for (int i2 : cd2Var.f9912h) {
                        fa4.m11639M(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr6 = b34.f7844e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrM2597a2 = m2597a(cd2VarArr, bArr6);
                fa4.m11638L(byteArrayOutputStream, cd2VarArr.length, 1);
                fa4.m11638L(byteArrayOutputStream, bArrM2597a2.length, 4);
                byte[] bArrM11653o2 = fa4.m11653o(bArrM2597a2);
                fa4.m11638L(byteArrayOutputStream, bArrM11653o2.length, 4);
                byteArrayOutputStream.write(bArrM11653o2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            fa4.m11639M(byteArrayOutputStream, cd2VarArr.length);
            for (cd2 cd2Var2 : cd2VarArr) {
                String str = cd2Var2.f9905a;
                TreeMap treeMap = cd2Var2.f9913i;
                String strM2598b2 = m2598b(str, cd2Var2.f9906b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                fa4.m11639M(byteArrayOutputStream, strM2598b2.getBytes(charset2).length);
                fa4.m11639M(byteArrayOutputStream, treeMap.size());
                fa4.m11639M(byteArrayOutputStream, cd2Var2.f9912h.length);
                fa4.m11638L(byteArrayOutputStream, cd2Var2.f9907c, 4);
                byteArrayOutputStream.write(strM2598b2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    fa4.m11639M(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : cd2Var2.f9912h) {
                    fa4.m11639M(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            fa4.m11639M(byteArrayOutputStream2, cd2VarArr.length);
            int i4 = 2;
            int i5 = 2;
            for (cd2 cd2Var3 : cd2VarArr) {
                fa4.m11638L(byteArrayOutputStream2, cd2Var3.f9907c, 4);
                fa4.m11638L(byteArrayOutputStream2, cd2Var3.f9908d, 4);
                fa4.m11638L(byteArrayOutputStream2, cd2Var3.f9911g, 4);
                String strM2598b3 = m2598b(cd2Var3.f9905a, cd2Var3.f9906b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM2598b3.getBytes(charset3).length;
                fa4.m11639M(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM2598b3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C0724b c0724b = new C0724b(FileSectionType.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c0724b);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < cd2VarArr.length; i7++) {
                try {
                    cd2 cd2Var4 = cd2VarArr[i7];
                    fa4.m11639M(byteArrayOutputStream3, i7);
                    fa4.m11639M(byteArrayOutputStream3, cd2Var4.f9909e);
                    i6 = i6 + 4 + (cd2Var4.f9909e * i4);
                    int[] iArr = cd2Var4.f9912h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        fa4.m11639M(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i4 = i4;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            C0724b c0724b2 = new C0724b(FileSectionType.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c0724b2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < cd2VarArr.length) {
                try {
                    cd2 cd2Var5 = cd2VarArr[i11];
                    Iterator it3 = cd2Var5.f9913i.entrySet().iterator();
                    int iIntValue = i;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m2608l(byteArrayOutputStream5, iIntValue, cd2Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m2609m(byteArrayOutputStream6, cd2Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            fa4.m11639M(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            fa4.m11638L(byteArrayOutputStream4, length4, 4);
                            fa4.m11639M(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            i = 0;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C0724b c0724b3 = new C0724b(FileSectionType.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c0724b3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            fa4.m11638L(byteArrayOutputStream, arrayList.size(), 4);
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                C0724b c0724b4 = (C0724b) arrayList.get(i14);
                FileSectionType fileSectionType = c0724b4.f6562a;
                byte[] bArr7 = c0724b4.f6563b;
                fa4.m11638L(byteArrayOutputStream, fileSectionType.getValue(), 4);
                fa4.m11638L(byteArrayOutputStream, size2, 4);
                if (c0724b4.f6564c) {
                    long length5 = bArr7.length;
                    byte[] bArrM11653o3 = fa4.m11653o(bArr7);
                    arrayList2.add(bArrM11653o3);
                    fa4.m11638L(byteArrayOutputStream, bArrM11653o3.length, 4);
                    fa4.m11638L(byteArrayOutputStream, length5, 4);
                    length = bArrM11653o3.length;
                } else {
                    arrayList2.add(bArr7);
                    fa4.m11638L(byteArrayOutputStream, bArr7.length, 4);
                    fa4.m11638L(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i15));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m2606j(ByteArrayOutputStream byteArrayOutputStream, cd2 cd2Var) throws IOException {
        m2609m(byteArrayOutputStream, cd2Var);
        int i = cd2Var.f9911g;
        int[] iArr = cd2Var.f9912h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            fa4.m11639M(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cd2Var.f9913i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: k */
    public static void m2607k(ByteArrayOutputStream byteArrayOutputStream, cd2 cd2Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        fa4.m11639M(byteArrayOutputStream, str.getBytes(charset).length);
        fa4.m11639M(byteArrayOutputStream, cd2Var.f9909e);
        fa4.m11638L(byteArrayOutputStream, cd2Var.f9910f, 4);
        fa4.m11638L(byteArrayOutputStream, cd2Var.f9907c, 4);
        fa4.m11638L(byteArrayOutputStream, cd2Var.f9911g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: l */
    public static void m2608l(ByteArrayOutputStream byteArrayOutputStream, int i, cd2 cd2Var) throws IOException {
        int i2 = cd2Var.f9911g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cd2Var.f9913i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: m */
    public static void m2609m(ByteArrayOutputStream byteArrayOutputStream, cd2 cd2Var) throws IOException {
        int i = 0;
        for (Map.Entry entry : cd2Var.f9913i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                fa4.m11639M(byteArrayOutputStream, iIntValue - i);
                fa4.m11639M(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
