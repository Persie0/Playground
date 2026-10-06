package p000;

import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kki implements kiv {

    /* JADX INFO: renamed from: a */
    public final kbz f36353a;

    /* JADX INFO: renamed from: c */
    public boolean f36355c;

    /* JADX INFO: renamed from: d */
    private final kbo f36356d;

    /* JADX INFO: renamed from: e */
    private final kkb f36357e;

    /* JADX INFO: renamed from: f */
    private final kkk f36358f;

    /* JADX INFO: renamed from: g */
    private final Handler f36359g;

    /* JADX INFO: renamed from: k */
    private kpk f36363k;

    /* JADX INFO: renamed from: m */
    private final lpe f36365m;

    /* JADX INFO: renamed from: h */
    private long f36360h = 0;

    /* JADX INFO: renamed from: i */
    private long f36361i = 0;

    /* JADX INFO: renamed from: b */
    final Map f36354b = new HashMap();

    /* JADX INFO: renamed from: l */
    private final AtomicInteger f36364l = new AtomicInteger(0);

    /* JADX INFO: renamed from: j */
    private Set f36362j = new HashSet();

    public kki(kkb kkbVar, kkk kkkVar, Handler handler, kbz kbzVar, kbo kboVar, lpe lpeVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f36357e = kkbVar;
        this.f36358f = kkkVar;
        this.f36359g = handler;
        this.f36353a = kbzVar;
        this.f36365m = lpeVar;
        this.f36356d = kboVar.mo6314a("SimpleReqProcessor");
    }

    /* JADX INFO: renamed from: g */
    public static Long m14421g(kpk kpkVar) {
        Object objMo9513b = kpkVar.mo9513b();
        objMo9513b.getClass();
        return (Long) objMo9513b;
    }

    /* JADX INFO: renamed from: j */
    private final synchronized int m14422j(List list, kkh kkhVar, boolean z) {
        int iMo14409b;
        this.f36365m.m15816o(list.size(), false);
        this.f36353a.mo13961e("captureSession#captureBurst");
        try {
            try {
                iMo14409b = this.f36357e.mo14409b(list, kkhVar, this.f36359g, z);
                this.f36353a.mo13962f();
                if (iMo14409b < 0) {
                    m14426n(list, kkhVar);
                }
            } catch (Throwable th) {
                this.f36353a.mo13962f();
                m14426n(list, kkhVar);
                throw th;
            }
        } catch (CameraAccessException | kpf e) {
            this.f36356d.mo13943e("Failed to submit repeating " + list.toString(), e);
            throw new kec(e);
        }
        return iMo14409b;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:5:0x0004, B:17:0x0046, B:19:0x004d, B:39:0x0089, B:41:0x0090, B:42:0x00b5, B:6:0x0011), top: B:48:0x0002 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x0090, please report this as an issue */
    /* JADX INFO: renamed from: k */
    private final synchronized int m14423k(kpk kpkVar, kkh kkhVar, boolean z, boolean z2) {
        int iMo14410c;
        try {
            if (z) {
                this.f36365m.m15816o(1, true);
                this.f36353a.mo13961e("captureSession#setRepeatingRequest");
            } else {
                this.f36365m.m15816o(1, false);
                this.f36353a.mo13961e("captureSession#capture");
            }
            iMo14410c = -1;
            try {
                iMo14410c = z ? this.f36357e.mo14410c(kpkVar, kkhVar, this.f36359g, z2) : this.f36357e.mo14408a(kpkVar, kkhVar, this.f36359g, z2);
                try {
                    synchronized (this) {
                        if (z) {
                            this.f36354b.remove(this.f36363k);
                            this.f36363k = kpkVar;
                            this.f36354b.put(kpkVar, kkhVar);
                        } else {
                            this.f36354b.put(kpkVar, kkhVar);
                        }
                        throw th;
                    }
                    return iMo14410c;
                } catch (CameraAccessException e) {
                    e = e;
                    try {
                        throw new kec(e);
                    } catch (Throwable th) {
                        th = th;
                        this.f36353a.mo13962f();
                        if (iMo14410c < 0) {
                            this.f36356d.mo13947i("Capture failed: " + kpkVar.toString() + " with invalid sequenceId " + iMo14410c);
                            m14430h(kpkVar, kkhVar);
                        }
                        throw th;
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new kec(e);
                } catch (Throwable th2) {
                    th = th2;
                    this.f36353a.mo13962f();
                    if (iMo14410c < 0) {
                        this.f36356d.mo13947i("Capture failed: " + kpkVar.toString() + " with invalid sequenceId " + iMo14410c);
                        m14430h(kpkVar, kkhVar);
                    }
                    throw th;
                }
            } catch (CameraAccessException e3) {
                e = e3;
            } catch (IllegalArgumentException e4) {
                e = e4;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        this.f36353a.mo13962f();
        if (iMo14410c < 0) {
            this.f36356d.mo13947i("Capture failed: " + kpkVar.toString() + " with invalid sequenceId " + iMo14410c);
            m14430h(kpkVar, kkhVar);
        }
        return iMo14410c;
    }

    /* JADX INFO: renamed from: l */
    private final kpk m14424l(kiz kizVar, mxn mxnVar, Map map, boolean z) throws kec {
        HashMap map2 = new HashMap();
        for (kgg kggVar : kizVar.f36228c) {
            if (!map2.containsKey(kggVar)) {
                Surface surfaceMo14452g = ((kky) kggVar).mo14452g();
                boolean zM14437f = this.f36358f.m14437f(surfaceMo14452g);
                if (surfaceMo14452g != null && surfaceMo14452g.isValid() && zM14437f) {
                    map2.put(kggVar, surfaceMo14452g);
                } else if (surfaceMo14452g == null || !surfaceMo14452g.isValid() || zM14437f) {
                    this.f36356d.mo13947i("Failed to add " + String.valueOf(kggVar) + " to CaptureRequest for " + String.valueOf(kizVar) + ". The surface (" + String.valueOf(surfaceMo14452g) + ") was not valid.");
                } else {
                    this.f36356d.mo13947i("Failed to add " + String.valueOf(kggVar) + " to CaptureRequest for " + String.valueOf(kizVar) + ".  The surface is not yet available.");
                }
            }
        }
        if (map2.isEmpty()) {
            this.f36356d.mo13947i("Failed to submit a CaptureRequest for " + String.valueOf(kizVar) + ": There were no surfaces on the request.");
            kua.m14871j(kizVar, this.f36359g);
            return null;
        }
        try {
            kln klnVarMo14413f = this.f36357e.mo14413f(kizVar);
            Long lM14425m = m14425m();
            klnVarMo14413f.f36479a.setTag(lM14425m);
            for (Map.Entry entry : map2.entrySet()) {
                klnVarMo14413f.f36479a.addTarget((Surface) entry.getValue());
                map.put((Surface) entry.getValue(), (kgg) entry.getKey());
            }
            for (kfy kfyVar : kizVar.f36227b) {
                klnVarMo14413f.m14503b(kfyVar.f35858a, kfyVar.f35859b);
            }
            kfv kfvVarM14107b = kfi.m14107b(kizVar.f36229d);
            if (!z) {
                kfvVarM14107b = new kgf(kfvVarM14107b, null);
            }
            mxnVar.mo17110e(lM14425m, kfvVarM14107b);
            this.f36359g.post(new dcr(kizVar, lM14425m.longValue(), map2.keySet(), 15));
            return klnVarMo14413f.m14502a();
        } catch (kec e) {
            this.f36356d.mo13942d("Failed to create a CaptureRequest using " + String.valueOf(kizVar) + "(" + kizVar.f36226a + ")");
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    private final synchronized Long m14425m() {
        long j;
        j = this.f36361i;
        this.f36361i = 1 + j;
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: n */
    private final void m14426n(List list, kkh kkhVar) {
        this.f36356d.mo13947i("Burst Capture failed: ".concat(list.toString()));
        this.f36359g.post(new kds(list, kkhVar, 8));
    }

    /* JADX INFO: renamed from: o */
    private static final boolean m14427o(kiz kizVar) {
        return kizVar.f36226a == 3;
    }

    /* JADX INFO: renamed from: p */
    private static final boolean m14428p(kiz kizVar, kkh kkhVar) {
        return kkhVar.f36351b.size() > 1 && m14427o(kizVar);
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: a */
    public final void mo14366a() {
        mwx mwxVarM17118m;
        this.f36353a.mo13961e("captureSession#abortCaptures");
        ((kja) this.f36365m.f38884c).f36241g.m14852d(new Object[0]);
        synchronized (this) {
            this.f36355c = true;
            mwxVarM17118m = mwx.m17118m(this.f36354b);
            this.f36354b.clear();
        }
        try {
            this.f36357e.mo14411d();
            naz nazVarListIterator = mwxVarM17118m.keySet().listIterator();
            while (nazVarListIterator.hasNext()) {
                kpk kpkVar = (kpk) nazVarListIterator.next();
                long jLongValue = m14421g(kpkVar).longValue();
                kkh kkhVar = (kkh) mwxVarM17118m.get(kpkVar);
                if (kkhVar != null) {
                    this.f36356d.mo13944f("Aborting " + jLongValue + " by invoking onCaptureFailed");
                    m14430h(kpkVar, kkhVar);
                }
            }
            synchronized (this) {
                this.f36355c = false;
            }
            this.f36353a.mo13962f();
        } catch (Throwable th) {
            naz nazVarListIterator2 = mwxVarM17118m.keySet().listIterator();
            while (nazVarListIterator2.hasNext()) {
                kpk kpkVar2 = (kpk) nazVarListIterator2.next();
                long jLongValue2 = m14421g(kpkVar2).longValue();
                kkh kkhVar2 = (kkh) mwxVarM17118m.get(kpkVar2);
                if (kkhVar2 != null) {
                    this.f36356d.mo13944f("Aborting " + jLongValue2 + " by invoking onCaptureFailed");
                    m14430h(kpkVar2, kkhVar2);
                }
            }
            synchronized (this) {
                this.f36355c = false;
                throw th;
            }
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: b */
    public final void mo14367b(kiz kizVar) {
        this.f36353a.mo13961e("SimpleRequestProcessor#setRepeating");
        this.f36365m.m15816o(1, true);
        try {
            try {
                mxn mxnVarM17146a = mxp.m17146a();
                ArrayMap arrayMap = new ArrayMap();
                kpk kpkVarM14424l = m14424l(kizVar, mxnVarM17146a, arrayMap, true);
                if (kpkVarM14424l != null) {
                    synchronized (this) {
                        if (!this.f36362j.equals(kizVar.f36228c)) {
                            this.f36356d.mo13944f("Submit repeating " + kizVar.toString() + " with " + String.valueOf(kizVar.f36228c));
                            this.f36362j = mxk.m17134F(kizVar.f36228c);
                        }
                    }
                    mxp mxpVarM17144a = mxnVarM17146a.mo17059b();
                    this.f36364l.incrementAndGet();
                    kkh kkhVar = new kkh(this, mxpVarM17144a, arrayMap);
                    this.f36359g.post(new gdi(kkhVar, m14423k(kpkVarM14424l, kkhVar, true, m14428p(kizVar, kkhVar)), 6));
                }
                this.f36353a.mo13962f();
            } catch (Exception e) {
                throw new kec(e);
            }
        } catch (Throwable th) {
            this.f36353a.mo13962f();
            throw th;
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: d */
    public final void mo14369d(kiz kizVar) {
        this.f36353a.mo13961e("SimpleRequestProcessor#submit");
        try {
            try {
                mxn mxnVarM17146a = mxp.m17146a();
                ArrayMap arrayMap = new ArrayMap();
                kpk kpkVarM14424l = m14424l(kizVar, mxnVarM17146a, arrayMap, false);
                if (kpkVarM14424l != null) {
                    this.f36356d.mo13944f("Submit " + kizVar.toString() + " with " + String.valueOf(kizVar.f36228c));
                    mxp mxpVarM17144a = mxnVarM17146a.mo17059b();
                    this.f36364l.incrementAndGet();
                    kkh kkhVar = new kkh(this, mxpVarM17144a, arrayMap);
                    m14423k(kpkVarM14424l, kkhVar, false, m14428p(kizVar, kkhVar));
                }
                this.f36353a.mo13962f();
            } catch (Exception e) {
                this.f36356d.mo13943e("Failed to submit " + kizVar.toString(), e);
                throw e;
            }
        } catch (Throwable th) {
            this.f36353a.mo13962f();
            throw th;
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: e */
    public final void mo14370e(List list) {
        boolean z;
        this.f36353a.mo13961e("SimpleRequestProcessor#submit-burst");
        try {
            try {
                mxn mxnVarM17146a = mxp.m17146a();
                ArrayMap arrayMap = new ArrayMap();
                ArrayList arrayList = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    kpk kpkVarM14424l = m14424l((kiz) it.next(), mxnVarM17146a, arrayMap, false);
                    if (kpkVarM14424l != null) {
                        arrayList.add(kpkVarM14424l);
                    }
                    this.f36353a.mo13962f();
                    throw th;
                }
                if (!arrayList.isEmpty()) {
                    this.f36356d.mo13944f("Submit burst of " + list.toString());
                    mxp mxpVarM17144a = mxnVarM17146a.mo17059b();
                    this.f36364l.incrementAndGet();
                    kkh kkhVar = new kkh(this, mxpVarM17144a, arrayMap);
                    if (kkhVar.f36351b.size() > 1) {
                        for (int i = 0; i < list.size(); i++) {
                            if (m14427o((kiz) list.get(i))) {
                                z = true;
                                break;
                            }
                        }
                    }
                    kkhVar.m14419a(m14422j(arrayList, kkhVar, z));
                    synchronized (this) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            this.f36354b.put((kpk) it2.next(), kkhVar);
                        }
                    }
                }
                this.f36353a.mo13962f();
            } catch (Exception e) {
                this.f36356d.mo13943e(hiCTUJiAxf.xhP + list.toString(), e);
                throw e;
            }
        } catch (Throwable th) {
            this.f36353a.mo13962f();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized long m14429f() {
        long j;
        j = this.f36360h;
        this.f36360h = 1 + j;
        return j;
    }

    /* JADX INFO: renamed from: h */
    final void m14430h(kpk kpkVar, kkh kkhVar) {
        this.f36359g.post(new kds(kkhVar, kpkVar, 9));
    }

    /* JADX INFO: renamed from: i */
    public final void m14431i(long j) {
        synchronized (this) {
            for (kpk kpkVar : this.f36354b.keySet()) {
                if (m14421g(kpkVar).longValue() == j) {
                    this.f36354b.remove(kpkVar);
                    this.f36356d.mo13940b("removeInflightRequest " + j);
                    break;
                }
            }
        }
    }

    @Override // p000.kiv
    /* JADX INFO: renamed from: c */
    public final void mo14368c() throws kec {
        try {
            this.f36357e.mo14412e();
        } catch (CameraAccessException e) {
            throw new kec(e);
        }
    }
}
