package kotlin.reflect.jvm.internal.impl.protobuf;

import com.kochava.tracker.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC6997h;
import p282nn.InterfaceC7809g;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6991b<MessageType extends InterfaceC6997h> implements InterfaceC7809g<MessageType> {
    static {
        int i10 = C6993d.f39517b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m13937b(InterfaceC6997h interfaceC6997h) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (interfaceC6997h == null || interfaceC6997h.mo13780b()) {
            return;
        }
        if (interfaceC6997h instanceof AbstractC6990a) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.f39506a = interfaceC6997h;
        throw invalidProtocolBufferException;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final InterfaceC6997h m13938c(ByteArrayInputStream byteArrayInputStream, C6993d c6993d) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                messagetype = null;
            } else {
                if ((i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0) {
                    i10 &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 < 32) {
                            int i12 = byteArrayInputStream.read();
                            if (i12 == -1) {
                                throw InvalidProtocolBufferException.m13935b();
                            }
                            i10 |= (i12 & 127) << i11;
                            if ((i12 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                                break;
                            }
                            i11 += 7;
                        } else {
                            while (true) {
                                if (i11 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i13 = byteArrayInputStream.read();
                                if (i13 == -1) {
                                    throw InvalidProtocolBufferException.m13935b();
                                }
                                if ((i13 & BuildConfig.SDK_TRUNCATE_LENGTH) == 0) {
                                    break;
                                }
                                i11 += 7;
                            }
                        }
                    }
                }
                C6992c c6992c = new C6992c(new AbstractC6990a.a.C10647a(i10, byteArrayInputStream));
                MessageType messagetypeMo13787a = mo13787a(c6992c, c6993d);
                try {
                    c6992c.m13939a(0);
                    messagetype = messagetypeMo13787a;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f39506a = messagetypeMo13787a;
                    throw e10;
                }
            }
            m13937b(messagetype);
            return messagetype;
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }
}
