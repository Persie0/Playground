package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public interface WriteScope<T> extends ReadScope<T> {
    Object writeData(T t, Continuation<? super xfa> continuation);
}
