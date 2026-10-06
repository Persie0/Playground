package p000;

import android.graphics.PointF;
import com.google.android.material.snackbar.VMX.rgoX;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwf {

    /* JADX INFO: renamed from: a */
    private final float f12727a;

    /* JADX INFO: renamed from: b */
    private final float f12728b;

    /* JADX INFO: renamed from: c */
    private final PointF f12729c;

    /* JADX INFO: renamed from: d */
    private final PointF f12730d;

    /* JADX INFO: renamed from: e */
    private final float f12731e;

    /* JADX INFO: renamed from: f */
    private final float f12732f;

    public dwf(float f, float f2, PointF pointF, PointF pointF2, float f3, float f4) {
        this.f12727a = f;
        this.f12728b = f2;
        this.f12729c = pointF;
        this.f12730d = pointF2;
        this.f12731e = f3;
        this.f12732f = f4;
    }

    /* JADX INFO: renamed from: d */
    public static final float m6804d(float f) {
        return (-f) + 1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final float m6805a(float f) {
        float f2 = this.f12731e;
        return f2 + ((this.f12732f - f2) * f);
    }

    /* JADX INFO: renamed from: b */
    public final float m6806b(float f) {
        float f2 = this.f12727a;
        return f2 + ((this.f12728b - f2) * f);
    }

    /* JADX INFO: renamed from: c */
    public final PointF m6807c(float f) {
        return new PointF(this.f12729c.x + ((this.f12730d.x - this.f12729c.x) * f), this.f12729c.y + ((this.f12730d.y - this.f12729c.y) * f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(getClass().getName()).concat(" {"));
        float f = this.f12727a;
        float f2 = this.f12728b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" scale: ");
        sb2.append(f);
        String str = rgoX.vwkICOfjyMoGTSH;
        sb2.append(str);
        sb2.append(f2);
        sb.append(sb2.toString());
        sb.append(", translation: " + this.f12729c.toString() + str + this.f12730d.toString());
        sb.append(NptsKnlVczSZ.UcMPuKOnZRpXo + this.f12731e + str + this.f12732f);
        sb.append(", bgAlpha: 1.0" + str + 0.0f);
        sb.append("}");
        return sb.toString();
    }
}
