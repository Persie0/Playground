package com.lingq.feature.search.search;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.core.domain.user.C1539a;
import com.lingq.feature.search.domain.C2765a;
import com.lingq.feature.search.domain.C2766b;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.C3139j9;
import p000.C3639u8;
import p000.C3750x8;
import p000.InterfaceC3812yx;
import p000.ap8;
import p000.bp8;
import p000.c18;
import p000.c23;
import p000.cp8;
import p000.dp8;
import p000.ep8;
import p000.fp8;
import p000.gm5;
import p000.gp8;
import p000.hp8;
import p000.ip8;
import p000.jh9;
import p000.jp8;
import p000.n23;
import p000.nn1;
import p000.oo8;
import p000.po8;
import p000.qj2;
import p000.qo8;
import p000.r23;
import p000.ro8;
import p000.so8;
import p000.to8;
import p000.ui3;
import p000.un1;
import p000.uo8;
import p000.ux5;
import p000.vo8;
import p000.wfb;
import p000.wkd;
import p000.wo8;
import p000.xfa;
import p000.xi9;
import p000.xo8;
import p000.yo8;
import p000.zo8;
import p000.zs8;
import p000.zyc;

/* JADX INFO: renamed from: com.lingq.feature.search.search.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2775b {

    /* JADX INFO: renamed from: a */
    public final n23 f33065a;

    /* JADX INFO: renamed from: b */
    public final C3139j9 f33066b;

    /* JADX INFO: renamed from: c */
    public final C2765a f33067c;

    /* JADX INFO: renamed from: d */
    public final C1381c f33068d;

    /* JADX INFO: renamed from: e */
    public final qj2 f33069e;

    /* JADX INFO: renamed from: f */
    public final c23 f33070f;

    /* JADX INFO: renamed from: g */
    public final r23 f33071g;

    /* JADX INFO: renamed from: h */
    public final c23 f33072h;

    /* JADX INFO: renamed from: i */
    public final jh9 f33073i;

    /* JADX INFO: renamed from: j */
    public final C3639u8 f33074j;

    /* JADX INFO: renamed from: k */
    public final C3639u8 f33075k;

    /* JADX INFO: renamed from: l */
    public final C3750x8 f33076l;

    /* JADX INFO: renamed from: m */
    public final C3750x8 f33077m;

    /* JADX INFO: renamed from: n */
    public final C1539a f33078n;

    /* JADX INFO: renamed from: o */
    public final C1525a f33079o;

    /* JADX INFO: renamed from: p */
    public final C2766b f33080p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC3812yx f33081q;

    /* JADX INFO: renamed from: r */
    public final nn1 f33082r;

    /* JADX INFO: renamed from: s */
    public final un1 f33083s;

    /* JADX INFO: renamed from: t */
    public final C3244l f33084t;

    /* JADX INFO: renamed from: u */
    public final c18 f33085u;

    /* JADX INFO: renamed from: v */
    public zs8 f33086v;

    /* JADX INFO: renamed from: w */
    public zyc f33087w;

    /* JADX INFO: renamed from: x */
    public Pair f33088x;

    public C2775b(n23 n23Var, C3139j9 c3139j9, C2765a c2765a, C1381c c1381c, qj2 qj2Var, c23 c23Var, r23 r23Var, c23 c23Var2, jh9 jh9Var, C3639u8 c3639u8, C3639u8 c3639u9, C3750x8 c3750x8, C3750x8 c3750x9, C1539a c1539a, C1525a c1525a, wkd wkdVar, C2766b c2766b, InterfaceC3812yx interfaceC3812yx, nn1 nn1Var, un1 un1Var) {
        interfaceC3812yx.getClass();
        un1Var.getClass();
        this.f33065a = n23Var;
        this.f33066b = c3139j9;
        this.f33067c = c2765a;
        this.f33068d = c1381c;
        this.f33069e = qj2Var;
        this.f33070f = c23Var;
        this.f33071g = r23Var;
        this.f33072h = c23Var2;
        this.f33073i = jh9Var;
        this.f33074j = c3639u8;
        this.f33075k = c3639u9;
        this.f33076l = c3750x8;
        this.f33077m = c3750x9;
        this.f33078n = c1539a;
        this.f33079o = c1525a;
        this.f33080p = c2766b;
        this.f33081q = interfaceC3812yx;
        this.f33082r = nn1Var;
        this.f33083s = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new jp8());
        this.f33084t = c3244lM17114d;
        this.f33085u = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, new jp8());
        this.f33086v = new zs8("", 0, "en");
    }

    /* JADX INFO: renamed from: a */
    public static final void m9698a(C2775b c2775b, int i, List list) {
        AbstractC1263a.m7047b(c2775b.f33083s, c2775b.f33082r, ux5.m22988k(i, "downloadCourseLessons "), new SearchCollectionsStateHolder$downloadCourseLessons$2(list, c2775b, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m9699b(zyc zycVar) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        zs8 zs8Var;
        Object value9;
        Object value10;
        boolean z = zycVar instanceof fp8;
        un1 un1Var = this.f33083s;
        if (z) {
            fp8 fp8Var = (fp8) zycVar;
            wfb.m23926u(un1Var, null, null, new SearchCollectionsStateHolder$requestPremiumLesson$1(this, fp8Var.f39428a, fp8Var.f39429b, null), 3);
            return;
        }
        if (zycVar instanceof so8) {
            so8 so8Var = (so8) zycVar;
            wfb.m23926u(un1Var, null, null, new SearchCollectionsStateHolder$confirmPremiumLessonPurchase$1(this, so8Var.f61112b, so8Var.f61111a, null), 3);
            return;
        }
        boolean zEquals = zycVar.equals(yo8.f70175a);
        C3244l c3244l = this.f33084t;
        if (zEquals) {
            do {
                value10 = c3244l.getValue();
            } while (!c3244l.m15570h(value10, jp8.m14581a((jp8) value10, null, null, false, false, null, false, 62)));
            return;
        }
        if (zycVar.equals(xo8.f68444a)) {
            do {
                value9 = c3244l.getValue();
            } while (!c3244l.m15570h(value9, jp8.m14581a((jp8) value9, null, null, false, false, null, false, 61)));
            return;
        }
        if (zycVar.equals(qo8.f58017a)) {
            do {
                value8 = c3244l.getValue();
                zs8Var = this.f33086v;
            } while (!c3244l.m15570h(value8, jp8.m14581a((jp8) value8, null, null, false, false, wkd.m24040b(zs8Var.f72111c, zs8Var.f72109a), true, 13)));
            return;
        }
        if (zycVar.equals(uo8.f64139a)) {
            do {
                value7 = c3244l.getValue();
            } while (!c3244l.m15570h(value7, jp8.m14581a((jp8) value7, null, null, false, false, null, false, 47)));
            return;
        }
        if (zycVar.equals(vo8.f65723a)) {
            do {
                value6 = c3244l.getValue();
            } while (!c3244l.m15570h(value6, jp8.m14581a((jp8) value6, null, null, false, false, null, false, 31)));
            return;
        }
        boolean zEquals2 = zycVar.equals(to8.f62645a);
        nn1 nn1Var = this.f33082r;
        if (zEquals2) {
            zyc zycVar2 = this.f33087w;
            if (zycVar2 == null) {
                return;
            }
            this.f33087w = null;
            do {
                value5 = c3244l.getValue();
            } while (!c3244l.m15570h(value5, jp8.m14581a((jp8) value5, null, null, false, false, null, false, 59)));
            if (zycVar2 instanceof gp8) {
                gp8 gp8Var = (gp8) zycVar2;
                int i = gp8Var.f41160a;
                AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(i, "updateSave "), new SearchCollectionsStateHolder$updateSave$1(this, i, gp8Var.f41161b, null));
                return;
            }
            if (zycVar2 instanceof ap8) {
                int i2 = ((ap8) zycVar2).f7328a;
                AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(i2, "downloadLesson "), new SearchCollectionsStateHolder$downloadLesson$1(this, i2, null));
                return;
            }
            return;
        }
        if (zycVar.equals(zo8.f71862a)) {
            this.f33087w = null;
            do {
                value4 = c3244l.getValue();
            } while (!c3244l.m15570h(value4, jp8.m14581a((jp8) value4, null, null, false, false, null, false, 59)));
            return;
        }
        final int i3 = 0;
        if (zycVar instanceof ep8) {
            this.f33088x = new Pair(0, null);
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, jp8.m14581a((jp8) value3, null, null, false, true, null, false, 55)));
            return;
        }
        if (zycVar.equals(ro8.f59653a)) {
            Pair pair = this.f33088x;
            if (pair == null) {
                return;
            }
            int iIntValue = ((Number) pair.f47623a).intValue();
            this.f33088x = null;
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, jp8.m14581a((jp8) value2, null, null, false, false, null, false, 55)));
            AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(iIntValue, "downloadCourse "), new SearchCollectionsStateHolder$downloadCourse$1(this, iIntValue, null));
            return;
        }
        if (zycVar.equals(wo8.f67127a)) {
            this.f33088x = null;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jp8.m14581a((jp8) value, null, null, false, false, null, false, 55)));
            return;
        }
        if (zycVar instanceof ip8) {
            wfb.m23926u(un1Var, nn1Var, null, new SearchCollectionsStateHolder$handleAction$11(this, zycVar, null), 2);
            return;
        }
        if (zycVar instanceof gp8) {
            final gp8 gp8Var2 = (gp8) zycVar;
            final int i4 = 1;
            m9700c(gp8Var2, new ui3(this) { // from class: com.lingq.feature.search.search.a

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2775b f33063b;

                {
                    this.f33063b = this;
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    int i5 = i4;
                    xfa xfaVar = xfa.f68157a;
                    zyc zycVar3 = gp8Var2;
                    C2775b c2775b = this.f33063b;
                    switch (i5) {
                        case 0:
                            int i6 = ((ap8) zycVar3).f7328a;
                            AbstractC1263a.m7047b(c2775b.f33083s, c2775b.f33082r, ux5.m22988k(i6, "downloadLesson "), new SearchCollectionsStateHolder$downloadLesson$1(c2775b, i6, null));
                            break;
                        default:
                            gp8 gp8Var3 = (gp8) zycVar3;
                            int i7 = gp8Var3.f41160a;
                            AbstractC1263a.m7047b(c2775b.f33083s, c2775b.f33082r, ux5.m22988k(i7, "updateSave "), new SearchCollectionsStateHolder$updateSave$1(c2775b, i7, gp8Var3.f41161b, null));
                            break;
                    }
                    return xfaVar;
                }
            });
            return;
        }
        if (zycVar instanceof ap8) {
            final ap8 ap8Var = (ap8) zycVar;
            m9700c(ap8Var, new ui3(this) { // from class: com.lingq.feature.search.search.a

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2775b f33063b;

                {
                    this.f33063b = this;
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    int i5 = i3;
                    xfa xfaVar = xfa.f68157a;
                    zyc zycVar3 = ap8Var;
                    C2775b c2775b = this.f33063b;
                    switch (i5) {
                        case 0:
                            int i6 = ((ap8) zycVar3).f7328a;
                            AbstractC1263a.m7047b(c2775b.f33083s, c2775b.f33082r, ux5.m22988k(i6, "downloadLesson "), new SearchCollectionsStateHolder$downloadLesson$1(c2775b, i6, null));
                            break;
                        default:
                            gp8 gp8Var3 = (gp8) zycVar3;
                            int i7 = gp8Var3.f41160a;
                            AbstractC1263a.m7047b(c2775b.f33083s, c2775b.f33082r, ux5.m22988k(i7, "updateSave "), new SearchCollectionsStateHolder$updateSave$1(c2775b, i7, gp8Var3.f41161b, null));
                            break;
                    }
                    return xfaVar;
                }
            });
            return;
        }
        if (zycVar instanceof hp8) {
            AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(((hp8) zycVar).f42744a, "updateCourseLike "), new SearchCollectionsStateHolder$handleAction$12(this, zycVar, null));
            return;
        }
        if (zycVar instanceof po8) {
            AbstractC1263a.m7047b(un1Var, nn1Var, AbstractC3393o1.m17734i("blacklistSource ", ((po8) zycVar).f56595a), new SearchCollectionsStateHolder$handleAction$13(this, zycVar, null));
            return;
        }
        if (zycVar instanceof oo8) {
            AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(((oo8) zycVar).f54655a, "blacklistCourse "), new SearchCollectionsStateHolder$handleAction$14(this, zycVar, null));
            return;
        }
        if (zycVar instanceof dp8) {
            AbstractC1263a.m7047b(un1Var, nn1Var, "removeBlacklistSource ".concat(((dp8) zycVar).f36008a), new SearchCollectionsStateHolder$handleAction$15(this, zycVar, null));
        } else if (zycVar instanceof cp8) {
            AbstractC1263a.m7047b(un1Var, nn1Var, ux5.m22988k(((cp8) zycVar).f34349a, "removeBlacklistCourse "), new SearchCollectionsStateHolder$handleAction$16(this, zycVar, null));
        } else {
            gm5.m12750e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9700c(bp8 bp8Var, ui3 ui3Var) {
        boolean zMo2969b = bp8Var.mo2969b();
        un1 un1Var = this.f33083s;
        if (zMo2969b) {
            wfb.m23926u(un1Var, null, null, new SearchCollectionsStateHolder$requestPremiumLesson$1(this, bp8Var.mo2970c(), bp8Var.mo2968a(), null), 3);
        } else if (!bp8Var.mo2971d() || bp8Var.mo2970c() <= 0) {
            ui3Var.mo0a();
        } else {
            wfb.m23926u(un1Var, null, null, new SearchCollectionsStateHolder$withPremiumAndPaidContentCheck$1(this, bp8Var, ui3Var, null), 3);
        }
    }
}
