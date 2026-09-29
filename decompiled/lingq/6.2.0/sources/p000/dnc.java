package p000;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dnc {

    /* JADX INFO: renamed from: a */
    public static final HashMap f35914a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f35914a = new HashMap();
        ux5.m22987j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("PlayCoreVersion");
    }
}
