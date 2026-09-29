package so;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jm.C6524g;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import mo.C7653a;
import mo.C7661i;
import mo.C7662j;
import p124fp.C5608e;
import tl.C9325m;
import to.C9347b;

/* JADX INFO: renamed from: so.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C9096n {

    /* JADX INFO: renamed from: k */
    public static final char[] f47454k;

    /* JADX INFO: renamed from: a */
    public final String f47455a;

    /* JADX INFO: renamed from: b */
    public final String f47456b;

    /* JADX INFO: renamed from: c */
    public final String f47457c;

    /* JADX INFO: renamed from: d */
    public final String f47458d;

    /* JADX INFO: renamed from: e */
    public final int f47459e;

    /* JADX INFO: renamed from: f */
    public final List<String> f47460f;

    /* JADX INFO: renamed from: g */
    public final List<String> f47461g;

    /* JADX INFO: renamed from: h */
    public final String f47462h;

    /* JADX INFO: renamed from: i */
    public final String f47463i;

    /* JADX INFO: renamed from: j */
    public final boolean f47464j;

    /* JADX INFO: renamed from: so.n$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f47465a;

        /* JADX INFO: renamed from: d */
        public String f47468d;

        /* JADX INFO: renamed from: f */
        public final ArrayList f47470f;

        /* JADX INFO: renamed from: g */
        public List<String> f47471g;

        /* JADX INFO: renamed from: h */
        public String f47472h;

        /* JADX INFO: renamed from: b */
        public String f47466b = "";

        /* JADX INFO: renamed from: c */
        public String f47467c = "";

        /* JADX INFO: renamed from: e */
        public int f47469e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f47470f = arrayList;
            arrayList.add("");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C9096n m17328a() {
            ArrayList arrayList;
            String str = this.f47465a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            String strM17335d = b.m17335d(this.f47466b, 0, 0, false, 7);
            String strM17335d2 = b.m17335d(this.f47467c, 0, 0, false, 7);
            String str2 = this.f47468d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int iM17329b = m17329b();
            ArrayList arrayList2 = this.f47470f;
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(b.m17335d((String) it.next(), 0, 0, false, 7));
            }
            List<String> list = this.f47471g;
            String strM17335d3 = null;
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (String str3 : list) {
                    arrayList.add(str3 == null ? null : b.m17335d(str3, 0, 0, true, 3));
                }
            }
            String str4 = this.f47472h;
            if (str4 != null) {
                strM17335d3 = b.m17335d(str4, 0, 0, false, 7);
            }
            return new C9096n(str, strM17335d, strM17335d2, str2, iM17329b, arrayList3, arrayList, strM17335d3, toString());
        }

        /* JADX INFO: renamed from: b */
        public final int m17329b() {
            int i10 = this.f47469e;
            if (i10 != -1) {
                return i10;
            }
            String str = this.f47465a;
            C5207g.m11108c(str);
            if (C5207g.m11106a(str, "http")) {
                return 80;
            }
            return C5207g.m11106a(str, "https") ? 443 : -1;
        }

        /* JADX INFO: renamed from: c */
        public final void m17330c(String str) {
            this.f47471g = str == null ? null : b.m17336e(b.m17332a(str, 0, 0, " \"'<>#", true, false, true, false, null, 211));
        }

        /* JADX WARN: Code duplicated, block: B:116:0x024f  */
        /* JADX WARN: Code duplicated, block: B:118:0x0259 A[LOOP:5: B:118:0x0259->B:263:?, LOOP_START, PHI: r5
          0x0259: PHI (r5v9 int) = (r5v4 int), (r5v10 int) binds: [B:117:0x0257, B:263:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:120:0x025c  */
        /* JADX WARN: Code duplicated, block: B:123:0x0269  */
        /* JADX WARN: Code duplicated, block: B:130:0x027b  */
        /* JADX WARN: Code duplicated, block: B:138:0x02b0  */
        /* JADX WARN: Code duplicated, block: B:142:0x02b8  */
        /* JADX WARN: Code duplicated, block: B:145:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:146:0x02c2  */
        /* JADX WARN: Code duplicated, block: B:148:0x02c5  */
        /* JADX WARN: Code duplicated, block: B:149:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:151:0x02f8  */
        /* JADX WARN: Code duplicated, block: B:154:0x0315  */
        /* JADX WARN: Code duplicated, block: B:155:0x0317  */
        /* JADX WARN: Code duplicated, block: B:157:0x031a  */
        /* JADX WARN: Code duplicated, block: B:224:0x0479  */
        /* JADX WARN: Code duplicated, block: B:257:0x0273 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:258:0x026f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:260:0x0271 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:261:0x0266 A[EDGE_INSN: B:261:0x0266->B:122:0x0266 BREAK  A[LOOP:5: B:118:0x0259->B:263:?], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:57:0x00af  */
        /* JADX WARN: Code duplicated, block: B:89:0x015d  */
        /* JADX WARN: Code duplicated, block: B:92:0x016b  */
        /* JADX WARN: Code duplicated, block: B:93:0x0170  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
        /* JADX INFO: renamed from: d */
        public final void m17331d(C9096n c9096n, String str) {
            int i10;
            byte b10;
            byte b11;
            int i11;
            int iM17700g;
            byte bCharAt;
            ArrayList arrayList;
            String str2;
            int i12;
            int i13;
            int i14;
            int i15;
            char c10;
            int i16;
            int i17;
            int i18;
            int i19;
            boolean z10;
            boolean z11;
            char cCharAt;
            ArrayList arrayList2;
            int i20;
            boolean z12;
            ArrayList arrayList3;
            C5207g.m11111f(str, "input");
            byte[] bArr = C9347b.f48082a;
            int iM17707n = C9347b.m17707n(str, 0, str.length());
            int iM17708o = C9347b.m17708o(str, iM17707n, str.length());
            char c11 = ':';
            byte b12 = -1;
            if (iM17708o - iM17707n >= 2) {
                char cCharAt2 = str.charAt(iM17707n);
                char c12 = 'a';
                if ((C5207g.m11113h(cCharAt2, 97) >= 0 && C5207g.m11113h(cCharAt2, 122) <= 0) || (C5207g.m11113h(cCharAt2, 65) >= 0 && C5207g.m11113h(cCharAt2, 90) <= 0)) {
                    i10 = iM17707n + 1;
                    while (true) {
                        if (i10 < iM17708o) {
                            int i21 = i10 + 1;
                            char cCharAt3 = str.charAt(i10);
                            if (!((((((c12 <= cCharAt3 && cCharAt3 < '{') || ('A' <= cCharAt3 && cCharAt3 < '[')) || ('0' <= cCharAt3 && cCharAt3 < ':')) || cCharAt3 == '+') || cCharAt3 == '-') || cCharAt3 == '.')) {
                                if (cCharAt3 == ':') {
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                i10 = i21;
                                c12 = 'a';
                            }
                        }
                        i10 = -1;
                        break;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            } else {
                i10 = -1;
                break;
            }
            String str3 = "this as java.lang.String…ing(startIndex, endIndex)";
            if (i10 != -1) {
                if (C7661i.m15255U2(str, iM17707n, "https:", true)) {
                    this.f47465a = "https";
                    iM17707n += 6;
                } else {
                    if (!C7661i.m15255U2(str, iM17707n, "http:", true)) {
                        StringBuilder sb2 = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                        String strSubstring = str.substring(0, i10);
                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(strSubstring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f47465a = "http";
                    iM17707n += 5;
                }
            } else {
                if (c9096n == null) {
                    throw new IllegalArgumentException(C5207g.m11116k(str.length() > 6 ? C5207g.m11116k("...", C7662j.m15261F3(str, 6)) : str, "Expected URL scheme 'http' or 'https' but no scheme was found for "));
                }
                this.f47465a = c9096n.f47455a;
            }
            int i22 = iM17707n;
            int i23 = 0;
            while (true) {
                b10 = 92;
                b11 = 47;
                if (i22 >= iM17708o) {
                    break;
                }
                int i24 = i22 + 1;
                char cCharAt4 = str.charAt(i22);
                if (cCharAt4 != '\\' && cCharAt4 != '/') {
                    break;
                }
                i23++;
                i22 = i24;
            }
            ArrayList arrayList4 = this.f47470f;
            byte b13 = 63;
            byte b14 = 35;
            if (i23 >= 2 || c9096n == null) {
                i11 = iM17707n + i23;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    iM17700g = C9347b.m17700g(str, i11, iM17708o, "@/\\?#");
                    if (iM17700g != iM17708o) {
                        bCharAt = str.charAt(iM17700g);
                    } else {
                        bCharAt = b12;
                    }
                    if (bCharAt == b12 || bCharAt == b14 || bCharAt == b11 || bCharAt == b10 || bCharAt == b13) {
                        break;
                    }
                    if (bCharAt == 64) {
                        if (z13) {
                            arrayList2 = arrayList4;
                            i20 = iM17700g;
                            this.f47467c += "%40" + b.m17332a(str, i11, i20, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                        } else {
                            int iM17699f = C9347b.m17699f(str, c11, i11, iM17700g);
                            i20 = iM17700g;
                            arrayList2 = arrayList4;
                            String strM17332a = b.m17332a(str, i11, iM17699f, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                            if (z14) {
                                strM17332a = this.f47466b + "%40" + strM17332a;
                            }
                            this.f47466b = strM17332a;
                            if (iM17699f != i20) {
                                this.f47467c = b.m17332a(str, iM17699f + 1, i20, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240);
                                z12 = true;
                            } else {
                                z12 = z13;
                            }
                            z13 = z12;
                            z14 = true;
                        }
                        i11 = i20 + 1;
                        arrayList4 = arrayList2;
                        str3 = str3;
                        b11 = 47;
                        b10 = 92;
                        b12 = -1;
                        b13 = 63;
                        b14 = 35;
                        c11 = ':';
                    }
                }
                arrayList = arrayList4;
                str2 = str3;
                i12 = 1;
                i13 = i11;
                while (true) {
                    if (i13 >= iM17700g) {
                        i14 = iM17700g;
                        break;
                    }
                    cCharAt = str.charAt(i13);
                    if (cCharAt == '[') {
                        do {
                            i13++;
                            if (i13 < iM17700g) {
                                break;
                            }
                        } while (str.charAt(i13) != ']');
                    } else if (cCharAt == ':') {
                        i14 = i13;
                        break;
                    }
                    i13++;
                }
                i15 = i14 + 1;
                if (i15 < iM17700g) {
                    this.f47468d = C0062b.m375n2(b.m17335d(str, i11, i14, false, 4));
                    i18 = i11;
                    try {
                        i19 = Integer.parseInt(b.m17332a(str, i15, iM17700g, "", false, false, false, false, null, 248));
                        if (1 <= i19 || i19 >= 65536) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            i19 = -1;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    this.f47469e = i19;
                    if (i19 != -1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder("Invalid URL port: \"");
                        String strSubstring2 = str.substring(i15, iM17700g);
                        C5207g.m11110e(strSubstring2, str2);
                        sb3.append(strSubstring2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString().toString());
                    }
                    i11 = i18;
                    c10 = '\"';
                    i16 = 0;
                } else {
                    c10 = '\"';
                    i16 = 0;
                    this.f47468d = C0062b.m375n2(b.m17335d(str, i11, i14, false, 4));
                    String str4 = this.f47465a;
                    C5207g.m11108c(str4);
                    this.f47469e = b.m17333b(str4);
                }
                if (this.f47468d != null) {
                    i17 = 1;
                } else {
                    i17 = i16;
                }
                if (i17 != 0) {
                    StringBuilder sb4 = new StringBuilder("Invalid URL host: \"");
                    String strSubstring3 = str.substring(i11, i14);
                    C5207g.m11110e(strSubstring3, str2);
                    sb4.append(strSubstring3);
                    sb4.append(c10);
                    throw new IllegalArgumentException(sb4.toString().toString());
                }
                iM17707n = iM17700g;
            } else {
                if (C5207g.m11106a(c9096n.f47455a, this.f47465a)) {
                    this.f47466b = c9096n.m17324e();
                    this.f47467c = c9096n.m17320a();
                    this.f47468d = c9096n.f47458d;
                    this.f47469e = c9096n.f47459e;
                    arrayList4.clear();
                    arrayList4.addAll(c9096n.m17322c());
                    if (iM17707n == iM17708o || str.charAt(iM17707n) == '#') {
                        m17330c(c9096n.m17323d());
                    }
                    arrayList = arrayList4;
                    i16 = 0;
                    i12 = 1;
                } else {
                    i11 = iM17707n + i23;
                    boolean z15 = false;
                    boolean z16 = false;
                    while (true) {
                        iM17700g = C9347b.m17700g(str, i11, iM17708o, "@/\\?#");
                        if (iM17700g != iM17708o) {
                            bCharAt = str.charAt(iM17700g);
                        } else {
                            bCharAt = b12;
                        }
                        if (bCharAt == b12) {
                            break;
                        } else {
                            break;
                        }
                    }
                    arrayList = arrayList4;
                    str2 = str3;
                    i12 = 1;
                    i13 = i11;
                    while (true) {
                        if (i13 >= iM17700g) {
                            i14 = iM17700g;
                            break;
                        }
                        cCharAt = str.charAt(i13);
                        if (cCharAt == '[') {
                            do {
                                i13++;
                                if (i13 < iM17700g) {
                                    break;
                                    break;
                                }
                            } while (str.charAt(i13) != ']');
                        } else if (cCharAt == ':') {
                            i14 = i13;
                            break;
                        }
                        i13++;
                    }
                    i15 = i14 + 1;
                    if (i15 < iM17700g) {
                        this.f47468d = C0062b.m375n2(b.m17335d(str, i11, i14, false, 4));
                        i18 = i11;
                        i19 = Integer.parseInt(b.m17332a(str, i15, iM17700g, "", false, false, false, false, null, 248));
                        if (1 <= i19) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            i19 = -1;
                        }
                        this.f47469e = i19;
                        if (i19 != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            StringBuilder sb5 = new StringBuilder("Invalid URL port: \"");
                            String strSubstring4 = str.substring(i15, iM17700g);
                            C5207g.m11110e(strSubstring4, str2);
                            sb5.append(strSubstring4);
                            sb5.append('\"');
                            throw new IllegalArgumentException(sb5.toString().toString());
                        }
                        i11 = i18;
                        c10 = '\"';
                        i16 = 0;
                    } else {
                        c10 = '\"';
                        i16 = 0;
                        this.f47468d = C0062b.m375n2(b.m17335d(str, i11, i14, false, 4));
                        String str5 = this.f47465a;
                        C5207g.m11108c(str5);
                        this.f47469e = b.m17333b(str5);
                    }
                    if (this.f47468d != null) {
                        i17 = 1;
                    } else {
                        i17 = i16;
                    }
                    if (i17 != 0) {
                        StringBuilder sb6 = new StringBuilder("Invalid URL host: \"");
                        String strSubstring5 = str.substring(i11, i14);
                        C5207g.m11110e(strSubstring5, str2);
                        sb6.append(strSubstring5);
                        sb6.append(c10);
                        throw new IllegalArgumentException(sb6.toString().toString());
                    }
                    iM17707n = iM17700g;
                }
            }
            int iM17700g2 = C9347b.m17700g(str, iM17707n, iM17708o, "?#");
            if (iM17707n != iM17700g2) {
                char cCharAt5 = str.charAt(iM17707n);
                if (cCharAt5 == '/' || cCharAt5 == '\\') {
                    arrayList3 = arrayList;
                    arrayList3.clear();
                    arrayList3.add("");
                    iM17707n++;
                } else {
                    arrayList3 = arrayList;
                    arrayList3.set(arrayList.size() - i12, "");
                }
                while (iM17707n < iM17700g2) {
                    int iM17700g3 = C9347b.m17700g(str, iM17707n, iM17700g2, "/\\");
                    int i25 = iM17700g3 < iM17700g2 ? i12 : i16;
                    ArrayList arrayList5 = arrayList3;
                    i16 = i16;
                    String strM17332a2 = b.m17332a(str, iM17707n, iM17700g3, " \"<>^`{}|/\\?#", true, false, false, false, null, 240);
                    if (((C5207g.m11106a(strM17332a2, ".") || C7661i.m15249O2(strM17332a2, "%2e")) ? i12 : i16) != 0) {
                        arrayList3 = arrayList5;
                    } else {
                        if (((C5207g.m11106a(strM17332a2, "..") || C7661i.m15249O2(strM17332a2, "%2e.") || C7661i.m15249O2(strM17332a2, ".%2e") || C7661i.m15249O2(strM17332a2, "%2e%2e")) ? i12 : i16) != 0) {
                            arrayList3 = arrayList5;
                            if ((((String) arrayList3.remove(arrayList5.size() - i12)).length() == 0 ? i12 : i16) == 0 || (arrayList3.isEmpty() ^ i12) == 0) {
                                arrayList3.add("");
                            } else {
                                arrayList3.set(arrayList3.size() - i12, "");
                            }
                        } else {
                            arrayList3 = arrayList5;
                            if ((((CharSequence) arrayList3.get(arrayList3.size() - i12)).length() == 0 ? i12 : i16) != 0) {
                                arrayList3.set(arrayList3.size() - i12, strM17332a2);
                            } else {
                                arrayList3.add(strM17332a2);
                            }
                            if (i25 != 0) {
                                arrayList3.add("");
                            }
                        }
                    }
                    iM17707n = i25 != 0 ? iM17700g3 + 1 : iM17700g3;
                }
            }
            if (iM17700g2 < iM17708o && str.charAt(iM17700g2) == '?') {
                int iM17699f2 = C9347b.m17699f(str, '#', iM17700g2, iM17708o);
                this.f47471g = b.m17336e(b.m17332a(str, iM17700g2 + 1, iM17699f2, " \"'<>#", true, false, true, false, null, 208));
                iM17700g2 = iM17699f2;
            }
            if (iM17700g2 >= iM17708o || str.charAt(iM17700g2) != '#') {
                return;
            }
            this.f47472h = b.m17332a(str, iM17700g2 + 1, iM17708o, "", true, false, false, true, null, 176);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004e  */
        /* JADX WARN: Code duplicated, block: B:21:0x0050  */
        /* JADX WARN: Code duplicated, block: B:23:0x0054  */
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f47465a;
            if (str != null) {
                sb2.append(str);
                sb2.append("://");
            } else {
                sb2.append("//");
            }
            boolean z10 = true;
            if (this.f47466b.length() > 0) {
                sb2.append(this.f47466b);
                if (this.f47467c.length() > 0) {
                    z10 = false;
                }
                if (z10) {
                    sb2.append(':');
                    sb2.append(this.f47467c);
                }
                sb2.append('@');
            } else if (this.f47467c.length() > 0) {
                sb2.append(this.f47466b);
                if (this.f47467c.length() > 0) {
                    z10 = false;
                }
                if (z10) {
                    sb2.append(':');
                    sb2.append(this.f47467c);
                }
                sb2.append('@');
            }
            String str2 = this.f47468d;
            if (str2 != null) {
                if (C7076b.m14279Y2(str2, ':')) {
                    sb2.append('[');
                    sb2.append(this.f47468d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f47468d);
                }
            }
            if (this.f47469e != -1 || this.f47465a != null) {
                int iM17329b = m17329b();
                String str3 = this.f47465a;
                if (str3 == null) {
                    sb2.append(':');
                    sb2.append(iM17329b);
                } else {
                    if (iM17329b != (C5207g.m11106a(str3, "http") ? 80 : C5207g.m11106a(str3, "https") ? 443 : -1)) {
                        sb2.append(':');
                        sb2.append(iM17329b);
                    }
                }
            }
            ArrayList arrayList = this.f47470f;
            C5207g.m11111f(arrayList, "<this>");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append('/');
                sb2.append((String) arrayList.get(i10));
            }
            if (this.f47471g != null) {
                sb2.append('?');
                List<String> list = this.f47471g;
                C5207g.m11108c(list);
                b.m17337f(sb2, list);
            }
            if (this.f47472h != null) {
                sb2.append('#');
                sb2.append(this.f47472h);
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }

    /* JADX INFO: renamed from: so.n$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static String m17332a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 8) != 0) {
                z10 = false;
            }
            if ((i12 & 16) != 0) {
                z11 = false;
            }
            if ((i12 & 32) != 0) {
                z12 = false;
            }
            if ((i12 & 64) != 0) {
                z13 = false;
            }
            int i13 = BuildConfig.SDK_TRUNCATE_LENGTH;
            if ((i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
                charset = null;
            }
            C5207g.m11111f(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int iCodePointAt = str.codePointAt(iCharCount);
                int i14 = 127;
                int i15 = 32;
                if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i13 && !z13) || C7076b.m14279Y2(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z10 || (z11 && !m17334c(str, iCharCount, i11)))) || (iCodePointAt == 43 && z12)))) {
                    C5608e c5608e = new C5608e();
                    c5608e.m11977y1(str, i10, iCharCount);
                    C5608e c5608e2 = null;
                    while (iCharCount < i11) {
                        int iCodePointAt2 = str.codePointAt(iCharCount);
                        if (!z10 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                            if (iCodePointAt2 == 43 && z12) {
                                c5608e.m11969t1(z10 ? "+" : "%2B");
                            } else if (iCodePointAt2 < i15 || iCodePointAt2 == i14 || ((iCodePointAt2 >= 128 && !z13) || C7076b.m14279Y2(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z10 || (z11 && !m17334c(str, iCharCount, i11)))))) {
                                if (c5608e2 == null) {
                                    c5608e2 = new C5608e();
                                }
                                if (charset == null || C5207g.m11106a(charset, StandardCharsets.UTF_8)) {
                                    c5608e2.m11979z1(iCodePointAt2);
                                } else {
                                    int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                    if (!(iCharCount >= 0)) {
                                        throw new IllegalArgumentException(C0166e.m761g("beginIndex < 0: ", iCharCount).toString());
                                    }
                                    if (!(iCharCount2 >= iCharCount)) {
                                        throw new IllegalArgumentException(C0204c.m851j("endIndex < beginIndex: ", iCharCount2, " < ", iCharCount).toString());
                                    }
                                    if (!(iCharCount2 <= str.length())) {
                                        StringBuilder sbM614j = C0141b.m614j("endIndex > string.length: ", iCharCount2, " > ");
                                        sbM614j.append(str.length());
                                        throw new IllegalArgumentException(sbM614j.toString().toString());
                                    }
                                    if (C5207g.m11106a(charset, C7653a.f42116b)) {
                                        c5608e2.m11977y1(str, iCharCount, iCharCount2);
                                    } else {
                                        String strSubstring = str.substring(iCharCount, iCharCount2);
                                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                        byte[] bytes = strSubstring.getBytes(charset);
                                        C5207g.m11110e(bytes, "this as java.lang.String).getBytes(charset)");
                                        c5608e2.m11952c1(bytes, 0, bytes.length);
                                    }
                                }
                                while (!c5608e2.mo11936L()) {
                                    int i16 = c5608e2.readByte() & 255;
                                    c5608e.m11954d1(37);
                                    char[] cArr = C9096n.f47454k;
                                    c5608e.m11954d1(cArr[(i16 >> 4) & 15]);
                                    c5608e.m11954d1(cArr[i16 & 15]);
                                }
                            } else {
                                c5608e.m11979z1(iCodePointAt2);
                            }
                        }
                        iCharCount += Character.charCount(iCodePointAt2);
                        i14 = 127;
                        i15 = 32;
                    }
                    return c5608e.m11934I0();
                }
                iCharCount += Character.charCount(iCodePointAt);
                i13 = BuildConfig.SDK_TRUNCATE_LENGTH;
            }
            String strSubstring2 = str.substring(i10, i11);
            C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring2;
        }

        /* JADX INFO: renamed from: b */
        public static int m17333b(String str) {
            C5207g.m11111f(str, "scheme");
            if (C5207g.m11106a(str, "http")) {
                return 80;
            }
            return C5207g.m11106a(str, "https") ? 443 : -1;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m17334c(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && C9347b.m17711r(str.charAt(i10 + 1)) != -1 && C9347b.m17711r(str.charAt(i12)) != -1;
        }

        /* JADX INFO: renamed from: d */
        public static String m17335d(String str, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            C5207g.m11111f(str, "<this>");
            int iCharCount = i10;
            while (iCharCount < i11) {
                int i14 = iCharCount + 1;
                char cCharAt = str.charAt(iCharCount);
                if (cCharAt != '%' && (cCharAt != '+' || !z10)) {
                    iCharCount = i14;
                }
                C5608e c5608e = new C5608e();
                c5608e.m11977y1(str, i10, iCharCount);
                while (iCharCount < i11) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i13 = iCharCount + 2) < i11) {
                        int iM17711r = C9347b.m17711r(str.charAt(iCharCount + 1));
                        int iM17711r2 = C9347b.m17711r(str.charAt(i13));
                        if (iM17711r == -1 || iM17711r2 == -1) {
                            c5608e.m11979z1(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            c5608e.m11954d1((iM17711r << 4) + iM17711r2);
                            iCharCount = Character.charCount(iCodePointAt) + i13;
                        }
                    } else if (iCodePointAt == 43 && z10) {
                        c5608e.m11954d1(32);
                        iCharCount++;
                    } else {
                        c5608e.m11979z1(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return c5608e.m11934I0();
            }
            String strSubstring = str.substring(i10, i11);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        /* JADX INFO: renamed from: e */
        public static ArrayList m17336e(String str) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                int iM14284d3 = C7076b.m14284d3(str, '&', i10, false, 4);
                if (iM14284d3 == -1) {
                    iM14284d3 = str.length();
                }
                int iM14284d4 = C7076b.m14284d3(str, '=', i10, false, 4);
                if (iM14284d4 == -1 || iM14284d4 > iM14284d3) {
                    String strSubstring = str.substring(i10, iM14284d3);
                    C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring);
                    arrayList.add(null);
                } else {
                    String strSubstring2 = str.substring(i10, iM14284d4);
                    C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring2);
                    String strSubstring3 = str.substring(iM14284d4 + 1, iM14284d3);
                    C5207g.m11110e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(strSubstring3);
                }
                i10 = iM14284d3 + 1;
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: f */
        public static void m17337f(StringBuilder sb2, List list) {
            C5207g.m11111f(list, "<this>");
            C6524g c6524gM356i2 = C0062b.m356i2(C0062b.m411w2(0, list.size()), 2);
            int i10 = c6524gM356i2.f37163a;
            int i11 = c6524gM356i2.f37164b;
            int i12 = c6524gM356i2.f37165c;
            if (i12 <= 0 || i10 > i11) {
                if (i12 >= 0 || i11 > i10) {
                    return;
                }
            }
            while (true) {
                int i13 = i10 + i12;
                String str = (String) list.get(i10);
                String str2 = (String) list.get(i10 + 1);
                if (i10 > 0) {
                    sb2.append('&');
                }
                sb2.append(str);
                if (str2 != null) {
                    sb2.append('=');
                    sb2.append(str2);
                }
                if (i10 == i11) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        new b();
        f47454k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public C9096n(String str, String str2, String str3, String str4, int i10, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.f47455a = str;
        this.f47456b = str2;
        this.f47457c = str3;
        this.f47458d = str4;
        this.f47459e = i10;
        this.f47460f = arrayList;
        this.f47461g = arrayList2;
        this.f47462h = str5;
        this.f47463i = str6;
        this.f47464j = C5207g.m11106a(str, "https");
    }

    /* JADX INFO: renamed from: a */
    public final String m17320a() {
        if (this.f47457c.length() == 0) {
            return "";
        }
        int length = this.f47455a.length() + 3;
        String str = this.f47463i;
        String strSubstring = str.substring(C7076b.m14284d3(str, ':', length, false, 4) + 1, C7076b.m14284d3(str, '@', 0, false, 6));
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: b */
    public final String m17321b() {
        int length = this.f47455a.length() + 3;
        String str = this.f47463i;
        int iM14284d3 = C7076b.m14284d3(str, '/', length, false, 4);
        String strSubstring = str.substring(iM14284d3, C9347b.m17700g(str, iM14284d3, str.length(), "?#"));
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m17322c() {
        int length = this.f47455a.length() + 3;
        String str = this.f47463i;
        int iM14284d3 = C7076b.m14284d3(str, '/', length, false, 4);
        int iM17700g = C9347b.m17700g(str, iM14284d3, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iM14284d3 < iM17700g) {
            int i10 = iM14284d3 + 1;
            int iM17699f = C9347b.m17699f(str, '/', i10, iM17700g);
            String strSubstring = str.substring(i10, iM17699f);
            C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iM14284d3 = iM17699f;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final String m17323d() {
        if (this.f47461g == null) {
            return null;
        }
        String str = this.f47463i;
        int iM14284d3 = C7076b.m14284d3(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iM14284d3, C9347b.m17699f(str, '#', iM14284d3, str.length()));
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: e */
    public final String m17324e() {
        if (this.f47456b.length() == 0) {
            return "";
        }
        int length = this.f47455a.length() + 3;
        String str = this.f47463i;
        String strSubstring = str.substring(length, C9347b.m17700g(str, length, str.length(), ":@"));
        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9096n) && C5207g.m11106a(((C9096n) obj).f47463i, this.f47463i);
    }

    /* JADX INFO: renamed from: f */
    public final String m17325f() {
        a aVar;
        try {
            aVar = new a();
            aVar.m17331d(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        C5207g.m11108c(aVar);
        aVar.f47466b = b.m17332a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        aVar.f47467c = b.m17332a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return aVar.m17328a().f47463i;
    }

    /* JADX INFO: renamed from: g */
    public final C9096n m17326g(String str) {
        a aVar;
        C5207g.m11111f(str, "link");
        try {
            aVar = new a();
            aVar.m17331d(this, str);
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.m17328a();
    }

    /* JADX INFO: renamed from: h */
    public final URI m17327h() {
        String strSubstring;
        a aVar = new a();
        String str = this.f47455a;
        aVar.f47465a = str;
        aVar.f47466b = m17324e();
        aVar.f47467c = m17320a();
        aVar.f47468d = this.f47458d;
        int iM17333b = b.m17333b(str);
        int i10 = this.f47459e;
        if (i10 == iM17333b) {
            i10 = -1;
        }
        aVar.f47469e = i10;
        ArrayList arrayList = aVar.f47470f;
        arrayList.clear();
        arrayList.addAll(m17322c());
        aVar.m17330c(m17323d());
        int i11 = 0;
        if (this.f47462h == null) {
            strSubstring = null;
        } else {
            String str2 = this.f47463i;
            strSubstring = str2.substring(C7076b.m14284d3(str2, '#', 0, false, 6) + 1);
            C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        aVar.f47472h = strSubstring;
        String str3 = aVar.f47468d;
        aVar.f47468d = str3 == null ? null : new Regex("[\"<>^`{|}]").m14272c(str3, "");
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.set(i12, b.m17332a((String) arrayList.get(i12), 0, 0, com.kochava.core.BuildConfig.SDK_PERMISSIONS, true, true, false, false, null, 227));
        }
        List<String> list = aVar.f47471g;
        if (list != null) {
            int size2 = list.size();
            while (i11 < size2) {
                int i13 = i11 + 1;
                String str4 = list.get(i11);
                list.set(i11, str4 == null ? null : b.m17332a(str4, 0, 0, "\\^`{|}", true, true, true, false, null, 195));
                i11 = i13;
            }
        }
        String str5 = aVar.f47472h;
        aVar.f47472h = str5 != null ? b.m17332a(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = aVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e10) {
            try {
                URI uriCreate = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m14272c(string, ""));
                C5207g.m11110e(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final int hashCode() {
        return this.f47463i.hashCode();
    }

    public final String toString() {
        return this.f47463i;
    }
}
