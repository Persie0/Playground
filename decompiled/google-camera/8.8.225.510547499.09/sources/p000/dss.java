package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dss {

    /* JADX INFO: renamed from: a */
    public int f12507a;

    /* JADX INFO: renamed from: b */
    public RectF f12508b;

    /* JADX INFO: renamed from: c */
    public PointF f12509c;

    /* JADX INFO: renamed from: d */
    public PointF f12510d;

    /* JADX INFO: renamed from: e */
    public byte f12511e;

    /* JADX INFO: renamed from: f */
    private float f12512f;

    /* JADX INFO: renamed from: g */
    private float f12513g;

    /* JADX INFO: renamed from: a */
    public final FaceToObfuscate m6663a() {
        RectF rectF;
        if (this.f12511e == 7 && (rectF = this.f12508b) != null) {
            return new dsh(this.f12507a, this.f12512f, rectF, this.f12509c, this.f12510d, this.f12513g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f12511e & 1) == 0) {
            sb.append(" id");
        }
        if ((this.f12511e & 2) == 0) {
            sb.append(" score");
        }
        if (this.f12508b == null) {
            sb.append(" bounds");
        }
        if ((this.f12511e & 4) == 0) {
            sb.append(" faceRoll");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m6664b(float f) {
        this.f12513g = f;
        this.f12511e = (byte) (this.f12511e | 4);
    }

    /* JADX INFO: renamed from: c */
    public final void m6665c(float f) {
        this.f12512f = f;
        this.f12511e = (byte) (this.f12511e | 2);
    }
}
