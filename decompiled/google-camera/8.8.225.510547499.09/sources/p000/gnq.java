package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gnq implements edh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ gns f25773a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ glk f25774b;

    public gnq(gns gnsVar, glk glkVar, byte[] bArr, byte[] bArr2) {
        this.f25773a = gnsVar;
        this.f25774b = glkVar;
    }

    @Override // p000.edh
    /* JADX INFO: renamed from: a */
    public final void mo7055a(eem eemVar, InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata) {
        eemVar.m7218a();
        m9563b(interleavedImageU8, shotMetadata, eemVar.f13657d);
    }

    /* JADX INFO: renamed from: b */
    public final void m9563b(InterleavedImageU8 interleavedImageU8, ShotMetadata shotMetadata, List list) {
        edy edyVarMo7185d = ((edw) this.f25773a.f25779b.mo16809c()).mo7185d(this.f25774b, egl.ZOOM);
        edyVarMo7185d.mo7189e(interleavedImageU8, shotMetadata, list);
        edyVarMo7185d.close();
    }
}
