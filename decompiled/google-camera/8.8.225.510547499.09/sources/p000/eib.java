package p000;

import com.google.android.libraries.vision.opengl.Texture;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eib implements ekp {

    /* JADX INFO: renamed from: a */
    private final mws f14122a;

    public eib(mws mwsVar) {
        this.f14122a = mwsVar;
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: a */
    public final void mo7345a(float[] fArr, long j) {
        mws mwsVar = this.f14122a;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ekp) mwsVar.get(i2)).mo7345a(fArr, j);
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: b */
    public final void mo7346b(int i, int i2) {
        mws mwsVar = this.f14122a;
        int i3 = ((mzr) mwsVar).f41859c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ekp) mwsVar.get(i4)).mo7346b(i, i2);
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: c */
    public final void mo7347c(Texture texture, eko ekoVar) {
        mws mwsVar = this.f14122a;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ekp) mwsVar.get(i2)).mo7347c(texture, ekoVar);
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: d */
    public final void mo7348d() {
        mws mwsVar = this.f14122a;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ekp) mwsVar.get(i2)).mo7348d();
        }
    }

    @Override // p000.ekp
    /* JADX INFO: renamed from: e */
    public final void mo7349e(eig eigVar) {
        mws mwsVar = this.f14122a;
        int i = ((mzr) mwsVar).f41859c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ekp) mwsVar.get(i2)).mo7349e(eigVar);
        }
    }
}
