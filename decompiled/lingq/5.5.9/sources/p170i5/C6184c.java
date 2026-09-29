package p170i5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p257m5.C7480b;

/* JADX INFO: renamed from: i5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6184c extends AbstractC6187f<Boolean> {
    public C6184c(Context context, C7480b c7480b) {
        super(context, c7480b);
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: a */
    public final Object mo12702a() {
        Intent intentRegisterReceiver = this.f36046b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            AbstractC1314g.m4867d().mo4870b(C6185d.f36041a, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1) / intentRegisterReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // p170i5.AbstractC6187f
    /* JADX INFO: renamed from: f */
    public final IntentFilter mo12703f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p170i5.AbstractC6187f
    /* JADX INFO: renamed from: g */
    public final void mo12704g(Intent intent) {
        C5207g.m11111f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        AbstractC1314g.m4867d().mo4869a(C6185d.f36041a, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    m12709c(Boolean.TRUE);
                }
            } else {
                if (iHashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    m12709c(Boolean.FALSE);
                }
            }
        }
    }
}
