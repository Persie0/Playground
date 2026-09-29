package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
public interface DataMigration<T> {
    Object cleanUp(Continuation<? super xfa> continuation);

    Object migrate(T t, Continuation<? super T> continuation);

    Object shouldMigrate(T t, Continuation<? super Boolean> continuation);
}
