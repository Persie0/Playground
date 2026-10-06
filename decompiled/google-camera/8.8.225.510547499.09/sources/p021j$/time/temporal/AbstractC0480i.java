package p021j$.time.temporal;

import p021j$.time.chrono.AbstractC0419a;
import p021j$.time.chrono.AbstractC0422d;
import p021j$.time.chrono.C0426h;

/* JADX INFO: renamed from: j$.time.temporal.i */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0480i {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0483l f33049a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0483l f33050b;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0483l f33051c;

    /* JADX INFO: renamed from: d */
    public static final TemporalUnit f33052d;

    static {
        EnumC0478g enumC0478g = EnumC0478g.DAY_OF_QUARTER;
        f33049a = EnumC0478g.QUARTER_OF_YEAR;
        f33050b = EnumC0478g.WEEK_OF_WEEK_BASED_YEAR;
        f33051c = EnumC0478g.WEEK_BASED_YEAR;
        f33052d = EnumC0479h.WEEK_BASED_YEARS;
        EnumC0479h enumC0479h = EnumC0479h.WEEK_BASED_YEARS;
    }

    /* JADX INFO: renamed from: a */
    static boolean m12437a(TemporalAccessor temporalAccessor) {
        return ((AbstractC0419a) AbstractC0422d.m12266b(temporalAccessor)).equals(C0426h.f32915a);
    }
}
