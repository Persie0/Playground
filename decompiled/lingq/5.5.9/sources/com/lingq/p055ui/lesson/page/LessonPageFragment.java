package com.lingq.p055ui.lesson.page;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.app.AlertController;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p017ui.platform.ComposeView;
import androidx.compose.p017ui.platform.ViewCompositionStrategy;
import androidx.compose.runtime.C0480e;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC0476a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import androidx.view.compose.C1026a;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.lingq.p055ui.lesson.page.LessonPageFragment;
import com.lingq.p055ui.lesson.page.LessonPageViewModel;
import com.lingq.p055ui.lesson.page.views.LessonTextView;
import com.lingq.p055ui.lesson.page.views.SentenceVocabularyListKt;
import com.lingq.p055ui.theme.ThemeKt;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenViewState;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import dm.C5207g;
import dm.C5209i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.C7135p;
import no.C7828f;
import no.C7848l1;
import p003a2.C0009a;
import p081e0.InterfaceC5299c;
import p081e0.InterfaceC5312g0;
import p081e0.InterfaceC5336s0;
import p159hi.C6052c;
import p159hi.C6054e;
import p159hi.InterfaceC6053d;
import p225kk.C6704a;
import p225kk.C6716m;
import p230l0.C7204a;
import p240ld.ViewOnTouchListenerC7309i;
import p245lj.AbstractC7380a;
import p245lj.ViewOnClickListenerC7382c;
import p254m2.C7472a;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p338qd.C8573r0;
import p385sf.C9000b;
import p408u6.ViewOnClickListenerC9466e;
import p427v3.AbstractC9634a;
import p512yi.ViewOnTouchListenerC10379g;
import ph.C8286g0;
import ph.C8347q2;
import sl.C9072e;
import sl.InterfaceC9070c;
import tc.C9249b;
import tl.C9325m;
import va.ViewOnClickListenerC9693g;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/lesson/page/LessonPageFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonPageFragment extends AbstractC7380a {

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f28337A0 = C4924a.m10477o0(this, LessonPageFragment$binding$2.f28350j);

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f28338B0;

    /* JADX INFO: renamed from: C0 */
    public final C1038i0 f28339C0;

    /* JADX INFO: renamed from: D0 */
    public LessonTextView f28340D0;

    /* JADX INFO: renamed from: E0 */
    public LessonTextView f28341E0;

    /* JADX INFO: renamed from: F0 */
    public LessonTextView f28342F0;

    /* JADX INFO: renamed from: G0 */
    public ActionMode f28343G0;

    /* JADX INFO: renamed from: H0 */
    public final int f28344H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f28345I0;

    /* JADX INFO: renamed from: J0 */
    public C6704a f28346J0;

    /* JADX INFO: renamed from: K0 */
    public C7570d f28347K0;

    /* JADX INFO: renamed from: L0 */
    public final ActionModeCallbackC4338b f28348L0;

    /* JADX INFO: renamed from: N0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28336N0 = {C0204c.m857q(LessonPageFragment.class, "getBinding()Lcom/lingq/databinding/FragmentLessonContentPageBinding;")};

    /* JADX INFO: renamed from: M0 */
    public static final C4337a f28335M0 = new C4337a();

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$a */
    public static final class C4337a {
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$b */
    public static final class ActionModeCallbackC4338b implements ActionMode.Callback {
        public ActionModeCallbackC4338b() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            C5207g.m11111f(actionMode, "mode");
            C5207g.m11111f(menu, "menu");
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
            C5207g.m11111f(actionMode, "mode");
            C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = LessonPageFragment.this;
            lessonPageFragment.m10192s0().mo10049g();
            LessonTextView lessonTextView = lessonPageFragment.f28340D0;
            if (lessonTextView == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            Context contextM3578a0 = lessonPageFragment.m3578a0();
            Object obj = C7472a.f41322a;
            lessonTextView.setHighlightColor(C7472a.d.m14851a(contextM3578a0, R.color.transparent));
            lessonPageFragment.f28343G0 = null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            boolean z10;
            List<C7570d> list;
            List<C7570d> list2;
            C5207g.m11111f(actionMode, "mode");
            C5207g.m11111f(menu, "menu");
            LessonPageFragment lessonPageFragment = LessonPageFragment.this;
            lessonPageFragment.f28343G0 = actionMode;
            LessonTextView lessonTextView = lessonPageFragment.f28340D0;
            if (lessonTextView == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            Context contextM3578a0 = lessonPageFragment.m3578a0();
            Object obj = C7472a.f41322a;
            lessonTextView.setHighlightColor(C7472a.d.m14851a(contextM3578a0, R.color.transparent));
            C7570d c7570dM10188o0 = LessonPageFragment.m10188o0(lessonPageFragment);
            LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
            ArrayList arrayList = new ArrayList();
            C7567a c7567a = (C7567a) lessonPageViewModelM10193t0.f28531M.getValue();
            if (c7567a != null && (list2 = c7567a.f41703c) != null) {
                for (C7570d c7570d : list2) {
                    if (c7570d.f41721a >= c7570dM10188o0.f41721a && c7570d.f41722b <= c7570dM10188o0.f41722b) {
                        arrayList.add(c7570d);
                    }
                }
            }
            if (!(!arrayList.isEmpty()) || arrayList.size() >= 9) {
                z10 = false;
                break;
            }
            int i10 = ((C7570d) C6752c.m13423Q(arrayList)).f41727g;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                if (((C7570d) it.next()).f41727g != i10) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                int size = menu.size();
                for (int i11 = 0; i11 < size; i11++) {
                    menu.getItem(i11).setVisible(false);
                }
                if (!C5207g.m11106a(c7570dM10188o0, lessonPageFragment.f28347K0)) {
                    if (c7570dM10188o0.f41725e.length() > 0) {
                        lessonPageFragment.f28347K0 = c7570dM10188o0;
                        lessonPageFragment.m10193t0().m10202p2(c7570dM10188o0.f41721a, c7570dM10188o0.f41722b, true);
                    }
                }
            } else {
                int size2 = menu.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    menu.getItem(i12).setVisible(true);
                }
                LessonPageViewModel lessonPageViewModelM10193t1 = lessonPageFragment.m10193t0();
                int i13 = c7570dM10188o0.f41721a;
                int i14 = c7570dM10188o0.f41722b;
                C7848l1 c7848l1 = lessonPageViewModelM10193t1.f28533O;
                if (c7848l1 != null) {
                    C4924a.m10450b(c7848l1);
                }
                ArrayList arrayList2 = new ArrayList();
                C7567a c7567a2 = (C7567a) lessonPageViewModelM10193t1.f28531M.getValue();
                if (c7567a2 != null && (list = c7567a2.f41703c) != null) {
                    for (C7570d c7570d2 : list) {
                        if (c7570d2.f41721a >= i13 && c7570d2.f41722b <= i14) {
                            arrayList2.add(c7570d2);
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    lessonPageViewModelM10193t1.m10204s2(EmptyList.f38032a, arrayList2);
                }
                lessonPageFragment.m10192s0().mo10033Q1(true, false);
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$c */
    public static final class C4339c extends Spannable.Factory {
        @Override // android.text.Spannable.Factory
        public final Spannable newSpannable(CharSequence charSequence) {
            C5207g.m11109d(charSequence, "null cannot be cast to non-null type android.text.Spannable");
            return (Spannable) charSequence;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$5] */
    public LessonPageFragment() {
        final InterfaceC2041a<InterfaceC1048n0> interfaceC2041a = new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$lessonViewModel$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return this.f28351b.m3579b0();
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) interfaceC2041a.mo807E();
            }
        });
        this.f28338B0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$3
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
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$4
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
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b2 = C6740a.m13373b(lazyThreadSafetyMode, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$6
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
        this.f28339C0 = C8573r0.m16711Z(this, C5209i.m11118a(LessonPageViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b2, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b2);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                if (abstractC9634aMo792j == null) {
                    abstractC9634aMo792j = AbstractC9634a.a.f49330b;
                }
                return abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$special$$inlined$viewModels$default$9
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
        this.f28344H0 = 80;
        this.f28348L0 = new ActionModeCallbackC4338b();
    }

    /* JADX INFO: renamed from: n0 */
    public static void m10187n0(LessonPageFragment lessonPageFragment, C8286g0 c8286g0) {
        C5207g.m11111f(lessonPageFragment, "this$0");
        C5207g.m11111f(c8286g0, "$this_with");
        if (!lessonPageFragment.m10192s0().mo506l1() && !lessonPageFragment.m10192s0().mo502f0()) {
            lessonPageFragment.m10192s0().mo9771A(UpgradeReason.SENTENCES_TRANSLATIONS);
            return;
        }
        TextView textView = c8286g0.f44791o;
        C5207g.m11110e(textView, "tvTranslateSentence");
        boolean z10 = textView.getVisibility() == 0;
        TextView textView2 = c8286g0.f44779c;
        if (z10) {
            textView2.setText(lessonPageFragment.m3600t(R.string.lesson_show_translation));
            C4924a.m10442U(textView);
            return;
        }
        textView2.setText(lessonPageFragment.m3600t(R.string.lesson_hide_translation));
        C4924a.m10457e0(textView);
        LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
        C7499b.m14933c0(C8573r0.m16767w0(lessonPageViewModelM10193t0), lessonPageViewModelM10193t0.f28554g, lessonPageViewModelM10193t0.f28562k, "sentenceTranslation", new LessonPageViewModel$prepareSentenceTranslation$1(lessonPageViewModelM10193t0, lessonPageFragment.m10192s0().m10152y2(), null));
    }

    /* JADX INFO: renamed from: o0 */
    public static final C7570d m10188o0(LessonPageFragment lessonPageFragment) {
        int i10;
        int iMax;
        LessonTextView lessonTextView = lessonPageFragment.f28340D0;
        if (lessonTextView == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        if (lessonTextView.isFocused()) {
            LessonTextView lessonTextView2 = lessonPageFragment.f28340D0;
            if (lessonTextView2 == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            int selectionStart = lessonTextView2.getSelectionStart();
            LessonTextView lessonTextView3 = lessonPageFragment.f28340D0;
            if (lessonTextView3 == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            int selectionEnd = lessonTextView3.getSelectionEnd();
            int iMax2 = Math.max(0, Math.min(selectionStart, selectionEnd));
            iMax = Math.max(0, Math.max(selectionStart, selectionEnd));
            i10 = iMax2;
        } else {
            i10 = 0;
            iMax = 0;
        }
        LessonTextView lessonTextView4 = lessonPageFragment.f28340D0;
        if (lessonTextView4 != null) {
            return new C7570d(i10, iMax, 0, 0, lessonTextView4.getText().subSequence(i10, iMax).toString(), 0, 0, 0, null, null, null, 0, 16364);
        }
        C5207g.m11117l("tvContent");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: O */
    public final void mo3566O() {
        this.f6090a0 = true;
        C4924a.m10450b(m10193t0().f28572s0);
        m10193t0().mo9336K();
        m10190q0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: Q */
    public final void mo3568Q() {
        Set<String> setM13457y0;
        List<C7570d> list;
        this.f6090a0 = true;
        LessonPageViewModel lessonPageViewModelM10193t0 = m10193t0();
        C7567a c7567a = (C7567a) lessonPageViewModelM10193t0.f28531M.getValue();
        if (c7567a == null || (list = c7567a.f41703c) == null) {
            setM13457y0 = EmptySet.f38034a;
        } else {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C7570d) it.next()).f41725e);
            }
            setM13457y0 = C6752c.m13457y0(arrayList);
            if (setM13457y0 == null) {
                setM13457y0 = EmptySet.f38034a;
            }
        }
        if (true ^ setM13457y0.isEmpty()) {
            lessonPageViewModelM10193t0.f28556h.mo9335E0(lessonPageViewModelM10193t0.mo498E1(), setM13457y0);
        }
        LessonPageViewModel lessonPageViewModelM10193t1 = m10193t0();
        if (((Boolean) lessonPageViewModelM10193t1.f28574u0.getValue()).booleanValue()) {
            return;
        }
        lessonPageViewModelM10193t1.f28572s0 = C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t1), null, null, new LessonPageViewModel$startPageTimer$1(lessonPageViewModelM10193t1, null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [com.lingq.ui.lesson.page.LessonPageFragment$setupSentenceTokensList$1$1, kotlin.jvm.internal.Lambda] */
    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        String string;
        String string2;
        LessonTextView lessonTextView;
        String str;
        LessonTextView lessonTextView2;
        String str2;
        LessonTextView lessonTextView3;
        String str3;
        String string3;
        C5207g.m11111f(view, "view");
        Bundle bundle2 = this.f6101g;
        if (bundle2 == null || (string = bundle2.getString("lessonTitle")) == null) {
            string = "";
        }
        Bundle bundle3 = this.f6101g;
        if (bundle3 == null || (string2 = bundle3.getString("collectionTitle")) == null) {
            string2 = "";
        }
        Bundle bundle4 = this.f6101g;
        String str4 = (bundle4 == null || (string3 = bundle4.getString("lessonImage")) == null) ? "" : string3;
        Bundle bundle5 = this.f6101g;
        int i10 = 0;
        boolean z10 = bundle5 != null ? bundle5.getBoolean("isSentenceMode") : false;
        Bundle bundle6 = this.f6101g;
        int i11 = bundle6 != null ? bundle6.getInt("pagePosition") : 0;
        C8286g0 c8286g0M10191r0 = m10191r0();
        c8286g0M10191r0.f44783g.setOnTouchListener(new View.OnTouchListener() { // from class: lj.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                LessonPageFragment lessonPageFragment = this.f41181a;
                C5207g.m11111f(lessonPageFragment, "this$0");
                C5207g.m11110e(motionEvent, "event");
                lessonPageFragment.m10194u0(motionEvent);
                lessonPageFragment.m10190q0();
                return false;
            }
        });
        int i12 = 1;
        ViewOnTouchListenerC10379g viewOnTouchListenerC10379g = new ViewOnTouchListenerC10379g(1, this);
        NestedScrollView nestedScrollView = c8286g0M10191r0.f44795s;
        nestedScrollView.setOnTouchListener(viewOnTouchListenerC10379g);
        c8286g0M10191r0.f44782f.setOnTouchListener(new ViewOnTouchListenerC7309i(1, this));
        C4339c c4339c = new C4339c();
        C8286g0 c8286g0M10191r1 = m10191r0();
        if (z10) {
            lessonTextView = c8286g0M10191r1.f44789m;
            str = "binding.textContainerSentence";
        } else {
            lessonTextView = c8286g0M10191r1.f44788l;
            str = "binding.textContainer";
        }
        C5207g.m11110e(lessonTextView, str);
        this.f28340D0 = lessonTextView;
        C8286g0 c8286g0M10191r2 = m10191r0();
        if (z10) {
            lessonTextView2 = c8286g0M10191r2.f44785i;
            str2 = "binding.phrasesContainerSentence";
        } else {
            lessonTextView2 = c8286g0M10191r2.f44784h;
            str2 = "binding.phrasesContainer";
        }
        C5207g.m11110e(lessonTextView2, str2);
        this.f28341E0 = lessonTextView2;
        C8286g0 c8286g0M10191r3 = m10191r0();
        if (z10) {
            lessonTextView3 = c8286g0M10191r3.f44787k;
            str3 = "binding.relatedContainerSentence";
        } else {
            lessonTextView3 = c8286g0M10191r3.f44786j;
            str3 = "binding.relatedContainer";
        }
        C5207g.m11110e(lessonTextView3, str3);
        this.f28342F0 = lessonTextView3;
        C8347q2 c8347q2 = c8286g0M10191r0.f44793q;
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) c8347q2.f45174f).getLayoutParams();
        C5207g.m11109d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.removeRule(20);
        layoutParams2.addRule(17, R.id.iv_lesson);
        ((LinearLayout) c8347q2.f45174f).setLayoutParams(layoutParams2);
        View view2 = c8347q2.f45173e;
        RelativeLayout relativeLayout = c8286g0M10191r0.f44794r;
        if (z10) {
            ComposeView composeView = m10191r0().f44792p;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f4204a);
            composeView.setContent(C7204a.m14523c(-1488255559, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$setupSentenceTokensList$1$1
                {
                    super(2);
                }

                /* JADX WARN: Type inference failed for: r8v5, types: [com.lingq.ui.lesson.page.LessonPageFragment$setupSentenceTokensList$1$1$1, kotlin.jvm.internal.Lambda] */
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a, Integer num) {
                    InterfaceC0476a interfaceC0476a2 = interfaceC0476a;
                    if ((num.intValue() & 11) == 2 && interfaceC0476a2.mo1642m()) {
                        interfaceC0476a2.mo1650q();
                    } else {
                        InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q = ComposerKt.f3003a;
                        final LessonPageFragment lessonPageFragment = this.f28505b;
                        ThemeKt.m10361a(false, C7204a.m14522b(interfaceC0476a2, 406565045, new InterfaceC2056p<InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment$setupSentenceTokensList$1$1.1
                            {
                                super(2);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r1v2, types: [com.lingq.ui.lesson.page.LessonPageFragment$setupSentenceTokensList$1$1$1$1, kotlin.jvm.internal.Lambda] */
                            @Override // cm.InterfaceC2056p
                            /* JADX INFO: renamed from: m0 */
                            public final C9072e mo1337m0(InterfaceC0476a interfaceC0476a3, Integer num2) {
                                InterfaceC0476a interfaceC0476a4 = interfaceC0476a3;
                                if ((num2.intValue() & 11) == 2 && interfaceC0476a4.mo1642m()) {
                                    interfaceC0476a4.mo1650q();
                                } else {
                                    InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q2 = ComposerKt.f3003a;
                                    LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                                    final LessonPageFragment lessonPageFragment2 = lessonPageFragment;
                                    final InterfaceC5312g0 interfaceC5312g0M3932a = C1026a.m3932a(lessonPageFragment2.m10193t0().f28540V, interfaceC0476a4);
                                    AnimatedVisibilityKt.m1334b(((Boolean) C1026a.m3932a(lessonPageFragment2.m10193t0().f28549d0, interfaceC0476a4).getValue()).booleanValue() && (((List) interfaceC5312g0M3932a.getValue()).isEmpty() ^ true), null, EnterExitTransitionKt.m1347d(0.3f, 1), EnterExitTransitionKt.m1348e(null, 3), null, C7204a.m14522b(interfaceC0476a4, -32013939, new InterfaceC2057q<AnimatedVisibilityScope, InterfaceC0476a, Integer, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // cm.InterfaceC2057q
                                        /* JADX INFO: renamed from: M */
                                        public final C9072e mo1343M(AnimatedVisibilityScope animatedVisibilityScope, InterfaceC0476a interfaceC0476a5, Integer num3) {
                                            InterfaceC0476a interfaceC0476a6 = interfaceC0476a5;
                                            num3.intValue();
                                            C5207g.m11111f(animatedVisibilityScope, "$this$AnimatedVisibility");
                                            InterfaceC2057q<InterfaceC5299c<?>, C0480e, InterfaceC5336s0, C9072e> interfaceC2057q3 = ComposerKt.f3003a;
                                            List<C6052c> value = interfaceC5312g0M3932a.getValue();
                                            LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                                            final LessonPageFragment lessonPageFragment3 = lessonPageFragment2;
                                            Boolean bool = (Boolean) lessonPageFragment3.m10192s0().f27452Y1.getValue();
                                            SentenceVocabularyListKt.m10208a(value, bool != null ? bool.booleanValue() : false, new InterfaceC2052l<InterfaceC6053d, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1.1
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(InterfaceC6053d interfaceC6053d) {
                                                    InterfaceC6053d interfaceC6053d2 = interfaceC6053d;
                                                    C5207g.m11111f(interfaceC6053d2, "token");
                                                    boolean z11 = interfaceC6053d2 instanceof C6052c;
                                                    LessonPageFragment lessonPageFragment4 = lessonPageFragment3;
                                                    if (z11) {
                                                        LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                                                        LessonViewModel lessonViewModelM10192s0 = lessonPageFragment4.m10192s0();
                                                        lessonViewModelM10192s0.f27435T.mo10048f2(new TokenData(interfaceC6053d2.mo12498c(), TokenType.CardType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Lesson, null, 0, null, 924));
                                                    } else if (interfaceC6053d2 instanceof C6054e) {
                                                        LessonPageFragment.C4337a c4337a4 = LessonPageFragment.f28335M0;
                                                        LessonViewModel lessonViewModelM10192s1 = lessonPageFragment4.m10192s0();
                                                        lessonViewModelM10192s1.f27435T.mo10048f2(new TokenData(interfaceC6053d2.mo12498c(), TokenType.WordType, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Lesson, null, 0, null, 924));
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }, new InterfaceC2056p<String, String, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1.2
                                                {
                                                    super(2);
                                                }

                                                @Override // cm.InterfaceC2056p
                                                /* JADX INFO: renamed from: m0 */
                                                public final C9072e mo1337m0(String str5, String str6) {
                                                    String str7 = str5;
                                                    String str8 = str6;
                                                    C5207g.m11111f(str7, "token");
                                                    C5207g.m11111f(str8, "status");
                                                    boolean zM11106a = C5207g.m11106a(str8, WordStatus.Known.getValue());
                                                    LessonPageFragment lessonPageFragment4 = lessonPageFragment3;
                                                    if (zM11106a) {
                                                        LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                                                        LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment4.m10193t0();
                                                        C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t0), null, null, new LessonPageViewModel$onKnown$1(lessonPageFragment4.m10192s0().m10152y2(), lessonPageViewModelM10193t0, str7, null), 3);
                                                    } else if (C5207g.m11106a(str8, WordStatus.Ignored.getValue())) {
                                                        LessonPageFragment.C4337a c4337a4 = LessonPageFragment.f28335M0;
                                                        LessonPageViewModel lessonPageViewModelM10193t1 = lessonPageFragment4.m10193t0();
                                                        C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t1), null, null, new LessonPageViewModel$onIgnore$1(lessonPageFragment4.m10192s0().m10152y2(), lessonPageViewModelM10193t1, str7, null), 3);
                                                    }
                                                    return C9072e.f47360a;
                                                }
                                            }, new InterfaceC2052l<String, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1.3
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(String str5) {
                                                    C7570d c7570d;
                                                    List<C7570d> list;
                                                    Object next;
                                                    String str6 = str5;
                                                    C5207g.m11111f(str6, "term");
                                                    LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                                                    LessonPageFragment lessonPageFragment4 = lessonPageFragment3;
                                                    C7567a c7567a = (C7567a) lessonPageFragment4.m10193t0().f28531M.getValue();
                                                    if (c7567a == null || (list = c7567a.f41703c) == null) {
                                                        c7570d = null;
                                                    } else {
                                                        Iterator<T> it = list.iterator();
                                                        do {
                                                            if (!it.hasNext()) {
                                                                next = null;
                                                                break;
                                                            }
                                                            next = it.next();
                                                        } while (!C5207g.m11106a(((C7570d) next).f41725e, str6));
                                                        c7570d = (C7570d) next;
                                                    }
                                                    LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment4.m10193t0();
                                                    int iM10152y2 = lessonPageFragment4.m10192s0().m10152y2();
                                                    String str7 = lessonPageFragment4.m10192s0().m10148u2(lessonPageFragment4.m10192s0().m10147t2(), c7570d != null ? C9000b.m17251q(c7570d) : EmptyList.f38032a).f27865a;
                                                    C5207g.m11111f(str7, "fragment");
                                                    C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t0), null, null, new LessonPageViewModel$onAddMeaning$1(lessonPageViewModelM10193t0, str6, iM10152y2, str7, null), 3);
                                                    return C9072e.f47360a;
                                                }
                                            }, new InterfaceC2056p<String, Integer, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1.4
                                                {
                                                    super(2);
                                                }

                                                @Override // cm.InterfaceC2056p
                                                /* JADX INFO: renamed from: m0 */
                                                public final C9072e mo1337m0(String str5, Integer num4) {
                                                    String str6 = str5;
                                                    int iIntValue = num4.intValue();
                                                    C5207g.m11111f(str6, "token");
                                                    LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                                                    LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment3.m10193t0();
                                                    C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t0), null, null, new LessonPageViewModel$onCardUpdateStatus$1(iIntValue, lessonPageViewModelM10193t0, str6, null), 3);
                                                    return C9072e.f47360a;
                                                }
                                            }, new InterfaceC2052l<String, C9072e>() { // from class: com.lingq.ui.lesson.page.LessonPageFragment.setupSentenceTokensList.1.1.1.1.5
                                                {
                                                    super(1);
                                                }

                                                @Override // cm.InterfaceC2052l
                                                /* JADX INFO: renamed from: n */
                                                public final C9072e mo528n(String str5) {
                                                    String str6 = str5;
                                                    C5207g.m11111f(str6, "term");
                                                    LessonPageFragment.C4337a c4337a3 = LessonPageFragment.f28335M0;
                                                    LessonPageFragment lessonPageFragment4 = lessonPageFragment3;
                                                    InterfaceC3275c.a.m9347b(lessonPageFragment4.m10193t0(), lessonPageFragment4.m10193t0().mo498E1(), str6, true, 0.0f, 8);
                                                    return C9072e.f47360a;
                                                }
                                            }, interfaceC0476a6, 8);
                                            return C9072e.f47360a;
                                        }
                                    }), interfaceC0476a4, 200064, 18);
                                }
                                return C9072e.f47360a;
                            }
                        }), interfaceC0476a2, 48, 1);
                    }
                    return C9072e.f47360a;
                }
            }, true));
            C4924a.m10457e0(nestedScrollView);
            C5207g.m11110e(relativeLayout, "viewInner");
            C4924a.m10442U(relativeLayout);
            RelativeLayout relativeLayout2 = (RelativeLayout) view2;
            C5207g.m11110e(relativeLayout2, "viewHeader.titleLayout");
            C4924a.m10442U(relativeLayout2);
            Boolean bool = (Boolean) m10192s0().f27449X1.getValue();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            ConstraintLayout constraintLayout = c8286g0M10191r0.f44796t;
            if (zBooleanValue) {
                C5207g.m11110e(constraintLayout, "viewTtsSentence");
                C4924a.m10457e0(constraintLayout);
            } else {
                C5207g.m11110e(constraintLayout, "viewTtsSentence");
                C4924a.m10442U(constraintLayout);
            }
            TextView textView = c8286g0M10191r0.f44779c;
            C5207g.m11110e(textView, "btnTranslateSentence");
            C4924a.m10457e0(textView);
            textView.setText(m3600t(R.string.lesson_show_translation));
            TextView textView2 = c8286g0M10191r0.f44791o;
            C5207g.m11110e(textView2, "tvTranslateSentence");
            C4924a.m10442U(textView2);
            c8286g0M10191r0.f44781e.setOnClickListener(new ViewOnClickListenerC7382c(i11, i10, this));
            ViewOnClickListenerC9693g viewOnClickListenerC9693g = new ViewOnClickListenerC9693g(i11, i12, this);
            ImageButton imageButton = c8286g0M10191r0.f44780d;
            imageButton.setOnClickListener(viewOnClickListenerC9693g);
            imageButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: lj.d
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view3) {
                    LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
                    final LessonPageFragment lessonPageFragment = this.f41185a;
                    C5207g.m11111f(lessonPageFragment, "this$0");
                    LessonPageViewModel lessonPageViewModelM10193t0 = lessonPageFragment.m10193t0();
                    final Set setM14973x0 = C7499b.m14973x0(Float.valueOf(0.5f), Float.valueOf(0.66f), Float.valueOf(0.75f), Float.valueOf(0.9f), Float.valueOf(1.0f), Float.valueOf(1.1f), Float.valueOf(1.25f), Float.valueOf(1.5f), Float.valueOf(2.0f));
                    String[] strArr = {"0.5x", "0.66x", "0.75x", "0.9x", "1x", "1.1x", "1.25x", "1.5x", "2x"};
                    C7135p c7135p = lessonPageViewModelM10193t0.f28551e0;
                    int iIntValue = Integer.valueOf(setM14973x0.contains(c7135p.getValue()) ? C6752c.m13427U(setM14973x0, c7135p.getValue()) : 4).intValue();
                    C9249b title = new C9249b(lessonPageFragment.m3578a0()).setTitle(lessonPageFragment.m3600t(R.string.audio_speed));
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.lingq.ui.lesson.page.b
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            LessonPageFragment.C4337a c4337a2 = LessonPageFragment.f28335M0;
                            LessonPageFragment lessonPageFragment2 = lessonPageFragment;
                            C5207g.m11111f(lessonPageFragment2, "this$0");
                            Set set = setM14973x0;
                            C5207g.m11111f(set, "$playbackRates");
                            LessonPageViewModel lessonPageViewModelM10193t1 = lessonPageFragment2.m10193t0();
                            C7828f.m15570d(C8573r0.m16767w0(lessonPageViewModelM10193t1), null, null, new LessonPageViewModel$setPlaybackRate$1(lessonPageViewModelM10193t1, ((Number) C6752c.m13419M(set, i13)).floatValue(), null), 3);
                            dialogInterface.dismiss();
                        }
                    };
                    AlertController.C0211b c0211b = title.f599a;
                    c0211b.f589p = strArr;
                    c0211b.f591r = onClickListener;
                    c0211b.f594u = iIntValue;
                    c0211b.f593t = true;
                    title.m876a();
                    return true;
                }
            });
            textView.setOnClickListener(new ViewOnClickListenerC9466e(this, 11, c8286g0M10191r0));
        } else {
            ImageView imageView = c8347q2.f45169a;
            C5207g.m11110e(imageView, "viewHeader.ivLesson");
            C4924a.m10438Q(imageView, str4, 0.0f, 0, 16, 6);
            C4924a.m10442U(nestedScrollView);
            RelativeLayout relativeLayout3 = (RelativeLayout) view2;
            C5207g.m11110e(relativeLayout3, "viewHeader.titleLayout");
            C4924a.m10442U(relativeLayout3);
            C5207g.m11110e(relativeLayout, "viewInner");
            C4924a.m10457e0(relativeLayout);
            c8347q2.f45171c.setText(string);
            c8347q2.f45170b.setText(string2);
        }
        LessonTextView lessonTextView4 = this.f28340D0;
        if (lessonTextView4 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        lessonTextView4.setTextDirection(2);
        LessonTextView lessonTextView5 = this.f28341E0;
        if (lessonTextView5 == null) {
            C5207g.m11117l("tvContentPhrases");
            throw null;
        }
        lessonTextView5.setTextDirection(2);
        LessonTextView lessonTextView6 = this.f28342F0;
        if (lessonTextView6 == null) {
            C5207g.m11117l("tvContentRelatedPhrases");
            throw null;
        }
        lessonTextView6.setTextDirection(2);
        LessonTextView lessonTextView7 = this.f28340D0;
        if (lessonTextView7 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        List<Integer> list = C6716m.f37937a;
        lessonTextView7.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, m3578a0()));
        LessonTextView lessonTextView8 = this.f28340D0;
        if (lessonTextView8 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        lessonTextView8.setLayerType(2, null);
        LessonTextView lessonTextView9 = this.f28340D0;
        if (lessonTextView9 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        Context contextM3578a0 = m3578a0();
        Object obj = C7472a.f41322a;
        lessonTextView9.setHighlightColor(C7472a.d.m14851a(contextM3578a0, R.color.transparent));
        LessonTextView lessonTextView10 = this.f28340D0;
        if (lessonTextView10 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        lessonTextView10.setCustomSelectionActionModeCallback(this.f28348L0);
        LessonTextView lessonTextView11 = this.f28341E0;
        if (lessonTextView11 == null) {
            C5207g.m11117l("tvContentPhrases");
            throw null;
        }
        lessonTextView11.setTextColor(C7472a.d.m14851a(m3578a0(), R.color.transparent));
        LessonTextView lessonTextView12 = this.f28341E0;
        if (lessonTextView12 == null) {
            C5207g.m11117l("tvContentPhrases");
            throw null;
        }
        lessonTextView12.setLayerType(2, null);
        LessonTextView lessonTextView13 = this.f28342F0;
        if (lessonTextView13 == null) {
            C5207g.m11117l("tvContentRelatedPhrases");
            throw null;
        }
        lessonTextView13.setTextColor(C7472a.d.m14851a(m3578a0(), R.color.transparent));
        LessonTextView lessonTextView14 = this.f28342F0;
        if (lessonTextView14 == null) {
            C5207g.m11117l("tvContentRelatedPhrases");
            throw null;
        }
        lessonTextView14.setLayerType(2, null);
        if (z10) {
            LessonPageViewModel lessonPageViewModelM10193t0 = m10193t0();
            int iM10152y2 = m10192s0().m10152y2();
            C7499b.m14933c0(C8573r0.m16767w0(lessonPageViewModelM10193t0), lessonPageViewModelM10193t0.f28554g, lessonPageViewModelM10193t0.f28562k, "sentenceNotes " + lessonPageViewModelM10193t0.f28527I, new LessonPageViewModel$sentenceNotes$1(lessonPageViewModelM10193t0, iM10152y2, null));
        }
        LessonTextView lessonTextView15 = this.f28340D0;
        if (lessonTextView15 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        lessonTextView15.setSpannableFactory(c4339c);
        LessonTextView lessonTextView16 = this.f28341E0;
        if (lessonTextView16 == null) {
            C5207g.m11117l("tvContentPhrases");
            throw null;
        }
        lessonTextView16.setSpannableFactory(c4339c);
        LessonTextView lessonTextView17 = this.f28342F0;
        if (lessonTextView17 == null) {
            C5207g.m11117l("tvContentRelatedPhrases");
            throw null;
        }
        lessonTextView17.setSpannableFactory(c4339c);
        int i13 = i11;
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4341x692432fa(this, Lifecycle.State.STARTED, null, this, i13), 3);
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4340xacde109d(this, Lifecycle.State.RESUMED, null, this, i13), 3);
    }

    /* JADX INFO: renamed from: p0 */
    public final Rect m10189p0(C7570d c7570d, boolean z10) {
        int length;
        int length2;
        Rect rect = new Rect();
        LessonTextView lessonTextView = this.f28340D0;
        if (lessonTextView == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        Layout layout = lessonTextView.getLayout();
        if (layout == null) {
            return rect;
        }
        int i10 = c7570d.f41721a;
        LessonTextView lessonTextView2 = this.f28340D0;
        if (lessonTextView2 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        if (i10 >= lessonTextView2.getText().length()) {
            LessonTextView lessonTextView3 = this.f28340D0;
            if (lessonTextView3 == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            length = lessonTextView3.getText().length();
        } else {
            length = c7570d.f41721a;
        }
        double d10 = length;
        int i11 = c7570d.f41722b;
        LessonTextView lessonTextView4 = this.f28340D0;
        if (lessonTextView4 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        if (i11 >= lessonTextView4.getText().length()) {
            LessonTextView lessonTextView5 = this.f28340D0;
            if (lessonTextView5 == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            length2 = lessonTextView5.getText().length();
        } else {
            length2 = c7570d.f41722b;
        }
        double d11 = length2;
        int i12 = (int) d10;
        double primaryHorizontal = layout.getPrimaryHorizontal(i12);
        int i13 = (int) d11;
        double primaryHorizontal2 = layout.getPrimaryHorizontal(i13);
        int lineForOffset = layout.getLineForOffset(i12);
        layout.getLineForOffset(i13);
        layout.getLineBounds(lineForOffset, rect);
        int[] iArr = {0, 0};
        LessonTextView lessonTextView6 = this.f28340D0;
        if (lessonTextView6 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        lessonTextView6.getLocationOnScreen(iArr);
        rect.bottom = (int) ((((double) (layout.getLineBaseline(lineForOffset) - rect.top)) / 3.0d) + ((double) layout.getLineBaseline(lineForOffset)));
        int i14 = iArr[1];
        LessonTextView lessonTextView7 = this.f28340D0;
        if (lessonTextView7 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        int scrollY = i14 - lessonTextView7.getScrollY();
        rect.top += scrollY;
        rect.bottom += scrollY;
        int i15 = rect.left;
        double d12 = ((double) iArr[0]) + primaryHorizontal;
        LessonTextView lessonTextView8 = this.f28340D0;
        if (lessonTextView8 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        double compoundPaddingLeft = d12 + ((double) lessonTextView8.getCompoundPaddingLeft());
        LessonTextView lessonTextView9 = this.f28340D0;
        if (lessonTextView9 == null) {
            C5207g.m11117l("tvContent");
            throw null;
        }
        int scrollX = i15 + ((int) (compoundPaddingLeft - ((double) lessonTextView9.getScrollX())));
        rect.left = scrollX;
        rect.right = (int) ((((double) scrollX) + primaryHorizontal2) - primaryHorizontal);
        int i16 = rect.top;
        return z10 ? new Rect(rect.right, i16, scrollX, rect.bottom) : new Rect(scrollX, i16, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m10190q0() {
        ActionMode actionMode = this.f28343G0;
        if (actionMode != null) {
            actionMode.finish();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final C8286g0 m10191r0() {
        return (C8286g0) this.f28337A0.m10489a(this, f28336N0[0]);
    }

    /* JADX INFO: renamed from: s0 */
    public final LessonViewModel m10192s0() {
        return (LessonViewModel) this.f28338B0.getValue();
    }

    /* JADX INFO: renamed from: t0 */
    public final LessonPageViewModel m10193t0() {
        return (LessonPageViewModel) this.f28339C0.getValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u0 */
    public final void m10194u0(MotionEvent motionEvent) {
        if (!((Boolean) m10192s0().f27468d2.getValue()).booleanValue()) {
            m10192s0().mo10025A1();
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 1;
        if (actionMasked == 0) {
            this.f28345I0 = true;
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (motionEvent.getHistorySize() <= 0 || ((int) Math.abs(motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0))) <= 5) {
                    return;
                }
                this.f28345I0 = false;
                return;
            }
            if (actionMasked != 3) {
                this.f28345I0 = false;
                return;
            }
        }
        if (this.f28345I0) {
            float x10 = motionEvent.getX();
            LessonTextView lessonTextView = this.f28340D0;
            if (lessonTextView == null) {
                C5207g.m11117l("tvContent");
                throw null;
            }
            float width = lessonTextView.getWidth();
            List<Integer> list = C6716m.f37937a;
            int i11 = this.f28344H0;
            if (x10 <= width - C6716m.m13316a(i11)) {
                i10 = motionEvent.getX() < C6716m.m13316a(i11) ? -1 : 0;
            }
            if (i10 != 0) {
                m10192s0().mo10032P1(i10);
            } else {
                m10192s0().mo10025A1();
            }
            this.f28345I0 = false;
        }
    }
}
