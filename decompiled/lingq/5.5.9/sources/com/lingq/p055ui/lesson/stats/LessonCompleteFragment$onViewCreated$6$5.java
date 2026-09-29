package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$5", m19206f = "LessonCompleteFragment.kt", m19207l = {304}, m19208m = "invokeSuspend")
public final class LessonCompleteFragment$onViewCreated$6$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28938e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteFragment f28939f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$5$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$5$1", m19206f = "LessonCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44211 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends String, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28940e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteFragment f28941f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44211(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super C44211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28941f = lessonCompleteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44211 c44211 = new C44211(this.f28941f, interfaceC9968c);
            c44211.f28940e = obj;
            return c44211;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends String, ? extends Boolean> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44211) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f28940e;
            int iIntValue = ((Number) triple.f38021a).intValue();
            String str = (String) triple.f38022b;
            boolean zBooleanValue = ((Boolean) triple.f38023c).booleanValue();
            LessonCompleteFragment lessonCompleteFragment = this.f28941f;
            if (zBooleanValue) {
                C4924a.m10447Z(C8573r0.m16725g0(lessonCompleteFragment), C8573r0.m16663B(iIntValue, str, false, true, 4));
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
                LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
                C5207g.m11111f(str, "lessonURL");
                C7499b.m14933c0(C8573r0.m16767w0(lessonCompleteViewModelM10217q0), lessonCompleteViewModelM10217q0.f29007j, lessonCompleteViewModelM10217q0.f29005i, C0166e.m761g("removeLessonFromPlaylist ", iIntValue), new LessonCompleteViewModel$removeLessonFromPlaylist$1(lessonCompleteViewModelM10217q0, str, iIntValue, null));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteFragment$onViewCreated$6$5(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super LessonCompleteFragment$onViewCreated$6$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28939f = lessonCompleteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteFragment$onViewCreated$6$5(this.f28939f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteFragment$onViewCreated$6$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28938e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteFragment lessonCompleteFragment = this.f28939f;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
            C44211 c44211 = new C44211(lessonCompleteFragment, null);
            this.f28938e = 1;
            if (C0062b.m369m0(lessonCompleteViewModelM10217q0.f28990Y, c44211, this) == coroutineSingletons) {
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
