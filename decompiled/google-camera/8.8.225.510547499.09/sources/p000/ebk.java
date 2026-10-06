package p000;

import com.google.googlex.gcam.InterleavedImageU16;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebk implements ede {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f13225a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ewq f13226b;

    public ebk(ewq ewqVar, nqf nqfVar, byte[] bArr) {
        this.f13226b = ewqVar;
        this.f13225a = nqfVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kbz] */
    @Override // p000.ede
    /* JADX INFO: renamed from: a */
    public final void mo7060a(InterleavedImageU16 interleavedImageU16) {
        this.f13226b.f20674h.mo13961e("MergedPdCallback");
        this.f13225a.mo14894e(interleavedImageU16);
        this.f13226b.f20674h.mo13962f();
    }

    @Override // p000.ede
    /* JADX INFO: renamed from: b */
    public final void mo7061b(edc edcVar) {
        this.f13225a.mo8566a(new kec("Error merging PD data", edcVar));
    }
}
