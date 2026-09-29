package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.Pair;
import p081e0.C5295a1;
import p081e0.C5298b1;
import p081e0.InterfaceC5323m;
import p081e0.InterfaceC5350z0;
import p105f0.C5454b;
import p105f0.C5458f;
import p267n0.AbstractC7691v;
import p267n0.InterfaceC7690u;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class DerivedSnapshotState<T> implements InterfaceC7690u, InterfaceC5323m<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2041a<T> f3027a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5350z0<T> f3028b = null;

    /* JADX INFO: renamed from: c */
    public C0468a<T> f3029c = new C0468a<>();

    /* JADX INFO: renamed from: androidx.compose.runtime.DerivedSnapshotState$a */
    public static final class C0468a<T> extends AbstractC7691v {

        /* JADX INFO: renamed from: f */
        public static final Object f3030f = new Object();

        /* JADX INFO: renamed from: c */
        public C5454b f3031c;

        /* JADX INFO: renamed from: d */
        public Object f3032d = f3030f;

        /* JADX INFO: renamed from: e */
        public int f3033e;

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: a */
        public final void mo1700a(AbstractC7691v abstractC7691v) {
            C5207g.m11111f(abstractC7691v, "value");
            C0468a c0468a = (C0468a) abstractC7691v;
            this.f3031c = c0468a.f3031c;
            this.f3032d = c0468a.f3032d;
            this.f3033e = c0468a.f3033e;
        }

        @Override // p267n0.AbstractC7691v
        /* JADX INFO: renamed from: b */
        public final AbstractC7691v mo1701b() {
            return new C0468a();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final int m1702c(InterfaceC5323m<?> interfaceC5323m, AbstractC0497b abstractC0497b) {
            C5454b c5454b;
            AbstractC7691v abstractC7691vM1890i;
            C5207g.m11111f(interfaceC5323m, "derivedState");
            synchronized (SnapshotKt.f3262c) {
                c5454b = this.f3031c;
            }
            int iIdentityHashCode = 7;
            if (c5454b != null) {
                C5458f c5458f = (C5458f) C5295a1.f33568b.m11437d();
                int i10 = 0;
                if (c5458f == null) {
                    c5458f = new C5458f(new Pair[0]);
                }
                int i11 = c5458f.f34019c;
                if (i11 > 0) {
                    T[] tArr = c5458f.f34017a;
                    int i12 = 0;
                    do {
                        ((InterfaceC2052l) tArr[i12].f38012a).mo528n(interfaceC5323m);
                        i12++;
                    } while (i12 < i11);
                }
                try {
                    int i13 = c5454b.f34005a;
                    for (int i14 = 0; i14 < i13; i14++) {
                        Object obj = c5454b.f34006b[i14];
                        C5207g.m11109d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                        InterfaceC7690u interfaceC7690u = (InterfaceC7690u) obj;
                        if (((Number) ((Object[]) c5454b.f34007c)[i14]).intValue() == 1) {
                            if (interfaceC7690u instanceof DerivedSnapshotState) {
                                DerivedSnapshotState derivedSnapshotState = (DerivedSnapshotState) interfaceC7690u;
                                abstractC7691vM1890i = derivedSnapshotState.m1697e((C0468a) SnapshotKt.m1890i(derivedSnapshotState.f3029c, abstractC0497b), abstractC0497b, false, derivedSnapshotState.f3027a);
                            } else {
                                abstractC7691vM1890i = SnapshotKt.m1890i(interfaceC7690u.mo1698l(), abstractC0497b);
                            }
                            iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(abstractC7691vM1890i)) * 31) + abstractC7691vM1890i.f42188a;
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                    int i15 = c5458f.f34019c;
                    if (i15 > 0) {
                        T[] tArr2 = c5458f.f34017a;
                        do {
                            ((InterfaceC2052l) tArr2[i10].f38013b).mo528n(interfaceC5323m);
                            i10++;
                        } while (i10 < i15);
                    }
                } catch (Throwable th2) {
                    int i16 = c5458f.f34019c;
                    if (i16 > 0) {
                        T[] tArr3 = c5458f.f34017a;
                        do {
                            ((InterfaceC2052l) tArr3[i10].f38013b).mo528n(interfaceC5323m);
                            i10++;
                        } while (i10 < i16);
                    }
                    throw th2;
                }
            }
            return iIdentityHashCode;
        }
    }

    public DerivedSnapshotState(InterfaceC2041a interfaceC2041a) {
        this.f3027a = interfaceC2041a;
    }

    @Override // p081e0.InterfaceC5323m
    /* JADX INFO: renamed from: a */
    public final InterfaceC5350z0<T> mo1694a() {
        return this.f3028b;
    }

    @Override // p081e0.InterfaceC5323m
    /* JADX INFO: renamed from: c */
    public final T mo1695c() {
        return (T) m1697e((C0468a) SnapshotKt.m1889h(this.f3029c), SnapshotKt.m1891j(), false, this.f3027a).f3032d;
    }

    @Override // p081e0.InterfaceC5323m
    /* JADX INFO: renamed from: d */
    public final Object[] mo1696d() {
        Object[] objArr;
        C5454b c5454b = m1697e((C0468a) SnapshotKt.m1889h(this.f3029c), SnapshotKt.m1891j(), false, this.f3027a).f3031c;
        if (c5454b == null || (objArr = c5454b.f34006b) == null) {
            objArr = new Object[0];
        }
        return objArr;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0197 A[Catch: all -> 0x01bd, TRY_LEAVE, TryCatch #2 {all -> 0x01bd, blocks: (B:70:0x0170, B:72:0x017d, B:74:0x0181, B:78:0x018b, B:79:0x0197), top: B:103:0x0170 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public final C0468a<T> m1697e(C0468a<T> c0468a, AbstractC0497b abstractC0497b, boolean z10, InterfaceC2041a<? extends T> interfaceC2041a) {
        int i10 = 0;
        if (c0468a.f3032d != C0468a.f3030f && c0468a.f3033e == c0468a.m1702c(this, abstractC0497b)) {
            if (z10) {
                C5458f c5458f = (C5458f) C5295a1.f33568b.m11437d();
                if (c5458f == null) {
                    c5458f = new C5458f(new Pair[0]);
                }
                int i11 = c5458f.f34019c;
                if (i11 > 0) {
                    T[] tArr = c5458f.f34017a;
                    int i12 = 0;
                    do {
                        ((InterfaceC2052l) ((Pair) tArr[i12]).f38012a).mo528n(this);
                        i12++;
                    } while (i12 < i11);
                }
                try {
                    C5454b c5454b = c0468a.f3031c;
                    Integer num = (Integer) C5295a1.f33567a.m11437d();
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (c5454b != null) {
                        int i13 = c5454b.f34005a;
                        for (int i14 = 0; i14 < i13; i14++) {
                            Object obj = c5454b.f34006b[i14];
                            C5207g.m11109d(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                            InterfaceC7690u interfaceC7690u = (InterfaceC7690u) obj;
                            C5295a1.f33567a.m11439h(Integer.valueOf(((Number) ((Object[]) c5454b.f34007c)[i14]).intValue() + iIntValue));
                            InterfaceC2052l<Object, C9072e> interfaceC2052lMo1873f = abstractC0497b.mo1873f();
                            if (interfaceC2052lMo1873f != null) {
                                interfaceC2052lMo1873f.mo528n(interfaceC7690u);
                            }
                        }
                    }
                    C5295a1.f33567a.m11439h(Integer.valueOf(iIntValue));
                    C9072e c9072e = C9072e.f47360a;
                    int i15 = c5458f.f34019c;
                    if (i15 > 0) {
                        T[] tArr2 = c5458f.f34017a;
                        do {
                            ((InterfaceC2052l) ((Pair) tArr2[i10]).f38013b).mo528n(this);
                            i10++;
                        } while (i10 < i15);
                    }
                } catch (Throwable th2) {
                    int i16 = c5458f.f34019c;
                    if (i16 > 0) {
                        T[] tArr3 = c5458f.f34017a;
                        do {
                            ((InterfaceC2052l) ((Pair) tArr3[i10]).f38013b).mo528n(this);
                            i10++;
                        } while (i10 < i16);
                    }
                    throw th2;
                }
            }
            return c0468a;
        }
        Integer num2 = (Integer) C5295a1.f33567a.m11437d();
        final int iIntValue2 = num2 != null ? num2.intValue() : 0;
        final C5454b c5454b2 = new C5454b();
        C5458f c5458f2 = (C5458f) C5295a1.f33568b.m11437d();
        if (c5458f2 == null) {
            c5458f2 = new C5458f(new Pair[0]);
        }
        int i17 = c5458f2.f34019c;
        if (i17 > 0) {
            T[] tArr4 = c5458f2.f34017a;
            int i18 = 0;
            do {
                ((InterfaceC2052l) ((Pair) tArr4[i18]).f38012a).mo528n(this);
                i18++;
            } while (i18 < i17);
        }
        try {
            C5298b1 c5298b1 = C5295a1.f33567a;
            c5298b1.m11439h(Integer.valueOf(iIntValue2 + 1));
            Object objM1924a = AbstractC0497b.a.m1924a(interfaceC2041a, new InterfaceC2052l<Object, C9072e>(this) { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$result$1

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ DerivedSnapshotState<T> f3034b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.f3034b = this;
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Object obj2) {
                    C5207g.m11111f(obj2, "it");
                    if (obj2 == this.f3034b) {
                        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
                    }
                    if (obj2 instanceof InterfaceC7690u) {
                        Object objM11437d = C5295a1.f33567a.m11437d();
                        C5207g.m11108c(objM11437d);
                        int iIntValue3 = ((Number) objM11437d).intValue() - iIntValue2;
                        C5454b c5454b3 = c5454b2;
                        Integer num3 = (Integer) c5454b3.m11676c(obj2);
                        c5454b3.m11677d(obj2, Integer.valueOf(Math.min(iIntValue3, num3 != null ? num3.intValue() : Integer.MAX_VALUE)));
                    }
                    return C9072e.f47360a;
                }
            });
            c5298b1.m11439h(Integer.valueOf(iIntValue2));
            int i19 = c5458f2.f34019c;
            if (i19 > 0) {
                T[] tArr5 = c5458f2.f34017a;
                int i20 = 0;
                do {
                    ((InterfaceC2052l) ((Pair) tArr5[i20]).f38013b).mo528n(this);
                    i20++;
                } while (i20 < i19);
            }
            synchronized (SnapshotKt.f3262c) {
                try {
                    AbstractC0497b abstractC0497bM1891j = SnapshotKt.m1891j();
                    Object obj2 = c0468a.f3032d;
                    if (obj2 == C0468a.f3030f) {
                        c0468a = (C0468a) SnapshotKt.m1894m(this.f3029c, this, abstractC0497bM1891j);
                        c0468a.f3031c = c5454b2;
                        c0468a.f3033e = c0468a.m1702c(this, abstractC0497bM1891j);
                        c0468a.f3032d = objM1924a;
                    } else {
                        InterfaceC5350z0<T> interfaceC5350z0 = this.f3028b;
                        if (interfaceC5350z0 != null && interfaceC5350z0.mo11451a((T) objM1924a, (T) obj2)) {
                            i10 = 1;
                        }
                        if (i10 != 0) {
                            c0468a.f3031c = c5454b2;
                            c0468a.f3033e = c0468a.m1702c(this, abstractC0497bM1891j);
                        } else {
                            c0468a = (C0468a) SnapshotKt.m1894m(this.f3029c, this, abstractC0497bM1891j);
                            c0468a.f3031c = c5454b2;
                            c0468a.f3033e = c0468a.m1702c(this, abstractC0497bM1891j);
                            c0468a.f3032d = objM1924a;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (iIntValue2 == 0) {
                SnapshotKt.m1891j().mo1869l();
            }
            return c0468a;
        } catch (Throwable th4) {
            int i21 = c5458f2.f34019c;
            if (i21 > 0) {
                T[] tArr6 = c5458f2.f34017a;
                do {
                    ((InterfaceC2052l) ((Pair) tArr6[i10]).f38013b).mo528n(this);
                    i10++;
                } while (i10 < i21);
            }
            throw th4;
        }
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        InterfaceC2052l<Object, C9072e> interfaceC2052lMo1873f = SnapshotKt.m1891j().mo1873f();
        if (interfaceC2052lMo1873f != null) {
            interfaceC2052lMo1873f.mo528n(this);
        }
        return (T) m1697e((C0468a) SnapshotKt.m1889h(this.f3029c), SnapshotKt.m1891j(), true, this.f3027a).f3032d;
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: l */
    public final AbstractC7691v mo1698l() {
        return this.f3029c;
    }

    @Override // p267n0.InterfaceC7690u
    /* JADX INFO: renamed from: q */
    public final void mo1699q(AbstractC7691v abstractC7691v) {
        this.f3029c = (C0468a) abstractC7691v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DerivedState(value=");
        C0468a c0468a = (C0468a) SnapshotKt.m1889h(this.f3029c);
        sb2.append(c0468a.f3032d != C0468a.f3030f && c0468a.f3033e == c0468a.m1702c(this, SnapshotKt.m1891j()) ? String.valueOf(c0468a.f3032d) : "<Not calculated>");
        sb2.append(")@");
        sb2.append(hashCode());
        return sb2.toString();
    }
}
