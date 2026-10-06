package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bup implements bvm {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4496a;

    public bup(int i) {
        this.f4496a = i;
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4496a) {
            case 0:
                return new bvb(new buo(0), 1);
            case 1:
                return new bvb(new buo(1), 1);
            case 2:
                return new bur();
            case 3:
                return new bvb(bvqVar.m3100a(Uri.class, AssetFileDescriptor.class), 3);
            case 4:
                return new bvb(bvqVar.m3100a(Uri.class, ParcelFileDescriptor.class), 3);
            default:
                return new bvb(bvqVar.m3100a(Uri.class, InputStream.class), 3);
        }
    }
}
