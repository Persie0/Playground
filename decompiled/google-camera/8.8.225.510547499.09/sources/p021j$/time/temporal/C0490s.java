package p021j$.time.temporal;

import java.io.Serializable;
import p021j$.time.EnumC0418c;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.temporal.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C0490s implements Serializable {

    /* JADX INFO: renamed from: g */
    private static final ConcurrentHashMap f33081g = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: h */
    public static final TemporalUnit f33082h;

    /* JADX INFO: renamed from: a */
    private final EnumC0418c f33083a;

    /* JADX INFO: renamed from: b */
    private final int f33084b;

    /* JADX INFO: renamed from: c */
    private final transient InterfaceC0483l f33085c = C0489r.m12460k(this);

    /* JADX INFO: renamed from: d */
    private final transient InterfaceC0483l f33086d = C0489r.m12462m(this);

    /* JADX INFO: renamed from: e */
    private final transient InterfaceC0483l f33087e;

    /* JADX INFO: renamed from: f */
    private final transient InterfaceC0483l f33088f;

    static {
        new C0490s(EnumC0418c.MONDAY, 4);
        m12469f(EnumC0418c.SUNDAY, 1);
        f33082h = AbstractC0480i.f33052d;
    }

    private C0490s(EnumC0418c enumC0418c, int i) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.f33087e = C0489r.m12463n(this);
        this.f33088f = C0489r.m12461l(this);
        if (enumC0418c == null) {
            throw new NullPointerException("firstDayOfWeek");
        }
        if (i < 1 || i > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f33083a = enumC0418c;
        this.f33084b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0490s m12469f(EnumC0418c enumC0418c, int i) {
        String str = enumC0418c.toString() + i;
        ConcurrentHashMap concurrentHashMap = f33081g;
        C0490s c0490s = (C0490s) concurrentHashMap.get(str);
        if (c0490s != null) {
            return c0490s;
        }
        concurrentHashMap.putIfAbsent(str, new C0490s(enumC0418c, i));
        return (C0490s) concurrentHashMap.get(str);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0483l m12470c() {
        return this.f33085c;
    }

    /* JADX INFO: renamed from: d */
    public final EnumC0418c m12471d() {
        return this.f33083a;
    }

    /* JADX INFO: renamed from: e */
    public final int m12472e() {
        return this.f33084b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0490s) && hashCode() == obj.hashCode();
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC0483l m12473g() {
        return this.f33088f;
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0483l m12474h() {
        return this.f33086d;
    }

    public final int hashCode() {
        return (this.f33083a.ordinal() * 7) + this.f33084b;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0483l m12475i() {
        return this.f33087e;
    }

    public final String toString() {
        return "WeekFields[" + String.valueOf(this.f33083a) + "," + this.f33084b + "]";
    }
}
