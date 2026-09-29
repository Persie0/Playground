package com.downloader;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class Progress implements Serializable {

    /* JADX INFO: renamed from: a */
    public final long f11366a;

    /* JADX INFO: renamed from: b */
    public final long f11367b;

    public Progress(long j10, long j11) {
        this.f11366a = j10;
        this.f11367b = j11;
    }

    public final String toString() {
        return "Progress{currentBytes=" + this.f11366a + ", totalBytes=" + this.f11367b + '}';
    }
}
