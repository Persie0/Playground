package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvr implements bvm {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4554a;

    /* JADX INFO: renamed from: b */
    private final Object f4555b;

    public bvr(int i) {
        this.f4554a = i;
        this.f4555b = new bko((byte[]) null, (byte[]) null, (byte[]) null);
    }

    public bvr(Context context, int i) {
        this.f4554a = i;
        this.f4555b = context;
    }

    public bvr(Resources resources, int i) {
        this.f4554a = i;
        this.f4555b = resources;
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4554a) {
            case 0:
                return new buw((Resources) this.f4555b, bvqVar.m3100a(Uri.class, AssetFileDescriptor.class), 2);
            case 1:
                return new bvb((Context) this.f4555b, 2);
            case 2:
                return new buw((Resources) this.f4555b, bvqVar.m3100a(Uri.class, ParcelFileDescriptor.class), 2);
            case 3:
                return new buw((Resources) this.f4555b, bvqVar.m3100a(Uri.class, InputStream.class), 2);
            case 4:
                return new buw((Resources) this.f4555b, bvp.f4548a, 2);
            case 5:
                return new bvz((bko) this.f4555b, null, null, null);
            case 6:
                return new bvb((Context) this.f4555b, 4, (byte[]) null);
            default:
                return new bvb((Context) this.f4555b, 5, (char[]) null);
        }
    }
}
