package com.lingq.p055ui.info;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p181ii.C6332a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getCourse$1", m19206f = "LessonInfoViewModel.kt", m19207l = {396}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$getCourse$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26973e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26974f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f26975g;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoViewModel$getCourse$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lii/a;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$getCourse$1$1", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41471 extends SuspendLambda implements InterfaceC2056p<C6332a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26976e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoViewModel f26977f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41471(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super C41471> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26977f = lessonInfoViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41471 c41471 = new C41471(this.f26977f, interfaceC9968c);
            c41471.f26976e = obj;
            return c41471;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6332a c6332a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41471) mo1336a(c6332a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26977f.f26951h0.setValue((C6332a) this.f26976e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$getCourse$1(LessonInfoViewModel lessonInfoViewModel, int i10, InterfaceC9968c<? super LessonInfoViewModel$getCourse$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26974f = lessonInfoViewModel;
        this.f26975g = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$getCourse$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$getCourse$1(this.f26974f, this.f26975g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26973e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel = this.f26974f;
            InterfaceC7116c<C6332a> interfaceC7116cMo6072r = lessonInfoViewModel.f26944e.mo6072r(this.f26975g);
            C41471 c41471 = new C41471(lessonInfoViewModel, null);
            this.f26973e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6072r, c41471, this) == coroutineSingletons) {
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
