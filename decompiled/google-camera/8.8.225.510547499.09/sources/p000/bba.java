package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bba extends bbf {
    public bba(Context context, C1058va c1058va, byte[] bArr) {
        super(context, c1058va, null);
    }

    @Override // p000.bbf
    /* JADX INFO: renamed from: a */
    public final IntentFilter mo2173a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2174b() {
        Intent intentRegisterReceiver = this.f2896a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            ayc.m2099a();
            Log.e(bbb.f2891a, "getInitialState - null intent received");
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        if (intExtra == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.bbf
    /* JADX INFO: renamed from: c */
    public final void mo2175c(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
        }
        ayc.m2099a();
        String str = bbb.f2891a;
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    m2179g(false);
                    break;
                }
                break;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    m2179g(false);
                }
                break;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    m2179g(true);
                }
                break;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    m2179g(true);
                }
                break;
        }
    }
}
