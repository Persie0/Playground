package p000;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class u41 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f63377a;

    /* JADX INFO: renamed from: b */
    public final String f63378b;

    public u41(View view, String str) {
        view.getClass();
        this.f63377a = new WeakReference(view);
        this.f63378b = str;
    }

    /* JADX INFO: renamed from: a */
    public final View m22444a() {
        WeakReference weakReference = this.f63377a;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m22445b() {
        return this.f63378b;
    }
}
