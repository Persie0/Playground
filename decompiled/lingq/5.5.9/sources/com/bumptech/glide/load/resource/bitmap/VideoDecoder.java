package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p007a6.C0028g;
import p356r5.C8734d;
import p356r5.C8735e;
import p356r5.InterfaceC8736f;
import p392t5.InterfaceC9207m;
import p407u5.InterfaceC9452c;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoder<T> implements InterfaceC8736f<T, Bitmap> {

    /* JADX INFO: renamed from: d */
    public static final C8734d<Long> f10815d = new C8734d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C2133a());

    /* JADX INFO: renamed from: e */
    public static final C8734d<Integer> f10816e = new C8734d<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C2134b());

    /* JADX INFO: renamed from: f */
    public static final C2138f f10817f = new C2138f();

    /* JADX INFO: renamed from: g */
    public static final List<String> f10818g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a */
    public final InterfaceC2137e<T> f10819a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9452c f10820b;

    /* JADX INFO: renamed from: c */
    public final C2138f f10821c = f10817f;

    public static final class VideoDecoderException extends RuntimeException {
        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$a */
    public class C2133a implements C8734d.b<Long> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f10822a = ByteBuffer.allocate(8);

        @Override // p356r5.C8734d.b
        /* JADX INFO: renamed from: a */
        public final void mo6346a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            Long l11 = l10;
            messageDigest.update(bArr);
            synchronized (this.f10822a) {
                this.f10822a.position(0);
                messageDigest.update(this.f10822a.putLong(l11.longValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$b */
    public class C2134b implements C8734d.b<Integer> {

        /* JADX INFO: renamed from: a */
        public final ByteBuffer f10823a = ByteBuffer.allocate(4);

        @Override // p356r5.C8734d.b
        /* JADX INFO: renamed from: a */
        public final void mo6346a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f10823a) {
                this.f10823a.position(0);
                messageDigest.update(this.f10823a.putInt(num2.intValue()).array());
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$c */
    public static final class C2135c implements InterfaceC2137e<AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: a */
        public final void mo6347a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: b */
        public final void mo6348b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$d */
    public static final class C2136d implements InterfaceC2137e<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: a */
        public final void mo6347a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new C2143d(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: b */
        public final void mo6348b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C2143d(byteBuffer));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$e */
    public interface InterfaceC2137e<T> {
        /* JADX INFO: renamed from: a */
        void mo6347a(MediaExtractor mediaExtractor, T t10) throws IOException;

        /* JADX INFO: renamed from: b */
        void mo6348b(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$f */
    public static class C2138f {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.VideoDecoder$g */
    public static final class C2139g implements InterfaceC2137e<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: a */
        public final void mo6347a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.InterfaceC2137e
        /* JADX INFO: renamed from: b */
        public final void mo6348b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(InterfaceC9452c interfaceC9452c, InterfaceC2137e<T> interfaceC2137e) {
        this.f10820b = interfaceC9452c;
        this.f10819a = interfaceC2137e;
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: a */
    public final InterfaceC9207m<Bitmap> mo68a(T t10, int i10, int i11, C8735e c8735e) throws IOException {
        long jLongValue = ((Long) c8735e.m16963c(f10815d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException(C0166e.m763i("Requested frame must be non-negative, or DEFAULT_FRAME, given: ", jLongValue));
        }
        Integer num = (Integer) c8735e.m16963c(f10816e);
        if (num == null) {
            num = 2;
        }
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) c8735e.m16963c(DownsampleStrategy.f10807f);
        if (downsampleStrategy == null) {
            downsampleStrategy = DownsampleStrategy.f10806e;
        }
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        this.f10821c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f10819a.mo6348b(mediaMetadataRetriever, t10);
            return C0028g.m155e(m6345c(t10, mediaMetadataRetriever, jLongValue, num.intValue(), i10, i11, downsampleStrategy2), this.f10820b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    @Override // p356r5.InterfaceC8736f
    /* JADX INFO: renamed from: b */
    public final boolean mo69b(T t10, C8735e c8735e) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:67:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0175  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    /* JADX INFO: renamed from: c */
    public final Bitmap m6345c(T t10, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, DownsampleStrategy downsampleStrategy) {
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        MediaExtractor mediaExtractor;
        String str = Build.DEVICE;
        boolean z13 = false;
        Bitmap bitmapCreateBitmap = null;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            try {
                if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    mediaExtractor = new MediaExtractor();
                    try {
                        this.f10819a.mo6347a(mediaExtractor, t10);
                        int trackCount = mediaExtractor.getTrackCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= trackCount) {
                                mediaExtractor.release();
                                z10 = false;
                            } else if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i17).getString("mime"))) {
                                mediaExtractor.release();
                                z10 = true;
                            } else {
                                i17++;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            if (Log.isLoggable("VideoDecoder", 3)) {
                                Log.d("VideoDecoder", "Exception trying to extract track info for a webm video on CrOS.", th);
                            }
                            if (mediaExtractor != null) {
                            }
                            z10 = false;
                            if (!z10) {
                                throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                            }
                            if (Build.VERSION.SDK_INT >= 27) {
                                try {
                                    i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                                    i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                                    i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                                    if (i16 != 90) {
                                        i15 = i14;
                                        i14 = i15;
                                    } else {
                                        i15 = i14;
                                        i14 = i15;
                                    }
                                    float fMo6341b = downsampleStrategy.mo6341b(i14, i15, i11, i12);
                                    bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i14 * fMo6341b), Math.round(fMo6341b * i15));
                                } catch (Throwable th3) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th3);
                                    }
                                }
                            }
                            if (bitmapCreateBitmap == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                                int i18 = Build.VERSION.SDK_INT;
                                if (i18 < 30) {
                                }
                            } else {
                                int i19 = Build.VERSION.SDK_INT;
                                if (i19 < 30) {
                                }
                            }
                            if (z11) {
                                try {
                                    String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                    String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                    i13 = Integer.parseInt(strExtractMetadata);
                                    int i20 = Integer.parseInt(strExtractMetadata2);
                                    z12 = i13 == 7 ? true : true;
                                    if (z12) {
                                        z13 = true;
                                    }
                                } catch (NumberFormatException unused) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
                                    }
                                }
                                if (z13) {
                                    if (Log.isLoggable("VideoDecoder", 3)) {
                                        Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                                    }
                                    Matrix matrix = new Matrix();
                                    matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                return bitmapCreateBitmap;
                            }
                            throw new VideoDecoderException();
                        } catch (Throwable th4) {
                            if (mediaExtractor != null) {
                                mediaExtractor.release();
                            }
                            throw th4;
                        }
                    }
                } else {
                    z10 = false;
                }
            } catch (Throwable th5) {
                th = th5;
                mediaExtractor = null;
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        if (Build.VERSION.SDK_INT >= 27 && i11 != Integer.MIN_VALUE && i12 != Integer.MIN_VALUE && downsampleStrategy != DownsampleStrategy.f10805d) {
            i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            i16 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i16 != 90 || i16 == 270) {
                i15 = i14;
                i14 = i15;
            }
            float fMo6341b2 = downsampleStrategy.mo6341b(i14, i15, i11, i12);
            bitmapCreateBitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i14 * fMo6341b2), Math.round(fMo6341b2 * i15));
        }
        if (bitmapCreateBitmap == null) {
            bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(j10, i10);
        }
        if (Build.MODEL.startsWith("Pixel") || Build.VERSION.SDK_INT != 33) {
            int i110 = Build.VERSION.SDK_INT;
            z11 = i110 < 30 && i110 < 33;
        } else {
            Iterator<String> it = f10818g.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Build.ID.startsWith(it.next())) {
                    }
                }
            }
        }
        if (z11) {
            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
            i13 = Integer.parseInt(strExtractMetadata3);
            int i21 = Integer.parseInt(strExtractMetadata4);
            if ((i13 == 7 && i13 != 6) || i21 != 6) {
                z12 = false;
            }
            if (z12 && Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                z13 = true;
            }
            if (z13) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
                }
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
            }
        }
        if (bitmapCreateBitmap != null) {
            return bitmapCreateBitmap;
        }
        throw new VideoDecoderException();
    }
}
