package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2484a {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<Uri, byte[]> f13142a;

    public C2484a() {
        final int i10 = 5;
        this.f13142a = new LinkedHashMap<Uri, byte[]>(i10) { // from class: com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f13122a = 4;

            @Override // java.util.LinkedHashMap
            public final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > this.f13122a;
            }
        };
    }
}
