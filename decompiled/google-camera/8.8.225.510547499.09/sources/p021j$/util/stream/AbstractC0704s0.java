package p021j$.util.stream;

import java.util.ArrayDeque;
import java.util.Comparator;
import p021j$.util.InterfaceC0498A;
import p021j$.util.InterfaceC0569r;
import p021j$.util.InterfaceC0728u;
import p021j$.util.InterfaceC0731x;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.s0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0704s0 implements Spliterator {

    /* JADX INFO: renamed from: a */
    InterfaceC0613O f33474a;

    /* JADX INFO: renamed from: b */
    int f33475b;

    /* JADX INFO: renamed from: c */
    Spliterator f33476c;

    /* JADX INFO: renamed from: d */
    Spliterator f33477d;

    /* JADX INFO: renamed from: e */
    ArrayDeque f33478e;

    AbstractC0704s0(InterfaceC0613O interfaceC0613O) {
        this.f33474a = interfaceC0613O;
    }

    /* JADX INFO: renamed from: a */
    protected static InterfaceC0613O m12731a(ArrayDeque arrayDeque) {
        while (true) {
            InterfaceC0613O interfaceC0613O = (InterfaceC0613O) arrayDeque.pollFirst();
            if (interfaceC0613O == null) {
                return null;
            }
            if (interfaceC0613O.mo12604u() != 0) {
                int iMo12604u = interfaceC0613O.mo12604u();
                while (true) {
                    iMo12604u--;
                    if (iMo12604u >= 0) {
                        arrayDeque.addFirst(interfaceC0613O.mo12597c(iMo12604u));
                    }
                }
            } else if (interfaceC0613O.count() > 0) {
                return interfaceC0613O;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    protected final ArrayDeque m12732b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iMo12604u = this.f33474a.mo12604u();
        while (true) {
            iMo12604u--;
            if (iMo12604u < this.f33475b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f33474a.mo12597c(iMo12604u));
        }
    }

    /* JADX INFO: renamed from: c */
    protected final boolean m12733c() {
        if (this.f33474a == null) {
            return false;
        }
        if (this.f33477d != null) {
            return true;
        }
        Spliterator spliterator = this.f33476c;
        if (spliterator == null) {
            ArrayDeque arrayDequeM12732b = m12732b();
            this.f33478e = arrayDequeM12732b;
            InterfaceC0613O interfaceC0613OM12731a = m12731a(arrayDequeM12732b);
            if (interfaceC0613OM12731a == null) {
                this.f33474a = null;
                return false;
            }
            spliterator = interfaceC0613OM12731a.spliterator();
        }
        this.f33477d = spliterator;
        return true;
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f33474a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f33476c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i = this.f33475b; i < this.f33474a.mo12604u(); i++) {
            jCount += this.f33474a.mo12597c(i).count();
        }
        return jCount;
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0569r trySplit() {
        return (InterfaceC0569r) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0728u trySplit() {
        return (InterfaceC0728u) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0731x trySplit() {
        return (InterfaceC0731x) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC0498A trySplit() {
        return (InterfaceC0498A) trySplit();
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        InterfaceC0613O interfaceC0613O = this.f33474a;
        if (interfaceC0613O == null || this.f33477d != null) {
            return null;
        }
        Spliterator spliterator = this.f33476c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f33475b < interfaceC0613O.mo12604u() - 1) {
            InterfaceC0613O interfaceC0613O2 = this.f33474a;
            int i = this.f33475b;
            this.f33475b = i + 1;
            return interfaceC0613O2.mo12597c(i).spliterator();
        }
        InterfaceC0613O interfaceC0613OMo12597c = this.f33474a.mo12597c(this.f33475b);
        this.f33474a = interfaceC0613OMo12597c;
        if (interfaceC0613OMo12597c.mo12604u() == 0) {
            Spliterator spliterator2 = this.f33474a.spliterator();
            this.f33476c = spliterator2;
            return spliterator2.trySplit();
        }
        InterfaceC0613O interfaceC0613O3 = this.f33474a;
        this.f33475b = 0 + 1;
        return interfaceC0613O3.mo12597c(0).spliterator();
    }
}
