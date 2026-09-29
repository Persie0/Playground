package kotlin.coroutines;

import p000.kn1;

/* JADX INFO: loaded from: classes.dex */
public interface Continuation<T> {
    kn1 getContext();

    void resumeWith(Object obj);
}
