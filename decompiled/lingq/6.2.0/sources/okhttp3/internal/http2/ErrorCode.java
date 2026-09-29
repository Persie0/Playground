package okhttp3.internal.http2;

import kotlin.enums.AbstractC3201a;
import p000.ft2;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);

    private final int httpCode;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final ft2 Companion = new ft2();

    ErrorCode(int i) {
        this.httpCode = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
