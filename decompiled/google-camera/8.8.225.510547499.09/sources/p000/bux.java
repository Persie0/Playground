package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bux implements bvm {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f4509a;

    /* JADX INFO: renamed from: b */
    private final Object f4510b;

    public bux(int i, byte[] bArr) {
        this.f4509a = i;
        this.f4510b = new bzq((short[]) null);
    }

    public bux(Context context, int i) {
        this.f4509a = i;
        this.f4510b = context;
    }

    public bux(buz buzVar, int i) {
        this.f4509a = i;
        this.f4510b = buzVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [buz, java.lang.Object] */
    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        switch (this.f4509a) {
            case 0:
                return new bvb((buz) this.f4510b, 0);
            case 1:
                return new bvp(1);
            case 2:
                return new buw((Context) this.f4510b, bvqVar.m3100a(Integer.class, AssetFileDescriptor.class), 3);
            default:
                return new buw((Context) this.f4510b, bvqVar.m3100a(Integer.class, InputStream.class), 3);
        }
    }
}
