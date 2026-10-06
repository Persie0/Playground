package com.google.android.libraries.camera.jni.jpeg;

import android.graphics.Rect;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;
import p000.kay;
import p000.kbi;
import p000.kpv;
import p000.kpw;
import p000.kxk;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class JpegUtilNative {
    static {
        kbi.m13939b(JpegUtilNative.class, "jpeg-jni");
    }

    /* JADX INFO: renamed from: a */
    public static int m4696a(kpw kpwVar, ByteBuffer byteBuffer, Rect rect, kay kayVar) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        lku.m15614I(byteBuffer.isDirect(), "Output buffer must be direct");
        lku.m15616K(rect.left < rect.right, "Invalid crop rectangle: %s", rect);
        lku.m15616K(rect.top < rect.bottom, "Invalid crop rectangle: %s", rect);
        lku.m15615J(kpwVar.mo7245a() == 35, "Only ImageFormat.YUV_420_888 is supported, found %s", kpwVar.mo7245a());
        List listMo7251g = kpwVar.mo7251g();
        kpv kpvVar = (kpv) listMo7251g.get(0);
        kpv kpvVar2 = (kpv) listMo7251g.get(1);
        kpv kpvVar3 = (kpv) listMo7251g.get(2);
        lku.m15613H(kpvVar.getBuffer().isDirect());
        lku.m15613H(kpvVar2.getBuffer().isDirect());
        lku.m15613H(kpvVar3.getBuffer().isDirect());
        lku.m15614I(kpvVar.getPixelStride() == 1, "Pixel stride for luma (Y) plane must be 1.");
        lku.m15614I(kpvVar2.getPixelStride() == 2, "Pixel stride for chroma (U) plane must be 2.");
        lku.m15614I(kpvVar3.getPixelStride() == 2, "Pixel stride for chroma (V) plane must be 2.");
        lku.m15614I(kpvVar2.getRowStride() == kpvVar3.getRowStride(), "Row strides for chroma planes (UV) must match.");
        byteBuffer.clear();
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        int iCompressJpegFromYUV420spNative = compressJpegFromYUV420spNative(iMo7247c, iMo7246b, kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), byteBuffer, 95, kxk.m14978X(rect.left, 0, iMo7247c - 1), kxk.m14978X(rect.top, 0, iMo7246b - 1), kxk.m14978X(rect.right, 0, iMo7247c), kxk.m14978X(rect.bottom, 0, iMo7246b), kayVar.f35503e);
        if (iCompressJpegFromYUV420spNative < byteBuffer.limit()) {
            byteBuffer.limit(iCompressJpegFromYUV420spNative);
        }
        Locale locale = Locale.ROOT;
        double dElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
        Double.isNaN(dElapsedRealtimeNanos);
        String.format(locale, "Compressed %d bytes in %.2fms", Integer.valueOf(iCompressJpegFromYUV420spNative), Double.valueOf(dElapsedRealtimeNanos / 1000000.0d));
        return iCompressJpegFromYUV420spNative;
    }

    private static native int compressJpegFromYUV420spNative(int i, int i2, Object obj, int i3, int i4, Object obj2, int i5, int i6, Object obj3, int i7, int i8, Object obj4, int i9, int i10, int i11, int i12, int i13, int i14);
}
