package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.p544savedstate.C1189a;
import androidx.view.AbstractC1019a;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import androidx.view.C1030e0;
import androidx.view.C1040j0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.view.SavedStateHandleSupport;
import cm.InterfaceC2041a;
import dm.C5207g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.C6740a;
import p040c4.C1685j;
import p040c4.InterfaceC1693r;
import p270n4.C7705b;
import p270n4.InterfaceC7706c;
import p427v3.AbstractC9634a;
import p427v3.C9636c;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes.dex */
public final class NavBackStackEntry implements InterfaceC1051q, InterfaceC1048n0, InterfaceC1037i, InterfaceC7706c {

    /* JADX INFO: renamed from: a */
    public final Context f6730a;

    /* JADX INFO: renamed from: b */
    public NavDestination f6731b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6732c;

    /* JADX INFO: renamed from: d */
    public Lifecycle.State f6733d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC1693r f6734e;

    /* JADX INFO: renamed from: f */
    public final String f6735f;

    /* JADX INFO: renamed from: g */
    public final Bundle f6736g;

    /* JADX INFO: renamed from: j */
    public boolean f6739j;

    /* JADX INFO: renamed from: l */
    public Lifecycle.State f6741l;

    /* JADX INFO: renamed from: h */
    public final C1052r f6737h = new C1052r(this);

    /* JADX INFO: renamed from: i */
    public final C7705b f6738i = new C7705b(this);

    /* JADX INFO: renamed from: k */
    public final InterfaceC9070c f6740k = C6740a.m13372a(new InterfaceC2041a<C1030e0>() { // from class: androidx.navigation.NavBackStackEntry$defaultFactory$2
        {
            super(0);
        }

        @Override // cm.InterfaceC2041a
        /* JADX INFO: renamed from: E */
        public final C1030e0 mo807E() {
            NavBackStackEntry navBackStackEntry = this.f6743b;
            Context context = navBackStackEntry.f6730a;
            Application application = null;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
            }
            return new C1030e0(application, navBackStackEntry, navBackStackEntry.f6732c);
        }
    });

    /* JADX INFO: renamed from: androidx.navigation.NavBackStackEntry$a */
    public static final class C1070a {
        /* JADX INFO: renamed from: a */
        public static NavBackStackEntry m3977a(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, C1685j c1685j) {
            String string = UUID.randomUUID().toString();
            C5207g.m11110e(string, "randomUUID().toString()");
            C5207g.m11111f(navDestination, "destination");
            C5207g.m11111f(state, "hostLifecycleState");
            return new NavBackStackEntry(context, navDestination, bundle, state, c1685j, string, null);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavBackStackEntry$b */
    public static final class C1071b extends AbstractC1019a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1071b(NavBackStackEntry navBackStackEntry) {
            super(navBackStackEntry);
            C5207g.m11111f(navBackStackEntry, "owner");
        }

        @Override // androidx.view.AbstractC1019a
        /* JADX INFO: renamed from: d */
        public final <T extends AbstractC1036h0> T mo3917d(String str, Class<T> cls, C1024c0 c1024c0) {
            C5207g.m11111f(c1024c0, "handle");
            return new C1072c(c1024c0);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavBackStackEntry$c */
    public static final class C1072c extends AbstractC1036h0 {

        /* JADX INFO: renamed from: d */
        public final C1024c0 f6742d;

        public C1072c(C1024c0 c1024c0) {
            C5207g.m11111f(c1024c0, "handle");
            this.f6742d = c1024c0;
        }
    }

    static {
        new C1070a();
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, InterfaceC1693r interfaceC1693r, String str, Bundle bundle2) {
        this.f6730a = context;
        this.f6731b = navDestination;
        this.f6732c = bundle;
        this.f6733d = state;
        this.f6734e = interfaceC1693r;
        this.f6735f = str;
        this.f6736g = bundle2;
        C6740a.m13372a(new InterfaceC2041a<C1024c0>() { // from class: androidx.navigation.NavBackStackEntry$savedStateHandle$2
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1024c0 mo807E() {
                NavBackStackEntry navBackStackEntry = this.f6744b;
                if (!navBackStackEntry.f6739j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
                }
                if (navBackStackEntry.f6737h.f6681d != Lifecycle.State.DESTROYED) {
                    return ((NavBackStackEntry.C1072c) new C1042k0(navBackStackEntry, new NavBackStackEntry.C1071b(navBackStackEntry)).m3947a(NavBackStackEntry.C1072c.class)).f6742d;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
            }
        });
        this.f6741l = Lifecycle.State.INITIALIZED;
    }

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        return this.f6737h;
    }

    /* JADX INFO: renamed from: a */
    public final void m3975a(Lifecycle.State state) {
        C5207g.m11111f(state, "maxState");
        this.f6741l = state;
        m3976c();
    }

    /* JADX INFO: renamed from: c */
    public final void m3976c() {
        if (!this.f6739j) {
            C7705b c7705b = this.f6738i;
            c7705b.m15298a();
            this.f6739j = true;
            if (this.f6734e != null) {
                SavedStateHandleSupport.m3909b(this);
            }
            c7705b.m15299b(this.f6736g);
        }
        int iOrdinal = this.f6733d.ordinal();
        int iOrdinal2 = this.f6741l.ordinal();
        C1052r c1052r = this.f6737h;
        if (iOrdinal < iOrdinal2) {
            c1052r.m3957h(this.f6733d);
        } else {
            c1052r.m3957h(this.f6741l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    public final boolean equals(Object obj) {
        boolean z10;
        Set<String> setKeySet;
        boolean z11;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!C5207g.m11106a(this.f6735f, navBackStackEntry.f6735f) || !C5207g.m11106a(this.f6731b, navBackStackEntry.f6731b) || !C5207g.m11106a(this.f6737h, navBackStackEntry.f6737h) || !C5207g.m11106a(this.f6738i.f42232b, navBackStackEntry.f6738i.f42232b)) {
            return false;
        }
        Bundle bundle = this.f6732c;
        Bundle bundle2 = navBackStackEntry.f6732c;
        if (!C5207g.m11106a(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                z10 = false;
            } else {
                if (!setKeySet.isEmpty()) {
                    Iterator<T> it = setKeySet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            if (!C5207g.m11106a(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                z11 = true;
                if (z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f6731b.hashCode() + (this.f6735f.hashCode() * 31);
        Bundle bundle = this.f6732c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f6738i.f42232b.hashCode() + ((this.f6737h.hashCode() + (iHashCode * 31)) * 31);
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public final C1042k0.b mo470i() {
        return (C1030e0) this.f6740k.getValue();
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: j */
    public final AbstractC9634a mo792j() {
        C9636c c9636c = new C9636c(0);
        Context context = this.f6730a;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        if (application != null) {
            linkedHashMap.put(C1040j0.f6663a, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f6589a, this);
        linkedHashMap.put(SavedStateHandleSupport.f6590b, this);
        Bundle bundle = this.f6732c;
        if (bundle != null) {
            linkedHashMap.put(SavedStateHandleSupport.f6591c, bundle);
        }
        return c9636c;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // androidx.view.InterfaceC1048n0
    /* JADX INFO: renamed from: n */
    public final C1046m0 mo796n() {
        if (!this.f6739j) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (!(this.f6737h.f6681d != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        InterfaceC1693r interfaceC1693r = this.f6734e;
        if (interfaceC1693r != null) {
            return interfaceC1693r.mo5406H(this.f6735f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
    }

    @Override // p270n4.InterfaceC7706c
    /* JADX INFO: renamed from: q */
    public final C1189a mo797q() {
        return this.f6738i.f42232b;
    }
}
