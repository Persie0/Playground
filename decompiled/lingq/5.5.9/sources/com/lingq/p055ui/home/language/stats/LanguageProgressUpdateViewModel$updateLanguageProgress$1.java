package com.lingq.p055ui.home.language.stats;

import ci.InterfaceC2013f;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageProgressUpdateViewModel$updateLanguageProgress$1", m19206f = "LanguageProgressUpdateViewModel.kt", m19207l = {27}, m19208m = "invokeSuspend")
final class LanguageProgressUpdateViewModel$updateLanguageProgress$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24233e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageProgressUpdateViewModel f24234f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24235g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24236h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ double f24237i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ double f24238j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageProgressUpdateViewModel$updateLanguageProgress$1(LanguageProgressUpdateViewModel languageProgressUpdateViewModel, String str, String str2, double d10, double d11, InterfaceC9968c<? super LanguageProgressUpdateViewModel$updateLanguageProgress$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24234f = languageProgressUpdateViewModel;
        this.f24235g = str;
        this.f24236h = str2;
        this.f24237i = d10;
        this.f24238j = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageProgressUpdateViewModel$updateLanguageProgress$1(this.f24234f, this.f24235g, this.f24236h, this.f24237i, this.f24238j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageProgressUpdateViewModel$updateLanguageProgress$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24233e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageProgressUpdateViewModel languageProgressUpdateViewModel = this.f24234f;
            InterfaceC2013f interfaceC2013f = languageProgressUpdateViewModel.f24231d;
            String strMo498E1 = languageProgressUpdateViewModel.mo498E1();
            String str = this.f24235g;
            String str2 = this.f24236h;
            double d10 = this.f24237i;
            double d11 = this.f24238j;
            this.f24233e = 1;
            if (interfaceC2013f.mo6045f(strMo498E1, str, str2, d10, d11, this) == coroutineSingletons) {
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
