package p000;

import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ctk implements ctp {

    /* JADX INFO: renamed from: a */
    private static final nbh f9476a = nbh.m17259h("com/google/android/apps/camera/camcorder/file/FileDescriptorOutputVideo");

    /* JADX INFO: renamed from: b */
    private final ParcelFileDescriptor f9477b;

    /* JADX INFO: renamed from: c */
    private final FileDescriptor f9478c;

    public ctk(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9477b = parcelFileDescriptor;
        this.f9478c = parcelFileDescriptor.getFileDescriptor();
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: a */
    public final long mo5497a() {
        return this.f9477b.getStatSize();
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gyx mo5498b() {
        return dhk.m6163e(this);
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: c */
    public final mrm mo5499c() {
        return mqu.f41450a;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f9477b.close();
        } catch (IOException e) {
            ((nbe) ((nbe) ((nbe) f9476a.m17251b()).mo17283h(e)).mo17276G((char) 603)).mo17290o("Error closing parcelFileDescriptor.");
        }
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: d */
    public final mrm mo5500d() {
        return mqu.f41450a;
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: e */
    public final nps mo5501e() {
        return kxk.m14965K(this.f9478c);
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: f */
    public final FileDescriptor mo5502f() {
        throw null;
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: g */
    public final void mo5503g() {
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: h */
    public final boolean mo5504h() {
        return true;
    }

    @Override // p000.ctp
    /* JADX INFO: renamed from: i */
    public final void mo5505i() {
    }
}
