package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eat {

    /* JADX INFO: renamed from: a */
    private static final nbh f13121a = nbh.m17259h("com/google/android/apps/camera/gyro/motionestimator/GyroBasedMotionEstimator");

    /* JADX INFO: renamed from: b */
    private final kni f13122b;

    /* JADX INFO: renamed from: c */
    private final eav f13123c;

    /* JADX INFO: renamed from: d */
    private final int f13124d;

    /* JADX INFO: renamed from: e */
    private final boolean f13125e;

    /* JADX INFO: renamed from: f */
    private knh f13126f;

    /* JADX INFO: renamed from: g */
    private boolean f13127g;

    /* JADX INFO: renamed from: h */
    private volatile eaw f13128h = null;

    /* JADX INFO: renamed from: i */
    private final int f13129i;

    /* JADX INFO: renamed from: j */
    private final drj f13130j;

    public eat(kni kniVar, drj drjVar, eav eavVar, int i, int i2, int i3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f13122b = kniVar;
        this.f13130j = drjVar;
        this.f13123c = eavVar;
        this.f13124d = i;
        this.f13129i = i3;
        i2 = i2 != 1 ? 2 : i2;
        lku.m15669w(true);
        this.f13125e = i2 == 1 && !eavVar.f13135c;
        this.f13127g = false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m7016a(gsr gsrVar, gsr gsrVar2) {
        eaw eawVar = this.f13128h;
        if (!this.f13127g || eawVar == null) {
            return -1.0f;
        }
        long j = gsrVar.f26244d;
        float f = gsrVar.f26248h;
        float f2 = gsrVar.f26249i;
        float[] fArrM7028f = eawVar.m7028f(gsrVar.f26255o);
        long j2 = gsrVar.f26243c;
        long j3 = gsrVar.f26245e;
        long j4 = gsrVar.f26254n;
        long j5 = gsrVar2.f26244d;
        float f3 = gsrVar2.f26248h;
        float f4 = gsrVar2.f26249i;
        float[] fArrM7028f2 = eawVar.m7028f(gsrVar2.f26255o);
        long j6 = gsrVar2.f26243c;
        long j7 = gsrVar2.f26245e;
        long j8 = gsrVar2.f26254n;
        long jM7026c = eawVar.m7026c(j2, j3, fArrM7028f);
        long jM7026c2 = eawVar.m7026c(j4, j3, fArrM7028f);
        long jM7025b = eawVar.m7025b(j3, fArrM7028f);
        long jM7026c3 = eawVar.m7026c(j6, j7, fArrM7028f2);
        long jM7026c4 = eawVar.m7026c(j8, j7, fArrM7028f2);
        long jM7025b2 = eawVar.m7025b(j7, fArrM7028f2);
        long jM7023d = eaw.m7023d(jM7026c, jM7025b, j);
        float fM7024a = eawVar.m7024a(f, f2, fArrM7028f);
        long jM7023d2 = eaw.m7023d(jM7026c3, jM7025b2, j5);
        float fM7024a2 = eawVar.m7024a(f3, f4, fArrM7028f2);
        float[] fArrM7027e = eawVar.m7027e(gsrVar.f26242b, jM7026c2, jM7025b, j, eawVar.f13139d, fArrM7028f, false);
        float[] fArrM7027e2 = eawVar.m7027e(gsrVar2.f26242b, jM7026c4, jM7025b2, j5, eawVar.f13139d, fArrM7028f2, false);
        lbp lbpVarM15145a = lbp.m15145a(eawVar.f13137b.mo7556d(jM7023d, fM7024a, fArrM7027e[0], fArrM7027e[1], jM7023d2, fM7024a2, fArrM7027e2[0], fArrM7027e2[1]));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new float[]{0.0f, 0.0f});
        float fMax = 0.0f;
        arrayList.add(new float[]{eawVar.f13139d.f35517a, 0.0f});
        arrayList.add(new float[]{0.0f, eawVar.f13139d.f35518b});
        kbc kbcVar = eawVar.f13139d;
        arrayList.add(new float[]{kbcVar.f35517a, kbcVar.f35518b});
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            float[] fArr = (float[]) arrayList.get(i);
            float[] fArrM15149e = lbpVarM15145a.m15149e(fArr);
            fMax = (float) Math.max(fMax, Math.hypot(fArrM15149e[0] - fArr[0], fArrM15149e[1] - fArr[1]));
        }
        return fMax;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7018c() {
        this.f13127g = false;
        knh knhVar = this.f13126f;
        if (knhVar != null) {
            mpw.m16775n(new ceu(knhVar, 7));
        }
        knh knhVar2 = this.f13126f;
        if (knhVar2 != null) {
            knhVar2.close();
        }
        this.f13128h = null;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m7019d() {
        knh knhVar = this.f13126f;
        if (this.f13127g && knhVar != null) {
            this.f13123c.m7022a(knhVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m7020e() {
        return this.f13127g;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r6v0, types: [end, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m7021f(kbc kbcVar, String str) {
        if (this.f13125e) {
            return;
        }
        drj drjVar = this.f13130j;
        int i = this.f13124d;
        int i2 = this.f13129i;
        SizeF sizeF = (SizeF) drjVar.f12398d.mo14559l(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        sizeF.getClass();
        if (i2 != 1) {
            i2 = 2;
        }
        lku.m15669w(true);
        Object obj = drjVar.f12395a;
        this.f13128h = new eaw(sizeF, kbcVar, ((gdz) drjVar.f12396b).m9083b(), i, drjVar.f12397c, i2 == 1 ? (enj) drjVar.f12399e.get() : new enh(), ((mrm) obj).mo16813g() ? mxk.m17136H(((kmg) ((mrm) obj).mo16809c()).f36540a) : mzx.f41874a);
        knh knhVarMo7000a = this.f13122b.mo7000a(str);
        this.f13126f = knhVarMo7000a;
        if (knhVarMo7000a != null) {
            this.f13127g = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m7017b(long j, gsr gsrVar) throws Throwable {
        lbp lbpVarM15145a;
        ArrayList arrayList;
        Object obj;
        eaw eawVar = this.f13128h;
        if (gsrVar == null || eawVar == null) {
            if (gsrVar == null) {
                ((nbe) ((nbe) f13121a.m17251b()).mo17276G(1245)).mo17292q("Camera metadata not valid at : %d", j);
            } else {
                ((nbe) ((nbe) f13121a.m17251b()).mo17276G(1244)).mo17292q("Gyro transform calculator not valid at : %d", j);
            }
            ArrayList arrayList2 = new ArrayList();
            eaw eawVar2 = this.f13128h;
            if (eawVar2 != null) {
                int i = eawVar2.f13138c;
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList2.add(lbp.m15146b());
                }
            } else {
                ((nbe) ((nbe) f13121a.m17251b()).mo17276G((char) 1243)).mo17290o("Gyro transform calculator not valid.");
            }
            return arrayList2;
        }
        m7019d();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long j2 = gsrVar.f26244d;
        float f = gsrVar.f26248h;
        float f2 = gsrVar.f26249i;
        float[] fArrM7028f = eawVar.m7028f(gsrVar.f26255o);
        float fM7024a = eawVar.m7024a(f, f2, fArrM7028f);
        long j3 = gsrVar.f26243c;
        long j4 = gsrVar.f26245e;
        ArrayList arrayList5 = arrayList3;
        long j5 = gsrVar.f26254n;
        long jM7026c = eawVar.m7026c(j3, j4, fArrM7028f);
        long jM7026c2 = eawVar.m7026c(j5, j4, fArrM7028f);
        long jM7025b = eawVar.m7025b(j4, fArrM7028f);
        Object obj2 = null;
        float[] fArr = null;
        int i3 = 0;
        while (true) {
            int i4 = eawVar.f13138c;
            if (i3 >= i4) {
                break;
            }
            long j6 = i4;
            long j7 = (((long) i3) * jM7025b) / j6;
            long j8 = jM7025b / j6;
            int i5 = i3;
            long jM7023d = eaw.m7023d(jM7026c + j7, j8, j2);
            float[] fArr2 = fArrM7028f;
            long j9 = j2;
            long j10 = jM7026c2;
            ArrayList arrayList6 = arrayList4;
            float[] fArrM7027e = eawVar.m7027e(gsrVar.f26242b, jM7026c2 + j7, j8, j2, eawVar.f13139d, fArr2, true);
            float[] fArr3 = new float[9];
            if (true != eawVar.f13137b.mo7555c(jM7023d, fM7024a, fArrM7027e[0], fArrM7027e[1], fArr3)) {
                fArr3 = fArr;
            }
            if (fArr3 != null) {
                arrayList = arrayList5;
                arrayList.add(lbp.m15145a(fArr3));
                fArr = fArr3;
                obj = null;
            } else {
                arrayList = arrayList5;
                obj = null;
                arrayList.add(null);
            }
            i3 = i5 + 1;
            obj2 = obj;
            arrayList5 = arrayList;
            arrayList4 = arrayList6;
            fArrM7028f = fArr2;
            j2 = j9;
            jM7026c2 = j10;
        }
        ArrayList arrayList7 = arrayList5;
        ArrayList arrayList8 = arrayList4;
        char c = 1;
        Object obj3 = eawVar.f13140e;
        synchronized (obj3) {
            try {
                List list = (List) eawVar.f13141f.get();
                int i6 = 0;
                while (i6 < eawVar.f13138c) {
                    lbp lbpVar = (lbp) list.get(i6);
                    lbp lbpVar2 = (lbp) arrayList7.get(i6);
                    if (lbpVar == null || lbpVar2 == null) {
                        try {
                            ((nbe) ((nbe) eaw.f13136a.m17252c()).mo17276G(1251)).mo17290o("Previous or current projection matrix cannot be computed. Defaulting to identity");
                            arrayList8.add(lbp.m15146b());
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        float[] fArr4 = lbpVar.f37887c;
                        float f3 = fArr4[0];
                        float f4 = fArr4[4];
                        float f5 = fArr4[8];
                        float f6 = fArr4[5];
                        float f7 = fArr4[7];
                        float f8 = (f4 * f5) - (f6 * f7);
                        double d = f3 * f8;
                        float f9 = fArr4[c];
                        int i7 = 3;
                        float f10 = fArr4[3];
                        float f11 = f10 * f5;
                        float f12 = fArr4[6];
                        Double.isNaN(d);
                        double d2 = d + 0.0d;
                        float f13 = f9 * (f11 - (f6 * f12));
                        obj3 = obj3;
                        double d3 = f13;
                        float f14 = fArr4[2];
                        Double.isNaN(d3);
                        double d4 = d2 - d3;
                        double d5 = ((f10 * f7) - (f4 * f12)) * f14;
                        Double.isNaN(d5);
                        double d6 = d4 + d5;
                        if (d6 == 0.0d) {
                            lbpVarM15145a = null;
                        } else {
                            float f15 = (float) (1.0d / d6);
                            float f16 = fArr4[1];
                            float f17 = fArr4[0];
                            float f18 = fArr4[2];
                            float f19 = fArr4[3];
                            float f20 = fArr4[4];
                            lbpVarM15145a = lbp.m15145a(new float[]{f8 * f15, (-((f9 * f5) - (f14 * f7))) * f15, ((f16 * f6) - (f14 * f4)) * f15, (-((f10 * f5) - (f6 * f12))) * f15, ((f5 * f17) - (f18 * f12)) * f15, (-((f6 * f17) - (f18 * f19))) * f15, ((f19 * f7) - (f12 * f20)) * f15, (-((f7 * f17) - (fArr4[6] * f16))) * f15, ((f17 * f20) - (f16 * f19)) * f15});
                        }
                        if (lbpVarM15145a == null) {
                            ((nbe) ((nbe) eaw.f13136a.m17252c()).mo17276G(1252)).mo17290o("Inverse cannot be computed. Defaulting to identity");
                            arrayList8.add(lbp.m15146b());
                        } else {
                            float[] fArrM15148d = lbpVarM15145a.m15148d();
                            float[] fArr5 = new float[9];
                            int i8 = 0;
                            while (i8 < i7) {
                                int i9 = 0;
                                while (i9 < i7) {
                                    int i10 = 0;
                                    while (i10 < i7) {
                                        int i11 = i8 * 3;
                                        int i12 = i11 + i9;
                                        fArr5[i12] = fArr5[i12] + (lbpVar2.f37887c[i11 + i10] * fArrM15148d[(i10 * 3) + i9]);
                                        i10++;
                                        i7 = 3;
                                    }
                                    i9++;
                                    i7 = 3;
                                }
                                i8++;
                                i7 = 3;
                            }
                            arrayList8.add(lbp.m15145a(fArr5));
                        }
                    }
                    i6++;
                    obj3 = obj3;
                    c = 1;
                }
                Object obj4 = obj3;
                eawVar.f13141f.set(arrayList7);
                return arrayList8;
            } catch (Throwable th2) {
                th = th2;
                obj3 = obj3;
            }
        }
    }
}
