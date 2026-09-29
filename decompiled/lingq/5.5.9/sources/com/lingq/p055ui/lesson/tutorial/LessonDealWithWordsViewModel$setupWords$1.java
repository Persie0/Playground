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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {102}, m19208m = "invokeSuspend")
public final class LessonDealWithWordsViewModel$setupWords$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29175e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsViewModel f29176f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<String> f29177g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$setupWords$1$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44561 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29178e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonDealWithWordsViewModel f29179f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44561(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super C44561> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29179f = lessonDealWithWordsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44561 c44561 = new C44561(this.f29179f, interfaceC9968c);
            c44561.f29178e = obj;
            return c44561;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44561) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f29179f.f29136I.setValue((List) this.f29178e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$setupWords$1(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, List<String> list, InterfaceC9968c<? super LessonDealWithWordsViewModel$setupWords$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29176f = lessonDealWithWordsViewModel;
        this.f29177g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsViewModel$setupWords$1(this.f29176f, this.f29177g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsViewModel$setupWords$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29175e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonDealWithWordsViewModel lessonDealWithWordsViewModel = this.f29176f;
            InterfaceC7116c interfaceC7116cMo6196f = lessonDealWithWordsViewModel.f29143d.mo6196f(this.f29177g, lessonDealWithWordsViewModel.mo498E1());
            C44561 c44561 = new C44561(lessonDealWithWordsViewModel, null);
            this.f29175e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6196f, c44561, this) == coroutineSingletons) {
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
