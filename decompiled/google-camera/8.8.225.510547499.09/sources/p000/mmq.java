package p000;

import android.app.PendingIntent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmq {

    /* JADX INFO: renamed from: a */
    public final int f41056a;

    /* JADX INFO: renamed from: b */
    public final int f41057b;

    /* JADX INFO: renamed from: c */
    public final int f41058c;

    /* JADX INFO: renamed from: d */
    public final Integer f41059d;

    /* JADX INFO: renamed from: e */
    public boolean f41060e = false;

    /* JADX INFO: renamed from: f */
    private final PendingIntent f41061f;

    public mmq(int i, int i2, int i3, Integer num, PendingIntent pendingIntent) {
        this.f41056a = i;
        this.f41057b = i2;
        this.f41058c = i3;
        this.f41059d = num;
        this.f41061f = pendingIntent;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m16633a() {
        return m16634b() != null;
    }

    /* JADX INFO: renamed from: b */
    final PendingIntent m16634b() {
        PendingIntent pendingIntent = this.f41061f;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        return null;
    }
}
