package p000;

import android.app.ActivityManager;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mcd implements on9 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ mcd f51092a = new mcd();

    @Override // p000.on9
    public final /* synthetic */ Object get() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        boolean z = false;
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            int i = runningAppProcessInfo.importance;
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 17);
            sb.append("Memory state is: ");
            sb.append(i);
            Log.i("PhenotypeProcessReaper", sb.toString());
            if (runningAppProcessInfo.importance >= 400) {
                z = true;
            }
        } catch (RuntimeException e) {
            Log.w("PhenotypeProcessReaper", "Failed to retrieve memory state, not killing process.", e);
        }
        return new Boolean(z);
    }
}
