package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.play.core.install.InstallState;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mnc extends InstallState {

    /* JADX INFO: renamed from: a */
    public final int f41094a;

    /* JADX INFO: renamed from: b */
    public final long f41095b;

    /* JADX INFO: renamed from: c */
    public final long f41096c;

    /* JADX INFO: renamed from: d */
    public final int f41097d;

    /* JADX INFO: renamed from: e */
    private final String f41098e;

    public mnc(int i, long j, long j2, int i2, String str) {
        this.f41094a = i;
        this.f41095b = j;
        this.f41096c = j2;
        this.f41097d = i2;
        if (str == null) {
            throw new NullPointerException(wUzNh.fdThLuUULczpFnj);
        }
        this.f41098e = str;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* JADX INFO: renamed from: a */
    public final int mo4869a() {
        return this.f41097d;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* JADX INFO: renamed from: b */
    public final int mo4870b() {
        return this.f41094a;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* JADX INFO: renamed from: c */
    public final long mo4871c() {
        return this.f41095b;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* JADX INFO: renamed from: d */
    public final long mo4872d() {
        return this.f41096c;
    }

    @Override // com.google.android.play.core.install.InstallState
    /* JADX INFO: renamed from: e */
    public final String mo4873e() {
        return this.f41098e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InstallState) {
            InstallState installState = (InstallState) obj;
            if (this.f41094a == installState.mo4870b() && this.f41095b == installState.mo4871c() && this.f41096c == installState.mo4872d() && this.f41097d == installState.mo4869a() && this.f41098e.equals(installState.mo4873e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41094a ^ 1000003;
        long j = this.f41095b;
        long j2 = this.f41096c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f41097d) * 1000003) ^ this.f41098e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f41094a + ", bytesDownloaded=" + this.f41095b + ", totalBytesToDownload=" + this.f41096c + ", installErrorCode=" + this.f41097d + ", packageName=" + this.f41098e + "}";
    }
}
