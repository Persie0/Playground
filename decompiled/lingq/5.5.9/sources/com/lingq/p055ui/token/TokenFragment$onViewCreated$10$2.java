package com.lingq.p055ui.token;

import ae.C0062b;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.card.MaterialCardView;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import gd.C5772k;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8371v1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$2", m19206f = "TokenFragment.kt", m19207l = {487}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31287e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31288f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/token/TokenViewState;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$2$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48121 extends SuspendLambda implements InterfaceC2056p<TokenViewState, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31289e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31290f;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$2$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TokenFragment f31291a;

            public a(TokenFragment tokenFragment) {
                this.f31291a = tokenFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<Integer> list = C6716m.f37937a;
                TokenFragment tokenFragment = this.f31291a;
                C6716m.m13321f(tokenFragment.m3578a0(), tokenFragment.m3580c0());
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$dismissWithAutoCreate$1(tokenViewModelM10363o0, true, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$2$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ TokenFragment f31292a;

            public b(TokenFragment tokenFragment) {
                this.f31292a = tokenFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<Integer> list = C6716m.f37937a;
                TokenFragment tokenFragment = this.f31292a;
                C6716m.m13321f(tokenFragment.m3578a0(), tokenFragment.m3580c0());
                InterfaceC4865b.a.m10388a(tokenFragment.m10363o0(), false, 3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48121(TokenFragment tokenFragment, InterfaceC9968c<? super C48121> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31290f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48121 c48121 = new C48121(this.f31290f, interfaceC9968c);
            c48121.f31289e = obj;
            return c48121;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenViewState tokenViewState, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48121) mo1336a(tokenViewState, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TokenViewState tokenViewState = (TokenViewState) this.f31289e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31290f;
            C8371v1 c8371v1M10362n0 = tokenFragment.m10362n0();
            TokenMotionLayout tokenMotionLayout = c8371v1M10362n0.f45395q;
            TokenViewState.Expanded expanded = TokenViewState.Expanded.f31717a;
            boolean zM11106a = C5207g.m11106a(tokenViewState, expanded);
            View view = c8371v1M10362n0.f45368P;
            if (zM11106a && tokenMotionLayout.getCurrentState() != R.id.expandedTransition) {
                tokenMotionLayout.m2796H(R.id.collapsedTransition, R.id.expandedTransition);
                tokenMotionLayout.m2798J();
                if (tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Vocabulary || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Review || tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.LessonExpanded) {
                    C5207g.m11110e(view, "viewDrag");
                    C4924a.m10422A(view);
                    tokenMotionLayout.m2789A(R.id.swipeExpanded).f5179o = true;
                }
            } else if (C5207g.m11106a(tokenViewState, TokenViewState.Collapsed.f31716a) && tokenMotionLayout.getCurrentState() != R.id.collapsedTransition) {
                tokenMotionLayout.m2796H(R.id.expandedTransition, R.id.collapsedTransition);
                tokenMotionLayout.m2798J();
            }
            boolean zM11106a2 = C5207g.m11106a(tokenViewState, expanded);
            TextView textView = c8371v1M10362n0.f45353A;
            ImageButton imageButton = c8371v1M10362n0.f45379a;
            if (zM11106a2) {
                TokenControllerType tokenControllerType = tokenFragment.m10363o0().f31431U.f34366a.f31181g;
                TokenControllerType tokenControllerType2 = TokenControllerType.Vocabulary;
                if (tokenControllerType == tokenControllerType2 && tokenFragment.m10363o0().f31431U.f34366a.f31176b == TokenType.NewWordOrPhraseType) {
                    C5207g.m11110e(imageButton, "btnClose");
                    C4924a.m10422A(imageButton);
                    C5207g.m11110e(textView, "tvCancel");
                    C4924a.m10457e0(textView);
                } else {
                    if (!C4924a.m10460g(tokenFragment.m3576Y()) && tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Lesson) {
                        tokenFragment.m10362n0().f45390l.setCardElevation(4.0f);
                        MaterialCardView materialCardView = tokenFragment.m10362n0().f45390l;
                        C5772k shapeAppearanceModel = tokenFragment.m10362n0().f45390l.getShapeAppearanceModel();
                        shapeAppearanceModel.getClass();
                        C5772k.a aVar = new C5772k.a(shapeAppearanceModel);
                        aVar.m12157d(0.0f);
                        aVar.m12158e(0.0f);
                        materialCardView.setShapeAppearanceModel(new C5772k(aVar));
                    }
                    C5207g.m11110e(imageButton, "btnClose");
                    C4924a.m10457e0(imageButton);
                    C5207g.m11110e(textView, "tvCancel");
                    C4924a.m10422A(textView);
                }
                if (!C4924a.m10460g(tokenFragment.m3576Y()) && (tokenFragment.m10363o0().f31431U.f34366a.f31181g == TokenControllerType.Lesson || tokenFragment.m10363o0().f31431U.f34366a.f31181g == tokenControllerType2)) {
                    C5207g.m11110e(view, "viewDrag");
                    C4924a.m10422A(view);
                    c8371v1M10362n0.f45395q.m2789A(R.id.swipeExpanded).f5179o = true;
                }
                View view2 = tokenFragment.f31216N0;
                if (view2 == null) {
                    C5207g.m11117l("currentStatusView");
                    throw null;
                }
                C4924a.m10422A(view2);
                imageButton.setOnClickListener(new a(tokenFragment));
                textView.setOnClickListener(new b(tokenFragment));
                LinearLayout linearLayout = c8371v1M10362n0.f45366N;
                C5207g.m11110e(linearLayout, "viewCoinsTags");
                C4924a.m10457e0(linearLayout);
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$showExpandedTutorial$1(tokenViewModelM10363o0, null), 3);
            } else if (C5207g.m11106a(tokenViewState, TokenViewState.Collapsed.f31716a)) {
                C5207g.m11110e(imageButton, "btnClose");
                C4924a.m10422A(imageButton);
                C5207g.m11110e(textView, "tvCancel");
                C4924a.m10422A(textView);
                View view3 = tokenFragment.f31216N0;
                if (view3 == null) {
                    C5207g.m11117l("currentStatusView");
                    throw null;
                }
                C4924a.m10457e0(view3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$2(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31288f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$2(this.f31288f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31287e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31288f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(tokenFragment.m10363o0().f31473y0);
            C48121 c48121 = new C48121(tokenFragment, null);
            this.f31287e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c48121, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
