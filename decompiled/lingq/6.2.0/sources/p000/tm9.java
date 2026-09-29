package p000;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class tm9 implements cn9 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f62538d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e */
    public static final Pattern f62539e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a */
    public final StringBuilder f62540a = new StringBuilder();

    /* JADX INFO: renamed from: b */
    public final ArrayList f62541b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final k47 f62542c = new k47();

    /* JADX INFO: renamed from: a */
    public static long m22235a(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * 60000) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:58:0x015a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0169  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:75:0x018c  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b3  */
    @Override // p000.cn9
    /* JADX INFO: renamed from: C */
    public final void mo4902C(byte[] bArr, int i, int i2, kk1 kk1Var) {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        cs1 cs1Var;
        tm9 tm9Var = this;
        k47 k47Var = tm9Var.f62542c;
        k47Var.m14816K(i + i2, bArr);
        k47Var.m14818M(i);
        Charset charsetM14814I = k47Var.m14814I();
        if (charsetM14814I == null) {
            charsetM14814I = StandardCharsets.UTF_8;
        }
        while (true) {
            String strM14830n = k47Var.m14830n(charsetM14814I);
            if (strM14830n == null) {
                return;
            }
            if (!strM14830n.isEmpty()) {
                try {
                    Integer.parseInt(strM14830n);
                    String strM14830n2 = k47Var.m14830n(charsetM14814I);
                    if (strM14830n2 == null) {
                        ss5.m21707d0("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = f62538d.matcher(strM14830n2);
                    if (matcher.matches()) {
                        long jM22235a = m22235a(matcher, 1);
                        long jM22235a2 = m22235a(matcher, 6);
                        StringBuilder sb = tm9Var.f62540a;
                        int i7 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = tm9Var.f62541b;
                        arrayList.clear();
                        String strM14830n3 = k47Var.m14830n(charsetM14814I);
                        while (!TextUtils.isEmpty(strM14830n3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strM14830n3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = f62539e.matcher(strTrim);
                            int i8 = i7;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i8;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i8 += length;
                            }
                            sb.append(sb2.toString());
                            strM14830n3 = k47Var.m14830n(charsetM14814I);
                            i7 = 0;
                        }
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i9 = 0;
                        while (true) {
                            if (i9 < arrayList.size()) {
                                str = (String) arrayList.get(i9);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i9++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        if (str == null) {
                            cs1Var = new cs1(spannedFromHtml, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                            jM22235a = jM22235a;
                        } else {
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    break;
                                case -685620679:
                                    str.equals("{\\an2}");
                                    i3 = 1;
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    break;
                                case -685620617:
                                    if (!str.equals("{\\an4}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    break;
                                case -685620586:
                                    str.equals("{\\an5}");
                                    i3 = 1;
                                    break;
                                case -685620555:
                                    if (!str.equals("{\\an6}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    break;
                                case -685620493:
                                    str.equals("{\\an8}");
                                    i3 = 1;
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    break;
                                default:
                                    i3 = 1;
                                    break;
                            }
                            switch (str.hashCode()) {
                                case -685620710:
                                    if (!str.equals("{\\an1}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                case -685620679:
                                    if (!str.equals("{\\an2}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                case -685620648:
                                    if (!str.equals("{\\an3}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 2;
                                    }
                                    break;
                                case -685620617:
                                    str.equals("{\\an4}");
                                    i4 = 1;
                                    break;
                                case -685620586:
                                    str.equals("{\\an5}");
                                    i4 = 1;
                                    break;
                                case -685620555:
                                    str.equals("{\\an6}");
                                    i4 = 1;
                                    break;
                                case -685620524:
                                    if (!str.equals("{\\an7}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                case -685620493:
                                    if (!str.equals("{\\an8}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                case -685620462:
                                    if (!str.equals("{\\an9}")) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    break;
                                default:
                                    i4 = 1;
                                    break;
                            }
                            float f2 = 0.08f;
                            if (i3 != 0) {
                                i5 = 1;
                                if (i3 != 1) {
                                    i6 = 2;
                                    if (i3 != 2) {
                                        ij6.m13959q();
                                        return;
                                    }
                                    f = 0.92f;
                                } else {
                                    i6 = 2;
                                    f = 0.5f;
                                }
                            } else {
                                i5 = 1;
                                i6 = 2;
                                f = 0.08f;
                            }
                            if (i4 != 0) {
                                if (i4 == i5) {
                                    f2 = 0.5f;
                                } else {
                                    if (i4 != i6) {
                                        ij6.m13959q();
                                        return;
                                    }
                                    f2 = 0.92f;
                                }
                            }
                            cs1Var = new cs1(spannedFromHtml, null, null, null, f2, 0, i4, f, i3, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                        }
                        kk1Var.accept(new gs1(jM22235a, jM22235a2 - jM22235a, ImmutableList.m6291y(cs1Var)));
                        tm9Var = this;
                        charsetM14814I = charsetM14814I;
                        k47Var = k47Var;
                    } else {
                        ss5.m21707d0("SubripParser", "Skipping invalid timing: ".concat(strM14830n2));
                        tm9Var = this;
                        charsetM14814I = charsetM14814I;
                    }
                } catch (NumberFormatException unused) {
                    ss5.m21707d0("SubripParser", "Skipping invalid index: ".concat(strM14830n));
                }
            }
        }
    }
}
