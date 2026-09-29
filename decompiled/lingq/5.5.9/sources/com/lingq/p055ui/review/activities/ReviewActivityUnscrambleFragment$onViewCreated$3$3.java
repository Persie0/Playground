package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.p055ui.review.views.result.ReviewActivityResultPopupKt;
import com.lingq.p055ui.review.views.result.ReviewResultType;
import com.lingq.util.C4925b;
import dm.C5207g;
import java.util.HashSet;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.random.Random;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p418uj.C9545e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$3", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {105}, m19208m = "invokeSuspend")
public final class ReviewActivityUnscrambleFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30095e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityUnscrambleFragment f30096f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$3$1", m19206f = "ReviewActivityUnscrambleFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46431 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReviewActivityUnscrambleFragment f30097e;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityUnscrambleFragment$onViewCreated$3$3$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f30098a;

            static {
                int[] iArr = new int[ReviewResultType.values().length];
                try {
                    iArr[ReviewResultType.CORRECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReviewResultType.INCORRECT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ReviewResultType.ALMOST.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f30098a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46431(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super C46431> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30097e = reviewActivityUnscrambleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C46431(this.f30097e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46431) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            ReviewResultType reviewResultType;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f30097e;
            if (reviewActivityUnscrambleFragment.m10288o0().f45084b.m10316a()) {
                ReviewActivityUnscrambleFragment.m10287n0(reviewActivityUnscrambleFragment);
            } else {
                Locale localeForLanguageTag = Locale.forLanguageTag(reviewActivityUnscrambleFragment.m10290q0().mo507p1());
                C5207g.m11110e(localeForLanguageTag, "forLanguageTag(viewModel.activeLocale())");
                C4925b c4925b = new C4925b(localeForLanguageTag, reviewActivityUnscrambleFragment.m10288o0().f45084b.getSentence(), reviewActivityUnscrambleFragment.m10288o0().f45084b.getAnswer());
                HashSet<Integer> hashSet = c4925b.f32105c;
                int size = (int) ((((double) hashSet.size()) / ((double) (c4925b.f32106d.size() + hashSet.size()))) * ((double) 100));
                if (70 <= size && size < 99) {
                    reviewResultType = ReviewResultType.ALMOST;
                } else {
                    reviewResultType = size == 100 ? ReviewResultType.CORRECT : ReviewResultType.INCORRECT;
                }
                ReviewResultType reviewResultType2 = reviewResultType;
                ReviewViewModel reviewViewModelM10289p0 = reviewActivityUnscrambleFragment.m10289p0();
                int i10 = a.f30098a[reviewResultType2.ordinal()];
                if (i10 == 1) {
                    str = (String) C6752c.m13440h0(ReviewActivityResultPopupKt.f30380a, Random.f38128a);
                } else if (i10 == 2) {
                    str = (String) C6752c.m13440h0(ReviewActivityResultPopupKt.f30381b, Random.f38128a);
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = (String) C6752c.m13440h0(ReviewActivityResultPopupKt.f30382c, Random.f38128a);
                }
                reviewViewModelM10289p0.f29631S0.setValue(new C9545e(reviewResultType2, str, true, reviewActivityUnscrambleFragment.m10288o0().f45084b.getSentence(), reviewActivityUnscrambleFragment.m10288o0().f45084b.getAnswer()));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityUnscrambleFragment$onViewCreated$3$3(ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment, InterfaceC9968c<? super ReviewActivityUnscrambleFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30096f = reviewActivityUnscrambleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityUnscrambleFragment$onViewCreated$3$3(this.f30096f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityUnscrambleFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30095e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityUnscrambleFragment.f30068D0;
            ReviewActivityUnscrambleFragment reviewActivityUnscrambleFragment = this.f30096f;
            ReviewViewModel reviewViewModelM10289p0 = reviewActivityUnscrambleFragment.m10289p0();
            C46431 c46431 = new C46431(reviewActivityUnscrambleFragment, null);
            this.f30095e = 1;
            if (C0062b.m369m0(reviewViewModelM10289p0.f29625P0, c46431, this) == coroutineSingletons) {
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
