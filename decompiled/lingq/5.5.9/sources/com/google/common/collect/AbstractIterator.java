package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIterator<T> extends AbstractC3187f0<T> {

    /* JADX INFO: renamed from: a */
    public State f15981a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public T f15982b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.collect.AbstractIterator$a */
    public static /* synthetic */ class C3128a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15983a;

        static {
            int[] iArr = new int[State.values().length];
            f15983a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15983a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo9017a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.f15981a;
        State state2 = State.FAILED;
        boolean z10 = false;
        if (!(state != state2)) {
            throw new IllegalStateException();
        }
        int i10 = C3128a.f15983a[state.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        this.f15981a = state2;
        this.f15982b = mo9017a();
        if (this.f15981a != State.DONE) {
            this.f15981a = State.READY;
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15981a = State.NOT_READY;
        T t10 = this.f15982b;
        this.f15982b = null;
        return t10;
    }
}
