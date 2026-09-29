package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesFragment$onViewCreated$4$2", m19206f = "LessonEditSentencesFragment.kt", m19207l = {69}, m19208m = "invokeSuspend")
public final class LessonEditSentencesFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27939e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonEditSentencesFragment f27940f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesFragment$onViewCreated$4$2$1", m19206f = "LessonEditSentencesFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42821 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f27941e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonEditSentencesFragment f27942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42821(LessonEditSentencesFragment lessonEditSentencesFragment, InterfaceC9968c<? super C42821> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27942f = lessonEditSentencesFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42821 c42821 = new C42821(this.f27942f, interfaceC9968c);
            c42821.f27941e = ((Boolean) obj).booleanValue();
            return c42821;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42821) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f27941e;
            LessonEditSentencesFragment lessonEditSentencesFragment = this.f27942f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditSentencesFragment.f27923D0;
                lessonEditSentencesFragment.m10164n0().f45025c.m4935d();
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonEditSentencesFragment.f27923D0;
                CircularProgressIndicator circularProgressIndicator = lessonEditSentencesFragment.m10164n0().f45025c;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditSentencesFragment$onViewCreated$4$2(LessonEditSentencesFragment lessonEditSentencesFragment, InterfaceC9968c<? super LessonEditSentencesFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27940f = lessonEditSentencesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonEditSentencesFragment$onViewCreated$4$2(this.f27940f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonEditSentencesFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27939e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonEditSentencesFragment.f27923D0;
            LessonEditSentencesFragment lessonEditSentencesFragment = this.f27940f;
            LessonEditSentencesViewModel lessonEditSentencesViewModelM10165o0 = lessonEditSentencesFragment.m10165o0();
            C42821 c42821 = new C42821(lessonEditSentencesFragment, null);
            this.f27939e = 1;
            if (C0062b.m369m0(lessonEditSentencesViewModelM10165o0.f27956k, c42821, this) == coroutineSingletons) {
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
