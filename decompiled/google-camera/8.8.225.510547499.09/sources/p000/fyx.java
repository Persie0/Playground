package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fyx implements grh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ nqf f23945a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ kay f23946b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ nqf f23947c;

    public fyx(nqf nqfVar, kay kayVar, nqf nqfVar2) {
        this.f23945a = nqfVar;
        this.f23946b = kayVar;
        this.f23947c = nqfVar2;
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: a */
    public final void mo8956a(gru gruVar, gyu gyuVar) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: b */
    public final void mo8957b(gru gruVar) {
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: c */
    public final void mo8958c(gru gruVar, gsv gsvVar) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: d */
    public final void mo8959d(gru gruVar, bkn bknVar) {
        Object obj = bknVar.f3651a;
        grt grtVar = gruVar.f26183b;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int[]) obj, grtVar.f26180b, grtVar.f26179a, Bitmap.Config.ARGB_8888);
        int i = gruVar.f26184c;
        if (i == 1) {
            this.f23945a.mo14894e(bitmapCreateBitmap);
        } else if (i == 2) {
            Matrix matrix = new Matrix();
            matrix.postRotate(this.f23946b.f35503e);
            this.f23947c.mo14894e(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true));
        }
    }
}
