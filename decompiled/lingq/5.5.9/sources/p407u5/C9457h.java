package p407u5;

import ae.C0062b;
import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p233l3.AbstractC7248c;

/* JADX INFO: renamed from: u5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9457h implements InterfaceC9451b {

    /* JADX INFO: renamed from: a */
    public final C9455f<a, Object> f48453a = new C9455f<>();

    /* JADX INFO: renamed from: b */
    public final b f48454b = new b();

    /* JADX INFO: renamed from: c */
    public final HashMap f48455c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f48456d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final int f48457e;

    /* JADX INFO: renamed from: f */
    public int f48458f;

    /* JADX INFO: renamed from: u5.h$a */
    public static final class a implements InterfaceC9460k {

        /* JADX INFO: renamed from: a */
        public final b f48459a;

        /* JADX INFO: renamed from: b */
        public int f48460b;

        /* JADX INFO: renamed from: c */
        public Class<?> f48461c;

        public a(b bVar) {
            this.f48459a = bVar;
        }

        @Override // p407u5.InterfaceC9460k
        /* JADX INFO: renamed from: a */
        public final void mo17866a() {
            this.f48459a.m14596e(this);
        }

        public final boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f48460b == aVar.f48460b && this.f48461c == aVar.f48461c) {
                    z10 = true;
                }
            }
            return z10;
        }

        public final int hashCode() {
            int i10 = this.f48460b * 31;
            Class<?> cls = this.f48461c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f48460b + "array=" + this.f48461c + '}';
        }
    }

    /* JADX INFO: renamed from: u5.h$b */
    public static final class b extends AbstractC7248c {
        public b() {
            super(1);
        }

        @Override // p233l3.AbstractC7248c
        /* JADX INFO: renamed from: b */
        public final InterfaceC9460k mo14594b() {
            return new a(this);
        }
    }

    public C9457h(int i10) {
        this.f48457e = i10;
    }

    @Override // p407u5.InterfaceC9451b
    /* JADX INFO: renamed from: a */
    public final synchronized void mo17849a(int i10) {
        try {
            if (i10 >= 40) {
                mo17850b();
            } else {
                if (i10 < 20) {
                    if (i10 == 15) {
                    }
                }
                m17862g(this.f48457e / 2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p407u5.InterfaceC9451b
    /* JADX INFO: renamed from: b */
    public final synchronized void mo17850b() {
        m17862g(0);
    }

    @Override // p407u5.InterfaceC9451b
    /* JADX INFO: renamed from: c */
    public final synchronized <T> void mo17851c(T t10) {
        Class<?> cls = t10.getClass();
        InterfaceC9450a<T> interfaceC9450aM17863h = m17863h(cls);
        int iMo17847b = interfaceC9450aM17863h.mo17847b(t10);
        int iMo17846a = interfaceC9450aM17863h.mo17846a() * iMo17847b;
        int iIntValue = 1;
        if (iMo17846a <= this.f48457e / 2) {
            a aVar = (a) this.f48454b.m14595c();
            aVar.f48460b = iMo17847b;
            aVar.f48461c = cls;
            this.f48453a.m17859b(aVar, t10);
            NavigableMap<Integer, Integer> navigableMapM17865j = m17865j(cls);
            Integer num = navigableMapM17865j.get(Integer.valueOf(aVar.f48460b));
            Integer numValueOf = Integer.valueOf(aVar.f48460b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM17865j.put(numValueOf, Integer.valueOf(iIntValue));
            this.f48458f += iMo17846a;
            m17862g(this.f48457e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p407u5.InterfaceC9451b
    /* JADX INFO: renamed from: d */
    public final synchronized <T> T mo17852d(int i10, Class<T> cls) {
        a aVar;
        Integer numCeilingKey = m17865j(cls).ceilingKey(Integer.valueOf(i10));
        boolean z10 = false;
        if (numCeilingKey != null) {
            int i11 = this.f48458f;
            if ((i11 == 0 || this.f48457e / i11 >= 2) || numCeilingKey.intValue() <= i10 * 8) {
                z10 = true;
            }
        }
        if (z10) {
            b bVar = this.f48454b;
            int iIntValue = numCeilingKey.intValue();
            aVar = (a) bVar.m14595c();
            aVar.f48460b = iIntValue;
            aVar.f48461c = cls;
        } else {
            a aVar2 = (a) this.f48454b.m14595c();
            aVar2.f48460b = i10;
            aVar2.f48461c = cls;
            aVar = aVar2;
        }
        return (T) m17864i(aVar, cls);
    }

    @Override // p407u5.InterfaceC9451b
    /* JADX INFO: renamed from: e */
    public final synchronized Object mo17853e() {
        a aVar;
        try {
            aVar = (a) this.f48454b.m14595c();
            aVar.f48460b = 8;
            aVar.f48461c = byte[].class;
        } catch (Throwable th2) {
            throw th2;
        }
        return m17864i(aVar, byte[].class);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m17861f(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapM17865j = m17865j(cls);
        Integer num = navigableMapM17865j.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM17865j.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapM17865j.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    /* JADX INFO: renamed from: g */
    public final void m17862g(int i10) {
        while (this.f48458f > i10) {
            Object objM17860c = this.f48453a.m17860c();
            C0062b.m345f0(objM17860c);
            InterfaceC9450a interfaceC9450aM17863h = m17863h(objM17860c.getClass());
            this.f48458f -= interfaceC9450aM17863h.mo17846a() * interfaceC9450aM17863h.mo17847b(objM17860c);
            m17861f(interfaceC9450aM17863h.mo17847b(objM17860c), objM17860c.getClass());
            if (Log.isLoggable(interfaceC9450aM17863h.mo17848g(), 2)) {
                Log.v(interfaceC9450aM17863h.mo17848g(), "evicted: " + interfaceC9450aM17863h.mo17847b(objM17860c));
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final <T> InterfaceC9450a<T> m17863h(Class<T> cls) {
        HashMap map = this.f48456d;
        InterfaceC9450a<T> c9454e = (InterfaceC9450a) map.get(cls);
        if (c9454e == null) {
            if (cls.equals(int[].class)) {
                c9454e = new C9456g();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c9454e = new C9454e();
            }
            map.put(cls, c9454e);
        }
        return c9454e;
    }

    /* JADX INFO: renamed from: i */
    public final <T> T m17864i(a aVar, Class<T> cls) {
        InterfaceC9450a<T> interfaceC9450aM17863h = m17863h(cls);
        T t10 = (T) this.f48453a.m17858a(aVar);
        if (t10 != null) {
            this.f48458f -= interfaceC9450aM17863h.mo17846a() * interfaceC9450aM17863h.mo17847b(t10);
            m17861f(interfaceC9450aM17863h.mo17847b(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(interfaceC9450aM17863h.mo17848g(), 2)) {
            Log.v(interfaceC9450aM17863h.mo17848g(), "Allocated " + aVar.f48460b + " bytes");
        }
        return interfaceC9450aM17863h.newArray(aVar.f48460b);
    }

    /* JADX INFO: renamed from: j */
    public final NavigableMap<Integer, Integer> m17865j(Class<?> cls) {
        HashMap map = this.f48455c;
        NavigableMap<Integer, Integer> treeMap = (NavigableMap) map.get(cls);
        if (treeMap == null) {
            treeMap = new TreeMap<>();
            map.put(cls, treeMap);
        }
        return treeMap;
    }
}
