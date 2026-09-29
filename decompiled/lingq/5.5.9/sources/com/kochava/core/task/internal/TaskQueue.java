package com.kochava.core.task.internal;

/* JADX INFO: loaded from: classes.dex */
public enum TaskQueue {
    UI(true),
    Worker(true),
    IO(false);

    public final boolean ordered;

    TaskQueue(boolean z10) {
        this.ordered = z10;
    }
}
