package p000;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.common.primitives.AbstractC1110a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class dg9 implements cn9 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f35623g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    public final boolean f35624a;

    /* JADX INFO: renamed from: b */
    public final kn2 f35625b;

    /* JADX INFO: renamed from: d */
    public LinkedHashMap f35627d;

    /* JADX INFO: renamed from: e */
    public float f35628e = -3.4028235E38f;

    /* JADX INFO: renamed from: f */
    public float f35629f = -3.4028235E38f;

    /* JADX INFO: renamed from: c */
    public final k47 f35626c = new k47();

    public dg9(List list) {
        if (list == null || list.isEmpty()) {
            this.f35624a = false;
            this.f35625b = null;
            return;
        }
        this.f35624a = true;
        byte[] bArr = (byte[]) list.get(0);
        Charset charset = StandardCharsets.UTF_8;
        String str = new String(bArr, charset);
        bna.m3969q(str.startsWith("Format:"));
        kn2 kn2VarM15338a = kn2.m15338a(str);
        kn2VarM15338a.getClass();
        this.f35625b = kn2VarM15338a;
        m10370b(new k47((byte[]) list.get(1)), charset);
    }

    /* JADX INFO: renamed from: a */
    public static int m10368a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i, Long.valueOf(j));
        arrayList2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static long m10369c(String str) {
        Matcher matcher = f35623g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        String str2 = uma.f64080a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public final void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        Charset charset;
        int i3;
        float f;
        int i4;
        Layout.Alignment alignment;
        int i5;
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        int i8;
        int i9;
        float f5;
        int i10;
        int i11;
        float f6;
        int i12;
        int iM12587a;
        int i13;
        dg9 dg9Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        k47 k47Var = dg9Var.f35626c;
        k47Var.m14816K(i + i2, bArr);
        k47Var.m14818M(i);
        Charset charsetM14814I = k47Var.m14814I();
        if (charsetM14814I == null) {
            charsetM14814I = StandardCharsets.UTF_8;
        }
        boolean z = dg9Var.f35624a;
        if (!z) {
            dg9Var.m10370b(k47Var, charsetM14814I);
        }
        kn2 kn2VarM15338a = z ? dg9Var.f35625b : null;
        while (true) {
            String strM14830n = k47Var.m14830n(charsetM14814I);
            int i14 = 0;
            if (strM14830n == null) {
                while (i14 < arrayList.size()) {
                    List list = (List) arrayList.get(i14);
                    if (!list.isEmpty() || i14 == 0) {
                        if (i14 == arrayList.size() - 1) {
                            uk9.m22770c();
                            return;
                        } else {
                            long jLongValue = ((Long) arrayList2.get(i14)).longValue();
                            kk1Var.accept(new gs1(jLongValue, ((Long) arrayList2.get(i14 + 1)).longValue() - jLongValue, list));
                        }
                    }
                    i14++;
                }
                return;
            }
            if (strM14830n.startsWith("Format:")) {
                kn2VarM15338a = kn2.m15338a(strM14830n);
            } else {
                if (strM14830n.startsWith("Dialogue:")) {
                    if (kn2VarM15338a == null) {
                        ss5.m21707d0("SsaParser", "Skipping dialogue line before complete format: ".concat(strM14830n));
                    } else {
                        int i15 = kn2VarM15338a.f47540f;
                        bna.m3969q(strM14830n.startsWith("Dialogue:"));
                        String strSubstring = strM14830n.substring(9);
                        int i16 = kn2VarM15338a.f47535a;
                        String[] strArrSplit = strSubstring.split(",", i15);
                        if (strArrSplit.length != i15) {
                            ss5.m21707d0("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM14830n));
                        } else {
                            if (i16 != -1) {
                                try {
                                    i14 = Integer.parseInt(strArrSplit[i16].trim());
                                } catch (RuntimeException unused) {
                                    ss5.m21707d0("SsaParser", "Fail to parse layer: " + strArrSplit[i16]);
                                }
                            }
                            int i17 = i14;
                            long jM10369c = m10369c(strArrSplit[kn2VarM15338a.f47536b]);
                            if (jM10369c == -9223372036854775807L) {
                                ss5.m21707d0("SsaParser", "Skipping invalid timing: ".concat(strM14830n));
                            } else {
                                long jM10369c2 = m10369c(strArrSplit[kn2VarM15338a.f47537c]);
                                if (jM10369c2 == -9223372036854775807L || jM10369c2 <= jM10369c) {
                                    charset = charsetM14814I;
                                    kn2VarM15338a = kn2VarM15338a;
                                    k47Var = k47Var;
                                    ss5.m21707d0("SsaParser", "Skipping invalid timing: ".concat(strM14830n));
                                } else {
                                    LinkedHashMap linkedHashMap = dg9Var.f35627d;
                                    gg9 gg9Var = (linkedHashMap == null || (i13 = kn2VarM15338a.f47538d) == -1) ? null : (gg9) linkedHashMap.get(strArrSplit[i13].trim());
                                    String str = strArrSplit[kn2VarM15338a.f47539e];
                                    Matcher matcher = fg9.f39080a.matcher(str);
                                    int i18 = -1;
                                    PointF pointF = null;
                                    while (matcher.find()) {
                                        Charset charset2 = charsetM14814I;
                                        String strGroup = matcher.group(1);
                                        strGroup.getClass();
                                        try {
                                            PointF pointFM11828a = fg9.m11828a(strGroup);
                                            if (pointFM11828a != null) {
                                                pointF = pointFM11828a;
                                            }
                                        } catch (RuntimeException unused2) {
                                        }
                                        try {
                                            Matcher matcher2 = fg9.f39083d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                String strGroup2 = matcher2.group(1);
                                                strGroup2.getClass();
                                                iM12587a = gg9.m12587a(strGroup2);
                                            } else {
                                                iM12587a = -1;
                                            }
                                            if (iM12587a != -1) {
                                                i18 = iM12587a;
                                            }
                                        } catch (RuntimeException unused3) {
                                        }
                                        charsetM14814I = charset2;
                                    }
                                    charset = charsetM14814I;
                                    String strReplace = fg9.f39080a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = dg9Var.f35628e;
                                    float f8 = dg9Var.f35629f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    float f9 = -3.4028235E38f;
                                    if (gg9Var != null) {
                                        boolean z2 = gg9Var.f40781g;
                                        Integer num = gg9Var.f40778d;
                                        Integer num2 = gg9Var.f40777c;
                                        if (num2 != null) {
                                            i8 = 33;
                                            i9 = 0;
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 33;
                                            i9 = 0;
                                        }
                                        if (gg9Var.f40784j == 3 && num != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i9, spannableString.length(), i8);
                                        }
                                        float f10 = gg9Var.f40779e;
                                        if (f10 == -3.4028235E38f || f8 == -3.4028235E38f) {
                                            f5 = -3.4028235E38f;
                                            i10 = Integer.MIN_VALUE;
                                        } else {
                                            f5 = f10 / f8;
                                            i10 = 1;
                                        }
                                        boolean z3 = gg9Var.f40780f;
                                        if (z3 && z2) {
                                            i11 = i10;
                                            f6 = f5;
                                            i12 = 33;
                                            i3 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i11 = i10;
                                            f6 = f5;
                                            i12 = 33;
                                            i3 = 0;
                                            if (z3) {
                                                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                            } else if (z2 != 0) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        }
                                        if (gg9Var.f40782h) {
                                            spannableString.setSpan(new UnderlineSpan(), i3, spannableString.length(), i12);
                                        }
                                        if (gg9Var.f40783i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i3, spannableString.length(), i12);
                                        }
                                        i4 = i11;
                                        f = f6;
                                    } else {
                                        kn2VarM15338a = kn2VarM15338a;
                                        k47Var = k47Var;
                                        i3 = 0;
                                        f = -3.4028235E38f;
                                        i4 = Integer.MIN_VALUE;
                                    }
                                    int i19 = -1;
                                    if (i18 != -1) {
                                        i19 = i18;
                                    } else if (gg9Var != null) {
                                        i19 = gg9Var.f40776b;
                                    }
                                    switch (i19) {
                                        case 0:
                                        default:
                                            hn1.m13364n("Unknown alignment: ", i19, "SsaParser");
                                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    int i20 = Integer.MIN_VALUE;
                                    switch (i19) {
                                        case 0:
                                        default:
                                            hn1.m13364n("Unknown alignment: ", i19, "SsaParser");
                                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i5 = i3;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i5 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i5 = 2;
                                            break;
                                    }
                                    switch (i19) {
                                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                            break;
                                        case 0:
                                        default:
                                            hn1.m13364n("Unknown alignment: ", i19, "SsaParser");
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i20 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i20 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i20 = i3;
                                            break;
                                    }
                                    if (pointF == 0 || f8 == -3.4028235E38f || f7 == -3.4028235E38f) {
                                        if (i5 != 0) {
                                            i6 = 1;
                                            if (i5 != 1) {
                                                i7 = 2;
                                                f2 = i5 != 2 ? -3.4028235E38f : 0.95f;
                                            } else {
                                                i7 = 2;
                                                f2 = 0.5f;
                                            }
                                        } else {
                                            i6 = 1;
                                            i7 = 2;
                                            f2 = 0.05f;
                                        }
                                        if (i20 == 0) {
                                            f9 = 0.05f;
                                        } else if (i20 == i6) {
                                            f9 = 0.5f;
                                        } else if (i20 == i7) {
                                            f9 = 0.95f;
                                        }
                                        f3 = f9;
                                        f4 = f2;
                                    } else {
                                        float f11 = pointF.x / f7;
                                        f3 = pointF.y / f8;
                                        f4 = f11;
                                    }
                                    cs1 cs1Var = new cs1(spannableString, alignment, null, null, f3, i3, i20, f4, i5, i4, f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, i17);
                                    int iM10368a = m10368a(jM10369c2, arrayList2, arrayList);
                                    for (int iM10368a2 = m10368a(jM10369c, arrayList2, arrayList); iM10368a2 < iM10368a; iM10368a2++) {
                                        ((List) arrayList.get(iM10368a2)).add(cs1Var);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetM14814I;
                    kn2VarM15338a = kn2VarM15338a;
                    k47Var = k47Var;
                } else {
                    charset = charsetM14814I;
                    kn2VarM15338a = kn2VarM15338a;
                    k47Var = k47Var;
                }
                dg9Var = this;
                charsetM14814I = charset;
                kn2VarM15338a = kn2VarM15338a;
                k47Var = k47Var;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02e8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    public final void m10370b(k47 k47Var, Charset charset) {
        int i;
        gg9 gg9Var;
        while (true) {
            String strM14830n = k47Var.m14830n(charset);
            if (strM14830n == null) {
                return;
            }
            int i2 = 0;
            int i3 = 91;
            if ("[Script Info]".equalsIgnoreCase(strM14830n)) {
                while (true) {
                    String strM14830n2 = k47Var.m14830n(charset);
                    if (strM14830n2 == null) {
                        break;
                    }
                    if (k47Var.m14820a() != 0) {
                        int iM14824h = k47Var.m14824h(charset);
                        if ((iM14824h != 0 ? AbstractC1110a.m6362b(iM14824h >>> 8) : 1114112) == 91) {
                            break;
                        }
                    }
                    String[] strArrSplit = strM14830n2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM21625f0 = AbstractC3584sr.m21625f0(strArrSplit[0].trim());
                        strM21625f0.getClass();
                        if (strM21625f0.equals("playresx")) {
                            this.f35628e = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM21625f0.equals("playresy")) {
                            try {
                                this.f35629f = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM14830n)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                eg9 eg9Var = null;
                while (true) {
                    String strM14830n3 = k47Var.m14830n(charset);
                    if (strM14830n3 != null) {
                        if (k47Var.m14820a() != 0) {
                            int iM14824h2 = k47Var.m14824h(charset);
                            if ((iM14824h2 != 0 ? AbstractC1110a.m6362b(iM14824h2 >>> 8) : 1114112) == i3) {
                            }
                        }
                        int i4 = -1;
                        if (strM14830n3.startsWith("Format:")) {
                            String[] strArrSplit2 = TextUtils.split(strM14830n3.substring(7), ",");
                            int i5 = -1;
                            int i6 = -1;
                            int i7 = -1;
                            int i8 = -1;
                            int i9 = -1;
                            int i10 = -1;
                            int i11 = -1;
                            int i12 = -1;
                            int i13 = -1;
                            int i14 = -1;
                            for (int i15 = i2; i15 < strArrSplit2.length; i15++) {
                                String strM21625f1 = AbstractC3584sr.m21625f0(strArrSplit2[i15].trim());
                                strM21625f1.getClass();
                                switch (strM21625f1.hashCode()) {
                                    case -1178781136:
                                        i = strM21625f1.equals("italic") ? i2 : -1;
                                        break;
                                    case -1026963764:
                                        i = strM21625f1.equals("underline") ? 1 : -1;
                                        break;
                                    case -192095652:
                                        i = strM21625f1.equals("strikeout") ? 2 : -1;
                                        break;
                                    case -70925746:
                                        i = strM21625f1.equals("primarycolour") ? 3 : -1;
                                        break;
                                    case 3029637:
                                        i = strM21625f1.equals("bold") ? 4 : -1;
                                        break;
                                    case 3373707:
                                        i = strM21625f1.equals("name") ? 5 : -1;
                                        break;
                                    case 366554320:
                                        i = strM21625f1.equals("fontsize") ? 6 : -1;
                                        break;
                                    case 767321349:
                                        i = strM21625f1.equals("borderstyle") ? 7 : -1;
                                        break;
                                    case 1767875043:
                                        i = strM21625f1.equals("alignment") ? 8 : -1;
                                        break;
                                    case 1988365454:
                                        i = strM21625f1.equals("outlinecolour") ? 9 : -1;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                switch (i) {
                                    case 0:
                                        i11 = i15;
                                        break;
                                    case 1:
                                        i12 = i15;
                                        break;
                                    case 2:
                                        i13 = i15;
                                        break;
                                    case 3:
                                        i7 = i15;
                                        break;
                                    case 4:
                                        i10 = i15;
                                        break;
                                    case 5:
                                        i5 = i15;
                                        break;
                                    case 6:
                                        i9 = i15;
                                        break;
                                    case 7:
                                        i14 = i15;
                                        break;
                                    case 8:
                                        i6 = i15;
                                        break;
                                    case 9:
                                        i8 = i15;
                                        break;
                                }
                            }
                            eg9Var = i5 != -1 ? new eg9(i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, strArrSplit2.length) : null;
                        } else {
                            if (strM14830n3.startsWith("Style:")) {
                                if (eg9Var == null) {
                                    ss5.m21707d0("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM14830n3));
                                } else {
                                    bna.m3969q(strM14830n3.startsWith("Style:"));
                                    String[] strArrSplit3 = TextUtils.split(strM14830n3.substring(6), ",");
                                    int length = strArrSplit3.length;
                                    int i16 = eg9Var.f37221k;
                                    if (length != i16) {
                                        int length2 = strArrSplit3.length;
                                        String str = uma.f64080a;
                                        Locale locale = Locale.US;
                                        StringBuilder sbM22994q = ux5.m22994q(i16, length2, "Skipping malformed 'Style:' line (expected ", " values, found ", "): '");
                                        sbM22994q.append(strM14830n3);
                                        sbM22994q.append("'");
                                        ss5.m21707d0("SsaStyle", sbM22994q.toString());
                                    } else {
                                        try {
                                            String strTrim = strArrSplit3[eg9Var.f37211a].trim();
                                            int i17 = eg9Var.f37212b;
                                            int iM12587a = i17 != -1 ? gg9.m12587a(strArrSplit3[i17].trim()) : -1;
                                            int i18 = eg9Var.f37213c;
                                            Integer numM12589c = i18 != -1 ? gg9.m12589c(strArrSplit3[i18].trim()) : null;
                                            int i19 = eg9Var.f37214d;
                                            Integer numM12589c2 = i19 != -1 ? gg9.m12589c(strArrSplit3[i19].trim()) : null;
                                            int i20 = eg9Var.f37215e;
                                            float f = -3.4028235E38f;
                                            if (i20 != -1) {
                                                String strTrim2 = strArrSplit3[i20].trim();
                                                try {
                                                    f = Float.parseFloat(strTrim2);
                                                } catch (NumberFormatException e) {
                                                    ss5.m21709e0("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e);
                                                }
                                            }
                                            float f2 = f;
                                            int i21 = eg9Var.f37216f;
                                            boolean z = i21 != -1 && gg9.m12588b(strArrSplit3[i21].trim());
                                            int i22 = eg9Var.f37217g;
                                            boolean z2 = i22 != -1 && gg9.m12588b(strArrSplit3[i22].trim());
                                            int i23 = eg9Var.f37218h;
                                            boolean z3 = i23 != -1 && gg9.m12588b(strArrSplit3[i23].trim());
                                            int i24 = eg9Var.f37219i;
                                            boolean z4 = i24 != -1 && gg9.m12588b(strArrSplit3[i24].trim());
                                            int i25 = eg9Var.f37220j;
                                            if (i25 != -1) {
                                                String strTrim3 = strArrSplit3[i25].trim();
                                                try {
                                                    int i26 = Integer.parseInt(strTrim3.trim());
                                                    if (i26 == 1 || i26 == 3) {
                                                        i4 = i26;
                                                    } else {
                                                        ss5.m21707d0("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            gg9Var = new gg9(strTrim, iM12587a, numM12589c, numM12589c2, f2, z, z2, z3, z4, i4);
                                        } catch (RuntimeException e2) {
                                            ss5.m21709e0("SsaStyle", "Skipping malformed 'Style:' line: '" + strM14830n3 + "'", e2);
                                            gg9Var = null;
                                        }
                                        if (gg9Var != null) {
                                            linkedHashMap.put(gg9Var.f40775a, gg9Var);
                                        }
                                    }
                                    gg9Var = null;
                                    if (gg9Var != null) {
                                        linkedHashMap.put(gg9Var.f40775a, gg9Var);
                                    }
                                }
                            }
                            i2 = 0;
                            i3 = 91;
                        }
                    }
                }
                this.f35627d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM14830n)) {
                ss5.m21686M("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM14830n)) {
                return;
            }
        }
    }
}
