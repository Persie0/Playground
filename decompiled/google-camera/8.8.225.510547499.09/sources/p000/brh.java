package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brh extends bqx {
    public brh(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return AssetFileDescriptor.class;
    }

    @Override // p000.bqx
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ Object mo2938b(AssetManager assetManager, String str) {
        return assetManager.openFd(str);
    }

    @Override // p000.bqx
    /* JADX INFO: renamed from: e */
    protected final /* synthetic */ void mo2940e(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
