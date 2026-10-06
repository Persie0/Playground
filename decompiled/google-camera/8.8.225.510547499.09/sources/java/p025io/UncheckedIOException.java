package java.p025io;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class UncheckedIOException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncheckedIOException(IOException iOException) {
        super(iOException);
        iOException.getClass();
    }

    @Override // java.lang.Throwable
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
