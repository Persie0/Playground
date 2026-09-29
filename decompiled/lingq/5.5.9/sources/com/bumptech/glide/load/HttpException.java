package com.bumptech.glide.load;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends IOException {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public HttpException() {
        throw null;
    }

    public HttpException(int i10, String str, IOException iOException) {
        super(str + ", status code: " + i10, iOException);
    }
}
