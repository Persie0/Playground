package com.google.babelfish.device.avenh.l2l.speechenhancer2.jni;

import com.google.android.material.behavior.iWN.zuAgeeF;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.igl;
import p000.mpu;
import p000.mpv;
import p000.mpw;
import p000.mpz;
import p000.mqa;
import p000.mqb;
import p000.mqi;
import p000.occ;
import p021j$.nio.file.Path;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SpeechEnhancerJniWrapperRealtime implements mpv {
    private static final long ILLEGAL_JNI_CONTEXT = -1;
    private final int audioChannels;
    private final mpu callback;
    private long jniContext;
    private final Path modelDirectory;
    private final float sampleRate;
    private final boolean skipInitGoogle;
    private final boolean useBatchMode;
    private final boolean useTpu;

    private SpeechEnhancerJniWrapperRealtime(boolean z, Path path, int i, float f, mpu mpuVar, boolean z2, boolean z3) {
        this.useBatchMode = z;
        this.modelDirectory = path;
        this.callback = mpuVar;
        this.skipInitGoogle = z2;
        this.useTpu = z3;
        this.jniContext = ILLEGAL_JNI_CONTEXT;
        this.audioChannels = i;
        this.sampleRate = f;
    }

    public /* synthetic */ SpeechEnhancerJniWrapperRealtime(boolean z, Path path, int i, float f, mpu mpuVar, boolean z2, boolean z3, mpw mpwVar) {
        this(z, path, i, f, mpuVar, z2, z3);
    }

    private native int avenhAudioBytesPerSample(long j);

    private native int avenhAudioNumberOfChannels(long j);

    private native float avenhAudioSampleRateHz(long j);

    private native void avenhCleanup(long j);

    private native int avenhFlush(long j);

    private native double avenhGetAllSpeechMixingRatio(long j);

    private native double avenhGetRawAudioMixingRatio(long j);

    private native boolean avenhHasAllSpeechOutput(long j);

    private native long avenhInit(String str, int i, float f, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5);

    private static native void avenhModelWarmup(String str, boolean z);

    private native int avenhNumberOfThumbnailImageChannels(long j);

    private native void avenhProvideFrame(long j, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native void avenhProvideFrameAndFace(long j, ByteBuffer byteBuffer, int i, int i2, int i3, ByteBuffer byteBuffer2);

    private native void avenhProvideRawAudio(long j, ByteBuffer byteBuffer);

    private native void avenhSetAllSpeechMixingRatio(long j, double d);

    private native void avenhSetRawAudioMixingRatio(long j, double d);

    private native int avenhThumbnailHeightPixels(long j);

    private native int avenhThumbnailWidthPixels(long j);

    private native int avenhVideoFramesPerSecond(long j);

    private static ByteBuffer byteArrayToDirectByteBuffer(byte[] bArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.position(0);
        return byteBufferAllocateDirect;
    }

    public static void modelWarmup(Path path, boolean z) {
        avenhModelWarmup(path.toString(), z);
    }

    public void cleanup() {
        long j = this.jniContext;
        if (j == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling cleanup().");
        }
        avenhCleanup(j);
    }

    @Override // p000.mpv
    public void flush() {
        long j = this.jniContext;
        if (j == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling flush().");
        }
        avenhFlush(j);
    }

    public double getAllSpeechMixingRatio() {
        long j = this.jniContext;
        if (j != ILLEGAL_JNI_CONTEXT) {
            return avenhGetAllSpeechMixingRatio(j);
        }
        throw new IllegalStateException(zuAgeeF.HYmS);
    }

    public double getRawAudioMixingRatio() {
        long j = this.jniContext;
        if (j != ILLEGAL_JNI_CONTEXT) {
            return avenhGetRawAudioMixingRatio(j);
        }
        throw new IllegalStateException("'initialize' must be called before calling getRawAudioMixingRatio().");
    }

    @Override // p000.mpv
    public mqb getSpeechEnhancerModelInfo() {
        if (this.jniContext == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling getSpeechEnhancerModelInfo().");
        }
        mqa mqaVarM16800a = mqb.m16800a();
        mqaVarM16800a.m16798g(avenhThumbnailWidthPixels(this.jniContext));
        mqaVarM16800a.m16797f(avenhThumbnailHeightPixels(this.jniContext));
        mqaVarM16800a.m16796e((mpz) mpz.f41314c.get(Integer.valueOf(avenhNumberOfThumbnailImageChannels(this.jniContext))));
        mqaVarM16800a.m16799h(avenhVideoFramesPerSecond(this.jniContext));
        mqaVarM16800a.m16795d(avenhAudioSampleRateHz(this.jniContext));
        mqaVarM16800a.m16793b(avenhAudioBytesPerSample(this.jniContext));
        mqaVarM16800a.m16794c(avenhAudioNumberOfChannels(this.jniContext));
        return mqaVarM16800a.m16792a();
    }

    public boolean hasAllSpeechOutput() {
        long j = this.jniContext;
        if (j != ILLEGAL_JNI_CONTEXT) {
            return avenhHasAllSpeechOutput(j);
        }
        throw new IllegalStateException("'initialize' must be called before calling hasAllSpeechOutput().");
    }

    @Override // p000.mpv
    public void initialize() {
        this.jniContext = avenhInit(this.modelDirectory.toString(), this.audioChannels, this.sampleRate, this.useBatchMode, this.skipInitGoogle, this.useTpu, "processedAudioJniCallback", "isSpeakingJniCallback", "mainSpeakerDetectedJniCallback", "onSwitchToAudioOnlyJniCallback");
    }

    public void isSpeakingJniCallback(float f) {
        this.callback.mo16742c();
    }

    public void mainSpeakerDetectedJniCallback(byte[] bArr) {
        mpu mpuVar = this.callback;
        Optional.ofNullable(bArr).map(igl.f30783p);
        mpuVar.mo16743d();
    }

    public void onSwitchToAudioOnlyJniCallback(int i) {
        this.callback.mo16741b(i);
    }

    public void processedAudioJniCallback(byte[] bArr) {
        this.callback.mo16740a(bArr);
    }

    @Override // p000.mpv
    public void provideRawAudio(byte[] bArr) {
        if (this.jniContext == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling provideRawAudio().");
        }
        avenhProvideRawAudio(this.jniContext, byteArrayToDirectByteBuffer(bArr));
    }

    @Override // p000.mpv
    public void provideVideoFrame(mqi mqiVar) {
        if (this.jniContext == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling provideVideoFrame().");
        }
        if (mqiVar.f41381e.isPresent()) {
            avenhProvideFrameAndFace(this.jniContext, mqiVar.f41377a, mqiVar.f41378b, mqiVar.f41379c, mqiVar.f41380d.f41316d, byteArrayToDirectByteBuffer(((occ) mqiVar.f41381e.get()).mo17760J()));
        } else {
            avenhProvideFrame(this.jniContext, mqiVar.f41377a, mqiVar.f41378b, mqiVar.f41379c, mqiVar.f41380d.f41316d);
        }
    }

    @Override // p000.mpv
    public void setAllSpeechMixingRatio(double d) {
        long j = this.jniContext;
        if (j == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling setAllSpeechMixingRatio().");
        }
        avenhSetAllSpeechMixingRatio(j, d);
    }

    @Override // p000.mpv
    public void setRawAudioMixingRatio(double d) {
        long j = this.jniContext;
        if (j == ILLEGAL_JNI_CONTEXT) {
            throw new IllegalStateException("'initialize' must be called before calling setRawAudioMixingRatio().");
        }
        avenhSetRawAudioMixingRatio(j, d);
    }
}
