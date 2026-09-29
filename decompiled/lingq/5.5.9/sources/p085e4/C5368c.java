package p085e4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0985w;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.InterfaceC0953g0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5213m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import p003a2.C0009a;
import p040c4.C1690o;
import p040c4.InterfaceC1678c;

/* JADX INFO: renamed from: e4.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m13365d2 = {"Le4/c;", "Landroidx/navigation/Navigator;", "Le4/c$a;", "a", "navigation-fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@Navigator.InterfaceC1082b("dialog")
public final class C5368c extends Navigator<a> {

    /* JADX INFO: renamed from: c */
    public final Context f33733c;

    /* JADX INFO: renamed from: d */
    public final FragmentManager f33734d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f33735e = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public final C5367b f33736f = new InterfaceC1049o() { // from class: e4.b
        @Override // androidx.view.InterfaceC1049o
        /* JADX INFO: renamed from: e */
        public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
            Object objPrevious;
            C5368c c5368c = this.f33732a;
            C5207g.m11111f(c5368c, "this$0");
            boolean z10 = false;
            if (event == Lifecycle.Event.ON_CREATE) {
                DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = (DialogInterfaceOnCancelListenerC0962l) interfaceC1051q;
                Iterable iterable = (Iterable) c5368c.m4027b().f9465e.getValue();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (C5207g.m11106a(((NavBackStackEntry) it.next()).f6735f, dialogInterfaceOnCancelListenerC0962l.f6083U)) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (z10) {
                    return;
                }
                dialogInterfaceOnCancelListenerC0962l.mo3766m0();
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l2 = (DialogInterfaceOnCancelListenerC0962l) interfaceC1051q;
                if (dialogInterfaceOnCancelListenerC0962l2.m3770q0().isShowing()) {
                    return;
                }
                List list = (List) c5368c.m4027b().f9465e.getValue();
                ListIterator listIterator = list.listIterator(list.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (!C5207g.m11106a(((NavBackStackEntry) objPrevious).f6735f, dialogInterfaceOnCancelListenerC0962l2.f6083U));
                if (objPrevious == null) {
                    throw new IllegalStateException(("Dialog " + dialogInterfaceOnCancelListenerC0962l2 + " has already been popped off of the Navigation back stack").toString());
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
                if (!C5207g.m11106a(C6752c.m13433a0(list), navBackStackEntry)) {
                    Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC0962l2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                }
                c5368c.mo4033i(navBackStackEntry, false);
            }
        }
    };

    /* JADX INFO: renamed from: e4.c$a */
    public static class a extends NavDestination implements InterfaceC1678c {

        /* JADX INFO: renamed from: k */
        public String f33737k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Navigator<? extends a> navigator) {
            super(navigator);
            C5207g.m11111f(navigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            boolean z10 = false;
            if (obj != null && (obj instanceof a) && super.equals(obj) && C5207g.m11106a(this.f33737k, ((a) obj).f33737k)) {
                z10 = true;
            }
            return z10;
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f33737k;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        /* JADX INFO: renamed from: p */
        public final void mo3974p(Context context, AttributeSet attributeSet) {
            C5207g.m11111f(context, "context");
            super.mo3974p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C5370e.f33743a);
            C5207g.m11110e(typedArrayObtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f33737k = string;
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [e4.b] */
    public C5368c(Context context, FragmentManager fragmentManager) {
        this.f33733c = context;
        this.f33734d = fragmentManager;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: a */
    public final NavDestination mo3971a() {
        return new a(this);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: d */
    public final void mo4028d(List list, C1690o c1690o) {
        FragmentManager fragmentManager = this.f33734d;
        if (fragmentManager.m3624P()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            a aVar = (a) navBackStackEntry.f6731b;
            String str = aVar.f33737k;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            }
            char cCharAt = str.charAt(0);
            Context context = this.f33733c;
            if (cCharAt == '.') {
                str = context.getPackageName() + str;
            }
            C0985w c0985wM3619G = fragmentManager.m3619G();
            context.getClassLoader();
            Fragment fragmentMo3674a = c0985wM3619G.mo3674a(str);
            C5207g.m11110e(fragmentMo3674a, "fragmentManager.fragment…ader, className\n        )");
            if (!DialogInterfaceOnCancelListenerC0962l.class.isAssignableFrom(fragmentMo3674a.getClass())) {
                StringBuilder sb2 = new StringBuilder("Dialog destination ");
                String str2 = aVar.f33737k;
                if (str2 == null) {
                    throw new IllegalStateException("DialogFragment class was not set".toString());
                }
                throw new IllegalArgumentException(C0009a.m23l(sb2, str2, " is not an instance of DialogFragment").toString());
            }
            DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = (DialogInterfaceOnCancelListenerC0962l) fragmentMo3674a;
            dialogInterfaceOnCancelListenerC0962l.m3583e0(navBackStackEntry.f6732c);
            dialogInterfaceOnCancelListenerC0962l.f6112l0.mo3883a(this.f33736f);
            dialogInterfaceOnCancelListenerC0962l.mo3772s0(fragmentManager, navBackStackEntry.f6735f);
            m4027b().mo4008d(navBackStackEntry);
        }
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: e */
    public final void mo4029e(NavController.NavControllerNavigatorState navControllerNavigatorState) {
        C1052r c1052r;
        super.mo4029e(navControllerNavigatorState);
        Iterator it = ((List) navControllerNavigatorState.f9465e.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.f33734d;
            if (!zHasNext) {
                fragmentManager.f6171n.add(new InterfaceC0953g0() { // from class: e4.a
                    @Override // androidx.fragment.app.InterfaceC0953g0
                    /* JADX INFO: renamed from: c */
                    public final void mo3675c(FragmentManager fragmentManager2, Fragment fragment) {
                        C5368c c5368c = this.f33731a;
                        C5207g.m11111f(c5368c, "this$0");
                        LinkedHashSet linkedHashSet = c5368c.f33735e;
                        String str = fragment.f6083U;
                        C5213m.m11196a(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            fragment.f6112l0.mo3883a(c5368c.f33736f);
                        }
                    }
                });
                return;
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            DialogInterfaceOnCancelListenerC0962l dialogInterfaceOnCancelListenerC0962l = (DialogInterfaceOnCancelListenerC0962l) fragmentManager.m3616D(navBackStackEntry.f6735f);
            if (dialogInterfaceOnCancelListenerC0962l == null || (c1052r = dialogInterfaceOnCancelListenerC0962l.f6112l0) == null) {
                this.f33735e.add(navBackStackEntry.f6735f);
            } else {
                c1052r.mo3883a(this.f33736f);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: i */
    public final void mo4033i(NavBackStackEntry navBackStackEntry, boolean z10) {
        C5207g.m11111f(navBackStackEntry, "popUpTo");
        FragmentManager fragmentManager = this.f33734d;
        if (fragmentManager.m3624P()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) m4027b().f9465e.getValue();
        Iterator it = C6752c.m13441i0(list.subList(list.indexOf(navBackStackEntry), list.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentM3616D = fragmentManager.m3616D(((NavBackStackEntry) it.next()).f6735f);
            if (fragmentM3616D != null) {
                fragmentM3616D.f6112l0.mo3885c(this.f33736f);
                ((DialogInterfaceOnCancelListenerC0962l) fragmentM3616D).mo3766m0();
            }
        }
        m4027b().mo4007c(navBackStackEntry, z10);
    }
}
