package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: renamed from: ew */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0171ew extends AbstractC0173ey {

    /* JADX INFO: renamed from: a */
    public final PowerManager f20495a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f20496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0171ew(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, Context context) {
        super(layoutInflaterFactory2C0179fd);
        this.f20496b = layoutInflaterFactory2C0179fd;
        this.f20495a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // p000.AbstractC0173ey
    /* JADX INFO: renamed from: a */
    public final IntentFilter mo7933a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // p000.AbstractC0173ey
    /* JADX INFO: renamed from: b */
    public final void mo7934b() {
        this.f20496b.m8244K();
    }
}
