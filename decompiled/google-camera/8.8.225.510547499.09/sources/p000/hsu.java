package p000;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.Face;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.hotshot.HotshotView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p021j$.util.DesugarArrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsu {

    /* JADX INFO: renamed from: a */
    public final boolean f29455a;

    /* JADX INFO: renamed from: b */
    public final Object f29456b;

    /* JADX INFO: renamed from: c */
    public final Object f29457c;

    /* JADX INFO: renamed from: d */
    public final Object f29458d;

    /* JADX INFO: renamed from: e */
    public final Object f29459e;

    /* JADX INFO: renamed from: f */
    public final Object f29460f;

    /* JADX INFO: renamed from: g */
    public final Object f29461g;

    public hsu(AccessibilityManager accessibilityManager, dpx dpxVar, fvu fvuVar, ggm ggmVar, flz flzVar, dnr dnrVar, dhv dhvVar, hys hysVar, byte[] bArr, byte[] bArr2) {
        accessibilityManager.getClass();
        this.f29460f = accessibilityManager;
        dpxVar.getClass();
        this.f29459e = dpxVar;
        fvuVar.getClass();
        this.f29457c = fvuVar;
        ggmVar.getClass();
        this.f29456b = ggmVar;
        this.f29461g = flzVar;
        dnrVar.getClass();
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6176d();
        this.f29458d = hysVar;
        boolean zMo6184l = dhvVar.mo6184l(dib.f11357ck);
        this.f29455a = zMo6184l;
        if (zMo6184l) {
            Integer num = (Integer) fvuVar.mo14559l(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
            int iIntValue = num == null ? 0 : num.intValue();
            if (iIntValue <= 0) {
                ((nbe) ((nbe) hys.f29951a.m17252c()).mo17276G(4030)).mo17291p("Wrong max faces %d", iIntValue);
            } else {
                hysVar.f29965l = iIntValue;
            }
        }
    }

    public hsu(String str, String str2, List list, String str3, String str4, String str5) {
        this.f29456b = str;
        this.f29457c = str2;
        this.f29458d = list;
        this.f29459e = str3;
        this.f29460f = str4;
        this.f29461g = str5;
        this.f29455a = false;
    }

    /* JADX INFO: renamed from: a */
    public final kba m10716a(jwn jwnVar, jvd jvdVar) {
        final byte[] bArr = null;
        return jwnVar.mo3830a(new kbg(bArr) { // from class: fmm
            /* JADX WARN: Code duplicated, block: B:102:0x0245  */
            /* JADX WARN: Code duplicated, block: B:103:0x024c  */
            /* JADX WARN: Code duplicated, block: B:105:0x0250  */
            /* JADX WARN: Code duplicated, block: B:106:0x0253  */
            /* JADX WARN: Code duplicated, block: B:108:0x025c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:109:0x025e  */
            /* JADX WARN: Code duplicated, block: B:110:0x0261  */
            /* JADX WARN: Code duplicated, block: B:112:0x0269  */
            /* JADX WARN: Code duplicated, block: B:114:0x0271  */
            /* JADX WARN: Code duplicated, block: B:116:0x0274  */
            /* JADX WARN: Code duplicated, block: B:117:0x0277  */
            /* JADX WARN: Code duplicated, block: B:119:0x027b  */
            /* JADX WARN: Code duplicated, block: B:120:0x027c  */
            /* JADX WARN: Code duplicated, block: B:122:0x0284  */
            /* JADX WARN: Code duplicated, block: B:124:0x028c  */
            /* JADX WARN: Code duplicated, block: B:167:0x035d  */
            /* JADX WARN: Code duplicated, block: B:90:0x0210  */
            @Override // p000.kbg
            /* JADX INFO: renamed from: bf */
            public final void mo3415bf(Object obj) {
                hst hstVar;
                float fHypot;
                int iM6563e;
                hyv hyvVar;
                int iM6563e2;
                mhc mhcVar;
                hsu hsuVar = this.f22565a;
                igp igpVar = (igp) obj;
                if (!hsuVar.f29455a || !((hys) hsuVar.f29458d).m10885h()) {
                    if (((AccessibilityManager) hsuVar.f29460f).isEnabled()) {
                        hsuVar.m10718c(igpVar);
                        return;
                    }
                    return;
                }
                hys hysVar = (hys) hsuVar.f29458d;
                if (hysVar.f29966m) {
                    if (!hysVar.f29962i.mo9108G() && ((hstVar = hysVar.f29975v.f29946a) == null || (mhcVar = hstVar.f29440d) == null || !mhcVar.isShowing())) {
                        if (hysVar.f29968o) {
                            hysVar.f29968o = false;
                            hysVar.f29959f.m10888a(true);
                            hysVar.f29958e.m6561c();
                        }
                        hyz hyzVar = hysVar.f29959f;
                        int iIntValue = ((Integer) hysVar.f29964k.mo3831be()).intValue();
                        mrm mrmVar = hyzVar.f30000b;
                        if (mrmVar.mo16813g()) {
                            kcg kcgVar = ((HotshotView) mrmVar.mo16809c()).f12088b;
                            if (kcgVar.f35561b != iIntValue || kcgVar.f35562c == null) {
                                kcgVar.f35561b = iIntValue;
                                kcgVar.m13969d();
                            }
                        } else {
                            ((nbe) ((nbe) hyz.f29999a.m17251b()).mo17276G((char) 4041)).mo17290o("setSensorOrientation, view is not present.");
                        }
                        hyz hyzVar2 = hysVar.f29959f;
                        mrm mrmVar2 = hyzVar2.f30000b;
                        if (mrmVar2.mo16813g() && hyzVar2.f30001c && igpVar != null) {
                            boolean zMo16813g = mrmVar2.mo16813g();
                            Object obj2 = igpVar.f30850b;
                            if (zMo16813g) {
                                HotshotView hotshotView = (HotshotView) mrmVar2.mo16809c();
                                Rect rect = (Rect) obj2;
                                if (rect.height() != 0 && rect.width() != 0) {
                                    hotshotView.f7035i = Math.abs((((float) rect.width()) / ((float) rect.height())) + (-1.7777778f)) < 0.025f;
                                    kcg kcgVar2 = hotshotView.f12088b;
                                    Rect rect2 = kcgVar2.f35563d;
                                    if (rect2 == null || !rect.equals(rect2) || kcgVar2.f35562c == null) {
                                        obj2.toString();
                                        kcgVar2.f35563d = rect;
                                        kcgVar2.m13969d();
                                    }
                                    if (hotshotView.f12088b.m13970e()) {
                                        hotshotView.f12088b.m13966a().mapRect(hotshotView.f7029c, new RectF(rect));
                                        if (hotshotView.f7031e) {
                                            float fMin = Math.min(hotshotView.f7029c.width(), hotshotView.f7029c.height());
                                            hotshotView.f7032f = fMin;
                                            if (fMin == 0.0f) {
                                                ((nbe) ((nbe) HotshotView.f7027a.m17252c()).mo17276G((char) 4035)).mo17290o("lengthOfScreenShortSide should not be zero.");
                                                hotshotView.f7032f = 1.0f;
                                            }
                                        }
                                    }
                                }
                            }
                            List listAsList = Arrays.asList((Object[]) igpVar.f30851c);
                            mrm mrmVar3 = hyzVar2.f30000b;
                            if (mrmVar3.mo16813g() && hyzVar2.f30001c && listAsList != null) {
                                HotshotView hotshotView2 = (HotshotView) mrmVar3.mo16809c();
                                hotshotView2.f7034h = listAsList;
                                if (hotshotView2.f7034h.isEmpty() || hotshotView2.f7034h.size() > 1 || !hotshotView2.f12088b.m13970e()) {
                                    fHypot = -1.0f;
                                } else {
                                    float[] fArr = {((Face) hotshotView2.f7034h.get(0)).getBounds().centerX(), ((Face) hotshotView2.f7034h.get(0)).getBounds().centerY()};
                                    hotshotView2.m6431a().mapPoints(fArr);
                                    fHypot = (float) Math.hypot(fArr[0] - hotshotView2.f7029c.centerX(), fArr[1] - hotshotView2.f7029c.centerY());
                                    if (hotshotView2.f7031e) {
                                        float f = hotshotView2.f7032f;
                                        if (f != 0.0f) {
                                            fHypot = (fHypot * 100.0f) / f;
                                        }
                                    }
                                }
                            } else {
                                fHypot = -1.0f;
                            }
                        } else {
                            fHypot = -1.0f;
                        }
                        if (hysVar.f29963j.mo3831be() != null) {
                            int length = ((hyx[]) hysVar.f29963j.mo3831be()).length;
                            int iCount = (int) DesugarArrays.stream((hyx[]) hysVar.f29963j.mo3831be()).filter(fjv.f22326t).count();
                            int i = hysVar.f29972s;
                            if (i == 0) {
                                if (length >= 2) {
                                    if (length < hysVar.f29965l || iCount != 0) {
                                        hysVar.f29972s = 0;
                                        hysVar.f29973t = 0L;
                                        hyvVar = hyv.IDLE;
                                    } else {
                                        if (!hysVar.f29969p.equals(hyv.READY_TO_CAPTURE) && !hysVar.f29969p.equals(hyv.READY_TO_CAPTURE_MULTIPLE_FACES)) {
                                            hysVar.f29972s = length;
                                            hysVar.f29973t = SystemClock.elapsedRealtime();
                                        }
                                        hyvVar = SystemClock.elapsedRealtime() - hysVar.f29973t > 3000 ? hyv.READY_TO_CAPTURE : hyv.READY_TO_CAPTURE_MULTIPLE_FACES;
                                    }
                                } else if (fHypot == -1.0f) {
                                    hyvVar = hyv.IDLE;
                                } else {
                                    iM6563e = hysVar.f29958e.m6563e();
                                    if (iM6563e == 0) {
                                        throw null;
                                    }
                                    if (iM6563e == 2) {
                                        hyvVar = hyv.FACE_TOO_CLOSE;
                                    } else if (fHypot < hyv.READY_TO_CAPTURE.f29993k) {
                                        iM6563e2 = hysVar.f29958e.m6563e();
                                        if (iM6563e2 == 0) {
                                            throw null;
                                        }
                                        if (iM6563e2 == 4) {
                                            hyvVar = hyv.FACE_TOO_FAR;
                                        } else {
                                            hyvVar = hyv.READY_TO_CAPTURE;
                                        }
                                    } else {
                                        hyvVar = hyv.DISTANCE_1;
                                        if (fHypot >= hyvVar.f29993k) {
                                            hyvVar = hyv.DISTANCE_2;
                                            if (fHypot >= hyvVar.f29993k) {
                                                hyvVar = hyv.DISTANCE_OUTERMOST;
                                            }
                                        }
                                    }
                                }
                            } else if (length == i && iCount == 0) {
                                iCount = 0;
                                if (length >= 2) {
                                    if (length < hysVar.f29965l) {
                                        hysVar.f29972s = 0;
                                        hysVar.f29973t = 0L;
                                        hyvVar = hyv.IDLE;
                                    } else {
                                        hysVar.f29972s = 0;
                                        hysVar.f29973t = 0L;
                                        hyvVar = hyv.IDLE;
                                    }
                                } else if (fHypot == -1.0f) {
                                    hyvVar = hyv.IDLE;
                                } else {
                                    iM6563e = hysVar.f29958e.m6563e();
                                    if (iM6563e == 0) {
                                        throw null;
                                    }
                                    if (iM6563e == 2) {
                                        hyvVar = hyv.FACE_TOO_CLOSE;
                                    } else if (fHypot < hyv.READY_TO_CAPTURE.f29993k) {
                                        iM6563e2 = hysVar.f29958e.m6563e();
                                        if (iM6563e2 == 0) {
                                            throw null;
                                        }
                                        if (iM6563e2 == 4) {
                                            hyvVar = hyv.FACE_TOO_FAR;
                                        } else {
                                            hyvVar = hyv.READY_TO_CAPTURE;
                                        }
                                    } else {
                                        hyvVar = hyv.DISTANCE_1;
                                        if (fHypot >= hyvVar.f29993k) {
                                            hyvVar = hyv.DISTANCE_2;
                                            if (fHypot >= hyvVar.f29993k) {
                                                hyvVar = hyv.DISTANCE_OUTERMOST;
                                            }
                                        }
                                    }
                                }
                            } else {
                                hysVar.f29972s = 0;
                                hysVar.f29973t = 0L;
                                hyvVar = hyv.IDLE;
                            }
                        } else if (fHypot == -1.0f) {
                            hyvVar = hyv.IDLE;
                        } else {
                            iM6563e = hysVar.f29958e.m6563e();
                            if (iM6563e == 0) {
                                throw null;
                            }
                            if (iM6563e == 2) {
                                hyvVar = hyv.FACE_TOO_CLOSE;
                            } else if (fHypot < hyv.READY_TO_CAPTURE.f29993k) {
                                iM6563e2 = hysVar.f29958e.m6563e();
                                if (iM6563e2 == 0) {
                                    throw null;
                                }
                                if (iM6563e2 == 4) {
                                    hyvVar = hyv.FACE_TOO_FAR;
                                } else {
                                    hyvVar = hyv.READY_TO_CAPTURE;
                                }
                            } else {
                                hyvVar = hyv.DISTANCE_1;
                                if (fHypot >= hyvVar.f29993k) {
                                    hyvVar = hyv.DISTANCE_2;
                                    if (fHypot >= hyvVar.f29993k) {
                                        hyvVar = hyv.DISTANCE_OUTERMOST;
                                    }
                                }
                            }
                        }
                        if (hyvVar.f29993k != 2.1474836E9f) {
                            hyv hyvVar2 = hysVar.f29969p;
                            if (hyvVar2.f29993k != 2.1474836E9f && !hyvVar.equals(hyvVar2)) {
                                float f2 = hyvVar.f29993k;
                                hyv hyvVar3 = hysVar.f29969p;
                                float f3 = hyvVar3.f29993k;
                                if (f2 != f3 && (f2 >= f3 ? fHypot < f3 + 1.0f : fHypot > f2 - 1.0f)) {
                                    hyvVar = hyvVar3;
                                }
                            }
                        }
                        if (SystemClock.elapsedRealtime() - hysVar.f29974u >= 1500) {
                            if (!hyvVar.equals(hysVar.f29969p)) {
                                hysVar.f29970q = hysVar.f29969p;
                                hysVar.f29969p = hyvVar;
                                hysVar.f29958e.f12263p = hysVar.f29969p;
                                hysVar.f29971r = 0L;
                                if (hysVar.f29969p.equals(hyv.READY_TO_CAPTURE)) {
                                    hysVar.f29971r = SystemClock.elapsedRealtime();
                                    hysVar.f29958e.m6560b();
                                    if (hysVar.f29955b.isTouchExplorationEnabled()) {
                                        hysVar.f29955b.interrupt();
                                    }
                                } else {
                                    hysVar.f29958e.m6561c();
                                    Iterator it = hysVar.f29960g.iterator();
                                    while (it.hasNext()) {
                                        ((hyw) it.next()).mo7891A(hyvVar);
                                        hysVar.f29967n = false;
                                    }
                                }
                            } else if (hysVar.f29971r != 0 && hysVar.f29969p.equals(hyv.READY_TO_CAPTURE) && SystemClock.elapsedRealtime() - hysVar.f29971r > 1500) {
                                Iterator it2 = hysVar.f29960g.iterator();
                                while (it2.hasNext()) {
                                    ((hyw) it2.next()).mo7891A(hyv.READY_TO_CAPTURE);
                                }
                                hysVar.f29967n = true;
                                hysVar.f29971r = 0L;
                            }
                        }
                    } else if (!hysVar.f29968o) {
                        hysVar.f29968o = true;
                        hysVar.f29959f.m10888a(false);
                        hysVar.f29958e.m6560b();
                        hysVar.f29969p = hyv.IDLE;
                    }
                }
                hsuVar.m10718c(igpVar);
            }
        }, jvdVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m10717b(kbc kbcVar) {
        if (this.f29455a) {
            ((hys) this.f29458d).m10881d(kbcVar);
            ((dpx) this.f29459e).f12265r = kbcVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Type inference failed for: r6v0, types: [ggm, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final void m10718c(igp igpVar) {
        kpe[] kpeVarArr;
        boolean z;
        int iM6557g;
        int iM6557g2;
        boolean z2;
        int i;
        int iM6556f;
        int iM6556f2;
        char c;
        Rect rect;
        Rect rect2 = (Rect) ((kmr) this.f29457c).mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Object obj = igpVar.f30850b;
        if (rect2 == null || rect2.width() == 0) {
            kpeVarArr = new kpe[0];
        } else {
            Rect rect3 = (Rect) obj;
            if (rect3.width() == 0) {
                kpeVarArr = new kpe[0];
            } else {
                float fWidth = rect3.width() >= rect3.height() ? rect2.width() / rect3.width() : rect2.height() / rect3.height();
                Face[] faceArr = (Face[]) igpVar.f30851c;
                kpeVarArr = new kpe[faceArr.length];
                for (int i2 = 0; i2 < faceArr.length; i2++) {
                    Rect bounds = faceArr[i2].getBounds();
                    if (fWidth <= 0.0f) {
                        rect = bounds;
                    } else {
                        Rect rect4 = new Rect(bounds);
                        if (fWidth != 1.0f) {
                            float fWidth2 = (bounds.width() / 2.0f) * fWidth;
                            float fHeight = (bounds.height() / 2.0f) * fWidth;
                            rect4.left = (int) (bounds.centerX() - fWidth2);
                            rect4.top = (int) (bounds.centerY() - fHeight);
                            rect4.right = (int) (bounds.centerX() + fWidth2);
                            rect4.bottom = (int) (bounds.centerY() + fHeight);
                        }
                        rect = rect4;
                    }
                    kpeVarArr[i2] = new kpe(-1, rect, faceArr[i2].getScore(), null, null, null);
                }
            }
        }
        Rect rect5 = (Rect) ((kmr) this.f29457c).mo14559l(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Integer num = (Integer) ((kmr) this.f29457c).mo14559l(CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT);
        if (rect5 == null || num == null) {
            return;
        }
        Object obj2 = this.f29459e;
        int i3 = this.f29456b.mo9215c().f35503e;
        int iIntValue = num.intValue();
        boolean z3 = ((flz) this.f29461g).f22530b == kmq.f36557a;
        int length = kpeVarArr.length;
        dpx dpxVar = (dpx) obj2;
        dpxVar.f12261n = length > 0 ? kpeVarArr[0] : null;
        dpxVar.f12262o = rect5;
        int iIntValue2 = ((Integer) dpxVar.f12252e.mo3831be()).intValue();
        if (iIntValue2 == 0 || iIntValue2 == 90 || iIntValue2 == 180) {
            z = true;
        } else if (iIntValue2 == 270) {
            iIntValue2 = 270;
            z = true;
        } else {
            z = false;
        }
        lku.m15672z(z, "Invalid sensor orientation: %s", iIntValue2);
        boolean z4 = i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270;
        lku.m15672z(z4, "Invalid device orientation: %s", i3);
        boolean zBooleanValue = z3 | ((Boolean) dpxVar.f12253f.mo3831be()).booleanValue();
        if (!dpxVar.f12259l) {
            int i4 = iIntValue2;
            if (dpxVar.f12258k) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = dpxVar.f12255h;
                boolean z5 = j == -1 || jCurrentTimeMillis - j > 3000;
                boolean z6 = length > 0 || dpxVar.f12256i != 0;
                if (z5 && z6) {
                    dpxVar.f12256i = length;
                    dpxVar.f12255h = jCurrentTimeMillis;
                    if (length != 1) {
                        if (length == iIntValue) {
                            dpxVar.f12250c.announceForAccessibility(dpxVar.f12249b.getString(C0100R.string.max_face_announcement, Integer.valueOf(length)));
                            return;
                        } else {
                            dpxVar.f12250c.announceForAccessibility(dpxVar.f12249b.getString(C0100R.string.number_of_faces_announcement, Integer.valueOf(length)));
                            return;
                        }
                    }
                    View view = dpxVar.f12250c;
                    Context context = dpxVar.f12249b;
                    Object[] objArr = new Object[3];
                    objArr[0] = 1;
                    kpe kpeVar = kpeVarArr[0];
                    int iCenterX = kpeVar.f36797c.centerX();
                    int iCenterY = kpeVar.f36797c.centerY();
                    int iWidth = rect5.width();
                    int iHeight = rect5.height();
                    int i5 = i3 + i4;
                    if (zBooleanValue) {
                        int i6 = i4 % 180;
                        if (i6 == 0) {
                            iCenterX = iWidth - iCenterX;
                        } else if (i6 != 0) {
                            iCenterY = iHeight - iCenterY;
                        }
                    }
                    switch (i5 % 360) {
                        case 0:
                            int iM6557g3 = dpx.m6557g(iCenterX, iWidth, 3);
                            iM6557g = dpx.m6557g(iCenterY, iHeight, 3);
                            iM6557g2 = iM6557g3;
                            break;
                        case 90:
                            iM6557g2 = dpx.m6557g(iHeight - iCenterY, iHeight, 3);
                            iM6557g = dpx.m6557g(iCenterX, iWidth, 3);
                            break;
                        case 180:
                            int iM6557g4 = dpx.m6557g(iWidth - iCenterX, iWidth, 3);
                            iM6557g = dpx.m6557g(iHeight - iCenterY, iHeight, 3);
                            iM6557g2 = iM6557g4;
                            break;
                        case 270:
                            iM6557g2 = dpx.m6557g(iCenterY, iHeight, 3);
                            iM6557g = dpx.m6557g(iWidth - iCenterX, iWidth, 3);
                            break;
                        default:
                            throw new IllegalStateException("Invalid sensor rotation. Display orientation: " + i3 + ", Sensor orientation: " + i4);
                    }
                    objArr[1] = dpxVar.f12249b.getString(dpxVar.f12251d[iM6557g][iM6557g2]);
                    objArr[2] = dpxVar.m6559a(zBooleanValue);
                    view.announceForAccessibility(context.getString(C0100R.string.detailed_face_announcement, objArr));
                    return;
                }
                return;
            }
            return;
        }
        int length2 = ((hyx[]) dpxVar.f12264q.mo3831be()).length;
        int i7 = iIntValue2;
        int iCount = (int) DesugarArrays.stream((hyx[]) dpxVar.f12264q.mo3831be()).filter(cdy.f5384m).count();
        if (dpxVar.f12260m && iCount == 0) {
            iCount = 0;
        }
        if (dpxVar.f12258k) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            long j2 = dpxVar.f12255h;
            boolean z7 = j2 == -1 || jCurrentTimeMillis2 - j2 > 3000;
            if (length2 > 0) {
                z2 = true;
            } else if (dpxVar.f12256i != 0) {
                length2 = 0;
                z2 = true;
            } else if (iCount != dpxVar.f12257j) {
                length2 = 0;
                z2 = true;
            } else {
                length2 = 0;
                z2 = false;
            }
            if (z7 && z2) {
                dpxVar.f12256i = length2;
                dpxVar.f12257j = iCount;
                dpxVar.f12255h = jCurrentTimeMillis2;
                hyx[] hyxVarArr = (hyx[]) dpxVar.f12264q.mo3831be();
                hyxVarArr.getClass();
                int iCount2 = (int) DesugarArrays.stream(hyxVarArr).filter(cdy.f5384m).count();
                int length3 = hyxVarArr.length;
                if (length3 == 0) {
                    dpxVar.f12250c.announceForAccessibility(dpxVar.f12249b.getString(C0100R.string.hotshot_no_face_announcement));
                    return;
                }
                String string = "";
                if (length3 != 1) {
                    if (length3 == iIntValue) {
                        String string2 = dpxVar.f12249b.getString(C0100R.string.max_face_announcement, Integer.valueOf(length3));
                        if (iCount2 > 0) {
                            string2 = String.format(Locale.ROOT, "%s %s", string2, dpxVar.f12249b.getResources().getQuantityString(C0100R.plurals.number_of_cropped_face, iCount2, Integer.valueOf(iCount2)));
                        }
                        dpxVar.f12250c.announceForAccessibility(string2);
                        return;
                    }
                    if (iCount2 != 0) {
                        dpxVar.f12250c.announceForAccessibility(String.format(Locale.ROOT, "%s %s", dpxVar.f12249b.getString(C0100R.string.number_of_faces_announcement, Integer.valueOf(length3)), dpxVar.f12249b.getResources().getQuantityString(C0100R.plurals.number_of_cropped_face, iCount2, Integer.valueOf(iCount2))));
                        return;
                    } else if (dpxVar.f12260m) {
                        dpxVar.f12250c.announceForAccessibility(String.valueOf(dpxVar.f12249b.getString(C0100R.string.number_of_faces_announcement, Integer.valueOf(length3))).concat(String.valueOf(dpxVar.f12263p.equals(hyv.READY_TO_CAPTURE) ? dpxVar.f12249b.getString(C0100R.string.face_in_selfie_range) : "")));
                        return;
                    } else {
                        dpxVar.f12250c.announceForAccessibility(String.format(Locale.US, "%s %s.", dpxVar.f12249b.getString(C0100R.string.number_of_faces_announcement, Integer.valueOf(length3)), dpxVar.f12249b.getString(C0100R.string.face_in_selfie_range)));
                        return;
                    }
                }
                View view2 = dpxVar.f12250c;
                Context context2 = dpxVar.f12249b;
                int i8 = iCount2 == 1 ? C0100R.string.hotshot_detailed_cropped_face_announcement : C0100R.string.hotshot_detailed_face_announcement;
                Object[] objArr2 = new Object[1];
                kpe kpeVar2 = hyxVarArr[0].f29995a;
                if (dpxVar.m6562d()) {
                    c = 0;
                } else {
                    int iCenterX2 = kpeVar2.f36797c.centerX();
                    int iCenterY2 = kpeVar2.f36797c.centerY();
                    int iWidth2 = rect5.width();
                    int iHeight2 = rect5.height();
                    int i9 = (i3 + i7) % 360;
                    if (zBooleanValue) {
                        i = i7;
                        int i10 = i % 180;
                        if (i10 == 0) {
                            iCenterX2 = iWidth2 - iCenterX2;
                        } else if (i10 != 0) {
                            iCenterY2 = iHeight2 - iCenterY2;
                        }
                    } else {
                        i = i7;
                    }
                    int iCenterX3 = iCenterX2 - rect5.centerX();
                    int iCenterY3 = iCenterY2 - rect5.centerY();
                    switch (i9) {
                        case 0:
                            int iM6556f3 = dpx.m6556f(iCenterY3, false);
                            iM6556f = dpx.m6556f(iCenterX3, false);
                            iM6556f2 = iM6556f3;
                            break;
                        case 90:
                            iM6556f2 = dpx.m6556f(iCenterX3, false);
                            iM6556f = dpx.m6556f(iCenterY3, true);
                            break;
                        case 180:
                            iM6556f2 = dpx.m6556f(iCenterY3, true);
                            iM6556f = dpx.m6556f(iCenterX3, true);
                            break;
                        case 270:
                            iM6556f2 = dpx.m6556f(iCenterX3, true);
                            iM6556f = dpx.m6556f(iCenterY3, false);
                            break;
                        default:
                            throw new IllegalStateException("Invalid sensor rotation. Display orientation: " + i3 + ", Sensor orientation: " + i);
                    }
                    if (iM6556f >= dpxVar.f12254g[iM6556f2].length) {
                        ((nbe) ((nbe) dpx.f12248a.m17252c()).mo17276G(1082)).mo17294s("Wrong index in movePhoneDirectionStrings. %d,%d", iM6556f2, iM6556f);
                    } else {
                        if (iM6556f2 == 1) {
                            if (iM6556f != 1) {
                                iM6556f2 = 1;
                            }
                        }
                        if (dpxVar.f12263p.equals(hyv.DISTANCE_1)) {
                            Context context3 = dpxVar.f12249b;
                            string = context3.getString(C0100R.string.move_phone_slightly_with_direction, context3.getString(dpxVar.f12254g[iM6556f2][iM6556f]));
                            c = 0;
                        } else {
                            Context context4 = dpxVar.f12249b;
                            String string3 = context4.getString(dpxVar.f12254g[iM6556f2][iM6556f]);
                            c = 0;
                            string = context4.getString(C0100R.string.move_phone_with_direction, string3);
                        }
                    }
                    c = 0;
                }
                objArr2[c] = string;
                view2.announceForAccessibility(String.valueOf(context2.getString(i8, objArr2)).concat(String.valueOf(dpxVar.m6559a(zBooleanValue))));
            }
        }
    }

    public hsu(String str, String str2, List list, String str3, String str4) {
        this(str, str2, list, str3, "", str4);
    }
}
