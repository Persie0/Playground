package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Trace;
import android.view.Surface;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: vt */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1077vt implements InterfaceC0951rb {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1083vz f47873a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1082vy f47874b;

    /* JADX INFO: renamed from: c */
    private final C1097wm f47875c;

    /* JADX INFO: renamed from: d */
    private final C1099wo f47876d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC0946qx f47877e;

    /* JADX INFO: renamed from: f */
    private final int f47878f;

    /* JADX INFO: renamed from: g */
    private final C1072vo f47879g;

    /* JADX INFO: renamed from: h */
    private final C1081vx f47880h;

    public C1077vt(C0948qz c0948qz, InterfaceC0953rd interfaceC0953rd, InterfaceC1083vz interfaceC1083vz, InterfaceC1082vy interfaceC1082vy, C1097wm c1097wm, C1099wo c1099wo, InterfaceC0946qx interfaceC0946qx, C0861nt c0861nt, C1093wi c1093wi, byte[] bArr) {
        String strM19387b;
        String strConcat;
        interfaceC0953rd.getClass();
        interfaceC1083vz.getClass();
        interfaceC1082vy.getClass();
        c1097wm.getClass();
        c1099wo.getClass();
        interfaceC0946qx.getClass();
        c0861nt.getClass();
        c1093wi.getClass();
        this.f47873a = interfaceC1083vz;
        this.f47874b = interfaceC1082vy;
        this.f47875c = c1097wm;
        this.f47876d = c1099wo;
        this.f47877e = interfaceC0946qx;
        this.f47878f = C1078vu.f47881a.m18846b();
        this.f47879g = new C1072vo();
        this.f47880h = new C1081vx();
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Integer num = (Integer) interfaceC0953rd.mo19374a(key);
        String str = (num != null && num.intValue() == 0) ? EArqVBjecl.ZeBzlB : (num != null && num.intValue() == 1) ? "Back" : (num != null && num.intValue() == 2) ? "External" : "Unknown";
        CameraCharacteristics.Key key2 = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key2.getClass();
        int[] iArr = (int[]) interfaceC0953rd.mo19374a(key2);
        String str2 = (iArr == null || !omn.m18690ad(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb = new StringBuilder();
        sb.append(this + " (Camera " + c0948qz.f47514a + ")\n");
        sb.append("  Facing:    " + str + " (" + str2 + ")\n");
        sb.append("  Mode:      Normal\nOutputs:\n");
        Iterator it = c1097wm.f47941c.iterator();
        while (it.hasNext()) {
            int i = 0;
            for (Object obj : ((C0959rj) it.next()).f47554b) {
                int i2 = i + 1;
                if (i < 0) {
                    omn.m18670J();
                }
                C1096wl c1096wl = (C1096wl) obj;
                sb.append("  ");
                if (i == 0) {
                    C0959rj c0959rj = c1096wl.f47938e;
                    if (c0959rj == null) {
                        ooc.m18736b("stream");
                        c0959rj = null;
                    }
                    strM19387b = C0979sc.m19387b(c0959rj.f47553a);
                } else {
                    strM19387b = "";
                }
                sb.append(ook.m18810x(strM19387b, 10));
                sb.append(ook.m18810x(C0968rs.m19382a(c1096wl.f47934a), 10));
                String string = c1096wl.f47935b.toString();
                string.getClass();
                sb.append(ook.m18810x(string, 12));
                int i3 = c1096wl.f47936c;
                if (C0977sa.m19385a(i3, 0)) {
                    strConcat = "UNKNOWN";
                } else if (C0977sa.m19385a(i3, 34)) {
                    strConcat = "PRIVATE";
                } else if (C0977sa.m19385a(i3, 1144402265)) {
                    strConcat = "DEPTH16";
                } else if (C0977sa.m19385a(i3, 1768253795)) {
                    strConcat = "DEPTH_JPEG";
                } else if (C0977sa.m19385a(i3, 257)) {
                    strConcat = "DEPTH_POINT_CLOUD";
                } else if (C0977sa.m19385a(i3, 41)) {
                    strConcat = "FLEX_RGB_888";
                } else if (C0977sa.m19385a(i3, 42)) {
                    strConcat = "FLEX_RGBA_8888";
                } else if (C0977sa.m19385a(i3, 1212500294)) {
                    strConcat = "HEIC";
                } else if (C0977sa.m19385a(i3, 256)) {
                    strConcat = "JPEG";
                } else if (C0977sa.m19385a(i3, 16)) {
                    strConcat = "NV16";
                } else if (C0977sa.m19385a(i3, 17)) {
                    strConcat = "NV21";
                } else if (C0977sa.m19385a(i3, 37)) {
                    strConcat = "RAW10";
                } else if (C0977sa.m19385a(i3, 38)) {
                    strConcat = "RAW12";
                } else if (C0977sa.m19385a(i3, 4098)) {
                    strConcat = "RAW_DEPTH";
                } else if (C0977sa.m19385a(i3, 36)) {
                    strConcat = "RAW_PRIVATE";
                } else if (C0977sa.m19385a(i3, 32)) {
                    strConcat = "RAW_SENSOR";
                } else if (C0977sa.m19385a(i3, 4)) {
                    strConcat = "RGB_565";
                } else if (C0977sa.m19385a(i3, 842094169)) {
                    strConcat = VzWFSVj.KoSnKKHtUxWnQKe;
                } else if (C0977sa.m19385a(i3, 540422489)) {
                    strConcat = "Y16";
                } else if (C0977sa.m19385a(i3, 538982489)) {
                    strConcat = "Y8";
                } else if (C0977sa.m19385a(i3, 35)) {
                    strConcat = "YUV_420_888";
                } else if (C0977sa.m19385a(i3, 39)) {
                    strConcat = "YUV_422_888";
                } else if (C0977sa.m19385a(i3, 40)) {
                    strConcat = "YUV_444_888";
                } else if (C0977sa.m19385a(i3, 20)) {
                    strConcat = TVkaNXnfP.lwNChloHMDz;
                } else if (C0977sa.m19385a(i3, 842094169)) {
                    strConcat = "YV12";
                } else {
                    ooc.m18741g(16);
                    String string2 = Integer.toString(i3, 16);
                    string2.getClass();
                    strConcat = "UNKNOWN-".concat(string2);
                }
                sb.append(ook.m18810x(strConcat, 16));
                if (!ooc.m18737c(c1096wl.f47937d, c0948qz.f47514a)) {
                    sb.append(" [");
                    sb.append(C0952rc.m19372a(c1096wl.f47937d));
                    sb.append("]");
                }
                sb.append("\n");
                i = i2;
            }
        }
        sb.append("Session Template: TEMPLATE_PREVIEW\n");
        C0797lj.m15510b(sb, "Session Parameters");
        sb.append("Default Template: TEMPLATE_PREVIEW\n");
        C0797lj.m15510b(sb, rmwTRjObXLGH.YiqPZ);
        C0797lj.m15510b(sb, "Required Parameters");
    }

    @Override // p000.InterfaceC0951rb
    /* JADX INFO: renamed from: a */
    public final InterfaceC0978sb mo19368a() {
        return this.f47875c;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:15:0x0060, B:17:0x0064, B:19:0x006c, B:21:0x0078, B:24:0x0087, B:33:0x00b1, B:34:0x00b3), top: B:38:0x0060 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.InterfaceC0951rb
    /* JADX INFO: renamed from: b */
    public final Object mo19369b(ols olsVar) {
        C1076vs c1076vs;
        C1077vt c1077vt;
        if (olsVar instanceof C1076vs) {
            c1076vs = (C1076vs) olsVar;
            int i = c1076vs.f47871c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1076vs.f47871c = i - Integer.MIN_VALUE;
            } else {
                c1076vs = new C1076vs(this, olsVar);
            }
        } else {
            c1076vs = new C1076vs(this, olsVar);
        }
        Object objM18887m = c1076vs.f47869a;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        switch (c1076vs.f47871c) {
            case 0:
                lkm.m15592s(objM18887m);
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                sb.append("#acquireSession");
                Trace.beginSection(toString().concat("#acquireSession"));
                C1072vo c1072vo = this.f47879g;
                c1076vs.f47872d = this;
                c1076vs.f47871c = 1;
                opy opyVar = new opy(omn.m18701f(c1076vs), 1);
                opyVar.m18898x();
                synchronized (c1072vo.f47857b) {
                    if (c1072vo.f47858c) {
                        throw C1072vo.f47856a;
                    }
                    if (c1072vo.f47857b.isEmpty()) {
                        long jMin = Math.min(c1072vo.f47859d, 1L);
                        if (jMin >= 1) {
                            c1072vo.f47859d -= jMin;
                            opyVar.mo18640e(new C1070vm(c1072vo, jMin));
                        } else {
                            c1072vo.f47857b.add(new C1071vn(opyVar));
                            opyVar.mo18870a(new avu(c1072vo, 1));
                        }
                    } else {
                        c1072vo.f47857b.add(new C1071vn(opyVar));
                        opyVar.mo18870a(new avu(c1072vo, 1));
                    }
                }
                objM18887m = opyVar.m18887m();
                if (objM18887m == omaVar) {
                    return omaVar;
                }
                c1077vt = this;
                break;
            case 1:
                c1077vt = c1076vs.f47872d;
                lkm.m15592s(objM18887m);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC1083vz interfaceC1083vz = c1077vt.f47873a;
        C1081vx c1081vx = c1077vt.f47880h;
        C1079vv c1079vv = new C1079vv((C1070vm) objM18887m, interfaceC1083vz);
        Trace.endSection();
        return c1079vv;
    }

    @Override // p000.InterfaceC0951rb
    /* JADX INFO: renamed from: c */
    public final void mo19370c(int i, Surface surface) throws Exception {
        AutoCloseable autoCloseable;
        Map linkedHashMap;
        StringBuilder sb = new StringBuilder();
        String strM19387b = C0979sc.m19387b(i);
        sb.append((Object) strM19387b);
        sb.append("#setSurface");
        Trace.beginSection(strM19387b.concat("#setSurface"));
        if (surface != null && !surface.isValid()) {
            throw new IllegalStateException("Failed to set " + surface + " to " + ((Object) C0979sc.m19387b(i)) + ": The surface was not valid.");
        }
        C1099wo c1099wo = this.f47876d;
        synchronized (c1099wo.f47948c) {
            try {
                if (surface != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Configured ");
                    sb2.append((Object) C0979sc.m19387b(i));
                    sb2.append(" to use ");
                    sb2.append(surface);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Removed surface for ");
                    sb3.append((Object) C0979sc.m19387b(i));
                }
                autoCloseable = null;
                if (surface == null) {
                    Surface surface2 = (Surface) c1099wo.f47949d.remove(C0979sc.m19386a(i));
                    if (surface2 != null) {
                        autoCloseable = (AutoCloseable) c1099wo.f47950e.remove(surface2);
                    }
                } else {
                    Surface surface3 = (Surface) c1099wo.f47949d.get(C0979sc.m19386a(i));
                    c1099wo.f47949d.put(C0979sc.m19386a(i), surface);
                    if (!ooc.m18737c(surface3, surface)) {
                        if (c1099wo.f47950e.containsKey(surface)) {
                            throw new IllegalStateException("Surface (" + surface + ") is already in use!");
                        }
                        autoCloseable = (AutoCloseable) c1099wo.f47950e.remove(surface3);
                        c1099wo.f47950e.put(surface, c1099wo.f47951f.m19474b(surface));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (c1099wo.f47948c) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = c1099wo.f47946a.f47940b.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    break;
                }
                for (C0959rj c0959rj : ((C1095wk) it.next()).f47931e) {
                    Surface surface4 = (Surface) c1099wo.f47949d.get(C0979sc.m19386a(c0959rj.f47553a));
                    if (surface4 == null) {
                        linkedHashMap = okw.f46216a;
                        break loop0;
                    }
                    linkedHashMap.put(C0979sc.m19386a(c0959rj.f47553a), surface4);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            c1099wo.f47947b.mo19363c(linkedHashMap);
        }
        if (autoCloseable != null) {
            autoCloseable.close();
        }
        Trace.endSection();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("#close");
        Trace.beginSection(toString().concat("#close"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Closing ");
        sb2.append(this);
        this.f47879g.close();
        this.f47873a.mo19511b();
        this.f47877e.mo19361a();
        this.f47876d.m19528a();
        Trace.endSection();
    }

    @Override // p000.InterfaceC0951rb
    /* JADX INFO: renamed from: d */
    public final void mo19371d() {
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("#start");
        Trace.beginSection(toString().concat("#start"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Starting ");
        sb2.append(this);
        this.f47874b.mo19510a();
        this.f47877e.mo19362b();
        Trace.endSection();
    }

    public final String toString() {
        return "CameraGraph-" + this.f47878f;
    }
}
