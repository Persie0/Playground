package p150h9;

import android.content.Context;
import android.os.PowerManager;
import p479xa.C10145n;

/* JADX INFO: renamed from: h9.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5932p0 {

    /* JADX INFO: renamed from: a */
    public final PowerManager f35353a;

    /* JADX INFO: renamed from: b */
    public PowerManager.WakeLock f35354b;

    /* JADX INFO: renamed from: c */
    public boolean f35355c;

    /* JADX INFO: renamed from: d */
    public boolean f35356d;

    public C5932p0(Context context) {
        this.f35353a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX INFO: renamed from: a */
    public final void m12346a(boolean z10) {
        if (z10 && this.f35354b == null) {
            PowerManager powerManager = this.f35353a;
            if (powerManager == null) {
                C10145n.m19099g("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f35354b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f35355c = z10;
        PowerManager.WakeLock wakeLock = this.f35354b;
        if (wakeLock == null) {
            return;
        }
        if (z10 && this.f35356d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
