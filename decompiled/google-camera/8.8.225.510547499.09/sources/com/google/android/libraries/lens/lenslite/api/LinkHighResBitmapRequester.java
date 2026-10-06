package com.google.android.libraries.lens.lenslite.api;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface LinkHighResBitmapRequester {

    /* JADX INFO: compiled from: PG */
    public interface LinkHighResBitmapCallback {
        void onNewHighResBitmap(Bitmap bitmap, int i);
    }

    boolean requestHighResBitmap(long j, LinkHighResBitmapCallback linkHighResBitmapCallback);
}
