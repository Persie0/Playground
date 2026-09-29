package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import p000.c83;
import p000.vi3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
public interface InterProcessCoordinator {
    c83 getUpdateNotifications();

    Object getVersion(Continuation<? super Integer> continuation);

    Object incrementAndGetVersion(Continuation<? super Integer> continuation);

    <T> Object lock(vi3 vi3Var, Continuation<? super T> continuation);

    <T> Object tryLock(zi3 zi3Var, Continuation<? super T> continuation);
}
