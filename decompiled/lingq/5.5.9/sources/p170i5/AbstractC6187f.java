package p170i5;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p026b5.AbstractC1314g;
import p257m5.C7480b;

/* JADX INFO: renamed from: i5.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6187f<T> extends AbstractC6189h<T> {

    /* JADX INFO: renamed from: f */
    public final C6186e f36043f;

    public AbstractC6187f(Context context, C7480b c7480b) {
        super(context, c7480b);
        this.f36043f = new C6186e(this);
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: d */
    public final void mo12706d() {
        AbstractC1314g.m4867d().mo4869a(C6188g.f36044a, getClass().getSimpleName().concat(": registering receiver"));
        this.f36046b.registerReceiver(this.f36043f, mo12703f());
    }

    @Override // p170i5.AbstractC6189h
    /* JADX INFO: renamed from: e */
    public final void mo12707e() {
        AbstractC1314g.m4867d().mo4869a(C6188g.f36044a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f36046b.unregisterReceiver(this.f36043f);
    }

    /* JADX INFO: renamed from: f */
    public abstract IntentFilter mo12703f();

    /* JADX INFO: renamed from: g */
    public abstract void mo12704g(Intent intent);
}
