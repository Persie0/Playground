package com.lingq.p055ui.home;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/LanguageToLearn;", "allLanguages", "", "updateUserLanguage", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeViewModel$updateUserLanguage$1", m19206f = "HomeViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class HomeViewModel$updateUserLanguage$1 extends SuspendLambda implements InterfaceC2057q<List<? extends LanguageToLearn>, String, InterfaceC9968c<? super LanguageToLearn>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f22827e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ String f22828f;

    public HomeViewModel$updateUserLanguage$1(InterfaceC9968c<? super HomeViewModel$updateUserLanguage$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends LanguageToLearn> list, String str, InterfaceC9968c<? super LanguageToLearn> interfaceC9968c) {
        HomeViewModel$updateUserLanguage$1 homeViewModel$updateUserLanguage$1 = new HomeViewModel$updateUserLanguage$1(interfaceC9968c);
        homeViewModel$updateUserLanguage$1.f22827e = list;
        homeViewModel$updateUserLanguage$1.f22828f = str;
        return homeViewModel$updateUserLanguage$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f22827e;
        String str = this.f22828f;
        Object obj2 = null;
        if ((!C7661i.m15250P2(str)) && list != null) {
            for (Object obj3 : list) {
                if (C5207g.m11106a(((LanguageToLearn) obj3).f21681a, str)) {
                    obj2 = obj3;
                    break;
                }
            }
            obj2 = (LanguageToLearn) obj2;
        }
        return obj2;
    }
}
