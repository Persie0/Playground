package p021j$.time.format;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import p021j$.time.C0417b;
import p021j$.time.ZoneId;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0425g;
import p021j$.time.temporal.AbstractC0480i;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatter {

    /* JADX INFO: renamed from: h */
    public static final DateTimeFormatter f32925h;

    /* JADX INFO: renamed from: a */
    private final C0438f f32926a;

    /* JADX INFO: renamed from: b */
    private final Locale f32927b;

    /* JADX INFO: renamed from: c */
    private final C0458z f32928c;

    /* JADX INFO: renamed from: d */
    private final EnumC0430A f32929d;

    /* JADX INFO: renamed from: e */
    private final Set f32930e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC0425g f32931f;

    /* JADX INFO: renamed from: g */
    private final ZoneId f32932g;

    static {
        C0453u c0453u = new C0453u();
        EnumC0472a enumC0472a = EnumC0472a.YEAR;
        EnumC0431B enumC0431B = EnumC0431B.EXCEEDS_PAD;
        c0453u.m12298l(enumC0472a, 4, 10, enumC0431B);
        c0453u.m12291e('-');
        EnumC0472a enumC0472a2 = EnumC0472a.MONTH_OF_YEAR;
        c0453u.m12299n(enumC0472a2, 2);
        c0453u.m12291e('-');
        EnumC0472a enumC0472a3 = EnumC0472a.DAY_OF_MONTH;
        c0453u.m12299n(enumC0472a3, 2);
        EnumC0430A enumC0430A = EnumC0430A.STRICT;
        C0426h c0426h = C0426h.f32915a;
        DateTimeFormatter dateTimeFormatterM12307v = c0453u.m12307v(enumC0430A, c0426h);
        C0453u c0453u2 = new C0453u();
        c0453u2.m12303r();
        c0453u2.m12288a(dateTimeFormatterM12307v);
        c0453u2.m12295i();
        c0453u2.m12307v(enumC0430A, c0426h);
        C0453u c0453u3 = new C0453u();
        c0453u3.m12303r();
        c0453u3.m12288a(dateTimeFormatterM12307v);
        c0453u3.m12302q();
        c0453u3.m12295i();
        c0453u3.m12307v(enumC0430A, c0426h);
        C0453u c0453u4 = new C0453u();
        EnumC0472a enumC0472a4 = EnumC0472a.HOUR_OF_DAY;
        c0453u4.m12299n(enumC0472a4, 2);
        c0453u4.m12291e(':');
        EnumC0472a enumC0472a5 = EnumC0472a.MINUTE_OF_HOUR;
        c0453u4.m12299n(enumC0472a5, 2);
        c0453u4.m12302q();
        c0453u4.m12291e(':');
        EnumC0472a enumC0472a6 = EnumC0472a.SECOND_OF_MINUTE;
        c0453u4.m12299n(enumC0472a6, 2);
        c0453u4.m12302q();
        c0453u4.m12289b(EnumC0472a.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter dateTimeFormatterM12307v2 = c0453u4.m12307v(enumC0430A, null);
        C0453u c0453u5 = new C0453u();
        c0453u5.m12303r();
        c0453u5.m12288a(dateTimeFormatterM12307v2);
        c0453u5.m12295i();
        c0453u5.m12307v(enumC0430A, null);
        C0453u c0453u6 = new C0453u();
        c0453u6.m12303r();
        c0453u6.m12288a(dateTimeFormatterM12307v2);
        c0453u6.m12302q();
        c0453u6.m12295i();
        c0453u6.m12307v(enumC0430A, null);
        C0453u c0453u7 = new C0453u();
        c0453u7.m12303r();
        c0453u7.m12288a(dateTimeFormatterM12307v);
        c0453u7.m12291e('T');
        c0453u7.m12288a(dateTimeFormatterM12307v2);
        DateTimeFormatter dateTimeFormatterM12307v3 = c0453u7.m12307v(enumC0430A, c0426h);
        C0453u c0453u8 = new C0453u();
        c0453u8.m12303r();
        c0453u8.m12288a(dateTimeFormatterM12307v3);
        c0453u8.m12305t();
        c0453u8.m12295i();
        c0453u8.m12306u();
        DateTimeFormatter dateTimeFormatterM12307v4 = c0453u8.m12307v(enumC0430A, c0426h);
        C0453u c0453u9 = new C0453u();
        c0453u9.m12288a(dateTimeFormatterM12307v4);
        c0453u9.m12302q();
        c0453u9.m12291e('[');
        c0453u9.m12304s();
        c0453u9.m12300o();
        c0453u9.m12291e(']');
        c0453u9.m12307v(enumC0430A, c0426h);
        C0453u c0453u10 = new C0453u();
        c0453u10.m12288a(dateTimeFormatterM12307v3);
        c0453u10.m12302q();
        c0453u10.m12295i();
        c0453u10.m12302q();
        c0453u10.m12291e('[');
        c0453u10.m12304s();
        c0453u10.m12300o();
        c0453u10.m12291e(']');
        c0453u10.m12307v(enumC0430A, c0426h);
        C0453u c0453u11 = new C0453u();
        c0453u11.m12303r();
        c0453u11.m12298l(enumC0472a, 4, 10, enumC0431B);
        c0453u11.m12291e('-');
        c0453u11.m12299n(EnumC0472a.DAY_OF_YEAR, 3);
        c0453u11.m12302q();
        c0453u11.m12295i();
        c0453u11.m12307v(enumC0430A, c0426h);
        C0453u c0453u12 = new C0453u();
        c0453u12.m12303r();
        c0453u12.m12298l(AbstractC0480i.f33051c, 4, 10, enumC0431B);
        c0453u12.m12292f("-W");
        c0453u12.m12299n(AbstractC0480i.f33050b, 2);
        c0453u12.m12291e('-');
        EnumC0472a enumC0472a7 = EnumC0472a.DAY_OF_WEEK;
        c0453u12.m12299n(enumC0472a7, 1);
        c0453u12.m12302q();
        c0453u12.m12295i();
        c0453u12.m12307v(enumC0430A, c0426h);
        C0453u c0453u13 = new C0453u();
        c0453u13.m12303r();
        c0453u13.m12290c();
        f32925h = c0453u13.m12307v(enumC0430A, null);
        C0453u c0453u14 = new C0453u();
        c0453u14.m12303r();
        c0453u14.m12299n(enumC0472a, 4);
        c0453u14.m12299n(enumC0472a2, 2);
        c0453u14.m12299n(enumC0472a3, 2);
        c0453u14.m12302q();
        c0453u14.m12305t();
        c0453u14.m12294h("+HHMMss", "Z");
        c0453u14.m12306u();
        c0453u14.m12307v(enumC0430A, c0426h);
        HashMap map = new HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        HashMap map2 = new HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        C0453u c0453u15 = new C0453u();
        c0453u15.m12303r();
        c0453u15.m12305t();
        c0453u15.m12302q();
        c0453u15.m12297k(enumC0472a7, map);
        c0453u15.m12292f(", ");
        c0453u15.m12301p();
        c0453u15.m12298l(enumC0472a3, 1, 2, EnumC0431B.NOT_NEGATIVE);
        c0453u15.m12291e(' ');
        c0453u15.m12297k(enumC0472a2, map2);
        c0453u15.m12291e(' ');
        c0453u15.m12299n(enumC0472a, 4);
        c0453u15.m12291e(' ');
        c0453u15.m12299n(enumC0472a4, 2);
        c0453u15.m12291e(':');
        c0453u15.m12299n(enumC0472a5, 2);
        c0453u15.m12302q();
        c0453u15.m12291e(':');
        c0453u15.m12299n(enumC0472a6, 2);
        c0453u15.m12301p();
        c0453u15.m12291e(' ');
        c0453u15.m12294h("+HHMM", "GMT");
        c0453u15.m12307v(EnumC0430A.SMART, c0426h);
    }

    DateTimeFormatter(C0438f c0438f, Locale locale, C0458z c0458z, EnumC0430A enumC0430A, Set set, InterfaceC0425g interfaceC0425g, ZoneId zoneId) {
        if (c0438f == null) {
            throw new NullPointerException("printerParser");
        }
        this.f32926a = c0438f;
        this.f32930e = set;
        if (locale == null) {
            throw new NullPointerException("locale");
        }
        this.f32927b = locale;
        if (c0458z == null) {
            throw new NullPointerException("decimalStyle");
        }
        this.f32928c = c0458z;
        if (enumC0430A == null) {
            throw new NullPointerException("resolverStyle");
        }
        this.f32929d = enumC0430A;
        this.f32931f = interfaceC0425g;
        this.f32932g = zoneId;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle) {
        if (formatStyle == null) {
            throw new NullPointerException("dateTimeStyle");
        }
        C0453u c0453u = new C0453u();
        c0453u.m12293g(formatStyle, formatStyle);
        return c0453u.m12307v(EnumC0430A.SMART, C0426h.f32915a);
    }

    public static DateTimeFormatter ofPattern(String str) {
        C0453u c0453u = new C0453u();
        c0453u.m12296j(str);
        return c0453u.m12308w(Locale.getDefault());
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0425g m12269a() {
        return this.f32931f;
    }

    /* JADX INFO: renamed from: b */
    public final C0458z m12270b() {
        return this.f32928c;
    }

    /* JADX INFO: renamed from: c */
    public final Locale m12271c() {
        return this.f32927b;
    }

    /* JADX INFO: renamed from: d */
    public final ZoneId m12272d() {
        return this.f32932g;
    }

    /* JADX INFO: renamed from: e */
    final C0438f m12273e() {
        return this.f32926a.m12278b();
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        if (temporalAccessor == null) {
            throw new NullPointerException("temporal");
        }
        try {
            this.f32926a.mo12277a(new C0455w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new C0417b(e.getMessage(), e);
        }
    }

    public final String toString() {
        String string = this.f32926a.toString();
        return string.startsWith("[") ? string : string.substring(1, string.length() - 1);
    }

    public DateTimeFormatter withZone(ZoneId zoneId) {
        return Objects.equals(this.f32932g, zoneId) ? this : new DateTimeFormatter(this.f32926a, this.f32927b, this.f32928c, this.f32929d, this.f32930e, this.f32931f, zoneId);
    }
}
