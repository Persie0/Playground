package androidx.media3.exoplayer.audio;

import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioOutput$WriteException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f6446a;

    /* JADX INFO: renamed from: b */
    public final boolean f6447b;

    public AudioOutput$WriteException(int i, boolean z) {
        super(ux5.m22988k(i, "AudioOutput write failed: "));
        this.f6447b = z;
        this.f6446a = i;
    }
}
