package p026b5;

import android.app.Notification;

/* JADX INFO: renamed from: b5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1310c {

    /* JADX INFO: renamed from: a */
    public final int f8056a;

    /* JADX INFO: renamed from: b */
    public final int f8057b;

    /* JADX INFO: renamed from: c */
    public final Notification f8058c;

    public C1310c(int i10, int i11, Notification notification) {
        this.f8056a = i10;
        this.f8058c = notification;
        this.f8057b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1310c.class != obj.getClass()) {
            return false;
        }
        C1310c c1310c = (C1310c) obj;
        if (this.f8056a == c1310c.f8056a && this.f8057b == c1310c.f8057b) {
            return this.f8058c.equals(c1310c.f8058c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8058c.hashCode() + (((this.f8056a * 31) + this.f8057b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f8056a + ", mForegroundServiceType=" + this.f8057b + ", mNotification=" + this.f8058c + '}';
    }
}
