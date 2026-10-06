package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blw implements bgy {

    /* JADX INFO: renamed from: a */
    private static final Set f3725a = new HashSet();

    @Override // p000.bgy
    /* JADX INFO: renamed from: a */
    public final void mo2453a(String str, Throwable th) {
        Set set = f3725a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
