package com.google.android.exoplayer2.source.hls;

import android.support.v4.media.C0141b;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        super(C0141b.m611g("Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}
