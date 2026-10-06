package p000;

import android.net.Uri;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lti {

    /* JADX INFO: renamed from: a */
    public boolean f39158a;

    /* JADX INFO: renamed from: b */
    public byte f39159b;

    /* JADX INFO: renamed from: c */
    public lku f39160c;

    /* JADX INFO: renamed from: d */
    private Uri f39161d;

    /* JADX INFO: renamed from: e */
    private nyw f39162e;

    /* JADX INFO: renamed from: f */
    private ltd f39163f;

    /* JADX INFO: renamed from: g */
    private mws f39164g;

    /* JADX INFO: renamed from: a */
    public final ltj m15966a() {
        Uri uri;
        nyw nywVar;
        ltd ltdVar;
        lku lkuVar;
        if (this.f39164g == null) {
            int i = mws.f41739d;
            this.f39164g = mzr.f41857a;
        }
        if (this.f39159b == 3 && (uri = this.f39161d) != null && (nywVar = this.f39162e) != null && (ltdVar = this.f39163f) != null && (lkuVar = this.f39160c) != null) {
            return new ltj(uri, nywVar, ltdVar, this.f39164g, lkuVar, this.f39158a, null, null, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39161d == null) {
            sb.append(" uri");
        }
        if (this.f39162e == null) {
            sb.append(" schema");
        }
        if (this.f39163f == null) {
            sb.append(rmwTRjObXLGH.ikWvldkcFNpmbq);
        }
        if (this.f39160c == null) {
            sb.append(" variantConfig");
        }
        if ((this.f39159b & 1) == 0) {
            sb.append(" useGeneratedExtensionRegistry");
        }
        if ((this.f39159b & 2) == 0) {
            sb.append(" enableTracing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m15967b() {
        this.f39159b = (byte) (this.f39159b | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m15968c(ltd ltdVar) {
        if (ltdVar == null) {
            throw new NullPointerException("Null handler");
        }
        this.f39163f = ltdVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m15969d(nyw nywVar) {
        if (nywVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f39162e = nywVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m15970e(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f39161d = uri;
    }
}
