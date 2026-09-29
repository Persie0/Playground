package com.lingq.p055ui.review;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonProgressBar;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8335o1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$2", m19206f = "ReviewFragment.kt", m19207l = {230}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29477e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29478f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lwj/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$2$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45201 extends SuspendLambda implements InterfaceC2056p<List<? extends AbstractC9953a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29479e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewFragment f29480f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45201(ReviewFragment reviewFragment, InterfaceC9968c<? super C45201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29480f = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45201 c45201 = new C45201(this.f29480f, interfaceC9968c);
            c45201.f29479e = obj;
            return c45201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends AbstractC9953a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45201) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29479e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            C8335o1 c8335o1M10239n0 = this.f29480f.m10239n0();
            if (!list.isEmpty()) {
                c8335o1M10239n0.f45105d.setTotalPages(list.size());
                LessonProgressBar lessonProgressBar = c8335o1M10239n0.f45105d;
                lessonProgressBar.m10122f(true);
                if (list.size() - 1 == 0) {
                    lessonProgressBar.setupOnePageLessonView(false);
                }
                return C9072e.f47360a;
            }
            c8335o1M10239n0.f45105d.setCompletedPages(0);
            LessonProgressBar lessonProgressBar2 = c8335o1M10239n0.f45105d;
            lessonProgressBar2.setCurrentPage(0);
            lessonProgressBar2.setTotalPages(0);
            lessonProgressBar2.m10122f(false);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$2(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29478f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$2(this.f29478f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29477e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29478f;
            ReviewViewModel reviewViewModelM10240o0 = reviewFragment.m10240o0();
            C45201 c45201 = new C45201(reviewFragment, null);
            this.f29477e = 1;
            if (C0062b.m369m0(reviewViewModelM10240o0.f29628R, c45201, this) == coroutineSingletons) {
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
