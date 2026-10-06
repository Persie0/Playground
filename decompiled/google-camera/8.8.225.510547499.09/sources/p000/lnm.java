package p000;

import android.R;
import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnm {

    /* JADX INFO: renamed from: a */
    public final short[] f38759a;

    /* JADX INFO: renamed from: b */
    public final short[] f38760b;

    /* JADX INFO: renamed from: c */
    public final int f38761c;

    /* JADX INFO: renamed from: d */
    public long f38762d;

    public lnm(Random random) {
        lku.m15669w(true);
        this.f38759a = new short[256];
        this.f38760b = new short[256];
        this.f38761c = (random.nextInt() & (-33686019)) | R.attr.cacheColorHint;
        this.f38762d = 0L;
    }
}
