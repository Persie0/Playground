package p000;

import android.content.res.Resources;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class buu implements bra {

    /* JADX INFO: renamed from: a */
    private final Resources.Theme f4501a;

    /* JADX INFO: renamed from: b */
    private final Resources f4502b;

    /* JADX INFO: renamed from: c */
    private final buv f4503c;

    /* JADX INFO: renamed from: d */
    private final int f4504d;

    /* JADX INFO: renamed from: e */
    private Object f4505e;

    public buu(Resources.Theme theme, Resources resources, buv buvVar, int i) {
        this.f4501a = theme;
        this.f4502b = resources;
        this.f4503c = buvVar;
        this.f4504d = i;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return this.f4503c.mo3085a();
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        Object obj = this.f4505e;
        if (obj != null) {
            try {
                this.f4503c.mo3087d(obj);
            } catch (IOException e) {
            }
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        try {
            Object objMo3086c = this.f4503c.mo3086c(this.f4501a, this.f4502b, this.f4504d);
            this.f4505e = objMo3086c;
            bqzVar.mo2945b(objMo3086c);
        } catch (Resources.NotFoundException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}
