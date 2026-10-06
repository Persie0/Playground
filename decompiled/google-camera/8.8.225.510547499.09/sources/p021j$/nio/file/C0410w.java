package p021j$.nio.file;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.util.Iterator;
import java.util.function.Consumer;
import p021j$.lang.InterfaceC0305a;
import p021j$.lang.Iterable$EL;
import p021j$.util.AbstractC0517U;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.nio.file.w */
/* JADX INFO: loaded from: classes3.dex */
public final class C0410w implements DirectoryStream, InterfaceC0305a {

    /* JADX INFO: renamed from: a */
    private final DirectoryStream f32897a;

    public C0410w(DirectoryStream directoryStream) {
        this.f32897a = directoryStream;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f32897a.close();
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        Iterable$EL.m12057a(this.f32897a, new C0409v(consumer, 0));
    }

    @Override // java.nio.file.DirectoryStream, java.lang.Iterable
    public final Iterator iterator() {
        return new C0412y(this.f32897a.iterator());
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        return AbstractC0517U.m12524n(iterator());
    }
}
