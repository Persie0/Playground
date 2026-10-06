package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.wear.ambient.SharedLibraryVersion;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p000.axg;
import p000.ooc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b */
    private SidecarDeviceState f1788b;

    /* JADX INFO: renamed from: d */
    private final SidecarInterface.SidecarCallback f1790d;

    /* JADX INFO: renamed from: a */
    private final Object f1787a = new Object();

    /* JADX INFO: renamed from: c */
    private final Map f1789c = new WeakHashMap();

    public DistinctElementSidecarCallback(axg axgVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f1790d = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f1787a) {
            SidecarDeviceState sidecarDeviceState2 = this.f1788b;
            if (!ooc.m18737c(sidecarDeviceState2, sidecarDeviceState)) {
                if (sidecarDeviceState2 != null) {
                    if (SharedLibraryVersion.m1664a(sidecarDeviceState2) != SharedLibraryVersion.m1664a(sidecarDeviceState)) {
                    }
                }
                this.f1788b = sidecarDeviceState;
                this.f1790d.onDeviceStateChanged(sidecarDeviceState);
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f1787a) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f1789c.get(iBinder);
            if (!ooc.m18737c(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                if (sidecarWindowLayoutInfo2 != null && sidecarWindowLayoutInfo != null) {
                    List listM1665b = SharedLibraryVersion.m1665b(sidecarWindowLayoutInfo2);
                    List listM1665b2 = SharedLibraryVersion.m1665b(sidecarWindowLayoutInfo);
                    if (listM1665b != listM1665b2) {
                        if (listM1665b.size() == listM1665b2.size()) {
                            int size = listM1665b.size();
                            int i = 0;
                            while (true) {
                                if (i < size) {
                                    SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) listM1665b.get(i);
                                    SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) listM1665b2.get(i);
                                    if (!ooc.m18737c(sidecarDisplayFeature, sidecarDisplayFeature2)) {
                                        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType() || !ooc.m18737c(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect())) {
                                            break;
                                            break;
                                            break;
                                            break;
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                }
                this.f1789c.put(iBinder, sidecarWindowLayoutInfo);
                this.f1790d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            }
        }
    }
}
