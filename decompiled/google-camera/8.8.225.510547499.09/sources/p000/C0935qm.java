package p000;

import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: qm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0935qm extends C0210gh {

    /* JADX INFO: renamed from: a */
    public final Object f47495a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f47496b = Executors.newFixedThreadPool(4, new ThreadFactoryC0934ql());

    /* JADX INFO: renamed from: c */
    public volatile Handler f47497c;
}
