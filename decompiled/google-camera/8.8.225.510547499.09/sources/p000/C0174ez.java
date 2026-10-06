package p000;

import android.content.IntentFilter;

/* JADX INFO: renamed from: ez */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0174ez extends AbstractC0173ey {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f21024a;

    /* JADX INFO: renamed from: b */
    public final C1058va f21025b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174ez(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd, C1058va c1058va, byte[] bArr, byte[] bArr2) {
        super(layoutInflaterFactory2C0179fd);
        this.f21024a = layoutInflaterFactory2C0179fd;
        this.f21025b = c1058va;
    }

    @Override // p000.AbstractC0173ey
    /* JADX INFO: renamed from: a */
    public final IntentFilter mo7933a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // p000.AbstractC0173ey
    /* JADX INFO: renamed from: b */
    public final void mo7934b() {
        this.f21024a.m8244K();
    }
}
