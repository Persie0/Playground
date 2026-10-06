package p000;

import android.app.Notification;
import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axv {

    /* JADX INFO: renamed from: a */
    public final int f2694a;

    /* JADX INFO: renamed from: b */
    public final int f2695b;

    /* JADX INFO: renamed from: c */
    public final Notification f2696c;

    public axv(int i, Notification notification, int i2) {
        this.f2694a = i;
        this.f2696c = notification;
        this.f2695b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axv axvVar = (axv) obj;
        if (this.f2694a == axvVar.f2694a && this.f2695b == axvVar.f2695b) {
            return this.f2696c.equals(axvVar.f2696c);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2694a * 31) + this.f2695b) * 31) + this.f2696c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f2694a + ", mForegroundServiceType=" + this.f2695b + DNTdN.uqsUhVaQQjEvyb + this.f2696c + '}';
    }
}
