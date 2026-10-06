package p021j$.time.format;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import p021j$.time.C0459g;
import p021j$.time.C0468p;
import p021j$.time.ZoneId;
import p021j$.time.chrono.C0426h;
import p021j$.time.temporal.AbstractC0480i;
import p021j$.time.temporal.AbstractC0482k;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.InterfaceC0486o;
import p021j$.time.temporal.TemporalAccessor;

/* JADX INFO: renamed from: j$.time.format.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C0453u {

    /* JADX INFO: renamed from: h */
    private static final C0433a f32974h = new InterfaceC0486o() { // from class: j$.time.format.a
        @Override // p021j$.time.temporal.InterfaceC0486o
        /* JADX INFO: renamed from: a */
        public final Object mo12274a(TemporalAccessor temporalAccessor) {
            int i = C0453u.f32976j;
            ZoneId zoneId = (ZoneId) temporalAccessor.mo12253m(AbstractC0485n.m12445g());
            if (zoneId == null || (zoneId instanceof C0468p)) {
                return null;
            }
            return zoneId;
        }
    };

    /* JADX INFO: renamed from: i */
    private static final HashMap f32975i;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f32976j = 0;

    /* JADX INFO: renamed from: a */
    private C0453u f32977a;

    /* JADX INFO: renamed from: b */
    private final C0453u f32978b;

    /* JADX INFO: renamed from: c */
    private final ArrayList f32979c;

    /* JADX INFO: renamed from: d */
    private final boolean f32980d;

    /* JADX INFO: renamed from: e */
    private int f32981e;

    /* JADX INFO: renamed from: f */
    private char f32982f;

    /* JADX INFO: renamed from: g */
    private int f32983g;

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.format.a] */
    static {
        HashMap map = new HashMap();
        f32975i = map;
        map.put('G', EnumC0472a.ERA);
        map.put('y', EnumC0472a.YEAR_OF_ERA);
        map.put('u', EnumC0472a.YEAR);
        InterfaceC0483l interfaceC0483l = AbstractC0480i.f33049a;
        map.put('Q', interfaceC0483l);
        map.put('q', interfaceC0483l);
        EnumC0472a enumC0472a = EnumC0472a.MONTH_OF_YEAR;
        map.put('M', enumC0472a);
        map.put('L', enumC0472a);
        map.put('D', EnumC0472a.DAY_OF_YEAR);
        map.put('d', EnumC0472a.DAY_OF_MONTH);
        map.put('F', EnumC0472a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC0472a enumC0472a2 = EnumC0472a.DAY_OF_WEEK;
        map.put('E', enumC0472a2);
        map.put('c', enumC0472a2);
        map.put('e', enumC0472a2);
        map.put('a', EnumC0472a.AMPM_OF_DAY);
        map.put('H', EnumC0472a.HOUR_OF_DAY);
        map.put('k', EnumC0472a.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC0472a.HOUR_OF_AMPM);
        map.put('h', EnumC0472a.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC0472a.MINUTE_OF_HOUR);
        map.put('s', EnumC0472a.SECOND_OF_MINUTE);
        EnumC0472a enumC0472a3 = EnumC0472a.NANO_OF_SECOND;
        map.put('S', enumC0472a3);
        map.put('A', EnumC0472a.MILLI_OF_DAY);
        map.put('n', enumC0472a3);
        map.put('N', EnumC0472a.NANO_OF_DAY);
        map.put('g', AbstractC0482k.f33059a);
    }

    public C0453u() {
        this.f32977a = this;
        this.f32979c = new ArrayList();
        this.f32983g = -1;
        this.f32978b = null;
        this.f32980d = false;
    }

    /* JADX INFO: renamed from: d */
    private int m12285d(InterfaceC0439g interfaceC0439g) {
        if (interfaceC0439g == null) {
            throw new NullPointerException("pp");
        }
        C0453u c0453u = this.f32977a;
        int i = c0453u.f32981e;
        if (i > 0) {
            C0446n c0446n = new C0446n(interfaceC0439g, i, c0453u.f32982f);
            c0453u.f32981e = 0;
            c0453u.f32982f = (char) 0;
            interfaceC0439g = c0446n;
        }
        c0453u.f32979c.add(interfaceC0439g);
        C0453u c0453u2 = this.f32977a;
        c0453u2.f32983g = -1;
        return c0453u2.f32979c.size() - 1;
    }

    /* JADX INFO: renamed from: m */
    private void m12286m(C0444l c0444l) {
        C0444l c0444lMo12279d;
        C0453u c0453u = this.f32977a;
        int i = c0453u.f32983g;
        if (i < 0) {
            c0453u.f32983g = m12285d(c0444l);
            return;
        }
        C0444l c0444l2 = (C0444l) c0453u.f32979c.get(i);
        int i2 = c0444l.f32947b;
        int i3 = c0444l.f32948c;
        if (i2 == i3 && c0444l.f32949d == EnumC0431B.NOT_NEGATIVE) {
            c0444lMo12279d = c0444l2.mo12280e(i3);
            m12285d(c0444l.mo12279d());
            this.f32977a.f32983g = i;
        } else {
            c0444lMo12279d = c0444l2.mo12279d();
            this.f32977a.f32983g = m12285d(c0444l);
        }
        this.f32977a.f32979c.set(i, c0444lMo12279d);
    }

    /* JADX INFO: renamed from: x */
    private DateTimeFormatter m12287x(Locale locale, EnumC0430A enumC0430A, C0426h c0426h) {
        if (locale == null) {
            throw new NullPointerException("locale");
        }
        while (this.f32977a.f32978b != null) {
            m12301p();
        }
        return new DateTimeFormatter(new C0438f(this.f32979c, false), locale, C0458z.f32996a, enumC0430A, null, c0426h, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m12288a(DateTimeFormatter dateTimeFormatter) {
        m12285d(dateTimeFormatter.m12273e());
    }

    /* JADX INFO: renamed from: b */
    public final void m12289b(EnumC0472a enumC0472a, int i, int i2, boolean z) {
        if (i != i2 || z) {
            m12285d(new C0440h(enumC0472a, i, i2, z));
        } else {
            m12286m(new C0440h(enumC0472a, i, i2, z));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m12290c() {
        m12285d(new C0441i());
    }

    /* JADX INFO: renamed from: e */
    public final void m12291e(char c) {
        m12285d(new C0437e(c));
    }

    /* JADX INFO: renamed from: f */
    public final void m12292f(String str) {
        if (str == null) {
            throw new NullPointerException("literal");
        }
        if (str.isEmpty()) {
            return;
        }
        m12285d(str.length() == 1 ? new C0437e(str.charAt(0)) : new C0442j(1, str));
    }

    /* JADX INFO: renamed from: g */
    public final void m12293g(FormatStyle formatStyle, FormatStyle formatStyle2) {
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        m12285d(new C0443k(formatStyle, formatStyle2));
    }

    /* JADX INFO: renamed from: h */
    public final void m12294h(String str, String str2) {
        m12285d(new C0445m(str, str2));
    }

    /* JADX INFO: renamed from: i */
    public final void m12295i() {
        m12285d(C0445m.f32952e);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x017a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x01af  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:147:0x020b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x020d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0218  */
    /* JADX WARN: Code duplicated, block: B:193:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:270:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:272:0x0402  */
    /* JADX WARN: Code duplicated, block: B:273:0x0406  */
    /* JADX WARN: Code duplicated, block: B:309:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:318:0x02ed A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0411 A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public final void m12296j(String str) {
        String strSubstring;
        C0450r c0450r;
        String str2;
        String str3;
        EnumC0432C enumC0432C;
        EnumC0432C enumC0432C2;
        EnumC0431B enumC0431B;
        boolean z;
        C0444l c0450r2;
        EnumC0432C enumC0432C3;
        int i;
        int i2;
        if (str == null) {
            throw new NullPointerException("pattern");
        }
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == cCharAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i5 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i5);
                    }
                    C0453u c0453u = this.f32977a;
                    c0453u.f32981e = i5;
                    c0453u.f32982f = ' ';
                    c0453u.f32983g = -1;
                    i5 = i2;
                    i4 = i;
                }
                InterfaceC0483l interfaceC0483l = (InterfaceC0483l) f32975i.get(Character.valueOf(cCharAt));
                if (interfaceC0483l != null) {
                    if (cCharAt == 'A') {
                        enumC0431B = EnumC0431B.NOT_NEGATIVE;
                        m12298l(interfaceC0483l, i5, 19, enumC0431B);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i5 == 1 && i5 != 2) {
                            if (i5 != 3) {
                                if (i5 != 4) {
                                    if (i5 != 5) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    enumC0432C3 = z ? EnumC0432C.NARROW_STANDALONE : EnumC0432C.NARROW;
                                } else if (z) {
                                    enumC0432C3 = EnumC0432C.FULL_STANDALONE;
                                } else {
                                    enumC0432C3 = EnumC0432C.FULL;
                                }
                            } else if (z) {
                                enumC0432C3 = EnumC0432C.SHORT_STANDALONE;
                            }
                            if (enumC0432C3 != null) {
                                throw new NullPointerException("textStyle");
                            }
                            m12285d(new C0449q(interfaceC0483l, enumC0432C3, C0457y.m12319c()));
                        } else if (cCharAt == 'e') {
                            c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                            m12286m(c0450r2);
                        } else if (cCharAt != 'E') {
                            if (i5 == 1) {
                                m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                            } else {
                                m12299n(interfaceC0483l, 2);
                            }
                        }
                        enumC0432C3 = EnumC0432C.SHORT;
                        if (enumC0432C3 != null) {
                            throw new NullPointerException("textStyle");
                        }
                        m12285d(new C0449q(interfaceC0483l, enumC0432C3, C0457y.m12319c()));
                    } else if (cCharAt != 'S') {
                        if (cCharAt != 'a') {
                            if (cCharAt != 'k') {
                                if (cCharAt != 'q') {
                                    if (cCharAt == 's') {
                                        if (i5 != 1) {
                                            m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                        } else {
                                            if (i5 != 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            m12299n(interfaceC0483l, i5);
                                        }
                                    } else if (cCharAt == 'u' || cCharAt == 'y') {
                                        if (i5 == 2) {
                                            C0459g c0459g = C0447o.f32959i;
                                            if (c0459g == null) {
                                                throw new NullPointerException("baseDate");
                                            }
                                            m12286m(new C0447o(interfaceC0483l, c0459g));
                                        } else {
                                            if (i5 < 4) {
                                                enumC0431B = EnumC0431B.NORMAL;
                                            } else {
                                                enumC0431B = EnumC0431B.EXCEEDS_PAD;
                                            }
                                            m12298l(interfaceC0483l, i5, 19, enumC0431B);
                                        }
                                    } else if (cCharAt == 'g') {
                                        enumC0431B = EnumC0431B.NORMAL;
                                        m12298l(interfaceC0483l, i5, 19, enumC0431B);
                                    } else if (cCharAt != 'h' && cCharAt != 'm') {
                                        if (cCharAt != 'n') {
                                            switch (cCharAt) {
                                                case 'D':
                                                    if (i5 == 1) {
                                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                    } else {
                                                        if (i5 != 2 && i5 != 3) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        m12298l(interfaceC0483l, i5, 3, EnumC0431B.NOT_NEGATIVE);
                                                    }
                                                    break;
                                                case 'E':
                                                    z = false;
                                                    if (i5 == 1) {
                                                        if (cCharAt == 'e') {
                                                            c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                            m12286m(c0450r2);
                                                            break;
                                                        } else if (cCharAt != 'E') {
                                                            if (i5 == 1) {
                                                                m12299n(interfaceC0483l, 2);
                                                            } else {
                                                                m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                            }
                                                            break;
                                                        }
                                                    } else if (cCharAt == 'e') {
                                                        c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                        m12286m(c0450r2);
                                                        break;
                                                    } else if (cCharAt != 'E') {
                                                        if (i5 == 1) {
                                                            m12299n(interfaceC0483l, 2);
                                                        } else {
                                                            m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 'F':
                                                    if (i5 != 1) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                    break;
                                                case 'G':
                                                    if (i5 != 1 && i5 != 2 && i5 != 3) {
                                                        if (i5 == 4) {
                                                            enumC0432C3 = EnumC0432C.FULL;
                                                        } else if (i5 != 5) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                    }
                                                    if (enumC0432C3 != null) {
                                                        throw new NullPointerException("textStyle");
                                                    }
                                                    m12285d(new C0449q(interfaceC0483l, enumC0432C3, C0457y.m12319c()));
                                                    break;
                                                    break;
                                                case 'H':
                                                    if (i5 != 1) {
                                                        if (i5 != 2) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        m12299n(interfaceC0483l, i5);
                                                    } else {
                                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                    }
                                                    break;
                                                default:
                                                    switch (cCharAt) {
                                                        case 'K':
                                                            if (i5 != 1) {
                                                                if (i5 != 2) {
                                                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                                }
                                                                m12299n(interfaceC0483l, i5);
                                                            } else {
                                                                m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                            }
                                                            break;
                                                        case 'L':
                                                            break;
                                                        case 'M':
                                                            z = false;
                                                            if (i5 == 1) {
                                                                if (cCharAt == 'e') {
                                                                    c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                                    m12286m(c0450r2);
                                                                    break;
                                                                } else if (cCharAt != 'E') {
                                                                    if (i5 == 1) {
                                                                        m12299n(interfaceC0483l, 2);
                                                                    } else {
                                                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                    }
                                                                    break;
                                                                }
                                                            } else if (cCharAt == 'e') {
                                                                c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                                m12286m(c0450r2);
                                                                break;
                                                            } else if (cCharAt != 'E') {
                                                                if (i5 == 1) {
                                                                    m12299n(interfaceC0483l, 2);
                                                                } else {
                                                                    m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        case 'N':
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case 'c':
                                                                    if (i5 == 1) {
                                                                        c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                                    } else if (i5 == 2) {
                                                                        throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                    }
                                                                    m12286m(c0450r2);
                                                                    break;
                                                                case 'd':
                                                                    if (i5 != 1) {
                                                                        if (i5 != 2) {
                                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                                        }
                                                                        m12299n(interfaceC0483l, i5);
                                                                    } else {
                                                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                    }
                                                                    break;
                                                                case 'e':
                                                                    z = false;
                                                                    if (i5 == 1) {
                                                                        if (cCharAt == 'e') {
                                                                            c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                                            m12286m(c0450r2);
                                                                            break;
                                                                        } else if (cCharAt != 'E') {
                                                                            if (i5 == 1) {
                                                                                m12299n(interfaceC0483l, 2);
                                                                            } else {
                                                                                m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (cCharAt == 'e') {
                                                                        c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                                                        m12286m(c0450r2);
                                                                        break;
                                                                    } else if (cCharAt != 'E') {
                                                                        if (i5 == 1) {
                                                                            m12299n(interfaceC0483l, 2);
                                                                        } else {
                                                                            m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (i5 != 1) {
                                                                        m12299n(interfaceC0483l, i5);
                                                                    } else {
                                                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                        enumC0431B = EnumC0431B.NOT_NEGATIVE;
                                        m12298l(interfaceC0483l, i5, 19, enumC0431B);
                                    } else if (i5 != 1) {
                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                    } else {
                                        if (i5 != 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        m12299n(interfaceC0483l, i5);
                                    }
                                }
                                z = true;
                                if (i5 == 1) {
                                    if (cCharAt == 'e') {
                                        c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                        m12286m(c0450r2);
                                    } else if (cCharAt != 'E') {
                                        if (i5 == 1) {
                                            m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                        } else {
                                            m12299n(interfaceC0483l, 2);
                                        }
                                    }
                                } else if (cCharAt == 'e') {
                                    c0450r2 = new C0450r(cCharAt, i5, i5, i5);
                                    m12286m(c0450r2);
                                } else if (cCharAt != 'E') {
                                    if (i5 == 1) {
                                        m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                                    } else {
                                        m12299n(interfaceC0483l, 2);
                                    }
                                }
                            } else if (i5 != 1) {
                                m12286m(new C0444l(interfaceC0483l, 1, 19, EnumC0431B.NORMAL));
                            } else {
                                if (i5 != 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                m12299n(interfaceC0483l, i5);
                            }
                        } else if (i5 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        enumC0432C3 = EnumC0432C.SHORT;
                        if (enumC0432C3 != null) {
                            throw new NullPointerException("textStyle");
                        }
                        m12285d(new C0449q(interfaceC0483l, enumC0432C3, C0457y.m12319c()));
                    } else {
                        m12289b(EnumC0472a.NANO_OF_SECOND, i5, i5, false);
                    }
                } else if (cCharAt == 'z') {
                    if (i5 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    m12285d(new C0452t(i5 == 4 ? EnumC0432C.FULL : EnumC0432C.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    m12285d(new C0451s(AbstractC0485n.m12445g(), "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i5 == 1) {
                        enumC0432C2 = EnumC0432C.SHORT;
                    } else {
                        if (i5 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        enumC0432C2 = EnumC0432C.FULL;
                    }
                    m12285d(new C0452t(enumC0432C2, true));
                } else {
                    String str4 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i5 < 4) {
                            str2 = "+HHMM";
                            m12294h(str2, str4);
                        } else {
                            if (i5 != 4) {
                                if (i5 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                str3 = "+HH:MM:ss";
                                m12294h(str3, "Z");
                            }
                            enumC0432C = EnumC0432C.FULL;
                            if (enumC0432C != null) {
                                throw new NullPointerException("style");
                            }
                            if (enumC0432C == EnumC0432C.FULL && enumC0432C != EnumC0432C.SHORT) {
                                throw new IllegalArgumentException("Style must be either full or short");
                            }
                            m12285d(new C0442j(0, enumC0432C));
                        }
                    } else if (cCharAt == 'O') {
                        if (i5 == 1) {
                            enumC0432C = EnumC0432C.SHORT;
                        } else {
                            if (i5 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            enumC0432C = EnumC0432C.FULL;
                        }
                        if (enumC0432C != null) {
                            throw new NullPointerException("style");
                        }
                        if (enumC0432C == EnumC0432C.FULL) {
                        }
                        m12285d(new C0442j(0, enumC0432C));
                    } else if (cCharAt == 'X') {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        str3 = C0445m.f32951d[i5 + (i5 == 1 ? 0 : 1)];
                        m12294h(str3, "Z");
                    } else if (cCharAt != 'x') {
                        if (cCharAt == 'W') {
                            if (i5 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c0450r = new C0450r(cCharAt, i5, i5, i5);
                        } else if (cCharAt == 'w') {
                            if (i5 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            c0450r = new C0450r(cCharAt, i5, i5, 2);
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            c0450r = i5 == 2 ? new C0450r(cCharAt, i5, i5, 2) : new C0450r(cCharAt, i5, i5, 19);
                        }
                        m12286m(c0450r);
                    } else {
                        if (i5 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i5 == 1) {
                            str4 = "+00";
                        } else if (i5 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = C0445m.f32951d[i5 + (i5 == 1 ? 0 : 1)];
                        m12294h(str2, str4);
                    }
                }
                i3 = (-1) + i4;
            } else if (cCharAt == '\'') {
                int i6 = i3 + 1;
                int i7 = i6;
                while (i7 < str.length()) {
                    if (str.charAt(i7) == '\'') {
                        int i8 = i7 + 1;
                        if (i8 < str.length() && str.charAt(i8) == '\'') {
                            i7 = i8;
                        } else {
                            if (i7 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i6, i7);
                            if (strSubstring.isEmpty()) {
                                m12291e('\'');
                            } else {
                                m12292f(strSubstring.replace("''", "'"));
                            }
                            i3 = i7;
                        }
                    }
                    i7++;
                }
                if (i7 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i6, i7);
                if (strSubstring.isEmpty()) {
                    m12291e('\'');
                } else {
                    m12292f(strSubstring.replace("''", "'"));
                }
                i3 = i7;
            } else if (cCharAt == '[') {
                m12302q();
            } else if (cCharAt == ']') {
                if (this.f32977a.f32978b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                m12301p();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                m12291e(cCharAt);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m12297k(EnumC0472a enumC0472a, HashMap map) {
        if (enumC0472a == null) {
            throw new NullPointerException("field");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC0432C enumC0432C = EnumC0432C.FULL;
        m12285d(new C0449q(enumC0472a, enumC0432C, new C0434b(new C0456x(Collections.singletonMap(enumC0432C, linkedHashMap)))));
    }

    /* JADX INFO: renamed from: l */
    public final C0453u m12298l(InterfaceC0483l interfaceC0483l, int i, int i2, EnumC0431B enumC0431B) {
        if (i == i2 && enumC0431B == EnumC0431B.NOT_NEGATIVE) {
            m12299n(interfaceC0483l, i2);
            return this;
        }
        if (interfaceC0483l == null) {
            throw new NullPointerException("field");
        }
        if (enumC0431B == null) {
            throw new NullPointerException("signStyle");
        }
        if (i < 1 || i > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i2 >= i) {
            m12286m(new C0444l(interfaceC0483l, i, i2, enumC0431B));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    /* JADX INFO: renamed from: n */
    public final void m12299n(InterfaceC0483l interfaceC0483l, int i) {
        if (interfaceC0483l == null) {
            throw new NullPointerException("field");
        }
        if (i >= 1 && i <= 19) {
            m12286m(new C0444l(interfaceC0483l, i, i, EnumC0431B.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12300o() {
        m12285d(new C0451s(f32974h, "ZoneRegionId()"));
    }

    /* JADX INFO: renamed from: p */
    public final void m12301p() {
        C0453u c0453u = this.f32977a;
        if (c0453u.f32978b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (c0453u.f32979c.size() <= 0) {
            this.f32977a = this.f32977a.f32978b;
            return;
        }
        C0453u c0453u2 = this.f32977a;
        C0438f c0438f = new C0438f(c0453u2.f32979c, c0453u2.f32980d);
        this.f32977a = this.f32977a.f32978b;
        m12285d(c0438f);
    }

    /* JADX INFO: renamed from: q */
    public final void m12302q() {
        C0453u c0453u = this.f32977a;
        c0453u.f32983g = -1;
        this.f32977a = new C0453u(c0453u);
    }

    /* JADX INFO: renamed from: r */
    public final void m12303r() {
        m12285d(EnumC0448p.INSENSITIVE);
    }

    /* JADX INFO: renamed from: s */
    public final void m12304s() {
        m12285d(EnumC0448p.SENSITIVE);
    }

    /* JADX INFO: renamed from: t */
    public final void m12305t() {
        m12285d(EnumC0448p.LENIENT);
    }

    /* JADX INFO: renamed from: u */
    public final void m12306u() {
        m12285d(EnumC0448p.STRICT);
    }

    /* JADX INFO: renamed from: v */
    final DateTimeFormatter m12307v(EnumC0430A enumC0430A, C0426h c0426h) {
        return m12287x(Locale.getDefault(), enumC0430A, c0426h);
    }

    /* JADX INFO: renamed from: w */
    public final DateTimeFormatter m12308w(Locale locale) {
        return m12287x(locale, EnumC0430A.SMART, null);
    }

    private C0453u(C0453u c0453u) {
        this.f32977a = this;
        this.f32979c = new ArrayList();
        this.f32983g = -1;
        this.f32978b = c0453u;
        this.f32980d = true;
    }
}
