package com.google.googlex.gcam.hdrplus;

import com.google.googlex.gcam.base.function.IntByteArrayConsumer;
import com.google.googlex.gcam.base.function.IntConsumer;
import com.google.googlex.gcam.base.function.IntFloatConsumer;
import com.google.googlex.gcam.base.function.IntLongConsumer;
import com.google.googlex.gcam.base.function.IntStringConsumer;
import com.google.googlex.gcam.clientallocator.GrayS16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import com.google.googlex.gcam.clientallocator.RawClientAllocator;
import com.google.googlex.gcam.clientallocator.YuvClientAllocator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.nsx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class NativeHdrPlusInterface implements nsx {

    /* JADX INFO: renamed from: a */
    private static final Object f8401a = new Object();

    /* JADX INFO: renamed from: b */
    private static final AtomicBoolean f8402b = new AtomicBoolean();

    public NativeHdrPlusInterface() {
        synchronized (f8401a) {
            AtomicBoolean atomicBoolean = f8402b;
            if (atomicBoolean.get()) {
                return;
            }
            init();
            atomicBoolean.set(true);
        }
    }

    private static native void init();

    private native void nativeSetFinalImageRgb16Allocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    private native void nativeSetFrameRescorerCallback(long j, FrameRescorerCallback frameRescorerCallback);

    public native boolean nativeAddPayloadFrame(long j, int i, long j2, long j3, long j4, Runnable runnable, long j5, Runnable runnable2, long j6, Runnable runnable3);

    public native void nativeAddViewfinderFrame(long j, int i, long j2, long j3, long j4, long j5, Runnable runnable);

    public native float nativeGetPostZoomSharpenStrength(long j, float f);

    public native void nativeInitializeLancetFromOpenFile(int i, long j, long j2, boolean z, long j3);

    public native void nativeInitializePecanFromOpenFile(int i, long j, long j2, long j3);

    public native void nativeSetBaseFrameAeCallback(long j, BaseFrameAeCallback baseFrameAeCallback);

    public native void nativeSetBaseFrameCallback(long j, BaseFrameCallback baseFrameCallback);

    public native void nativeSetFinalImageCallback(long j, ManagedImageCallback managedImageCallback);

    public native void nativeSetFinalImageRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void nativeSetFinalImageYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void nativeSetMergedDngCallback(long j, EncodedBlobCallback encodedBlobCallback);

    public native void nativeSetMergedLumaDenoisedAllocator(long j, GrayS16ClientAllocator grayS16ClientAllocator);

    public native void nativeSetMergedLumaDenoisedCallback(long j, MergedLumaDenoisedCallback mergedLumaDenoisedCallback);

    public native void nativeSetMergedPdAllocator(long j, InterleavedU16ClientAllocator interleavedU16ClientAllocator);

    public native void nativeSetMergedPdCallback(long j, IntLongConsumer intLongConsumer);

    public native void nativeSetMergedRawImageAllocator(long j, RawClientAllocator rawClientAllocator);

    public native void nativeSetMergedRawImageCallback(long j, MergedRawCallback mergedRawCallback);

    public native void nativeSetMutableMergedRawCallback(long j, MutableMergedRawCallback mutableMergedRawCallback);

    public native void nativeSetPostviewCallback(long j, ManagedImageCallback managedImageCallback);

    public native void nativeSetPostviewRgbAllocator(long j, InterleavedU8ClientAllocator interleavedU8ClientAllocator);

    public native void nativeSetPostviewYuvAllocator(long j, YuvClientAllocator yuvClientAllocator);

    public native void nativeSetProgressCallback(long j, IntFloatConsumer intFloatConsumer);

    public native void nativeSetShotStatusCallbacks(long j, IntByteArrayConsumer intByteArrayConsumer, IntStringConsumer intStringConsumer, IntConsumer intConsumer);

    public native boolean nativeTemporallyBinViewfinderFrame(long j, int i, long j2, long j3, Runnable runnable, long j4, Runnable runnable2, long j5, long j6, Runnable runnable3, boolean z, int i2);
}
