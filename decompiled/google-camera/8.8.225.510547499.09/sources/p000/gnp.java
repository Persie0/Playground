package p000;

import com.google.googlex.gcam.ShotMetadata;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnp implements edg {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f25770a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f25771b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f25772c;

    public gnp(ewq ewqVar, glk glkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f25772c = i;
        this.f25770a = ewqVar;
        this.f25771b = glkVar;
    }

    public gnp(gns gnsVar, glk glkVar, int i, byte[] bArr, byte[] bArr2) {
        this.f25772c = i;
        this.f25771b = gnsVar;
        this.f25770a = glkVar;
    }

    /* JADX INFO: renamed from: c */
    private final void m9561c(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        edy edyVarMo7185d = ((edw) ((gns) this.f25771b).f25779b.mo16809c()).mo7185d((glk) this.f25770a, egl.DEBLUR);
        edyVarMo7185d.mo7188d(nsaVar, shotMetadata, nrtVar, list);
        edyVarMo7185d.close();
    }

    /* JADX INFO: renamed from: d */
    private final void m9562d(nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar, List list) {
        edy edyVarMo7185d = ((edw) ((cwd) ((ewq) this.f25770a).f20679m).m5651J()).mo7185d((glk) this.f25771b, egl.DEBLUR);
        edyVarMo7185d.mo7186b(nsaVar, shotMetadata, nrtVar, list);
        edyVarMo7185d.close();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kbo] */
    @Override // p000.edg
    /* JADX INFO: renamed from: a */
    public final void mo7174a(eem eemVar, nsa nsaVar, ShotMetadata shotMetadata, nrt nrtVar) {
        switch (this.f25772c) {
            case 0:
                eemVar.m7218a();
                m9561c(nsaVar, shotMetadata, nrtVar, eemVar.f13657d);
                break;
            default:
                ((ewq) this.f25770a).f20673g.mo13940b("Got RAW image from primary shot.");
                m9562d(nsaVar, shotMetadata, nrtVar, eemVar.f13657d);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
    @Override // p000.edg
    /* JADX INFO: renamed from: b */
    public final void mo7175b(edc edcVar) {
        switch (this.f25772c) {
            case 0:
                ((nbe) ((nbe) ((nbe) gns.f25778a.m17252c()).mo17283h(edcVar)).mo17276G((char) 3060)).mo17293r("Error getting RAW image from secondary shot: %s", edcVar.getMessage());
                int i = mws.f41739d;
                m9561c(null, null, null, mzr.f41857a);
                break;
            default:
                ((ewq) this.f25770a).f20673g.mo13943e("Error getting RAW image from primary shot.", edcVar);
                int i2 = mws.f41739d;
                m9562d(null, null, null, mzr.f41857a);
                break;
        }
    }
}
