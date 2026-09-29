package p000;

import android.content.ClipData;
import android.media.metrics.TrackChangeEvent;
import android.view.ContentInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class xk1 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ TrackChangeEvent.Builder m24582f(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ ContentInfo.Builder m24584h(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ ContentInfo m24585i(Object obj) {
        return (ContentInfo) obj;
    }
}
