package p000;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: loaded from: classes2.dex */
public final class ts3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62797a;

    /* JADX INFO: renamed from: b */
    public static boolean m22281b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final ViewPropertyAnimator m22282a(View view, int i) {
        switch (this.f62797a) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
