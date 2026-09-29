package com.lingq.p055ui.token;

import ae.C0062b;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p138gk.C5812b;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$20", m19206f = "TokenFragment.kt", m19207l = {864}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$20 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31293e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31294f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$20$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/tooltips/TooltipStep;", "step", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$20$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48131 extends SuspendLambda implements InterfaceC2056p<TooltipStep, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31295e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31296f;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$20$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f31302a;

            static {
                int[] iArr = new int[TooltipStep.values().length];
                try {
                    iArr[TooltipStep.TapTranslation.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TooltipStep.DoYouKnowThisWord.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TooltipStep.UpdateStatusHighlight.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TooltipStep.LingQExpanded.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TooltipStep.LingQSwipeUpHighlight.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f31302a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48131(TokenFragment tokenFragment, InterfaceC9968c<? super C48131> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31296f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48131 c48131 = new C48131(this.f31296f, interfaceC9968c);
            c48131.f31295e = obj;
            return c48131;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TooltipStep tooltipStep, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48131) mo1336a(tooltipStep, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            View view;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TooltipStep tooltipStep = (TooltipStep) this.f31295e;
            int i10 = a.f31302a[tooltipStep.ordinal()];
            final TokenFragment tokenFragment = this.f31296f;
            if (i10 == 1) {
                Rect rect = new Rect();
                if (C7777d.m15481b(tokenFragment)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                    C5812b.c cVar = (C5812b.c) tokenFragment.m10362n0().f45398t.m4175H(0);
                    if (cVar != null && (view = cVar.f7054a) != null) {
                        view.getGlobalVisibleRect(rect);
                    }
                    int i11 = rect.left;
                    List<Integer> list = C6716m.f37937a;
                    rect.left = i11 - ((int) C6716m.m13316a(4));
                    rect.right += (int) C6716m.m13316a(4);
                    Rect rect2 = new Rect();
                    rect2.top = rect.bottom;
                    rect2.right = (int) C6716m.m13316a(30);
                    rect2.left = (int) C6716m.m13316a(30);
                    tokenFragment.m10363o0().mo9734g2(tooltipStep, rect, (16 & 4) != 0 ? new Rect() : rect2, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : false, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.1
                        {
                            super(0);
                        }

                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final C9072e mo807E() {
                            InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                            TokenFragment tokenFragment2 = tokenFragment;
                            TokenViewModel.m10373q2(tokenFragment2.m10363o0(), !C7777d.m15481b(tokenFragment2));
                            return C9072e.f47360a;
                        }
                    });
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                    tokenFragment.m10362n0().f45372T.getGlobalVisibleRect(rect);
                }
                int i12 = rect.left;
                List<Integer> list2 = C6716m.f37937a;
                rect.left = i12 - ((int) C6716m.m13316a(4));
                rect.right += (int) C6716m.m13316a(4);
                Rect rect3 = new Rect();
                rect3.top = rect.bottom;
                rect3.right = (int) C6716m.m13316a(30);
                rect3.left = (int) C6716m.m13316a(30);
                tokenFragment.m10363o0().mo9734g2(tooltipStep, rect, (16 & 4) != 0 ? new Rect() : rect3, (16 & 8) != 0 ? false : true, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : false, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.1
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final C9072e mo807E() {
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                        TokenFragment tokenFragment2 = tokenFragment;
                        TokenViewModel.m10373q2(tokenFragment2.m10363o0(), !C7777d.m15481b(tokenFragment2));
                        return C9072e.f47360a;
                    }
                });
            } else if (i10 == 2) {
                Rect rect4 = new Rect();
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                if (C5207g.m11106a(tokenFragment.m10363o0().f31473y0.getValue(), TokenViewState.Expanded.f31717a)) {
                    tokenFragment.m10362n0().f45373U.getBinding().f44768c.getGlobalVisibleRect(rect4);
                } else {
                    ImageButton imageButton = tokenFragment.m10362n0().f45388j;
                    C5207g.m11110e(imageButton, "binding.btnStatusWordKnown");
                    if (imageButton.getVisibility() == 0) {
                        tokenFragment.m10362n0().f45388j.getGlobalVisibleRect(rect4);
                    }
                }
                int i13 = rect4.bottom;
                List<Integer> list3 = C6716m.f37937a;
                rect4.bottom = i13 + ((int) C6716m.m13316a(5));
                rect4.top -= (int) C6716m.m13316a(5);
                rect4.left -= (int) C6716m.m13316a(5);
                rect4.right += (int) C6716m.m13316a(5);
                Rect rect5 = new Rect();
                rect5.bottom = rect4.top - ((int) C6716m.m13316a(5));
                tokenFragment.m10363o0().mo9734g2(tooltipStep, rect4, rect5, false, true, true, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.2
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                });
            } else if (i10 == 3) {
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = TokenFragment.f31202R0;
                TextView textView = tokenFragment.m10362n0().f45386h;
                C5207g.m11110e(textView, "binding.btnStatusWithText");
                if (textView.getVisibility() == 0) {
                    Rect rect6 = new Rect();
                    tokenFragment.m10362n0().f45386h.getGlobalVisibleRect(rect6);
                    int i14 = rect6.bottom;
                    List<Integer> list4 = C6716m.f37937a;
                    rect6.bottom = i14 + ((int) C6716m.m13316a(5));
                    rect6.top -= (int) C6716m.m13316a(5);
                    rect6.left -= (int) C6716m.m13316a(5);
                    rect6.right += (int) C6716m.m13316a(5);
                    Rect rect7 = new Rect();
                    rect7.bottom = rect6.top - ((int) C6716m.m13316a(5));
                    tokenFragment.m10363o0().mo9734g2(tooltipStep, rect6, rect7, false, true, true, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.3
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    });
                }
            } else if (i10 != 4) {
                if (i10 == 5 && !C7777d.m15481b(tokenFragment)) {
                    Rect rect8 = new Rect();
                    InterfaceC6727j<Object>[] interfaceC6727jArr5 = TokenFragment.f31202R0;
                    tokenFragment.m10362n0().f45368P.getGlobalVisibleRect(rect8);
                    int i15 = rect8.bottom;
                    List<Integer> list5 = C6716m.f37937a;
                    rect8.bottom = i15 + ((int) C6716m.m13316a(60));
                    Rect rect9 = new Rect();
                    rect9.top = rect8.top;
                    rect9.right = (int) C6716m.m13316a(30);
                    rect9.left = (int) C6716m.m13316a(30);
                    tokenFragment.m10363o0().mo9734g2(tooltipStep, rect8, (16 & 4) != 0 ? new Rect() : rect9, (16 & 8) != 0 ? false : false, (16 & 16) != 0 ? false : true, (16 & 32) != 0 ? false : false, (16 & 64) != 0 ? new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.tooltips.TooltipsController$show$1
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    } : new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.5
                        @Override // cm.InterfaceC2041a
                        /* JADX INFO: renamed from: E */
                        public final /* bridge */ /* synthetic */ C9072e mo807E() {
                            return C9072e.f47360a;
                        }
                    });
                }
            } else if (!C7777d.m15481b(tokenFragment)) {
                Rect rect10 = new Rect();
                InterfaceC6727j<Object>[] interfaceC6727jArr6 = TokenFragment.f31202R0;
                tokenFragment.m10362n0().f45390l.getGlobalVisibleRect(rect10);
                Rect rect11 = new Rect();
                rect11.top = rect10.centerY();
                List<Integer> list6 = C6716m.f37937a;
                rect11.right = (int) C6716m.m13316a(30);
                rect11.left = (int) C6716m.m13316a(30);
                tokenFragment.m10363o0().mo9734g2(tooltipStep, rect10, rect11, false, true, true, new InterfaceC2041a<C9072e>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.20.1.4
                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final /* bridge */ /* synthetic */ C9072e mo807E() {
                        return C9072e.f47360a;
                    }
                });
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$20(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$20> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31294f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$20(this.f31294f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$20) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31293e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31294f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48131 c48131 = new C48131(tokenFragment, null);
            this.f31293e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31428S0, c48131, this) == coroutineSingletons) {
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
