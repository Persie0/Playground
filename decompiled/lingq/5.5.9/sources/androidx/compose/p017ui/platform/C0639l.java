package androidx.compose.p017ui.platform;

import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;

/* JADX INFO: renamed from: androidx.compose.ui.platform.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0639l {
    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent m2401c(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ MediaMetricsManager m2402d(Object obj) {
        return (MediaMetricsManager) obj;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ PlaybackMetrics.Builder m2405g() {
        return new PlaybackMetrics.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder m2406h(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PlaybackStateEvent.Builder m2407i() {
        return new PlaybackStateEvent.Builder();
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2410l() {
    }
}
