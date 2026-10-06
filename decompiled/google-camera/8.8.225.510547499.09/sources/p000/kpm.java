package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kpm {

    /* JADX INFO: renamed from: a */
    public final kpe f36801a;

    /* JADX INFO: renamed from: b */
    public final float f36802b;

    /* JADX INFO: renamed from: c */
    public final float f36803c;

    /* JADX INFO: renamed from: d */
    public final float f36804d;

    /* JADX INFO: renamed from: e */
    private final PointF[] f36805e;

    /* JADX INFO: renamed from: f */
    private final HashMap f36806f = new HashMap();

    public kpm(kpe kpeVar, byte[] bArr, float[] fArr, float[] fArr2) {
        this.f36805e = new PointF[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f36806f.put(Byte.valueOf(bArr[i]), Integer.valueOf(i));
            int i2 = i + i;
            this.f36805e[i] = new PointF(fArr[i2], fArr[i2 + 1]);
        }
        this.f36801a = kpeVar;
        this.f36802b = fArr2[0];
        this.f36803c = fArr2[1];
        this.f36804d = fArr2[2];
    }

    /* JADX INFO: renamed from: h */
    public static List m14672h(kpl kplVar) {
        ArrayList arrayList = new ArrayList();
        Face[] faceArr = (Face[]) kplVar.mo9517d(CaptureResult.STATISTICS_FACES);
        int[] iArr = (int[]) kplVar.mo9517d(ivt.f32359m);
        byte[] bArr = (byte[]) kplVar.mo9517d(ivt.f32360n);
        float[] fArr = (float[]) kplVar.mo9517d(ivt.f32361o);
        float[] fArr2 = (float[]) kplVar.mo9517d(ivt.f32362p);
        float[] fArr3 = (float[]) kplVar.mo9517d(ivt.f32363q);
        if (faceArr != null && iArr != null && bArr != null && fArr != null && fArr2 != null && fArr3 != null) {
            int i = 0;
            int i2 = 0;
            while (i < faceArr.length) {
                int i3 = iArr[i];
                byte[] bArr2 = new byte[i3];
                int i4 = i3 + i3;
                float[] fArr4 = new float[i4];
                float[] fArr5 = new float[i3];
                int i5 = i2 + i3;
                int[] iArr2 = iArr;
                float[] fArr6 = new float[3];
                int length = bArr.length;
                ArrayList arrayList2 = arrayList;
                if (i5 <= length) {
                    System.arraycopy(bArr, i2, bArr2, 0, i3);
                } else {
                    Log.e("FaceExt2018", "faceLandmarkIds length is too short:" + length);
                }
                int i6 = i5 + i5;
                int length2 = fArr.length;
                if (i6 <= length2) {
                    System.arraycopy(fArr, i2 + i2, fArr4, 0, i4);
                } else {
                    Log.e("FaceExt2018", "faceLandmarkXy length is too short:" + length2);
                }
                int length3 = fArr2.length;
                if (i5 <= length3) {
                    System.arraycopy(fArr2, i2, fArr5, 0, i3);
                } else {
                    Log.e("FaceExt2018", "faceLandmarkDepth length is too short:" + length3);
                }
                int i7 = i * 3;
                int i8 = i7 + 3;
                int length4 = fArr3.length;
                if (i8 <= length4) {
                    System.arraycopy(fArr3, i7, fArr6, 0, 3);
                } else {
                    Log.e("FaceExt2018", "faceOrientation length is too short:" + length4);
                }
                arrayList2.add(new kpm(kpe.m14671a(faceArr[i]), bArr2, fArr4, fArr6));
                i++;
                arrayList = arrayList2;
                i2 = i5;
                iArr = iArr2;
                bArr = bArr;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final PointF m14673a(byte b) {
        HashMap map = this.f36806f;
        Byte bValueOf = Byte.valueOf(b);
        if (map.containsKey(bValueOf)) {
            return this.f36805e[((Integer) this.f36806f.get(bValueOf)).intValue()];
        }
        throw new IllegalArgumentException("Landmark:" + ((int) b) + " not detected for this face.");
    }

    /* JADX INFO: renamed from: b */
    public final PointF m14674b() {
        return m14673a((byte) 5);
    }

    /* JADX INFO: renamed from: c */
    public final PointF m14675c() {
        return m14673a((byte) 1);
    }

    /* JADX INFO: renamed from: d */
    public final PointF m14676d() {
        return m14673a((byte) 4);
    }

    /* JADX INFO: renamed from: e */
    public final PointF m14677e() {
        return m14673a((byte) 3);
    }

    /* JADX INFO: renamed from: f */
    public final PointF m14678f() {
        return m14673a((byte) 6);
    }

    /* JADX INFO: renamed from: g */
    public final PointF m14679g() {
        return m14673a((byte) 2);
    }

    public final String toString() {
        kpe kpeVar = this.f36801a;
        return String.format("{ bounds: %s, score: %s, id: %d }", kpeVar.f36797c, Integer.valueOf(kpeVar.f36796b), Integer.valueOf(this.f36801a.f36795a));
    }
}
