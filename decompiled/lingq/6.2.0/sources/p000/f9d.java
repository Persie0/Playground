package p000;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import okhttp3.internal.publicsuffix.C3415c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f9d {
    /* JADX INFO: renamed from: a */
    public static int m11620a(int i, int i2, String str, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static MappedByteBuffer m11621b(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0069  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3 A[EDGE_INSN: B:97:0x01d3->B:109:0x01ff BREAK  A[LOOP:1: B:17:0x008b->B:64:0x0158]] */
    /* JADX INFO: renamed from: c */
    public static List m11622c(ex3 ex3Var, qr3 qr3Var) {
        List listUnmodifiableList;
        gm1 gm1Var;
        String strSubstring;
        ex3Var.getClass();
        qr3Var.getClass();
        List listM20125i = qr3Var.m20125i("Set-Cookie");
        int size = listM20125i.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            String str = (String) listM20125i.get(i);
            str.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = icb.f43946a;
            char c = ';';
            int iM13769e = icb.m13769e(str, ';', 0, str.length());
            char c2 = '=';
            int iM13769e2 = icb.m13769e(str, '=', 0, iM13769e);
            if (iM13769e2 == iM13769e) {
                gm1Var = null;
            } else {
                int iM13773i = icb.m13773i(0, str, iM13769e2);
                String strSubstring2 = str.substring(iM13773i, icb.m13774j(iM13773i, str, iM13769e2));
                if (strSubstring2.length() != 0 && icb.m13772h(strSubstring2) == -1) {
                    int iM13773i2 = icb.m13773i(iM13769e2 + 1, str, iM13769e);
                    String strSubstring3 = str.substring(iM13773i2, icb.m13774j(iM13773i2, str, iM13769e));
                    if (icb.m13772h(strSubstring3) == -1) {
                        int i2 = iM13769e + 1;
                        int length = str.length();
                        long j = 253402300799999L;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        long jM11623d = 253402300799999L;
                        String str2 = null;
                        String strSubstring4 = null;
                        long j2 = -1;
                        boolean z4 = true;
                        String str3 = null;
                        while (true) {
                            if (i2 >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                        j = j3;
                                    }
                                } else {
                                    j = jM11623d;
                                }
                                String str4 = ex3Var.f38027d;
                                if (str2 == null) {
                                    str2 = str4;
                                } else if (!fa4.m11650l(str4, str2) && (!cl9.m4833P(str4, str2, false) || str4.charAt((str4.length() - str2.length()) - 1) != '.' || gcb.f40555a.m15427f(str4))) {
                                    gm1Var = null;
                                    break;
                                }
                                if (str4.length() != str2.length() && C3415c.f54511d.m18070a(str2) == null) {
                                    gm1Var = null;
                                    break;
                                }
                                if (strSubstring4 == null || !cl9.m4842Y(strSubstring4, "/", false)) {
                                    String strM11376b = ex3Var.m11376b();
                                    int iM23393p0 = vk9.m23393p0(strM11376b, '/', 0, 6);
                                    strSubstring4 = iM23393p0 != 0 ? strM11376b.substring(0, iM23393p0) : "/";
                                }
                                gm1Var = new gm1(strSubstring2, strSubstring3, j, str2, strSubstring4, z3, z, z2, z4, str3);
                                break;
                            }
                            int iM13769e3 = icb.m13769e(str, c, i2, length);
                            int iM13769e4 = icb.m13769e(str, c2, i2, iM13769e3);
                            int iM13773i3 = icb.m13773i(i2, str, iM13769e4);
                            String strSubstring5 = str.substring(iM13773i3, icb.m13774j(iM13773i3, str, iM13769e4));
                            if (iM13769e4 < iM13769e3) {
                                int iM13773i4 = icb.m13773i(iM13769e4 + 1, str, iM13769e3);
                                strSubstring = str.substring(iM13773i4, icb.m13774j(iM13773i4, str, iM13769e3));
                            } else {
                                strSubstring = "";
                            }
                            if (strSubstring5.equalsIgnoreCase("expires")) {
                                try {
                                    jM11623d = m11623d(strSubstring.length(), strSubstring);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (strSubstring5.equalsIgnoreCase("max-age")) {
                                try {
                                    j2 = Long.parseLong(strSubstring);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    if (!new Regex("-?\\d+").m15427f(strSubstring)) {
                                        throw e;
                                    }
                                    j2 = cl9.m4842Y(strSubstring, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                }
                                z2 = true;
                            } else if (strSubstring5.equalsIgnoreCase("domain")) {
                                if (cl9.m4833P(strSubstring, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String strM12480b = gcb.m12480b(vk9.m23398u0(strSubstring, "."));
                                if (strM12480b == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = strM12480b;
                                z4 = false;
                            } else if (strSubstring5.equalsIgnoreCase("path")) {
                                strSubstring4 = strSubstring;
                            } else if (strSubstring5.equalsIgnoreCase("secure")) {
                                z3 = true;
                            } else if (strSubstring5.equalsIgnoreCase("httponly")) {
                                z = true;
                            } else if (strSubstring5.equalsIgnoreCase("samesite")) {
                                str3 = strSubstring;
                            }
                            i2 = iM13769e3 + 1;
                            c = ';';
                            c2 = '=';
                        }
                    } else {
                        gm1Var = null;
                    }
                } else {
                    gm1Var = null;
                }
            }
            if (gm1Var != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(gm1Var);
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            listUnmodifiableList.getClass();
        } else {
            listUnmodifiableList = null;
        }
        return listUnmodifiableList == null ? EmptyList.f47638a : listUnmodifiableList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX INFO: renamed from: d */
    public static long m11623d(int i, String str) {
        int iM11620a = m11620a(0, i, str, false);
        Matcher matcher = gm1.f40994n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int iM23389l0 = -1;
        int i5 = -1;
        int i6 = -1;
        while (iM11620a < i) {
            int iM11620a2 = m11620a(iM11620a + 1, i, str, true);
            matcher.region(iM11620a, iM11620a2);
            if (i3 == -1 && matcher.usePattern(gm1.f40994n).matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                i3 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                strGroup2.getClass();
                i5 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                strGroup3.getClass();
                i6 = Integer.parseInt(strGroup3);
            } else if (i4 == -1 && matcher.usePattern(gm1.f40993m).matches()) {
                String strGroup4 = matcher.group(1);
                strGroup4.getClass();
                i4 = Integer.parseInt(strGroup4);
            } else if (iM23389l0 == -1) {
                Pattern pattern = gm1.f40992l;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = strGroup5.toLowerCase(locale);
                    lowerCase.getClass();
                    String strPattern = pattern.pattern();
                    strPattern.getClass();
                    iM23389l0 = vk9.m23389l0(strPattern, lowerCase, 0, false, 6) / 4;
                } else if (i2 != -1 && matcher.usePattern(gm1.f40991k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
            } else if (i2 != -1) {
            }
            iM11620a = m11620a(iM11620a2 + 1, i, str, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        if (iM23389l0 == -1) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        if (1 > i4 || i4 >= 32) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        if (i3 < 0 || i3 >= 24) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        if (i5 < 0 || i5 >= 60) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        if (i6 < 0 || i6 >= 60) {
            C3386nv.m17626m("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(kcb.f47051a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, iM23389l0 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i5);
        gregorianCalendar.set(13, i6);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }
}
