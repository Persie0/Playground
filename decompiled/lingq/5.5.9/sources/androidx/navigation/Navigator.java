package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.C6752c;
import kotlin.sequences.C7073a;
import p040c4.AbstractC1695t;
import p040c4.C1690o;
import p040c4.C1691p;
import p249lo.C7412e;
import p260m8.C7499b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public abstract class Navigator<D extends NavDestination> {

    /* JADX INFO: renamed from: a */
    public AbstractC1695t f6853a;

    /* JADX INFO: renamed from: b */
    public boolean f6854b;

    /* JADX INFO: renamed from: androidx.navigation.Navigator$a */
    public interface InterfaceC1081a {
    }

    /* JADX INFO: renamed from: androidx.navigation.Navigator$b */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface InterfaceC1082b {
        String value();
    }

    /* JADX INFO: renamed from: a */
    public abstract D mo3971a();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC1695t m4027b() {
        AbstractC1695t abstractC1695t = this.f6853a;
        if (abstractC1695t != null) {
            return abstractC1695t;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    /* JADX INFO: renamed from: c */
    public NavDestination mo3972c(D d10, Bundle bundle, C1690o c1690o, InterfaceC1081a interfaceC1081a) {
        return d10;
    }

    /* JADX INFO: renamed from: d */
    public void mo4028d(List list, final C1690o c1690o) {
        C7412e.a aVar = new C7412e.a(C7073a.m14257R2(C7073a.m14261V2(C6752c.m13413G(list), new InterfaceC2052l<NavBackStackEntry, NavBackStackEntry>() { // from class: androidx.navigation.Navigator$navigate$1

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Navigator.InterfaceC1081a f6857d = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final NavBackStackEntry mo528n(NavBackStackEntry navBackStackEntry) {
                NavBackStackEntry navBackStackEntryMo4006a = navBackStackEntry;
                C5207g.m11111f(navBackStackEntryMo4006a, "backStackEntry");
                NavDestination navDestination = navBackStackEntryMo4006a.f6731b;
                if (!(navDestination instanceof NavDestination)) {
                    navDestination = null;
                }
                if (navDestination == null) {
                    return null;
                }
                Navigator<NavDestination> navigator = this.f6855b;
                Bundle bundle = navBackStackEntryMo4006a.f6732c;
                NavDestination navDestinationMo3972c = navigator.mo3972c(navDestination, bundle, c1690o, this.f6857d);
                if (navDestinationMo3972c == null) {
                    navBackStackEntryMo4006a = null;
                } else if (!C5207g.m11106a(navDestinationMo3972c, navDestination)) {
                    navBackStackEntryMo4006a = navigator.m4027b().mo4006a(navDestinationMo3972c, navDestinationMo3972c.m4014f(bundle));
                }
                return navBackStackEntryMo4006a;
            }
        })));
        while (aVar.hasNext()) {
            m4027b().mo4008d((NavBackStackEntry) aVar.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo4029e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        this.f6853a = navControllerNavigatorState;
        this.f6854b = true;
    }

    /* JADX INFO: renamed from: f */
    public void mo4030f(NavBackStackEntry navBackStackEntry) {
        NavDestination navDestination = navBackStackEntry.f6731b;
        if (!(navDestination instanceof NavDestination)) {
            navDestination = null;
        }
        if (navDestination == null) {
            return;
        }
        mo3972c(navDestination, null, C7499b.m14948k0(new InterfaceC2052l<C1691p, C9072e>() { // from class: androidx.navigation.Navigator$onLaunchSingleTop$1
            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C1691p c1691p) {
                C1691p c1691p2 = c1691p;
                C5207g.m11111f(c1691p2, "$this$navOptions");
                c1691p2.f9439b = true;
                return C9072e.f47360a;
            }
        }), null);
        m4027b().m5428b(navBackStackEntry);
    }

    /* JADX INFO: renamed from: g */
    public void mo4031g(Bundle bundle) {
    }

    /* JADX INFO: renamed from: h */
    public Bundle mo4032h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public void mo4033i(NavBackStackEntry navBackStackEntry, boolean z10) {
        C5207g.m11111f(navBackStackEntry, "popUpTo");
        List list = (List) m4027b().f9465e.getValue();
        if (!list.contains(navBackStackEntry)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        NavBackStackEntry navBackStackEntry2 = null;
        while (mo3973j()) {
            navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (C5207g.m11106a(navBackStackEntry2, navBackStackEntry)) {
                break;
            }
        }
        if (navBackStackEntry2 != null) {
            m4027b().mo4007c(navBackStackEntry2, z10);
        }
    }

    /* JADX INFO: renamed from: j */
    public boolean mo3973j() {
        return true;
    }
}
