package p000;

import com.google.android.apps.camera.jni.gxp.GxpUtils;
import java.io.File;
import p021j$.time.Duration;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ebv {

    /* JADX INFO: renamed from: a */
    public final dhv f13299a;

    /* JADX INFO: renamed from: b */
    public final int f13300b;

    /* JADX INFO: renamed from: c */
    public final int f13301c;

    /* JADX INFO: renamed from: d */
    public final int f13302d;

    /* JADX INFO: renamed from: e */
    public final int f13303e;

    /* JADX INFO: renamed from: f */
    public final boolean f13304f;

    /* JADX INFO: renamed from: g */
    public final float f13305g;

    /* JADX INFO: renamed from: h */
    public final boolean f13306h;

    /* JADX INFO: renamed from: i */
    public final Optional f13307i;

    /* JADX INFO: renamed from: j */
    private final dja f13308j;

    public ebv(dsx dsxVar, dhv dhvVar, dja djaVar, byte[] bArr, byte[] bArr2) {
        this.f13299a = dhvVar;
        this.f13308j = djaVar;
        int iIntValue = ((Integer) dhvVar.mo6173a(did.f11450d).get()).intValue();
        dhvVar.mo6175c();
        int iMax = Math.max(1, iIntValue);
        boolean zM6693h = dsxVar.m6693h();
        boolean zM6693h2 = dsxVar.m6693h();
        if (dsxVar.m6693h() && dhvVar.mo6184l(dij.f11600x)) {
            int iMax2 = Math.max((zM6693h ? 1 : 0) + iMax, (zM6693h2 ? 1 : 0) + iMax);
            this.f13300b = iMax2;
            this.f13302d = dsxVar.m6693h() ? iMax2 - iMax : 0;
            this.f13303e = dsxVar.m6693h() ? iMax2 - iMax : 0;
        } else {
            int iMax3 = Math.max((zM6693h ? 1 : 0) + iMax, iMax);
            this.f13300b = iMax3;
            this.f13302d = dsxVar.m6693h() ? iMax3 - iMax : 0;
            this.f13303e = 0;
        }
        this.f13301c = (int) (this.f13300b * ((Float) dhvVar.mo6180h(did.f11423ab).get()).floatValue());
        this.f13304f = dhvVar.mo6184l(did.f11472z);
        dhvVar.mo6177e();
        dhvVar.mo6176d();
        this.f13305g = ((Float) dhvVar.mo6180h(dhu.f11199a).get()).floatValue();
        this.f13306h = dhvVar.mo6184l(dih.f11521i);
        dhvVar.mo6178f();
        this.f13307i = dhvVar.mo6173a(dih.f11514b);
        dhvVar.mo6175c();
    }

    /* JADX INFO: renamed from: a */
    static String m7082a(ebu ebuVar) {
        switch (ebuVar.ordinal()) {
            case 1:
                return "y";
            case 2:
                return "r";
            case 3:
                return "h";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7083b() {
        if (this.f13308j.m6200b(dja.DOGFOOD)) {
            if (!this.f13299a.mo6184l(did.f11397H) || !this.f13299a.mo6184l(did.f11398I)) {
                return false;
            }
        } else if (!this.f13299a.mo6184l(did.f11397H) && !this.f13299a.mo6184l(did.f11398I)) {
            return false;
        }
        return GxpUtils.m4186a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m7084c() {
        dhv dhvVar = this.f13299a;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6176d();
        return new File("/dev/adsprpc-smd").canRead();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7085d(Duration duration) {
        return this.f13306h && duration.toMillis() >= ((long) ((Integer) this.f13299a.mo6173a(dih.f11513a).get()).intValue());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m7086e(cle cleVar) {
        boolean zMo6184l = this.f13299a.mo6184l(did.f11411V);
        boolean z = this.f13306h;
        boolean zEquals = cleVar.equals(cle.AUTO);
        if (z) {
            return zEquals && zMo6184l;
        }
        return zMo6184l;
    }
}
