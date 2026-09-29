package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.manager.C2148d;
import com.bumptech.glide.manager.C2149e;
import com.bumptech.glide.manager.C2156l;
import com.bumptech.glide.manager.C2163s;
import com.bumptech.glide.manager.InterfaceC2146b;
import com.bumptech.glide.manager.InterfaceC2147c;
import com.bumptech.glide.manager.InterfaceC2152h;
import com.bumptech.glide.manager.InterfaceC2153i;
import com.bumptech.glide.manager.InterfaceC2159o;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p060d1.C5019f;
import p087e6.C5374c;
import p171i6.C6202g;
import p171i6.InterfaceC6199d;
import p171i6.InterfaceC6201f;
import p192j6.AbstractC6415d;
import p192j6.InterfaceC6419h;
import p236l6.C7280a;
import p236l6.C7281b;
import p236l6.C7283d;
import p254m2.C7472a;
import p258m6.C7492l;
import p356r5.InterfaceC8732b;

/* JADX INFO: renamed from: com.bumptech.glide.l */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2090l implements ComponentCallbacks2, InterfaceC2153i {

    /* JADX INFO: renamed from: k */
    public static final C6202g f10587k;

    /* JADX INFO: renamed from: l */
    public static final C6202g f10588l;

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C2080b f10589a;

    /* JADX INFO: renamed from: b */
    public final Context f10590b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2152h f10591c;

    /* JADX INFO: renamed from: d */
    public final C5019f f10592d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2159o f10593e;

    /* JADX INFO: renamed from: f */
    public final C2163s f10594f;

    /* JADX INFO: renamed from: g */
    public final a f10595g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2146b f10596h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList<InterfaceC6201f<Object>> f10597i;

    /* JADX INFO: renamed from: j */
    public C6202g f10598j;

    /* JADX INFO: renamed from: com.bumptech.glide.l$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacks2C2090l componentCallbacks2C2090l = ComponentCallbacks2C2090l.this;
            componentCallbacks2C2090l.f10591c.mo6362p(componentCallbacks2C2090l);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.l$b */
    public static class b extends AbstractC6415d<View, Object> {
        public b(ImageView imageView) {
            super(imageView);
        }

        @Override // p192j6.InterfaceC6419h
        /* JADX INFO: renamed from: e */
        public final void mo6262e(Object obj) {
        }

        @Override // p192j6.InterfaceC6419h
        /* JADX INFO: renamed from: j */
        public final void mo6263j(Drawable drawable) {
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.l$c */
    public class c implements InterfaceC2146b.a {

        /* JADX INFO: renamed from: a */
        public final C5019f f10600a;

        public c(C5019f c5019f) {
            this.f10600a = c5019f;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // com.bumptech.glide.manager.InterfaceC2146b.a
        /* JADX INFO: renamed from: a */
        public final void mo6264a(boolean z10) {
            if (z10) {
                synchronized (ComponentCallbacks2C2090l.this) {
                    this.f10600a.m10701c();
                }
            }
        }
    }

    static {
        C6202g c6202gM12717e = new C6202g().m12717e(Bitmap.class);
        c6202gM12717e.f36067O = true;
        f10587k = c6202gM12717e;
        C6202g c6202gM12717e2 = new C6202g().m12717e(C5374c.class);
        c6202gM12717e2.f36067O = true;
        f10588l = c6202gM12717e2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public ComponentCallbacks2C2090l(ComponentCallbacks2C2080b componentCallbacks2C2080b, InterfaceC2152h interfaceC2152h, InterfaceC2159o interfaceC2159o, Context context) {
        C6202g c6202g;
        C5019f c5019f = new C5019f();
        InterfaceC2147c interfaceC2147c = componentCallbacks2C2080b.f10555f;
        this.f10594f = new C2163s();
        a aVar = new a();
        this.f10595g = aVar;
        this.f10589a = componentCallbacks2C2080b;
        this.f10591c = interfaceC2152h;
        this.f10593e = interfaceC2159o;
        this.f10592d = c5019f;
        this.f10590b = context;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(c5019f);
        ((C2149e) interfaceC2147c).getClass();
        boolean z10 = C7472a.m14841a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        InterfaceC2146b c2148d = z10 ? new C2148d(applicationContext, cVar) : new C2156l();
        this.f10596h = c2148d;
        synchronized (componentCallbacks2C2080b.f10556g) {
            if (componentCallbacks2C2080b.f10556g.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            componentCallbacks2C2080b.f10556g.add(this);
        }
        if (C7492l.m14887h()) {
            C7492l.m14884e().post(aVar);
        } else {
            interfaceC2152h.mo6362p(this);
        }
        interfaceC2152h.mo6362p(c2148d);
        this.f10597i = new CopyOnWriteArrayList<>(componentCallbacks2C2080b.f10552c.f10562e);
        C2085g c2085g = componentCallbacks2C2080b.f10552c;
        synchronized (c2085g) {
            if (c2085g.f10567j == null) {
                ((C2081c) c2085g.f10561d).getClass();
                C6202g c6202g2 = new C6202g();
                c6202g2.f36067O = true;
                c2085g.f10567j = c6202g2;
            }
            c6202g = c2085g.f10567j;
        }
        synchronized (this) {
            try {
                C6202g c6202gClone = c6202g.clone();
                if (c6202gClone.f36067O && !c6202gClone.f36069Q) {
                    throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
                }
                c6202gClone.f36069Q = true;
                c6202gClone.f36067O = true;
                this.f10598j = c6202gClone;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final synchronized void mo6252a() {
        try {
            synchronized (this) {
                try {
                    this.f10592d.m10702d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        this.f10594f.mo6252a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final synchronized void mo6253b() {
        m6260q();
        this.f10594f.mo6253b();
    }

    /* JADX INFO: renamed from: c */
    public final C2089k<Bitmap> m6254c() {
        return new C2089k(this.f10589a, this, Bitmap.class, this.f10590b).m6242A(f10587k);
    }

    /* JADX INFO: renamed from: d */
    public final C2089k<C5374c> m6255d() {
        return new C2089k(this.f10589a, this, C5374c.class, this.f10590b).m6242A(f10588l);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m6256f(InterfaceC6419h<?> interfaceC6419h) {
        boolean z10;
        if (interfaceC6419h == null) {
            return;
        }
        boolean zM6261r = m6261r(interfaceC6419h);
        InterfaceC6199d interfaceC6199dMo12740p = interfaceC6419h.mo12740p();
        if (!zM6261r) {
            ComponentCallbacks2C2080b componentCallbacks2C2080b = this.f10589a;
            synchronized (componentCallbacks2C2080b.f10556g) {
                try {
                    Iterator it = componentCallbacks2C2080b.f10556g.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        } else if (((ComponentCallbacks2C2090l) it.next()).m6261r(interfaceC6419h)) {
                            z10 = true;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10 && interfaceC6199dMo12740p != null) {
                interfaceC6419h.mo12735g(null);
                interfaceC6199dMo12740p.clear();
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final synchronized void mo6257h() {
        this.f10594f.mo6257h();
        Iterator it = C7492l.m14883d(this.f10594f.f10897a).iterator();
        while (it.hasNext()) {
            m6256f((InterfaceC6419h) it.next());
        }
        this.f10594f.f10897a.clear();
        C5019f c5019f = this.f10592d;
        Iterator it2 = C7492l.m14883d((Set) c5019f.f32814c).iterator();
        while (it2.hasNext()) {
            c5019f.m10699a((InterfaceC6199d) it2.next());
        }
        ((Set) c5019f.f32815d).clear();
        this.f10591c.mo6363y(this);
        this.f10591c.mo6363y(this.f10596h);
        C7492l.m14884e().removeCallbacks(this.f10595g);
        this.f10589a.m6239d(this);
    }

    /* JADX INFO: renamed from: n */
    public final C2089k<Drawable> m6258n(Integer num) {
        PackageInfo packageInfo;
        C2089k c2089k = new C2089k(this.f10589a, this, Drawable.class, this.f10590b);
        C2089k c2089kM6247G = c2089k.m6247G(num);
        Context context = c2089k.f10573V;
        C2089k c2089kM12730u = c2089kM6247G.m12730u(context.getTheme());
        ConcurrentHashMap concurrentHashMap = C7281b.f40795a;
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap2 = C7281b.f40795a;
        InterfaceC8732b interfaceC8732b = (InterfaceC8732b) concurrentHashMap2.get(packageName);
        if (interfaceC8732b == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e10);
                packageInfo = null;
            }
            C7283d c7283d = new C7283d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            interfaceC8732b = (InterfaceC8732b) concurrentHashMap2.putIfAbsent(packageName, c7283d);
            if (interfaceC8732b == null) {
                interfaceC8732b = c7283d;
            }
        }
        return (C2089k) c2089kM12730u.m12728s(new C7280a(context.getResources().getConfiguration().uiMode & 48, interfaceC8732b));
    }

    /* JADX INFO: renamed from: o */
    public final C2089k<Drawable> m6259o(String str) {
        return new C2089k(this.f10589a, this, Drawable.class, this.f10590b).m6247G(str);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: q */
    public final synchronized void m6260q() {
        try {
            C5019f c5019f = this.f10592d;
            c5019f.f32813b = true;
            Iterator it = C7492l.m14883d((Set) c5019f.f32814c).iterator();
            while (true) {
                while (true) {
                    if (it.hasNext()) {
                        InterfaceC6199d interfaceC6199d = (InterfaceC6199d) it.next();
                        if (interfaceC6199d.isRunning()) {
                            interfaceC6199d.pause();
                            ((Set) c5019f.f32815d).add(interfaceC6199d);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final synchronized boolean m6261r(InterfaceC6419h<?> interfaceC6419h) {
        try {
            InterfaceC6199d interfaceC6199dMo12740p = interfaceC6419h.mo12740p();
            if (interfaceC6199dMo12740p == null) {
                return true;
            }
            if (!this.f10592d.m10699a(interfaceC6199dMo12740p)) {
                return false;
            }
            this.f10594f.f10897a.remove(interfaceC6419h);
            interfaceC6419h.mo12735g(null);
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final synchronized String toString() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return super.toString() + "{tracker=" + this.f10592d + ", treeNode=" + this.f10593e + "}";
    }
}
