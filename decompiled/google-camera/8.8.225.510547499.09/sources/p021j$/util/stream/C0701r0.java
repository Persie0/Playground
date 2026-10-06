package p021j$.util.stream;

import java.util.ArrayDeque;
import java.util.function.Consumer;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.r0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0701r0 extends AbstractC0704s0 {
    C0701r0(InterfaceC0613O interfaceC0613O) {
        super(interfaceC0613O);
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f33474a == null) {
            return;
        }
        if (this.f33477d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.f33476c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeM12732b = m12732b();
        while (true) {
            InterfaceC0613O interfaceC0613OM12731a = AbstractC0704s0.m12731a(arrayDequeM12732b);
            if (interfaceC0613OM12731a == null) {
                this.f33474a = null;
                return;
            }
            interfaceC0613OM12731a.forEach(consumer);
        }
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        InterfaceC0613O interfaceC0613OM12731a;
        if (!m12733c()) {
            return false;
        }
        boolean zTryAdvance = this.f33477d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f33476c == null && (interfaceC0613OM12731a = AbstractC0704s0.m12731a(this.f33478e)) != null) {
                Spliterator spliterator = interfaceC0613OM12731a.spliterator();
                this.f33477d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f33474a = null;
        }
        return zTryAdvance;
    }
}
