package p360r9;

import java.io.IOException;
import p261m9.C7504e;
import p261m9.InterfaceC7508i;
import p479xa.C10129a;

/* JADX INFO: renamed from: r9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8750c implements InterfaceC7508i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7508i f46397a;

    /* JADX INFO: renamed from: b */
    public final long f46398b;

    public C8750c(C7504e c7504e, long j10) {
        this.f46397a = c7504e;
        C10129a.m18990b(c7504e.f41477d >= j10);
        this.f46398b = j10;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: a */
    public final long mo14992a() {
        return this.f46397a.mo14992a() - this.f46398b;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: b */
    public final boolean mo14993b(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f46397a.mo14993b(bArr, i10, i11, z10);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: c */
    public final boolean mo14994c(byte[] bArr, int i10, int i11, boolean z10) {
        return this.f46397a.mo14994c(bArr, i10, i11, z10);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: d */
    public final long mo14995d() {
        return this.f46397a.mo14995d() - this.f46398b;
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: f */
    public final void mo14996f(int i10) throws IOException {
        this.f46397a.mo14996f(i10);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: i */
    public final void mo14997i() {
        this.f46397a.mo14997i();
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: j */
    public final void mo14998j(int i10) throws IOException {
        this.f46397a.mo14998j(i10);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: l */
    public final void mo14999l(byte[] bArr, int i10, int i11) throws IOException {
        this.f46397a.mo14999l(bArr, i10, i11);
    }

    @Override // p261m9.InterfaceC7508i
    /* JADX INFO: renamed from: m */
    public final long mo15000m() {
        return this.f46397a.mo15000m() - this.f46398b;
    }

    @Override // p454wa.InterfaceC9880e
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f46397a.read(bArr, i10, i11);
    }

    @Override // p261m9.InterfaceC7508i
    public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
        this.f46397a.readFully(bArr, i10, i11);
    }
}
