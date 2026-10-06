package p021j$.time.format;

import java.util.Calendar;
import java.util.Locale;
import p021j$.time.EnumC0418c;
import p021j$.time.temporal.C0490s;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.format.r */
/* JADX INFO: loaded from: classes3.dex */
final class C0450r extends C0444l {

    /* JADX INFO: renamed from: g */
    private char f32967g;

    /* JADX INFO: renamed from: h */
    private int f32968h;

    C0450r(char c, int i, int i2, int i3) {
        this(c, i, i2, i3, 0);
    }

    @Override // p021j$.time.format.C0444l, p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        InterfaceC0483l interfaceC0483lM12474h;
        InterfaceC0439g c0444l;
        Locale localeM12311c = c0455w.m12311c();
        TemporalUnit temporalUnit = C0490s.f33082h;
        if (localeM12311c == null) {
            throw new NullPointerException("locale");
        }
        Calendar calendar = Calendar.getInstance(new Locale(localeM12311c.getLanguage(), localeM12311c.getCountry()));
        C0490s c0490sM12469f = C0490s.m12469f(EnumC0418c.SUNDAY.m12264r(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c = this.f32967g;
        if (c != 'W') {
            if (c == 'Y') {
                InterfaceC0483l interfaceC0483lM12473g = c0490sM12469f.m12473g();
                int i = this.f32968h;
                if (i == 2) {
                    c0444l = new C0447o(interfaceC0483lM12473g, C0447o.f32959i, this.f32950e);
                } else {
                    c0444l = new C0444l(interfaceC0483lM12473g, i, 19, i < 4 ? EnumC0431B.NORMAL : EnumC0431B.EXCEEDS_PAD, this.f32950e);
                }
            } else if (c == 'c' || c == 'e') {
                interfaceC0483lM12474h = c0490sM12469f.m12470c();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                interfaceC0483lM12474h = c0490sM12469f.m12475i();
            }
            return c0444l.mo12277a(c0455w, sb);
        }
        interfaceC0483lM12474h = c0490sM12469f.m12474h();
        c0444l = new C0444l(interfaceC0483lM12474h, this.f32947b, this.f32948c, EnumC0431B.NOT_NEGATIVE, this.f32950e);
        return c0444l.mo12277a(c0455w, sb);
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: d */
    final C0444l mo12279d() {
        return this.f32950e == -1 ? this : new C0450r(this.f32967g, this.f32968h, this.f32947b, this.f32948c, -1);
    }

    @Override // p021j$.time.format.C0444l
    /* JADX INFO: renamed from: e */
    final C0444l mo12280e(int i) {
        return new C0450r(this.f32967g, this.f32968h, this.f32947b, this.f32948c, this.f32950e + i);
    }

    @Override // p021j$.time.format.C0444l
    public final String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f32967g;
        if (c == 'Y') {
            int i = this.f32968h;
            if (i == 1) {
                sb.append("WeekBasedYear");
            } else if (i == 2) {
                sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f32968h);
                sb.append(",19,");
                sb.append(this.f32968h < 4 ? EnumC0431B.NORMAL : EnumC0431B.EXCEEDS_PAD);
            }
        } else {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(this.f32968h);
        }
        sb.append(")");
        return sb.toString();
    }

    C0450r(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, EnumC0431B.NOT_NEGATIVE, i4);
        this.f32967g = c;
        this.f32968h = i;
    }
}
