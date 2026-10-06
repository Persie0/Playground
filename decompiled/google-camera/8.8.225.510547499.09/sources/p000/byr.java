package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byr implements bys {

    /* JADX INFO: renamed from: a */
    private final bti f4782a;

    /* JADX INFO: renamed from: b */
    private final bys f4783b;

    /* JADX INFO: renamed from: c */
    private final bys f4784c;

    public byr(bti btiVar, bys bysVar, bys bysVar2) {
        this.f4782a = btiVar;
        this.f4783b = bysVar;
        this.f4784c = bysVar2;
    }

    @Override // p000.bys
    /* JADX INFO: renamed from: a */
    public final bsz mo3199a(bsz bszVar, bqr bqrVar) {
        Drawable drawable = (Drawable) bszVar.mo3016c();
        if (drawable instanceof BitmapDrawable) {
            return this.f4783b.mo3199a(bxk.m3162g(((BitmapDrawable) drawable).getBitmap(), this.f4782a), bqrVar);
        }
        if (drawable instanceof byh) {
            return this.f4784c.mo3199a(bszVar, bqrVar);
        }
        return null;
    }
}
