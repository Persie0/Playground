package com.clevertap.android.sdk.inapp;

import android.content.DialogInterface;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.login.widget.LoginButton;
import dm.C5207g;
import p173i8.C6205a;
import p274n8.C7728m;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC2209b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f11170b;

    public /* synthetic */ DialogInterfaceOnClickListenerC2209b(int i10, Object obj) {
        this.f11169a = i10;
        this.f11170b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f11169a;
        Object obj = this.f11170b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2041a interfaceC2041a = (InterfaceC2041a) obj;
                C5207g.m11111f(interfaceC2041a, "$onDecline");
                interfaceC2041a.mo807E();
                break;
            default:
                C7728m c7728m = (C7728m) obj;
                if (!C6205a.m12742b(LoginButton.ViewOnClickListenerC2335b.class)) {
                    try {
                        C5207g.m11111f(c7728m, "$loginManager");
                        c7728m.m15317e();
                    } catch (Throwable th2) {
                        C6205a.m12741a(LoginButton.ViewOnClickListenerC2335b.class, th2);
                        return;
                    }
                }
                break;
        }
    }
}
