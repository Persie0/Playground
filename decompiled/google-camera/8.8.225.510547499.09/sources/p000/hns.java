package p000;

import android.os.PowerManager;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hns {

    /* JADX INFO: renamed from: a */
    public static final nbh f28523a = nbh.m17259h("com/google/android/apps/camera/temperature/PowerManagerProxy");

    /* JADX INFO: renamed from: b */
    public final PowerManager f28524b;

    /* JADX INFO: renamed from: c */
    public boolean f28525c = false;

    /* JADX INFO: renamed from: d */
    public boolean f28526d = false;

    /* JADX INFO: renamed from: e */
    public final Executor f28527e;

    public hns(PowerManager powerManager, Executor executor) {
        this.f28524b = powerManager;
        this.f28527e = executor;
    }

    /* JADX INFO: renamed from: a */
    final int m10516a() {
        return this.f28524b.getCurrentThermalStatus();
    }

    /* JADX INFO: renamed from: b */
    final synchronized void m10517b(PowerManager.OnThermalStatusChangedListener onThermalStatusChangedListener) {
        this.f28525c = true;
        this.f28527e.execute(new hea(this, onThermalStatusChangedListener, 19));
    }
}
