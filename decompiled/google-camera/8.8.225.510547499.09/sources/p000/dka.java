package p000;

import android.net.Uri;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dka {

    /* JADX INFO: renamed from: a */
    public gyu f11844a;

    /* JADX INFO: renamed from: b */
    public kbc f11845b;

    /* JADX INFO: renamed from: c */
    private long f11846c;

    /* JADX INFO: renamed from: d */
    private mws f11847d;

    /* JADX INFO: renamed from: e */
    private String f11848e;

    /* JADX INFO: renamed from: f */
    private String f11849f;

    /* JADX INFO: renamed from: g */
    private Instant f11850g;

    /* JADX INFO: renamed from: h */
    private Instant f11851h;

    /* JADX INFO: renamed from: i */
    private Uri f11852i;

    /* JADX INFO: renamed from: j */
    private boolean f11853j;

    /* JADX INFO: renamed from: k */
    private int f11854k;

    /* JADX INFO: renamed from: l */
    private byte f11855l;

    public dka() {
    }

    public dka(dkb dkbVar) {
        this.f11846c = dkbVar.f11856b;
        this.f11844a = dkbVar.f11857c;
        this.f11847d = dkbVar.f11858d;
        this.f11848e = dkbVar.f11859e;
        this.f11849f = dkbVar.f11860f;
        this.f11850g = dkbVar.f11861g;
        this.f11851h = dkbVar.f11862h;
        this.f11852i = dkbVar.f11863i;
        this.f11853j = dkbVar.f11864j;
        this.f11845b = dkbVar.f11865k;
        this.f11854k = dkbVar.f11866l;
        this.f11855l = (byte) 7;
    }

    /* JADX INFO: renamed from: a */
    public final dkb m6276a() {
        if ((this.f11855l & 1) == 0) {
            throw new IllegalStateException("Property \"contentId\" has not been set");
        }
        mws mwsVarM17095j = mws.m17095j(mws.m17097l(Long.valueOf(this.f11846c)));
        this.f11847d = mwsVarM17095j;
        if (this.f11855l == 7 && mwsVarM17095j != null && this.f11848e != null && this.f11849f != null && this.f11850g != null && this.f11851h != null && this.f11852i != null && this.f11845b != null) {
            return new djp(this.f11846c, this.f11844a, this.f11847d, this.f11848e, this.f11849f, this.f11850g, this.f11851h, this.f11852i, this.f11853j, this.f11845b, this.f11854k);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f11855l & 1) == 0) {
            sb.append(" contentId");
        }
        if (this.f11847d == null) {
            sb.append(" allContentIds");
        }
        if (this.f11848e == null) {
            sb.append(" title");
        }
        if (this.f11849f == null) {
            sb.append(" mimeType");
        }
        if (this.f11850g == null) {
            sb.append(" creationInstant");
        }
        if (this.f11851h == null) {
            sb.append(" lastModifiedInstant");
        }
        if (this.f11852i == null) {
            sb.append(" uri");
        }
        if ((this.f11855l & 2) == 0) {
            sb.append(" inProgress");
        }
        if (this.f11845b == null) {
            sb.append(" dimensions");
        }
        if ((this.f11855l & 4) == 0) {
            sb.append(aJFPpVSaoDO.tqXg);
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m6277b(long j) {
        this.f11846c = j;
        this.f11855l = (byte) (this.f11855l | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m6278c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null creationInstant");
        }
        this.f11850g = instant;
    }

    /* JADX INFO: renamed from: d */
    public final void m6279d(boolean z) {
        this.f11853j = z;
        this.f11855l = (byte) (this.f11855l | 2);
    }

    /* JADX INFO: renamed from: e */
    public final void m6280e(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null lastModifiedInstant");
        }
        this.f11851h = instant;
    }

    /* JADX INFO: renamed from: f */
    public final void m6281f(String str) {
        if (str == null) {
            throw new NullPointerException(hIAHJKEnGsNbz.JPLZBM);
        }
        this.f11849f = str;
    }

    /* JADX INFO: renamed from: g */
    public final void m6282g(int i) {
        this.f11854k = i;
        this.f11855l = (byte) (this.f11855l | 4);
    }

    /* JADX INFO: renamed from: h */
    public final void m6283h(String str) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.f11848e = str;
    }

    /* JADX INFO: renamed from: i */
    public final void m6284i(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f11852i = uri;
    }
}
