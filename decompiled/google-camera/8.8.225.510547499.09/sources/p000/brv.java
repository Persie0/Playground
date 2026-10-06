package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brv extends WeakReference {

    /* JADX INFO: renamed from: a */
    final bqn f4237a;

    /* JADX INFO: renamed from: b */
    final boolean f4238b;

    /* JADX INFO: renamed from: c */
    bsz f4239c;

    public brv(bqn bqnVar, bst bstVar, ReferenceQueue referenceQueue) {
        super(bstVar, referenceQueue);
        bzq.m3278r(bqnVar);
        this.f4237a = bqnVar;
        this.f4239c = null;
        this.f4238b = bstVar.f4377a;
    }

    /* JADX INFO: renamed from: a */
    final void m2960a() {
        this.f4239c = null;
        clear();
    }
}
