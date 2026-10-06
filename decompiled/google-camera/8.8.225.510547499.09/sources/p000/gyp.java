package p000;

import android.net.Uri;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyp {

    /* JADX INFO: renamed from: a */
    public final long f26865a;

    /* JADX INFO: renamed from: b */
    public final Uri f26866b;

    /* JADX INFO: renamed from: c */
    public final gyw f26867c;

    /* JADX INFO: renamed from: d */
    public final boolean f26868d;

    public gyp() {
    }

    public gyp(long j, Uri uri, gyw gywVar, boolean z) {
        this.f26865a = j;
        this.f26866b = uri;
        this.f26867c = gywVar;
        this.f26868d = z;
    }

    /* JADX INFO: renamed from: a */
    public static gyo m9998a() {
        gyo gyoVar = new gyo();
        gyoVar.m9991b(false);
        return gyoVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gyp) {
            gyp gypVar = (gyp) obj;
            if (this.f26865a == gypVar.f26865a && this.f26866b.equals(gypVar.f26866b) && this.f26867c.equals(gypVar.f26867c) && this.f26868d == gypVar.f26868d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f26865a;
        return ((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f26866b.hashCode()) * 1000003) ^ this.f26867c.hashCode()) * 1000003) ^ (true != this.f26868d ? 1237 : 1231);
    }

    public final String toString() {
        return "MediaStoreRecord{mediaStoreId=" + this.f26865a + ", uri=" + String.valueOf(this.f26866b) + ", sessionType=" + String.valueOf(this.f26867c) + hIAHJKEnGsNbz.qot + this.f26868d + "}";
    }
}
