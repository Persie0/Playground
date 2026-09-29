package p407u5;

/* JADX INFO: renamed from: u5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9454e implements InterfaceC9450a<byte[]> {
    @Override // p407u5.InterfaceC9450a
    /* JADX INFO: renamed from: a */
    public final int mo17846a() {
        return 1;
    }

    @Override // p407u5.InterfaceC9450a
    /* JADX INFO: renamed from: b */
    public final int mo17847b(byte[] bArr) {
        return bArr.length;
    }

    @Override // p407u5.InterfaceC9450a
    /* JADX INFO: renamed from: g */
    public final String mo17848g() {
        return "ByteArrayPool";
    }

    @Override // p407u5.InterfaceC9450a
    public final byte[] newArray(int i10) {
        return new byte[i10];
    }
}
