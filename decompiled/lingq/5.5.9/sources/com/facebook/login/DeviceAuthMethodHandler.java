package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC0979t;
import dm.C5207g;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/facebook/login/DeviceAuthMethodHandler;", "Lcom/facebook/login/LoginMethodHandler;", "b", "facebook-common_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public class DeviceAuthMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: e */
    public static ScheduledThreadPoolExecutor f11594e;

    /* JADX INFO: renamed from: c */
    public final String f11595c;

    /* JADX INFO: renamed from: d */
    public static final C2316b f11593d = new C2316b();
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C2315a();

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    public static final class C2315a implements Parcelable.Creator<DeviceAuthMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public final DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "source");
            return new DeviceAuthMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceAuthMethodHandler[] newArray(int i10) {
            return new DeviceAuthMethodHandler[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.login.DeviceAuthMethodHandler$b */
    public static final class C2316b {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
        C5207g.m11111f(parcel, "parcel");
        this.f11595c = "device_auth";
    }

    public DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f11595c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public final String getF11598d() {
        return this.f11595c;
    }

    @Override // com.facebook.login.LoginMethodHandler
    /* JADX INFO: renamed from: q */
    public final int mo6685q(LoginClient.Request request) {
        ActivityC0979t activityC0979tM6706e = m6717d().m6706e();
        if (activityC0979tM6706e != null && !activityC0979tM6706e.isFinishing()) {
            DeviceAuthDialog deviceAuthDialog = new DeviceAuthDialog();
            deviceAuthDialog.mo3772s0(activityC0979tM6706e.m3805K(), "login_with_facebook");
            deviceAuthDialog.m6692D0(request);
        }
        return 1;
    }
}
