package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cbt extends kfv {

    /* JADX INFO: renamed from: a */
    private final cdm f4965a;

    /* JADX INFO: renamed from: b */
    private final kmd f4966b;

    /* JADX INFO: renamed from: c */
    private final boolean f4967c;

    /* JADX INFO: renamed from: d */
    private final fup f4968d;

    /* JADX INFO: renamed from: e */
    private final bkn f4969e;

    public cbt(fup fupVar, bkn bknVar, cdm cdmVar, boolean z, dhv dhvVar, kmd kmdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4968d = fupVar;
        this.f4969e = bknVar;
        this.f4965a = cdmVar;
        this.f4967c = z;
        this.f4966b = kmdVar;
        dhw dhwVar = dhu.f11199a;
        dhvVar.mo6177e();
    }

    /* JADX INFO: renamed from: p */
    private static final float m3407p(int i, int i2) {
        float f = i / i2;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:199:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x016c A[Catch: IllegalArgumentException -> 0x018a, TryCatch #2 {IllegalArgumentException -> 0x018a, blocks: (B:48:0x0103, B:50:0x010d, B:53:0x0112, B:55:0x0123, B:59:0x0131, B:61:0x013b, B:62:0x013e, B:64:0x0144, B:66:0x0148, B:68:0x015c, B:73:0x0180, B:70:0x016c, B:72:0x017c, B:75:0x0187), top: B:190:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x017c A[Catch: IllegalArgumentException -> 0x018a, TryCatch #2 {IllegalArgumentException -> 0x018a, blocks: (B:48:0x0103, B:50:0x010d, B:53:0x0112, B:55:0x0123, B:59:0x0131, B:61:0x013b, B:62:0x013e, B:64:0x0144, B:66:0x0148, B:68:0x015c, B:73:0x0180, B:70:0x016c, B:72:0x017c, B:75:0x0187), top: B:190:0x0103 }] */
    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        mrm mrmVarM16829i;
        Rect rect;
        mrm mrmVarM16829i2;
        int iMax;
        int iMax2;
        int i;
        mrm mrmVar;
        MeteringRectangle[] meteringRectangleArr;
        MeteringRectangle[] meteringRectangleArr2;
        mrm mrmVarM16829i3;
        Rect rect2;
        int length;
        Rect bounds;
        byte[] bArr;
        if (kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE) == null) {
            return;
        }
        Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_MODE);
        num.getClass();
        int iIntValue = num.intValue();
        gss gssVar = (gss) gss.f26273g.get(Integer.valueOf(iIntValue));
        if (gssVar == null) {
            throw new IllegalArgumentException("unknown metadata value: " + iIntValue);
        }
        Integer num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
        num2.getClass();
        gst gstVarM9711a = gst.m9711a(num2.intValue());
        Float f = (Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE);
        f.getClass();
        MeteringRectangle[] meteringRectangleArr3 = null;
        if (this.f4967c) {
            cdm cdmVar = this.f4965a;
            cdmVar.f5316d++;
            dhv dhvVar = cdmVar.f5314b;
            dhw dhwVar = dhu.f11199a;
            dhvVar.mo6177e();
            if (!cdmVar.f5314b.mo6184l(dhu.f11202d) || ivx.f32438a == null || (bArr = (byte[]) kppVar.mo9517d(ivx.f32438a)) == null) {
                i = 2;
                break;
            }
            try {
                nxq nxqVarM18123Q = nxq.m18123Q(mqo.f41436b, bArr, 0, bArr.length, nxf.m18011a());
                nxq.m18132ae(nxqVarM18123Q);
                mqo mqoVar = (mqo) nxqVarM18123Q;
                int[] iArr = {1, 2, 3, 4, 5, 6, 7, 8};
                int i2 = 0;
                while (true) {
                    if (i2 < 8) {
                        int i3 = iArr[i2];
                        if (mqoVar.f41438a == i3 - 1) {
                            cdmVar.f5314b.mo6177e();
                            if (i3 == 0) {
                                throw null;
                            }
                            if (i3 != 8) {
                                if (cdmVar.f5314b.mo6184l(dhu.f11202d) || i3 != 6) {
                                    i = i3;
                                    break;
                                }
                            } else {
                                i = 2;
                                break;
                            }
                        } else {
                            i2++;
                        }
                    }
                    i = 2;
                    break;
                }
            } catch (nyb e) {
                ((nbe) ((nbe) ((nbe) cdm.f5313a.m17252c()).mo17283h(e)).mo17276G((char) 25)).mo17290o("InvalidProtocolBufferException");
                i = 2;
            }
            try {
                MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
                if (meteringRectangleArr4 == null || meteringRectangleArr4.length == 0) {
                    mrmVar = mqu.f41450a;
                } else {
                    Rect rect3 = meteringRectangleArr4[0].getRect();
                    Long l = (Long) kppVar.mo9517d(CaptureResult.SENSOR_EXPOSURE_TIME);
                    boolean z = l != null && l.longValue() >= 33000000;
                    Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
                    if (faceArr == null) {
                        mrmVar = mqu.f41450a;
                    } else {
                        mrm mrmVarM16829i4 = mqu.f41450a;
                        for (Face face : faceArr) {
                            if (z) {
                                bounds = face.getBounds();
                                if (bounds.width() * bounds.height() > 0) {
                                    mrmVarM16829i4 = mrm.m16829i(face);
                                }
                            } else {
                                Rect bounds2 = face.getBounds();
                                if (Math.abs(rect3.centerX() - bounds2.centerX()) < 100 && Math.abs(rect3.centerY() - bounds2.centerY()) < 100) {
                                    bounds = face.getBounds();
                                    if (bounds.width() * bounds.height() > 0) {
                                        mrmVarM16829i4 = mrm.m16829i(face);
                                    }
                                }
                            }
                        }
                        mrmVar = mrmVarM16829i4;
                    }
                }
            } catch (IllegalArgumentException e2) {
                mrmVar = mqu.f41450a;
            }
            if (mrmVar.mo16813g()) {
                cdmVar.f5315c = ((Face) mrmVar.mo16809c()).getId();
            }
            Face[] faceArr2 = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
            try {
                meteringRectangleArr = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
            } catch (IllegalArgumentException e3) {
                ((nbe) ((nbe) ((nbe) cdm.f5313a.m17252c()).mo17283h(e3)).mo17276G((char) 26)).mo17290o("Error retrieving CONTROL_AF_REGIONS.");
                meteringRectangleArr = null;
            }
            Rect rect4 = new Rect();
            if (meteringRectangleArr != null && meteringRectangleArr.length > 0) {
                rect4 = meteringRectangleArr[0].getRect();
            }
            if (faceArr2 == null || (length = faceArr2.length) <= 0) {
                if (i == 0) {
                    throw null;
                }
                if (i == 6) {
                    mrmVarM16829i = mrm.m16829i(cdl.m3495a(-1000, new Rect(rect4.centerX() - 50, rect4.centerY() - 50, rect4.centerX() + 50, rect4.centerY() + 50), 6));
                } else {
                    meteringRectangleArr2 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
                    if (meteringRectangleArr2 != null || meteringRectangleArr2.length == 0) {
                        mrmVarM16829i3 = mqu.f41450a;
                    } else {
                        Face[] faceArr3 = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
                        if ((faceArr3 == null || faceArr3.length <= 0) && (rect2 = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION)) != null) {
                            Rect rect5 = meteringRectangleArr2[0].getRect();
                            mrmVarM16829i3 = (Math.abs(rect2.centerX() - rect5.centerX()) >= 100 || Math.abs(rect5.centerY() - rect2.centerY()) >= 100) ? mqu.f41450a : mrm.m16829i(new Rect(rect5.centerX() - 50, rect5.centerY() - 50, rect5.centerX() + 50, rect5.centerY() + 50));
                        } else {
                            mrmVarM16829i3 = mqu.f41450a;
                        }
                    }
                    if (mrmVarM16829i3.mo16813g()) {
                        mrmVarM16829i = mrm.m16829i(cdl.m3496b((Rect) mrmVarM16829i3.mo16809c()));
                    } else {
                        mrmVarM16829i = mqu.f41450a;
                    }
                }
            } else {
                if (i == 0) {
                    throw null;
                }
                if (i == 8) {
                    mrmVarM16829i = mrm.m16829i(cdl.m3495a(-1001, rect4, 8));
                } else {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            Face face2 = faceArr2[i4];
                            if (cdmVar.f5315c == face2.getId()) {
                                mrmVarM16829i = mrm.m16829i(cdl.m3495a(face2.getId(), new Rect(face2.getBounds()), 4));
                            } else {
                                i4++;
                            }
                        } else {
                            meteringRectangleArr2 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
                            if (meteringRectangleArr2 != null) {
                                mrmVarM16829i3 = mqu.f41450a;
                            } else {
                                mrmVarM16829i3 = mqu.f41450a;
                            }
                            if (mrmVarM16829i3.mo16813g()) {
                                mrmVarM16829i = mrm.m16829i(cdl.m3496b((Rect) mrmVarM16829i3.mo16809c()));
                            } else {
                                mrmVarM16829i = mqu.f41450a;
                            }
                        }
                    }
                }
            }
            if (mrmVarM16829i.mo16813g()) {
                cdl cdlVar = (cdl) mrmVarM16829i.mo16809c();
                cdmVar.f5314b.mo6177e();
                int i5 = cdlVar.f5310a;
                if (i5 != cdmVar.f5317e) {
                    if (cdmVar.f5316d > 15) {
                        cdmVar.f5316d = 0;
                        cdmVar.f5317e = i5;
                    } else {
                        mrmVarM16829i = mqu.f41450a;
                    }
                }
            } else {
                mrmVarM16829i = mqu.f41450a;
            }
        } else {
            try {
                meteringRectangleArr3 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
            } catch (IllegalArgumentException e4) {
            }
            if (meteringRectangleArr3 == null || meteringRectangleArr3.length <= 0) {
                mrmVarM16829i = mqu.f41450a;
            } else {
                MeteringRectangle meteringRectangle = meteringRectangleArr3[0];
                mrmVarM16829i = meteringRectangle.getRect().isEmpty() ? mqu.f41450a : mrm.m16829i(cdl.m3496b(meteringRectangle.getRect()));
            }
        }
        if (mrmVarM16829i.mo16813g() && (rect = (Rect) kppVar.mo9517d(CaptureResult.SCALER_CROP_REGION)) != null) {
            Rect rect6 = ((cdl) mrmVarM16829i.mo16809c()).f5311b;
            int i6 = ((cdl) mrmVarM16829i.mo16809c()).f5312c;
            bkn bknVar = this.f4969e;
            PointF pointF = new PointF(rect6.exactCenterX(), rect6.exactCenterY());
            PointF pointFM19204h = ((oyo) bknVar.f3651a).m19204h(new PointF((pointF.x - rect.left) / rect.width(), (pointF.y - rect.top) / rect.height()));
            RectF rectF = new RectF(m3407p(rect6.left, rect.width()), m3407p(rect6.top, rect.height()), m3407p(rect6.right, rect.width()), m3407p(rect6.bottom, rect.height()));
            int iMo14553f = this.f4966b.mo14553f();
            PointF pointFM14636a = kot.m14636a(new PointF(rectF.left, rectF.top), iMo14553f);
            PointF pointFM14636a2 = kot.m14636a(new PointF(rectF.right, rectF.bottom), iMo14553f);
            mrmVarM16829i2 = mrm.m16829i(new fun(pointFM19204h, new RectF(Math.min(pointFM14636a.x, pointFM14636a2.x), Math.min(pointFM14636a.y, pointFM14636a2.y), Math.max(pointFM14636a.x, pointFM14636a2.x), Math.max(pointFM14636a.y, pointFM14636a2.y)), i6));
        } else {
            mrmVarM16829i2 = mqu.f41450a;
        }
        if (mrmVarM16829i.mo16813g()) {
            Rect rect7 = ((cdl) mrmVarM16829i.mo16809c()).f5311b;
            if (((cdl) mrmVarM16829i.mo16809c()).f5312c == 8) {
                iMax = rect7.width();
            } else {
                iMax = (int) (Math.max(rect7.width(), rect7.height()) * (true != this.f4967c ? 1.0f : 1.3f));
            }
        } else {
            iMax = 0;
        }
        if (mrmVarM16829i.mo16813g()) {
            Rect rect8 = ((cdl) mrmVarM16829i.mo16809c()).f5311b;
            if (((cdl) mrmVarM16829i.mo16809c()).f5312c == 8) {
                iMax2 = rect8.height();
            } else {
                iMax2 = (int) (Math.max(rect8.width(), rect8.height()) * (true == this.f4967c ? 1.3f : 1.0f));
            }
        } else {
            iMax2 = 0;
        }
        float fFloatValue = f.floatValue();
        mrm.m16829i(kppVar);
        fuo fuoVar = new fuo(gssVar, gstVarM9711a, fFloatValue, mrmVarM16829i2, iMax, iMax2);
        fup fupVar = this.f4968d;
        if (!fuoVar.equals(fupVar.f23602b) || fupVar.f23603c) {
            fupVar.f23601a.mo3415bf(new gtd(fupVar.f23602b, fuoVar));
            fupVar.f23602b = fuoVar;
        }
    }
}
