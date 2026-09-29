package pa;

import ae.C0062b;
import android.graphics.PointF;
import android.support.v4.media.C0141b;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p219ka.AbstractC6645f;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: renamed from: pa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8210a extends AbstractC6645f {

    /* JADX INFO: renamed from: r */
    public static final Pattern f44433r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: m */
    public final boolean f44434m;

    /* JADX INFO: renamed from: n */
    public final C8211b f44435n;

    /* JADX INFO: renamed from: o */
    public LinkedHashMap f44436o;

    /* JADX INFO: renamed from: p */
    public float f44437p = -3.4028235E38f;

    /* JADX INFO: renamed from: q */
    public float f44438q = -3.4028235E38f;

    public C8210a(List<byte[]> list) {
        if (list == null || list.isEmpty()) {
            this.f44434m = false;
            this.f44435n = null;
            return;
        }
        this.f44434m = true;
        byte[] bArr = list.get(0);
        int i10 = C10134c0.f51354a;
        String str = new String(bArr, C10170b.f51477c);
        C10129a.m18990b(str.startsWith("Format:"));
        C8211b c8211bM16356a = C8211b.m16356a(str);
        c8211bM16356a.getClass();
        this.f44435n = c8211bM16356a;
        m16355i(new C10151t(list.get(1)));
    }

    /* JADX INFO: renamed from: h */
    public static int m16353h(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i10 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j10) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j10) {
                i10 = size + 1;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        arrayList2.add(i10, i10 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i10 - 1)));
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static long m16354j(String str) {
        Matcher matcher = f44433r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i10 = C10134c0.f51354a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(strGroup) * 60 * 60 * 1000000);
    }

    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) {
        C10151t c10151t;
        Layout.Alignment alignment;
        int i11;
        float f3;
        int i12;
        int i13;
        Integer num;
        int iM16357a;
        int i14;
        C8210a c8210a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C10151t c10151t2 = new C10151t(bArr, i10);
        boolean z11 = c8210a.f44434m;
        if (!z11) {
            c8210a.m16355i(c10151t2);
        }
        C8211b c8211bM16356a = z11 ? c8210a.f44435n : null;
        while (true) {
            String strM19130e = c10151t2.m19130e();
            if (strM19130e == null) {
                return new C8213d(arrayList, arrayList2);
            }
            if (strM19130e.startsWith("Format:")) {
                c8211bM16356a = C8211b.m16356a(strM19130e);
            } else {
                if (strM19130e.startsWith("Dialogue:")) {
                    if (c8211bM16356a == null) {
                        C10145n.m19099g("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strM19130e));
                    } else {
                        C10129a.m18990b(strM19130e.startsWith("Dialogue:"));
                        String strSubstring = strM19130e.substring(9);
                        int i15 = c8211bM16356a.f44443e;
                        String[] strArrSplit = strSubstring.split(",", i15);
                        if (strArrSplit.length != i15) {
                            C10145n.m19099g("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strM19130e));
                        } else {
                            long jM16354j = m16354j(strArrSplit[c8211bM16356a.f44439a]);
                            if (jM16354j == -9223372036854775807L) {
                                C10145n.m19099g("SsaDecoder", "Skipping invalid timing: ".concat(strM19130e));
                            } else {
                                long jM16354j2 = m16354j(strArrSplit[c8211bM16356a.f44440b]);
                                if (jM16354j2 == -9223372036854775807L) {
                                    C10145n.m19099g("SsaDecoder", "Skipping invalid timing: ".concat(strM19130e));
                                } else {
                                    LinkedHashMap linkedHashMap = c8210a.f44436o;
                                    int i16 = -1;
                                    C8212c c8212c = (linkedHashMap == null || (i14 = c8211bM16356a.f44441c) == -1) ? null : (C8212c) linkedHashMap.get(strArrSplit[i14].trim());
                                    String str = strArrSplit[c8211bM16356a.f44442d];
                                    Matcher matcher = C8212c.b.f44465a.matcher(str);
                                    PointF pointF = null;
                                    while (true) {
                                        c10151t = c10151t2;
                                        if (matcher.find()) {
                                            String strGroup = matcher.group(1);
                                            strGroup.getClass();
                                            try {
                                                PointF pointFM16360a = C8212c.b.m16360a(strGroup);
                                                if (pointFM16360a != null) {
                                                    pointF = pointFM16360a;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = C8212c.b.f44468d.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    String strGroup2 = matcher2.group(1);
                                                    strGroup2.getClass();
                                                    iM16357a = C8212c.m16357a(strGroup2);
                                                } else {
                                                    iM16357a = -1;
                                                }
                                                if (iM16357a != -1) {
                                                    i16 = iM16357a;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            c10151t2 = c10151t;
                                        } else {
                                            String strReplace = C8212c.b.f44465a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                            float f10 = c8210a.f44437p;
                                            float f11 = c8210a.f44438q;
                                            SpannableString spannableString = new SpannableString(strReplace);
                                            C6640a.a aVar = new C6640a.a();
                                            aVar.f37671a = spannableString;
                                            if (c8212c != null) {
                                                Integer num2 = c8212c.f44446c;
                                                if (num2 != null) {
                                                    spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                                }
                                                if (c8212c.f44453j == 3 && (num = c8212c.f44447d) != null) {
                                                    spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                                }
                                                float f12 = c8212c.f44448e;
                                                if (f12 != -3.4028235E38f && f11 != -3.4028235E38f) {
                                                    aVar.f37681k = f12 / f11;
                                                    aVar.f37680j = 1;
                                                }
                                                boolean z12 = c8212c.f44450g;
                                                boolean z13 = c8212c.f44449f;
                                                if (z13 && z12) {
                                                    i12 = 33;
                                                    i13 = 0;
                                                    spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                                } else {
                                                    i12 = 33;
                                                    i13 = 0;
                                                    if (z13) {
                                                        spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                    } else if (z12) {
                                                        spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                    }
                                                }
                                                if (c8212c.f44451h) {
                                                    spannableString.setSpan(new UnderlineSpan(), i13, spannableString.length(), i12);
                                                }
                                                if (c8212c.f44452i) {
                                                    spannableString.setSpan(new StrikethroughSpan(), i13, spannableString.length(), i12);
                                                }
                                            } else {
                                                c8211bM16356a = c8211bM16356a;
                                                jM16354j2 = jM16354j2;
                                            }
                                            if (i16 == -1) {
                                                i16 = c8212c != null ? c8212c.f44445b : -1;
                                            }
                                            switch (i16) {
                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                default:
                                                    C0141b.m620p("Unknown alignment: ", i16, "SsaDecoder");
                                                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                    alignment = null;
                                                    break;
                                                case 1:
                                                case 4:
                                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    alignment = Layout.Alignment.ALIGN_NORMAL;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    alignment = Layout.Alignment.ALIGN_CENTER;
                                                    break;
                                                case 3:
                                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                case 9:
                                                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                    break;
                                            }
                                            aVar.f37673c = alignment;
                                            int i17 = Integer.MIN_VALUE;
                                            switch (i16) {
                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                default:
                                                    C0141b.m620p("Unknown alignment: ", i16, "SsaDecoder");
                                                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                    i11 = Integer.MIN_VALUE;
                                                    break;
                                                case 1:
                                                case 4:
                                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    i11 = 0;
                                                    break;
                                                case 2:
                                                case 5:
                                                case 8:
                                                    i11 = 1;
                                                    break;
                                                case 3:
                                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                case 9:
                                                    i11 = 2;
                                                    break;
                                            }
                                            aVar.f37679i = i11;
                                            switch (i16) {
                                                case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                                                    break;
                                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                default:
                                                    C0141b.m620p("Unknown alignment: ", i16, "SsaDecoder");
                                                    break;
                                                case 1:
                                                case 2:
                                                case 3:
                                                    i17 = 2;
                                                    break;
                                                case 4:
                                                case 5:
                                                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    i17 = 1;
                                                    break;
                                                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                case 8:
                                                case 9:
                                                    i17 = 0;
                                                    break;
                                            }
                                            aVar.f37677g = i17;
                                            if (pointF == null || f11 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                                int i18 = aVar.f37679i;
                                                float f13 = 0.95f;
                                                if (i18 == 0) {
                                                    f3 = 0.05f;
                                                } else if (i18 != 1) {
                                                    f3 = i18 != 2 ? -3.4028235E38f : 0.95f;
                                                } else {
                                                    f3 = 0.5f;
                                                }
                                                aVar.f37678h = f3;
                                                if (i17 == 0) {
                                                    f13 = 0.05f;
                                                } else if (i17 == 1) {
                                                    f13 = 0.5f;
                                                } else if (i17 != 2) {
                                                    f13 = -3.4028235E38f;
                                                }
                                                aVar.f37675e = f13;
                                                aVar.f37676f = 0;
                                            } else {
                                                aVar.f37678h = pointF.x / f10;
                                                aVar.f37675e = pointF.y / f11;
                                                aVar.f37676f = 0;
                                            }
                                            C6640a c6640aM13277a = aVar.m13277a();
                                            int iM16353h = m16353h(jM16354j2, arrayList2, arrayList);
                                            for (int iM16353h2 = m16353h(jM16354j, arrayList2, arrayList); iM16353h2 < iM16353h; iM16353h2++) {
                                                ((List) arrayList.get(iM16353h2)).add(c6640aM13277a);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c10151t = c10151t2;
                    c8211bM16356a = c8211bM16356a;
                } else {
                    c10151t = c10151t2;
                    c8211bM16356a = c8211bM16356a;
                }
                c8210a = this;
                c8211bM16356a = c8211bM16356a;
                c10151t2 = c10151t;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:170:0x02f9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: i */
    public final void m16355i(C10151t c10151t) {
        int i10;
        C8212c c8212c;
        float f3;
        int i11;
        while (true) {
            String strM19130e = c10151t.m19130e();
            if (strM19130e == null) {
                return;
            }
            int i12 = 2;
            char c10 = '[';
            int i13 = 0;
            if ("[Script Info]".equalsIgnoreCase(strM19130e)) {
                while (true) {
                    String strM19130e2 = c10151t.m19130e();
                    if (strM19130e2 == null) {
                        break;
                    }
                    int i14 = c10151t.f51440c;
                    int i15 = c10151t.f51439b;
                    if (i14 - i15 != 0 && (c10151t.f51438a[i15] & 255) == 91) {
                        break;
                    }
                    String[] strArrSplit = strM19130e2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM383p2 = C0062b.m383p2(strArrSplit[0].trim());
                        strM383p2.getClass();
                        if (strM383p2.equals("playresx")) {
                            this.f44437p = Float.parseFloat(strArrSplit[1].trim());
                        } else if (strM383p2.equals("playresy")) {
                            try {
                                this.f44438q = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM19130e)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (true) {
                    C8212c.a aVar = null;
                    while (true) {
                        String strM19130e3 = c10151t.m19130e();
                        if (strM19130e3 != null) {
                            int i16 = c10151t.f51440c;
                            int i17 = c10151t.f51439b;
                            if (i16 - i17 == 0 || (c10151t.f51438a[i17] & 255) != c10) {
                                if (strM19130e3.startsWith("Format:")) {
                                    String[] strArrSplit2 = TextUtils.split(strM19130e3.substring(7), ",");
                                    int i18 = -1;
                                    int i19 = -1;
                                    int i20 = -1;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = -1;
                                    int i24 = -1;
                                    int i25 = -1;
                                    int i26 = -1;
                                    int i27 = -1;
                                    for (int i28 = i13; i28 < strArrSplit2.length; i28++) {
                                        String strM383p3 = C0062b.m383p2(strArrSplit2[i28].trim());
                                        strM383p3.getClass();
                                        switch (strM383p3.hashCode()) {
                                            case -1178781136:
                                                i10 = strM383p3.equals("italic") ? i13 : -1;
                                                break;
                                            case -1026963764:
                                                i10 = strM383p3.equals("underline") ? 1 : -1;
                                                break;
                                            case -192095652:
                                                i10 = strM383p3.equals("strikeout") ? i12 : -1;
                                                break;
                                            case -70925746:
                                                i10 = strM383p3.equals("primarycolour") ? 3 : -1;
                                                break;
                                            case 3029637:
                                                i10 = strM383p3.equals("bold") ? 4 : -1;
                                                break;
                                            case 3373707:
                                                i10 = strM383p3.equals("name") ? 5 : -1;
                                                break;
                                            case 366554320:
                                                i10 = strM383p3.equals("fontsize") ? 6 : -1;
                                                break;
                                            case 767321349:
                                                i10 = strM383p3.equals("borderstyle") ? 7 : -1;
                                                break;
                                            case 1767875043:
                                                i10 = strM383p3.equals("alignment") ? 8 : -1;
                                                break;
                                            case 1988365454:
                                                i10 = strM383p3.equals("outlinecolour") ? 9 : -1;
                                                break;
                                            default:
                                                i10 = -1;
                                                break;
                                        }
                                        switch (i10) {
                                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                                i24 = i28;
                                                break;
                                            case 1:
                                                i25 = i28;
                                                break;
                                            case 2:
                                                i26 = i28;
                                                break;
                                            case 3:
                                                i20 = i28;
                                                break;
                                            case 4:
                                                i23 = i28;
                                                break;
                                            case 5:
                                                i18 = i28;
                                                break;
                                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                                i22 = i28;
                                                break;
                                            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                                                i27 = i28;
                                                break;
                                            case 8:
                                                i19 = i28;
                                                break;
                                            case 9:
                                                i21 = i28;
                                                break;
                                        }
                                    }
                                    if (i18 != -1) {
                                        aVar = new C8212c.a(i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, strArrSplit2.length);
                                        c10 = '[';
                                    } else {
                                        c10 = '[';
                                    }
                                } else {
                                    if (strM19130e3.startsWith("Style:")) {
                                        if (aVar == null) {
                                            C10145n.m19099g("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strM19130e3));
                                        } else {
                                            C10129a.m18990b(strM19130e3.startsWith("Style:"));
                                            String[] strArrSplit3 = TextUtils.split(strM19130e3.substring(6), ",");
                                            int length = strArrSplit3.length;
                                            int i29 = aVar.f44464k;
                                            if (length != i29) {
                                                Object[] objArr = new Object[3];
                                                objArr[i13] = Integer.valueOf(i29);
                                                objArr[1] = Integer.valueOf(strArrSplit3.length);
                                                objArr[i12] = strM19130e3;
                                                C10145n.m19099g("SsaStyle", C10134c0.m19045l("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                            } else {
                                                try {
                                                    String strTrim = strArrSplit3[aVar.f44454a].trim();
                                                    int i30 = aVar.f44455b;
                                                    int iM16357a = i30 != -1 ? C8212c.m16357a(strArrSplit3[i30].trim()) : -1;
                                                    int i31 = aVar.f44456c;
                                                    Integer numM16359c = i31 != -1 ? C8212c.m16359c(strArrSplit3[i31].trim()) : null;
                                                    int i32 = aVar.f44457d;
                                                    Integer numM16359c2 = i32 != -1 ? C8212c.m16359c(strArrSplit3[i32].trim()) : null;
                                                    int i33 = aVar.f44458e;
                                                    if (i33 != -1) {
                                                        String strTrim2 = strArrSplit3[i33].trim();
                                                        try {
                                                            f3 = Float.parseFloat(strTrim2);
                                                        } catch (NumberFormatException e10) {
                                                            C10145n.m19100h("SsaStyle", "Failed to parse font size: '" + strTrim2 + "'", e10);
                                                            f3 = -3.4028235E38f;
                                                        }
                                                    } else {
                                                        f3 = -3.4028235E38f;
                                                    }
                                                    float f10 = f3;
                                                    int i34 = aVar.f44459f;
                                                    boolean z10 = i34 != -1 && C8212c.m16358b(strArrSplit3[i34].trim());
                                                    int i35 = aVar.f44460g;
                                                    boolean z11 = i35 != -1 && C8212c.m16358b(strArrSplit3[i35].trim());
                                                    int i36 = aVar.f44461h;
                                                    boolean z12 = i36 != -1 && C8212c.m16358b(strArrSplit3[i36].trim());
                                                    int i37 = aVar.f44462i;
                                                    boolean z13 = i37 != -1 && C8212c.m16358b(strArrSplit3[i37].trim());
                                                    int i38 = aVar.f44463j;
                                                    if (i38 != -1) {
                                                        String strTrim3 = strArrSplit3[i38].trim();
                                                        try {
                                                            int i39 = Integer.parseInt(strTrim3.trim());
                                                            if (i39 == 1 || i39 == 3) {
                                                                i11 = i39;
                                                            } else {
                                                                C10145n.m19099g("SsaStyle", "Ignoring unknown BorderStyle: " + strTrim3);
                                                                i11 = -1;
                                                            }
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                    } else {
                                                        i11 = -1;
                                                    }
                                                    c8212c = new C8212c(strTrim, iM16357a, numM16359c, numM16359c2, f10, z10, z11, z12, z13, i11);
                                                } catch (RuntimeException e11) {
                                                    C10145n.m19100h("SsaStyle", "Skipping malformed 'Style:' line: '" + strM19130e3 + "'", e11);
                                                    c8212c = null;
                                                }
                                                if (c8212c != null) {
                                                    linkedHashMap.put(c8212c.f44444a, c8212c);
                                                }
                                            }
                                            c8212c = null;
                                            if (c8212c != null) {
                                                linkedHashMap.put(c8212c.f44444a, c8212c);
                                            }
                                        }
                                    }
                                    i12 = 2;
                                    c10 = '[';
                                    i13 = 0;
                                }
                            }
                        }
                    }
                }
                this.f44436o = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM19130e)) {
                C10145n.m19098f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM19130e)) {
                return;
            }
        }
    }
}
