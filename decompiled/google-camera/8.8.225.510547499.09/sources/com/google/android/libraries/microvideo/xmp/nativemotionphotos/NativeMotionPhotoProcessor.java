package com.google.android.libraries.microvideo.xmp.nativemotionphotos;

import p000.ncg;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class NativeMotionPhotoProcessor {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7947a = 0;

    static {
        ncg.m17327h("NativeMotionPhotoProc");
        System.loadLibrary("native");
    }

    private NativeMotionPhotoProcessor() {
    }

    public static native byte[] encodeVideoMetadata(byte[] bArr);
}
