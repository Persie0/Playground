package io;

import java.util.Iterator;
import km.InterfaceC6719b;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: io.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6374a<K, V> implements Iterable<V>, InterfaceC5429a {

    /* JADX INFO: renamed from: io.a$a */
    public static abstract class a<K, V, T extends V> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC6719b<? extends K> f36773a;

        /* JADX INFO: renamed from: b */
        public final int f36774b;

        public a(InterfaceC6719b<? extends K> interfaceC6719b, int i10) {
            this.f36773a = interfaceC6719b;
            this.f36774b = i10;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC6375b<V> mo13005a();

    public final boolean isEmpty() {
        return ((AbstractC6377d) this).f36779a.mo13006a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return mo13005a().iterator();
    }
}
