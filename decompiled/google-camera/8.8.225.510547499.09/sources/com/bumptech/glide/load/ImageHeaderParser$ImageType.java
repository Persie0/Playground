package com.bumptech.glide.load;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    UNKNOWN(false);


    /* JADX INFO: renamed from: a */
    private final boolean f6483a;

    ImageHeaderParser$ImageType(boolean z) {
        this.f6483a = z;
    }

    public boolean hasAlpha() {
        return this.f6483a;
    }

    public boolean isWebp() {
        switch (ordinal()) {
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }
}
