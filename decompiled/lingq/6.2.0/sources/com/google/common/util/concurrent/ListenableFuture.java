package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public interface ListenableFuture extends Future {
    /* JADX INFO: renamed from: a */
    void mo52a(Runnable runnable, Executor executor);
}
