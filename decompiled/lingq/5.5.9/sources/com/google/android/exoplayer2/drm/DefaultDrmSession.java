package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.activity.RunnableC0191j;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.common.collect.ImmutableList;
import ga.C5725h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p150h9.C5903b;
import p174i9.C6215e0;
import p218k9.InterfaceC6632b;
import p239l9.C7288c;
import p239l9.C7289d;
import p239l9.C7290e;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10138g;
import p479xa.C10145n;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a */
    public final List<DrmInitData.SchemeData> f12122a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2402f f12123b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2385a f12124c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2386b f12125d;

    /* JADX INFO: renamed from: e */
    public final int f12126e;

    /* JADX INFO: renamed from: f */
    public final boolean f12127f;

    /* JADX INFO: renamed from: g */
    public final boolean f12128g;

    /* JADX INFO: renamed from: h */
    public final HashMap<String, String> f12129h;

    /* JADX INFO: renamed from: i */
    public final C10138g<InterfaceC2398b.a> f12130i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2528b f12131j;

    /* JADX INFO: renamed from: k */
    public final C6215e0 f12132k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC2405i f12133l;

    /* JADX INFO: renamed from: m */
    public final UUID f12134m;

    /* JADX INFO: renamed from: n */
    public final HandlerC2389e f12135n;

    /* JADX INFO: renamed from: o */
    public int f12136o;

    /* JADX INFO: renamed from: p */
    public int f12137p;

    /* JADX INFO: renamed from: q */
    public HandlerThread f12138q;

    /* JADX INFO: renamed from: r */
    public HandlerC2387c f12139r;

    /* JADX INFO: renamed from: s */
    public InterfaceC6632b f12140s;

    /* JADX INFO: renamed from: t */
    public DrmSession.DrmSessionException f12141t;

    /* JADX INFO: renamed from: u */
    public byte[] f12142u;

    /* JADX INFO: renamed from: v */
    public byte[] f12143v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2402f.a f12144w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2402f.d f12145x;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$a */
    public interface InterfaceC2385a {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$b */
    public interface InterfaceC2386b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$c */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC2387c extends Handler {

        /* JADX INFO: renamed from: a */
        public boolean f12146a;

        public HandlerC2387c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Object objM6989a;
            C2388d c2388d = (C2388d) message.obj;
            boolean z10 = true;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    objM6989a = ((C2404h) DefaultDrmSession.this.f12133l).m6990c((InterfaceC2402f.d) c2388d.f12150c);
                } else {
                    if (i10 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    objM6989a = ((C2404h) defaultDrmSession.f12133l).m6989a(defaultDrmSession.f12134m, (InterfaceC2402f.a) c2388d.f12150c);
                }
            } catch (MediaDrmCallbackException e10) {
                C2388d c2388d2 = (C2388d) message.obj;
                if (c2388d2.f12149b) {
                    int i11 = c2388d2.f12151d + 1;
                    c2388d2.f12151d = i11;
                    if (i11 > DefaultDrmSession.this.f12131j.mo7474c(3)) {
                        z10 = false;
                    } else {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jMo7472a = DefaultDrmSession.this.f12131j.mo7472a(new InterfaceC2528b.c(e10.getCause() instanceof IOException ? (IOException) e10.getCause() : new UnexpectedDrmSessionException(e10.getCause()), c2388d2.f12151d));
                        if (jMo7472a != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f12146a) {
                                        sendMessageDelayed(Message.obtain(message), jMo7472a);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return;
                } else {
                    objM6989a = e10;
                }
            } catch (Exception e11) {
                C10145n.m19100h("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objM6989a = e11;
            }
            InterfaceC2528b interfaceC2528b = DefaultDrmSession.this.f12131j;
            long j10 = c2388d.f12148a;
            interfaceC2528b.getClass();
            synchronized (this) {
                if (!this.f12146a) {
                    DefaultDrmSession.this.f12135n.obtainMessage(message.what, Pair.create(c2388d.f12150c, objM6989a)).sendToTarget();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$d */
    public static final class C2388d {

        /* JADX INFO: renamed from: a */
        public final long f12148a;

        /* JADX INFO: renamed from: b */
        public final boolean f12149b;

        /* JADX INFO: renamed from: c */
        public final Object f12150c;

        /* JADX INFO: renamed from: d */
        public int f12151d;

        public C2388d(long j10, boolean z10, long j11, Object obj) {
            this.f12148a = j10;
            this.f12149b = z10;
            this.f12150c = obj;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.DefaultDrmSession$e */
    @SuppressLint({"HandlerLeak"})
    public class HandlerC2389e extends Handler {
        public HandlerC2389e(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<InterfaceC2398b.a> set;
            Set<InterfaceC2398b.a> set2;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f12145x) {
                    if (defaultDrmSession.f12136o == 2 || defaultDrmSession.m6932b()) {
                        defaultDrmSession.f12145x = null;
                        boolean z10 = obj2 instanceof Exception;
                        InterfaceC2385a interfaceC2385a = defaultDrmSession.f12124c;
                        if (z10) {
                            ((DefaultDrmSessionManager.C2393d) interfaceC2385a).m6955a((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f12123b.mo6980i((byte[]) obj2);
                            DefaultDrmSessionManager.C2393d c2393d = (DefaultDrmSessionManager.C2393d) interfaceC2385a;
                            c2393d.f12184b = null;
                            HashSet hashSet = c2393d.f12183a;
                            ImmutableList immutableListM9060Q = ImmutableList.m9060Q(hashSet);
                            hashSet.clear();
                            ImmutableList.C3147b c3147bListIterator = immutableListM9060Q.listIterator(0);
                            while (c3147bListIterator.hasNext()) {
                                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) c3147bListIterator.next();
                                if (defaultDrmSession2.m6935e()) {
                                    defaultDrmSession2.m6931a(true);
                                }
                            }
                            return;
                        } catch (Exception e10) {
                            ((DefaultDrmSessionManager.C2393d) interfaceC2385a).m6955a(e10, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i10 != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
            if (obj == defaultDrmSession3.f12144w && defaultDrmSession3.m6932b()) {
                defaultDrmSession3.f12144w = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession3.m6934d((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (defaultDrmSession3.f12126e == 3) {
                        InterfaceC2402f interfaceC2402f = defaultDrmSession3.f12123b;
                        byte[] bArr2 = defaultDrmSession3.f12143v;
                        int i11 = C10134c0.f51354a;
                        interfaceC2402f.mo6979h(bArr2, bArr);
                        C10138g<InterfaceC2398b.a> c10138g = defaultDrmSession3.f12130i;
                        synchronized (c10138g.f51372a) {
                            set2 = c10138g.f51374c;
                        }
                        Iterator<InterfaceC2398b.a> it = set2.iterator();
                        while (it.hasNext()) {
                            it.next().m6968b();
                        }
                        return;
                    }
                    byte[] bArrMo6979h = defaultDrmSession3.f12123b.mo6979h(defaultDrmSession3.f12142u, bArr);
                    int i12 = defaultDrmSession3.f12126e;
                    if (i12 == 2 || (i12 == 0 && defaultDrmSession3.f12143v != null)) {
                        if (bArrMo6979h != null && bArrMo6979h.length != 0) {
                            defaultDrmSession3.f12143v = bArrMo6979h;
                        }
                    }
                    defaultDrmSession3.f12136o = 4;
                    C10138g<InterfaceC2398b.a> c10138g2 = defaultDrmSession3.f12130i;
                    synchronized (c10138g2.f51372a) {
                        set = c10138g2.f51374c;
                    }
                    Iterator<InterfaceC2398b.a> it2 = set.iterator();
                    while (it2.hasNext()) {
                        it2.next().m6967a();
                    }
                    return;
                } catch (Exception e11) {
                    defaultDrmSession3.m6934d(e11, true);
                }
                defaultDrmSession3.m6934d(e11, true);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, InterfaceC2402f interfaceC2402f, DefaultDrmSessionManager.C2393d c2393d, DefaultDrmSessionManager.C2394e c2394e, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, InterfaceC2405i interfaceC2405i, Looper looper, InterfaceC2528b interfaceC2528b, C6215e0 c6215e0) {
        if (i10 == 1 || i10 == 3) {
            bArr.getClass();
        }
        this.f12134m = uuid;
        this.f12124c = c2393d;
        this.f12125d = c2394e;
        this.f12123b = interfaceC2402f;
        this.f12126e = i10;
        this.f12127f = z10;
        this.f12128g = z11;
        if (bArr != null) {
            this.f12143v = bArr;
            this.f12122a = null;
        } else {
            list.getClass();
            this.f12122a = Collections.unmodifiableList(list);
        }
        this.f12129h = map;
        this.f12133l = interfaceC2405i;
        this.f12130i = new C10138g<>();
        this.f12131j = interfaceC2528b;
        this.f12132k = c6215e0;
        this.f12136o = 2;
        this.f12135n = new HandlerC2389e(looper);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @RequiresNonNull({"sessionId"})
    /* JADX INFO: renamed from: a */
    public final void m6931a(boolean z10) {
        long j10;
        Pair pair;
        long jMin;
        Set<InterfaceC2398b.a> set;
        if (this.f12128g) {
            return;
        }
        byte[] bArr = this.f12142u;
        int i10 = C10134c0.f51354a;
        int i11 = this.f12126e;
        boolean z11 = false;
        if (i11 != 0 && i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                this.f12143v.getClass();
                this.f12142u.getClass();
                m6943n(this.f12143v, 3, z10);
                return;
            }
            byte[] bArr2 = this.f12143v;
            if (bArr2 != null) {
                try {
                    this.f12123b.mo6977f(bArr, bArr2);
                    z11 = true;
                } catch (Exception e10) {
                    m6933c(1, e10);
                }
                if (!z11) {
                    return;
                }
            }
            m6943n(bArr, 2, z10);
            return;
        }
        byte[] bArr3 = this.f12143v;
        if (bArr3 == null) {
            m6943n(bArr, 1, z10);
            return;
        }
        if (this.f12136o != 4) {
            try {
                this.f12123b.mo6977f(bArr, bArr3);
                z11 = true;
            } catch (Exception e11) {
                m6933c(1, e11);
            }
            if (!z11) {
                return;
            }
        }
        if (C5903b.f35261d.equals(this.f12134m)) {
            Map<String, String> mapM6944o = m6944o();
            if (mapM6944o == null) {
                pair = null;
            } else {
                long j11 = -9223372036854775807L;
                try {
                    String str = mapM6944o.get("LicenseDurationRemaining");
                    j10 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                } catch (NumberFormatException unused) {
                }
                Long lValueOf = Long.valueOf(j10);
                try {
                    String str2 = mapM6944o.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j11 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j11));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f12126e == 0 && jMin <= 60) {
            C10145n.m19094b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m6943n(bArr, 2, z10);
            return;
        }
        if (jMin <= 0) {
            m6933c(2, new KeysExpiredException());
            return;
        }
        this.f12136o = 4;
        C10138g<InterfaceC2398b.a> c10138g = this.f12130i;
        synchronized (c10138g.f51372a) {
            try {
                set = c10138g.f51374c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator<InterfaceC2398b.a> it = set.iterator();
        while (it.hasNext()) {
            it.next().m6969c();
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: b */
    public final boolean m6932b() {
        int i10 = this.f12136o;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m6933c(int i10, Exception exc) {
        int iM14665b;
        Set<InterfaceC2398b.a> set;
        int i11 = C10134c0.f51354a;
        if (i11 < 21 || !C7289d.m14664a(exc)) {
            if (i11 < 23 || !C7290e.m14666a(exc)) {
                if (i11 < 18 || !C7288c.m14663b(exc)) {
                    if (i11 >= 18 && C7288c.m14662a(exc)) {
                        iM14665b = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        iM14665b = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                        iM14665b = 6003;
                    } else if (exc instanceof KeysExpiredException) {
                        iM14665b = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            iM14665b = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                iM14665b = 6002;
            }
            iM14665b = 6006;
        } else {
            iM14665b = C7289d.m14665b(exc);
        }
        this.f12141t = new DrmSession.DrmSessionException(exc, iM14665b);
        C10145n.m19096d("DefaultDrmSession", "DRM session error", exc);
        C10138g<InterfaceC2398b.a> c10138g = this.f12130i;
        synchronized (c10138g.f51372a) {
            set = c10138g.f51374c;
        }
        Iterator<InterfaceC2398b.a> it = set.iterator();
        while (it.hasNext()) {
            it.next().m6971e(exc);
        }
        if (this.f12136o != 4) {
            this.f12136o = 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6934d(Exception exc, boolean z10) {
        if (!(exc instanceof NotProvisionedException)) {
            m6933c(z10 ? 1 : 2, exc);
            return;
        }
        DefaultDrmSessionManager.C2393d c2393d = (DefaultDrmSessionManager.C2393d) this.f12124c;
        c2393d.f12183a.add(this);
        if (c2393d.f12184b != null) {
            return;
        }
        c2393d.f12184b = this;
        InterfaceC2402f.d dVarMo6974b = this.f12123b.mo6974b();
        this.f12145x = dVarMo6974b;
        HandlerC2387c handlerC2387c = this.f12139r;
        int i10 = C10134c0.f51354a;
        dVarMo6974b.getClass();
        handlerC2387c.getClass();
        handlerC2387c.obtainMessage(0, new C2388d(C5725h.f34748b.getAndIncrement(), true, SystemClock.elapsedRealtime(), dVarMo6974b)).sendToTarget();
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    /* JADX INFO: renamed from: e */
    public final boolean m6935e() {
        Set<InterfaceC2398b.a> set;
        if (m6932b()) {
            return true;
        }
        try {
            byte[] bArrMo6976e = this.f12123b.mo6976e();
            this.f12142u = bArrMo6976e;
            this.f12123b.mo6985c(bArrMo6976e, this.f12132k);
            this.f12140s = this.f12123b.mo6975d(this.f12142u);
            this.f12136o = 3;
            C10138g<InterfaceC2398b.a> c10138g = this.f12130i;
            synchronized (c10138g.f51372a) {
                try {
                    set = c10138g.f51374c;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator<InterfaceC2398b.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().m6970d(3);
            }
            this.f12142u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.C2393d c2393d = (DefaultDrmSessionManager.C2393d) this.f12124c;
            c2393d.f12183a.add(this);
            if (c2393d.f12184b == null) {
                c2393d.f12184b = this;
                InterfaceC2402f.d dVarMo6974b = this.f12123b.mo6974b();
                this.f12145x = dVarMo6974b;
                HandlerC2387c handlerC2387c = this.f12139r;
                int i10 = C10134c0.f51354a;
                dVarMo6974b.getClass();
                handlerC2387c.getClass();
                handlerC2387c.obtainMessage(0, new C2388d(C5725h.f34748b.getAndIncrement(), true, SystemClock.elapsedRealtime(), dVarMo6974b)).sendToTarget();
            }
            return false;
        } catch (Exception e10) {
            m6933c(1, e10);
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: f */
    public final DrmSession.DrmSessionException mo6936f() {
        if (this.f12136o == 1) {
            return this.f12141t;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: g */
    public final void mo6937g(InterfaceC2398b.a aVar) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        boolean z10 = false;
        if (this.f12137p < 0) {
            C10145n.m19095c("DefaultDrmSession", "Session reference count less than zero: " + this.f12137p);
            this.f12137p = 0;
        }
        if (aVar != null) {
            C10138g<InterfaceC2398b.a> c10138g = this.f12130i;
            synchronized (c10138g.f51372a) {
                ArrayList arrayList = new ArrayList(c10138g.f51375d);
                arrayList.add(aVar);
                c10138g.f51375d = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) c10138g.f51373b.get(aVar);
                if (num == null) {
                    HashSet hashSet = new HashSet(c10138g.f51374c);
                    hashSet.add(aVar);
                    c10138g.f51374c = Collections.unmodifiableSet(hashSet);
                }
                c10138g.f51373b.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i10 = this.f12137p + 1;
        this.f12137p = i10;
        if (i10 == 1) {
            if (this.f12136o == 2) {
                z10 = true;
            }
            C10129a.m18992d(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f12138q = handlerThread;
            handlerThread.start();
            this.f12139r = new HandlerC2387c(this.f12138q.getLooper());
            if (m6935e()) {
                m6931a(true);
            }
            defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f12163l != -9223372036854775807L) {
                defaultDrmSessionManager.f12166o.remove(this);
                Handler handler = defaultDrmSessionManager.f12172u;
                handler.getClass();
                handler.removeCallbacksAndMessages(this);
            }
        }
        if (aVar != null && m6932b() && this.f12130i.m19063a(aVar) == 1) {
            aVar.m6970d(this.f12136o);
        }
        defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (defaultDrmSessionManager.f12163l != -9223372036854775807L) {
            defaultDrmSessionManager.f12166o.remove(this);
            Handler handler2 = defaultDrmSessionManager.f12172u;
            handler2.getClass();
            handler2.removeCallbacksAndMessages(this);
        }
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f12136o;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: h */
    public final void mo6938h(InterfaceC2398b.a aVar) {
        int i10 = this.f12137p;
        if (i10 <= 0) {
            C10145n.m19095c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f12137p = i11;
        if (i11 == 0) {
            this.f12136o = 0;
            HandlerC2389e handlerC2389e = this.f12135n;
            int i12 = C10134c0.f51354a;
            handlerC2389e.removeCallbacksAndMessages(null);
            HandlerC2387c handlerC2387c = this.f12139r;
            synchronized (handlerC2387c) {
                try {
                    handlerC2387c.removeCallbacksAndMessages(null);
                    handlerC2387c.f12146a = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f12139r = null;
            this.f12138q.quit();
            this.f12138q = null;
            this.f12140s = null;
            this.f12141t = null;
            this.f12144w = null;
            this.f12145x = null;
            byte[] bArr = this.f12142u;
            if (bArr != null) {
                this.f12123b.mo6978g(bArr);
                this.f12142u = null;
            }
        }
        if (aVar != null) {
            C10138g<InterfaceC2398b.a> c10138g = this.f12130i;
            synchronized (c10138g.f51372a) {
                Integer num = (Integer) c10138g.f51373b.get(aVar);
                if (num != null) {
                    ArrayList arrayList = new ArrayList(c10138g.f51375d);
                    arrayList.remove(aVar);
                    c10138g.f51375d = Collections.unmodifiableList(arrayList);
                    if (num.intValue() == 1) {
                        c10138g.f51373b.remove(aVar);
                        HashSet hashSet = new HashSet(c10138g.f51374c);
                        hashSet.remove(aVar);
                        c10138g.f51374c = Collections.unmodifiableSet(hashSet);
                    } else {
                        c10138g.f51373b.put(aVar, Integer.valueOf(num.intValue() - 1));
                    }
                }
            }
            if (this.f12130i.m19063a(aVar) == 0) {
                aVar.m6972f();
            }
        }
        InterfaceC2386b interfaceC2386b = this.f12125d;
        int i13 = this.f12137p;
        DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
        if (i13 == 1 && defaultDrmSessionManager.f12167p > 0 && defaultDrmSessionManager.f12163l != -9223372036854775807L) {
            defaultDrmSessionManager.f12166o.add(this);
            Handler handler = defaultDrmSessionManager.f12172u;
            handler.getClass();
            handler.postAtTime(new RunnableC0191j(11, this), this, SystemClock.uptimeMillis() + defaultDrmSessionManager.f12163l);
        } else if (i13 == 0) {
            defaultDrmSessionManager.f12164m.remove(this);
            if (defaultDrmSessionManager.f12169r == this) {
                defaultDrmSessionManager.f12169r = null;
            }
            if (defaultDrmSessionManager.f12170s == this) {
                defaultDrmSessionManager.f12170s = null;
            }
            DefaultDrmSessionManager.C2393d c2393d = defaultDrmSessionManager.f12160i;
            HashSet hashSet2 = c2393d.f12183a;
            hashSet2.remove(this);
            if (c2393d.f12184b == this) {
                c2393d.f12184b = null;
                if (!hashSet2.isEmpty()) {
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) hashSet2.iterator().next();
                    c2393d.f12184b = defaultDrmSession;
                    InterfaceC2402f.d dVarMo6974b = defaultDrmSession.f12123b.mo6974b();
                    defaultDrmSession.f12145x = dVarMo6974b;
                    HandlerC2387c handlerC2387c2 = defaultDrmSession.f12139r;
                    int i14 = C10134c0.f51354a;
                    dVarMo6974b.getClass();
                    handlerC2387c2.getClass();
                    handlerC2387c2.obtainMessage(0, new C2388d(C5725h.f34748b.getAndIncrement(), true, SystemClock.elapsedRealtime(), dVarMo6974b)).sendToTarget();
                }
            }
            if (defaultDrmSessionManager.f12163l != -9223372036854775807L) {
                Handler handler2 = defaultDrmSessionManager.f12172u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                defaultDrmSessionManager.f12166o.remove(this);
            }
        }
        defaultDrmSessionManager.m6954j();
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: j */
    public final UUID mo6939j() {
        return this.f12134m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: k */
    public final boolean mo6940k() {
        return this.f12127f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: l */
    public final boolean mo6941l(String str) {
        byte[] bArr = this.f12142u;
        C10129a.m18993e(bArr);
        return this.f12123b.mo6984m(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    /* JADX INFO: renamed from: m */
    public final InterfaceC6632b mo6942m() {
        return this.f12140s;
    }

    /* JADX INFO: renamed from: n */
    public final void m6943n(byte[] bArr, int i10, boolean z10) {
        try {
            InterfaceC2402f.a aVarMo6982k = this.f12123b.mo6982k(bArr, this.f12122a, i10, this.f12129h);
            this.f12144w = aVarMo6982k;
            HandlerC2387c handlerC2387c = this.f12139r;
            int i11 = C10134c0.f51354a;
            aVarMo6982k.getClass();
            handlerC2387c.getClass();
            handlerC2387c.obtainMessage(1, new C2388d(C5725h.f34748b.getAndIncrement(), z10, SystemClock.elapsedRealtime(), aVarMo6982k)).sendToTarget();
        } catch (Exception e10) {
            m6934d(e10, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public final Map<String, String> m6944o() {
        byte[] bArr = this.f12142u;
        if (bArr == null) {
            return null;
        }
        return this.f12123b.mo6973a(bArr);
    }
}
