package p021j$.util.stream;

import java.util.Iterator;
import p021j$.util.Spliterator;
import p021j$.util.stream.BaseStream;

/* JADX INFO: loaded from: classes3.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    /* JADX INFO: renamed from: a */
    boolean mo12606a();

    @Override // java.lang.AutoCloseable
    void close();

    Iterator<T> iterator();

    S onClose(Runnable runnable);

    Spliterator<T> spliterator();
}
