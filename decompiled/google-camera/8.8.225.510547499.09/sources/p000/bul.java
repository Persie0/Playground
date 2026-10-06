package p000;

import android.content.res.AssetManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bul implements bvm, buk {

    /* JADX INFO: renamed from: a */
    private final AssetManager f4491a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4492b;

    public bul(AssetManager assetManager, int i) {
        this.f4492b = i;
        this.f4491a = assetManager;
    }

    @Override // p000.buk
    /* JADX INFO: renamed from: a */
    public final bra mo3079a(AssetManager assetManager, String str) {
        switch (this.f4492b) {
            case 0:
                return new brp(assetManager, str);
            default:
                return new brh(assetManager, str);
        }
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4492b) {
            case 0:
                break;
        }
        return new buw(this.f4491a, this, 1);
    }
}
