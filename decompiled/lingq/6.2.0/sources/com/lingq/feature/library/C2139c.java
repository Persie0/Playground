package com.lingq.feature.library;

import android.content.SharedPreferences;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.C3436ou;
import p000.C3509qs;
import p000.b85;
import p000.c18;
import p000.c7a;
import p000.d95;
import p000.e28;
import p000.e85;
import p000.fa4;
import p000.g95;
import p000.i95;
import p000.j95;
import p000.ja5;
import p000.je2;
import p000.jo1;
import p000.k95;
import p000.l95;
import p000.lda;
import p000.m95;
import p000.n95;
import p000.o95;
import p000.p68;
import p000.p95;
import p000.q95;
import p000.r95;
import p000.s45;
import p000.s95;
import p000.sc9;
import p000.t59;
import p000.t66;
import p000.t95;
import p000.u91;
import p000.u95;
import p000.up6;
import p000.ux5;
import p000.vi3;
import p000.w41;
import p000.wfb;
import p000.z25;

/* JADX INFO: renamed from: com.lingq.feature.library.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2139c implements b85 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vi3 f26623a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f26625c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sc9 f26626d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ t66 f26627e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ t66 f26628f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f26629g;

    public C2139c(vi3 vi3Var, C2146e c2146e, t66 t66Var, sc9 sc9Var, t66 t66Var2, t66 t66Var3, t66 t66Var4) {
        this.f26623a = vi3Var;
        this.f26624b = c2146e;
        this.f26625c = t66Var;
        this.f26626d = sc9Var;
        this.f26627e = t66Var2;
        this.f26628f = t66Var3;
        this.f26629g = t66Var4;
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: A */
    public final void mo3421A() {
        this.f26623a.invoke(j95.f45238a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: B */
    public final void mo3422B(String str) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onBlacklistSource$1(c2146e, str, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: C */
    public final void mo3423C() {
        this.f26623a.invoke(m95.f50812a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: D */
    public final void mo3424D() {
        this.f26624b.m9071c3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: E */
    public final void mo3425E(LibraryItem libraryItem) {
        libraryItem.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onSaveLesson$1(libraryItem, c2146e, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: F */
    public final void mo3426F() {
        this.f26623a.invoke(p95.f55802a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: G */
    public final void mo3427G() {
        this.f26624b.m9074f3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: H */
    public final void mo3428H(String str) {
        str.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onUndoSourceBlacklist$1(c2146e, str, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: I */
    public final void mo3429I() {
        this.f26623a.invoke(n95.f52508a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: J */
    public final void mo3430J() {
        this.f26624b.m9072d3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: K */
    public final void mo3431K(int i, String str) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onBlacklistCourse$1(c2146e, i, str, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: L */
    public final void mo3432L() {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onUpgradeBannerClosed$1(c2146e, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: M */
    public final void mo3433M() {
        this.f26623a.invoke(new l95(false));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: N */
    public final void mo3434N() {
        C2146e c2146e = this.f26624b;
        C3244l c3244l = c2146e.f26668Q;
        if (((Boolean) c3244l.getValue()).booleanValue()) {
            return;
        }
        c3244l.m15572j(null, Boolean.TRUE);
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$refresh$1(c2146e, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: O */
    public final void mo3435O(LibraryItem libraryItem, String str, String str2) {
        libraryItem.getClass();
        str.getClass();
        str2.getClass();
        Integer num = libraryItem.f19441m;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = libraryItem.f19442n;
        String str4 = str3 == null ? "" : str3;
        String str5 = libraryItem.f19436h;
        String str6 = str5 == null ? "" : str5;
        String str7 = libraryItem.f19409J;
        this.f26623a.invoke(new k95(new jo1(iIntValue, str4, str6, str7 == null ? "" : str7, str, str2, LibraryContentType.Lessons.getValue())));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: P */
    public final void mo3436P() {
        C2146e c2146e = this.f26624b;
        LibraryItem libraryItem = ((ja5) c2146e.f26658G.getValue()).f45341f.f45455a.f54987b;
        if (libraryItem == null) {
            return;
        }
        c2146e.m9068Z2();
        c2146e.m9080l3(libraryItem, true);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: Q */
    public final void mo3437Q() {
        this.f26624b.m9076h3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: R */
    public final void mo3438R() {
        C2146e c2146e = this.f26624b;
        C3244l c3244l = c2146e.f26664M;
        e85 e85Var = (e85) c3244l.getValue();
        if (e85Var == null) {
            return;
        }
        c3244l.m15572j(null, e85.m10918a(e85Var));
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onCupBannerClosed$1(c2146e, e85Var, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: S */
    public final void mo3439S(EmbeddedMessage embeddedMessage, EmbeddedMessageButton embeddedMessageButton) {
        Object value;
        ArrayList arrayList;
        embeddedMessage.getClass();
        embeddedMessageButton.getClass();
        boolean zM11650l = fa4.m11650l(embeddedMessageButton.m7038a().m7037b(), "action://disable_message/");
        C2146e c2146e = this.f26624b;
        if (!zM11650l) {
            c2146e.m9079k3(embeddedMessage, embeddedMessageButton);
            c2146e.mo8247e0(embeddedMessageButton.m7038a().m7036a(), 0L);
            return;
        }
        c2146e.m9079k3(embeddedMessage, embeddedMessageButton);
        String strM7040a = embeddedMessage.m7035b().m7040a();
        strM7040a.getClass();
        w41 w41Var = c2146e.f26685j;
        w41Var.getClass();
        C3509qs c3509qs = (C3509qs) w41Var.f66366b;
        c3509qs.getClass();
        ArrayList arrayList2 = new ArrayList(c3509qs.m20128b());
        arrayList2.add(strM7040a);
        SharedPreferences.Editor editorEdit = c3509qs.f58118b.edit();
        editorEdit.getClass();
        editorEdit.putStringSet("trackRemovedEmbeddedMessages", u91.m22627s1(arrayList2));
        editorEdit.apply();
        C3244l c3244l = (C3244l) w41Var.f66367c;
        do {
            value = c3244l.getValue();
            Iterable iterable = (Iterable) c3244l.getValue();
            arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (!fa4.m11650l(((EmbeddedMessage) obj).m7035b().m7040a(), strM7040a)) {
                    arrayList.add(obj);
                }
            }
        } while (!c3244l.m15570h(value, arrayList));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: T */
    public final void mo3440T(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onUndoCourseBlacklist$1(c2146e, i, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: U */
    public final void mo3441U(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onLikeCourse$1(c2146e, i, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: V */
    public final void mo3442V(LibraryItem libraryItem, String str, String str2) {
        str.getClass();
        str2.getClass();
        libraryItem.getClass();
        String str3 = libraryItem.f19428b;
        boolean zM11650l = fa4.m11650l(str3, LibraryItemType.Content.getValue());
        C2146e c2146e = this.f26624b;
        if (zM11650l) {
            wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onReportSubmitted$1(c2146e, libraryItem, str, str2, null), 3);
        } else if (fa4.m11650l(str3, LibraryItemType.Collection.getValue())) {
            wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onReportSubmitted$2(c2146e, libraryItem, str, str2, null), 3);
        }
        c2146e.m9075g3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: W */
    public final void mo3443W(LibraryItem libraryItem, String str) {
        Object value;
        ja5 ja5Var;
        je2 je2Var;
        int i;
        String str2;
        String str3;
        libraryItem.getClass();
        str.getClass();
        C3244l c3244l = this.f26624b.f26658G;
        do {
            value = c3244l.getValue();
            ja5Var = (ja5) value;
            je2Var = ja5Var.f45341f;
            z25.Companion.getClass();
            i = libraryItem.f19426a;
            str2 = libraryItem.f19433e;
            if (str2 == null) {
                str2 = "";
            }
            str3 = libraryItem.f19436h;
            if (str3 == null) {
                str3 = "";
            }
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(je2Var, null, null, null, null, null, null, null, new z25(i, str2, str3, libraryItem.f19409J, str, true, libraryItem.m8087b()), null, 383), null, null, false, false, false, 2015)));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: X */
    public final void mo3444X(LibraryShelf libraryShelf, LibraryTab libraryTab) {
        libraryTab.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$tabSelected$1(c2146e, libraryShelf, libraryTab, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: Y */
    public final void mo3445Y(LibraryItem libraryItem) {
        libraryItem.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onBuyLessonConfirmed$1(libraryItem, c2146e, null), 3);
        c2146e.m9071c3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: Z */
    public final void mo3446Z(LibraryItem libraryItem, boolean z) {
        Object value;
        ja5 ja5Var;
        libraryItem.getClass();
        C2146e c2146e = this.f26624b;
        if (z) {
            c2146e.m9080l3(libraryItem, false);
            return;
        }
        C3244l c3244l = c2146e.f26658G;
        do {
            value = c3244l.getValue();
            ja5Var = (ja5) value;
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(ja5Var.f45341f, new C3436ou(libraryItem, true), null, null, null, null, null, null, null, null, 510), null, null, false, false, false, 2015)));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: a */
    public final void mo3447a() {
        this.f26623a.invoke(q95.f57451a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: a0 */
    public final void mo3448a0() {
        this.f26623a.invoke(new l95(true));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: b */
    public final void mo3449b() {
        this.f26623a.invoke(s95.f60556a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: c */
    public final void mo3450c(LibraryItem libraryItem, boolean z) {
        libraryItem.getClass();
        this.f26626d.m21223i(libraryItem.f19426a);
        String str = libraryItem.f19430c;
        if (str == null) {
            str = "";
        }
        this.f26627e.setValue(str);
        this.f26628f.setValue(Boolean.valueOf(!z));
        this.f26629g.setValue(Boolean.TRUE);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: d */
    public final void mo3451d() {
        up6 up6Var;
        List list = ((ja5) this.f26625c.getValue()).f45337b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof g95) {
                arrayList.add(obj);
            }
        }
        g95 g95Var = (g95) u91.m22591I0(arrayList);
        this.f26623a.invoke(new t95((g95Var == null || (up6Var = g95Var.m12422b().f61064b) == null) ? null : up6Var.m22854b()));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: e */
    public final void mo3452e(s45 s45Var) {
        t59 t59Var;
        s45Var.getClass();
        C2146e c2146e = this.f26624b;
        ja5 ja5Var = (ja5) c2146e.f26658G.getValue();
        List list = ja5Var.f45337b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof d95) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                t59Var = null;
                break;
            } else {
                Object objM22591I0 = u91.m22591I0(((d95) it.next()).f35218c.f69326a);
                t59Var = objM22591I0 instanceof t59 ? (t59) objM22591I0 : null;
            }
        } while (t59Var == null);
        if (t59Var != null) {
            c7a c7aVar = ja5Var.f45342g;
            if ((c7aVar != null ? c7aVar.f9664a : null) == TooltipStep.ChooseFirstLesson) {
                c2146e.m9076h3();
            }
        }
        this.f26623a.invoke(new o95(s45Var, new LqAnalyticsValues$LessonPath.Feed(s45Var.f60278h)));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: f */
    public final void mo3453f(LibraryItem libraryItem) {
        libraryItem.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onSavePaidLessonConfirmed$1(libraryItem, c2146e, null), 3);
        c2146e.m9074f3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: g */
    public final void mo3454g() {
        this.f26624b.m9073e3();
        this.f26623a.invoke(i95.f43741a);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: h */
    public final void mo3455h(s45 s45Var, LqAnalyticsValues$LessonPath.Feed feed) {
        s45Var.getClass();
        this.f26623a.invoke(new o95(s45Var, feed));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: i */
    public final void mo3456i(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onLikeLesson$1(c2146e, i, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: j */
    public final void mo3457j() {
        this.f26623a.invoke(new u95("https://www.lingq.com/en/help/managing-lessons-courses/"));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: k */
    public final void mo3458k(LibraryShelf libraryShelf) {
        libraryShelf.getClass();
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onPinChanged$1(c2146e, libraryShelf, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: l */
    public final void mo3459l(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), c2146e.f26655D, null, new LibraryUpdateViewModel$hideNotice$1(c2146e, i, null), 2);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: m */
    public final void mo3460m() {
        this.f26624b.m9073e3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: n */
    public final void mo3461n(EmbeddedMessage embeddedMessage) {
        embeddedMessage.getClass();
        this.f26624b.f26685j.m23715I(embeddedMessage);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: o */
    public final void mo3462o(EmbeddedMessage embeddedMessage) {
        embeddedMessage.getClass();
        this.f26624b.f26685j.m23707A(embeddedMessage);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: p */
    public final void mo3463p() {
        this.f26624b.m9068Z2();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: q */
    public final void mo3464q() {
        this.f26624b.m9070b3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: r */
    public final void mo3465r() {
        C2146e c2146e = this.f26624b;
        c18 c18Var = c2146e.f26659H;
        this.f26623a.invoke(new u95(ux5.m22991n("https://www.lingq.com/", ((ja5) ((C3244l) c18Var.f9311a).getValue()).f45336a.f826a, "/learn/", ((ja5) ((C3244l) c18Var.f9311a).getValue()).f45336a.f826a, "/web/settings/points")));
        c2146e.m9070b3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: s */
    public final void mo3466s(jo1 jo1Var) {
        jo1Var.getClass();
        this.f26623a.invoke(new k95(jo1Var));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: t */
    public final void mo3467t(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onSubscribeCourse$1(c2146e, i, null), 3);
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: u */
    public final void mo3468u(LibraryShelf libraryShelf) {
        libraryShelf.getClass();
        this.f26623a.invoke(new r95(libraryShelf));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: v */
    public final void mo3469v(e28 e28Var, s45 s45Var) {
        Object value;
        s45Var.getClass();
        C3244l c3244l = this.f26624b.f26672U;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new Pair(e28Var, s45Var)));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: w */
    public final void mo3470w(LibraryItem libraryItem) {
        Object value;
        ja5 ja5Var;
        je2 je2Var;
        String str;
        libraryItem.getClass();
        C3244l c3244l = this.f26624b.f26658G;
        do {
            value = c3244l.getValue();
            ja5Var = (ja5) value;
            je2Var = ja5Var.f45341f;
            str = libraryItem.f19433e;
            if (str == null) {
                str = "";
            }
        } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var, null, null, false, null, false, je2.m14414a(je2Var, null, new p68(true, str, libraryItem), null, null, null, null, null, null, null, 509), null, null, false, false, false, 2015)));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: x */
    public final void mo3471x(LibraryShelf libraryShelf) {
        this.f26624b.m9066X2(libraryShelf, AbstractC3423or.m18268n(libraryShelf));
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: y */
    public final void mo3472y(int i) {
        C2146e c2146e = this.f26624b;
        wfb.m23926u(lda.m16103C(c2146e), null, null, new LibraryUpdateViewModel$onRemoveLessonConfirmed$1(c2146e, i, null), 3);
        c2146e.m9072d3();
    }

    @Override // p000.b85
    /* JADX INFO: renamed from: z */
    public final void mo3473z() {
        this.f26624b.m9075g3();
    }
}
