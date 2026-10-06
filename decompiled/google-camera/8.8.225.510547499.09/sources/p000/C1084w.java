package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: w */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1084w implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final C1084w f47887a;

    /* JADX INFO: renamed from: b */
    static final Pattern f47888b;

    /* JADX INFO: renamed from: c */
    static final Pattern f47889c;

    /* JADX INFO: renamed from: d */
    static final Pattern f47890d;

    /* JADX INFO: renamed from: e */
    static final Pattern f47891e;

    /* JADX INFO: renamed from: f */
    static final Pattern f47892f;

    /* JADX INFO: renamed from: g */
    static final Pattern f47893g;

    /* JADX INFO: renamed from: i */
    private static final InterfaceC0841n f47894i;

    /* JADX INFO: renamed from: j */
    private static final C1030u f47895j;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: h */
    public final C1057v f47896h;

    static {
        C0760k c0760k = new C0760k();
        f47894i = c0760k;
        C1030u c1030u = new C1030u("other", c0760k, null, null);
        f47895j = c1030u;
        C1057v c1057v = new C1057v();
        c1057v.m19460a(c1030u);
        f47887a = new C1084w(c1057v);
        f47888b = Pattern.compile("\\s*\\Q\\E@\\s*");
        f47889c = Pattern.compile("\\s*or\\s*");
        f47890d = Pattern.compile("\\s*and\\s*");
        f47891e = Pattern.compile("\\s*,\\s*");
        Pattern.compile(DNTdN.lIXBJrXhSElWwY);
        f47892f = Pattern.compile("\\s*~\\s*");
        f47893g = Pattern.compile("\\s*;\\s*");
    }

    public C1084w(C1057v c1057v) {
        this.f47896h = c1057v;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c1057v.f47800b.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((C1030u) it.next()).f47719a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:132:0x0218  */
    /* JADX WARN: Code duplicated, block: B:134:0x0224  */
    /* JADX WARN: Code duplicated, block: B:137:0x0232  */
    /* JADX WARN: Code duplicated, block: B:139:0x023d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0249  */
    /* JADX WARN: Code duplicated, block: B:144:0x0251  */
    /* JADX WARN: Code duplicated, block: B:147:0x025d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0267  */
    /* JADX WARN: Code duplicated, block: B:157:0x0288  */
    /* JADX WARN: Code duplicated, block: B:160:0x0290 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:168:0x02ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:181:0x0306  */
    /* JADX WARN: Code duplicated, block: B:183:0x0312  */
    /* JADX WARN: Code duplicated, block: B:185:0x031e  */
    /* JADX WARN: Code duplicated, block: B:188:0x032b  */
    /* JADX WARN: Code duplicated, block: B:191:0x033d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0344  */
    /* JADX WARN: Code duplicated, block: B:196:0x034f  */
    /* JADX WARN: Code duplicated, block: B:200:0x035d  */
    /* JADX WARN: Code duplicated, block: B:201:0x035f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:213:0x03af  */
    /* JADX WARN: Code duplicated, block: B:214:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:216:0x03bb A[LOOP:5: B:215:0x03b9->B:216:0x03bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x03d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x03f0 A[LOOP:4: B:175:0x02d9->B:228:0x03f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0424  */
    /* JADX WARN: Code duplicated, block: B:233:0x0439  */
    /* JADX WARN: Code duplicated, block: B:234:0x043b  */
    /* JADX WARN: Code duplicated, block: B:261:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x024c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0338 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x0326 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x03a0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static C1030u m19514a(String str) throws ParseException {
        C0949r c0949rM19366a;
        C0949r c0949rM19366a2;
        String str2;
        C0949r c0949r;
        C0949r c0949r2;
        InterfaceC0841n interfaceC0841n;
        byte b;
        int i;
        String[] strArr;
        InterfaceC0841n interfaceC0841n2;
        String str3;
        C0949r c0949r3;
        int i2;
        InterfaceC0841n interfaceC0841n3;
        String strM19517d;
        int i3;
        int i4;
        boolean z;
        int i5;
        boolean zEquals;
        String strM19517d2;
        boolean z2;
        int i6;
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        double dMax;
        double dMin;
        long j;
        int length;
        String str4;
        String strM19517d3;
        long j2;
        int size;
        long[] jArr;
        int i7;
        long[] jArr2;
        int i8;
        String strM19517d4;
        int i9;
        String strM19517d5;
        int i10;
        String strM19517d6;
        long j3;
        int i11;
        String strM19517d7;
        if (str.length() == 0) {
            return f47895j;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int iIndexOf = lowerCase.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("missing ':' in rule description '" + lowerCase + "'", 0);
        }
        String strTrim = lowerCase.substring(0, iIndexOf).trim();
        for (int i12 = 0; i12 < strTrim.length(); i12++) {
            char cCharAt = strTrim.charAt(i12);
            if (cCharAt < 'a' || cCharAt > 'z') {
                throw new ParseException("keyword '" + strTrim + " is not valid", 0);
            }
        }
        String strTrim2 = lowerCase.substring(iIndexOf + 1).trim();
        String[] strArrSplit = f47888b.split(strTrim2);
        switch (strArrSplit.length) {
            case 1:
                c0949rM19366a = null;
                c0949rM19366a2 = null;
                break;
            case 2:
                c0949rM19366a = C0949r.m19366a(strArrSplit[1]);
                if (c0949rM19366a.f47531c == 2) {
                    c0949rM19366a2 = c0949rM19366a;
                    c0949rM19366a = null;
                } else {
                    c0949rM19366a2 = null;
                }
                break;
            case 3:
                c0949rM19366a = C0949r.m19366a(strArrSplit[1]);
                c0949rM19366a2 = C0949r.m19366a(strArrSplit[2]);
                if (c0949rM19366a.f47531c != 1 || c0949rM19366a2.f47531c != 2) {
                    throw new IllegalArgumentException("Must have @integer then @decimal in ".concat(String.valueOf(strTrim2)));
                }
                break;
            default:
                throw new IllegalArgumentException("Too many samples in ".concat(String.valueOf(strTrim2)));
        }
        boolean zEquals2 = strTrim.equals("other");
        if (zEquals2 != (strArrSplit[0].length() == 0)) {
            throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        if (zEquals2) {
            interfaceC0841n = f47894i;
            str2 = strTrim;
            c0949r = c0949rM19366a;
            c0949r2 = c0949rM19366a2;
        } else {
            String[] strArrSplit2 = f47889c.split(strArrSplit[0]);
            InterfaceC0841n c0976s = null;
            int i13 = 0;
            while (i13 < strArrSplit2.length) {
                String[] strArrSplit3 = f47890d.split(strArrSplit2[i13]);
                int i14 = 0;
                InterfaceC0841n c0787l = null;
                while (i14 < strArrSplit3.length) {
                    InterfaceC0841n c1003t = f47894i;
                    String strTrim3 = strArrSplit3[i14].trim();
                    ArrayList arrayList2 = new ArrayList();
                    int i15 = -1;
                    for (int i16 = 0; i16 < strTrim3.length(); i16++) {
                        char cCharAt2 = strTrim3.charAt(i16);
                        if (cCharAt2 > ' ' || !(cCharAt2 == ' ' || cCharAt2 == '\t' || cCharAt2 == '\n' || cCharAt2 == '\f' || cCharAt2 == '\r')) {
                            if (cCharAt2 <= '=' && cCharAt2 >= '!' && (cCharAt2 == '!' || cCharAt2 == '%' || cCharAt2 == ',' || cCharAt2 == '.' || cCharAt2 == '=')) {
                                if (i15 >= 0) {
                                    arrayList2.add(strTrim3.substring(i15, i16));
                                }
                                arrayList2.add(strTrim3.substring(i16, i16 + 1));
                                i15 = -1;
                            } else if (i15 < 0) {
                                i15 = i16;
                            }
                        } else if (i15 >= 0) {
                            arrayList2.add(strTrim3.substring(i15, i16));
                            i15 = -1;
                        }
                    }
                    if (i15 >= 0) {
                        arrayList2.add(strTrim3.substring(i15));
                    }
                    String[] strArr2 = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    String str5 = strArr2[0];
                    try {
                        switch (str5.hashCode()) {
                            case 102:
                                if (str5.equals("f")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 105:
                                if (str5.equals("i")) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 106:
                                if (str5.equals("j")) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 110:
                                if (str5.equals(KMNlNMe.hsc)) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 116:
                                if (str5.equals("t")) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 118:
                                if (str5.equals("v")) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 119:
                                if (str5.equals("w")) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        switch (b) {
                            case 0:
                                i = 1;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if (!"mod".equals(strM19517d) || "%".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i4 = 2;
                                        i3 = 0;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                    } else {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d) && !"=".equals(strM19517d)) {
                                            if (!"within".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            int i17 = i4 + 1;
                                            strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                            z2 = false;
                                            i6 = i17;
                                            z3 = false;
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            z4 = z;
                                        } else {
                                            if (z3 && !z) {
                                                throw m19518e(strM19517d2, strTrim3);
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0 && j2 >= i3) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr3 = strArr2;
                                                    String strM19517d8 = m19517d(strArr3, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d8;
                                                    strArr2 = strArr3;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        for (i7 = 0; i7 < size; i7++) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax && z3 && !z4) {
                                                        throw m19518e("is not <range>", strTrim3);
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr4 = strArr2;
                                                String strM19517d9 = m19517d(strArr4, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d9;
                                                strArr2 = strArr4;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals && !z) {
                                        throw m19518e(strM19517d, strTrim3);
                                    }
                                    int i18 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i18;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr5 = strArr2;
                                                String strM19517d10 = m19517d(strArr5, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d10;
                                                strArr2 = strArr5;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr6 = strArr2;
                                            String strM19517d11 = m19517d(strArr6, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d11;
                                            strArr2 = strArr6;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 1:
                                i = 2;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr7 = strArr2;
                                                    String strM19517d12 = m19517d(strArr7, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d12;
                                                    strArr2 = strArr7;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr8 = strArr2;
                                                String strM19517d13 = m19517d(strArr8, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d13;
                                                strArr2 = strArr8;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i19 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i19;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr9 = strArr2;
                                                String strM19517d14 = m19517d(strArr9, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d14;
                                                strArr2 = strArr9;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr10 = strArr2;
                                            String strM19517d15 = m19517d(strArr10, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d15;
                                            strArr2 = strArr10;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 2:
                                i = 3;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr11 = strArr2;
                                                    String strM19517d16 = m19517d(strArr11, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d16;
                                                    strArr2 = strArr11;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr12 = strArr2;
                                                String strM19517d17 = m19517d(strArr12, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d17;
                                                strArr2 = strArr12;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i110 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i110;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr13 = strArr2;
                                                String strM19517d18 = m19517d(strArr13, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d18;
                                                strArr2 = strArr13;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr14 = strArr2;
                                            String strM19517d19 = m19517d(strArr14, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d19;
                                            strArr2 = strArr14;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 3:
                                i = 4;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr15 = strArr2;
                                                    String strM19517d110 = m19517d(strArr15, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d110;
                                                    strArr2 = strArr15;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr16 = strArr2;
                                                String strM19517d111 = m19517d(strArr16, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d111;
                                                strArr2 = strArr16;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i111 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i111;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr17 = strArr2;
                                                String strM19517d112 = m19517d(strArr17, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d112;
                                                strArr2 = strArr17;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr18 = strArr2;
                                            String strM19517d113 = m19517d(strArr18, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d113;
                                            strArr2 = strArr18;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 4:
                                i = 5;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr19 = strArr2;
                                                    String strM19517d114 = m19517d(strArr19, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d114;
                                                    strArr2 = strArr19;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr110 = strArr2;
                                                String strM19517d115 = m19517d(strArr110, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d115;
                                                strArr2 = strArr110;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i112 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i112;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr111 = strArr2;
                                                String strM19517d116 = m19517d(strArr111, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d116;
                                                strArr2 = strArr111;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr112 = strArr2;
                                            String strM19517d117 = m19517d(strArr112, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d117;
                                            strArr2 = strArr112;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 5:
                                i = 6;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr113 = strArr2;
                                                    String strM19517d118 = m19517d(strArr113, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d118;
                                                    strArr2 = strArr113;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr114 = strArr2;
                                                String strM19517d119 = m19517d(strArr114, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d119;
                                                strArr2 = strArr114;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i113 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i113;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr115 = strArr2;
                                                String strM19517d1110 = m19517d(strArr115, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d1110;
                                                strArr2 = strArr115;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr116 = strArr2;
                                            String strM19517d1111 = m19517d(strArr116, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d1111;
                                            strArr2 = strArr116;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            case 6:
                                i = 7;
                                if (strArr2.length > 1) {
                                    strM19517d = strArr2[1];
                                    if ("mod".equals(strM19517d)) {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    } else {
                                        i3 = Integer.parseInt(strArr2[2]);
                                        strM19517d = m19517d(strArr2, 3, strTrim3);
                                        i4 = 4;
                                    }
                                    if ("not".equals(strM19517d)) {
                                        i11 = i4 + 1;
                                        strM19517d7 = m19517d(strArr2, i4, strTrim3);
                                        if ("=".equals(strM19517d7)) {
                                            throw m19518e(strM19517d7, strTrim3);
                                        }
                                        strArr = strArrSplit2;
                                        z = false;
                                        i4 = i11;
                                        strM19517d = strM19517d7;
                                    } else {
                                        strArr = strArrSplit2;
                                        if ("!".equals(strM19517d)) {
                                            i5 = i4 + 1;
                                            strM19517d = m19517d(strArr2, i4, strTrim3);
                                            if (!"=".equals(strM19517d)) {
                                                throw m19518e(strM19517d, strTrim3);
                                            }
                                            i4 = i5;
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ("is".equals(strM19517d)) {
                                        str3 = strTrim;
                                        if ("in".equals(strM19517d)) {
                                        }
                                        if (!"not".equals(strM19517d2)) {
                                            if (z3) {
                                            }
                                            z4 = !z;
                                            strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                            i6++;
                                        } else {
                                            z4 = z;
                                        }
                                        arrayList = new ArrayList();
                                        dMax = -9.223372036854776E18d;
                                        dMin = 9.223372036854776E18d;
                                        while (true) {
                                            i2 = i14;
                                            interfaceC0841n3 = c0787l;
                                            j = Long.parseLong(strM19517d2);
                                            length = strArr2.length;
                                            str4 = strM19517d2;
                                            if (i6 < length) {
                                                c0949r3 = c0949rM19366a;
                                                i8 = i6 + 1;
                                                strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                                interfaceC0841n2 = c0976s;
                                                if (strM19517d4.equals(".")) {
                                                    i9 = i8 + 1;
                                                    strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                    if (strM19517d5.equals(".")) {
                                                        throw m19518e(strM19517d5, strTrim3);
                                                    }
                                                    i10 = i9 + 1;
                                                    strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                    j3 = Long.parseLong(strM19517d6);
                                                    if (i10 < length) {
                                                        i6 = i10 + 1;
                                                        strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                        if (strM19517d3.equals(",")) {
                                                            throw m19518e(strM19517d3, strTrim3);
                                                        }
                                                        strArr2 = strArr2;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    } else {
                                                        strArr2 = strArr2;
                                                        i6 = i10;
                                                        strM19517d3 = strM19517d6;
                                                        z3 = z3;
                                                        j2 = j3;
                                                    }
                                                } else {
                                                    if (strM19517d4.equals(",")) {
                                                        throw m19518e(strM19517d4, strTrim3);
                                                    }
                                                    strM19517d3 = strM19517d4;
                                                    i6 = i8;
                                                }
                                                if (j <= j2) {
                                                    throw m19518e(j + "~" + j2, strTrim3);
                                                }
                                                if (i3 != 0) {
                                                    throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                                }
                                                arrayList.add(Long.valueOf(j));
                                                arrayList.add(Long.valueOf(j2));
                                                dMin = Math.min(dMin, j);
                                                dMax = Math.max(dMax, j2);
                                                if (i6 >= length) {
                                                    String[] strArr117 = strArr2;
                                                    String strM19517d1112 = m19517d(strArr117, i6, strTrim3);
                                                    i6++;
                                                    z3 = z3;
                                                    i14 = i2;
                                                    c0787l = interfaceC0841n3;
                                                    c0949rM19366a = c0949r3;
                                                    c0976s = interfaceC0841n2;
                                                    strM19517d2 = strM19517d1112;
                                                    strArr2 = strArr117;
                                                } else {
                                                    if (!strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    if (arrayList.size() == 2) {
                                                        jArr2 = null;
                                                    } else {
                                                        size = arrayList.size();
                                                        jArr = new long[size];
                                                        while (i7 < size) {
                                                            jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                        }
                                                        jArr2 = jArr;
                                                    }
                                                    if (dMin == dMax) {
                                                    }
                                                    c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                                }
                                            } else {
                                                interfaceC0841n2 = c0976s;
                                                c0949r3 = c0949rM19366a;
                                                strM19517d3 = str4;
                                            }
                                            j2 = j;
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr118 = strArr2;
                                                String strM19517d1113 = m19517d(strArr118, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d1113;
                                                strArr2 = strArr118;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        }
                                    } else {
                                        str3 = strTrim;
                                    }
                                    zEquals = "is".equals(strM19517d);
                                    if (!zEquals) {
                                    }
                                    int i114 = i4 + 1;
                                    strM19517d2 = m19517d(strArr2, i4, strTrim3);
                                    z2 = true;
                                    i6 = i114;
                                    z3 = zEquals;
                                    if (!"not".equals(strM19517d2)) {
                                        if (z3) {
                                        }
                                        z4 = !z;
                                        strM19517d2 = m19517d(strArr2, i6, strTrim3);
                                        i6++;
                                    } else {
                                        z4 = z;
                                    }
                                    arrayList = new ArrayList();
                                    dMax = -9.223372036854776E18d;
                                    dMin = 9.223372036854776E18d;
                                    while (true) {
                                        i2 = i14;
                                        interfaceC0841n3 = c0787l;
                                        j = Long.parseLong(strM19517d2);
                                        length = strArr2.length;
                                        str4 = strM19517d2;
                                        if (i6 < length) {
                                            c0949r3 = c0949rM19366a;
                                            i8 = i6 + 1;
                                            strM19517d4 = m19517d(strArr2, i6, strTrim3);
                                            interfaceC0841n2 = c0976s;
                                            if (strM19517d4.equals(".")) {
                                                i9 = i8 + 1;
                                                strM19517d5 = m19517d(strArr2, i8, strTrim3);
                                                if (strM19517d5.equals(".")) {
                                                    throw m19518e(strM19517d5, strTrim3);
                                                }
                                                i10 = i9 + 1;
                                                strM19517d6 = m19517d(strArr2, i9, strTrim3);
                                                j3 = Long.parseLong(strM19517d6);
                                                if (i10 < length) {
                                                    i6 = i10 + 1;
                                                    strM19517d3 = m19517d(strArr2, i10, strTrim3);
                                                    if (strM19517d3.equals(",")) {
                                                        throw m19518e(strM19517d3, strTrim3);
                                                    }
                                                    strArr2 = strArr2;
                                                    z3 = z3;
                                                    j2 = j3;
                                                } else {
                                                    strArr2 = strArr2;
                                                    i6 = i10;
                                                    strM19517d3 = strM19517d6;
                                                    z3 = z3;
                                                    j2 = j3;
                                                }
                                            } else {
                                                if (strM19517d4.equals(",")) {
                                                    throw m19518e(strM19517d4, strTrim3);
                                                }
                                                strM19517d3 = strM19517d4;
                                                i6 = i8;
                                            }
                                            if (j <= j2) {
                                                throw m19518e(j + "~" + j2, strTrim3);
                                            }
                                            if (i3 != 0) {
                                                throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                            }
                                            arrayList.add(Long.valueOf(j));
                                            arrayList.add(Long.valueOf(j2));
                                            dMin = Math.min(dMin, j);
                                            dMax = Math.max(dMax, j2);
                                            if (i6 >= length) {
                                                String[] strArr119 = strArr2;
                                                String strM19517d1114 = m19517d(strArr119, i6, strTrim3);
                                                i6++;
                                                z3 = z3;
                                                i14 = i2;
                                                c0787l = interfaceC0841n3;
                                                c0949rM19366a = c0949r3;
                                                c0976s = interfaceC0841n2;
                                                strM19517d2 = strM19517d1114;
                                                strArr2 = strArr119;
                                            } else {
                                                if (!strM19517d3.equals(",")) {
                                                    throw m19518e(strM19517d3, strTrim3);
                                                }
                                                if (arrayList.size() == 2) {
                                                    jArr2 = null;
                                                } else {
                                                    size = arrayList.size();
                                                    jArr = new long[size];
                                                    while (i7 < size) {
                                                        jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                    }
                                                    jArr2 = jArr;
                                                }
                                                if (dMin == dMax) {
                                                }
                                                c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                            }
                                        } else {
                                            interfaceC0841n2 = c0976s;
                                            c0949r3 = c0949rM19366a;
                                            strM19517d3 = str4;
                                        }
                                        j2 = j;
                                        if (j <= j2) {
                                            throw m19518e(j + "~" + j2, strTrim3);
                                        }
                                        if (i3 != 0) {
                                            throw m19518e(j2 + ">mod=" + i3, strTrim3);
                                        }
                                        arrayList.add(Long.valueOf(j));
                                        arrayList.add(Long.valueOf(j2));
                                        dMin = Math.min(dMin, j);
                                        dMax = Math.max(dMax, j2);
                                        if (i6 >= length) {
                                            String[] strArr1110 = strArr2;
                                            String strM19517d1115 = m19517d(strArr1110, i6, strTrim3);
                                            i6++;
                                            z3 = z3;
                                            i14 = i2;
                                            c0787l = interfaceC0841n3;
                                            c0949rM19366a = c0949r3;
                                            c0976s = interfaceC0841n2;
                                            strM19517d2 = strM19517d1115;
                                            strArr2 = strArr1110;
                                        } else {
                                            if (!strM19517d3.equals(",")) {
                                                throw m19518e(strM19517d3, strTrim3);
                                            }
                                            if (arrayList.size() == 2) {
                                                jArr2 = null;
                                            } else {
                                                size = arrayList.size();
                                                jArr = new long[size];
                                                while (i7 < size) {
                                                    jArr[i7] = ((Long) arrayList.get(i7)).longValue();
                                                }
                                                jArr2 = jArr;
                                            }
                                            if (dMin == dMax) {
                                            }
                                            c1003t = new C1003t(i3, z4, i, z2, dMin, dMax, jArr2);
                                        }
                                    }
                                } else {
                                    strArr = strArrSplit2;
                                    interfaceC0841n2 = c0976s;
                                    str3 = strTrim;
                                    c0949r3 = c0949rM19366a;
                                    i2 = i14;
                                    interfaceC0841n3 = c0787l;
                                }
                                if (interfaceC0841n3 == null) {
                                    c0787l = c1003t;
                                } else {
                                    c0787l = new C0787l(interfaceC0841n3, c1003t);
                                }
                                i14 = i2 + 1;
                                strArrSplit2 = strArr;
                                strArrSplit3 = strArrSplit3;
                                strTrim = str3;
                                i13 = i13;
                                c0949rM19366a2 = c0949rM19366a2;
                                c0949rM19366a = c0949r3;
                                c0976s = interfaceC0841n2;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    } catch (Exception e) {
                        throw m19518e(str5, strTrim3);
                    }
                }
                String[] strArr20 = strArrSplit2;
                InterfaceC0841n interfaceC0841n4 = c0976s;
                String str6 = strTrim;
                C0949r c0949r4 = c0949rM19366a;
                C0949r c0949r5 = c0949rM19366a2;
                int i20 = i13;
                InterfaceC0841n interfaceC0841n5 = c0787l;
                c0976s = interfaceC0841n4 == null ? interfaceC0841n5 : new C0976s(interfaceC0841n4, interfaceC0841n5);
                i13 = i20 + 1;
                strArrSplit2 = strArr20;
                strTrim = str6;
                c0949rM19366a2 = c0949r5;
                c0949rM19366a = c0949r4;
            }
            str2 = strTrim;
            c0949r = c0949rM19366a;
            c0949r2 = c0949rM19366a2;
            interfaceC0841n = c0976s;
        }
        return new C1030u(str2, interfaceC0841n, c0949r, c0949r2);
    }

    /* JADX INFO: renamed from: b */
    public static void m19515b(StringBuilder sb, double d, double d2, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d == d2) {
            sb.append(m19516c(d));
            return;
        }
        sb.append(m19516c(d) + ".." + m19516c(d2));
    }

    /* JADX INFO: renamed from: c */
    private static String m19516c(double d) {
        long j = (long) d;
        return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
    }

    /* JADX INFO: renamed from: d */
    private static String m19517d(String[] strArr, int i, String str) throws ParseException {
        if (i < strArr.length) {
            return strArr[i];
        }
        throw new ParseException("missing token at end of '" + str + "'", -1);
    }

    /* JADX INFO: renamed from: e */
    private static ParseException m19518e(String str, String str2) {
        return new ParseException("unexpected token '" + str + "' in '" + str2 + "'", -1);
    }

    public final boolean equals(Object obj) {
        C1084w c1084w;
        return (obj instanceof C1084w) && (c1084w = (C1084w) obj) != null && toString().equals(c1084w.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.f47896h.hashCode();
    }

    public final String toString() {
        return this.f47896h.toString();
    }
}
