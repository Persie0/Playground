package com.lingq.p055ui.lesson.tutorial;

import ci.InterfaceC2023p;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$updateTokenTranslation$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {174}, m19208m = "invokeSuspend")
final class LessonDealWithWordsViewModel$updateTokenTranslation$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29184e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsViewModel f29185f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$updateTokenTranslation$1(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, String str, InterfaceC9968c<? super LessonDealWithWordsViewModel$updateTokenTranslation$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29185f = lessonDealWithWordsViewModel;
        this.f29186g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsViewModel$updateTokenTranslation$1(this.f29185f, this.f29186g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsViewModel$updateTokenTranslation$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonDealWithWordsViewModel lessonDealWithWordsViewModel = this.f29185f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29184e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2023p interfaceC2023p = lessonDealWithWordsViewModel.f29145f;
                String strMo498E1 = lessonDealWithWordsViewModel.mo498E1();
                String strMo507p1 = lessonDealWithWordsViewModel.mo507p1();
                String str = this.f29186g;
                this.f29184e = 1;
                if (interfaceC2023p.mo6169g(strMo498E1, strMo507p1, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
