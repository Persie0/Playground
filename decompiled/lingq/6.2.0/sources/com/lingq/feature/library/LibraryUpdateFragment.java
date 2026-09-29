package com.lingq.feature.library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.AbstractC1250j;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3423or;
import p000.C3186kj;
import p000.b34;
import p000.ba6;
import p000.bl2;
import p000.cs4;
import p000.dua;
import p000.ea6;
import p000.eh0;
import p000.fa4;
import p000.fb4;
import p000.gm5;
import p000.gr3;
import p000.h68;
import p000.hm5;
import p000.i95;
import p000.j95;
import p000.ja6;
import p000.jfa;
import p000.jo1;
import p000.k95;
import p000.km5;
import p000.l95;
import p000.lda;
import p000.m95;
import p000.ma6;
import p000.mbd;
import p000.n95;
import p000.na6;
import p000.o95;
import p000.oa6;
import p000.or1;
import p000.p95;
import p000.pa6;
import p000.q95;
import p000.q96;
import p000.qb4;
import p000.r95;
import p000.r96;
import p000.s45;
import p000.s95;
import p000.s96;
import p000.sd6;
import p000.st3;
import p000.t95;
import p000.tb4;
import p000.td6;
import p000.u91;
import p000.u95;
import p000.u96;
import p000.ud6;
import p000.ui3;
import p000.v95;
import p000.vz1;
import p000.w41;
import p000.w95;
import p000.w96;
import p000.wfb;
import p000.y38;
import p000.y85;
import p000.y96;
import p000.zta;

/* JADX INFO: loaded from: classes.dex */
public final class LibraryUpdateFragment extends st3 {

    /* JADX INFO: renamed from: C0 */
    public final w41 f26436C0;

    /* JADX INFO: renamed from: D0 */
    public w41 f26437D0;

    /* JADX INFO: renamed from: E0 */
    public hm5 f26438E0;

    public LibraryUpdateFragment() {
        final LibraryUpdateFragment$special$$inlined$viewModels$default$1 libraryUpdateFragment$special$$inlined$viewModels$default$1 = new LibraryUpdateFragment$special$$inlined$viewModels$default$1(this);
        final cs4 cs4VarM15357b = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: com.lingq.feature.library.LibraryUpdateFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return (dua) libraryUpdateFragment$special$$inlined$viewModels$default$1.mo0a();
            }
        });
        this.f26436C0 = new w41(y38.m24933a(C2146e.class), new ui3() { // from class: com.lingq.feature.library.LibraryUpdateFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return ((dua) cs4VarM15357b.getValue()).mo2116r();
            }
        }, new ui3() { // from class: com.lingq.feature.library.LibraryUpdateFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                zta ztaVarMo2102d;
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return (gr3Var == null || (ztaVarMo2102d = gr3Var.mo2102d()) == null) ? this.f26459b.mo2102d() : ztaVarMo2102d;
            }
        }, new ui3() { // from class: com.lingq.feature.library.LibraryUpdateFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                dua duaVar = (dua) cs4VarM15357b.getValue();
                gr3 gr3Var = duaVar instanceof gr3 ? (gr3) duaVar : null;
                return gr3Var != null ? gr3Var.mo2103e() : or1.f54780b;
            }
        });
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return vz1.m23648r(this, new C0282a(-1174413455, true, new C3186kj(this, 9)));
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: G */
    public final void mo2080G() {
        this.f5688b0 = true;
        C3244l c3244l = m9054i0().f26673V;
        Boolean bool = Boolean.FALSE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        m9052g0();
        fb4.f38769t.m11694e().f57541e.m3826F();
        w41 w41Var = m9054i0().f26685j;
        Iterator it = ((Iterable) ((C3244l) w41Var.f66369e).getValue()).iterator();
        while (it.hasNext()) {
            w41Var.m23707A((EmbeddedMessage) it.next());
        }
        C1240a c1240a = (C1240a) m9052g0();
        km5 km5Var = c1240a.f14305h;
        if (km5Var != null) {
            qb4 qb4VarM11694e = fb4.f38769t.m11694e();
            qb4VarM11694e.getClass();
            qb4VarM11694e.f57539c.remove(km5Var);
            qb4VarM11694e.f57541e.m3826F();
        }
        c1240a.f14305h = null;
        ((C1240a) m9052g0()).m7028i(false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: H */
    public final void mo2081H() {
        this.f5688b0 = true;
        C2146e c2146eM9054i0 = m9054i0();
        C3244l c3244l = c2146eM9054i0.f26673V;
        Boolean bool = Boolean.TRUE;
        c3244l.getClass();
        c3244l.m15572j(null, bool);
        h68 h68Var = c2146eM9054i0.f26676Y;
        if (h68Var != null) {
            c2146eM9054i0.f26676Y = null;
            c2146eM9054i0.m9078j3(h68Var);
        }
        C2146e c2146eM9054i1 = m9054i0();
        Language language = (Language) c2146eM9054i1.f26677b.mo4572B0().getValue();
        if (language != null) {
            String str = language.f19024a;
            c2146eM9054i1.m9067Y2(str);
            AbstractC1263a.m7047b(lda.m16103C(c2146eM9054i1), c2146eM9054i1.f26655D, "library-fetch-collection-subs-".concat(str), new LibraryUpdateViewModel$refreshCollectionSubscriptions$1(c2146eM9054i1, str, null));
        }
        m9052g0();
        bl2 bl2Var = fb4.f38769t.m11694e().f57541e;
        if (((tb4) bl2Var.f8656b).f62098a != null) {
            eh0.m11135p("EmbeddedSessionManager", "Embedded session started twice");
        } else {
            bl2Var.f8656b = new tb4(new Date());
        }
        w41 w41Var = m9054i0().f26685j;
        Iterator it = ((Iterable) ((C3244l) w41Var.f66369e).getValue()).iterator();
        while (it.hasNext()) {
            w41Var.m23715I((EmbeddedMessage) it.next());
        }
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new LibraryUpdateFragment$onResume$1(this, null), 3);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: M */
    public final void mo2085M(View view) {
        view.getClass();
        vz1.m23636i0(this);
        wfb.m23926u(AbstractC0708b.m2508a(m2112n()), null, null, new C2133x29e3dff7(this, Lifecycle$State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: g0 */
    public final hm5 m9052g0() {
        hm5 hm5Var = this.f26438E0;
        if (hm5Var != null) {
            return hm5Var;
        }
        fa4.m11636J("analytics");
        throw null;
    }

    /* JADX INFO: renamed from: h0 */
    public final w41 m9053h0() {
        w41 w41Var = this.f26437D0;
        if (w41Var != null) {
            return w41Var;
        }
        fa4.m11636J("navGraphController");
        throw null;
    }

    /* JADX INFO: renamed from: i0 */
    public final C2146e m9054i0() {
        return (C2146e) this.f26436C0.getValue();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m9055j0(w95 w95Var) {
        if (w95Var instanceof o95) {
            s45 s45Var = ((o95) w95Var).f54079a;
            String str = s45Var.f60278h;
            int i = s45Var.f60271a;
            List list = s45Var.f60282l;
            String str2 = s45Var.f60281k;
            y85 y85Var = s45Var.f60280j;
            LqAnalyticsValues$LessonPath.Feed feed = new LqAnalyticsValues$LessonPath.Feed(str);
            if (!y85Var.f69470a) {
                m9053h0().m23737z(new ja6(i, s45Var.f60273c, s45Var.f60274d, feed));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("Lesson language", AbstractC3184kh.m15223q(m9054i0().f26677b.mo4589b2()));
            bundle.putString("folder", s45Var.f60277g);
            bundle.putString("External Lesson Path 1", AbstractC1250j.m7032a(feed));
            bundle.putString("External Lesson Path 2", AbstractC1250j.m7033b(feed));
            bundle.putString("Shared By", str2);
            bundle.putString("Tags", u91.m22596N0(list, null, null, null, null, 63));
            bundle.putInt("Lesson ID", i);
            ((C1240a) m9052g0()).m7025f("External Lesson Clicked", bundle);
            m9053h0().m23737z(new ea6(y85Var.f69472c, y85Var.f69471b, s45Var.f60271a, feed, s45Var.f60277g, str2, list, y85Var.f69473d, y85Var.f69474e, y85Var.f69475f));
            return;
        }
        if (w95Var instanceof k95) {
            jo1 jo1VarM15012a = ((k95) w95Var).m15012a();
            m9053h0().m23737z(new s96(jo1VarM15012a.f45902a, jo1VarM15012a.f45906e, new LqAnalyticsValues$LessonPath.Feed(jo1VarM15012a.f45907f)));
            return;
        }
        Object obj = null;
        if (w95Var instanceof r95) {
            LibraryShelf libraryShelfM20450a = ((r95) w95Var).m20450a();
            fa4.m11650l(libraryShelfM20450a.f19496d, LibraryShelfType.MiniStories.getValue());
            w41 w41VarM9053h0 = m9053h0();
            String str3 = libraryShelfM20450a.f19498f;
            for (Object obj2 : libraryShelfM20450a.f19495c) {
                if (((LibraryTab) obj2).f19504d) {
                    obj = obj2;
                    break;
                }
            }
            LibraryTab libraryTabM18268n = (LibraryTab) obj;
            if (libraryTabM18268n == null) {
                libraryTabM18268n = AbstractC3423or.m18268n(libraryShelfM20450a);
            }
            w41VarM9053h0.m23737z(new ma6(libraryShelfM20450a, libraryTabM18268n, str3, ""));
            return;
        }
        if (w95Var instanceof s95) {
            m9053h0().m23737z(new oa6(b34.m3244j(this)));
            return;
        }
        if (w95Var instanceof p95) {
            m9053h0().m23737z(new w96(b34.m3244j(this)));
            return;
        }
        if (w95Var instanceof m95) {
            m9053h0().m23737z(new y96(b34.m3244j(this)));
            return;
        }
        if (w95Var instanceof u95) {
            mbd.m16755c(m2089Q(), ((u95) w95Var).m22634a(), null, 30);
            return;
        }
        if (w95Var instanceof n95) {
            m9053h0().m23737z(ba6.f8228b);
            return;
        }
        if (w95Var instanceof q95) {
            m9053h0().m23737z(new na6(b34.m3244j(this)));
            return;
        }
        if (w95Var instanceof t95) {
            m9053h0().m23737z(new pa6("library", 6, ((t95) w95Var).m21903a()));
            return;
        }
        if (w95Var instanceof v95) {
            ud6 ud6VarM3244j = b34.m3244j(this);
            sd6 sd6Var = td6.Companion;
            String strM23192a = ((v95) w95Var).m23192a();
            sd6Var.getClass();
            jfa.m14428k(ud6VarM3244j, sd6.m21251a(strM23192a), null);
            return;
        }
        if (w95Var instanceof j95) {
            m9053h0().m23737z(new r96(3));
            return;
        }
        if (w95Var instanceof i95) {
            m9053h0().m23737z(q96.f57452b);
        } else if (w95Var instanceof l95) {
            m9053h0().m23737z(new u96(((l95) w95Var).m16032a()));
        } else {
            gm5.m12750e();
        }
    }
}
