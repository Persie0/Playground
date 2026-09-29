package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "language", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.SentenceEditPageViewModel$locales$1", m19206f = "SentenceEditPageViewModel.kt", m19207l = {124}, m19208m = "invokeSuspend")
final class SentenceEditPageViewModel$locales$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends UserDictionaryLocale>>, UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28074e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28075f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SentenceEditPageViewModel f28076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentenceEditPageViewModel$locales$1(SentenceEditPageViewModel sentenceEditPageViewModel, InterfaceC9968c<? super SentenceEditPageViewModel$locales$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28076g = sentenceEditPageViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super List<? extends UserDictionaryLocale>> interfaceC7117d, UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        SentenceEditPageViewModel$locales$1 sentenceEditPageViewModel$locales$1 = new SentenceEditPageViewModel$locales$1(this.f28076g, interfaceC9968c);
        sentenceEditPageViewModel$locales$1.f28075f = interfaceC7117d;
        return sentenceEditPageViewModel$locales$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28074e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28075f;
            InterfaceC7116c<List<UserDictionaryLocale>> interfaceC7116cMo6077a = this.f28076g.f28023e.mo6077a();
            this.f28074e = 1;
            if (C0062b.m280J0(this, interfaceC7116cMo6077a, interfaceC7117d) == coroutineSingletons) {
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
