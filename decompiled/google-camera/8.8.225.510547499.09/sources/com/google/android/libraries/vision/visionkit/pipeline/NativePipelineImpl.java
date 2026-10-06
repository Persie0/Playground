package com.google.android.libraries.vision.visionkit.pipeline;

import android.util.Log;
import java.nio.ByteBuffer;
import p000.lvd;
import p000.mer;
import p000.met;
import p000.mew;
import p000.nxf;
import p000.nxq;
import p000.nyb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NativePipelineImpl implements mer {

    /* JADX INFO: renamed from: a */
    private nxf f7996a;

    /* JADX INFO: renamed from: b */
    private met f7997b;

    /* JADX INFO: renamed from: c */
    private met f7998c;

    public NativePipelineImpl(met metVar, met metVar2, nxf nxfVar) {
        this.f7997b = metVar;
        this.f7998c = metVar2;
        this.f7996a = nxfVar;
    }

    public NativePipelineImpl(met metVar, met metVar2, nxf nxfVar, byte[] bArr) {
        this(metVar, metVar2, nxfVar);
        System.loadLibrary("camerapipeline");
    }

    @Override // p000.mer
    /* JADX INFO: renamed from: a */
    public final void mo4733a() {
        this.f7996a = null;
        this.f7997b = null;
        this.f7998c = null;
    }

    @Override // p000.mer
    public native void close(long j, long j2, long j3, long j4);

    @Override // p000.mer
    public native boolean disableSubpipeline(long j, String str);

    @Override // p000.mer
    public native boolean enableSubpipeline(long j, String str);

    @Override // p000.mer
    public native long initialize(byte[] bArr, long j, long j2, long j3, long j4);

    @Override // p000.mer
    public native long initializeFrameBufferReleaseCallback(long j);

    @Override // p000.mer
    public native long initializeFrameManager();

    @Override // p000.mer
    public native long initializeResultsCallback();

    public void onReleaseAtTimestampUs(long j) {
        this.f7997b.mo6005a(j);
    }

    public void onResult(byte[] bArr) {
        try {
            nxq nxqVarM18123Q = nxq.m18123Q(mew.f40254f, bArr, 0, bArr.length, this.f7996a);
            nxq.m18132ae(nxqVarM18123Q);
            this.f7998c.mo6006b((mew) nxqVarM18123Q);
        } catch (nyb e) {
            lvd lvdVar = lvd.f39383a;
            Object[] objArr = new Object[0];
            if (lvdVar.m16091e(6)) {
                Log.e(lvdVar.f39384b, lvdVar.m16087a("Error in result from JNI layer", objArr), e);
            }
        }
    }

    @Override // p000.mer
    public native boolean receiveYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    @Override // p000.mer
    public native void resetSchedulingOptimizerOptions(long j, byte[] bArr);

    @Override // p000.mer
    public native void start(long j);

    @Override // p000.mer
    public native boolean stop(long j);

    @Override // p000.mer
    public native void waitUntilIdle(long j);
}
