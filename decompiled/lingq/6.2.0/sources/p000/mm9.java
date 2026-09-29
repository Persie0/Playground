package p000;

import java.util.ListIterator;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class mm9 implements ListIterator, tg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$IntRef f51535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nm9 f51536b;

    public mm9(Ref$IntRef ref$IntRef, nm9 nm9Var) {
        this.f51535a = ref$IntRef;
        this.f51536b = nm9Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f51535a.f47716a < this.f51536b.f52973d - 1;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f51535a.f47716a >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        Ref$IntRef ref$IntRef = this.f51535a;
        int i = ref$IntRef.f47716a + 1;
        nm9 nm9Var = this.f51536b;
        AbstractC3584sr.m21640r(i, nm9Var.f52973d);
        ref$IntRef.f47716a = i;
        return nm9Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f51535a.f47716a + 1;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        Ref$IntRef ref$IntRef = this.f51535a;
        int i = ref$IntRef.f47716a;
        nm9 nm9Var = this.f51536b;
        AbstractC3584sr.m21640r(i, nm9Var.f52973d);
        ref$IntRef.f47716a = i - 1;
        return nm9Var.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f51535a.f47716a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }
}
