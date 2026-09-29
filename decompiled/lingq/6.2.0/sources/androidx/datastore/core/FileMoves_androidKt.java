package androidx.datastore.core;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File file2) {
        file.getClass();
        file2.getClass();
        return Api26Impl.INSTANCE.move(file, file2);
    }
}
