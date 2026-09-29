package com.lingq.p020ui;

import android.widget.TextView;
import com.lingq.R$id;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.p012ui.R$string;
import java.util.Arrays;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.af6;
import p000.b34;
import p000.bf6;
import p000.bh4;
import p000.bv3;
import p000.c32;
import p000.ef6;
import p000.eh9;
import p000.ev3;
import p000.f96;
import p000.fa4;
import p000.ff6;
import p000.g96;
import p000.ge6;
import p000.he6;
import p000.hf6;
import p000.je6;
import p000.jfa;
import p000.ke6;
import p000.lda;
import p000.le6;
import p000.me6;
import p000.na6;
import p000.ne6;
import p000.oe6;
import p000.pe6;
import p000.r96;
import p000.ud6;
import p000.ue6;
import p000.un1;
import p000.vk9;
import p000.w41;
import p000.wfb;
import p000.xe6;
import p000.xfa;
import p000.ya6;
import p000.za6;
import p000.ze6;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$8", m4291f = "HomeFragment.kt", m4292l = {420}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeFragment$onViewCreated$5$8 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ HomeFragment f33931b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeFragment$onViewCreated$5$8$1 */
    @c32(m4290c = "com.lingq.ui.HomeFragment$onViewCreated$5$8$1", m4291f = "HomeFragment.kt", m4292l = {429, 456, 540, 554}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28781 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f33932a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f33933b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ HomeFragment f33934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28781(HomeFragment homeFragment, Continuation continuation) {
            super(2, continuation);
            this.f33934c = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28781 c28781 = new C28781(this.f33934c, continuation);
            c28781.f33933b = obj;
            return c28781;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28781) create((hf6) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0087, code lost:
        
            if (r10.f34167b.mo4576F1(r2, r9) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
        
            if (r2.m9811Z2(r10, r0, r9) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0282, code lost:
        
            if (r10.m9812a3(r2, r0, r9) == r1) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x02ca, code lost:
        
            if (r10.m9809X2(r0, r2, r9) == r1) goto L85;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            LqAnalyticsValues$LessonPath url;
            hf6 hf6Var = (hf6) this.f33933b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f33932a;
            HomeFragment homeFragment = this.f33934c;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (hf6Var instanceof he6) {
                    bh4[] bh4VarArr = HomeFragment.f33886N0;
                    jfa.m14429l(homeFragment.m9797j0().f59106d);
                    TextView textView = homeFragment.m9797j0().f59104b;
                    Locale locale = Locale.getDefault();
                    String strM2111m = homeFragment.m2111m(R$string.deep_link_language_switching);
                    strM2111m.getClass();
                    he6 he6Var = (he6) hf6Var;
                    textView.setText(String.format(locale, strM2111m, Arrays.copyOf(new Object[]{AbstractC3352my.m17093L(homeFragment.m2090R(), he6Var.m13208b())}, 1)));
                    C2888d c2888dM9798k0 = homeFragment.m9798k0();
                    String strM13208b = he6Var.m13208b();
                    this.f33933b = hf6Var;
                    this.f33932a = 1;
                } else if (hf6Var instanceof ge6) {
                    bh4[] bh4VarArr2 = HomeFragment.f33886N0;
                    C2888d c2888dM9798k1 = homeFragment.m9798k0();
                    ge6 ge6Var = (ge6) hf6Var;
                    String strM12514b = ge6Var.m12514b();
                    c2888dM9798k1.getClass();
                    strM12514b.getClass();
                    wfb.m23926u(lda.m16103C(c2888dM9798k1), null, null, new HomeViewModel$updateInterfaceLanguage$1(c2888dM9798k1, strM12514b, null), 3);
                    C2888d c2888dM9798k2 = homeFragment.m9798k0();
                    hf6 hf6VarM12513a = ge6Var.m12513a();
                    c2888dM9798k2.getClass();
                    c2888dM9798k2.f34169d.mo8243R1(hf6VarM12513a);
                } else if (hf6Var instanceof pe6) {
                    HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                    homeFragment.m9798k0().mo8241G0();
                } else {
                    if (hf6Var instanceof xe6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_playlist, new Integer(com.lingq.feature.playlist.R$id.fragment_playlist));
                        xe6 xe6Var = (xe6) hf6Var;
                        Integer numM24476a = xe6Var.m24476a();
                        if (numM24476a != null) {
                            jfa.m14429l(homeFragment.m9797j0().f59106d);
                            homeFragment.m9797j0().f59104b.setText("");
                            C2888d c2888dM9798k3 = homeFragment.m9798k0();
                            String strM24477b = xe6Var.m24477b();
                            int iIntValue = numM24476a.intValue();
                            this.f33933b = null;
                            this.f33932a = 2;
                        } else {
                            homeFragment.m9798k0().mo8241G0();
                        }
                    } else if (hf6Var instanceof ef6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_vocabulary, new Integer(com.lingq.feature.vocabulary.R$id.fragment_vocabulary));
                        String strM11095a = ((ef6) hf6Var).m11095a();
                        if (strM11095a != null && !vk9.m23391n0(strM11095a)) {
                            C2888d c2888dM9798k4 = homeFragment.m9798k0();
                            c2888dM9798k4.getClass();
                            c2888dM9798k4.f34169d.mo8245Z1(new ff6(strM11095a));
                        }
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof ze6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_vocabulary, new Integer(com.lingq.feature.vocabulary.R$id.fragment_vocabulary));
                        C2888d c2888dM9798k5 = homeFragment.m9798k0();
                        ze6 ze6Var = (ze6) hf6Var;
                        ev3 ev3Var = new ev3(ze6Var.m25569a(), ze6Var.m25570b() ? ReviewType.VocabularySRS : ReviewType.VocabularyAll);
                        c2888dM9798k5.getClass();
                        c2888dM9798k5.f34187v.mo4677k(ev3Var);
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof oe6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        C2888d c2888dM9798k6 = homeFragment.m9798k0();
                        oe6 oe6Var = (oe6) hf6Var;
                        int iM17948a = oe6Var.m17948a();
                        if (oe6Var.m17949b() != null) {
                            url = oe6Var.m17949b();
                            if (url == null) {
                                url = LqAnalyticsValues$LessonPath.Unknown.f14315a;
                            }
                        } else if (oe6Var.m17950c() == null && oe6Var.m17951d() == null) {
                            url = LqAnalyticsValues$LessonPath.Deeplink.f14306a;
                        } else {
                            String strM17950c = oe6Var.m17950c();
                            if (strM17950c == null) {
                                strM17950c = "";
                            }
                            String strM17951d = oe6Var.m17951d();
                            url = new LqAnalyticsValues$LessonPath.URL(strM17950c, strM17951d != null ? strM17951d : "");
                        }
                        c2888dM9798k6.m9810Y2(iM17948a, url);
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof je6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        jfa.m14428k(b34.m3244j(homeFragment), f96.m11618b(g96.Companion, ((je6) hf6Var).m14416a()), null);
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof bf6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        jfa.m14429l(homeFragment.m9797j0().f59106d);
                        homeFragment.m9797j0().f59104b.setText("");
                        C2888d c2888dM9798k7 = homeFragment.m9798k0();
                        bf6 bf6Var = (bf6) hf6Var;
                        String strM3684a = bf6Var.m3684a();
                        String strM3685b = bf6Var.m3685b();
                        this.f33933b = null;
                        this.f33932a = 3;
                    } else if (hf6Var instanceof ke6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        jfa.m14429l(homeFragment.m9797j0().f59106d);
                        homeFragment.m9797j0().f59104b.setText("");
                        C2888d c2888dM9798k8 = homeFragment.m9798k0();
                        ke6 ke6Var = (ke6) hf6Var;
                        String strM15160a = ke6Var.m15160a();
                        int iM15161b = ke6Var.m15161b();
                        this.f33933b = null;
                        this.f33932a = 4;
                    } else if (hf6Var instanceof me6) {
                        ud6 ud6VarM3244j = b34.m3244j(homeFragment);
                        za6.Companion.getClass();
                        jfa.m14428k(ud6VarM3244j, ya6.m25019a(), null);
                        bh4[] bh4VarArr3 = HomeFragment.f33886N0;
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof af6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        w41 w41Var = homeFragment.f33897M0;
                        if (w41Var == null) {
                            fa4.m11636J("navGraphController");
                            throw null;
                        }
                        w41Var.m23737z(new na6(b34.m3244j(homeFragment)));
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof ne6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        homeFragment.m9798k0().f34169d.mo8245Z1(ne6.f52644a);
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof le6) {
                        int i2 = R$id.nav_graph_user_import;
                        bh4[] bh4VarArr4 = HomeFragment.f33886N0;
                        if (homeFragment.m9797j0().f59103a.getSelectedItemId() != i2) {
                            HomeFragment.m9794g0(homeFragment, i2, new Integer(com.lingq.feature.imports.R$id.fragment_user_import_type));
                        }
                        le6 le6Var = (le6) hf6Var;
                        if (le6Var.m16145a().f19641e) {
                            homeFragment.m9798k0().f34187v.mo4677k(new bv3(le6Var.m16145a()));
                        }
                        homeFragment.m9798k0().mo8241G0();
                    } else if (hf6Var instanceof ue6) {
                        HomeFragment.m9794g0(homeFragment, R$id.nav_graph_library, new Integer(com.lingq.feature.library.R$id.fragment_library));
                        w41 w41Var2 = homeFragment.f33897M0;
                        if (w41Var2 == null) {
                            fa4.m11636J("navGraphController");
                            throw null;
                        }
                        w41Var2.m23737z(new r96(3));
                        homeFragment.m9798k0().mo8241G0();
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr5 = HomeFragment.f33886N0;
                jfa.m14425h(homeFragment.m9797j0().f59106d);
                C2888d c2888dM9798k9 = homeFragment.m9798k0();
                hf6 hf6VarM13207a = ((he6) hf6Var).m13207a();
                c2888dM9798k9.getClass();
                c2888dM9798k9.f34169d.mo8243R1(hf6VarM13207a);
            } else if (i == 2) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr6 = HomeFragment.f33886N0;
                jfa.m14425h(homeFragment.m9797j0().f59106d);
            } else if (i == 3) {
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr7 = HomeFragment.f33886N0;
                jfa.m14425h(homeFragment.m9797j0().f59106d);
            } else {
                if (i != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                bh4[] bh4VarArr8 = HomeFragment.f33886N0;
                jfa.m14425h(homeFragment.m9797j0().f59106d);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$5$8(HomeFragment homeFragment, Continuation continuation) {
        super(2, continuation);
        this.f33931b = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeFragment$onViewCreated$5$8(this.f33931b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeFragment$onViewCreated$5$8) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33930a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = HomeFragment.f33886N0;
            HomeFragment homeFragment = this.f33931b;
            eh9 eh9VarMo8244S1 = homeFragment.m9798k0().f34169d.mo8244S1();
            C28781 c28781 = new C28781(homeFragment, null);
            this.f33930a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8244S1, c28781, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
