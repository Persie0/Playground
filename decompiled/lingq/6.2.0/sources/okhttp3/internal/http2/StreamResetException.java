package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class StreamResetException extends IOException {

    /* JADX INFO: renamed from: a */
    public final ErrorCode f54502a;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.f54502a = errorCode;
    }
}
