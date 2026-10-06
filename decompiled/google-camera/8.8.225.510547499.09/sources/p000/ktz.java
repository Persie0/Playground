package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.net.Uri;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.PortraitOutputs;
import com.google.googlex.gcam.PortraitRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktz {

    /* JADX INFO: renamed from: e */
    private static volatile ktz f37197e;

    /* JADX INFO: renamed from: a */
    public final Object f37198a;

    /* JADX INFO: renamed from: b */
    public final Object f37199b;

    /* JADX INFO: renamed from: c */
    public final Object f37200c;

    /* JADX INFO: renamed from: d */
    public final Object f37201d;

    public ktz(Context context, jln jlnVar, ExecutorService executorService, Class cls) {
        this.f37201d = context;
        this.f37198a = jlnVar;
        this.f37199b = executorService;
        this.f37200c = cls;
    }

    public ktz(PortraitOutputs portraitOutputs, InterleavedImageU8 interleavedImageU8, nry nryVar, PortraitRequest portraitRequest) {
        this.f37200c = portraitOutputs;
        this.f37201d = interleavedImageU8;
        this.f37198a = nryVar;
        this.f37199b = portraitRequest;
    }

    public ktz(String str, koc[] kocVarArr, koh kohVar, koa koaVar) {
        this.f37199b = str;
        this.f37200c = kocVarArr;
        this.f37198a = kohVar;
        this.f37201d = koaVar;
    }

    public ktz(khb khbVar, SensorDirectChannel sensorDirectChannel, Sensor sensor, knf knfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37200c = khbVar;
        this.f37201d = sensorDirectChannel;
        this.f37199b = sensor;
        this.f37198a = knfVar;
    }

    public ktz(kmd kmdVar, mxk mxkVar) {
        this.f37198a = kmdVar.mo14563p();
        this.f37201d = kmdVar.mo14562o();
        this.f37200c = kmdVar.mo14564q();
        ArrayList arrayList = new ArrayList(!((kmc) kmdVar).mo14541J() ? mws.m17097l(0) : mws.m17099n(0, 1, 2));
        if (mxkVar.contains(kga.ALWAYS_ALLOW_FLASH_MODE_TORCH) && !arrayList.contains(2)) {
            arrayList.add(2);
        }
        this.f37199b = arrayList;
    }

    public ktz(ksr ksrVar, Random random) {
        this.f37198a = new HashMap();
        this.f37200c = random;
        if (!oib.f46086a.mo6051a().mo18540n()) {
            this.f37201d = null;
            this.f37199b = null;
            return;
        }
        lsd lsdVarM15942a = lse.m15942a(ksrVar.f37126a);
        lsdVarM15942a.m15940b("cbv_module");
        lsdVarM15942a.m15941c("UploadLimiterRecord.pb");
        Uri uriM15939a = lsdVarM15942a.m15939a();
        lti ltiVarM15971a = ltj.m15971a();
        ltiVarM15971a.m15970e(uriM15939a);
        ltiVarM15971a.m15969d(kty.f37194b);
        ltj ltjVarM15966a = ltiVarM15971a.m15966a();
        if (kua.f37204a == null) {
            synchronized (kua.class) {
                if (kua.f37204a == null) {
                    C1058va c1058va = new C1058va(Collections.singletonList(lsc.m15930g(ksrVar.f37126a).m15363d()), (byte[]) null);
                    Executor executorM15696p = lle.m15696p(ksrVar);
                    ltv ltvVar = ltv.f39201a;
                    HashMap map = new HashMap();
                    lkm.m15579f(ltm.f39177a, map);
                    kua.f37204a = lkm.m15572M(executorM15696p, c1058va, map, ltvVar);
                }
            }
        }
        ltp ltpVarM15525a = kua.f37204a.m15525a(ltjVarM15966a);
        this.f37201d = ltpVarM15525a;
        this.f37199b = new HashMap(Collections.unmodifiableMap(m14848o(ltpVarM15525a).f37196a));
    }

    public ktz(oaj oajVar, Object obj, oaj oajVar2, Object obj2) {
        this.f37201d = oajVar;
        this.f37200c = obj;
        this.f37198a = oajVar2;
        this.f37199b = obj2;
    }

    public ktz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f37201d = ojuVar;
        this.f37199b = ojuVar2;
        ojuVar3.getClass();
        this.f37200c = ojuVar3;
        this.f37198a = ojuVar4;
    }

    public ktz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, byte[] bArr) {
        this.f37201d = ojuVar;
        this.f37198a = ojuVar2;
        this.f37200c = ojuVar3;
        this.f37199b = ojuVar4;
    }

    public ktz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, byte[] bArr, byte[] bArr2) {
        ojuVar.getClass();
        this.f37201d = ojuVar;
        ojuVar2.getClass();
        this.f37199b = ojuVar2;
        ojuVar3.getClass();
        this.f37198a = ojuVar3;
        ojuVar4.getClass();
        this.f37200c = ojuVar4;
    }

    /* JADX INFO: renamed from: a */
    public static ktz m14846a(ksr ksrVar) {
        if (f37197e == null) {
            synchronized (ktz.class) {
                if (f37197e == null) {
                    f37197e = new ktz(ksrVar, mru.f41485a);
                }
            }
        }
        return f37197e;
    }

    /* JADX INFO: renamed from: i */
    public static void m14847i(String str) {
        lku.m15607B(str.startsWith("/"), "collection must start with \"/\" but is \"%s\"", str);
    }

    /* JADX INFO: renamed from: o */
    private static kty m14848o(ltp ltpVar) {
        kty ktyVar = kty.f37194b;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - kua.m14863b();
            kty ktyVar2 = (kty) ltpVar.m15977a().get();
            try {
                HashMap map = new HashMap();
                for (Map.Entry entry : Collections.unmodifiableMap(ktyVar2.f37196a).entrySet()) {
                    HashMap map2 = new HashMap();
                    for (Map.Entry entry2 : Collections.unmodifiableMap(((ktw) entry.getValue()).f37192a).entrySet()) {
                        if (oaq.m18391a((nzw) entry2.getValue()) > jCurrentTimeMillis) {
                            map2.put((Long) entry2.getKey(), (nzw) entry2.getValue());
                        }
                    }
                    if (!map2.isEmpty()) {
                        Long l = (Long) entry.getKey();
                        nxl nxlVarM18137O = ktw.f37190b.m18137O();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        ((ktw) nxlVarM18137O.f44974b).m14845b().putAll(map2);
                        map.put(l, (ktw) nxlVarM18137O.mo18103l());
                    }
                }
                nxl nxlVarM18137O2 = kty.f37194b.m18137O();
                nxlVarM18137O2.m18110u(map);
                ktyVar = (kty) nxlVarM18137O2.mo18103l();
                ltpVar.m15978b(new hgv(ktyVar, 15), not.INSTANCE).get();
                return ktyVar;
            } catch (InterruptedException | CancellationException | ExecutionException e) {
                return ktyVar2;
            }
        } catch (InterruptedException e2) {
            return ktyVar;
        } catch (CancellationException e3) {
            return ktyVar;
        } catch (ExecutionException e4) {
            return ktyVar;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: p */
    private final void m14849p(Long l, kba kbaVar) {
        ((mty) this.f37201d).mo16916u(l, kbaVar);
        this.f37200c.remove(l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final boolean m14850b(obf obfVar) {
        nzw nzwVar;
        int iM18399a;
        oie.m18542b();
        int i = 2;
        boolean z = false;
        if (!oib.f46086a.mo6051a().mo18536j()) {
            int iM15408Q = lij.m15408Q(obfVar.f45254h);
            if (iM15408Q == 0) {
                iM15408Q = 2;
            }
            if (lij.m15407P(iM15408Q) == 6) {
                return false;
            }
        }
        oie.m18542b();
        if (!oib.f46086a.mo6051a().mo18537k() && (iM18399a = obe.m18399a(obfVar.f45255i)) != 0 && iM18399a == 4) {
            return false;
        }
        oie.m18542b();
        if (oib.f46086a.mo6051a().mo18534h() && ((Random) this.f37200c).nextDouble() >= oib.f46086a.mo6051a().mo18527a()) {
            return false;
        }
        Long lValueOf = Long.valueOf(obfVar.f45250d);
        int iM15408Q2 = lij.m15408Q(obfVar.f45254h);
        if (iM15408Q2 == 0) {
            iM15408Q2 = 2;
        }
        kub kubVar = new kub(lValueOf, iM15408Q2);
        long jM14863b = kua.m14863b();
        Object obj = this.f37199b;
        if (obj == null || this.f37201d == null) {
            synchronized (this.f37198a) {
                Long l = (Long) this.f37198a.get(kubVar);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (l == null || jM14863b <= 0 || l.longValue() + jM14863b < jCurrentTimeMillis) {
                    z = true;
                }
                if (z) {
                    this.f37198a.put(kubVar, Long.valueOf(jCurrentTimeMillis));
                }
            }
        } else {
            synchronized (obj) {
                long j = obfVar.f45250d;
                int iM15408Q3 = lij.m15408Q(obfVar.f45254h);
                if (iM15408Q3 == 0) {
                    iM15408Q3 = 2;
                }
                Object obj2 = this.f37199b;
                if (obj2 == null) {
                    nzwVar = oaq.f45170c;
                } else {
                    synchronized (obj2) {
                        ktw ktwVar = (ktw) this.f37199b.get(Long.valueOf(j));
                        if (ktwVar == null) {
                            nzwVar = oaq.f45170c;
                        } else {
                            long jM15407P = lij.m15407P(iM15408Q3);
                            nzwVar = oaq.f45170c;
                            nyr nyrVar = ktwVar.f37192a;
                            Long lValueOf2 = Long.valueOf(jM15407P);
                            if (nyrVar.containsKey(lValueOf2)) {
                                nzwVar = (nzw) nyrVar.get(lValueOf2);
                            }
                        }
                    }
                }
                if (jM14863b <= 0 || oaq.m18391a(nzwVar) + jM14863b < System.currentTimeMillis()) {
                    long j2 = obfVar.f45250d;
                    int iM15408Q4 = lij.m15408Q(obfVar.f45254h);
                    if (iM15408Q4 != 0) {
                        i = iM15408Q4;
                    }
                    nzw nzwVarM18392b = oaq.m18392b(System.currentTimeMillis());
                    Object obj3 = this.f37199b;
                    if (obj3 != null) {
                        synchronized (obj3) {
                            ?? r6 = this.f37199b;
                            Long lValueOf3 = Long.valueOf(j2);
                            ktw ktwVar2 = (ktw) r6.get(lValueOf3);
                            if (ktwVar2 == null) {
                                ktwVar2 = ktw.f37190b;
                            }
                            nxl nxlVar = (nxl) ktwVar2.m18143ad(5);
                            nxlVar.m18108s(ktwVar2);
                            long jM15407P2 = lij.m15407P(i);
                            nzwVarM18392b.getClass();
                            if (!nxlVar.f44974b.m18142ac()) {
                                nxlVar.mo18106p();
                            }
                            ((ktw) nxlVar.f44974b).m14845b().put(Long.valueOf(jM15407P2), nzwVarM18392b);
                            this.f37199b.put(lValueOf3, (ktw) nxlVar.mo18103l());
                        }
                    }
                    nxl nxlVarM18137O = kty.f37194b.m18137O();
                    nxlVarM18137O.m18110u(this.f37199b);
                    ((ltp) this.f37201d).m15978b(new hgv((kty) nxlVarM18137O.mo18103l(), 16), not.INSTANCE);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX INFO: renamed from: c */
    protected final void m14851c(Object obj, Object[] objArr) {
        Object obj2 = this.f37199b;
        Object obj3 = this.f37200c;
        koc[] kocVarArr = (koc[]) obj3;
        if (kocVarArr.length == objArr.length) {
            for (int i = 0; i < kocVarArr.length; i++) {
                Class cls = kocVarArr[i].f36675b;
                if (cls == String.class) {
                    if (objArr[i] instanceof String) {
                        if (cls == Boolean.class || (objArr[i] instanceof Boolean)) {
                        }
                    }
                } else if (cls != Integer.class || (objArr[i] instanceof Integer)) {
                    if (cls == Boolean.class) {
                    }
                }
            }
            ((koa) this.f37201d).mo14611a(obj, kod.m14618a(objArr));
            koh kohVar = ((kol) this.f37198a).f36699b;
            if (kohVar != null) {
                kohVar.mo14619a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(((String) obj2) + " has: " + Arrays.toString((Object[]) obj3) + " which does not match: " + Arrays.toString(objArr));
    }

    /* JADX INFO: renamed from: d */
    public final void m14852d(Object... objArr) {
        m14851c(1L, objArr);
    }

    /* JADX INFO: renamed from: e */
    public final void m14853e(double d, Object... objArr) {
        m14851c(Double.valueOf(d), objArr);
    }

    /* JADX INFO: renamed from: f */
    public final oaj m14854f() {
        return ((nxp) this.f37201d).f44978b;
    }

    /* JADX INFO: renamed from: g */
    public final void m14855g(Object obj) {
        if (((nxp) this.f37201d).m18122a() != oak.ENUM) {
            return;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final kex m14856h(kex kexVar, kex kexVar2) {
        kir kirVarM14363b = kir.m14363b(kexVar);
        kirVarM14363b.f36196b = this.f37198a.contains(kexVar.mo14092b()) ? kexVar.mo14092b() : kexVar2.mo14092b();
        kirVarM14363b.f36197c = this.f37201d.contains(kexVar.mo14091a()) ? kexVar.mo14091a() : kexVar2.mo14091a();
        kirVarM14363b.f36198d = this.f37200c.contains(kexVar.mo14093c()) ? kexVar.mo14093c() : kexVar2.mo14093c();
        kirVarM14363b.f36199e = this.f37199b.contains(kexVar.mo14095e()) ? kexVar.mo14095e() : kexVar2.mo14095e();
        kirVarM14363b.f36203i = Arrays.equals(kexVar.mo14097g(), kgo.f35931b) ? ((kis) kexVar2).f36209d : kexVar.mo14097g();
        kirVarM14363b.f36204j = Arrays.equals(kexVar.mo14096f(), kgo.f35931b) ? ((kis) kexVar2).f36210e : kexVar.mo14096f();
        kirVarM14363b.f36205k = Arrays.equals(kexVar.mo14098h(), kgo.f35931b) ? ((kis) kexVar2).f36211f : kexVar.mo14098h();
        return kirVarM14363b.m14365d();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: j */
    public final kba m14857j(long j) {
        synchronized (this.f37199b) {
            ?? r1 = this.f37200c;
            Long lValueOf = Long.valueOf(j);
            if (!r1.contains(lValueOf)) {
                return null;
            }
            return (kba) ((mty) this.f37201d).mo16885b(lValueOf).get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: k */
    public final kba m14858k() {
        synchronized (this.f37199b) {
            if (this.f37200c.isEmpty()) {
                return null;
            }
            return (kba) ((mty) this.f37201d).mo16885b((Long) this.f37200c.mo16928j().mo17162b()).get(0);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: l */
    public final kba m14859l() {
        synchronized (this.f37199b) {
            if (this.f37200c.isEmpty()) {
                return null;
            }
            Long l = (Long) this.f37200c.mo16928j().mo17162b();
            kba kbaVar = (kba) ((mty) this.f37201d).mo16885b(l).get(0);
            m14849p(l, kbaVar);
            return kbaVar;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, myy] */
    /* JADX INFO: renamed from: m */
    public final List m14860m() {
        ArrayList arrayList;
        synchronized (this.f37199b) {
            arrayList = new ArrayList(((mtm) this.f37201d).f41599b);
            Iterator itM16556u = mkv.m16556u(this.f37200c);
            long j = -1;
            while (itM16556u.hasNext()) {
                long jLongValue = ((Long) itM16556u.next()).longValue();
                if (j != jLongValue) {
                    arrayList.addAll(((mty) this.f37201d).mo16885b(Long.valueOf(jLongValue)));
                    j = jLongValue;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, naf] */
    /* JADX WARN: Type inference failed for: r3v8, types: [inp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, naf] */
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ void m14861n(long j, Object obj) {
        kba kbaVar = (kba) obj;
        synchronized (this.f37199b) {
            ?? r1 = this.f37200c;
            Long lValueOf = Long.valueOf(j);
            r1.add(lValueOf);
            ((mty) this.f37201d).mo16908p(lValueOf, kbaVar);
            if (!((mty) this.f37201d).m16915t()) {
                while (!this.f37200c.isEmpty() && this.f37198a.mo6844a(mkv.m16555t(this.f37200c))) {
                    Long l = (Long) this.f37200c.mo16928j().mo17162b();
                    kba kbaVar2 = (kba) ((mty) this.f37201d).mo16885b(l).get(0);
                    m14849p(l, kbaVar2);
                    kbaVar2.close();
                }
            }
        }
    }

    public ktz(fcp fcpVar, hkx hkxVar, ikw ikwVar, ikw ikwVar2) {
        this.f37198a = fcpVar;
        this.f37200c = ikwVar;
        this.f37199b = ikwVar2;
        this.f37201d = (hlc) hkxVar.mo10394a();
        String strValueOf = String.valueOf(ikwVar);
        String strValueOf2 = String.valueOf(ikwVar2);
        StringBuilder sb = new StringBuilder();
        sb.append(strValueOf);
        sb.append(" -> ");
        sb.append(strValueOf2);
    }

    public ktz(inp inpVar) {
        this.f37198a = inpVar;
        this.f37201d = mty.m16936v();
        this.f37200c = new nay(mzg.f41839a);
        this.f37199b = this;
    }

    public ktz() {
    }

    public ktz(nyw nywVar, Object obj, nyw nywVar2, nxp nxpVar) {
        if (nywVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (nxpVar.f44978b == oaj.f45141k && nywVar2 == null) {
            throw new IllegalArgumentException(YmzeHXaMYOLk.tfRoJjMbKob);
        }
        this.f37198a = nywVar;
        this.f37199b = obj;
        this.f37200c = nywVar2;
        this.f37201d = nxpVar;
    }
}
