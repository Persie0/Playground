package p000;

import com.google.protobuf.AbstractC1180a;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e8a extends AbstractC1183d {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final e8a DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile q47 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private MapFieldLite<String, Long> counters_;
    private MapFieldLite<String, String> customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private m94 perfSessions_;
    private m94 subtraces_;

    static {
        e8a e8aVar = new e8a();
        DEFAULT_INSTANCE = e8aVar;
        AbstractC1183d.m6813q(e8a.class, e8aVar);
    }

    public e8a() {
        MapFieldLite mapFieldLite = MapFieldLite.f13927b;
        this.counters_ = mapFieldLite;
        this.customAttributes_ = mapFieldLite;
        this.name_ = "";
        jo7 jo7Var = jo7.f45918d;
        this.subtraces_ = jo7Var;
        this.perfSessions_ = jo7Var;
    }

    /* JADX INFO: renamed from: A */
    public static void m10922A(e8a e8aVar, long j) {
        e8aVar.bitField0_ |= 8;
        e8aVar.durationUs_ = j;
    }

    /* JADX INFO: renamed from: F */
    public static e8a m10923F() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: L */
    public static b8a m10924L() {
        return (b8a) DEFAULT_INSTANCE.m6814j();
    }

    /* JADX INFO: renamed from: s */
    public static void m10925s(e8a e8aVar, String str) {
        e8aVar.getClass();
        str.getClass();
        e8aVar.bitField0_ |= 1;
        e8aVar.name_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static MapFieldLite m10926t(e8a e8aVar) {
        MapFieldLite<String, Long> mapFieldLite = e8aVar.counters_;
        if (!mapFieldLite.f13928a) {
            e8aVar.counters_ = mapFieldLite.m6788c();
        }
        return e8aVar.counters_;
    }

    /* JADX INFO: renamed from: u */
    public static void m10927u(e8a e8aVar, e8a e8aVar2) {
        e8aVar.getClass();
        e8aVar2.getClass();
        m94 m94Var = e8aVar.subtraces_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            e8aVar.subtraces_ = AbstractC1183d.m6812p(m94Var);
        }
        e8aVar.subtraces_.add(e8aVar2);
    }

    /* JADX INFO: renamed from: v */
    public static void m10928v(e8a e8aVar, ArrayList arrayList) {
        m94 m94Var = e8aVar.subtraces_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            e8aVar.subtraces_ = AbstractC1183d.m6812p(m94Var);
        }
        AbstractC1180a.m6789g(arrayList, e8aVar.subtraces_);
    }

    /* JADX INFO: renamed from: w */
    public static MapFieldLite m10929w(e8a e8aVar) {
        MapFieldLite<String, String> mapFieldLite = e8aVar.customAttributes_;
        if (!mapFieldLite.f13928a) {
            e8aVar.customAttributes_ = mapFieldLite.m6788c();
        }
        return e8aVar.customAttributes_;
    }

    /* JADX INFO: renamed from: x */
    public static void m10930x(e8a e8aVar, c77 c77Var) {
        e8aVar.getClass();
        m94 m94Var = e8aVar.perfSessions_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            e8aVar.perfSessions_ = AbstractC1183d.m6812p(m94Var);
        }
        e8aVar.perfSessions_.add(c77Var);
    }

    /* JADX INFO: renamed from: y */
    public static void m10931y(e8a e8aVar, List list) {
        m94 m94Var = e8aVar.perfSessions_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            e8aVar.perfSessions_ = AbstractC1183d.m6812p(m94Var);
        }
        AbstractC1180a.m6789g(list, e8aVar.perfSessions_);
    }

    /* JADX INFO: renamed from: z */
    public static void m10932z(e8a e8aVar, long j) {
        e8aVar.bitField0_ |= 4;
        e8aVar.clientStartTimeUs_ = j;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m10933B() {
        return this.customAttributes_.containsKey("Hosting_activity");
    }

    /* JADX INFO: renamed from: C */
    public final int m10934C() {
        return this.counters_.size();
    }

    /* JADX INFO: renamed from: D */
    public final Map m10935D() {
        return Collections.unmodifiableMap(this.counters_);
    }

    /* JADX INFO: renamed from: E */
    public final Map m10936E() {
        return Collections.unmodifiableMap(this.customAttributes_);
    }

    /* JADX INFO: renamed from: G */
    public final long m10937G() {
        return this.durationUs_;
    }

    /* JADX INFO: renamed from: H */
    public final String m10938H() {
        return this.name_;
    }

    /* JADX INFO: renamed from: I */
    public final m94 m10939I() {
        return this.perfSessions_;
    }

    /* JADX INFO: renamed from: J */
    public final m94 m10940J() {
        return this.subtraces_;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10941K() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (a8a.f363a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new e8a();
            case 2:
                return new b8a(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c8a.f9720a, "subtraces_", e8a.class, "customAttributes_", d8a.f35184a, "perfSessions_", c77.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (e8a.class) {
                    try {
                        xk3Var = PARSER;
                        if (xk3Var == null) {
                            xk3Var = new xk3();
                            PARSER = xk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return xk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }
}
