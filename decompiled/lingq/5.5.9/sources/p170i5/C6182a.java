package p170i5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import p026b5.AbstractC1314g;
import p257m5.C7480b;

/* JADX INFO: renamed from: i5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6182a extends AbstractC6187f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f36039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6182a(Context context, C7480b c7480b, int i10) {
        super(context, c7480b);
        this.f36039g = i10;
        if (i10 != 1) {
        } else {
            super(context, c7480b);
        }
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo12702a() {
        switch (this.f36039g) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                break;
            default:
                break;
        }
        return m12705h();
    }

    @Override // p170i5.AbstractC6187f
    /* JADX INFO: renamed from: f */
    public final IntentFilter mo12703f() {
        switch (this.f36039g) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter2.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter2;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p170i5.AbstractC6187f
    /* JADX INFO: renamed from: g */
    public final void mo12704g(Intent intent) {
        switch (this.f36039g) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(intent, "intent");
                String action = intent.getAction();
                if (action == null) {
                    break;
                } else {
                    AbstractC1314g.m4867d().mo4869a(C6183b.f36040a, "Received ".concat(action));
                    switch (action.hashCode()) {
                        case -1886648615:
                            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                m12709c(Boolean.FALSE);
                                break;
                            }
                            break;
                        case -54942926:
                            if (action.equals("android.os.action.DISCHARGING")) {
                                m12709c(Boolean.FALSE);
                            }
                            break;
                        case 948344062:
                            if (action.equals("android.os.action.CHARGING")) {
                                m12709c(Boolean.TRUE);
                                break;
                            }
                            break;
                        case 1019184907:
                            if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                m12709c(Boolean.TRUE);
                                break;
                            }
                            break;
                        default:
                            break;
                    }
                }
                break;
            default:
                C5207g.m11111f(intent, "intent");
                if (intent.getAction() != null) {
                    AbstractC1314g.m4867d().mo4869a(C6194m.f36055a, "Received " + intent.getAction());
                    String action2 = intent.getAction();
                    if (action2 != null) {
                        int iHashCode = action2.hashCode();
                        if (iHashCode == -1181163412) {
                            if (action2.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                m12709c(Boolean.FALSE);
                            }
                        } else if (iHashCode == -730838620 && action2.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                            m12709c(Boolean.TRUE);
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L33;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean m12705h() {
        int i10 = this.f36039g;
        boolean z10 = false;
        Context context = this.f36046b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    AbstractC1314g.m4867d().mo4870b(C6183b.f36040a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            default:
                Intent intentRegisterReceiver2 = context.registerReceiver(null, mo12703f());
                if (intentRegisterReceiver2 != null && intentRegisterReceiver2.getAction() != null) {
                    String action = intentRegisterReceiver2.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode == -730838620) {
                        }
                    }
                    break;
                } else {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
