package com.lingq.p055ui.review;

import ae.C0062b;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.data.ReviewActivityShow;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p408u6.ViewOnClickListenerC9466e;
import p418uj.ViewOnClickListenerC9547g;
import p462wj.AbstractC9953a;
import p462wj.C9955c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8342p2;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$5", m19206f = "ReviewFragment.kt", m19207l = {264}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29486e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29487f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lwj/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$5$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45231 extends SuspendLambda implements InterfaceC2056p<C9955c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29488e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewFragment f29489f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45231(ReviewFragment reviewFragment, InterfaceC9968c<? super C45231> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29489f = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45231 c45231 = new C45231(this.f29489f, interfaceC9968c);
            c45231.f29488e = obj;
            return c45231;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9955c c9955c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45231) mo1336a(c9955c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C9955c c9955c = (C9955c) this.f29488e;
            if (c9955c != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
                ReviewFragment reviewFragment = this.f29489f;
                AbstractC9953a abstractC9953aM10261t2 = reviewFragment.m10240o0().m10261t2();
                if (abstractC9953aM10261t2 == null) {
                    LinearLayout linearLayout = reviewFragment.m10239n0().f45107f.f45137a;
                    C5207g.m11110e(linearLayout, "binding.viewBottom.root");
                    C4924a.m10442U(linearLayout);
                } else {
                    C8342p2 c8342p2 = reviewFragment.m10239n0().f45107f;
                    LinearLayout linearLayout2 = c8342p2.f45137a;
                    C5207g.m11110e(linearLayout2, "root");
                    C4924a.m10457e0(linearLayout2);
                    Button button = c8342p2.f45143g;
                    C5207g.m11110e(button, "btnSubmit");
                    C4924a.m10442U(button);
                    ReviewActivityShow reviewActivityShow = ReviewActivityShow.SessionComplete;
                    ReviewActivityShow reviewActivityShow2 = c9955c.f50654a;
                    LinearLayout linearLayout3 = c8342p2.f45147k;
                    if (reviewActivityShow2 == reviewActivityShow) {
                        C5207g.m11110e(linearLayout3, "viewSessionComplete");
                        C4924a.m10457e0(linearLayout3);
                    } else {
                        C5207g.m11110e(linearLayout3, "viewSessionComplete");
                        C4924a.m10442U(linearLayout3);
                    }
                    int i10 = ReviewFragment.C4509a.f29436a[reviewActivityShow2.ordinal()];
                    Button button2 = c8342p2.f45138b;
                    TextView textView = c8342p2.f45144h;
                    LinearLayout linearLayout4 = c8342p2.f45146j;
                    Button button3 = c8342p2.f45145i;
                    switch (i10) {
                        case 1:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10457e0(textView);
                            C4924a.m10457e0(button);
                            button.setEnabled(true);
                            button.setAlpha(1.0f);
                            button.setOnClickListener(new ViewOnClickListenerC9547g(reviewFragment, 1));
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        case 2:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10457e0(textView);
                            C4924a.m10457e0(button);
                            button.setEnabled(false);
                            button.setAlpha(0.3f);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        case 3:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10442U(textView);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10457e0(button3);
                            button3.setOnClickListener(new ViewOnClickListenerC9466e(abstractC9953aM10261t2, 14, reviewFragment));
                            C9072e c9072e = C9072e.f47360a;
                            break;
                        case 4:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10457e0(linearLayout4);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10442U(textView);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            c8342p2.f45139c.setOnClickListener(new ViewOnClickListenerC9029m(abstractC9953aM10261t2, 15, reviewFragment));
                            c8342p2.f45140d.setOnClickListener(new ViewOnClickListenerC9734i(abstractC9953aM10261t2, 12, reviewFragment));
                            C9072e c9072e2 = C9072e.f47360a;
                            break;
                        case 5:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10457e0(button2);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10442U(textView);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10442U(textView);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10457e0(textView);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        case 8:
                            C5207g.m11110e(linearLayout4, "viewFlipCard");
                            C4924a.m10442U(linearLayout4);
                            C5207g.m11110e(textView, "tvDoNotKnow");
                            C4924a.m10442U(textView);
                            C5207g.m11110e(button2, "btnContinue");
                            C4924a.m10442U(button2);
                            C5207g.m11110e(button3, "tvFlip");
                            C4924a.m10442U(button3);
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$5(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29487f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$5(this.f29487f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29486e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29487f;
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            C45231 c45231 = new C45231(reviewFragment, null);
            this.f29486e = 1;
            if (C0062b.m369m0(reviewViewModelM10240o0.f29662l0, c45231, this) == coroutineSingletons) {
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
