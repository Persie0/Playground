package p000;

import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gyo {

    /* JADX INFO: renamed from: a */
    private Uri f26861a;

    /* JADX INFO: renamed from: b */
    private boolean f26862b;

    /* JADX INFO: renamed from: c */
    private byte f26863c;

    /* JADX INFO: renamed from: d */
    private Object f26864d;

    /* JADX INFO: renamed from: a */
    public final gyp m9990a() {
        Uri uri;
        Object obj;
        Uri uri2 = this.f26861a;
        if (uri2 == null) {
            throw new IllegalStateException("Property \"uri\" has not been set");
        }
        lku.m15614I(!uri2.equals(Uri.EMPTY), "MediaStoreRecord should only be created with a valid MediaStore Uri");
        String lastPathSegment = uri2.getLastPathSegment();
        lastPathSegment.getClass();
        long j = Long.parseLong(lastPathSegment);
        int i = this.f26863c | 1;
        this.f26863c = (byte) i;
        if (i == 3 && (uri = this.f26861a) != null && (obj = this.f26864d) != null) {
            return new gyp(j, uri, (gyw) obj, this.f26862b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f26863c & 1) == 0) {
            sb.append(" mediaStoreId");
        }
        if (this.f26861a == null) {
            sb.append(" uri");
        }
        if (this.f26864d == null) {
            sb.append(" sessionType");
        }
        if ((this.f26863c & 2) == 0) {
            sb.append(" secure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m9991b(boolean z) {
        this.f26862b = z;
        this.f26863c = (byte) (this.f26863c | 2);
    }

    /* JADX INFO: renamed from: c */
    public final void m9992c(gyw gywVar) {
        if (gywVar == null) {
            throw new NullPointerException("Null sessionType");
        }
        this.f26864d = gywVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m9993d(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f26861a = uri;
    }

    /* JADX INFO: renamed from: e */
    public final cow m9994e() {
        Uri uri;
        Object obj;
        if (this.f26863c == 1 && (uri = this.f26861a) != null && (obj = this.f26864d) != null) {
            return new cow(uri, (String) obj, this.f26862b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f26861a == null) {
            sb.append(" uri");
        }
        if (this.f26864d == null) {
            sb.append(" mediaId");
        }
        if (this.f26863c == 0) {
            sb.append(" isDeleted");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: f */
    public final void m9995f(boolean z) {
        this.f26862b = z;
        this.f26863c = (byte) 1;
    }

    /* JADX INFO: renamed from: g */
    public final void m9996g(String str) {
        if (str == null) {
            throw new NullPointerException("Null mediaId");
        }
        this.f26864d = str;
    }

    /* JADX INFO: renamed from: h */
    public final void m9997h(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f26861a = uri;
    }
}
