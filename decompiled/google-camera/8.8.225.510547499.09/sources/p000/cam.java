package p000;

import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientDelegate;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class cam implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    private final WeakReference f4917a;

    public cam(AmbientDelegate ambientDelegate, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f4917a = new WeakReference(ambientDelegate);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection] */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        AmbientDelegate ambientDelegate = (AmbientDelegate) this.f4917a.get();
        if (ambientDelegate == null || ambientDelegate.f1686b.isEmpty()) {
            return true;
        }
        int iM1589T = ambientDelegate.m1589T();
        int iM1588S = ambientDelegate.m1588S();
        if (!AmbientDelegate.m1571V(iM1589T, iM1588S)) {
            return true;
        }
        ArrayList arrayList = new ArrayList((Collection) ambientDelegate.f1686b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cak) arrayList.get(i)).mo3358g(iM1589T, iM1588S);
        }
        ambientDelegate.m1590U();
        return true;
    }
}
