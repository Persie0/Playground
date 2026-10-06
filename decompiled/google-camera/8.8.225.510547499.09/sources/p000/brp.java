package p000;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class brp extends bqx {
    public brp(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return InputStream.class;
    }

    @Override // p000.bqx
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Object mo2938b(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    @Override // p000.bqx
    /* JADX INFO: renamed from: e */
    protected final /* synthetic */ void mo2940e(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
