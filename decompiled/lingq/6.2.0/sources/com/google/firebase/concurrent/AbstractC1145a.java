package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.concurrent.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1145a {
    /* JADX INFO: renamed from: a */
    public static Executor m6669a() {
        return FirebaseExecutors$DirectExecutor.INSTANCE;
    }
}
