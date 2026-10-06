package p000;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class byk implements bqv {

    /* JADX INFO: renamed from: b */
    private final bqv f4754b;

    public byk(bqv bqvVar) {
        bzq.m3278r(bqvVar);
        this.f4754b = bqvVar;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        this.f4754b.mo2922a(messageDigest);
    }

    @Override // p000.bqv
    /* JADX INFO: renamed from: b */
    public final bsz mo2933b(Context context, bsz bszVar, int i, int i2) {
        byh byhVar = (byh) bszVar.mo3016c();
        bsz bxkVar = new bxk(byhVar.m3188a(), box.m2826b(context).f4032a, 1);
        bsz bszVarMo2933b = this.f4754b.mo2933b(context, bxkVar, i, i2);
        if (!bxkVar.equals(bszVarMo2933b)) {
            bxkVar.mo3018e();
        }
        Bitmap bitmap = (Bitmap) bszVarMo2933b.mo3016c();
        byhVar.f4744a.f4743a.m3197e(this.f4754b, bitmap);
        return bszVar;
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof byk) {
            return this.f4754b.equals(((byk) obj).f4754b);
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return this.f4754b.hashCode();
    }
}
