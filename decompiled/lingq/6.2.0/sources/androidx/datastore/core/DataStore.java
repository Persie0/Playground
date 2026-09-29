package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import p000.c83;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public interface DataStore<T> {
    c83 getData();

    Object updateData(zi3 zi3Var, Continuation<? super T> continuation);
}
