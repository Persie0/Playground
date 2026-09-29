package com.lingq.p055ui.home.notifications;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguages", "userActiveLanguage", "", "Lcom/lingq/ui/home/notifications/b$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.notifications.NotificationsSettingsViewModel$adapterItemList$1", m19206f = "NotificationsSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class NotificationsSettingsViewModel$adapterItemList$1 extends SuspendLambda implements InterfaceC2057q<List<? extends UserLanguage>, UserLanguage, InterfaceC9968c<? super List<C3887b.a>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ List f25352e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ UserLanguage f25353f;

    /* JADX INFO: renamed from: com.lingq.ui.home.notifications.NotificationsSettingsViewModel$adapterItemList$1$a */
    public static final class C3880a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(((UserLanguage) t10).f21731f, ((UserLanguage) t11).f21731f);
        }
    }

    public NotificationsSettingsViewModel$adapterItemList$1(InterfaceC9968c<? super NotificationsSettingsViewModel$adapterItemList$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(List<? extends UserLanguage> list, UserLanguage userLanguage, InterfaceC9968c<? super List<C3887b.a>> interfaceC9968c) {
        NotificationsSettingsViewModel$adapterItemList$1 notificationsSettingsViewModel$adapterItemList$1 = new NotificationsSettingsViewModel$adapterItemList$1(interfaceC9968c);
        notificationsSettingsViewModel$adapterItemList$1.f25352e = list;
        notificationsSettingsViewModel$adapterItemList$1.f25353f = userLanguage;
        return notificationsSettingsViewModel$adapterItemList$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List list = this.f25352e;
        UserLanguage userLanguage = this.f25353f;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3887b.a.b("Active Language"));
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C5207g.m11106a(((UserLanguage) next).f21726a, userLanguage != null ? userLanguage.f21726a : null));
        UserLanguage userLanguage2 = (UserLanguage) next;
        if (userLanguage2 != null) {
            arrayList.add(new C3887b.a.C10625a(new LanguageToLearn(userLanguage2.f21726a, false, userLanguage2.f21731f, 0, null, null, 58, null)));
        }
        arrayList.add(new C3887b.a.b("Other Languages"));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!C5207g.m11106a(((UserLanguage) obj2).f21726a, userLanguage != null ? userLanguage.f21726a : null)) {
                arrayList2.add(obj2);
            }
        }
        List<UserLanguage> listM13447o0 = C6752c.m13447o0(arrayList2, new C3880a());
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(listM13447o0, 10));
        for (UserLanguage userLanguage3 : listM13447o0) {
            arrayList3.add(new C3887b.a.C10625a(new LanguageToLearn(userLanguage3.f21726a, false, userLanguage3.f21731f, 0, null, null, 58, null)));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
