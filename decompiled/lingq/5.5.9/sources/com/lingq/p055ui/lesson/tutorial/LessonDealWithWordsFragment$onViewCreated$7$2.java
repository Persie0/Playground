package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7378e;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$2", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {174}, m19208m = "invokeSuspend")
public final class LessonDealWithWordsFragment$onViewCreated$7$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29113e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsFragment f29114f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsFragment$onViewCreated$7$2$1", m19206f = "LessonDealWithWordsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44411 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29115e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonDealWithWordsFragment f29116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44411(LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c<? super C44411> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29116f = lessonDealWithWordsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44411 c44411 = new C44411(this.f29116f, interfaceC9968c);
            c44411.f29115e = obj;
            return c44411;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44411) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f29115e;
            if (list != null && list.isEmpty()) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
                LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29116f;
                if (lessonDealWithWordsFragment.m10226p0().f29150k == -1) {
                    lessonDealWithWordsFragment.m10225o0().m10146s2();
                }
                lessonDealWithWordsFragment.m3598r().m3627S();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsFragment$onViewCreated$7$2(LessonDealWithWordsFragment lessonDealWithWordsFragment, InterfaceC9968c<? super LessonDealWithWordsFragment$onViewCreated$7$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29114f = lessonDealWithWordsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsFragment$onViewCreated$7$2(this.f29114f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsFragment$onViewCreated$7$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29113e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonDealWithWordsFragment.f29086F0;
            LessonDealWithWordsFragment lessonDealWithWordsFragment = this.f29114f;
            LessonDealWithWordsViewModel lessonDealWithWordsViewModelM10226p0 = lessonDealWithWordsFragment.m10226p0();
            C44411 c44411 = new C44411(lessonDealWithWordsFragment, null);
            this.f29113e = 1;
            if (C0062b.m369m0(lessonDealWithWordsViewModelM10226p0.f29137J, c44411, this) == coroutineSingletons) {
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
