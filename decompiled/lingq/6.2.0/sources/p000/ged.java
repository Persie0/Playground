package p000;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* JADX INFO: loaded from: classes2.dex */
public final class ged {

    /* JADX INFO: renamed from: a */
    public final int f40688a;

    /* JADX INFO: renamed from: b */
    public final wr9 f40689b = new wr9();

    /* JADX INFO: renamed from: c */
    public final int f40690c;

    /* JADX INFO: renamed from: d */
    public final Bundle f40691d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f40692e;

    public ged(int i, int i2, Bundle bundle, int i3) {
        this.f40692e = i3;
        this.f40688a = i;
        this.f40690c = i2;
        this.f40691d = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12564a() {
        switch (this.f40692e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12565b(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.f40689b.m24137a(zztVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m12566c(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(bundle));
        }
        this.f40689b.m24138b(bundle);
    }

    public final String toString() {
        return "Request { what=" + this.f40690c + " id=" + this.f40688a + " oneWay=" + m12564a() + "}";
    }
}
