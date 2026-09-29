package com.lingq.p055ui.token;

import ae.C0062b;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import fk.C5575q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p138gk.C5812b;
import p138gk.C5816f;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.C7777d;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8371v1;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import tl.C9325m;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$12", m19206f = "TokenFragment.kt", m19207l = {760}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$12 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31255e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31256f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$12$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lfk/q;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$12$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48041 extends SuspendLambda implements InterfaceC2056p<C5575q, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31257e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31258f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48041(TokenFragment tokenFragment, InterfaceC9968c<? super C48041> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31258f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48041 c48041 = new C48041(this.f31258f, interfaceC9968c);
            c48041.f31257e = obj;
            return c48041;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C5575q c5575q, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48041) mo1336a(c5575q, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            List<TokenMeaning> list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C5575q c5575q = (C5575q) this.f31257e;
            if (c5575q != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                TokenFragment tokenFragment = this.f31258f;
                C8371v1 c8371v1M10362n0 = tokenFragment.m10362n0();
                List<TokenMeaning> list2 = c5575q.f34379b;
                boolean zIsEmpty = list2.isEmpty();
                TokenType tokenType = c5575q.f34378a;
                boolean z10 = c5575q.f34381d;
                List<TokenMeaning> list3 = c5575q.f34380c;
                if (zIsEmpty && list3.isEmpty()) {
                    RelativeLayout relativeLayout = c8371v1M10362n0.f45372T;
                    C5207g.m11110e(relativeLayout, "viewHintTop");
                    C4924a.m10442U(relativeLayout);
                    RelativeLayout relativeLayout2 = c8371v1M10362n0.f45370R;
                    C5207g.m11110e(relativeLayout2, "viewHintBottom");
                    C4924a.m10442U(relativeLayout2);
                    View view = c8371v1M10362n0.f45371S;
                    C5207g.m11110e(view, "viewHintSeparator");
                    C4924a.m10442U(view);
                    TextView textView = c8371v1M10362n0.f45365M;
                    C5207g.m11110e(textView, "tvTranslationLoading");
                    C4924a.m10457e0(textView);
                    list = list3;
                } else {
                    TextView textView2 = c8371v1M10362n0.f45365M;
                    C5207g.m11110e(textView2, "tvTranslationLoading");
                    C4924a.m10442U(textView2);
                    TokenType tokenType2 = TokenType.CardType;
                    RelativeLayout relativeLayout3 = c8371v1M10362n0.f45372T;
                    RelativeLayout relativeLayout4 = c8371v1M10362n0.f45370R;
                    if (tokenType == tokenType2) {
                        relativeLayout3.setOnClickListener(new ViewOnClickListenerC6464i(tokenFragment, 21, c8371v1M10362n0));
                        relativeLayout4.setOnClickListener(new ViewOnClickListenerC9466e(tokenFragment, 20, c8371v1M10362n0));
                    }
                    List<TokenMeaning> list4 = list2.isEmpty() ? list3 : list2;
                    c8371v1M10362n0.f45358F.setText(((TokenMeaning) C6752c.m13423Q(list4)).f22090c);
                    C5207g.m11110e(relativeLayout3, "viewHintTop");
                    C4924a.m10457e0(relativeLayout3);
                    TokenType tokenType3 = TokenType.WordType;
                    ImageButton imageButton = c8371v1M10362n0.f45383e;
                    ImageButton imageButton2 = c8371v1M10362n0.f45384f;
                    list = list3;
                    if (tokenType == tokenType3 || tokenType == TokenType.NewWordOrPhraseType || list2.isEmpty()) {
                        relativeLayout3.setOnClickListener(new ViewOnClickListenerC9029m(tokenFragment, 20, list4));
                        C5207g.m11110e(imageButton, "btnHintTop");
                        C4924a.m10422A(imageButton);
                        C5207g.m11110e(imageButton2, "btnHintTopAdd");
                        C4924a.m10457e0(imageButton2);
                    } else {
                        C5207g.m11110e(imageButton, "btnHintTop");
                        C4924a.m10457e0(imageButton);
                        C5207g.m11110e(imageButton2, "btnHintTopAdd");
                        C4924a.m10422A(imageButton2);
                    }
                    if (z10) {
                        List<Integer> list5 = C6716m.f37937a;
                        C6716m.m13326k(c8371v1M10362n0.f45394p, ((TokenMeaning) C6752c.m13423Q(list4)).f22089b, 0.0f);
                        C5207g.m11110e(imageButton, "btnHintTop");
                        C4924a.m10442U(imageButton);
                        C5207g.m11110e(imageButton2, "btnHintTopAdd");
                        C4924a.m10422A(imageButton2);
                    }
                    int size = list4.size();
                    View view2 = c8371v1M10362n0.f45371S;
                    ImageButton imageButton3 = c8371v1M10362n0.f45382d;
                    if (size <= 1 || !tokenFragment.m10363o0().mo9741p0(TooltipStep.LingQExpanded)) {
                        C5207g.m11110e(relativeLayout4, "viewHintBottom");
                        C4924a.m10442U(relativeLayout4);
                        C5207g.m11110e(view2, "viewHintSeparator");
                        C4924a.m10442U(view2);
                    } else {
                        c8371v1M10362n0.f45357E.setText(list4.get(1).f22090c);
                        C5207g.m11110e(relativeLayout4, "viewHintBottom");
                        C4924a.m10457e0(relativeLayout4);
                        ImageButton imageButton4 = c8371v1M10362n0.f45381c;
                        if (tokenType == tokenType3 || tokenType == TokenType.NewWordOrPhraseType || list2.isEmpty()) {
                            relativeLayout4.setOnClickListener(new ViewOnClickListenerC9734i(tokenFragment, 18, list4));
                            C5207g.m11110e(imageButton4, "btnHintBottom");
                            C4924a.m10422A(imageButton4);
                            C5207g.m11110e(imageButton3, "btnHintBottomAdd");
                            C4924a.m10457e0(imageButton3);
                        } else {
                            C5207g.m11110e(imageButton4, "btnHintBottom");
                            C4924a.m10457e0(imageButton4);
                            C5207g.m11110e(imageButton3, "btnHintBottomAdd");
                            C4924a.m10422A(imageButton3);
                        }
                        if (z10) {
                            List<Integer> list6 = C6716m.f37937a;
                            C6716m.m13326k(c8371v1M10362n0.f45393o, list4.get(1).f22089b, 0.0f);
                            C5207g.m11110e(imageButton4, "btnHintBottom");
                            C4924a.m10442U(imageButton4);
                            C5207g.m11110e(imageButton3, "btnHintBottomAdd");
                            C4924a.m10422A(imageButton3);
                        }
                        C5207g.m11110e(view2, "viewHintSeparator");
                        C4924a.m10457e0(view2);
                    }
                    if (tokenType == tokenType3 || tokenType == TokenType.NewWordOrPhraseType) {
                        Drawable drawable = imageButton2.getDrawable();
                        List<Integer> list7 = C6716m.f37937a;
                        drawable.setColorFilter(C6716m.m13333r(R.attr.blueTint, tokenFragment.m3578a0()), PorterDuff.Mode.SRC_IN);
                        imageButton2.setImageDrawable(drawable);
                        imageButton3.setImageDrawable(drawable);
                    } else {
                        Drawable drawable2 = imageButton2.getDrawable();
                        List<Integer> list8 = C6716m.f37937a;
                        drawable2.setColorFilter(C6716m.m13333r(R.attr.tertiaryTextColor, tokenFragment.m3578a0()), PorterDuff.Mode.SRC_IN);
                        imageButton2.setImageDrawable(drawable2);
                        imageButton3.setImageDrawable(drawable2);
                    }
                }
                TextView textView3 = tokenFragment.m10362n0().f45359G;
                C5207g.m11110e(textView3, "binding.tvPopularMeaningsEmpty");
                C4924a.m10442U(textView3);
                RecyclerView recyclerView = tokenFragment.m10362n0().f45398t;
                C5207g.m11110e(recyclerView, "binding.rvPopularMeanings");
                C4924a.m10457e0(recyclerView);
                C5816f c5816f = tokenFragment.f31207E0;
                if (c5816f == null) {
                    C5207g.m11117l("savedMeaningsAdapter");
                    throw null;
                }
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C5816f.a((TokenMeaning) it.next(), z10, list2.size() > 1));
                }
                c5816f.m4529q(arrayList);
                C5812b c5812b = tokenFragment.f31208F0;
                if (c5812b == null) {
                    C5207g.m11117l("popularMeaningsAdapter");
                    throw null;
                }
                List<TokenMeaning> list9 = list;
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list9, 10));
                Iterator<T> it2 = list9.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C5812b.a((TokenMeaning) it2.next(), z10, tokenType));
                }
                c5812b.m4529q(arrayList2);
                if (C7777d.m15481b(tokenFragment) && (!list9.isEmpty())) {
                    TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                    C7828f.m15570d(C8573r0.m16767w0(tokenViewModelM10363o0), null, null, new TokenViewModel$showTutorials$1(tokenViewModelM10363o0, null), 3);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$12(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$12> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31256f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$12(this.f31256f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$12) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31255e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31256f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48041 c48041 = new C48041(tokenFragment, null);
            this.f31255e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31420O0, c48041, this) == coroutineSingletons) {
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
