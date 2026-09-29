package androidx.work;

import java.util.concurrent.Executor;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum DirectExecutor implements Executor {
    INSTANCE;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
