package p000;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o8d {

    /* JADX INFO: renamed from: a */
    public static p04 f54042a;

    /* JADX INFO: renamed from: a */
    public static String m17860a(int i) {
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 21), "unknown status code: ", i);
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m17861b() {
        p04 p04Var = f54042a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Translate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(12.65f, 15.67f);
        f57VarM17730e.m11548c(0.14f, -0.36f, 0.05f, -0.77f, -0.23f, -1.05f);
        f57VarM17730e.m11552g(-2.09f, -2.06f);
        f57VarM17730e.m11552g(0.03f, -0.03f);
        f57VarM17730e.m11548c(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        f57VarM17730e.m11550e(1.94f);
        f57VarM17730e.m11548c(0.54f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
        f57VarM17730e.m11557l(-0.02f);
        f57VarM17730e.m11548c(0.0f, -0.54f, -0.45f, -0.99f, -0.99f, -0.99f);
        f57VarM17730e.m11551f(10.0f, 4.0f);
        f57VarM17730e.m11551f(10.0f, 3.0f);
        f57VarM17730e.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f57VarM17730e.m11555j(-1.0f, 0.45f, -1.0f, 1.0f);
        f57VarM17730e.m11557l(1.0f);
        f57VarM17730e.m11551f(1.99f, 4.0f);
        f57VarM17730e.m11548c(-0.54f, 0.0f, -0.99f, 0.45f, -0.99f, 0.99f);
        f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f);
        f57VarM17730e.m11550e(10.18f);
        f57VarM17730e.m11547b(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        f57VarM17730e.m11548c(-0.81f, -0.89f, -1.49f, -1.86f, -2.06f, -2.88f);
        f57VarM17730e.m11548c(-0.16f, -0.29f, -0.45f, -0.47f, -0.78f, -0.47f);
        f57VarM17730e.m11548c(-0.69f, 0.0f, -1.13f, 0.75f, -0.79f, 1.35f);
        f57VarM17730e.m11548c(0.63f, 1.13f, 1.4f, 2.21f, 2.3f, 3.21f);
        f57VarM17730e.m11551f(3.3f, 16.87f);
        f57VarM17730e.m11548c(-0.4f, 0.39f, -0.4f, 1.03f, 0.0f, 1.42f);
        f57VarM17730e.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        f57VarM17730e.m11551f(9.0f, 14.0f);
        f57VarM17730e.m11552g(2.02f, 2.02f);
        f57VarM17730e.m11548c(0.51f, 0.51f, 1.38f, 0.32f, 1.63f, -0.35f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(17.5f, 10.0f);
        f57VarM17730e.m11548c(-0.6f, 0.0f, -1.14f, 0.37f, -1.35f, 0.94f);
        f57VarM17730e.m11552g(-3.67f, 9.8f);
        f57VarM17730e.m11548c(-0.24f, 0.61f, 0.22f, 1.26f, 0.87f, 1.26f);
        f57VarM17730e.m11548c(0.39f, 0.0f, 0.74f, -0.24f, 0.88f, -0.61f);
        f57VarM17730e.m11552g(0.89f, -2.39f);
        f57VarM17730e.m11550e(4.75f);
        f57VarM17730e.m11552g(0.9f, 2.39f);
        f57VarM17730e.m11548c(0.14f, 0.36f, 0.49f, 0.61f, 0.88f, 0.61f);
        f57VarM17730e.m11548c(0.65f, 0.0f, 1.11f, -0.65f, 0.88f, -1.26f);
        f57VarM17730e.m11552g(-3.67f, -9.8f);
        f57VarM17730e.m11548c(-0.22f, -0.57f, -0.76f, -0.94f, -1.36f, -0.94f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(15.88f, 17.0f);
        f57VarM17730e.m11552g(1.62f, -4.33f);
        f57VarM17730e.m11551f(19.12f, 17.0f);
        f57VarM17730e.m11550e(-3.24f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f54042a = p04VarM17721b;
        return p04VarM17721b;
    }
}
