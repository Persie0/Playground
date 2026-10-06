package p000;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvd implements Executor {

    /* JADX INFO: renamed from: a */
    public static final jve f34877a;

    /* JADX INFO: renamed from: b */
    public static final jvd f34878b;

    /* JADX INFO: renamed from: c */
    private static final ThreadLocal f34879c;

    /* JADX INFO: renamed from: d */
    private final jve f34880d;

    static {
        juy juyVar = new juy(jvh.m13557e(Looper.getMainLooper()));
        f34877a = juyVar;
        f34878b = new jvd(juyVar);
        f34879c = new jvc();
    }

    @Deprecated
    public jvd() {
        this(f34877a);
    }

    public jvd(jve jveVar) {
        this.f34880d = jveVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m13538a() {
        lku.m15614I(m13540d(), "Not main thread.");
    }

    /* JADX INFO: renamed from: b */
    public static void m13539b() {
        lku.m15614I(!m13540d(), "Is main thread.");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m13540d() {
        Boolean bool = (Boolean) f34879c.get();
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final void m13541c(Runnable runnable) {
        if (m13540d()) {
            runnable.run();
        } else {
            this.f34880d.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34880d.execute(runnable);
    }
}
