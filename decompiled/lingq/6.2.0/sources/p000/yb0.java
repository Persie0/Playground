package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a */
    public final e8b f69587a;

    /* JADX INFO: renamed from: b */
    public final Context f69588b;

    /* JADX INFO: renamed from: c */
    public final Object f69589c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f69590d;

    /* JADX INFO: renamed from: e */
    public Object f69591e;

    /* JADX INFO: renamed from: f */
    public final ce0 f69592f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f69593g;

    public yb0(Context context, e8b e8bVar, int i) {
        this.f69593g = i;
        this.f69587a = e8bVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f69588b = applicationContext;
        this.f69589c = new Object();
        this.f69590d = new LinkedHashSet();
        this.f69592f = new ce0(this, 1);
    }

    /* JADX INFO: renamed from: a */
    public final IntentFilter m25023a() {
        switch (this.f69593g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Boolean m25024b() {
        int i = this.f69593g;
        Context context = this.f69588b;
        boolean z = true;
        switch (i) {
            case 0:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    oj5.m18040f().m18043c(zb0.f71297a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    oj5.m18040f().m18043c(ac0.f480a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = context.registerReceiver(null, m25023a());
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m25025c(Boolean bool) {
        synchronized (this.f69589c) {
            Object obj = this.f69591e;
            if (obj == null || !obj.equals(bool)) {
                this.f69591e = bool;
                this.f69587a.f36850d.execute(new RunnableC0806bd(16, u91.m22622n1(this.f69590d), this));
            }
        }
    }
}
