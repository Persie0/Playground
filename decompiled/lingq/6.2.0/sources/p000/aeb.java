package p000;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* JADX INFO: loaded from: classes.dex */
public final class aeb extends no3 {

    /* JADX INFO: renamed from: l */
    public static final b64 f560l = new b64("ClientTelemetry.API", new ydb(0), new p84(7));

    /* JADX INFO: renamed from: d */
    public final tld m317d(TelemetryData telemetryData) {
        i44 i44VarM13651b = i44.m13651b();
        i44VarM13651b.f43483d = new Feature[]{omd.f54599d};
        i44VarM13651b.f43480a = false;
        i44VarM13651b.f43482c = new nr9(telemetryData);
        return m17569c(2, i44VarM13651b.m13652a());
    }
}
