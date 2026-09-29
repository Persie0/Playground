package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.view.C1052r;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Metadata;
import sl.C9072e;
import tl.C9320h;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a */
    public final Runnable f460a;

    /* JADX INFO: renamed from: b */
    public final C9320h<AbstractC0195n> f461b = new C9320h<>();

    /* JADX INFO: renamed from: c */
    public final InterfaceC2041a<C9072e> f462c;

    /* JADX INFO: renamed from: d */
    public final OnBackInvokedCallback f463d;

    /* JADX INFO: renamed from: e */
    public OnBackInvokedDispatcher f464e;

    /* JADX INFO: renamed from: f */
    public boolean f465f;

    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Landroidx/activity/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;", "Landroidx/lifecycle/o;", "Landroidx/activity/a;", "activity_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public final class LifecycleOnBackPressedCancellable implements InterfaceC1049o, InterfaceC0182a {

        /* JADX INFO: renamed from: a */
        public final Lifecycle f468a;

        /* JADX INFO: renamed from: b */
        public final AbstractC0195n f469b;

        /* JADX INFO: renamed from: c */
        public C0181b f470c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ OnBackPressedDispatcher f471d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, AbstractC0195n abstractC0195n) {
            C5207g.m11111f(abstractC0195n, "onBackPressedCallback");
            this.f471d = onBackPressedDispatcher;
            this.f468a = lifecycle;
            this.f469b = abstractC0195n;
            lifecycle.mo3883a(this);
        }

        @Override // androidx.activity.InterfaceC0182a
        public final void cancel() {
            this.f468a.mo3885c(this);
            AbstractC0195n abstractC0195n = this.f469b;
            abstractC0195n.getClass();
            abstractC0195n.f501b.remove(this);
            C0181b c0181b = this.f470c;
            if (c0181b != null) {
                c0181b.cancel();
            }
            this.f470c = null;
        }

        @Override // androidx.view.InterfaceC1049o
        /* JADX INFO: renamed from: e */
        public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_START) {
                if (event == Lifecycle.Event.ON_STOP) {
                    C0181b c0181b = this.f470c;
                    if (c0181b != null) {
                        c0181b.cancel();
                        return;
                    }
                } else if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
                return;
            }
            OnBackPressedDispatcher onBackPressedDispatcher = this.f471d;
            onBackPressedDispatcher.getClass();
            AbstractC0195n abstractC0195n = this.f469b;
            C5207g.m11111f(abstractC0195n, "onBackPressedCallback");
            onBackPressedDispatcher.f461b.m17668t(abstractC0195n);
            C0181b c0181b2 = onBackPressedDispatcher.new C0181b(abstractC0195n);
            abstractC0195n.f501b.add(c0181b2);
            if (Build.VERSION.SDK_INT >= 33) {
                onBackPressedDispatcher.m806c();
                abstractC0195n.f502c = onBackPressedDispatcher.f462c;
            }
            this.f470c = c0181b2;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public static final class C0180a {

        /* JADX INFO: renamed from: a */
        public static final C0180a f472a = new C0180a();

        /* JADX INFO: renamed from: a */
        public final OnBackInvokedCallback m808a(InterfaceC2041a<C9072e> interfaceC2041a) {
            C5207g.m11111f(interfaceC2041a, "onBackInvoked");
            return new C0199r(0, interfaceC2041a);
        }

        /* JADX INFO: renamed from: b */
        public final void m809b(Object obj, int i10, Object obj2) {
            C5207g.m11111f(obj, "dispatcher");
            C5207g.m11111f(obj2, "callback");
            C0196o.m827d(obj).registerOnBackInvokedCallback(i10, C0197p.m836e(obj2));
        }

        /* JADX INFO: renamed from: c */
        public final void m810c(Object obj, Object obj2) {
            C5207g.m11111f(obj, "dispatcher");
            C5207g.m11111f(obj2, "callback");
            C0196o.m827d(obj).unregisterOnBackInvokedCallback(C0197p.m836e(obj2));
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$b */
    public final class C0181b implements InterfaceC0182a {

        /* JADX INFO: renamed from: a */
        public final AbstractC0195n f473a;

        public C0181b(AbstractC0195n abstractC0195n) {
            this.f473a = abstractC0195n;
        }

        @Override // androidx.activity.InterfaceC0182a
        public final void cancel() {
            OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
            C9320h<AbstractC0195n> c9320h = onBackPressedDispatcher.f461b;
            AbstractC0195n abstractC0195n = this.f473a;
            c9320h.remove(abstractC0195n);
            abstractC0195n.getClass();
            abstractC0195n.f501b.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                abstractC0195n.f502c = null;
                onBackPressedDispatcher.m806c();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f460a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f462c = new InterfaceC2041a<C9072e>() { // from class: androidx.activity.OnBackPressedDispatcher.1
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    OnBackPressedDispatcher.this.m806c();
                    return C9072e.f47360a;
                }
            };
            this.f463d = C0180a.f472a.m808a(new InterfaceC2041a<C9072e>() { // from class: androidx.activity.OnBackPressedDispatcher.2
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final C9072e mo807E() {
                    OnBackPressedDispatcher.this.m805b();
                    return C9072e.f47360a;
                }
            });
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m804a(InterfaceC1051q interfaceC1051q, AbstractC0195n abstractC0195n) {
        C5207g.m11111f(interfaceC1051q, "owner");
        C5207g.m11111f(abstractC0195n, "onBackPressedCallback");
        C1052r c1052rMo786G = interfaceC1051q.mo786G();
        if (c1052rMo786G.f6681d == Lifecycle.State.DESTROYED) {
            return;
        }
        abstractC0195n.f501b.add(new LifecycleOnBackPressedCancellable(this, c1052rMo786G, abstractC0195n));
        if (Build.VERSION.SDK_INT >= 33) {
            m806c();
            abstractC0195n.f502c = this.f462c;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m805b() {
        AbstractC0195n abstractC0195nPrevious;
        C9320h<AbstractC0195n> c9320h = this.f461b;
        ListIterator<AbstractC0195n> listIterator = c9320h.listIterator(c9320h.size());
        do {
            if (!listIterator.hasPrevious()) {
                abstractC0195nPrevious = null;
                break;
            }
            abstractC0195nPrevious = listIterator.previous();
        } while (!abstractC0195nPrevious.f500a);
        AbstractC0195n abstractC0195n = abstractC0195nPrevious;
        if (abstractC0195n != null) {
            abstractC0195n.mo823a();
            return;
        }
        Runnable runnable = this.f460a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m806c() {
        boolean z10;
        OnBackInvokedCallback onBackInvokedCallback;
        C9320h<AbstractC0195n> c9320h = this.f461b;
        if (!(c9320h instanceof Collection) || !c9320h.isEmpty()) {
            Iterator<AbstractC0195n> it = c9320h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (it.next().f500a) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f464e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f463d) == null) {
            return;
        }
        C0180a c0180a = C0180a.f472a;
        if (z10 && !this.f465f) {
            c0180a.m809b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f465f = true;
        } else {
            if (z10 || !this.f465f) {
                return;
            }
            c0180a.m810c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f465f = false;
        }
    }
}
