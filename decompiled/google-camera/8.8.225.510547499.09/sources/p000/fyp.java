package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fyp implements grh {

    /* JADX INFO: renamed from: a */
    private static final kbb f23935a = kbb.f35513b;

    /* JADX INFO: renamed from: b */
    private static final kbb f23936b = kbb.m13897c(25);

    /* JADX INFO: renamed from: c */
    private static final kbb f23937c = kbb.m13897c(95);

    /* JADX INFO: renamed from: d */
    private final gyh f23938d;

    /* JADX INFO: renamed from: e */
    private final kay f23939e;

    public fyp(gyh gyhVar, kay kayVar) {
        this.f23938d = gyhVar;
        this.f23939e = kayVar;
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: a */
    public final void mo8956a(gru gruVar, gyu gyuVar) {
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: b */
    public final void mo8957b(gru gruVar) {
        switch (gruVar.f26184c - 1) {
            case 0:
                this.f23938d.mo9652b(f23935a);
                break;
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: c */
    public final void mo8958c(gru gruVar, gsv gsvVar) {
        if (gruVar.f26184c == 3) {
            this.f23938d.mo9652b(f23937c);
        }
    }

    @Override // p000.grh
    /* JADX INFO: renamed from: d */
    public final void mo8959d(gru gruVar, bkn bknVar) {
        switch (gruVar.f26184c - 1) {
            case 0:
                Object obj = bknVar.f3651a;
                grt grtVar = gruVar.f26183b;
                this.f23938d.mo9892X(Bitmap.createBitmap((int[]) obj, grtVar.f26180b, grtVar.f26179a, Bitmap.Config.ARGB_8888), this.f23939e.f35503e);
                break;
            case 1:
                Object obj2 = bknVar.f3651a;
                grt grtVar2 = gruVar.f26183b;
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int[]) obj2, grtVar2.f26180b, grtVar2.f26179a, Bitmap.Config.ARGB_8888);
                Matrix matrix = new Matrix();
                matrix.postRotate(this.f23939e.f35503e);
                this.f23938d.mo9893Y(Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true));
                this.f23938d.mo9885Q(jvh.m13548F(C0100R.string.session_saving_image, new Object[0]));
                this.f23938d.mo9652b(f23936b);
                break;
        }
    }
}
