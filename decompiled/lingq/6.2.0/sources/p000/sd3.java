package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd3 implements pp6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zi3 f60707a;

    public /* synthetic */ sd3(zi3 zi3Var) {
        this.f60707a = zi3Var;
    }

    @Override // p000.pp6
    /* JADX INFO: renamed from: a */
    public void mo19438a() {
        zi3 zi3Var = this.f60707a;
        synchronized (nc9.f52602c) {
            nc9.f52607h = u91.m22602T0(nc9.f52607h, zi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m21250b(String str, Bundle bundle) {
        this.f60707a.invoke(str, bundle);
    }
}
