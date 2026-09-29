package kotlin.p021io;

import java.io.File;
import p000.qcd;

/* JADX INFO: loaded from: classes3.dex */
public final class NoSuchFileException extends FileSystemException {
    public NoSuchFileException(File file) {
        super(qcd.m19863a(file, null, "The source file doesn't exist."));
    }
}
