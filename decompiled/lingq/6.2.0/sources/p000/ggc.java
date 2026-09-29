package p000;

import android.util.Log;
import com.google.android.gms.measurement.internal.C1045d;

/* JADX INFO: loaded from: classes.dex */
public final class ggc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40787a = 0;

    /* JADX INFO: renamed from: b */
    public final kjc f40788b;

    public ggc(C1045d c1045d) {
        this.f40788b = c1045d.f12372l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final boolean m12590a() {
        int i = this.f40787a;
        kjc kjcVar = this.f40788b;
        switch (i) {
            case 0:
                boolean z = false;
                try {
                    C3722wh c3722whM16702a = m9b.m16702a(kjcVar.f47433a);
                    if (c3722whM16702a == null) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17923a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        kjcVar = kjcVar;
                    } else {
                        int i2 = c3722whM16702a.m23949b(128, "com.android.vending").versionCode;
                        kjcVar = i2;
                        if (i2 >= 80837300) {
                            z = true;
                            kjcVar = i2;
                        }
                    }
                    break;
                } catch (Exception e) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68076I.m17924b(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                xcc xccVar3 = kjcVar.f47438f;
                kjc.m15280l(xccVar3);
                return Log.isLoggable(xccVar3.m24457N(), 3);
        }
    }

    public ggc(d74 d74Var, kjc kjcVar) {
        this.f40788b = kjcVar;
    }
}
