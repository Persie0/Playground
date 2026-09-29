package androidx.compose.runtime;

import android.util.Log;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.C7879x0;
import no.InterfaceC7840j;
import no.InterfaceC7875v0;
import p081e0.AbstractC5311g;
import p081e0.C5300c0;
import p081e0.C5303d0;
import p081e0.C5306e0;
import p081e0.C5309f0;
import p081e0.InterfaceC5321l;
import p105f0.C5455c;
import p186j0.C6399b;
import p267n0.AbstractC7674e;
import p267n0.C7670a;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class Recomposer extends AbstractC5311g {

    /* JADX INFO: renamed from: s */
    public static final StateFlowImpl f3050s;

    /* JADX INFO: renamed from: t */
    public static final AtomicReference<Boolean> f3051t;

    /* JADX INFO: renamed from: a */
    public final BroadcastFrameClock f3052a;

    /* JADX INFO: renamed from: b */
    public final Object f3053b;

    /* JADX INFO: renamed from: c */
    public InterfaceC7875v0 f3054c;

    /* JADX INFO: renamed from: d */
    public Throwable f3055d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f3056e;

    /* JADX INFO: renamed from: f */
    public LinkedHashSet f3057f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3058g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f3059h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f3060i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f3061j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f3062k;

    /* JADX INFO: renamed from: l */
    public ArrayList f3063l;

    /* JADX INFO: renamed from: m */
    public InterfaceC7840j<? super C9072e> f3064m;

    /* JADX INFO: renamed from: n */
    public C0471b f3065n;

    /* JADX INFO: renamed from: o */
    public final StateFlowImpl f3066o;

    /* JADX INFO: renamed from: p */
    public final C7879x0 f3067p;

    /* JADX INFO: renamed from: q */
    public final CoroutineContext f3068q;

    /* JADX INFO: renamed from: r */
    public final C0472c f3069r;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m13365d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$a */
    public static final class C0470a {
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$b */
    public static final class C0471b {
        public C0471b(Exception exc) {
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$c */
    public final class C0472c {
    }

    static {
        new C0470a();
        f3050s = C7120g.m14379a(C6399b.f36854d);
        f3051t = new AtomicReference<>(Boolean.FALSE);
    }

    public Recomposer(CoroutineContext coroutineContext) {
        C5207g.m11111f(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new InterfaceC2041a<C9072e>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                InterfaceC7840j<C9072e> interfaceC7840jM1711t;
                Recomposer recomposer = this.f3070b;
                synchronized (recomposer.f3053b) {
                    try {
                        interfaceC7840jM1711t = recomposer.m1711t();
                        if (((Recomposer.State) recomposer.f3066o.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                            Throwable th2 = recomposer.f3055d;
                            CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                            cancellationException.initCause(th2);
                            throw cancellationException;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (interfaceC7840jM1711t != null) {
                    interfaceC7840jM1711t.mo2031y(C9072e.f47360a);
                }
                return C9072e.f47360a;
            }
        });
        this.f3052a = broadcastFrameClock;
        this.f3053b = new Object();
        this.f3056e = new ArrayList();
        this.f3057f = new LinkedHashSet();
        this.f3058g = new ArrayList();
        this.f3059h = new ArrayList();
        this.f3060i = new ArrayList();
        this.f3061j = new LinkedHashMap();
        this.f3062k = new LinkedHashMap();
        this.f3066o = C7120g.m14379a(State.Inactive);
        C7879x0 c7879x0 = new C7879x0((InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a));
        c7879x0.mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                final Throwable th3 = th2;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th3);
                final Recomposer recomposer = this.f3071b;
                synchronized (recomposer.f3053b) {
                    try {
                        InterfaceC7875v0 interfaceC7875v0 = recomposer.f3054c;
                        if (interfaceC7875v0 != null) {
                            recomposer.f3066o.setValue(Recomposer.State.ShuttingDown);
                            interfaceC7875v0.mo15618a(cancellationException);
                            recomposer.f3064m = null;
                            interfaceC7875v0.mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(Throwable th4) {
                                    Throwable th5 = th4;
                                    Recomposer recomposer2 = recomposer;
                                    Object obj = recomposer2.f3053b;
                                    Throwable th6 = th3;
                                    synchronized (obj) {
                                        if (th6 == null) {
                                            th6 = null;
                                        } else if (th5 != null) {
                                            try {
                                                if (!(!(th5 instanceof CancellationException))) {
                                                    th5 = null;
                                                }
                                                if (th5 != null) {
                                                    C8656b.m16899g(th6, th5);
                                                }
                                            } catch (Throwable th7) {
                                                throw th7;
                                            }
                                        }
                                        recomposer2.f3055d = th6;
                                        recomposer2.f3066o.setValue(Recomposer.State.ShutDown);
                                    }
                                    return C9072e.f47360a;
                                }
                            });
                        } else {
                            recomposer.f3055d = cancellationException;
                            recomposer.f3066o.setValue(Recomposer.State.ShutDown);
                            C9072e c9072e = C9072e.f47360a;
                        }
                    } finally {
                    }
                }
                return C9072e.f47360a;
            }
        });
        this.f3067p = c7879x0;
        this.f3068q = coroutineContext.mo1471C(broadcastFrameClock).mo1471C(c7879x0);
        this.f3069r = new C0472c();
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m1704A(Recomposer recomposer, Exception exc, boolean z10, int i10) throws Exception {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.m1716z(exc, null, z10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC5321l m1705p(Recomposer recomposer, InterfaceC5321l interfaceC5321l, C5455c c5455c) {
        C7670a c7670aMo1872y;
        if (!interfaceC5321l.mo1736p() && !interfaceC5321l.mo1732l()) {
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(interfaceC5321l);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(interfaceC5321l, c5455c);
            AbstractC0497b abstractC0497bM1891j = SnapshotKt.m1891j();
            C7670a c7670a = abstractC0497bM1891j instanceof C7670a ? (C7670a) abstractC0497bM1891j : null;
            if (c7670a == null || (c7670aMo1872y = c7670a.mo1872y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                AbstractC0497b abstractC0497bM1920i = c7670aMo1872y.m1920i();
                try {
                    boolean z10 = true;
                    if (!(c5455c.f34008a > 0)) {
                        z10 = false;
                    }
                    if (z10) {
                        interfaceC5321l.mo1728h(new Recomposer$performRecompose$1$1(interfaceC5321l, c5455c));
                    }
                    boolean zMo1740t = interfaceC5321l.mo1740t();
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    m1707r(c7670aMo1872y);
                    if (!zMo1740t) {
                        interfaceC5321l = null;
                    }
                    return interfaceC5321l;
                } catch (Throwable th2) {
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    throw th2;
                }
            } catch (Throwable th3) {
                m1707r(c7670aMo1872y);
                throw th3;
            }
        }
        return null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1706q(Recomposer recomposer) {
        LinkedHashSet linkedHashSet = recomposer.f3057f;
        if (!linkedHashSet.isEmpty()) {
            ArrayList arrayList = recomposer.f3056e;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((InterfaceC5321l) arrayList.get(i10)).mo1734n(linkedHashSet);
                if (((State) recomposer.f3066o.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    break;
                }
            }
            recomposer.f3057f = new LinkedHashSet();
            if (recomposer.m1711t() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public static void m1707r(C7670a c7670a) {
        try {
            if (c7670a.mo1871t() instanceof AbstractC7674e.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
            c7670a.mo1866c();
        } catch (Throwable th2) {
            c7670a.mo1866c();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: x */
    public static final void m1708x(ArrayList arrayList, Recomposer recomposer, InterfaceC5321l interfaceC5321l) {
        arrayList.clear();
        synchronized (recomposer.f3053b) {
            try {
                Iterator it = recomposer.f3060i.iterator();
                while (it.hasNext()) {
                    C5309f0 c5309f0 = (C5309f0) it.next();
                    if (C5207g.m11106a(c5309f0.f33578c, interfaceC5321l)) {
                        arrayList.add(c5309f0);
                        it.remove();
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final Object m1709B(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM15574h = C7828f.m15574h(interfaceC9968c, this.f3052a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), C5300c0.m11448a(interfaceC9968c.mo2029e()), null));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (objM15574h != coroutineSingletons) {
            objM15574h = C9072e.f47360a;
        }
        return objM15574h == coroutineSingletons ? objM15574h : C9072e.f47360a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: a */
    public final void mo1669a(InterfaceC5321l interfaceC5321l, ComposableLambdaImpl composableLambdaImpl) throws Exception {
        C7670a c7670aMo1872y;
        C5207g.m11111f(interfaceC5321l, "composition");
        boolean zMo1736p = interfaceC5321l.mo1736p();
        try {
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(interfaceC5321l);
            C7670a c7670a = null;
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(interfaceC5321l, null);
            AbstractC0497b abstractC0497bM1891j = SnapshotKt.m1891j();
            if (abstractC0497bM1891j instanceof C7670a) {
                c7670a = (C7670a) abstractC0497bM1891j;
            }
            if (c7670a == null || (c7670aMo1872y = c7670a.mo1872y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                AbstractC0497b abstractC0497bM1920i = c7670aMo1872y.m1920i();
                try {
                    interfaceC5321l.mo1730j(composableLambdaImpl);
                    C9072e c9072e = C9072e.f47360a;
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    m1707r(c7670aMo1872y);
                    if (!zMo1736p) {
                        SnapshotKt.m1891j().mo1869l();
                    }
                    synchronized (this.f3053b) {
                        try {
                            if (((State) this.f3066o.getValue()).compareTo(State.ShuttingDown) > 0 && !this.f3056e.contains(interfaceC5321l)) {
                                this.f3056e.add(interfaceC5321l);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        m1714w(interfaceC5321l);
                        try {
                            interfaceC5321l.mo1735o();
                            interfaceC5321l.mo1729i();
                            if (!zMo1736p) {
                                SnapshotKt.m1891j().mo1869l();
                            }
                        } catch (Exception e10) {
                            m1704A(this, e10, false, 6);
                        }
                    } catch (Exception e11) {
                        m1716z(e11, interfaceC5321l, true);
                    }
                } catch (Throwable th3) {
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    throw th3;
                }
            } catch (Throwable th4) {
                m1707r(c7670aMo1872y);
                throw th4;
            }
        } catch (Exception e12) {
            m1716z(e12, interfaceC5321l, true);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: b */
    public final void mo1670b(C5309f0 c5309f0) {
        synchronized (this.f3053b) {
            try {
                LinkedHashMap linkedHashMap = this.f3061j;
                C5303d0<Object> c5303d0 = c5309f0.f33576a;
                C5207g.m11111f(linkedHashMap, "<this>");
                Object arrayList = linkedHashMap.get(c5303d0);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(c5303d0, arrayList);
                }
                ((List) arrayList).add(c5309f0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: d */
    public final boolean mo1672d() {
        return false;
    }

    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: f */
    public final int mo1674f() {
        return 1000;
    }

    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: g */
    public final CoroutineContext mo1675g() {
        return this.f3068q;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: h */
    public final void mo1676h(InterfaceC5321l interfaceC5321l) {
        InterfaceC7840j<C9072e> interfaceC7840jM1711t;
        C5207g.m11111f(interfaceC5321l, "composition");
        synchronized (this.f3053b) {
            if (this.f3058g.contains(interfaceC5321l)) {
                interfaceC7840jM1711t = null;
            } else {
                this.f3058g.add(interfaceC5321l);
                interfaceC7840jM1711t = m1711t();
            }
        }
        if (interfaceC7840jM1711t != null) {
            interfaceC7840jM1711t.mo2031y(C9072e.f47360a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: i */
    public final void mo1677i(C5309f0 c5309f0, C5306e0 c5306e0) {
        synchronized (this.f3053b) {
            this.f3062k.put(c5309f0, c5306e0);
            C9072e c9072e = C9072e.f47360a;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: j */
    public final C5306e0 mo1678j(C5309f0 c5309f0) {
        C5306e0 c5306e0;
        C5207g.m11111f(c5309f0, "reference");
        synchronized (this.f3053b) {
            c5306e0 = (C5306e0) this.f3062k.remove(c5309f0);
        }
        return c5306e0;
    }

    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: k */
    public final void mo1679k(Set<Object> set) {
    }

    @Override // p081e0.AbstractC5311g
    /* JADX INFO: renamed from: o */
    public final void mo1683o(InterfaceC5321l interfaceC5321l) {
        C5207g.m11111f(interfaceC5321l, "composition");
        synchronized (this.f3053b) {
            try {
                this.f3056e.remove(interfaceC5321l);
                this.f3058g.remove(interfaceC5321l);
                this.f3059h.remove(interfaceC5321l);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1710s() {
        synchronized (this.f3053b) {
            try {
                if (((State) this.f3066o.getValue()).compareTo(State.Idle) >= 0) {
                    this.f3066o.setValue(State.ShuttingDown);
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f3067p.mo15618a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final InterfaceC7840j<C9072e> m1711t() {
        State state;
        StateFlowImpl stateFlowImpl = this.f3066o;
        int iCompareTo = ((State) stateFlowImpl.getValue()).compareTo(State.ShuttingDown);
        ArrayList arrayList = this.f3060i;
        ArrayList arrayList2 = this.f3059h;
        ArrayList arrayList3 = this.f3058g;
        InterfaceC7840j interfaceC7840j = null;
        if (iCompareTo <= 0) {
            this.f3056e.clear();
            this.f3057f = new LinkedHashSet();
            arrayList3.clear();
            arrayList2.clear();
            arrayList.clear();
            this.f3063l = null;
            InterfaceC7840j<? super C9072e> interfaceC7840j2 = this.f3064m;
            if (interfaceC7840j2 != null) {
                interfaceC7840j2.mo15583t0(null);
            }
            this.f3064m = null;
            this.f3065n = null;
            return null;
        }
        if (this.f3065n != null) {
            state = State.Inactive;
        } else {
            InterfaceC7875v0 interfaceC7875v0 = this.f3054c;
            BroadcastFrameClock broadcastFrameClock = this.f3052a;
            if (interfaceC7875v0 == null) {
                this.f3057f = new LinkedHashSet();
                arrayList3.clear();
                state = broadcastFrameClock.m1582c() ? State.InactivePendingWork : State.Inactive;
            } else {
                if (!(!arrayList3.isEmpty()) && !(!this.f3057f.isEmpty()) && !(!arrayList2.isEmpty()) && !(!arrayList.isEmpty())) {
                    if (!broadcastFrameClock.m1582c()) {
                        state = State.Idle;
                    }
                }
                state = State.PendingWork;
            }
        }
        stateFlowImpl.setValue(state);
        if (state == State.PendingWork) {
            InterfaceC7840j interfaceC7840j3 = this.f3064m;
            this.f3064m = null;
            interfaceC7840j = interfaceC7840j3;
        }
        return interfaceC7840j;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1712u() {
        boolean z10;
        synchronized (this.f3053b) {
            try {
                z10 = true;
                if (!(!this.f3057f.isEmpty()) && !(!this.f3058g.isEmpty())) {
                    if (!this.f3052a.m1582c()) {
                        z10 = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: v */
    public final Object m1713v(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM14361b = FlowKt__ReduceKt.m14361b(this.f3066o, new Recomposer$join$2(null), interfaceC9968c);
        return objM14361b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14361b : C9072e.f47360a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: w */
    public final void m1714w(InterfaceC5321l interfaceC5321l) {
        synchronized (this.f3053b) {
            ArrayList arrayList = this.f3060i;
            int size = arrayList.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (C5207g.m11106a(((C5309f0) arrayList.get(i10)).f33578c, interfaceC5321l)) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                C9072e c9072e = C9072e.f47360a;
                ArrayList arrayList2 = new ArrayList();
                m1708x(arrayList2, this, interfaceC5321l);
                while (!arrayList2.isEmpty()) {
                    m1715y(arrayList2, null);
                    m1708x(arrayList2, this, interfaceC5321l);
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final List<InterfaceC5321l> m1715y(List<C5309f0> list, C5455c<Object> c5455c) {
        C7670a c7670aMo1872y;
        ArrayList arrayList;
        Object obj;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C5309f0 c5309f0 = list.get(i10);
            InterfaceC5321l interfaceC5321l = c5309f0.f33578c;
            Object arrayList2 = map.get(interfaceC5321l);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(interfaceC5321l, arrayList2);
            }
            ((ArrayList) arrayList2).add(c5309f0);
        }
        for (Map.Entry entry : map.entrySet()) {
            InterfaceC5321l interfaceC5321l2 = (InterfaceC5321l) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.m1690f(!interfaceC5321l2.mo1736p());
            Recomposer$readObserverOf$1 recomposer$readObserverOf$1 = new Recomposer$readObserverOf$1(interfaceC5321l2);
            Recomposer$writeObserverOf$1 recomposer$writeObserverOf$1 = new Recomposer$writeObserverOf$1(interfaceC5321l2, c5455c);
            AbstractC0497b abstractC0497bM1891j = SnapshotKt.m1891j();
            C7670a c7670a = abstractC0497bM1891j instanceof C7670a ? (C7670a) abstractC0497bM1891j : null;
            if (c7670a == null || (c7670aMo1872y = c7670a.mo1872y(recomposer$readObserverOf$1, recomposer$writeObserverOf$1)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot".toString());
            }
            try {
                AbstractC0497b abstractC0497bM1920i = c7670aMo1872y.m1920i();
                try {
                    synchronized (this.f3053b) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            C5309f0 c5309f1 = (C5309f0) list2.get(i11);
                            LinkedHashMap linkedHashMap = this.f3061j;
                            C5303d0<Object> c5303d0 = c5309f1.f33576a;
                            C5207g.m11111f(linkedHashMap, "<this>");
                            List list3 = (List) linkedHashMap.get(c5303d0);
                            if (list3 == null) {
                                obj = null;
                            } else {
                                if (list3.isEmpty()) {
                                    throw new NoSuchElementException("List is empty.");
                                }
                                Object objRemove = list3.remove(0);
                                if (list3.isEmpty()) {
                                    linkedHashMap.remove(c5303d0);
                                }
                                obj = objRemove;
                            }
                            arrayList.add(new Pair(c5309f1, obj));
                            i11++;
                            this = this;
                        }
                    }
                    interfaceC5321l2.mo1725d(arrayList);
                    C9072e c9072e = C9072e.f47360a;
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    m1707r(c7670aMo1872y);
                } catch (Throwable th2) {
                    AbstractC0497b.m1915o(abstractC0497bM1920i);
                    throw th2;
                }
            } catch (Throwable th3) {
                m1707r(c7670aMo1872y);
                throw th3;
            }
        }
        return C6752c.m13453u0(map.keySet());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: z */
    public final void m1716z(Exception exc, InterfaceC5321l interfaceC5321l, boolean z10) throws Exception {
        Boolean bool = f3051t.get();
        C5207g.m11110e(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.f3053b) {
            try {
                int i10 = ActualAndroid_androidKt.f2870a;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f3059h.clear();
                this.f3058g.clear();
                this.f3057f = new LinkedHashSet();
                this.f3060i.clear();
                this.f3061j.clear();
                this.f3062k.clear();
                this.f3065n = new C0471b(exc);
                if (interfaceC5321l != null) {
                    ArrayList arrayList = this.f3063l;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        this.f3063l = arrayList;
                    }
                    if (!arrayList.contains(interfaceC5321l)) {
                        arrayList.add(interfaceC5321l);
                    }
                    this.f3056e.remove(interfaceC5321l);
                }
                m1711t();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
