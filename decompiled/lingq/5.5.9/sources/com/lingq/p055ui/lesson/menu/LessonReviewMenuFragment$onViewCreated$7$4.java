package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import com.linguist.R;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$4", m19206f = "LessonReviewMenuFragment.kt", m19207l = {135}, m19208m = "invokeSuspend")
public final class LessonReviewMenuFragment$onViewCreated$7$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28299e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonReviewMenuFragment f28300f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.LessonReviewMenuFragment$onViewCreated$7$4$1", m19206f = "LessonReviewMenuFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43311 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f28301e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonReviewMenuFragment f28302f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43311(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super C43311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28302f = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43311 c43311 = new C43311(this.f28302f, interfaceC9968c);
            c43311.f28301e = ((Number) obj).intValue();
            return c43311;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43311) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f28301e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f28302f;
            TextView textView = lessonReviewMenuFragment.m10184n0().f45126e;
            C0009a.m32u(new Object[]{new Integer(i10)}, 1, Locale.getDefault(), C0166e.m765k(lessonReviewMenuFragment.m3600t(R.string.lesson_review_due), " (%d)"), "format(locale, format, *args)", textView);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonReviewMenuFragment$onViewCreated$7$4(LessonReviewMenuFragment lessonReviewMenuFragment, InterfaceC9968c<? super LessonReviewMenuFragment$onViewCreated$7$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28300f = lessonReviewMenuFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonReviewMenuFragment$onViewCreated$7$4(this.f28300f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonReviewMenuFragment$onViewCreated$7$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28299e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonReviewMenuFragment.f28270D0;
            LessonReviewMenuFragment lessonReviewMenuFragment = this.f28300f;
            LessonViewModel lessonViewModelM10185o0 = lessonReviewMenuFragment.m10185o0();
            C43311 c43311 = new C43311(lessonReviewMenuFragment, null);
            this.f28299e = 1;
            if (C0062b.m369m0(lessonViewModelM10185o0.f27510t1, c43311, this) == coroutineSingletons) {
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
