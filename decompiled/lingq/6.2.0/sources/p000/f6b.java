package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class f6b {

    /* JADX INFO: renamed from: b */
    public static final f6b f38535b;

    /* JADX INFO: renamed from: a */
    public final c6b f38536a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f38535b = a6b.f299x;
        } else if (i >= 30) {
            f38535b = y5b.f69330w;
        } else {
            f38535b = c6b.f9645b;
        }
    }

    public f6b(f6b f6bVar) {
        if (f6bVar == null) {
            this.f38536a = new c6b(this);
            return;
        }
        c6b c6bVar = f6bVar.f38536a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c6bVar instanceof b6b)) {
            this.f38536a = new b6b(this, (b6b) c6bVar);
        } else if (i >= 34 && (c6bVar instanceof a6b)) {
            this.f38536a = new a6b(this, (a6b) c6bVar);
        } else if (i >= 31 && (c6bVar instanceof z5b)) {
            this.f38536a = new z5b(this, (z5b) c6bVar);
        } else if (i >= 30 && (c6bVar instanceof y5b)) {
            this.f38536a = new y5b(this, (y5b) c6bVar);
        } else if (c6bVar instanceof x5b) {
            this.f38536a = new x5b(this, (x5b) c6bVar);
        } else if (c6bVar instanceof w5b) {
            this.f38536a = new w5b(this, (w5b) c6bVar);
        } else if (c6bVar instanceof v5b) {
            this.f38536a = new v5b(this, (v5b) c6bVar);
        } else if (c6bVar instanceof u5b) {
            this.f38536a = new u5b(this, (u5b) c6bVar);
        } else {
            this.f38536a = new c6b(this);
        }
        c6bVar.mo4364e(this);
    }

    /* JADX INFO: renamed from: e */
    public static l64 m11569e(l64 l64Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, l64Var.f49116a - i);
        int iMax2 = Math.max(0, l64Var.f49117b - i2);
        int iMax3 = Math.max(0, l64Var.f49118c - i3);
        int iMax4 = Math.max(0, l64Var.f49119d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? l64Var : l64.m15830c(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static f6b m11570g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        f6b f6bVar = new f6b(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = dta.f36217a;
            f6b f6bVarM24661a = xsa.m24661a(view);
            c6b c6bVar = f6bVar.f38536a;
            c6bVar.mo4377y(f6bVarM24661a);
            View rootView = view.getRootView();
            c6bVar.mo4363d(rootView);
            c6bVar.mo138p(rootView);
            c6bVar.mo3380q();
            c6bVar.mo4378z(view.getWindowSystemUiVisibility());
        }
        return f6bVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m11571a() {
        return this.f38536a.mo4369n().f49119d;
    }

    /* JADX INFO: renamed from: b */
    public final int m11572b() {
        return this.f38536a.mo4369n().f49116a;
    }

    /* JADX INFO: renamed from: c */
    public final int m11573c() {
        return this.f38536a.mo4369n().f49118c;
    }

    /* JADX INFO: renamed from: d */
    public final int m11574d() {
        return this.f38536a.mo4369n().f49117b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f6b) {
            return Objects.equals(this.f38536a, ((f6b) obj).f38536a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m11575f() {
        c6b c6bVar = this.f38536a;
        if (c6bVar instanceof u5b) {
            return ((u5b) c6bVar).f63458c;
        }
        return null;
    }

    public final int hashCode() {
        c6b c6bVar = this.f38536a;
        if (c6bVar == null) {
            return 0;
        }
        return c6bVar.hashCode();
    }

    public f6b(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f38536a = new b6b(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f38536a = new a6b(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f38536a = new z5b(this, windowInsets);
        } else if (i >= 30) {
            this.f38536a = new y5b(this, windowInsets);
        } else {
            this.f38536a = new x5b(this, windowInsets);
        }
    }
}
