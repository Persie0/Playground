package androidx.navigation.fragment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.InterfaceC0182a;
import androidx.activity.InterfaceC0209s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.C1084b;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController;
import androidx.navigation.Navigator;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1051q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5201a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import p040c4.C1684i;
import p040c4.C1685j;
import p040c4.C1688m;
import p040c4.C1689n;
import p040c4.C1694s;
import p040c4.C1697v;
import p085e4.C5368c;
import p085e4.C5369d;
import p085e4.C5370e;
import p260m8.C7499b;
import p385sf.C9000b;
import sl.C9072e;
import tl.C9320h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class NavHostFragment extends Fragment {

    /* JADX INFO: renamed from: A0 */
    public static final /* synthetic */ int f6860A0 = 0;

    /* JADX INFO: renamed from: v0 */
    public C1688m f6861v0;

    /* JADX INFO: renamed from: w0 */
    public Boolean f6862w0;

    /* JADX INFO: renamed from: x0 */
    public View f6863x0;

    /* JADX INFO: renamed from: y0 */
    public int f6864y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f6865z0;

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: F */
    public final void mo467F(Context context) {
        C5207g.m11111f(context, "context");
        super.mo467F(context);
        if (this.f6865z0) {
            C0940a c0940a = new C0940a(m3598r());
            c0940a.m3702n(this);
            c0940a.m3697i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.content.Context, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        Bundle bundle2;
        C1052r c1052rMo786G;
        ?? M3578a0 = m3578a0();
        C1688m c1688m = new C1688m(M3578a0);
        this.f6861v0 = c1688m;
        if (!C5207g.m11106a(this, c1688m.f6764m)) {
            InterfaceC1051q interfaceC1051q = c1688m.f6764m;
            C1684i c1684i = c1688m.f6769r;
            if (interfaceC1051q != null && (c1052rMo786G = interfaceC1051q.mo786G()) != null) {
                c1052rMo786G.mo3885c(c1684i);
            }
            c1688m.f6764m = this;
            this.f6112l0.mo3883a(c1684i);
        }
        while (M3578a0 instanceof ContextWrapper) {
            if (M3578a0 instanceof InterfaceC0209s) {
                C1688m c1688m2 = this.f6861v0;
                C5207g.m11108c(c1688m2);
                OnBackPressedDispatcher onBackPressedDispatcherMo788b = ((InterfaceC0209s) M3578a0).mo788b();
                C5207g.m11110e(onBackPressedDispatcherMo788b, "context as OnBackPressed…).onBackPressedDispatcher");
                if (C5207g.m11106a(onBackPressedDispatcherMo788b, c1688m2.f6765n)) {
                    break;
                }
                InterfaceC1051q interfaceC1051q2 = c1688m2.f6764m;
                if (interfaceC1051q2 == null) {
                    throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
                }
                NavController.C1075b c1075b = c1688m2.f6770s;
                Iterator<InterfaceC0182a> it = c1075b.f501b.iterator();
                while (it.hasNext()) {
                    it.next().cancel();
                }
                c1688m2.f6765n = onBackPressedDispatcherMo788b;
                onBackPressedDispatcherMo788b.m804a(interfaceC1051q2, c1075b);
                C1052r c1052rMo786G2 = interfaceC1051q2.mo786G();
                C1684i c1684i2 = c1688m2.f6769r;
                c1052rMo786G2.mo3885c(c1684i2);
                c1052rMo786G2.mo3883a(c1684i2);
                break;
            }
            M3578a0 = ((ContextWrapper) M3578a0).getBaseContext();
            C5207g.m11110e(M3578a0, "context.baseContext");
        }
        C1688m c1688m3 = this.f6861v0;
        C5207g.m11108c(c1688m3);
        Boolean bool = this.f6862w0;
        c1688m3.f6771t = bool != null && bool.booleanValue();
        c1688m3.m4004z();
        this.f6862w0 = null;
        C1688m c1688m4 = this.f6861v0;
        C5207g.m11108c(c1688m4);
        C1046m0 c1046m0Mo796n = mo796n();
        C1685j c1685j = c1688m4.f6766o;
        C1685j.a aVar = C1685j.f9412e;
        if (!C5207g.m11106a(c1685j, (C1685j) new C1042k0(c1046m0Mo796n, aVar, 0).m3947a(C1685j.class))) {
            if (!c1688m4.f6758g.isEmpty()) {
                throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
            }
            c1688m4.f6766o = (C1685j) new C1042k0(c1046m0Mo796n, aVar, 0).m3947a(C1685j.class);
        }
        C1688m c1688m5 = this.f6861v0;
        C5207g.m11108c(c1688m5);
        C1694s c1694s = c1688m5.f6772u;
        Context contextM3578a0 = m3578a0();
        FragmentManager fragmentManagerM3594l = m3594l();
        C5207g.m11110e(fragmentManagerM3594l, "childFragmentManager");
        c1694s.m5425a(new C5368c(contextM3578a0, fragmentManagerM3594l));
        Context contextM3578a1 = m3578a0();
        FragmentManager fragmentManagerM3594l2 = m3594l();
        C5207g.m11110e(fragmentManagerM3594l2, "childFragmentManager");
        int i10 = this.f6081S;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        c1694s.m5425a(new C5369d(contextM3578a1, fragmentManagerM3594l2, i10));
        if (bundle != null) {
            bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.f6865z0 = true;
                C0940a c0940a = new C0940a(m3598r());
                c0940a.m3702n(this);
                c0940a.m3697i();
            }
            this.f6864y0 = bundle.getInt("android-support-nav:fragment:graphId");
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            C1688m c1688m6 = this.f6861v0;
            C5207g.m11108c(c1688m6);
            bundle2.setClassLoader(c1688m6.f6752a.getClassLoader());
            c1688m6.f6755d = bundle2.getBundle("android-support-nav:controller:navigatorState");
            c1688m6.f6756e = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = c1688m6.f6763l;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i11 = 0;
                int i12 = 0;
                while (i11 < length) {
                    c1688m6.f6762k.put(Integer.valueOf(intArray[i11]), stringArrayList.get(i12));
                    i11++;
                    i12++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        C5207g.m11110e(str, "id");
                        C9320h c9320h = new C9320h(parcelableArray.length);
                        C5201a c5201aM14931b0 = C7499b.m14931b0(parcelableArray);
                        while (c5201aM14931b0.hasNext()) {
                            Parcelable parcelable = (Parcelable) c5201aM14931b0.next();
                            if (parcelable == null) {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                            c9320h.m17668t((NavBackStackEntryState) parcelable);
                        }
                        linkedHashMap.put(str, c9320h);
                    }
                }
            }
            c1688m6.f6757f = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        if (this.f6864y0 != 0) {
            C1688m c1688m7 = this.f6861v0;
            C5207g.m11108c(c1688m7);
            c1688m7.m4001w(((C1689n) c1688m7.f6750B.getValue()).m5417b(this.f6864y0), null);
        } else {
            Bundle bundle3 = this.f6101g;
            int i13 = bundle3 != null ? bundle3.getInt("android-support-nav:fragment:graphId") : 0;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
            if (i13 != 0) {
                C1688m c1688m8 = this.f6861v0;
                C5207g.m11108c(c1688m8);
                c1688m8.m4001w(((C1689n) c1688m8.f6750B.getValue()).m5417b(i13), bundle4);
            }
        }
        super.mo3560H(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5207g.m11111f(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        C5207g.m11110e(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i10 = this.f6081S;
        if (i10 == 0 || i10 == -1) {
            i10 = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i10);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: K */
    public final void mo3563K() {
        this.f6090a0 = true;
        View view = this.f6863x0;
        if (view != null && C1084b.m4034a(view) == this.f6861v0) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f6863x0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: N */
    public final void mo3565N(Context context, AttributeSet attributeSet, Bundle bundle) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(attributeSet, "attrs");
        super.mo3565N(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1697v.f9469b);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f6864y0 = resourceId;
        }
        C9072e c9072e = C9072e.f47360a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C5370e.f33745c);
        C5207g.m11110e(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.f6865z0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: P */
    public final void mo3567P(boolean z10) {
        C1688m c1688m = this.f6861v0;
        if (c1688m == null) {
            this.f6862w0 = Boolean.valueOf(z10);
        } else {
            c1688m.f6771t = z10;
            c1688m.m4004z();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        Bundle bundle2;
        C1688m c1688m = this.f6861v0;
        C5207g.m11108c(c1688m);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry : C6753d.m13465R0(c1688m.f6772u.f9460a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo4032h = ((Navigator) entry.getValue()).mo4032h();
            if (bundleMo4032h != null) {
                arrayList.add(str);
                bundle3.putBundle(str, bundleMo4032h);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        C9320h<NavBackStackEntry> c9320h = c1688m.f6758g;
        if (!c9320h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c9320h.f48061c];
            Iterator<NavBackStackEntry> it = c9320h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new NavBackStackEntryState(it.next());
                i10++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = c1688m.f6762k;
        if (!linkedHashMap.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(str2);
                i11++;
            }
            bundle2.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle2.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = c1688m.f6763l;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                C9320h c9320h2 = (C9320h) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[c9320h2.f48061c];
                int i12 = 0;
                for (Object obj : c9320h2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    parcelableArr2[i12] = (NavBackStackEntryState) obj;
                    i12 = i13;
                }
                bundle2.putParcelableArray(C0204c.m852k("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle2.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (c1688m.f6757f) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", c1688m.f6757f);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.f6865z0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i14 = this.f6864y0;
        if (i14 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i14);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, this.f6861v0);
        if (view.getParent() != null) {
            Object parent = view.getParent();
            if (parent == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View view2 = (View) parent;
            this.f6863x0 = view2;
            if (view2.getId() == this.f6081S) {
                View view3 = this.f6863x0;
                C5207g.m11108c(view3);
                view3.setTag(R.id.nav_controller_view_tag, this.f6861v0);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m0 */
    public final C1688m m4035m0() {
        C1688m c1688m = this.f6861v0;
        if (c1688m != null) {
            return c1688m;
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }
}
