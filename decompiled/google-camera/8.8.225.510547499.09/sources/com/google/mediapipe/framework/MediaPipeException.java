package com.google.mediapipe.framework;

import p000.mrd;
import p000.nvt;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class MediaPipeException extends RuntimeException {
    MediaPipeException(int i, byte[] bArr) {
        String str = new String(bArr, mrd.f41463a);
        super(nvt.values()[i].f44802r + ": " + str);
        nvt nvtVar = nvt.values()[i];
    }
}
