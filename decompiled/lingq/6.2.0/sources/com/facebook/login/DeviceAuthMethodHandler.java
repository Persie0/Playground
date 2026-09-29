package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p000.hfb;
import p000.id3;
import p000.wkd;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: e */
    public static ScheduledThreadPoolExecutor f11437e;

    /* JADX INFO: renamed from: c */
    public final String f11438c;

    /* JADX INFO: renamed from: d */
    public static final wkd f11436d = new wkd();
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new hfb(9);

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        this.f11487b = loginClient;
        this.f11438c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String mo5197e() {
        return this.f11438c;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: k */
    public final int mo5201k(LoginClient.Request request) {
        request.getClass();
        id3 id3VarM5221e = m5240d().m5221e();
        if (id3VarM5221e == null || id3VarM5221e.isFinishing()) {
            return 1;
        }
        DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
        deviceAuthDialog.m3665k0(id3VarM5221e.m13792j(), "login_with_facebook");
        deviceAuthDialog.m5213t0(request);
        return 1;
    }

    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        this.f11438c = "device_auth";
    }
}
