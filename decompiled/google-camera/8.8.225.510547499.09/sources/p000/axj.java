package p000;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axj implements axe {

    /* JADX INFO: renamed from: a */
    public final SidecarInterface f2654a;

    /* JADX INFO: renamed from: b */
    public final axg f2655b;

    /* JADX INFO: renamed from: c */
    public final Map f2656c;

    /* JADX INFO: renamed from: d */
    public final Map f2657d;

    /* JADX INFO: renamed from: e */
    public axh f2658e;

    public axj(Context context) {
        SidecarInterface sidecarImpl = SidecarProvider.getSidecarImpl(context.getApplicationContext());
        axg axgVar = new axg(null);
        this.f2654a = sidecarImpl;
        this.f2655b = axgVar;
        this.f2656c = new LinkedHashMap();
        this.f2657d = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final awx m2084a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder iBinderM1666a = WearableControllerProvider.m1666a(activity);
        if (iBinderM1666a == null) {
            return new awx(okv.f46215a);
        }
        SidecarInterface sidecarInterface = this.f2654a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderM1666a) : null;
        SidecarInterface sidecarInterface2 = this.f2654a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return axg.m2082a(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m2085b(IBinder iBinder, Activity activity) {
        SidecarInterface sidecarInterface;
        this.f2656c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f2654a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        int i = 1;
        if (this.f2656c.size() == 1 && (sidecarInterface = this.f2654a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        axh axhVar = this.f2658e;
        if (axhVar != null) {
            axhVar.m2083a(activity, m2084a(activity));
        }
        if (this.f2657d.get(activity) == null && (activity instanceof aca)) {
            ffb ffbVar = new ffb(this, activity, i);
            this.f2657d.put(activity, ffbVar);
            ((aca) activity).mo176d(ffbVar);
        }
    }
}
