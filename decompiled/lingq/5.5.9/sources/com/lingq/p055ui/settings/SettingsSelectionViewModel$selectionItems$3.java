package com.lingq.p055ui.settings;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "locales", "Lcom/lingq/shared/domain/Profile;", "profile", "Lnh/p$b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$3", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$selectionItems$3 extends SuspendLambda implements InterfaceC2057q<List<? extends UserDictionaryLocale>, Profile, InterfaceC9968c<? super List<? extends AbstractC7789p.b>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f31116e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Profile f31117f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SettingsSelectionViewModel f31118g;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$selectionItems$3$a */
    public static final class C4781a<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SettingsSelectionViewModel f31119a;

        public C4781a(SettingsSelectionViewModel settingsSelectionViewModel) {
            this.f31119a = settingsSelectionViewModel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            SettingsSelectionViewModel settingsSelectionViewModel = this.f31119a;
            return C7499b.m14951m(C4924a.m10439R(settingsSelectionViewModel.f31077k, ((UserDictionaryLocale) t10).f21721a), C4924a.m10439R(settingsSelectionViewModel.f31077k, ((UserDictionaryLocale) t11).f21721a));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$selectionItems$3(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$selectionItems$3> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f31118g = settingsSelectionViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends UserDictionaryLocale> list, Profile profile, InterfaceC9968c<? super List<? extends AbstractC7789p.b>> interfaceC9968c) {
        SettingsSelectionViewModel$selectionItems$3 settingsSelectionViewModel$selectionItems$3 = new SettingsSelectionViewModel$selectionItems$3(this.f31118g, interfaceC9968c);
        settingsSelectionViewModel$selectionItems$3.f31116e = list;
        settingsSelectionViewModel$selectionItems$3.f31117f = profile;
        return settingsSelectionViewModel$selectionItems$3.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f31116e;
        List<String> list2 = this.f31117f.f17798r;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                Object next = it.next();
                if (!list2.contains(((UserDictionaryLocale) next).f21721a)) {
                    arrayList.add(next);
                }
            }
        }
        SettingsSelectionViewModel settingsSelectionViewModel = this.f31118g;
        List<UserDictionaryLocale> listM13447o0 = C6752c.m13447o0(arrayList, new C4781a(settingsSelectionViewModel));
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(listM13447o0, 10));
        for (UserDictionaryLocale userDictionaryLocale : listM13447o0) {
            arrayList2.add(new AbstractC7789p.b(ViewKeys.AddDictionaryLanguage.ordinal(), C4924a.m10439R(settingsSelectionViewModel.f31077k, userDictionaryLocale.f21721a), C4924a.m10439R(settingsSelectionViewModel.f31077k, userDictionaryLocale.f21721a), false));
        }
        return arrayList2;
    }
}
