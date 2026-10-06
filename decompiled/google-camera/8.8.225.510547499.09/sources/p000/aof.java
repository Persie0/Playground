package p000;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class aof extends ComponentCallbacksC0077bw implements aon, aol, aom, ang {

    /* JADX INFO: renamed from: a */
    public aoo f1879a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f1884b;

    /* JADX INFO: renamed from: c */
    public boolean f1885c;

    /* JADX INFO: renamed from: d */
    public boolean f1886d;

    /* JADX INFO: renamed from: ae */
    private final aob f1881ae = new aob(this);

    /* JADX INFO: renamed from: af */
    private int f1882af = C0100R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: ad */
    public final Handler f1880ad = new aoa(this, Looper.getMainLooper());

    /* JADX INFO: renamed from: ag */
    private final Runnable f1883ag = new RunnableC0852nk(this, 16);

    @Override // p000.aon
    /* JADX INFO: renamed from: A */
    public final boolean mo1754A(Preference preference) {
        if (preference.f1592t == null) {
            return false;
        }
        boolean zM1752a = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw = this; !zM1752a && componentCallbacksC0077bw != null; componentCallbacksC0077bw = componentCallbacksC0077bw.f4574B) {
            if (componentCallbacksC0077bw instanceof aod) {
                zM1752a = ((aod) componentCallbacksC0077bw).m1752a();
            }
        }
        if (!zM1752a && (getContext() instanceof aod)) {
            zM1752a = ((aod) getContext()).m1752a();
        }
        if (!zM1752a && (!(getActivity() instanceof aod) || !((aod) getActivity()).m1752a())) {
            Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            C0111cq parentFragmentManager = getParentFragmentManager();
            Bundle bundleM1520t = preference.m1520t();
            C0085cd c0085cdM5326h = parentFragmentManager.m5326h();
            requireActivity().getClassLoader();
            ComponentCallbacksC0077bw componentCallbacksC0077bwMo3476b = c0085cdM5326h.mo3476b(preference.f1592t);
            componentCallbacksC0077bwMo3476b.setArguments(bundleM1520t);
            componentCallbacksC0077bwMo3476b.setTargetFragment(this, 0);
            AbstractC0118cx abstractC0118cxM5327i = parentFragmentManager.m5327i();
            abstractC0118cxM5327i.m5702r(((View) requireView().getParent()).getId(), componentCallbacksC0077bwMo3476b);
            if (!abstractC0118cxM5327i.f9933k) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            abstractC0118cxM5327i.f9932j = true;
            abstractC0118cxM5327i.f9934l = null;
            abstractC0118cxM5327i.mo2021h();
        }
        return true;
    }

    @Override // p000.aom
    /* JADX INFO: renamed from: B */
    public final void mo1755B() {
        boolean zM1753a = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw = this; !zM1753a && componentCallbacksC0077bw != null; componentCallbacksC0077bw = componentCallbacksC0077bw.f4574B) {
            if (componentCallbacksC0077bw instanceof aoe) {
                zM1753a = ((aoe) componentCallbacksC0077bw).m1753a();
            }
        }
        if (!zM1753a && (getContext() instanceof aoe)) {
            zM1753a = ((aoe) getContext()).m1753a();
        }
        if (zM1753a || !(getActivity() instanceof aoe)) {
            return;
        }
        ((aoe) getActivity()).m1753a();
    }

    @Override // p000.ang
    /* JADX INFO: renamed from: a */
    public final Preference mo1723a(CharSequence charSequence) {
        aoo aooVar = this.f1879a;
        if (aooVar == null) {
            return null;
        }
        return aooVar.m1778e(charSequence);
    }

    /* JADX INFO: renamed from: c */
    public PreferenceScreen mo1756c() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    final void m1757d() {
        PreferenceScreen preferenceScreenMo1756c = mo1756c();
        if (preferenceScreenMo1756c != null) {
            this.f1884b.mo1226Y(new aoj(preferenceScreenMo1756c));
            preferenceScreenMo1756c.mo1486D();
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(C0100R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = C0100R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        aoo aooVar = new aoo(requireContext());
        this.f1879a = aooVar;
        aooVar.f1906e = this;
        Bundle bundle2 = this.f4610l;
        if (bundle2 != null) {
            bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, aos.f1928h, C0100R.attr.preferenceFragmentCompatStyle, 0);
        this.f1882af = typedArrayObtainStyledAttributes.getResourceId(0, this.f1882af);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f1882af, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(C0100R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(C0100R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.m1228aa(new LinearLayoutManager());
            recyclerView.m1225X(new aoq(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException(YmzeHXaMYOLk.eeugYDNZGELwK);
        }
        this.f1884b = recyclerView;
        recyclerView.m1246av(this.f1881ae);
        aob aobVar = this.f1881ae;
        if (drawable != null) {
            aobVar.f1876b = drawable.getIntrinsicHeight();
        } else {
            aobVar.f1876b = 0;
        }
        aobVar.f1875a = drawable;
        aobVar.f1878d.f1884b.m1209H();
        if (dimensionPixelSize != -1) {
            aob aobVar2 = this.f1881ae;
            aobVar2.f1876b = dimensionPixelSize;
            aobVar2.f1878d.f1884b.m1209H();
        }
        this.f1881ae.f1877c = z;
        if (this.f1884b.getParent() == null) {
            viewGroup2.addView(this.f1884b);
        }
        this.f1880ad.post(this.f1883ag);
        return viewInflate;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroyView() {
        this.f1880ad.removeCallbacks(this.f1883ag);
        this.f1880ad.removeMessages(1);
        if (this.f1885c) {
            this.f1884b.mo1226Y(null);
            PreferenceScreen preferenceScreenMo1756c = mo1756c();
            if (preferenceScreenMo1756c != null) {
                preferenceScreenMo1756c.mo1488F();
            }
        }
        this.f1884b = null;
        super.onDestroyView();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreenMo1756c = mo1756c();
        if (preferenceScreenMo1756c != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreenMo1756c.mo1483A(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStart() {
        super.onStart();
        aoo aooVar = this.f1879a;
        aooVar.f1904c = this;
        aooVar.f1905d = this;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onStop() {
        super.onStop();
        aoo aooVar = this.f1879a;
        aooVar.f1904c = null;
        aooVar.f1905d = null;
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenMo1756c;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenMo1756c = mo1756c()) != null) {
            preferenceScreenMo1756c.mo1526z(bundle2);
        }
        if (this.f1885c) {
            m1757d();
        }
        this.f1886d = true;
    }

    @Override // p000.aol
    /* JADX INFO: renamed from: z */
    public final void mo1758z(Preference preference) {
        DialogInterfaceOnCancelListenerC0067bm anqVar;
        boolean zM1751a = false;
        for (ComponentCallbacksC0077bw componentCallbacksC0077bw = this; !zM1751a && componentCallbacksC0077bw != null; componentCallbacksC0077bw = componentCallbacksC0077bw.f4574B) {
            if (componentCallbacksC0077bw instanceof aoc) {
                zM1751a = ((aoc) componentCallbacksC0077bw).m1751a();
            }
        }
        if (!zM1751a && (getContext() instanceof aoc)) {
            zM1751a = ((aoc) getContext()).m1751a();
        }
        if (zM1751a) {
            return;
        }
        if (!((getActivity() instanceof aoc) && ((aoc) getActivity()).m1751a()) && getParentFragmentManager().m5325e("androidx.preference.PreferenceFragment.DIALOG") == null) {
            if (preference instanceof EditTextPreference) {
                String str = preference.f1590r;
                anqVar = new anj();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                anqVar.setArguments(bundle);
            } else if (preference instanceof ListPreference) {
                String str2 = preference.f1590r;
                anqVar = new ann();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                anqVar.setArguments(bundle2);
            } else {
                if (!(preference instanceof MultiSelectListPreference)) {
                    throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + HRLmc.kEHpQZqLJHlALhT);
                }
                String str3 = preference.f1590r;
                anqVar = new anq();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                anqVar.setArguments(bundle3);
            }
            anqVar.setTargetFragment(this, 0);
            anqVar.m2699c(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
        }
    }
}
