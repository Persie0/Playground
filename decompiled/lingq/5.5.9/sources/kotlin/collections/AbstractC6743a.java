package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p100em.InterfaceC5429a;

/* JADX INFO: renamed from: kotlin.collections.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6743a<T> implements Iterator<T>, InterfaceC5429a {

    /* JADX INFO: renamed from: a */
    public State f38045a = State.NotReady;

    /* JADX INFO: renamed from: b */
    public T f38046b;

    /* JADX INFO: renamed from: kotlin.collections.a$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38047a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38047a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo13008a();

    /* JADX INFO: renamed from: b */
    public final void m13374b() {
        this.f38045a = State.Done;
    }

    /* JADX INFO: renamed from: c */
    public final void m13375c(T t10) {
        this.f38046b = t10;
        this.f38045a = State.Ready;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        State state = this.f38045a;
        State state2 = State.Failed;
        if (!(state != state2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i10 = a.f38047a[state.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            this.f38045a = state2;
            mo13008a();
            if (this.f38045a != State.Ready) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f38045a = State.NotReady;
        return this.f38046b;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
