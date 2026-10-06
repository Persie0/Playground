package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import androidx.wear.ambient.AmbientDelegate;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kqj {

    /* JADX INFO: renamed from: a */
    public final Object f36860a;

    /* JADX INFO: renamed from: b */
    public final Object f36861b;

    /* JADX INFO: renamed from: c */
    public final Object f36862c;

    /* JADX INFO: renamed from: d */
    public final Object f36863d;

    /* JADX INFO: renamed from: e */
    public final Object f36864e;

    /* JADX INFO: renamed from: f */
    public final Object f36865f;

    public kqj(kfk kfkVar, Map map, jwn jwnVar, jvb jvbVar, Executor executor, Map map2) {
        this.f36862c = kfkVar;
        this.f36865f = map;
        this.f36860a = jwnVar;
        this.f36861b = jvbVar;
        this.f36863d = executor;
        kmg kmgVar = (kmg) map2.get(gnf.f25701c);
        kmgVar.getClass();
        this.f36864e = kmgVar.f36540a;
    }

    /* JADX INFO: renamed from: k */
    private final msi m14697k(final long j, final int i, final mxk mxkVar) {
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        return lku.m15663q(new msi(mxkVar, j, i, bArr, bArr2) { // from class: khp

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ mxk f36073a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ long f36074b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f36075c;

            @Override // p000.msi
            /* JADX INFO: renamed from: a */
            public final Object mo6051a() {
                kqj kqjVar = this.f36076d;
                mxk mxkVar2 = this.f36073a;
                long j2 = this.f36074b;
                int i2 = this.f36075c;
                ArrayList arrayList = new ArrayList(mxkVar2.size() + 1);
                naz nazVarListIterator = mxkVar2.listIterator();
                while (nazVarListIterator.hasNext()) {
                    arrayList.add(((AmbientDelegate) ((kkq) nazVarListIterator.next()).f36402e.f36008a).m1592X());
                }
                int i3 = 2;
                if (j2 > 0) {
                    arrayList.add(jwr.m13640j(((AmbientDelegate) kqjVar.f36865f).m1592X(), new jzm(j2, i3)));
                }
                if (i2 > 0) {
                    arrayList.add(jwr.m13637g(Long.valueOf(i2)));
                }
                return jwr.m13640j(jwr.m13636f(arrayList), new ich(i2, i3));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: l */
    private final mxk m14698l(Set set) {
        if (set.isEmpty()) {
            return mzx.f41874a;
        }
        mxi mxiVarM17132D = mxk.m17132D();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kfy kfyVar = (kfy) it.next();
            if (((kqj) this.f36860a).m14700b(kfyVar.f35858a)) {
                this.f36863d.mo13944f("Ignoring blocklisted parameter: ".concat(kfyVar.f35858a.toString()));
            } else {
                mxiVarM17132D.mo17072d(kfyVar);
            }
        }
        return mxiVarM17132D.mo17127f();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: a */
    public final void m14699a(kqm kqmVar) {
        naz nazVarListIterator = kqmVar.f36889e.listIterator();
        while (nazVarListIterator.hasNext()) {
            kqe kqeVar = (kqe) nazVarListIterator.next();
            Uri uriMo14767h = kqeVar.f36838e.mo14767h();
            if (uriMo14767h != null && !mro.m16832b(uriMo14767h.getAuthority())) {
                ((ContentResolver) this.f36862c).notifyChange(uriMo14767h, null);
                this.f36865f.mo13944f(String.valueOf(kqmVar.f36885a) + " NotifyChange: " + uriMo14767h.toString());
                krl krlVar = kqeVar.f36838e;
                krd krdVarM14742a = krd.m14742a(krlVar.mo14768i().f37089e);
                if (krdVarM14742a.m14743b() || krdVarM14742a.m14744c()) {
                    String str = true != krdVarM14742a.m14743b() ? "android.hardware.action.NEW_VIDEO" : "android.hardware.action.NEW_PICTURE";
                    Uri uriMo14767h2 = krlVar.mo14767h();
                    this.f36865f.mo13944f("Broadcasting: " + str + " -> " + String.valueOf(uriMo14767h2));
                    Intent intent = new Intent(str, uriMo14767h2);
                    intent.addFlags(1073741824);
                    intent.addFlags(1);
                    ((Context) this.f36863d).sendBroadcast(intent);
                }
            }
        }
        this.f36860a.remove(kqmVar.f36885a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: b */
    public final boolean m14700b(CaptureRequest.Key key) {
        khv khvVar;
        if (!this.f36861b.contains(key)) {
            return false;
        }
        if (this.f36860a.contains(key)) {
            khvVar = khv.SESSION_BLOCKLIST;
        } else if (this.f36863d.contains(key)) {
            khvVar = khv.AAA_BLOCKLIST;
        } else if (this.f36865f.contains(key)) {
            khvVar = khv.API_BLOCKLIST;
        } else if (this.f36864e.contains(key)) {
            khvVar = khv.DEVICE_BLOCKLIST;
        } else {
            lku.m15657k(!this.f36861b.contains(key));
            khvVar = null;
        }
        khvVar.getClass();
        this.f36862c.mo13947i("Trying to update a blocklisted parameter : " + key.getName() + ". " + khvVar.f36100f);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: c */
    public final kho m14701c(kgg kggVar, Set set) {
        int i;
        int i2;
        int iMin;
        String str;
        this.f36864e.mo13961e("createFrameStream");
        long jM1591W = ((AmbientDelegate) this.f36865f).m1591W();
        kky kkyVar = (kky) kggVar;
        long jMo14451f = kkyVar.mo14451f();
        boolean zMo14454i = kkyVar.mo14454i();
        lku.m15659m(jMo14451f >= 0, "bytesPerImage() must be >= 0", new Object[0]);
        boolean z = kggVar instanceof kkq;
        if (z) {
            i = ((kkq) kggVar).f36401d;
            lku.m15659m(i > 0, "Stream capacity must be > 0", new Object[0]);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (jMo14451f != 0) {
            if (jMo14451f > 0 || zMo14454i) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = (int) (jM1591W / jMo14451f);
            }
            iMin = Math.min(i2, i);
        } else if (i == Integer.MAX_VALUE) {
            iMin = -1;
        } else {
            jMo14451f = 0;
            if (jMo14451f > 0) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            iMin = Math.min(i2, i);
        }
        long jMo14451f2 = kkyVar.mo14454i() ? 0L : kkyVar.mo14451f();
        mxk mxkVarM17136H = z ? mxk.m17136H((kkq) kggVar) : mzx.f41874a;
        kho khoVar = new kho(mxk.m17136H(kggVar), mxkVarM17136H, kggVar instanceof kkr ? mxk.m17136H((kkr) kggVar) : mzx.f41874a, m14698l(set), iMin, m14697k(jMo14451f2, iMin, mxkVarM17136H));
        this.f36864e.mo13962f();
        this.f36862c.add(khoVar);
        ?? r3 = this.f36863d;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = khoVar;
        objArr[1] = kggVar;
        double d = khoVar.f36070f;
        Double.isNaN(d);
        objArr[2] = Double.valueOf(d / 1048576.0d);
        if (iMin < 0 || iMin == Integer.MAX_VALUE) {
            str = "";
        } else {
            str = " with " + khoVar.f36069e + " frames max";
        }
        objArr[3] = str;
        r3.mo13944f(String.format(locale, "Created %-10s from [%s] %6.2f MiB/frame%s", objArr));
        return khoVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: d */
    public final kho m14702d(Set set, Set set2) {
        int iMin;
        String str;
        this.f36864e.mo13961e(VCYBIzY.YRdvLCedyIy);
        mxk mxkVarM17134F = mxk.m17134F(set);
        Object obj = this.f36861b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kgg kggVar = (kgg) it.next();
            kggVar.getClass();
            lku.m15670x(((kkz) obj).f36448a.contains(kggVar), kggVar.toString().concat(" is not available on this FrameServer."));
        }
        long jM1591W = ((AmbientDelegate) this.f36865f).m1591W();
        long jM15700t = lle.m15700t(mxkVarM17134F);
        Iterator<E> it2 = mxkVarM17134F.iterator();
        int iMin2 = Integer.MAX_VALUE;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            kgg kggVar2 = (kgg) it2.next();
            if (kggVar2 instanceof kkq) {
                int i = ((kkq) kggVar2).f36401d;
                lku.m15659m(i > 0, "Stream capacity must be > 0", new Object[0]);
                iMin2 = Math.min(iMin2, i);
            }
        }
        if (jM15700t > 0 || iMin2 != Integer.MAX_VALUE) {
            iMin = Math.min(jM15700t > 0 ? (int) (jM1591W / jM15700t) : Integer.MAX_VALUE, iMin2);
        } else {
            iMin = -1;
        }
        long jM15700t2 = lle.m15700t(set);
        mxi mxiVarM17132D = mxk.m17132D();
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            kgg kggVar3 = (kgg) it3.next();
            if (kggVar3 instanceof kkq) {
                mxiVarM17132D.mo17072d((kkq) kggVar3);
            }
        }
        mxk mxkVarMo17127f = mxiVarM17132D.mo17127f();
        mxk mxkVarM14698l = m14698l(set2);
        mxi mxiVarM17132D2 = mxk.m17132D();
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            kgg kggVar4 = (kgg) it4.next();
            if (kggVar4 instanceof kkr) {
                mxiVarM17132D2.mo17072d((kkr) kggVar4);
            }
        }
        kho khoVar = new kho(mxkVarM17134F, mxkVarMo17127f, mxiVarM17132D2.mo17127f(), mxkVarM14698l, iMin, m14697k(jM15700t2, iMin, mxkVarMo17127f));
        this.f36864e.mo13962f();
        this.f36862c.add(khoVar);
        ?? r13 = this.f36863d;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[4];
        objArr[0] = khoVar;
        objArr[1] = mxkVarM17134F;
        double d = khoVar.f36070f;
        Double.isNaN(d);
        objArr[2] = Double.valueOf(d / 1048576.0d);
        if (iMin < 0 || iMin == Integer.MAX_VALUE) {
            str = "";
        } else {
            str = " with " + khoVar.f36069e + " frames max";
        }
        objArr[3] = str;
        r13.mo13944f(String.format(locale, "Created %-10s from %s %.2f MiB/frame%s", objArr));
        return khoVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: e */
    public final ipi m14703e(Set set) {
        set.getClass();
        dhv dhvVar = (dhv) this.f36865f.get();
        dhvVar.getClass();
        kbz kbzVar = (kbz) this.f36864e.get();
        kbzVar.getClass();
        Executor executor = (Executor) this.f36863d.get();
        executor.getClass();
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.f36861b.get();
        cameraActivityTiming.getClass();
        dbr dbrVar = (dbr) this.f36862c.get();
        dbrVar.getClass();
        jwn jwnVar = (jwn) this.f36860a.get();
        jwnVar.getClass();
        return new ipi(set, dhvVar, kbzVar, executor, cameraActivityTiming, dbrVar, jwnVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: f */
    public final gyn m14704f(long j, dzk dzkVar, String str) {
        return m14705g(j, dzkVar, str, ((Boolean) this.f36860a.mo10031c(gzy.f27036at)).booleanValue() ? gyx.MARS_STORE : gyx.MEDIA_STORE);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kqw] */
    /* JADX INFO: renamed from: g */
    public final gyn m14705g(final long j, dzk dzkVar, final String str, final gyx gyxVar) {
        this.f36864e.mo13961e("Create fileGroup");
        final ?? r6 = this.f36865f;
        ?? r13 = this.f36862c;
        final ?? r4 = this.f36864e;
        ?? r1 = this.f36861b;
        final krj krjVar = (krj) this.f36863d;
        msi msiVarM15663q = lku.m15663q(new msi() { // from class: gyk
            @Override // p000.msi
            /* JADX INFO: renamed from: a */
            public final Object mo6051a() {
                kqg kqgVarMo14733a;
                kbz kbzVar = r4;
                gyx gyxVar2 = gyxVar;
                kqw kqwVar = r6;
                krj krjVar2 = krjVar;
                String str2 = str;
                long j2 = j;
                int i = gyn.f26850f;
                kbzVar.mo13961e("Initialize MediaGroup");
                if (gyxVar2 == gyx.MARS_STORE) {
                    kqgVarMo14733a = kqwVar.mo14733a(krjVar2, mro.m16831a(str2), j2);
                } else {
                    kqx kqxVar = (kqx) kqwVar;
                    kqgVarMo14733a = kqxVar.mo14733a(kqxVar.f36976b, mro.m16831a(str2), j2);
                }
                kbzVar.mo13962f();
                return kqgVarMo14733a;
            }
        });
        dhx dhxVar = dib.f11240a;
        r1.mo6177e();
        gyn gynVar = new gyn(msiVarM15663q, j, dzkVar, str, r13, gyxVar, krjVar.f37051a);
        this.f36862c.mo13944f("Created ".concat(gynVar.toString()));
        this.f36864e.mo13962f();
        return gynVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: h */
    public final gyn m14706h(long j) {
        ?? r0 = this.f36861b;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
        return m14704f(j, dzk.NIGHT, KMNlNMe.mlnHvMiGsJlZFJA);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final gyn m14707i(long j) {
        ?? r0 = this.f36861b;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
        return m14704f(j, dzk.NONE, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: j */
    public final glj m14708j(int i) {
        ?? r1 = this.f36862c;
        ?? r2 = this.f36860a;
        Object obj = this.f36861b;
        return new glj(r1, r2, (jvb) obj, this.f36863d, this.f36865f, i, (String) this.f36864e);
    }

    public kqj(kqw kqwVar, kbz kbzVar, kbo kboVar, dhv dhvVar, hah hahVar, krj krjVar) {
        this.f36865f = kqwVar;
        this.f36864e = kbzVar;
        this.f36861b = dhvVar;
        this.f36862c = kboVar.mo6314a("GcaMediaStorage");
        this.f36860a = hahVar;
        this.f36863d = krjVar;
    }

    public kqj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, char[] cArr) {
        ojuVar.getClass();
        this.f36865f = ojuVar;
        ojuVar2.getClass();
        this.f36864e = ojuVar2;
        ojuVar3.getClass();
        this.f36863d = ojuVar3;
        ojuVar4.getClass();
        this.f36861b = ojuVar4;
        ojuVar5.getClass();
        this.f36862c = ojuVar5;
        ojuVar6.getClass();
        this.f36860a = ojuVar6;
    }

    public kqj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, byte[] bArr) {
        ojuVar.getClass();
        this.f36861b = ojuVar;
        ojuVar2.getClass();
        this.f36860a = ojuVar2;
        ojuVar3.getClass();
        this.f36864e = ojuVar3;
        ojuVar4.getClass();
        this.f36863d = ojuVar4;
        ojuVar5.getClass();
        this.f36862c = ojuVar5;
        ojuVar6.getClass();
        this.f36865f = ojuVar6;
    }

    public kqj(kkz kkzVar, AmbientDelegate ambientDelegate, kqj kqjVar, kbo kboVar, kbz kbzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36861b = kkzVar;
        this.f36865f = ambientDelegate;
        this.f36860a = kqjVar;
        this.f36864e = kbzVar;
        this.f36863d = kboVar.mo6314a("FrameStreamMap");
        this.f36862c = new HashSet();
    }

    public kqj(Set set, Set set2, Set set3, Set set4, kbo kboVar) {
        this.f36860a = mxk.m17134F(set);
        this.f36863d = mxk.m17134F(set2);
        this.f36865f = mxk.m17134F(set4);
        this.f36864e = mxk.m17134F(set3);
        this.f36862c = kboVar.mo6314a("ParamBlkList");
        mxi mxiVarM17132D = mxk.m17132D();
        mxiVarM17132D.m17129h(set);
        mxiVarM17132D.m17129h(set3);
        mxiVarM17132D.m17129h(set4);
        mxiVarM17132D.m17129h(set2);
        this.f36861b = mxiVarM17132D.mo17127f();
    }

    public kqj(Context context, ContentResolver contentResolver, kqv kqvVar, kbo kboVar) {
        this.f36864e = new Object();
        this.f36860a = new HashMap();
        new HashMap();
        this.f36863d = context;
        this.f36862c = contentResolver;
        this.f36861b = kqvVar;
        this.f36865f = kboVar.mo6314a("PublishNotifier");
    }

    public kqj(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        ojuVar.getClass();
        this.f36860a = ojuVar;
        ojuVar2.getClass();
        this.f36861b = ojuVar2;
        ojuVar3.getClass();
        this.f36862c = ojuVar3;
        ojuVar4.getClass();
        this.f36863d = ojuVar4;
        ojuVar5.getClass();
        this.f36864e = ojuVar5;
        ojuVar6.getClass();
        this.f36865f = ojuVar6;
    }
}
