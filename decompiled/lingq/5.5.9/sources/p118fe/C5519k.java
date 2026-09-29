package p118fe;

import android.util.Log;
import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p128g2.RunnableC5682t;
import p213k4.RunnableC6590j;
import p286o2.RunnableC7907g;
import p414ue.InterfaceC9521a;
import p533ze.C10479a;
import p533ze.InterfaceC10481c;
import p533ze.InterfaceC10482d;

/* JADX INFO: renamed from: fe.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5519k implements InterfaceC5512d, InterfaceC9521a {

    /* JADX INFO: renamed from: g */
    public static final C5517i f34170g = new C5517i(0);

    /* JADX INFO: renamed from: d */
    public final C5522n f34174d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5515g f34176f;

    /* JADX INFO: renamed from: a */
    public final HashMap f34171a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f34172b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f34173c = new HashMap();

    /* JADX INFO: renamed from: e */
    public final AtomicReference<Boolean> f34175e = new AtomicReference<>();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5519k(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC5515g interfaceC5515g) {
        C5522n c5522n = new C5522n(executor);
        this.f34174d = c5522n;
        this.f34176f = interfaceC5515g;
        ArrayList<C5511c> arrayList3 = new ArrayList();
        int i10 = 0;
        arrayList3.add(C5511c.m11744b(c5522n, C5522n.class, InterfaceC10482d.class, InterfaceC10481c.class));
        arrayList3.add(C5511c.m11744b(this, InterfaceC9521a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C5511c c5511c = (C5511c) it.next();
            if (c5511c != null) {
                arrayList3.add(c5511c);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            try {
                Iterator it3 = arrayList4.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it3.hasNext()) {
                            break loop2;
                        }
                        try {
                            ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2005b) it3.next()).get();
                            if (componentRegistrar != null) {
                                arrayList3.addAll(this.f34176f.mo11755a(componentRegistrar));
                                it3.remove();
                            }
                        } catch (InvalidRegistrarException e10) {
                            it3.remove();
                            Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                        }
                        throw th;
                    }
                }
                if (this.f34171a.isEmpty()) {
                    C5520l.m11760a(arrayList3);
                } else {
                    ArrayList arrayList6 = new ArrayList(this.f34171a.keySet());
                    arrayList6.addAll(arrayList3);
                    C5520l.m11760a(arrayList6);
                }
                for (C5511c c5511c2 : arrayList3) {
                    this.f34171a.put(c5511c2, new C5523o(new C5516h(this, i10, c5511c2)));
                }
                arrayList5.addAll(m11758j(arrayList3));
                arrayList5.addAll(m11759k());
                m11757i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f34175e.get();
        if (bool != null) {
            m11756h(this.f34171a, bool.booleanValue());
        }
    }

    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: d */
    public final <T> InterfaceC2004a<T> mo11751d(C5527s<T> c5527s) {
        InterfaceC2005b<T> interfaceC2005bMo11752e = mo11752e(c5527s);
        if (interfaceC2005bMo11752e == null) {
            return new C5526r(C5526r.f34194c, C5526r.f34195d);
        }
        return interfaceC2005bMo11752e instanceof C5526r ? (C5526r) interfaceC2005bMo11752e : new C5526r(null, interfaceC2005bMo11752e);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: e */
    public final synchronized <T> InterfaceC2005b<T> mo11752e(C5527s<T> c5527s) {
        try {
            if (c5527s == null) {
                throw new NullPointerException("Null interface requested.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (InterfaceC2005b) this.f34172b.get(c5527s);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: f */
    public final synchronized <T> InterfaceC2005b<Set<T>> mo11753f(C5527s<T> c5527s) {
        try {
            C5524p c5524p = (C5524p) this.f34173c.get(c5527s);
            if (c5524p != null) {
                return c5524p;
            }
            return f34170g;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m11756h(Map<C5511c<?>, InterfaceC2005b<?>> map, boolean z10) {
        ArrayDeque<C10479a> arrayDeque;
        Set<Map.Entry> setEmptySet;
        loop0: while (true) {
            for (Map.Entry<C5511c<?>, InterfaceC2005b<?>> entry : map.entrySet()) {
                C5511c<?> key = entry.getKey();
                InterfaceC2005b<?> value = entry.getValue();
                int i10 = key.f34153d;
                if (!(i10 == 1)) {
                    if (!(i10 == 2) || !z10) {
                    }
                }
                value.get();
            }
            break loop0;
        }
        C5522n c5522n = this.f34174d;
        synchronized (c5522n) {
            try {
                arrayDeque = c5522n.f34186b;
                if (arrayDeque != null) {
                    c5522n.f34186b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            while (true) {
                for (C10479a c10479a : arrayDeque) {
                    c10479a.getClass();
                    synchronized (c5522n) {
                        ArrayDeque arrayDeque2 = c5522n.f34186b;
                        if (arrayDeque2 != null) {
                            arrayDeque2.add(c10479a);
                        }
                    }
                    synchronized (c5522n) {
                        try {
                            Map map2 = (Map) c5522n.f34185a.get(null);
                            setEmptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    for (Map.Entry entry2 : setEmptySet) {
                        ((Executor) entry2.getValue()).execute(new RunnableC6590j(entry2, 14, c10479a));
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11757i() {
        for (C5511c c5511c : this.f34171a.keySet()) {
            for (C5521m c5521m : c5511c.f34152c) {
                boolean z10 = true;
                boolean z11 = c5521m.f34183b == 2;
                C5527s<?> c5527s = c5521m.f34182a;
                if (z11) {
                    HashMap map = this.f34173c;
                    if (!map.containsKey(c5527s)) {
                        map.put(c5527s, new C5524p(Collections.emptySet()));
                    }
                }
                HashMap map2 = this.f34172b;
                if (map2.containsKey(c5527s)) {
                    continue;
                } else {
                    int i10 = c5521m.f34183b;
                    if (i10 == 1) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c5511c, c5527s));
                    }
                    if (i10 != 2) {
                        z10 = false;
                    }
                    if (!z10) {
                        map2.put(c5527s, new C5526r(C5526r.f34194c, C5526r.f34195d));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final ArrayList m11758j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5511c c5511c = (C5511c) it.next();
            if (c5511c.f34154e == 0) {
                InterfaceC2005b interfaceC2005b = (InterfaceC2005b) this.f34171a.get(c5511c);
                Iterator it2 = c5511c.f34151b.iterator();
                while (it2.hasNext()) {
                    C5527s c5527s = (C5527s) it2.next();
                    HashMap map = this.f34172b;
                    if (map.containsKey(c5527s)) {
                        arrayList2.add(new RunnableC5682t((C5526r) ((InterfaceC2005b) map.get(c5527s)), 13, interfaceC2005b));
                    } else {
                        map.put(c5527s, interfaceC2005b);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: k */
    public final ArrayList m11759k() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f34171a.entrySet()) {
            C5511c c5511c = (C5511c) entry.getKey();
            if (!(c5511c.f34154e == 0)) {
                InterfaceC2005b interfaceC2005b = (InterfaceC2005b) entry.getValue();
                Iterator it = c5511c.f34151b.iterator();
                while (it.hasNext()) {
                    C5527s c5527s = (C5527s) it.next();
                    if (!map.containsKey(c5527s)) {
                        map.put(c5527s, new HashSet());
                    }
                    ((Set) map.get(c5527s)).add(interfaceC2005b);
                }
            }
        }
        while (true) {
            for (Map.Entry entry2 : map.entrySet()) {
                Object key = entry2.getKey();
                HashMap map2 = this.f34173c;
                if (map2.containsKey(key)) {
                    C5524p c5524p = (C5524p) map2.get(entry2.getKey());
                    Iterator it2 = ((Set) entry2.getValue()).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new RunnableC7907g(c5524p, 15, (InterfaceC2005b) it2.next()));
                    }
                } else {
                    map2.put((C5527s) entry2.getKey(), new C5524p((Set) ((Collection) entry2.getValue())));
                }
            }
            return arrayList;
        }
    }
}
