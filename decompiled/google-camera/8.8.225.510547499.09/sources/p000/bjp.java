package p000;

import android.graphics.Path;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjp implements bjo {

    /* JADX INFO: renamed from: a */
    public final Path.FillType f3490a;

    /* JADX INFO: renamed from: b */
    public final bjc f3491b;

    /* JADX INFO: renamed from: c */
    public final bjd f3492c;

    /* JADX INFO: renamed from: d */
    public final bjf f3493d;

    /* JADX INFO: renamed from: e */
    public final bjf f3494e;

    /* JADX INFO: renamed from: f */
    public final String f3495f;

    /* JADX INFO: renamed from: g */
    public final boolean f3496g;

    /* JADX INFO: renamed from: h */
    public final int f3497h;

    public bjp(String str, int i, Path.FillType fillType, bjc bjcVar, bjd bjdVar, bjf bjfVar, bjf bjfVar2, boolean z) {
        this.f3497h = i;
        this.f3490a = fillType;
        this.f3491b = bjcVar;
        this.f3492c = bjdVar;
        this.f3493d = bjfVar;
        this.f3494e = bjfVar2;
        this.f3495f = str;
        this.f3496g = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhn(bgvVar, bkcVar, this);
    }
}
