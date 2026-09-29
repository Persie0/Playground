package p000;

import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class dc3 {

    /* JADX INFO: renamed from: a */
    public final Uri f35379a;

    /* JADX INFO: renamed from: b */
    public final int f35380b;

    /* JADX INFO: renamed from: c */
    public final int f35381c;

    /* JADX INFO: renamed from: d */
    public final boolean f35382d;

    /* JADX INFO: renamed from: e */
    public final String f35383e;

    /* JADX INFO: renamed from: f */
    public final int f35384f;

    public dc3(String str, String str2) {
        this.f35379a = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.f35380b = 0;
        this.f35381c = 400;
        this.f35382d = false;
        this.f35383e = str2;
        this.f35384f = 0;
    }

    /* JADX INFO: renamed from: a */
    public final String m10277a() {
        if (m10283g()) {
            return this.f35379a.getAuthority();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final int m10278b() {
        return this.f35380b;
    }

    /* JADX INFO: renamed from: c */
    public final Uri m10279c() {
        return this.f35379a;
    }

    /* JADX INFO: renamed from: d */
    public final String m10280d() {
        return this.f35383e;
    }

    /* JADX INFO: renamed from: e */
    public final int m10281e() {
        return this.f35381c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m10282f() {
        return this.f35382d;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m10283g() {
        return Objects.equals(this.f35379a.getScheme(), "systemfont");
    }

    public dc3(Uri uri, int i, int i2, boolean z, String str, int i3) {
        uri.getClass();
        this.f35379a = uri;
        this.f35380b = i;
        this.f35381c = i2;
        this.f35382d = z;
        this.f35383e = str;
        this.f35384f = i3;
    }
}
