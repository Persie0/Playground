package p000;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ldy implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lby f38007a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ lbm f38008b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f38009c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f38010d;

    public ldy(lby lbyVar, lbm lbmVar, Bitmap bitmap, int i) {
        this.f38010d = i;
        this.f38007a = lbyVar;
        this.f38008b = lbmVar;
        this.f38009c = bitmap;
    }

    public ldy(lby lbyVar, lbm lbmVar, kzh kzhVar, int i) {
        this.f38010d = i;
        this.f38007a = lbyVar;
        this.f38008b = lbmVar;
        this.f38009c = kzhVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        switch (this.f38010d) {
            case 0:
                ldv ldvVarM15213h = ldv.m15213h(this.f38007a.mo15153e(), this.f38008b);
                try {
                    Object obj = this.f38009c;
                    kzh kzhVar = ldvVarM15213h.f38003f.f37877a;
                    if (((Bitmap) obj).getWidth() == kzhVar.m15089b() && ((Bitmap) obj).getHeight() == kzhVar.m15088a()) {
                        ldvVarM15213h.m15215e();
                        if (ldvVarM15213h.f38002e) {
                            ldvVarM15213h.m15216f((Bitmap) obj);
                        } else if (ldvVarM15213h.f37999a.m15238b(leb.f38016a)) {
                            ldvVarM15213h.m15214d();
                            ldvVarM15213h.m15216f((Bitmap) obj);
                        } else {
                            lku.m15613H(!ldvVarM15213h.f38002e);
                            GLUtils.texImage2D(ldvVarM15213h.f38000c, 0, (Bitmap) obj, 0);
                        }
                        ldv.m15212g(ldd.m15199b());
                        return ldvVarM15213h;
                    }
                    throw new IllegalArgumentException("Bitmap of size " + ((Bitmap) obj).getWidth() + "x" + ((Bitmap) obj).getHeight() + " cannot be assigned to texture of size " + kzhVar.toString() + "!");
                } catch (Exception e) {
                    ldvVarM15213h.close();
                    throw e;
                }
            default:
                return new ldv(this.f38007a.mo15153e(), ldv.m15211b(), 36197, this.f38008b);
        }
    }

    public final String toString() {
        switch (this.f38010d) {
            case 0:
                return "createFromBitmap(" + ((Bitmap) this.f38009c).getWidth() + "x" + ((Bitmap) this.f38009c).getHeight() + ")";
            default:
                return "createExternalTexture(" + this.f38009c.toString() + ")";
        }
    }
}
