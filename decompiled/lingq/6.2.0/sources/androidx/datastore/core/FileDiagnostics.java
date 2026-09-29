package androidx.datastore.core;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class FileDiagnostics {
    public static final FileDiagnostics INSTANCE = new FileDiagnostics();

    private FileDiagnostics() {
    }

    private final IOException attachFileSystemMessage(File file, IOException iOException) {
        StringBuilder sb = new StringBuilder("Inoperable file:");
        try {
            sb.append(" canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + ']');
        } catch (IOException unused) {
            sb.append(" failed to attach additional metadata");
        }
        return new IOException(sb.toString(), iOException);
    }

    private final IOException attachParentStacktrace(File file, IOException iOException) {
        File parentFile = file.getParentFile();
        if (parentFile != null && parentFile.exists()) {
            if (parentFile.isFile()) {
                if (parentFile.canRead()) {
                    return parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException);
                }
                return parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException);
            }
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException);
            }
            return parentFile.canWrite() ? attachFileSystemMessage(file, iOException) : attachFileSystemMessage(file, iOException);
        }
        return attachFileSystemMessage(file, iOException);
    }

    public final IOException attachFileDebugInfo(File file, IOException iOException) {
        file.getClass();
        iOException.getClass();
        if (!file.exists()) {
            return attachParentStacktrace(file, iOException);
        }
        if (file.isFile()) {
            if (file.canRead()) {
                return file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException);
            }
            return file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException);
        }
        if (file.canRead()) {
            return file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException);
        }
        return file.canWrite() ? attachParentStacktrace(file, iOException) : attachParentStacktrace(file, iOException);
    }
}
