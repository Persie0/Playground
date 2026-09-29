package p000;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: il */
/* JADX INFO: loaded from: classes.dex */
public final class C3115il implements hta {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f44250a;

    public C3115il(ViewConfiguration viewConfiguration) {
        this.f44250a = viewConfiguration;
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: a */
    public final long mo13455a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: b */
    public final long mo13456b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: c */
    public final float mo13457c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return u2d.m22408b(this.f44250a);
        }
        return 2.0f;
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: e */
    public final float mo13459e() {
        return this.f44250a.getScaledMaximumFlingVelocity();
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: f */
    public final float mo13460f() {
        return this.f44250a.getScaledTouchSlop();
    }

    @Override // p000.hta
    /* JADX INFO: renamed from: g */
    public final float mo13461g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return u2d.m22407a(this.f44250a);
        }
        return 16.0f;
    }
}
