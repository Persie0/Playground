package androidx.fragment.app;

import androidx.view.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0963l0 {

    /* JADX INFO: renamed from: b */
    public int f6345b;

    /* JADX INFO: renamed from: c */
    public int f6346c;

    /* JADX INFO: renamed from: d */
    public int f6347d;

    /* JADX INFO: renamed from: e */
    public int f6348e;

    /* JADX INFO: renamed from: f */
    public int f6349f;

    /* JADX INFO: renamed from: g */
    public boolean f6350g;

    /* JADX INFO: renamed from: i */
    public String f6352i;

    /* JADX INFO: renamed from: j */
    public int f6353j;

    /* JADX INFO: renamed from: k */
    public CharSequence f6354k;

    /* JADX INFO: renamed from: l */
    public int f6355l;

    /* JADX INFO: renamed from: m */
    public CharSequence f6356m;

    /* JADX INFO: renamed from: n */
    public ArrayList<String> f6357n;

    /* JADX INFO: renamed from: o */
    public ArrayList<String> f6358o;

    /* JADX INFO: renamed from: a */
    public final ArrayList<a> f6344a = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public boolean f6351h = true;

    /* JADX INFO: renamed from: p */
    public boolean f6359p = false;

    /* JADX INFO: renamed from: androidx.fragment.app.l0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f6360a;

        /* JADX INFO: renamed from: b */
        public Fragment f6361b;

        /* JADX INFO: renamed from: c */
        public boolean f6362c;

        /* JADX INFO: renamed from: d */
        public int f6363d;

        /* JADX INFO: renamed from: e */
        public int f6364e;

        /* JADX INFO: renamed from: f */
        public int f6365f;

        /* JADX INFO: renamed from: g */
        public int f6366g;

        /* JADX INFO: renamed from: h */
        public Lifecycle.State f6367h;

        /* JADX INFO: renamed from: i */
        public Lifecycle.State f6368i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f6360a = i10;
            this.f6361b = fragment;
            this.f6362c = false;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6367h = state;
            this.f6368i = state;
        }

        public a(int i10, Fragment fragment, int i11) {
            this.f6360a = i10;
            this.f6361b = fragment;
            this.f6362c = true;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f6367h = state;
            this.f6368i = state;
        }

        public a(Fragment fragment, Lifecycle.State state) {
            this.f6360a = 10;
            this.f6361b = fragment;
            this.f6362c = false;
            this.f6367h = fragment.f6110k0;
            this.f6368i = state;
        }

        public a(a aVar) {
            this.f6360a = aVar.f6360a;
            this.f6361b = aVar.f6361b;
            this.f6362c = aVar.f6362c;
            this.f6363d = aVar.f6363d;
            this.f6364e = aVar.f6364e;
            this.f6365f = aVar.f6365f;
            this.f6366g = aVar.f6366g;
            this.f6367h = aVar.f6367h;
            this.f6368i = aVar.f6368i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3774c(a aVar) {
        this.f6344a.add(aVar);
        aVar.f6363d = this.f6345b;
        aVar.f6364e = this.f6346c;
        aVar.f6365f = this.f6347d;
        aVar.f6366g = this.f6348e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m3775d(String str) {
        if (!this.f6351h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f6350g = true;
        this.f6352i = str;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m3776e() {
        if (this.f6350g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f6351h = false;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo3695f(int i10, Fragment fragment, String str, int i11);

    /* JADX INFO: renamed from: g */
    public final void m3777g(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo3695f(i10, fragment, str, 2);
    }
}
