package p027b6;

import ae.C0062b;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: b6.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1322b implements InterfaceC9207m<byte[]> {

    /* JADX INFO: renamed from: a */
    public final byte[] f8075a;

    public C1322b(byte[] bArr) {
        C0062b.m345f0(bArr);
        this.f8075a = bArr;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final void mo157b() {
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        return this.f8075a.length;
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<byte[]> mo159d() {
        return byte[].class;
    }

    @Override // p392t5.InterfaceC9207m
    public final byte[] get() {
        return this.f8075a;
    }
}
