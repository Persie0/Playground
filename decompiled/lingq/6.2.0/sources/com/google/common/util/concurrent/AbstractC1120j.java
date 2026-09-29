package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import p000.j93;
import p000.z16;

/* JADX INFO: renamed from: com.google.common.util.concurrent.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1120j {
    /* JADX INFO: renamed from: a */
    public static Executor m6404a() {
        return DirectExecutor.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Executor m6405b(Executor executor, j93 j93Var) {
        executor.getClass();
        return executor == DirectExecutor.INSTANCE ? executor : new z16(executor, j93Var);
    }
}
