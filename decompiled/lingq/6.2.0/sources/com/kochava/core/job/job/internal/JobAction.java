package com.kochava.core.job.job.internal;

/* JADX INFO: loaded from: classes.dex */
public enum JobAction {
    Start,
    Complete,
    GoDelay,
    ResumeDelay,
    GoAsync,
    ResumeAsync,
    ResumeAsyncTimeOut,
    GoWaitForDependencies,
    ResumeWaitForDependencies,
    TimedOut
}
