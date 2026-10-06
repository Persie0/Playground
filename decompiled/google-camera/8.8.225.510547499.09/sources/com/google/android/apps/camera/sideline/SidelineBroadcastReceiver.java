package com.google.android.apps.camera.sideline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.emv;
import p000.gzy;
import p000.hai;
import p000.hbq;
import p000.hbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class SidelineBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public hbz f6922a;

    /* JADX INFO: renamed from: b */
    public hai f6923b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((hbq) ((emv) context.getApplicationContext()).mo4193e(hbq.class)).mo7824s(this);
        String action = intent.getAction();
        if (action != null) {
            switch (action) {
                case "android.intent.action.MY_PACKAGE_REPLACED":
                    this.f6923b.mo10032d(gzy.f27027ak);
                    break;
                case "android.intent.action.BOOT_COMPLETED":
                    break;
                default:
                    return;
            }
            if (this.f6922a.m10097b()) {
                this.f6922a.m10096a();
            }
        }
    }
}
