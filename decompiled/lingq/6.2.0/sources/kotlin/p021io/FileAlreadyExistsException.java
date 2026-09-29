package kotlin.p021io;

import java.io.File;
import p000.qcd;

/* JADX INFO: loaded from: classes3.dex */
public final class FileAlreadyExistsException extends FileSystemException {
    public FileAlreadyExistsException(File file, File file2, String str) {
        super(qcd.m19863a(file, file2, str));
    }
}
