package com.lingq.core.settings.notifications;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.settings.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.in6;
import p000.jn6;
import p000.ma3;
import p000.u91;
import p000.v91;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.notifications.NotificationsSettingsViewModel$items$1", m4291f = "NotificationsSettingsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsSettingsViewModel$items$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f23008a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Language f23009b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NotificationsSettingsViewModel$items$1 notificationsSettingsViewModel$items$1 = new NotificationsSettingsViewModel$items$1(3, (Continuation) obj3);
        notificationsSettingsViewModel$items$1.f23008a = (List) obj;
        notificationsSettingsViewModel$items$1.f23009b = (Language) obj2;
        return notificationsSettingsViewModel$items$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        List list = this.f23008a;
        Language language = this.f23009b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jn6(R$string.settings_active_language));
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((Language) next).f19024a, language != null ? language.f19024a : null));
        Language language2 = (Language) next;
        if (language2 != null) {
            arrayList.add(new in6(new LanguageToLearn(language2.f19024a, false, language2.f19029f, 0, (String) null, (String) null, false, 250)));
        }
        arrayList.add(new jn6(R$string.settings_other_languages));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (!fa4.m11650l(((Language) obj2).f19024a, language != null ? language.f19024a : null)) {
                arrayList2.add(obj2);
            }
        }
        List<Language> listM22614f1 = u91.m22614f1(arrayList2, new ma3(28));
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(listM22614f1, 10));
        for (Language language3 : listM22614f1) {
            arrayList3.add(new in6(new LanguageToLearn(language3.f19024a, false, language3.f19029f, 0, (String) null, (String) null, false, 250)));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
