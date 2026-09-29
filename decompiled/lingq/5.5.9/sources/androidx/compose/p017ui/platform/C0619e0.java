package androidx.compose.p017ui.platform;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: androidx.compose.ui.platform.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0619e0 implements InterfaceC0647n1 {

    /* JADX INFO: renamed from: a */
    public final ViewConfiguration f4306a;

    public C0619e0(ViewConfiguration viewConfiguration) {
        this.f4306a = viewConfiguration;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0647n1
    /* JADX INFO: renamed from: a */
    public final long mo2137a() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0647n1
    /* JADX INFO: renamed from: c */
    public final float mo2139c() {
        return this.f4306a.getScaledTouchSlop();
    }
}
