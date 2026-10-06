package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CaptureRequest;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1091wg {

    /* JADX INFO: renamed from: b */
    public final C1007td f47921b;

    /* JADX INFO: renamed from: c */
    private final int f47922c = C1092wh.f47925a.m18846b();

    /* JADX INFO: renamed from: d */
    private final opk f47923d = ook.m18793g(false);

    /* JADX INFO: renamed from: a */
    public final List f47920a = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final AmbientMode.AmbientController f47924e = new AmbientMode.AmbientController(this);

    public C1091wg(C1007td c1007td) {
        this.f47921b = c1007td;
    }

    /* JADX INFO: renamed from: a */
    public final void m19523a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closing ");
        sb.append(this);
        Log.w("CXCP", "Closing ".concat(toString()));
        this.f47923d.m18843b();
    }

    /* JADX WARN: Code duplicated, block: B:175:0x04bb A[Catch: all -> 0x05f4, TryCatch #11 {, blocks: (B:143:0x03dd, B:145:0x03e5, B:167:0x047e, B:169:0x0489, B:171:0x048f, B:173:0x0493, B:179:0x04dc, B:174:0x04a7, B:175:0x04bb, B:177:0x04bf, B:178:0x04ce), top: B:327:0x03dd }] */
    /* JADX WARN: Code duplicated, block: B:177:0x04bf A[Catch: all -> 0x05f4, TryCatch #11 {, blocks: (B:143:0x03dd, B:145:0x03e5, B:167:0x047e, B:169:0x0489, B:171:0x048f, B:173:0x0493, B:179:0x04dc, B:174:0x04a7, B:175:0x04bb, B:177:0x04bf, B:178:0x04ce), top: B:327:0x03dd }] */
    /* JADX WARN: Code duplicated, block: B:178:0x04ce A[Catch: all -> 0x05f4, TryCatch #11 {, blocks: (B:143:0x03dd, B:145:0x03e5, B:167:0x047e, B:169:0x0489, B:171:0x048f, B:173:0x0493, B:179:0x04dc, B:174:0x04a7, B:175:0x04bb, B:177:0x04bf, B:178:0x04ce), top: B:327:0x03dd }] */
    /* JADX WARN: Code duplicated, block: B:312:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:373:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:378:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:384:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:396:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x018b A[LOOP:32: B:40:0x0106->B:54:0x018b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:76:0x0226  */
    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:84:0x024e A[LOOP:37: B:82:0x0248->B:84:0x024e, LOOP_END] */
    /* JADX INFO: renamed from: b */
    public final boolean m19524b(boolean z, List list, Map map, Map map2, List list2) throws Exception {
        Iterator it;
        Iterator it2;
        C1006tc c1006tc;
        C0973rx c0973rx;
        CaptureRequest.Builder builderCreateCaptureRequest;
        Iterator it3;
        boolean z2;
        long jM18851c;
        CaptureRequest captureRequestBuild;
        InterfaceC1015tl interfaceC1015tl;
        C0982sf c0982sf;
        List list3;
        Iterator it4;
        List<C1096wl> list4;
        Surface surface;
        C0973rx c0973rx2;
        Iterator it5;
        boolean z3;
        int i;
        Surface surface2;
        boolean z4;
        boolean z5;
        boolean z6;
        int iMo19389b;
        boolean z7;
        list.getClass();
        Boolean bool = false;
        if (this.f47923d.m18842a()) {
            Log.w("CXCP", "Rejecting requests " + list + HEePJw.hUBAEWXFWqQQR);
            return false;
        }
        C1007td c1007td = this.f47921b;
        AmbientMode.AmbientController ambientController = this.f47924e;
        ambientController.getClass();
        ArrayMap arrayMap = new ArrayMap(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        InterfaceC1015tl interfaceC1015tl2 = c1007td.f47657a;
        if (list.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        if (!(interfaceC1015tl2 instanceof C0982sf)) {
            if (!list.isEmpty()) {
                throw new IllegalStateException("build(...) should never be called with an empty request list!");
            }
            it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    it2 = list.iterator();
                    while (it2.hasNext()) {
                        c0973rx = (C0973rx) it2.next();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Building CaptureRequest for ");
                        sb.append(c0973rx);
                        builderCreateCaptureRequest = ((C0983sg) c1007td.f47657a.mo19392f()).f47577b.createCaptureRequest(1);
                        builderCreateCaptureRequest.getClass();
                        it3 = c0973rx.f47566a.iterator();
                        z2 = false;
                        while (it3.hasNext()) {
                            surface = (Surface) arrayMap3.get(C0979sc.m19386a(((C0979sc) it3.next()).f47572a));
                            if (surface != null) {
                                builderCreateCaptureRequest.addTarget(surface);
                                z2 = true;
                            }
                        }
                        if (z2) {
                            throw new IllegalStateException("Check failed.");
                        }
                        C0736jc.m12886d(builderCreateCaptureRequest, map);
                        C0736jc.m12886d(builderCreateCaptureRequest, c0973rx.f47567b);
                        C0736jc.m12886d(builderCreateCaptureRequest, map2);
                        jM18851c = C1008te.f47664c.m18851c();
                        it2 = it2;
                        builderCreateCaptureRequest.setTag(C0974ry.m19383a(jM18851c));
                        captureRequestBuild = builderCreateCaptureRequest.build();
                        captureRequestBuild.getClass();
                        interfaceC1015tl = c1007td.f47657a;
                        arrayMap3 = arrayMap3;
                        if (interfaceC1015tl instanceof C0982sf) {
                            c0982sf = (C0982sf) interfaceC1015tl;
                            List<CaptureRequest> listCreateHighSpeedRequestList = c0982sf.f47575b.createHighSpeedRequestList(captureRequestBuild);
                            listCreateHighSpeedRequestList.getClass();
                            list3 = c0973rx.f47566a;
                            if (!list3.isEmpty()) {
                                it4 = list3.iterator();
                                while (it4.hasNext()) {
                                    int i2 = ((C0979sc) it4.next()).f47572a;
                                    list4 = ((C1097wm) c1007td.f47659c).f47942d;
                                    if (!list4.isEmpty()) {
                                        while (r6.hasNext()) {
                                        }
                                    }
                                }
                            }
                            arrayList2.add(listCreateHighSpeedRequestList.get(0));
                            listCreateHighSpeedRequestList.get(0);
                            C1013tj c1013tj = new C1013tj(c0973rx, 0);
                            arrayMap.put(C0974ry.m19383a(jM18851c), c1013tj);
                            arrayList.add(c1013tj);
                        } else {
                            arrayList2.add(captureRequestBuild);
                            C1013tj c1013tj2 = new C1013tj(c0973rx, 0);
                            arrayMap.put(C0974ry.m19383a(jM18851c), c1013tj2);
                            arrayList.add(c1013tj2);
                        }
                    }
                    c1006tc = new C1006tc(z, arrayList2, arrayList, list2, ambientController, arrayMap, arrayMap2, null, null);
                    break;
                }
                c0973rx2 = (C0973rx) it.next();
                it5 = c0973rx2.f47566a.iterator();
                z3 = false;
                while (it5.hasNext()) {
                    i = ((C0979sc) it5.next()).f47572a;
                    if (arrayMap3.containsKey(C0979sc.m19386a(i))) {
                        z3 = true;
                    } else {
                        surface2 = (Surface) c1007td.f47658b.get(C0979sc.m19386a(i));
                        if (surface2 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("  Binding ");
                            sb2.append((Object) C0979sc.m19387b(i));
                            sb2.append(" to ");
                            sb2.append(surface2);
                            arrayMap2.put(surface2, C0979sc.m19386a(i));
                            arrayMap3.put(C0979sc.m19386a(i), surface2);
                            z3 = true;
                        }
                    }
                }
                if (!z3) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(JrxsYuVZZqnFC.BRXlWAqF);
                    sb3.append(c0973rx2);
                    sb3.append('!');
                    c1006tc = null;
                    break;
                }
            }
        } else {
            Iterator it6 = list.iterator();
            if (it6.hasNext()) {
                C0973rx c0973rx3 = (C0973rx) it6.next();
                List list5 = c0973rx3.f47566a;
                if (!list5.isEmpty()) {
                    Iterator it7 = list5.iterator();
                    while (it7.hasNext()) {
                        int i3 = ((C0979sc) it7.next()).f47572a;
                        List<C1096wl> list6 = ((C1097wm) c1007td.f47659c).f47942d;
                        if (!list6.isEmpty()) {
                            for (C1096wl c1096wl : list6) {
                            }
                        }
                    }
                }
                List list7 = c0973rx3.f47566a;
                if (!list7.isEmpty()) {
                    Iterator it8 = list7.iterator();
                    while (it8.hasNext()) {
                        int i4 = ((C0979sc) it8.next()).f47572a;
                        List<C1096wl> list8 = ((C1097wm) c1007td.f47659c).f47942d;
                        if (!list8.isEmpty()) {
                            for (C1096wl c1096wl2 : list8) {
                            }
                        }
                    }
                }
                bool.booleanValue();
                bool.booleanValue();
                Log.e("CXCP", "Preview and/or Video stream use cases must be present for high speed sessions.");
                c1006tc = null;
            } else {
                if (!list.isEmpty()) {
                    throw new IllegalStateException("build(...) should never be called with an empty request list!");
                }
                it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        it2 = list.iterator();
                        while (it2.hasNext()) {
                            c0973rx = (C0973rx) it2.next();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Building CaptureRequest for ");
                            sb4.append(c0973rx);
                            try {
                                try {
                                    builderCreateCaptureRequest = ((C0983sg) c1007td.f47657a.mo19392f()).f47577b.createCaptureRequest(1);
                                    builderCreateCaptureRequest.getClass();
                                    it3 = c0973rx.f47566a.iterator();
                                    z2 = false;
                                    while (it3.hasNext()) {
                                        surface = (Surface) arrayMap3.get(C0979sc.m19386a(((C0979sc) it3.next()).f47572a));
                                        if (surface != null) {
                                            builderCreateCaptureRequest.addTarget(surface);
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                    C0736jc.m12886d(builderCreateCaptureRequest, map);
                                    C0736jc.m12886d(builderCreateCaptureRequest, c0973rx.f47567b);
                                    C0736jc.m12886d(builderCreateCaptureRequest, map2);
                                    jM18851c = C1008te.f47664c.m18851c();
                                    it2 = it2;
                                    builderCreateCaptureRequest.setTag(C0974ry.m19383a(jM18851c));
                                    captureRequestBuild = builderCreateCaptureRequest.build();
                                    captureRequestBuild.getClass();
                                    interfaceC1015tl = c1007td.f47657a;
                                    arrayMap3 = arrayMap3;
                                    if (interfaceC1015tl instanceof C0982sf) {
                                        c0982sf = (C0982sf) interfaceC1015tl;
                                        try {
                                            List<CaptureRequest> listCreateHighSpeedRequestList2 = c0982sf.f47575b.createHighSpeedRequestList(captureRequestBuild);
                                            listCreateHighSpeedRequestList2.getClass();
                                            list3 = c0973rx.f47566a;
                                            if (!list3.isEmpty()) {
                                                it4 = list3.iterator();
                                                while (it4.hasNext()) {
                                                    int i5 = ((C0979sc) it4.next()).f47572a;
                                                    list4 = ((C1097wm) c1007td.f47659c).f47942d;
                                                    if (!list4.isEmpty()) {
                                                        for (C1096wl c1096wl3 : list4) {
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList2.add(listCreateHighSpeedRequestList2.get(0));
                                            listCreateHighSpeedRequestList2.get(0);
                                            C1013tj c1013tj3 = new C1013tj(c0973rx, 0);
                                            arrayMap.put(C0974ry.m19383a(jM18851c), c1013tj3);
                                            arrayList.add(c1013tj3);
                                        } catch (IllegalArgumentException e) {
                                            Log.w("CXCP", VCYBIzY.UmSBgWj + c0982sf.f47573a + " because the output surface was destroyed before calling createHighSpeedRequestList.");
                                            throw new C1032ub(e);
                                        } catch (IllegalStateException e2) {
                                            Log.w("CXCP", "Failed to createHighSpeedRequestList. " + c0982sf.f47573a + " may be closed.");
                                            throw new C1032ub(e2);
                                        }
                                    } else {
                                        arrayList2.add(captureRequestBuild);
                                        C1013tj c1013tj4 = new C1013tj(c0973rx, 0);
                                        arrayMap.put(C0974ry.m19383a(jM18851c), c1013tj4);
                                        arrayList.add(c1013tj4);
                                    }
                                } catch (Exception e3) {
                                    if (!(e3 instanceof IllegalArgumentException) && !(e3 instanceof IllegalStateException) && !(e3 instanceof CameraAccessException) && !(e3 instanceof SecurityException) && !(e3 instanceof UnsupportedOperationException)) {
                                        throw e3;
                                    }
                                    e3.getClass().getSimpleName();
                                    throw new C1032ub(e3);
                                }
                            } catch (C1032ub e4) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("  Failed to create a CaptureRequest.Builder from ");
                                sb5.append((Object) "RequestTemplate(value=1)");
                                sb5.append('!');
                                c1006tc = null;
                                break;
                            }
                        }
                        c1006tc = new C1006tc(z, arrayList2, arrayList, list2, ambientController, arrayMap, arrayMap2, null, null);
                        break;
                    }
                    c0973rx2 = (C0973rx) it.next();
                    it5 = c0973rx2.f47566a.iterator();
                    z3 = false;
                    while (it5.hasNext()) {
                        i = ((C0979sc) it5.next()).f47572a;
                        if (arrayMap3.containsKey(C0979sc.m19386a(i))) {
                            z3 = true;
                        } else {
                            surface2 = (Surface) c1007td.f47658b.get(C0979sc.m19386a(i));
                            if (surface2 != null) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append("  Binding ");
                                sb6.append((Object) C0979sc.m19387b(i));
                                sb6.append(" to ");
                                sb6.append(surface2);
                                arrayMap2.put(surface2, C0979sc.m19386a(i));
                                arrayMap3.put(C0979sc.m19386a(i), surface2);
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(JrxsYuVZZqnFC.BRXlWAqF);
                        sb7.append(c0973rx2);
                        sb7.append('!');
                        c1006tc = null;
                        break;
                    }
                }
            }
        }
        if (c1006tc == null) {
            Log.w("CXCP", "Rejecting requests " + list + ": Could not create the capture sequence.");
            return false;
        }
        if (this.f47923d.m18842a()) {
            Log.w("CXCP", "Rejecting requests " + list + ": Request processor is closed.");
            return false;
        }
        if (c1006tc.f47649b.size() != c1006tc.f47650c.size()) {
            throw new IllegalStateException("CaptureSequence (" + c1006tc + ") has mismatched request and metadata lists!");
        }
        if (!c1006tc.f47648a) {
            synchronized (this.f47920a) {
                this.f47920a.add(c1006tc);
            }
        }
        try {
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Submitting ");
            sb8.append(c1006tc);
            int size = c1006tc.f47650c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C1013tj c1013tj5 = (C1013tj) c1006tc.f47650c.get(i6);
                int size2 = c1006tc.f47651d.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    ((InterfaceC0972rw) c1006tc.f47651d.get(i7)).mo14441c(c1013tj5);
                }
            }
            int size3 = c1006tc.f47650c.size();
            for (int i8 = 0; i8 < size3; i8++) {
                C1013tj c1013tj6 = (C1013tj) c1006tc.f47650c.get(i8);
                int size4 = ((C0973rx) c1013tj6.f47674a).f47568c.size();
                for (int i9 = 0; i9 < size4; i9++) {
                    ((InterfaceC0972rw) ((C0973rx) c1013tj6.f47674a).f47568c.get(i9)).mo14441c(c1013tj6);
                }
            }
            synchronized (c1006tc) {
                if (this.f47923d.m18842a()) {
                    Log.w("CXCP", "Did not submit " + c1006tc + ", " + this + " was closed!");
                    if (c1006tc.f47648a) {
                        return false;
                    }
                    synchronized (this.f47920a) {
                        this.f47920a.remove(c1006tc);
                    }
                    int size5 = c1006tc.f47650c.size();
                    for (int i10 = 0; i10 < size5; i10++) {
                        C1013tj c1013tj7 = (C1013tj) c1006tc.f47650c.get(i10);
                        int size6 = c1006tc.f47651d.size();
                        for (int i11 = 0; i11 < size6; i11++) {
                            ((InterfaceC0972rw) c1006tc.f47651d.get(i11)).mo14439a((C0973rx) c1013tj7.f47674a);
                        }
                    }
                    int size7 = c1006tc.f47650c.size();
                    for (int i12 = 0; i12 < size7; i12++) {
                        C1013tj c1013tj8 = (C1013tj) c1006tc.f47650c.get(i12);
                        int size8 = ((C0973rx) c1013tj8.f47674a).f47568c.size();
                        for (int i13 = 0; i13 < size8; i13++) {
                            ((InterfaceC0972rw) ((C0973rx) c1013tj8.f47674a).f47568c.get(i13)).mo14439a((C0973rx) c1013tj8.f47674a);
                        }
                    }
                    return false;
                }
                C1007td c1007td2 = this.f47921b;
                boolean z8 = true;
                if (c1006tc.f47649b.size() == 1) {
                    InterfaceC1015tl interfaceC1015tl3 = c1007td2.f47657a;
                    if (!(interfaceC1015tl3 instanceof C0982sf)) {
                        iMo19389b = c1006tc.f47648a ? interfaceC1015tl3.mo19391d((CaptureRequest) c1006tc.f47649b.get(0), c1006tc, c1007td2.f47660d.m6622b()) : interfaceC1015tl3.mo19388a((CaptureRequest) c1006tc.f47649b.get(0), c1006tc, c1007td2.f47660d.m6622b());
                    } else if (c1006tc.f47648a) {
                        iMo19389b = c1007td2.f47657a.mo19390c(c1006tc.f47649b, c1006tc, c1007td2.f47660d.m6622b());
                    } else {
                        iMo19389b = c1007td2.f47657a.mo19389b(c1006tc.f47649b, c1006tc, c1007td2.f47660d.m6622b());
                    }
                } else if (c1006tc.f47648a) {
                    iMo19389b = c1007td2.f47657a.mo19390c(c1006tc.f47649b, c1006tc, c1007td2.f47660d.m6622b());
                } else {
                    iMo19389b = c1007td2.f47657a.mo19389b(c1006tc.f47649b, c1006tc, c1007td2.f47660d.m6622b());
                }
                c1006tc.f47652e = Integer.valueOf(iMo19389b);
                if (iMo19389b != -1) {
                    int size9 = c1006tc.f47650c.size();
                    for (int i14 = 0; i14 < size9; i14++) {
                        C1013tj c1013tj9 = (C1013tj) c1006tc.f47650c.get(i14);
                        int size10 = c1006tc.f47651d.size();
                        for (int i15 = 0; i15 < size10; i15++) {
                            ((InterfaceC0972rw) c1006tc.f47651d.get(i15)).mo14442d(c1013tj9);
                        }
                    }
                    int size11 = c1006tc.f47650c.size();
                    for (int i16 = 0; i16 < size11; i16++) {
                        C1013tj c1013tj10 = (C1013tj) c1006tc.f47650c.get(i16);
                        int size12 = ((C0973rx) c1013tj10.f47674a).f47568c.size();
                        for (int i17 = 0; i17 < size12; i17++) {
                            ((InterfaceC0972rw) ((C0973rx) c1013tj10.f47674a).f47568c.get(i17)).mo14442d(c1013tj10);
                        }
                    }
                    try {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("Submitted ");
                        sb9.append(c1006tc);
                        z7 = true;
                    } catch (CameraAccessException e5) {
                        z6 = true;
                        if (z6 || c1006tc.f47648a) {
                            return false;
                        }
                        synchronized (this.f47920a) {
                            this.f47920a.remove(c1006tc);
                        }
                        int size13 = c1006tc.f47650c.size();
                        for (int i18 = 0; i18 < size13; i18++) {
                            C1013tj c1013tj11 = (C1013tj) c1006tc.f47650c.get(i18);
                            int size14 = c1006tc.f47651d.size();
                            for (int i19 = 0; i19 < size14; i19++) {
                                ((InterfaceC0972rw) c1006tc.f47651d.get(i19)).mo14439a((C0973rx) c1013tj11.f47674a);
                            }
                        }
                        int size15 = c1006tc.f47650c.size();
                        for (int i20 = 0; i20 < size15; i20++) {
                            C1013tj c1013tj12 = (C1013tj) c1006tc.f47650c.get(i20);
                            int size16 = ((C0973rx) c1013tj12.f47674a).f47568c.size();
                            for (int i21 = 0; i21 < size16; i21++) {
                                ((InterfaceC0972rw) ((C0973rx) c1013tj12.f47674a).f47568c.get(i21)).mo14439a((C0973rx) c1013tj12.f47674a);
                            }
                        }
                        return false;
                    } catch (C1032ub e6) {
                        z5 = true;
                        if (z5 || c1006tc.f47648a) {
                            return false;
                        }
                        synchronized (this.f47920a) {
                            this.f47920a.remove(c1006tc);
                        }
                        int size17 = c1006tc.f47650c.size();
                        for (int i22 = 0; i22 < size17; i22++) {
                            C1013tj c1013tj13 = (C1013tj) c1006tc.f47650c.get(i22);
                            int size18 = c1006tc.f47651d.size();
                            for (int i23 = 0; i23 < size18; i23++) {
                                ((InterfaceC0972rw) c1006tc.f47651d.get(i23)).mo14439a((C0973rx) c1013tj13.f47674a);
                            }
                        }
                        int size19 = c1006tc.f47650c.size();
                        for (int i24 = 0; i24 < size19; i24++) {
                            C1013tj c1013tj14 = (C1013tj) c1006tc.f47650c.get(i24);
                            int size20 = ((C0973rx) c1013tj14.f47674a).f47568c.size();
                            for (int i25 = 0; i25 < size20; i25++) {
                                ((InterfaceC0972rw) ((C0973rx) c1013tj14.f47674a).f47568c.get(i25)).mo14439a((C0973rx) c1013tj14.f47674a);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        z4 = true;
                        if (!z4 && !c1006tc.f47648a) {
                            synchronized (this.f47920a) {
                                this.f47920a.remove(c1006tc);
                            }
                            int size21 = c1006tc.f47650c.size();
                            for (int i26 = 0; i26 < size21; i26++) {
                                C1013tj c1013tj15 = (C1013tj) c1006tc.f47650c.get(i26);
                                int size22 = c1006tc.f47651d.size();
                                for (int i27 = 0; i27 < size22; i27++) {
                                    ((InterfaceC0972rw) c1006tc.f47651d.get(i27)).mo14439a((C0973rx) c1013tj15.f47674a);
                                }
                            }
                            int size23 = c1006tc.f47650c.size();
                            for (int i28 = 0; i28 < size23; i28++) {
                                C1013tj c1013tj16 = (C1013tj) c1006tc.f47650c.get(i28);
                                int size24 = ((C0973rx) c1013tj16.f47674a).f47568c.size();
                                for (int i29 = 0; i29 < size24; i29++) {
                                    ((InterfaceC0972rw) ((C0973rx) c1013tj16.f47674a).f47568c.get(i29)).mo14439a((C0973rx) c1013tj16.f47674a);
                                }
                            }
                        }
                        throw th;
                    }
                } else {
                    Log.w("CXCP", "Did not submit " + c1006tc + ", SequenceNumber was -1");
                    z8 = false;
                    z7 = false;
                }
                if (z7 || c1006tc.f47648a) {
                    return z8;
                }
                synchronized (this.f47920a) {
                    this.f47920a.remove(c1006tc);
                }
                int size25 = c1006tc.f47650c.size();
                for (int i30 = 0; i30 < size25; i30++) {
                    C1013tj c1013tj17 = (C1013tj) c1006tc.f47650c.get(i30);
                    int size26 = c1006tc.f47651d.size();
                    for (int i31 = 0; i31 < size26; i31++) {
                        ((InterfaceC0972rw) c1006tc.f47651d.get(i31)).mo14439a((C0973rx) c1013tj17.f47674a);
                    }
                }
                int size27 = c1006tc.f47650c.size();
                for (int i32 = 0; i32 < size27; i32++) {
                    C1013tj c1013tj18 = (C1013tj) c1006tc.f47650c.get(i32);
                    int size28 = ((C0973rx) c1013tj18.f47674a).f47568c.size();
                    for (int i33 = 0; i33 < size28; i33++) {
                        ((InterfaceC0972rw) ((C0973rx) c1013tj18.f47674a).f47568c.get(i33)).mo14439a((C0973rx) c1013tj18.f47674a);
                    }
                }
                return z8;
            }
        } catch (CameraAccessException e7) {
            z6 = false;
        } catch (C1032ub e8) {
            z5 = false;
        } catch (Throwable th2) {
            th = th2;
            z4 = false;
        }
    }

    public final String toString() {
        return "GraphRequestProcessor-" + this.f47922c;
    }
}
