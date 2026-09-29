package p115fb;

import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;

/* JADX INFO: renamed from: fb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5490f extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z10);
        }
        if (Log.isLoggable("CloudMessengerCompat", 3)) {
            Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        }
        return zzd.class;
    }
}
