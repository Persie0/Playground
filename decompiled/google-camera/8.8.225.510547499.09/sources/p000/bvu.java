package p000;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvu implements bvm, bvv {

    /* JADX INFO: renamed from: a */
    private final ContentResolver f4559a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4560b;

    /* JADX INFO: renamed from: c */
    private final bko f4561c;

    @Deprecated
    public bvu(ContentResolver contentResolver, bko bkoVar, int i, byte[] bArr) {
        this.f4560b = i;
        this.f4559a = contentResolver;
        this.f4561c = bkoVar;
    }

    @Override // p000.bvv
    /* JADX INFO: renamed from: a */
    public final bra mo3104a(Uri uri) {
        switch (this.f4560b) {
            case 0:
                return new bri(this.f4559a, uri);
            case 1:
                return new bqw(this.f4559a, uri);
            default:
                return new brq(this.f4559a, uri);
        }
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4560b) {
            case 0:
                break;
            case 1:
                break;
        }
        return new bvw(this, this.f4561c, null);
    }
}
