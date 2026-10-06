package p000;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ael {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f257a;

    public ael(DisplayCutout displayCutout) {
        this.f257a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aeb.m318b(this.f257a, ((ael) obj).f257a);
    }

    public final int hashCode() {
        return this.f257a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f257a + "}";
    }
}
