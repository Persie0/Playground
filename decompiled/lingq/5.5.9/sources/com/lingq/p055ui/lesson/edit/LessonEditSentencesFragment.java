package com.lingq.p055ui.lesson.edit;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import no.C7828f;
import p003a2.C0009a;
import p204jj.AbstractC6481b;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p301oh.C8043b;
import p322pd.C8228i;
import p338qd.C8573r0;
import p427v3.AbstractC9634a;
import ph.C8322m0;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/LessonEditSentencesFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonEditSentencesFragment extends AbstractC6481b {

    /* JADX INFO: renamed from: D0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f27923D0 = {C0204c.m857q(LessonEditSentencesFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonEditSentencesBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f27924A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f27925B0;

    /* JADX INFO: renamed from: C0 */
    public C4306a f27926C0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$a */
    public static final class C4279a implements InterfaceC7774a<LessonStudyTranslationSentence> {
        public C4279a() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(LessonStudyTranslationSentence lessonStudyTranslationSentence) {
            LessonStudyTranslationSentence lessonStudyTranslationSentence2 = lessonStudyTranslationSentence;
            C5207g.m11111f(lessonStudyTranslationSentence2, "it");
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditSentencesFragment.f27923D0;
            LessonEditSentencesFragment lessonEditSentencesFragment = LessonEditSentencesFragment.this;
            lessonEditSentencesFragment.m10165o0().mo10160i(lessonEditSentencesFragment.m10165o0().f27952g, lessonStudyTranslationSentence2.f21895a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$1] */
    public LessonEditSentencesFragment() {
        super(R.layout.fragment_lesson_edit_sentences);
        this.f27924A0 = C4924a.m10477o0(this, LessonEditSentencesFragment$binding$2.f27928j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f27925B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonEditSentencesViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C8228i c8228iM29r = C0009a.m29r(view, "view", 0, false);
        c8228iM29r.f48293c = 400L;
        m3589h0(c8228iM29r);
        C8228i c8228i = new C8228i(0, true);
        c8228i.f48293c = 400L;
        m3587g0(c8228i);
        C8322m0 c8322m0M10164n0 = m10164n0();
        c8322m0M10164n0.f45023a.setOnClickListener(new ViewOnClickListenerC2239y(24, this));
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        RecyclerView recyclerView = c8322m0M10164n0.f45024b;
        recyclerView.setLayoutManager(linearLayoutManager);
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        C4306a c4306a = new C4306a(new C4279a());
        this.f27926C0 = c4306a;
        recyclerView.setAdapter(c4306a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4280xf57341(this, Lifecycle.State.STARTED, null, this), 3);
    }

    /* JADX INFO: renamed from: n0 */
    public final C8322m0 m10164n0() {
        return (C8322m0) this.f27924A0.m10489a(this, f27923D0[0]);
    }

    /* JADX INFO: renamed from: o0 */
    public final LessonEditSentencesViewModel m10165o0() {
        return (LessonEditSentencesViewModel) this.f27925B0.getValue();
    }
}
