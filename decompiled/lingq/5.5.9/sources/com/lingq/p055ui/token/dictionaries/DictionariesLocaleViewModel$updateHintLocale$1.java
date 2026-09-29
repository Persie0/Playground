package com.lingq.p055ui.token.dictionaries;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import hk.C6070a;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesLocaleViewModel$updateHintLocale$1", m19206f = "DictionariesLocaleViewModel.kt", m19207l = {63}, m19208m = "invokeSuspend")
final class DictionariesLocaleViewModel$updateHintLocale$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31761e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionariesLocaleViewModel f31762f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f31763g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesLocaleViewModel$updateHintLocale$1(DictionariesLocaleViewModel dictionariesLocaleViewModel, String str, InterfaceC9968c<? super DictionariesLocaleViewModel$updateHintLocale$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31762f = dictionariesLocaleViewModel;
        this.f31763g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesLocaleViewModel$updateHintLocale$1(this.f31762f, this.f31763g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesLocaleViewModel$updateHintLocale$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31761e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionariesLocaleViewModel dictionariesLocaleViewModel = this.f31762f;
            InterfaceC2008a interfaceC2008a = dictionariesLocaleViewModel.f31749d;
            String strMo498E1 = dictionariesLocaleViewModel.mo498E1();
            C6070a c6070a = dictionariesLocaleViewModel.f31753h;
            String str = c6070a.f35795a;
            TokenMeaning tokenMeaning = c6070a.f35796b;
            String str2 = this.f31763g;
            this.f31761e = 1;
            if (interfaceC2008a.mo5963o(strMo498E1, str, tokenMeaning, str2, this) == coroutineSingletons) {
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
