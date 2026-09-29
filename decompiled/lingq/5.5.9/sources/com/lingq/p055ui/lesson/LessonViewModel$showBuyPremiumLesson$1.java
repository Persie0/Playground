package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$showBuyPremiumLesson$1", m19206f = "LessonViewModel.kt", m19207l = {1974, 1977, 1979}, m19208m = "invokeSuspend")
final class LessonViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27757e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27758f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f27759g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$showBuyPremiumLesson$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$showBuyPremiumLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27758f = lessonViewModel;
        this.f27759g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$showBuyPremiumLesson$1(this.f27758f, this.f27759g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$showBuyPremiumLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27757e;
        LessonViewModel lessonViewModel = this.f27758f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = lessonViewModel.f27399H.mo9619h();
        this.f27757e = 1;
        obj = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        int i11 = ((Profile) obj).f17800t;
        LessonStudy lessonStudy = (LessonStudy) lessonViewModel.f27517x0.getValue();
        int i12 = lessonStudy != null ? lessonStudy.f21840z : 0;
        if (i11 < i12) {
            C7138s c7138s = lessonViewModel.f27387B0;
            Pair pair = new Pair(new Integer(i12), new Integer(i11));
            this.f27757e = 2;
            if (c7138s.mo1339r(pair, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C7138s c7138s2 = lessonViewModel.f27521z0;
            Triple triple = new Triple(new Integer(i12), new Integer(i11), new Integer(this.f27759g));
            this.f27757e = 3;
            if (c7138s2.mo1339r(triple, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
