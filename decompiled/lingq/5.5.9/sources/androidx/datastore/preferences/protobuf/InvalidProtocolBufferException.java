package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5813a = 0;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException() {
            super("Protocol message tag had invalid wire type.");
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: a */
    public static InvalidProtocolBufferException m3143a() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: b */
    public static InvalidWireTypeException m3144b() {
        return new InvalidWireTypeException();
    }

    /* JADX INFO: renamed from: c */
    public static InvalidProtocolBufferException m3145c() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: d */
    public static InvalidProtocolBufferException m3146d() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: renamed from: e */
    public static InvalidProtocolBufferException m3147e() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: h */
    public static InvalidProtocolBufferException m3148h() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
