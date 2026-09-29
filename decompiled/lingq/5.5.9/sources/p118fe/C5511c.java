package p118fe;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: fe.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5511c<T> {

    /* JADX INFO: renamed from: a */
    public final String f34150a;

    /* JADX INFO: renamed from: b */
    public final Set<C5527s<? super T>> f34151b;

    /* JADX INFO: renamed from: c */
    public final Set<C5521m> f34152c;

    /* JADX INFO: renamed from: d */
    public final int f34153d;

    /* JADX INFO: renamed from: e */
    public final int f34154e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5514f<T> f34155f;

    /* JADX INFO: renamed from: g */
    public final Set<Class<?>> f34156g;

    /* JADX INFO: renamed from: fe.c$a */
    public static class a<T> {

        /* JADX INFO: renamed from: a */
        public String f34157a = null;

        /* JADX INFO: renamed from: b */
        public final HashSet f34158b;

        /* JADX INFO: renamed from: c */
        public final HashSet f34159c;

        /* JADX INFO: renamed from: d */
        public int f34160d;

        /* JADX INFO: renamed from: e */
        public int f34161e;

        /* JADX INFO: renamed from: f */
        public InterfaceC5514f<T> f34162f;

        /* JADX INFO: renamed from: g */
        public final HashSet f34163g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f34158b = hashSet;
            this.f34159c = new HashSet();
            this.f34160d = 0;
            this.f34161e = 0;
            this.f34163g = new HashSet();
            hashSet.add(C5527s.m11765a(cls));
            for (Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new NullPointerException("Null interface");
                }
                this.f34158b.add(C5527s.m11765a(cls2));
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m11745a(C5521m c5521m) {
            if (!(!this.f34158b.contains(c5521m.f34182a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f34159c.add(c5521m);
        }

        /* JADX INFO: renamed from: b */
        public final C5511c<T> m11746b() {
            if (this.f34162f != null) {
                return new C5511c<>(this.f34157a, new HashSet(this.f34158b), new HashSet(this.f34159c), this.f34160d, this.f34161e, this.f34162f, this.f34163g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: c */
        public final void m11747c(int i10) {
            if (!(this.f34160d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f34160d = i10;
        }
    }

    public C5511c(String str, Set<C5527s<? super T>> set, Set<C5521m> set2, int i10, int i11, InterfaceC5514f<T> interfaceC5514f, Set<Class<?>> set3) {
        this.f34150a = str;
        this.f34151b = Collections.unmodifiableSet(set);
        this.f34152c = Collections.unmodifiableSet(set2);
        this.f34153d = i10;
        this.f34154e = i11;
        this.f34155f = interfaceC5514f;
        this.f34156g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static <T> a<T> m11743a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @SafeVarargs
    /* JADX INFO: renamed from: b */
    public static <T> C5511c<T> m11744b(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C5527s.m11765a(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
            hashSet.add(C5527s.m11765a(cls2));
        }
        return new C5511c<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new InterfaceC5514f() { // from class: fe.b
            @Override // p118fe.InterfaceC5514f
            /* JADX INFO: renamed from: k */
            public final Object mo35k(C5528t c5528t) {
                return t10;
            }
        }, hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f34151b.toArray()) + ">{" + this.f34153d + ", type=" + this.f34154e + ", deps=" + Arrays.toString(this.f34152c.toArray()) + "}";
    }
}
