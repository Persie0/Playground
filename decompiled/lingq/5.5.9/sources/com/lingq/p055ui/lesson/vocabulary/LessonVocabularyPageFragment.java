package com.lingq.p055ui.lesson.vocabulary;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
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
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenStatusMenuItem;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import fk.C5574p;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import li.C7374a;
import li.InterfaceC7379f;
import no.C7828f;
import p003a2.C0009a;
import p254m2.C7472a;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p301oh.C8043b;
import p338qd.C8573r0;
import p369rj.AbstractC8817b;
import p427v3.AbstractC9634a;
import ph.C8350r0;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/lesson/vocabulary/LessonVocabularyPageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonVocabularyPageFragment extends AbstractC8817b {

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f29237A0 = C4924a.m10477o0(this, LessonVocabularyPageFragment$binding$2.f29241j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f29238B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f29239C0;

    /* JADX INFO: renamed from: E0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f29236E0 = {C0204c.m857q(LessonVocabularyPageFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonVocabularyPageBinding;")};

    /* JADX INFO: renamed from: D0 */
    public static final C4470a f29235D0 = new C4470a();

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$a */
    public static final class C4470a {
        /* JADX INFO: renamed from: a */
        public static LessonVocabularyPageFragment m10232a(int i10, VocabularyType vocabularyType) {
            C5207g.m11111f(vocabularyType, "type");
            Bundle bundle = new Bundle();
            bundle.putInt("lessonId", i10);
            bundle.putSerializable("type", vocabularyType);
            LessonVocabularyPageFragment lessonVocabularyPageFragment = new LessonVocabularyPageFragment();
            lessonVocabularyPageFragment.m3583e0(bundle);
            return lessonVocabularyPageFragment;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$b */
    public static final class C4471b implements InterfaceC7774a<InterfaceC7379f> {
        public C4471b() {
        }

        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(InterfaceC7379f interfaceC7379f) {
            InterfaceC7379f interfaceC7379f2 = interfaceC7379f;
            C5207g.m11111f(interfaceC7379f2, "it");
            LessonVocabularyViewModel lessonVocabularyViewModel = (LessonVocabularyViewModel) LessonVocabularyPageFragment.this.f29239C0.getValue();
            String strMo14774c = interfaceC7379f2.mo14774c();
            TokenType tokenType = interfaceC7379f2 instanceof C7374a ? TokenType.CardType : TokenType.WordType;
            C5207g.m11111f(strMo14774c, "term");
            C5207g.m11111f(tokenType, "tokenType");
            lessonVocabularyViewModel.f29346i.mo14371k(new Pair(strMo14774c, tokenType));
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$1] */
    public LessonVocabularyPageFragment() {
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$2
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
        this.f29238B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonVocabularyPageViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$4
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
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$parentViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f29259b.m3579b0();
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f29239C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonVocabularyViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                AbstractC9634a abstractC9634aMo792j = null;
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i != null) {
                    abstractC9634aMo792j = interfaceC1037i.mo792j();
                }
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public static final LessonVocabularyPageViewModel m10231n0(LessonVocabularyPageFragment lessonVocabularyPageFragment) {
        return (LessonVocabularyPageViewModel) lessonVocabularyPageFragment.f29238B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$adapter$2] */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C4495a c4495a = new C4495a(new C4471b(), new C4495a.c() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$adapter$2
            @Override // com.lingq.p055ui.lesson.vocabulary.C4495a.c
            /* JADX INFO: renamed from: a */
            public final void mo10233a(final String str, int i10, Integer num, View view2) {
                C5207g.m11111f(str, "term");
                C5207g.m11111f(view2, "viewAsAnchor");
                TokenControllerType tokenControllerType = TokenControllerType.Vocabulary;
                final LessonVocabularyPageFragment lessonVocabularyPageFragment = this.f29255a;
                new C5574p(view2, i10, num, tokenControllerType, new InterfaceC2052l<TokenStatusMenuItem, C9072e>() { // from class: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$adapter$2$statusClicked$1

                    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageFragment$onViewCreated$adapter$2$statusClicked$1$a */
                    public /* synthetic */ class a {

                        /* JADX INFO: renamed from: a */
                        public static final /* synthetic */ int[] f29258a;

                        static {
                            int[] iArr = new int[TokenStatusMenuItem.values().length];
                            try {
                                iArr[TokenStatusMenuItem.Ignore.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.New.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Recognized.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Familiar.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Learned.ordinal()] = 5;
                            } catch (NoSuchFieldError unused5) {
                            }
                            try {
                                iArr[TokenStatusMenuItem.Known.ordinal()] = 6;
                            } catch (NoSuchFieldError unused6) {
                            }
                            f29258a = iArr;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(TokenStatusMenuItem tokenStatusMenuItem) {
                        TokenStatusMenuItem tokenStatusMenuItem2 = tokenStatusMenuItem;
                        C5207g.m11111f(tokenStatusMenuItem2, "item");
                        int i11 = a.f29258a[tokenStatusMenuItem2.ordinal()];
                        String str2 = str;
                        LessonVocabularyPageFragment lessonVocabularyPageFragment2 = lessonVocabularyPageFragment;
                        switch (i11) {
                            case 1:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.Ignored.getValue());
                                break;
                            case 2:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.New.getValue());
                                break;
                            case 3:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.Recognized.getValue());
                                break;
                            case 4:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.Familiar.getValue());
                                break;
                            case 5:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.Learned.getValue());
                                break;
                            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                                LessonVocabularyPageFragment.m10231n0(lessonVocabularyPageFragment2).m10234l2(str2, CardStatus.Known.getValue());
                                break;
                        }
                        return C9072e.f47360a;
                    }
                });
            }
        });
        m3578a0();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        InterfaceC6727j<?>[] interfaceC6727jArr = f29236E0;
        InterfaceC6727j<?> interfaceC6727j = interfaceC6727jArr[0];
        FragmentViewBindingDelegate fragmentViewBindingDelegate = this.f29237A0;
        ((C8350r0) fragmentViewBindingDelegate.m10489a(this, interfaceC6727j)).f45187a.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = ((C8350r0) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45187a;
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        recyclerView.m4199g(new C8043b(C7472a.c.m14849b(contextM3578a0, R.drawable.dr_item_divider), 0));
        ((C8350r0) fragmentViewBindingDelegate.m10489a(this, interfaceC6727jArr[0])).f45187a.setAdapter(c4495a);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4472xcf089f80(this, Lifecycle.State.STARTED, null, this, c4495a), 3);
    }
}
