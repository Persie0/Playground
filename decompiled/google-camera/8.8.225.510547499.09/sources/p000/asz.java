package p000;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class asz {

    /* JADX INFO: renamed from: a */
    private final WindowId f2283a;

    public asz(View view) {
        this.f2283a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asz) && ((asz) obj).f2283a.equals(this.f2283a);
    }

    public final int hashCode() {
        return this.f2283a.hashCode();
    }
}
