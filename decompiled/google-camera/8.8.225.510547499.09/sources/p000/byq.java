package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byq implements bys {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4780a;

    /* JADX INFO: renamed from: b */
    private final Object f4781b;

    public byq(int i) {
        this.f4780a = i;
        this.f4781b = Bitmap.CompressFormat.JPEG;
    }

    public byq(Resources resources, int i) {
        this.f4780a = i;
        bzq.m3278r(resources);
        this.f4781b = resources;
    }

    @Override // p000.bys
    /* JADX INFO: renamed from: a */
    public final bsz mo3199a(bsz bszVar, bqr bqrVar) {
        switch (this.f4780a) {
            case 0:
                return bxk.m3161f((Resources) this.f4781b, bszVar);
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ((Bitmap) bszVar.mo3016c()).compress((Bitmap.CompressFormat) this.f4781b, 100, byteArrayOutputStream);
                bszVar.mo3018e();
                return new bxz(byteArrayOutputStream.toByteArray(), 0);
        }
    }
}
