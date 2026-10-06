package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grl {

    /* JADX INFO: renamed from: e */
    public Rect f26147e;

    /* JADX INFO: renamed from: h */
    private final kpw f26150h;

    /* JADX INFO: renamed from: a */
    public kmq f26143a = null;

    /* JADX INFO: renamed from: b */
    public gyw f26144b = gyw.UNKNOWN;

    /* JADX INFO: renamed from: c */
    public kay f26145c = kay.CLOCKWISE_0;

    /* JADX INFO: renamed from: d */
    public nps f26146d = null;

    /* JADX INFO: renamed from: f */
    public Long f26148f = null;

    /* JADX INFO: renamed from: i */
    private Long f26151i = null;

    /* JADX INFO: renamed from: g */
    public gzl f26149g = gzl.OFF;

    public grl(kpw kpwVar) {
        this.f26147e = null;
        this.f26150h = kpwVar;
        this.f26147e = kpwVar.mo7249e();
    }

    /* JADX INFO: renamed from: a */
    public final grm m9669a() {
        Long lValueOf = this.f26148f;
        Long lValueOf2 = this.f26151i;
        if (lValueOf == null) {
            lValueOf = Long.valueOf(this.f26150h.mo7248d());
        }
        if (lValueOf2 == null) {
            lValueOf2 = Long.valueOf(ins.m11547a(lValueOf.longValue()));
        }
        kpw kpwVar = this.f26150h;
        gyw gywVar = this.f26144b;
        kmq kmqVar = this.f26143a;
        kay kayVar = this.f26145c;
        nps npsVar = this.f26146d;
        Rect rect = this.f26147e;
        return new grm(kpwVar, gywVar, kmqVar, kayVar, npsVar, rect == null ? kpwVar.mo7249e() : rect, lValueOf.longValue(), lValueOf2.longValue(), this.f26149g);
    }

    /* JADX INFO: renamed from: b */
    public final void m9670b(long j) {
        this.f26151i = Long.valueOf(j);
    }
}
