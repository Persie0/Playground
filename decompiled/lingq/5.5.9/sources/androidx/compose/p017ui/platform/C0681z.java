package androidx.compose.p017ui.platform;

import android.content.Context;
import p081e0.InterfaceC5327o;

/* JADX INFO: renamed from: androidx.compose.ui.platform.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0681z implements InterfaceC5327o {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f4392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ComponentCallbacks2C0602a0 f4393b;

    public C0681z(Context context, ComponentCallbacks2C0602a0 componentCallbacks2C0602a0) {
        this.f4392a = context;
        this.f4393b = componentCallbacks2C0602a0;
    }

    @Override // p081e0.InterfaceC5327o
    /* JADX INFO: renamed from: a */
    public final void mo2504a() {
        this.f4392a.getApplicationContext().unregisterComponentCallbacks(this.f4393b);
    }
}
