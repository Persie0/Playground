package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0824a;
import androidx.datastore.preferences.protobuf.AbstractC0824a.a;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0824a<MessageType extends AbstractC0824a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0848i0 {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a */
    public static abstract class a<MessageType extends AbstractC0824a<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements InterfaceC0848i0.a {
    }

    /* JADX INFO: renamed from: a */
    public int mo3127a() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0848i0
    /* JADX INFO: renamed from: g */
    public final ByteString mo3163g() {
        try {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this;
            int iMo3130d = generatedMessageLite.mo3130d();
            ByteString byteString = ByteString.f5793b;
            byte[] bArr = new byte[iMo3130d];
            Logger logger = CodedOutputStream.f5797b;
            CodedOutputStream.C0808b c0808b = new CodedOutputStream.C0808b(bArr, iMo3130d);
            generatedMessageLite.mo3133h(c0808b);
            if (c0808b.f5804e - c0808b.f5805f == 0) {
                return new ByteString.LiteralByteString(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m3164i(InterfaceC0876w0 interfaceC0876w0) {
        int iMo3127a = mo3127a();
        if (iMo3127a == -1) {
            iMo3127a = interfaceC0876w0.mo3391g(this);
            mo3134j(iMo3127a);
        }
        return iMo3127a;
    }

    /* JADX INFO: renamed from: j */
    public void mo3134j(int i10) {
        throw new UnsupportedOperationException();
    }
}
