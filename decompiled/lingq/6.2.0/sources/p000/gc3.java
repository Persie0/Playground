package p000;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class gc3 {

    /* JADX INFO: renamed from: a */
    public final int f40525a;

    /* JADX INFO: renamed from: b */
    public final int f40526b;

    /* JADX INFO: renamed from: c */
    public final Notification f40527c;

    public gc3(int i, int i2, Notification notification) {
        this.f40525a = i;
        this.f40527c = notification;
        this.f40526b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gc3.class != obj.getClass()) {
            return false;
        }
        gc3 gc3Var = (gc3) obj;
        if (this.f40525a == gc3Var.f40525a && this.f40526b == gc3Var.f40526b) {
            return this.f40527c.equals(gc3Var.f40527c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40527c.hashCode() + (((this.f40525a * 31) + this.f40526b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f40525a + ", mForegroundServiceType=" + this.f40526b + ", mNotification=" + this.f40527c + '}';
    }
}
