package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
enum zzh implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C1172a.m6770a().f13909a.post(runnable);
    }
}
