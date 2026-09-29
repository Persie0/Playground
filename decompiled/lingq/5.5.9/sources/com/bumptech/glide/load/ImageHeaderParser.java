package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p407u5.InterfaceC9451b;

/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z10) {
            this.hasAlpha = z10;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i10 = C2091a.f10602a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    public static /* synthetic */ class C2091a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10602a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f10602a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10602a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10602a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    ImageType mo165a(ByteBuffer byteBuffer) throws IOException;

    /* JADX INFO: renamed from: b */
    ImageType mo166b(InputStream inputStream) throws IOException;

    /* JADX INFO: renamed from: c */
    int mo167c(InputStream inputStream, InterfaceC9451b interfaceC9451b) throws IOException;

    /* JADX INFO: renamed from: d */
    int mo168d(ByteBuffer byteBuffer, InterfaceC9451b interfaceC9451b) throws IOException;
}
