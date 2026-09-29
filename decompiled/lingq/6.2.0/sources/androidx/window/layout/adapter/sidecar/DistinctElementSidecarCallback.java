package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import p000.fa4;
import p000.t69;
import p000.u69;

/* JADX INFO: loaded from: classes2.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b */
    public SidecarDeviceState f7149b;

    /* JADX INFO: renamed from: d */
    public final u69 f7151d;

    /* JADX INFO: renamed from: e */
    public final SidecarInterface.SidecarCallback f7152e;

    /* JADX INFO: renamed from: a */
    public final Object f7148a = new Object();

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f7150c = new WeakHashMap();

    public DistinctElementSidecarCallback(u69 u69Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f7151d = u69Var;
        this.f7152e = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001f, code lost:
    
        if (p000.t69.m21876b(r2) == p000.t69.m21876b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f7148a) {
            try {
                u69 u69Var = this.f7151d;
                SidecarDeviceState sidecarDeviceState2 = this.f7149b;
                u69Var.getClass();
                if (!fa4.m11650l(sidecarDeviceState2, sidecarDeviceState)) {
                    if (sidecarDeviceState2 == null) {
                    }
                    this.f7149b = sidecarDeviceState;
                    this.f7152e.onDeviceStateChanged(sidecarDeviceState);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean zM22508b;
        synchronized (this.f7148a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f7150c.get(iBinder);
                this.f7151d.getClass();
                if (fa4.m11650l(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    zM22508b = true;
                } else {
                    zM22508b = (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : u69.m22508b(t69.m21877c(sidecarWindowLayoutInfo2), t69.m21877c(sidecarWindowLayoutInfo));
                }
                if (zM22508b) {
                    return;
                }
                this.f7150c.put(iBinder, sidecarWindowLayoutInfo);
                this.f7152e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
