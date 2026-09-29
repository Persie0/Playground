package p258m6;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: m6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7485e {

    /* JADX INFO: renamed from: a */
    public static final a f41368a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f41369b = new b();

    /* JADX INFO: renamed from: m6.e$a */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C7492l.m14884e().post(runnable);
        }
    }

    /* JADX INFO: renamed from: m6.e$b */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
