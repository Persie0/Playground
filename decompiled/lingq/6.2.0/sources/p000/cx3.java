package p000;

import android.net.Uri;
import coil.fetch.C0861a;

/* JADX INFO: loaded from: classes.dex */
public final class cx3 implements z23 {

    /* JADX INFO: renamed from: a */
    public final cs4 f34677a;

    /* JADX INFO: renamed from: b */
    public final cs4 f34678b;

    /* JADX INFO: renamed from: c */
    public final boolean f34679c;

    public cx3(cs4 cs4Var, cs4 cs4Var2, boolean z) {
        this.f34677a = cs4Var;
        this.f34678b = cs4Var2;
        this.f34679c = z;
    }

    @Override // p000.z23
    /* JADX INFO: renamed from: a */
    public final a33 mo4196a(Object obj, sz6 sz6Var) {
        Uri uri = (Uri) obj;
        if (!fa4.m11650l(uri.getScheme(), "http") && !fa4.m11650l(uri.getScheme(), "https")) {
            return null;
        }
        return new C0861a(uri.toString(), sz6Var, this.f34677a, this.f34678b, this.f34679c);
    }
}
