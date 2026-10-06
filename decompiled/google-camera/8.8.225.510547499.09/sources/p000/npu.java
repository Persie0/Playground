package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public interface npu extends ExecutorService {
    /* JADX INFO: renamed from: a */
    nps mo17548a(Runnable runnable);

    /* JADX INFO: renamed from: b */
    nps mo17549b(Callable callable);

    /* JADX INFO: renamed from: c */
    nps mo17550c(Runnable runnable, Object obj);
}
