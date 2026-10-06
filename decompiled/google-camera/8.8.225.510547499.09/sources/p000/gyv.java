package p000;

import android.os.Process;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyv {

    /* JADX INFO: renamed from: a */
    public final gyu f26875a;

    /* JADX INFO: renamed from: b */
    public final long f26876b;

    /* JADX INFO: renamed from: c */
    public final String f26877c;

    /* JADX INFO: renamed from: d */
    public final gyw f26878d;

    /* JADX INFO: renamed from: e */
    public final long f26879e;

    public gyv(gyu gyuVar, long j, String str, gyw gywVar, long j2) {
        this.f26875a = gyuVar;
        this.f26876b = j;
        if (str == null) {
            throw new NullPointerException(wUzNh.bdrQnLJbkpkd);
        }
        this.f26877c = str;
        if (gywVar == null) {
            throw new NullPointerException("Null captureSessionType");
        }
        this.f26878d = gywVar;
        this.f26879e = j2;
    }

    /* JADX INFO: renamed from: a */
    public static gyv m10003a(gyu gyuVar, long j, String str, gyw gywVar) {
        return new gyv(gyuVar, j, str, gywVar, Process.myPid());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gyv)) {
            return false;
        }
        gyv gyvVar = (gyv) obj;
        gyu gyuVar = this.f26875a;
        if (gyuVar != null ? gyuVar.equals(gyvVar.f26875a) : gyvVar.f26875a == null) {
            if (this.f26876b == gyvVar.f26876b && this.f26877c.equals(gyvVar.f26877c) && this.f26878d.equals(gyvVar.f26878d) && this.f26879e == gyvVar.f26879e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        gyu gyuVar = this.f26875a;
        int iHashCode = gyuVar == null ? 0 : gyuVar.hashCode();
        long j = this.f26876b;
        int iHashCode2 = ((((((iHashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f26877c.hashCode()) * 1000003) ^ this.f26878d.hashCode();
        long j2 = this.f26879e;
        return (iHashCode2 * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "ShotInfo{shotId=" + String.valueOf(this.f26875a) + ", shotIdForTracker=" + this.f26876b + ", title=" + this.f26877c + ", captureSessionType=" + this.f26878d.toString() + ", pid=" + this.f26879e + "}";
    }

    public gyv() {
    }
}
