package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.view.C1052r;
import androidx.view.InterfaceC1048n0;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p003a2.C0009a;
import p326q.C8453i;
import p447w3.AbstractC9808a;
import p447w3.C9809b;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: androidx.fragment.app.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0959j0 {

    /* JADX INFO: renamed from: a */
    public final C0941a0 f6309a;

    /* JADX INFO: renamed from: b */
    public final C0961k0 f6310b;

    /* JADX INFO: renamed from: c */
    public final Fragment f6311c;

    /* JADX INFO: renamed from: d */
    public boolean f6312d = false;

    /* JADX INFO: renamed from: e */
    public int f6313e = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.j0$a */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f6314a;

        public a(View view) {
            this.f6314a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f6314a;
            view2.removeOnAttachStateChangeListener(this);
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.j0$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6315a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f6315a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6315a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6315a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6315a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C0959j0(C0941a0 c0941a0, C0961k0 c0961k0, Fragment fragment) {
        this.f6309a = c0941a0;
        this.f6310b = c0961k0;
        this.f6311c = fragment;
    }

    public C0959j0(C0941a0 c0941a0, C0961k0 c0961k0, Fragment fragment, FragmentState fragmentState) {
        this.f6309a = c0941a0;
        this.f6310b = c0961k0;
        this.f6311c = fragment;
        fragment.f6093c = null;
        fragment.f6095d = null;
        fragment.f6076N = 0;
        fragment.f6073K = false;
        fragment.f6111l = false;
        Fragment fragment2 = fragment.f6103h;
        fragment.f6105i = fragment2 != null ? fragment2.f6099f : null;
        fragment.f6103h = null;
        Bundle bundle = fragmentState.f6217H;
        if (bundle != null) {
            fragment.f6091b = bundle;
        } else {
            fragment.f6091b = new Bundle();
        }
    }

    public C0959j0(C0941a0 c0941a0, C0961k0 c0961k0, ClassLoader classLoader, C0985w c0985w, FragmentState fragmentState) {
        this.f6309a = c0941a0;
        this.f6310b = c0961k0;
        Fragment fragmentM3681a = fragmentState.m3681a(c0985w, classLoader);
        this.f6311c = fragmentM3681a;
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentM3681a);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m3738a() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.f6091b;
        fragment.f6079Q.m3626R();
        fragment.f6089a = 3;
        fragment.f6090a0 = false;
        fragment.mo3558C();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onActivityCreated()"));
        }
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        View view = fragment.f6094c0;
        if (view != null) {
            Bundle bundle2 = fragment.f6091b;
            SparseArray<Parcelable> sparseArray = fragment.f6093c;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                fragment.f6093c = null;
            }
            if (fragment.f6094c0 != null) {
                fragment.f6113m0.f6416e.m15299b(fragment.f6095d);
                fragment.f6095d = null;
            }
            fragment.f6090a0 = false;
            fragment.mo3573V(bundle2);
            if (!fragment.f6090a0) {
                throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
            }
            if (fragment.f6094c0 != null) {
                fragment.f6113m0.m3812a(Lifecycle.Event.ON_CREATE);
            }
        }
        fragment.f6091b = null;
        C0949e0 c0949e0 = fragment.f6079Q;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(4);
        this.f6309a.m3703a(false);
    }

    /* JADX INFO: renamed from: b */
    public final void m3739b() {
        View view;
        View view2;
        C0961k0 c0961k0 = this.f6310b;
        c0961k0.getClass();
        Fragment fragment = this.f6311c;
        ViewGroup viewGroup = fragment.f6092b0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = c0961k0.f6318a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
                Fragment fragment2 = arrayList.get(i10);
                if (fragment2.f6092b0 == viewGroup && (view2 = fragment2.f6094c0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment3 = arrayList.get(iIndexOf);
                if (fragment3.f6092b0 == viewGroup && (view = fragment3.f6094c0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.f6092b0.addView(fragment.f6094c0, iIndexOfChild);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public final void m3740c() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.f6103h;
        C0959j0 c0959j0 = null;
        C0961k0 c0961k0 = this.f6310b;
        if (fragment2 != null) {
            C0959j0 c0959j1 = c0961k0.f6319b.get(fragment2.f6099f);
            if (c0959j1 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.f6103h + " that does not belong to this FragmentManager!");
            }
            fragment.f6105i = fragment.f6103h.f6099f;
            fragment.f6103h = null;
            c0959j0 = c0959j1;
        } else {
            String str = fragment.f6105i;
            if (str != null && (c0959j0 = c0961k0.f6319b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(C0009a.m23l(sb2, fragment.f6105i, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0959j0 != null) {
            c0959j0.m3748k();
        }
        FragmentManager fragmentManager = fragment.f6077O;
        fragment.f6078P = fragmentManager.f6178u;
        fragment.f6080R = fragmentManager.f6180w;
        C0941a0 c0941a0 = this.f6309a;
        c0941a0.m3709g(false);
        ArrayList<Fragment.AbstractC0913d> arrayList = fragment.f6119s0;
        Iterator<Fragment.AbstractC0913d> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo3606a();
        }
        arrayList.clear();
        fragment.f6079Q.m3637b(fragment.f6078P, fragment.mo3584f(), fragment);
        fragment.f6089a = 0;
        fragment.f6090a0 = false;
        fragment.mo467F(fragment.f6078P.f6429b);
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager2 = fragment.f6077O;
        Iterator<InterfaceC0953g0> it2 = fragmentManager2.f6171n.iterator();
        while (it2.hasNext()) {
            it2.next().mo3675c(fragmentManager2, fragment);
        }
        C0949e0 c0949e0 = fragment.f6079Q;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(0);
        c0941a0.m3704b(false);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[PHI: r1
      0x007c: PHI (r1v4 int) = (r1v3 int), (r1v15 int), (r1v18 int), (r1v18 int) binds: [B:18:0x0048, B:29:0x0078, B:22:0x005a, B:24:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public final int m3741d() {
        Fragment fragment = this.f6311c;
        if (fragment.f6077O == null) {
            return fragment.f6089a;
        }
        int iMin = this.f6313e;
        int i10 = b.f6315a[fragment.f6110k0.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i10 != 3) {
                iMin = i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (fragment.f6072J) {
            if (fragment.f6073K) {
                iMin = Math.max(this.f6313e, 2);
                View view = fragment.f6094c0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else if (this.f6313e < 4) {
                iMin = Math.min(iMin, fragment.f6089a);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (!fragment.f6111l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.f6092b0;
        SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = null;
        SpecialEffectsController.Operation operation = null;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerM3682f = SpecialEffectsController.m3682f(viewGroup, fragment.m3598r().m3621I());
            specialEffectsControllerM3682f.getClass();
            SpecialEffectsController.Operation operationM3686d = specialEffectsControllerM3682f.m3686d(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact2 = operationM3686d != null ? operationM3686d.f6236b : null;
            for (SpecialEffectsController.Operation operation2 : specialEffectsControllerM3682f.f6232c) {
                if (operation2.f6237c.equals(fragment) && !operation2.f6240f) {
                    operation = operation2;
                    break;
                }
            }
            lifecycleImpact = (operation == null || !(lifecycleImpact2 == null || lifecycleImpact2 == SpecialEffectsController.Operation.LifecycleImpact.NONE)) ? lifecycleImpact2 : operation.f6236b;
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.f6070H) {
            iMin = fragment.m3556A() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.f6096d0 && fragment.f6089a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m3742e() {
        Parcelable parcelable;
        boolean zM3608K = FragmentManager.m3608K(3);
        final Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        if (fragment.f6106i0) {
            Bundle bundle = fragment.f6091b;
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                fragment.f6079Q.m3634Z(parcelable);
                C0949e0 c0949e0 = fragment.f6079Q;
                c0949e0.f6149F = false;
                c0949e0.f6150G = false;
                c0949e0.f6156M.f6292i = false;
                c0949e0.m3663t(1);
            }
            fragment.f6089a = 1;
            return;
        }
        C0941a0 c0941a0 = this.f6309a;
        c0941a0.m3710h(false);
        Bundle bundle2 = fragment.f6091b;
        fragment.f6079Q.m3626R();
        fragment.f6089a = 1;
        fragment.f6090a0 = false;
        fragment.f6112l0.mo3883a(new InterfaceC1049o() { // from class: androidx.fragment.app.Fragment.6
            public C09086() {
            }

            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                View view;
                if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.f6094c0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        fragment.f6116p0.m15299b(bundle2);
        fragment.mo3560H(bundle2);
        fragment.f6106i0 = true;
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onCreate()"));
        }
        fragment.f6112l0.m3955f(Lifecycle.Event.ON_CREATE);
        c0941a0.m3705c(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m3743f() {
        String resourceName;
        Fragment fragment = this.f6311c;
        if (fragment.f6072J) {
            return;
        }
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        LayoutInflater layoutInflaterMo468M = fragment.mo468M(fragment.f6091b);
        fragment.f6104h0 = layoutInflaterMo468M;
        ViewGroup viewGroup = fragment.f6092b0;
        if (viewGroup == null) {
            int i10 = fragment.f6082T;
            if (i10 == 0) {
                viewGroup = null;
            } else {
                if (i10 == -1) {
                    throw new IllegalArgumentException(C0166e.m764j("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.f6077O.f6179v.mo584V(i10);
                if (viewGroup == null) {
                    if (!fragment.f6074L) {
                        try {
                            resourceName = fragment.m3599s().getResourceName(fragment.f6082T);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.f6082T) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
                    FragmentStrictMode.m3801c(wrongFragmentContainerViolation);
                    FragmentStrictMode.C0978a c0978aM3799a = FragmentStrictMode.m3799a(fragment);
                    if (c0978aM3799a.f6403a.contains(FragmentStrictMode.Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.m3803e(c0978aM3799a, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        FragmentStrictMode.m3800b(c0978aM3799a, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.f6092b0 = viewGroup;
        fragment.mo3574W(layoutInflaterMo468M, viewGroup, fragment.f6091b);
        View view = fragment.f6094c0;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            fragment.f6094c0.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                m3739b();
            }
            if (fragment.f6084V) {
                fragment.f6094c0.setVisibility(8);
            }
            View view2 = fragment.f6094c0;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18698b(view2)) {
                C10029b0.h.m18706c(fragment.f6094c0);
            } else {
                View view3 = fragment.f6094c0;
                view3.addOnAttachStateChangeListener(new a(view3));
            }
            fragment.mo3572U(fragment.f6094c0, fragment.f6091b);
            fragment.f6079Q.m3663t(2);
            this.f6309a.m3715m(fragment, fragment.f6094c0, false);
            int visibility = fragment.f6094c0.getVisibility();
            fragment.m3588h().f6138n = fragment.f6094c0.getAlpha();
            if (fragment.f6092b0 != null && visibility == 0) {
                View viewFindFocus = fragment.f6094c0.findFocus();
                if (viewFindFocus != null) {
                    fragment.m3588h().f6139o = viewFindFocus;
                    if (FragmentManager.m3608K(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.f6094c0.setAlpha(0.0f);
            }
        }
        fragment.f6089a = 2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m3744g() {
        boolean z10;
        Fragment fragmentM3758b;
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z11 = fragment.f6070H && !fragment.m3556A();
        C0961k0 c0961k0 = this.f6310b;
        if (z11 && !fragment.f6071I) {
            c0961k0.m3765i(fragment.f6099f, null);
        }
        if (!z11) {
            C0951f0 c0951f0 = c0961k0.f6321d;
            z10 = (c0951f0.f6287d.containsKey(fragment.f6099f) && c0951f0.f6290g) ? c0951f0.f6291h : true;
        }
        if (!z10) {
            String str = fragment.f6105i;
            if (str != null && (fragmentM3758b = c0961k0.m3758b(str)) != null && fragmentM3758b.f6086X) {
                fragment.f6103h = fragmentM3758b;
            }
            fragment.f6089a = 0;
            return;
        }
        AbstractC0986x<?> abstractC0986x = fragment.f6078P;
        if (abstractC0986x instanceof InterfaceC1048n0) {
            zIsChangingConfigurations = c0961k0.f6321d.f6291h;
        } else {
            Context context = abstractC0986x.f6429b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z11 && !fragment.f6071I) || zIsChangingConfigurations) {
            c0961k0.f6321d.m3727m2(fragment);
        }
        fragment.f6079Q.m3654k();
        fragment.f6112l0.m3955f(Lifecycle.Event.ON_DESTROY);
        fragment.f6089a = 0;
        fragment.f6090a0 = false;
        fragment.f6106i0 = false;
        fragment.mo3562J();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onDestroy()"));
        }
        this.f6309a.m3706d(false);
        for (C0959j0 c0959j0 : c0961k0.m3760d()) {
            if (c0959j0 != null) {
                String str2 = fragment.f6099f;
                Fragment fragment2 = c0959j0.f6311c;
                if (str2.equals(fragment2.f6105i)) {
                    fragment2.f6103h = fragment;
                    fragment2.f6105i = null;
                }
            }
        }
        String str3 = fragment.f6105i;
        if (str3 != null) {
            fragment.f6103h = c0961k0.m3758b(str3);
        }
        c0961k0.m3764h(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m3745h() {
        View view;
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.f6092b0;
        if (viewGroup != null && (view = fragment.f6094c0) != null) {
            viewGroup.removeView(view);
        }
        fragment.f6079Q.m3663t(1);
        if (fragment.f6094c0 != null) {
            C0980t0 c0980t0 = fragment.f6113m0;
            c0980t0.m3813c();
            if (c0980t0.f6415d.f6681d.isAtLeast(Lifecycle.State.CREATED)) {
                fragment.f6113m0.m3812a(Lifecycle.Event.ON_DESTROY);
            }
        }
        fragment.f6089a = 1;
        fragment.f6090a0 = false;
        fragment.mo3563K();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onDestroyView()"));
        }
        C8453i<C9809b.a> c8453i = AbstractC9808a.m18288a(fragment).f49928b.f49938d;
        int iM16537h = c8453i.m16537h();
        for (int i10 = 0; i10 < iM16537h; i10++) {
            c8453i.m16538i(i10).m18290k();
        }
        fragment.f6075M = false;
        this.f6309a.m3716n(false);
        fragment.f6092b0 = null;
        fragment.f6094c0 = null;
        fragment.f6113m0 = null;
        fragment.f6114n0.mo3900i(null);
        fragment.f6073K = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m3746i() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.f6089a = -1;
        boolean z10 = false;
        fragment.f6090a0 = false;
        fragment.mo3564L();
        fragment.f6104h0 = null;
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onDetach()"));
        }
        C0949e0 c0949e0 = fragment.f6079Q;
        if (!c0949e0.f6151H) {
            c0949e0.m3654k();
            fragment.f6079Q = new C0949e0();
        }
        this.f6309a.m3707e(false);
        fragment.f6089a = -1;
        fragment.f6078P = null;
        fragment.f6080R = null;
        fragment.f6077O = null;
        boolean z11 = true;
        if (fragment.f6070H && !fragment.m3556A()) {
            z10 = true;
        }
        if (!z10) {
            C0951f0 c0951f0 = this.f6310b.f6321d;
            if (c0951f0.f6287d.containsKey(fragment.f6099f) && c0951f0.f6290g) {
                z11 = c0951f0.f6291h;
            }
            if (!z11) {
                return;
            }
        }
        if (FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.m3603x();
    }

    /* JADX INFO: renamed from: j */
    public final void m3747j() {
        Fragment fragment = this.f6311c;
        if (fragment.f6072J && fragment.f6073K && !fragment.f6075M) {
            if (FragmentManager.m3608K(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            LayoutInflater layoutInflaterMo468M = fragment.mo468M(fragment.f6091b);
            fragment.f6104h0 = layoutInflaterMo468M;
            fragment.mo3574W(layoutInflaterMo468M, null, fragment.f6091b);
            View view = fragment.f6094c0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.f6094c0.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.f6084V) {
                    fragment.f6094c0.setVisibility(8);
                }
                fragment.mo3572U(fragment.f6094c0, fragment.f6091b);
                fragment.f6079Q.m3663t(2);
                this.f6309a.m3715m(fragment, fragment.f6094c0, false);
                fragment.f6089a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3748k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z10 = this.f6312d;
        Fragment fragment = this.f6311c;
        if (z10) {
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f6312d = true;
            boolean z11 = false;
            while (true) {
                int iM3741d = m3741d();
                int i10 = fragment.f6089a;
                C0961k0 c0961k0 = this.f6310b;
                if (iM3741d == i10) {
                    if (!z11 && i10 == -1 && fragment.f6070H && !fragment.m3556A() && !fragment.f6071I) {
                        if (FragmentManager.m3608K(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        c0961k0.f6321d.m3727m2(fragment);
                        c0961k0.m3764h(this);
                        if (FragmentManager.m3608K(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.m3603x();
                    }
                    if (fragment.f6102g0) {
                        if (fragment.f6094c0 != null && (viewGroup = fragment.f6092b0) != null) {
                            SpecialEffectsController specialEffectsControllerM3682f = SpecialEffectsController.m3682f(viewGroup, fragment.m3598r().m3621I());
                            if (fragment.f6084V) {
                                specialEffectsControllerM3682f.getClass();
                                if (FragmentManager.m3608K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                specialEffectsControllerM3682f.m3683a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            } else {
                                specialEffectsControllerM3682f.getClass();
                                if (FragmentManager.m3608K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                specialEffectsControllerM3682f.m3683a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.f6077O;
                        if (fragmentManager != null && fragment.f6111l && FragmentManager.m3609L(fragment)) {
                            fragmentManager.f6148E = true;
                        }
                        fragment.f6102g0 = false;
                        fragment.f6079Q.m3657n();
                    }
                    this.f6312d = false;
                    return;
                }
                if (iM3741d <= i10) {
                    switch (i10 - 1) {
                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            m3746i();
                            break;
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            if (fragment.f6071I) {
                                if (c0961k0.f6320c.get(fragment.f6099f) == null) {
                                    m3753p();
                                }
                            }
                            m3744g();
                            break;
                        case 1:
                            m3745h();
                            fragment.f6089a = 1;
                            break;
                        case 2:
                            fragment.f6073K = false;
                            fragment.f6089a = 2;
                            break;
                        case 3:
                            if (FragmentManager.m3608K(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.f6071I) {
                                m3753p();
                            } else if (fragment.f6094c0 != null && fragment.f6093c == null) {
                                m3754q();
                            }
                            if (fragment.f6094c0 != null && (viewGroup2 = fragment.f6092b0) != null) {
                                SpecialEffectsController specialEffectsControllerM3682f2 = SpecialEffectsController.m3682f(viewGroup2, fragment.m3598r().m3621I());
                                specialEffectsControllerM3682f2.getClass();
                                if (FragmentManager.m3608K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                specialEffectsControllerM3682f2.m3683a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                            }
                            fragment.f6089a = 3;
                            break;
                        case 4:
                            m3756s();
                            break;
                        case 5:
                            fragment.f6089a = 5;
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            m3749l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            m3740c();
                            break;
                        case 1:
                            m3742e();
                            break;
                        case 2:
                            m3747j();
                            m3743f();
                            break;
                        case 3:
                            m3738a();
                            break;
                        case 4:
                            if (fragment.f6094c0 != null && (viewGroup3 = fragment.f6092b0) != null) {
                                SpecialEffectsController specialEffectsControllerM3682f3 = SpecialEffectsController.m3682f(viewGroup3, fragment.m3598r().m3621I());
                                SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(fragment.f6094c0.getVisibility());
                                specialEffectsControllerM3682f3.getClass();
                                if (FragmentManager.m3608K(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                specialEffectsControllerM3682f3.m3683a(stateFrom, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                            }
                            fragment.f6089a = 4;
                            break;
                        case 5:
                            m3755r();
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            fragment.f6089a = 6;
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            m3751n();
                            break;
                    }
                }
                z11 = true;
            }
        } catch (Throwable th2) {
            this.f6312d = false;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3749l() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
        }
        fragment.f6079Q.m3663t(5);
        if (fragment.f6094c0 != null) {
            fragment.f6113m0.m3812a(Lifecycle.Event.ON_PAUSE);
        }
        fragment.f6112l0.m3955f(Lifecycle.Event.ON_PAUSE);
        fragment.f6089a = 6;
        fragment.f6090a0 = false;
        fragment.mo3566O();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onPause()"));
        }
        this.f6309a.m3708f(false);
    }

    /* JADX INFO: renamed from: m */
    public final void m3750m(ClassLoader classLoader) {
        Fragment fragment = this.f6311c;
        Bundle bundle = fragment.f6091b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        fragment.f6093c = fragment.f6091b.getSparseParcelableArray("android:view_state");
        fragment.f6095d = fragment.f6091b.getBundle("android:view_registry_state");
        fragment.f6105i = fragment.f6091b.getString("android:target_state");
        if (fragment.f6105i != null) {
            fragment.f6107j = fragment.f6091b.getInt("android:target_req_state", 0);
        }
        Boolean bool = fragment.f6097e;
        if (bool != null) {
            fragment.f6098e0 = bool.booleanValue();
            fragment.f6097e = null;
        } else {
            fragment.f6098e0 = fragment.f6091b.getBoolean("android:user_visible_hint", true);
        }
        if (fragment.f6098e0) {
            return;
        }
        fragment.f6096d0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: n */
    public final void m3751n() {
        boolean z10;
        boolean zRequestFocus;
        String str;
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        Fragment.C0912c c0912c = fragment.f6100f0;
        View view = c0912c == null ? null : c0912c.f6139o;
        if (view != null) {
            if (view != fragment.f6094c0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent != fragment.f6094c0) {
                        parent = parent.getParent();
                    }
                }
                if (z10) {
                    zRequestFocus = view.requestFocus();
                    if (FragmentManager.m3608K(2)) {
                        StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                        sb2.append(view);
                        sb2.append(" ");
                        if (zRequestFocus) {
                            str = "succeeded";
                        } else {
                            str = "failed";
                        }
                        sb2.append(str);
                        sb2.append(" on Fragment ");
                        sb2.append(fragment);
                        sb2.append(" resulting in focused view ");
                        sb2.append(fragment.f6094c0.findFocus());
                        Log.v("FragmentManager", sb2.toString());
                    }
                }
            }
            z10 = true;
            if (z10) {
                zRequestFocus = view.requestFocus();
                if (FragmentManager.m3608K(2)) {
                    StringBuilder sb3 = new StringBuilder("requestFocus: Restoring focused view ");
                    sb3.append(view);
                    sb3.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb3.append(str);
                    sb3.append(" on Fragment ");
                    sb3.append(fragment);
                    sb3.append(" resulting in focused view ");
                    sb3.append(fragment.f6094c0.findFocus());
                    Log.v("FragmentManager", sb3.toString());
                }
            }
        }
        fragment.m3588h().f6139o = null;
        fragment.f6079Q.m3626R();
        fragment.f6079Q.m3667x(true);
        fragment.f6089a = 7;
        fragment.f6090a0 = false;
        fragment.mo3568Q();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onResume()"));
        }
        C1052r c1052r = fragment.f6112l0;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c1052r.m3955f(event);
        if (fragment.f6094c0 != null) {
            fragment.f6113m0.f6415d.m3955f(event);
        }
        C0949e0 c0949e0 = fragment.f6079Q;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(7);
        this.f6309a.m3711i(false);
        fragment.f6091b = null;
        fragment.f6093c = null;
        fragment.f6095d = null;
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m3752o() {
        Bundle bundle = new Bundle();
        Fragment fragment = this.f6311c;
        fragment.mo3569R(bundle);
        fragment.f6116p0.m15300c(bundle);
        bundle.putParcelable("android:support:fragments", fragment.f6079Q.m3636a0());
        this.f6309a.m3712j(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (fragment.f6094c0 != null) {
            m3754q();
        }
        if (fragment.f6093c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", fragment.f6093c);
        }
        if (fragment.f6095d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", fragment.f6095d);
        }
        if (!fragment.f6098e0) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", fragment.f6098e0);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public final void m3753p() {
        Fragment fragment = this.f6311c;
        FragmentState fragmentState = new FragmentState(fragment);
        if (fragment.f6089a <= -1 || fragmentState.f6217H != null) {
            fragmentState.f6217H = fragment.f6091b;
        } else {
            Bundle bundleM3752o = m3752o();
            fragmentState.f6217H = bundleM3752o;
            if (fragment.f6105i != null) {
                if (bundleM3752o == null) {
                    fragmentState.f6217H = new Bundle();
                }
                fragmentState.f6217H.putString("android:target_state", fragment.f6105i);
                int i10 = fragment.f6107j;
                if (i10 != 0) {
                    fragmentState.f6217H.putInt("android:target_req_state", i10);
                }
            }
        }
        this.f6310b.m3765i(fragment.f6099f, fragmentState);
    }

    /* JADX INFO: renamed from: q */
    public final void m3754q() {
        Fragment fragment = this.f6311c;
        if (fragment.f6094c0 == null) {
            return;
        }
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.f6094c0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.f6094c0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.f6093c = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.f6113m0.f6416e.m15300c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.f6095d = bundle;
    }

    /* JADX INFO: renamed from: r */
    public final void m3755r() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "moveto STARTED: " + fragment);
        }
        fragment.f6079Q.m3626R();
        fragment.f6079Q.m3667x(true);
        fragment.f6089a = 5;
        fragment.f6090a0 = false;
        fragment.mo3570S();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onStart()"));
        }
        C1052r c1052r = fragment.f6112l0;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c1052r.m3955f(event);
        if (fragment.f6094c0 != null) {
            fragment.f6113m0.f6415d.m3955f(event);
        }
        C0949e0 c0949e0 = fragment.f6079Q;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(5);
        this.f6309a.m3713k(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: s */
    public final void m3756s() {
        boolean zM3608K = FragmentManager.m3608K(3);
        Fragment fragment = this.f6311c;
        if (zM3608K) {
            Log.d("FragmentManager", "movefrom STARTED: " + fragment);
        }
        C0949e0 c0949e0 = fragment.f6079Q;
        c0949e0.f6150G = true;
        c0949e0.f6156M.f6292i = true;
        c0949e0.m3663t(4);
        if (fragment.f6094c0 != null) {
            fragment.f6113m0.m3812a(Lifecycle.Event.ON_STOP);
        }
        fragment.f6112l0.m3955f(Lifecycle.Event.ON_STOP);
        fragment.f6089a = 4;
        fragment.f6090a0 = false;
        fragment.mo3571T();
        if (!fragment.f6090a0) {
            throw new SuperNotCalledException(C0166e.m764j("Fragment ", fragment, " did not call through to super.onStop()"));
        }
        this.f6309a.m3714l(false);
    }
}
