package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import com.google.firebase.crashlytics.internal.concurrency.C1149a;
import com.google.firebase.crashlytics.internal.settings.C1150a;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ed1 implements vc1 {

    /* JADX INFO: renamed from: h */
    public static final cd1 f37032h = new cd1(0);

    /* JADX INFO: renamed from: a */
    public Object f37033a;

    /* JADX INFO: renamed from: b */
    public Object f37034b;

    /* JADX INFO: renamed from: c */
    public Object f37035c;

    /* JADX INFO: renamed from: d */
    public Object f37036d;

    /* JADX INFO: renamed from: e */
    public Object f37037e;

    /* JADX INFO: renamed from: f */
    public Object f37038f;

    /* JADX INFO: renamed from: g */
    public Object f37039g;

    public ed1(Executor executor, ArrayList arrayList, ArrayList arrayList2, ad1 ad1Var) {
        this.f37033a = new HashMap();
        this.f37034b = new HashMap();
        this.f37035c = new HashMap();
        this.f37036d = new HashSet();
        this.f37038f = new AtomicReference();
        qt2 qt2Var = new qt2(executor);
        this.f37037e = qt2Var;
        this.f37039g = ad1Var;
        ArrayList<hc1> arrayList3 = new ArrayList();
        arrayList3.add(hc1.m13190c(qt2Var, qt2.class, um9.class, ap7.class));
        int i = 0;
        arrayList3.add(hc1.m13190c(this, ed1.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            hc1 hc1Var = (hc1) it.next();
            if (hc1Var != null) {
                arrayList3.add(hc1Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((uo7) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((ad1) this.f37039g).mo275b(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((hc1) it4.next()).f42154b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.f37036d).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.f37036d).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.f37033a).isEmpty()) {
                omd.m18119G(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.f37033a).keySet());
                arrayList6.addAll(arrayList3);
                omd.m18119G(arrayList6);
            }
            for (hc1 hc1Var2 : arrayList3) {
                ((HashMap) this.f37033a).put(hc1Var2, new ds4(new dd1(i, this, hc1Var2)));
            }
            arrayList5.addAll(m11056s(arrayList3));
            arrayList5.addAll(m11057t());
            m11055r();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.f37038f).get();
        if (bool != null) {
            m11051m((HashMap) this.f37033a, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: h */
    public static m30 m11045h(m30 m30Var, b64 b64Var, t33 t33Var, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        l30 l30VarM16606a = m30Var.m16606a();
        String strMo4102d = ((q33) b64Var.f8007b).mo4102d();
        if (strMo4102d != null) {
            l30VarM16606a.f48956e = new z30(strMo4102d);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        boolean zIsEmpty = map.isEmpty();
        C3552rx c3552rx = (C3552rx) t33Var.f61789d;
        if (zIsEmpty) {
            sj4 sj4Var = (sj4) ((AtomicMarkableReference) c3552rx.f59987b).getReference();
            synchronized (sj4Var) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(sj4Var.f60926a));
            }
        } else {
            sj4 sj4Var2 = (sj4) ((AtomicMarkableReference) c3552rx.f59987b).getReference();
            synchronized (sj4Var2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sj4Var2.f60926a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strM21417a = sj4.m21417a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strM21417a)) {
                    map2.put(strM21417a, sj4.m21417a(1024, (String) entry.getValue()));
                } else {
                    i++;
                }
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listM11049o = m11049o(mapUnmodifiableMap2);
        sj4 sj4Var3 = (sj4) ((AtomicMarkableReference) ((C3552rx) t33Var.f61790e).f59987b).getReference();
        synchronized (sj4Var3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(sj4Var3.f60926a));
        }
        List listM11049o2 = m11049o(mapUnmodifiableMap3);
        if (!listM11049o.isEmpty() || !listM11049o2.isEmpty()) {
            n30 n30Var = (n30) m30Var.f50484c;
            l30VarM16606a.f48954c = new n30(n30Var.f52251a, listM11049o, listM11049o2, n30Var.f52254d, n30Var.f52255e, n30Var.f52256f, n30Var.f52257g);
        }
        return l30VarM16606a.m15768a();
    }

    /* JADX INFO: renamed from: i */
    public static rq1 m11046i(m30 m30Var, t33 t33Var) {
        List listM24518a = ((xh8) t33Var.f61791f).m24518a();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < listM24518a.size(); i++) {
            arrayList.add(((wh8) listM24518a.get(i)).m23954c());
        }
        if (arrayList.isEmpty()) {
            return m30Var;
        }
        l30 l30VarM16606a = m30Var.m16606a();
        d40 d40Var = new d40();
        d40Var.m10083c(arrayList);
        l30VarM16606a.f48957f = d40Var.m10081a();
        return l30VarM16606a.m15768a();
    }

    /* JADX INFO: renamed from: k */
    public static String m11047k(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            bufferedInputStream.close();
            throw th4;
        }
    }

    /* JADX INFO: renamed from: l */
    public static ed1 m11048l(Context context, dz3 dz3Var, t33 t33Var, xg1 xg1Var, b64 b64Var, t33 t33Var2, bl2 bl2Var, C1150a c1150a, bl2 bl2Var2, np1 np1Var, C1149a c1149a) {
        xq1 xq1Var = new xq1(context, dz3Var, xg1Var, bl2Var, c1150a);
        zq1 zq1Var = new zq1(t33Var, c1150a, np1Var);
        yq1 yq1Var = o02.f53503b;
        nba.m17319b(context);
        o02 o02Var = new o02(new v68(nba.m17318a().m17320c(new al0(o02.f53504c, o02.f53505d)).m12466a("FIREBASE_CRASHLYTICS_REPORT", new bs2("json"), o02.f53506e), c1150a.m6684b(), bl2Var2));
        ed1 ed1Var = new ed1();
        ed1Var.f37033a = xq1Var;
        ed1Var.f37034b = zq1Var;
        ed1Var.f37035c = o02Var;
        ed1Var.f37036d = b64Var;
        ed1Var.f37037e = t33Var2;
        ed1Var.f37038f = dz3Var;
        ed1Var.f37039g = c1149a;
        return ed1Var;
    }

    /* JADX INFO: renamed from: o */
    public static List m11049o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                C3386nv.m17635v("Null key");
                return null;
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                C3386nv.m17635v("Null value");
                return null;
            }
            arrayList.add(new c30(str, str2));
        }
        Collections.sort(arrayList, new C3835zj(10));
        return Collections.unmodifiableList(arrayList);
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: d */
    public synchronized uo7 mo4929d(rp7 rp7Var) {
        pv4 pv4Var = (pv4) ((HashMap) this.f37035c).get(rp7Var);
        if (pv4Var != null) {
            return pv4Var;
        }
        return f37032h;
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: e */
    public qz6 mo4930e(rp7 rp7Var) {
        uo7 uo7VarMo4931f = mo4931f(rp7Var);
        if (uo7VarMo4931f == null) {
            return new qz6(qz6.f58421c, qz6.f58422d);
        }
        return uo7VarMo4931f instanceof qz6 ? (qz6) uo7VarMo4931f : new qz6(null, uo7VarMo4931f);
    }

    @Override // p000.vc1
    /* JADX INFO: renamed from: f */
    public synchronized uo7 mo4931f(rp7 rp7Var) {
        wfb.m23913h(rp7Var, "Null interface requested.");
        return (uo7) ((HashMap) this.f37034b).get(rp7Var);
    }

    /* JADX INFO: renamed from: j */
    public synchronized qn3 m11050j() {
        qn3 qn3Var;
        try {
            if (((String) this.f37034b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (qn3.f57970c) {
                try {
                    Context context = (Context) this.f37033a;
                    String str = (String) this.f37034b;
                    String str2 = (String) this.f37035c;
                    byte[] bArrM18266m = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrM18266m = AbstractC3423or.m18266m(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(wq1.m24118n("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        C3386nv.m17626m("keysetName cannot be null");
                    }
                    String str3 = (String) this.f37036d;
                    if (bArrM18266m == null) {
                        if (str3 != null) {
                            this.f37037e = m11059v();
                        }
                        this.f37039g = m11052n();
                    } else if (str3 != null) {
                        this.f37039g = m11058u(bArrM18266m);
                    } else {
                        this.f37039g = new or3((uj4) ((xj4) q7d.m19712c(vqb.m23466D(bArrM18266m)).f50064b).m6552u());
                    }
                    qn3Var = new qn3(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return qn3Var;
    }

    /* JADX INFO: renamed from: m */
    public void m11051m(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            hc1 hc1Var = (hc1) entry.getKey();
            uo7 uo7Var = (uo7) entry.getValue();
            int i = hc1Var.f42156d;
            if (i == 1 || (i == 2 && z)) {
                uo7Var.get();
            }
        }
        qt2 qt2Var = (qt2) this.f37037e;
        synchronized (qt2Var) {
            try {
                arrayDeque = qt2Var.f58182b;
                if (arrayDeque != null) {
                    qt2Var.f58182b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw wq1.m24110f(it);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public or3 m11052n() throws GeneralSecurityException, IOException {
        if (((xi4) this.f37038f) == null) {
            v63.m23147y("cannot read or generate keyset");
            return null;
        }
        or3 or3Var = new or3(xj4.m24562B());
        xi4 xi4Var = (xi4) this.f37038f;
        synchronized (or3Var) {
            or3Var.m18307u(xi4Var.f68249a);
        }
        int iM10440z = sma.m21483a((xj4) or3Var.m18293D().f50064b).m11211x().m10440z();
        synchronized (or3Var) {
            for (int i = 0; i < ((xj4) ((uj4) or3Var.f54782a).f62440b).m24569y(); i++) {
                try {
                    wj4 wj4VarM24568x = ((xj4) ((uj4) or3Var.f54782a).f62440b).m24568x(i);
                    if (wj4VarM24568x.m24015A() == iM10440z) {
                        if (!wj4VarM24568x.m24017C().equals(KeyStatusType.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM10440z);
                        }
                        uj4 uj4Var = (uj4) or3Var.f54782a;
                        uj4Var.m22174d();
                        xj4.m24565v((xj4) uj4Var.f62440b, iM10440z);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iM10440z);
        }
        Context context = (Context) this.f37033a;
        String str = (String) this.f37034b;
        fs6 fs6Var = new fs6(context, str, (String) this.f37035c);
        if (((C3373ni) this.f37037e) == null) {
            q7d.m19713d(or3Var.m18293D(), fs6Var);
            return or3Var;
        }
        C3309ls c3309lsM18293D = or3Var.m18293D();
        C3373ni c3373ni = (C3373ni) this.f37037e;
        byte[] bArr = new byte[0];
        xj4 xj4Var = (xj4) c3309lsM18293D.f50064b;
        byte[] bArrMo9870a = c3373ni.mo9870a(xj4Var.m6432d(), bArr);
        try {
            if (!xj4.m24564D(c3373ni.mo9871b(bArrMo9870a, bArr), ox2.m18561a()).equals(xj4Var)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            es2 es2VarM12049y = fs2.m12049y();
            ByteString byteStringM6408g = ByteString.m6408g(bArrMo9870a, 0, bArrMo9870a.length);
            es2VarM12049y.m22174d();
            fs2.m12047v((fs2) es2VarM12049y.f62440b, byteStringM6408g);
            ek4 ek4VarM21483a = sma.m21483a(xj4Var);
            es2VarM12049y.m22174d();
            fs2.m12048w((fs2) es2VarM12049y.f62440b, ek4VarM21483a);
            if (((SharedPreferences.Editor) fs6Var.f39590b).putString(str, AbstractC3423or.m18272p(((fs2) es2VarM12049y.m22171a()).m6432d())).commit()) {
                return or3Var;
            }
            v63.m23133k("Failed to write to SharedPreferences");
            return null;
        } catch (InvalidProtocolBufferException unused) {
            v63.m23147y("invalid keyset, corrupted key material");
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m11053p(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.f37038f;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.f37033a);
        }
        m11051m(map, z);
    }

    /* JADX INFO: renamed from: q */
    public void m11054q(Throwable th, Thread thread, String str, fu2 fu2Var, boolean z) {
        boolean zEquals = str.equals("crash");
        xq1 xq1Var = (xq1) this.f37033a;
        long j = fu2Var.f39639b;
        Context context = xq1Var.f68528a;
        int i = context.getResources().getConfiguration().orientation;
        bl2 bl2Var = xq1Var.f68531d;
        Stack stack = new Stack();
        for (Throwable cause = th; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        ny8 ny8Var = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            ny8Var = new ny8(th2.getLocalizedMessage(), th2.getClass().getName(), bl2Var.mo3847c(th2.getStackTrace()), ny8Var, 16);
        }
        ny8 ny8Var2 = ny8Var;
        l30 l30Var = new l30();
        l30Var.f48953b = str;
        l30Var.f48952a = j;
        l30Var.f48958g = (byte) (l30Var.f48958g | 1);
        kq1 kq1VarM14503n = jj5.f45614e.m14503n(context);
        int i2 = ((w30) kq1VarM14503n).f66315c;
        Boolean boolValueOf = i2 > 0 ? Boolean.valueOf(i2 != 100) : null;
        ArrayList arrayListM14500m = jj5.m14500m(context);
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) ny8Var2.f53416d;
        String name = thread.getName();
        if (name == null) {
            C3386nv.m17635v("Null name");
            return;
        }
        List listM24639d = xq1.m24639d(stackTraceElementArr, 4);
        if (listM24639d == null) {
            C3386nv.m17635v("Null frames");
            return;
        }
        arrayList.add(new s30(4, name, listM24639d));
        if (z) {
            for (Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator(); it.hasNext(); it = it) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrMo3847c = bl2Var.mo3847c(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        C3386nv.m17635v("Null name");
                        return;
                    }
                    List listM24639d2 = xq1.m24639d(stackTraceElementArrMo3847c, 0);
                    if (listM24639d2 == null) {
                        C3386nv.m17635v("Null frames");
                        return;
                    }
                    arrayList.add(new s30(0, name2, listM24639d2));
                }
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        q30 q30VarM24638c = xq1.m24638c(ny8Var2, 0);
        r30 r30VarM24640e = xq1.m24640e();
        List listM24641a = xq1Var.m24641a();
        if (listM24641a == null) {
            C3386nv.m17635v("Null binaries");
            return;
        }
        l30Var.f48954c = new n30(new o30(listUnmodifiableList, q30VarM24638c, null, r30VarM24640e, listM24641a), null, null, boolValueOf, kq1VarM14503n, arrayListM14500m, i);
        l30Var.f48955d = xq1Var.m24642b(i);
        m30 m30VarM15768a = l30Var.m15768a();
        Map map = fu2Var.f39640c;
        b64 b64Var = (b64) this.f37036d;
        t33 t33Var = (t33) this.f37037e;
        rq1 rq1VarM11046i = m11046i(m11045h(m30VarM15768a, b64Var, t33Var, map), t33Var);
        if (z) {
            ((zq1) this.f37034b).m25744d(rq1VarM11046i, fu2Var.f39638a, zEquals);
        } else {
            ((C1149a) this.f37039g).f13669b.m9855a(new cw2(this, rq1VarM11046i, fu2Var, zEquals));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11055r() {
        HashMap map = (HashMap) this.f37034b;
        HashMap map2 = (HashMap) this.f37035c;
        for (hc1 hc1Var : ((HashMap) this.f37033a).keySet()) {
            for (lb2 lb2Var : hc1Var.f42155c) {
                boolean z = lb2Var.f49391b == 2;
                rp7 rp7Var = lb2Var.f49390a;
                if (z && !map2.containsKey(rp7Var)) {
                    Set set = Collections.EMPTY_SET;
                    pv4 pv4Var = new pv4();
                    pv4Var.f56854b = null;
                    pv4Var.f56853a = Collections.newSetFromMap(new ConcurrentHashMap());
                    pv4Var.f56853a.addAll(set);
                    map2.put(rp7Var, pv4Var);
                } else if (map.containsKey(rp7Var)) {
                    continue;
                } else {
                    int i = lb2Var.f49391b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + hc1Var + ": " + rp7Var);
                    }
                    if (i != 2) {
                        map.put(rp7Var, new qz6(qz6.f58421c, qz6.f58422d));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public ArrayList m11056s(ArrayList arrayList) {
        HashMap map = (HashMap) this.f37034b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hc1 hc1Var = (hc1) it.next();
            if (hc1Var.f42157e == 0) {
                uo7 uo7Var = (uo7) ((HashMap) this.f37033a).get(hc1Var);
                for (rp7 rp7Var : hc1Var.f42154b) {
                    if (map.containsKey(rp7Var)) {
                        arrayList2.add(new RunnableC3470pr(6, (qz6) ((uo7) map.get(rp7Var)), uo7Var));
                    } else {
                        map.put(rp7Var, uo7Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: t */
    public ArrayList m11057t() {
        HashMap map = (HashMap) this.f37035c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.f37033a).entrySet()) {
            hc1 hc1Var = (hc1) entry.getKey();
            if (hc1Var.f42157e != 0) {
                uo7 uo7Var = (uo7) entry.getValue();
                for (rp7 rp7Var : hc1Var.f42154b) {
                    if (!map2.containsKey(rp7Var)) {
                        map2.put(rp7Var, new HashSet());
                    }
                    ((Set) map2.get(rp7Var)).add(uo7Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                pv4 pv4Var = (pv4) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC3470pr(7, pv4Var, (uo7) it.next()));
                }
            } else {
                rp7 rp7Var2 = (rp7) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                pv4 pv4Var2 = new pv4();
                pv4Var2.f56854b = null;
                pv4Var2.f56853a = Collections.newSetFromMap(new ConcurrentHashMap());
                pv4Var2.f56853a.addAll(set);
                map.put(rp7Var2, pv4Var2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public or3 m11058u(byte[] bArr) {
        try {
            this.f37037e = new C3410oi().m18031c((String) this.f37036d);
            try {
                return new or3((uj4) ((xj4) C3309ls.m16479H(vqb.m23466D(bArr), (C3373ni) this.f37037e).f50064b).m6552u());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return new or3((uj4) ((xj4) q7d.m19712c(vqb.m23466D(bArr)).f50064b).m6552u());
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                or3 or3Var = new or3((uj4) ((xj4) q7d.m19712c(vqb.m23466D(bArr)).f50064b).m6552u());
                Object obj = qn3.f57970c;
                Log.w("qn3", "cannot use Android Keystore, it'll be disabled", e2);
                return or3Var;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public C3373ni m11059v() throws KeyStoreException {
        Object obj = qn3.f57970c;
        C3410oi c3410oi = new C3410oi();
        try {
            boolean zM18029a = C3410oi.m18029a((String) this.f37036d);
            try {
                return c3410oi.m18031c((String) this.f37036d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zM18029a) {
                    throw new KeyStoreException(wq1.m24118n("the master key ", (String) this.f37036d, " exists but is unusable"), e);
                }
                Object obj2 = qn3.f57970c;
                Log.w("qn3", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = qn3.f57970c;
            Log.w("qn3", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public tld m11060w(String str, Executor executor) {
        wr9 wr9Var;
        ArrayList<File> arrayListM25742b = ((zq1) this.f37034b).m25742b();
        ArrayList<y20> arrayList = new ArrayList();
        for (File file : arrayListM25742b) {
            try {
                yq1 yq1Var = zq1.f71958g;
                String strM25740e = zq1.m25740e(file);
                yq1Var.getClass();
                arrayList.add(y20.m24849a(yq1.m25281i(strM25740e), file.getName(), file));
            } catch (IOException e) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (y20 y20VarM24849a : arrayList) {
            if (str == null || str.equals(y20VarM24849a.m24852d())) {
                o02 o02Var = (o02) this.f37035c;
                int i = 1;
                if (((x20) y20VarM24849a.m24850b()).f67660f == null || ((x20) y20VarM24849a.m24850b()).f67661g == null) {
                    t43 t43VarM10756b = ((dz3) this.f37038f).m10756b(true);
                    vq1 vq1VarM24850b = y20VarM24849a.m24850b();
                    String str2 = t43VarM10756b.f61849a;
                    w20 w20VarMo23463a = vq1VarM24850b.mo23463a();
                    w20VarMo23463a.f66241e = str2;
                    x20 x20VarM23675a = w20VarMo23463a.m23675a();
                    String str3 = t43VarM10756b.f61850b;
                    w20 w20VarMo23463a2 = x20VarM23675a.mo23463a();
                    w20VarMo23463a2.f66242f = str3;
                    y20VarM24849a = y20.m24849a(w20VarMo23463a2.m23675a(), y20VarM24849a.m24852d(), y20VarM24849a.m24851c());
                }
                boolean z = str != null;
                v68 v68Var = o02Var.f53507a;
                synchronized (v68Var.f64944f) {
                    try {
                        wr9Var = new wr9();
                        if (z) {
                            ((AtomicInteger) v68Var.f64947i.f8655a).getAndIncrement();
                            if (v68Var.f64944f.size() < v68Var.f64943e) {
                                iy5 iy5Var = iy5.f44770f;
                                iy5Var.m14205e("Enqueueing report: " + y20VarM24849a.m24852d());
                                iy5Var.m14205e("Queue size: " + v68Var.f64944f.size());
                                v68Var.f64945g.execute(new kr3(v68Var, y20VarM24849a, wr9Var, i));
                                iy5Var.m14205e("Closing task for report: " + y20VarM24849a.m24852d());
                                wr9Var.m24140d(y20VarM24849a);
                            } else {
                                v68Var.m23152a();
                                String str4 = "Dropping report due to queue being full: " + y20VarM24849a.m24852d();
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) v68Var.f64947i.f8656b).getAndIncrement();
                                wr9Var.m24140d(y20VarM24849a);
                            }
                        } else {
                            v68Var.m23153b(y20VarM24849a, wr9Var);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                arrayList2.add(wr9Var.f67208a.mo5964f(executor, new fg2(this)));
            }
        }
        return Tasks.m5976d(arrayList2);
    }

    public ed1() {
        this.f37033a = null;
        this.f37034b = null;
        this.f37035c = null;
        this.f37036d = null;
        this.f37037e = null;
        this.f37038f = null;
    }
}
