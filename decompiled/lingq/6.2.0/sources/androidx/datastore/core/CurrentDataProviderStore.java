package androidx.datastore.core;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes.dex */
public interface CurrentDataProviderStore<T> extends DataStore<T> {
    Object currentData(Continuation<? super T> continuation);
}
