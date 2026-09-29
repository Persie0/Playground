package com.lingq.p055ui.lesson.tutorial;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7378e;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$onAddMeaning$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {117, 120}, m19208m = "invokeSuspend")
final class LessonDealWithWordsViewModel$onAddMeaning$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29170e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonDealWithWordsViewModel f29171f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C7378e f29172g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f29173h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f29174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonDealWithWordsViewModel$onAddMeaning$1(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, C7378e c7378e, int i10, String str, InterfaceC9968c<? super LessonDealWithWordsViewModel$onAddMeaning$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29171f = lessonDealWithWordsViewModel;
        this.f29172g = c7378e;
        this.f29173h = i10;
        this.f29174i = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonDealWithWordsViewModel$onAddMeaning$1(this.f29171f, this.f29172g, this.f29173h, this.f29174i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonDealWithWordsViewModel$onAddMeaning$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29170e;
        LessonDealWithWordsViewModel lessonDealWithWordsViewModel = this.f29171f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            new Integer(((Number) obj).intValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = lessonDealWithWordsViewModel.mo508t1();
        this.f29170e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        int i11 = profileAccount.f17809i;
        Integer num = profileAccount.f17808h;
        if (i11 < (num != null ? num.intValue() : 0) || lessonDealWithWordsViewModel.mo502f0()) {
            C7378e c7378e = this.f29172g;
            TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7378e.f41171e);
            if (tokenMeaning != null) {
                int i12 = this.f29173h;
                String str = this.f29174i;
                InterfaceC2008a interfaceC2008a = lessonDealWithWordsViewModel.f29144e;
                String strMo498E1 = lessonDealWithWordsViewModel.mo498E1();
                String str2 = c7378e.f41167a;
                int value = CardStatus.New.getValue();
                this.f29170e = 2;
                obj = interfaceC2008a.mo5969u(i12, strMo498E1, str2, tokenMeaning, value, str, "Deal with blue word pop up", this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                new Integer(((Number) obj).intValue());
            }
        } else {
            lessonDealWithWordsViewModel.f29141N.mo14371k(C9072e.f47360a);
        }
        return C9072e.f47360a;
    }
}
