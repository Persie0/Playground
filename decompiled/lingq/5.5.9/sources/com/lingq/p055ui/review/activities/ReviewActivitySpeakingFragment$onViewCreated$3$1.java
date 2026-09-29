package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.views.speaking.AudioMatchView;
import com.lingq.p055ui.review.views.speaking.MatchTextView;
import com.lingq.p055ui.review.views.speaking.SpeechRecognitionState;
import com.lingq.util.C4925b;
import com.linguist.R;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p096ei.C5408a;
import p225kk.C6705b;
import p225kk.C6716m;
import p260m8.C7499b;
import p265mj.C7570d;
import p312p2.C8169a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p513yj.C10405g;
import p513yj.C10408j;
import ph.C8266c4;
import ph.C8323m1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$onViewCreated$3$1", m19206f = "ReviewActivitySpeakingFragment.kt", m19207l = {115}, m19208m = "invokeSuspend")
public final class ReviewActivitySpeakingFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30002e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivitySpeakingFragment f30003f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lyj/j;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$onViewCreated$3$1$1", m19206f = "ReviewActivitySpeakingFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46221 extends SuspendLambda implements InterfaceC2056p<C10408j, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30004e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivitySpeakingFragment f30005f;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$onViewCreated$3$1$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivitySpeakingFragment$onViewCreated$3$1$1$1", m19206f = "ReviewActivitySpeakingFragment.kt", m19207l = {123, 125}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f30006e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ ReviewActivitySpeakingFragment f30007f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f30007f = reviewActivitySpeakingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f30007f, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f30006e;
                ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f30007f;
                if (i10 != 0) {
                    if (i10 == 1) {
                        C7499b.m14977z0(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj);
                    }
                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
                    reviewActivitySpeakingFragment.m10280n0().m10266z2();
                    return C9072e.f47360a;
                }
                C7499b.m14977z0(obj);
                this.f30006e = 1;
                if (C7828f.m15567a(1200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewActivitySpeakingFragment.f29988F0;
                reviewActivitySpeakingFragment.m10280n0().m10259r2();
                this.f30006e = 2;
                if (C7828f.m15567a(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewActivitySpeakingFragment.f29988F0;
                reviewActivitySpeakingFragment.m10280n0().m10266z2();
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46221(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, InterfaceC9968c<? super C46221> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30005f = reviewActivitySpeakingFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46221 c46221 = new C46221(this.f30005f, interfaceC9968c);
            c46221.f30004e = obj;
            return c46221;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C10408j c10408j, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46221) mo1336a(c10408j, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C10408j c10408j = (C10408j) this.f30004e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f30005f;
            reviewActivitySpeakingFragment.getClass();
            int i10 = 0;
            AudioMatchView audioMatchView = ((C8323m1) reviewActivitySpeakingFragment.f29989A0.m10489a(reviewActivitySpeakingFragment, ReviewActivitySpeakingFragment.f29988F0[0])).f45026a;
            boolean zM11572e = C5408a.m11572e(reviewActivitySpeakingFragment.m10281o0().mo498E1());
            audioMatchView.getClass();
            C5207g.m11111f(c10408j, "state");
            C8266c4 c8266c4 = audioMatchView.f30454L;
            MatchTextView matchTextView = (MatchTextView) c8266c4.f44653e;
            String str = c10408j.f52211c;
            matchTextView.setText(str);
            ((TextView) c8266c4.f44654f).setText(c10408j.f52212d);
            MatchTextView matchTextView2 = (MatchTextView) c8266c4.f44653e;
            matchTextView2.getClass();
            C4925b c4925b = c10408j.f52214f;
            C5207g.m11111f(c4925b, "diff");
            C5207g.m11111f(str, "sentenceText");
            List<C7570d> list = c10408j.f52215g;
            C5207g.m11111f(list, "tokens");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7570d c7570d = (C7570d) it.next();
                String str2 = c7570d.f41725e;
                int i11 = i10;
                while (i10 < str2.length()) {
                    str2.charAt(i10);
                    int i12 = i11 + 1;
                    if (c4925b.f32105c.contains(Integer.valueOf(c7570d.f41723c + i11))) {
                        int currentTextColor = matchTextView2.getCurrentTextColor();
                        int i13 = i11 + c7570d.f41721a;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(currentTextColor), i13, i13 + 1, 33);
                    } else {
                        int iM16216h = C8169a.m16216h(matchTextView2.getCurrentTextColor(), 127);
                        int i14 = i11 + c7570d.f41721a;
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(iM16216h), i14, i14 + 1, 33);
                    }
                    i10++;
                    it = it;
                    i11 = i12;
                }
                spannableStringBuilder.setSpan(new C10405g(matchTextView2, c7570d), c7570d.f41721a, c7570d.f41722b, 33);
                List<Integer> list2 = C6716m.f37937a;
                Context context = matchTextView2.getContext();
                C5207g.m11110e(context, "context");
                spannableStringBuilder.setSpan(new C6705b(C6716m.m13333r(R.attr.secondaryTextColor, context), c7570d.f41721a, c7570d.f41722b, zM11572e), c7570d.f41721a, c7570d.f41722b, 33);
                i10 = 0;
                it = it;
            }
            matchTextView2.setText(spannableStringBuilder);
            Locale locale = Locale.getDefault();
            String string = audioMatchView.getContext().getString(R.string.review_activity_score);
            C5207g.m11110e(string, "context.getString(R.string.review_activity_score)");
            int i15 = c10408j.f52210b;
            c8266c4.f44649a.setText(C0141b.m613i(new Object[]{Integer.valueOf(i15)}, 1, locale, string, "format(locale, format, *args)"));
            SpeechRecognitionState speechRecognitionState = c10408j.f52213e;
            audioMatchView.m10308s(speechRecognitionState);
            if (speechRecognitionState == SpeechRecognitionState.STOPPED && i15 > 70) {
                reviewActivitySpeakingFragment.m10280n0().m10252C2();
                reviewActivitySpeakingFragment.m10280n0().m10250A2();
                C7828f.m15570d(C7499b.m14906H(reviewActivitySpeakingFragment.m3601v()), null, null, new AnonymousClass1(reviewActivitySpeakingFragment, null), 3);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingFragment$onViewCreated$3$1(ReviewActivitySpeakingFragment reviewActivitySpeakingFragment, InterfaceC9968c<? super ReviewActivitySpeakingFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30003f = reviewActivitySpeakingFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivitySpeakingFragment$onViewCreated$3$1(this.f30003f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivitySpeakingFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30002e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivitySpeakingFragment.f29988F0;
            ReviewActivitySpeakingFragment reviewActivitySpeakingFragment = this.f30003f;
            ReviewActivitySpeakingViewModel reviewActivitySpeakingViewModelM10281o0 = reviewActivitySpeakingFragment.m10281o0();
            C46221 c46221 = new C46221(reviewActivitySpeakingFragment, null);
            this.f30002e = 1;
            if (C0062b.m369m0(reviewActivitySpeakingViewModelM10281o0.f30022J, c46221, this) == coroutineSingletons) {
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
