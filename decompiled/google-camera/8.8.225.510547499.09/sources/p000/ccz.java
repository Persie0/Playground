package p000;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ccz extends kfv {

    /* JADX INFO: renamed from: a */
    private static final nbh f5234a = nbh.m17259h("com/google/android/apps/camera/aaa/Stats3AEventManager");

    /* JADX INFO: renamed from: b */
    private final fcp f5235b;

    /* JADX INFO: renamed from: c */
    private final Boolean f5236c;

    /* JADX INFO: renamed from: d */
    private final float f5237d;

    /* JADX INFO: renamed from: e */
    private final jwn f5238e;

    /* JADX INFO: renamed from: f */
    private final kmq f5239f;

    /* JADX INFO: renamed from: g */
    private final boolean f5240g;

    /* JADX INFO: renamed from: h */
    private final ikw f5241h;

    /* JADX INFO: renamed from: i */
    private final kmg f5242i;

    /* JADX INFO: renamed from: j */
    private int f5243j;

    /* JADX INFO: renamed from: k */
    private final List f5244k = new ArrayList();

    /* JADX INFO: renamed from: l */
    private kpp f5245l = null;

    /* JADX INFO: renamed from: m */
    private int f5246m = -1;

    /* JADX INFO: renamed from: n */
    private int f5247n = -1;

    /* JADX INFO: renamed from: o */
    private int f5248o = -1;

    public ccz(fcp fcpVar, Boolean bool, kmd kmdVar, jwn jwnVar, kmg kmgVar, ikw ikwVar) {
        this.f5235b = fcpVar;
        this.f5236c = bool;
        this.f5238e = jwnVar;
        Rect rectMo14555h = kmdVar.mo14555h();
        this.f5237d = rectMo14555h.width() * rectMo14555h.height();
        this.f5239f = kmdVar.mo14558k();
        this.f5242i = kmgVar;
        boolean z = false;
        if (kmdVar.mo14544M() && kmdVar.mo14535D()) {
            z = true;
        }
        this.f5240g = z;
        this.f5241h = ikwVar;
    }

    /* JADX WARN: Code duplicated, block: B:198:0x03db  */
    /* JADX INFO: renamed from: p */
    private final ccy m3471p(kpp kppVar) throws nyb {
        mqm mqmVar;
        mqk mqkVar;
        mql mqlVar;
        Float f;
        Float f2;
        Float f3;
        Float f4;
        Float fValueOf;
        int i;
        int i2;
        int length;
        byte[] bArr;
        nxq nxqVarM18138P;
        byte[] bArr2;
        nxq nxqVarM18138P2;
        byte[] bArr3;
        nxq nxqVarM18138P3;
        if (ivv.f32401j == null || (bArr3 = (byte[]) kppVar.mo9517d(ivv.f32401j)) == null || bArr3.length <= 0) {
            mqmVar = null;
        } else {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr3);
            mqm mqmVar2 = mqm.f41417o;
            nxf nxfVar = nxf.f44904a;
            try {
                int i3 = byteArrayInputStream.read();
                if (i3 == -1) {
                    nxqVarM18138P3 = null;
                } else {
                    nww nwwVarM17876I = nww.m17876I(new nwa(byteArrayInputStream, nww.m17874G(i3, byteArrayInputStream)));
                    nxqVarM18138P3 = mqmVar2.m18138P();
                    try {
                        nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P3);
                        nzmVarM18260b.mo18252h(nxqVarM18138P3, nwx.m17885p(nwwVarM17876I), nxfVar);
                        nzmVarM18260b.mo18250f(nxqVarM18138P3);
                        try {
                            nwwVarM17876I.mo17839z(0);
                        } catch (nyb e) {
                            throw e;
                        }
                    } catch (nyb e2) {
                        if (e2.f44994a) {
                            throw new nyb(e2);
                        }
                        throw e2;
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof nyb) {
                            throw ((nyb) e3.getCause());
                        }
                        throw new nyb(e3);
                    } catch (nzx e4) {
                        throw e4.m18328a();
                    } catch (RuntimeException e5) {
                        if (e5.getCause() instanceof nyb) {
                            throw ((nyb) e5.getCause());
                        }
                        throw e5;
                    }
                }
                nxq.m18132ae(nxqVarM18138P3);
                mqmVar = (mqm) nxqVarM18138P3;
            } catch (nyb e6) {
                if (e6.f44994a) {
                    throw new nyb(e6);
                }
                throw e6;
            } catch (IOException e7) {
                throw new nyb(e7);
            }
        }
        CaptureResult.Key key = ivv.f32402k;
        if (key == null || (bArr2 = (byte[]) kppVar.mo9517d(key)) == null || bArr2.length <= 0) {
            mqkVar = null;
        } else {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr2);
            mqk mqkVar2 = mqk.f41385s;
            nxf nxfVar2 = nxf.f44904a;
            try {
                int i4 = byteArrayInputStream2.read();
                if (i4 == -1) {
                    nxqVarM18138P2 = null;
                } else {
                    nww nwwVarM17876I2 = nww.m17876I(new nwa(byteArrayInputStream2, nww.m17874G(i4, byteArrayInputStream2)));
                    nxqVarM18138P2 = mqkVar2.m18138P();
                    try {
                        nzm nzmVarM18260b2 = nzf.f45060a.m18260b(nxqVarM18138P2);
                        nzmVarM18260b2.mo18252h(nxqVarM18138P2, nwx.m17885p(nwwVarM17876I2), nxfVar2);
                        nzmVarM18260b2.mo18250f(nxqVarM18138P2);
                        try {
                            nwwVarM17876I2.mo17839z(0);
                        } catch (nyb e8) {
                            throw e8;
                        }
                    } catch (RuntimeException e9) {
                        if (e9.getCause() instanceof nyb) {
                            throw ((nyb) e9.getCause());
                        }
                        throw e9;
                    } catch (nyb e10) {
                        if (e10.f44994a) {
                            throw new nyb(e10);
                        }
                        throw e10;
                    } catch (IOException e11) {
                        if (e11.getCause() instanceof nyb) {
                            throw ((nyb) e11.getCause());
                        }
                        throw new nyb(e11);
                    } catch (nzx e12) {
                        throw e12.m18328a();
                    }
                }
                nxq.m18132ae(nxqVarM18138P2);
                mqkVar = (mqk) nxqVarM18138P2;
            } catch (nyb e13) {
                if (e13.f44994a) {
                    throw new nyb(e13);
                }
                throw e13;
            } catch (IOException e14) {
                throw new nyb(e14);
            }
        }
        CaptureResult.Key key2 = ivv.f32403l;
        if (key2 == null || (bArr = (byte[]) kppVar.mo9517d(key2)) == null || bArr.length <= 0) {
            mqlVar = null;
        } else {
            ByteArrayInputStream byteArrayInputStream3 = new ByteArrayInputStream(bArr);
            mql mqlVar2 = mql.f41405k;
            nxf nxfVar3 = nxf.f44904a;
            try {
                int i5 = byteArrayInputStream3.read();
                if (i5 == -1) {
                    nxqVarM18138P = null;
                } else {
                    nww nwwVarM17876I3 = nww.m17876I(new nwa(byteArrayInputStream3, nww.m17874G(i5, byteArrayInputStream3)));
                    nxqVarM18138P = mqlVar2.m18138P();
                    try {
                        nzm nzmVarM18260b3 = nzf.f45060a.m18260b(nxqVarM18138P);
                        nzmVarM18260b3.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17876I3), nxfVar3);
                        nzmVarM18260b3.mo18250f(nxqVarM18138P);
                        try {
                            nwwVarM17876I3.mo17839z(0);
                        } catch (nyb e15) {
                            throw e15;
                        }
                    } catch (IOException e16) {
                        if (e16.getCause() instanceof nyb) {
                            throw ((nyb) e16.getCause());
                        }
                        throw new nyb(e16);
                    } catch (RuntimeException e17) {
                        if (e17.getCause() instanceof nyb) {
                            throw ((nyb) e17.getCause());
                        }
                        throw e17;
                    } catch (nyb e18) {
                        if (e18.f44994a) {
                            throw new nyb(e18);
                        }
                        throw e18;
                    } catch (nzx e19) {
                        throw e19.m18328a();
                    }
                }
                nxq.m18132ae(nxqVarM18138P);
                mqlVar = (mql) nxqVarM18138P;
            } catch (nyb e20) {
                if (e20.f44994a) {
                    throw new nyb(e20);
                }
                throw e20;
            } catch (IOException e21) {
                throw new nyb(e21);
            }
        }
        boolean z = mqmVar != null;
        boolean z2 = mqkVar != null;
        boolean z3 = mqlVar != null;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41419a)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41421c)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41422d)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41423e)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41424f)));
            arrayList.add(mrm.m16829i(Float.valueOf(true != mqmVar.f41425g ? 0.0f : 1.0f)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41426h)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41427i)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41428j)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41429k)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41430l)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41431m)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqmVar.f41432n)));
        } else {
            for (int i6 = 0; i6 < 13; i6++) {
                arrayList.add(mqu.f41450a);
            }
        }
        if (z2) {
            arrayList.add(mrm.m16829i(Float.valueOf(mqkVar.f41387a)));
            arrayList.add(mrm.m16829i(Float.valueOf(true != mqkVar.f41388b ? 0.0f : 1.0f)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqkVar.f41389c)));
            arrayList.add(mrm.m16829i(Float.valueOf(true != mqkVar.f41391e ? 0.0f : 1.0f)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqkVar.f41393g)));
        } else {
            int i7 = 0;
            for (int i8 = 5; i7 < i8; i8 = 5) {
                arrayList.add(mqu.f41450a);
                i7++;
            }
        }
        if (z3) {
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41407a)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41408b)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41409c)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41410d)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41411e)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41412f)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41413g)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41414h)));
            arrayList.add(mrm.m16829i(Float.valueOf(mqlVar.f41415i)));
        } else {
            int i9 = 0;
            for (int i10 = 9; i9 < i10; i10 = 9) {
                arrayList.add(mqu.f41450a);
                i9++;
            }
        }
        arrayList.add(m3472q(kppVar, false, true, false));
        arrayList.add(mrm.m16828h((Float) kppVar.mo9517d(CaptureResult.LENS_FOCUS_DISTANCE)));
        arrayList.add(m3472q(kppVar, true, false, false));
        if (z2) {
            nxv nxvVar = mqkVar.f41392f;
            if (nxvVar.size() >= 3) {
                f2 = (Float) nxvVar.get(0);
                f3 = (Float) nxvVar.get(1);
                f = (Float) nxvVar.get(2);
            } else {
                f = null;
                f2 = null;
                f3 = null;
            }
        } else {
            f = null;
            f2 = null;
            f3 = null;
        }
        arrayList.add(mrm.m16828h(f2));
        arrayList.add(mrm.m16828h(f3));
        arrayList.add(mrm.m16828h(f));
        arrayList.add(m3472q(kppVar, false, false, true));
        arrayList.add(mrm.m16829i(Float.valueOf(this.f5237d)));
        Face[] faceArr = (Face[]) kppVar.mo9517d(CaptureResult.STATISTICS_FACES);
        if (faceArr == null || (length = faceArr.length) <= 0) {
            f4 = null;
            fValueOf = null;
        } else {
            Float fValueOf2 = Float.valueOf(length);
            float fWidth = 0.0f;
            for (Face face : faceArr) {
                fWidth += face.getBounds().width() * face.getBounds().height();
            }
            fValueOf = Float.valueOf(fWidth);
            f4 = fValueOf2;
        }
        arrayList.add(mrm.m16828h(f4));
        arrayList.add(mrm.m16828h(fValueOf));
        arrayList.add(mrm.m16829i((Float) this.f5238e.mo3831be()));
        Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        arrayList.add(num != null ? mrm.m16829i(Float.valueOf(num.floatValue())) : mqu.f41450a);
        Boolean bool = (Boolean) kppVar.mo9517d(CaptureResult.CONTROL_AE_LOCK);
        if (bool != null) {
            arrayList.add(mrm.m16829i(Float.valueOf(true != bool.booleanValue() ? 0.0f : 1.0f)));
        } else {
            arrayList.add(mqu.f41450a);
        }
        if (z2) {
            arrayList.add(mrm.m16829i(Float.valueOf(mqkVar.f41396j)));
        } else {
            arrayList.add(mqu.f41450a);
        }
        arrayList2.add(mrm.m16828h((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)));
        arrayList2.add(mrm.m16828h((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)));
        arrayList2.add(mrm.m16828h((Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)));
        if (z2) {
            int iM16774m = mpw.m16774m(mqkVar.f41390d);
            if (iM16774m == 0) {
                iM16774m = 1;
            }
            arrayList2.add(mrm.m16829i(Integer.valueOf(mpw.m16773l(iM16774m))));
        } else {
            arrayList2.add(mqu.f41450a);
        }
        if (z) {
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqmVar.f41420b)));
        } else {
            arrayList2.add(mqu.f41450a);
        }
        arrayList2.add(mrm.m16828h((Integer) kppVar.mo9517d(CaptureResult.FLASH_STATE)));
        if (z3) {
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqlVar.f41416j)));
        } else {
            arrayList2.add(mqu.f41450a);
        }
        int i11 = 4;
        if (z2) {
            int iM16774m2 = mpw.m16774m(mqkVar.f41394h);
            if (iM16774m2 == 0) {
                iM16774m2 = 1;
            }
            arrayList2.add(mrm.m16829i(Integer.valueOf(mpw.m16773l(iM16774m2))));
            switch (mqkVar.f41395i) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 5;
                    break;
                case 4:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 7;
                    break;
                case 6:
                    i2 = 8;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == 0) {
                i2 = 1;
            }
            if (i2 == 1) {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
            arrayList2.add(mrm.m16829i(Integer.valueOf(i2 - 2)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41397k)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41398l)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41399m)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41400n)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41401o)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41402p)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41403q)));
            arrayList2.add(mrm.m16829i(Integer.valueOf(mqkVar.f41404r)));
        } else {
            for (int i12 = 0; i12 < 10; i12++) {
                arrayList2.add(mqu.f41450a);
            }
        }
        kmq kmqVar = this.f5239f;
        String str = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
        if (kmqVar == kmq.EXTERNAL) {
            i = 4;
        } else {
            kmq kmqVar2 = kmq.f36557a;
            if (str == null || !this.f5240g) {
                i = kmqVar == kmqVar2 ? 2 : 3;
            } else if (this.f5242i.f36540a.equals(str)) {
                i = kmqVar == kmqVar2 ? 11 : 9;
            } else {
                i = kmqVar == kmqVar2 ? 12 : 10;
            }
        }
        mws mwsVarM17095j = mws.m17095j(arrayList);
        if (mwsVarM17095j == null) {
            throw new NullPointerException("Null dataFieldsFloat");
        }
        mws mwsVarM17095j2 = mws.m17095j(arrayList2);
        if (mwsVarM17095j2 == null) {
            throw new NullPointerException("Null dataFieldsInteger");
        }
        ikw ikwVar = this.f5241h;
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar.ordinal()) {
            case 0:
                i11 = 2;
                break;
            case 1:
                i11 = 3;
                break;
            case 2:
                i11 = 6;
                break;
            case 6:
                break;
            case 12:
                i11 = 5;
                break;
            default:
                i11 = 1;
                break;
        }
        ccy ccyVar = new ccy(mwsVarM17095j, mwsVarM17095j2, i, i11);
        lku.m15619N(ccyVar.f5230a.size() == 41 && ccyVar.f5231b.size() == 17, "Incorrect number of data fields. expected floats=%s, integers=%s. received floats=%s, integers=%s", 41, 17, Integer.valueOf(ccyVar.f5230a.size()), Integer.valueOf(ccyVar.f5231b.size()));
        return ccyVar;
    }

    /* JADX INFO: renamed from: q */
    private static mrm m3472q(kpp kppVar, boolean z, boolean z2, boolean z3) {
        MeteringRectangle[] meteringRectangleArr;
        MeteringRectangle[] meteringRectangleArr2;
        MeteringRectangle[] meteringRectangleArr3;
        ArrayList arrayList = new ArrayList();
        Float fValueOf = null;
        if (z) {
            try {
                meteringRectangleArr = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AF_REGIONS);
            } catch (IllegalArgumentException e) {
                ((nbe) ((nbe) ((nbe) f5234a.m17252c()).mo17283h(e)).mo17276G((char) 18)).mo17290o("Error retrieving CONTROL_AF_REGIONS.");
                meteringRectangleArr = null;
            }
            if (meteringRectangleArr != null) {
                Collections.addAll(arrayList, meteringRectangleArr);
            }
        }
        if (z2 && (meteringRectangleArr3 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AE_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr3);
        }
        if (z3 && (meteringRectangleArr2 = (MeteringRectangle[]) kppVar.mo9517d(CaptureResult.CONTROL_AWB_REGIONS)) != null) {
            Collections.addAll(arrayList, meteringRectangleArr2);
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            float width = 0.0f;
            for (int i = 0; i < size; i++) {
                MeteringRectangle meteringRectangle = (MeteringRectangle) arrayList.get(i);
                width += meteringRectangle.getWidth() * meteringRectangle.getHeight();
            }
            fValueOf = Float.valueOf(width);
        }
        return mrm.m16828h(fValueOf);
    }

    /* JADX INFO: renamed from: r */
    private final synchronized void m3473r(List list, int i, int i2) {
        List list2;
        int i3;
        int i4;
        if (list.isEmpty()) {
            return;
        }
        int i5 = i2;
        if (i5 != 3) {
            i5 = 2;
        }
        List arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (i5 == 2) {
            ccy ccyVar = (ccy) list.get(0);
            mws mwsVar = ccyVar.f5230a;
            list2 = ccyVar.f5231b;
            i4 = ccyVar.f5232c;
            i3 = ccyVar.f5233d;
            arrayList = mwsVar;
        } else {
            list2 = arrayList2;
            i3 = 0;
            i4 = 0;
        }
        if (i5 == 3) {
            int size = list.size();
            for (int i6 = 0; i6 < 41; i6++) {
                Iterator it = list.iterator();
                float fFloatValue = 0.0f;
                boolean z = false;
                while (it.hasNext()) {
                    mrm mrmVar = (mrm) ((ccy) it.next()).f5230a.get(i6);
                    if (mrmVar.mo16813g()) {
                        fFloatValue += ((Float) mrmVar.mo16809c()).floatValue();
                        z = true;
                    }
                }
                arrayList.add(z ? mrm.m16829i(Float.valueOf(fFloatValue / size)) : mqu.f41450a);
            }
            ccy ccyVar2 = (ccy) mkv.m16515W(list);
            list2 = ccyVar2.f5231b;
            i4 = ccyVar2.f5232c;
            i3 = ccyVar2.f5233d;
        }
        mrm mrmVar2 = (mrm) arrayList.get(0);
        mrm mrmVar3 = (mrm) arrayList.get(1);
        mrm mrmVar4 = (mrm) arrayList.get(2);
        mrm mrmVar5 = (mrm) arrayList.get(3);
        mrm mrmVar6 = (mrm) arrayList.get(4);
        mrm mrmVar7 = (mrm) arrayList.get(5);
        mrm mrmVar8 = (mrm) arrayList.get(6);
        mrm mrmVar9 = (mrm) arrayList.get(7);
        mrm mrmVar10 = (mrm) arrayList.get(8);
        mrm mrmVar11 = (mrm) arrayList.get(9);
        mrm mrmVar12 = (mrm) arrayList.get(10);
        mrm mrmVar13 = (mrm) arrayList.get(11);
        mrm mrmVar14 = (mrm) arrayList.get(12);
        mrm mrmVar15 = (mrm) arrayList.get(13);
        mrm mrmVar16 = (mrm) arrayList.get(14);
        mrm mrmVar17 = (mrm) arrayList.get(15);
        mrm mrmVar18 = (mrm) arrayList.get(16);
        mrm mrmVar19 = (mrm) arrayList.get(17);
        mrm mrmVar20 = (mrm) arrayList.get(18);
        mrm mrmVar21 = (mrm) arrayList.get(19);
        mrm mrmVar22 = (mrm) arrayList.get(20);
        mrm mrmVar23 = (mrm) arrayList.get(21);
        int i7 = i5;
        mrm mrmVar24 = (mrm) arrayList.get(22);
        int i8 = i3;
        mrm mrmVar25 = (mrm) arrayList.get(23);
        int i9 = i4;
        mrm mrmVar26 = (mrm) arrayList.get(24);
        mrm mrmVar27 = (mrm) arrayList.get(25);
        mrm mrmVar28 = (mrm) arrayList.get(26);
        mrm mrmVar29 = (mrm) arrayList.get(27);
        mrm mrmVar30 = (mrm) arrayList.get(28);
        mrm mrmVar31 = (mrm) arrayList.get(29);
        mrm mrmVar32 = (mrm) arrayList.get(30);
        mrm mrmVar33 = (mrm) arrayList.get(31);
        mrm mrmVar34 = (mrm) arrayList.get(32);
        mrm mrmVar35 = (mrm) arrayList.get(33);
        mrm mrmVar36 = (mrm) arrayList.get(34);
        mrm mrmVar37 = (mrm) arrayList.get(35);
        mrm mrmVar38 = (mrm) arrayList.get(36);
        mrm mrmVar39 = (mrm) arrayList.get(37);
        mrm mrmVar40 = (mrm) arrayList.get(38);
        mrm mrmVar41 = (mrm) arrayList.get(39);
        mrm mrmVar42 = (mrm) arrayList.get(40);
        mrm mrmVar43 = (mrm) list2.get(0);
        mrm mrmVar44 = (mrm) list2.get(1);
        mrm mrmVar45 = (mrm) list2.get(2);
        mrm mrmVar46 = (mrm) list2.get(3);
        mrm mrmVar47 = (mrm) list2.get(4);
        mrm mrmVar48 = (mrm) list2.get(5);
        mrm mrmVar49 = (mrm) list2.get(6);
        mrm mrmVar50 = (mrm) list2.get(7);
        mrm mrmVar51 = (mrm) list2.get(8);
        mrm mrmVar52 = (mrm) list2.get(9);
        mrm mrmVar53 = (mrm) list2.get(10);
        mrm mrmVar54 = (mrm) list2.get(11);
        mrm mrmVar55 = (mrm) list2.get(12);
        mrm mrmVar56 = (mrm) list2.get(13);
        mrm mrmVar57 = (mrm) list2.get(14);
        mrm mrmVar58 = (mrm) list2.get(15);
        mrm mrmVar59 = (mrm) list2.get(16);
        nxl nxlVarM18137O = nlt.f43595ap.m18137O();
        int size2 = list.size();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nlt nltVar = (nlt) nxlVarM18137O.f44974b;
        nltVar.f43623a |= 1;
        nltVar.f43641d = size2;
        if (mrmVar2.mo16813g()) {
            float fFloatValue2 = ((Float) mrmVar2.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar2 = (nlt) nxlVarM18137O.f44974b;
            nltVar2.f43623a |= 2;
            nltVar2.f43642e = fFloatValue2;
        }
        if (mrmVar3.mo16813g()) {
            float fFloatValue3 = ((Float) mrmVar3.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar3 = (nlt) nxlVarM18137O.f44974b;
            nltVar3.f43623a |= 8;
            nltVar3.f43643f = fFloatValue3;
        }
        if (mrmVar4.mo16813g()) {
            float fFloatValue4 = ((Float) mrmVar4.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar4 = (nlt) nxlVarM18137O.f44974b;
            nltVar4.f43623a |= 16;
            nltVar4.f43644g = fFloatValue4;
        }
        if (mrmVar5.mo16813g()) {
            float fFloatValue5 = ((Float) mrmVar5.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar5 = (nlt) nxlVarM18137O.f44974b;
            nltVar5.f43623a |= 32;
            nltVar5.f43645h = fFloatValue5;
        }
        if (mrmVar6.mo16813g()) {
            float fFloatValue6 = ((Float) mrmVar6.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar6 = (nlt) nxlVarM18137O.f44974b;
            nltVar6.f43623a |= 64;
            nltVar6.f43646i = fFloatValue6;
        }
        if (mrmVar7.mo16813g()) {
            float fFloatValue7 = ((Float) mrmVar7.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar7 = (nlt) nxlVarM18137O.f44974b;
            nltVar7.f43623a |= 128;
            nltVar7.f43647j = fFloatValue7;
        }
        if (mrmVar8.mo16813g()) {
            float fFloatValue8 = ((Float) mrmVar8.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar8 = (nlt) nxlVarM18137O.f44974b;
            nltVar8.f43623a |= 256;
            nltVar8.f43648k = fFloatValue8;
        }
        if (mrmVar9.mo16813g()) {
            float fFloatValue9 = ((Float) mrmVar9.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar9 = (nlt) nxlVarM18137O.f44974b;
            nltVar9.f43623a |= 512;
            nltVar9.f43649l = fFloatValue9;
        }
        if (mrmVar10.mo16813g()) {
            float fFloatValue10 = ((Float) mrmVar10.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar10 = (nlt) nxlVarM18137O.f44974b;
            nltVar10.f43623a |= 1024;
            nltVar10.f43650m = fFloatValue10;
        }
        if (mrmVar11.mo16813g()) {
            float fFloatValue11 = ((Float) mrmVar11.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar11 = (nlt) nxlVarM18137O.f44974b;
            nltVar11.f43623a |= 2048;
            nltVar11.f43651n = fFloatValue11;
        }
        if (mrmVar12.mo16813g()) {
            float fFloatValue12 = ((Float) mrmVar12.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar12 = (nlt) nxlVarM18137O.f44974b;
            nltVar12.f43623a |= 4096;
            nltVar12.f43652o = fFloatValue12;
        }
        if (mrmVar13.mo16813g()) {
            float fFloatValue13 = ((Float) mrmVar13.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar13 = (nlt) nxlVarM18137O.f44974b;
            nltVar13.f43623a |= 8192;
            nltVar13.f43653p = fFloatValue13;
        }
        if (mrmVar14.mo16813g()) {
            float fFloatValue14 = ((Float) mrmVar14.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar14 = (nlt) nxlVarM18137O.f44974b;
            nltVar14.f43623a |= 16384;
            nltVar14.f43654q = fFloatValue14;
        }
        if (mrmVar15.mo16813g()) {
            float fFloatValue15 = ((Float) mrmVar15.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar15 = (nlt) nxlVarM18137O.f44974b;
            nltVar15.f43623a |= 32768;
            nltVar15.f43655r = fFloatValue15;
        }
        if (mrmVar16.mo16813g()) {
            float fFloatValue16 = ((Float) mrmVar16.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar16 = (nlt) nxlVarM18137O.f44974b;
            nltVar16.f43623a |= 65536;
            nltVar16.f43656s = fFloatValue16;
        }
        if (mrmVar17.mo16813g()) {
            float fFloatValue17 = ((Float) mrmVar17.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar17 = (nlt) nxlVarM18137O.f44974b;
            nltVar17.f43623a |= 131072;
            nltVar17.f43657t = fFloatValue17;
        }
        if (mrmVar18.mo16813g()) {
            float fFloatValue18 = ((Float) mrmVar18.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar18 = (nlt) nxlVarM18137O.f44974b;
            nltVar18.f43623a |= 262144;
            nltVar18.f43658u = fFloatValue18;
        }
        if (mrmVar19.mo16813g()) {
            float fFloatValue19 = ((Float) mrmVar19.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar19 = (nlt) nxlVarM18137O.f44974b;
            nltVar19.f43623a |= 524288;
            nltVar19.f43659v = fFloatValue19;
        }
        if (mrmVar20.mo16813g()) {
            float fFloatValue20 = ((Float) mrmVar20.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar20 = (nlt) nxlVarM18137O.f44974b;
            nltVar20.f43623a |= 1048576;
            nltVar20.f43660w = fFloatValue20;
        }
        if (mrmVar21.mo16813g()) {
            float fFloatValue21 = ((Float) mrmVar21.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar21 = (nlt) nxlVarM18137O.f44974b;
            nltVar21.f43623a |= 2097152;
            nltVar21.f43661x = fFloatValue21;
        }
        if (mrmVar22.mo16813g()) {
            float fFloatValue22 = ((Float) mrmVar22.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar22 = (nlt) nxlVarM18137O.f44974b;
            nltVar22.f43623a |= 4194304;
            nltVar22.f43662y = fFloatValue22;
        }
        if (mrmVar23.mo16813g()) {
            float fFloatValue23 = ((Float) mrmVar23.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar23 = (nlt) nxlVarM18137O.f44974b;
            nltVar23.f43623a |= 8388608;
            nltVar23.f43663z = fFloatValue23;
        }
        if (mrmVar24.mo16813g()) {
            float fFloatValue24 = ((Float) mrmVar24.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar24 = (nlt) nxlVarM18137O.f44974b;
            nltVar24.f43623a |= 16777216;
            nltVar24.f43597A = fFloatValue24;
        }
        if (mrmVar25.mo16813g()) {
            float fFloatValue25 = ((Float) mrmVar25.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar25 = (nlt) nxlVarM18137O.f44974b;
            nltVar25.f43623a |= 33554432;
            nltVar25.f43598B = fFloatValue25;
        }
        if (mrmVar26.mo16813g()) {
            float fFloatValue26 = ((Float) mrmVar26.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar26 = (nlt) nxlVarM18137O.f44974b;
            nltVar26.f43623a |= 67108864;
            nltVar26.f43599C = fFloatValue26;
        }
        if (mrmVar27.mo16813g()) {
            float fFloatValue27 = ((Float) mrmVar27.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar27 = (nlt) nxlVarM18137O.f44974b;
            nltVar27.f43623a |= 134217728;
            nltVar27.f43600D = fFloatValue27;
        }
        if (mrmVar28.mo16813g()) {
            float fFloatValue28 = ((Float) mrmVar28.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar28 = (nlt) nxlVarM18137O.f44974b;
            nltVar28.f43623a |= 268435456;
            nltVar28.f43601E = fFloatValue28;
        }
        if (mrmVar43.mo16813g()) {
            int iIntValue = ((Integer) mrmVar43.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar29 = (nlt) nxlVarM18137O.f44974b;
            nltVar29.f43623a |= 536870912;
            nltVar29.f43602F = iIntValue;
        }
        if (mrmVar29.mo16813g()) {
            float fFloatValue29 = ((Float) mrmVar29.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar30 = (nlt) nxlVarM18137O.f44974b;
            nltVar30.f43623a |= 1073741824;
            nltVar30.f43603G = fFloatValue29;
        }
        if (mrmVar30.mo16813g()) {
            float fFloatValue30 = ((Float) mrmVar30.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar31 = (nlt) nxlVarM18137O.f44974b;
            nltVar31.f43623a |= Integer.MIN_VALUE;
            nltVar31.f43604H = fFloatValue30;
        }
        if (mrmVar44.mo16813g()) {
            int iIntValue2 = ((Integer) mrmVar44.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar32 = (nlt) nxlVarM18137O.f44974b;
            nltVar32.f43639b |= 1;
            nltVar32.f43605I = iIntValue2;
        }
        if (mrmVar31.mo16813g()) {
            float fFloatValue31 = ((Float) mrmVar31.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nlt nltVar33 = (nlt) nxlVarM18137O.f44974b;
            nltVar33.f43639b |= 2;
            nltVar33.f43606J = fFloatValue31;
        }
        if (mrmVar32.mo16813g()) {
            float fFloatValue32 = ((Float) mrmVar32.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17481b(fFloatValue32);
        }
        if (mrmVar33.mo16813g()) {
            float fFloatValue33 = ((Float) mrmVar33.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17482c(fFloatValue33);
        }
        if (mrmVar34.mo16813g()) {
            float fFloatValue34 = ((Float) mrmVar34.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17483d(fFloatValue34);
        }
        if (mrmVar45.mo16813g()) {
            int iIntValue3 = ((Integer) mrmVar45.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17484e(iIntValue3);
        }
        if (mrmVar35.mo16813g()) {
            float fFloatValue35 = ((Float) mrmVar35.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17485f(fFloatValue35);
        }
        if (mrmVar36.mo16813g()) {
            float fFloatValue36 = ((Float) mrmVar36.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17486g(fFloatValue36);
        }
        if (mrmVar37.mo16813g()) {
            float fFloatValue37 = ((Float) mrmVar37.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17487h(fFloatValue37);
        }
        if (mrmVar38.mo16813g()) {
            float fFloatValue38 = ((Float) mrmVar38.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17488i(fFloatValue38);
        }
        if (mrmVar39.mo16813g()) {
            float fFloatValue39 = ((Float) mrmVar39.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17489j(fFloatValue39);
        }
        if (mrmVar46.mo16813g()) {
            int iIntValue4 = ((Integer) mrmVar46.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17490k(iIntValue4);
        }
        if (mrmVar47.mo16813g()) {
            int iIntValue5 = ((Integer) mrmVar47.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17491l(iIntValue5);
        }
        if (mrmVar40.mo16813g()) {
            float fFloatValue40 = ((Float) mrmVar40.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17492m(fFloatValue40);
        }
        if (mrmVar41.mo16813g()) {
            float fFloatValue41 = ((Float) mrmVar41.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17493n(fFloatValue41);
        }
        if (mrmVar48.mo16813g()) {
            int iIntValue6 = ((Integer) mrmVar48.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17494o(iIntValue6);
        }
        if (mrmVar49.mo16813g()) {
            int iIntValue7 = ((Integer) mrmVar49.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17495p(iIntValue7);
        }
        if (mrmVar42.mo16813g()) {
            float fFloatValue42 = ((Float) mrmVar42.mo16809c()).floatValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17499t(fFloatValue42);
        }
        if (mrmVar50.mo16813g()) {
            int iIntValue8 = ((Integer) mrmVar50.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17500u(iIntValue8);
        }
        if (mrmVar51.mo16813g()) {
            int iIntValue9 = ((Integer) mrmVar51.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17501v(iIntValue9);
        }
        if (mrmVar52.mo16813g()) {
            int iIntValue10 = ((Integer) mrmVar52.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17502w(iIntValue10);
        }
        if (mrmVar53.mo16813g()) {
            int iIntValue11 = ((Integer) mrmVar53.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17503x(iIntValue11);
        }
        if (mrmVar54.mo16813g()) {
            int iIntValue12 = ((Integer) mrmVar54.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17504y(iIntValue12);
        }
        if (mrmVar55.mo16813g()) {
            int iIntValue13 = ((Integer) mrmVar55.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17505z(iIntValue13);
        }
        if (mrmVar56.mo16813g()) {
            int iIntValue14 = ((Integer) mrmVar56.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17475A(iIntValue14);
        }
        if (mrmVar57.mo16813g()) {
            int iIntValue15 = ((Integer) mrmVar57.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17476B(iIntValue15);
        }
        if (mrmVar58.mo16813g()) {
            int iIntValue16 = ((Integer) mrmVar58.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17477C(iIntValue16);
        }
        if (mrmVar59.mo16813g()) {
            int iIntValue17 = ((Integer) mrmVar59.mo16809c()).intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17478D(iIntValue17);
        }
        if (i == 2) {
            int i10 = this.f5246m;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17496q(i10);
            int i11 = this.f5247n;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            ((nlt) nxlVarM18137O.f44974b).m17497r(i11);
            int i12 = this.f5248o;
            nxlVarM18137O.m18105o();
            ((nlt) nxlVarM18137O.f44974b).m17498s(i12);
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nlt) nxlVarM18137O.f44974b).m17479E(i9);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ((nlt) nxlVarM18137O.f44974b).m17480F(i8);
        nlt nltVar34 = (nlt) nxlVarM18137O.mo18103l();
        fcp fcpVar = this.f5235b;
        nxl nxlVarM18137O2 = nlv.f43686e.m18137O();
        nxlVarM18137O2.m18046I(i);
        nxlVarM18137O2.m18047J(i7);
        nxlVarM18137O2.m18045H(nltVar34);
        fcpVar.mo8136K((nlv) nxlVarM18137O2.mo18103l());
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3474b(int i) {
        if (this.f5236c.booleanValue()) {
            kpp kppVar = this.f5245l;
            if (kppVar != null) {
                try {
                    m3473r(mws.m17097l(m3471p(kppVar)), i, 2);
                } catch (IOException | IllegalArgumentException e) {
                    e.getMessage();
                }
            }
        }
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final synchronized void mo3408bu(kpp kppVar) {
        Integer num;
        Integer num2;
        Integer num3;
        if (this.f5236c.booleanValue()) {
            this.f5245l = kppVar;
            this.f5243j++;
            if (this.f5246m == -1 && (num3 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AE_STATE)) != null && (num3.intValue() == 2 || num3.intValue() == 4 || num3.intValue() == 3)) {
                this.f5246m = this.f5243j;
            }
            if (this.f5247n == -1 && (num2 = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE)) != null && (num2.intValue() == 2 || num2.intValue() == 4 || num2.intValue() == 5)) {
                this.f5247n = this.f5243j;
            }
            if (this.f5248o == -1 && (num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AWB_STATE)) != null && (num.intValue() == 2 || num.intValue() == 3)) {
                this.f5248o = this.f5243j;
            }
            if (this.f5243j > 60) {
                return;
            }
            try {
                this.f5244k.add(m3471p(kppVar));
            } catch (IOException e) {
            } catch (IllegalArgumentException e2) {
            }
            if (this.f5243j == 60) {
                m3473r(this.f5244k, 2, 3);
            }
        }
    }
}
