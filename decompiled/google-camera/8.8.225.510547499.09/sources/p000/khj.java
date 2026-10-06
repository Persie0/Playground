package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Printer;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khj implements kfk {

    /* JADX INFO: renamed from: a */
    public final kbo f36023a;

    /* JADX INFO: renamed from: b */
    public final khf f36024b;

    /* JADX INFO: renamed from: c */
    private final kgy f36025c;

    /* JADX INFO: renamed from: d */
    private final kgt f36026d;

    /* JADX INFO: renamed from: e */
    private final kig f36027e;

    /* JADX INFO: renamed from: f */
    private final khx f36028f;

    /* JADX INFO: renamed from: g */
    private final jvb f36029g;

    /* JADX INFO: renamed from: h */
    private final long f36030h;

    /* JADX INFO: renamed from: i */
    private final kie f36031i;

    /* JADX INFO: renamed from: j */
    private final khg f36032j;

    /* JADX INFO: renamed from: k */
    private final kgp f36033k;

    /* JADX INFO: renamed from: l */
    private final npu f36034l;

    /* JADX INFO: renamed from: m */
    private Future f36035m;

    /* JADX INFO: renamed from: n */
    private final kon f36036n;

    /* JADX INFO: renamed from: o */
    private final kqj f36037o;

    /* JADX INFO: renamed from: p */
    private final AmbientDelegate f36038p;

    /* JADX INFO: renamed from: q */
    private final khb f36039q;

    /* JADX INFO: renamed from: r */
    private final lpe f36040r;

    /* JADX INFO: renamed from: s */
    private final ihk f36041s;

    public khj(khg khgVar, kon konVar, kgy kgyVar, kqj kqjVar, kgt kgtVar, AmbientDelegate ambientDelegate, khx khxVar, kig kigVar, jvb jvbVar, kdp kdpVar, kie kieVar, ihk ihkVar, lpe lpeVar, khb khbVar, kbo kboVar, khf khfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        npu npuVarM15032y = kxk.m15032y(jzn.m13824l("FSEx"));
        this.f36034l = npuVarM15032y;
        this.f36032j = khgVar;
        this.f36025c = kgyVar;
        this.f36037o = kqjVar;
        this.f36026d = kgtVar;
        this.f36038p = ambientDelegate;
        this.f36028f = khxVar;
        this.f36027e = kigVar;
        this.f36029g = jvbVar;
        this.f36031i = kieVar;
        this.f36041s = ihkVar;
        this.f36036n = konVar;
        this.f36024b = khfVar;
        this.f36039q = khbVar;
        this.f36040r = lpeVar;
        this.f36033k = new kgp(khfVar, npuVarM15032y, kboVar);
        this.f36023a = kboVar.mo6314a("FrameServer");
        this.f36030h = System.nanoTime();
        konVar.m14627c(khgVar);
        jvbVar.m13537d(kdpVar.m14002b(khgVar.toString()));
        jvbVar.m13537d(khfVar);
        jvbVar.m13537d(kieVar);
        ((kja) lpeVar.f38884c).f36235a.m14852d(kgyVar.m14229e().f36540a);
    }

    /* JADX INFO: renamed from: x */
    private final boolean m14265x(String str) {
        if (!this.f36029g.mo8995b()) {
            return false;
        }
        this.f36023a.mo13947i("Attempted to invoke " + str + " on " + toString() + " after close()");
        return true;
    }

    @Override // p000.kaq
    /* JADX INFO: renamed from: a */
    public final void mo13885a(Printer printer) {
        mxk mxkVarM17134F;
        String str;
        kgy kgyVar = this.f36025c;
        kgz kgzVar = new kgz(printer, 1);
        printer.println(String.valueOf(kgyVar.f35996a) + wUzNh.EuFkB + kgyVar.f35997b.f35837a.f36540a + ")");
        kgy.m14228f(kgzVar, "Facing", String.valueOf(String.valueOf(kgyVar.mo14139d().mo14558k())).concat((kgyVar.mo14139d().mo14544M() && kgyVar.mo14139d().mo14535D()) ? " (Logical)" : " (Physical)"));
        kgy.m14228f(kgzVar, "Mode", kgyVar.f35997b.f35838b == kfx.NORMAL ? "Normal" : "HighSpeed");
        knx knxVar = kgyVar.f35998c;
        kgy.m14228f(kgzVar, "Memory", knxVar.f36654b <= 0 ? BcwGDRhrTsnlj.jjoazH : (((Long) knxVar.m14610f().mo3831be()).longValue() / 1048576) + " / " + (kgyVar.f35998c.f36654b / 1048576) + " (MiB)");
        printer.println("Streams: ");
        naz nazVarListIterator = kgyVar.f35999d.f36448a.listIterator();
        while (nazVarListIterator.hasNext()) {
            kky kkyVar = (kky) nazVarListIterator.next();
            String str2 = kkyVar.f36446g ? " (Camera-" + kkyVar.f36445f.f36540a + ")" : "";
            String string = kkyVar instanceof kkq ? Long.toString(((kkq) kkyVar).f36401d) : "inf";
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[7];
            objArr[0] = kkyVar;
            objArr[1] = kkyVar.mo14192b().f35517a + "x" + kkyVar.mo14192b().f35518b;
            objArr[2] = lme.m15725k(kkyVar.mo14191a());
            kgj kgjVarMo14453h = kkyVar.mo14453h();
            kgj kgjVar = kgj.f35913a;
            switch (kgjVarMo14453h) {
                case f35913a:
                    str = "IMAGE_READER";
                    break;
                case SURFACE_TEXTURE:
                    str = "SURFACE_TEXTURE";
                    break;
                case SURFACE_VIEW:
                    str = "SURFACE_VIEW";
                    break;
                case SURFACE:
                    str = "SURFACE";
                    break;
                case SURFACE_DEFERRED:
                    str = "SURFACE_DEFERRED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            objArr[3] = str;
            double dMo14451f = kkyVar.mo14451f();
            Double.isNaN(dMo14451f);
            objArr[4] = Double.valueOf(dMo14451f / 1048576.0d);
            objArr[5] = string;
            objArr[6] = str2;
            kgzVar.println(String.format(locale, "%-10s %10s %-15s %-15s %6.2f MiB/image %4s images/stream%s", objArr));
        }
        mxk mxkVar = kgyVar.f35997b.f35844h;
        if (!mxkVar.isEmpty()) {
            printer.println("Session Parameters: ");
            mwt mwtVarM17116j = mwx.m17116j(mxkVar.size());
            naz nazVarListIterator2 = mxkVar.listIterator();
            int iMax = 20;
            while (nazVarListIterator2.hasNext()) {
                kfy kfyVar = (kfy) nazVarListIterator2.next();
                String strM14177a = kfyVar.m14177a();
                iMax = Math.max(iMax, strM14177a.length());
                mwtVarM17116j.mo17110e(strM14177a, kfyVar.f35859b);
            }
            mwx mwxVarMo17059b = mwtVarM17116j.mo17059b();
            ArrayList arrayList = new ArrayList(mwxVarMo17059b.keySet());
            Collections.sort(arrayList);
            String str3 = "%-" + iMax + "s %s";
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                String str4 = (String) arrayList.get(i);
                kgzVar.println(kfv.m14168E(str3, str4, mwxVarMo17059b.get(str4)));
            }
        }
        kgt kgtVar = this.f36026d;
        synchronized (kgtVar) {
            mxkVarM17134F = mxk.m17134F(kgtVar.f35965a);
        }
        mxr mxrVar = new mxr(amx.f752p);
        mxr mxrVar2 = new mxr(amx.f752p);
        naz nazVarListIterator3 = mxkVarM17134F.listIterator();
        while (nazVarListIterator3.hasNext()) {
            naz nazVarListIterator4 = ((kgs) nazVarListIterator3.next()).f35958h.f36067c.listIterator();
            while (nazVarListIterator4.hasNext()) {
                kgg kggVar = (kgg) nazVarListIterator4.next();
                mxrVar.m17153k(kggVar.toString());
                mxrVar2.m17153k(kggVar.mo14193c().f36540a);
            }
        }
        printer.println("Attached streams: ".concat(String.valueOf(String.valueOf(mxrVar.mo17127f()))));
        printer.println("Attached camera ids: ".concat(String.valueOf(String.valueOf(mxrVar2.mo17127f()))));
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: b */
    public final kew mo14115b() {
        return kgo.m14209b();
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: c */
    public final kfl mo14116c() {
        return this.f36025c;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f36023a.mo13944f("Closing ".concat(toString()));
        this.f36034l.shutdownNow();
        this.f36036n.m14628d(this.f36032j);
        this.f36029g.close();
        ((kja) this.f36040r.f38884c).f36236b.m14853e(System.nanoTime() - this.f36030h, this.f36025c.m14229e().f36540a);
        this.f36023a.mo13940b("Closed ".concat(toString()));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oju] */
    @Override // p000.kfk
    /* JADX INFO: renamed from: d */
    public final kfo mo14117d() throws InterruptedException, kec {
        if (m14265x("acquireExclusiveSession")) {
            throw new kec("Unable to acquire session. " + toString() + " is closed");
        }
        kic kicVarM14322a = this.f36031i.m14322a();
        ihk ihkVar = this.f36041s;
        djm djmVar = (djm) ihkVar.f30967b.get();
        djmVar.getClass();
        kbz kbzVar = (kbz) ihkVar.f30966a.get();
        kbzVar.getClass();
        return new khm(djmVar, kbzVar, kicVarM14322a, null);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: e */
    public final void mo14118e(kgg kggVar) {
        mo14119f(kggVar, true);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: f */
    public final void mo14119f(kgg kggVar, boolean z) {
        if (z) {
            this.f36039q.m14257w(kggVar);
        }
        if (kggVar instanceof kkq) {
            this.f36023a.mo13944f("Draining ".concat(String.valueOf(String.valueOf(kggVar))));
            kkw kkwVar = ((kkq) kggVar).f36398a;
            synchronized (kkwVar) {
                if (!kkwVar.f36425j) {
                    kkwVar.f36421f.mo13944f("Draining free buffers for " + String.valueOf(kkwVar.f36416a));
                    kkwVar.f36416a.mo14513h();
                }
            }
        }
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: g */
    public final void mo14120g() {
        if (m14265x("resume")) {
            return;
        }
        this.f36023a.mo13940b("Resuming ".concat(toString()));
        this.f36036n.m14626b(this.f36032j);
        this.f36027e.m14327a();
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: h */
    public final void mo14121h(kfy kfyVar) {
        this.f36038p.m1583N(kfyVar);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: i */
    public final void mo14122i(CaptureRequest.Key key, Object obj) {
        AmbientDelegate ambientDelegate = this.f36038p;
        if (((kqj) ambientDelegate.f1687c).m14700b(key)) {
            return;
        }
        ambientDelegate.m1583N(kgq.m14215e(key, obj));
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: j */
    public final void mo14123j(Set set) {
        this.f36038p.m1584O(set);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: k */
    public final void mo14124k(kge kgeVar) {
        Future future = this.f36035m;
        if (future != null) {
            future.cancel(true);
        }
        if (m14265x("trigger3A")) {
            return;
        }
        try {
            this.f36035m = this.f36034l.submit(new kds(this, kgeVar, 7));
        } catch (RejectedExecutionException e) {
            this.f36023a.mo13947i("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: l */
    public final void mo14125l(kex kexVar, kge kgeVar) {
        Future future = this.f36035m;
        if (future != null) {
            future.cancel(true);
        }
        if (m14265x("trigger3A")) {
            return;
        }
        try {
            this.f36035m = this.f36034l.submit(new kha(this, kexVar, kgeVar, 2));
        } catch (RejectedExecutionException e) {
            this.f36023a.mo13947i("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: m */
    public final void mo14126m(boolean z, boolean z2, boolean z3) {
        Future future = this.f36035m;
        if (future != null) {
            future.cancel(true);
        }
        if (m14265x("unlock3A")) {
            return;
        }
        try {
            this.f36034l.execute(new khi(this, z, z2, z3, 0));
        } catch (RejectedExecutionException e) {
            this.f36023a.mo13947i("Failed to submit unlock3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: n */
    public final void mo14127n(kex kexVar) {
        if (m14265x(IuyLAqNmW.eRHenOOztUG)) {
            return;
        }
        this.f36033k.m14210a(kexVar, false);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: o */
    public final void mo14128o(kex kexVar) {
        if (m14265x(zuAgeeF.ReQoetePuYwJt)) {
            return;
        }
        this.f36033k.m14210a(kexVar, true);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: p */
    public final kba mo14129p(kho khoVar) {
        m14265x("attach(frameStream)");
        return this.f36026d.m14225d(khoVar, 0);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: q */
    public final key mo14130q(kho khoVar) {
        m14265x("submit(frameStream)");
        return this.f36028f.m14304f(khoVar);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: r */
    public final kfc mo14131r(kho khoVar, int i) {
        m14265x("attach(frameStream, capacity)");
        return this.f36026d.m14225d(khoVar, i);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: s */
    public final kho mo14132s(kgg kggVar) {
        this.f36040r.m15815n(this.f36025c.m14229e().f36540a, 1, 0);
        m14265x("create(stream)");
        return this.f36037o.m14701c(kggVar, mzx.f41874a);
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: t */
    public final kho mo14133t(Set set) {
        this.f36040r.m15815n(this.f36025c.m14229e().f36540a, 1, 0);
        m14265x(yTyWiTtGtnBhy.ImiYdSiwGYnwag);
        return this.f36037o.m14702d(set, mzx.f41874a);
    }

    public final String toString() {
        return this.f36032j.toString();
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: u */
    public final kho mo14134u(kgg kggVar, Set set) {
        this.f36040r.m15815n(this.f36025c.m14229e().f36540a, 1, set.size());
        m14265x("create(stream, parameters)");
        return this.f36037o.m14701c(kggVar, mxk.m17134F(set));
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: v */
    public final kho mo14135v(Set set, Set set2) {
        this.f36040r.m15815n(this.f36025c.m14229e().f36540a, set.size(), set2.size());
        m14265x("create(streams, parameters)");
        return this.f36037o.m14702d(set, mxk.m17134F(set2));
    }

    @Override // p000.kfk
    /* JADX INFO: renamed from: w */
    public final void mo14136w(boolean z) {
        Future future = this.f36035m;
        if (future != null) {
            future.cancel(true);
        }
        if (m14265x("trigger3A")) {
            return;
        }
        try {
            this.f36035m = this.f36034l.submit(new bnp(this, z, 20));
        } catch (RejectedExecutionException e) {
            this.f36023a.mo13947i("Failed to submit trigger3A task. ".concat(String.valueOf(e.getMessage())));
        }
    }
}
