package p000;

import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fri implements edj {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ long f23310a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kpp f23311b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ kpw f23312c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ kmv f23313d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ ftg f23314e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ frk f23315f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ npk f23316g;

    public fri(frk frkVar, npk npkVar, long j, kpp kppVar, kpw kpwVar, kmv kmvVar, ftg ftgVar, byte[] bArr, byte[] bArr2) {
        this.f23315f = frkVar;
        this.f23316g = npkVar;
        this.f23310a = j;
        this.f23311b = kppVar;
        this.f23312c = kpwVar;
        this.f23313d = kmvVar;
        this.f23314e = ftgVar;
    }

    @Override // p000.edj
    /* JADX INFO: renamed from: a */
    public final void mo7054a(eem eemVar, YuvImage yuvImage, ShotMetadata shotMetadata) {
        kpw kpwVarMo8714a = this.f23315f.f23321d.mo8714a(new iay((gzl) this.f23316g.f44028b, Long.valueOf(this.f23310a), kxk.m14965K(this.f23311b), this.f23316g.f44027a), ntw.m17720f(yuvImage), this.f23312c, shotMetadata);
        this.f23313d.m14586l();
        this.f23314e.mo8684c(kpwVarMo8714a);
    }
}
