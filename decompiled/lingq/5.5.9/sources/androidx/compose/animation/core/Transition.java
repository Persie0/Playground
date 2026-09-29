package androidx.compose.animation.core;

import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import dm.C5207g;
import dm.C5212l;
import java.util.ListIterator;
import p081e0.C5332q0;
import p081e0.C5333r;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5336s0;
import p267n0.C7684o;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import p374s.C8908g0;
import p374s.C8930r0;
import p374s.C8934v;
import p374s.C8936x;
import p374s.C8937y;
import p374s.InterfaceC8906f0;
import p374s.InterfaceC8929r;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class Transition<S> {

    /* JADX INFO: renamed from: a */
    public final C8934v<S> f1573a;

    /* JADX INFO: renamed from: b */
    public final String f1574b;

    /* JADX INFO: renamed from: c */
    public final ParcelableSnapshotMutableState f1575c;

    /* JADX INFO: renamed from: d */
    public final ParcelableSnapshotMutableState f1576d;

    /* JADX INFO: renamed from: e */
    public final ParcelableSnapshotMutableState f1577e;

    /* JADX INFO: renamed from: f */
    public final ParcelableSnapshotMutableState f1578f;

    /* JADX INFO: renamed from: g */
    public final ParcelableSnapshotMutableState f1579g;

    /* JADX INFO: renamed from: h */
    public final SnapshotStateList<Transition<S>.C0368d<?, ?>> f1580h;

    /* JADX INFO: renamed from: i */
    public final SnapshotStateList<Transition<?>> f1581i;

    /* JADX INFO: renamed from: j */
    public final ParcelableSnapshotMutableState f1582j;

    /* JADX INFO: renamed from: k */
    public long f1583k;

    /* JADX INFO: renamed from: l */
    public final DerivedSnapshotState f1584l;

    /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a */
    public final class C0364a<T, V extends AbstractC8911i> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8906f0<T, V> f1585a;

        /* JADX INFO: renamed from: b */
        public final String f1586b;

        /* JADX INFO: renamed from: c */
        public final ParcelableSnapshotMutableState f1587c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Transition<S> f1588d;

        /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$a$a */
        public final class a<T, V extends AbstractC8911i> implements InterfaceC5301c1<T> {

            /* JADX INFO: renamed from: a */
            public final Transition<S>.C0368d<T, V> f1589a;

            /* JADX INFO: renamed from: b */
            public InterfaceC2052l<? super InterfaceC0366b<S>, ? extends InterfaceC8929r<T>> f1590b;

            /* JADX INFO: renamed from: c */
            public InterfaceC2052l<? super S, ? extends T> f1591c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Transition<S>.C0364a<T, V> f1592d;

            public a(C0364a c0364a, Transition<S>.C0368d<T, V> c0368d, InterfaceC2052l<? super InterfaceC0366b<S>, ? extends InterfaceC8929r<T>> interfaceC2052l, InterfaceC2052l<? super S, ? extends T> interfaceC2052l2) {
                C5207g.m11111f(interfaceC2052l, "transitionSpec");
                this.f1592d = c0364a;
                this.f1589a = c0368d;
                this.f1590b = interfaceC2052l;
                this.f1591c = interfaceC2052l2;
            }

            /* JADX INFO: renamed from: e */
            public final void m1371e(InterfaceC0366b<S> interfaceC0366b) {
                C5207g.m11111f(interfaceC0366b, "segment");
                T tMo528n = this.f1591c.mo528n(interfaceC0366b.mo1374c());
                boolean zM1365e = this.f1592d.f1588d.m1365e();
                Transition<S>.C0368d<T, V> c0368d = this.f1589a;
                if (zM1365e) {
                    c0368d.m1378h(this.f1591c.mo528n(interfaceC0366b.mo1372a()), tMo528n, this.f1590b.mo528n(interfaceC0366b));
                } else {
                    c0368d.m1379i(tMo528n, this.f1590b.mo528n(interfaceC0366b));
                }
            }

            @Override // p081e0.InterfaceC5301c1
            public final T getValue() {
                m1371e(this.f1592d.f1588d.m1363c());
                return this.f1589a.getValue();
            }
        }

        public C0364a(Transition transition, C8908g0 c8908g0, String str) {
            C5207g.m11111f(c8908g0, "typeConverter");
            C5207g.m11111f(str, "label");
            this.f1588d = transition;
            this.f1585a = c8908g0;
            this.f1586b = str;
            this.f1587c = C8573r0.m16684L0(null);
        }

        /* JADX INFO: renamed from: a */
        public final a m1370a(InterfaceC2052l interfaceC2052l, InterfaceC2052l interfaceC2052l2) {
            C5207g.m11111f(interfaceC2052l, "transitionSpec");
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1587c;
            a aVar = (a) parcelableSnapshotMutableState.getValue();
            Transition<S> transition = this.f1588d;
            if (aVar == null) {
                aVar = new a(this, new C0368d(transition, interfaceC2052l2.mo528n(transition.m1362b()), C5212l.m11135G(this.f1585a, interfaceC2052l2.mo528n(transition.m1362b())), this.f1585a, this.f1586b), interfaceC2052l, interfaceC2052l2);
                parcelableSnapshotMutableState.setValue(aVar);
                Transition<S>.C0368d<T, V> c0368d = aVar.f1589a;
                C5207g.m11111f(c0368d, "animation");
                transition.f1580h.add(c0368d);
            }
            aVar.f1591c = interfaceC2052l2;
            aVar.f1590b = interfaceC2052l;
            aVar.m1371e(transition.m1363c());
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$b */
    public interface InterfaceC0366b<S> {
        /* JADX INFO: renamed from: a */
        S mo1372a();

        /* JADX INFO: renamed from: b */
        default boolean m1373b(S s10, S s11) {
            return C5207g.m11106a(s10, mo1372a()) && C5207g.m11106a(s11, mo1374c());
        }

        /* JADX INFO: renamed from: c */
        S mo1374c();
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$c */
    public static final class C0367c<S> implements InterfaceC0366b<S> {

        /* JADX INFO: renamed from: a */
        public final S f1601a;

        /* JADX INFO: renamed from: b */
        public final S f1602b;

        public C0367c(S s10, S s11) {
            this.f1601a = s10;
            this.f1602b = s11;
        }

        @Override // androidx.compose.animation.core.Transition.InterfaceC0366b
        /* JADX INFO: renamed from: a */
        public final S mo1372a() {
            return this.f1601a;
        }

        @Override // androidx.compose.animation.core.Transition.InterfaceC0366b
        /* JADX INFO: renamed from: c */
        public final S mo1374c() {
            return this.f1602b;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof InterfaceC0366b) {
                InterfaceC0366b interfaceC0366b = (InterfaceC0366b) obj;
                if (C5207g.m11106a(this.f1601a, interfaceC0366b.mo1372a())) {
                    if (C5207g.m11106a(this.f1602b, interfaceC0366b.mo1374c())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            S s10 = this.f1601a;
            int iHashCode = (s10 != null ? s10.hashCode() : 0) * 31;
            S s11 = this.f1602b;
            return iHashCode + (s11 != null ? s11.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.animation.core.Transition$d */
    public final class C0368d<T, V extends AbstractC8911i> implements InterfaceC5301c1<T> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC8906f0<T, V> f1603a;

        /* JADX INFO: renamed from: b */
        public final ParcelableSnapshotMutableState f1604b;

        /* JADX INFO: renamed from: c */
        public final ParcelableSnapshotMutableState f1605c;

        /* JADX INFO: renamed from: d */
        public final ParcelableSnapshotMutableState f1606d;

        /* JADX INFO: renamed from: e */
        public final ParcelableSnapshotMutableState f1607e;

        /* JADX INFO: renamed from: f */
        public final ParcelableSnapshotMutableState f1608f;

        /* JADX INFO: renamed from: g */
        public final ParcelableSnapshotMutableState f1609g;

        /* JADX INFO: renamed from: h */
        public final ParcelableSnapshotMutableState f1610h;

        /* JADX INFO: renamed from: i */
        public V f1611i;

        /* JADX INFO: renamed from: j */
        public final C8936x f1612j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Transition<S> f1613k;

        public C0368d(Transition transition, T t10, V v10, InterfaceC8906f0<T, V> interfaceC8906f0, String str) {
            C5207g.m11111f(interfaceC8906f0, "typeConverter");
            C5207g.m11111f(str, "label");
            this.f1613k = transition;
            this.f1603a = interfaceC8906f0;
            ParcelableSnapshotMutableState parcelableSnapshotMutableStateM16684L0 = C8573r0.m16684L0(t10);
            this.f1604b = parcelableSnapshotMutableStateM16684L0;
            T tMo528n = null;
            this.f1605c = C8573r0.m16684L0(C8573r0.m16724f1(0.0f, null, 7));
            this.f1606d = C8573r0.m16684L0(new C8937y(m1377f(), interfaceC8906f0, t10, parcelableSnapshotMutableStateM16684L0.getValue(), v10));
            this.f1607e = C8573r0.m16684L0(Boolean.TRUE);
            this.f1608f = C8573r0.m16684L0(0L);
            this.f1609g = C8573r0.m16684L0(Boolean.FALSE);
            this.f1610h = C8573r0.m16684L0(t10);
            this.f1611i = v10;
            Float f3 = C8930r0.f46854a.get(interfaceC8906f0);
            if (f3 != null) {
                float fFloatValue = f3.floatValue();
                V vMo528n = interfaceC8906f0.mo17140a().mo528n(t10);
                int iMo17136b = vMo528n.mo17136b();
                for (int i10 = 0; i10 < iMo17136b; i10++) {
                    vMo528n.mo17139e(i10, fFloatValue);
                }
                tMo528n = this.f1603a.mo17141b().mo528n(vMo528n);
            }
            this.f1612j = C8573r0.m16724f1(0.0f, tMo528n, 3);
        }

        /* JADX INFO: renamed from: g */
        public static void m1375g(C0368d c0368d, Object obj, boolean z10, int i10) {
            if ((i10 & 1) != 0) {
                obj = c0368d.getValue();
            }
            Object obj2 = obj;
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            InterfaceC8929r<T> interfaceC8929rM1377f = (!z10 || (c0368d.m1377f() instanceof C8936x)) ? c0368d.m1377f() : c0368d.f1612j;
            c0368d.f1606d.setValue(new C8937y(interfaceC8929rM1377f, c0368d.f1603a, obj2, c0368d.f1604b.getValue(), c0368d.f1611i));
            Transition<S> transition = c0368d.f1613k;
            transition.f1579g.setValue(Boolean.TRUE);
            if (transition.m1365e()) {
                ListIterator<Transition<S>.C0368d<?, ?>> listIterator = transition.f1580h.listIterator();
                long jMax = 0;
                while (true) {
                    C7684o c7684o = (C7684o) listIterator;
                    if (!c7684o.hasNext()) {
                        break;
                    }
                    C0368d c0368d2 = (C0368d) c7684o.next();
                    jMax = Math.max(jMax, c0368d2.m1376e().f46878h);
                    long j10 = transition.f1583k;
                    c0368d2.f1610h.setValue(c0368d2.m1376e().mo17131f(j10));
                    c0368d2.f1611i = (V) c0368d2.m1376e().mo17129d(j10);
                }
                transition.f1579g.setValue(Boolean.FALSE);
            }
        }

        /* JADX INFO: renamed from: e */
        public final C8937y<T, V> m1376e() {
            return (C8937y) this.f1606d.getValue();
        }

        /* JADX INFO: renamed from: f */
        public final InterfaceC8929r<T> m1377f() {
            return (InterfaceC8929r) this.f1605c.getValue();
        }

        @Override // p081e0.InterfaceC5301c1
        public final T getValue() {
            return this.f1610h.getValue();
        }

        /* JADX INFO: renamed from: h */
        public final void m1378h(T t10, T t11, InterfaceC8929r<T> interfaceC8929r) {
            C5207g.m11111f(interfaceC8929r, "animationSpec");
            this.f1604b.setValue(t11);
            this.f1605c.setValue(interfaceC8929r);
            if (C5207g.m11106a(m1376e().f46873c, t10) && C5207g.m11106a(m1376e().f46874d, t11)) {
                return;
            }
            m1375g(this, t10, false, 2);
        }

        /* JADX INFO: renamed from: i */
        public final void m1379i(T t10, InterfaceC8929r<T> interfaceC8929r) {
            C5207g.m11111f(interfaceC8929r, "animationSpec");
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1604b;
            boolean zM11106a = C5207g.m11106a(parcelableSnapshotMutableState.getValue(), t10);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f1609g;
            if (zM11106a && !((Boolean) parcelableSnapshotMutableState2.getValue()).booleanValue()) {
                return;
            }
            parcelableSnapshotMutableState.setValue(t10);
            this.f1605c.setValue(interfaceC8929r);
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = this.f1607e;
            m1375g(this, null, !((Boolean) parcelableSnapshotMutableState3.getValue()).booleanValue(), 1);
            Boolean bool = Boolean.FALSE;
            parcelableSnapshotMutableState3.setValue(bool);
            this.f1608f.setValue(Long.valueOf(((Number) this.f1613k.f1577e.getValue()).longValue()));
            parcelableSnapshotMutableState2.setValue(bool);
        }
    }

    public Transition() {
        throw null;
    }

    public Transition(C8934v<S> c8934v, String str) {
        C5207g.m11111f(c8934v, "transitionState");
        this.f1573a = c8934v;
        this.f1574b = str;
        this.f1575c = C8573r0.m16684L0(m1362b());
        this.f1576d = C8573r0.m16684L0(new C0367c(m1362b(), m1362b()));
        this.f1577e = C8573r0.m16684L0(0L);
        this.f1578f = C8573r0.m16684L0(Long.MIN_VALUE);
        this.f1579g = C8573r0.m16684L0(Boolean.TRUE);
        this.f1580h = new SnapshotStateList<>();
        this.f1581i = new SnapshotStateList<>();
        this.f1582j = C8573r0.m16684L0(Boolean.FALSE);
        this.f1584l = C8573r0.m16713a0(new InterfaceC2041a<Long>(this) { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Transition<S> f1614b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.f1614b = this;
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Long mo807E() {
                Transition<S> transition = this.f1614b;
                ListIterator<Transition<S>.C0368d<?, ?>> listIterator = transition.f1580h.listIterator();
                long jMax = 0;
                while (true) {
                    C7684o c7684o = (C7684o) listIterator;
                    if (!c7684o.hasNext()) {
                        break;
                    }
                    jMax = Math.max(jMax, ((Transition.C0368d) c7684o.next()).m1376e().f46878h);
                }
                ListIterator<Transition<?>> listIterator2 = transition.f1581i.listIterator();
                while (true) {
                    C7684o c7684o2 = (C7684o) listIterator2;
                    if (!c7684o2.hasNext()) {
                        return Long.valueOf(jMax);
                    }
                    jMax = Math.max(jMax, ((Number) ((Transition) c7684o2.next()).f1584l.getValue()).longValue());
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0093  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m1361a(final S s10, InterfaceC0476a interfaceC0476a, final int i10) {
        int i11;
        boolean zMo1665y;
        Object objM1619a0;
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.mo1665y(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerImplMo1636j.mo1665y(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            if (!m1365e()) {
                m1369i(s10, composerImplMo1636j, (i11 & 112) | (i11 & 14));
                if (C5207g.m11106a(s10, m1362b())) {
                    if ((((Number) this.f1578f.getValue()).longValue() != Long.MIN_VALUE) || ((Boolean) this.f1579g.getValue()).booleanValue()) {
                        composerImplMo1636j.mo1622c(1157296644);
                        zMo1665y = composerImplMo1636j.mo1665y(this);
                        objM1619a0 = composerImplMo1636j.m1619a0();
                        if (zMo1665y) {
                            objM1619a0 = new Transition$animateTo$1$1(this, null);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        } else {
                            objM1619a0 = new Transition$animateTo$1$1(this, null);
                            composerImplMo1636j.m1597F0(objM1619a0);
                        }
                        composerImplMo1636j.m1609Q(false);
                        C5333r.m11460b(this, (InterfaceC2056p) objM1619a0, composerImplMo1636j);
                    }
                } else {
                    composerImplMo1636j.mo1622c(1157296644);
                    zMo1665y = composerImplMo1636j.mo1665y(this);
                    objM1619a0 = composerImplMo1636j.m1619a0();
                    if (zMo1665y || objM1619a0 == InterfaceC0476a.a.f3122a) {
                        objM1619a0 = new Transition$animateTo$1$1(this, null);
                        composerImplMo1636j.m1597F0(objM1619a0);
                    }
                    composerImplMo1636j.m1609Q(false);
                    C5333r.m11460b(this, (InterfaceC2056p) objM1619a0, composerImplMo1636j);
                }
            }
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>(this) { // from class: androidx.compose.animation.core.Transition$animateTo$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Transition<S> f1598b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f1598b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int i12 = i10 | 1;
                this.f1598b.m1361a(s10, interfaceC0476a2, i12);
                return C9072e.f47360a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public final S m1362b() {
        return (S) this.f1573a.f46858a.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0366b<S> m1363c() {
        return (InterfaceC0366b) this.f1576d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final S m1364d() {
        return (S) this.f1575c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final boolean m1365e() {
        return ((Boolean) this.f1582j.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v32, types: [V extends s.i, s.i] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m1366f(float f3, long j10) {
        long j11;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = this.f1578f;
        if (((Number) parcelableSnapshotMutableState.getValue()).longValue() == Long.MIN_VALUE) {
            parcelableSnapshotMutableState.setValue(Long.valueOf(j10));
            this.f1573a.f46860c.setValue(Boolean.TRUE);
        }
        this.f1579g.setValue(Boolean.FALSE);
        Long lValueOf = Long.valueOf(j10 - ((Number) parcelableSnapshotMutableState.getValue()).longValue());
        ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = this.f1577e;
        parcelableSnapshotMutableState2.setValue(lValueOf);
        ListIterator<Transition<S>.C0368d<?, ?>> listIterator = this.f1580h.listIterator();
        boolean z10 = true;
        while (true) {
            while (true) {
                C7684o c7684o = (C7684o) listIterator;
                if (!c7684o.hasNext()) {
                    ListIterator<Transition<?>> listIterator2 = this.f1581i.listIterator();
                    while (true) {
                        C7684o c7684o2 = (C7684o) listIterator2;
                        if (!c7684o2.hasNext()) {
                            break;
                        }
                        Transition transition = (Transition) c7684o2.next();
                        if (!C5207g.m11106a(transition.m1364d(), transition.m1362b())) {
                            transition.m1366f(f3, ((Number) parcelableSnapshotMutableState2.getValue()).longValue());
                        }
                        if (!C5207g.m11106a(transition.m1364d(), transition.m1362b())) {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        m1367g();
                    }
                    return;
                }
                C0368d c0368d = (C0368d) c7684o.next();
                boolean zBooleanValue = ((Boolean) c0368d.f1607e.getValue()).booleanValue();
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = c0368d.f1607e;
                if (!zBooleanValue) {
                    long jLongValue = ((Number) parcelableSnapshotMutableState2.getValue()).longValue();
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState4 = c0368d.f1608f;
                    if (f3 > 0.0f) {
                        float fLongValue = (jLongValue - ((Number) parcelableSnapshotMutableState4.getValue()).longValue()) / f3;
                        if (!(!Float.isNaN(fLongValue))) {
                            throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f3 + ",playTimeNanos: " + jLongValue + ", offsetTimeNanos: " + ((Number) parcelableSnapshotMutableState4.getValue()).longValue()).toString());
                        }
                        j11 = (long) fLongValue;
                    } else {
                        j11 = c0368d.m1376e().f46878h;
                    }
                    c0368d.f1610h.setValue(c0368d.m1376e().mo17131f(j11));
                    c0368d.f1611i = c0368d.m1376e().mo17129d(j11);
                    if (c0368d.m1376e().m17130e(j11)) {
                        parcelableSnapshotMutableState3.setValue(Boolean.TRUE);
                        parcelableSnapshotMutableState4.setValue(0L);
                    }
                }
                if (!((Boolean) parcelableSnapshotMutableState3.getValue()).booleanValue()) {
                    z10 = false;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1367g() {
        this.f1578f.setValue(Long.MIN_VALUE);
        S sM1364d = m1364d();
        C8934v<S> c8934v = this.f1573a;
        c8934v.f46858a.setValue(sM1364d);
        this.f1577e.setValue(0L);
        c8934v.f46860c.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Type inference failed for: r5v22, types: [V extends s.i, s.i] */
    /* JADX INFO: renamed from: h */
    public final void m1368h(long j10, Object obj, Object obj2) {
        this.f1578f.setValue(Long.MIN_VALUE);
        C8934v<S> c8934v = this.f1573a;
        c8934v.f46860c.setValue(Boolean.FALSE);
        if (!m1365e() || !C5207g.m11106a(m1362b(), obj) || !C5207g.m11106a(m1364d(), obj2)) {
            c8934v.f46858a.setValue(obj);
            this.f1575c.setValue(obj2);
            this.f1582j.setValue(Boolean.TRUE);
            this.f1576d.setValue(new C0367c(obj, obj2));
        }
        ListIterator<Transition<?>> listIterator = this.f1581i.listIterator();
        while (true) {
            C7684o c7684o = (C7684o) listIterator;
            if (!c7684o.hasNext()) {
                break;
            }
            Transition transition = (Transition) c7684o.next();
            C5207g.m11109d(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.m1365e()) {
                transition.m1368h(j10, transition.m1362b(), transition.m1364d());
            }
        }
        ListIterator<Transition<S>.C0368d<?, ?>> listIterator2 = this.f1580h.listIterator();
        while (true) {
            C7684o c7684o2 = (C7684o) listIterator2;
            if (!c7684o2.hasNext()) {
                this.f1583k = j10;
                return;
            }
            C0368d c0368d = (C0368d) c7684o2.next();
            c0368d.f1610h.setValue(c0368d.m1376e().mo17131f(j10));
            c0368d.f1611i = c0368d.m1376e().mo17129d(j10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m1369i(final S s10, InterfaceC0476a interfaceC0476a, final int i10) {
        int i11;
        ComposerImpl composerImplMo1636j = interfaceC0476a.mo1636j(-583974681);
        if ((i10 & 14) == 0) {
            i11 = (composerImplMo1636j.mo1665y(s10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerImplMo1636j.mo1665y(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerImplMo1636j.mo1642m()) {
            composerImplMo1636j.mo1650q();
        } else {
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
            if (!m1365e() && !C5207g.m11106a(m1364d(), s10)) {
                this.f1576d.setValue(new C0367c(m1364d(), s10));
                this.f1573a.f46858a.setValue(m1364d());
                this.f1575c.setValue(s10);
                if (!(((Number) this.f1578f.getValue()).longValue() != Long.MIN_VALUE)) {
                    this.f1579g.setValue(Boolean.TRUE);
                }
                ListIterator<Transition<S>.C0368d<?, ?>> listIterator = this.f1580h.listIterator();
                while (true) {
                    C7684o c7684o = (C7684o) listIterator;
                    if (!c7684o.hasNext()) {
                        break;
                    } else {
                        ((C0368d) c7684o.next()).f1609g.setValue(Boolean.TRUE);
                    }
                }
            }
            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
        }
        C5332q0 c5332q0M1612T = composerImplMo1636j.m1612T();
        if (c5332q0M1612T == null) {
            return;
        }
        c5332q0M1612T.f33605d = new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>(this) { // from class: androidx.compose.animation.core.Transition$updateTarget$2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Transition<S> f1615b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
                this.f1615b = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a2, Integer num) {
                num.intValue();
                int i12 = i10 | 1;
                this.f1615b.m1369i(s10, interfaceC0476a2, i12);
                return C9072e.f47360a;
            }
        };
    }
}
