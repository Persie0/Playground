package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxw implements bqt {

    /* JADX INFO: renamed from: a */
    public static final bqq f4724a = bqq.m2924a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new bxr(1, null));

    /* JADX INFO: renamed from: b */
    public static final bqq f4725b = bqq.m2924a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new bxr(0));

    /* JADX INFO: renamed from: c */
    private static final List f4726c = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: d */
    private final bxu f4727d;

    /* JADX INFO: renamed from: e */
    private final bti f4728e;

    public bxw(bti btiVar, bxu bxuVar) {
        this.f4728e = btiVar;
        this.f4727d = bxuVar;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[LOOP:1: B:67:0x0135->B:106:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118 A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #1 {all -> 0x01b0, blocks: (B:16:0x005a, B:18:0x0068, B:30:0x00a7, B:31:0x00b1, B:37:0x00b8, B:41:0x00c3, B:60:0x0118, B:62:0x011f, B:64:0x0129, B:66:0x012f, B:67:0x0135, B:69:0x013b, B:72:0x014b, B:76:0x0165, B:79:0x0175, B:85:0x01aa, B:86:0x01af), top: B:93:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #1 {all -> 0x01b0, blocks: (B:16:0x005a, B:18:0x0068, B:30:0x00a7, B:31:0x00b1, B:37:0x00b8, B:41:0x00c3, B:60:0x0118, B:62:0x011f, B:64:0x0129, B:66:0x012f, B:67:0x0135, B:69:0x013b, B:72:0x014b, B:76:0x0165, B:79:0x0175, B:85:0x01aa, B:86:0x01af), top: B:93:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01aa A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #1 {all -> 0x01b0, blocks: (B:16:0x005a, B:18:0x0068, B:30:0x00a7, B:31:0x00b1, B:37:0x00b8, B:41:0x00c3, B:60:0x0118, B:62:0x011f, B:64:0x0129, B:66:0x012f, B:67:0x0135, B:69:0x013b, B:72:0x014b, B:76:0x0165, B:79:0x0175, B:85:0x01aa, B:86:0x01af), top: B:93:0x005a }] */
    @Override // p000.bqt
    /* JADX INFO: renamed from: a */
    public final bsz mo2930a(Object obj, int i, int i2, bqr bqrVar) throws IOException {
        int i3;
        Bitmap bitmapCreateBitmap;
        Iterator it;
        int i4;
        MediaExtractor mediaExtractor;
        long jLongValue = ((Long) bqrVar.m2927b(f4724a)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) bqrVar.m2927b(f4725b);
        if (num == null) {
            num = 2;
        }
        bwy bwyVar = (bwy) bqrVar.m2927b(bwy.f4673f);
        if (bwyVar == null) {
            bwyVar = bwy.f4672e;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.f4727d.mo3176b(mediaMetadataRetriever, obj);
            int iIntValue = num.intValue();
            Bitmap scaledFrameAtTime = null;
            if (Build.DEVICE != null && Build.DEVICE.matches(".+_cheets|cheets_.+")) {
                try {
                    if ("video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                        mediaExtractor = new MediaExtractor();
                        try {
                            this.f4727d.mo3175a(mediaExtractor, obj);
                            int trackCount = mediaExtractor.getTrackCount();
                            for (int i5 = 0; i5 < trackCount; i5++) {
                                if ("video/x-vnd.on2.vp8".equals(mediaExtractor.getTrackFormat(i5).getString("mime"))) {
                                    mediaExtractor.release();
                                    throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
                                }
                            }
                        } catch (Throwable th) {
                            if (mediaExtractor != null) {
                            }
                            if (i != Integer.MIN_VALUE) {
                                i3 = 24;
                            } else {
                                i3 = 24;
                            }
                            if (scaledFrameAtTime == null) {
                                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(jLongValue, iIntValue);
                            } else {
                                bitmapCreateBitmap = scaledFrameAtTime;
                            }
                            if (Build.MODEL.startsWith("Pixel")) {
                                it = f4726c.iterator();
                                while (it.hasNext()) {
                                    if (Build.ID.startsWith((String) it.next())) {
                                        try {
                                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                                            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
                                            i4 = Integer.parseInt(strExtractMetadata);
                                            int i6 = Integer.parseInt(strExtractMetadata2);
                                            if (i4 != 7) {
                                                Matrix matrix = new Matrix();
                                                matrix.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                                bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
                                                break;
                                            }
                                            Matrix matrix2 = new Matrix();
                                            matrix2.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                                            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix2, true);
                                            break;
                                        } catch (NumberFormatException e) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (bitmapCreateBitmap != null) {
                                throw new bxv();
                            }
                            mediaMetadataRetriever.close();
                            return bxk.m3162g(bitmapCreateBitmap, this.f4728e);
                        }
                        mediaExtractor.release();
                    }
                } catch (Throwable th2) {
                    mediaExtractor = null;
                }
            }
            if (i != Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || bwyVar == bwy.f4671d) {
                i3 = 24;
            } else {
                try {
                    int i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                    int i8 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    int i9 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                    if (i9 == 90 || i9 == 270) {
                        i8 = i7;
                        i7 = i8;
                    }
                    float fMo3139a = bwyVar.mo3139a(i7, i8, i, i2);
                    int iRound = Math.round(i7 * fMo3139a);
                    int iRound2 = Math.round(fMo3139a * i8);
                    i3 = 24;
                    try {
                        scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(jLongValue, iIntValue, iRound, iRound2);
                    } catch (Throwable th3) {
                    }
                } catch (Throwable th4) {
                    i3 = 24;
                }
            }
            if (scaledFrameAtTime == null) {
                bitmapCreateBitmap = mediaMetadataRetriever.getFrameAtTime(jLongValue, iIntValue);
            } else {
                bitmapCreateBitmap = scaledFrameAtTime;
            }
            if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
                it = f4726c.iterator();
                while (it.hasNext()) {
                    if (Build.ID.startsWith((String) it.next())) {
                        String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(36);
                        String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(35);
                        i4 = Integer.parseInt(strExtractMetadata3);
                        int i10 = Integer.parseInt(strExtractMetadata4);
                        if ((i4 != 7 && i4 != 6) || i10 != 6 || Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(i3))) != 180) {
                            break;
                            break;
                            break;
                        }
                        Matrix matrix3 = new Matrix();
                        matrix3.postRotate(180.0f, bitmapCreateBitmap.getWidth() / 2.0f, bitmapCreateBitmap.getHeight() / 2.0f);
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix3, true);
                        break;
                    }
                }
            }
            if (bitmapCreateBitmap != null) {
                throw new bxv();
            }
            mediaMetadataRetriever.close();
            return bxk.m3162g(bitmapCreateBitmap, this.f4728e);
        } catch (Throwable th5) {
            mediaMetadataRetriever.close();
            throw th5;
        }
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final boolean mo2931b(Object obj, bqr bqrVar) {
        return true;
    }
}
