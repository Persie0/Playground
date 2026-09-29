package p387t0;

import ae.C0062b;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import cc.C1834h4;
import cc.C1842i3;
import cc.C1860k3;
import cc.C1897o4;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.PersistedEvents;
import com.google.android.exoplayer2.source.InterfaceC2500q;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import dm.C5207g;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import je.InterfaceC6465a;
import org.json.JSONObject;
import p047ce.InterfaceC1999a;
import p067d8.C5055a;
import p152hb.C5992n;
import p152hb.InterfaceC6026y0;
import p173i8.C6205a;
import p291o7.C8004n;
import p317p7.C8205l;
import p339qe.C8597b;
import p442vo.C9768d;
import p467wo.C9991f;

/* JADX INFO: renamed from: t0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C9166r implements InterfaceC2500q, InterfaceC6026y0, InterfaceC6465a {

    /* JADX INFO: renamed from: a */
    public Object f47694a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9166r(int i10) {
        this(5, 5L, TimeUnit.MINUTES);
        if (i10 == 1) {
            this.f47694a = new HashMap();
        } else if (i10 != 7) {
            if (i10 != 10) {
                this.f47694a = new C9139d();
            }
        }
    }

    public C9166r(int i10, long j10, TimeUnit timeUnit) {
        C5207g.m11111f(timeUnit, "timeUnit");
        this.f47694a = new C9991f(C9768d.f49841i, i10, j10, timeUnit);
    }

    public C9166r(ViewGroup viewGroup) {
        this.f47694a = viewGroup.getOverlay();
    }

    public /* synthetic */ C9166r(C5992n c5992n) {
        this.f47694a = c5992n;
    }

    public /* synthetic */ C9166r(Object obj) {
        this.f47694a = obj;
    }

    public C9166r(List list) {
        this.f47694a = list;
    }

    public C9166r(C8597b c8597b) {
        this.f47694a = new File(c8597b.f46076b, "com.crashlytics.settings.json");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001f, B:12:0x0024, B:14:0x002b, B:16:0x0041, B:17:0x004e, B:19:0x0054, B:9:0x0019, B:6:0x000a), top: B:28:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[Catch: all -> 0x0064, LOOP:1: B:17:0x004e->B:19:0x0054, LOOP_END, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x001f, B:12:0x0024, B:14:0x002b, B:16:0x0041, B:17:0x004e, B:19:0x0054, B:9:0x0019, B:6:0x000a), top: B:28:0x0001, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0024 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final synchronized void m17486a(PersistedEvents persistedEvents) {
        Set<Map.Entry<AccessTokenAppIdPair, List<AppEvent>>> setEntrySet;
        C8205l c8205lM17489s;
        Iterator<AppEvent> it;
        if (!C6205a.m12742b(persistedEvents)) {
            try {
                setEntrySet = persistedEvents.f11489a.entrySet();
                C5207g.m11110e(setEntrySet, "events.entries");
            } catch (Throwable th2) {
                C6205a.m12741a(persistedEvents, th2);
                setEntrySet = null;
            }
            for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : setEntrySet) {
                c8205lM17489s = m17489s(entry.getKey());
                if (c8205lM17489s != null) {
                    it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        c8205lM17489s.m16342a(it.next());
                    }
                }
            }
        }
        setEntrySet = null;
        while (r3.hasNext()) {
            c8205lM17489s = m17489s(entry.getKey());
            if (c8205lM17489s != null) {
                it = entry.getValue().iterator();
                while (it.hasNext()) {
                    c8205lM17489s.m16342a(it.next());
                }
            }
        }
    }

    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: b */
    public final void mo12424b(Bundle bundle) {
        ((C5992n) this.f47694a).f35559m.lock();
        try {
            C5992n c5992n = (C5992n) this.f47694a;
            Bundle bundle2 = c5992n.f35555i;
            if (bundle2 == null) {
                c5992n.f35555i = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            Object obj = this.f47694a;
            ((C5992n) obj).f35556j = ConnectionResult.f13855e;
            C5992n.m12445k((C5992n) obj);
            ((C5992n) this.f47694a).f35559m.unlock();
        } catch (Throwable th2) {
            ((C5992n) this.f47694a).f35559m.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: c */
    public final void mo12425c(int i10, boolean z10) {
        Lock lock;
        ConnectionResult connectionResult;
        ((C5992n) this.f47694a).f35559m.lock();
        try {
            C5992n c5992n = (C5992n) this.f47694a;
            if (c5992n.f35558l || (connectionResult = c5992n.f35557k) == null || !connectionResult.m7529C()) {
                Object obj = this.f47694a;
                ((C5992n) obj).f35558l = false;
                C5992n.m12444j((C5992n) obj, i10, z10);
                lock = ((C5992n) this.f47694a).f35559m;
            } else {
                Object obj2 = this.f47694a;
                ((C5992n) obj2).f35558l = true;
                ((C5992n) obj2).f35551e.mo12398h(i10);
                lock = ((C5992n) this.f47694a).f35559m;
            }
            lock.unlock();
        } catch (Throwable th2) {
            ((C5992n) this.f47694a).f35559m.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: d */
    public final long mo7251d() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC2500q interfaceC2500q : (InterfaceC2500q[]) this.f47694a) {
            long jMo7251d = interfaceC2500q.mo7251d();
            if (jMo7251d != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7251d);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX INFO: renamed from: e */
    public final C9139d m17487e() {
        return (C9139d) this.f47694a;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: h */
    public final boolean mo7254h(long j10) {
        boolean zMo7254h;
        boolean z10 = false;
        do {
            long jMo7251d = mo7251d();
            if (jMo7251d == Long.MIN_VALUE) {
                break;
            }
            zMo7254h = false;
            for (InterfaceC2500q interfaceC2500q : (InterfaceC2500q[]) this.f47694a) {
                long jMo7251d2 = interfaceC2500q.mo7251d();
                boolean z11 = jMo7251d2 != Long.MIN_VALUE && jMo7251d2 <= j10;
                if (jMo7251d2 == jMo7251d || z11) {
                    zMo7254h |= interfaceC2500q.mo7254h(j10);
                }
            }
            z10 |= zMo7254h;
        } while (zMo7254h);
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC6026y0
    /* JADX INFO: renamed from: i */
    public final void mo12426i(ConnectionResult connectionResult) {
        ((C5992n) this.f47694a).f35559m.lock();
        try {
            Object obj = this.f47694a;
            ((C5992n) obj).f35556j = connectionResult;
            C5992n.m12445k((C5992n) obj);
            C5992n c5992n = (C5992n) this.f47694a;
        } finally {
            ((C5992n) this.f47694a).f35559m.unlock();
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    public final boolean isLoading() {
        for (InterfaceC2500q interfaceC2500q : (InterfaceC2500q[]) this.f47694a) {
            if (interfaceC2500q.isLoading()) {
                return true;
            }
        }
        return false;
    }

    @Override // je.InterfaceC6465a
    /* JADX INFO: renamed from: p */
    public final void mo13074p(Bundle bundle) {
        ((InterfaceC1999a) this.f47694a).mo5934b("clx", "_ae", bundle);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized int m17488q() {
        int i10;
        int size;
        try {
            i10 = 0;
            for (C8205l c8205l : ((HashMap) this.f47694a).values()) {
                synchronized (c8205l) {
                    if (!C6205a.m12742b(c8205l)) {
                        try {
                            size = c8205l.f44405c.size();
                        } catch (Throwable th2) {
                            C6205a.m12741a(c8205l, th2);
                            size = 0;
                            i10 += size;
                        }
                    }
                    size = 0;
                }
                i10 += size;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: r */
    public final long mo7261r() {
        long jMin = Long.MAX_VALUE;
        for (InterfaceC2500q interfaceC2500q : (InterfaceC2500q[]) this.f47694a) {
            long jMo7261r = interfaceC2500q.mo7261r();
            if (jMo7261r != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jMo7261r);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    /* JADX INFO: renamed from: s */
    public final synchronized C8205l m17489s(AccessTokenAppIdPair accessTokenAppIdPair) {
        try {
            C8205l c8205l = (C8205l) ((HashMap) this.f47694a).get(accessTokenAppIdPair);
            if (c8205l == null) {
                Context contextM15871a = C8004n.m15871a();
                C5055a c5055a = C5055a.f32901f;
                C5055a c5055aM10738a = C5055a.a.m10738a(contextM15871a);
                if (c5055aM10738a != null) {
                    c8205l = new C8205l(c5055aM10738a, C0062b.m328Z0(contextM15871a));
                }
            }
            if (c8205l == null) {
                return null;
            }
            ((HashMap) this.f47694a).put(accessTokenAppIdPair, c8205l);
            return c8205l;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2500q
    /* JADX INFO: renamed from: t */
    public final void mo7262t(long j10) {
        for (InterfaceC2500q interfaceC2500q : (InterfaceC2500q[]) this.f47694a) {
            interfaceC2500q.mo7262t(j10);
        }
    }

    /* JADX INFO: renamed from: u */
    public final synchronized Set m17490u() {
        Set setKeySet;
        try {
            setKeySet = ((HashMap) this.f47694a).keySet();
            C5207g.m11110e(setKeySet, "stateMap.keys");
        } catch (Throwable th2) {
            throw th2;
        }
        return setKeySet;
    }

    /* JADX INFO: renamed from: v */
    public final JSONObject m17491v() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f47694a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(CommonUtils.m9160l(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        CommonUtils.m9149a(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    CommonUtils.m9149a(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            CommonUtils.m9149a(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.m9149a(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m17492w(int i10, String str, List list, boolean z10, boolean z11) {
        C1842i3 c1842i3;
        int i11 = i10 - 1;
        if (i11 == 0) {
            C1860k3 c1860k3 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1842i3 = c1860k3.f9937H;
        } else if (i11 != 1) {
            if (i11 == 3) {
                C1860k3 c1860k4 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
                C1897o4.m5776k(c1860k4);
                c1842i3 = c1860k4.f9938I;
            } else if (i11 != 4) {
                C1860k3 c1860k5 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
                C1897o4.m5776k(c1860k5);
                c1842i3 = c1860k5.f9948l;
            } else if (z10) {
                C1860k3 c1860k6 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
                C1897o4.m5776k(c1860k6);
                c1842i3 = c1860k6.f9946j;
            } else if (z11) {
                C1860k3 c1860k7 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
                C1897o4.m5776k(c1860k7);
                c1842i3 = c1860k7.f9945i;
            } else {
                C1860k3 c1860k8 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
                C1897o4.m5776k(c1860k8);
                c1842i3 = c1860k8.f9947k;
            }
        } else if (z10) {
            C1860k3 c1860k9 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
            C1897o4.m5776k(c1860k9);
            c1842i3 = c1860k9.f9943g;
        } else if (z11) {
            C1860k3 c1860k10 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
            C1897o4.m5776k(c1860k10);
            c1842i3 = c1860k10.f9942f;
        } else {
            C1860k3 c1860k11 = ((C1897o4) ((C1834h4) this.f47694a).f10430a).f10086i;
            C1897o4.m5776k(c1860k11);
            c1842i3 = c1860k11.f9944h;
        }
        int size = list.size();
        if (size == 1) {
            c1842i3.m5624b(list.get(0), str);
            return;
        }
        if (size == 2) {
            c1842i3.m5625c(list.get(0), list.get(1), str);
        } else if (size != 3) {
            c1842i3.m5623a(str);
        } else {
            c1842i3.m5626d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
