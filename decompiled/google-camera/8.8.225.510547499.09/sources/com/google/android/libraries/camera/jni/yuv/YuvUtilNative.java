package com.google.android.libraries.camera.jni.yuv;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.util.List;
import p000.kbi;
import p000.knq;
import p000.kpv;
import p000.kpw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class YuvUtilNative {
    static {
        kbi.m13939b(YuvUtilNative.class, "yuv-jni");
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m4697a(kpw kpwVar) {
        knq knqVar = knq.ROTATION_0;
        List listMo7251g = kpwVar.mo7251g();
        kpv kpvVar = (kpv) listMo7251g.get(0);
        kpv kpvVar2 = (kpv) listMo7251g.get(1);
        kpv kpvVar3 = (kpv) listMo7251g.get(2);
        ByteBuffer buffer = kpvVar.getBuffer();
        ByteBuffer buffer2 = kpvVar2.getBuffer();
        ByteBuffer buffer3 = kpvVar3.getBuffer();
        int iMo7247c = kpwVar.mo7247c();
        int iMo7246b = kpwVar.mo7246b();
        int[] iArr = new int[iMo7247c * iMo7246b];
        if (convertYUV420ToARGBNative(kpwVar.mo7247c(), kpwVar.mo7246b(), buffer, kpvVar.getPixelStride(), kpvVar.getRowStride(), buffer2, kpvVar2.getPixelStride(), kpvVar2.getRowStride(), buffer3, kpvVar3.getPixelStride(), kpvVar3.getRowStride(), iArr, knqVar.f36645i)) {
            return knqVar.f36646j ? Bitmap.createBitmap(iArr, iMo7246b, iMo7247c, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(iArr, iMo7247c, iMo7246b, Bitmap.Config.ARGB_8888);
        }
        return null;
    }

    private static native boolean convertYUV420ToARGBNative(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, int[] iArr, int i9);

    public static native boolean copyYUV_420_888Native(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, ByteBuffer byteBuffer6, int i6, int i7, int i8);

    public static native boolean downsampleYUV_420_888toNV21Native(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6, ByteBuffer byteBuffer3, int i7, int i8, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5, int i9);

    private static native boolean generateCircleThumbnailNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4, ByteBuffer byteBuffer3, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr);
}
