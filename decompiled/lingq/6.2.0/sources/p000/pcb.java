package p000;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes2.dex */
public final class pcb extends co3 {
    @Override // p000.f90
    /* JADX INFO: renamed from: b */
    public final IInterface mo3402b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof rdb ? (rdb) iInterfaceQueryLocalInterface : new rdb(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService", 0);
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: f */
    public final Feature[] mo3671f() {
        return omd.f54601f;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: i */
    public final int mo3404i() {
        return 253600000;
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: m */
    public final String mo3405m() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: n */
    public final String mo3406n() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // p000.f90
    /* JADX INFO: renamed from: o */
    public final boolean mo3672o() {
        return true;
    }
}
