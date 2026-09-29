package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import p000.aj3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public interface StorageConnection<T> extends Closeable {
    InterProcessCoordinator getCoordinator();

    <R> Object readScope(aj3 aj3Var, Continuation<? super R> continuation);

    Object writeScope(zi3 zi3Var, Continuation<? super xfa> continuation);
}
