package androidx.datastore.core;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class InterProcessCoordinator_jvmKt {
    public static final InterProcessCoordinator createSingleProcessCoordinator(File file) {
        file.getClass();
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        absolutePath.getClass();
        return InterProcessCoordinatorKt.createSingleProcessCoordinator(absolutePath);
    }
}
