package com.kochava.core.job.job.internal;

/* JADX INFO: loaded from: classes.dex */
public enum JobState {
    Pending,
    Complete,
    Running,
    RunningDelay,
    RunningAsync,
    RunningWaitForDependencies
}
