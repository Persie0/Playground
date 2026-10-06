package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.IOException;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: j */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0283j extends Format {

    /* JADX INFO: renamed from: d */
    private static final String[] f32747d = {"number", "date", "time", "spellout", "ordinal", "duration"};

    /* JADX INFO: renamed from: e */
    private static final String[] f32748e = {"", "currency", BcwGDRhrTsnlj.YKSoST, "integer"};

    /* JADX INFO: renamed from: f */
    private static final String[] f32749f = {"", "short", "medium", "long", "full"};

    /* JADX INFO: renamed from: g */
    private static final Locale f32750g = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;

    /* JADX INFO: renamed from: a */
    public transient Locale f32751a;

    /* JADX INFO: renamed from: b */
    public transient C1165z f32752b;

    /* JADX INFO: renamed from: c */
    public transient Map f32753c;

    /* JADX INFO: renamed from: h */
    private transient DateFormat f32754h;

    /* JADX INFO: renamed from: i */
    private transient NumberFormat f32755i;

    /* JADX INFO: renamed from: j */
    private transient C0256i f32756j;

    /* JADX INFO: renamed from: k */
    private transient C0256i f32757k;

    /* JADX WARN: Code duplicated, block: B:51:0x0114 A[Catch: RuntimeException -> 0x0144, TryCatch #0 {RuntimeException -> 0x0144, blocks: (B:3:0x0006, B:5:0x000a, B:7:0x0015, B:9:0x0019, B:10:0x001c, B:12:0x0028, B:14:0x0033, B:16:0x003a, B:18:0x0056, B:20:0x0060, B:21:0x0067, B:22:0x006a, B:53:0x0126, B:54:0x013f, B:23:0x006e, B:24:0x0074, B:25:0x0077, B:31:0x00a2, B:49:0x0110, B:51:0x0114, B:52:0x011b, B:26:0x007a, B:27:0x0082, B:28:0x008a, B:29:0x0092, B:30:0x009a, B:32:0x00a9, B:33:0x00af, B:34:0x00b2, B:40:0x00d8, B:35:0x00b5, B:36:0x00bc, B:37:0x00c3, B:38:0x00ca, B:39:0x00d1, B:41:0x00de, B:42:0x00e4, B:43:0x00e7, B:48:0x0106, B:44:0x00ea, B:45:0x00f1, B:46:0x00f8, B:47:0x00ff, B:6:0x0012), top: B:69:0x0006 }] */
    public C0283j(String str, Locale locale) {
        Cloneable numberFormat;
        this.f32751a = locale;
        try {
            C1165z c1165z = this.f32752b;
            if (c1165z == null) {
                this.f32752b = new C1165z(str);
            } else {
                c1165z.m19762i(str);
            }
            Map map = this.f32753c;
            if (map != null) {
                map.clear();
            }
            int iM19755b = this.f32752b.m19755b() - 2;
            int i = 1;
            while (i < iM19755b) {
                C1138y c1138yM19757d = this.f32752b.m19757d(i);
                if (c1138yM19757d.f48045e == 6 && c1138yM19757d.m19595b() == 2) {
                    int i2 = i + 2;
                    C1165z c1165z2 = this.f32752b;
                    int i3 = i2 + 1;
                    String strM19759f = c1165z2.m19759f(c1165z2.m19757d(i2));
                    String strM19759f2 = "";
                    C1138y c1138yM19757d2 = this.f32752b.m19757d(i3);
                    if (c1138yM19757d2.f48045e == 11) {
                        strM19759f2 = this.f32752b.m19759f(c1138yM19757d2);
                        i3++;
                    }
                    switch (m11961c(strM19759f, f32747d)) {
                        case 0:
                            switch (m11961c(strM19759f2, f32748e)) {
                                case 0:
                                    numberFormat = NumberFormat.getInstance(this.f32751a);
                                    break;
                                case 1:
                                    numberFormat = NumberFormat.getCurrencyInstance(this.f32751a);
                                    break;
                                case 2:
                                    numberFormat = NumberFormat.getPercentInstance(this.f32751a);
                                    break;
                                case 3:
                                    numberFormat = NumberFormat.getIntegerInstance(this.f32751a);
                                    break;
                                default:
                                    numberFormat = new DecimalFormat(strM19759f2, new DecimalFormatSymbols(this.f32751a));
                                    break;
                            }
                            if (this.f32753c == null) {
                                this.f32753c = new HashMap();
                            }
                            this.f32753c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        case 1:
                            switch (m11961c(strM19759f2, f32749f)) {
                                case 0:
                                    numberFormat = DateFormat.getDateInstance(2, this.f32751a);
                                    break;
                                case 1:
                                    numberFormat = DateFormat.getDateInstance(3, this.f32751a);
                                    break;
                                case 2:
                                    numberFormat = DateFormat.getDateInstance(2, this.f32751a);
                                    break;
                                case 3:
                                    numberFormat = DateFormat.getDateInstance(1, this.f32751a);
                                    break;
                                case 4:
                                    numberFormat = DateFormat.getDateInstance(0, this.f32751a);
                                    break;
                                default:
                                    numberFormat = new SimpleDateFormat(strM19759f2, this.f32751a);
                                    break;
                            }
                            if (this.f32753c == null) {
                                this.f32753c = new HashMap();
                            }
                            this.f32753c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        case 2:
                            switch (m11961c(strM19759f2, f32749f)) {
                                case 0:
                                    numberFormat = DateFormat.getTimeInstance(2, this.f32751a);
                                    break;
                                case 1:
                                    numberFormat = DateFormat.getTimeInstance(3, this.f32751a);
                                    break;
                                case 2:
                                    numberFormat = DateFormat.getTimeInstance(2, this.f32751a);
                                    break;
                                case 3:
                                    numberFormat = DateFormat.getTimeInstance(1, this.f32751a);
                                    break;
                                case 4:
                                    numberFormat = DateFormat.getTimeInstance(0, this.f32751a);
                                    break;
                                default:
                                    numberFormat = new SimpleDateFormat(strM19759f2, this.f32751a);
                                    break;
                            }
                            if (this.f32753c == null) {
                                this.f32753c = new HashMap();
                            }
                            this.f32753c.put(Integer.valueOf(i), numberFormat);
                            i = i3;
                            break;
                        default:
                            throw new IllegalArgumentException("Unknown format type \"" + strM19759f + "\"");
                    }
                }
                i++;
            }
        } catch (RuntimeException e) {
            C1165z c1165z3 = this.f32752b;
            if (c1165z3 != null) {
                c1165z3.f48319a = null;
                c1165z3.f48322d = false;
                c1165z3.f48320b.clear();
                ArrayList arrayList = c1165z3.f48321c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map map2 = this.f32753c;
            if (map2 != null) {
                map2.clear();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    private static final int m11961c(String str, String[] strArr) {
        byte[] bArr = C0148e.f13030a;
        if (str.length() != 0 && (C0148e.m6978a(str.charAt(0)) || C0148e.m6978a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i = 0;
            while (i < length && C0148e.m6978a(str.charAt(i))) {
                i++;
            }
            if (i < length) {
                while (true) {
                    int i2 = length - 1;
                    if (!C0148e.m6978a(str.charAt(i2))) {
                        break;
                    }
                    length = i2;
                }
            }
            str = str.substring(i, length);
        }
        String lowerCase = str.toLowerCase(f32750g);
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (lowerCase.equals(strArr[i3])) {
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    private final void m11962d(String str, ParsePosition parsePosition, Object[] objArr, Map map) {
        String strM19759f;
        Object objValueOf;
        short s;
        Object objValueOf2;
        Map map2;
        C1165z c1165z;
        int i;
        int i2;
        Format format;
        if (str == null) {
            return;
        }
        C1165z c1165z2 = this.f32752b;
        String str2 = c1165z2.f48319a;
        int iM19594a = c1165z2.m19757d(0).m19594a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        boolean z = true;
        int i3 = 1;
        while (true) {
            C1138y c1138yM19757d = this.f32752b.m19757d(i3);
            int i4 = c1138yM19757d.f48045e;
            int i5 = c1138yM19757d.f48041a - iM19594a;
            if (i5 != 0 && !str2.regionMatches(iM19594a, str, index, i5)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i5;
            if (i4 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i4 == 3 || i4 == 4) {
                iM19594a = c1138yM19757d.m19594a();
            } else {
                int iM19756c = this.f32752b.m19756c(i3);
                int iM19595b = c1138yM19757d.m19595b();
                int i6 = i3 + 1;
                C1138y c1138yM19757d2 = this.f32752b.m19757d(i6);
                if (objArr != null) {
                    s = c1138yM19757d2.f48043c;
                    objValueOf = Integer.valueOf(s);
                    strM19759f = null;
                } else {
                    strM19759f = c1138yM19757d2.f48045e == 9 ? this.f32752b.m19759f(c1138yM19757d2) : Integer.toString(c1138yM19757d2.f48043c);
                    objValueOf = strM19759f;
                    s = 0;
                }
                int i7 = i6 + 1;
                Map map3 = this.f32753c;
                if (map3 != null && (format = (Format) map3.get(Integer.valueOf(i7 - 2))) != null) {
                    parsePosition2.setIndex(index);
                    objValueOf2 = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        index = parsePosition2.getIndex();
                        str2 = str2;
                        strM19759f = strM19759f;
                    }
                } else if (iM19595b == z || ((map2 = this.f32753c) != null && map2.containsKey(Integer.valueOf(i7 - 2)))) {
                    StringBuilder sb = new StringBuilder();
                    C1165z c1165z3 = this.f32752b;
                    String str3 = c1165z3.f48319a;
                    int iM19594a2 = c1165z3.m19757d(iM19756c).m19594a();
                    int i8 = iM19756c + 1;
                    while (true) {
                        C1138y c1138yM19757d3 = this.f32752b.m19757d(i8);
                        int i9 = c1138yM19757d3.f48045e;
                        sb.append((CharSequence) str3, iM19594a2, c1138yM19757d3.f48041a);
                        if (i9 == 6 || i9 == 2) {
                            break;
                        }
                        i8++;
                        iM19594a2 = c1138yM19757d3.m19594a();
                    }
                    String string = sb.toString();
                    int iIndexOf = string.length() != 0 ? str.indexOf(string, index) : str.length();
                    if (iIndexOf < 0) {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                    String strSubstring = str.substring(index, iIndexOf);
                    boolean zEquals = strSubstring.equals("{" + objValueOf.toString() + "}");
                    index = iIndexOf;
                    z = !zEquals;
                    objValueOf2 = true == zEquals ? null : strSubstring;
                } else {
                    if (iM19595b != 3) {
                        if (!C0121d.m5780b(iM19595b) && iM19595b != 5) {
                            throw new IllegalStateException("unexpected argType ".concat(C0121d.m5779a(iM19595b)));
                        }
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    }
                    parsePosition2.setIndex(index);
                    C1165z c1165z4 = this.f32752b;
                    int index2 = parsePosition2.getIndex();
                    double d = Double.NaN;
                    int i10 = index2;
                    while (true) {
                        if (c1165z4.m19761h(i7) == 7) {
                            str2 = str2;
                            strM19759f = strM19759f;
                            break;
                        }
                        double dM19754a = c1165z4.m19754a(c1165z4.m19757d(i7));
                        int i11 = i7 + 2;
                        int iM19756c2 = c1165z4.m19756c(i11);
                        String str4 = c1165z4.f48319a;
                        int i12 = 0;
                        str2 = str2;
                        int iM19594a3 = c1165z4.m19757d(i11).m19594a();
                        while (true) {
                            i11++;
                            strM19759f = strM19759f;
                            C1138y c1138yM19757d4 = c1165z4.m19757d(i11);
                            if (i11 != iM19756c2) {
                                c1165z = c1165z4;
                                if (c1138yM19757d4.f48045e != 3) {
                                    c1165z4 = c1165z;
                                }
                            } else {
                                c1165z = c1165z4;
                            }
                            int i13 = c1138yM19757d4.f48041a - iM19594a3;
                            if (i13 != 0 && !str.regionMatches(index2, str4, iM19594a3, i13)) {
                                i = -1;
                                break;
                            }
                            i12 += i13;
                            if (i11 == iM19756c2) {
                                i = i12;
                                break;
                            } else {
                                iM19594a3 = c1138yM19757d4.m19594a();
                                c1165z4 = c1165z;
                            }
                        }
                        if (i >= 0 && (i2 = i + index2) > i10) {
                            if (i2 == str.length()) {
                                i10 = i2;
                                d = dM19754a;
                                break;
                            } else {
                                i10 = i2;
                                d = dM19754a;
                            }
                        }
                        i7 = iM19756c2 + 1;
                        str2 = str2;
                        strM19759f = strM19759f;
                        c1165z4 = c1165z;
                    }
                    if (i10 == index2) {
                        parsePosition2.setErrorIndex(index2);
                    } else {
                        parsePosition2.setIndex(i10);
                    }
                    if (parsePosition2.getIndex() == index) {
                        parsePosition.setErrorIndex(index);
                        return;
                    } else {
                        objValueOf2 = Double.valueOf(d);
                        index = parsePosition2.getIndex();
                        z = true;
                    }
                }
                if (z) {
                    if (objArr != null) {
                        objArr[s] = objValueOf2;
                    } else if (map != null) {
                        map.put(strM19759f, objValueOf2);
                    }
                }
                iM19594a = this.f32752b.m19757d(iM19756c).m19594a();
                i3 = iM19756c;
            }
            i3++;
            str2 = str2;
            z = true;
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m11963e(Object obj, C0274ir c0274ir, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            m11964f(null, (Map) obj, c0274ir, fieldPosition);
        } else {
            m11964f((Object[]) obj, null, c0274ir, fieldPosition);
        }
    }

    /* JADX INFO: renamed from: a */
    public final NumberFormat m11966a() {
        if (this.f32755i == null) {
            this.f32755i = NumberFormat.getInstance(this.f32751a);
        }
        return this.f32755i;
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Appendable, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m11967b(int i, C0229h c0229h, Object[] objArr, Map map, Object[] objArr2, C0274ir c0274ir, FieldPosition fieldPosition) {
        Object objValueOf;
        Object obj;
        boolean z;
        Map map2;
        int i2;
        C0256i c0256i;
        double dM19754a;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        C1030u c1030u;
        Map map3;
        C1084w c1084wM19536a;
        int i7;
        Format format;
        int i8;
        C0283j c0283j = this;
        C1165z c1165z = c0283j.f32752b;
        String str2 = c1165z.f48319a;
        int iM19594a = c1165z.m19757d(i).m19594a();
        int i9 = i + 1;
        FieldPosition fieldPosition2 = fieldPosition;
        while (true) {
            C1138y c1138yM19757d = c0283j.f32752b.m19757d(i9);
            int i10 = c1138yM19757d.f48045e;
            int i11 = c1138yM19757d.f48041a;
            try {
                c0274ir.f31846b.append(str2, iM19594a, i11);
                c0274ir.f31845a += i11 - iM19594a;
                if (i10 == 2) {
                    return;
                }
                int iM19594a2 = c1138yM19757d.m19594a();
                if (i10 != 5) {
                    if (i10 == 6) {
                        int iM19756c = c0283j.f32752b.m19756c(i9);
                        int iM19595b = c1138yM19757d.m19595b();
                        int i12 = i9 + 1;
                        C1138y c1138yM19757d2 = c0283j.f32752b.m19757d(i12);
                        String strM19759f = c0283j.f32752b.m19759f(c1138yM19757d2);
                        if (objArr != 0) {
                            short s = c1138yM19757d2.f48043c;
                            objValueOf = c0274ir.f31847c != null ? Integer.valueOf(s) : null;
                            if (s < 0 || s >= objArr.length) {
                                obj = null;
                                z = true;
                            } else {
                                obj = objArr[s];
                                z = false;
                            }
                        } else if (objArr2 != null) {
                            int i13 = 0;
                            while (true) {
                                if (i13 >= 2) {
                                    obj = null;
                                    z = true;
                                    break;
                                } else {
                                    if (strM19759f.equals(objArr2[i13].toString())) {
                                        obj = objArr2[i13 + 1];
                                        z = false;
                                        break;
                                    }
                                    i13 += 2;
                                }
                            }
                            objValueOf = strM19759f;
                        } else if (map == 0 || !map.containsKey(strM19759f)) {
                            objValueOf = strM19759f;
                            obj = null;
                            z = true;
                        } else {
                            obj = map.get(strM19759f);
                            objValueOf = strM19759f;
                            z = false;
                        }
                        int iM19756c2 = i12 + 1;
                        int i14 = c0274ir.f31845a;
                        if (z) {
                            c0274ir.m11628g("{" + strM19759f + "}");
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            str2 = str2;
                            i14 = i14;
                            iM19756c = iM19756c;
                        } else if (obj == null) {
                            c0274ir.m11628g("null");
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            str2 = str2;
                            i14 = i14;
                            iM19756c = iM19756c;
                        } else if (c0229h == 0 || c0229h.f27077e != iM19756c2 - 2) {
                            Map map4 = c0283j.f32753c;
                            if (map4 != null && (format = (Format) map4.get(Integer.valueOf(iM19756c2 - 2))) != null) {
                                c0274ir.m11629h(format, obj);
                                fieldPosition2 = fieldPosition2;
                                objValueOf = objValueOf;
                                str2 = str2;
                                i14 = i14;
                                iM19756c = iM19756c;
                            } else if (iM19595b != 1 && ((map2 = c0283j.f32753c) == null || !map2.containsKey(Integer.valueOf(iM19756c2 - 2)))) {
                                Object obj2 = objValueOf;
                                if (iM19595b != 3) {
                                    Object obj3 = obj2;
                                    String str3 = "other";
                                    if (!C0121d.m5780b(iM19595b)) {
                                        fieldPosition2 = fieldPosition2;
                                        objValueOf = obj3;
                                        str2 = str2;
                                        i14 = i14;
                                        iM19756c = iM19756c;
                                        if (iM19595b != 5) {
                                            throw new IllegalStateException("unexpected argType ".concat(C0121d.m5779a(iM19595b)));
                                        }
                                        c0283j = this;
                                        C1165z c1165z2 = c0283j.f32752b;
                                        String string = obj.toString();
                                        int iM19755b = c1165z2.m19755b();
                                        int i15 = 0;
                                        while (true) {
                                            C1138y c1138yM19757d3 = c1165z2.m19757d(iM19756c2);
                                            if (c1138yM19757d3.f48045e == 7) {
                                                i2 = i15;
                                                break;
                                            }
                                            int i16 = iM19756c2 + 1;
                                            if (c1165z2.m19760g(c1138yM19757d3, string)) {
                                                i2 = i16;
                                                break;
                                            }
                                            if (i15 == 0) {
                                                i15 = c1165z2.m19760g(c1138yM19757d3, "other") ? i16 : 0;
                                            }
                                            iM19756c2 = c1165z2.m19756c(i16) + 1;
                                            if (iM19756c2 >= iM19755b) {
                                                i2 = i15;
                                                break;
                                            }
                                        }
                                        m11965g(i2, null, objArr, map, objArr2, c0274ir);
                                    } else {
                                        if (!(obj instanceof Number)) {
                                            throw new IllegalArgumentException("'" + obj.toString() + "' is not a Number");
                                        }
                                        if (iM19595b == 4) {
                                            if (c0283j.f32756j == null) {
                                                c0283j.f32756j = new C0256i(c0283j, 1);
                                            }
                                            c0256i = c0283j.f32756j;
                                        } else {
                                            if (c0283j.f32757k == null) {
                                                c0283j.f32757k = new C0256i(c0283j, 2);
                                            }
                                            c0256i = c0283j.f32757k;
                                        }
                                        Number number = (Number) obj;
                                        C1165z c1165z3 = c0283j.f32752b;
                                        C1138y c1138y = (C1138y) c1165z3.f48320b.get(iM19756c2);
                                        C0229h c0229h2 = new C0229h(iM19756c2, strM19759f, number, C0121d.m5782d(c1138y.f48045e) ? c1165z3.m19754a(c1138y) : 0.0d);
                                        C1165z c1165z4 = c0283j.f32752b;
                                        double dDoubleValue = number.doubleValue();
                                        int iM19755b2 = c1165z4.m19755b();
                                        C1138y c1138yM19757d4 = c1165z4.m19757d(iM19756c2);
                                        str2 = str2;
                                        if (C0121d.m5782d(c1138yM19757d4.f48045e)) {
                                            dM19754a = c1165z4.m19754a(c1138yM19757d4);
                                            iM19756c2++;
                                        } else {
                                            dM19754a = 0.0d;
                                        }
                                        String str4 = null;
                                        boolean z2 = false;
                                        int i17 = 0;
                                        while (true) {
                                            iM19756c = iM19756c;
                                            int i18 = iM19756c2 + 1;
                                            C1138y c1138yM19757d5 = c1165z4.m19757d(iM19756c2);
                                            fieldPosition2 = fieldPosition2;
                                            objValueOf = obj3;
                                            if (c1138yM19757d5.f48045e == 7) {
                                                i14 = i14;
                                                i3 = i17;
                                                break;
                                            }
                                            if (C0121d.m5782d(c1165z4.m19761h(i18))) {
                                                int i19 = i18 + 1;
                                                if (dDoubleValue == c1165z4.m19754a(c1165z4.m19757d(i18))) {
                                                    i3 = i19;
                                                    i14 = i14;
                                                    break;
                                                } else {
                                                    i18 = i19;
                                                    dDoubleValue = dDoubleValue;
                                                    str3 = str3;
                                                    i14 = i14;
                                                }
                                            } else {
                                                if (!z2) {
                                                    if (!c1165z4.m19760g(c1138yM19757d5, str3)) {
                                                        if (str4 == null) {
                                                            int i20 = i14;
                                                            double d = dDoubleValue - dM19754a;
                                                            if (c0256i.f30113b == null) {
                                                                Locale locale = c0256i.f30112a.f32751a;
                                                                int i21 = c0256i.f30114c;
                                                                C1084w c1084w = C1084w.f47887a;
                                                                C1111x c1111x = C1111x.f47978a;
                                                                c1111x.m19537b();
                                                                String str5 = (String) (i21 == 1 ? c1111x.f47980b : c1111x.f47981c).get(locale.getLanguage());
                                                                if (str5 == null || str5.trim().length() == 0 || (c1084wM19536a = c1111x.m19536a(str5)) == null) {
                                                                    c1084wM19536a = C1084w.f47887a;
                                                                }
                                                                c0256i.f30113b = c1084wM19536a;
                                                            }
                                                            C0283j c0283j2 = c0256i.f30112a;
                                                            int i22 = c0229h2.f27073a;
                                                            int iM19755b3 = c0283j2.f32752b.m19755b();
                                                            if (C0121d.m5782d(c0283j2.f32752b.m19757d(i22).f48045e)) {
                                                                i22++;
                                                            }
                                                            while (true) {
                                                                i18 = i18;
                                                                i4 = i22 + 1;
                                                                C1138y c1138yM19757d6 = c0283j2.f32752b.m19757d(i22);
                                                                i14 = i20;
                                                                if (c1138yM19757d6.f48045e == 7) {
                                                                    i5 = 1;
                                                                    i4 = 0;
                                                                    break;
                                                                }
                                                                if (c0283j2.f32752b.m19760g(c1138yM19757d6, str3)) {
                                                                    i5 = 1;
                                                                    break;
                                                                }
                                                                if (C0121d.m5782d(c0283j2.f32752b.m19761h(i4))) {
                                                                    i4++;
                                                                }
                                                                i5 = 1;
                                                                int iM19756c3 = c0283j2.f32752b.m19756c(i4) + 1;
                                                                if (iM19756c3 >= iM19755b3) {
                                                                    i4 = 0;
                                                                    break;
                                                                }
                                                                str3 = str3;
                                                                i18 = i18;
                                                                i22 = iM19756c3;
                                                                i20 = i14;
                                                            }
                                                            C0283j c0283j3 = c0256i.f30112a;
                                                            String str6 = c0229h2.f27074b;
                                                            int iM19756c4 = i4 + i5;
                                                            while (true) {
                                                                C1138y c1138yM19757d7 = c0283j3.f32752b.m19757d(iM19756c4);
                                                                int i23 = c1138yM19757d7.f48045e;
                                                                if (i23 == 2) {
                                                                    iM19756c4 = 0;
                                                                    break;
                                                                }
                                                                if (i23 == 5) {
                                                                    iM19756c4 = -1;
                                                                    break;
                                                                }
                                                                if (i23 == 6) {
                                                                    int iM19595b2 = c1138yM19757d7.m19595b();
                                                                    if (str6.length() != 0 && (iM19595b2 == 1 || iM19595b2 == 2)) {
                                                                        if (c0283j3.f32752b.m19760g(c0283j3.f32752b.m19757d(iM19756c4 + 1), str6)) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    iM19756c4 = c0283j3.f32752b.m19756c(iM19756c4);
                                                                } else {
                                                                    str3 = str3;
                                                                }
                                                                iM19756c4++;
                                                                str3 = str3;
                                                            }
                                                            c0229h2.f27077e = iM19756c4;
                                                            if (iM19756c4 > 0 && (map3 = c0256i.f30112a.f32753c) != null) {
                                                                c0229h2.f27078f = (Format) map3.get(Integer.valueOf(iM19756c4));
                                                            }
                                                            if (c0229h2.f27078f == null) {
                                                                c0229h2.f27078f = c0256i.f30112a.m11966a();
                                                                c0229h2.f27080h = true;
                                                            }
                                                            c0229h2.f27079g = c0229h2.f27078f.format(c0229h2.f27075c);
                                                            C1057v c1057v = c0256i.f30113b.f47896h;
                                                            if (Double.isInfinite(d) || Double.isNaN(d)) {
                                                                str3 = str3;
                                                                i6 = 0;
                                                            } else {
                                                                double d2 = d < 0.0d ? -d : d;
                                                                if (d2 < 1.0E9d) {
                                                                    long j = (long) (d2 * 1000000.0d);
                                                                    int i24 = 10;
                                                                    i6 = 6;
                                                                    while (true) {
                                                                        if (i6 <= 0) {
                                                                            i6 = 0;
                                                                            break;
                                                                        } else {
                                                                            if ((j % 1000000) % ((long) i24) != 0) {
                                                                                break;
                                                                            }
                                                                            i24 *= 10;
                                                                            i6--;
                                                                        }
                                                                    }
                                                                } else {
                                                                    String str7 = String.format(Locale.ENGLISH, "%1.15e", Double.valueOf(d2));
                                                                    int iLastIndexOf = str7.lastIndexOf(101);
                                                                    int i25 = iLastIndexOf + 1;
                                                                    if (str7.charAt(i25) == '+') {
                                                                        i25++;
                                                                    }
                                                                    int i26 = (iLastIndexOf - 2) - Integer.parseInt(str7.substring(i25));
                                                                    if (i26 < 0) {
                                                                        i6 = 0;
                                                                    } else {
                                                                        i6 = i26;
                                                                        for (int i27 = iLastIndexOf - 1; i6 > 0 && str7.charAt(i27) == '0'; i27--) {
                                                                            i6--;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            C0895p c0895p = new C0895p(d, i6);
                                                            if (Double.isInfinite(c0895p.f47132a) || Double.isNaN(c0895p.f47132a)) {
                                                                str = str3;
                                                            } else {
                                                                Iterator it = c1057v.f47800b.iterator();
                                                                do {
                                                                    if (!it.hasNext()) {
                                                                        c1030u = null;
                                                                        break;
                                                                    }
                                                                    c1030u = (C1030u) it.next();
                                                                } while (!c1030u.f47720b.mo13853a(c0895p));
                                                                str = c1030u.f47719a;
                                                            }
                                                            if (i17 != 0) {
                                                                str3 = str3;
                                                                if (str.equals(str3)) {
                                                                    str4 = str;
                                                                    z2 = true;
                                                                }
                                                            } else {
                                                                str3 = str3;
                                                            }
                                                            str4 = str;
                                                        } else {
                                                            dDoubleValue = dDoubleValue;
                                                            str3 = str3;
                                                            z2 = z2;
                                                            i14 = i14;
                                                            i18 = i18;
                                                        }
                                                        if (z2 || !c1165z4.m19760g(c1138yM19757d5, str4)) {
                                                            z2 = z2;
                                                            i18 = i18;
                                                        } else {
                                                            i18 = i18;
                                                            i17 = i18;
                                                            z2 = true;
                                                        }
                                                    } else if (i17 == 0) {
                                                        if (str4 == null || !str4.equals(str3)) {
                                                            dDoubleValue = dDoubleValue;
                                                            str3 = str3;
                                                            i14 = i14;
                                                            i17 = i18;
                                                        } else {
                                                            dDoubleValue = dDoubleValue;
                                                            str3 = str3;
                                                            i14 = i14;
                                                            i17 = i18;
                                                            z2 = true;
                                                        }
                                                    }
                                                }
                                                str4 = str4;
                                                z2 = z2;
                                                i18 = i18;
                                            }
                                            int iM19756c5 = c1165z4.m19756c(i18) + 1;
                                            if (iM19756c5 >= iM19755b2) {
                                                i3 = i17;
                                                break;
                                            }
                                            iM19756c2 = iM19756c5;
                                            str3 = str3;
                                            iM19756c = iM19756c;
                                            fieldPosition2 = fieldPosition2;
                                            obj3 = objValueOf;
                                            dDoubleValue = dDoubleValue;
                                            i14 = i14;
                                        }
                                        m11965g(i3, c0229h2, objArr, map, objArr2, c0274ir);
                                        c0283j = this;
                                    }
                                } else {
                                    if (!(obj instanceof Number)) {
                                        throw new IllegalArgumentException("'" + obj.toString() + "' is not a Number");
                                    }
                                    double dDoubleValue2 = ((Number) obj).doubleValue();
                                    C1165z c1165z5 = c0283j.f32752b;
                                    int iM19755b4 = c1165z5.m19755b();
                                    int i28 = iM19756c2 + 2;
                                    while (true) {
                                        i7 = i28;
                                        int iM19756c6 = c1165z5.m19756c(i7) + 1;
                                        if (iM19756c6 >= iM19755b4) {
                                            break;
                                        }
                                        int i29 = iM19756c6 + 1;
                                        C1138y c1138yM19757d8 = c1165z5.m19757d(iM19756c6);
                                        int i30 = iM19755b4;
                                        if (c1138yM19757d8.f48045e == 7) {
                                            break;
                                        }
                                        double dM19754a2 = c1165z5.m19754a(c1138yM19757d8);
                                        i28 = i29 + 1;
                                        if (c1165z5.f48319a.charAt(((C1138y) c1165z5.f48320b.get(i29)).f48041a) != '<') {
                                            if (dDoubleValue2 < dM19754a2) {
                                                break;
                                            } else {
                                                iM19755b4 = i30;
                                            }
                                        } else if (dDoubleValue2 <= dM19754a2) {
                                            break;
                                        } else {
                                            iM19755b4 = i30;
                                        }
                                    }
                                    m11965g(i7, null, objArr, map, objArr2, c0274ir);
                                    fieldPosition2 = fieldPosition2;
                                    objValueOf = obj2;
                                    str2 = str2;
                                    i14 = i14;
                                    iM19756c = iM19756c;
                                }
                            } else if (obj instanceof Number) {
                                c0274ir.m11629h(m11966a(), obj);
                            } else if (obj instanceof Date) {
                                if (c0283j.f32754h == null) {
                                    c0283j.f32754h = DateFormat.getDateTimeInstance(3, 3, c0283j.f32751a);
                                }
                                c0274ir.m11629h(c0283j.f32754h, obj);
                            } else {
                                c0274ir.m11628g(obj.toString());
                            }
                        } else if (c0229h.f27076d == 0.0d) {
                            c0274ir.m11630i(c0229h.f27078f, c0229h.f27075c, c0229h.f27079g);
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            str2 = str2;
                            i14 = i14;
                            iM19756c = iM19756c;
                        } else {
                            c0274ir.m11629h(c0229h.f27078f, obj);
                            fieldPosition2 = fieldPosition2;
                            objValueOf = objValueOf;
                            str2 = str2;
                            i14 = i14;
                            iM19756c = iM19756c;
                        }
                        ?? r0 = c0274ir.f31847c;
                        if (r0 != 0) {
                            int i31 = c0274ir.f31845a;
                            i8 = i14;
                            if (i8 < i31) {
                                r0.add(new C1181zp(objValueOf, i8, i31));
                            }
                        } else {
                            i8 = i14;
                        }
                        if (fieldPosition2 == null || !C0202g.f24010a.equals(fieldPosition2.getFieldAttribute())) {
                            fieldPosition2 = fieldPosition2;
                        } else {
                            FieldPosition fieldPosition3 = fieldPosition2;
                            fieldPosition3.setBeginIndex(i8);
                            fieldPosition3.setEndIndex(c0274ir.f31845a);
                            fieldPosition2 = null;
                        }
                        int i32 = iM19756c;
                        iM19594a = c0283j.f32752b.m19757d(i32).m19594a();
                        i9 = i32;
                    }
                    i9++;
                    str2 = str2;
                } else if (c0229h.f27080h) {
                    c0274ir.m11630i(c0229h.f27078f, c0229h.f27075c, c0229h.f27079g);
                } else {
                    c0274ir.m11629h(m11966a(), c0229h.f27075c);
                }
                iM19594a = iM19594a2;
                i9++;
                str2 = str2;
            } catch (IOException e) {
                throw new C0003ac(e);
            }
        }
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        m11963e(obj, new C0274ir(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        C0274ir c0274ir = new C0274ir(sb);
        c0274ir.f31847c = new ArrayList();
        m11963e(obj, c0274ir, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (C1181zp c1181zp : c0274ir.f31847c) {
            attributedString.addAttribute((AttributedCharacterIterator.Attribute) c1181zp.f48452c, c1181zp.f48453d, c1181zp.f48450a, c1181zp.f48451b);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.f32752b.f48319a.hashCode();
    }

    /* JADX INFO: renamed from: f */
    private final void m11964f(Object[] objArr, Map map, C0274ir c0274ir, FieldPosition fieldPosition) {
        if (objArr != null && this.f32752b.f48322d) {
            throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
        }
        m11967b(0, null, objArr, map, null, c0274ir, fieldPosition);
    }

    /* JADX INFO: renamed from: g */
    private final void m11965g(int i, C0229h c0229h, Object[] objArr, Map map, Object[] objArr2, C0274ir c0274ir) {
        if (this.f32752b.f48323f == 2) {
            throw new UnsupportedOperationException("JDK apostrophe mode not supported");
        }
        m11967b(i, c0229h, objArr, map, objArr2, c0274ir, null);
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.f32752b.f48322d) {
            HashMap map = new HashMap();
            int index = parsePosition.getIndex();
            m11962d(str, parsePosition, null, map);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return map;
        }
        int iM19756c = 0;
        short s = -1;
        while (true) {
            if (iM19756c != 0) {
                iM19756c = this.f32752b.m19756c(iM19756c);
            }
            while (true) {
                iM19756c++;
                int iM19761h = this.f32752b.m19761h(iM19756c);
                if (iM19761h == 6) {
                    break;
                }
                if (iM19761h == 2) {
                    iM19756c = -1;
                    break;
                }
            }
            if (iM19756c < 0) {
                break;
            }
            short s2 = this.f32752b.m19757d(iM19756c + 1).f48043c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        m11962d(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() == index2) {
            return null;
        }
        return objArr;
    }
}
