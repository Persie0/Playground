package p000;

import android.content.Context;
import android.telephony.TelephonyManager;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class csb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f34498a = new C0282a(274377305, false, new qd1(17));

    /* JADX INFO: renamed from: b */
    public static final C0282a f34499b = new C0282a(-2144605877, false, new rd1(13));

    /* JADX INFO: renamed from: a */
    public static void m9872a(Context context, tk6 tk6Var) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            rk6 rk6Var = new rk6(tk6Var);
            telephonyManager.registerTelephonyCallback(tk6Var.f62447a, rk6Var);
            telephonyManager.unregisterTelephonyCallback(rk6Var);
        } catch (RuntimeException unused) {
            tk6Var.m22186c(5);
        }
    }
}
