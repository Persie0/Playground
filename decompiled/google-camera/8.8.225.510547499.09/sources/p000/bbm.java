package p000;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbm extends bbf {
    public bbm(Context context, C1058va c1058va, byte[] bArr) {
        super(context, c1058va, null);
    }

    @Override // p000.bbf
    /* JADX INFO: renamed from: a */
    public final IntentFilter mo2173a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    @Override // p000.bbh
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2174b() {
        Intent intentRegisterReceiver = this.f2896a.registerReceiver(null, mo2173a());
        boolean z = true;
        if (intentRegisterReceiver != null && intentRegisterReceiver.getAction() != null) {
            String action = intentRegisterReceiver.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1181163412:
                        action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        z = false;
                        break;
                    case -730838620:
                        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            z = false;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = false;
            }
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
        int i = bbn.f2906a;
        intent.getAction();
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1181163412:
                    if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                        m2179g(false);
                        break;
                    }
                    break;
                case -730838620:
                    if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        m2179g(true);
                    }
                    break;
            }
        }
    }
}
