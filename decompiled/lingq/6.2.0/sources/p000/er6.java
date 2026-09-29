package p000;

import androidx.datastore.core.okio.OkioStorage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class er6 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ OkioStorage f37753b;

    public /* synthetic */ er6(OkioStorage okioStorage, int i) {
        this.f37752a = i;
        this.f37753b = okioStorage;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f37752a;
        OkioStorage okioStorage = this.f37753b;
        switch (i) {
            case 0:
                return OkioStorage.createConnection$lambda$1(okioStorage);
            default:
                return OkioStorage.canonicalPath_delegate$lambda$0(okioStorage);
        }
    }
}
