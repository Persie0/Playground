package com.bumptech.glide.request;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.C2083e;
import com.bumptech.glide.C2085g;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.C2119e;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p003a2.C0009a;
import p042c6.C1730b;
import p171i6.AbstractC6196a;
import p171i6.AbstractC6197b;
import p171i6.C6200e;
import p171i6.InterfaceC6199d;
import p171i6.InterfaceC6201f;
import p171i6.InterfaceC6203h;
import p192j6.InterfaceC6418g;
import p192j6.InterfaceC6419h;
import p215k6.C6624a;
import p215k6.InterfaceC6625b;
import p258m6.C7488h;
import p258m6.C7492l;
import p272n6.AbstractC7712d;
import p392t5.InterfaceC9207m;
import p474x5.InterfaceC10087l;

/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements InterfaceC6199d, InterfaceC6418g, InterfaceC6203h {

    /* JADX INFO: renamed from: D */
    public static final boolean f10898D = Log.isLoggable("GlideRequest", 2);

    /* JADX INFO: renamed from: A */
    public int f10899A;

    /* JADX INFO: renamed from: B */
    public boolean f10900B;

    /* JADX INFO: renamed from: C */
    public final RuntimeException f10901C;

    /* JADX INFO: renamed from: a */
    public final String f10902a;

    /* JADX INFO: renamed from: b */
    public final AbstractC7712d.a f10903b;

    /* JADX INFO: renamed from: c */
    public final Object f10904c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6201f<R> f10905d;

    /* JADX INFO: renamed from: e */
    public final RequestCoordinator f10906e;

    /* JADX INFO: renamed from: f */
    public final Context f10907f;

    /* JADX INFO: renamed from: g */
    public final C2085g f10908g;

    /* JADX INFO: renamed from: h */
    public final Object f10909h;

    /* JADX INFO: renamed from: i */
    public final Class<R> f10910i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6196a<?> f10911j;

    /* JADX INFO: renamed from: k */
    public final int f10912k;

    /* JADX INFO: renamed from: l */
    public final int f10913l;

    /* JADX INFO: renamed from: m */
    public final Priority f10914m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6419h<R> f10915n;

    /* JADX INFO: renamed from: o */
    public final List<InterfaceC6201f<R>> f10916o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC6625b<? super R> f10917p;

    /* JADX INFO: renamed from: q */
    public final Executor f10918q;

    /* JADX INFO: renamed from: r */
    public InterfaceC9207m<R> f10919r;

    /* JADX INFO: renamed from: s */
    public C2119e.d f10920s;

    /* JADX INFO: renamed from: t */
    public long f10921t;

    /* JADX INFO: renamed from: u */
    public volatile C2119e f10922u;

    /* JADX INFO: renamed from: v */
    public Status f10923v;

    /* JADX INFO: renamed from: w */
    public Drawable f10924w;

    /* JADX INFO: renamed from: x */
    public Drawable f10925x;

    /* JADX INFO: renamed from: y */
    public Drawable f10926y;

    /* JADX INFO: renamed from: z */
    public int f10927z;

    public enum Status {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public SingleRequest(Context context, C2085g c2085g, Object obj, Object obj2, Class cls, AbstractC6196a abstractC6196a, int i10, int i11, Priority priority, InterfaceC6419h interfaceC6419h, C6200e c6200e, ArrayList arrayList, RequestCoordinator requestCoordinator, C2119e c2119e, C6624a.a aVar, Executor executor) {
        this.f10902a = f10898D ? String.valueOf(hashCode()) : null;
        this.f10903b = new AbstractC7712d.a();
        this.f10904c = obj;
        this.f10907f = context;
        this.f10908g = c2085g;
        this.f10909h = obj2;
        this.f10910i = cls;
        this.f10911j = abstractC6196a;
        this.f10912k = i10;
        this.f10913l = i11;
        this.f10914m = priority;
        this.f10915n = interfaceC6419h;
        this.f10905d = c6200e;
        this.f10916o = arrayList;
        this.f10906e = requestCoordinator;
        this.f10922u = c2119e;
        this.f10917p = aVar;
        this.f10918q = executor;
        this.f10923v = Status.PENDING;
        if (this.f10901C == null && c2085g.f10565h.f10568a.containsKey(C2083e.class)) {
            this.f10901C = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: a */
    public final boolean mo6381a() {
        boolean z10;
        synchronized (this.f10904c) {
            z10 = this.f10923v == Status.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ff */
    @Override // p192j6.InterfaceC6418g
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo6388b(int i10, int i11) throws Throwable {
        Object obj;
        int iRound = i10;
        this.f10903b.m15304a();
        Object obj2 = this.f10904c;
        synchronized (obj2) {
            try {
                boolean z10 = f10898D;
                if (z10) {
                    m6394h("Got onSizeReady in " + C7488h.m14872a(this.f10921t));
                }
                if (this.f10923v == Status.WAITING_FOR_SIZE) {
                    Status status = Status.RUNNING;
                    this.f10923v = status;
                    float f3 = this.f10911j.f36075b;
                    if (iRound != Integer.MIN_VALUE) {
                        iRound = Math.round(iRound * f3);
                    }
                    this.f10927z = iRound;
                    this.f10899A = i11 == Integer.MIN_VALUE ? i11 : Math.round(f3 * i11);
                    if (z10) {
                        m6394h("finished setup for calling load in " + C7488h.m14872a(this.f10921t));
                    }
                    C2119e c2119e = this.f10922u;
                    C2085g c2085g = this.f10908g;
                    Object obj3 = this.f10909h;
                    AbstractC6196a<?> abstractC6196a = this.f10911j;
                    try {
                        obj = obj2;
                        try {
                            try {
                                this.f10920s = c2119e.m6317b(c2085g, obj3, abstractC6196a.f36085l, this.f10927z, this.f10899A, abstractC6196a.f36066N, this.f10910i, this.f10914m, abstractC6196a.f36076c, abstractC6196a.f36065M, abstractC6196a.f36060H, abstractC6196a.f36072T, abstractC6196a.f36064L, abstractC6196a.f36082i, abstractC6196a.f36070R, abstractC6196a.f36073U, abstractC6196a.f36071S, this, this.f10918q);
                                if (this.f10923v != status) {
                                    this.f10920s = null;
                                }
                                if (z10) {
                                    m6394h("finished onSizeReady in " + C7488h.m14872a(this.f10921t));
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                obj = obj2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m6389c() {
        if (this.f10900B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.f10903b.m15304a();
        this.f10915n.mo12736i(this);
        C2119e.d dVar = this.f10920s;
        if (dVar != null) {
            synchronized (C2119e.this) {
                dVar.f10737a.m6328h(dVar.f10738b);
            }
            this.f10920s = null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    public final void clear() {
        synchronized (this.f10904c) {
            if (this.f10900B) {
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            }
            this.f10903b.m15304a();
            Status status = this.f10923v;
            Status status2 = Status.CLEARED;
            if (status == status2) {
                return;
            }
            m6389c();
            InterfaceC9207m<R> interfaceC9207m = this.f10919r;
            if (interfaceC9207m != null) {
                this.f10919r = null;
            } else {
                interfaceC9207m = null;
            }
            RequestCoordinator requestCoordinator = this.f10906e;
            if (requestCoordinator == null || requestCoordinator.mo6387h(this)) {
                this.f10915n.mo11551l(m6390d());
            }
            this.f10923v = status2;
            if (interfaceC9207m != null) {
                this.f10922u.getClass();
                C2119e.m6315e(interfaceC9207m);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m6390d() {
        int i10;
        if (this.f10925x == null) {
            AbstractC6196a<?> abstractC6196a = this.f10911j;
            Drawable drawable = abstractC6196a.f36080g;
            this.f10925x = drawable;
            if (drawable == null && (i10 = abstractC6196a.f36081h) > 0) {
                this.f10925x = m6393g(i10);
            }
        }
        return this.f10925x;
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: e */
    public final boolean mo6391e(InterfaceC6199d interfaceC6199d) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        AbstractC6196a<?> abstractC6196a;
        Priority priority;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        AbstractC6196a<?> abstractC6196a2;
        Priority priority2;
        int size2;
        boolean zM18937a;
        if (!(interfaceC6199d instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f10904c) {
            i10 = this.f10912k;
            i11 = this.f10913l;
            obj = this.f10909h;
            cls = this.f10910i;
            abstractC6196a = this.f10911j;
            priority = this.f10914m;
            List<InterfaceC6201f<R>> list = this.f10916o;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) interfaceC6199d;
        synchronized (singleRequest.f10904c) {
            i12 = singleRequest.f10912k;
            i13 = singleRequest.f10913l;
            obj2 = singleRequest.f10909h;
            cls2 = singleRequest.f10910i;
            abstractC6196a2 = singleRequest.f10911j;
            priority2 = singleRequest.f10914m;
            List<InterfaceC6201f<R>> list2 = singleRequest.f10916o;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i10 == i12 && i11 == i13) {
            char[] cArr = C7492l.f41383a;
            if (obj == null) {
                zM18937a = obj2 == null;
            } else {
                zM18937a = obj instanceof InterfaceC10087l ? ((InterfaceC10087l) obj).m18937a() : obj.equals(obj2);
            }
            if (zM18937a && cls.equals(cls2) && abstractC6196a.equals(abstractC6196a2) && priority == priority2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6392f() {
        RequestCoordinator requestCoordinator = this.f10906e;
        if (requestCoordinator != null && requestCoordinator.mo6383c().mo6381a()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m6393g(int i10) {
        Resources.Theme theme = this.f10911j.f36068P;
        Context context = this.f10907f;
        if (theme == null) {
            theme = context.getTheme();
        }
        return C1730b.m5469a(context, context, i10, theme);
    }

    /* JADX INFO: renamed from: h */
    public final void m6394h(String str) {
        StringBuilder sbM26o = C0009a.m26o(str, " this: ");
        sbM26o.append(this.f10902a);
        Log.v("GlideRequest", sbM26o.toString());
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: i */
    public final boolean mo6395i() {
        boolean z10;
        synchronized (this.f10904c) {
            z10 = this.f10923v == Status.CLEARED;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f10904c) {
            Status status = this.f10923v;
            z10 = status == Status.RUNNING || status == Status.WAITING_FOR_SIZE;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: j */
    public final void mo6396j() {
        int i10;
        synchronized (this.f10904c) {
            try {
                if (this.f10900B) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f10903b.m15304a();
                int i11 = C7488h.f41373b;
                this.f10921t = SystemClock.elapsedRealtimeNanos();
                if (this.f10909h == null) {
                    if (C7492l.m14888i(this.f10912k, this.f10913l)) {
                        this.f10927z = this.f10912k;
                        this.f10899A = this.f10913l;
                    }
                    if (this.f10926y == null) {
                        AbstractC6196a<?> abstractC6196a = this.f10911j;
                        Drawable drawable = abstractC6196a.f36062J;
                        this.f10926y = drawable;
                        if (drawable == null && (i10 = abstractC6196a.f36063K) > 0) {
                            this.f10926y = m6393g(i10);
                        }
                    }
                    m6398l(new GlideException("Received null model"), this.f10926y == null ? 5 : 3);
                    return;
                }
                Status status = this.f10923v;
                if (status == Status.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (status == Status.COMPLETE) {
                    m6399m(this.f10919r, DataSource.MEMORY_CACHE, false);
                    return;
                }
                List<InterfaceC6201f<R>> list = this.f10916o;
                if (list != null) {
                    Iterator<InterfaceC6201f<R>> it = list.iterator();
                    loop0: while (true) {
                        while (true) {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            InterfaceC6201f<R> next = it.next();
                            if (next instanceof AbstractC6197b) {
                                ((AbstractC6197b) next).getClass();
                            }
                        }
                    }
                }
                Status status2 = Status.WAITING_FOR_SIZE;
                this.f10923v = status2;
                if (C7492l.m14888i(this.f10912k, this.f10913l)) {
                    mo6388b(this.f10912k, this.f10913l);
                } else {
                    this.f10915n.mo12738m(this);
                }
                Status status3 = this.f10923v;
                if (status3 == Status.RUNNING || status3 == status2) {
                    RequestCoordinator requestCoordinator = this.f10906e;
                    if (requestCoordinator == null || requestCoordinator.mo6385f(this)) {
                        this.f10915n.mo12737k(m6390d());
                    }
                }
                if (f10898D) {
                    m6394h("finished run method in " + C7488h.m14872a(this.f10921t));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p171i6.InterfaceC6199d
    /* JADX INFO: renamed from: k */
    public final boolean mo6397k() {
        boolean z10;
        synchronized (this.f10904c) {
            z10 = this.f10923v == Status.COMPLETE;
        }
        return z10;
    }

    /* JADX INFO: renamed from: l */
    public final void m6398l(GlideException glideException, int i10) {
        int i11;
        int i12;
        this.f10903b.m15304a();
        synchronized (this.f10904c) {
            glideException.getClass();
            int i13 = this.f10908g.f10566i;
            if (i13 <= i10) {
                Log.w("Glide", "Load failed for [" + this.f10909h + "] with dimensions [" + this.f10927z + "x" + this.f10899A + "]", glideException);
                if (i13 <= 4) {
                    glideException.m6303e("Glide");
                }
            }
            Drawable drawableM6390d = null;
            this.f10920s = null;
            this.f10923v = Status.FAILED;
            RequestCoordinator requestCoordinator = this.f10906e;
            if (requestCoordinator != null) {
                requestCoordinator.mo6384d(this);
            }
            boolean z10 = true;
            this.f10900B = true;
            try {
                List<InterfaceC6201f<R>> list = this.f10916o;
                if (list != null) {
                    for (InterfaceC6201f<R> interfaceC6201f : list) {
                        m6392f();
                        interfaceC6201f.mo9954d(glideException);
                    }
                }
                InterfaceC6201f<R> interfaceC6201f2 = this.f10905d;
                if (interfaceC6201f2 != null) {
                    m6392f();
                    interfaceC6201f2.mo9954d(glideException);
                }
                RequestCoordinator requestCoordinator2 = this.f10906e;
                if (requestCoordinator2 != null && !requestCoordinator2.mo6385f(this)) {
                    z10 = false;
                }
                if (z10) {
                    if (this.f10909h == null) {
                        if (this.f10926y == null) {
                            AbstractC6196a<?> abstractC6196a = this.f10911j;
                            Drawable drawable = abstractC6196a.f36062J;
                            this.f10926y = drawable;
                            if (drawable == null && (i12 = abstractC6196a.f36063K) > 0) {
                                this.f10926y = m6393g(i12);
                            }
                        }
                        drawableM6390d = this.f10926y;
                    }
                    if (drawableM6390d == null) {
                        if (this.f10924w == null) {
                            AbstractC6196a<?> abstractC6196a2 = this.f10911j;
                            Drawable drawable2 = abstractC6196a2.f36078e;
                            this.f10924w = drawable2;
                            if (drawable2 == null && (i11 = abstractC6196a2.f36079f) > 0) {
                                this.f10924w = m6393g(i11);
                            }
                        }
                        drawableM6390d = this.f10924w;
                    }
                    if (drawableM6390d == null) {
                        drawableM6390d = m6390d();
                    }
                    this.f10915n.mo6263j(drawableM6390d);
                }
                this.f10900B = false;
            } catch (Throwable th2) {
                this.f10900B = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6399m(InterfaceC9207m<?> interfaceC9207m, DataSource dataSource, boolean z10) {
        SingleRequest<R> singleRequest;
        Throwable th2;
        this.f10903b.m15304a();
        InterfaceC9207m<?> interfaceC9207m2 = null;
        try {
            synchronized (this.f10904c) {
                try {
                    this.f10920s = null;
                    if (interfaceC9207m == null) {
                        m6398l(new GlideException("Expected to receive a Resource<R> with an object of " + this.f10910i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = interfaceC9207m.get();
                    try {
                        if (obj == null || !this.f10910i.isAssignableFrom(obj.getClass())) {
                            this.f10919r = null;
                            StringBuilder sb2 = new StringBuilder("Expected to receive an object of ");
                            sb2.append(this.f10910i);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(interfaceC9207m);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m6398l(new GlideException(sb2.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.f10906e;
                            if (requestCoordinator == null || requestCoordinator.mo6386g(this)) {
                                m6400n(interfaceC9207m, obj, dataSource);
                                return;
                            } else {
                                this.f10919r = null;
                                this.f10923v = Status.COMPLETE;
                            }
                        }
                        this.f10922u.getClass();
                        C2119e.m6315e(interfaceC9207m);
                    } catch (Throwable th3) {
                        th2 = th3;
                        interfaceC9207m2 = interfaceC9207m;
                        singleRequest = this;
                        while (true) {
                            try {
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (interfaceC9207m2 != null) {
                                        singleRequest.f10922u.getClass();
                                        C2119e.m6315e(interfaceC9207m2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                singleRequest = singleRequest;
                            }
                            th2 = th5;
                            singleRequest = singleRequest;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    singleRequest = this;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            singleRequest = this;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m6400n(InterfaceC9207m interfaceC9207m, Object obj, DataSource dataSource) {
        m6392f();
        this.f10923v = Status.COMPLETE;
        this.f10919r = interfaceC9207m;
        int i10 = this.f10908g.f10566i;
        Object obj2 = this.f10909h;
        if (i10 <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + dataSource + " for " + obj2 + " with size [" + this.f10927z + "x" + this.f10899A + "] in " + C7488h.m14872a(this.f10921t) + " ms");
        }
        RequestCoordinator requestCoordinator = this.f10906e;
        if (requestCoordinator != null) {
            requestCoordinator.mo6382b(this);
        }
        this.f10900B = true;
        try {
            List<InterfaceC6201f<R>> list = this.f10916o;
            if (list != null) {
                Iterator<InterfaceC6201f<R>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().mo9953c(obj, obj2);
                }
            }
            InterfaceC6201f<R> interfaceC6201f = this.f10905d;
            if (interfaceC6201f != null) {
                interfaceC6201f.mo9953c(obj, obj2);
            }
            this.f10917p.getClass();
            this.f10915n.mo6262e(obj);
            this.f10900B = false;
        } catch (Throwable th2) {
            this.f10900B = false;
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p171i6.InterfaceC6199d
    public final void pause() {
        synchronized (this.f10904c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f10904c) {
            obj = this.f10909h;
            cls = this.f10910i;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
