package p435vd;

import android.content.Context;
import android.os.Process;

/* JADX INFO: renamed from: vd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9710a {
    static {
        int iMyUid = Process.myUid();
        int iMyPid = Process.myPid();
        StringBuilder sb2 = new StringBuilder(39);
        sb2.append("UID: [");
        sb2.append(iMyUid);
        sb2.append("]  PID: [");
        sb2.append(iMyPid);
        sb2.append("] ");
        String string = sb2.toString();
        if ("SplitInstallInfoProvider".length() != 0) {
            string.concat("SplitInstallInfoProvider");
        } else {
            new String(string);
        }
    }

    public C9710a(Context context) {
        context.getPackageName();
    }
}
