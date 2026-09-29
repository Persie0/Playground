package androidx.view;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.support.v4.media.C0141b;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p208k.C6560c;
import p229l.C7202a;
import p229l.C7203b;

/* JADX INFO: renamed from: androidx.lifecycle.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1052r extends Lifecycle {

    /* JADX INFO: renamed from: b */
    public final boolean f6679b;

    /* JADX INFO: renamed from: c */
    public C7202a<InterfaceC1050p, a> f6680c;

    /* JADX INFO: renamed from: d */
    public Lifecycle.State f6681d;

    /* JADX INFO: renamed from: e */
    public final WeakReference<InterfaceC1051q> f6682e;

    /* JADX INFO: renamed from: f */
    public int f6683f;

    /* JADX INFO: renamed from: g */
    public boolean f6684g;

    /* JADX INFO: renamed from: h */
    public boolean f6685h;

    /* JADX INFO: renamed from: i */
    public final ArrayList<Lifecycle.State> f6686i;

    /* JADX INFO: renamed from: androidx.lifecycle.r$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Lifecycle.State f6687a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC1049o f6688b;

        public a(InterfaceC1050p interfaceC1050p, Lifecycle.State state) {
            InterfaceC1049o reflectiveGenericLifecycleObserver;
            C5207g.m11111f(state, "initialState");
            C5207g.m11108c(interfaceC1050p);
            HashMap map = C1055u.f6690a;
            boolean z10 = interfaceC1050p instanceof InterfaceC1049o;
            boolean z11 = interfaceC1050p instanceof InterfaceC1029e;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1029e) interfaceC1050p, (InterfaceC1049o) interfaceC1050p);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC1029e) interfaceC1050p, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (InterfaceC1049o) interfaceC1050p;
            } else {
                Class<?> cls = interfaceC1050p.getClass();
                if (C1055u.m3962b(cls) == 2) {
                    Object obj = C1055u.f6691b.get(cls);
                    C5207g.m11108c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(C1055u.m3961a((Constructor) list.get(0), interfaceC1050p));
                    } else {
                        int size = list.size();
                        InterfaceC1035h[] interfaceC1035hArr = new InterfaceC1035h[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            interfaceC1035hArr[i10] = C1055u.m3961a((Constructor) list.get(i10), interfaceC1050p);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC1035hArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1050p);
                }
            }
            this.f6688b = reflectiveGenericLifecycleObserver;
            this.f6687a = state;
        }

        /* JADX INFO: renamed from: a */
        public final void m3959a(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
            Lifecycle.State targetState = event.getTargetState();
            Lifecycle.State state = this.f6687a;
            C5207g.m11111f(state, "state1");
            if (targetState != null && targetState.compareTo(state) < 0) {
                state = targetState;
            }
            this.f6687a = state;
            this.f6688b.mo800e(interfaceC1051q, event);
            this.f6687a = targetState;
        }
    }

    public C1052r(InterfaceC1051q interfaceC1051q) {
        C5207g.m11111f(interfaceC1051q, "provider");
        this.f6679b = true;
        this.f6680c = new C7202a<>();
        this.f6681d = Lifecycle.State.INITIALIZED;
        this.f6686i = new ArrayList<>();
        this.f6682e = new WeakReference<>(interfaceC1051q);
    }

    @Override // androidx.view.Lifecycle
    /* JADX INFO: renamed from: a */
    public final void mo3883a(InterfaceC1050p interfaceC1050p) {
        InterfaceC1051q interfaceC1051q;
        C5207g.m11111f(interfaceC1050p, "observer");
        m3954e("addObserver");
        Lifecycle.State state = this.f6681d;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(interfaceC1050p, state2);
        if (this.f6680c.mo14516f(interfaceC1050p, aVar) == null && (interfaceC1051q = this.f6682e.get()) != null) {
            boolean z10 = this.f6683f != 0 || this.f6684g;
            Lifecycle.State stateM3953d = m3953d(interfaceC1050p);
            this.f6683f++;
            while (aVar.f6687a.compareTo(stateM3953d) < 0 && this.f6680c.f40530e.containsKey(interfaceC1050p)) {
                Lifecycle.State state3 = aVar.f6687a;
                ArrayList<Lifecycle.State> arrayList = this.f6686i;
                arrayList.add(state3);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state4 = aVar.f6687a;
                companion.getClass();
                Lifecycle.Event eventM3887b = Lifecycle.Event.Companion.m3887b(state4);
                if (eventM3887b == null) {
                    throw new IllegalStateException("no event up from " + aVar.f6687a);
                }
                aVar.m3959a(interfaceC1051q, eventM3887b);
                arrayList.remove(arrayList.size() - 1);
                stateM3953d = m3953d(interfaceC1050p);
            }
            if (!z10) {
                m3958i();
            }
            this.f6683f--;
        }
    }

    @Override // androidx.view.Lifecycle
    /* JADX INFO: renamed from: b */
    public final Lifecycle.State mo3884b() {
        return this.f6681d;
    }

    @Override // androidx.view.Lifecycle
    /* JADX INFO: renamed from: c */
    public final void mo3885c(InterfaceC1050p interfaceC1050p) {
        C5207g.m11111f(interfaceC1050p, "observer");
        m3954e("removeObserver");
        this.f6680c.mo14517g(interfaceC1050p);
    }

    /* JADX INFO: renamed from: d */
    public final Lifecycle.State m3953d(InterfaceC1050p interfaceC1050p) {
        a aVar;
        C7202a<InterfaceC1050p, a> c7202a = this.f6680c;
        C7203b.c<InterfaceC1050p, a> cVar = c7202a.f40530e.containsKey(interfaceC1050p) ? c7202a.f40530e.get(interfaceC1050p).f40538d : null;
        Lifecycle.State state = (cVar == null || (aVar = cVar.f40536b) == null) ? null : aVar.f6687a;
        ArrayList<Lifecycle.State> arrayList = this.f6686i;
        Lifecycle.State state2 = arrayList.isEmpty() ^ true ? arrayList.get(arrayList.size() - 1) : null;
        Lifecycle.State state3 = this.f6681d;
        C5207g.m11111f(state3, "state1");
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    @SuppressLint({"RestrictedApi"})
    /* JADX INFO: renamed from: e */
    public final void m3954e(String str) {
        if (this.f6679b) {
            C6560c.m13159k0().f37356a.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(C0141b.m611g("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3955f(Lifecycle.Event event) {
        C5207g.m11111f(event, "event");
        m3954e("handleLifecycleEvent");
        m3956g(event.getTargetState());
    }

    /* JADX INFO: renamed from: g */
    public final void m3956g(Lifecycle.State state) {
        Lifecycle.State state2 = this.f6681d;
        if (state2 == state) {
            return;
        }
        if (!((state2 == Lifecycle.State.INITIALIZED && state == Lifecycle.State.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f6681d + " in component " + this.f6682e.get()).toString());
        }
        this.f6681d = state;
        if (this.f6684g || this.f6683f != 0) {
            this.f6685h = true;
            return;
        }
        this.f6684g = true;
        m3958i();
        this.f6684g = false;
        if (this.f6681d == Lifecycle.State.DESTROYED) {
            this.f6680c = new C7202a<>();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m3957h(Lifecycle.State state) {
        C5207g.m11111f(state, "state");
        m3954e("setCurrentState");
        m3956g(state);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:18:0x007e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: i */
    public final void m3958i() {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C1052r.m3958i():void");
    }
}
