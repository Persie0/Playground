package p232l2;

import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: renamed from: l2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7229h {
    /* JADX INFO: renamed from: a */
    public static IBinder m14560a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m14561b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
