package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jqm extends jqj {
    @Override // p000.jqj
    /* JADX INFO: renamed from: d */
    public final void mo13469d(Status status) {
        if (status.m4645b()) {
            return;
        }
        Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener: status=".concat(String.valueOf(String.valueOf(status))));
    }
}
