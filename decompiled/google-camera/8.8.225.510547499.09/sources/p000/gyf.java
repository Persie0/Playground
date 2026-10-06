package p000;

import java.io.File;
import java.io.FileFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gyf implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
