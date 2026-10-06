package p021j$.util.stream;

import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DISTINCT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: j$.util.stream.u1 */
/* JADX INFO: loaded from: classes3.dex */
final class EnumC0711u1 {
    public static final EnumC0711u1 DISTINCT;
    public static final EnumC0711u1 ORDERED;
    public static final EnumC0711u1 SHORT_CIRCUIT;
    public static final EnumC0711u1 SIZED;
    public static final EnumC0711u1 SORTED;

    /* JADX INFO: renamed from: f */
    static final int f33489f;

    /* JADX INFO: renamed from: g */
    static final int f33490g;

    /* JADX INFO: renamed from: h */
    static final int f33491h;

    /* JADX INFO: renamed from: i */
    private static final int f33492i;

    /* JADX INFO: renamed from: j */
    private static final int f33493j;

    /* JADX INFO: renamed from: k */
    private static final int f33494k;

    /* JADX INFO: renamed from: l */
    static final int f33495l;

    /* JADX INFO: renamed from: m */
    static final int f33496m;

    /* JADX INFO: renamed from: n */
    static final int f33497n;

    /* JADX INFO: renamed from: o */
    static final int f33498o;

    /* JADX INFO: renamed from: p */
    static final int f33499p;

    /* JADX INFO: renamed from: q */
    static final int f33500q;

    /* JADX INFO: renamed from: r */
    static final int f33501r;

    /* JADX INFO: renamed from: s */
    static final int f33502s;

    /* JADX INFO: renamed from: t */
    static final int f33503t;

    /* JADX INFO: renamed from: u */
    private static final /* synthetic */ EnumC0711u1[] f33504u;

    /* JADX INFO: renamed from: a */
    private final Map f33505a;

    /* JADX INFO: renamed from: b */
    private final int f33506b;

    /* JADX INFO: renamed from: c */
    private final int f33507c;

    /* JADX INFO: renamed from: d */
    private final int f33508d;

    /* JADX INFO: renamed from: e */
    private final int f33509e;

    static {
        EnumC0708t1 enumC0708t1 = EnumC0708t1.SPLITERATOR;
        C0705s1 c0705s1M12738h = m12738h(enumC0708t1);
        EnumC0708t1 enumC0708t2 = EnumC0708t1.STREAM;
        c0705s1M12738h.m12734a(enumC0708t2);
        EnumC0708t1 enumC0708t3 = EnumC0708t1.OP;
        c0705s1M12738h.f33479a.put(enumC0708t3, 3);
        EnumC0711u1 enumC0711u1 = new EnumC0711u1("DISTINCT", 0, 0, c0705s1M12738h);
        DISTINCT = enumC0711u1;
        C0705s1 c0705s1M12738h2 = m12738h(enumC0708t1);
        c0705s1M12738h2.m12734a(enumC0708t2);
        c0705s1M12738h2.f33479a.put(enumC0708t3, 3);
        EnumC0711u1 enumC0711u2 = new EnumC0711u1("SORTED", 1, 1, c0705s1M12738h2);
        SORTED = enumC0711u2;
        C0705s1 c0705s1M12738h3 = m12738h(enumC0708t1);
        c0705s1M12738h3.m12734a(enumC0708t2);
        Map map = c0705s1M12738h3.f33479a;
        map.put(enumC0708t3, 3);
        EnumC0708t1 enumC0708t4 = EnumC0708t1.TERMINAL_OP;
        map.put(enumC0708t4, 2);
        EnumC0708t1 enumC0708t5 = EnumC0708t1.UPSTREAM_TERMINAL_OP;
        map.put(enumC0708t5, 2);
        EnumC0711u1 enumC0711u3 = new EnumC0711u1("ORDERED", 2, 2, c0705s1M12738h3);
        ORDERED = enumC0711u3;
        C0705s1 c0705s1M12738h4 = m12738h(enumC0708t1);
        c0705s1M12738h4.m12734a(enumC0708t2);
        c0705s1M12738h4.f33479a.put(enumC0708t3, 2);
        EnumC0711u1 enumC0711u4 = new EnumC0711u1("SIZED", 3, 3, c0705s1M12738h4);
        SIZED = enumC0711u4;
        C0705s1 c0705s1M12738h5 = m12738h(enumC0708t3);
        c0705s1M12738h5.m12734a(enumC0708t4);
        EnumC0711u1 enumC0711u5 = new EnumC0711u1("SHORT_CIRCUIT", 4, 12, c0705s1M12738h5);
        SHORT_CIRCUIT = enumC0711u5;
        f33504u = new EnumC0711u1[]{enumC0711u1, enumC0711u2, enumC0711u3, enumC0711u4, enumC0711u5};
        f33489f = m12737c(enumC0708t1);
        f33490g = m12737c(enumC0708t2);
        f33491h = m12737c(enumC0708t3);
        m12737c(enumC0708t4);
        m12737c(enumC0708t5);
        int i = 0;
        for (EnumC0711u1 enumC0711u6 : values()) {
            i |= enumC0711u6.f33509e;
        }
        f33492i = i;
        int i2 = f33490g;
        f33493j = i2;
        int i3 = i2 << 1;
        f33494k = i3;
        f33495l = i2 | i3;
        EnumC0711u1 enumC0711u7 = DISTINCT;
        f33496m = enumC0711u7.f33507c;
        f33497n = enumC0711u7.f33508d;
        EnumC0711u1 enumC0711u8 = SORTED;
        int i4 = enumC0711u8.f33507c;
        f33498o = enumC0711u8.f33508d;
        EnumC0711u1 enumC0711u9 = ORDERED;
        f33499p = enumC0711u9.f33507c;
        f33500q = enumC0711u9.f33508d;
        EnumC0711u1 enumC0711u10 = SIZED;
        f33501r = enumC0711u10.f33507c;
        f33502s = enumC0711u10.f33508d;
        f33503t = SHORT_CIRCUIT.f33507c;
    }

    private EnumC0711u1(String str, int i, int i2, C0705s1 c0705s1) {
        super(str, i);
        EnumC0708t1[] enumC0708t1ArrValues = EnumC0708t1.values();
        int length = enumC0708t1ArrValues.length;
        int i3 = 0;
        while (true) {
            Map map = c0705s1.f33479a;
            if (i3 >= length) {
                this.f33505a = map;
                int i4 = i2 * 2;
                this.f33506b = i4;
                this.f33507c = 1 << i4;
                this.f33508d = 2 << i4;
                this.f33509e = 3 << i4;
                return;
            }
            p021j$.util.Map.EL.putIfAbsent(map, enumC0708t1ArrValues[i3], 0);
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    static int m12736a(int i, int i2) {
        return i | (i2 & (i == 0 ? f33492i : ((((f33493j & i) << 1) | i) | ((f33494k & i) >> 1)) ^ (-1)));
    }

    /* JADX INFO: renamed from: c */
    private static int m12737c(EnumC0708t1 enumC0708t1) {
        int iIntValue = 0;
        for (EnumC0711u1 enumC0711u1 : values()) {
            iIntValue |= ((Integer) enumC0711u1.f33505a.get(enumC0708t1)).intValue() << enumC0711u1.f33506b;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: h */
    private static C0705s1 m12738h(EnumC0708t1 enumC0708t1) {
        C0705s1 c0705s1 = new C0705s1(new EnumMap(EnumC0708t1.class));
        c0705s1.m12734a(enumC0708t1);
        return c0705s1;
    }

    /* JADX INFO: renamed from: i */
    static int m12739i(int i) {
        return i & ((i ^ (-1)) >> 1) & f33493j;
    }

    public static EnumC0711u1 valueOf(String str) {
        return (EnumC0711u1) Enum.valueOf(EnumC0711u1.class, str);
    }

    public static EnumC0711u1[] values() {
        return (EnumC0711u1[]) f33504u.clone();
    }

    /* JADX INFO: renamed from: e */
    final boolean m12740e(int i) {
        return (i & this.f33509e) == this.f33507c;
    }

    /* JADX INFO: renamed from: f */
    final boolean m12741f(int i) {
        int i2 = this.f33509e;
        return (i & i2) == i2;
    }
}
