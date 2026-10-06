package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwi implements bqu {

    /* JADX INFO: renamed from: a */
    private final bti f4653a;

    /* JADX INFO: renamed from: b */
    private final bqu f4654b;

    public bwi(bti btiVar, bqu bquVar) {
        this.f4653a = btiVar;
        this.f4654b = bquVar;
    }

    @Override // p000.bqf
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2915a(Object obj, File file, bqr bqrVar) {
        return this.f4654b.mo2915a(new bxk(((BitmapDrawable) ((bsz) obj).mo3016c()).getBitmap(), this.f4653a, 1), file, bqrVar);
    }

    @Override // p000.bqu
    /* JADX INFO: renamed from: b */
    public final int mo2932b() {
        return 2;
    }
}
