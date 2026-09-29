package p265mj;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;

/* JADX INFO: renamed from: mj.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C7569c {

    /* JADX INFO: renamed from: a */
    public int f41714a;

    /* JADX INFO: renamed from: b */
    public final int f41715b;

    /* JADX INFO: renamed from: c */
    public int f41716c;

    /* JADX INFO: renamed from: d */
    public final C7570d f41717d;

    /* JADX INFO: renamed from: e */
    public boolean f41718e;

    /* JADX INFO: renamed from: f */
    public boolean f41719f;

    /* JADX INFO: renamed from: g */
    public int f41720g;

    public C7569c(int i10, int i11, int i12, C7570d c7570d, boolean z10, int i13, int i14) {
        i10 = (i14 & 1) != 0 ? 0 : i10;
        i11 = (i14 & 2) != 0 ? 0 : i11;
        i12 = (i14 & 4) != 0 ? 0 : i12;
        z10 = (i14 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? false : z10;
        i13 = (i14 & 256) != 0 ? -1 : i13;
        C5207g.m11111f(c7570d, "token");
        this.f41714a = i10;
        this.f41715b = i11;
        this.f41716c = i12;
        this.f41717d = c7570d;
        this.f41718e = false;
        this.f41719f = z10;
        this.f41720g = i13;
    }
}
