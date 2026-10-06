package p000;

import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ndn extends ncn {

    /* JADX INFO: renamed from: a */
    private final String f42054a;

    protected ndn(String str) {
        this.f42054a = str;
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: a */
    public String mo17338a() {
        return this.f42054a;
    }

    @Override // p000.ncn
    /* JADX INFO: renamed from: b */
    public void mo17339b(RuntimeException runtimeException, ncm ncmVar) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }
}
