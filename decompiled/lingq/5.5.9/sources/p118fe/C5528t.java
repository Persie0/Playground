package p118fe;

import cf.InterfaceC2004a;
import cf.InterfaceC2005b;
import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p533ze.InterfaceC10481c;

/* JADX INFO: renamed from: fe.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5528t implements InterfaceC5512d {

    /* JADX INFO: renamed from: a */
    public final Set<C5527s<?>> f34200a;

    /* JADX INFO: renamed from: b */
    public final Set<C5527s<?>> f34201b;

    /* JADX INFO: renamed from: c */
    public final Set<C5527s<?>> f34202c;

    /* JADX INFO: renamed from: d */
    public final Set<C5527s<?>> f34203d;

    /* JADX INFO: renamed from: e */
    public final Set<C5527s<?>> f34204e;

    /* JADX INFO: renamed from: f */
    public final Set<Class<?>> f34205f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5512d f34206g;

    /* JADX INFO: renamed from: fe.t$a */
    public static class a implements InterfaceC10481c {

        /* JADX INFO: renamed from: a */
        public final Set<Class<?>> f34207a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC10481c f34208b;

        public a(Set<Class<?>> set, InterfaceC10481c interfaceC10481c) {
            this.f34207a = set;
            this.f34208b = interfaceC10481c;
        }
    }

    public C5528t(C5511c c5511c, C5519k c5519k) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C5521m c5521m : c5511c.f34152c) {
            int i10 = c5521m.f34184c;
            boolean z10 = i10 == 0;
            int i11 = c5521m.f34183b;
            C5527s<?> c5527s = c5521m.f34182a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(c5527s);
                } else {
                    hashSet.add(c5527s);
                }
            } else if (i10 == 2) {
                hashSet3.add(c5527s);
            } else if (i11 == 2) {
                hashSet5.add(c5527s);
            } else {
                hashSet2.add(c5527s);
            }
        }
        Set<Class<?>> set = c5511c.f34156g;
        if (!set.isEmpty()) {
            hashSet.add(C5527s.m11765a(InterfaceC10481c.class));
        }
        this.f34200a = Collections.unmodifiableSet(hashSet);
        this.f34201b = Collections.unmodifiableSet(hashSet2);
        this.f34202c = Collections.unmodifiableSet(hashSet3);
        this.f34203d = Collections.unmodifiableSet(hashSet4);
        this.f34204e = Collections.unmodifiableSet(hashSet5);
        this.f34205f = set;
        this.f34206g = c5519k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: a */
    public final <T> T mo11748a(Class<T> cls) {
        if (!this.f34200a.contains(C5527s.m11765a(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f34206g.mo11748a(cls);
        return !cls.equals(InterfaceC10481c.class) ? t10 : (T) new a(this.f34205f, (InterfaceC10481c) t10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: b */
    public final <T> T mo11749b(C5527s<T> c5527s) {
        if (this.f34200a.contains(c5527s)) {
            return (T) this.f34206g.mo11749b(c5527s);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", c5527s));
    }

    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: c */
    public final <T> InterfaceC2005b<T> mo11750c(Class<T> cls) {
        return mo11752e(C5527s.m11765a(cls));
    }

    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: d */
    public final <T> InterfaceC2004a<T> mo11751d(C5527s<T> c5527s) {
        if (this.f34202c.contains(c5527s)) {
            return this.f34206g.mo11751d(c5527s);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c5527s));
    }

    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: e */
    public final <T> InterfaceC2005b<T> mo11752e(C5527s<T> c5527s) {
        if (this.f34201b.contains(c5527s)) {
            return this.f34206g.mo11752e(c5527s);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", c5527s));
    }

    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: f */
    public final <T> InterfaceC2005b<Set<T>> mo11753f(C5527s<T> c5527s) {
        if (this.f34204e.contains(c5527s)) {
            return this.f34206g.mo11753f(c5527s);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c5527s));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p118fe.InterfaceC5512d
    /* JADX INFO: renamed from: g */
    public final <T> Set<T> mo11754g(C5527s<T> c5527s) {
        if (this.f34203d.contains(c5527s)) {
            return this.f34206g.mo11754g(c5527s);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", c5527s));
    }

    /* JADX INFO: renamed from: h */
    public final <T> InterfaceC2004a<T> m11766h(Class<T> cls) {
        return mo11751d(C5527s.m11765a(cls));
    }
}
