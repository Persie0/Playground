package so;

import dm.C5207g;
import java.util.concurrent.TimeUnit;
import kotlin.text.C7076b;
import mo.C7661i;
import to.C9347b;

/* JADX INFO: renamed from: so.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C9085c {

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f47385n = 0;

    /* JADX INFO: renamed from: a */
    public final boolean f47386a;

    /* JADX INFO: renamed from: b */
    public final boolean f47387b;

    /* JADX INFO: renamed from: c */
    public final int f47388c;

    /* JADX INFO: renamed from: d */
    public final int f47389d;

    /* JADX INFO: renamed from: e */
    public final boolean f47390e;

    /* JADX INFO: renamed from: f */
    public final boolean f47391f;

    /* JADX INFO: renamed from: g */
    public final boolean f47392g;

    /* JADX INFO: renamed from: h */
    public final int f47393h;

    /* JADX INFO: renamed from: i */
    public final int f47394i;

    /* JADX INFO: renamed from: j */
    public final boolean f47395j;

    /* JADX INFO: renamed from: k */
    public final boolean f47396k;

    /* JADX INFO: renamed from: l */
    public final boolean f47397l;

    /* JADX INFO: renamed from: m */
    public String f47398m;

    /* JADX INFO: renamed from: so.c$a */
    public static final class a {
    }

    /* JADX INFO: renamed from: so.c$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static int m17285a(String str, int i10, String str2) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                if (C7076b.m14279Y2(str2, str.charAt(i10))) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
        /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:40:0x0109  */
        /* JADX WARN: Code duplicated, block: B:42:0x010f  */
        /* JADX WARN: Code duplicated, block: B:44:0x0117  */
        /* JADX WARN: Code duplicated, block: B:45:0x011a  */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
        /* JADX WARN: Code duplicated, block: B:48:0x0129  */
        /* JADX WARN: Code duplicated, block: B:50:0x0133  */
        /* JADX WARN: Code duplicated, block: B:51:0x0138  */
        /* JADX WARN: Code duplicated, block: B:53:0x0140  */
        /* JADX WARN: Code duplicated, block: B:54:0x0143  */
        /* JADX WARN: Code duplicated, block: B:56:0x014b  */
        /* JADX WARN: Code duplicated, block: B:57:0x014e  */
        /* JADX WARN: Code duplicated, block: B:59:0x0156  */
        /* JADX WARN: Code duplicated, block: B:60:0x0159  */
        /* JADX WARN: Code duplicated, block: B:62:0x0161  */
        /* JADX WARN: Code duplicated, block: B:63:0x0169  */
        /* JADX WARN: Code duplicated, block: B:65:0x0171  */
        /* JADX WARN: Code duplicated, block: B:66:0x0178  */
        /* JADX WARN: Code duplicated, block: B:68:0x0181  */
        /* JADX WARN: Code duplicated, block: B:69:0x0184  */
        /* JADX WARN: Code duplicated, block: B:71:0x018c  */
        /* JADX WARN: Code duplicated, block: B:72:0x018f  */
        /* JADX WARN: Code duplicated, block: B:74:0x0197  */
        /* JADX WARN: Code duplicated, block: B:92:0x0199 A[SYNTHETIC] */
        /* JADX INFO: renamed from: b */
        public static C9085c m17286b(C9095m c9095m) {
            int i10;
            int iM17285a;
            String string;
            int i11;
            boolean z10;
            int iM17285a2;
            String string2;
            C9095m c9095m2 = c9095m;
            C5207g.m11111f(c9095m2, "headers");
            int length = c9095m2.f47452a.length / 2;
            int i12 = 0;
            boolean z11 = true;
            String str = null;
            boolean z12 = false;
            boolean z13 = false;
            int iM17718y = -1;
            int iM17718y2 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int iM17718y3 = -1;
            int iM17718y4 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i12 < length) {
                int i13 = i12 + 1;
                String strM17306f = c9095m2.m17306f(i12);
                String strM17309l = c9095m2.m17309l(i12);
                if (C7661i.m15249O2(strM17306f, "Cache-Control")) {
                    if (str == null) {
                        str = strM17309l;
                    }
                    i10 = 0;
                    while (i10 < strM17309l.length()) {
                        iM17285a = m17285a(strM17309l, i10, "=,;");
                        String strSubstring = strM17309l.substring(i10, iM17285a);
                        C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = C7076b.m14277B3(strSubstring).toString();
                        if (iM17285a != strM17309l.length() || strM17309l.charAt(iM17285a) == ',' || strM17309l.charAt(iM17285a) == ';') {
                            i11 = length;
                            z10 = true;
                            iM17285a2 = iM17285a + 1;
                            string2 = null;
                        } else {
                            int length2 = iM17285a + 1;
                            byte[] bArr = C9347b.f48082a;
                            int length3 = strM17309l.length();
                            while (true) {
                                if (length2 >= length3) {
                                    i11 = length;
                                    length2 = strM17309l.length();
                                    break;
                                }
                                int i14 = length2 + 1;
                                int i15 = length3;
                                char cCharAt = strM17309l.charAt(length2);
                                i11 = length;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    break;
                                }
                                length2 = i14;
                                length3 = i15;
                                length = i11;
                            }
                            if (length2 >= strM17309l.length() || strM17309l.charAt(length2) != '\"') {
                                z10 = true;
                                iM17285a2 = m17285a(strM17309l, length2, ",;");
                                String strSubstring2 = strM17309l.substring(length2, iM17285a2);
                                C5207g.m11110e(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = C7076b.m14277B3(strSubstring2).toString();
                            } else {
                                int i16 = length2 + 1;
                                int iM14284d3 = C7076b.m14284d3(strM17309l, '\"', i16, false, 4);
                                string2 = strM17309l.substring(i16, iM14284d3);
                                C5207g.m11110e(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                z10 = true;
                                iM17285a2 = iM14284d3 + 1;
                            }
                        }
                        if (C7661i.m15249O2("no-cache", string)) {
                            z12 = z10;
                        } else if (C7661i.m15249O2("no-store", string)) {
                            z13 = z10;
                        } else {
                            if (C7661i.m15249O2("max-age", string)) {
                                iM17718y = C9347b.m17718y(string2, -1);
                            } else if (C7661i.m15249O2("s-maxage", string)) {
                                iM17718y2 = C9347b.m17718y(string2, -1);
                            } else if (C7661i.m15249O2("private", string)) {
                                z14 = z10;
                            } else if (C7661i.m15249O2("public", string)) {
                                z15 = z10;
                            } else if (C7661i.m15249O2("must-revalidate", string)) {
                                z16 = z10;
                            } else if (C7661i.m15249O2("max-stale", string)) {
                                iM17718y3 = C9347b.m17718y(string2, Integer.MAX_VALUE);
                            } else if (C7661i.m15249O2("min-fresh", string)) {
                                iM17718y4 = C9347b.m17718y(string2, -1);
                            } else if (C7661i.m15249O2("only-if-cached", string)) {
                                z17 = z10;
                            } else if (C7661i.m15249O2("no-transform", string)) {
                                z18 = z10;
                            } else if (C7661i.m15249O2("immutable", string)) {
                                z19 = z10;
                            }
                            i10 = iM17285a2;
                            length = i11;
                        }
                        i10 = iM17285a2;
                        length = i11;
                    }
                    c9095m2 = c9095m;
                    i12 = i13;
                    length = length;
                } else {
                    if (C7661i.m15249O2(strM17306f, "Pragma")) {
                    }
                    c9095m2 = c9095m;
                    i12 = i13;
                    length = length;
                }
                z11 = false;
                i10 = 0;
                while (i10 < strM17309l.length()) {
                    iM17285a = m17285a(strM17309l, i10, "=,;");
                    String strSubstring3 = strM17309l.substring(i10, iM17285a);
                    C5207g.m11110e(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = C7076b.m14277B3(strSubstring3).toString();
                    if (iM17285a != strM17309l.length()) {
                        i11 = length;
                        z10 = true;
                        iM17285a2 = iM17285a + 1;
                        string2 = null;
                    } else {
                        i11 = length;
                        z10 = true;
                        iM17285a2 = iM17285a + 1;
                        string2 = null;
                    }
                    if (C7661i.m15249O2("no-cache", string)) {
                        z12 = z10;
                    } else if (C7661i.m15249O2("no-store", string)) {
                        z13 = z10;
                    } else {
                        if (C7661i.m15249O2("max-age", string)) {
                            iM17718y = C9347b.m17718y(string2, -1);
                        } else if (C7661i.m15249O2("s-maxage", string)) {
                            iM17718y2 = C9347b.m17718y(string2, -1);
                        } else if (C7661i.m15249O2("private", string)) {
                            z14 = z10;
                        } else if (C7661i.m15249O2("public", string)) {
                            z15 = z10;
                        } else if (C7661i.m15249O2("must-revalidate", string)) {
                            z16 = z10;
                        } else if (C7661i.m15249O2("max-stale", string)) {
                            iM17718y3 = C9347b.m17718y(string2, Integer.MAX_VALUE);
                        } else if (C7661i.m15249O2("min-fresh", string)) {
                            iM17718y4 = C9347b.m17718y(string2, -1);
                        } else if (C7661i.m15249O2("only-if-cached", string)) {
                            z17 = z10;
                        } else if (C7661i.m15249O2("no-transform", string)) {
                            z18 = z10;
                        } else if (C7661i.m15249O2("immutable", string)) {
                            z19 = z10;
                        }
                        i10 = iM17285a2;
                        length = i11;
                    }
                    i10 = iM17285a2;
                    length = i11;
                }
                c9095m2 = c9095m;
                i12 = i13;
                length = length;
            }
            return new C9085c(z12, z13, iM17718y, iM17718y2, z14, z15, z16, iM17718y3, iM17718y4, z17, z18, z19, !z11 ? null : str);
        }
    }

    static {
        new a();
        new a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C5207g.m11111f(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C9085c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f47386a = z10;
        this.f47387b = z11;
        this.f47388c = i10;
        this.f47389d = i11;
        this.f47390e = z12;
        this.f47391f = z13;
        this.f47392g = z14;
        this.f47393h = i12;
        this.f47394i = i13;
        this.f47395j = z15;
        this.f47396k = z16;
        this.f47397l = z17;
        this.f47398m = str;
    }

    public final String toString() {
        String string = this.f47398m;
        if (string == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f47386a) {
                sb2.append("no-cache, ");
            }
            if (this.f47387b) {
                sb2.append("no-store, ");
            }
            int i10 = this.f47388c;
            if (i10 != -1) {
                sb2.append("max-age=");
                sb2.append(i10);
                sb2.append(", ");
            }
            int i11 = this.f47389d;
            if (i11 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i11);
                sb2.append(", ");
            }
            if (this.f47390e) {
                sb2.append("private, ");
            }
            if (this.f47391f) {
                sb2.append("public, ");
            }
            if (this.f47392g) {
                sb2.append("must-revalidate, ");
            }
            int i12 = this.f47393h;
            if (i12 != -1) {
                sb2.append("max-stale=");
                sb2.append(i12);
                sb2.append(", ");
            }
            int i13 = this.f47394i;
            if (i13 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i13);
                sb2.append(", ");
            }
            if (this.f47395j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f47396k) {
                sb2.append("no-transform, ");
            }
            if (this.f47397l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            string = sb2.toString();
            C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
            this.f47398m = string;
        }
        return string;
    }
}
