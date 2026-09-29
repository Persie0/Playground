package p000;

import com.google.firebase.sessions.DataCollectionState;

/* JADX INFO: loaded from: classes.dex */
public final class wz1 {

    /* JADX INFO: renamed from: a */
    public final DataCollectionState f67541a;

    /* JADX INFO: renamed from: b */
    public final DataCollectionState f67542b;

    /* JADX INFO: renamed from: c */
    public final double f67543c;

    public wz1(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        dataCollectionState.getClass();
        dataCollectionState2.getClass();
        this.f67541a = dataCollectionState;
        this.f67542b = dataCollectionState2;
        this.f67543c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz1)) {
            return false;
        }
        wz1 wz1Var = (wz1) obj;
        return this.f67541a == wz1Var.f67541a && this.f67542b == wz1Var.f67542b && Double.compare(this.f67543c, wz1Var.f67543c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f67543c) + ((this.f67542b.hashCode() + (this.f67541a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f67541a + ", crashlytics=" + this.f67542b + ", sessionSamplingRate=" + this.f67543c + ')';
    }
}
