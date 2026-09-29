package qa;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p166i1.C6153k;
import p219ka.AbstractC6645f;
import p219ka.C6640a;
import p219ka.InterfaceC6646g;
import p479xa.C10145n;
import p479xa.C10151t;
import p482xd.C10170b;

/* JADX INFO: renamed from: qa.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8507a extends AbstractC6645f {

    /* JADX INFO: renamed from: o */
    public static final Pattern f45773o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p */
    public static final Pattern f45774p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m */
    public final StringBuilder f45775m = new StringBuilder();

    /* JADX INFO: renamed from: n */
    public final ArrayList<String> f45776n = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public static long m16615h(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 60 * 60 * 1000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60 * 1000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:115:0x01de  */
    /* JADX WARN: Code duplicated, block: B:135:0x020c  */
    /* JADX WARN: Code duplicated, block: B:137:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x0212  */
    /* JADX WARN: Code duplicated, block: B:141:0x021a  */
    /* JADX WARN: Code duplicated, block: B:142:0x021c  */
    /* JADX WARN: Code duplicated, block: B:145:0x0223  */
    /* JADX WARN: Code duplicated, block: B:147:0x0227  */
    /* JADX WARN: Code duplicated, block: B:152:0x0232  */
    /* JADX WARN: Code duplicated, block: B:153:0x0236  */
    /* JADX WARN: Code duplicated, block: B:165:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) {
        String str;
        byte b10;
        byte b11;
        int i11;
        int i12;
        float f3;
        float f10;
        int i13;
        C6640a c6640aM13277a;
        C8507a c8507a = this;
        ArrayList arrayList = new ArrayList();
        C6153k c6153k = new C6153k(2);
        C10151t c10151t = new C10151t(bArr, i10);
        Charset charsetM19120A = c10151t.m19120A();
        if (charsetM19120A == null) {
            charsetM19120A = C10170b.f51477c;
        }
        while (true) {
            String strM19131f = c10151t.m19131f(charsetM19120A);
            int i14 = 0;
            if (strM19131f != null) {
                if (strM19131f.length() != 0) {
                    try {
                        Integer.parseInt(strM19131f);
                        String strM19131f2 = c10151t.m19131f(charsetM19120A);
                        if (strM19131f2 == null) {
                            C10145n.m19099g("SubripDecoder", "Unexpected end");
                        } else {
                            Matcher matcher = f45773o.matcher(strM19131f2);
                            if (matcher.matches()) {
                                c6153k.m12659a(m16615h(matcher, 1));
                                c6153k.m12659a(m16615h(matcher, 6));
                                StringBuilder sb2 = c8507a.f45775m;
                                sb2.setLength(0);
                                ArrayList<String> arrayList2 = c8507a.f45776n;
                                arrayList2.clear();
                                String strM19131f3 = c10151t.m19131f(charsetM19120A);
                                while (!TextUtils.isEmpty(strM19131f3)) {
                                    if (sb2.length() > 0) {
                                        sb2.append("<br>");
                                    }
                                    String strTrim = strM19131f3.trim();
                                    StringBuilder sb3 = new StringBuilder(strTrim);
                                    Matcher matcher2 = f45774p.matcher(strTrim);
                                    int i15 = i14;
                                    while (matcher2.find()) {
                                        String strGroup = matcher2.group();
                                        arrayList2.add(strGroup);
                                        int iStart = matcher2.start() - i15;
                                        int length = strGroup.length();
                                        sb3.replace(iStart, iStart + length, "");
                                        i15 += length;
                                    }
                                    sb2.append(sb3.toString());
                                    strM19131f3 = c10151t.m19131f(charsetM19120A);
                                    i14 = 0;
                                }
                                Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                                int i16 = 0;
                                while (true) {
                                    if (i16 < arrayList2.size()) {
                                        str = arrayList2.get(i16);
                                        if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                            i16++;
                                        }
                                    } else {
                                        str = null;
                                    }
                                }
                                C6640a.a aVar = new C6640a.a();
                                aVar.f37671a = spannedFromHtml;
                                if (str == null) {
                                    c6640aM13277a = aVar.m13277a();
                                } else {
                                    switch (str) {
                                        case "{\an1}":
                                            b10 = 0;
                                            break;
                                        case "{\an2}":
                                            b10 = 6;
                                            break;
                                        case "{\an3}":
                                            b10 = 3;
                                            break;
                                        case "{\an4}":
                                            b10 = 1;
                                            break;
                                        case "{\an5}":
                                            b10 = 7;
                                            break;
                                        case "{\an6}":
                                            b10 = 4;
                                            break;
                                        case "{\an7}":
                                            b10 = 2;
                                            break;
                                        case "{\an8}":
                                            b10 = 8;
                                            break;
                                        case "{\an9}":
                                            b10 = 5;
                                            break;
                                        default:
                                            b10 = -1;
                                            break;
                                    }
                                    if (b10 == 0 || b10 == 1 || b10 == 2) {
                                        aVar.f37679i = 0;
                                    } else if (b10 == 3 || b10 == 4 || b10 == 5) {
                                        aVar.f37679i = 2;
                                    } else {
                                        aVar.f37679i = 1;
                                    }
                                    switch (str) {
                                        case "{\an1}":
                                            b11 = 0;
                                            break;
                                        case "{\an2}":
                                            b11 = 1;
                                            break;
                                        case "{\an3}":
                                            b11 = 2;
                                            break;
                                        case "{\an4}":
                                            b11 = 6;
                                            break;
                                        case "{\an5}":
                                            b11 = 7;
                                            break;
                                        case "{\an6}":
                                            b11 = 8;
                                            break;
                                        case "{\an7}":
                                            b11 = 3;
                                            break;
                                        case "{\an8}":
                                            b11 = 4;
                                            break;
                                        case "{\an9}":
                                            b11 = 5;
                                            break;
                                        default:
                                            b11 = -1;
                                            break;
                                    }
                                    if (b11 == 0 || b11 == 1) {
                                        i11 = 2;
                                    } else {
                                        if (b11 != 2) {
                                            if (b11 == 3 || b11 == 4 || b11 == 5) {
                                                aVar.f37677g = 0;
                                            } else {
                                                aVar.f37677g = 1;
                                            }
                                            i11 = 2;
                                        } else {
                                            i11 = 2;
                                        }
                                        i12 = aVar.f37679i;
                                        f3 = 0.92f;
                                        if (i12 != 0) {
                                            f10 = 0.08f;
                                        } else if (i12 != 1) {
                                            f10 = 0.5f;
                                        } else {
                                            if (i12 == i11) {
                                                throw new IllegalArgumentException();
                                            }
                                            f10 = 0.92f;
                                        }
                                        aVar.f37678h = f10;
                                        i13 = aVar.f37677g;
                                        if (i13 != 0) {
                                            f3 = 0.08f;
                                        } else if (i13 != 1) {
                                            f3 = 0.5f;
                                        } else if (i13 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        aVar.f37675e = f3;
                                        aVar.f37676f = 0;
                                        c6640aM13277a = aVar.m13277a();
                                    }
                                    aVar.f37677g = i11;
                                    i12 = aVar.f37679i;
                                    f3 = 0.92f;
                                    if (i12 != 0) {
                                        f10 = 0.08f;
                                    } else if (i12 != 1) {
                                        f10 = 0.5f;
                                    } else {
                                        if (i12 == i11) {
                                            throw new IllegalArgumentException();
                                        }
                                        f10 = 0.92f;
                                    }
                                    aVar.f37678h = f10;
                                    i13 = aVar.f37677g;
                                    if (i13 != 0) {
                                        f3 = 0.08f;
                                    } else if (i13 != 1) {
                                        f3 = 0.5f;
                                    } else if (i13 != 2) {
                                        throw new IllegalArgumentException();
                                    }
                                    aVar.f37675e = f3;
                                    aVar.f37676f = 0;
                                    c6640aM13277a = aVar.m13277a();
                                }
                                arrayList.add(c6640aM13277a);
                                arrayList.add(C6640a.f37635M);
                            } else {
                                c10151t = c10151t;
                                charsetM19120A = charsetM19120A;
                                C10145n.m19099g("SubripDecoder", "Skipping invalid timing: ".concat(strM19131f2));
                            }
                            c8507a = this;
                            c10151t = c10151t;
                            charsetM19120A = charsetM19120A;
                        }
                    } catch (NumberFormatException unused) {
                        c10151t = c10151t;
                        charsetM19120A = charsetM19120A;
                        C10145n.m19099g("SubripDecoder", "Skipping invalid index: ".concat(strM19131f));
                    }
                }
            }
        }
        return new C8508b((C6640a[]) arrayList.toArray(new C6640a[0]), Arrays.copyOf((long[]) c6153k.f35978b, c6153k.f35977a));
    }
}
