package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC2948e1;

/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractMapBasedMultimap<K, V> extends AbstractC2948e1 implements Serializable {

    /* JADX INFO: renamed from: d */
    public transient Map f13381d;

    /* JADX INFO: renamed from: e */
    public transient int f13382e;

    @Override // p000.AbstractC2948e1
    /* JADX INFO: renamed from: d */
    public final Collection mo6271d() {
        return new C1096l(this);
    }

    /* JADX INFO: renamed from: e */
    public final void m6272e() {
        Iterator<V> it = this.f13381d.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f13381d.clear();
        this.f13382e = 0;
    }
}
