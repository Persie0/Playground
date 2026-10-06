package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kri {

    /* JADX INFO: renamed from: a */
    public Context f37038a;

    /* JADX INFO: renamed from: b */
    public ContentResolver f37039b;

    /* JADX INFO: renamed from: c */
    public String f37040c;

    /* JADX INFO: renamed from: d */
    public int f37041d;

    /* JADX INFO: renamed from: e */
    public String f37042e;

    /* JADX INFO: renamed from: f */
    public byte f37043f;

    /* JADX INFO: renamed from: g */
    private Uri f37044g;

    /* JADX INFO: renamed from: h */
    private Uri f37045h;

    /* JADX INFO: renamed from: i */
    private String f37046i;

    /* JADX INFO: renamed from: j */
    private String f37047j;

    /* JADX INFO: renamed from: k */
    private String f37048k;

    /* JADX INFO: renamed from: l */
    private int f37049l;

    /* JADX INFO: renamed from: m */
    private int f37050m;

    /* JADX INFO: renamed from: a */
    public final krj m14751a() {
        Context context;
        ContentResolver contentResolver;
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.f37043f == 15 && (context = this.f37038a) != null && (contentResolver = this.f37039b) != null && (uri = this.f37044g) != null && (uri2 = this.f37045h) != null && (str = this.f37040c) != null && (str2 = this.f37046i) != null && (str3 = this.f37047j) != null && (str4 = this.f37042e) != null && (str5 = this.f37048k) != null) {
            return new krj(context, contentResolver, uri, uri2, str, str2, str3, this.f37041d, str4, str5, this.f37049l, this.f37050m);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f37038a == null) {
            sb.append(" context");
        }
        if (this.f37039b == null) {
            sb.append(" contentResolver");
        }
        if (this.f37044g == null) {
            sb.append(" photoInsertUri");
        }
        if (this.f37045h == null) {
            sb.append(" videoInsertUri");
        }
        if (this.f37040c == null) {
            sb.append(" displayNameColumnName");
        }
        if (this.f37046i == null) {
            sb.append(" mimeTypeColumnName");
        }
        if (this.f37047j == null) {
            sb.append(" isPendingColumnName");
        }
        if ((this.f37043f & 1) == 0) {
            sb.append(" isPendingTrue");
        }
        if ((this.f37043f & 2) == 0) {
            sb.append(" isPendingFalse");
        }
        if (this.f37042e == null) {
            sb.append(" relativePathColumnName");
        }
        if (this.f37048k == null) {
            sb.append(" mediaTypeColumnName");
        }
        if ((this.f37043f & 4) == 0) {
            sb.append(" mediaTypeImage");
        }
        if ((this.f37043f & 8) == 0) {
            sb.append(" mediaTypeVideo");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m14752b() {
        this.f37047j = "is_pending";
    }

    /* JADX INFO: renamed from: c */
    public final void m14753c() {
        this.f37048k = "media_type";
    }

    /* JADX INFO: renamed from: d */
    public final void m14754d(int i) {
        this.f37049l = i;
        this.f37043f = (byte) (this.f37043f | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m14755e(int i) {
        this.f37050m = i;
        this.f37043f = (byte) (this.f37043f | 8);
    }

    /* JADX INFO: renamed from: f */
    public final void m14756f() {
        this.f37046i = "mime_type";
    }

    /* JADX INFO: renamed from: g */
    public final void m14757g(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null photoInsertUri");
        }
        this.f37044g = uri;
    }

    /* JADX INFO: renamed from: h */
    public final void m14758h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null videoInsertUri");
        }
        this.f37045h = uri;
    }
}
