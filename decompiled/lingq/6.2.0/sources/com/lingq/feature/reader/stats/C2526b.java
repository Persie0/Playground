package com.lingq.feature.reader.stats;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.lesson.LessonReference;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.token.C1909e;
import com.lingq.feature.reader.R$id;
import kotlin.collections.AbstractC3194a;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.bia;
import p000.cma;
import p000.cy4;
import p000.d87;
import p000.dh9;
import p000.e28;
import p000.ea7;
import p000.hm5;
import p000.ka6;
import p000.lda;
import p000.ma6;
import p000.mn5;
import p000.n2a;
import p000.oa6;
import p000.r96;
import p000.sca;
import p000.t31;
import p000.t66;
import p000.tb7;
import p000.u91;
import p000.ud6;
import p000.un1;
import p000.ux5;
import p000.vk9;
import p000.w41;
import p000.wfb;
import p000.xz7;
import p000.zha;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2526b implements cy4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ud6 f30723a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30724b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w41 f30725c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ dh9 f30726d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dh9 f30727e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bia f30728f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f30729g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ un1 f30730h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t31 f30731i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1909e f30732j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ dh9 f30733k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t66 f30734l;

    public C2526b(ud6 ud6Var, C2535j c2535j, w41 w41Var, t66 t66Var, t66 t66Var2, bia biaVar, t66 t66Var3, un1 un1Var, t31 t31Var, C1909e c1909e, t66 t66Var4, t66 t66Var5) {
        this.f30723a = ud6Var;
        this.f30724b = c2535j;
        this.f30725c = w41Var;
        this.f30726d = t66Var;
        this.f30727e = t66Var2;
        this.f30728f = biaVar;
        this.f30729g = t66Var3;
        this.f30730h = un1Var;
        this.f30731i = t31Var;
        this.f30732j = c1909e;
        this.f30733k = t66Var4;
        this.f30734l = t66Var5;
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: b */
    public final void mo9436b() {
        this.f30725c.m23737z(new oa6(this.f30723a));
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: c */
    public final void mo9437c() {
        AbstractC2527c.m9456b(this.f30724b, true);
        this.f30723a.m22689f();
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: d */
    public final void mo9438d() {
        LibraryShelf libraryShelf = (LibraryShelf) this.f30734l.getValue();
        if (libraryShelf != null) {
            this.f30725c.m23737z(new ma6(libraryShelf, (LibraryTab) u91.m22591I0(libraryShelf.f19495c), libraryShelf.f19498f, ""));
        }
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: e */
    public final void mo9439e() {
        C2535j c2535j = this.f30724b;
        C1808b c1808b = c2535j.f30801K;
        tb7 tb7VarM12625d = c1808b.f21961n.m12625d();
        if (tb7VarM12625d != null) {
            hm5 hm5Var = c2535j.f30830h;
            Bundle bundle = new Bundle();
            bundle.putInt("Lesson ID", tb7VarM12625d.f62101a);
            bundle.putString("Lesson language", AbstractC3184kh.m15223q(tb7VarM12625d.f62110j));
            bundle.putString("Lesson name", tb7VarM12625d.f62103c);
            bundle.putString("Lesson level", tb7VarM12625d.f62104d);
            bundle.putString("Course name", tb7VarM12625d.f62105e);
            bundle.putInt("Course ID", tb7VarM12625d.f62109i);
            bundle.putString("audio play location", "lesson complete");
            ((C1240a) hm5Var).m7025f("Lesson audio played", bundle);
        }
        c1808b.m8442C(ea7.f36942j);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: f */
    public final void mo9440f(double d, String str) {
        C2535j c2535j = this.f30724b;
        wfb.m23926u(lda.m16103C(c2535j), null, null, new LessonCompleteViewModel$updateLessonStat$1(str, c2535j, d, null), 3);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: g */
    public final void mo9441g() {
        AbstractC2527c.m9456b(this.f30724b, true);
        this.f30723a.m22690g(R$id.nav_graph_reader, true);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: h */
    public final void mo9442h() {
        String str = ((mn5) ((C3244l) this.f30724b.f30817a0.f9311a).getValue()).f51564f;
        if (vk9.m23391n0(str)) {
            return;
        }
        wfb.m23926u(this.f30730h, null, null, new C2520xa639a6b9(this.f30731i, str, null), 3);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: i */
    public final void mo9443i() {
        UpgradeReason upgradeReason = UpgradeReason.LYNX_OUT_OF_CREDITS;
        String strM25660c = zha.m25660c(upgradeReason);
        cma cmaVar = this.f30724b.f30818b;
        this.f30728f.mo3741r0(strM25660c, cmaVar.mo4593p0() && !cmaVar.mo4588a0(), upgradeReason);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: j */
    public final void mo9444j() {
        this.f30725c.m23737z(new ka6(false, this.f30724b.f30803M, CardStatus.Familiar, ReviewType.All, -1, null, null, "lesson complete", 192));
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: k */
    public final void mo9445k(xz7 xz7Var, TokenType tokenType, e28 e28Var) {
        C2535j c2535j = this.f30724b;
        cma cmaVar = c2535j.f30818b;
        xz7Var.getClass();
        tokenType.getClass();
        e28Var.getClass();
        if (tokenType != TokenType.CardType && !((Boolean) this.f30733k.getValue()).booleanValue()) {
            this.f30728f.mo3737M1(UpgradeReason.LIMIT_WORDS);
            return;
        }
        int i = xz7Var.f69009f;
        C3244l c3244l = c2535j.f30816Z;
        Integer numValueOf = Integer.valueOf(i);
        c3244l.getClass();
        c3244l.m15572j(null, numValueOf);
        String strMo4589b2 = cmaVar.mo4589b2();
        String strMo4580K1 = cmaVar.mo4580K1();
        mn5 mn5Var = (mn5) this.f30729g.getValue();
        String str = xz7Var.f69008e;
        int i2 = xz7Var.f69009f;
        TokenTransliteration tokenTransliteration = xz7Var.f69013j;
        AbstractC2527c.m9458d(this.f30732j, strMo4589b2, strMo4580K1, mn5Var, str, tokenType, e28Var, i2, xz7Var.f69010g, xz7Var.f69011h, tokenTransliteration, xz7Var.f69017n);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: l */
    public final void mo9446l() {
        C2535j c2535j = this.f30724b;
        wfb.m23926u(lda.m16103C(c2535j), null, null, new LessonCompleteViewModel$onPlaylistUpdate$1(c2535j, null), 3);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: m */
    public final void mo9447m() {
        C2535j c2535j = this.f30724b;
        AbstractC1263a.m7047b(lda.m16103C(c2535j), c2535j.f30802L, ux5.m22988k(c2535j.f30803M, "likeLesson "), new LessonCompleteViewModel$updateLike$1(c2535j, null));
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: n */
    public final void mo9448n() {
        boolean zBooleanValue = ((Boolean) this.f30726d.getValue()).booleanValue();
        C2535j c2535j = this.f30724b;
        if (zBooleanValue) {
            wfb.m23926u(lda.m16103C(c2535j), null, null, new LessonCompleteViewModel$showBuyPremiumLesson$1(c2535j, null), 3);
            return;
        }
        LessonReference lessonReference = (LessonReference) this.f30727e.getValue();
        ud6 ud6Var = this.f30723a;
        if (lessonReference == null) {
            AbstractC2527c.m9456b(c2535j, true);
            ud6Var.m22690g(R$id.nav_graph_reader, true);
        } else {
            ((C1240a) c2535j.f30830h).m7025f("Next lesson button clicked", null);
            AbstractC2527c.m9456b(c2535j, false);
            ud6Var.m22690g(R$id.nav_graph_reader, true);
            AbstractC2527c.m9457c(lessonReference, this.f30725c);
        }
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: o */
    public final void mo9449o() {
        this.f30724b.f30816Z.m15571i(null);
        this.f30732j.m8760d3(n2a.f52243a);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: p */
    public final void mo9450p(d87 d87Var, TokenType tokenType, e28 e28Var) {
        cma cmaVar = this.f30724b.f30818b;
        d87Var.getClass();
        tokenType.getClass();
        e28Var.getClass();
        if (tokenType != TokenType.CardType && !((Boolean) this.f30733k.getValue()).booleanValue()) {
            this.f30728f.mo3737M1(UpgradeReason.LIMIT_WORDS);
            return;
        }
        xz7 xz7Var = (xz7) u91.m22591I0(d87Var.f35176e);
        String strMo4589b2 = cmaVar.mo4589b2();
        String strMo4580K1 = cmaVar.mo4580K1();
        mn5 mn5Var = (mn5) this.f30729g.getValue();
        String str = d87Var.f35175d;
        int i = d87Var.f35172a;
        int i2 = xz7Var != null ? xz7Var.f69010g : 0;
        int i3 = xz7Var != null ? xz7Var.f69011h : 0;
        AbstractC2527c.m9458d(this.f30732j, strMo4589b2, strMo4580K1, mn5Var, str, tokenType, e28Var, i, i2, i3, null, AbstractC3194a.m15360M());
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: q */
    public final void mo9451q() {
        this.f30725c.m23737z(new r96("lesson complete", ((mn5) this.f30729g.getValue()).f51567i));
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: r */
    public final void mo9452r() {
        C2535j c2535j = this.f30724b;
        C3244l c3244l = c2535j.f30815Y;
        mn5 mn5Var = (mn5) ((C3244l) c2535j.f30817a0.f9311a).getValue();
        if (mn5Var.f51567i <= -1 || mn5Var.f51564f.length() <= 0) {
            return;
        }
        boolean zBooleanValue = ((Boolean) c3244l.getValue()).booleanValue();
        c3244l.m15572j(null, Boolean.valueOf(!zBooleanValue));
        if (zBooleanValue || mn5Var.f51565g != null) {
            return;
        }
        wfb.m23926u(lda.m16103C(c2535j), null, null, new LessonCompleteViewModel$toggleLynxCoachTranslation$1(c2535j, mn5Var, null), 3);
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: s */
    public final void mo9453s() {
        this.f30725c.m23737z(new r96(2));
    }

    @Override // p000.cy4
    /* JADX INFO: renamed from: t */
    public final void mo9454t() {
        C2535j c2535j = this.f30724b;
        String str = ((mn5) ((C3244l) c2535j.f30817a0.f9311a).getValue()).f51564f;
        if (vk9.m23391n0(str)) {
            str = null;
        }
        if (str == null) {
            return;
        }
        sca.m21224J0(c2535j, str, false, 14);
    }
}
