package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nrd {

    /* JADX INFO: renamed from: a */
    public static final nrd f44153a = new nrd();

    /* JADX INFO: renamed from: b */
    public static final nrd f44154b = new nrd(pIeXJQLZLfgIN.yODsxXjwZHcFuox);

    /* JADX INFO: renamed from: c */
    public static final nrd f44155c = new nrd("kBGGR");

    /* JADX INFO: renamed from: d */
    public static final nrd f44156d = new nrd("kGRBG");

    /* JADX INFO: renamed from: e */
    public static final nrd f44157e = new nrd("kGBRG");

    /* JADX INFO: renamed from: g */
    private static int f44158g;

    /* JADX INFO: renamed from: f */
    public final int f44159f;

    /* JADX INFO: renamed from: h */
    private final String f44160h;

    static {
        new nrd("kQuadRGGB");
        new nrd("kQuadBGGR");
        new nrd("kQuadGRBG");
        new nrd("kQuadGBRG");
        new nrd("kNone");
        f44158g = 0;
    }

    private nrd() {
        this.f44160h = "kInvalid";
        this.f44159f = 0;
        f44158g = 1;
    }

    private nrd(String str) {
        this.f44160h = str;
        int i = f44158g;
        f44158g = i + 1;
        this.f44159f = i;
    }

    public final String toString() {
        return this.f44160h;
    }
}
