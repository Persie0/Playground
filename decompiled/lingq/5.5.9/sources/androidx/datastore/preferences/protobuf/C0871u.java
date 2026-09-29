package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0871u {

    /* JADX INFO: renamed from: a */
    public static final Charset f5935a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final byte[] f5936b;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        int getNumber();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean m3442a();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$c */
    public interface c<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: E */
        c<E> mo3165E(int i10);

        /* JADX INFO: renamed from: j0 */
        boolean mo3193j0();

        /* JADX INFO: renamed from: z */
        void mo3194z();
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5936b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new AbstractC0845h.a(bArr, 0, 0, false).mo3258e(0);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3440a(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static GeneratedMessageLite m3441b(Object obj, Object obj2) {
        GeneratedMessageLite.AbstractC0811a abstractC0811aMo3129c = ((InterfaceC0848i0) obj).mo3129c();
        InterfaceC0848i0 interfaceC0848i0 = (InterfaceC0848i0) obj2;
        abstractC0811aMo3129c.getClass();
        if (!abstractC0811aMo3129c.f5810a.getClass().isInstance(interfaceC0848i0)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0811aMo3129c.m3138k();
        GeneratedMessageLite.AbstractC0811a.m3135m(abstractC0811aMo3129c.f5811b, (GeneratedMessageLite) ((AbstractC0824a) interfaceC0848i0));
        return abstractC0811aMo3129c.m3137j();
    }
}
