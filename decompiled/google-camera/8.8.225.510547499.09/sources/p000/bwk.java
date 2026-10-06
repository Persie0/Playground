package p000;

import android.graphics.ImageDecoder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwk implements bqt {

    /* JADX INFO: renamed from: a */
    private final bti f4658a = new btj();

    @Override // p000.bqt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2931b(Object obj, bqr bqrVar) {
        return true;
    }

    @Override // p000.bqt
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final bsz mo2930a(ImageDecoder.Source source, int i, int i2, bqr bqrVar) {
        return new bxk(ImageDecoder.decodeBitmap(source, new bwe(i, i2, bqrVar)), this.f4658a, 1);
    }
}
