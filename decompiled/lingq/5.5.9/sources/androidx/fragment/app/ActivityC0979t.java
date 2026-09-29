package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0209s;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.InterfaceC0208g;
import androidx.p544savedstate.C1189a;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p020b.InterfaceC1275b;
import p232l2.C7222a;
import p232l2.InterfaceC7240s;
import p232l2.InterfaceC7241t;
import p254m2.InterfaceC7473b;
import p254m2.InterfaceC7474c;
import p270n4.InterfaceC7706c;
import p389t2.C9182a;
import p446w2.InterfaceC9803a;
import p447w3.AbstractC9808a;
import p471x2.InterfaceC10042i;

/* JADX INFO: renamed from: androidx.fragment.app.t */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0979t extends ComponentActivity implements C7222a.c {

    /* JADX INFO: renamed from: P */
    public boolean f6408P;

    /* JADX INFO: renamed from: Q */
    public boolean f6409Q;

    /* JADX INFO: renamed from: N */
    public final C0983v f6406N = new C0983v(new a());

    /* JADX INFO: renamed from: O */
    public final C1052r f6407O = new C1052r(this);

    /* JADX INFO: renamed from: R */
    public boolean f6410R = true;

    /* JADX INFO: renamed from: androidx.fragment.app.t$a */
    public class a extends AbstractC0986x<ActivityC0979t> implements InterfaceC7473b, InterfaceC7474c, InterfaceC7240s, InterfaceC7241t, InterfaceC1048n0, InterfaceC0209s, InterfaceC0208g, InterfaceC7706c, InterfaceC0953g0, InterfaceC10042i {
        public a() {
            super(ActivityC0979t.this);
        }

        @Override // p471x2.InterfaceC10042i
        /* JADX INFO: renamed from: A */
        public final void mo783A(FragmentManager.C0918c c0918c) {
            ActivityC0979t.this.mo783A(c0918c);
        }

        @Override // p232l2.InterfaceC7240s
        /* JADX INFO: renamed from: B */
        public final void mo784B(C0945c0 c0945c0) {
            ActivityC0979t.this.mo784B(c0945c0);
        }

        @Override // p254m2.InterfaceC7473b
        /* JADX INFO: renamed from: E */
        public final void mo785E(InterfaceC9803a<Configuration> interfaceC9803a) {
            ActivityC0979t.this.mo785E(interfaceC9803a);
        }

        @Override // androidx.view.InterfaceC1051q
        /* JADX INFO: renamed from: G */
        public final C1052r mo786G() {
            return ActivityC0979t.this.f6407O;
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: V */
        public final View mo584V(int i10) {
            return ActivityC0979t.this.findViewById(i10);
        }

        @Override // android.support.v4.media.AbstractC0140a
        /* JADX INFO: renamed from: Z */
        public final boolean mo588Z() {
            Window window = ActivityC0979t.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.InterfaceC0209s
        /* JADX INFO: renamed from: b */
        public final OnBackPressedDispatcher mo788b() {
            return ActivityC0979t.this.f444h;
        }

        @Override // androidx.fragment.app.InterfaceC0953g0
        /* JADX INFO: renamed from: c */
        public final void mo3675c(FragmentManager fragmentManager, Fragment fragment) {
            ActivityC0979t.this.getClass();
        }

        @Override // p232l2.InterfaceC7241t
        /* JADX INFO: renamed from: e */
        public final void mo789e(C0972q c0972q) {
            ActivityC0979t.this.mo789e(c0972q);
        }

        @Override // p254m2.InterfaceC7474c
        /* JADX INFO: renamed from: f */
        public final void mo790f(C0943b0 c0943b0) {
            ActivityC0979t.this.mo790f(c0943b0);
        }

        @Override // p232l2.InterfaceC7241t
        /* JADX INFO: renamed from: g */
        public final void mo791g(C0972q c0972q) {
            ActivityC0979t.this.mo791g(c0972q);
        }

        @Override // androidx.activity.result.InterfaceC0208g
        /* JADX INFO: renamed from: k */
        public final AbstractC0207f mo793k() {
            return ActivityC0979t.this.f447k;
        }

        @Override // androidx.fragment.app.AbstractC0986x
        /* JADX INFO: renamed from: k0 */
        public final void mo3807k0(PrintWriter printWriter, String[] strArr) {
            ActivityC0979t.this.dump("  ", null, printWriter, strArr);
        }

        @Override // p254m2.InterfaceC7474c
        /* JADX INFO: renamed from: l */
        public final void mo794l(C0943b0 c0943b0) {
            ActivityC0979t.this.mo794l(c0943b0);
        }

        @Override // androidx.fragment.app.AbstractC0986x
        /* JADX INFO: renamed from: l0 */
        public final ActivityC0979t mo3808l0() {
            return ActivityC0979t.this;
        }

        @Override // p232l2.InterfaceC7240s
        /* JADX INFO: renamed from: m */
        public final void mo795m(C0945c0 c0945c0) {
            ActivityC0979t.this.mo795m(c0945c0);
        }

        @Override // androidx.fragment.app.AbstractC0986x
        /* JADX INFO: renamed from: m0 */
        public final LayoutInflater mo3809m0() {
            ActivityC0979t activityC0979t = ActivityC0979t.this;
            return activityC0979t.getLayoutInflater().cloneInContext(activityC0979t);
        }

        @Override // androidx.view.InterfaceC1048n0
        /* JADX INFO: renamed from: n */
        public final C1046m0 mo796n() {
            return ActivityC0979t.this.mo796n();
        }

        @Override // androidx.fragment.app.AbstractC0986x
        /* JADX INFO: renamed from: n0 */
        public final boolean mo3810n0(String str) {
            return C7222a.m14546d(ActivityC0979t.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0986x
        /* JADX INFO: renamed from: o0 */
        public final void mo3811o0() {
            ActivityC0979t.this.invalidateOptionsMenu();
        }

        @Override // p270n4.InterfaceC7706c
        /* JADX INFO: renamed from: q */
        public final C1189a mo797q() {
            return ActivityC0979t.this.f441e.f42232b;
        }

        @Override // p471x2.InterfaceC10042i
        /* JADX INFO: renamed from: t */
        public final void mo798t(FragmentManager.C0918c c0918c) {
            ActivityC0979t.this.mo798t(c0918c);
        }

        @Override // p254m2.InterfaceC7473b
        /* JADX INFO: renamed from: w */
        public final void mo799w(C0974r c0974r) {
            ActivityC0979t.this.mo799w(c0974r);
        }
    }

    public ActivityC0979t() {
        this.f441e.f42232b.m4586c("android:support:lifecycle", new C1189a.b() { // from class: androidx.fragment.app.p
            @Override // androidx.p544savedstate.C1189a.b
            /* JADX INFO: renamed from: a */
            public final Bundle mo811a() {
                ActivityC0979t activityC0979t;
                do {
                    activityC0979t = this.f6382a;
                } while (ActivityC0979t.m3804L(activityC0979t.m3805K(), Lifecycle.State.CREATED));
                activityC0979t.f6407O.m3955f(Lifecycle.Event.ON_STOP);
                return new Bundle();
            }
        });
        mo785E(new C0972q(0, this));
        this.f433I.add(new C0974r(0, this));
        m787I(new InterfaceC1275b() { // from class: androidx.fragment.app.s
            @Override // p020b.InterfaceC1275b
            /* JADX INFO: renamed from: a */
            public final void mo812a() {
                AbstractC0986x<?> abstractC0986x = this.f6400a.f6406N.f6426a;
                abstractC0986x.f6431d.m3637b(abstractC0986x, abstractC0986x, null);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public static boolean m3804L(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zM3804L = false;
        for (Fragment fragment : fragmentManager.m3620H()) {
            if (fragment != null) {
                if (fragment.m3596o() != null) {
                    zM3804L |= m3804L(fragment.m3594l(), state);
                }
                C0980t0 c0980t0 = fragment.f6113m0;
                if (c0980t0 != null) {
                    c0980t0.m3813c();
                    if (c0980t0.f6415d.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                        fragment.f6113m0.f6415d.m3957h(state);
                        zM3804L = true;
                    }
                }
                if (fragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.f6112l0.m3957h(state);
                    zM3804L = true;
                }
            }
        }
        return zM3804L;
    }

    /* JADX INFO: renamed from: K */
    public final C0949e0 m3805K() {
        return this.f6406N.f6426a.f6431d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        boolean zM17515a = false;
        if (strArr != null && strArr.length > 0) {
            String str2 = strArr[0];
            str2.getClass();
            switch (str2) {
                case "--translation":
                    if (Build.VERSION.SDK_INT >= 31) {
                        zM17515a = true;
                    }
                    break;
                case "--dump-dumpable":
                case "--list-dumpables":
                    zM17515a = C9182a.m17515a();
                    break;
                case "--contentcapture":
                    if (Build.VERSION.SDK_INT >= 29) {
                        zM17515a = true;
                    }
                    break;
                case "--autofill":
                    zM17515a = true;
                    break;
            }
        }
        if (!zM17515a) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str3 = str + "  ";
            printWriter.print(str3);
            printWriter.print("mCreated=");
            printWriter.print(this.f6408P);
            printWriter.print(" mResumed=");
            printWriter.print(this.f6409Q);
            printWriter.print(" mStopped=");
            printWriter.print(this.f6410R);
            if (getApplication() != null) {
                AbstractC9808a.m18288a(this).m18289b(str3, printWriter);
            }
            this.f6406N.f6426a.f6431d.m3664u(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.f6406N.m3816a();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.ComponentActivity, p232l2.ActivityC7230i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6407O.m3955f(Lifecycle.Event.ON_CREATE);
        C0949e0 c0949e0 = this.f6406N.f6426a.f6431d;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f6406N.f6426a.f6431d.f6163f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f6406N.f6426a.f6431d.f6163f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f6406N.f6426a.f6431d.m3654k();
        this.f6407O.m3955f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f6406N.f6426a.f6431d.m3650i();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f6409Q = false;
        this.f6406N.f6426a.f6431d.m3663t(5);
        this.f6407O.m3955f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f6407O.m3955f(Lifecycle.Event.ON_RESUME);
        C0949e0 c0949e0 = this.f6406N.f6426a.f6431d;
        c0949e0.f6149F = false;
        c0949e0.f6150G = false;
        c0949e0.f6156M.f6292i = false;
        c0949e0.m3663t(7);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f6406N.m3816a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0983v c0983v = this.f6406N;
        c0983v.m3816a();
        super.onResume();
        this.f6409Q = true;
        c0983v.f6426a.f6431d.m3667x(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C0983v c0983v = this.f6406N;
        c0983v.m3816a();
        super.onStart();
        this.f6410R = false;
        boolean z10 = this.f6408P;
        AbstractC0986x<?> abstractC0986x = c0983v.f6426a;
        if (!z10) {
            this.f6408P = true;
            C0949e0 c0949e0 = abstractC0986x.f6431d;
            c0949e0.f6149F = false;
            c0949e0.f6150G = false;
            c0949e0.f6156M.f6292i = false;
            c0949e0.m3663t(4);
        }
        abstractC0986x.f6431d.m3667x(true);
        this.f6407O.m3955f(Lifecycle.Event.ON_START);
        C0949e0 c0949e1 = abstractC0986x.f6431d;
        c0949e1.f6149F = false;
        c0949e1.f6150G = false;
        c0949e1.f6156M.f6292i = false;
        c0949e1.m3663t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f6406N.m3816a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f6410R = true;
        while (m3804L(m3805K(), Lifecycle.State.CREATED)) {
        }
        C0949e0 c0949e0 = this.f6406N.f6426a.f6431d;
        c0949e0.f6150G = true;
        c0949e0.f6156M.f6292i = true;
        c0949e0.m3663t(4);
        this.f6407O.m3955f(Lifecycle.Event.ON_STOP);
    }

    @Override // p232l2.C7222a.c
    @Deprecated
    /* JADX INFO: renamed from: z */
    public final void mo3806z() {
    }
}
