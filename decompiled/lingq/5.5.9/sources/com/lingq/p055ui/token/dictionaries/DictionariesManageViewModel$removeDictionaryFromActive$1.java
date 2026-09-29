package com.lingq.p055ui.token.dictionaries;

import ci.InterfaceC2011d;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryData;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$removeDictionaryFromActive$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {210}, m19208m = "invokeSuspend")
final class DictionariesManageViewModel$removeDictionaryFromActive$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31844e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionariesManageViewModel f31845f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UserDictionaryData f31846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$removeDictionaryFromActive$1(DictionariesManageViewModel dictionariesManageViewModel, UserDictionaryData userDictionaryData, InterfaceC9968c<? super DictionariesManageViewModel$removeDictionaryFromActive$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31845f = dictionariesManageViewModel;
        this.f31846g = userDictionaryData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesManageViewModel$removeDictionaryFromActive$1(this.f31845f, this.f31846g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesManageViewModel$removeDictionaryFromActive$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31844e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionariesManageViewModel dictionariesManageViewModel = this.f31845f;
            InterfaceC2011d interfaceC2011d = dictionariesManageViewModel.f31805e;
            int i11 = this.f31846g.f21703a;
            String strMo498E1 = dictionariesManageViewModel.mo498E1();
            this.f31844e = 1;
            if (interfaceC2011d.mo6014n(i11, strMo498E1, this) == coroutineSingletons) {
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
