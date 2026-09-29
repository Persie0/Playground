package com.lingq.p055ui.home;

import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$registerFirebase$1", m19206f = "HomeViewModel.kt", m19207l = {157}, m19208m = "invokeSuspend")
final class HomeViewModel$registerFirebase$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22815e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeViewModel f22816f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22817g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f22818h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f22819i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$registerFirebase$1(HomeViewModel homeViewModel, String str, String str2, String str3, InterfaceC9968c<? super HomeViewModel$registerFirebase$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22816f = homeViewModel;
        this.f22817g = str;
        this.f22818h = str2;
        this.f22819i = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeViewModel$registerFirebase$1(this.f22816f, this.f22817g, this.f22818h, this.f22819i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeViewModel$registerFirebase$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22815e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2020m interfaceC2020m = this.f22816f.f22747d;
                String str = this.f22817g;
                String str2 = this.f22818h;
                String str3 = this.f22819i;
                this.f22815e = 1;
                if (interfaceC2020m.mo6147p(str, str2, str3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (HttpException | Exception unused) {
        }
        return C9072e.f47360a;
    }
}
