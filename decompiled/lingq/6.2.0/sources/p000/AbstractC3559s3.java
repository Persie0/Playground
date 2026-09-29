package p000;

import android.app.ApplicationExitInfo;
import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;
import java.util.List;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3559s3 {
    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ ApplicationExitInfo m21020d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ RouteDiscoveryPreference.Builder m21022f(List list) {
        return new RouteDiscoveryPreference.Builder(list, false);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ CloseGuard m21024h() {
        return new CloseGuard();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m21030n() {
    }
}
