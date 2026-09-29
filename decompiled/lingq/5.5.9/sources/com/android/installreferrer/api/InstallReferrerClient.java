package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public abstract class InstallReferrerClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;

        /* JADX INFO: renamed from: OK */
        public static final int f10530OK = 0;
        public static final int PERMISSION_ERROR = 4;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;
    }

    /* JADX INFO: renamed from: com.android.installreferrer.api.InstallReferrerClient$a */
    public static final class C2077a {

        /* JADX INFO: renamed from: a */
        public final Context f10531a;

        public C2077a(Context context) {
            this.f10531a = context;
        }

        /* JADX INFO: renamed from: a */
        public final C2078a m6226a() {
            Context context = this.f10531a;
            if (context != null) {
                return new C2078a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static C2077a newBuilder(Context context) {
        return new C2077a(context);
    }

    public abstract void endConnection();

    public abstract ReferrerDetails getInstallReferrer() throws RemoteException;

    public abstract boolean isReady();

    public abstract void startConnection(InstallReferrerStateListener installReferrerStateListener);
}
