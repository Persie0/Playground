package androidx.work.impl;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkerStoppedException extends CancellationException {

    /* JADX INFO: renamed from: a */
    public final int f7186a;

    public WorkerStoppedException(int i) {
        this.f7186a = i;
    }
}
