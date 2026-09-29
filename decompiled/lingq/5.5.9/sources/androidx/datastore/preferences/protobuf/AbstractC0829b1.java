package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.b1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0829b1<T, B> {
    /* JADX INFO: renamed from: a */
    public abstract void mo3173a(int i10, int i11, Object obj);

    /* JADX INFO: renamed from: b */
    public abstract void mo3174b(int i10, long j10, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract void mo3175c(B b10, int i10, T t10);

    /* JADX INFO: renamed from: d */
    public abstract void mo3176d(B b10, int i10, ByteString byteString);

    /* JADX INFO: renamed from: e */
    public abstract void mo3177e(int i10, long j10, Object obj);

    /* JADX INFO: renamed from: f */
    public abstract C0832c1 mo3178f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract C0832c1 mo3179g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo3180h(T t10);

    /* JADX INFO: renamed from: i */
    public abstract int mo3181i(T t10);

    /* JADX INFO: renamed from: j */
    public abstract void mo3182j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract C0832c1 mo3183k(Object obj, Object obj2);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m3184l(B b10, InterfaceC0874v0 interfaceC0874v0) throws IOException {
        int iMo3324g = interfaceC0874v0.mo3324g();
        int i10 = iMo3324g >>> 3;
        int i11 = iMo3324g & 7;
        if (i11 == 0) {
            mo3177e(i10, interfaceC0874v0.mo3306K(), b10);
            return true;
        }
        if (i11 == 1) {
            mo3174b(i10, interfaceC0874v0.mo3321d(), b10);
            return true;
        }
        if (i11 == 2) {
            mo3176d(b10, i10, interfaceC0874v0.mo3297B());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 == 5) {
                mo3173a(i10, interfaceC0874v0.mo3326i(), b10);
                return true;
            }
            int i12 = InvalidProtocolBufferException.f5813a;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        C0832c1 c0832c1Mo3185m = mo3185m();
        int i13 = (i10 << 3) | 4;
        while (interfaceC0874v0.mo3342y() != Integer.MAX_VALUE && m3184l(c0832c1Mo3185m, interfaceC0874v0)) {
        }
        if (i13 != interfaceC0874v0.mo3324g()) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        mo3175c(b10, i10, mo3189q(c0832c1Mo3185m));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public abstract C0832c1 mo3185m();

    /* JADX INFO: renamed from: n */
    public abstract void mo3186n(Object obj, B b10);

    /* JADX INFO: renamed from: o */
    public abstract void mo3187o(Object obj, T t10);

    /* JADX INFO: renamed from: p */
    public abstract void mo3188p();

    /* JADX INFO: renamed from: q */
    public abstract C0832c1 mo3189q(Object obj);

    /* JADX INFO: renamed from: r */
    public abstract void mo3190r(Object obj, C0849j c0849j) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo3191s(Object obj, C0849j c0849j) throws IOException;
}
