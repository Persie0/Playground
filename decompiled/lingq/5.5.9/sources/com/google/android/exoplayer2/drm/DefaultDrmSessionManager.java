package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.activity.RunnableC0183b;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.upstream.C2527a;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import p150h9.C5903b;
import p174i9.C6215e0;
import p213k4.RunnableC6590j;
import p239l9.C7291f;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10147p;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSessionManager implements InterfaceC2399c {

    /* JADX INFO: renamed from: b */
    public final UUID f12153b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2402f.c f12154c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2405i f12155d;

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> f12156e;

    /* JADX INFO: renamed from: f */
    public final boolean f12157f;

    /* JADX INFO: renamed from: g */
    public final int[] f12158g;

    /* JADX INFO: renamed from: h */
    public final boolean f12159h;

    /* JADX INFO: renamed from: i */
    public final C2393d f12160i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2528b f12161j;

    /* JADX INFO: renamed from: k */
    public final C2394e f12162k;

    /* JADX INFO: renamed from: l */
    public final long f12163l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f12164m;

    /* JADX INFO: renamed from: n */
    public final Set<C2392c> f12165n;

    /* JADX INFO: renamed from: o */
    public final Set<DefaultDrmSession> f12166o;

    /* JADX INFO: renamed from: p */
    public int f12167p;

    /* JADX INFO: renamed from: q */
    public InterfaceC2402f f12168q;

    /* JADX INFO: renamed from: r */
    public DefaultDrmSession f12169r;

    /* JADX INFO: renamed from: s */
    public DefaultDrmSession f12170s;

    /* JADX INFO: renamed from: t */
    public Looper f12171t;

    /* JADX INFO: renamed from: u */
    public Handler f12172u;

    /* JADX INFO: renamed from: v */
    public int f12173v;

    /* JADX INFO: renamed from: w */
    public byte[] f12174w;

    /* JADX INFO: renamed from: x */
    public C6215e0 f12175x;

    /* JADX INFO: renamed from: y */
    public volatile HandlerC2391b f12176y;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a */
    public class C2390a implements InterfaceC2402f.b {
        public C2390a() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$b */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC2391b extends Handler {
        public HandlerC2391b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f12164m) {
                if (Arrays.equals(defaultDrmSession.f12142u, bArr)) {
                    if (message.what == 2) {
                        if (defaultDrmSession.f12126e != 0 || defaultDrmSession.f12136o != 4) {
                            break;
                            break;
                        } else {
                            int i10 = C10134c0.f51354a;
                            defaultDrmSession.m6931a(false);
                            break;
                        }
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$c */
    public class C2392c implements InterfaceC2399c.b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC2398b.a f12179a;

        /* JADX INFO: renamed from: b */
        public DrmSession f12180b;

        /* JADX INFO: renamed from: c */
        public boolean f12181c;

        public C2392c(InterfaceC2398b.a aVar) {
            this.f12179a = aVar;
        }

        @Override // com.google.android.exoplayer2.drm.InterfaceC2399c.b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f12172u;
            handler.getClass();
            C10134c0.m19029N(handler, new RunnableC0183b(11, this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$d */
    public class C2393d implements DefaultDrmSession.InterfaceC2385a {

        /* JADX INFO: renamed from: a */
        public final HashSet f12183a = new HashSet();

        /* JADX INFO: renamed from: b */
        public DefaultDrmSession f12184b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final void m6955a(Exception exc, boolean z10) {
            this.f12184b = null;
            HashSet hashSet = this.f12183a;
            ImmutableList immutableListM9060Q = ImmutableList.m9060Q(hashSet);
            hashSet.clear();
            ImmutableList.C3147b c3147bListIterator = immutableListM9060Q.listIterator(0);
            while (c3147bListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) c3147bListIterator.next();
                defaultDrmSession.getClass();
                defaultDrmSession.m6933c(z10 ? 1 : 3, exc);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSessionManager$e */
    public class C2394e implements DefaultDrmSession.InterfaceC2386b {
        public C2394e() {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, InterfaceC2402f.c cVar, C2404h c2404h, HashMap map, boolean z10, int[] iArr, boolean z11, C2527a c2527a, long j10) {
        uuid.getClass();
        C10129a.m18989a("Use C.CLEARKEY_UUID instead", !C5903b.f35259b.equals(uuid));
        this.f12153b = uuid;
        this.f12154c = cVar;
        this.f12155d = c2404h;
        this.f12156e = map;
        this.f12157f = z10;
        this.f12158g = iArr;
        this.f12159h = z11;
        this.f12161j = c2527a;
        this.f12160i = new C2393d();
        this.f12162k = new C2394e();
        this.f12173v = 0;
        this.f12164m = new ArrayList();
        this.f12165n = Collections.newSetFromMap(new IdentityHashMap());
        this.f12166o = Collections.newSetFromMap(new IdentityHashMap());
        this.f12163l = j10;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m6945f(DefaultDrmSession defaultDrmSession) {
        if (defaultDrmSession.f12136o == 1) {
            if (C10134c0.f51354a < 19) {
                return true;
            }
            DrmSession.DrmSessionException drmSessionExceptionMo6936f = defaultDrmSession.mo6936f();
            drmSessionExceptionMo6936f.getClass();
            if (drmSessionExceptionMo6936f.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static ArrayList m6946i(DrmInitData drmInitData, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(drmInitData.f12189d);
        for (int i10 = 0; i10 < drmInitData.f12189d; i10++) {
            DrmInitData.SchemeData schemeData = drmInitData.f12186a[i10];
            if ((schemeData.m6957a(uuid) || (C5903b.f35260c.equals(uuid) && schemeData.m6957a(C5903b.f35259b))) && (schemeData.f12194e != null || z10)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[PHI: r2
      0x00a7: PHI (r2v2 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v3 boolean) binds: [B:37:0x0099, B:34:0x008f, B:22:0x0049, B:24:0x0058, B:41:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if ("cens".equals(r10) != false) goto L43;
     */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo6947a(C2416m c2416m) {
        String str;
        InterfaceC2402f interfaceC2402f = this.f12168q;
        interfaceC2402f.getClass();
        int iMo6983l = interfaceC2402f.mo6983l();
        DrmInitData drmInitData = c2416m.f12453J;
        boolean z10 = false;
        if (drmInitData == null) {
            int iM19108h = C10147p.m19108h(c2416m.f12484l);
            int i10 = 0;
            while (true) {
                int[] iArr = this.f12158g;
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iM19108h) {
                    break;
                }
                i10++;
            }
            if (i10 != -1) {
                return iMo6983l;
            }
            return 0;
        }
        if (this.f12174w == null) {
            UUID uuid = this.f12153b;
            if (!m6946i(drmInitData, uuid, true).isEmpty()) {
                str = drmInitData.f12188c;
                if (str == null && !"cenc".equals(str)) {
                    if ("cbcs".equals(str)) {
                        if (C10134c0.f51354a >= 25) {
                        }
                    } else if ("cbc1".equals(str)) {
                    }
                }
            } else if (drmInitData.f12189d == 1 && drmInitData.f12186a[0].m6957a(C5903b.f35259b)) {
                C10145n.m19099g("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                str = drmInitData.f12188c;
                if (str == null) {
                }
            }
            if (z10) {
                return iMo6983l;
            }
            return 1;
        }
        z10 = true;
        if (z10) {
            return iMo6983l;
        }
        return 1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    /* JADX INFO: renamed from: b */
    public final void mo6948b(Looper looper, C6215e0 c6215e0) {
        synchronized (this) {
            try {
                Looper looper2 = this.f12171t;
                if (looper2 == null) {
                    this.f12171t = looper;
                    this.f12172u = new Handler(looper);
                } else {
                    C10129a.m18992d(looper2 == looper);
                    this.f12172u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f12175x = c6215e0;
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    /* JADX INFO: renamed from: c */
    public final DrmSession mo6949c(InterfaceC2398b.a aVar, C2416m c2416m) {
        C10129a.m18992d(this.f12167p > 0);
        C10129a.m18993e(this.f12171t);
        return m6951e(this.f12171t, aVar, c2416m, true);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    /* JADX INFO: renamed from: d */
    public final InterfaceC2399c.b mo6950d(InterfaceC2398b.a aVar, C2416m c2416m) {
        C10129a.m18992d(this.f12167p > 0);
        C10129a.m18993e(this.f12171t);
        C2392c c2392c = new C2392c(aVar);
        Handler handler = this.f12172u;
        handler.getClass();
        handler.post(new RunnableC6590j(c2392c, 11, c2416m));
        return c2392c;
    }

    /* JADX INFO: renamed from: e */
    public final DrmSession m6951e(Looper looper, InterfaceC2398b.a aVar, C2416m c2416m, boolean z10) {
        ArrayList arrayListM6946i;
        if (this.f12176y == null) {
            this.f12176y = new HandlerC2391b(looper);
        }
        DrmInitData drmInitData = c2416m.f12453J;
        int i10 = 0;
        DefaultDrmSession defaultDrmSessionM6953h = null;
        if (drmInitData == null) {
            int iM19108h = C10147p.m19108h(c2416m.f12484l);
            InterfaceC2402f interfaceC2402f = this.f12168q;
            interfaceC2402f.getClass();
            if (interfaceC2402f.mo6983l() == 2 && C7291f.f40805d) {
                return null;
            }
            int[] iArr = this.f12158g;
            while (true) {
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == iM19108h) {
                    break;
                }
                i10++;
            }
            if (i10 == -1 || interfaceC2402f.mo6983l() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession = this.f12169r;
            if (defaultDrmSession == null) {
                DefaultDrmSession defaultDrmSessionM6953h2 = m6953h(ImmutableList.m9062Y(), true, null, z10);
                this.f12164m.add(defaultDrmSessionM6953h2);
                this.f12169r = defaultDrmSessionM6953h2;
            } else {
                defaultDrmSession.mo6937g(null);
            }
            return this.f12169r;
        }
        if (this.f12174w == null) {
            arrayListM6946i = m6946i(drmInitData, this.f12153b, false);
            if (arrayListM6946i.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f12153b);
                C10145n.m19096d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.m6971e(missingSchemeDataException);
                }
                return new C2401e(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            arrayListM6946i = null;
        }
        if (this.f12157f) {
            for (DefaultDrmSession defaultDrmSession2 : this.f12164m) {
                if (C10134c0.m19034a(defaultDrmSession2.f12122a, arrayListM6946i)) {
                    defaultDrmSessionM6953h = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSessionM6953h = this.f12170s;
        }
        if (defaultDrmSessionM6953h == null) {
            defaultDrmSessionM6953h = m6953h(arrayListM6946i, false, aVar, z10);
            if (!this.f12157f) {
                this.f12170s = defaultDrmSessionM6953h;
            }
            this.f12164m.add(defaultDrmSessionM6953h);
        } else {
            defaultDrmSessionM6953h.mo6937g(aVar);
        }
        return defaultDrmSessionM6953h;
    }

    /* JADX INFO: renamed from: g */
    public final DefaultDrmSession m6952g(List<DrmInitData.SchemeData> list, boolean z10, InterfaceC2398b.a aVar) {
        this.f12168q.getClass();
        boolean z11 = this.f12159h | z10;
        UUID uuid = this.f12153b;
        InterfaceC2402f interfaceC2402f = this.f12168q;
        C2393d c2393d = this.f12160i;
        C2394e c2394e = this.f12162k;
        int i10 = this.f12173v;
        byte[] bArr = this.f12174w;
        HashMap<String, String> map = this.f12156e;
        InterfaceC2405i interfaceC2405i = this.f12155d;
        Looper looper = this.f12171t;
        looper.getClass();
        InterfaceC2528b interfaceC2528b = this.f12161j;
        C6215e0 c6215e0 = this.f12175x;
        c6215e0.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, interfaceC2402f, c2393d, c2394e, list, i10, z11, z10, bArr, map, interfaceC2405i, looper, interfaceC2528b, c6215e0);
        defaultDrmSession.mo6937g(aVar);
        if (this.f12163l != -9223372036854775807L) {
            defaultDrmSession.mo6937g(null);
        }
        return defaultDrmSession;
    }

    /* JADX INFO: renamed from: h */
    public final DefaultDrmSession m6953h(List<DrmInitData.SchemeData> list, boolean z10, InterfaceC2398b.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionM6952g = m6952g(list, z10, aVar);
        boolean zM6945f = m6945f(defaultDrmSessionM6952g);
        long j10 = this.f12163l;
        Set<DefaultDrmSession> set = this.f12166o;
        if (zM6945f && !set.isEmpty()) {
            Iterator it = ImmutableSet.m9079Q(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).mo6938h(null);
            }
            defaultDrmSessionM6952g.mo6938h(aVar);
            if (j10 != -9223372036854775807L) {
                defaultDrmSessionM6952g.mo6938h(null);
            }
            defaultDrmSessionM6952g = m6952g(list, z10, aVar);
        }
        if (!m6945f(defaultDrmSessionM6952g) || !z11) {
            return defaultDrmSessionM6952g;
        }
        Set<C2392c> set2 = this.f12165n;
        if (set2.isEmpty()) {
            return defaultDrmSessionM6952g;
        }
        Iterator it2 = ImmutableSet.m9079Q(set2).iterator();
        while (it2.hasNext()) {
            ((C2392c) it2.next()).release();
        }
        if (!set.isEmpty()) {
            Iterator it3 = ImmutableSet.m9079Q(set).iterator();
            while (it3.hasNext()) {
                ((DrmSession) it3.next()).mo6938h(null);
            }
        }
        defaultDrmSessionM6952g.mo6938h(aVar);
        if (j10 != -9223372036854775807L) {
            defaultDrmSessionM6952g.mo6938h(null);
        }
        return m6952g(list, z10, aVar);
    }

    /* JADX INFO: renamed from: j */
    public final void m6954j() {
        if (this.f12168q != null && this.f12167p == 0 && this.f12164m.isEmpty() && this.f12165n.isEmpty()) {
            InterfaceC2402f interfaceC2402f = this.f12168q;
            interfaceC2402f.getClass();
            interfaceC2402f.release();
            this.f12168q = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    public final void prepare() {
        int i10 = this.f12167p;
        this.f12167p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f12168q == null) {
            InterfaceC2402f interfaceC2402fMo624a = this.f12154c.mo624a(this.f12153b);
            this.f12168q = interfaceC2402fMo624a;
            interfaceC2402fMo624a.mo6981j(new C2390a());
            return;
        }
        if (this.f12163l != -9223372036854775807L) {
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f12164m;
                if (i11 >= arrayList.size()) {
                    break;
                }
                ((DefaultDrmSession) arrayList.get(i11)).mo6937g(null);
                i11++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC2399c
    public final void release() {
        int i10 = this.f12167p - 1;
        this.f12167p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f12163l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f12164m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).mo6938h(null);
            }
        }
        Iterator it = ImmutableSet.m9079Q(this.f12165n).iterator();
        while (it.hasNext()) {
            ((C2392c) it.next()).release();
        }
        m6954j();
    }
}
