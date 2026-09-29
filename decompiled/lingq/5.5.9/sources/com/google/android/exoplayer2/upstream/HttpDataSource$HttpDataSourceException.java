package com.google.android.exoplayer2.upstream;

import ae.C0062b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {

    /* JADX INFO: renamed from: c */
    public final int f13691c;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.f13691c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(IOException iOException, int i10, int i11) {
        if (i10 == 2000 && i11 == 1) {
            i10 = 2001;
        }
        super(iOException, i10);
        this.f13691c = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f13691c = 1;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i10) {
        super(i10 == 2000 ? 2001 : i10, str, iOException);
        this.f13691c = 1;
    }

    /* JADX INFO: renamed from: a */
    public static HttpDataSource$HttpDataSourceException m7465a(final IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !C0062b.m383p2(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$HttpDataSourceException(iOException) { // from class: com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException
        } : new HttpDataSource$HttpDataSourceException(iOException, i11, i10);
    }
}
