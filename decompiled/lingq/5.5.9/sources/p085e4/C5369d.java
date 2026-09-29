package p085e4;

import ae.C0062b;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.C0985w;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager.C0931p;
import androidx.fragment.app.FragmentManager.C0932q;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import p040c4.C1690o;
import sl.C9072e;
import tl.C9327o;

/* JADX INFO: renamed from: e4.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m13365d2 = {"Le4/d;", "Landroidx/navigation/Navigator;", "Le4/d$a;", "a", "navigation-fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@Navigator.InterfaceC1082b("fragment")
public class C5369d extends Navigator<a> {

    /* JADX INFO: renamed from: c */
    public final Context f33738c;

    /* JADX INFO: renamed from: d */
    public final FragmentManager f33739d;

    /* JADX INFO: renamed from: e */
    public final int f33740e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f33741f = new LinkedHashSet();

    /* JADX INFO: renamed from: e4.d$a */
    public static class a extends NavDestination {

        /* JADX INFO: renamed from: k */
        public String f33742k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Navigator<? extends a> navigator) {
            super(navigator);
            C5207g.m11111f(navigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public final boolean equals(Object obj) {
            return obj != null && (obj instanceof a) && super.equals(obj) && C5207g.m11106a(this.f33742k, ((a) obj).f33742k);
        }

        @Override // androidx.navigation.NavDestination
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f33742k;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.navigation.NavDestination
        /* JADX INFO: renamed from: p */
        public final void mo3974p(Context context, AttributeSet attributeSet) {
            C5207g.m11111f(context, "context");
            super.mo3974p(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, C5370e.f33744b);
            C5207g.m11110e(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f33742k = string;
            }
            C9072e c9072e = C9072e.f47360a;
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f33742k;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "sb.toString()");
            return string;
        }
    }

    public C5369d(Context context, FragmentManager fragmentManager, int i10) {
        this.f33738c = context;
        this.f33739d = fragmentManager;
        this.f33740e = i10;
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: a */
    public final NavDestination mo3971a() {
        return new a(this);
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: d */
    public final void mo4028d(List list, C1690o c1690o) {
        FragmentManager fragmentManager = this.f33739d;
        if (fragmentManager.m3624P()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) it.next();
            boolean zIsEmpty = ((List) m4027b().f9465e.getValue()).isEmpty();
            if (c1690o != null && !zIsEmpty && c1690o.f9426b && this.f33741f.remove(navBackStackEntry.f6735f)) {
                fragmentManager.m3665v(fragmentManager.new C0931p(navBackStackEntry.f6735f), false);
                m4027b().mo4008d(navBackStackEntry);
            } else {
                C0940a c0940aM11540k = m11540k(navBackStackEntry, c1690o);
                if (!zIsEmpty) {
                    c0940aM11540k.m3775d(navBackStackEntry.f6735f);
                }
                c0940aM11540k.m3697i();
                m4027b().mo4008d(navBackStackEntry);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: f */
    public final void mo4030f(NavBackStackEntry navBackStackEntry) {
        FragmentManager fragmentManager = this.f33739d;
        if (fragmentManager.m3624P()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C0940a c0940aM11540k = m11540k(navBackStackEntry, null);
        if (((List) m4027b().f9465e.getValue()).size() > 1) {
            String str = navBackStackEntry.f6735f;
            fragmentManager.m3628T(str);
            c0940aM11540k.m3775d(str);
        }
        c0940aM11540k.m3697i();
        m4027b().m5428b(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: g */
    public final void mo4031g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f33741f;
            linkedHashSet.clear();
            C9327o.m17684D(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: h */
    public final Bundle mo4032h() {
        LinkedHashSet linkedHashSet = this.f33741f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return C0062b.m327Z(new Pair("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.navigation.Navigator
    /* JADX INFO: renamed from: i */
    public final void mo4033i(NavBackStackEntry navBackStackEntry, boolean z10) {
        C5207g.m11111f(navBackStackEntry, "popUpTo");
        FragmentManager fragmentManager = this.f33739d;
        if (fragmentManager.m3624P()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List list = (List) m4027b().f9465e.getValue();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) C6752c.m13423Q(list);
            for (NavBackStackEntry navBackStackEntry3 : C6752c.m13441i0(list.subList(list.indexOf(navBackStackEntry), list.size()))) {
                if (C5207g.m11106a(navBackStackEntry3, navBackStackEntry2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry3);
                } else {
                    fragmentManager.m3665v(fragmentManager.new C0932q(navBackStackEntry3.f6735f), false);
                    this.f33741f.add(navBackStackEntry3.f6735f);
                }
            }
        } else {
            fragmentManager.m3628T(navBackStackEntry.f6735f);
        }
        m4027b().mo4007c(navBackStackEntry, z10);
    }

    /* JADX INFO: renamed from: k */
    public final C0940a m11540k(NavBackStackEntry navBackStackEntry, C1690o c1690o) {
        String str = ((a) navBackStackEntry.f6731b).f33742k;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set".toString());
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        Context context = this.f33738c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.f33739d;
        C0985w c0985wM3619G = fragmentManager.m3619G();
        context.getClassLoader();
        Fragment fragmentMo3674a = c0985wM3619G.mo3674a(str);
        C5207g.m11110e(fragmentMo3674a, "fragmentManager.fragment…t.classLoader, className)");
        fragmentMo3674a.m3583e0(navBackStackEntry.f6732c);
        C0940a c0940a = new C0940a(fragmentManager);
        int i11 = c1690o != null ? c1690o.f9430f : -1;
        int i12 = c1690o != null ? c1690o.f9431g : -1;
        int i13 = c1690o != null ? c1690o.f9432h : -1;
        int i14 = c1690o != null ? c1690o.f9433i : -1;
        if (i11 != -1 || i12 != -1 || i13 != -1 || i14 != -1) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i12 == -1) {
                i12 = 0;
            }
            if (i13 == -1) {
                i13 = 0;
            }
            if (i14 != -1) {
                i10 = i14;
            }
            c0940a.f6345b = i11;
            c0940a.f6346c = i12;
            c0940a.f6347d = i13;
            c0940a.f6348e = i10;
        }
        c0940a.m3777g(this.f33740e, fragmentMo3674a, null);
        c0940a.m3702n(fragmentMo3674a);
        c0940a.f6359p = true;
        return c0940a;
    }
}
