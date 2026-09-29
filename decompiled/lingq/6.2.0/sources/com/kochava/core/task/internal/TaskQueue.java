package com.kochava.core.task.internal;

/* JADX INFO: loaded from: classes.dex */
public enum TaskQueue {
    UI(true),
    Worker(true),
    IO(false),
    Primary(true);

    public final boolean ordered;

    TaskQueue(boolean z) {
        this.ordered = z;
    }
}
