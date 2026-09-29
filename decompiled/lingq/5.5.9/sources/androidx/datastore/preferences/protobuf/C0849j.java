package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0849j {

    /* JADX INFO: renamed from: a */
    public final CodedOutputStream f5881a;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C0849j(CodedOutputStream codedOutputStream) {
        Charset charset = C0871u.f5935a;
        if (codedOutputStream == null) {
            throw new NullPointerException("output");
        }
        this.f5881a = codedOutputStream;
        codedOutputStream.f5799a = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m3344a(int i10, boolean z10) throws IOException {
        this.f5881a.mo3089A(i10, z10);
    }

    /* JADX INFO: renamed from: b */
    public final void m3345b(int i10, ByteString byteString) throws IOException {
        this.f5881a.mo3091C(i10, byteString);
    }

    /* JADX INFO: renamed from: c */
    public final void m3346c(double d10, int i10) throws IOException {
        CodedOutputStream codedOutputStream = this.f5881a;
        codedOutputStream.getClass();
        codedOutputStream.mo3095G(i10, Double.doubleToRawLongBits(d10));
    }

    /* JADX INFO: renamed from: d */
    public final void m3347d(int i10, int i11) throws IOException {
        this.f5881a.mo3097I(i10, i11);
    }

    /* JADX INFO: renamed from: e */
    public final void m3348e(int i10, int i11) throws IOException {
        this.f5881a.mo3093E(i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public final void m3349f(int i10, long j10) throws IOException {
        this.f5881a.mo3095G(i10, j10);
    }

    /* JADX INFO: renamed from: g */
    public final void m3350g(int i10, float f3) throws IOException {
        CodedOutputStream codedOutputStream = this.f5881a;
        codedOutputStream.getClass();
        codedOutputStream.mo3093E(i10, Float.floatToRawIntBits(f3));
    }

    /* JADX INFO: renamed from: h */
    public final void m3351h(int i10, InterfaceC0876w0 interfaceC0876w0, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f5881a;
        codedOutputStream.mo3105Q(i10, 3);
        interfaceC0876w0.mo3389e((InterfaceC0848i0) obj, codedOutputStream.f5799a);
        codedOutputStream.mo3105Q(i10, 4);
    }

    /* JADX INFO: renamed from: i */
    public final void m3352i(int i10, int i11) throws IOException {
        this.f5881a.mo3097I(i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public final void m3353j(int i10, long j10) throws IOException {
        this.f5881a.mo3108T(i10, j10);
    }

    /* JADX INFO: renamed from: k */
    public final void m3354k(int i10, InterfaceC0876w0 interfaceC0876w0, Object obj) throws IOException {
        this.f5881a.mo3099K(i10, (InterfaceC0848i0) obj, interfaceC0876w0);
    }

    /* JADX INFO: renamed from: l */
    public final void m3355l(int i10, Object obj) throws IOException {
        boolean z10 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f5881a;
        if (z10) {
            codedOutputStream.mo3102N(i10, (ByteString) obj);
        } else {
            codedOutputStream.mo3101M(i10, (InterfaceC0848i0) obj);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3356m(int i10, int i11) throws IOException {
        this.f5881a.mo3093E(i10, i11);
    }

    /* JADX INFO: renamed from: n */
    public final void m3357n(int i10, long j10) throws IOException {
        this.f5881a.mo3095G(i10, j10);
    }

    /* JADX INFO: renamed from: o */
    public final void m3358o(int i10, int i11) throws IOException {
        this.f5881a.mo3106R(i10, (i11 >> 31) ^ (i11 << 1));
    }

    /* JADX INFO: renamed from: p */
    public final void m3359p(int i10, long j10) throws IOException {
        this.f5881a.mo3108T(i10, (j10 >> 63) ^ (j10 << 1));
    }

    /* JADX INFO: renamed from: q */
    public final void m3360q(int i10, int i11) throws IOException {
        this.f5881a.mo3106R(i10, i11);
    }

    /* JADX INFO: renamed from: r */
    public final void m3361r(int i10, long j10) throws IOException {
        this.f5881a.mo3108T(i10, j10);
    }
}
