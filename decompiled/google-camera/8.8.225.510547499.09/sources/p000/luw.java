package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class luw extends luz {

    /* JADX INFO: renamed from: A */
    private volatile transient mrm f39310A;

    /* JADX INFO: renamed from: a */
    private final lva f39311a;

    /* JADX INFO: renamed from: b */
    private final lus f39312b;

    /* JADX INFO: renamed from: c */
    private final luy f39313c;

    /* JADX INFO: renamed from: d */
    private final Float f39314d;

    /* JADX INFO: renamed from: e */
    private final mws f39315e;

    /* JADX INFO: renamed from: f */
    private final mrm f39316f;

    /* JADX INFO: renamed from: g */
    private final mrm f39317g;

    /* JADX INFO: renamed from: h */
    private final mrm f39318h;

    /* JADX INFO: renamed from: i */
    private final mrm f39319i;

    /* JADX INFO: renamed from: j */
    private final mrm f39320j;

    /* JADX INFO: renamed from: k */
    private final mrm f39321k;

    /* JADX INFO: renamed from: l */
    private final mrm f39322l;

    /* JADX INFO: renamed from: m */
    private final mrm f39323m;

    /* JADX INFO: renamed from: n */
    private final mrm f39324n;

    /* JADX INFO: renamed from: o */
    private final mrm f39325o;

    /* JADX INFO: renamed from: p */
    private final mrm f39326p;

    /* JADX INFO: renamed from: q */
    private final mrm f39327q;

    /* JADX INFO: renamed from: r */
    private final mrm f39328r;

    /* JADX INFO: renamed from: s */
    private final mrm f39329s;

    /* JADX INFO: renamed from: t */
    private final mrm f39330t;

    /* JADX INFO: renamed from: u */
    private final mrm f39331u;

    /* JADX INFO: renamed from: v */
    private final mrm f39332v;

    /* JADX INFO: renamed from: w */
    private final mrm f39333w;

    /* JADX INFO: renamed from: x */
    private final mrm f39334x;

    /* JADX INFO: renamed from: y */
    private final mrm f39335y;

    /* JADX INFO: renamed from: z */
    private final mrm f39336z;

    public luw(lva lvaVar, lus lusVar, luy luyVar, Float f, mws mwsVar, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, mrm mrmVar5, mrm mrmVar6, mrm mrmVar7, mrm mrmVar8, mrm mrmVar9, mrm mrmVar10, mrm mrmVar11, mrm mrmVar12, mrm mrmVar13, mrm mrmVar14, mrm mrmVar15, mrm mrmVar16, mrm mrmVar17, mrm mrmVar18, mrm mrmVar19, mrm mrmVar20, mrm mrmVar21) {
        if (lvaVar == null) {
            throw new NullPointerException("Null text");
        }
        this.f39311a = lvaVar;
        if (lusVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f39312b = lusVar;
        if (luyVar == null) {
            throw new NullPointerException("Null engineType");
        }
        this.f39313c = luyVar;
        if (f == null) {
            throw new NullPointerException("Null confidence");
        }
        this.f39314d = f;
        if (mwsVar == null) {
            throw new NullPointerException("Null boundingPolygons");
        }
        this.f39315e = mwsVar;
        if (mrmVar == null) {
            throw new NullPointerException("Null textImage");
        }
        this.f39316f = mrmVar;
        if (mrmVar2 == null) {
            throw new NullPointerException("Null unstructuredText");
        }
        this.f39317g = mrmVar2;
        if (mrmVar3 == null) {
            throw new NullPointerException("Null singleResultTextAnnotator");
        }
        this.f39318h = mrmVar3;
        if (mrmVar4 == null) {
            throw new NullPointerException("Null barcode");
        }
        this.f39319i = mrmVar4;
        if (mrmVar5 == null) {
            throw new NullPointerException("Null calendarBegin");
        }
        this.f39320j = mrmVar5;
        if (mrmVar6 == null) {
            throw new NullPointerException("Null calendarEnd");
        }
        this.f39321k = mrmVar6;
        if (mrmVar7 == null) {
            throw new NullPointerException("Null contact");
        }
        this.f39322l = mrmVar7;
        if (mrmVar8 == null) {
            throw new NullPointerException("Null wifiNetwork");
        }
        this.f39323m = mrmVar8;
        if (mrmVar9 == null) {
            throw new NullPointerException("Null linkedResults");
        }
        this.f39324n = mrmVar9;
        if (mrmVar10 == null) {
            throw new NullPointerException("Null textOrientation");
        }
        this.f39325o = mrmVar10;
        if (mrmVar11 == null) {
            throw new NullPointerException("Null frameInfo");
        }
        this.f39326p = mrmVar11;
        if (mrmVar12 == null) {
            throw new NullPointerException("Null detectedDocument");
        }
        this.f39327q = mrmVar12;
        if (mrmVar13 == null) {
            throw new NullPointerException("Null sceneClassification");
        }
        this.f39328r = mrmVar13;
        if (mrmVar14 == null) {
            throw new NullPointerException("Null sceneClassificationScore");
        }
        this.f39329s = mrmVar14;
        if (mrmVar15 == null) {
            throw new NullPointerException("Null sms");
        }
        this.f39330t = mrmVar15;
        if (mrmVar16 == null) {
            throw new NullPointerException("Null calendarEvent");
        }
        this.f39331u = mrmVar16;
        if (mrmVar17 == null) {
            throw new NullPointerException("Null geo");
        }
        this.f39332v = mrmVar17;
        if (mrmVar18 == null) {
            throw new NullPointerException("Null detection");
        }
        this.f39333w = mrmVar18;
        if (mrmVar19 == null) {
            throw new NullPointerException("Null shoppingInfo");
        }
        this.f39334x = mrmVar19;
        if (mrmVar20 == null) {
            throw new NullPointerException("Null classifications");
        }
        this.f39335y = mrmVar20;
        if (mrmVar21 == null) {
            throw new NullPointerException("Null language");
        }
        this.f39336z = mrmVar21;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: A */
    public final mrm mo16036A() {
        mrm mrmVarM16829i;
        int i;
        if (this.f39310A == null) {
            synchronized (this) {
                if (this.f39310A == null) {
                    mws mwsVar = this.f39315e;
                    if (mwsVar.isEmpty()) {
                        mrmVarM16829i = mqu.f41450a;
                    } else {
                        int i2 = ((mzr) mwsVar).f41859c;
                        float fMax = Float.MIN_VALUE;
                        float fMax2 = Float.MIN_VALUE;
                        float fMin = Float.MAX_VALUE;
                        float fMin2 = Float.MAX_VALUE;
                        int i3 = 0;
                        while (i3 < i2) {
                            Iterator it = ((meg) mwsVar.get(i3)).iterator();
                            while (true) {
                                i = i3 + 1;
                                if (it.hasNext()) {
                                    PointF pointF = (PointF) it.next();
                                    fMax = Math.max(pointF.x, fMax);
                                    fMin = Math.min(pointF.x, fMin);
                                    fMin2 = Math.min(pointF.y, fMin2);
                                    fMax2 = Math.max(pointF.y, fMax2);
                                }
                            }
                            i3 = i;
                        }
                        mrmVarM16829i = mrm.m16829i(new RectF(fMin, fMin2, fMax, fMax2));
                    }
                    this.f39310A = mrmVarM16829i;
                    if (this.f39310A == null) {
                        throw new NullPointerException("getAxisAlignedBoundingBox() cannot return null");
                    }
                }
            }
        }
        return this.f39310A;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: B */
    public final void mo16037B() {
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: a */
    public final lus mo16038a() {
        return this.f39312b;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: b */
    public final luy mo16039b() {
        return this.f39313c;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: c */
    public final lva mo16040c() {
        return this.f39311a;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: d */
    public final mrm mo16041d() {
        return this.f39319i;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: e */
    public final mrm mo16042e() {
        return this.f39320j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luz) {
            luz luzVar = (luz) obj;
            if (this.f39311a.equals(luzVar.mo16040c()) && this.f39312b.equals(luzVar.mo16038a()) && this.f39313c.equals(luzVar.mo16039b()) && this.f39314d.equals(luzVar.mo16063z()) && mkv.m16505M(this.f39315e, luzVar.mo16062y()) && this.f39316f.equals(luzVar.mo16058u()) && this.f39317g.equals(luzVar.mo16060w()) && this.f39318h.equals(luzVar.mo16056s()) && this.f39319i.equals(luzVar.mo16041d()) && this.f39320j.equals(luzVar.mo16042e()) && this.f39321k.equals(luzVar.mo16043f())) {
                luzVar.mo16037B();
                if (this.f39322l.equals(luzVar.mo16046i()) && this.f39323m.equals(luzVar.mo16061x()) && this.f39324n.equals(luzVar.mo16052o()) && this.f39325o.equals(luzVar.mo16059v()) && this.f39326p.equals(luzVar.mo16049l()) && this.f39327q.equals(luzVar.mo16047j()) && this.f39328r.equals(luzVar.mo16053p()) && this.f39329s.equals(luzVar.mo16054q()) && this.f39330t.equals(luzVar.mo16057t()) && this.f39331u.equals(luzVar.mo16044g()) && this.f39332v.equals(luzVar.mo16050m()) && this.f39333w.equals(luzVar.mo16048k()) && this.f39334x.equals(luzVar.mo16055r()) && this.f39335y.equals(luzVar.mo16045h()) && this.f39336z.equals(luzVar.mo16051n())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: f */
    public final mrm mo16043f() {
        return this.f39321k;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: g */
    public final mrm mo16044g() {
        return this.f39331u;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: h */
    public final mrm mo16045h() {
        return this.f39335y;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((this.f39311a.hashCode() ^ 1000003) * 1000003) ^ this.f39312b.hashCode()) * 1000003) ^ this.f39313c.hashCode()) * 1000003) ^ this.f39314d.hashCode()) * 1000003) ^ this.f39315e.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f39319i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ this.f39322l.hashCode()) * 1000003) ^ this.f39323m.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f39330t.hashCode()) * 1000003) ^ this.f39331u.hashCode()) * 1000003) ^ this.f39332v.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: i */
    public final mrm mo16046i() {
        return this.f39322l;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: j */
    public final mrm mo16047j() {
        return this.f39327q;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: k */
    public final mrm mo16048k() {
        return this.f39333w;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: l */
    public final mrm mo16049l() {
        return this.f39326p;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: m */
    public final mrm mo16050m() {
        return this.f39332v;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: n */
    public final mrm mo16051n() {
        return this.f39336z;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: o */
    public final mrm mo16052o() {
        return this.f39324n;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: p */
    public final mrm mo16053p() {
        return this.f39328r;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: q */
    public final mrm mo16054q() {
        return this.f39329s;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: r */
    public final mrm mo16055r() {
        return this.f39334x;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: s */
    public final mrm mo16056s() {
        return this.f39318h;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: t */
    public final mrm mo16057t() {
        return this.f39330t;
    }

    public final String toString() {
        return "SemanticResult{text=" + this.f39311a.toString() + ", type=" + this.f39312b.toString() + ", engineType=" + this.f39313c.toString() + ", confidence=" + this.f39314d + ", boundingPolygons=" + this.f39315e.toString() + ", textImage=Optional.absent(), unstructuredText=Optional.absent(), singleResultTextAnnotator=Optional.absent(), barcode=" + this.f39319i.toString() + ", calendarBegin=Optional.absent(), calendarEnd=Optional.absent(), hasStreetAddress=false, contact=" + this.f39322l.toString() + ", wifiNetwork=" + this.f39323m.toString() + ", linkedResults=Optional.absent(), textOrientation=Optional.absent(), frameInfo=Optional.absent(), detectedDocument=Optional.absent(), sceneClassification=Optional.absent(), sceneClassificationScore=Optional.absent(), sms=" + this.f39330t.toString() + ", calendarEvent=" + this.f39331u.toString() + ", geo=" + this.f39332v.toString() + ", detection=Optional.absent(), shoppingInfo=Optional.absent(), classifications=Optional.absent(), language=Optional.absent()}";
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: u */
    public final mrm mo16058u() {
        return this.f39316f;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: v */
    public final mrm mo16059v() {
        return this.f39325o;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: w */
    public final mrm mo16060w() {
        return this.f39317g;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: x */
    public final mrm mo16061x() {
        return this.f39323m;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: y */
    public final mws mo16062y() {
        return this.f39315e;
    }

    @Override // p000.luz
    /* JADX INFO: renamed from: z */
    public final Float mo16063z() {
        return this.f39314d;
    }
}
