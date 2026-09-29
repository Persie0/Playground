package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$8", m19206f = "LessonCompleteFragment.kt", m19207l = {359}, m19208m = "invokeSuspend")
public final class LessonCompleteFragment$onViewCreated$6$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28956e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteFragment f28957f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$8$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "url", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$8$1", m19206f = "LessonCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44241 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28958e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteFragment f28959f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44241(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super C44241> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28959f = lessonCompleteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44241 c44241 = new C44241(this.f28959f, interfaceC9968c);
            c44241.f28958e = obj;
            return c44241;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44241) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f28958e;
            LessonCompleteFragment lessonCompleteFragment = this.f28959f;
            lessonCompleteFragment.f28898D0 = true;
            List<Integer> list = C6716m.f37937a;
            C6716m.m13330o(lessonCompleteFragment.m3578a0(), str, C8573r0.m16725g0(lessonCompleteFragment), 4);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteFragment$onViewCreated$6$8(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super LessonCompleteFragment$onViewCreated$6$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28957f = lessonCompleteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteFragment$onViewCreated$6$8(this.f28957f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteFragment$onViewCreated$6$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28956e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteFragment lessonCompleteFragment = this.f28957f;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
            C44241 c44241 = new C44241(lessonCompleteFragment, null);
            this.f28956e = 1;
            if (C0062b.m369m0(lessonCompleteViewModelM10217q0.f28984S, c44241, this) == coroutineSingletons) {
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
