package p000;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.lasagna.LasagnaCallbacks;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class epp implements LasagnaCallbacks {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ epr f15002a;

    public epp(epr eprVar) {
        this.f15002a = eprVar;
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    /* JADX INFO: renamed from: a */
    public final void mo5159a(int i, int i2, String str, mrm mrmVar) {
        eqf eqfVar = (eqf) this.f15002a.f15025n.remove(Integer.valueOf(i));
        eqfVar.getClass();
        eqfVar.mo5159a(i, i2, str, mrmVar);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    /* JADX INFO: renamed from: e */
    public final void mo5160e(int i, long j, int i2, String str, ShotMetadata shotMetadata) {
        eqf eqfVar = (eqf) this.f15002a.f15025n.get(Integer.valueOf(i));
        eqfVar.getClass();
        eqfVar.mo5160e(i, j, i2, str, shotMetadata);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onFinalStatusNative(int i, int i2, String str, byte[] bArr) {
        ntw.$default$onFinalStatusNative(this, i, i2, str, bArr);
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final /* synthetic */ void onImageNative(int i, long j, int i2, String str, long j2) {
        ntw.$default$onImageNative(this, i, j, i2, str, j2);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [gaw, java.lang.Object] */
    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onProgress(int i, float f) {
        eqf eqfVar = (eqf) this.f15002a.f15025n.get(Integer.valueOf(i));
        eqfVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("Processing progress: ");
        sb.append(f);
        eem eemVar = eqfVar.f15121i;
        if (eemVar != null) {
            eemVar.f13675v.f25500a.mo9016a(eqv.f15216t, f);
        } else {
            ((nbe) ((nbe) eqf.f15113a.m17252c()).mo17276G((char) 1798)).mo17290o("Shot has been aborted.");
        }
    }

    @Override // com.google.googlex.gcam.lasagna.LasagnaCallbacks
    public final void onPslRequest(int i, boolean z, float f, float f2) {
        eqf eqfVar = (eqf) this.f15002a.f15025n.get(Integer.valueOf(i));
        eqfVar.getClass();
        eqfVar.onPslRequest(i, z, f, f2);
    }
}
