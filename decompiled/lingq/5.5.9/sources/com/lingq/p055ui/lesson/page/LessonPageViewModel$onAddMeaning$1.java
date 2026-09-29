package com.lingq.p055ui.lesson.page;

import ci.InterfaceC2008a;
import ci.InterfaceC2026s;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$onAddMeaning$1", m19206f = "LessonPageViewModel.kt", m19207l = {1134, 1137, 1140}, m19208m = "invokeSuspend")
final class LessonPageViewModel$onAddMeaning$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f28612g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f28613h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f28614i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$onAddMeaning$1(LessonPageViewModel lessonPageViewModel, String str, int i10, String str2, InterfaceC9968c<? super LessonPageViewModel$onAddMeaning$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28611f = lessonPageViewModel;
        this.f28612g = str;
        this.f28613h = i10;
        this.f28614i = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$onAddMeaning$1(this.f28611f, this.f28612g, this.f28613h, this.f28614i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$onAddMeaning$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        C7378e c7378e;
        int i10;
        String str;
        TokenMeaning tokenMeaning;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f28610e;
        LessonPageViewModel lessonPageViewModel = this.f28611f;
        if (i11 != 0) {
            if (i11 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i11 == 2) {
                    C7499b.m14977z0(obj);
                    c7378e = (C7378e) obj;
                    if (c7378e != null) {
                        i10 = this.f28613h;
                        str = this.f28614i;
                        tokenMeaning = (TokenMeaning) C6752c.m13425S(c7378e.f41171e);
                        if (tokenMeaning != null) {
                            InterfaceC2008a interfaceC2008a = lessonPageViewModel.f28548d;
                            String strMo498E1 = lessonPageViewModel.mo498E1();
                            String str2 = c7378e.f41167a;
                            int value = CardStatus.New.getValue();
                            this.f28610e = 3;
                            obj = interfaceC2008a.mo5969u(i10, strMo498E1, str2, tokenMeaning, value, str, "", this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            new Integer(((Number) obj).intValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = lessonPageViewModel.mo508t1();
        this.f28610e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        int i12 = profileAccount.f17809i;
        Integer num = profileAccount.f17808h;
        if (i12 < (num != null ? num.intValue() : 0) || lessonPageViewModel.mo502f0()) {
            InterfaceC2026s interfaceC2026s = lessonPageViewModel.f28550e;
            String strMo498E2 = lessonPageViewModel.mo498E1();
            this.f28610e = 2;
            obj = interfaceC2026s.mo6201k(strMo498E2, this.f28612g, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            c7378e = (C7378e) obj;
            if (c7378e != null) {
                i10 = this.f28613h;
                str = this.f28614i;
                tokenMeaning = (TokenMeaning) C6752c.m13425S(c7378e.f41171e);
                if (tokenMeaning != null) {
                    InterfaceC2008a interfaceC2008a2 = lessonPageViewModel.f28548d;
                    String strMo498E3 = lessonPageViewModel.mo498E1();
                    String str3 = c7378e.f41167a;
                    int value2 = CardStatus.New.getValue();
                    this.f28610e = 3;
                    obj = interfaceC2008a2.mo5969u(i10, strMo498E3, str3, tokenMeaning, value2, str, "", this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    new Integer(((Number) obj).intValue());
                }
            }
        } else {
            lessonPageViewModel.f28577x0.mo14371k(C9072e.f47360a);
        }
        return C9072e.f47360a;
    }
}
