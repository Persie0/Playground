package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$moveToKnown$1", m19206f = "LessonViewModel.kt", m19207l = {199}, m19208m = "invokeSuspend")
final class LessonViewModel$moveToKnown$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Boolean>, Boolean, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27706e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f27707f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ boolean f27708g;

    public LessonViewModel$moveToKnown$1(InterfaceC9968c<? super LessonViewModel$moveToKnown$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Boolean> interfaceC7117d, Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        LessonViewModel$moveToKnown$1 lessonViewModel$moveToKnown$1 = new LessonViewModel$moveToKnown$1(interfaceC9968c);
        lessonViewModel$moveToKnown$1.f27707f = interfaceC7117d;
        lessonViewModel$moveToKnown$1.f27708g = zBooleanValue;
        return lessonViewModel$moveToKnown$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27706e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f27707f;
            Boolean boolValueOf = Boolean.valueOf(this.f27708g);
            this.f27706e = 1;
            if (interfaceC7117d.mo1339r(boolValueOf, this) == coroutineSingletons) {
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
