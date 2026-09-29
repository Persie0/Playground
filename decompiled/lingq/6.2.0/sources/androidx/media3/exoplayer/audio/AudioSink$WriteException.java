package androidx.media3.exoplayer.audio;

import androidx.media3.common.C0713b;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioSink$WriteException extends Exception {

    /* JADX INFO: renamed from: a */
    public final int f6450a;

    /* JADX INFO: renamed from: b */
    public final boolean f6451b;

    /* JADX INFO: renamed from: c */
    public final C0713b f6452c;

    public AudioSink$WriteException(int i, C0713b c0713b, boolean z) {
        super(ux5.m22988k(i, "AudioTrack write failed: "));
        this.f6451b = z;
        this.f6450a = i;
        this.f6452c = c0713b;
    }
}
