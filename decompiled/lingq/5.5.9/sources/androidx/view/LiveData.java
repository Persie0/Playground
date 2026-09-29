package androidx.view;

import android.os.Looper;
import android.support.v4.media.C0141b;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;
import java.util.Map;
import p208k.C6560c;
import p229l.C7203b;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: k */
    public static final Object f6531k = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f6532a = new Object();

    /* JADX INFO: renamed from: b */
    public final C7203b<InterfaceC1057w<? super T>, LiveData<T>.AbstractC1012c> f6533b = new C7203b<>();

    /* JADX INFO: renamed from: c */
    public int f6534c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f6535d;

    /* JADX INFO: renamed from: e */
    public volatile Object f6536e;

    /* JADX INFO: renamed from: f */
    public volatile Object f6537f;

    /* JADX INFO: renamed from: g */
    public int f6538g;

    /* JADX INFO: renamed from: h */
    public boolean f6539h;

    /* JADX INFO: renamed from: i */
    public boolean f6540i;

    /* JADX INFO: renamed from: j */
    public final RunnableC1010a f6541j;

    public class LifecycleBoundObserver extends LiveData<T>.AbstractC1012c implements InterfaceC1049o {

        /* JADX INFO: renamed from: e */
        public final InterfaceC1051q f6542e;

        public LifecycleBoundObserver(InterfaceC1051q interfaceC1051q, InterfaceC1057w<? super T> interfaceC1057w) {
            super(interfaceC1057w);
            this.f6542e = interfaceC1051q;
        }

        @Override // androidx.view.LiveData.AbstractC1012c
        /* JADX INFO: renamed from: d */
        public final void mo3901d() {
            this.f6542e.mo786G().mo3885c(this);
        }

        @Override // androidx.view.InterfaceC1049o
        /* JADX INFO: renamed from: e */
        public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
            InterfaceC1051q interfaceC1051q2 = this.f6542e;
            Lifecycle.State state = interfaceC1051q2.mo786G().f6681d;
            if (state == Lifecycle.State.DESTROYED) {
                LiveData.this.mo3899h(this.f6545a);
                return;
            }
            Lifecycle.State state2 = null;
            while (state2 != state) {
                m3904a(mo3903g());
                state2 = state;
                state = interfaceC1051q2.mo786G().f6681d;
            }
        }

        @Override // androidx.view.LiveData.AbstractC1012c
        /* JADX INFO: renamed from: f */
        public final boolean mo3902f(InterfaceC1051q interfaceC1051q) {
            return this.f6542e == interfaceC1051q;
        }

        @Override // androidx.view.LiveData.AbstractC1012c
        /* JADX INFO: renamed from: g */
        public final boolean mo3903g() {
            return this.f6542e.mo786G().f6681d.isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$a */
    public class RunnableC1010a implements Runnable {
        public RunnableC1010a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.f6532a) {
                try {
                    obj = LiveData.this.f6537f;
                    LiveData.this.f6537f = LiveData.f6531k;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            LiveData.this.mo3900i(obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$b */
    public class C1011b extends LiveData<T>.AbstractC1012c {
        public C1011b(LiveData liveData, DialogInterfaceOnCancelListenerC0962l.d dVar) {
            super(dVar);
        }

        @Override // androidx.view.LiveData.AbstractC1012c
        /* JADX INFO: renamed from: g */
        public final boolean mo3903g() {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$c */
    public abstract class AbstractC1012c {

        /* JADX INFO: renamed from: a */
        public final InterfaceC1057w<? super T> f6545a;

        /* JADX INFO: renamed from: b */
        public boolean f6546b;

        /* JADX INFO: renamed from: c */
        public int f6547c = -1;

        public AbstractC1012c(InterfaceC1057w<? super T> interfaceC1057w) {
            this.f6545a = interfaceC1057w;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final void m3904a(boolean z10) {
            if (z10 == this.f6546b) {
                return;
            }
            this.f6546b = z10;
            int i10 = z10 ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i11 = liveData.f6534c;
            liveData.f6534c = i10 + i11;
            if (!liveData.f6535d) {
                liveData.f6535d = true;
                while (true) {
                    try {
                        int i12 = liveData.f6534c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            liveData.mo3897f();
                        } else if (z12) {
                            liveData.mo3898g();
                        }
                        i11 = i12;
                    } catch (Throwable th2) {
                        liveData.f6535d = false;
                        throw th2;
                    }
                }
                liveData.f6535d = false;
            }
            if (this.f6546b) {
                liveData.m3894c(this);
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo3901d() {
        }

        /* JADX INFO: renamed from: f */
        public boolean mo3902f(InterfaceC1051q interfaceC1051q) {
            return false;
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo3903g();
    }

    public LiveData() {
        Object obj = f6531k;
        this.f6537f = obj;
        this.f6541j = new RunnableC1010a();
        this.f6536e = obj;
        this.f6538g = -1;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static void m3892a(String str) {
        C6560c.m13159k0().f37356a.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(C0141b.m611g("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3893b(LiveData<T>.AbstractC1012c abstractC1012c) {
        if (abstractC1012c.f6546b) {
            if (!abstractC1012c.mo3903g()) {
                abstractC1012c.m3904a(false);
                return;
            }
            int i10 = abstractC1012c.f6547c;
            int i11 = this.f6538g;
            if (i10 >= i11) {
                return;
            }
            abstractC1012c.f6547c = i11;
            abstractC1012c.f6545a.mo3773b((Object) this.f6536e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3894c(LiveData<T>.AbstractC1012c abstractC1012c) {
        if (this.f6539h) {
            this.f6540i = true;
            return;
        }
        this.f6539h = true;
        do {
            this.f6540i = false;
            if (abstractC1012c != null) {
                m3893b(abstractC1012c);
                abstractC1012c = null;
            } else {
                C7203b<InterfaceC1057w<? super T>, LiveData<T>.AbstractC1012c> c7203b = this.f6533b;
                c7203b.getClass();
                C7203b.d dVar = new C7203b.d();
                c7203b.f40533c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    m3893b((AbstractC1012c) ((Map.Entry) dVar.next()).getValue());
                    if (this.f6540i) {
                        break;
                    }
                }
            }
        } while (this.f6540i);
        this.f6539h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m3895d(InterfaceC1051q interfaceC1051q, InterfaceC1057w<? super T> interfaceC1057w) {
        m3892a("observe");
        if (interfaceC1051q.mo786G().f6681d == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC1051q, interfaceC1057w);
        LiveData<T>.AbstractC1012c abstractC1012cMo14516f = this.f6533b.mo14516f(interfaceC1057w, lifecycleBoundObserver);
        if (abstractC1012cMo14516f != null && !abstractC1012cMo14516f.mo3902f(interfaceC1051q)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1012cMo14516f != null) {
            return;
        }
        interfaceC1051q.mo786G().mo3883a(lifecycleBoundObserver);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m3896e(DialogInterfaceOnCancelListenerC0962l.d dVar) {
        m3892a("observeForever");
        C1011b c1011b = new C1011b(this, dVar);
        LiveData<T>.AbstractC1012c abstractC1012cMo14516f = this.f6533b.mo14516f(dVar, c1011b);
        if (abstractC1012cMo14516f instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (abstractC1012cMo14516f != null) {
            return;
        }
        c1011b.m3904a(true);
    }

    /* JADX INFO: renamed from: f */
    public void mo3897f() {
    }

    /* JADX INFO: renamed from: g */
    public void mo3898g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo3899h(InterfaceC1057w<? super T> interfaceC1057w) {
        m3892a("removeObserver");
        LiveData<T>.AbstractC1012c abstractC1012cMo14517g = this.f6533b.mo14517g(interfaceC1057w);
        if (abstractC1012cMo14517g == null) {
            return;
        }
        abstractC1012cMo14517g.mo3901d();
        abstractC1012cMo14517g.m3904a(false);
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo3900i(T t10);
}
