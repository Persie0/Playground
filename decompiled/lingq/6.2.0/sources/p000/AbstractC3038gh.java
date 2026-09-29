package p000;

import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: renamed from: gh */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3038gh {
    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m12602g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ NetworkEvent.Builder m12603h() {
        return new NetworkEvent.Builder();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ PlaybackErrorEvent.Builder m12607l() {
        return new PlaybackErrorEvent.Builder();
    }

    /* JADX INFO: renamed from: q */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m12612q(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ PlaybackStateEvent.Builder m12614s() {
        return new PlaybackStateEvent.Builder();
    }
}
