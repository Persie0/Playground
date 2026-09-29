package com.lingq.p055ui.home;

import androidx.datastore.preferences.PreferencesProto$Value;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2015h;
import ci.InterfaceC2020m;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$updateActiveLanguage$2", m19206f = "HomeViewModel.kt", m19207l = {170, 172, 173, 175, 176, 177}, m19208m = "invokeSuspend")
public final class HomeViewModel$updateActiveLanguage$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22820e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeViewModel f22821f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22822g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageToLearn f22823h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$updateActiveLanguage$2(HomeViewModel homeViewModel, String str, LanguageToLearn languageToLearn, InterfaceC9968c<? super HomeViewModel$updateActiveLanguage$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22821f = homeViewModel;
        this.f22822g = str;
        this.f22823h = languageToLearn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeViewModel$updateActiveLanguage$2(this.f22821f, this.f22822g, this.f22823h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeViewModel$updateActiveLanguage$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Profile profile;
        InterfaceC2012e interfaceC2012e;
        InterfaceC2020m interfaceC2020m;
        InterfaceC2011d interfaceC2011d;
        InterfaceC2015h interfaceC2015h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22820e;
        String str = this.f22822g;
        HomeViewModel homeViewModel = this.f22821f;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                InterfaceC7116c<Profile> interfaceC7116cMo504j1 = homeViewModel.mo504j1();
                this.f22820e = 1;
                obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo504j1, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profile = (Profile) obj;
                profile.getClass();
                C5207g.m11111f(str, "<set-?>");
                profile.f17795o = str;
                this.f22820e = 2;
                if (homeViewModel.mo499J(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2012e = homeViewModel.f22748e;
                this.f22820e = 3;
                if (interfaceC2012e.mo6019e(str, this.f22823h, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2020m = homeViewModel.f22747d;
                this.f22820e = 4;
                if (interfaceC2020m.mo6135d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2011d = homeViewModel.f22750g;
                this.f22820e = 5;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                profile = (Profile) obj;
                profile.getClass();
                C5207g.m11111f(str, "<set-?>");
                profile.f17795o = str;
                this.f22820e = 2;
                if (homeViewModel.mo499J(profile, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2012e = homeViewModel.f22748e;
                this.f22820e = 3;
                if (interfaceC2012e.mo6019e(str, this.f22823h, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2020m = homeViewModel.f22747d;
                this.f22820e = 4;
                if (interfaceC2020m.mo6135d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2011d = homeViewModel.f22750g;
                this.f22820e = 5;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 2:
                C7499b.m14977z0(obj);
                interfaceC2012e = homeViewModel.f22748e;
                this.f22820e = 3;
                if (interfaceC2012e.mo6019e(str, this.f22823h, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2020m = homeViewModel.f22747d;
                this.f22820e = 4;
                if (interfaceC2020m.mo6135d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2011d = homeViewModel.f22750g;
                this.f22820e = 5;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 3:
                C7499b.m14977z0(obj);
                interfaceC2020m = homeViewModel.f22747d;
                this.f22820e = 4;
                if (interfaceC2020m.mo6135d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2011d = homeViewModel.f22750g;
                this.f22820e = 5;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 4:
                C7499b.m14977z0(obj);
                interfaceC2011d = homeViewModel.f22750g;
                this.f22820e = 5;
                if (interfaceC2011d.mo6003c(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 5:
                C7499b.m14977z0(obj);
                interfaceC2015h = homeViewModel.f22749f;
                this.f22820e = 6;
                if (interfaceC2015h.mo6078b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
