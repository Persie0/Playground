package p000;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kmt implements kmk {

    /* JADX INFO: renamed from: a */
    private final kmj f36563a;

    /* JADX INFO: renamed from: b */
    private final kbz f36564b;

    /* JADX INFO: renamed from: c */
    private final kbo f36565c;

    /* JADX INFO: renamed from: d */
    private final ojy f36566d;

    /* JADX INFO: renamed from: e */
    private final bkn f36567e;

    public kmt(bkn bknVar, kmj kmjVar, kbz kbzVar, kbo kboVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        kmjVar.getClass();
        kbzVar.getClass();
        this.f36567e = bknVar;
        this.f36563a = kmjVar;
        this.f36564b = kbzVar;
        kbo kboVarMo6314a = kboVar.mo6314a("VerifiedCamLstPrdr");
        kboVarMo6314a.getClass();
        this.f36565c = kboVarMo6314a;
        this.f36566d = lkm.m15593t(new C0910po(this, 13));
    }

    /* JADX INFO: renamed from: d */
    private static final Throwable m14582d(IllegalStateException illegalStateException) {
        Throwable cause = illegalStateException.getCause();
        if (cause instanceof CameraAccessException) {
            Throwable cause2 = illegalStateException.getCause();
            cause2.getClass();
            return (CameraAccessException) cause2;
        }
        if (!(cause instanceof IllegalArgumentException)) {
            return null;
        }
        Throwable cause3 = illegalStateException.getCause();
        cause3.getClass();
        return (IllegalArgumentException) cause3;
    }

    /* JADX INFO: renamed from: e */
    private final lpe m14583e() {
        return (lpe) this.f36566d.mo18586a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // p000.kmk
    /* JADX INFO: renamed from: a */
    public final List mo14578a() {
        return m14583e().f38883b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // p000.kmk
    /* JADX INFO: renamed from: b */
    public final List mo14579b() {
        return m14583e().f38884c;
    }

    /* JADX INFO: renamed from: c */
    public final lpe m14584c() {
        this.f36564b.mo13961e("verifyCameras");
        try {
            try {
                List listM19445a = ((C1009tf) this.f36567e.m2601v().f47802a).m19445a();
                if (listM19445a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load cameraIds from ");
                    sb.append((Object) "CameraBackendId(value=CXCP-Camera2)");
                    Log.w("CXCP", "Failed to load cameraIds from CameraBackendId(value=CXCP-Camera2)");
                }
                if (listM19445a == null) {
                    listM19445a = okv.f46215a;
                }
                if (listM19445a.isEmpty()) {
                    this.f36565c.mo13942d("No cameras available!");
                    throw new kmm();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = listM19445a.iterator();
                while (it.hasNext()) {
                    String str = ((C0952rc) it.next()).f47535a;
                    try {
                        Set setMo19375b = this.f36567e.m2600u(str).mo19375b();
                        Iterator it2 = setMo19375b.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((C0952rc) it2.next()).f47535a;
                            if (linkedHashSet.contains(C0952rc.m19372a(str2))) {
                                linkedHashSet.add(C0952rc.m19372a(str));
                            } else {
                                try {
                                    this.f36567e.m2600u(str2);
                                } catch (IllegalStateException e) {
                                    linkedHashMap.put(str2, lle.m15699s(str2, m14582d(e)));
                                    this.f36565c.mo13947i("Failed Physical camera Id: " + str2 + ". Failed logical camera Id: " + str);
                                    linkedHashSet.add(C0952rc.m19372a(str));
                                    linkedHashSet.addAll(setMo19375b);
                                }
                            }
                        }
                    } catch (IllegalStateException e2) {
                        linkedHashMap.put(str, lle.m15699s(str, m14582d(e2)));
                        linkedHashSet.add(C0952rc.m19372a(str));
                        this.f36565c.mo13947i("Failed logical camera Id: " + str);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    this.f36565c.mo13947i("Failed camera ids " + linkedHashMap.keySet());
                    this.f36563a.mo10419aD(omn.m18673M(linkedHashMap.values()));
                }
                List listM18674N = omn.m18674N(listM19445a);
                listM18674N.removeAll(linkedHashSet);
                if (listM18674N.isEmpty()) {
                    this.f36565c.mo13940b(rmwTRjObXLGH.RnazhZTzVh);
                    throw new kmi(omn.m18673M(linkedHashMap.values()));
                }
                ArrayList arrayList = new ArrayList(listM18674N.size());
                Iterator it3 = listM18674N.iterator();
                while (it3.hasNext()) {
                    arrayList.add(kmg.m14575b(((C0952rc) it3.next()).f47535a));
                }
                lpe lpeVar = new lpe(arrayList, omn.m18673M(linkedHashMap.values()));
                this.f36564b.mo13962f();
                return lpeVar;
            } catch (CameraAccessException e3) {
                this.f36565c.mo13940b("Failed to read the camera list.");
                throw new kml("Failed to read the camera list.", e3.getReason(), e3);
            }
        } catch (Throwable th) {
            this.f36564b.mo13962f();
            throw th;
        }
    }
}
