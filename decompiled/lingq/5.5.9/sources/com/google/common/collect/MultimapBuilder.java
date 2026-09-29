package com.google.common.collect;

import androidx.fragment.app.C0987y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p482xd.InterfaceC10177i;

/* JADX INFO: loaded from: classes.dex */
public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements InterfaceC10177i<List<V>>, Serializable {

        /* JADX INFO: renamed from: a */
        public final int f16113a;

        public ArrayListSupplier(int i10) {
            C0987y.m3820b("expectedValuesPerKey", i10);
            this.f16113a = i10;
        }

        @Override // p482xd.InterfaceC10177i
        public final Object get() {
            return new ArrayList(this.f16113a);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$a */
    public static abstract class AbstractC3173a<K0, V0> extends MultimapBuilder<K0, V0> {
    }

    /* JADX INFO: renamed from: com.google.common.collect.MultimapBuilder$b */
    public static abstract class AbstractC3174b<K0> {
        /* JADX INFO: renamed from: a */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo9118a();
    }

    /* JADX INFO: renamed from: a */
    public static C3205x m9117a() {
        NaturalOrdering naturalOrdering = NaturalOrdering.f16115a;
        naturalOrdering.getClass();
        return new C3205x(naturalOrdering);
    }
}
