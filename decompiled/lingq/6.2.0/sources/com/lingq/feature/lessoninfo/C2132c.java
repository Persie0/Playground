package com.lingq.feature.lessoninfo;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.lesson.C1380b;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.lesson.C1382d;
import com.lingq.core.domain.lesson.C1383e;
import com.lingq.core.domain.library.C1388c;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.library.LessonInfo;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.core.domain.user.C1539a;
import com.lingq.core.p012ui.LessonInfoSource;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3139j9;
import p000.C3386nv;
import p000.C3713w8;
import p000.InterfaceC3812yx;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.f35;
import p000.g45;
import p000.gm5;
import p000.gm6;
import p000.h35;
import p000.h45;
import p000.i35;
import p000.i45;
import p000.j45;
import p000.k45;
import p000.l45;
import p000.lda;
import p000.lk0;
import p000.m45;
import p000.n23;
import p000.n45;
import p000.nl8;
import p000.nn1;
import p000.o45;
import p000.p45;
import p000.q45;
import p000.s35;
import p000.u35;
import p000.uk7;
import p000.ux5;
import p000.v25;
import p000.vj6;
import p000.w25;
import p000.wfb;
import p000.wkd;
import p000.wta;
import p000.wz0;
import p000.xd7;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.lessoninfo.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2132c extends wta implements cma, InterfaceC3812yx {

    /* JADX INFO: renamed from: A */
    public final C3244l f26407A;

    /* JADX INFO: renamed from: B */
    public final C3244l f26408B;

    /* JADX INFO: renamed from: C */
    public final C3244l f26409C;

    /* JADX INFO: renamed from: D */
    public final c18 f26410D;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f26411b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3812yx f26412c;

    /* JADX INFO: renamed from: d */
    public final C1383e f26413d;

    /* JADX INFO: renamed from: e */
    public final C1380b f26414e;

    /* JADX INFO: renamed from: f */
    public final vj6 f26415f;

    /* JADX INFO: renamed from: g */
    public final C1382d f26416g;

    /* JADX INFO: renamed from: h */
    public final C1380b f26417h;

    /* JADX INFO: renamed from: i */
    public final C1380b f26418i;

    /* JADX INFO: renamed from: j */
    public final C1381c f26419j;

    /* JADX INFO: renamed from: k */
    public final C1388c f26420k;

    /* JADX INFO: renamed from: l */
    public final C3713w8 f26421l;

    /* JADX INFO: renamed from: m */
    public final n23 f26422m;

    /* JADX INFO: renamed from: n */
    public final C3139j9 f26423n;

    /* JADX INFO: renamed from: o */
    public final C1525a f26424o;

    /* JADX INFO: renamed from: p */
    public final C1539a f26425p;

    /* JADX INFO: renamed from: q */
    public final wkd f26426q;

    /* JADX INFO: renamed from: r */
    public final xd7 f26427r;

    /* JADX INFO: renamed from: s */
    public final nn1 f26428s;

    /* JADX INFO: renamed from: t */
    public final w25 f26429t;

    /* JADX INFO: renamed from: u */
    public final C3244l f26430u;

    /* JADX INFO: renamed from: v */
    public final C3244l f26431v;

    /* JADX INFO: renamed from: w */
    public final C3244l f26432w;

    /* JADX INFO: renamed from: x */
    public final C3244l f26433x;

    /* JADX INFO: renamed from: y */
    public final C3244l f26434y;

    /* JADX INFO: renamed from: z */
    public final C3244l f26435z;

    public C2132c(s35 s35Var, C1383e c1383e, C1380b c1380b, vj6 vj6Var, C1382d c1382d, C1380b c1380b2, C1380b c1380b3, C1381c c1381c, C1388c c1388c, C3713w8 c3713w8, n23 n23Var, C3139j9 c3139j9, C1525a c1525a, C1539a c1539a, wkd wkdVar, xd7 xd7Var, nn1 nn1Var, cma cmaVar, InterfaceC3812yx interfaceC3812yx, nl8 nl8Var) {
        w25 w25Var;
        w25 w25Var2;
        xd7Var.getClass();
        cmaVar.getClass();
        interfaceC3812yx.getClass();
        nl8Var.getClass();
        this.f26411b = cmaVar;
        this.f26412c = interfaceC3812yx;
        this.f26413d = c1383e;
        this.f26414e = c1380b;
        this.f26415f = vj6Var;
        this.f26416g = c1382d;
        this.f26417h = c1380b2;
        this.f26418i = c1380b3;
        this.f26419j = c1381c;
        this.f26420k = c1388c;
        this.f26421l = c3713w8;
        this.f26422m = n23Var;
        this.f26423n = c3139j9;
        this.f26424o = c1525a;
        this.f26425p = c1539a;
        this.f26426q = wkdVar;
        this.f26427r = xd7Var;
        this.f26428s = nn1Var;
        if (s35Var != null) {
            w25.Companion.getClass();
            w25Var2 = new w25(s35Var.f60230a, s35Var.f60231b, s35Var.f60232c, s35Var.f60233d, s35Var.f60234e, s35Var.f60235f, s35Var.f60236g);
        } else {
            try {
                v25 v25Var = w25.Companion;
                i35.Companion.getClass();
                i35 i35VarM13023a = h35.m13023a(nl8Var);
                v25Var.getClass();
                w25Var2 = new w25(i35VarM13023a.f43400a, i35VarM13023a.f43401b, i35VarM13023a.f43402c, i35VarM13023a.f43403d, i35VarM13023a.f43404e, i35VarM13023a.f43405f, i35VarM13023a.f43406g);
            } catch (Exception unused) {
                w25.Companion.getClass();
                Integer num = (Integer) nl8Var.m17488b("lessonId");
                if (num != null) {
                    int iIntValue = num.intValue();
                    String str = (String) nl8Var.m17488b("title");
                    str = str == null ? "" : str;
                    String str2 = (String) nl8Var.m17488b("imageUrl");
                    str2 = str2 == null ? "" : str2;
                    String str3 = (String) nl8Var.m17488b("originalImageUrl");
                    String str4 = (String) nl8Var.m17488b("description");
                    str4 = str4 == null ? "" : str4;
                    LessonInfoSource lessonInfoSource = (LessonInfoSource) nl8Var.m17488b("from");
                    lessonInfoSource = lessonInfoSource == null ? LessonInfoSource.Library : lessonInfoSource;
                    String str5 = (String) nl8Var.m17488b("shelfCode");
                    w25Var = new w25(iIntValue, str, str2, str3, str4, lessonInfoSource, str5 == null ? "" : str5);
                } else {
                    w25Var = null;
                }
                if (w25Var == null) {
                    C3386nv.m17633t("Missing required LessonInfo parameters");
                    throw null;
                }
                w25Var2 = w25Var;
            }
        }
        int i = w25Var2.f66282a;
        this.f26429t = w25Var2;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(null);
        this.f26430u = c3244lM17114d;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(null);
        this.f26431v = c3244lM17114d2;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(null);
        this.f26432w = c3244lM17114d3;
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d("");
        this.f26433x = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(Boolean.TRUE);
        this.f26434y = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(0);
        this.f26435z = c3244lM17114d6;
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(bool);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(bool);
        this.f26407A = c3244lM17114d8;
        C3244l c3244lM17114d9 = AbstractC3352my.m17114d(new f35(new lk0(0, 0, 0, false), new gm6(), new uk7(false)));
        this.f26408B = c3244lM17114d9;
        C3244l c3244lM17114d10 = AbstractC3352my.m17114d(null);
        this.f26409C = c3244lM17114d10;
        this.f26410D = AbstractC3224d.m15520B(new wz0(13, new c83[]{c3244lM17114d, c3244lM17114d2, c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, c3244lM17114d6, c3244lM17114d7, c3244lM17114d8, c3244lM17114d9, c3244lM17114d10}, this), lda.m16103C(this), xi9.f68262a, new u35(w25Var2.f66283b, w25Var2.f66284c, w25Var2.f66285d));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "lessonInfo_"), new LessonInfoViewModel$observeLessonInfo$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "lessonCounters_"), new LessonInfoViewModel$observeLessonCounters$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "lessonPreview_"), new LessonInfoViewModel$observeLessonPreview$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "playlistCount_"), new LessonInfoViewModel$observePlaylistCount$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "downloadState_"), new LessonInfoViewModel$observeDownloadState$1(this, null));
        AbstractC1263a.m7047b(lda.m16103C(this), this.f26428s, ux5.m22988k(i, "audioFetchState_"), new LessonInfoViewModel$observeAudioFetchState$1(this, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f26411b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f26411b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f26411b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f26411b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f26411b.mo4575D0(continuation);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: E0 */
    public final boolean mo8231E0(int i) {
        return this.f26412c.mo8231E0(i);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f26411b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f26411b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f26411b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f26411b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f26411b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f26411b.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f26411b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f26411b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f26411b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f26411b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f26411b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9049V2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f26408B;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f35.m11518a((f35) value, new lk0(0, 0, 0, false), null, null, 6)));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9050W2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f26408B;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f35.m11518a((f35) value, null, null, new uk7(false), 3)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f26411b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9051X2(q45 q45Var) {
        Object value;
        Object value2;
        q45Var.getClass();
        if (q45Var instanceof p45) {
            wfb.m23926u(lda.m16103C(this), null, null, new LessonInfoViewModel$showBuyPremiumDialog$1(this, null), 3);
            return;
        }
        boolean z = q45Var instanceof g45;
        nn1 nn1Var = this.f26428s;
        if (z) {
            g45 g45Var = (g45) q45Var;
            int i = g45Var.f40178a;
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$buyLesson$1(this, g45Var.f40179b, i, null), 2);
            return;
        }
        if (q45Var instanceof i45) {
            m9049V2();
            return;
        }
        boolean z2 = q45Var instanceof j45;
        C3244l c3244l = this.f26408B;
        if (z2) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, f35.m11518a((f35) value2, null, new gm6(), null, 5)));
            return;
        }
        if (q45Var instanceof m45) {
            m45 m45Var = (m45) q45Var;
            if (!m45Var.f50571b || m45Var.f50572c) {
                wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$performLike$1(this, null), 2);
                return;
            } else {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, f35.m11518a((f35) value, null, null, new uk7(true), 3)));
                return;
            }
        }
        if (q45Var instanceof h45) {
            m9050W2();
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$performLike$1(this, null), 2);
            return;
        }
        if (q45Var instanceof k45) {
            m9050W2();
            return;
        }
        if (q45Var instanceof o45) {
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) this.f26431v.getValue();
            if (libraryItemCounter == null) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$toggleSave$1(this, libraryItemCounter.f19460f, null), 2);
            return;
        }
        boolean z3 = q45Var instanceof l45;
        C3244l c3244l2 = this.f26430u;
        if (z3) {
            LessonInfo lessonInfo = (LessonInfo) c3244l2.getValue();
            if (lessonInfo == null) {
                return;
            }
            wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$downloadLesson$1(lessonInfo, this, null), 2);
            return;
        }
        if (!(q45Var instanceof n45)) {
            gm5.m12750e();
            return;
        }
        LessonInfo lessonInfo2 = (LessonInfo) c3244l2.getValue();
        if (lessonInfo2 == null) {
            return;
        }
        wfb.m23926u(lda.m16103C(this), nn1Var, null, new LessonInfoViewModel$removeFromSinglePlaylist$1(lessonInfo2, this, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f26411b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f26411b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f26411b.mo4590d0();
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: e2 */
    public final void mo8233e2(String str, List list) {
        str.getClass();
        this.f26412c.mo8233e2(str, list);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f26411b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f26411b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f26411b.mo4593p0();
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: r */
    public final Object mo8234r(DownloadItem downloadItem, Continuation continuation) {
        return this.f26412c.mo8234r(downloadItem, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f26411b.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f26411b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f26411b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f26411b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f26411b.mo4598w2();
    }
}
