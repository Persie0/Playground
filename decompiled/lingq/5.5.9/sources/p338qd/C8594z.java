package p338qd;

import com.google.android.play.core.assetpacks.AssetPackState;
import p003a2.C0009a;

/* JADX INFO: renamed from: qd.z */
/* JADX INFO: loaded from: classes.dex */
public final class C8594z extends AssetPackState {

    /* JADX INFO: renamed from: a */
    public final String f46051a;

    /* JADX INFO: renamed from: b */
    public final int f46052b;

    /* JADX INFO: renamed from: c */
    public final int f46053c;

    /* JADX INFO: renamed from: d */
    public final long f46054d;

    /* JADX INFO: renamed from: e */
    public final long f46055e;

    /* JADX INFO: renamed from: f */
    public final int f46056f;

    /* JADX INFO: renamed from: g */
    public final int f46057g;

    /* JADX INFO: renamed from: h */
    public final String f46058h;

    /* JADX INFO: renamed from: i */
    public final String f46059i;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C8594z(String str, int i10, int i11, long j10, long j11, int i12, int i13, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f46051a = str;
        this.f46052b = i10;
        this.f46053c = i11;
        this.f46054d = j10;
        this.f46055e = j11;
        this.f46056f = i12;
        this.f46057g = i13;
        if (str2 == null) {
            throw new NullPointerException("Null availableVersionTag");
        }
        this.f46058h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null installedVersionTag");
        }
        this.f46059i = str3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: a */
    public final long mo8943a() {
        return this.f46054d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: b */
    public final int mo8944b() {
        return this.f46053c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: c */
    public final String mo8945c() {
        return this.f46051a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: d */
    public final int mo8946d() {
        return this.f46052b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: e */
    public final long mo8947e() {
        return this.f46055e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            if (this.f46051a.equals(assetPackState.mo8945c()) && this.f46052b == assetPackState.mo8946d() && this.f46053c == assetPackState.mo8944b() && this.f46054d == assetPackState.mo8943a() && this.f46055e == assetPackState.mo8947e() && this.f46056f == assetPackState.mo8948f() && this.f46057g == assetPackState.mo8949g() && this.f46058h.equals(assetPackState.mo8950j()) && this.f46059i.equals(assetPackState.mo8951k())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: f */
    public final int mo8948f() {
        return this.f46056f;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: g */
    public final int mo8949g() {
        return this.f46057g;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f46051a.hashCode() ^ 1000003) * 1000003) ^ this.f46052b) * 1000003) ^ this.f46053c) * 1000003;
        long j10 = this.f46054d;
        int i10 = (iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f46055e;
        return ((((((((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f46056f) * 1000003) ^ this.f46057g) * 1000003) ^ this.f46058h.hashCode()) * 1000003) ^ this.f46059i.hashCode();
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: j */
    public final String mo8950j() {
        return this.f46058h;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* JADX INFO: renamed from: k */
    public final String mo8951k() {
        return this.f46059i;
    }

    public final String toString() {
        String str = this.f46051a;
        int length = str.length() + 261;
        String str2 = this.f46058h;
        int length2 = str2.length() + length;
        String str3 = this.f46059i;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        sb2.append("AssetPackState{name=");
        sb2.append(str);
        sb2.append(", status=");
        sb2.append(this.f46052b);
        sb2.append(", errorCode=");
        sb2.append(this.f46053c);
        sb2.append(", bytesDownloaded=");
        sb2.append(this.f46054d);
        sb2.append(", totalBytesToDownload=");
        sb2.append(this.f46055e);
        sb2.append(", transferProgressPercentage=");
        sb2.append(this.f46056f);
        sb2.append(", updateAvailability=");
        sb2.append(this.f46057g);
        sb2.append(", availableVersionTag=");
        sb2.append(str2);
        sb2.append(", installedVersionTag=");
        return C0009a.m23l(sb2, str3, "}");
    }
}
