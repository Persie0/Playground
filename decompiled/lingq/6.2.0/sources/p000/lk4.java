package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lk4 implements InterfaceC3364n9 {

    /* JADX INFO: renamed from: c */
    public static final byte[] f49759c = new byte[0];

    /* JADX INFO: renamed from: a */
    public final wi4 f49760a;

    /* JADX INFO: renamed from: b */
    public final C3373ni f49761b;

    public lk4(wi4 wi4Var, C3373ni c3373ni) {
        this.f49760a = wi4Var;
        this.f49761b = c3373ni;
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: a */
    public final byte[] mo9870a(byte[] bArr, byte[] bArr2) {
        AbstractC1126a abstractC1126aMo3497m;
        wi4 wi4Var = this.f49760a;
        AtomicReference atomicReference = l48.f49043a;
        synchronized (l48.class) {
            try {
                AbstractC3517r abstractC3517r = ((ji4) l48.f49043a.get()).m14488a(wi4Var.m23983A()).f44144a;
                Class cls = (Class) abstractC3517r.f58434c;
                if (!((Map) abstractC3517r.f58433b).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + abstractC3517r.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) l48.f49045c.get(wi4Var.m23983A())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + wi4Var.m23983A());
                }
                ByteString byteStringM23984B = wi4Var.m23984B();
                try {
                    AbstractC3572sf abstractC3572sfMo226j = abstractC3517r.mo226j();
                    AbstractC1126a abstractC1126aMo3499u = abstractC3572sfMo226j.mo3499u(byteStringM23984B);
                    abstractC3572sfMo226j.mo3500z(abstractC1126aMo3499u);
                    abstractC1126aMo3497m = abstractC3572sfMo226j.mo3497m(abstractC1126aMo3499u);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) abstractC3517r.mo226j().f60774a).getName()), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        byte[] bArrM6432d = abstractC1126aMo3497m.m6432d();
        byte[] bArrMo9870a = this.f49761b.mo9870a(bArrM6432d, f49759c);
        byte[] bArrMo9870a2 = ((InterfaceC3364n9) l48.m15792d(this.f49760a.m23983A(), bArrM6432d)).mo9870a(bArr, bArr2);
        return ByteBuffer.allocate(bArrMo9870a.length + 4 + bArrMo9870a2.length).putInt(bArrMo9870a.length).put(bArrMo9870a).put(bArrMo9870a2).array();
    }

    @Override // p000.InterfaceC3364n9
    /* JADX INFO: renamed from: b */
    public final byte[] mo9871b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((InterfaceC3364n9) l48.m15792d(this.f49760a.m23983A(), this.f49761b.mo9871b(bArr3, f49759c))).mo9871b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
