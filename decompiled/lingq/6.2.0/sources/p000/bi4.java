package p000;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class bi4 {

    /* JADX INFO: renamed from: a */
    public final KeyEvent f8562a;

    public /* synthetic */ bi4(KeyEvent keyEvent) {
        this.f8562a = keyEvent;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ bi4 m3728a(KeyEvent keyEvent) {
        return new bi4(keyEvent);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KeyEvent m3729b() {
        return this.f8562a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bi4) {
            return fa4.m11650l(this.f8562a, ((bi4) obj).f8562a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8562a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f8562a + ')';
    }
}
