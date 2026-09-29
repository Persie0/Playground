package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class dx3 {

    /* JADX INFO: renamed from: a */
    public String f36359a;

    /* JADX INFO: renamed from: d */
    public String f36362d;

    /* JADX INFO: renamed from: g */
    public ArrayList f36365g;

    /* JADX INFO: renamed from: h */
    public String f36366h;

    /* JADX INFO: renamed from: b */
    public String f36360b = "";

    /* JADX INFO: renamed from: c */
    public String f36361c = "";

    /* JADX INFO: renamed from: e */
    public int f36363e = -1;

    /* JADX INFO: renamed from: f */
    public final ArrayList f36364f = vz1.m23608N("");

    /* JADX INFO: renamed from: g */
    public static ArrayList m10733g(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM23388k0 = vk9.m23388k0(str, '&', i, 4);
            if (iM23388k0 == -1) {
                iM23388k0 = str.length();
            }
            int iM23388k1 = vk9.m23388k0(str, '=', i, 4);
            if (iM23388k1 == -1 || iM23388k1 > iM23388k0) {
                arrayList.add(str.substring(i, iM23388k0));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iM23388k1));
                arrayList.add(str.substring(iM23388k1 + 1, iM23388k0));
            }
            i = iM23388k0 + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final ex3 m10734a() {
        ArrayList arrayList;
        String str = this.f36359a;
        if (str == null) {
            C3386nv.m17633t("scheme == null");
            return null;
        }
        String strM24742O = xwc.m24742O(0, 0, 7, this.f36360b);
        String strM24742O2 = xwc.m24742O(0, 0, 7, this.f36361c);
        String str2 = this.f36362d;
        if (str2 == null) {
            C3386nv.m17633t("host == null");
            return null;
        }
        int iM10735b = m10735b();
        ArrayList arrayList2 = this.f36364f;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(xwc.m24742O(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = this.f36365g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(v91.m23189q0(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList.add(str3 != null ? xwc.m24742O(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f36366h;
        return new ex3(str, strM24742O, strM24742O2, str2, iM10735b, arrayList3, arrayList, str4 != null ? xwc.m24742O(0, 0, 7, str4) : null, toString());
    }

    /* JADX INFO: renamed from: b */
    public final int m10735b() {
        int i = this.f36363e;
        if (i != -1) {
            return i;
        }
        String str = this.f36359a;
        str.getClass();
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX INFO: renamed from: c */
    public final void m10736c(String str) {
        str.getClass();
        String strM12480b = gcb.m12480b(xwc.m24742O(0, 0, 7, str));
        if (strM12480b != null) {
            this.f36362d = strM12480b;
        } else {
            C3386nv.m17626m("unexpected host: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0028  */
    /* JADX INFO: renamed from: d */
    public final void m10737d(ex3 ex3Var, String str) {
        int i;
        int i2;
        int iM13770f;
        int i3;
        int i4;
        char cCharAt;
        str.getClass();
        byte[] bArr = icb.f43946a;
        int iM13773i = icb.m13773i(0, str, str.length());
        int iM13774j = icb.m13774j(iM13773i, str, str.length());
        byte b = -1;
        if (iM13774j - iM13773i >= 2) {
            char cCharAt2 = str.charAt(iM13773i);
            if ((fa4.m11651m(cCharAt2, 97) >= 0 && fa4.m11651m(cCharAt2, 122) <= 0) || (fa4.m11651m(cCharAt2, 65) >= 0 && fa4.m11651m(cCharAt2, 90) <= 0)) {
                i = iM13773i + 1;
                while (true) {
                    if (i < iM13774j) {
                        char cCharAt3 = str.charAt(i);
                        if (('a' > cCharAt3 || cCharAt3 >= '{') && (('A' > cCharAt3 || cCharAt3 >= '[') && !(('0' <= cCharAt3 && cCharAt3 < ':') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                            if (cCharAt3 == ':') {
                                break;
                            } else {
                                break;
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        int i5 = 1;
        if (i != -1) {
            if (cl9.m4841X(str, iM13773i, "https:", true)) {
                this.f36359a = "https";
                iM13773i += 6;
            } else {
                if (!cl9.m4841X(str, iM13773i, "http:", true)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + '\'');
                }
                this.f36359a = "http";
                iM13773i += 5;
            }
        } else {
            if (ex3Var == null) {
                C3386nv.m17626m("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(str.length() > 6 ? vk9.m23375K0(6, str).concat("...") : str));
                return;
            }
            this.f36359a = ex3Var.f38024a;
        }
        int i6 = iM13773i;
        int i7 = 0;
        while (true) {
            i2 = i5;
            if (i6 >= iM13774j || !((cCharAt = str.charAt(i6)) == '/' || cCharAt == '\\')) {
                break;
            }
            i7++;
            i6++;
            i5 = i2;
        }
        ArrayList arrayList = this.f36364f;
        byte b2 = 35;
        if (i7 >= 2 || ex3Var == null || !fa4.m11650l(ex3Var.f38024a, this.f36359a)) {
            int i8 = iM13773i + i7;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                iM13770f = icb.m13770f(str, i8, iM13774j, "@/\\?#");
                byte bCharAt = iM13770f != iM13774j ? str.charAt(iM13770f) : b;
                if (bCharAt == b || bCharAt == b2 || bCharAt == 47 || bCharAt == 92 || bCharAt == 63) {
                    break;
                }
                if (bCharAt == 64) {
                    if (i9 == 0) {
                        int iM13769e = icb.m13769e(str, ':', i8, iM13770f);
                        String strM24770i = xwc.m24770i(str, i8, " \"':;<=>@[]^`{}|/\\?#", iM13769e, 112);
                        if (i10 != 0) {
                            strM24770i = AbstractC3393o1.m17739n(new StringBuilder(), this.f36360b, "%40", strM24770i);
                        }
                        this.f36360b = strM24770i;
                        if (iM13769e != iM13770f) {
                            this.f36361c = xwc.m24770i(str, iM13769e + 1, " \"':;<=>@[]^`{}|/\\?#", iM13770f, 112);
                            i9 = i2;
                        }
                        i10 = i2;
                    } else {
                        this.f36361c += "%40" + xwc.m24770i(str, i8, " \"':;<=>@[]^`{}|/\\?#", iM13770f, 112);
                    }
                    i8 = iM13770f + 1;
                    b2 = 35;
                    b = -1;
                }
            }
            int i11 = i8;
            while (true) {
                if (i11 < iM13770f) {
                    char cCharAt4 = str.charAt(i11);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i11++;
                            if (i11 >= iM13770f) {
                                break;
                            }
                        } while (str.charAt(i11) != ']');
                    }
                    i11++;
                } else {
                    i11 = iM13770f;
                    break;
                }
            }
            int i12 = i11 + 1;
            if (i12 < iM13770f) {
                this.f36362d = gcb.m12480b(xwc.m24742O(i8, i11, 4, str));
                try {
                    i4 = Integer.parseInt(xwc.m24770i(str, i12, "", iM13770f, 120));
                    if (i2 > i4 || i4 >= 65536) {
                        i4 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f36363e = i4;
                if (i4 == -1) {
                    v63.m23134l("Invalid URL port: \"", 34, str.substring(i12, iM13770f));
                    return;
                }
            } else {
                this.f36362d = gcb.m12480b(xwc.m24742O(i8, i11, 4, str));
                String str2 = this.f36359a;
                str2.getClass();
                if (str2.equals("http")) {
                    i3 = 80;
                } else {
                    i3 = str2.equals("https") ? 443 : -1;
                }
                this.f36363e = i3;
            }
            if (this.f36362d == null) {
                v63.m23134l("Invalid URL host: \"", 34, str.substring(i8, i11));
                return;
            }
            iM13773i = iM13770f;
        } else {
            this.f36360b = ex3Var.m11379e();
            this.f36361c = ex3Var.m11375a();
            this.f36362d = ex3Var.f38027d;
            this.f36363e = ex3Var.f38028e;
            arrayList.clear();
            arrayList.addAll(ex3Var.m11377c());
            if (iM13773i == iM13774j || str.charAt(iM13773i) == '#') {
                String strM11378d = ex3Var.m11378d();
                this.f36365g = strM11378d != null ? m10733g(xwc.m24770i(strM11378d, 0, " \"'<>#", 0, 83)) : null;
            }
        }
        int iM13770f2 = icb.m13770f(str, iM13773i, iM13774j, "?#");
        if (iM13773i != iM13770f2) {
            char cCharAt5 = str.charAt(iM13773i);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList.clear();
                arrayList.add("");
                iM13773i++;
            } else {
                arrayList.set(arrayList.size() - 1, "");
            }
            while (iM13773i < iM13770f2) {
                int iM13770f3 = icb.m13770f(str, iM13773i, iM13770f2, "/\\");
                boolean z = iM13770f3 < iM13770f2;
                String strM24770i2 = xwc.m24770i(str, iM13773i, " \"<>^`{}|/\\?#", iM13770f3, 112);
                if (!strM24770i2.equals(".") && !strM24770i2.equalsIgnoreCase("%2e")) {
                    if (!strM24770i2.equals("..") && !strM24770i2.equalsIgnoreCase("%2e.") && !strM24770i2.equalsIgnoreCase(".%2e") && !strM24770i2.equalsIgnoreCase("%2e%2e")) {
                        if (((CharSequence) AbstractC3393o1.m17731f(1, arrayList)).length() == 0) {
                            arrayList.set(arrayList.size() - 1, strM24770i2);
                        } else {
                            arrayList.add(strM24770i2);
                        }
                        if (z) {
                            arrayList.add("");
                        }
                    } else if (((String) arrayList.remove(arrayList.size() - 1)).length() != 0 || arrayList.isEmpty()) {
                        arrayList.add("");
                    } else {
                        arrayList.set(arrayList.size() - 1, "");
                    }
                }
                iM13773i = z ? iM13770f3 + 1 : iM13770f3;
            }
        }
        if (iM13770f2 < iM13774j && str.charAt(iM13770f2) == '?') {
            int iM13769e2 = icb.m13769e(str, '#', iM13770f2, iM13774j);
            this.f36365g = m10733g(xwc.m24770i(str, iM13770f2 + 1, " \"'<>#", iM13769e2, 80));
            iM13770f2 = iM13769e2;
        }
        if (iM13770f2 >= iM13774j || str.charAt(iM13770f2) != '#') {
            return;
        }
        this.f36366h = xwc.m24770i(str, iM13770f2 + 1, "", iM13774j, 48);
    }

    /* JADX INFO: renamed from: e */
    public final void m10738e(int i) {
        if (1 > i || i >= 65536) {
            C3386nv.m17624j(ux5.m22988k(i, "unexpected port: "));
        } else {
            this.f36363e = i;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m10739f(String str) {
        str.getClass();
        if (str.equalsIgnoreCase("http")) {
            this.f36359a = "http";
        } else if (str.equalsIgnoreCase("https")) {
            this.f36359a = "https";
        } else {
            C3386nv.m17626m("unexpected scheme: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f36359a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.f36360b.length() > 0 || this.f36361c.length() > 0) {
            sb.append(this.f36360b);
            if (this.f36361c.length() > 0) {
                sb.append(':');
                sb.append(this.f36361c);
            }
            sb.append('@');
        }
        String str2 = this.f36362d;
        if (str2 != null) {
            if (vk9.m23381d0(str2, ':')) {
                sb.append('[');
                sb.append(this.f36362d);
                sb.append(']');
            } else {
                sb.append(this.f36362d);
            }
        }
        int i = -1;
        if (this.f36363e != -1 || this.f36359a != null) {
            int iM10735b = m10735b();
            String str3 = this.f36359a;
            if (str3 == null) {
                sb.append(':');
                sb.append(iM10735b);
            } else {
                if (str3.equals("http")) {
                    i = 80;
                } else if (str3.equals("https")) {
                    i = 443;
                }
                if (iM10735b != i) {
                    sb.append(':');
                    sb.append(iM10735b);
                }
            }
        }
        ArrayList arrayList = this.f36364f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append((String) arrayList.get(i2));
        }
        if (this.f36365g != null) {
            sb.append('?');
            ArrayList arrayList2 = this.f36365g;
            arrayList2.getClass();
            p84.m18963h(arrayList2, sb);
        }
        if (this.f36366h != null) {
            sb.append('#');
            sb.append(this.f36366h);
        }
        return sb.toString();
    }
}
