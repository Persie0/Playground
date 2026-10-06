package p021j$.util.stream;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.util.stream.l */
/* JADX INFO: loaded from: classes3.dex */
final class C0682l extends AbstractC0625S0 {
    C0682l(AbstractC0655c abstractC0655c, int i) {
        super(abstractC0655c, i);
    }

    /* JADX INFO: renamed from: U */
    static C0627T m12723U(AbstractC0655c abstractC0655c, Spliterator spliterator) {
        C0652b c0652b = new C0652b(25);
        C0652b c0652b2 = new C0652b(26);
        return new C0627T((Collection) new C0596I0(EnumC0714v1.REFERENCE, new C0652b(27), c0652b2, c0652b).mo12619c(abstractC0655c, spliterator));
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: M */
    final InterfaceC0613O mo12686M(Spliterator spliterator, AbstractC0655c abstractC0655c, IntFunction intFunction) {
        if (EnumC0711u1.DISTINCT.m12740e(abstractC0655c.mo12665x())) {
            return abstractC0655c.m12689C(spliterator, false, intFunction);
        }
        if (EnumC0711u1.ORDERED.m12740e(abstractC0655c.mo12665x())) {
            return m12723U(abstractC0655c, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new C0697q(new C0673i(0, atomicBoolean, concurrentHashMap), false).mo12619c(abstractC0655c, spliterator);
        Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new C0627T(setKeySet);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: N */
    final Spliterator mo12687N(AbstractC0655c abstractC0655c, Spliterator spliterator) {
        if (EnumC0711u1.DISTINCT.m12740e(abstractC0655c.mo12665x())) {
            return abstractC0655c.m12696T(spliterator);
        }
        return EnumC0711u1.ORDERED.m12740e(abstractC0655c.mo12665x()) ? m12723U(abstractC0655c, spliterator).spliterator() : new C0579C1(abstractC0655c.m12696T(spliterator));
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: P */
    final InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        if (EnumC0711u1.DISTINCT.m12740e(i)) {
            return interfaceC0646Z0;
        }
        return EnumC0711u1.SORTED.m12740e(i) ? new C0676j(interfaceC0646Z0) : new C0679k(interfaceC0646Z0);
    }
}
