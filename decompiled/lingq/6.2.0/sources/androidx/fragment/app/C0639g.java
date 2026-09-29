package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R$id;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.ViewOnAttachStateChangeListenerC3112ii;
import p000.bl2;
import p000.cua;
import p000.d28;
import p000.de3;
import p000.df9;
import p000.dta;
import p000.ed3;
import p000.fd3;
import p000.hd3;
import p000.id3;
import p000.ih5;
import p000.kh5;
import p000.le3;
import p000.lg3;
import p000.ne3;
import p000.ny8;
import p000.of3;
import p000.or1;
import p000.p82;
import p000.pe9;
import p000.rf3;
import p000.sf3;
import p000.ue3;
import p000.wb5;
import p000.wq1;
import p000.y38;
import p000.z21;
import p000.ze9;

/* JADX INFO: renamed from: androidx.fragment.app.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0639g {

    /* JADX INFO: renamed from: a */
    public final bl2 f5766a;

    /* JADX INFO: renamed from: b */
    public final ny8 f5767b;

    /* JADX INFO: renamed from: c */
    public final AbstractComponentCallbacksC0635c f5768c;

    /* JADX INFO: renamed from: d */
    public boolean f5769d = false;

    /* JADX INFO: renamed from: e */
    public int f5770e = -1;

    public C0639g(bl2 bl2Var, ny8 ny8Var, ClassLoader classLoader, de3 de3Var, Bundle bundle) {
        this.f5766a = bl2Var;
        this.f5767b = ny8Var;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM2064a = ((FragmentState) bundle.getParcelable("state")).m2064a(de3Var);
        this.f5768c = abstractComponentCallbacksC0635cM2064a;
        abstractComponentCallbacksC0635cM2064a.f5687b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC0635cM2064a.m2095W(bundle2);
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0635cM2064a);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2192a() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0635c);
        }
        Bundle bundle = abstractComponentCallbacksC0635c.f5687b;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0635c.f5676R.m2146S();
        abstractComponentCallbacksC0635c.f5685a = 3;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2120v();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onActivityCreated()"));
        }
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0635c);
        }
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            Bundle bundle2 = abstractComponentCallbacksC0635c.f5687b;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC0635c.f5689c;
            if (sparseArray != null) {
                abstractComponentCallbacksC0635c.f5692d0.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC0635c.f5689c = null;
            }
            abstractComponentCallbacksC0635c.f5688b0 = false;
            abstractComponentCallbacksC0635c.mo2086N(bundle3);
            if (!abstractComponentCallbacksC0635c.f5688b0) {
                throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC0635c.f5692d0 != null) {
                abstractComponentCallbacksC0635c.f5710n0.m16178a(Lifecycle$Event.ON_CREATE);
            }
        }
        abstractComponentCallbacksC0635c.f5687b = null;
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(4);
        this.f5766a.m3859r(abstractComponentCallbacksC0635c, false);
    }

    /* JADX INFO: renamed from: b */
    public final void m2193b() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c;
        View view;
        View view2;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = this.f5768c;
        View view3 = abstractComponentCallbacksC0635c2.f5690c0;
        while (true) {
            abstractComponentCallbacksC0635c = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R$id.fragment_container_view_tag);
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = tag instanceof AbstractComponentCallbacksC0635c ? (AbstractComponentCallbacksC0635c) tag : null;
            if (abstractComponentCallbacksC0635c3 != null) {
                abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635c3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c4 = abstractComponentCallbacksC0635c2.f5677S;
        if (abstractComponentCallbacksC0635c != null && abstractComponentCallbacksC0635c != abstractComponentCallbacksC0635c4) {
            int i = abstractComponentCallbacksC0635c2.f5679U;
            rf3 rf3Var = sf3.f60790a;
            sf3.m21333b(new WrongNestedHierarchyViolation(abstractComponentCallbacksC0635c2, abstractComponentCallbacksC0635c, i));
            sf3.m21332a(abstractComponentCallbacksC0635c2).getClass();
            FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
        }
        ArrayList arrayList = (ArrayList) this.f5767b.f53414b;
        ViewGroup viewGroup = abstractComponentCallbacksC0635c2.f5690c0;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC0635c2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c5 = (AbstractComponentCallbacksC0635c) arrayList.get(i2);
                if (abstractComponentCallbacksC0635c5.f5690c0 == viewGroup && (view2 = abstractComponentCallbacksC0635c5.f5692d0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c6 = (AbstractComponentCallbacksC0635c) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC0635c6.f5690c0 == viewGroup && (view = abstractComponentCallbacksC0635c6.f5692d0) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC0635c2.f5690c0.addView(abstractComponentCallbacksC0635c2.f5692d0, iIndexOfChild);
    }

    /* JADX INFO: renamed from: c */
    public final void m2194c() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0635c);
        }
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c.f5697g;
        C0639g c0639g = null;
        ny8 ny8Var = this.f5767b;
        if (abstractComponentCallbacksC0635c2 != null) {
            C0639g c0639g2 = (C0639g) ((HashMap) ny8Var.f53415c).get(abstractComponentCallbacksC0635c2.f5693e);
            if (c0639g2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0635c);
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c3 = abstractComponentCallbacksC0635c.f5697g;
                sb.append(" declared target fragment ");
                sb.append(abstractComponentCallbacksC0635c3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC0635c.f5699h = abstractComponentCallbacksC0635c.f5697g.f5693e;
            abstractComponentCallbacksC0635c.f5697g = null;
            c0639g = c0639g2;
        } else {
            String str = abstractComponentCallbacksC0635c.f5699h;
            if (str != null && (c0639g = (C0639g) ((HashMap) ny8Var.f53415c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(abstractComponentCallbacksC0635c);
                sb2.append(" declared target fragment ");
                C3386nv.m17633t(AbstractC3393o1.m17738m(sb2, abstractComponentCallbacksC0635c.f5699h, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (c0639g != null) {
            c0639g.m2202k();
        }
        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
        abstractComponentCallbacksC0635c.f5675Q = abstractC0638f.f5763x;
        abstractComponentCallbacksC0635c.f5677S = abstractC0638f.f5765z;
        bl2 bl2Var = this.f5766a;
        bl2Var.m3865x(abstractComponentCallbacksC0635c, false);
        ArrayList arrayList = abstractComponentCallbacksC0635c.f5716t0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((fd3) it.next()).mo3635a();
        }
        arrayList.clear();
        abstractComponentCallbacksC0635c.f5676R.m2156b(abstractComponentCallbacksC0635c.f5675Q, abstractComponentCallbacksC0635c.mo2099a(), abstractComponentCallbacksC0635c);
        abstractComponentCallbacksC0635c.f5685a = 0;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2123y(abstractComponentCallbacksC0635c.f5675Q.f42210L);
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onAttach()"));
        }
        AbstractC0638f abstractC0638f2 = abstractComponentCallbacksC0635c.f5674P;
        Iterator it2 = abstractC0638f2.f5756q.iterator();
        while (it2.hasNext()) {
            ((ue3) it2.next()).mo4569g(abstractComponentCallbacksC0635c, abstractC0638f2);
        }
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(0);
        bl2Var.m3860s(abstractComponentCallbacksC0635c, false);
    }

    /* JADX INFO: renamed from: d */
    public final int m2195d() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (abstractComponentCallbacksC0635c.f5674P == null) {
            return abstractComponentCallbacksC0635c.f5685a;
        }
        int iMin = this.f5770e;
        int i = of3.f54264a[abstractComponentCallbacksC0635c.f5708l0.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0635c.f5668J) {
            boolean z = abstractComponentCallbacksC0635c.f5669K;
            int i2 = this.f5770e;
            if (z) {
                iMin = Math.max(i2, 2);
                View view = abstractComponentCallbacksC0635c.f5692d0;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i2 < 4 ? Math.min(iMin, abstractComponentCallbacksC0635c.f5685a) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0635c.f5670L && abstractComponentCallbacksC0635c.f5690c0 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC0635c.f5705k) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0635c.f5690c0;
        SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact = null;
        if (viewGroup != null) {
            p82 p82VarM18951i = p82.m18951i(viewGroup, abstractComponentCallbacksC0635c.m2109k());
            ze9 ze9VarM18958f = p82VarM18951i.m18958f(abstractComponentCallbacksC0635c);
            SpecialEffectsController$Operation$LifecycleImpact specialEffectsController$Operation$LifecycleImpact2 = ze9VarM18958f != null ? ze9VarM18958f.f71465b : null;
            ze9 ze9VarM18959g = p82VarM18951i.m18959g(abstractComponentCallbacksC0635c);
            specialEffectsController$Operation$LifecycleImpact = ze9VarM18959g != null ? ze9VarM18959g.f71465b : null;
            int i3 = specialEffectsController$Operation$LifecycleImpact2 == null ? -1 : df9.f35568a[specialEffectsController$Operation$LifecycleImpact2.ordinal()];
            if (i3 != -1 && i3 != 1) {
                specialEffectsController$Operation$LifecycleImpact = specialEffectsController$Operation$LifecycleImpact2;
            }
        }
        if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (specialEffectsController$Operation$LifecycleImpact == SpecialEffectsController$Operation$LifecycleImpact.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC0635c.f5707l) {
            iMin = abstractComponentCallbacksC0635c.m2119u() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0635c.f5694e0 && abstractComponentCallbacksC0635c.f5685a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0635c.f5666H) {
            iMin = Math.max(iMin, 3);
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0635c);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: e */
    public final void m2196e() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0635c);
        }
        Bundle bundle = abstractComponentCallbacksC0635c.f5687b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0635c.f5704j0) {
            abstractComponentCallbacksC0635c.f5685a = 1;
            abstractComponentCallbacksC0635c.m2093U();
            return;
        }
        bl2 bl2Var = this.f5766a;
        bl2Var.m3866y(abstractComponentCallbacksC0635c, false);
        abstractComponentCallbacksC0635c.f5676R.m2146S();
        abstractComponentCallbacksC0635c.f5685a = 1;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.f5709m0.mo21323g(new d28(abstractComponentCallbacksC0635c, 4));
        abstractComponentCallbacksC0635c.mo2124z(bundle2);
        abstractComponentCallbacksC0635c.f5704j0 = true;
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC0635c.f5709m0.m23833G(Lifecycle$Event.ON_CREATE);
        bl2Var.m3861t(abstractComponentCallbacksC0635c, false);
    }

    /* JADX INFO: renamed from: f */
    public final void m2197f() {
        String resourceName;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (abstractComponentCallbacksC0635c.f5668J) {
            return;
        }
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0635c);
        }
        Bundle bundle = abstractComponentCallbacksC0635c.f5687b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo2078E = abstractComponentCallbacksC0635c.mo2078E(bundle2);
        abstractComponentCallbacksC0635c.f5702i0 = layoutInflaterMo2078E;
        ViewGroup viewGroup2 = abstractComponentCallbacksC0635c.f5690c0;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0635c.f5679U;
            if (i != 0) {
                if (i == -1) {
                    C3386nv.m17626m(wq1.m24117m("Cannot create fragment ", abstractComponentCallbacksC0635c, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0635c.f5674P.f5764y.mo293o0(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0635c.f5671M && !abstractComponentCallbacksC0635c.f5670L) {
                        try {
                            resourceName = abstractComponentCallbacksC0635c.m2110l().getResourceName(abstractComponentCallbacksC0635c.f5679U);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0635c.f5679U) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0635c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    rf3 rf3Var = sf3.f60790a;
                    sf3.m21333b(new WrongFragmentContainerViolation(abstractComponentCallbacksC0635c, viewGroup));
                    sf3.m21332a(abstractComponentCallbacksC0635c).getClass();
                    FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
                }
            }
        }
        abstractComponentCallbacksC0635c.f5690c0 = viewGroup;
        abstractComponentCallbacksC0635c.mo2087O(layoutInflaterMo2078E, viewGroup, bundle2);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            if (AbstractC0638f.m2128L(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + abstractComponentCallbacksC0635c);
            }
            abstractComponentCallbacksC0635c.f5692d0.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC0635c.f5692d0.setTag(R$id.fragment_container_view_tag, abstractComponentCallbacksC0635c);
            if (viewGroup != null) {
                m2193b();
            }
            if (abstractComponentCallbacksC0635c.f5681W) {
                abstractComponentCallbacksC0635c.f5692d0.setVisibility(8);
            }
            boolean zIsAttachedToWindow = abstractComponentCallbacksC0635c.f5692d0.isAttachedToWindow();
            View view = abstractComponentCallbacksC0635c.f5692d0;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = dta.f36217a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3112ii(view, 1));
            }
            Bundle bundle3 = abstractComponentCallbacksC0635c.f5687b;
            if (bundle3 != null) {
                bundle3.getBundle("savedInstanceState");
            }
            abstractComponentCallbacksC0635c.mo2085M(abstractComponentCallbacksC0635c.f5692d0);
            abstractComponentCallbacksC0635c.f5676R.m2186u(2);
            this.f5766a.m3824D(abstractComponentCallbacksC0635c, abstractComponentCallbacksC0635c.f5692d0, bundle2, false);
            int visibility = abstractComponentCallbacksC0635c.f5692d0.getVisibility();
            abstractComponentCallbacksC0635c.m2104f().f37052l = abstractComponentCallbacksC0635c.f5692d0.getAlpha();
            if (abstractComponentCallbacksC0635c.f5690c0 != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC0635c.f5692d0.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC0635c.m2104f().f37053m = viewFindFocus;
                    if (AbstractC0638f.m2128L(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + abstractComponentCallbacksC0635c);
                    }
                }
                abstractComponentCallbacksC0635c.f5692d0.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC0635c.f5685a = 2;
    }

    /* JADX INFO: renamed from: g */
    public final void m2198g() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM17701u;
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0635c);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = abstractComponentCallbacksC0635c.f5707l && !abstractComponentCallbacksC0635c.m2119u();
        ny8 ny8Var = this.f5767b;
        if (z && !abstractComponentCallbacksC0635c.f5667I) {
            ny8Var.m17686N(abstractComponentCallbacksC0635c.f5693e, null);
        }
        if (!z) {
            ne3 ne3Var = (ne3) ny8Var.f53417e;
            if (!((ne3Var.f52636b.containsKey(abstractComponentCallbacksC0635c.f5693e) && ne3Var.f52639e) ? ne3Var.f52640f : true)) {
                String str = abstractComponentCallbacksC0635c.f5699h;
                if (str != null && (abstractComponentCallbacksC0635cM17701u = ny8Var.m17701u(str)) != null && abstractComponentCallbacksC0635cM17701u.f5683Y) {
                    abstractComponentCallbacksC0635c.f5697g = abstractComponentCallbacksC0635cM17701u;
                }
                abstractComponentCallbacksC0635c.f5685a = 0;
                return;
            }
        }
        hd3 hd3Var = abstractComponentCallbacksC0635c.f5675Q;
        if (hd3Var != null) {
            zIsChangingConfigurations = ((ne3) ny8Var.f53417e).f52640f;
        } else {
            id3 id3Var = hd3Var.f42210L;
            if (id3Var != null) {
                zIsChangingConfigurations = true ^ id3Var.isChangingConfigurations();
            }
        }
        if ((z && !abstractComponentCallbacksC0635c.f5667I) || zIsChangingConfigurations) {
            ((ne3) ny8Var.f53417e).m17399W2(abstractComponentCallbacksC0635c, false);
        }
        abstractComponentCallbacksC0635c.f5676R.m2175l();
        abstractComponentCallbacksC0635c.f5709m0.m23833G(Lifecycle$Event.ON_DESTROY);
        abstractComponentCallbacksC0635c.f5685a = 0;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.f5704j0 = false;
        abstractComponentCallbacksC0635c.mo2075B();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onDestroy()"));
        }
        this.f5766a.m3862u(abstractComponentCallbacksC0635c, false);
        for (C0639g c0639g : ny8Var.m17704x()) {
            if (c0639g != null) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = c0639g.f5768c;
                if (abstractComponentCallbacksC0635c.f5693e.equals(abstractComponentCallbacksC0635c2.f5699h)) {
                    abstractComponentCallbacksC0635c2.f5697g = abstractComponentCallbacksC0635c;
                    abstractComponentCallbacksC0635c2.f5699h = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0635c.f5699h;
        if (str2 != null) {
            abstractComponentCallbacksC0635c.f5697g = ny8Var.m17701u(str2);
        }
        ny8Var.m17679F(this);
    }

    /* JADX INFO: renamed from: h */
    public final void m2199h() {
        View view;
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0635c);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0635c.f5690c0;
        if (viewGroup != null && (view = abstractComponentCallbacksC0635c.f5692d0) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC0635c.f5676R.m2186u(1);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            lg3 lg3Var = abstractComponentCallbacksC0635c.f5710n0;
            lg3Var.m16179b();
            if (lg3Var.f49626e.f66586d.isAtLeast(Lifecycle$State.CREATED)) {
                abstractComponentCallbacksC0635c.f5710n0.m16178a(Lifecycle$Event.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC0635c.f5685a = 1;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2076C();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onDestroyView()"));
        }
        cua cuaVarMo2116r = abstractComponentCallbacksC0635c.mo2116r();
        cuaVarMo2116r.getClass();
        or1 or1Var = or1.f54780b;
        or1Var.getClass();
        ny8 ny8Var = new ny8(cuaVarMo2116r, kh5.f47296d, or1Var);
        z21 z21VarM24933a = y38.m24933a(kh5.class);
        String strM25413b = z21VarM24933a.m25413b();
        if (strM25413b == null) {
            C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
            return;
        }
        pe9 pe9Var = ((kh5) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b))).f47297b;
        int iM19081e = pe9Var.m19081e();
        for (int i = 0; i < iM19081e; i++) {
            ((ih5) pe9Var.m19082f(i)).m13913l();
        }
        abstractComponentCallbacksC0635c.f5672N = false;
        this.f5766a.m3825E(abstractComponentCallbacksC0635c, false);
        abstractComponentCallbacksC0635c.f5690c0 = null;
        abstractComponentCallbacksC0635c.f5692d0 = null;
        abstractComponentCallbacksC0635c.f5710n0 = null;
        abstractComponentCallbacksC0635c.f5711o0.m23765i(null);
        abstractComponentCallbacksC0635c.f5669K = false;
    }

    /* JADX INFO: renamed from: i */
    public final void m2200i() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.f5685a = -1;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2077D();
        abstractComponentCallbacksC0635c.f5702i0 = null;
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onDetach()"));
        }
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        if (!le3Var.f5733K) {
            le3Var.m2175l();
            abstractComponentCallbacksC0635c.f5676R = new le3();
        }
        this.f5766a.m3863v(abstractComponentCallbacksC0635c, false);
        abstractComponentCallbacksC0635c.f5685a = -1;
        abstractComponentCallbacksC0635c.f5675Q = null;
        abstractComponentCallbacksC0635c.f5677S = null;
        abstractComponentCallbacksC0635c.f5674P = null;
        if (!abstractComponentCallbacksC0635c.f5707l || abstractComponentCallbacksC0635c.m2119u()) {
            ne3 ne3Var = (ne3) this.f5767b.f53417e;
            if (!((ne3Var.f52636b.containsKey(abstractComponentCallbacksC0635c.f5693e) && ne3Var.f52639e) ? ne3Var.f52640f : true)) {
                return;
            }
        }
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.m2114p();
    }

    /* JADX INFO: renamed from: j */
    public final void m2201j() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (abstractComponentCallbacksC0635c.f5668J && abstractComponentCallbacksC0635c.f5669K && !abstractComponentCallbacksC0635c.f5672N) {
            if (AbstractC0638f.m2128L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0635c);
            }
            Bundle bundle = abstractComponentCallbacksC0635c.f5687b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterMo2078E = abstractComponentCallbacksC0635c.mo2078E(bundle2);
            abstractComponentCallbacksC0635c.f5702i0 = layoutInflaterMo2078E;
            abstractComponentCallbacksC0635c.mo2087O(layoutInflaterMo2078E, null, bundle2);
            View view = abstractComponentCallbacksC0635c.f5692d0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC0635c.f5692d0.setTag(R$id.fragment_container_view_tag, abstractComponentCallbacksC0635c);
                if (abstractComponentCallbacksC0635c.f5681W) {
                    abstractComponentCallbacksC0635c.f5692d0.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC0635c.f5687b;
                if (bundle3 != null) {
                    bundle3.getBundle("savedInstanceState");
                }
                abstractComponentCallbacksC0635c.mo2085M(abstractComponentCallbacksC0635c.f5692d0);
                abstractComponentCallbacksC0635c.f5676R.m2186u(2);
                this.f5766a.m3824D(abstractComponentCallbacksC0635c, abstractComponentCallbacksC0635c.f5692d0, bundle2, false);
                abstractComponentCallbacksC0635c.f5685a = 2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2202k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.f5769d;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (z) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0635c);
                return;
            }
            return;
        }
        try {
            this.f5769d = true;
            boolean z2 = false;
            while (true) {
                int iM2195d = m2195d();
                int i = abstractComponentCallbacksC0635c.f5685a;
                ny8 ny8Var = this.f5767b;
                if (iM2195d == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0635c.f5707l && !abstractComponentCallbacksC0635c.m2119u() && !abstractComponentCallbacksC0635c.f5667I) {
                        if (AbstractC0638f.m2128L(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0635c);
                        }
                        ((ne3) ny8Var.f53417e).m17399W2(abstractComponentCallbacksC0635c, true);
                        ny8Var.m17679F(this);
                        if (AbstractC0638f.m2128L(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0635c);
                        }
                        abstractComponentCallbacksC0635c.m2114p();
                    }
                    if (abstractComponentCallbacksC0635c.f5700h0) {
                        if (abstractComponentCallbacksC0635c.f5692d0 != null && (viewGroup = abstractComponentCallbacksC0635c.f5690c0) != null) {
                            p82 p82VarM18951i = p82.m18951i(viewGroup, abstractComponentCallbacksC0635c.m2109k());
                            if (abstractComponentCallbacksC0635c.f5681W) {
                                if (AbstractC0638f.m2128L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + abstractComponentCallbacksC0635c);
                                }
                                p82VarM18951i.m18956d(SpecialEffectsController$Operation$State.GONE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            } else {
                                if (AbstractC0638f.m2128L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + abstractComponentCallbacksC0635c);
                                }
                                p82VarM18951i.m18956d(SpecialEffectsController$Operation$State.VISIBLE, SpecialEffectsController$Operation$LifecycleImpact.NONE, this);
                            }
                        }
                        AbstractC0638f abstractC0638f = abstractComponentCallbacksC0635c.f5674P;
                        if (abstractC0638f != null && abstractComponentCallbacksC0635c.f5705k && AbstractC0638f.m2129M(abstractComponentCallbacksC0635c)) {
                            abstractC0638f.f5730H = true;
                        }
                        abstractComponentCallbacksC0635c.f5700h0 = false;
                        abstractComponentCallbacksC0635c.f5676R.m2180o();
                    }
                    return;
                }
                if (iM2195d <= i) {
                    switch (i - 1) {
                        case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                            m2200i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC0635c.f5667I) {
                                if (((Bundle) ((HashMap) ny8Var.f53416d).get(abstractComponentCallbacksC0635c.f5693e)) == null) {
                                    ny8Var.m17686N(abstractComponentCallbacksC0635c.f5693e, m2206o());
                                }
                            }
                            m2198g();
                            break;
                        case 1:
                            m2199h();
                            abstractComponentCallbacksC0635c.f5685a = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC0635c.f5669K = false;
                            abstractComponentCallbacksC0635c.f5685a = 2;
                            break;
                        case 3:
                            if (AbstractC0638f.m2128L(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0635c);
                            }
                            if (abstractComponentCallbacksC0635c.f5667I) {
                                ny8Var.m17686N(abstractComponentCallbacksC0635c.f5693e, m2206o());
                            } else if (abstractComponentCallbacksC0635c.f5692d0 != null && abstractComponentCallbacksC0635c.f5689c == null) {
                                m2207p();
                            }
                            if (abstractComponentCallbacksC0635c.f5692d0 != null && (viewGroup2 = abstractComponentCallbacksC0635c.f5690c0) != null) {
                                p82 p82VarM18951i2 = p82.m18951i(viewGroup2, abstractComponentCallbacksC0635c.m2109k());
                                if (AbstractC0638f.m2128L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + abstractComponentCallbacksC0635c);
                                }
                                p82VarM18951i2.m18956d(SpecialEffectsController$Operation$State.REMOVED, SpecialEffectsController$Operation$LifecycleImpact.REMOVING, this);
                            }
                            abstractComponentCallbacksC0635c.f5685a = 3;
                            break;
                        case 4:
                            m2209r();
                            break;
                        case 5:
                            abstractComponentCallbacksC0635c.f5685a = 5;
                            break;
                        case 6:
                            m2203l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m2194c();
                            break;
                        case 1:
                            m2196e();
                            break;
                        case 2:
                            m2201j();
                            m2197f();
                            break;
                        case 3:
                            m2192a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC0635c.f5692d0 != null && (viewGroup3 = abstractComponentCallbacksC0635c.f5690c0) != null) {
                                p82 p82VarM18951i3 = p82.m18951i(viewGroup3, abstractComponentCallbacksC0635c.m2109k());
                                SpecialEffectsController$Operation$State specialEffectsController$Operation$StateFrom = SpecialEffectsController$Operation$State.from(abstractComponentCallbacksC0635c.f5692d0.getVisibility());
                                specialEffectsController$Operation$StateFrom.getClass();
                                if (AbstractC0638f.m2128L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + abstractComponentCallbacksC0635c);
                                }
                                p82VarM18951i3.m18956d(specialEffectsController$Operation$StateFrom, SpecialEffectsController$Operation$LifecycleImpact.ADDING, this);
                            }
                            abstractComponentCallbacksC0635c.f5685a = 4;
                            break;
                        case 5:
                            m2208q();
                            break;
                        case 6:
                            abstractComponentCallbacksC0635c.f5685a = 6;
                            break;
                        case 7:
                            m2205n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.f5769d = false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2203l() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.f5676R.m2186u(5);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            abstractComponentCallbacksC0635c.f5710n0.m16178a(Lifecycle$Event.ON_PAUSE);
        }
        abstractComponentCallbacksC0635c.f5709m0.m23833G(Lifecycle$Event.ON_PAUSE);
        abstractComponentCallbacksC0635c.f5685a = 6;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2080G();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onPause()"));
        }
        this.f5766a.m3864w(abstractComponentCallbacksC0635c, false);
    }

    /* JADX INFO: renamed from: m */
    public final void m2204m(ClassLoader classLoader) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        Bundle bundle = abstractComponentCallbacksC0635c.f5687b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0635c.f5687b.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0635c.f5687b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0635c.f5689c = abstractComponentCallbacksC0635c.f5687b.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0635c.f5691d = abstractComponentCallbacksC0635c.f5687b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) abstractComponentCallbacksC0635c.f5687b.getParcelable("state");
            if (fragmentState != null) {
                abstractComponentCallbacksC0635c.f5699h = fragmentState.f5639H;
                abstractComponentCallbacksC0635c.f5701i = fragmentState.f5640I;
                abstractComponentCallbacksC0635c.f5696f0 = fragmentState.f5641J;
            }
            if (abstractComponentCallbacksC0635c.f5696f0) {
                return;
            }
            abstractComponentCallbacksC0635c.f5694e0 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0635c, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX INFO: renamed from: n */
    public final void m2205n() {
        boolean zRequestFocus;
        String str;
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0635c);
        }
        ed3 ed3Var = abstractComponentCallbacksC0635c.f5698g0;
        View view = ed3Var == null ? null : ed3Var.f37053m;
        if (view != null) {
            if (view == abstractComponentCallbacksC0635c.f5692d0) {
                zRequestFocus = view.requestFocus();
                if (AbstractC0638f.m2128L(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(abstractComponentCallbacksC0635c);
                    sb.append(" resulting in focused view ");
                    sb.append(abstractComponentCallbacksC0635c.f5692d0.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC0635c.f5692d0) {
                            zRequestFocus = view.requestFocus();
                            if (AbstractC0638f.m2128L(2)) {
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
                                sb2.append(abstractComponentCallbacksC0635c);
                                sb2.append(" resulting in focused view ");
                                sb2.append(abstractComponentCallbacksC0635c.f5692d0.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC0635c.m2104f().f37053m = null;
        abstractComponentCallbacksC0635c.f5676R.m2146S();
        abstractComponentCallbacksC0635c.f5676R.m2191z(true);
        abstractComponentCallbacksC0635c.f5685a = 7;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2081H();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onResume()"));
        }
        wb5 wb5Var = abstractComponentCallbacksC0635c.f5709m0;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_RESUME;
        wb5Var.m23833G(lifecycle$Event);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            abstractComponentCallbacksC0635c.f5710n0.f49626e.m23833G(lifecycle$Event);
        }
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(7);
        this.f5766a.m3867z(abstractComponentCallbacksC0635c, false);
        this.f5767b.m17686N(abstractComponentCallbacksC0635c.f5693e, null);
        abstractComponentCallbacksC0635c.f5687b = null;
        abstractComponentCallbacksC0635c.f5689c = null;
        abstractComponentCallbacksC0635c.f5691d = null;
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m2206o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (abstractComponentCallbacksC0635c.f5685a == -1 && (bundle = abstractComponentCallbacksC0635c.f5687b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(abstractComponentCallbacksC0635c));
        if (abstractComponentCallbacksC0635c.f5685a > 0) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC0635c.mo2082I(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f5766a.m3821A(abstractComponentCallbacksC0635c, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC0635c.f5713q0.m12092G(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM2159c0 = abstractComponentCallbacksC0635c.f5676R.m2159c0();
            if (!bundleM2159c0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM2159c0);
            }
            if (abstractComponentCallbacksC0635c.f5692d0 != null) {
                m2207p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0635c.f5689c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC0635c.f5691d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC0635c.f5695f;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: p */
    public final void m2207p() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (abstractComponentCallbacksC0635c.f5692d0 == null) {
            return;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + abstractComponentCallbacksC0635c + " with view " + abstractComponentCallbacksC0635c.f5692d0);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC0635c.f5692d0.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC0635c.f5689c = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC0635c.f5710n0.f49627f.m12092G(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC0635c.f5691d = bundle;
    }

    /* JADX INFO: renamed from: q */
    public final void m2208q() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0635c);
        }
        abstractComponentCallbacksC0635c.f5676R.m2146S();
        abstractComponentCallbacksC0635c.f5676R.m2191z(true);
        abstractComponentCallbacksC0635c.f5685a = 5;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2083J();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onStart()"));
        }
        wb5 wb5Var = abstractComponentCallbacksC0635c.f5709m0;
        Lifecycle$Event lifecycle$Event = Lifecycle$Event.ON_START;
        wb5Var.m23833G(lifecycle$Event);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            abstractComponentCallbacksC0635c.f5710n0.f49626e.m23833G(lifecycle$Event);
        }
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(5);
        this.f5766a.m3822B(abstractComponentCallbacksC0635c, false);
    }

    /* JADX INFO: renamed from: r */
    public final void m2209r() {
        boolean zM2128L = AbstractC0638f.m2128L(3);
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5768c;
        if (zM2128L) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0635c);
        }
        le3 le3Var = abstractComponentCallbacksC0635c.f5676R;
        le3Var.f5732J = true;
        le3Var.f5738P.f52641g = true;
        le3Var.m2186u(4);
        if (abstractComponentCallbacksC0635c.f5692d0 != null) {
            abstractComponentCallbacksC0635c.f5710n0.m16178a(Lifecycle$Event.ON_STOP);
        }
        abstractComponentCallbacksC0635c.f5709m0.m23833G(Lifecycle$Event.ON_STOP);
        abstractComponentCallbacksC0635c.f5685a = 4;
        abstractComponentCallbacksC0635c.f5688b0 = false;
        abstractComponentCallbacksC0635c.mo2084L();
        if (!abstractComponentCallbacksC0635c.f5688b0) {
            throw new SuperNotCalledException(wq1.m24117m("Fragment ", abstractComponentCallbacksC0635c, " did not call through to super.onStop()"));
        }
        this.f5766a.m3823C(abstractComponentCallbacksC0635c, false);
    }

    public C0639g(bl2 bl2Var, ny8 ny8Var, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f5766a = bl2Var;
        this.f5767b = ny8Var;
        this.f5768c = abstractComponentCallbacksC0635c;
    }

    public C0639g(bl2 bl2Var, ny8 ny8Var, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Bundle bundle) {
        this.f5766a = bl2Var;
        this.f5767b = ny8Var;
        this.f5768c = abstractComponentCallbacksC0635c;
        abstractComponentCallbacksC0635c.f5689c = null;
        abstractComponentCallbacksC0635c.f5691d = null;
        abstractComponentCallbacksC0635c.f5673O = 0;
        abstractComponentCallbacksC0635c.f5669K = false;
        abstractComponentCallbacksC0635c.f5705k = false;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c2 = abstractComponentCallbacksC0635c.f5697g;
        abstractComponentCallbacksC0635c.f5699h = abstractComponentCallbacksC0635c2 != null ? abstractComponentCallbacksC0635c2.f5693e : null;
        abstractComponentCallbacksC0635c.f5697g = null;
        abstractComponentCallbacksC0635c.f5687b = bundle;
        abstractComponentCallbacksC0635c.f5695f = bundle.getBundle("arguments");
    }
}
