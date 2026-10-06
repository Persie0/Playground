package p000;

import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class eew implements fxp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f13756a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ boolean f13757b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ ShotMetadata f13758c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f13759d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ gyh f13760e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ efa f13761f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ ihk f13762g;

    public eew(efa efaVar, ihk ihkVar, int i, boolean z, ShotMetadata shotMetadata, int i2, gyh gyhVar, byte[] bArr, byte[] bArr2) {
        this.f13761f = efaVar;
        this.f13762g = ihkVar;
        this.f13756a = i;
        this.f13757b = z;
        this.f13758c = shotMetadata;
        this.f13759d = i2;
        this.f13760e = gyhVar;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: a */
    public final nps mo6600a() {
        nqf nqfVarM17621g = nqf.m17621g();
        efa efaVar = this.f13761f;
        efaVar.f13789c.execute(new eey(efaVar, this.f13762g, nqfVarM17621g, this.f13756a, this.f13757b, this.f13758c, this.f13759d, this.f13760e.mo9898d(), this.f13760e.mo9907m(), null, null));
        return nqfVarM17621g;
    }

    @Override // p000.fxp
    /* JADX INFO: renamed from: b */
    public final nps mo6601b() {
        return kxk.m14964J(new kec("RGB image couldn't be encoded into jpeg."));
    }
}
