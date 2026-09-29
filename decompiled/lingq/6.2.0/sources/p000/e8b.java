package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class e8b {

    /* JADX INFO: renamed from: a */
    public final by8 f36847a;

    /* JADX INFO: renamed from: b */
    public final nn1 f36848b;

    /* JADX INFO: renamed from: c */
    public final Handler f36849c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d */
    public final rk8 f36850d = new rk8(this, 1);

    public e8b(ExecutorService executorService) {
        by8 by8Var = new by8(executorService, 0);
        this.f36847a = by8Var;
        this.f36848b = bna.m3926O(by8Var);
    }
}
