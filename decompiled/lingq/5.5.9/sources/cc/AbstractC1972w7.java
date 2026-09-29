package cc;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.internal.measurement.C2641e2;
import com.google.android.gms.internal.measurement.C2711j2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.w7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1972w7 {

    /* JADX INFO: renamed from: a */
    public final String f10281a;

    /* JADX INFO: renamed from: b */
    public final int f10282b;

    /* JADX INFO: renamed from: c */
    public Boolean f10283c;

    /* JADX INFO: renamed from: d */
    public Boolean f10284d;

    /* JADX INFO: renamed from: e */
    public Long f10285e;

    /* JADX INFO: renamed from: f */
    public Long f10286f;

    public AbstractC1972w7(String str, int i10) {
        this.f10281a = str;
        this.f10282b = i10;
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m5909d(BigDecimal bigDecimal, C2641e2 c2641e2, double d10) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        C6272i.m12915i(c2641e2);
        if (c2641e2.m7764z()) {
            boolean z10 = true;
            if (c2641e2.m7759E() != 1) {
                if (c2641e2.m7759E() == 5) {
                    if (!c2641e2.m7758D() || !c2641e2.m7757C()) {
                        return null;
                    }
                } else if (!c2641e2.m7755A()) {
                    return null;
                }
                int iM7759E = c2641e2.m7759E();
                if (c2641e2.m7759E() == 5) {
                    if (C1864k7.m5714I(c2641e2.m7762x()) && C1864k7.m5714I(c2641e2.m7761w())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c2641e2.m7762x());
                            bigDecimal4 = new BigDecimal(c2641e2.m7761w());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!C1864k7.m5714I(c2641e2.m7760v())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c2641e2.m7760v());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iM7759E == 5) {
                    if (bigDecimal3 != null) {
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = iM7759E - 1;
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                    }
                    if (i10 == 3) {
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d10 != 0.0d) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d10).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d10).multiply(new BigDecimal(2)))) < 0);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (i10 != 4) {
                        return null;
                    }
                    if (bigDecimal3 != null) {
                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                } else if (bigDecimal2 != null) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[LOOP:0: B:37:0x007c->B:39:0x0083, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00df  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX WARN: Code duplicated, block: B:72:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0106  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static Boolean m5910e(String str, C2711j2 c2711j2, C1860k3 c1860k3) {
        String strM7886w;
        List listM7887x;
        ArrayList arrayList;
        Iterator it;
        String str2;
        int i10;
        C6272i.m12915i(c2711j2);
        if (str != null && c2711j2.m7883B() && c2711j2.m7884C() != 1) {
            if (c2711j2.m7884C() == 7) {
                if (c2711j2.m7885t() == 0) {
                    return null;
                }
            } else if (!c2711j2.m7882A()) {
                return null;
            }
            int iM7884C = c2711j2.m7884C();
            boolean zM7888y = c2711j2.m7888y();
            if (!zM7888y && iM7884C != 2) {
                if (iM7884C != 7) {
                    strM7886w = c2711j2.m7886w().toUpperCase(Locale.ENGLISH);
                }
                if (c2711j2.m7885t() == 0) {
                    listM7887x = null;
                } else {
                    listM7887x = c2711j2.m7887x();
                    if (!zM7888y) {
                        arrayList = new ArrayList(listM7887x.size());
                        it = listM7887x.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                        }
                        listM7887x = Collections.unmodifiableList(arrayList);
                    }
                }
                if (iM7884C == 2) {
                    str2 = strM7886w;
                } else {
                    str2 = null;
                }
                if (iM7884C == 7) {
                    if (listM7887x != null || listM7887x.isEmpty()) {
                    }
                } else if (strM7886w == null) {
                    return null;
                }
                if (!zM7888y && iM7884C != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iM7884C - 1) {
                    case 1:
                        if (str2 == null) {
                            return null;
                        }
                        if (true != zM7888y) {
                            i10 = 66;
                        } else {
                            i10 = 0;
                        }
                        try {
                            return Boolean.valueOf(Pattern.compile(str2, i10).matcher(str).matches());
                        } catch (PatternSyntaxException unused) {
                            c1860k3.f9945i.m5624b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                            return null;
                        }
                    case 2:
                        return Boolean.valueOf(str.startsWith(strM7886w));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strM7886w));
                    case 4:
                        return Boolean.valueOf(str.contains(strM7886w));
                    case 5:
                        return Boolean.valueOf(str.equals(strM7886w));
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (listM7887x == null) {
                            return null;
                        }
                        return Boolean.valueOf(listM7887x.contains(str));
                    default:
                        return null;
                }
            }
            strM7886w = c2711j2.m7886w();
            if (c2711j2.m7885t() == 0) {
                listM7887x = null;
            } else {
                listM7887x = c2711j2.m7887x();
                if (!zM7888y) {
                    arrayList = new ArrayList(listM7887x.size());
                    it = listM7887x.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listM7887x = Collections.unmodifiableList(arrayList);
                }
            }
            if (iM7884C == 2) {
                str2 = strM7886w;
            } else {
                str2 = null;
            }
            if (iM7884C == 7) {
                return listM7887x != null ? null : null;
            }
            if (strM7886w == null) {
                return null;
            }
            if (!zM7888y) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            switch (iM7884C - 1) {
                case 1:
                    if (str2 == null) {
                        return null;
                    }
                    if (true != zM7888y) {
                        i10 = 66;
                    } else {
                        i10 = 0;
                    }
                    return Boolean.valueOf(Pattern.compile(str2, i10).matcher(str).matches());
                case 2:
                    return Boolean.valueOf(str.startsWith(strM7886w));
                case 3:
                    return Boolean.valueOf(str.endsWith(strM7886w));
                case 4:
                    return Boolean.valueOf(str.contains(strM7886w));
                case 5:
                    return Boolean.valueOf(str.equals(strM7886w));
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (listM7887x == null) {
                        return null;
                    }
                    return Boolean.valueOf(listM7887x.contains(str));
                default:
                    return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Boolean m5911f(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo5903a();

    /* JADX INFO: renamed from: b */
    public abstract boolean mo5904b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo5905c();
}
