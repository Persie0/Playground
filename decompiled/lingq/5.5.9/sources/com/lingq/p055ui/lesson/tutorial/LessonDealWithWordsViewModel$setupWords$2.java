package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7378e;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$2", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {108}, m19208m = "invokeSuspend")
public final class LessonDealWithWordsViewModel$setupWords$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29180e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsViewModel f29181f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$2$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44571 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29182e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonDealWithWordsViewModel f29183f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44571(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super C44571> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29183f = lessonDealWithWordsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44571 c44571 = new C44571(this.f29183f, interfaceC9968c);
            c44571.f29182e = obj;
            return c44571;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44571) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f29183f.f29136I.setValue((List) this.f29182e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$setupWords$2(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super LessonDealWithWordsViewModel$setupWords$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29181f = lessonDealWithWordsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsViewModel$setupWords$2(this.f29181f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsViewModel$setupWords$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29180e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonDealWithWordsViewModel lessonDealWithWordsViewModel = this.f29181f;
            InterfaceC7116c interfaceC7116cMo6196f = lessonDealWithWordsViewModel.f29143d.mo6196f(lessonDealWithWordsViewModel.f29151l, lessonDealWithWordsViewModel.mo498E1());
            C44571 c44571 = new C44571(lessonDealWithWordsViewModel, null);
            this.f29180e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6196f, c44571, this) == coroutineSingletons) {
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
