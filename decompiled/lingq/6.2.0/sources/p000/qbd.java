package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class qbd implements eqc {

    /* JADX INFO: renamed from: a */
    public final nvb f57550a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f57551b;

    public qbd(AppMeasurementDynamiteService appMeasurementDynamiteService, nvb nvbVar) {
        this.f57551b = appMeasurementDynamiteService;
        this.f57550a = nvbVar;
    }

    @Override // p000.eqc
    /* JADX INFO: renamed from: a */
    public final void mo10094a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f57550a.mo10690h(j, bundle, str, str2);
        } catch (RemoteException e) {
            kjc kjcVar = this.f57551b.f12312f;
            if (kjcVar != null) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(e, "Event listener threw exception");
            }
        }
    }
}
