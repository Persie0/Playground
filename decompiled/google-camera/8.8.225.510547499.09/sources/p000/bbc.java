package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbc extends bbf {
    public bbc(Context context, C1058va c1058va, byte[] bArr) {
        super(context, c1058va, null);
    }

    @Override // p000.bbf
    /* JADX INFO: renamed from: a */
    public final IntentFilter mo2173a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(aJFPpVSaoDO.PHLODCTLSIZyB);
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2174b() {
        Intent intentRegisterReceiver = this.f2896a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            ayc.m2099a();
            Log.e(bbd.f2892a, "getInitialState - null intent received");
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        float intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        float intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 / intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.bbf
    /* JADX INFO: renamed from: c */
    public final void mo2175c(Intent intent) {
        if (intent.getAction() == null) {
        }
        ayc.m2099a();
        String str = bbd.f2892a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1980154005:
                    if (action.equals("android.intent.action.BATTERY_OKAY")) {
                        m2179g(true);
                        break;
                    }
                    break;
                case 490310653:
                    if (action.equals("android.intent.action.BATTERY_LOW")) {
                        m2179g(false);
                    }
                    break;
            }
        }
    }
}
