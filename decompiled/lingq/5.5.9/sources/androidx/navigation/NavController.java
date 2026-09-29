package androidx.navigation;

import ae.C0062b;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.C0141b;
import android.util.Log;
import androidx.activity.AbstractC0195n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5213m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C6740a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import p003a2.C0009a;
import p040c4.AbstractC1695t;
import p040c4.C1677b;
import p040c4.C1679d;
import p040c4.C1684i;
import p040c4.C1685j;
import p040c4.C1686k;
import p040c4.C1689n;
import p040c4.C1690o;
import p040c4.C1691p;
import p040c4.C1694s;
import p040c4.C1696u;
import p040c4.InterfaceC1678c;
import p232l2.C7245x;
import p249lo.C7422o;
import p260m8.C7499b;
import p326q.C8453i;
import p385sf.C9000b;
import p388t1.C9181g;
import sl.C9072e;
import sl.InterfaceC9070c;
import tl.C9320h;
import tl.C9327o;
import tl.C9338z;

/* JADX INFO: loaded from: classes.dex */
public class NavController {

    /* JADX INFO: renamed from: A */
    public final ArrayList f6749A;

    /* JADX INFO: renamed from: B */
    public final InterfaceC9070c f6750B;

    /* JADX INFO: renamed from: C */
    public final C7138s f6751C;

    /* JADX INFO: renamed from: a */
    public final Context f6752a;

    /* JADX INFO: renamed from: b */
    public final Activity f6753b;

    /* JADX INFO: renamed from: c */
    public NavGraph f6754c;

    /* JADX INFO: renamed from: d */
    public Bundle f6755d;

    /* JADX INFO: renamed from: e */
    public Parcelable[] f6756e;

    /* JADX INFO: renamed from: f */
    public boolean f6757f;

    /* JADX INFO: renamed from: g */
    public final C9320h<NavBackStackEntry> f6758g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f6759h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f6760i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashMap f6761j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashMap f6762k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f6763l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1051q f6764m;

    /* JADX INFO: renamed from: n */
    public OnBackPressedDispatcher f6765n;

    /* JADX INFO: renamed from: o */
    public C1685j f6766o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList<InterfaceC1074a> f6767p;

    /* JADX INFO: renamed from: q */
    public Lifecycle.State f6768q;

    /* JADX INFO: renamed from: r */
    public final C1684i f6769r;

    /* JADX INFO: renamed from: s */
    public final C1075b f6770s;

    /* JADX INFO: renamed from: t */
    public boolean f6771t;

    /* JADX INFO: renamed from: u */
    public final C1694s f6772u;

    /* JADX INFO: renamed from: v */
    public final LinkedHashMap f6773v;

    /* JADX INFO: renamed from: w */
    public InterfaceC2052l<? super NavBackStackEntry, C9072e> f6774w;

    /* JADX INFO: renamed from: x */
    public InterfaceC2052l<? super NavBackStackEntry, C9072e> f6775x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashMap f6776y;

    /* JADX INFO: renamed from: z */
    public int f6777z;

    public final class NavControllerNavigatorState extends AbstractC1695t {

        /* JADX INFO: renamed from: g */
        public final Navigator<? extends NavDestination> f6778g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ NavController f6779h;

        public NavControllerNavigatorState(NavController navController, Navigator<? extends NavDestination> navigator) {
            C5207g.m11111f(navigator, "navigator");
            this.f6779h = navController;
            this.f6778g = navigator;
        }

        @Override // p040c4.AbstractC1695t
        /* JADX INFO: renamed from: a */
        public final NavBackStackEntry mo4006a(NavDestination navDestination, Bundle bundle) {
            NavController navController = this.f6779h;
            return NavBackStackEntry.C1070a.m3977a(navController.f6752a, navDestination, bundle, navController.m3989j(), navController.f6766o);
        }

        @Override // p040c4.AbstractC1695t
        /* JADX INFO: renamed from: c */
        public final void mo4007c(final NavBackStackEntry navBackStackEntry, final boolean z10) {
            C5207g.m11111f(navBackStackEntry, "popUpTo");
            NavController navController = this.f6779h;
            Navigator navigatorMo5414b = navController.f6772u.mo5414b(navBackStackEntry.f6731b.f6827a);
            if (!C5207g.m11106a(navigatorMo5414b, this.f6778g)) {
                Object obj = navController.f6773v.get(navigatorMo5414b);
                C5207g.m11108c(obj);
                ((NavControllerNavigatorState) obj).mo4007c(navBackStackEntry, z10);
                return;
            }
            InterfaceC2052l<? super NavBackStackEntry, C9072e> interfaceC2052l = navController.f6775x;
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(navBackStackEntry);
                super.mo4007c(navBackStackEntry, z10);
                return;
            }
            InterfaceC2041a<C9072e> interfaceC2041a = new InterfaceC2041a<C9072e>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    super/*c4.t*/.mo4007c(navBackStackEntry, z10);
                    return C9072e.f47360a;
                }
            };
            C9320h<NavBackStackEntry> c9320h = navController.f6758g;
            int iIndexOf = c9320h.indexOf(navBackStackEntry);
            if (iIndexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + navBackStackEntry + " as it was not found on the current back stack");
                return;
            }
            int i10 = iIndexOf + 1;
            if (i10 != c9320h.f48061c) {
                navController.m3997r(c9320h.get(i10).f6731b.f6834h, true, false);
            }
            NavController.m3980t(navController, navBackStackEntry);
            interfaceC2041a.mo807E();
            navController.m4004z();
            navController.m3983c();
        }

        @Override // p040c4.AbstractC1695t
        /* JADX INFO: renamed from: d */
        public final void mo4008d(NavBackStackEntry navBackStackEntry) {
            C5207g.m11111f(navBackStackEntry, "backStackEntry");
            NavController navController = this.f6779h;
            Navigator navigatorMo5414b = navController.f6772u.mo5414b(navBackStackEntry.f6731b.f6827a);
            if (!C5207g.m11106a(navigatorMo5414b, this.f6778g)) {
                Object obj = navController.f6773v.get(navigatorMo5414b);
                if (obj == null) {
                    throw new IllegalStateException(C0009a.m23l(new StringBuilder("NavigatorBackStack for "), navBackStackEntry.f6731b.f6827a, " should already be created").toString());
                }
                ((NavControllerNavigatorState) obj).mo4008d(navBackStackEntry);
                return;
            }
            InterfaceC2052l<? super NavBackStackEntry, C9072e> interfaceC2052l = navController.f6774w;
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(navBackStackEntry);
                super.mo4008d(navBackStackEntry);
            } else {
                Log.i("NavController", "Ignoring add of destination " + navBackStackEntry.f6731b + " outside of the call to navigate(). ");
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m4009f(NavBackStackEntry navBackStackEntry) {
            super.mo4008d(navBackStackEntry);
        }
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$a */
    public interface InterfaceC1074a {
        /* JADX INFO: renamed from: a */
        void mo4010a(NavController navController, NavDestination navDestination);
    }

    /* JADX INFO: renamed from: androidx.navigation.NavController$b */
    public static final class C1075b extends AbstractC0195n {
        public C1075b() {
            super(false);
        }

        @Override // androidx.activity.AbstractC0195n
        /* JADX INFO: renamed from: a */
        public final void mo823a() {
            NavController navController = NavController.this;
            if (navController.f6758g.isEmpty()) {
                return;
            }
            NavDestination navDestinationM3986g = navController.m3986g();
            C5207g.m11108c(navDestinationM3986g);
            navController.m3996q(navDestinationM3986g.f6834h, true);
        }
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [c4.i] */
    public NavController(Context context) {
        this.f6752a = context;
        for (Object obj : SequencesKt__SequencesKt.m14252M2(context, new InterfaceC2052l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Context mo528n(Context context2) {
                Context context3 = context2;
                C5207g.m11111f(context3, "it");
                if (context3 instanceof ContextWrapper) {
                    return ((ContextWrapper) context3).getBaseContext();
                }
                return null;
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f6753b = (Activity) obj;
                this.f6758g = new C9320h<>();
                StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(EmptyList.f38032a);
                this.f6759h = stateFlowImplM14379a;
                C0062b.m306S(stateFlowImplM14379a);
                this.f6760i = new LinkedHashMap();
                this.f6761j = new LinkedHashMap();
                this.f6762k = new LinkedHashMap();
                this.f6763l = new LinkedHashMap();
                this.f6767p = new CopyOnWriteArrayList<>();
                this.f6768q = Lifecycle.State.INITIALIZED;
                this.f6769r = new InterfaceC1049o() { // from class: c4.i
                    @Override // androidx.view.InterfaceC1049o
                    /* JADX INFO: renamed from: e */
                    public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                        NavController navController = this.f9411a;
                        C5207g.m11111f(navController, "this$0");
                        Lifecycle.State targetState = event.getTargetState();
                        C5207g.m11110e(targetState, "event.targetState");
                        navController.f6768q = targetState;
                        if (navController.f6754c != null) {
                            for (NavBackStackEntry navBackStackEntry : navController.f6758g) {
                                navBackStackEntry.getClass();
                                Lifecycle.State targetState2 = event.getTargetState();
                                C5207g.m11110e(targetState2, "event.targetState");
                                navBackStackEntry.f6733d = targetState2;
                                navBackStackEntry.m3976c();
                            }
                        }
                    }
                };
                this.f6770s = new C1075b();
                this.f6771t = true;
                C1694s c1694s = new C1694s();
                this.f6772u = c1694s;
                this.f6773v = new LinkedHashMap();
                this.f6776y = new LinkedHashMap();
                c1694s.m5425a(new C1083a(c1694s));
                c1694s.m5425a(new ActivityNavigator(this.f6752a));
                this.f6749A = new ArrayList();
                this.f6750B = C6740a.m13372a(new InterfaceC2041a<C1689n>() { // from class: androidx.navigation.NavController$navInflater$2
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C1689n mo807E() {
                        NavController navController = this.f6789b;
                        navController.getClass();
                        return new C1689n(navController.f6752a, navController.f6772u);
                    }
                });
                C7138s c7138sM372n = C0062b.m372n(1, 0, BufferOverflow.DROP_OLDEST, 2);
                this.f6751C = c7138sM372n;
                C0062b.m303R(c7138sM372n);
            }
        }
        obj = null;
        this.f6753b = (Activity) obj;
        this.f6758g = new C9320h<>();
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(EmptyList.f38032a);
        this.f6759h = stateFlowImplM14379a2;
        C0062b.m306S(stateFlowImplM14379a2);
        this.f6760i = new LinkedHashMap();
        this.f6761j = new LinkedHashMap();
        this.f6762k = new LinkedHashMap();
        this.f6763l = new LinkedHashMap();
        this.f6767p = new CopyOnWriteArrayList<>();
        this.f6768q = Lifecycle.State.INITIALIZED;
        this.f6769r = new InterfaceC1049o() { // from class: c4.i
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                NavController navController = this.f9411a;
                C5207g.m11111f(navController, "this$0");
                Lifecycle.State targetState = event.getTargetState();
                C5207g.m11110e(targetState, "event.targetState");
                navController.f6768q = targetState;
                if (navController.f6754c != null) {
                    for (NavBackStackEntry navBackStackEntry : navController.f6758g) {
                        navBackStackEntry.getClass();
                        Lifecycle.State targetState2 = event.getTargetState();
                        C5207g.m11110e(targetState2, "event.targetState");
                        navBackStackEntry.f6733d = targetState2;
                        navBackStackEntry.m3976c();
                    }
                }
            }
        };
        this.f6770s = new C1075b();
        this.f6771t = true;
        C1694s c1694s2 = new C1694s();
        this.f6772u = c1694s2;
        this.f6773v = new LinkedHashMap();
        this.f6776y = new LinkedHashMap();
        c1694s2.m5425a(new C1083a(c1694s2));
        c1694s2.m5425a(new ActivityNavigator(this.f6752a));
        this.f6749A = new ArrayList();
        this.f6750B = C6740a.m13372a(new InterfaceC2041a<C1689n>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1689n mo807E() {
                NavController navController = this.f6789b;
                navController.getClass();
                return new C1689n(navController.f6752a, navController.f6772u);
            }
        });
        C7138s c7138sM372n2 = C0062b.m372n(1, 0, BufferOverflow.DROP_OLDEST, 2);
        this.f6751C = c7138sM372n2;
        C0062b.m303R(c7138sM372n2);
    }

    /* JADX INFO: renamed from: e */
    public static NavDestination m3979e(NavDestination navDestination, int i10) {
        NavGraph navGraph;
        if (navDestination.f6834h == i10) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            navGraph = navDestination.f6828b;
            C5207g.m11108c(navGraph);
        }
        return navGraph.m4024t(i10, true);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m3980t(NavController navController, NavBackStackEntry navBackStackEntry) {
        navController.m3998s(navBackStackEntry, false, new C9320h<>());
    }

    /* JADX INFO: renamed from: a */
    public final void m3981a(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        NavDestination navDestination2 = navBackStackEntry.f6731b;
        boolean z10 = navDestination2 instanceof InterfaceC1678c;
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        if (!z10) {
            while (!c9320h.isEmpty() && (c9320h.last().f6731b instanceof InterfaceC1678c) && m3997r(c9320h.last().f6731b.f6834h, true, false)) {
            }
        }
        C9320h<NavBackStackEntry> c9320h2 = new C9320h();
        boolean z11 = navDestination instanceof NavGraph;
        Context context = this.f6752a;
        NavBackStackEntry navBackStackEntry2 = null;
        if (z11) {
            NavDestination navDestination3 = navDestination2;
            do {
                C5207g.m11108c(navDestination3);
                navDestination3 = navDestination3.f6828b;
                if (navDestination3 != null) {
                    ListIterator<NavBackStackEntry> listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                        navBackStackEntryPrevious2 = listIterator.previous();
                    } while (!C5207g.m11106a(navBackStackEntryPrevious2.f6731b, navDestination3));
                    NavBackStackEntry navBackStackEntryM3977a = navBackStackEntryPrevious2;
                    if (navBackStackEntryM3977a == null) {
                        navBackStackEntryM3977a = NavBackStackEntry.C1070a.m3977a(context, navDestination3, bundle, m3989j(), this.f6766o);
                    }
                    c9320h2.m17667q(navBackStackEntryM3977a);
                    if ((!c9320h.isEmpty()) && c9320h.last().f6731b == navDestination3) {
                        m3980t(this, c9320h.last());
                    }
                }
                if (navDestination3 == null) {
                    break;
                }
            } while (navDestination3 != navDestination);
        }
        NavDestination navDestination4 = c9320h2.isEmpty() ? navDestination2 : ((NavBackStackEntry) c9320h2.first()).f6731b;
        while (navDestination4 != null && m3984d(navDestination4.f6834h) == null) {
            navDestination4 = navDestination4.f6828b;
            if (navDestination4 != null) {
                ListIterator<NavBackStackEntry> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator2.previous();
                } while (!C5207g.m11106a(navBackStackEntryPrevious.f6731b, navDestination4));
                NavBackStackEntry navBackStackEntryM3977a2 = navBackStackEntryPrevious;
                if (navBackStackEntryM3977a2 == null) {
                    navBackStackEntryM3977a2 = NavBackStackEntry.C1070a.m3977a(context, navDestination4, navDestination4.m4014f(bundle), m3989j(), this.f6766o);
                }
                c9320h2.m17667q(navBackStackEntryM3977a2);
            }
        }
        if (!c9320h2.isEmpty()) {
            navDestination2 = ((NavBackStackEntry) c9320h2.first()).f6731b;
        }
        while (!c9320h.isEmpty() && (c9320h.last().f6731b instanceof NavGraph) && ((NavGraph) c9320h.last().f6731b).m4024t(navDestination2.f6834h, false) == null) {
            m3980t(this, c9320h.last());
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) (c9320h.isEmpty() ? null : c9320h.f48060b[c9320h.f48059a]);
        if (navBackStackEntry3 == null) {
            navBackStackEntry3 = (NavBackStackEntry) (c9320h2.isEmpty() ? null : c9320h2.f48060b[c9320h2.f48059a]);
        }
        if (!C5207g.m11106a(navBackStackEntry3 != null ? navBackStackEntry3.f6731b : null, this.f6754c)) {
            ListIterator<NavBackStackEntry> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination navDestination5 = navBackStackEntryPrevious3.f6731b;
                NavGraph navGraph = this.f6754c;
                C5207g.m11108c(navGraph);
                if (C5207g.m11106a(navDestination5, navGraph)) {
                    navBackStackEntry2 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryM3977a3 = navBackStackEntry2;
            if (navBackStackEntryM3977a3 == null) {
                NavGraph navGraph2 = this.f6754c;
                C5207g.m11108c(navGraph2);
                NavGraph navGraph3 = this.f6754c;
                C5207g.m11108c(navGraph3);
                navBackStackEntryM3977a3 = NavBackStackEntry.C1070a.m3977a(context, navGraph2, navGraph3.m4014f(bundle), m3989j(), this.f6766o);
            }
            c9320h2.m17667q(navBackStackEntryM3977a3);
        }
        for (NavBackStackEntry navBackStackEntry4 : c9320h2) {
            Object obj = this.f6773v.get(this.f6772u.mo5414b(navBackStackEntry4.f6731b.f6827a));
            if (obj == null) {
                throw new IllegalStateException(C0009a.m23l(new StringBuilder("NavigatorBackStack for "), navDestination.f6827a, " should already be created").toString());
            }
            ((NavControllerNavigatorState) obj).m4009f(navBackStackEntry4);
        }
        c9320h.addAll(c9320h2);
        c9320h.m17668t(navBackStackEntry);
        for (NavBackStackEntry navBackStackEntry5 : C6752c.m13439g0(navBackStackEntry, c9320h2)) {
            NavGraph navGraph4 = navBackStackEntry5.f6731b.f6828b;
            if (navGraph4 != null) {
                m3991l(navBackStackEntry5, m3985f(navGraph4.f6834h));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3982b(InterfaceC1074a interfaceC1074a) {
        this.f6767p.add(interfaceC1074a);
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        if (!c9320h.isEmpty()) {
            interfaceC1074a.mo4010a(this, c9320h.last().f6731b);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3983c() {
        C9320h<NavBackStackEntry> c9320h;
        while (true) {
            c9320h = this.f6758g;
            if (c9320h.isEmpty() || !(c9320h.last().f6731b instanceof NavGraph)) {
                break;
            }
            m3980t(this, c9320h.last());
        }
        NavBackStackEntry navBackStackEntryM17663G = c9320h.m17663G();
        ArrayList arrayList = this.f6749A;
        if (navBackStackEntryM17663G != null) {
            arrayList.add(navBackStackEntryM17663G);
        }
        this.f6777z++;
        m4003y();
        int i10 = this.f6777z - 1;
        this.f6777z = i10;
        if (i10 == 0) {
            ArrayList<NavBackStackEntry> arrayListM13454v0 = C6752c.m13454v0(arrayList);
            arrayList.clear();
            for (NavBackStackEntry navBackStackEntry : arrayListM13454v0) {
                Iterator<InterfaceC1074a> it = this.f6767p.iterator();
                while (it.hasNext()) {
                    it.next().mo4010a(this, navBackStackEntry.f6731b);
                }
                this.f6751C.mo14371k(navBackStackEntry);
            }
            this.f6759h.setValue(m3999u());
        }
        return navBackStackEntryM17663G != null;
    }

    /* JADX INFO: renamed from: d */
    public final NavDestination m3984d(int i10) {
        NavDestination navDestination;
        NavGraph navGraph = this.f6754c;
        if (navGraph == null) {
            return null;
        }
        if (navGraph.f6834h == i10) {
            return navGraph;
        }
        NavBackStackEntry navBackStackEntryM17663G = this.f6758g.m17663G();
        if (navBackStackEntryM17663G == null || (navDestination = navBackStackEntryM17663G.f6731b) == null) {
            navDestination = this.f6754c;
            C5207g.m11108c(navDestination);
        }
        return m3979e(navDestination, i10);
    }

    /* JADX INFO: renamed from: f */
    public final NavBackStackEntry m3985f(int i10) {
        NavBackStackEntry navBackStackEntryPrevious;
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        ListIterator<NavBackStackEntry> listIterator = c9320h.listIterator(c9320h.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!(navBackStackEntryPrevious.f6731b.f6834h == i10));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        StringBuilder sbM614j = C0141b.m614j("No destination with ID ", i10, " is on the NavController's back stack. The current destination is ");
        sbM614j.append(m3986g());
        throw new IllegalArgumentException(sbM614j.toString().toString());
    }

    /* JADX INFO: renamed from: g */
    public final NavDestination m3986g() {
        NavBackStackEntry navBackStackEntryM17663G = this.f6758g.m17663G();
        if (navBackStackEntryM17663G != null) {
            return navBackStackEntryM17663G.f6731b;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m3987h() {
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        int i10 = 0;
        if (!(c9320h instanceof Collection) || !c9320h.isEmpty()) {
            Iterator<NavBackStackEntry> it = c9320h.iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    if (!(it.next().f6731b instanceof NavGraph)) {
                        i10++;
                        if (i10 < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                break loop0;
            }
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final NavGraph m3988i() {
        NavGraph navGraph = this.f6754c;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        if (navGraph != null) {
            return navGraph;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
    }

    /* JADX INFO: renamed from: j */
    public final Lifecycle.State m3989j() {
        return this.f6764m == null ? Lifecycle.State.CREATED : this.f6768q;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX INFO: renamed from: k */
    public final boolean m3990k(Intent intent) {
        NavDestination.C1079a c1079aMo4019o;
        Bundle bundleM4014f;
        Context context;
        NavDestination navDestinationM4024t;
        NavGraph navGraph;
        Bundle bundle;
        NavDestination navDestinationM4024t2;
        NavGraph navGraph2;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        String strM4020a = null;
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs") : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null) {
            NavGraph navGraph3 = this.f6754c;
            C5207g.m11108c(navGraph3);
            c1079aMo4019o = navGraph3.mo4019o(new C9181g(intent));
            if (c1079aMo4019o != null) {
                NavDestination navDestination = c1079aMo4019o.f6837a;
                int[] iArrM4015g = navDestination.m4015g(null);
                bundleM4014f = navDestination.m4014f(c1079aMo4019o.f6838b);
                if (bundleM4014f != null) {
                    bundle2.putAll(bundleM4014f);
                }
                intArray = iArrM4015g;
                parcelableArrayList = null;
            }
        } else if (intArray.length == 0) {
            NavGraph navGraph4 = this.f6754c;
            C5207g.m11108c(navGraph4);
            c1079aMo4019o = navGraph4.mo4019o(new C9181g(intent));
            if (c1079aMo4019o != null) {
                NavDestination navDestination2 = c1079aMo4019o.f6837a;
                int[] iArrM4015g2 = navDestination2.m4015g(null);
                bundleM4014f = navDestination2.m4014f(c1079aMo4019o.f6838b);
                if (bundleM4014f != null) {
                    bundle2.putAll(bundleM4014f);
                }
                intArray = iArrM4015g2;
                parcelableArrayList = null;
            }
        }
        if (intArray != null) {
            if (!(intArray.length == 0)) {
                NavGraph navGraph5 = this.f6754c;
                int length = intArray.length;
                int i11 = 0;
                while (true) {
                    context = this.f6752a;
                    if (i11 >= length) {
                        break;
                    }
                    int i12 = intArray[i11];
                    if (i11 == 0) {
                        NavGraph navGraph6 = this.f6754c;
                        C5207g.m11108c(navGraph6);
                        navDestinationM4024t2 = navGraph6.f6834h == i12 ? this.f6754c : null;
                    } else {
                        C5207g.m11108c(navGraph5);
                        navDestinationM4024t2 = navGraph5.m4024t(i12, true);
                    }
                    if (navDestinationM4024t2 == null) {
                        int i13 = NavDestination.f6826j;
                        strM4020a = NavDestination.Companion.m4020a(i12, context);
                        break;
                    }
                    if (i11 != intArray.length - 1 && (navDestinationM4024t2 instanceof NavGraph)) {
                        while (true) {
                            navGraph2 = (NavGraph) navDestinationM4024t2;
                            C5207g.m11108c(navGraph2);
                            if (!(navGraph2.m4024t(navGraph2.f6846l, true) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationM4024t2 = navGraph2.m4024t(navGraph2.f6846l, true);
                        }
                        navGraph5 = navGraph2;
                    }
                    i11++;
                }
                if (strM4020a != null) {
                    Log.i("NavController", "Could not find destination " + strM4020a + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle2.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                int length2 = intArray.length;
                Bundle[] bundleArr = new Bundle[length2];
                for (int i14 = 0; i14 < length2; i14++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i14)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i14] = bundle4;
                }
                int flags = intent.getFlags();
                int i15 = 268435456 & flags;
                if (i15 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    C7245x c7245x = new C7245x(context);
                    ComponentName component = intent.getComponent();
                    if (component == null) {
                        component = intent.resolveActivity(c7245x.f40688b.getPackageManager());
                    }
                    if (component != null) {
                        c7245x.m14587a(component);
                    }
                    c7245x.f40687a.add(intent);
                    c7245x.m14588f();
                    Activity activity = this.f6753b;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i15 != 0) {
                    if (!this.f6758g.isEmpty()) {
                        NavGraph navGraph7 = this.f6754c;
                        C5207g.m11108c(navGraph7);
                        m3997r(navGraph7.f6834h, true, false);
                    }
                    while (i10 < intArray.length) {
                        int i16 = intArray[i10];
                        int i17 = i10 + 1;
                        Bundle bundle5 = bundleArr[i10];
                        final NavDestination navDestinationM3984d = m3984d(i16);
                        if (navDestinationM3984d == null) {
                            int i18 = NavDestination.f6826j;
                            StringBuilder sbM854m = C0204c.m854m("Deep Linking failed: destination ", NavDestination.Companion.m4020a(i16, context), " cannot be found from the current destination ");
                            sbM854m.append(m3986g());
                            throw new IllegalStateException(sbM854m.toString());
                        }
                        m3994o(navDestinationM3984d, bundle5, C7499b.m14948k0(new InterfaceC2052l<C1691p, C9072e>() { // from class: androidx.navigation.NavController$handleDeepLink$2

                            /* JADX INFO: renamed from: androidx.navigation.NavController$handleDeepLink$2$1 */
                            @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13365d2 = {"Lc4/b;", "Lsl/e;", "invoke", "(Lc4/b;)V", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                            final class C10761 extends Lambda implements InterfaceC2052l<C1677b, C9072e> {

                                /* JADX INFO: renamed from: b */
                                public static final C10761 f6787b = new C10761();

                                public C10761() {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C1677b c1677b) {
                                    C1677b c1677b2 = c1677b;
                                    C5207g.m11111f(c1677b2, "$this$anim");
                                    c1677b2.f9395a = 0;
                                    c1677b2.f9396b = 0;
                                    return C9072e.f47360a;
                                }
                            }

                            /* JADX INFO: renamed from: androidx.navigation.NavController$handleDeepLink$2$2 */
                            @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m13365d2 = {"Lc4/u;", "Lsl/e;", "invoke", "(Lc4/u;)V", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                            final class C10772 extends Lambda implements InterfaceC2052l<C1696u, C9072e> {

                                /* JADX INFO: renamed from: b */
                                public static final C10772 f6788b = new C10772();

                                public C10772() {
                                    super(1);
                                }

                                @Override // cm.InterfaceC2052l
                                /* JADX INFO: renamed from: n */
                                public final C9072e mo528n(C1696u c1696u) {
                                    C1696u c1696u2 = c1696u;
                                    C5207g.m11111f(c1696u2, "$this$popUpTo");
                                    c1696u2.f9467a = true;
                                    return C9072e.f47360a;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // cm.InterfaceC2052l
                            /* JADX INFO: renamed from: n */
                            public final C9072e mo528n(C1691p c1691p) {
                                boolean z10;
                                C1691p c1691p2 = c1691p;
                                C5207g.m11111f(c1691p2, "$this$navOptions");
                                C10761 c10761 = C10761.f6787b;
                                C5207g.m11111f(c10761, "animBuilder");
                                C1677b c1677b = new C1677b();
                                c10761.mo528n(c1677b);
                                int i19 = c1677b.f9395a;
                                C1690o.a aVar = c1691p2.f9438a;
                                aVar.f9434a = i19;
                                aVar.f9435b = c1677b.f9396b;
                                aVar.f9436c = c1677b.f9397c;
                                aVar.f9437d = c1677b.f9398d;
                                NavDestination navDestination3 = navDestinationM3984d;
                                boolean z11 = navDestination3 instanceof NavGraph;
                                NavController navController = this;
                                boolean z12 = false;
                                if (z11) {
                                    int i20 = NavDestination.f6826j;
                                    Iterator it = NavDestination.Companion.m4021b(navDestination3).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z10 = true;
                                            break;
                                        }
                                        NavDestination navDestination4 = (NavDestination) it.next();
                                        NavDestination navDestinationM3986g = navController.m3986g();
                                        if (C5207g.m11106a(navDestination4, navDestinationM3986g != null ? navDestinationM3986g.f6828b : null)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                    if (z10) {
                                        z12 = true;
                                    }
                                }
                                if (z12) {
                                    int i21 = NavGraph.f6842J;
                                    int i22 = NavGraph.Companion.m4026a(navController.m3988i()).f6834h;
                                    C10772 c10772 = C10772.f6788b;
                                    C5207g.m11111f(c10772, "popUpToBuilder");
                                    c1691p2.f9440c = i22;
                                    C1696u c1696u = new C1696u();
                                    c10772.mo528n(c1696u);
                                    c1691p2.f9441d = c1696u.f9467a;
                                }
                                return C9072e.f47360a;
                            }
                        }));
                        i10 = i17;
                    }
                    return true;
                }
                NavGraph navGraph8 = this.f6754c;
                int length3 = intArray.length;
                while (i10 < length3) {
                    int i19 = intArray[i10];
                    Bundle bundle6 = bundleArr[i10];
                    if (i10 == 0) {
                        navDestinationM4024t = this.f6754c;
                    } else {
                        C5207g.m11108c(navGraph8);
                        navDestinationM4024t = navGraph8.m4024t(i19, true);
                    }
                    if (navDestinationM4024t == null) {
                        int i20 = NavDestination.f6826j;
                        throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.Companion.m4020a(i19, context) + " cannot be found in graph " + navGraph8);
                    }
                    if (i10 == intArray.length - 1) {
                        NavGraph navGraph9 = this.f6754c;
                        C5207g.m11108c(navGraph9);
                        m3994o(navDestinationM4024t, bundle6, new C1690o(false, false, navGraph9.f6834h, true, false, 0, 0, -1, -1));
                    } else if (navDestinationM4024t instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationM4024t;
                            C5207g.m11108c(navGraph);
                            if (!(navGraph.m4024t(navGraph.f6846l, true) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationM4024t = navGraph.m4024t(navGraph.f6846l, true);
                        }
                        navGraph8 = navGraph;
                    }
                    i10++;
                }
                this.f6757f = true;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final void m3991l(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f6760i.put(navBackStackEntry, navBackStackEntry2);
        LinkedHashMap linkedHashMap = this.f6761j;
        if (linkedHashMap.get(navBackStackEntry2) == null) {
            linkedHashMap.put(navBackStackEntry2, new AtomicInteger(0));
        }
        Object obj = linkedHashMap.get(navBackStackEntry2);
        C5207g.m11108c(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x00ad, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: m */
    public final void m3992m(int i10, Bundle bundle, C1690o c1690o) {
        int i11;
        Bundle bundle2;
        boolean z10;
        NavDestination navDestinationM3984d;
        Context context;
        String strM4020a;
        int i12;
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        NavDestination navDestination = c9320h.isEmpty() ? this.f6754c : c9320h.last().f6731b;
        if (navDestination == null) {
            throw new IllegalStateException("no current navigation node");
        }
        C1679d c1679dM4016i = navDestination.m4016i(i10);
        if (c1679dM4016i != null) {
            if (c1690o == null) {
                c1690o = c1679dM4016i.f9400b;
            }
            Bundle bundle3 = c1679dM4016i.f9401c;
            i11 = c1679dM4016i.f9399a;
            if (bundle3 != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundle3);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i11 != 0 && c1690o != null && (i12 = c1690o.f9427c) != -1) {
                m3996q(i12, c1690o.f9428d);
                return;
            }
            if (i11 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            navDestinationM3984d = m3984d(i11);
            if (navDestinationM3984d == null) {
                m3994o(navDestinationM3984d, bundle2, c1690o);
                return;
            }
            int i13 = NavDestination.f6826j;
            context = this.f6752a;
            strM4020a = NavDestination.Companion.m4020a(i11, context);
            if (c1679dM4016i == null) {
                throw new IllegalArgumentException("Navigation action/destination " + strM4020a + " cannot be found from the current destination " + navDestination);
            }
            StringBuilder sbM854m = C0204c.m854m("Navigation destination ", strM4020a, " referenced from action ");
            sbM854m.append(NavDestination.Companion.m4020a(i10, context));
            sbM854m.append(" cannot be found from the current destination ");
            sbM854m.append(navDestination);
            throw new IllegalArgumentException(sbM854m.toString().toString());
        }
        i11 = i10;
        bundle2 = null;
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (i11 != 0) {
        }
        if (i11 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        navDestinationM3984d = m3984d(i11);
        if (navDestinationM3984d == null) {
            m3994o(navDestinationM3984d, bundle2, c1690o);
            return;
        }
        int i14 = NavDestination.f6826j;
        context = this.f6752a;
        strM4020a = NavDestination.Companion.m4020a(i11, context);
        if (c1679dM4016i == null) {
            StringBuilder sbM854m2 = C0204c.m854m("Navigation destination ", strM4020a, " referenced from action ");
            sbM854m2.append(NavDestination.Companion.m4020a(i10, context));
            sbM854m2.append(" cannot be found from the current destination ");
            sbM854m2.append(navDestination);
            throw new IllegalArgumentException(sbM854m2.toString().toString());
        }
        throw new IllegalArgumentException("Navigation action/destination " + strM4020a + " cannot be found from the current destination " + navDestination);
    }

    /* JADX INFO: renamed from: n */
    public final void m3993n(Uri uri) {
        C5207g.m11111f(uri, "deepLink");
        C9181g c9181g = new C9181g(uri, (String) null, (String) null);
        NavGraph navGraph = this.f6754c;
        C5207g.m11108c(navGraph);
        NavDestination.C1079a c1079aMo4019o = navGraph.mo4019o(c9181g);
        if (c1079aMo4019o == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + c9181g + " cannot be found in the navigation graph " + this.f6754c);
        }
        NavDestination navDestination = c1079aMo4019o.f6837a;
        Bundle bundleM4014f = navDestination.m4014f(c1079aMo4019o.f6838b);
        if (bundleM4014f == null) {
            bundleM4014f = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleM4014f.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        m3994o(navDestination, bundleM4014f, null);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x010d A[LOOP:1: B:44:0x0107->B:46:0x010d, LOOP_END] */
    /* JADX INFO: renamed from: o */
    public final void m3994o(final NavDestination navDestination, Bundle bundle, C1690o c1690o) {
        boolean z10;
        NavDestination navDestination2;
        Iterator it;
        int i10;
        LinkedHashMap linkedHashMap = this.f6773v;
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).f9464d = true;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        boolean zM3997r = (c1690o == null || (i10 = c1690o.f9427c) == -1) ? false : m3997r(i10, c1690o.f9428d, c1690o.f9429e);
        final Bundle bundleM4014f = navDestination.m4014f(bundle);
        if ((c1690o != null && c1690o.f9426b) && this.f6762k.containsKey(Integer.valueOf(navDestination.f6834h))) {
            ref$BooleanRef.f38122a = m4000v(navDestination.f6834h, bundleM4014f, c1690o);
        } else {
            C9320h<NavBackStackEntry> c9320h = this.f6758g;
            NavBackStackEntry navBackStackEntryM17663G = c9320h.m17663G();
            Navigator navigatorMo5414b = this.f6772u.mo5414b(navDestination.f6827a);
            if (c1690o != null && c1690o.f9425a) {
                if ((navBackStackEntryM17663G == null || (navDestination2 = navBackStackEntryM17663G.f6731b) == null || navDestination.f6834h != navDestination2.f6834h) ? false : true) {
                    m4002x(c9320h.m17666X());
                    C5207g.m11111f(navBackStackEntryM17663G, "entry");
                    zM3997r = zM3997r;
                    NavBackStackEntry navBackStackEntry = new NavBackStackEntry(navBackStackEntryM17663G.f6730a, navBackStackEntryM17663G.f6731b, bundleM4014f, navBackStackEntryM17663G.f6733d, navBackStackEntryM17663G.f6734e, navBackStackEntryM17663G.f6735f, navBackStackEntryM17663G.f6736g);
                    navBackStackEntry.f6733d = navBackStackEntryM17663G.f6733d;
                    navBackStackEntry.m3975a(navBackStackEntryM17663G.f6741l);
                    c9320h.m17668t(navBackStackEntry);
                    NavGraph navGraph = navBackStackEntry.f6731b.f6828b;
                    if (navGraph != null) {
                        m3991l(navBackStackEntry, m3985f(navGraph.f6834h));
                    }
                    navigatorMo5414b.mo4030f(navBackStackEntry);
                    z10 = true;
                }
                m4004z();
                it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((NavControllerNavigatorState) it.next()).f9464d = false;
                }
                if (!zM3997r || ref$BooleanRef.f38122a || z10) {
                    m3983c();
                } else {
                    m4003y();
                    return;
                }
            }
            List listM17251q = C9000b.m17251q(NavBackStackEntry.C1070a.m3977a(this.f6752a, navDestination, bundleM4014f, m3989j(), this.f6766o));
            this.f6774w = new InterfaceC2052l<NavBackStackEntry, C9072e>() { // from class: androidx.navigation.NavController$navigate$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(NavBackStackEntry navBackStackEntry2) {
                    NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
                    C5207g.m11111f(navBackStackEntry3, "it");
                    ref$BooleanRef.f38122a = true;
                    EmptyList emptyList = EmptyList.f38032a;
                    this.m3981a(navDestination, bundleM4014f, navBackStackEntry3, emptyList);
                    return C9072e.f47360a;
                }
            };
            navigatorMo5414b.mo4028d(listM17251q, c1690o);
            this.f6774w = null;
        }
        z10 = false;
        m4004z();
        it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).f9464d = false;
        }
        if (zM3997r) {
        }
        m3983c();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: p */
    public final void m3995p() {
        Intent intent;
        if (m3987h() != 1) {
            if (this.f6758g.isEmpty()) {
                return;
            }
            NavDestination navDestinationM3986g = m3986g();
            C5207g.m11108c(navDestinationM3986g);
            m3996q(navDestinationM3986g.f6834h, true);
            return;
        }
        Activity activity = this.f6753b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            NavDestination navDestinationM3986g2 = m3986g();
            C5207g.m11108c(navDestinationM3986g2);
            int i10 = navDestinationM3986g2.f6834h;
            for (NavGraph navGraph = navDestinationM3986g2.f6828b; navGraph != null; navGraph = navGraph.f6828b) {
                if (navGraph.f6846l != i10) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        NavGraph navGraph2 = this.f6754c;
                        C5207g.m11108c(navGraph2);
                        Intent intent2 = activity.getIntent();
                        C5207g.m11110e(intent2, "activity!!.intent");
                        NavDestination.C1079a c1079aMo4019o = navGraph2.mo4019o(new C9181g(intent2));
                        if (c1079aMo4019o != null) {
                            bundle.putAll(c1079aMo4019o.f6837a.m4014f(c1079aMo4019o.f6838b));
                        }
                    }
                    C1686k c1686k = new C1686k(this);
                    C1686k.m5407e(c1686k, navGraph.f6834h);
                    c1686k.f9418e = bundle;
                    c1686k.f9415b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    c1686k.m5409b().m14588f();
                    if (activity != null) {
                        activity.finish();
                        return;
                    }
                    return;
                }
                i10 = navGraph.f6834h;
            }
            return;
        }
        if (this.f6757f) {
            C5207g.m11108c(activity);
            Intent intent3 = activity.getIntent();
            Bundle extras2 = intent3.getExtras();
            C5207g.m11108c(extras2);
            int[] intArray = extras2.getIntArray("android-support-nav:controller:deepLinkIds");
            C5207g.m11108c(intArray);
            ArrayList arrayListM13392x0 = C6744b.m13392x0(intArray);
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            if (arrayListM13392x0.isEmpty()) {
                throw new NoSuchElementException("List is empty.");
            }
            int iIntValue = ((Number) arrayListM13392x0.remove(C9000b.m17249o(arrayListM13392x0))).intValue();
            if (parcelableArrayList != null) {
                if (parcelableArrayList.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
            }
            if (arrayListM13392x0.isEmpty()) {
                return;
            }
            NavDestination navDestinationM3979e = m3979e(m3988i(), iIntValue);
            if (navDestinationM3979e instanceof NavGraph) {
                int i11 = NavGraph.f6842J;
                iIntValue = NavGraph.Companion.m4026a((NavGraph) navDestinationM3979e).f6834h;
            }
            NavDestination navDestinationM3986g3 = m3986g();
            int i12 = 0;
            if (navDestinationM3986g3 != null && iIntValue == navDestinationM3986g3.f6834h) {
                C1686k c1686k2 = new C1686k(this);
                Bundle bundleM327Z = C0062b.m327Z(new Pair("android-support-nav:controller:deepLinkIntent", intent3));
                Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                if (bundle2 != null) {
                    bundleM327Z.putAll(bundle2);
                }
                c1686k2.f9418e = bundleM327Z;
                c1686k2.f9415b.putExtra("android-support-nav:controller:deepLinkExtras", bundleM327Z);
                for (Object obj : arrayListM13392x0) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    c1686k2.f9417d.add(new C1686k.a(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i12) : null));
                    if (c1686k2.f9416c != null) {
                        c1686k2.m5413g();
                    }
                    i12 = i13;
                }
                c1686k2.m5409b().m14588f();
                activity.finish();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3996q(int i10, boolean z10) {
        boolean z11 = false;
        if (m3997r(i10, z10, false) && m3983c()) {
            z11 = true;
        }
        return z11;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3997r(int i10, boolean z10, final boolean z11) {
        NavDestination navDestination;
        String str;
        String str2;
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        if (c9320h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C6752c.m13441i0(c9320h).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            NavDestination navDestination2 = ((NavBackStackEntry) it.next()).f6731b;
            Navigator navigatorMo5414b = this.f6772u.mo5414b(navDestination2.f6827a);
            if (z10 || navDestination2.f6834h != i10) {
                arrayList.add(navigatorMo5414b);
            }
            if (navDestination2.f6834h == i10) {
                navDestination = navDestination2;
                break;
            }
        }
        if (navDestination == null) {
            int i11 = NavDestination.f6826j;
            Log.i("NavController", "Ignoring popBackStack to destination " + NavDestination.Companion.m4020a(i10, this.f6752a) + " as it was not found on the current back stack");
            return false;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        final C9320h c9320h2 = new C9320h();
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            Navigator navigator = (Navigator) it2.next();
            final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
            NavBackStackEntry navBackStackEntryLast = c9320h.last();
            C9320h<NavBackStackEntry> c9320h3 = c9320h;
            this.f6775x = new InterfaceC2052l<NavBackStackEntry, C9072e>() { // from class: androidx.navigation.NavController$popBackStackInternal$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(NavBackStackEntry navBackStackEntry) {
                    NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                    C5207g.m11111f(navBackStackEntry2, "entry");
                    ref$BooleanRef2.f38122a = true;
                    ref$BooleanRef.f38122a = true;
                    this.m3998s(navBackStackEntry2, z11, c9320h2);
                    return C9072e.f47360a;
                }
            };
            navigator.mo4033i(navBackStackEntryLast, z11);
            str = null;
            this.f6775x = null;
            if (!ref$BooleanRef2.f38122a) {
                break;
            }
            c9320h = c9320h3;
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f6762k;
            if (!z10) {
                C7422o.a aVar = new C7422o.a(new C7422o(SequencesKt__SequencesKt.m14252M2(navDestination, new InterfaceC2052l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$popBackStackInternal$3
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final NavDestination mo528n(NavDestination navDestination3) {
                        NavDestination navDestination4 = navDestination3;
                        C5207g.m11111f(navDestination4, "destination");
                        NavGraph navGraph = navDestination4.f6828b;
                        if (navGraph != null && navGraph.f6846l == navDestination4.f6834h) {
                            return navGraph;
                        }
                        return null;
                    }
                }), new InterfaceC2052l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$popBackStackInternal$4
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(NavDestination navDestination3) {
                        NavDestination navDestination4 = navDestination3;
                        C5207g.m11111f(navDestination4, "destination");
                        return Boolean.valueOf(!this.f6800b.f6762k.containsKey(Integer.valueOf(navDestination4.f6834h)));
                    }
                }));
                while (aVar.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((NavDestination) aVar.next()).f6834h);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) (c9320h2.isEmpty() ? str : c9320h2.f48060b[c9320h2.f48059a]);
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f6745a : str);
                }
            }
            if (!c9320h2.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c9320h2.first();
                C7422o.a aVar2 = new C7422o.a(new C7422o(SequencesKt__SequencesKt.m14252M2(m3984d(navBackStackEntryState2.f6746b), new InterfaceC2052l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$popBackStackInternal$6
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final NavDestination mo528n(NavDestination navDestination3) {
                        NavDestination navDestination4 = navDestination3;
                        C5207g.m11111f(navDestination4, "destination");
                        NavGraph navGraph = navDestination4.f6828b;
                        if (navGraph != null && navGraph.f6846l == navDestination4.f6834h) {
                            return navGraph;
                        }
                        return null;
                    }
                }), new InterfaceC2052l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$popBackStackInternal$7
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final Boolean mo528n(NavDestination navDestination3) {
                        NavDestination navDestination4 = navDestination3;
                        C5207g.m11111f(navDestination4, "destination");
                        return Boolean.valueOf(!this.f6802b.f6762k.containsKey(Integer.valueOf(navDestination4.f6834h)));
                    }
                }));
                while (true) {
                    boolean zHasNext = aVar2.hasNext();
                    str2 = navBackStackEntryState2.f6745a;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((NavDestination) aVar2.next()).f6834h), str2);
                }
                this.f6763l.put(str2, c9320h2);
            }
        }
        m4004z();
        return ref$BooleanRef.f38122a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public final void m3998s(NavBackStackEntry navBackStackEntry, boolean z10, C9320h<NavBackStackEntryState> c9320h) {
        C1685j c1685j;
        C7135p c7135p;
        Set set;
        C9320h<NavBackStackEntry> c9320h2 = this.f6758g;
        NavBackStackEntry navBackStackEntryLast = c9320h2.last();
        if (!C5207g.m11106a(navBackStackEntryLast, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.f6731b + ", which is not the top of the back stack (" + navBackStackEntryLast.f6731b + ')').toString());
        }
        c9320h2.m17666X();
        NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f6773v.get(this.f6772u.mo5414b(navBackStackEntryLast.f6731b.f6827a));
        boolean z11 = true;
        if (!((navControllerNavigatorState == null || (c7135p = navControllerNavigatorState.f9466f) == null || (set = (Set) c7135p.getValue()) == null || !set.contains(navBackStackEntryLast)) ? false : true) && !this.f6761j.containsKey(navBackStackEntryLast)) {
            z11 = false;
        }
        Lifecycle.State state = navBackStackEntryLast.f6737h.f6681d;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        if (state.isAtLeast(state2)) {
            if (z10) {
                navBackStackEntryLast.m3975a(state2);
                c9320h.m17667q(new NavBackStackEntryState(navBackStackEntryLast));
            }
            if (z11) {
                navBackStackEntryLast.m3975a(state2);
            } else {
                navBackStackEntryLast.m3975a(Lifecycle.State.DESTROYED);
                m4002x(navBackStackEntryLast);
            }
        }
        if (z10 || z11 || (c1685j = this.f6766o) == null) {
            return;
        }
        String str = navBackStackEntryLast.f6735f;
        C5207g.m11111f(str, "backStackEntryId");
        C1046m0 c1046m0 = (C1046m0) c1685j.f9413d.remove(str);
        if (c1046m0 != null) {
            c1046m0.m3952a();
        }
    }

    /* JADX INFO: renamed from: u */
    public final ArrayList m3999u() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6773v.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((NavControllerNavigatorState) it.next()).f9466f.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = iterable.iterator();
            while (true) {
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                        if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.f6741l.isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                            arrayList2.add(next);
                        }
                    }
                }
            }
            C9327o.m17684D(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : this.f6758g) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.f6741l.isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        C9327o.m17684D(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            for (Object obj : arrayList) {
                if (!(((NavBackStackEntry) obj).f6731b instanceof NavGraph)) {
                    arrayList4.add(obj);
                }
            }
            return arrayList4;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m4000v(int i10, final Bundle bundle, C1690o c1690o) {
        NavDestination navDestinationM3988i;
        NavBackStackEntry navBackStackEntry;
        NavDestination navDestination;
        LinkedHashMap linkedHashMap = this.f6762k;
        if (!linkedHashMap.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        final String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        InterfaceC2052l<String, Boolean> interfaceC2052l = new InterfaceC2052l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(String str2) {
                return Boolean.valueOf(C5207g.m11106a(str2, str));
            }
        };
        C5207g.m11111f(collectionValues, "<this>");
        C9327o.m17685E(collectionValues, interfaceC2052l);
        C9320h<NavBackStackEntryState> c9320h = (C9320h) C5213m.m11198c(this.f6763l).remove(str);
        final ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryM17663G = this.f6758g.m17663G();
        if (navBackStackEntryM17663G == null || (navDestinationM3988i = navBackStackEntryM17663G.f6731b) == null) {
            navDestinationM3988i = m3988i();
        }
        if (c9320h != null) {
            for (NavBackStackEntryState navBackStackEntryState : c9320h) {
                NavDestination navDestinationM3979e = m3979e(navDestinationM3988i, navBackStackEntryState.f6746b);
                Context context = this.f6752a;
                if (navDestinationM3979e == null) {
                    int i11 = NavDestination.f6826j;
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.Companion.m4020a(navBackStackEntryState.f6746b, context) + " cannot be found from the current destination " + navDestinationM3988i).toString());
                }
                arrayList.add(navBackStackEntryState.m3978a(context, navDestinationM3979e, m3989j(), this.f6766o));
                navDestinationM3988i = navDestinationM3979e;
            }
        }
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((NavBackStackEntry) obj).f6731b instanceof NavGraph)) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (true) {
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) it.next();
            List list = (List) C6752c.m13433a0(arrayList2);
            if (list != null && (navBackStackEntry = (NavBackStackEntry) C6752c.m13432Z(list)) != null && (navDestination = navBackStackEntry.f6731b) != null) {
                str2 = navDestination.f6827a;
            }
            if (C5207g.m11106a(str2, navBackStackEntry2.f6731b.f6827a)) {
                list.add(navBackStackEntry2);
            } else {
                arrayList2.add(C9000b.m17254t(navBackStackEntry2));
            }
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        for (List list2 : arrayList2) {
            Navigator navigatorMo5414b = this.f6772u.mo5414b(((NavBackStackEntry) C6752c.m13423Q(list2)).f6731b.f6827a);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            this.f6774w = new InterfaceC2052l<NavBackStackEntry, C9072e>() { // from class: androidx.navigation.NavController$restoreStateInternal$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(NavBackStackEntry navBackStackEntry3) {
                    List<NavBackStackEntry> listSubList;
                    NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                    C5207g.m11111f(navBackStackEntry4, "entry");
                    ref$BooleanRef.f38122a = true;
                    List<NavBackStackEntry> list3 = arrayList;
                    int iIndexOf = list3.indexOf(navBackStackEntry4);
                    if (iIndexOf != -1) {
                        Ref$IntRef ref$IntRef2 = ref$IntRef;
                        int i12 = iIndexOf + 1;
                        listSubList = list3.subList(ref$IntRef2.f38125a, i12);
                        ref$IntRef2.f38125a = i12;
                    } else {
                        listSubList = EmptyList.f38032a;
                    }
                    this.m3981a(navBackStackEntry4.f6731b, bundle, navBackStackEntry4, listSubList);
                    return C9072e.f47360a;
                }
            };
            navigatorMo5414b.mo4028d(list2, c1690o);
            this.f6774w = null;
        }
        return ref$BooleanRef.f38122a;
    }

    /* JADX INFO: renamed from: w */
    public final void m4001w(NavGraph navGraph, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        boolean zM11106a = C5207g.m11106a(this.f6754c, navGraph);
        C9320h<NavBackStackEntry> c9320h = this.f6758g;
        if (zM11106a) {
            C8453i<NavDestination> c8453i = navGraph.f6845k;
            int iM16537h = c8453i.m16537h();
            for (int i10 = 0; i10 < iM16537h; i10++) {
                NavDestination navDestinationM16538i = c8453i.m16538i(i10);
                NavGraph navGraph2 = this.f6754c;
                C5207g.m11108c(navGraph2);
                C8453i<NavDestination> c8453i2 = navGraph2.f6845k;
                if (c8453i2.f45621a) {
                    c8453i2.m16534e();
                }
                int iM318W = C0062b.m318W(c8453i2.f45624d, i10, c8453i2.f45622b);
                if (iM318W >= 0) {
                    Object[] objArr = c8453i2.f45623c;
                    Object obj = objArr[iM318W];
                    objArr[iM318W] = navDestinationM16538i;
                }
                ArrayList<NavBackStackEntry> arrayList = new ArrayList();
                for (NavBackStackEntry navBackStackEntry : c9320h) {
                    if (navDestinationM16538i != null && navBackStackEntry.f6731b.f6834h == navDestinationM16538i.f6834h) {
                        arrayList.add(navBackStackEntry);
                    }
                }
                for (NavBackStackEntry navBackStackEntry2 : arrayList) {
                    C5207g.m11110e(navDestinationM16538i, "newDestination");
                    navBackStackEntry2.getClass();
                    navBackStackEntry2.f6731b = navDestinationM16538i;
                }
            }
            return;
        }
        NavGraph navGraph3 = this.f6754c;
        LinkedHashMap linkedHashMap = this.f6773v;
        if (navGraph3 != null) {
            for (Integer num : new ArrayList(this.f6762k.keySet())) {
                C5207g.m11110e(num, "id");
                int iIntValue = num.intValue();
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((NavControllerNavigatorState) it.next()).f9464d = true;
                }
                boolean zM4000v = m4000v(iIntValue, null, null);
                Iterator it2 = linkedHashMap.values().iterator();
                while (it2.hasNext()) {
                    ((NavControllerNavigatorState) it2.next()).f9464d = false;
                }
                if (zM4000v) {
                    m3997r(iIntValue, true, false);
                }
            }
            m3997r(navGraph3.f6834h, true, false);
        }
        this.f6754c = navGraph;
        Bundle bundle2 = this.f6755d;
        C1694s c1694s = this.f6772u;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) != null) {
            for (String str : stringArrayList) {
                C5207g.m11110e(str, "name");
                Navigator navigatorMo5414b = c1694s.mo5414b(str);
                Bundle bundle3 = bundle2.getBundle(str);
                if (bundle3 != null) {
                    navigatorMo5414b.mo4031g(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f6756e;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationM3984d = m3984d(navBackStackEntryState.f6746b);
                Context context = this.f6752a;
                if (navDestinationM3984d == null) {
                    int i11 = NavDestination.f6826j;
                    StringBuilder sbM854m = C0204c.m854m("Restoring the Navigation back stack failed: destination ", NavDestination.Companion.m4020a(navBackStackEntryState.f6746b, context), " cannot be found from the current destination ");
                    sbM854m.append(m3986g());
                    throw new IllegalStateException(sbM854m.toString());
                }
                NavBackStackEntry navBackStackEntryM3978a = navBackStackEntryState.m3978a(context, navDestinationM3984d, m3989j(), this.f6766o);
                Navigator navigatorMo5414b2 = c1694s.mo5414b(navDestinationM3984d.f6827a);
                Object navControllerNavigatorState = linkedHashMap.get(navigatorMo5414b2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigatorMo5414b2);
                    linkedHashMap.put(navigatorMo5414b2, navControllerNavigatorState);
                }
                c9320h.m17668t(navBackStackEntryM3978a);
                ((NavControllerNavigatorState) navControllerNavigatorState).m4009f(navBackStackEntryM3978a);
                NavGraph navGraph4 = navBackStackEntryM3978a.f6731b.f6828b;
                if (navGraph4 != null) {
                    m3991l(navBackStackEntryM3978a, m3985f(navGraph4.f6834h));
                }
            }
            m4004z();
            this.f6756e = null;
        }
        Collection collectionValues = C6753d.m13465R0(c1694s.f9460a).values();
        ArrayList<Navigator> arrayList2 = new ArrayList();
        for (Object obj2 : collectionValues) {
            if (!((Navigator) obj2).f6854b) {
                arrayList2.add(obj2);
            }
        }
        for (Navigator navigator : arrayList2) {
            Object navControllerNavigatorState2 = linkedHashMap.get(navigator);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator);
                linkedHashMap.put(navigator, navControllerNavigatorState2);
            }
            navigator.mo4029e((NavControllerNavigatorState) navControllerNavigatorState2);
        }
        if (this.f6754c == null || !c9320h.isEmpty()) {
            m3983c();
            return;
        }
        if ((this.f6757f || (activity = this.f6753b) == null || !m3990k(activity.getIntent())) ? false : true) {
            return;
        }
        NavGraph navGraph5 = this.f6754c;
        C5207g.m11108c(navGraph5);
        m3994o(navGraph5, bundle, null);
    }

    /* JADX INFO: renamed from: x */
    public final void m4002x(NavBackStackEntry navBackStackEntry) {
        boolean z10;
        C1685j c1685j;
        C5207g.m11111f(navBackStackEntry, "child");
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) this.f6760i.remove(navBackStackEntry);
        if (navBackStackEntry2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f6761j;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(navBackStackEntry2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f6773v.get(this.f6772u.mo5414b(navBackStackEntry2.f6731b.f6827a));
            if (navControllerNavigatorState != null) {
                NavController navController = navControllerNavigatorState.f6779h;
                boolean zM11106a = C5207g.m11106a(navController.f6776y.get(navBackStackEntry2), Boolean.TRUE);
                StateFlowImpl stateFlowImpl = navControllerNavigatorState.f9463c;
                stateFlowImpl.setValue(C9338z.m17689L0((Set) stateFlowImpl.getValue(), navBackStackEntry2));
                navController.f6776y.remove(navBackStackEntry2);
                C9320h<NavBackStackEntry> c9320h = navController.f6758g;
                boolean zContains = c9320h.contains(navBackStackEntry2);
                StateFlowImpl stateFlowImpl2 = navController.f6759h;
                if (!zContains) {
                    navController.m4002x(navBackStackEntry2);
                    if (navBackStackEntry2.f6737h.f6681d.isAtLeast(Lifecycle.State.CREATED)) {
                        navBackStackEntry2.m3975a(Lifecycle.State.DESTROYED);
                    }
                    boolean zIsEmpty = c9320h.isEmpty();
                    String str = navBackStackEntry2.f6735f;
                    if (!zIsEmpty) {
                        Iterator<NavBackStackEntry> it = c9320h.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z10 = true;
                                break;
                            } else if (C5207g.m11106a(it.next().f6735f, str)) {
                                z10 = false;
                                break;
                            }
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                    if (z10 && !zM11106a && (c1685j = navController.f6766o) != null) {
                        C5207g.m11111f(str, "backStackEntryId");
                        C1046m0 c1046m0 = (C1046m0) c1685j.f9413d.remove(str);
                        if (c1046m0 != null) {
                            c1046m0.m3952a();
                        }
                    }
                    navController.m4003y();
                    stateFlowImpl2.setValue(navController.m3999u());
                } else if (!navControllerNavigatorState.f9464d) {
                    navController.m4003y();
                    stateFlowImpl2.setValue(navController.m3999u());
                }
            }
            linkedHashMap.remove(navBackStackEntry2);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m4003y() {
        NavDestination navDestination;
        C7135p c7135p;
        Set set;
        ArrayList<NavBackStackEntry> arrayListM13454v0 = C6752c.m13454v0(this.f6758g);
        if (arrayListM13454v0.isEmpty()) {
            return;
        }
        NavDestination navDestination2 = ((NavBackStackEntry) C6752c.m13432Z(arrayListM13454v0)).f6731b;
        if (!(navDestination2 instanceof InterfaceC1678c)) {
            navDestination = null;
            break;
        }
        Iterator it = C6752c.m13441i0(arrayListM13454v0).iterator();
        while (true) {
            if (!it.hasNext()) {
                navDestination = null;
                break;
            }
            navDestination = ((NavBackStackEntry) it.next()).f6731b;
            if (!(navDestination instanceof NavGraph) && !(navDestination instanceof InterfaceC1678c)) {
                break;
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : C6752c.m13441i0(arrayListM13454v0)) {
            Lifecycle.State state = navBackStackEntry.f6741l;
            NavDestination navDestination3 = navBackStackEntry.f6731b;
            if (navDestination2 != null && navDestination3.f6834h == navDestination2.f6834h) {
                Lifecycle.State state2 = Lifecycle.State.RESUMED;
                if (state != state2) {
                    NavControllerNavigatorState navControllerNavigatorState = (NavControllerNavigatorState) this.f6773v.get(this.f6772u.mo5414b(navDestination3.f6827a));
                    if (!C5207g.m11106a((navControllerNavigatorState == null || (c7135p = navControllerNavigatorState.f9466f) == null || (set = (Set) c7135p.getValue()) == null) ? null : Boolean.valueOf(set.contains(navBackStackEntry)), Boolean.TRUE)) {
                        AtomicInteger atomicInteger = (AtomicInteger) this.f6761j.get(navBackStackEntry);
                        if (!(atomicInteger != null && atomicInteger.get() == 0)) {
                            map.put(navBackStackEntry, state2);
                        }
                    }
                    map.put(navBackStackEntry, Lifecycle.State.STARTED);
                }
                navDestination2 = navDestination2.f6828b;
            } else if (navDestination == null || navDestination3.f6834h != navDestination.f6834h) {
                navBackStackEntry.m3975a(Lifecycle.State.CREATED);
            } else {
                if (state == Lifecycle.State.RESUMED) {
                    navBackStackEntry.m3975a(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state3 = Lifecycle.State.STARTED;
                    if (state != state3) {
                        map.put(navBackStackEntry, state3);
                    }
                }
                navDestination = navDestination.f6828b;
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayListM13454v0) {
            Lifecycle.State state4 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state4 != null) {
                navBackStackEntry2.m3975a(state4);
            } else {
                navBackStackEntry2.m3976c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000e  */
    /* JADX INFO: renamed from: z */
    public final void m4004z() {
        boolean z10;
        if (this.f6771t) {
            z10 = m3987h() > 1;
        }
        C1075b c1075b = this.f6770s;
        c1075b.f500a = z10;
        InterfaceC2041a<C9072e> interfaceC2041a = c1075b.f502c;
        if (interfaceC2041a != null) {
            interfaceC2041a.mo807E();
        }
    }
}
