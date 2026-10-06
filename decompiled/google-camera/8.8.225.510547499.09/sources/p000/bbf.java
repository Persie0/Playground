package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bbf extends bbh {

    /* JADX INFO: renamed from: e */
    private final BroadcastReceiver f2894e;

    public bbf(Context context, C1058va c1058va, byte[] bArr) {
        super(context, c1058va, null);
        this.f2894e = new bbe(this);
    }

    /* JADX INFO: renamed from: a */
    public abstract IntentFilter mo2173a();

    /* JADX INFO: renamed from: c */
    public abstract void mo2175c(Intent intent);

    @Override // p000.bbh
    /* JADX INFO: renamed from: d */
    public final void mo2176d() {
        ayc.m2099a();
        int i = bbg.f2895a;
        getClass().getSimpleName();
        this.f2896a.registerReceiver(this.f2894e, mo2173a());
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: e */
    public final void mo2177e() {
        ayc.m2099a();
        int i = bbg.f2895a;
        getClass().getSimpleName();
        this.f2896a.unregisterReceiver(this.f2894e);
    }
}
