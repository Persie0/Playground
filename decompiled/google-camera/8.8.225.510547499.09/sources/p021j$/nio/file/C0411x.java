package p021j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;
import p021j$.lang.InterfaceC0305a;
import p021j$.lang.Iterable$EL;
import p021j$.util.AbstractC0517U;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.nio.file.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C0411x implements Iterable, InterfaceC0305a {

    /* JADX INFO: renamed from: a */
    private final Iterable f32898a;

    public C0411x(Iterable iterable) {
        this.f32898a = iterable;
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        Iterable$EL.m12057a(this.f32898a, new C0409v(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0412y(this.f32898a.iterator());
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        return AbstractC0517U.m12524n(iterator());
    }
}
