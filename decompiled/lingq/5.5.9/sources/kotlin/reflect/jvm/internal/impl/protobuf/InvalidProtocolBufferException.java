package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: a */
    public InterfaceC6997h f39506a;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f39506a = null;
    }

    /* JADX INFO: renamed from: b */
    public static InvalidProtocolBufferException m13935b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: a */
    public final void m13936a(InterfaceC6997h interfaceC6997h) {
        this.f39506a = interfaceC6997h;
    }
}
