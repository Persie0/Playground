package p000;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bwa implements bvm {

    /* JADX INFO: renamed from: a */
    private final Context f4625a;

    /* JADX INFO: renamed from: b */
    private final Class f4626b;

    public bwa(Context context, Class cls) {
        this.f4625a = context;
        this.f4626b = cls;
    }

    @Override // p000.bvm
    /* JADX INFO: renamed from: b */
    public final bvl mo3080b(bvq bvqVar) {
        return new bwc(this.f4625a, bvqVar.m3100a(File.class, this.f4626b), bvqVar.m3100a(Uri.class, this.f4626b), this.f4626b);
    }
}
