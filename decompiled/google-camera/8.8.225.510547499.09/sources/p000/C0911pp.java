package p000;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: pp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0911pp {

    /* JADX INFO: renamed from: a */
    public static final C0911pp f47444a = new C0911pp();

    private C0911pp() {
    }

    /* JADX INFO: renamed from: a */
    public final OnBackInvokedCallback m19325a(omx omxVar) {
        omxVar.getClass();
        return new C0853nl(omxVar, 2);
    }

    /* JADX INFO: renamed from: b */
    public final void m19326b(Object obj, int i, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* JADX INFO: renamed from: c */
    public final void m19327c(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
