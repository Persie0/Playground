package p000;

import com.amplitude.android.utilities.ActivityCallbackType;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: loaded from: classes.dex */
public final class C3287l6 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f49103a;

    /* JADX INFO: renamed from: b */
    public final ActivityCallbackType f49104b;

    public C3287l6(WeakReference weakReference, ActivityCallbackType activityCallbackType) {
        activityCallbackType.getClass();
        this.f49103a = weakReference;
        this.f49104b = activityCallbackType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3287l6)) {
            return false;
        }
        C3287l6 c3287l6 = (C3287l6) obj;
        return this.f49103a.equals(c3287l6.f49103a) && this.f49104b == c3287l6.f49104b;
    }

    public final int hashCode() {
        return this.f49104b.hashCode() + (this.f49103a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityCallbackEvent(activity=" + this.f49103a + ", type=" + this.f49104b + ')';
    }
}
