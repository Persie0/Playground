package org.joda.time.chrono;

import java.io.IOException;
import java.io.ObjectInputStream;
import org.joda.time.DateTimeZone;
import p163hp.AbstractC6094a;
import p163hp.AbstractC6095b;
import p163hp.AbstractC6097d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AssembledChronology extends BaseChronology {
    private static final long serialVersionUID = -6728465968995518215L;

    /* JADX INFO: renamed from: H */
    public transient AbstractC6095b f43969H;

    /* JADX INFO: renamed from: I */
    public transient AbstractC6095b f43970I;

    /* JADX INFO: renamed from: J */
    public transient AbstractC6095b f43971J;

    /* JADX INFO: renamed from: K */
    public transient AbstractC6095b f43972K;

    /* JADX INFO: renamed from: L */
    public transient AbstractC6095b f43973L;

    /* JADX INFO: renamed from: M */
    public transient AbstractC6095b f43974M;

    /* JADX INFO: renamed from: N */
    public transient AbstractC6095b f43975N;

    /* JADX INFO: renamed from: O */
    public transient AbstractC6095b f43976O;

    /* JADX INFO: renamed from: P */
    public transient AbstractC6095b f43977P;

    /* JADX INFO: renamed from: Q */
    public transient AbstractC6095b f43978Q;

    /* JADX INFO: renamed from: R */
    public transient AbstractC6095b f43979R;

    /* JADX INFO: renamed from: S */
    public transient AbstractC6095b f43980S;

    /* JADX INFO: renamed from: T */
    public transient AbstractC6095b f43981T;

    /* JADX INFO: renamed from: U */
    public transient AbstractC6095b f43982U;

    /* JADX INFO: renamed from: V */
    public transient AbstractC6095b f43983V;

    /* JADX INFO: renamed from: W */
    public transient AbstractC6095b f43984W;

    /* JADX INFO: renamed from: X */
    public transient AbstractC6095b f43985X;

    /* JADX INFO: renamed from: Y */
    public transient AbstractC6095b f43986Y;

    /* JADX INFO: renamed from: Z */
    public transient AbstractC6095b f43987Z;

    /* JADX INFO: renamed from: a */
    public transient AbstractC6097d f43988a;

    /* JADX INFO: renamed from: a0 */
    public transient AbstractC6095b f43989a0;

    /* JADX INFO: renamed from: b */
    public transient AbstractC6097d f43990b;

    /* JADX INFO: renamed from: b0 */
    public transient AbstractC6095b f43991b0;

    /* JADX INFO: renamed from: c */
    public transient AbstractC6097d f43992c;

    /* JADX INFO: renamed from: c0 */
    public transient AbstractC6095b f43993c0;

    /* JADX INFO: renamed from: d */
    public transient AbstractC6097d f43994d;

    /* JADX INFO: renamed from: d0 */
    public transient AbstractC6095b f43995d0;

    /* JADX INFO: renamed from: e */
    public transient AbstractC6097d f43996e;

    /* JADX INFO: renamed from: f */
    public transient AbstractC6097d f43997f;

    /* JADX INFO: renamed from: g */
    public transient AbstractC6097d f43998g;

    /* JADX INFO: renamed from: h */
    public transient AbstractC6097d f43999h;

    /* JADX INFO: renamed from: i */
    public transient AbstractC6097d f44000i;
    private final AbstractC6094a iBase;
    private final Object iParam;

    /* JADX INFO: renamed from: j */
    public transient AbstractC6097d f44001j;

    /* JADX INFO: renamed from: k */
    public transient AbstractC6097d f44002k;

    /* JADX INFO: renamed from: l */
    public transient AbstractC6097d f44003l;

    /* JADX INFO: renamed from: org.joda.time.chrono.AssembledChronology$a */
    public static final class C8104a {

        /* JADX INFO: renamed from: A */
        public AbstractC6095b f44004A;

        /* JADX INFO: renamed from: B */
        public AbstractC6095b f44005B;

        /* JADX INFO: renamed from: C */
        public AbstractC6095b f44006C;

        /* JADX INFO: renamed from: D */
        public AbstractC6095b f44007D;

        /* JADX INFO: renamed from: E */
        public AbstractC6095b f44008E;

        /* JADX INFO: renamed from: F */
        public AbstractC6095b f44009F;

        /* JADX INFO: renamed from: G */
        public AbstractC6095b f44010G;

        /* JADX INFO: renamed from: H */
        public AbstractC6095b f44011H;

        /* JADX INFO: renamed from: I */
        public AbstractC6095b f44012I;

        /* JADX INFO: renamed from: a */
        public AbstractC6097d f44013a;

        /* JADX INFO: renamed from: b */
        public AbstractC6097d f44014b;

        /* JADX INFO: renamed from: c */
        public AbstractC6097d f44015c;

        /* JADX INFO: renamed from: d */
        public AbstractC6097d f44016d;

        /* JADX INFO: renamed from: e */
        public AbstractC6097d f44017e;

        /* JADX INFO: renamed from: f */
        public AbstractC6097d f44018f;

        /* JADX INFO: renamed from: g */
        public AbstractC6097d f44019g;

        /* JADX INFO: renamed from: h */
        public AbstractC6097d f44020h;

        /* JADX INFO: renamed from: i */
        public AbstractC6097d f44021i;

        /* JADX INFO: renamed from: j */
        public AbstractC6097d f44022j;

        /* JADX INFO: renamed from: k */
        public AbstractC6097d f44023k;

        /* JADX INFO: renamed from: l */
        public AbstractC6097d f44024l;

        /* JADX INFO: renamed from: m */
        public AbstractC6095b f44025m;

        /* JADX INFO: renamed from: n */
        public AbstractC6095b f44026n;

        /* JADX INFO: renamed from: o */
        public AbstractC6095b f44027o;

        /* JADX INFO: renamed from: p */
        public AbstractC6095b f44028p;

        /* JADX INFO: renamed from: q */
        public AbstractC6095b f44029q;

        /* JADX INFO: renamed from: r */
        public AbstractC6095b f44030r;

        /* JADX INFO: renamed from: s */
        public AbstractC6095b f44031s;

        /* JADX INFO: renamed from: t */
        public AbstractC6095b f44032t;

        /* JADX INFO: renamed from: u */
        public AbstractC6095b f44033u;

        /* JADX INFO: renamed from: v */
        public AbstractC6095b f44034v;

        /* JADX INFO: renamed from: w */
        public AbstractC6095b f44035w;

        /* JADX INFO: renamed from: x */
        public AbstractC6095b f44036x;

        /* JADX INFO: renamed from: y */
        public AbstractC6095b f44037y;

        /* JADX INFO: renamed from: z */
        public AbstractC6095b f44038z;

        /* JADX INFO: renamed from: a */
        public static boolean m16046a(AbstractC6095b abstractC6095b) {
            if (abstractC6095b == null) {
                return false;
            }
            return abstractC6095b.mo12588z();
        }

        /* JADX INFO: renamed from: b */
        public static boolean m16047b(AbstractC6097d abstractC6097d) {
            if (abstractC6097d == null) {
                return false;
            }
            return abstractC6097d.mo12596w();
        }
    }

    public AssembledChronology(AbstractC6094a abstractC6094a, Object obj) {
        this.iBase = abstractC6094a;
        this.iParam = obj;
        m16045j0();
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        m16045j0();
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: A */
    public final AbstractC6095b mo12524A() {
        return this.f43969H;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: C */
    public final AbstractC6095b mo12525C() {
        return this.f43974M;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: D */
    public final AbstractC6095b mo12526D() {
        return this.f43973L;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: E */
    public final AbstractC6097d mo12527E() {
        return this.f43992c;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: G */
    public final AbstractC6095b mo12528G() {
        return this.f43986Y;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: I */
    public final AbstractC6097d mo12529I() {
        return this.f44000i;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: J */
    public final AbstractC6095b mo12530J() {
        return this.f43972K;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: M */
    public final AbstractC6095b mo12531M() {
        return this.f43971J;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: Q */
    public final AbstractC6097d mo12532Q() {
        return this.f43990b;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: R */
    public final AbstractC6095b mo12533R() {
        return this.f43983V;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: T */
    public final AbstractC6097d mo12534T() {
        return this.f43998g;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: U */
    public final AbstractC6095b mo12535U() {
        return this.f43984W;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: X */
    public final AbstractC6095b mo12536X() {
        return this.f43985X;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: Y */
    public final AbstractC6097d mo12537Y() {
        return this.f43999h;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: a */
    public final AbstractC6097d mo12538a() {
        return this.f44002k;
    }

    @Override // p163hp.AbstractC6094a
    /* JADX INFO: renamed from: a0 */
    public AbstractC6094a mo12539a0() {
        return m16043h0();
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: b */
    public final AbstractC6095b mo12540b() {
        return this.f43993c0;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: c */
    public final AbstractC6095b mo12542c() {
        return this.f43976O;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: c0 */
    public final AbstractC6095b mo12543c0() {
        return this.f43987Z;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: d */
    public final AbstractC6095b mo12544d() {
        return this.f43978Q;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: d0 */
    public final AbstractC6095b mo12545d0() {
        return this.f43991b0;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: e */
    public final AbstractC6095b mo12546e() {
        return this.f43981T;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: e0 */
    public final AbstractC6095b mo12547e0() {
        return this.f43989a0;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: f0 */
    public final AbstractC6097d mo12548f0() {
        return this.f44001j;
    }

    /* JADX INFO: renamed from: g0 */
    public abstract void mo16042g0(C8104a c8104a);

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: h */
    public final AbstractC6095b mo12549h() {
        return this.f43980S;
    }

    /* JADX INFO: renamed from: h0 */
    public final AbstractC6094a m16043h0() {
        return this.iBase;
    }

    /* JADX INFO: renamed from: i0 */
    public final Object m16044i0() {
        return this.iParam;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: j */
    public final AbstractC6095b mo12550j() {
        return this.f43982U;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m16045j0() {
        C8104a c8104a = new C8104a();
        AbstractC6094a abstractC6094a = this.iBase;
        if (abstractC6094a != null) {
            AbstractC6097d abstractC6097dMo12560y = abstractC6094a.mo12560y();
            if (C8104a.m16047b(abstractC6097dMo12560y)) {
                c8104a.f44013a = abstractC6097dMo12560y;
            }
            AbstractC6097d abstractC6097dMo12532Q = abstractC6094a.mo12532Q();
            if (C8104a.m16047b(abstractC6097dMo12532Q)) {
                c8104a.f44014b = abstractC6097dMo12532Q;
            }
            AbstractC6097d abstractC6097dMo12527E = abstractC6094a.mo12527E();
            if (C8104a.m16047b(abstractC6097dMo12527E)) {
                c8104a.f44015c = abstractC6097dMo12527E;
            }
            AbstractC6097d abstractC6097dMo12559x = abstractC6094a.mo12559x();
            if (C8104a.m16047b(abstractC6097dMo12559x)) {
                c8104a.f44016d = abstractC6097dMo12559x;
            }
            AbstractC6097d abstractC6097dMo12556s = abstractC6094a.mo12556s();
            if (C8104a.m16047b(abstractC6097dMo12556s)) {
                c8104a.f44017e = abstractC6097dMo12556s;
            }
            AbstractC6097d abstractC6097dMo12551k = abstractC6094a.mo12551k();
            if (C8104a.m16047b(abstractC6097dMo12551k)) {
                c8104a.f44018f = abstractC6097dMo12551k;
            }
            AbstractC6097d abstractC6097dMo12534T = abstractC6094a.mo12534T();
            if (C8104a.m16047b(abstractC6097dMo12534T)) {
                c8104a.f44019g = abstractC6097dMo12534T;
            }
            AbstractC6097d abstractC6097dMo12537Y = abstractC6094a.mo12537Y();
            if (C8104a.m16047b(abstractC6097dMo12537Y)) {
                c8104a.f44020h = abstractC6097dMo12537Y;
            }
            AbstractC6097d abstractC6097dMo12529I = abstractC6094a.mo12529I();
            if (C8104a.m16047b(abstractC6097dMo12529I)) {
                c8104a.f44021i = abstractC6097dMo12529I;
            }
            AbstractC6097d abstractC6097dMo12548f0 = abstractC6094a.mo12548f0();
            if (C8104a.m16047b(abstractC6097dMo12548f0)) {
                c8104a.f44022j = abstractC6097dMo12548f0;
            }
            AbstractC6097d abstractC6097dMo12538a = abstractC6094a.mo12538a();
            if (C8104a.m16047b(abstractC6097dMo12538a)) {
                c8104a.f44023k = abstractC6097dMo12538a;
            }
            AbstractC6097d abstractC6097dMo12553n = abstractC6094a.mo12553n();
            if (C8104a.m16047b(abstractC6097dMo12553n)) {
                c8104a.f44024l = abstractC6097dMo12553n;
            }
            AbstractC6095b abstractC6095bMo12524A = abstractC6094a.mo12524A();
            if (C8104a.m16046a(abstractC6095bMo12524A)) {
                c8104a.f44025m = abstractC6095bMo12524A;
            }
            AbstractC6095b abstractC6095bMo12561z = abstractC6094a.mo12561z();
            if (C8104a.m16046a(abstractC6095bMo12561z)) {
                c8104a.f44026n = abstractC6095bMo12561z;
            }
            AbstractC6095b abstractC6095bMo12531M = abstractC6094a.mo12531M();
            if (C8104a.m16046a(abstractC6095bMo12531M)) {
                c8104a.f44027o = abstractC6095bMo12531M;
            }
            AbstractC6095b abstractC6095bMo12530J = abstractC6094a.mo12530J();
            if (C8104a.m16046a(abstractC6095bMo12530J)) {
                c8104a.f44028p = abstractC6095bMo12530J;
            }
            AbstractC6095b abstractC6095bMo12526D = abstractC6094a.mo12526D();
            if (C8104a.m16046a(abstractC6095bMo12526D)) {
                c8104a.f44029q = abstractC6095bMo12526D;
            }
            AbstractC6095b abstractC6095bMo12525C = abstractC6094a.mo12525C();
            if (C8104a.m16046a(abstractC6095bMo12525C)) {
                c8104a.f44030r = abstractC6095bMo12525C;
            }
            AbstractC6095b abstractC6095bMo12557t = abstractC6094a.mo12557t();
            if (C8104a.m16046a(abstractC6095bMo12557t)) {
                c8104a.f44031s = abstractC6095bMo12557t;
            }
            AbstractC6095b abstractC6095bMo12542c = abstractC6094a.mo12542c();
            if (C8104a.m16046a(abstractC6095bMo12542c)) {
                c8104a.f44032t = abstractC6095bMo12542c;
            }
            AbstractC6095b abstractC6095bMo12558w = abstractC6094a.mo12558w();
            if (C8104a.m16046a(abstractC6095bMo12558w)) {
                c8104a.f44033u = abstractC6095bMo12558w;
            }
            AbstractC6095b abstractC6095bMo12544d = abstractC6094a.mo12544d();
            if (C8104a.m16046a(abstractC6095bMo12544d)) {
                c8104a.f44034v = abstractC6095bMo12544d;
            }
            AbstractC6095b abstractC6095bMo12555r = abstractC6094a.mo12555r();
            if (C8104a.m16046a(abstractC6095bMo12555r)) {
                c8104a.f44035w = abstractC6095bMo12555r;
            }
            AbstractC6095b abstractC6095bMo12549h = abstractC6094a.mo12549h();
            if (C8104a.m16046a(abstractC6095bMo12549h)) {
                c8104a.f44036x = abstractC6095bMo12549h;
            }
            AbstractC6095b abstractC6095bMo12546e = abstractC6094a.mo12546e();
            if (C8104a.m16046a(abstractC6095bMo12546e)) {
                c8104a.f44037y = abstractC6095bMo12546e;
            }
            AbstractC6095b abstractC6095bMo12550j = abstractC6094a.mo12550j();
            if (C8104a.m16046a(abstractC6095bMo12550j)) {
                c8104a.f44038z = abstractC6095bMo12550j;
            }
            AbstractC6095b abstractC6095bMo12533R = abstractC6094a.mo12533R();
            if (C8104a.m16046a(abstractC6095bMo12533R)) {
                c8104a.f44004A = abstractC6095bMo12533R;
            }
            AbstractC6095b abstractC6095bMo12535U = abstractC6094a.mo12535U();
            if (C8104a.m16046a(abstractC6095bMo12535U)) {
                c8104a.f44005B = abstractC6095bMo12535U;
            }
            AbstractC6095b abstractC6095bMo12536X = abstractC6094a.mo12536X();
            if (C8104a.m16046a(abstractC6095bMo12536X)) {
                c8104a.f44006C = abstractC6095bMo12536X;
            }
            AbstractC6095b abstractC6095bMo12528G = abstractC6094a.mo12528G();
            if (C8104a.m16046a(abstractC6095bMo12528G)) {
                c8104a.f44007D = abstractC6095bMo12528G;
            }
            AbstractC6095b abstractC6095bMo12543c0 = abstractC6094a.mo12543c0();
            if (C8104a.m16046a(abstractC6095bMo12543c0)) {
                c8104a.f44008E = abstractC6095bMo12543c0;
            }
            AbstractC6095b abstractC6095bMo12547e0 = abstractC6094a.mo12547e0();
            if (C8104a.m16046a(abstractC6095bMo12547e0)) {
                c8104a.f44009F = abstractC6095bMo12547e0;
            }
            AbstractC6095b abstractC6095bMo12545d0 = abstractC6094a.mo12545d0();
            if (C8104a.m16046a(abstractC6095bMo12545d0)) {
                c8104a.f44010G = abstractC6095bMo12545d0;
            }
            AbstractC6095b abstractC6095bMo12540b = abstractC6094a.mo12540b();
            if (C8104a.m16046a(abstractC6095bMo12540b)) {
                c8104a.f44011H = abstractC6095bMo12540b;
            }
            AbstractC6095b abstractC6095bMo12552l = abstractC6094a.mo12552l();
            if (C8104a.m16046a(abstractC6095bMo12552l)) {
                c8104a.f44012I = abstractC6095bMo12552l;
            }
        }
        mo16042g0(c8104a);
        AbstractC6097d abstractC6097dMo12560y2 = c8104a.f44013a;
        if (abstractC6097dMo12560y2 == null) {
            abstractC6097dMo12560y2 = super.mo12560y();
        }
        this.f43988a = abstractC6097dMo12560y2;
        AbstractC6097d abstractC6097dMo12532Q2 = c8104a.f44014b;
        if (abstractC6097dMo12532Q2 == null) {
            abstractC6097dMo12532Q2 = super.mo12532Q();
        }
        this.f43990b = abstractC6097dMo12532Q2;
        AbstractC6097d abstractC6097dMo12527E2 = c8104a.f44015c;
        if (abstractC6097dMo12527E2 == null) {
            abstractC6097dMo12527E2 = super.mo12527E();
        }
        this.f43992c = abstractC6097dMo12527E2;
        AbstractC6097d abstractC6097dMo12559x2 = c8104a.f44016d;
        if (abstractC6097dMo12559x2 == null) {
            abstractC6097dMo12559x2 = super.mo12559x();
        }
        this.f43994d = abstractC6097dMo12559x2;
        AbstractC6097d abstractC6097dMo12556s2 = c8104a.f44017e;
        if (abstractC6097dMo12556s2 == null) {
            abstractC6097dMo12556s2 = super.mo12556s();
        }
        this.f43996e = abstractC6097dMo12556s2;
        AbstractC6097d abstractC6097dMo12551k2 = c8104a.f44018f;
        if (abstractC6097dMo12551k2 == null) {
            abstractC6097dMo12551k2 = super.mo12551k();
        }
        this.f43997f = abstractC6097dMo12551k2;
        AbstractC6097d abstractC6097dMo12534T2 = c8104a.f44019g;
        if (abstractC6097dMo12534T2 == null) {
            abstractC6097dMo12534T2 = super.mo12534T();
        }
        this.f43998g = abstractC6097dMo12534T2;
        AbstractC6097d abstractC6097dMo12537Y2 = c8104a.f44020h;
        if (abstractC6097dMo12537Y2 == null) {
            abstractC6097dMo12537Y2 = super.mo12537Y();
        }
        this.f43999h = abstractC6097dMo12537Y2;
        AbstractC6097d abstractC6097dMo12529I2 = c8104a.f44021i;
        if (abstractC6097dMo12529I2 == null) {
            abstractC6097dMo12529I2 = super.mo12529I();
        }
        this.f44000i = abstractC6097dMo12529I2;
        AbstractC6097d abstractC6097dMo12548f1 = c8104a.f44022j;
        if (abstractC6097dMo12548f1 == null) {
            abstractC6097dMo12548f1 = super.mo12548f0();
        }
        this.f44001j = abstractC6097dMo12548f1;
        AbstractC6097d abstractC6097dMo12538a2 = c8104a.f44023k;
        if (abstractC6097dMo12538a2 == null) {
            abstractC6097dMo12538a2 = super.mo12538a();
        }
        this.f44002k = abstractC6097dMo12538a2;
        AbstractC6097d abstractC6097dMo12553n2 = c8104a.f44024l;
        if (abstractC6097dMo12553n2 == null) {
            abstractC6097dMo12553n2 = super.mo12553n();
        }
        this.f44003l = abstractC6097dMo12553n2;
        AbstractC6095b abstractC6095bMo12524A2 = c8104a.f44025m;
        if (abstractC6095bMo12524A2 == null) {
            abstractC6095bMo12524A2 = super.mo12524A();
        }
        this.f43969H = abstractC6095bMo12524A2;
        AbstractC6095b abstractC6095bMo12561z2 = c8104a.f44026n;
        if (abstractC6095bMo12561z2 == null) {
            abstractC6095bMo12561z2 = super.mo12561z();
        }
        this.f43970I = abstractC6095bMo12561z2;
        AbstractC6095b abstractC6095bMo12531M2 = c8104a.f44027o;
        if (abstractC6095bMo12531M2 == null) {
            abstractC6095bMo12531M2 = super.mo12531M();
        }
        this.f43971J = abstractC6095bMo12531M2;
        AbstractC6095b abstractC6095bMo12530J2 = c8104a.f44028p;
        if (abstractC6095bMo12530J2 == null) {
            abstractC6095bMo12530J2 = super.mo12530J();
        }
        this.f43972K = abstractC6095bMo12530J2;
        AbstractC6095b abstractC6095bMo12526D2 = c8104a.f44029q;
        if (abstractC6095bMo12526D2 == null) {
            abstractC6095bMo12526D2 = super.mo12526D();
        }
        this.f43973L = abstractC6095bMo12526D2;
        AbstractC6095b abstractC6095bMo12525C2 = c8104a.f44030r;
        if (abstractC6095bMo12525C2 == null) {
            abstractC6095bMo12525C2 = super.mo12525C();
        }
        this.f43974M = abstractC6095bMo12525C2;
        AbstractC6095b abstractC6095bMo12557t2 = c8104a.f44031s;
        if (abstractC6095bMo12557t2 == null) {
            abstractC6095bMo12557t2 = super.mo12557t();
        }
        this.f43975N = abstractC6095bMo12557t2;
        AbstractC6095b abstractC6095bMo12542c2 = c8104a.f44032t;
        if (abstractC6095bMo12542c2 == null) {
            abstractC6095bMo12542c2 = super.mo12542c();
        }
        this.f43976O = abstractC6095bMo12542c2;
        AbstractC6095b abstractC6095bMo12558w2 = c8104a.f44033u;
        if (abstractC6095bMo12558w2 == null) {
            abstractC6095bMo12558w2 = super.mo12558w();
        }
        this.f43977P = abstractC6095bMo12558w2;
        AbstractC6095b abstractC6095bMo12544d2 = c8104a.f44034v;
        if (abstractC6095bMo12544d2 == null) {
            abstractC6095bMo12544d2 = super.mo12544d();
        }
        this.f43978Q = abstractC6095bMo12544d2;
        AbstractC6095b abstractC6095bMo12555r2 = c8104a.f44035w;
        if (abstractC6095bMo12555r2 == null) {
            abstractC6095bMo12555r2 = super.mo12555r();
        }
        this.f43979R = abstractC6095bMo12555r2;
        AbstractC6095b abstractC6095bMo12549h2 = c8104a.f44036x;
        if (abstractC6095bMo12549h2 == null) {
            abstractC6095bMo12549h2 = super.mo12549h();
        }
        this.f43980S = abstractC6095bMo12549h2;
        AbstractC6095b abstractC6095bMo12546e2 = c8104a.f44037y;
        if (abstractC6095bMo12546e2 == null) {
            abstractC6095bMo12546e2 = super.mo12546e();
        }
        this.f43981T = abstractC6095bMo12546e2;
        AbstractC6095b abstractC6095bMo12550j2 = c8104a.f44038z;
        if (abstractC6095bMo12550j2 == null) {
            abstractC6095bMo12550j2 = super.mo12550j();
        }
        this.f43982U = abstractC6095bMo12550j2;
        AbstractC6095b abstractC6095bMo12533R2 = c8104a.f44004A;
        if (abstractC6095bMo12533R2 == null) {
            abstractC6095bMo12533R2 = super.mo12533R();
        }
        this.f43983V = abstractC6095bMo12533R2;
        AbstractC6095b abstractC6095bMo12535U2 = c8104a.f44005B;
        if (abstractC6095bMo12535U2 == null) {
            abstractC6095bMo12535U2 = super.mo12535U();
        }
        this.f43984W = abstractC6095bMo12535U2;
        AbstractC6095b abstractC6095bMo12536X2 = c8104a.f44006C;
        if (abstractC6095bMo12536X2 == null) {
            abstractC6095bMo12536X2 = super.mo12536X();
        }
        this.f43985X = abstractC6095bMo12536X2;
        AbstractC6095b abstractC6095bMo12528G2 = c8104a.f44007D;
        if (abstractC6095bMo12528G2 == null) {
            abstractC6095bMo12528G2 = super.mo12528G();
        }
        this.f43986Y = abstractC6095bMo12528G2;
        AbstractC6095b abstractC6095bMo12543c1 = c8104a.f44008E;
        if (abstractC6095bMo12543c1 == null) {
            abstractC6095bMo12543c1 = super.mo12543c0();
        }
        this.f43987Z = abstractC6095bMo12543c1;
        AbstractC6095b abstractC6095bMo12547e1 = c8104a.f44009F;
        if (abstractC6095bMo12547e1 == null) {
            abstractC6095bMo12547e1 = super.mo12547e0();
        }
        this.f43989a0 = abstractC6095bMo12547e1;
        AbstractC6095b abstractC6095bMo12545d1 = c8104a.f44010G;
        if (abstractC6095bMo12545d1 == null) {
            abstractC6095bMo12545d1 = super.mo12545d0();
        }
        this.f43991b0 = abstractC6095bMo12545d1;
        AbstractC6095b abstractC6095bMo12540b2 = c8104a.f44011H;
        if (abstractC6095bMo12540b2 == null) {
            abstractC6095bMo12540b2 = super.mo12540b();
        }
        this.f43993c0 = abstractC6095bMo12540b2;
        AbstractC6095b abstractC6095bMo12552l2 = c8104a.f44012I;
        if (abstractC6095bMo12552l2 == null) {
            abstractC6095bMo12552l2 = super.mo12552l();
        }
        this.f43995d0 = abstractC6095bMo12552l2;
        AbstractC6094a abstractC6094a2 = this.iBase;
        if (abstractC6094a2 == null) {
            return;
        }
        if (this.f43975N == abstractC6094a2.mo12557t() && this.f43973L == this.iBase.mo12526D() && this.f43971J == this.iBase.mo12531M()) {
            AbstractC6095b abstractC6095b = this.f43969H;
            this.iBase.mo12524A();
        }
        this.iBase.mo12561z();
        if (this.f43987Z == this.iBase.mo12543c0() && this.f43986Y == this.iBase.mo12528G()) {
            this.iBase.mo12546e();
        }
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: k */
    public final AbstractC6097d mo12551k() {
        return this.f43997f;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: l */
    public final AbstractC6095b mo12552l() {
        return this.f43995d0;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: n */
    public final AbstractC6097d mo12553n() {
        return this.f44003l;
    }

    @Override // p163hp.AbstractC6094a
    /* JADX INFO: renamed from: q */
    public DateTimeZone mo12554q() {
        AbstractC6094a abstractC6094a = this.iBase;
        if (abstractC6094a != null) {
            return abstractC6094a.mo12554q();
        }
        return null;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: r */
    public final AbstractC6095b mo12555r() {
        return this.f43979R;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: s */
    public final AbstractC6097d mo12556s() {
        return this.f43996e;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: t */
    public final AbstractC6095b mo12557t() {
        return this.f43975N;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: w */
    public final AbstractC6095b mo12558w() {
        return this.f43977P;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: x */
    public final AbstractC6097d mo12559x() {
        return this.f43994d;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: y */
    public final AbstractC6097d mo12560y() {
        return this.f43988a;
    }

    @Override // org.joda.time.chrono.BaseChronology, p163hp.AbstractC6094a
    /* JADX INFO: renamed from: z */
    public final AbstractC6095b mo12561z() {
        return this.f43970I;
    }
}
