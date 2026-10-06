package p000;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbo {

    /* JADX INFO: renamed from: a */
    public final Object f2907a;

    /* JADX INFO: renamed from: b */
    public final Object f2908b;

    /* JADX INFO: renamed from: c */
    public final Object f2909c;

    /* JADX INFO: renamed from: d */
    public final Object f2910d;

    public bbo(bck bckVar, InterfaceC1012ti interfaceC1012ti, C0846ne c0846ne, C0954re c0954re, byte[] bArr, byte[] bArr2) {
        interfaceC1012ti.getClass();
        c0846ne.getClass();
        this.f2910d = bckVar;
        this.f2907a = interfaceC1012ti;
        this.f2908b = c0846ne;
        this.f2909c = c0954re;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m2181a(Object obj) {
        return (ArrayList) ((C1117xf) this.f2907a).get(obj);
    }

    /* JADX INFO: renamed from: b */
    public final void m2182b(Object obj) {
        if (((C1117xf) this.f2907a).containsKey(obj)) {
            return;
        }
        ((C1117xf) this.f2907a).put(obj, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m2183c(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C1117xf) this.f2907a).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m2183c(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e0 A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e6 A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f7 A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fb A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0108 A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:41:0x010c A[Catch: all -> 0x012c, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0126 A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #2 {all -> 0x012c, blocks: (B:27:0x00da, B:29:0x00e0, B:31:0x00e6, B:33:0x00ea, B:35:0x00f7, B:37:0x00fb, B:39:0x0108, B:41:0x010c, B:42:0x0125, B:43:0x0126), top: B:62:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:47:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x015c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x010c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ti] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: d */
    public final Object m2184d(String str, int i, long j, ols olsVar) {
        C1020tq c1020tq;
        int i2;
        long j2;
        String str2;
        bbo bboVar;
        C0986sj c0986sj;
        C0986sj c0986sj2;
        String str3;
        Object objM18775M;
        int iM9271b;
        C0748jo c0748jo;
        if (olsVar instanceof C1020tq) {
            c1020tq = (C1020tq) olsVar;
            int i3 = c1020tq.f47692f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1020tq.f47692f = i3 - Integer.MIN_VALUE;
            } else {
                c1020tq = new C1020tq(this, olsVar, null, null, null);
            }
        } else {
            c1020tq = new C1020tq(this, olsVar, null, null, null);
        }
        Object objMo19448b = c1020tq.f47691e;
        oma omaVar = oma.COROUTINE_SUSPENDED;
        int i4 = 2;
        int i5 = 1;
        C0947qy c0947qy = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (c1020tq.f47692f) {
            case 0:
                lkm.m15592s(objMo19448b);
                ?? r2 = this.f2907a;
                c1020tq.f47687a = this;
                c1020tq.f47688b = str;
                c1020tq.f47689c = i;
                c1020tq.f47690d = j;
                c1020tq.f47692f = 1;
                objMo19448b = r2.mo19448b(str, c1020tq);
                if (objMo19448b == omaVar) {
                    return omaVar;
                }
                i2 = i;
                j2 = j;
                str2 = str;
                bboVar = this;
                Object obj = bboVar.f2908b;
                Object obj2 = bboVar.f2909c;
                c0986sj = new C0986sj(str2, (InterfaceC0953rd) objMo19448b, i2, j2);
                try {
                    Object obj3 = bboVar.f2910d;
                    str2.getClass();
                    CameraManager cameraManager = (CameraManager) ((bck) obj3).f2948a.get();
                    try {
                        Trace.beginSection("CameraDevice-" + str2 + "#openCamera");
                        cameraManager.getClass();
                        C0996st.m19435h(cameraManager, str2, ((drj) ((bck) obj3).f2949b).m6623c(), c0986sj);
                        Trace.endSection();
                        ovm ovmVar = c0986sj.f47586b;
                        C1021tr c1021tr = new C1021tr(null);
                        c1020tq.f47687a = str2;
                        c1020tq.f47688b = c0986sj;
                        c1020tq.f47692f = 2;
                        objM18775M = ook.m18775M(ovmVar, c1021tr, c1020tq);
                        if (objM18775M != omaVar) {
                            return omaVar;
                        }
                        c0986sj2 = c0986sj;
                        str3 = str2;
                        objMo19448b = objM18775M;
                        try {
                            c0748jo = (C0748jo) objMo19448b;
                            if (c0748jo instanceof C1019tp) {
                                return new C1033uc(c0986sj2, c0947qy, i4);
                            }
                            if (c0748jo instanceof C1018to) {
                                c0986sj2.m19397a();
                                return new C1033uc(objArr3 == true ? 1 : 0, ((C1018to) c0748jo).f47685a, i5);
                            }
                            if (c0748jo instanceof C1017tn) {
                                c0986sj2.m19397a();
                                return new C1033uc(objArr2 == true ? 1 : 0, ((C1017tn) c0748jo).f47676a, i5);
                            }
                            if (!(c0748jo instanceof C1022ts)) {
                                throw new ojz();
                            }
                            c0986sj2.m19397a();
                            throw new IllegalStateException("Unexpected CameraState: " + c0748jo);
                        } catch (Throwable th) {
                            th = th;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Failed to open ");
                            String strM19373b = C0952rc.m19373b(str3);
                            sb.append((Object) strM19373b);
                            Log.w("CXCP", "Failed to open ".concat(strM19373b), th);
                            iM9271b = C0211gi.m9271b(th);
                            if (!C0947qy.m19365b(iM9271b, 0)) {
                                c0986sj2.m19398b(null, new C0984sh(6, C0947qy.m19364a(iM9271b), th, i4));
                            }
                            return new C1033uc(objArr == true ? 1 : 0, C0947qy.m19364a(C0211gi.m9271b(th)), i5);
                        }
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c0986sj2 = c0986sj;
                    str3 = str2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to open ");
                    String strM19373b2 = C0952rc.m19373b(str3);
                    sb2.append((Object) strM19373b2);
                    Log.w("CXCP", "Failed to open ".concat(strM19373b2), th);
                    iM9271b = C0211gi.m9271b(th);
                    if (!C0947qy.m19365b(iM9271b, 0)) {
                        c0986sj2.m19398b(null, new C0984sh(6, C0947qy.m19364a(iM9271b), th, i4));
                    }
                    return new C1033uc(objArr == true ? 1 : 0, C0947qy.m19364a(C0211gi.m9271b(th)), i5);
                }
            case 1:
                long j3 = c1020tq.f47690d;
                int i6 = c1020tq.f47689c;
                str2 = (String) c1020tq.f47688b;
                bbo bboVar2 = (bbo) c1020tq.f47687a;
                lkm.m15592s(objMo19448b);
                i2 = i6;
                j2 = j3;
                bboVar = bboVar2;
                Object obj4 = bboVar.f2908b;
                Object obj5 = bboVar.f2909c;
                c0986sj = new C0986sj(str2, (InterfaceC0953rd) objMo19448b, i2, j2);
                Object obj6 = bboVar.f2910d;
                str2.getClass();
                CameraManager cameraManager2 = (CameraManager) ((bck) obj6).f2948a.get();
                Trace.beginSection("CameraDevice-" + str2 + "#openCamera");
                cameraManager2.getClass();
                C0996st.m19435h(cameraManager2, str2, ((drj) ((bck) obj6).f2949b).m6623c(), c0986sj);
                Trace.endSection();
                ovm ovmVar2 = c0986sj.f47586b;
                C1021tr c1021tr2 = new C1021tr(null);
                c1020tq.f47687a = str2;
                c1020tq.f47688b = c0986sj;
                c1020tq.f47692f = 2;
                objM18775M = ook.m18775M(ovmVar2, c1021tr2, c1020tq);
                if (objM18775M != omaVar) {
                    return omaVar;
                }
                c0986sj2 = c0986sj;
                str3 = str2;
                objMo19448b = objM18775M;
                c0748jo = (C0748jo) objMo19448b;
                if (c0748jo instanceof C1019tp) {
                    return new C1033uc(c0986sj2, c0947qy, i4);
                }
                if (c0748jo instanceof C1018to) {
                    c0986sj2.m19397a();
                    return new C1033uc(objArr3 == true ? 1 : 0, ((C1018to) c0748jo).f47685a, i5);
                }
                if (c0748jo instanceof C1017tn) {
                    c0986sj2.m19397a();
                    return new C1033uc(objArr2 == true ? 1 : 0, ((C1017tn) c0748jo).f47676a, i5);
                }
                if (!(c0748jo instanceof C1022ts)) {
                    throw new ojz();
                }
                c0986sj2.m19397a();
                throw new IllegalStateException("Unexpected CameraState: " + c0748jo);
            case 2:
                c0986sj2 = (C0986sj) c1020tq.f47688b;
                str3 = (String) c1020tq.f47687a;
                try {
                    lkm.m15592s(objMo19448b);
                    c0748jo = (C0748jo) objMo19448b;
                    if (c0748jo instanceof C1019tp) {
                        return new C1033uc(c0986sj2, c0947qy, i4);
                    }
                    if (c0748jo instanceof C1018to) {
                        c0986sj2.m19397a();
                        return new C1033uc(objArr3 == true ? 1 : 0, ((C1018to) c0748jo).f47685a, i5);
                    }
                    if (c0748jo instanceof C1017tn) {
                        c0986sj2.m19397a();
                        return new C1033uc(objArr2 == true ? 1 : 0, ((C1017tn) c0748jo).f47676a, i5);
                    }
                    if (!(c0748jo instanceof C1022ts)) {
                        throw new ojz();
                    }
                    c0986sj2.m19397a();
                    throw new IllegalStateException("Unexpected CameraState: " + c0748jo);
                } catch (Throwable th4) {
                    th = th4;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Failed to open ");
                    String strM19373b3 = C0952rc.m19373b(str3);
                    sb3.append((Object) strM19373b3);
                    Log.w("CXCP", "Failed to open ".concat(strM19373b3), th);
                    iM9271b = C0211gi.m9271b(th);
                    if (!C0947qy.m19365b(iM9271b, 0)) {
                        c0986sj2.m19398b(null, new C0984sh(6, C0947qy.m19364a(iM9271b), th, i4));
                    }
                    return new C1033uc(objArr == true ? 1 : 0, C0947qy.m19364a(C0211gi.m9271b(th)), i5);
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: e */
    public final C1058va m2185e() {
        synchronized (this.f2910d) {
            C1058va c1058va = (C1058va) this.f2907a.get(C0945qw.m19360a());
            if (c1058va != null) {
                return c1058va;
            }
            AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) this.f2908b.get(C0945qw.m19360a());
            Object obj = ambientController != null ? ambientController.f1697a : null;
            if (obj != null) {
                if (!ooc.m18737c("CXCP-Camera2", "CXCP-Camera2")) {
                    throw new IllegalStateException("Unexpected backend id! Expected " + ((Object) "CameraBackendId(value=CXCP-Camera2)") + " but it was actually " + ((Object) "CameraBackendId(value=CXCP-Camera2)"));
                }
                this.f2907a.put(C0945qw.m19360a(), obj);
            }
            return (C1058va) obj;
        }
    }

    public bbo(Map map) {
        this.f2908b = map;
        this.f2910d = new Object();
        this.f2907a = new LinkedHashMap();
        C1058va c1058vaM2185e = m2185e();
        if (c1058vaM2185e != null) {
            this.f2909c = c1058vaM2185e;
            return;
        }
        throw new IllegalStateException("Failed to load the default backend for " + ((Object) "CameraBackendId(value=CXCP-Camera2)") + "! Available backends are " + map.keySet());
    }

    public bbo(byte[] bArr) {
        this.f2908b = new aee(10);
        this.f2907a = new C1117xf();
        this.f2909c = new ArrayList();
        this.f2910d = new HashSet();
    }

    public bbo(app appVar, int[] iArr, String[] strArr) {
        strArr.getClass();
        this.f2907a = appVar;
        this.f2909c = iArr;
        this.f2910d = strArr;
        String[] strArr2 = strArr;
        this.f2908b = strArr2.length == 0 ? okx.f46217a : omn.m18718w(strArr2[0]);
        if (iArr.length != strArr.length) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public bbo() {
        this.f2909c = new C1109wy();
        this.f2908b = new SparseArray();
        this.f2910d = new C1114xc();
        this.f2907a = new C1109wy();
    }

    public bbo(Context context, C1058va c1058va, byte[] bArr) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        bba bbaVar = new bba(applicationContext, c1058va, null);
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        bbc bbcVar = new bbc(applicationContext2, c1058va, null);
        Context applicationContext3 = context.getApplicationContext();
        applicationContext3.getClass();
        bbk bbkVar = new bbk(applicationContext3, c1058va, null);
        Context applicationContext4 = context.getApplicationContext();
        applicationContext4.getClass();
        bbm bbmVar = new bbm(applicationContext4, c1058va, null);
        this.f2907a = bbaVar;
        this.f2908b = bbcVar;
        this.f2909c = bbkVar;
        this.f2910d = bbmVar;
    }
}
