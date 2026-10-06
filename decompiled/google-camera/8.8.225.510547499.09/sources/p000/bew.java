package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
enum bew implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return CswIK.OzfMdnhnp;
    }
}
