package p000;

import android.hardware.camera2.CaptureResult;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hna extends kfv {

    /* JADX INFO: renamed from: a */
    private final jww f28380a;

    /* JADX INFO: renamed from: b */
    private final jww f28381b;

    /* JADX INFO: renamed from: c */
    private final hnd f28382c;

    /* JADX INFO: renamed from: d */
    private final dbr f28383d;

    public hna(jww jwwVar, jww jwwVar2, hnd hndVar, dbr dbrVar) {
        this.f28380a = jwwVar;
        this.f28381b = jwwVar2;
        this.f28382c = hndVar;
        this.f28383d = dbrVar;
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bu */
    public final void mo3408bu(kpp kppVar) {
        hno hnoVar;
        int iMin;
        boolean z;
        int i;
        int iMin2;
        Float f;
        if (this.f28383d.m5900i()) {
            hnd hndVar = this.f28382c;
            Float f2 = (Float) kppVar.mo9517d(CaptureResult.CONTROL_ZOOM_RATIO);
            f2.getClass();
            float fFloatValue = f2.floatValue();
            boolean z2 = true;
            if (fFloatValue >= 1.0f && (f = hndVar.f28404m) != null && f.floatValue() < 1.0f) {
                hndVar.f28405n = hndVar.f28394c;
                hndVar.f28403l = true;
                hndVar.f28400i = 0;
            }
            hndVar.f28404m = Float.valueOf(fFloatValue);
            if (Float.compare(fFloatValue, 1.0f) < 0) {
                hndVar.m10485a();
                hnoVar = hno.INACTIVE;
            } else if (hndVar.f28403l) {
                String str = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                if (str == null) {
                    z = false;
                } else {
                    if (hndVar.f28396e.m11496k(str)) {
                        iMin = Math.min(hndVar.f28400i + 1, hndVar.f28394c);
                        hndVar.f28400i = iMin;
                    } else {
                        hndVar.f28400i = 0;
                        iMin = 0;
                    }
                    z = iMin >= hndVar.f28394c;
                }
                int i2 = hndVar.f28405n - 1;
                hndVar.f28405n = i2;
                if (i2 == 0) {
                    hndVar.m10485a();
                }
                hnoVar = z ? hno.ACTIVE : hno.INACTIVE;
            } else {
                String str2 = (String) kppVar.mo9517d(CaptureResult.LOGICAL_MULTI_CAMERA_ACTIVE_PHYSICAL_ID);
                if (str2 == null) {
                    hnoVar = hno.INACTIVE;
                } else if (((hnp) hndVar.f28395d.mo3831be()).equals(hnp.ON)) {
                    hnoVar = hno.ACTIVE;
                } else {
                    dhv dhvVar = hndVar.f28399h;
                    dhx dhxVar = dib.f11240a;
                    dhvVar.mo6177e();
                    if (((hnp) hndVar.f28395d.mo3831be()).equals(hnp.AUTO)) {
                        if (hndVar.f28396e.m11496k(str2)) {
                            hnoVar = hno.ACTIVE;
                        } else {
                            hnoVar = hndVar.m10488d(kppVar, hndVar.f28393b) ? hno.TRANSITION_TO_ACTIVE : hno.INACTIVE;
                        }
                    } else if (hndVar.f28396e.m11496k(str2)) {
                        hndVar.m10486b();
                        hndVar.m10487c();
                        ((nbe) ((nbe) hnd.f28392a.m17252c()).mo17276G((char) 3751)).mo17290o("Current active lens is UW, even though Macro Focus is in OFF state.");
                        hnoVar = hno.ACTIVE;
                    } else {
                        hnoVar = hndVar.m10488d(kppVar, 1) ? hno.TRANSITION_TO_ACTIVE : hno.INACTIVE;
                    }
                }
            }
            if (!((hno) this.f28380a.mo3831be()).equals(hnoVar)) {
                this.f28380a.mo3415bf(hnoVar);
            }
            hnd hndVar2 = this.f28382c;
            Integer num = (Integer) kppVar.mo9517d(CaptureResult.CONTROL_AF_STATE);
            num.getClass();
            if (gst.m9711a(num.intValue()).m9712b()) {
                iMin2 = Math.min(hndVar2.f28402k + 1, hndVar2.f28398g);
                hndVar2.f28402k = iMin2;
                hndVar2.f28401j = 0;
                i = 0;
            } else {
                int iMin3 = Math.min(hndVar2.f28401j + 1, hndVar2.f28397f);
                hndVar2.f28401j = iMin3;
                hndVar2.f28402k = 0;
                i = iMin3;
                iMin2 = 0;
            }
            if (iMin2 >= hndVar2.f28398g) {
                hndVar2.f28406o = true;
            } else if (i >= hndVar2.f28397f) {
                hndVar2.f28406o = false;
                z2 = false;
            } else {
                z2 = hndVar2.f28406o;
            }
            Boolean bool = (Boolean) this.f28381b.mo3831be();
            Boolean boolValueOf = Boolean.valueOf(z2);
            if (bool.equals(boolValueOf)) {
                return;
            }
            this.f28381b.mo3415bf(boolValueOf);
        }
    }
}
