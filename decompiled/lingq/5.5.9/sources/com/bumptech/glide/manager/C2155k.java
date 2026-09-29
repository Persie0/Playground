package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.view.C1052r;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import java.util.HashMap;
import p258m6.C7492l;

/* JADX INFO: renamed from: com.bumptech.glide.manager.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2155k {

    /* JADX INFO: renamed from: a */
    public final HashMap f10861a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final C2158n.b f10862b;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.k$a */
    public final class a implements InterfaceC2159o {
        public a(C2155k c2155k, FragmentManager fragmentManager) {
        }
    }

    public C2155k(C2158n.b bVar) {
        this.f10862b = bVar;
    }

    /* JADX INFO: renamed from: a */
    public final ComponentCallbacks2C2090l m6368a(Context context, ComponentCallbacks2C2080b componentCallbacks2C2080b, C1052r c1052r, FragmentManager fragmentManager, boolean z10) {
        C7492l.m14880a();
        C7492l.m14880a();
        HashMap map = this.f10861a;
        ComponentCallbacks2C2090l componentCallbacks2C2090l = (ComponentCallbacks2C2090l) map.get(c1052r);
        if (componentCallbacks2C2090l == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(c1052r);
            a aVar = new a(this, fragmentManager);
            ((C2158n.a) this.f10862b).getClass();
            ComponentCallbacks2C2090l componentCallbacks2C2090l2 = new ComponentCallbacks2C2090l(componentCallbacks2C2080b, lifecycleLifecycle, aVar, context);
            map.put(c1052r, componentCallbacks2C2090l2);
            lifecycleLifecycle.mo6362p(new C2154j(this, c1052r));
            if (z10) {
                componentCallbacks2C2090l2.mo6252a();
            }
            componentCallbacks2C2090l = componentCallbacks2C2090l2;
        }
        return componentCallbacks2C2090l;
    }
}
