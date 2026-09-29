package com.google.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p482xd.AbstractC10169a;
import p482xd.C10174f;
import p482xd.C10176h;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a */
    public State f15975a = State.NOT_READY;

    /* JADX INFO: renamed from: b */
    public String f15976b;

    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* JADX INFO: renamed from: com.google.common.base.AbstractIterator$a */
    public static /* synthetic */ class C3127a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15977a;

        static {
            int[] iArr = new int[State.values().length];
            f15977a = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15977a[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC10169a abstractC10169a;
        State state = this.f15975a;
        State state2 = State.FAILED;
        if (!(state != state2)) {
            throw new IllegalStateException();
        }
        int i10 = C3127a.f15977a[state.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        this.f15975a = state2;
        C10176h.a aVar = (C10176h.a) this;
        int i11 = aVar.f51495f;
        while (true) {
            int i12 = aVar.f51495f;
            if (i12 == -1) {
                aVar.f15975a = State.DONE;
                string = null;
                break;
            }
            C10174f c10174f = (C10174f) aVar;
            int iMo19188a = c10174f.f51487h.f51488a.mo19188a(i12, c10174f.f51492c);
            CharSequence charSequence = aVar.f51492c;
            if (iMo19188a == -1) {
                iMo19188a = charSequence.length();
                aVar.f51495f = -1;
            } else {
                aVar.f51495f = iMo19188a + 1;
            }
            int i13 = aVar.f51495f;
            if (i13 == i11) {
                int i14 = i13 + 1;
                aVar.f51495f = i14;
                if (i14 > charSequence.length()) {
                    aVar.f51495f = -1;
                }
            } else {
                while (true) {
                    abstractC10169a = aVar.f51493d;
                    if (i11 >= iMo19188a || !abstractC10169a.mo19189b(charSequence.charAt(i11))) {
                        break;
                    }
                    i11++;
                }
                while (iMo19188a > i11) {
                    int i15 = iMo19188a - 1;
                    if (!abstractC10169a.mo19189b(charSequence.charAt(i15))) {
                        break;
                    }
                    iMo19188a = i15;
                }
                if (!aVar.f51494e || i11 != iMo19188a) {
                    int i16 = aVar.f51496g;
                    if (i16 == 1) {
                        iMo19188a = charSequence.length();
                        aVar.f51495f = -1;
                        while (iMo19188a > i11) {
                            int i17 = iMo19188a - 1;
                            if (!abstractC10169a.mo19189b(charSequence.charAt(i17))) {
                                break;
                            }
                            iMo19188a = i17;
                        }
                    } else {
                        aVar.f51496g = i16 - 1;
                    }
                    string = charSequence.subSequence(i11, iMo19188a).toString();
                    break;
                }
                i11 = aVar.f51495f;
            }
        }
        this.f15976b = string;
        if (this.f15975a == State.DONE) {
            return false;
        }
        this.f15975a = State.READY;
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15975a = State.NOT_READY;
        T t10 = (T) this.f15976b;
        this.f15976b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
