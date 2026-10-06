package p000;

import android.content.res.Resources;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ack {

    /* JADX INFO: renamed from: a */
    public final Resources f86a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f87b;

    public ack(Resources resources, Resources.Theme theme) {
        this.f86a = resources;
        this.f87b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ack ackVar = (ack) obj;
        return this.f86a.equals(ackVar.f86a) && aeb.m318b(this.f87b, ackVar.f87b);
    }

    public final int hashCode() {
        return aeb.m317a(this.f86a, this.f87b);
    }
}
