package p397ta;

import ae.C0062b;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p219ka.AbstractC6645f;
import p219ka.InterfaceC6646g;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10135d;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: ta.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9239g extends AbstractC6645f {

    /* JADX INFO: renamed from: m */
    public final C10151t f47925m = new C10151t();

    /* JADX INFO: renamed from: n */
    public final C9235c f47926n = new C9235c();

    /* JADX WARN: Code duplicated, block: B:129:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x022e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0238  */
    /* JADX WARN: Code duplicated, block: B:133:0x0242  */
    /* JADX WARN: Code duplicated, block: B:135:0x024a  */
    /* JADX WARN: Code duplicated, block: B:137:0x0252  */
    /* JADX WARN: Code duplicated, block: B:138:0x0256  */
    /* JADX WARN: Code duplicated, block: B:140:0x025e  */
    /* JADX WARN: Code duplicated, block: B:141:0x0266  */
    /* JADX WARN: Code duplicated, block: B:143:0x026e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0282  */
    /* JADX WARN: Code duplicated, block: B:151:0x0288  */
    /* JADX WARN: Code duplicated, block: B:153:0x0290  */
    /* JADX WARN: Code duplicated, block: B:155:0x0298  */
    /* JADX WARN: Code duplicated, block: B:156:0x029e  */
    /* JADX WARN: Code duplicated, block: B:158:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:163:0x02be  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:166:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:168:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:174:0x030b  */
    /* JADX WARN: Code duplicated, block: B:176:0x031d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0321  */
    /* JADX WARN: Code duplicated, block: B:185:0x0331  */
    /* JADX WARN: Code duplicated, block: B:188:0x033a  */
    /* JADX WARN: Code duplicated, block: B:189:0x033d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0345  */
    /* JADX WARN: Code duplicated, block: B:192:0x0348  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:196:0x034f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0353  */
    /* JADX WARN: Code duplicated, block: B:201:0x035c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0361  */
    /* JADX WARN: Code duplicated, block: B:204:0x0376  */
    /* JADX WARN: Code duplicated, block: B:206:0x037a  */
    /* JADX WARN: Code duplicated, block: B:230:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:247:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x02f1, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p219ka.AbstractC6645f
    /* JADX INFO: renamed from: g */
    public final InterfaceC6646g mo13279g(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        int i11;
        C9237e c9237eM17598d;
        String strSubstring;
        int i12;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b10;
        boolean z11;
        C9239g c9239g = this;
        C10151t c10151t = c9239g.f47925m;
        c10151t.m19122C(bArr, i10);
        ArrayList arrayList = new ArrayList();
        try {
            C9240h.m17606d(c10151t);
            while (!TextUtils.isEmpty(c10151t.m19130e())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i13 = -1;
                int i14 = 0;
                byte b11 = -1;
                int i15 = 0;
                while (true) {
                    i11 = 1;
                    if (b11 != -1) {
                        break;
                    }
                    i15 = c10151t.f51439b;
                    String strM19130e = c10151t.m19130e();
                    if (strM19130e == null) {
                        b11 = 0;
                    } else if ("STYLE".equals(strM19130e)) {
                        b11 = 2;
                    } else {
                        b11 = strM19130e.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                c10151t.m19124E(i15);
                if (b11 == 0) {
                    return new C9241i(arrayList2);
                }
                if (b11 == 1) {
                    while (!TextUtils.isEmpty(c10151t.m19130e())) {
                    }
                } else {
                    if (b11 == 2) {
                        if (!arrayList2.isEmpty()) {
                            throw new SubtitleDecoderException("A style block was found after the first cue.");
                        }
                        c10151t.m19130e();
                        C9235c c9235c = c9239g.f47926n;
                        StringBuilder sb2 = c9235c.f47880b;
                        sb2.setLength(0);
                        int i16 = c10151t.f51439b;
                        while (!TextUtils.isEmpty(c10151t.m19130e())) {
                        }
                        byte[] bArr2 = c10151t.f51438a;
                        int i17 = c10151t.f51439b;
                        C10151t c10151t2 = c9235c.f47879a;
                        c10151t2.m19122C(bArr2, i17);
                        c10151t2.m19124E(i16);
                        ArrayList arrayList3 = new ArrayList();
                        while (true) {
                            C9235c.m17593c(c10151t2);
                            if (c10151t2.f51440c - c10151t2.f51439b >= 5 && "::cue".equals(c10151t2.m19142q(5))) {
                                int i18 = c10151t2.f51439b;
                                String strM17592b = C9235c.m17592b(c10151t2, sb2);
                                if (strM17592b == null) {
                                    strSubstring = null;
                                } else if ("{".equals(strM17592b)) {
                                    c10151t2.m19124E(i18);
                                    strSubstring = "";
                                } else {
                                    if ("(".equals(strM17592b)) {
                                        int i19 = c10151t2.f51439b;
                                        int i20 = c10151t2.f51440c;
                                        int i21 = i14;
                                        while (i19 < i20 && i21 == 0) {
                                            int i22 = i19 + 1;
                                            i21 = ((char) c10151t2.f51438a[i19]) == ')' ? i11 : i14;
                                            i19 = i22;
                                        }
                                        strSubstring = c10151t2.m19142q((i19 - 1) - c10151t2.f51439b).trim();
                                    } else {
                                        strSubstring = null;
                                    }
                                    if (!")".equals(C9235c.m17592b(c10151t2, sb2))) {
                                        strSubstring = null;
                                    }
                                }
                            } else {
                                strSubstring = null;
                            }
                            if (strSubstring == null || !"{".equals(C9235c.m17592b(c10151t2, sb2))) {
                                break;
                            }
                            C9236d c9236d = new C9236d();
                            if (!"".equals(strSubstring)) {
                                int iIndexOf = strSubstring.indexOf(91);
                                if (iIndexOf != i13) {
                                    Matcher matcher2 = C9235c.f47877c.matcher(strSubstring.substring(iIndexOf));
                                    if (matcher2.matches()) {
                                        String strGroup2 = matcher2.group(i11);
                                        strGroup2.getClass();
                                        c9236d.f47884d = strGroup2;
                                    }
                                    strSubstring = strSubstring.substring(i14, iIndexOf);
                                }
                                int i23 = C10134c0.f51354a;
                                String[] strArrSplit = strSubstring.split("\\.", i13);
                                String str = strArrSplit[i14];
                                int iIndexOf2 = str.indexOf(35);
                                if (iIndexOf2 != i13) {
                                    c9236d.f47882b = str.substring(i14, iIndexOf2);
                                    c9236d.f47881a = str.substring(iIndexOf2 + 1);
                                } else {
                                    c9236d.f47882b = str;
                                }
                                if (strArrSplit.length > i11) {
                                    int length = strArrSplit.length;
                                    C10129a.m18990b(length <= strArrSplit.length ? i11 : i14);
                                    c9236d.f47883c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i11, length)));
                                }
                            }
                            int i24 = i14;
                            String strM17592b2 = null;
                            while (i24 == 0) {
                                int i25 = c10151t2.f51439b;
                                strM17592b2 = C9235c.m17592b(c10151t2, sb2);
                                int i26 = (strM17592b2 == null || "}".equals(strM17592b2)) ? i11 : i14;
                                if (i26 == 0) {
                                    c10151t2.m19124E(i25);
                                    C9235c.m17593c(c10151t2);
                                    String strM17591a = C9235c.m17591a(c10151t2, sb2);
                                    if (!"".equals(strM17591a) && ":".equals(C9235c.m17592b(c10151t2, sb2))) {
                                        C9235c.m17593c(c10151t2);
                                        StringBuilder sb3 = new StringBuilder();
                                        boolean z12 = false;
                                        while (true) {
                                            if (z12) {
                                                string = sb3.toString();
                                                break;
                                            }
                                            int i27 = c10151t2.f51439b;
                                            boolean z13 = z12;
                                            String strM17592b3 = C9235c.m17592b(c10151t2, sb2);
                                            if (strM17592b3 == null) {
                                                string = null;
                                                break;
                                            }
                                            if ("}".equals(strM17592b3) || ";".equals(strM17592b3)) {
                                                c10151t2.m19124E(i27);
                                                z12 = true;
                                            } else {
                                                sb3.append(strM17592b3);
                                                z12 = z13;
                                            }
                                        }
                                        if (string == null || "".equals(string)) {
                                            i12 = 1;
                                        } else {
                                            int i28 = c10151t2.f51439b;
                                            String strM17592b4 = C9235c.m17592b(c10151t2, sb2);
                                            if (";".equals(strM17592b4)) {
                                                if ("color".equals(strM17591a)) {
                                                    c9236d.f47886f = C10135d.m19061a(string, true);
                                                    c9236d.f47887g = true;
                                                } else if ("background-color".equals(strM17591a)) {
                                                    c9236d.f47888h = C10135d.m19061a(string, true);
                                                    c9236d.f47889i = true;
                                                } else if ("ruby-position".equals(strM17591a)) {
                                                    if ("over".equals(string)) {
                                                        c9236d.f47896p = 1;
                                                    } else if ("under".equals(string)) {
                                                        c9236d.f47896p = 2;
                                                        i12 = 1;
                                                    }
                                                } else if ("text-combine-upright".equals(strM17591a)) {
                                                    if ("all".equals(string)) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = true;
                                                    }
                                                    c9236d.f47897q = z11;
                                                } else if ("text-decoration".equals(strM17591a)) {
                                                    if ("underline".equals(string)) {
                                                        c9236d.f47891k = 1;
                                                        i12 = 1;
                                                    }
                                                } else if ("font-family".equals(strM17591a)) {
                                                    c9236d.f47885e = C0062b.m383p2(string);
                                                } else if ("font-weight".equals(strM17591a)) {
                                                    if ("bold".equals(string)) {
                                                        c9236d.f47892l = 1;
                                                    }
                                                } else if ("font-style".equals(strM17591a)) {
                                                    if ("italic".equals(string)) {
                                                        c9236d.f47893m = 1;
                                                    }
                                                } else if ("font-size".equals(strM17591a)) {
                                                    matcher = C9235c.f47878d.matcher(C0062b.m383p2(string));
                                                    if (matcher.matches()) {
                                                        strGroup = matcher.group(2);
                                                        strGroup.getClass();
                                                        iHashCode = strGroup.hashCode();
                                                        if (iHashCode != 37) {
                                                            if (iHashCode != 3240) {
                                                                if (iHashCode != 3592) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 2;
                                                                }
                                                            } else if (strGroup.equals("em")) {
                                                                b10 = 1;
                                                            } else {
                                                                b10 = -1;
                                                            }
                                                        } else if (strGroup.equals("%")) {
                                                            b10 = 0;
                                                        } else {
                                                            b10 = -1;
                                                        }
                                                        if (b10 != 0) {
                                                            i12 = 1;
                                                            if (b10 != 1) {
                                                                c9236d.f47894n = 2;
                                                            } else {
                                                                if (b10 == 2) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                c9236d.f47894n = 1;
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            c9236d.f47894n = 3;
                                                        }
                                                        String strGroup3 = matcher.group(i12);
                                                        strGroup3.getClass();
                                                        c9236d.f47895o = Float.parseFloat(strGroup3);
                                                    } else {
                                                        C10145n.m19099g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                    }
                                                }
                                                i12 = 1;
                                            } else if ("}".equals(strM17592b4)) {
                                                c10151t2.m19124E(i28);
                                                if ("color".equals(strM17591a)) {
                                                    c9236d.f47886f = C10135d.m19061a(string, true);
                                                    c9236d.f47887g = true;
                                                } else if ("background-color".equals(strM17591a)) {
                                                    c9236d.f47888h = C10135d.m19061a(string, true);
                                                    c9236d.f47889i = true;
                                                } else if ("ruby-position".equals(strM17591a)) {
                                                    if ("over".equals(string)) {
                                                        c9236d.f47896p = 1;
                                                    } else if ("under".equals(string)) {
                                                        c9236d.f47896p = 2;
                                                        i12 = 1;
                                                    }
                                                } else if ("text-combine-upright".equals(strM17591a)) {
                                                    if ("all".equals(string) || string.startsWith("digits")) {
                                                        z11 = true;
                                                    } else {
                                                        z11 = false;
                                                    }
                                                    c9236d.f47897q = z11;
                                                } else if ("text-decoration".equals(strM17591a)) {
                                                    if ("underline".equals(string)) {
                                                        c9236d.f47891k = 1;
                                                        i12 = 1;
                                                    }
                                                } else if ("font-family".equals(strM17591a)) {
                                                    c9236d.f47885e = C0062b.m383p2(string);
                                                } else if ("font-weight".equals(strM17591a)) {
                                                    if ("bold".equals(string)) {
                                                        c9236d.f47892l = 1;
                                                    }
                                                } else if ("font-style".equals(strM17591a)) {
                                                    if ("italic".equals(string)) {
                                                        c9236d.f47893m = 1;
                                                    }
                                                } else if ("font-size".equals(strM17591a)) {
                                                    matcher = C9235c.f47878d.matcher(C0062b.m383p2(string));
                                                    if (matcher.matches()) {
                                                        C10145n.m19099g("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                    } else {
                                                        strGroup = matcher.group(2);
                                                        strGroup.getClass();
                                                        iHashCode = strGroup.hashCode();
                                                        if (iHashCode != 37) {
                                                            if (iHashCode != 3240) {
                                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                    b10 = 2;
                                                                } else {
                                                                    b10 = -1;
                                                                }
                                                            } else if (strGroup.equals("em")) {
                                                                b10 = -1;
                                                            } else {
                                                                b10 = 1;
                                                            }
                                                        } else if (strGroup.equals("%")) {
                                                            b10 = -1;
                                                        } else {
                                                            b10 = 0;
                                                        }
                                                        if (b10 != 0) {
                                                            i12 = 1;
                                                            if (b10 != 1) {
                                                                c9236d.f47894n = 2;
                                                            } else {
                                                                if (b10 == 2) {
                                                                    throw new IllegalStateException();
                                                                }
                                                                c9236d.f47894n = 1;
                                                            }
                                                        } else {
                                                            i12 = 1;
                                                            c9236d.f47894n = 3;
                                                        }
                                                        String strGroup4 = matcher.group(i12);
                                                        strGroup4.getClass();
                                                        c9236d.f47895o = Float.parseFloat(strGroup4);
                                                    }
                                                }
                                                i12 = 1;
                                            } else {
                                                i12 = 1;
                                            }
                                        }
                                    } else {
                                        i12 = i11;
                                    }
                                } else {
                                    i12 = i11;
                                }
                                i11 = i12;
                                i24 = i26;
                                i14 = 0;
                            }
                            int i29 = i11;
                            if ("}".equals(strM17592b2)) {
                                arrayList3.add(c9236d);
                            }
                            i11 = i29;
                            i13 = -1;
                            i14 = 0;
                        }
                        arrayList.addAll(arrayList3);
                    } else if (b11 == 3) {
                        Pattern pattern = C9238f.f47901a;
                        String strM19130e2 = c10151t.m19130e();
                        if (strM19130e2 == null) {
                            c9237eM17598d = null;
                        } else {
                            Pattern pattern2 = C9238f.f47901a;
                            Matcher matcher3 = pattern2.matcher(strM19130e2);
                            if (matcher3.matches()) {
                                c9237eM17598d = C9238f.m17598d(null, matcher3, c10151t, arrayList);
                            } else {
                                String strM19130e3 = c10151t.m19130e();
                                if (strM19130e3 == null) {
                                    c9237eM17598d = null;
                                } else {
                                    Matcher matcher4 = pattern2.matcher(strM19130e3);
                                    if (matcher4.matches()) {
                                        c9237eM17598d = C9238f.m17598d(strM19130e2.trim(), matcher4, c10151t, arrayList);
                                    } else {
                                        c9237eM17598d = null;
                                    }
                                }
                            }
                        }
                        if (c9237eM17598d != null) {
                            arrayList2.add(c9237eM17598d);
                        }
                    }
                    c9239g = this;
                }
            }
        } catch (ParserException e10) {
            throw new SubtitleDecoderException(e10);
        }
    }
}
