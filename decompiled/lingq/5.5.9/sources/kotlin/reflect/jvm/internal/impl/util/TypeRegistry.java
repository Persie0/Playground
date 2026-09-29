package kotlin.reflect.jvm.internal.impl.util;

import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import km.InterfaceC6719b;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap<InterfaceC6719b<? extends K>, Integer> f39936a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f39937b = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public abstract <T extends K> int mo11273a(ConcurrentHashMap<InterfaceC6719b<? extends K>, Integer> concurrentHashMap, InterfaceC6719b<T> interfaceC6719b, InterfaceC2052l<? super InterfaceC6719b<? extends K>, Integer> interfaceC2052l);

    /* JADX INFO: renamed from: b */
    public final <T extends K> int m14243b(InterfaceC6719b<T> interfaceC6719b) {
        C5207g.m11111f(interfaceC6719b, "kClass");
        return mo11273a(this.f39936a, interfaceC6719b, new InterfaceC2052l<InterfaceC6719b<? extends K>, Integer>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$getId$1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ TypeRegistry<K, V> f39938b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f39938b = this;
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Integer mo528n(Object obj) {
                C5207g.m11111f((InterfaceC6719b) obj, "it");
                return Integer.valueOf(this.f39938b.f39937b.getAndIncrement());
            }
        });
    }
}
