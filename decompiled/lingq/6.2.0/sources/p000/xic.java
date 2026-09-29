package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes2.dex */
public final class xic implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oub f68276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppMeasurementDynamiteService f68277c;

    public /* synthetic */ xic(AppMeasurementDynamiteService appMeasurementDynamiteService, oub oubVar, int i) {
        this.f68275a = i;
        this.f68276b = oubVar;
        this.f68277c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f68275a) {
            case 0:
                v4d v4dVarM15287o = this.f68277c.f12312f.m15287o();
                oub oubVar = this.f68276b;
                v4dVarM15287o.mo12359D();
                v4dVarM15287o.m13744E();
                v4dVarM15287o.m23117R(new kr3(v4dVarM15287o, v4dVarM15287o.m23119T(false), oubVar, 9));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f68277c;
                rad radVar = appMeasurementDynamiteService.f12312f.f47441i;
                kjc.m15278j(radVar);
                kjc kjcVar = appMeasurementDynamiteService.f12312f;
                if (kjcVar.f47426T != null && kjcVar.f47426T.booleanValue()) {
                    z = true;
                }
                radVar.m20555t0(this.f68276b, z);
                break;
        }
    }
}
