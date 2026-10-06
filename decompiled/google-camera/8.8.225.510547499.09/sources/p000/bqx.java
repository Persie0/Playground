package p000;

import android.content.res.AssetManager;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class bqx implements bra {

    /* JADX INFO: renamed from: a */
    private final String f4202a;

    /* JADX INFO: renamed from: b */
    private final AssetManager f4203b;

    /* JADX INFO: renamed from: c */
    private Object f4204c;

    public bqx(AssetManager assetManager, String str) {
        this.f4203b = assetManager;
        this.f4202a = str;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
    }

    /* JADX INFO: renamed from: b */
    protected abstract Object mo2938b(AssetManager assetManager, String str);

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        Object obj = this.f4204c;
        if (obj != null) {
            try {
                mo2940e(obj);
            } catch (IOException e) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    protected abstract void mo2940e(Object obj);

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        try {
            Object objMo2938b = mo2938b(this.f4203b, this.f4202a);
            this.f4204c = objMo2938b;
            bqzVar.mo2945b(objMo2938b);
        } catch (IOException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}
