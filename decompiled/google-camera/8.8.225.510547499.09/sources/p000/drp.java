package p000;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class drp extends FaceToBeautify {

    /* JADX INFO: renamed from: a */
    private final Rect f12417a;

    /* JADX INFO: renamed from: b */
    private final Integer f12418b;

    /* JADX INFO: renamed from: c */
    private final Float f12419c;

    /* JADX INFO: renamed from: d */
    private final Float f12420d;

    /* JADX INFO: renamed from: e */
    private final Point f12421e;

    /* JADX INFO: renamed from: f */
    private final Point f12422f;

    /* JADX INFO: renamed from: g */
    private final Point f12423g;

    /* JADX INFO: renamed from: h */
    private final Point f12424h;

    /* JADX INFO: renamed from: i */
    private final Point f12425i;

    /* JADX INFO: renamed from: j */
    private final Point f12426j;

    /* JADX INFO: renamed from: k */
    private final float[] f12427k;

    public drp(Rect rect, Integer num, Float f, Float f2, Point point, Point point2, Point point3, Point point4, Point point5, Point point6, float[] fArr) {
        this.f12417a = rect;
        this.f12418b = num;
        this.f12419c = f;
        this.f12420d = f2;
        this.f12421e = point;
        this.f12422f = point2;
        this.f12423g = point3;
        this.f12424h = point4;
        this.f12425i = point5;
        this.f12426j = point6;
        this.f12427k = fArr;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Rect bounds() {
        return this.f12417a;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Float confidence() {
        return this.f12419c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Float f;
        Float f2;
        Point point;
        Point point2;
        Point point3;
        Point point4;
        Point point5;
        Point point6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FaceToBeautify)) {
            return false;
        }
        FaceToBeautify faceToBeautify = (FaceToBeautify) obj;
        if (this.f12417a.equals(faceToBeautify.bounds()) && ((num = this.f12418b) != null ? num.equals(faceToBeautify.index()) : faceToBeautify.index() == null) && ((f = this.f12419c) != null ? f.equals(faceToBeautify.confidence()) : faceToBeautify.confidence() == null) && ((f2 = this.f12420d) != null ? f2.equals(faceToBeautify.panAngleDegrees()) : faceToBeautify.panAngleDegrees() == null) && ((point = this.f12421e) != null ? point.equals(faceToBeautify.leftEye()) : faceToBeautify.leftEye() == null) && ((point2 = this.f12422f) != null ? point2.equals(faceToBeautify.rightEye()) : faceToBeautify.rightEye() == null) && ((point3 = this.f12423g) != null ? point3.equals(faceToBeautify.noseTip()) : faceToBeautify.noseTip() == null) && ((point4 = this.f12424h) != null ? point4.equals(faceToBeautify.mouthCenter()) : faceToBeautify.mouthCenter() == null) && ((point5 = this.f12425i) != null ? point5.equals(faceToBeautify.leftEarTragion()) : faceToBeautify.leftEarTragion() == null) && ((point6 = this.f12426j) != null ? point6.equals(faceToBeautify.rightEarTragion()) : faceToBeautify.rightEarTragion() == null)) {
            if (Arrays.equals(this.f12427k, faceToBeautify instanceof drp ? ((drp) faceToBeautify).f12427k : faceToBeautify.faceAttributes())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public float[] faceAttributes() {
        return this.f12427k;
    }

    public final int hashCode() {
        int iHashCode = this.f12417a.hashCode() ^ 1000003;
        Integer num = this.f12418b;
        int iHashCode2 = ((iHashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Float f = this.f12419c;
        int iHashCode3 = (iHashCode2 ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Float f2 = this.f12420d;
        int iHashCode4 = (iHashCode3 ^ (f2 == null ? 0 : f2.hashCode())) * 1000003;
        Point point = this.f12421e;
        int iHashCode5 = (iHashCode4 ^ (point == null ? 0 : point.hashCode())) * 1000003;
        Point point2 = this.f12422f;
        int iHashCode6 = (iHashCode5 ^ (point2 == null ? 0 : point2.hashCode())) * 1000003;
        Point point3 = this.f12423g;
        int iHashCode7 = (iHashCode6 ^ (point3 == null ? 0 : point3.hashCode())) * 1000003;
        Point point4 = this.f12424h;
        int iHashCode8 = (iHashCode7 ^ (point4 == null ? 0 : point4.hashCode())) * 1000003;
        Point point5 = this.f12425i;
        int iHashCode9 = (iHashCode8 ^ (point5 == null ? 0 : point5.hashCode())) * 1000003;
        Point point6 = this.f12426j;
        return ((iHashCode9 ^ (point6 != null ? point6.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f12427k);
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Integer index() {
        return this.f12418b;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point leftEarTragion() {
        return this.f12425i;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point leftEye() {
        return this.f12421e;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point mouthCenter() {
        return this.f12424h;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point noseTip() {
        return this.f12423g;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Float panAngleDegrees() {
        return this.f12420d;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point rightEarTragion() {
        return this.f12426j;
    }

    @Override // com.google.android.apps.camera.facemetadata.conversions.FaceToBeautify
    public Point rightEye() {
        return this.f12422f;
    }

    public final String toString() {
        return "FaceToBeautify{bounds=" + this.f12417a.toString() + ", index=" + this.f12418b + ", confidence=" + this.f12419c + ", panAngleDegrees=" + this.f12420d + ", leftEye=" + String.valueOf(this.f12421e) + ", rightEye=" + String.valueOf(this.f12422f) + ", noseTip=" + String.valueOf(this.f12423g) + ", mouthCenter=" + String.valueOf(this.f12424h) + ", leftEarTragion=" + String.valueOf(this.f12425i) + ", rightEarTragion=" + String.valueOf(this.f12426j) + ", faceAttributes=" + Arrays.toString(this.f12427k) + "}";
    }
}
