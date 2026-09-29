package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: bw */
/* JADX INFO: loaded from: classes.dex */
public final class C0826bw implements z23 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9079a;

    public /* synthetic */ C0826bw(int i) {
        this.f9079a = i;
    }

    @Override // p000.z23
    /* JADX INFO: renamed from: a */
    public final a33 mo4196a(Object obj, sz6 sz6Var) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.f9079a) {
            case 0:
                Uri uri = (Uri) obj;
                if (AbstractC3057h.m12989d(uri)) {
                    return new C2905cw(uri, sz6Var, i);
                }
                return null;
            case 1:
                return new fd0((Bitmap) obj, sz6Var, i);
            case 2:
                return new fd0((ByteBuffer) obj, sz6Var, i2);
            case 3:
                Uri uri2 = (Uri) obj;
                if (fa4.m11650l(uri2.getScheme(), "content")) {
                    return new C2905cw(uri2, sz6Var, i2);
                }
                return null;
            case 4:
                return new fd0((Drawable) obj, sz6Var, i3);
            case 5:
                return new k33((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (fa4.m11650l(uri3.getScheme(), "android.resource")) {
                    return new C2905cw(uri3, sz6Var, i3);
                }
                return null;
        }
    }
}
