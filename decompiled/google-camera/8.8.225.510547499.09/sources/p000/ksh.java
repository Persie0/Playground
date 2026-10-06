package p000;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ksh {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f37114a = 0;

    static {
        try {
            bff.f3083a.m5628e("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (bfc e) {
            Log.e("XmpUtil", "Could not register pano namespace!");
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m14795a(List list, byte[] bArr) {
        int length = bArr.length;
        if (length > 65502) {
            Log.e("XmpUtil", "The standard XMP section cannot have a size larger than 65502 bytes.");
            return -1;
        }
        byte[] bArr2 = new byte[length + 29];
        int i = 0;
        m14810p(bArr, 0, bArr2, m14810p("http://ns.adobe.com/xap/1.0/\u0000".getBytes(StandardCharsets.UTF_8), 0, bArr2, 0));
        mom momVarM14814t = m14814t(bArr2);
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (((mom) list.get(i2)).f41198c == 225 && m14809o((mom) list.get(i2), "http://ns.adobe.com/xap/1.0/\u0000")) {
                list.set(i2, momVarM14814t);
                return i2;
            }
        }
        if (!list.isEmpty() && ((mom) list.get(0)).f41198c == 225) {
            i = 1;
        }
        list.add(i, momVarM14814t);
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static bfd m14796b(bfd bfdVar, bfd bfdVar2) {
        if (bfdVar == null) {
            return bfdVar2;
        }
        if (bfdVar2 != null) {
            try {
                bfp bfpVarMo2295f = bfdVar2.mo2295f();
                while (true) {
                    Object next = bfpVarMo2295f.next();
                    next.getClass();
                    bfm bfmVar = (bfm) next;
                    String str = bfmVar.f3107b;
                    if (str != null) {
                        bfdVar.mo2293d(bfmVar.f3106a, str, bfmVar.f3108c, bfmVar.m2318a());
                    }
                }
            } catch (Exception e) {
            }
        }
        return bfdVar;
    }

    /* JADX INFO: renamed from: c */
    public static mrm m14797c(String str) {
        if (mro.m16832b(str)) {
            return mqu.f41450a;
        }
        try {
            cvy cvyVar = bff.f3083a;
            return mrm.m16829i(bfs.m2325a(str));
        } catch (bfc e) {
            Log.e("XmpUtil", "String was not a serialized XMPMeta.");
            return mqu.f41450a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static mrn m14798d(byte[] bArr, bfd bfdVar) {
        Object obj;
        Object obj2;
        mrn mrnVarM14799e = m14799e(new kse(bArr));
        bfd bfdVarM2301a = (mrnVarM14799e == null || (obj2 = mrnVarM14799e.f41479a) == null) ? bff.m2301a() : (bfd) obj2;
        bfd bfdVar2 = null;
        if (mrnVarM14799e != null && (obj = mrnVarM14799e.f41480b) != null) {
            bfdVar2 = (bfd) obj;
        }
        return mrn.m16830a(bfdVarM2301a, m14796b(bfdVar2, bfdVar));
    }

    /* JADX INFO: renamed from: e */
    public static mrn m14799e(ksg ksgVar) {
        bfd bfdVarM2325a;
        List<mom> listM14800f = m14800f(ksgVar, true, false);
        bfd bfdVarM14811q = m14811q(listM14800f);
        if (bfdVarM14811q == null) {
            return null;
        }
        if (!bfdVarM14811q.mo2294e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return mrn.m16830a(bfdVarM14811q, null);
        }
        try {
            String str = "http://ns.adobe.com/xmp/extension/\u0000" + ((String) ((bfq) bfdVarM14811q.mo2290a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).f3125a) + "\u0000";
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int iMax = 0;
            for (mom momVar : listM14800f) {
                if (m14809o(momVar, str)) {
                    int i = momVar.f41196a;
                    int length = str.length() + i;
                    int i2 = i + momVar.f41197b;
                    int i3 = length + 7;
                    iMax += Math.max(0, i2 - i3);
                    arrayList.add(momVar);
                    arrayList2.add(Integer.valueOf(i3));
                    arrayList3.add(Integer.valueOf(i2));
                }
            }
            if (iMax == 0) {
                bfdVarM2325a = null;
            } else {
                byte[] bArr = new byte[iMax];
                int i4 = 0;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    mom momVar2 = (mom) arrayList.get(i5);
                    int iIntValue = ((Integer) arrayList2.get(i5)).intValue();
                    int iIntValue2 = ((Integer) arrayList3.get(i5)).intValue() - iIntValue;
                    System.arraycopy(momVar2.f41199d, iIntValue, bArr, i4, iIntValue2);
                    i4 += iIntValue2;
                }
                try {
                    cvy cvyVar = bff.f3083a;
                    bfdVarM2325a = bfs.m2325a(bArr);
                } catch (bfc e) {
                    bfdVarM2325a = null;
                }
            }
            if (bfdVarM2325a == null) {
                return null;
            }
            return mrn.m16830a(bfdVarM14811q, bfdVarM2325a);
        } catch (bfc e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static List m14800f(ksg ksgVar, boolean z, boolean z2) {
        int iMo14791a;
        ArrayList arrayList = new ArrayList();
        try {
            if (ksgVar.mo14791a() == 255 && ksgVar.mo14791a() == 216) {
                while (true) {
                    int iMo14791a2 = ksgVar.mo14791a();
                    if (iMo14791a2 == -1 || iMo14791a2 != 255) {
                        break;
                    }
                    do {
                        iMo14791a = ksgVar.mo14791a();
                    } while (iMo14791a == 255);
                    if (iMo14791a == -1) {
                        return arrayList;
                    }
                    if (iMo14791a == 218) {
                        if (!z) {
                            arrayList.add(ksgVar.mo14794d());
                        }
                        return arrayList;
                    }
                    int iMo14791a3 = ksgVar.mo14791a();
                    int iMo14791a4 = ksgVar.mo14791a();
                    if (iMo14791a3 != -1 && iMo14791a4 != -1) {
                        int i = (iMo14791a3 << 8) | iMo14791a4;
                        if (!z || iMo14791a == 225) {
                            mom momVarMo14793c = ksgVar.mo14793c(i - 2, iMo14791a);
                            if (!m14809o(momVarMo14793c, "http://ns.adobe.com/xmp/extension/\u0000") || !z2) {
                                arrayList.add(momVarMo14793c);
                            }
                        } else {
                            ksgVar.mo14792b(i - 2);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m14801g(OutputStream outputStream, List list) throws IOException {
        outputStream.write(255);
        outputStream.write(216);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mom momVar = (mom) it.next();
            outputStream.write(255);
            outputStream.write(momVar.f41198c);
            if (momVar.f41198c != 218) {
                int iM16710a = momVar.m16710a() >> 8;
                int iM16710a2 = momVar.m16710a() & 255;
                outputStream.write(iM16710a);
                outputStream.write(iM16710a2);
            }
            outputStream.write((byte[]) momVar.f41199d, momVar.f41196a, momVar.f41197b);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m14802h(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        return lowerCase.endsWith(".jpg") || lowerCase.endsWith(".jpeg") || lowerCase.endsWith(".rgbz");
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m14803i(bfd bfdVar) {
        try {
            bgf bgfVar = new bgf();
            bgfVar.m2382f(64, true);
            bgfVar.m2382f(16, true);
            bff.m2302b(bfdVar);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
            C0137dp.m6527x((bfr) bfdVar, byteArrayOutputStream, bgfVar);
            return byteArrayOutputStream.toByteArray();
        } catch (bfc e) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m14804j(bfd bfdVar, String str) {
        try {
            bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "GCamera");
            bfdVar.mo2296g("SpecialTypeID", new bge(512), str, new bge());
        } catch (bfc e) {
            Log.e("XmpUtil", "exception while appending special type id ".concat(String.valueOf(e.getMessage())));
        }
    }

    /* JADX INFO: renamed from: k */
    public static bfd m14805k(InputStream inputStream) {
        return m14806l(new ksf(inputStream));
    }

    /* JADX INFO: renamed from: l */
    public static bfd m14806l(ksg ksgVar) {
        bfd bfdVarM14811q = m14811q(m14800f(ksgVar, true, true));
        if (bfdVarM14811q == null || !bfdVarM14811q.mo2294e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return bfdVarM14811q;
        }
        try {
            return bfdVarM14811q;
        } catch (bfc e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m14807m(byte[] bArr, OutputStream outputStream, bfd bfdVar, bfd bfdVar2) {
        m14808n(new kse(bArr), outputStream, bfdVar, bfdVar2);
    }

    /* JADX INFO: renamed from: n */
    public static void m14808n(ksg ksgVar, OutputStream outputStream, bfd bfdVar, bfd bfdVar2) {
        byte[] bArrM14803i;
        if (bfdVar == null) {
            return;
        }
        if (bfdVar2 != null) {
            bArrM14803i = m14803i(bfdVar2);
            if (bArrM14803i == null) {
                return;
            }
            try {
                bfdVar.mo2292c("http://ns.adobe.com/xmp/note/", "HasExtendedXMP", m14812r(bArrM14803i));
            } catch (bfc e) {
                return;
            }
        } else {
            bArrM14803i = null;
        }
        byte[] bArrM14803i2 = m14803i(bfdVar);
        if (bArrM14803i2 == null) {
            return;
        }
        if (bfdVar2 != null) {
            bfdVar.mo2297h();
        }
        List listM14800f = m14800f(ksgVar, false, false);
        int iM14795a = m14795a(listM14800f, bArrM14803i2);
        if (iM14795a < 0) {
            return;
        }
        if (bArrM14803i != null) {
            int i = iM14795a + 1;
            mkv.m16521ac(listM14800f, jmb.f34348c);
            String strValueOf = String.valueOf(m14812r(bArrM14803i));
            ArrayList arrayList = new ArrayList();
            int length = bArrM14803i.length;
            String strConcat = "http://ns.adobe.com/xmp/extension/\u0000".concat(strValueOf);
            int length2 = strConcat.length() + 8;
            int i2 = (length / (65458 - length2)) + 1;
            int iM14810p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                int length3 = bArrM14803i.length;
                byte[] bArr = new byte[Math.min((length3 - iM14810p) + length2, 65458)];
                int iM14810p2 = m14810p(strConcat.getBytes(StandardCharsets.UTF_8), 0, bArr, 0);
                int iM14810p3 = iM14810p2 + m14810p(m14813s(length3), 0, bArr, iM14810p2);
                iM14810p += m14810p(bArrM14803i, iM14810p, bArr, iM14810p3 + m14810p(m14813s(iM14810p), 0, bArr, iM14810p3));
                arrayList.add(m14814t(bArr));
            }
            listM14800f.addAll(i, arrayList);
        }
        try {
            m14801g(outputStream, listM14800f);
        } catch (IOException e2) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static boolean m14809o(mom momVar, String str) {
        if (momVar != null) {
            if (momVar.f41197b >= str.length()) {
                try {
                    byte[] bArr = new byte[str.length()];
                    System.arraycopy(momVar.f41199d, momVar.f41196a, bArr, 0, str.length());
                    return new String(bArr, "UTF-8").equals(str);
                } catch (UnsupportedEncodingException e) {
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    private static int m14810p(byte[] bArr, int i, byte[] bArr2, int i2) {
        int iMin = Math.min(bArr.length - i, bArr2.length - i2);
        System.arraycopy(bArr, i, bArr2, i2, iMin);
        return iMin;
    }

    /* JADX INFO: renamed from: q */
    private static bfd m14811q(List list) {
        int i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mom momVar = (mom) it.next();
            if (m14809o(momVar, "http://ns.adobe.com/xap/1.0/\u0000")) {
                int i2 = momVar.f41197b - 1;
                while (true) {
                    if (i2 <= 0) {
                        i = momVar.f41197b;
                        break;
                    }
                    int i3 = momVar.f41196a + i2;
                    byte[] bArr = (byte[]) momVar.f41199d;
                    if (bArr[i3] == 62 && bArr[i3 - 1] != 63) {
                        i = i2 + 1;
                        break;
                    }
                    i2--;
                }
                int i4 = i - 29;
                byte[] bArr2 = new byte[i4];
                System.arraycopy(momVar.f41199d, momVar.f41196a + 29, bArr2, 0, i4);
                try {
                    cvy cvyVar = bff.f3083a;
                    return bfs.m2325a(bArr2);
                } catch (bfc e) {
                    break;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    private static String m14812r(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int length = bArrDigest.length;
            StringBuilder sb = new StringBuilder(length + length);
            Formatter formatter = new Formatter(sb);
            int i = 0;
            for (byte b : bArrDigest) {
                formatter.format("%02x", Byte.valueOf(b));
            }
            formatter.close();
            String string = sb.toString();
            int length2 = string.length();
            while (i < length2) {
                if (mpw.m16771j(string.charAt(i))) {
                    char[] charArray = string.toCharArray();
                    while (i < length2) {
                        char c = charArray[i];
                        if (mpw.m16771j(c)) {
                            charArray[i] = (char) (c ^ ' ');
                        }
                        i++;
                    }
                    return String.valueOf(charArray);
                }
                i++;
            }
            return string;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: s */
    private static byte[] m14813s(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    /* JADX INFO: renamed from: t */
    private static mom m14814t(byte[] bArr) {
        return new mom(bArr, 225, 0, bArr.length);
    }
}
