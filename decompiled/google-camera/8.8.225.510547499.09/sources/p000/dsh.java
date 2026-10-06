package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dsh extends FaceToObfuscate {

    /* JADX INFO: renamed from: a */
    private final int f12493a;

    /* JADX INFO: renamed from: b */
    private final float f12494b;

    /* JADX INFO: renamed from: c */
    private final RectF f12495c;

    /* JADX INFO: renamed from: d */
    private final PointF f12496d;

    /* JADX INFO: renamed from: e */
    private final PointF f12497e;

    /* JADX INFO: renamed from: f */
    private final float f12498f;

    public dsh(int i, float f, RectF rectF, PointF pointF, PointF pointF2, float f2) {
        this.f12493a = i;
        this.f12494b = f;
        this.f12495c = rectF;
        this.f12496d = pointF;
        this.f12497e = pointF2;
        this.f12498f = f2;
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    /* JADX INFO: renamed from: a */
    public final float mo4119a() {
        return this.f12494b;
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    /* JADX INFO: renamed from: b */
    public final int mo4120b() {
        return this.f12493a;
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    public RectF bounds() {
        return this.f12495c;
    }

    public final boolean equals(Object obj) {
        PointF pointF;
        PointF pointF2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceToObfuscate)) {
            return false;
        }
        FaceToObfuscate faceToObfuscate = (FaceToObfuscate) obj;
        return this.f12493a == faceToObfuscate.mo4120b() && Float.floatToIntBits(this.f12494b) == Float.floatToIntBits(faceToObfuscate.mo4119a()) && this.f12495c.equals(faceToObfuscate.bounds()) && ((pointF = this.f12496d) != null ? pointF.equals(faceToObfuscate.leftEye()) : faceToObfuscate.leftEye() == null) && ((pointF2 = this.f12497e) != null ? pointF2.equals(faceToObfuscate.rightEye()) : faceToObfuscate.rightEye() == null) && Float.floatToIntBits(this.f12498f) == Float.floatToIntBits(faceToObfuscate.faceRoll());
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    public float faceRoll() {
        return this.f12498f;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((((this.f12493a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f12494b)) * 1000003) ^ this.f12495c.hashCode();
        PointF pointF = this.f12496d;
        int iHashCode = ((iFloatToIntBits * 1000003) ^ (pointF == null ? 0 : pointF.hashCode())) * 1000003;
        PointF pointF2 = this.f12497e;
        return ((iHashCode ^ (pointF2 != null ? pointF2.hashCode() : 0)) * 1000003) ^ Float.floatToIntBits(this.f12498f);
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    public PointF leftEye() {
        return this.f12496d;
    }

    @Override // com.google.android.apps.camera.faceobfuscation.api.FaceToObfuscate
    public PointF rightEye() {
        return this.f12497e;
    }

    public final String toString() {
        return "FaceToObfuscate{id=" + this.f12493a + ", score=" + this.f12494b + ", bounds=" + this.f12495c.toString() + ", leftEye=" + String.valueOf(this.f12496d) + ", rightEye=" + String.valueOf(this.f12497e) + ", faceRoll=" + this.f12498f + "}";
    }
}
