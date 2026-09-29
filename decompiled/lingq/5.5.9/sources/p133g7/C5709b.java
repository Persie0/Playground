package p133g7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: g7.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5709b {

    /* JADX INFO: renamed from: d */
    public static final int f34718d = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* JADX INFO: renamed from: a */
    public final C5710c f34719a = new C5710c(f34718d, new ThreadFactoryC5713f());

    /* JADX INFO: renamed from: b */
    public final ExecutorService f34720b = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: c */
    public final ExecutorC5712e f34721c = new ExecutorC5712e(0);
}
