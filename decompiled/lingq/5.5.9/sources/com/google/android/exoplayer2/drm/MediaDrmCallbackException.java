package com.google.android.exoplayer2.drm;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p454wa.C9884i;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {

    /* JADX INFO: renamed from: a */
    public final Map<String, List<String>> f12196a;

    public MediaDrmCallbackException(C9884i c9884i, Uri uri, Map map, long j10, Exception exc) {
        super(exc);
        this.f12196a = map;
    }
}
