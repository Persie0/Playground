package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bxe implements bqv {

    /* JADX INFO: renamed from: b */
    private final bqv f4689b;

    /* JADX INFO: renamed from: c */
    private final boolean f4690c;

    public bxe(bqv bqvVar, boolean z) {
        this.f4689b = bqvVar;
        this.f4690c = z;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        this.f4689b.mo2922a(messageDigest);
    }

    @Override // p000.bqv
    /* JADX INFO: renamed from: b */
    public final bsz mo2933b(Context context, bsz bszVar, int i, int i2) {
        bti btiVar = box.m2826b(context).f4032a;
        Drawable drawable = (Drawable) bszVar.mo3016c();
        bsz bszVarM3153a = bxd.m3153a(btiVar, drawable, i, i2);
        if (bszVarM3153a != null) {
            bsz bszVarMo2933b = this.f4689b.mo2933b(context, bszVarM3153a, i, i2);
            if (!bszVarMo2933b.equals(bszVarM3153a)) {
                return bxk.m3161f(context.getResources(), bszVarMo2933b);
            }
            bszVarMo2933b.mo3018e();
            return bszVar;
        }
        if (!this.f4690c) {
            return bszVar;
        }
        throw new IllegalArgumentException("Unable to convert " + String.valueOf(drawable) + HEePJw.wIJHQXYUc);
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof bxe) {
            return this.f4689b.equals(((bxe) obj).f4689b);
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return this.f4689b.hashCode();
    }
}
