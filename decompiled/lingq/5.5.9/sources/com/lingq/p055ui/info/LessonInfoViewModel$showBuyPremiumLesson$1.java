package com.lingq.p055ui.info;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.library.LessonInfo;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$showBuyPremiumLesson$1", m19206f = "LessonInfoViewModel.kt", m19207l = {453, 455, 457}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$showBuyPremiumLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27027e;

    /* JADX INFO: renamed from: f */
    public int f27028f;

    /* JADX INFO: renamed from: g */
    public int f27029g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonInfoViewModel f27030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$showBuyPremiumLesson$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$showBuyPremiumLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27030h = lessonInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$showBuyPremiumLesson$1(this.f27030h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$showBuyPremiumLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f27029g;
        LessonInfoViewModel lessonInfoViewModel = this.f27030h;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = this.f27028f;
                i11 = this.f27027e;
                C7499b.m14977z0(obj);
            } else {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        LessonInfo lessonInfo = (LessonInfo) lessonInfoViewModel.f26922J.getValue();
        int i13 = lessonInfo != null ? lessonInfo.f21961L : 0;
        LessonInfo lessonInfo2 = (LessonInfo) lessonInfoViewModel.f26922J.getValue();
        i10 = lessonInfo2 != null ? lessonInfo2.f21964a : 0;
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = lessonInfoViewModel.f26952i.mo9619h();
        this.f27027e = i13;
        this.f27028f = i10;
        this.f27029g = 1;
        Object objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        i11 = i13;
        obj = objM14360a;
        int i14 = ((Profile) obj).f17800t;
        if (i14 < i11) {
            C7138s c7138s = lessonInfoViewModel.f26943d0;
            Pair pair = new Pair(new Integer(i11), new Integer(i14));
            this.f27029g = 2;
            if (c7138s.mo1339r(pair, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C7138s c7138s2 = lessonInfoViewModel.f26940b0;
            Triple triple = new Triple(new Integer(i11), new Integer(i14), new Integer(i10));
            this.f27029g = 3;
            if (c7138s2.mo1339r(triple, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
