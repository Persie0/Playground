package androidx.compose.p017ui.platform;

import android.content.ClipData;
import android.content.Context;
import android.media.metrics.TrackChangeEvent;
import android.util.AttributeSet;
import android.view.ContentInfo;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0682z0 {
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ TrackChangeEvent.Builder m2511g(int i10) {
        return new TrackChangeEvent.Builder(i10);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ ContentInfo.Builder m2513i(ClipData clipData, int i10) {
        return new ContentInfo.Builder(clipData, i10);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ EdgeEffect m2514j(Context context, AttributeSet attributeSet) {
        return new EdgeEffect(context, attributeSet);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2515k() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m2526v() {
    }
}
