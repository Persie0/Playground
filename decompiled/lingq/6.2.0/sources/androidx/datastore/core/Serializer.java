package androidx.datastore.core;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, Continuation<? super T> continuation);

    Object writeTo(T t, OutputStream outputStream, Continuation<? super xfa> continuation);
}
