package p000;

import android.graphics.RectF;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hsf {

    /* JADX INFO: renamed from: a */
    public int f29396a;

    /* JADX INFO: renamed from: b */
    private hsa f29397b;

    /* JADX INFO: renamed from: c */
    private RectF f29398c;

    /* JADX INFO: renamed from: d */
    private float f29399d;

    /* JADX INFO: renamed from: e */
    private int f29400e;

    /* JADX INFO: renamed from: f */
    private long f29401f;

    /* JADX INFO: renamed from: g */
    private byte f29402g;

    /* JADX INFO: renamed from: a */
    public final hsg m10686a() {
        int i;
        hsa hsaVar;
        RectF rectF;
        if (this.f29402g == 7 && (i = this.f29396a) != 0 && (hsaVar = this.f29397b) != null && (rectF = this.f29398c) != null) {
            return new hsg(i, hsaVar, rectF, this.f29399d, this.f29400e, this.f29401f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f29396a == 0) {
            sb.append(" status");
        }
        if (this.f29397b == null) {
            sb.append(" trackerType");
        }
        if (this.f29398c == null) {
            sb.append(" roi");
        }
        if ((this.f29402g & 1) == 0) {
            sb.append(" confidence");
        }
        if ((this.f29402g & 2) == 0) {
            sb.append(HRLmc.ETNku);
        }
        if ((this.f29402g & 4) == 0) {
            sb.append(" trackedLengthMs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m10687b(float f) {
        this.f29399d = f;
        this.f29402g = (byte) (this.f29402g | 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m10688c(int i) {
        this.f29400e = i;
        this.f29402g = (byte) (this.f29402g | 2);
    }

    /* JADX INFO: renamed from: d */
    public final void m10689d(RectF rectF) {
        if (rectF == null) {
            throw new NullPointerException("Null roi");
        }
        this.f29398c = rectF;
    }

    /* JADX INFO: renamed from: e */
    public final void m10690e(long j) {
        this.f29401f = j;
        this.f29402g = (byte) (this.f29402g | 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m10691f(hsa hsaVar) {
        if (hsaVar == null) {
            throw new NullPointerException("Null trackerType");
        }
        this.f29397b = hsaVar;
    }
}
