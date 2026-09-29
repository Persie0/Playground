package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.strictmode.Violation;

/* JADX INFO: loaded from: classes.dex */
public abstract class sf3 {

    /* JADX INFO: renamed from: a */
    public static final rf3 f60790a = rf3.f59200a;

    /* JADX INFO: renamed from: a */
    public static rf3 m21332a(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        while (abstractComponentCallbacksC0635c != null) {
            if (abstractComponentCallbacksC0635c.m2115q()) {
                abstractComponentCallbacksC0635c.m2109k();
            }
            abstractComponentCallbacksC0635c = abstractComponentCallbacksC0635c.f5677S;
        }
        return f60790a;
    }

    /* JADX INFO: renamed from: b */
    public static void m21333b(Violation violation) {
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f5771a.getClass().getName()), violation);
        }
    }
}
