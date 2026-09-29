package com.lingq.p055ui.home.library;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$1", m19206f = "LessonPreviewFragment.kt", m19207l = {75}, m19208m = "invokeSuspend")
public final class LessonPreviewFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24542e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPreviewFragment f24543f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$1$1", m19206f = "LessonPreviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37461 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f24544e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPreviewFragment f24545f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37461(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super C37461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24545f = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37461 c37461 = new C37461(this.f24545f, interfaceC9968c);
            c37461.f24544e = ((Boolean) obj).booleanValue();
            return c37461;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37461) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f24544e;
            LessonPreviewFragment lessonPreviewFragment = this.f24545f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
                lessonPreviewFragment.m9930o0().f45099c.m4935d();
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonPreviewFragment.f24530D0;
                lessonPreviewFragment.m9930o0().f45099c.m4933b();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$5$1(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super LessonPreviewFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24543f = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPreviewFragment$onViewCreated$5$1(this.f24543f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPreviewFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24542e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
            LessonPreviewFragment lessonPreviewFragment = this.f24543f;
            LessonPreviewViewModel lessonPreviewViewModelM9931p0 = lessonPreviewFragment.m9931p0();
            C37461 c37461 = new C37461(lessonPreviewFragment, null);
            this.f24542e = 1;
            if (C0062b.m369m0(lessonPreviewViewModelM9931p0.f24577j, c37461, this) == coroutineSingletons) {
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
