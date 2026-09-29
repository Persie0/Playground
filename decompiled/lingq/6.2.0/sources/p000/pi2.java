package p000;

import android.graphics.PointF;
import com.airbnb.lottie.model.DocumentData$Justification;

/* JADX INFO: loaded from: classes2.dex */
public final class pi2 {

    /* JADX INFO: renamed from: a */
    public String f56229a;

    /* JADX INFO: renamed from: b */
    public String f56230b;

    /* JADX INFO: renamed from: c */
    public float f56231c;

    /* JADX INFO: renamed from: d */
    public DocumentData$Justification f56232d;

    /* JADX INFO: renamed from: e */
    public int f56233e;

    /* JADX INFO: renamed from: f */
    public float f56234f;

    /* JADX INFO: renamed from: g */
    public float f56235g;

    /* JADX INFO: renamed from: h */
    public int f56236h;

    /* JADX INFO: renamed from: i */
    public int f56237i;

    /* JADX INFO: renamed from: j */
    public float f56238j;

    /* JADX INFO: renamed from: k */
    public boolean f56239k;

    /* JADX INFO: renamed from: l */
    public PointF f56240l;

    /* JADX INFO: renamed from: m */
    public PointF f56241m;

    public final int hashCode() {
        int iOrdinal = ((this.f56232d.ordinal() + (((int) (ux5.m22980c(this.f56229a.hashCode() * 31, this.f56230b, 31) + this.f56231c)) * 31)) * 31) + this.f56233e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f56234f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f56236h;
    }
}
