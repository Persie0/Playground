package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2370d implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public AudioProcessor.C2354a f11980b;

    /* JADX INFO: renamed from: c */
    public AudioProcessor.C2354a f11981c;

    /* JADX INFO: renamed from: d */
    public AudioProcessor.C2354a f11982d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C2354a f11983e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f11984f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f11985g;

    /* JADX INFO: renamed from: h */
    public boolean f11986h;

    public AbstractC2370d() {
        ByteBuffer byteBuffer = AudioProcessor.f11835a;
        this.f11984f = byteBuffer;
        this.f11985g = byteBuffer;
        AudioProcessor.C2354a c2354a = AudioProcessor.C2354a.f11836e;
        this.f11982d = c2354a;
        this.f11983e = c2354a;
        this.f11980b = c2354a;
        this.f11981c = c2354a;
    }

    /* JADX INFO: renamed from: a */
    public abstract AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException;

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public boolean mo6787b() {
        return this.f11983e != AudioProcessor.C2354a.f11836e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final void mo6788c() {
        flush();
        this.f11984f = AudioProcessor.f11835a;
        AudioProcessor.C2354a c2354a = AudioProcessor.C2354a.f11836e;
        this.f11982d = c2354a;
        this.f11983e = c2354a;
        this.f11980b = c2354a;
        this.f11981c = c2354a;
        mo6859k();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public boolean mo6789d() {
        return this.f11986h && this.f11985g == AudioProcessor.f11835a;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public ByteBuffer mo6790e() {
        ByteBuffer byteBuffer = this.f11985g;
        this.f11985g = AudioProcessor.f11835a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f11985g = AudioProcessor.f11835a;
        this.f11986h = false;
        this.f11980b = this.f11982d;
        this.f11981c = this.f11983e;
        mo6857i();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: g */
    public final AudioProcessor.C2354a mo6792g(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        this.f11982d = c2354a;
        this.f11983e = mo6856a(c2354a);
        return mo6787b() ? this.f11983e : AudioProcessor.C2354a.f11836e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: h */
    public final void mo6793h() {
        this.f11986h = true;
        mo6858j();
    }

    /* JADX INFO: renamed from: i */
    public void mo6857i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo6858j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo6859k() {
    }

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m6860l(int i10) {
        if (this.f11984f.capacity() < i10) {
            this.f11984f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f11984f.clear();
        }
        ByteBuffer byteBuffer = this.f11984f;
        this.f11985g = byteBuffer;
        return byteBuffer;
    }
}
