package com.google.googlex.gcam.clientallocator;

import com.google.googlex.gcam.base.LongPair;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface GrayS16ClientAllocator {
    LongPair allocate(int i, int i2);

    void doneWriting(long j);
}
