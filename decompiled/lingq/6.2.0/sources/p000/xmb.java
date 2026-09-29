package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class xmb implements Iterable, kmb {

    /* JADX INFO: renamed from: a */
    public final String f68360a;

    public xmb(String str) {
        if (str != null) {
            this.f68360a = str;
        } else {
            C3386nv.m17626m("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.valueOf(!this.f68360a.isEmpty());
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return this.f68360a;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return new tmb(this, 0);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        String str = this.f68360a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xmb) {
            return this.f68360a.equals(((xmb) obj).f68360a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02e4 A[PHI: r8
      0x02e4: PHI (r8v6 boolean) = (r8v12 boolean), (r8v13 boolean), (r8v16 boolean) binds: [B:100:0x02d0, B:101:0x02d2, B:103:0x02e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        String str2;
        int i;
        int i2;
        int i3;
        boolean zIsEmpty;
        C3329mb c3329mb2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                C3386nv.m17626m(str.concat(" is not a String function"));
                return null;
            }
        }
        int iHashCode = str.hashCode();
        String strMo3809c = "undefined";
        String str3 = this.f68360a;
        z = false;
        boolean z = false;
        switch (iHashCode) {
            case -1789698943:
                if (str.equals("hasOwnProperty")) {
                    qdd.m19875b(1, "hasOwnProperty", arrayList);
                    kmb kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    boolean zEquals = "length".equals(kmbVarM4562k.mo3809c());
                    sib sibVar = kmb.f47520D;
                    if (zEquals) {
                        return sibVar;
                    }
                    double dDoubleValue = kmbVarM4562k.mo3811e().doubleValue();
                    return (dDoubleValue != Math.floor(dDoubleValue) || (i = (int) dDoubleValue) < 0 || i >= str3.length()) ? kmb.f47521E : sibVar;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1776922004:
                if (str.equals("toString")) {
                    qdd.m19875b(0, "toString", arrayList);
                    return this;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    qdd.m19875b(0, "toLocaleLowerCase", arrayList);
                    return new xmb(str3.toLowerCase());
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1361633751:
                if (str.equals("charAt")) {
                    qdd.m19877d(1, "charAt", arrayList);
                    int iM19882i = arrayList.isEmpty() ? 0 : (int) qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3811e().doubleValue());
                    return (iM19882i < 0 || iM19882i >= str3.length()) ? kmb.f47522F : new xmb(String.valueOf(str3.charAt(iM19882i)));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str3);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(i4)).mo3809c());
                        }
                        return new xmb(sb.toString());
                    }
                    return this;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    qdd.m19875b(0, "toLowerCase", arrayList);
                    return new xmb(str3.toLowerCase(Locale.ENGLISH));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -906336856:
                if (str.equals("search")) {
                    qdd.m19877d(1, "search", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.isEmpty() ? "undefined" : ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c()).matcher(str3);
                    return matcher.find() ? new bkb(Double.valueOf(matcher.start())) : new bkb(Double.valueOf(-1.0d));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    qdd.m19875b(0, "toLocaleUpperCase", arrayList);
                    return new xmb(str3.toUpperCase());
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    qdd.m19877d(2, "lastIndexOf", arrayList);
                    String strMo3809c2 = arrayList.size() > 0 ? ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c() : "undefined";
                    double dDoubleValue2 = arrayList.size() < 2 ? Double.NaN : ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue();
                    return new bkb(Double.valueOf(str3.lastIndexOf(strMo3809c2, (int) (Double.isNaN(dDoubleValue2) ? Double.POSITIVE_INFINITY : qdd.m19882i(dDoubleValue2)))));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    qdd.m19875b(0, "toUpperCase", arrayList);
                    return new xmb(str3.toUpperCase(Locale.ENGLISH));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 3568674:
                if (str.equals(str2)) {
                    qdd.m19875b(0, "toUpperCase", arrayList);
                    return new xmb(str3.trim());
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 103668165:
                if (str.equals("match")) {
                    qdd.m19877d(1, "match", arrayList);
                    Matcher matcher2 = Pattern.compile(arrayList.size() <= 0 ? "" : ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c()).matcher(str3);
                    return matcher2.find() ? new cib(Arrays.asList(new xmb(matcher2.group()))) : kmb.f47524z;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    qdd.m19877d(2, "slice", arrayList);
                    double dM19882i = qdd.m19882i(!arrayList.isEmpty() ? ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3811e().doubleValue() : 0.0d);
                    double dMax = dM19882i < 0.0d ? Math.max(((double) str3.length()) + dM19882i, 0.0d) : Math.min(dM19882i, str3.length());
                    double dM19882i2 = qdd.m19882i(arrayList.size() > 1 ? ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue() : str3.length());
                    int i5 = (int) dMax;
                    return new xmb(str3.substring(i5, Math.max(0, ((int) (dM19882i2 < 0.0d ? Math.max(((double) str3.length()) + dM19882i2, 0.0d) : Math.min(dM19882i2, str3.length()))) - i5) + i5));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 109648666:
                if (str.equals("split")) {
                    qdd.m19877d(2, "split", arrayList);
                    if (str3.length() == 0) {
                        return new cib(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String strMo3809c3 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c();
                        long jM19881h = arrayList.size() > 1 ? ((long) qdd.m19881h(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue())) & 4294967295L : 2147483647L;
                        if (jM19881h == 0) {
                            return new cib();
                        }
                        String[] strArrSplit = str3.split(Pattern.quote(strMo3809c3), ((int) jM19881h) + 1);
                        int length = strArrSplit.length;
                        if (!strMo3809c3.isEmpty() || length <= 0) {
                            i3 = zIsEmpty;
                            z = zIsEmpty;
                            i2 = length;
                            i3 = z;
                        } else {
                            zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = length - 1;
                            if (!strArrSplit[i2].isEmpty()) {
                                i3 = zIsEmpty;
                                z = zIsEmpty;
                                i2 = length;
                                i3 = z;
                            }
                        }
                        i3 = zIsEmpty;
                        z = zIsEmpty;
                        if (length > jM19881h) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new xmb(strArrSplit[i3]));
                            i3++;
                        }
                    }
                    return new cib(arrayList2);
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 530542161:
                if (str.equals("substring")) {
                    qdd.m19877d(2, "substring", arrayList);
                    int iM19882i2 = !arrayList.isEmpty() ? (int) qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3811e().doubleValue()) : 0;
                    int iM19882i3 = arrayList.size() > 1 ? (int) qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue()) : str3.length();
                    int iMin = Math.min(Math.max(iM19882i2, 0), str3.length());
                    int iMin2 = Math.min(Math.max(iM19882i3, 0), str3.length());
                    return new xmb(str3.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 1094496948:
                if (str.equals("replace")) {
                    qdd.m19877d(2, "replace", arrayList);
                    boolean zIsEmpty2 = arrayList.isEmpty();
                    kmb kmbVarMo12757a = kmb.f47523y;
                    if (!zIsEmpty2) {
                        strMo3809c = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c();
                        if (arrayList.size() > 1) {
                            kmbVarMo12757a = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                        }
                    }
                    String str4 = strMo3809c;
                    int iIndexOf = str3.indexOf(str4);
                    if (iIndexOf >= 0) {
                        if (kmbVarMo12757a instanceof vkb) {
                            kmbVarMo12757a = ((vkb) kmbVarMo12757a).mo12757a(c3329mb, Arrays.asList(new xmb(str4), new bkb(Double.valueOf(iIndexOf)), this));
                        }
                        String strSubstring = str3.substring(0, iIndexOf);
                        String strMo3809c4 = kmbVarMo12757a.mo3809c();
                        String strSubstring2 = str3.substring(str4.length() + iIndexOf);
                        return new xmb(AbstractC3393o1.m17739n(new StringBuilder(strSubstring.length() + String.valueOf(strMo3809c4).length() + strSubstring2.length()), strSubstring, strMo3809c4, strSubstring2));
                    }
                    return this;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    qdd.m19877d(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        c3329mb2 = c3329mb;
                    } else {
                        c3329mb2 = c3329mb;
                        strMo3809c = ((cdb) c3329mb2.f50861c).m4562k(c3329mb2, (kmb) arrayList.get(0)).mo3809c();
                    }
                    return new bkb(Double.valueOf(str3.indexOf(strMo3809c, (int) qdd.m19882i(arrayList.size() < 2 ? 0.0d : ((cdb) c3329mb2.f50861c).m4562k(c3329mb2, (kmb) arrayList.get(1)).mo3811e().doubleValue()))));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            default:
                C3386nv.m17626m("Command not supported");
                return null;
        }
    }

    public final int hashCode() {
        return this.f68360a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tmb(this, 1);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        return new xmb(this.f68360a);
    }

    public final String toString() {
        String str = this.f68360a;
        return AbstractC3393o1.m17739n(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
