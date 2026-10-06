package p000;

import android.os.SystemClock;
import android.os.Trace;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import android.view.Surface;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p021j$.util.DesugarCollections;

/* JADX INFO: renamed from: ty */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1028ty implements InterfaceC1014tk {

    /* JADX INFO: renamed from: a */
    public final oqs f47701a;

    /* JADX INFO: renamed from: c */
    public InterfaceC1016tm f47703c;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1082vy f47705e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1023tt f47706f;

    /* JADX INFO: renamed from: j */
    private C1069vl f47710j;

    /* JADX INFO: renamed from: k */
    private C1024tu f47711k;

    /* JADX INFO: renamed from: l */
    private Map f47712l;

    /* JADX INFO: renamed from: m */
    private Map f47713m;

    /* JADX INFO: renamed from: n */
    private Map f47714n;

    /* JADX INFO: renamed from: p */
    private final C1058va f47716p;

    /* JADX INFO: renamed from: q */
    private final bck f47717q;

    /* JADX INFO: renamed from: g */
    private final int f47707g = C1029tz.f47718a.m18846b();

    /* JADX INFO: renamed from: b */
    public final Object f47702b = new Object();

    /* JADX INFO: renamed from: h */
    private final opn f47708h = ook.m18796j(false);

    /* JADX INFO: renamed from: i */
    private final Map f47709i = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    public int f47704d = 1;

    /* JADX INFO: renamed from: o */
    private final Map f47715o = new LinkedHashMap();

    public C1028ty(InterfaceC1082vy interfaceC1082vy, InterfaceC1023tt interfaceC1023tt, bck bckVar, C1058va c1058va, oqs oqsVar, byte[] bArr, byte[] bArr2) {
        this.f47705e = interfaceC1082vy;
        this.f47706f = interfaceC1023tt;
        this.f47717q = bckVar;
        this.f47716p = c1058va;
        this.f47701a = oqsVar;
    }

    /* JADX INFO: renamed from: g */
    private final void m19450g() throws Exception {
        List listM18673M;
        synchronized (this.f47702b) {
            listM18673M = omn.m18673M(this.f47715o.values());
            this.f47715o.clear();
        }
        Iterator it = listM18673M.iterator();
        while (it.hasNext()) {
            ((AutoCloseable) it.next()).close();
        }
    }

    @Override // p000.InterfaceC1014tk
    /* JADX INFO: renamed from: a */
    public final void mo19449a() throws Exception {
        if (this.f47708h.m18856d(false, true)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" Finalizing Session");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            String str = YmzeHXaMYOLk.UWyQlA;
            sb2.append(str);
            Trace.beginSection(toString().concat(str));
            m19453d();
            m19450g();
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, sb] */
    /* JADX INFO: renamed from: b */
    public final void m19451b(InterfaceC1015tl interfaceC1015tl) {
        synchronized (this.f47702b) {
            int i = this.f47704d;
            if (i != 4 && i != 5) {
                C1024tu c1024tu = this.f47711k;
                if (c1024tu == null && interfaceC1015tl != null) {
                    bck bckVar = this.f47717q;
                    Map map = this.f47709i;
                    map.getClass();
                    c1024tu = new C1024tu(interfaceC1015tl, new C1091wg(new C1007td(interfaceC1015tl, (drj) bckVar.f2949b, map, bckVar.f2948a, null, null)));
                    this.f47711k = c1024tu;
                }
                if (this.f47704d == 3 && c1024tu != null) {
                    boolean z = (this.f47712l == null || this.f47713m == null) ? false : true;
                    if (z) {
                        m19454e(false);
                    }
                    synchronized (this.f47702b) {
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        C1069vl c1069vl = this.f47710j;
                        c1069vl.getClass();
                        long j = jElapsedRealtimeNanos - c1069vl.f47850a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Configured ");
                        sb.append(this);
                        sb.append(" in ");
                        String str = "%.3f ms";
                        Object[] objArr = new Object[1];
                        double d = j;
                        Double.isNaN(d);
                        objArr[0] = Double.valueOf(d / 1000000.0d);
                        C1091wg c1091wg = null;
                        String str2 = String.format(null, str, Arrays.copyOf(objArr, 1));
                        str2.getClass();
                        sb.append(str2);
                        InterfaceC1082vy interfaceC1082vy = this.f47705e;
                        C1091wg c1091wg2 = c1024tu.f47697b;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(interfaceC1082vy);
                        sb2.append(" onGraphStarted");
                        ((C1090wf) interfaceC1082vy).f47909d.mo19087d(C0963rn.f47558a);
                        synchronized (((C1090wf) interfaceC1082vy).f47906a) {
                            if (((C1090wf) interfaceC1082vy).f47908c) {
                                c1091wg2.m19523a();
                            } else {
                                C1091wg c1091wg3 = ((C1090wf) interfaceC1082vy).f47907b;
                                if (c1091wg3 != null && c1091wg3 != c1091wg2) {
                                    c1091wg = c1091wg3;
                                }
                                ((C1090wf) interfaceC1082vy).f47907b = c1091wg2;
                                if (c1091wg != null) {
                                    synchronized (c1091wg) {
                                        c1091wg.m19523a();
                                    }
                                }
                                ((C1090wf) interfaceC1082vy).m19520f();
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m19453d() throws Exception {
        C1024tu c1024tu;
        InterfaceC1016tm interfaceC1016tm;
        synchronized (this.f47702b) {
            int i = this.f47704d;
            if (i == 4 || i == 5) {
                c1024tu = null;
            } else {
                this.f47704d = 4;
                c1024tu = this.f47711k;
                this.f47711k = null;
            }
        }
        C1091wg c1091wg = c1024tu != null ? c1024tu.f47697b : null;
        if (c1091wg != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" Shutdown");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            String str = voNZjxiJou.navWrRijTR;
            sb2.append(str);
            Trace.beginSection(toString().concat(str));
            StringBuilder sb3 = new StringBuilder();
            InterfaceC1082vy interfaceC1082vy = this.f47705e;
            sb3.append(interfaceC1082vy);
            sb3.append("#onGraphStopped");
            Trace.beginSection(interfaceC1082vy.toString().concat("#onGraphStopped"));
            InterfaceC1082vy interfaceC1082vy2 = this.f47705e;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(interfaceC1082vy2);
            sb4.append(" onGraphStopped");
            C1090wf c1090wf = (C1090wf) interfaceC1082vy2;
            c1090wf.f47909d.mo19087d(C0965rp.f47560a);
            synchronized (c1090wf.f47906a) {
                if (!((C1090wf) interfaceC1082vy2).f47908c) {
                    C1091wg c1091wg2 = ((C1090wf) interfaceC1082vy2).f47907b;
                    if (c1091wg == c1091wg2) {
                        ((C1090wf) interfaceC1082vy2).f47907b = null;
                    } else {
                        Log.w("CXCP", "Refusing to detach " + c1091wg + ". It is different from " + ((C1090wf) interfaceC1082vy2).f47907b);
                        c1091wg2 = null;
                    }
                    if (c1091wg2 != null) {
                        synchronized (c1091wg2) {
                            c1091wg2.m19523a();
                        }
                    }
                }
            }
            Trace.endSection();
            Trace.endSection();
        }
        synchronized (this.f47702b) {
            interfaceC1016tm = this.f47703c;
            this.f47703c = null;
            this.f47704d = 5;
        }
        if (interfaceC1016tm == null) {
            m19450g();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19454e(boolean z) {
        C1024tu c1024tu;
        Map map;
        Map map2;
        boolean z2;
        synchronized (this.f47702b) {
            c1024tu = this.f47711k;
            map = this.f47712l;
            map2 = this.f47713m;
        }
        if (c1024tu == null || map == null || map2 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("#finalizeOutputConfigurations");
        Trace.beginSection(toString().concat("#finalizeOutputConfigurations"));
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            int i = ((C0979sc) entry.getKey()).f47572a;
            C0991so c0991so = (C0991so) entry.getValue();
            Object obj = map2.get(C0979sc.m19386a(i));
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            c0991so.m19405a((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((C0991so) ((Map.Entry) it.next()).getValue());
        }
        c1024tu.f47696a.mo19394h(omn.m18673M(linkedHashSet));
        synchronized (this.f47702b) {
            z2 = false;
            if (this.f47704d == 3) {
                this.f47709i.putAll(map2);
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finalized ");
                ArrayList arrayList = new ArrayList(map.size());
                Iterator it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(C0979sc.m19386a(((C0979sc) ((Map.Entry) it2.next()).getKey()).f47572a));
                }
                sb2.append(arrayList);
                sb2.append(" for ");
                sb2.append(this);
                sb2.append(" in ");
                String str = "%.3f ms";
                Object[] objArr = new Object[1];
                double d = jElapsedRealtimeNanos2;
                Double.isNaN(d);
                objArr[0] = Double.valueOf(d / 1000000.0d);
                String str2 = String.format(null, str, Arrays.copyOf(objArr, 1));
                str2.getClass();
                sb2.append(str2);
                z2 = true;
            }
        }
        if (z2 && z) {
            InterfaceC1082vy interfaceC1082vy = this.f47705e;
            C1091wg c1091wg = c1024tu.f47697b;
            C1090wf c1090wf = (C1090wf) interfaceC1082vy;
            synchronized (c1090wf.f47906a) {
                if (!((C1090wf) interfaceC1082vy).f47908c && c1091wg == ((C1090wf) interfaceC1082vy).f47907b) {
                    c1090wf.m19520f();
                }
            }
        }
        Trace.endSection();
    }

    /* JADX INFO: renamed from: f */
    public final void m19455f() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f47702b) {
            if (this.f47704d != 1) {
                return;
            }
            Map map = this.f47714n;
            InterfaceC1016tm interfaceC1016tm = this.f47703c;
            if (map == null || interfaceC1016tm == null) {
                return;
            }
            this.f47704d = 2;
            this.f47710j = C1069vl.m19504a(SystemClock.elapsedRealtimeNanos());
            StringBuilder sb = new StringBuilder();
            sb.append("Creating CameraCaptureSession from ");
            C0983sg c0983sg = (C0983sg) interfaceC1016tm;
            String str = c0983sg.f47578c;
            sb.append((Object) (str == null ? "null" : C0952rc.m19373b(str)));
            sb.append(" using ");
            sb.append(this);
            sb.append(" with ");
            sb.append(map);
            try {
                Trace.beginSection(EArqVBjecl.Bjwel + c0983sg.f47578c + "#createCaptureSession");
                Map mapMo19404a = this.f47706f.mo19404a(interfaceC1016tm, map, this);
                Trace.endSection();
                synchronized (this.f47702b) {
                    int i = this.f47704d;
                    if (i != 4 && i != 5) {
                        if (i != 2) {
                            throw new IllegalStateException("Unexpected state: " + ((Object) C0769ki.m14306b(this.f47704d)));
                        }
                        this.f47704d = 3;
                        this.f47709i.putAll(map);
                        if (!mapMo19404a.isEmpty()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(VzWFSVj.OJStSoiv);
                            sb2.append(this);
                            sb2.append(" with ");
                            sb2.append(omn.m18673M(map.keySet()));
                            sb2.append(". Waiting to finalize ");
                            sb2.append(omn.m18673M(mapMo19404a.keySet()));
                            this.f47712l = mapMo19404a;
                            Map map2 = this.f47714n;
                            if (map2 != null) {
                                linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map2.entrySet()) {
                                    if (mapMo19404a.containsKey(entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            } else {
                                linkedHashMap = null;
                            }
                            if (linkedHashMap != null && linkedHashMap.size() == mapMo19404a.size()) {
                                this.f47713m = linkedHashMap;
                            }
                        }
                        m19451b(null);
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Warning: ");
                    sb3.append(this);
                    sb3.append(" was ");
                    sb3.append((Object) C0769ki.m14306b(this.f47704d));
                    sb3.append(" while configuration was in progress.");
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final String toString() {
        return "CaptureSessionState-" + this.f47707g;
    }

    /* JADX INFO: renamed from: c */
    public final void m19452c(Map map) {
        AutoCloseable autoCloseable;
        Surface surface;
        synchronized (this.f47702b) {
            int i = this.f47704d;
            if (i != 4 && i != 5) {
                Map map2 = this.f47714n;
                if (map2 == null) {
                    map2 = okw.f46216a;
                }
                Set setM18675O = omn.m18675O(map2.values());
                Set setM18675O2 = omn.m18675O(map.values());
                Iterator it = omn.m18719x(setM18675O, setM18675O2).iterator();
                do {
                    autoCloseable = null;
                    if (it.hasNext()) {
                        surface = (Surface) it.next();
                        AutoCloseable autoCloseable2 = (AutoCloseable) this.f47715o.remove(surface);
                        if (autoCloseable2 != null) {
                            autoCloseable2.close();
                            autoCloseable = autoCloseable2;
                        }
                    } else {
                        for (Surface surface2 : omn.m18719x(setM18675O2, setM18675O)) {
                            this.f47715o.put(surface2, this.f47716p.m19474b(surface2));
                        }
                        this.f47714n = map;
                        Map map3 = this.f47712l;
                        if (map3 != null && this.f47713m == null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry : map.entrySet()) {
                                if (map3.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (linkedHashMap.size() == map3.size()) {
                                this.f47713m = linkedHashMap;
                                ooc.m18746l(this.f47701a, null, new C1026tw(this, null), 3);
                            }
                        }
                        ooc.m18746l(this.f47701a, null, new C1027tx(this, null), 3);
                    }
                } while (autoCloseable != null);
                throw new IllegalStateException("Surface " + surface + " doesn't have a matching surface token!");
            }
        }
    }
}
