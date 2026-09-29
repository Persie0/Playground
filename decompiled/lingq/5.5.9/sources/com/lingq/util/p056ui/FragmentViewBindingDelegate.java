package com.lingq.util.p056ui;

import android.view.View;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.InterfaceC1029e;
import androidx.view.InterfaceC1051q;
import androidx.view.InterfaceC1057w;
import androidx.view.Lifecycle;
import cm.InterfaceC2052l;
import dm.C5207g;
import dm.InterfaceC5204d;
import km.InterfaceC6727j;
import p473x4.InterfaceC10075a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FragmentViewBindingDelegate<T extends InterfaceC10075a> {

    /* JADX INFO: renamed from: a */
    public final Fragment f32107a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<View, T> f32108b;

    /* JADX INFO: renamed from: c */
    public T f32109c;

    /* JADX INFO: renamed from: com.lingq.util.ui.FragmentViewBindingDelegate$a */
    public static final class C4928a implements InterfaceC1057w, InterfaceC5204d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2052l f32113a;

        public C4928a(InterfaceC2052l interfaceC2052l) {
            this.f32113a = interfaceC2052l;
        }

        @Override // dm.InterfaceC5204d
        /* JADX INFO: renamed from: a */
        public final InterfaceC2052l mo10490a() {
            return this.f32113a;
        }

        @Override // androidx.view.InterfaceC1057w
        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void mo3773b(Object obj) {
            this.f32113a.mo528n(obj);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof InterfaceC1057w) || !(obj instanceof InterfaceC5204d)) {
                return false;
            }
            return C5207g.m11106a(this.f32113a, ((InterfaceC5204d) obj).mo10490a());
        }

        public final int hashCode() {
            return this.f32113a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentViewBindingDelegate(Fragment fragment, InterfaceC2052l<? super View, ? extends T> interfaceC2052l) {
        C5207g.m11111f(fragment, "fragment");
        C5207g.m11111f(interfaceC2052l, "viewBindingFactory");
        this.f32107a = fragment;
        this.f32108b = interfaceC2052l;
        fragment.f6112l0.mo3883a(new InterfaceC1029e(this) { // from class: com.lingq.util.ui.FragmentViewBindingDelegate.1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ FragmentViewBindingDelegate<T> f32110a;

            {
                this.f32110a = this;
            }

            @Override // androidx.view.InterfaceC1029e
            /* JADX INFO: renamed from: c */
            public final void mo3933c(InterfaceC1051q interfaceC1051q) {
                final FragmentViewBindingDelegate<T> fragmentViewBindingDelegate = this.f32110a;
                Fragment fragment2 = fragmentViewBindingDelegate.f32107a;
                fragment2.f6114n0.m3895d(fragment2, new C4928a(new InterfaceC2052l<InterfaceC1051q, C9072e>() { // from class: com.lingq.util.ui.FragmentViewBindingDelegate$1$onCreate$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(InterfaceC1051q interfaceC1051q2) {
                        C1052r c1052rMo786G = interfaceC1051q2.mo786G();
                        final FragmentViewBindingDelegate<T> fragmentViewBindingDelegate2 = fragmentViewBindingDelegate;
                        c1052rMo786G.mo3883a(new InterfaceC1029e() { // from class: com.lingq.util.ui.FragmentViewBindingDelegate$1$onCreate$1.1
                            @Override // androidx.view.InterfaceC1029e
                            public final void onDestroy(InterfaceC1051q interfaceC1051q3) {
                                fragmentViewBindingDelegate2.f32109c = null;
                            }
                        });
                        return C9072e.f47360a;
                    }
                }));
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final T m10489a(Fragment fragment, InterfaceC6727j<?> interfaceC6727j) {
        C5207g.m11111f(fragment, "thisRef");
        C5207g.m11111f(interfaceC6727j, "property");
        T t10 = this.f32109c;
        if (t10 != null) {
            return t10;
        }
        C0980t0 c0980t0M3601v = this.f32107a.m3601v();
        c0980t0M3601v.m3813c();
        if (!c0980t0M3601v.f6415d.f6681d.isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        T tMo528n = this.f32108b.mo528n(fragment.m3580c0());
        this.f32109c = tMo528n;
        return tMo528n;
    }
}
