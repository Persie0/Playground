package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyn implements jys {

    /* JADX INFO: renamed from: a */
    private final nps f35197a;

    public jyn(nps npsVar) {
        this.f35197a = npsVar;
    }

    /* JADX INFO: renamed from: q */
    private final jys m13719q() {
        try {
            return (jys) this.f35197a.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("MuxerProcessor isn't available", e);
        }
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: a */
    public final mrm mo13720a(MediaFormat mediaFormat) {
        return m13719q().mo13720a(mediaFormat);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: b */
    public final void mo13721b(MediaFormat mediaFormat) {
        m13719q().mo13721b(mediaFormat);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: c */
    public final void mo13722c(jyt jytVar) {
        m13719q().mo13722c(jytVar);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        m13719q().close();
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: d */
    public final void mo13723d(long j) {
        m13719q().mo13723d(j);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: e */
    public final void mo13724e(MediaFormat mediaFormat) {
        m13719q().mo13724e(mediaFormat);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: f */
    public final void mo13725f() {
        m13719q().mo13725f();
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: g */
    public final void mo13726g(jyt jytVar) {
        m13719q().mo13726g(jytVar);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: h */
    public final void mo13727h(FileDescriptor fileDescriptor) {
        m13719q().mo13727h(fileDescriptor);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: i */
    public final void mo13728i() {
        m13719q().mo13728i();
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: j */
    public final void mo13729j(long j) {
        m13719q().mo13729j(j);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: k */
    public final void mo13730k() {
        m13719q().mo13730k();
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: l */
    public final void mo13731l(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m13719q().mo13731l(byteBuffer, bufferInfo);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: m */
    public final void mo13732m(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        m13719q().mo13732m(byteBuffer, bufferInfo, i);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: n */
    public final void mo13733n(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        m13719q().mo13733n(byteBuffer, bufferInfo);
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: o */
    public final boolean mo13734o() {
        if (this.f35197a.isDone()) {
            return m13719q().mo13734o();
        }
        return false;
    }

    @Override // p000.jys
    /* JADX INFO: renamed from: p */
    public final void mo13735p(Object obj) {
        m13719q().mo13735p(obj);
    }
}
