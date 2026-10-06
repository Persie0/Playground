package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.ShotMetadata;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eqx implements kba {

    /* JADX INFO: renamed from: a */
    public final InterleavedImageU8 f15217a;

    /* JADX INFO: renamed from: b */
    public final ShotMetadata f15218b;

    /* JADX INFO: renamed from: c */
    public final gpv f15219c;

    /* JADX INFO: renamed from: d */
    public final int f15220d;

    public eqx(InterleavedImageU8 interleavedImageU8, int i, ShotMetadata shotMetadata) {
        this.f15217a = interleavedImageU8;
        this.f15220d = i;
        this.f15218b = shotMetadata;
        this.f15219c = enc.m7549e(m7710a(shotMetadata.m5105k()), m7710a(shotMetadata.m5104j()), mqu.f41450a);
    }

    /* JADX INFO: renamed from: a */
    private static mrm m7710a(String str) {
        return mro.m16832b(str) ? mqu.f41450a : ksh.m14797c(str);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        this.f15217a.m5007g();
    }
}
