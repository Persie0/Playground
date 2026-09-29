package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.AbstractC0140a;
import android.support.v4.media.session.C0166e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.InterfaceC0202a;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.p544savedstate.C1189a;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.C1030e0;
import androidx.view.C1040j0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.C1056v;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.view.SavedStateHandleSupport;
import androidx.view.ViewTreeLifecycleOwner;
import androidx.view.ViewTreeViewModelStoreOwner;
import com.kochava.tracker.BuildConfig;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p035c.AbstractC1641a;
import p254m2.C7472a;
import p270n4.C7705b;
import p270n4.InterfaceC7706c;
import p322pd.C8228i;
import p406u4.AbstractC9409f0;
import p427v3.AbstractC9634a;
import p427v3.C9636c;
import p447w3.AbstractC9808a;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1051q, InterfaceC1048n0, InterfaceC1037i, InterfaceC7706c {

    /* JADX INFO: renamed from: u0 */
    public static final Object f6069u0 = new Object();

    /* JADX INFO: renamed from: H */
    public boolean f6070H;

    /* JADX INFO: renamed from: I */
    public boolean f6071I;

    /* JADX INFO: renamed from: J */
    public boolean f6072J;

    /* JADX INFO: renamed from: K */
    public boolean f6073K;

    /* JADX INFO: renamed from: L */
    public boolean f6074L;

    /* JADX INFO: renamed from: M */
    public boolean f6075M;

    /* JADX INFO: renamed from: N */
    public int f6076N;

    /* JADX INFO: renamed from: O */
    public FragmentManager f6077O;

    /* JADX INFO: renamed from: P */
    public AbstractC0986x<?> f6078P;

    /* JADX INFO: renamed from: Q */
    public C0949e0 f6079Q;

    /* JADX INFO: renamed from: R */
    public Fragment f6080R;

    /* JADX INFO: renamed from: S */
    public int f6081S;

    /* JADX INFO: renamed from: T */
    public int f6082T;

    /* JADX INFO: renamed from: U */
    public String f6083U;

    /* JADX INFO: renamed from: V */
    public boolean f6084V;

    /* JADX INFO: renamed from: W */
    public boolean f6085W;

    /* JADX INFO: renamed from: X */
    public boolean f6086X;

    /* JADX INFO: renamed from: Y */
    public boolean f6087Y;

    /* JADX INFO: renamed from: Z */
    public boolean f6088Z;

    /* JADX INFO: renamed from: a */
    public int f6089a;

    /* JADX INFO: renamed from: a0 */
    public boolean f6090a0;

    /* JADX INFO: renamed from: b */
    public Bundle f6091b;

    /* JADX INFO: renamed from: b0 */
    public ViewGroup f6092b0;

    /* JADX INFO: renamed from: c */
    public SparseArray<Parcelable> f6093c;

    /* JADX INFO: renamed from: c0 */
    public View f6094c0;

    /* JADX INFO: renamed from: d */
    public Bundle f6095d;

    /* JADX INFO: renamed from: d0 */
    public boolean f6096d0;

    /* JADX INFO: renamed from: e */
    public Boolean f6097e;

    /* JADX INFO: renamed from: e0 */
    public boolean f6098e0;

    /* JADX INFO: renamed from: f */
    public String f6099f;

    /* JADX INFO: renamed from: f0 */
    public C0912c f6100f0;

    /* JADX INFO: renamed from: g */
    public Bundle f6101g;

    /* JADX INFO: renamed from: g0 */
    public boolean f6102g0;

    /* JADX INFO: renamed from: h */
    public Fragment f6103h;

    /* JADX INFO: renamed from: h0 */
    public LayoutInflater f6104h0;

    /* JADX INFO: renamed from: i */
    public String f6105i;

    /* JADX INFO: renamed from: i0 */
    public boolean f6106i0;

    /* JADX INFO: renamed from: j */
    public int f6107j;

    /* JADX INFO: renamed from: j0 */
    public String f6108j0;

    /* JADX INFO: renamed from: k */
    public Boolean f6109k;

    /* JADX INFO: renamed from: k0 */
    public Lifecycle.State f6110k0;

    /* JADX INFO: renamed from: l */
    public boolean f6111l;

    /* JADX INFO: renamed from: l0 */
    public C1052r f6112l0;

    /* JADX INFO: renamed from: m0 */
    public C0980t0 f6113m0;

    /* JADX INFO: renamed from: n0 */
    public final C1056v<InterfaceC1051q> f6114n0;

    /* JADX INFO: renamed from: o0 */
    public C1030e0 f6115o0;

    /* JADX INFO: renamed from: p0 */
    public C7705b f6116p0;

    /* JADX INFO: renamed from: q0 */
    public final int f6117q0;

    /* JADX INFO: renamed from: r0 */
    public final AtomicInteger f6118r0;

    /* JADX INFO: renamed from: s0 */
    public final ArrayList<AbstractC0913d> f6119s0;

    /* JADX INFO: renamed from: t0 */
    public final C0910a f6120t0;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0909a();

        /* JADX INFO: renamed from: a */
        public final Bundle f6122a;

        /* JADX INFO: renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C0909a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Bundle bundle) {
            this.f6122a = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f6122a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f6122a);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$a */
    public class C0910a extends AbstractC0913d {
        public C0910a() {
        }

        @Override // androidx.fragment.app.Fragment.AbstractC0913d
        /* JADX INFO: renamed from: a */
        public final void mo3606a() {
            Fragment fragment = Fragment.this;
            fragment.f6116p0.m15298a();
            SavedStateHandleSupport.m3909b(fragment);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$b */
    public class C0911b extends AbstractC0140a {
        public C0911b() {
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: V */
        public final View mo584V(int i10) {
            Fragment fragment = Fragment.this;
            View view = fragment.f6094c0;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " does not have a view"));
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: Z */
        public final boolean mo588Z() {
            return Fragment.this.f6094c0 != null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$c */
    public static class C0912c {

        /* JADX INFO: renamed from: a */
        public boolean f6125a;

        /* JADX INFO: renamed from: b */
        public int f6126b;

        /* JADX INFO: renamed from: c */
        public int f6127c;

        /* JADX INFO: renamed from: d */
        public int f6128d;

        /* JADX INFO: renamed from: e */
        public int f6129e;

        /* JADX INFO: renamed from: f */
        public int f6130f;

        /* JADX INFO: renamed from: g */
        public ArrayList<String> f6131g;

        /* JADX INFO: renamed from: h */
        public ArrayList<String> f6132h;

        /* JADX INFO: renamed from: i */
        public Object f6133i = null;

        /* JADX INFO: renamed from: j */
        public Object f6134j;

        /* JADX INFO: renamed from: k */
        public Object f6135k;

        /* JADX INFO: renamed from: l */
        public Object f6136l;

        /* JADX INFO: renamed from: m */
        public final Object f6137m;

        /* JADX INFO: renamed from: n */
        public float f6138n;

        /* JADX INFO: renamed from: o */
        public View f6139o;

        public C0912c() {
            Object obj = Fragment.f6069u0;
            this.f6134j = obj;
            this.f6135k = null;
            this.f6136l = obj;
            this.f6137m = obj;
            this.f6138n = 1.0f;
            this.f6139o = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$d */
    public static abstract class AbstractC0913d {
        /* JADX INFO: renamed from: a */
        public abstract void mo3606a();
    }

    public Fragment() {
        this.f6089a = -1;
        this.f6099f = UUID.randomUUID().toString();
        this.f6105i = null;
        this.f6109k = null;
        this.f6079Q = new C0949e0();
        this.f6088Z = true;
        this.f6098e0 = true;
        this.f6110k0 = Lifecycle.State.RESUMED;
        this.f6114n0 = new C1056v<>();
        this.f6118r0 = new AtomicInteger();
        this.f6119s0 = new ArrayList<>();
        this.f6120t0 = new C0910a();
        m3602w();
    }

    public Fragment(int i10) {
        this();
        this.f6117q0 = i10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m3556A() {
        return this.f6076N > 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m3557B() {
        View view;
        return (!m3604y() || m3605z() || (view = this.f6094c0) == null || view.getWindowToken() == null || this.f6094c0.getVisibility() != 0) ? false : true;
    }

    @Deprecated
    /* JADX INFO: renamed from: C */
    public void mo3558C() {
        this.f6090a0 = true;
    }

    @Deprecated
    /* JADX INFO: renamed from: D */
    public void mo3559D(int i10, int i11, Intent intent) {
        if (FragmentManager.m3608K(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: E */
    public void mo466E(Activity activity) {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: F */
    public void mo467F(Context context) {
        this.f6090a0 = true;
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        Activity activity = abstractC0986x == null ? null : abstractC0986x.f6428a;
        if (activity != null) {
            this.f6090a0 = false;
            mo466E(activity);
        }
    }

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        return this.f6112l0;
    }

    /* JADX INFO: renamed from: H */
    public void mo3560H(Bundle bundle) {
        Parcelable parcelable;
        this.f6090a0 = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.f6079Q.m3634Z(parcelable);
            C0949e0 c0949e0 = this.f6079Q;
            c0949e0.f6149F = false;
            c0949e0.f6150G = false;
            c0949e0.f6156M.f6292i = false;
            c0949e0.m3663t(1);
        }
        C0949e0 c0949e1 = this.f6079Q;
        if (!(c0949e1.f6177t >= 1)) {
            c0949e1.f6149F = false;
            c0949e1.f6150G = false;
            c0949e1.f6156M.f6292i = false;
            c0949e1.m3663t(1);
        }
    }

    /* JADX INFO: renamed from: I */
    public View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.f6117q0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public void mo3562J() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: K */
    public void mo3563K() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: L */
    public void mo3564L() {
        this.f6090a0 = true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: M */
    public LayoutInflater mo468M(Bundle bundle) {
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if (abstractC0986x == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterMo3809m0 = abstractC0986x.mo3809m0();
        layoutInflaterMo3809m0.setFactory2(this.f6079Q.f6163f);
        return layoutInflaterMo3809m0;
    }

    /* JADX INFO: renamed from: N */
    public void mo3565N(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f6090a0 = true;
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if ((abstractC0986x == null ? null : abstractC0986x.f6428a) != null) {
            this.f6090a0 = true;
        }
    }

    /* JADX INFO: renamed from: O */
    public void mo3566O() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: P */
    public void mo3567P(boolean z10) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo3568Q() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: R */
    public void mo3569R(Bundle bundle) {
    }

    /* JADX INFO: renamed from: S */
    public void mo3570S() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: T */
    public void mo3571T() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: U */
    public void mo3572U(View view, Bundle bundle) {
    }

    /* JADX INFO: renamed from: V */
    public void mo3573V(Bundle bundle) {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: W */
    public void mo3574W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f6079Q.m3626R();
        boolean z10 = true;
        this.f6075M = true;
        this.f6113m0 = new C0980t0(this, mo796n());
        View viewMo3561I = mo3561I(layoutInflater, viewGroup, bundle);
        this.f6094c0 = viewMo3561I;
        if (viewMo3561I != null) {
            this.f6113m0.m3813c();
            ViewTreeLifecycleOwner.m3912b(this.f6094c0, this.f6113m0);
            ViewTreeViewModelStoreOwner.m3914b(this.f6094c0, this.f6113m0);
            ViewTreeSavedStateRegistryOwner.m4583b(this.f6094c0, this.f6113m0);
            this.f6114n0.mo3900i(this.f6113m0);
            return;
        }
        if (this.f6113m0.f6415d == null) {
            z10 = false;
        }
        if (z10) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.f6113m0 = null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: X */
    public final C0964m m3575X(InterfaceC0202a interfaceC0202a, AbstractC1641a abstractC1641a) {
        C0966n c0966n = new C0966n(this);
        if (this.f6089a > 1) {
            throw new IllegalStateException(C0166e.m764j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C0968o c0968o = new C0968o(this, c0966n, atomicReference, abstractC1641a, interfaceC0202a);
        if (this.f6089a >= 0) {
            c0968o.mo3606a();
        } else {
            this.f6119s0.add(c0968o);
        }
        return new C0964m(atomicReference, abstractC1641a);
    }

    /* JADX INFO: renamed from: Y */
    public final ActivityC0979t m3576Y() {
        ActivityC0979t activityC0979tM3582e = m3582e();
        if (activityC0979tM3582e != null) {
            return activityC0979tM3582e;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " not attached to an activity."));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: Z */
    public final Bundle m3577Z() {
        Bundle bundle = this.f6101g;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " does not have any arguments."));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a0 */
    public final Context m3578a0() {
        Context contextMo471m = mo471m();
        if (contextMo471m != null) {
            return contextMo471m;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " not attached to a context."));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b0 */
    public final Fragment m3579b0() {
        Fragment fragment = this.f6080R;
        if (fragment != null) {
            return fragment;
        }
        if (mo471m() == null) {
            throw new IllegalStateException(C0166e.m764j("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + mo471m());
    }

    /* JADX INFO: renamed from: c0 */
    public final View m3580c0() {
        View view = this.f6094c0;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3581d0(int i10, int i11, int i12, int i13) {
        if (this.f6100f0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m3588h().f6126b = i10;
        m3588h().f6127c = i11;
        m3588h().f6128d = i12;
        m3588h().f6129e = i13;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3583e0(Bundle bundle) {
        FragmentManager fragmentManager = this.f6077O;
        if (fragmentManager != null) {
            if (fragmentManager == null ? false : fragmentManager.m3624P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f6101g = bundle;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* JADX INFO: renamed from: f */
    public AbstractC0140a mo3584f() {
        return new C0911b();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m3585f0(AbstractC9409f0 abstractC9409f0) {
        m3588h().f6133i = abstractC9409f0;
    }

    /* JADX INFO: renamed from: g */
    public void mo3586g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f6081S));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f6082T));
        printWriter.print(" mTag=");
        printWriter.println(this.f6083U);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f6089a);
        printWriter.print(" mWho=");
        printWriter.print(this.f6099f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f6076N);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f6111l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f6070H);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f6072J);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f6073K);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f6084V);
        printWriter.print(" mDetached=");
        printWriter.print(this.f6085W);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f6088Z);
        printWriter.print(" mHasMenu=");
        int i10 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f6086X);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f6098e0);
        if (this.f6077O != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f6077O);
        }
        if (this.f6078P != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f6078P);
        }
        if (this.f6080R != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f6080R);
        }
        if (this.f6101g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f6101g);
        }
        if (this.f6091b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f6091b);
        }
        if (this.f6093c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f6093c);
        }
        if (this.f6095d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f6095d);
        }
        Fragment fragmentM3613A = this.f6103h;
        if (fragmentM3613A == null) {
            FragmentManager fragmentManager = this.f6077O;
            fragmentM3613A = (fragmentManager == null || (str2 = this.f6105i) == null) ? null : fragmentManager.m3613A(str2);
        }
        if (fragmentM3613A != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentM3613A);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f6107j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        C0912c c0912c = this.f6100f0;
        printWriter.println(c0912c == null ? false : c0912c.f6125a);
        C0912c c0912c2 = this.f6100f0;
        if ((c0912c2 == null ? 0 : c0912c2.f6126b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            C0912c c0912c3 = this.f6100f0;
            printWriter.println(c0912c3 == null ? 0 : c0912c3.f6126b);
        }
        C0912c c0912c4 = this.f6100f0;
        if ((c0912c4 == null ? 0 : c0912c4.f6127c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            C0912c c0912c5 = this.f6100f0;
            printWriter.println(c0912c5 == null ? 0 : c0912c5.f6127c);
        }
        C0912c c0912c6 = this.f6100f0;
        if ((c0912c6 == null ? 0 : c0912c6.f6128d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            C0912c c0912c7 = this.f6100f0;
            printWriter.println(c0912c7 == null ? 0 : c0912c7.f6128d);
        }
        C0912c c0912c8 = this.f6100f0;
        if ((c0912c8 == null ? 0 : c0912c8.f6129e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            C0912c c0912c9 = this.f6100f0;
            if (c0912c9 != null) {
                i10 = c0912c9.f6129e;
            }
            printWriter.println(i10);
        }
        if (this.f6092b0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f6092b0);
        }
        if (this.f6094c0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f6094c0);
        }
        if (mo471m() != null) {
            AbstractC9808a.m18288a(this).m18289b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f6079Q + ":");
        this.f6079Q.m3664u(C0166e.m765k(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m3587g0(AbstractC9409f0 abstractC9409f0) {
        m3588h().f6135k = abstractC9409f0;
    }

    /* JADX INFO: renamed from: h */
    public final C0912c m3588h() {
        if (this.f6100f0 == null) {
            this.f6100f0 = new C0912c();
        }
        return this.f6100f0;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3589h0(C8228i c8228i) {
        m3588h().f6136l = c8228i;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public C1042k0.b mo470i() {
        Application application;
        if (this.f6077O == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f6115o0 == null) {
            Context applicationContext = m3578a0().getApplicationContext();
            while (true) {
                Context context = applicationContext;
                if (!(context instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (context instanceof Application) {
                    application = (Application) context;
                    break;
                }
                applicationContext = ((ContextWrapper) context).getBaseContext();
            }
            if (application == null && FragmentManager.m3608K(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m3578a0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f6115o0 = new C1030e0(application, this, this.f6101g);
        }
        return this.f6115o0;
    }

    @Deprecated
    /* JADX INFO: renamed from: i0 */
    public final void m3590i0() {
        FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this);
        FragmentStrictMode.m3801c(setRetainInstanceUsageViolation);
        FragmentStrictMode.C0978a c0978aM3799a = FragmentStrictMode.m3799a(this);
        if (c0978aM3799a.f6403a.contains(FragmentStrictMode.Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.m3803e(c0978aM3799a, getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.m3800b(c0978aM3799a, setRetainInstanceUsageViolation);
        }
        this.f6086X = true;
        FragmentManager fragmentManager = this.f6077O;
        if (fragmentManager != null) {
            fragmentManager.f6156M.m3726l2(this);
        } else {
            this.f6087Y = true;
        }
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: j */
    public final AbstractC9634a mo792j() {
        Application application;
        Context applicationContext = m3578a0().getApplicationContext();
        while (true) {
            Context context = applicationContext;
            if (!(context instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (context instanceof Application) {
                application = (Application) context;
                break;
            }
            applicationContext = ((ContextWrapper) context).getBaseContext();
        }
        if (application == null && FragmentManager.m3608K(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m3578a0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C9636c c9636c = new C9636c(0);
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        if (application != null) {
            linkedHashMap.put(C1040j0.f6663a, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f6589a, this);
        linkedHashMap.put(SavedStateHandleSupport.f6590b, this);
        Bundle bundle = this.f6101g;
        if (bundle != null) {
            linkedHashMap.put(SavedStateHandleSupport.f6591c, bundle);
        }
        return c9636c;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3591j0(AbstractC9409f0 abstractC9409f0) {
        m3588h().f6134j = abstractC9409f0;
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final ActivityC0979t m3582e() {
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if (abstractC0986x == null) {
            return null;
        }
        return (ActivityC0979t) abstractC0986x.f6428a;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    @Deprecated
    /* JADX INFO: renamed from: k0 */
    public final void m3593k0(boolean z10) {
        FragmentStrictMode.C0978a c0978a = FragmentStrictMode.f6401a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, z10);
        FragmentStrictMode.m3801c(setUserVisibleHintViolation);
        FragmentStrictMode.C0978a c0978aM3799a = FragmentStrictMode.m3799a(this);
        if (c0978aM3799a.f6403a.contains(FragmentStrictMode.Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.m3803e(c0978aM3799a, getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.m3800b(c0978aM3799a, setUserVisibleHintViolation);
        }
        boolean z11 = true;
        if (!this.f6098e0 && z10 && this.f6089a < 5 && this.f6077O != null && m3604y() && this.f6106i0) {
            FragmentManager fragmentManager = this.f6077O;
            C0959j0 c0959j0M3645f = fragmentManager.m3645f(this);
            Fragment fragment = c0959j0M3645f.f6311c;
            if (fragment.f6096d0) {
                if (fragmentManager.f6159b) {
                    fragmentManager.f6152I = true;
                } else {
                    fragment.f6096d0 = false;
                    c0959j0M3645f.m3748k();
                }
            }
        }
        this.f6098e0 = z10;
        if (this.f6089a >= 5 || z10) {
            z11 = false;
        }
        this.f6096d0 = z11;
        if (this.f6091b != null) {
            this.f6097e = Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: l */
    public final FragmentManager m3594l() {
        if (this.f6078P != null) {
            return this.f6079Q;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " has not been attached yet."));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m3595l0(@SuppressLint({"UnknownNullness"}) Intent intent) {
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if (abstractC0986x == null) {
            throw new IllegalStateException(C0166e.m764j("Fragment ", this, " not attached to Activity"));
        }
        Object obj = C7472a.f41322a;
        C7472a.a.m14844b(abstractC0986x.f6429b, intent, null);
    }

    /* JADX INFO: renamed from: m */
    public Context mo471m() {
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if (abstractC0986x == null) {
            return null;
        }
        return abstractC0986x.f6429b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.view.InterfaceC1048n0
    /* JADX INFO: renamed from: n */
    public final C1046m0 mo796n() {
        if (this.f6077O == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m3597p() == Lifecycle.State.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, C1046m0> map = this.f6077O.f6156M.f6289f;
        C1046m0 c1046m0 = map.get(this.f6099f);
        if (c1046m0 != null) {
            return c1046m0;
        }
        C1046m0 c1046m1 = new C1046m0();
        map.put(this.f6099f, c1046m1);
        return c1046m1;
    }

    /* JADX INFO: renamed from: o */
    public final Object m3596o() {
        AbstractC0986x<?> abstractC0986x = this.f6078P;
        if (abstractC0986x == null) {
            return null;
        }
        return abstractC0986x.mo3808l0();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f6090a0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m3576Y().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f6090a0 = true;
    }

    /* JADX INFO: renamed from: p */
    public final int m3597p() {
        Lifecycle.State state = this.f6110k0;
        return (state == Lifecycle.State.INITIALIZED || this.f6080R == null) ? state.ordinal() : Math.min(state.ordinal(), this.f6080R.m3597p());
    }

    @Override // p270n4.InterfaceC7706c
    /* JADX INFO: renamed from: q */
    public final C1189a mo797q() {
        return this.f6116p0.f42232b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: r */
    public final FragmentManager m3598r() {
        FragmentManager fragmentManager = this.f6077O;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(C0166e.m764j("Fragment ", this, " not associated with a fragment manager."));
    }

    /* JADX INFO: renamed from: s */
    public final Resources m3599s() {
        return m3578a0().getResources();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Deprecated
    public final void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) throws Exception {
        if (this.f6078P == null) {
            throw new IllegalStateException(C0166e.m764j("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager fragmentManagerM3598r = m3598r();
        if (fragmentManagerM3598r.f6144A != null) {
            fragmentManagerM3598r.f6147D.addLast(new FragmentManager.LaunchedFragmentInfo(this.f6099f, i10));
            fragmentManagerM3598r.f6144A.mo844a(intent);
        } else {
            AbstractC0986x<?> abstractC0986x = fragmentManagerM3598r.f6178u;
            abstractC0986x.getClass();
            if (i10 != -1) {
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
            Object obj = C7472a.f41322a;
            C7472a.a.m14844b(abstractC0986x.f6429b, intent, null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final String m3600t(int i10) {
        return m3599s().getString(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f6099f);
        if (this.f6081S != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f6081S));
        }
        if (this.f6083U != null) {
            sb2.append(" tag=");
            sb2.append(this.f6083U);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: v */
    public final C0980t0 m3601v() {
        C0980t0 c0980t0 = this.f6113m0;
        if (c0980t0 != null) {
            return c0980t0;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* JADX INFO: renamed from: w */
    public final void m3602w() {
        this.f6112l0 = new C1052r(this);
        this.f6116p0 = new C7705b(this);
        this.f6115o0 = null;
        ArrayList<AbstractC0913d> arrayList = this.f6119s0;
        C0910a c0910a = this.f6120t0;
        if (arrayList.contains(c0910a)) {
            return;
        }
        if (this.f6089a >= 0) {
            c0910a.mo3606a();
        } else {
            arrayList.add(c0910a);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m3603x() {
        m3602w();
        this.f6108j0 = this.f6099f;
        this.f6099f = UUID.randomUUID().toString();
        this.f6111l = false;
        this.f6070H = false;
        this.f6072J = false;
        this.f6073K = false;
        this.f6074L = false;
        this.f6076N = 0;
        this.f6077O = null;
        this.f6079Q = new C0949e0();
        this.f6078P = null;
        this.f6081S = 0;
        this.f6082T = 0;
        this.f6083U = null;
        this.f6084V = false;
        this.f6085W = false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m3604y() {
        return this.f6078P != null && this.f6111l;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m3605z() {
        boolean z10;
        if (this.f6084V) {
            z10 = true;
        } else {
            FragmentManager fragmentManager = this.f6077O;
            z10 = false;
            if (fragmentManager != null) {
                Fragment fragment = this.f6080R;
                fragmentManager.getClass();
                if (fragment == null ? false : fragment.m3605z()) {
                    z10 = true;
                }
            }
        }
        return z10;
    }
}
