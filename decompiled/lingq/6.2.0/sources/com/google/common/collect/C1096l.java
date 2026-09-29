package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p000.AbstractC2948e1;
import p000.C0794b1;

/* JADX INFO: renamed from: com.google.common.collect.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C1096l extends AbstractCollection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2948e1 f13472a;

    public C1096l(AbstractC2948e1 abstractC2948e1) {
        this.f13472a = abstractC2948e1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        ((AbstractMapBasedMultimap) this.f13472a).m6272e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f13472a.mo10786a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0794b1((AbstractMapBasedMultimap) this.f13472a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((AbstractMapBasedMultimap) this.f13472a).f13382e;
    }
}
