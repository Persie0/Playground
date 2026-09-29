package p389t2;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: renamed from: t2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C9192k {
    /* JADX INFO: renamed from: a */
    public static boolean m17533a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
