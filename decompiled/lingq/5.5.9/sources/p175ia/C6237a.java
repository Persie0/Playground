package p175ia;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p454wa.C9883h;
import p454wa.C9884i;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;

/* JADX INFO: renamed from: ia.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6237a implements InterfaceC9882g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9882g f36233a;

    /* JADX INFO: renamed from: b */
    public final byte[] f36234b;

    /* JADX INFO: renamed from: c */
    public final byte[] f36235c;

    /* JADX INFO: renamed from: d */
    public CipherInputStream f36236d;

    public C6237a(InterfaceC9882g interfaceC9882g, byte[] bArr, byte[] bArr2) {
        this.f36233a = interfaceC9882g;
        this.f36234b = bArr;
        this.f36235c = bArr2;
    }

    @Override // p454wa.InterfaceC9882g
    public final void close() throws IOException {
        if (this.f36236d != null) {
            this.f36236d = null;
            this.f36233a.close();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: e */
    public final long mo7273e(C9884i c9884i) throws IOException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f36234b, "AES"), new IvParameterSpec(this.f36235c));
                C9883h c9883h = new C9883h(this.f36233a, c9884i);
                this.f36236d = new CipherInputStream(c9883h, cipher);
                c9883h.m18380a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: g */
    public final void mo7274g(InterfaceC9894s interfaceC9894s) {
        interfaceC9894s.getClass();
        this.f36233a.mo7274g(interfaceC9894s);
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: h */
    public final Map<String, List<String>> mo7275h() {
        return this.f36233a.mo7275h();
    }

    @Override // p454wa.InterfaceC9882g
    /* JADX INFO: renamed from: k */
    public final Uri mo7276k() {
        return this.f36233a.mo7276k();
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f36236d.getClass();
        int i12 = this.f36236d.read(bArr, i10, i11);
        if (i12 < 0) {
            i12 = -1;
        }
        return i12;
    }
}
