package androidx.datastore.core.okio;

import kotlin.coroutines.Continuation;
import p000.gj0;
import p000.hj0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public interface OkioSerializer<T> {
    T getDefaultValue();

    Object readFrom(hj0 hj0Var, Continuation<? super T> continuation);

    Object writeTo(T t, gj0 gj0Var, Continuation<? super xfa> continuation);
}
