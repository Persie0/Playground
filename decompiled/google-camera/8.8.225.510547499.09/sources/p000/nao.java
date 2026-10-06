package p000;

import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nao extends nai implements Queue {
    private static final long serialVersionUID = 0;

    public nao(Queue queue) {
        super(queue, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p000.nai
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Queue mo17199a() {
        return (Queue) super.mo17199a();
    }

    @Override // java.util.Queue
    public final Object element() {
        Object objElement;
        synchronized (this.f41902h) {
            objElement = mo17199a().element();
        }
        return objElement;
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        boolean zOffer;
        synchronized (this.f41902h) {
            zOffer = mo17199a().offer(obj);
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public final Object peek() {
        Object objPeek;
        synchronized (this.f41902h) {
            objPeek = mo17199a().peek();
        }
        return objPeek;
    }

    @Override // java.util.Queue
    public final Object poll() {
        Object objPoll;
        synchronized (this.f41902h) {
            objPoll = mo17199a().poll();
        }
        return objPoll;
    }

    @Override // java.util.Queue
    public final Object remove() {
        Object objRemove;
        synchronized (this.f41902h) {
            objRemove = mo17199a().remove();
        }
        return objRemove;
    }
}
