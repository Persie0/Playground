package p000;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class bma {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f8696a = 0;

    /* JADX INFO: renamed from: b */
    public static s46 f8697b;

    /* JADX INFO: renamed from: a */
    public static boolean m3879a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
