package p000;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p72 implements on9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55688a;

    @Override // p000.on9
    public final Object get() {
        switch (this.f55688a) {
            case 0:
                byte[] bArr = new byte[12];
                r72.f58823i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                return new h72();
            default:
                throw new IllegalStateException();
        }
    }
}
