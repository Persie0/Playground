package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.collect.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3179b0 extends AbstractIterator<Object> {

    /* JADX INFO: renamed from: c */
    public final Iterator<Object> f16145c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3181c0 f16146d;

    public C3179b0(C3181c0 c3181c0) {
        this.f16146d = c3181c0;
        this.f16145c = c3181c0.f16147a.iterator();
    }

    @Override // com.google.common.collect.AbstractIterator
    /* JADX INFO: renamed from: a */
    public final Object mo9017a() {
        Object next;
        do {
            Iterator<Object> it = this.f16145c;
            if (!it.hasNext()) {
                this.f15981a = AbstractIterator.State.DONE;
                return null;
            }
            next = it.next();
        } while (!this.f16146d.f16148b.contains(next));
        return next;
    }
}
