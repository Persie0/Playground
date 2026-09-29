package com.lingq.p055ui;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$interfaceLanguage$2", m19206f = "MainViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class MainViewModel$interfaceLanguage$2 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22336e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22337f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$interfaceLanguage$2(MainViewModel mainViewModel, InterfaceC9968c<? super MainViewModel$interfaceLanguage$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22337f = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        MainViewModel$interfaceLanguage$2 mainViewModel$interfaceLanguage$2 = new MainViewModel$interfaceLanguage$2(this.f22337f, interfaceC9968c);
        mainViewModel$interfaceLanguage$2.f22336e = obj;
        return mainViewModel$interfaceLanguage$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$interfaceLanguage$2) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        this.f22337f.f22269P = (String) this.f22336e;
        return C9072e.f47360a;
    }
}
