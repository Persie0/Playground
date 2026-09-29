package com.lingq.shared.repository;

import ae.C0062b;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1529t0;
import ci.InterfaceC2012e;
import com.lingq.entity.Language;
import com.lingq.entity.LanguageCardsTags;
import com.lingq.entity.LanguageContext;
import com.lingq.entity.LanguageContextNotification;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestLanguageContextEmailNotification;
import com.lingq.shared.network.requests.RequestLanguageContextNotification;
import com.lingq.shared.network.requests.RequestLanguageContextRepetitionLingqsNotification;
import com.lingq.shared.network.requests.RequestLanguageContextSiteNotification;
import com.lingq.shared.network.result.ResultLanguageContext;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.LanguageEmailNotificationUpdateWorker;
import com.lingq.shared.network.workers.LanguageFeedLevelUpdateWorker;
import com.lingq.shared.network.workers.LanguageIntensityUpdateWorker;
import com.lingq.shared.network.workers.LanguageRepetitionLingqsUpdateWorker;
import com.lingq.shared.network.workers.LanguageSiteNotificationUpdateWorker;
import com.lingq.shared.network.workers.LanguageTopicsUpdateWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import dm.C5206f;
import dm.C5207g;
import gi.C5803a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p076di.InterfaceC5179a;
import p260m8.C7499b;
import p460wh.InterfaceC9937e;
import p464wl.InterfaceC9968c;
import p511yh.C10366c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class LanguageRepositoryImpl implements InterfaceC2012e {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f19681a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1529t0 f19682b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9937e f19683c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5179a f19684d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1317j f19685e;

    public LanguageRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1529t0 abstractC1529t0, InterfaceC9937e interfaceC9937e, InterfaceC5179a interfaceC5179a, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1529t0, "languageDao");
        C5207g.m11111f(interfaceC9937e, "languageService");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f19681a = lingQDatabase;
        this.f19682b = abstractC1529t0;
        this.f19683c = interfaceC9937e;
        this.f19684d = interfaceC5179a;
        this.f19685e = abstractC1317j;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00da A[Catch: Exception -> 0x00bd, TRY_LEAVE, TryCatch #0 {Exception -> 0x00bd, blocks: (B:14:0x0036, B:53:0x00d1, B:55:0x00da, B:20:0x004a, B:50:0x00c0, B:23:0x0052, B:30:0x006c, B:32:0x0073, B:34:0x007e, B:36:0x0085, B:38:0x0091, B:40:0x0097, B:43:0x00a2, B:44:0x00a6, B:26:0x005a), top: B:61:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: a */
    public final Object mo6015a(InterfaceC9968c<? super Resource<? extends List<UserLanguage>>> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$userLanguages$1 languageRepositoryImpl$userLanguages$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str;
        List list;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$userLanguages$1) {
            languageRepositoryImpl$userLanguages$1 = (LanguageRepositoryImpl$userLanguages$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$userLanguages$1.f19789g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$userLanguages$1.f19789g = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$userLanguages$1 = new LanguageRepositoryImpl$userLanguages$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$userLanguages$1 = new LanguageRepositoryImpl$userLanguages$1(this, interfaceC9968c);
        }
        Object objM18442a = languageRepositoryImpl$userLanguages$1.f19787e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$userLanguages$1.f19789g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    languageRepositoryImpl = languageRepositoryImpl$userLanguages$1.f19786d;
                    C7499b.m14977z0(objM18442a);
                } else if (i11 == 2) {
                    languageRepositoryImpl = languageRepositoryImpl$userLanguages$1.f19786d;
                    C7499b.m14977z0(objM18442a);
                    AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
                    languageRepositoryImpl$userLanguages$1.f19786d = null;
                    languageRepositoryImpl$userLanguages$1.f19789g = 3;
                    objM18442a = abstractC1529t0.mo5183t0(languageRepositoryImpl$userLanguages$1);
                    if (objM18442a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18442a);
                }
                list = (List) objM18442a;
                if (!list.isEmpty()) {
                    Resource.f17861d.getClass();
                    return Resource.C3303a.m9437c(list);
                }
                Resource.C3303a c3303a = Resource.f17861d;
                EmptyList emptyList = EmptyList.f38032a;
                c3303a.getClass();
                return new Resource(Resource.Status.EMPTY, emptyList, null);
            }
            C7499b.m14977z0(objM18442a);
            InterfaceC9937e interfaceC9937e = this.f19683c;
            languageRepositoryImpl$userLanguages$1.f19786d = this;
            languageRepositoryImpl$userLanguages$1.f19789g = 1;
            objM18442a = interfaceC9937e.m18442a(languageRepositoryImpl$userLanguages$1);
            if (objM18442a == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageRepositoryImpl = this;
            Collection collection = ((Results) objM18442a).f19136d;
            if (collection != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        ResultLanguageContext resultLanguageContext = (ResultLanguageContext) it.next();
                        Language language = resultLanguageContext.f18450j;
                        LanguageContext languageContextM19387a = (language == null || (str = language.f16981a) == null) ? null : C10366c.m19387a(resultLanguageContext, str);
                        if (languageContextM19387a != null) {
                            arrayList.add(languageContextM19387a);
                        }
                    }
                }
                LingQDatabase lingQDatabase = languageRepositoryImpl.f19681a;
                LanguageRepositoryImpl$userLanguages$2$1 languageRepositoryImpl$userLanguages$2$1 = new LanguageRepositoryImpl$userLanguages$2$1(languageRepositoryImpl, arrayList, null);
                languageRepositoryImpl$userLanguages$1.f19786d = languageRepositoryImpl;
                languageRepositoryImpl$userLanguages$1.f19789g = 2;
                if (RoomDatabaseKt.m4573a(lingQDatabase, languageRepositoryImpl$userLanguages$2$1, languageRepositoryImpl$userLanguages$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            AbstractC1529t0 abstractC1529t1 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$userLanguages$1.f19786d = null;
            languageRepositoryImpl$userLanguages$1.f19789g = 3;
            objM18442a = abstractC1529t1.mo5183t0(languageRepositoryImpl$userLanguages$1);
            if (objM18442a == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = (List) objM18442a;
            if (!list.isEmpty()) {
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(list);
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            EmptyList emptyList2 = EmptyList.f38032a;
            c3303a2.getClass();
            return new Resource(Resource.Status.EMPTY, emptyList2, null);
        } catch (Exception e10) {
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        }
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<List<UserLanguage>> mo6016b() {
        return this.f19682b.mo5178o0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: c */
    public final Object mo6017c(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1 languageRepositoryImpl$networkUpdateRepetitionLingqs$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1) {
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = (LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19726h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19726h = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = new LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = new LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(this, interfaceC9968c);
        }
        Object objMo5181r0 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19724f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19726h;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19723e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19722d;
                C7499b.m14977z0(objMo5181r0);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5181r0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5181r0);
        languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19722d = this;
        languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19723e = i10;
        languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19726h = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str, languageRepositoryImpl$networkUpdateRepetitionLingqs$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            RequestLanguageContextRepetitionLingqsNotification requestLanguageContextRepetitionLingqsNotification = new RequestLanguageContextRepetitionLingqsNotification();
            requestLanguageContextRepetitionLingqsNotification.f18085a = new Integer(i10);
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(languageContext.f16995b);
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19722d = null;
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f19726h = 2;
            objMo5181r0 = interfaceC9937e.m18444c(num, requestLanguageContextRepetitionLingqsNotification, languageRepositoryImpl$networkUpdateRepetitionLingqs$1);
            if (objMo5181r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: d */
    public final Object mo6018d(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateUserLanguages$1 languageRepositoryImpl$updateUserLanguages$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateUserLanguages$1) {
            languageRepositoryImpl$updateUserLanguages$1 = (LanguageRepositoryImpl$updateUserLanguages$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$updateUserLanguages$1.f19782g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateUserLanguages$1.f19782g = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateUserLanguages$1 = new LanguageRepositoryImpl$updateUserLanguages$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateUserLanguages$1 = new LanguageRepositoryImpl$updateUserLanguages$1(this, interfaceC9968c);
        }
        Object objM18442a = languageRepositoryImpl$updateUserLanguages$1.f19780e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$updateUserLanguages$1.f19782g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    languageRepositoryImpl = languageRepositoryImpl$updateUserLanguages$1.f19779d;
                    C7499b.m14977z0(objM18442a);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18442a);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18442a);
            InterfaceC9937e interfaceC9937e = this.f19683c;
            languageRepositoryImpl$updateUserLanguages$1.f19779d = this;
            languageRepositoryImpl$updateUserLanguages$1.f19782g = 1;
            objM18442a = interfaceC9937e.m18442a(languageRepositoryImpl$updateUserLanguages$1);
            if (objM18442a == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageRepositoryImpl = this;
            Collection collection = ((Results) objM18442a).f19136d;
            if (collection != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (true) {
                    LanguageContext languageContextM19387a = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    ResultLanguageContext resultLanguageContext = (ResultLanguageContext) it.next();
                    Language language = resultLanguageContext.f18450j;
                    if (language != null && (str = language.f16981a) != null) {
                        languageContextM19387a = C10366c.m19387a(resultLanguageContext, str);
                    }
                    if (languageContextM19387a != null) {
                        arrayList.add(languageContextM19387a);
                    }
                }
                LingQDatabase lingQDatabase = languageRepositoryImpl.f19681a;
                LanguageRepositoryImpl$updateUserLanguages$2$1 languageRepositoryImpl$updateUserLanguages$2$1 = new LanguageRepositoryImpl$updateUserLanguages$2$1(languageRepositoryImpl, arrayList, null);
                languageRepositoryImpl$updateUserLanguages$1.f19779d = null;
                languageRepositoryImpl$updateUserLanguages$1.f19782g = 2;
                if (RoomDatabaseKt.m4573a(lingQDatabase, languageRepositoryImpl$updateUserLanguages$2$1, languageRepositoryImpl$updateUserLanguages$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: e */
    public final Object mo6019e(String str, LanguageToLearn languageToLearn, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$createLanguageIfNotExists$1 languageRepositoryImpl$createLanguageIfNotExists$1;
        String str2;
        LanguageToLearn languageToLearn2;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$createLanguageIfNotExists$1) {
            languageRepositoryImpl$createLanguageIfNotExists$1 = (LanguageRepositoryImpl$createLanguageIfNotExists$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$createLanguageIfNotExists$1.f19695i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$createLanguageIfNotExists$1.f19695i = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$createLanguageIfNotExists$1 = new LanguageRepositoryImpl$createLanguageIfNotExists$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$createLanguageIfNotExists$1 = new LanguageRepositoryImpl$createLanguageIfNotExists$1(this, interfaceC9968c);
        }
        Object objM14360a = languageRepositoryImpl$createLanguageIfNotExists$1.f19693g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$createLanguageIfNotExists$1.f19695i;
        if (i11 != 0) {
            if (i11 == 1) {
                languageToLearn2 = languageRepositoryImpl$createLanguageIfNotExists$1.f19692f;
                String str3 = languageRepositoryImpl$createLanguageIfNotExists$1.f19691e;
                LanguageRepositoryImpl languageRepositoryImpl2 = languageRepositoryImpl$createLanguageIfNotExists$1.f19690d;
                C7499b.m14977z0(objM14360a);
                str2 = str3;
                languageRepositoryImpl = languageRepositoryImpl2;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        C7136q c7136qMo5175l0 = this.f19682b.mo5175l0(str);
        languageRepositoryImpl$createLanguageIfNotExists$1.f19690d = this;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19691e = str;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19692f = languageToLearn;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19695i = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5175l0, languageRepositoryImpl$createLanguageIfNotExists$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        languageToLearn2 = languageToLearn;
        languageRepositoryImpl = this;
        if (((UserLanguage) objM14360a) != null) {
            return C9072e.f47360a;
        }
        EmptyList emptyList = EmptyList.f38032a;
        boolean z10 = languageToLearn2.f21682b;
        LanguageContext languageContext = new LanguageContext(str2, 0, null, 0, emptyList, null, null, null, "casual", 0, emptyList, Boolean.valueOf(z10), languageToLearn2.f21683c, "", new Integer(languageToLearn2.f21684d), null, LibrarySearchQuery.C3403a.m9705a());
        AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19690d = null;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19691e = null;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19692f = null;
        languageRepositoryImpl$createLanguageIfNotExists$1.f19695i = 2;
        if (abstractC1529t0.mo598h0(languageContext, languageRepositoryImpl$createLanguageIfNotExists$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0 A[LOOP:0: B:36:0x00ee->B:37:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: f */
    public final Object mo6020f(String str, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateEmailNotification$1 languageRepositoryImpl$updateEmailNotification$1;
        boolean z11;
        Object objMo5181r0;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str2;
        LanguageRepositoryImpl languageRepositoryImpl2;
        LanguageContextNotification languageContextNotification;
        String str3;
        Pair[] pairArr;
        int i10;
        C1244b.a aVar;
        String str4 = str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateEmailNotification$1) {
            languageRepositoryImpl$updateEmailNotification$1 = (LanguageRepositoryImpl$updateEmailNotification$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$updateEmailNotification$1.f19747j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateEmailNotification$1.f19747j = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateEmailNotification$1 = new LanguageRepositoryImpl$updateEmailNotification$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateEmailNotification$1 = new LanguageRepositoryImpl$updateEmailNotification$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateEmailNotification$1.f19745h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$updateEmailNotification$1.f19747j;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z12 = languageRepositoryImpl$updateEmailNotification$1.f19744g;
                String str5 = languageRepositoryImpl$updateEmailNotification$1.f19742e;
                languageRepositoryImpl = languageRepositoryImpl$updateEmailNotification$1.f19741d;
                C7499b.m14977z0(obj);
                z11 = z12;
                str4 = str5;
                objMo5181r0 = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageContextNotification = languageRepositoryImpl$updateEmailNotification$1.f19743f;
                str2 = languageRepositoryImpl$updateEmailNotification$1.f19742e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateEmailNotification$1.f19741d;
                C7499b.m14977z0(obj);
            }
            str3 = languageContextNotification.f17021a;
            if (str3 == null) {
                str3 = "";
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageEmailNotificationUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str2);
            pairArr = new Pair[]{pair, new Pair("lotd", str3)};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 2; i10++) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateEmailNotification$1.f19741d = this;
        languageRepositoryImpl$updateEmailNotification$1.f19742e = str4;
        z11 = z10;
        languageRepositoryImpl$updateEmailNotification$1.f19744g = z11;
        languageRepositoryImpl$updateEmailNotification$1.f19747j = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str4, languageRepositoryImpl$updateEmailNotification$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            LanguageContextNotification languageContextNotification2 = languageContext.f16999f;
            if (languageContextNotification2 == null) {
                languageContextNotification2 = new LanguageContextNotification(null, null);
            }
            languageContextNotification2.f17021a = z11 ? "on" : "off";
            languageContext.f16999f = languageContextNotification2;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateEmailNotification$1.f19741d = languageRepositoryImpl;
            languageRepositoryImpl$updateEmailNotification$1.f19742e = str4;
            languageRepositoryImpl$updateEmailNotification$1.f19743f = languageContextNotification2;
            languageRepositoryImpl$updateEmailNotification$1.f19747j = 2;
            if (abstractC1529t0.mo598h0(languageContext, languageRepositoryImpl$updateEmailNotification$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str4;
            languageRepositoryImpl2 = languageRepositoryImpl;
            languageContextNotification = languageContextNotification2;
            str3 = languageContextNotification.f17021a;
            if (str3 == null) {
                str3 = "";
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageEmailNotificationUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str2);
            pairArr = new Pair[]{pair3, new Pair("lotd", str3)};
            aVar = new C1244b.a();
            while (i10 < 2) {
                Pair pair4 = pairArr[i10];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<C5803a> mo6021g(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19682b.mo5177n0(str));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f2 A[LOOP:0: B:36:0x00f0->B:37:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: h */
    public final Object mo6022h(String str, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateSiteNotification$1 languageRepositoryImpl$updateSiteNotification$1;
        boolean z11;
        Object objMo5181r0;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str2;
        LanguageRepositoryImpl languageRepositoryImpl2;
        LanguageContextNotification languageContextNotification;
        String str3;
        Pair[] pairArr;
        int i10;
        C1244b.a aVar;
        String str4 = str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateSiteNotification$1) {
            languageRepositoryImpl$updateSiteNotification$1 = (LanguageRepositoryImpl$updateSiteNotification$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$updateSiteNotification$1.f19772j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateSiteNotification$1.f19772j = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateSiteNotification$1 = new LanguageRepositoryImpl$updateSiteNotification$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateSiteNotification$1 = new LanguageRepositoryImpl$updateSiteNotification$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateSiteNotification$1.f19770h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$updateSiteNotification$1.f19772j;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z12 = languageRepositoryImpl$updateSiteNotification$1.f19769g;
                String str5 = languageRepositoryImpl$updateSiteNotification$1.f19767e;
                languageRepositoryImpl = languageRepositoryImpl$updateSiteNotification$1.f19766d;
                C7499b.m14977z0(obj);
                z11 = z12;
                str4 = str5;
                objMo5181r0 = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageContextNotification = languageRepositoryImpl$updateSiteNotification$1.f19768f;
                str2 = languageRepositoryImpl$updateSiteNotification$1.f19767e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateSiteNotification$1.f19766d;
                C7499b.m14977z0(obj);
            }
            str3 = languageContextNotification.f17021a;
            if (str3 == null) {
                str3 = "";
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageSiteNotificationUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str2);
            pairArr = new Pair[]{pair, new Pair("lotd", str3)};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 2; i10++) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateSiteNotification$1.f19766d = this;
        languageRepositoryImpl$updateSiteNotification$1.f19767e = str4;
        z11 = z10;
        languageRepositoryImpl$updateSiteNotification$1.f19769g = z11;
        languageRepositoryImpl$updateSiteNotification$1.f19772j = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str4, languageRepositoryImpl$updateSiteNotification$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            LanguageContextNotification languageContextNotification2 = languageContext.f17000g;
            if (languageContextNotification2 == null) {
                languageContextNotification2 = new LanguageContextNotification(null, null);
            }
            languageContextNotification2.f17021a = z11 ? "on" : "off";
            languageContext.f17000g = languageContextNotification2;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateSiteNotification$1.f19766d = languageRepositoryImpl;
            languageRepositoryImpl$updateSiteNotification$1.f19767e = str4;
            languageRepositoryImpl$updateSiteNotification$1.f19768f = languageContextNotification2;
            languageRepositoryImpl$updateSiteNotification$1.f19772j = 2;
            if (abstractC1529t0.mo598h0(languageContext, languageRepositoryImpl$updateSiteNotification$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str4;
            languageRepositoryImpl2 = languageRepositoryImpl;
            languageContextNotification = languageContextNotification2;
            str3 = languageContextNotification.f17021a;
            if (str3 == null) {
                str3 = "";
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageSiteNotificationUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str2);
            pairArr = new Pair[]{pair3, new Pair("lotd", str3)};
            aVar = new C1244b.a();
            while (i10 < 2) {
                Pair pair4 = pairArr[i10];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: i */
    public final Object mo6023i(String str, InterfaceC9968c<? super C5803a> interfaceC9968c) {
        return this.f19682b.mo5182s0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: j */
    public final Object mo6024j(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateSiteNotification$1 languageRepositoryImpl$networkUpdateSiteNotification$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateSiteNotification$1) {
            languageRepositoryImpl$networkUpdateSiteNotification$1 = (LanguageRepositoryImpl$networkUpdateSiteNotification$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateSiteNotification$1.f19731h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateSiteNotification$1.f19731h = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateSiteNotification$1 = new LanguageRepositoryImpl$networkUpdateSiteNotification$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateSiteNotification$1 = new LanguageRepositoryImpl$networkUpdateSiteNotification$1(this, interfaceC9968c);
        }
        Object objMo5181r0 = languageRepositoryImpl$networkUpdateSiteNotification$1.f19729f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateSiteNotification$1.f19731h;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = languageRepositoryImpl$networkUpdateSiteNotification$1.f19728e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateSiteNotification$1.f19727d;
                C7499b.m14977z0(objMo5181r0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5181r0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5181r0);
        languageRepositoryImpl$networkUpdateSiteNotification$1.f19727d = this;
        languageRepositoryImpl$networkUpdateSiteNotification$1.f19728e = str2;
        languageRepositoryImpl$networkUpdateSiteNotification$1.f19731h = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str, languageRepositoryImpl$networkUpdateSiteNotification$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            RequestLanguageContextSiteNotification requestLanguageContextSiteNotification = new RequestLanguageContextSiteNotification();
            RequestLanguageContextNotification requestLanguageContextNotification = new RequestLanguageContextNotification(null, null, 3, null);
            requestLanguageContextNotification.f18080a = str2;
            requestLanguageContextSiteNotification.f18088a = requestLanguageContextNotification;
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(languageContext.f16995b);
            languageRepositoryImpl$networkUpdateSiteNotification$1.f19727d = null;
            languageRepositoryImpl$networkUpdateSiteNotification$1.f19728e = null;
            languageRepositoryImpl$networkUpdateSiteNotification$1.f19731h = 2;
            objMo5181r0 = interfaceC9937e.m18455n(num, requestLanguageContextSiteNotification, languageRepositoryImpl$networkUpdateSiteNotification$1);
            if (objMo5181r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: k */
    public final Object mo6025k(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateEmailNotification$1 languageRepositoryImpl$networkUpdateEmailNotification$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateEmailNotification$1) {
            languageRepositoryImpl$networkUpdateEmailNotification$1 = (LanguageRepositoryImpl$networkUpdateEmailNotification$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateEmailNotification$1.f19704h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateEmailNotification$1.f19704h = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateEmailNotification$1 = new LanguageRepositoryImpl$networkUpdateEmailNotification$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateEmailNotification$1 = new LanguageRepositoryImpl$networkUpdateEmailNotification$1(this, interfaceC9968c);
        }
        Object objMo5181r0 = languageRepositoryImpl$networkUpdateEmailNotification$1.f19702f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateEmailNotification$1.f19704h;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = languageRepositoryImpl$networkUpdateEmailNotification$1.f19701e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateEmailNotification$1.f19700d;
                C7499b.m14977z0(objMo5181r0);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5181r0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5181r0);
        languageRepositoryImpl$networkUpdateEmailNotification$1.f19700d = this;
        languageRepositoryImpl$networkUpdateEmailNotification$1.f19701e = str2;
        languageRepositoryImpl$networkUpdateEmailNotification$1.f19704h = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str, languageRepositoryImpl$networkUpdateEmailNotification$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            RequestLanguageContextEmailNotification requestLanguageContextEmailNotification = new RequestLanguageContextEmailNotification();
            RequestLanguageContextNotification requestLanguageContextNotification = new RequestLanguageContextNotification(null, null, 3, null);
            requestLanguageContextNotification.f18080a = str2;
            requestLanguageContextEmailNotification.f18077a = requestLanguageContextNotification;
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(languageContext.f16995b);
            languageRepositoryImpl$networkUpdateEmailNotification$1.f19700d = null;
            languageRepositoryImpl$networkUpdateEmailNotification$1.f19701e = null;
            languageRepositoryImpl$networkUpdateEmailNotification$1.f19704h = 2;
            objMo5181r0 = interfaceC9937e.m18450i(num, requestLanguageContextEmailNotification, languageRepositoryImpl$networkUpdateEmailNotification$1);
            if (objMo5181r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: l */
    public final Object mo6026l(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateLanguageTags$1 languageRepositoryImpl$networkUpdateLanguageTags$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        List list;
        UserLanguage userLanguage;
        LanguageCardsTags languageCardsTags;
        AbstractC1529t0 abstractC1529t0;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateLanguageTags$1) {
            languageRepositoryImpl$networkUpdateLanguageTags$1 = (LanguageRepositoryImpl$networkUpdateLanguageTags$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateLanguageTags$1 = new LanguageRepositoryImpl$networkUpdateLanguageTags$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateLanguageTags$1 = new LanguageRepositoryImpl$networkUpdateLanguageTags$1(this, interfaceC9968c);
        }
        Object objM18457p = languageRepositoryImpl$networkUpdateLanguageTags$1.f19719f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = (String) languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d;
                C7499b.m14977z0(objM18457p);
            } else if (i11 == 2) {
                list = (List) languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d;
                C7499b.m14977z0(objM18457p);
                userLanguage = (UserLanguage) objM18457p;
                if (userLanguage != null) {
                    languageCardsTags = new LanguageCardsTags(C6752c.m13453u0(C6752c.m13457y0(list)), userLanguage.f21726a);
                    abstractC1529t0 = languageRepositoryImpl.f19682b;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d = null;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e = null;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h = 3;
                    if (abstractC1529t0.mo5186w0(languageCardsTags, languageRepositoryImpl$networkUpdateLanguageTags$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18457p);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18457p);
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d = this;
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e = str;
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h = 1;
        objM18457p = this.f19683c.m18457p(str, languageRepositoryImpl$networkUpdateLanguageTags$1);
        if (objM18457p == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        List list2 = (List) objM18457p;
        C7136q c7136qMo5175l0 = languageRepositoryImpl.f19682b.mo5175l0(str);
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d = languageRepositoryImpl;
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e = list2;
        languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h = 2;
        Object objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5175l0, languageRepositoryImpl$networkUpdateLanguageTags$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        objM18457p = objM14360a;
        list = list2;
        userLanguage = (UserLanguage) objM18457p;
        if (userLanguage != null) {
            languageCardsTags = new LanguageCardsTags(C6752c.m13453u0(C6752c.m13457y0(list)), userLanguage.f21726a);
            abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f19717d = null;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f19718e = null;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f19721h = 3;
            if (abstractC1529t0.mo5186w0(languageCardsTags, languageRepositoryImpl$networkUpdateLanguageTags$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0098 A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00a2, blocks: (B:16:0x003a, B:41:0x008d, B:43:0x0098, B:21:0x004a, B:36:0x007b, B:24:0x0053, B:32:0x006a, B:27:0x005a), top: B:51:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: m */
    public final Object mo6027m(InterfaceC9968c<? super Resource<? extends List<LanguageToLearn>>> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$allLanguages$1 languageRepositoryImpl$allLanguages$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        List list;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$allLanguages$1) {
            languageRepositoryImpl$allLanguages$1 = (LanguageRepositoryImpl$allLanguages$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$allLanguages$1.f19689g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$allLanguages$1.f19689g = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$allLanguages$1 = new LanguageRepositoryImpl$allLanguages$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$allLanguages$1 = new LanguageRepositoryImpl$allLanguages$1(this, interfaceC9968c);
        }
        Object objM18451j = languageRepositoryImpl$allLanguages$1.f19687e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$allLanguages$1.f19689g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    languageRepositoryImpl = languageRepositoryImpl$allLanguages$1.f19686d;
                    C7499b.m14977z0(objM18451j);
                } else if (i11 == 2) {
                    languageRepositoryImpl = languageRepositoryImpl$allLanguages$1.f19686d;
                    C7499b.m14977z0(objM18451j);
                    AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
                    languageRepositoryImpl$allLanguages$1.f19686d = null;
                    languageRepositoryImpl$allLanguages$1.f19689g = 3;
                    objM18451j = abstractC1529t0.mo5179p0(languageRepositoryImpl$allLanguages$1);
                    if (objM18451j == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18451j);
                }
                list = (List) objM18451j;
                if (!list.isEmpty()) {
                    Resource.f17861d.getClass();
                    return Resource.C3303a.m9437c(list);
                }
                Resource.C3303a c3303a = Resource.f17861d;
                EmptyList emptyList = EmptyList.f38032a;
                c3303a.getClass();
                return new Resource(Resource.Status.EMPTY, emptyList, null);
            }
            C7499b.m14977z0(objM18451j);
            InterfaceC9937e interfaceC9937e = this.f19683c;
            languageRepositoryImpl$allLanguages$1.f19686d = this;
            languageRepositoryImpl$allLanguages$1.f19689g = 1;
            objM18451j = interfaceC9937e.m18451j(languageRepositoryImpl$allLanguages$1);
            if (objM18451j == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageRepositoryImpl = this;
            AbstractC1529t0 abstractC1529t1 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$allLanguages$1.f19686d = languageRepositoryImpl;
            languageRepositoryImpl$allLanguages$1.f19689g = 2;
            if (abstractC1529t1.mo5184u0((List) objM18451j, languageRepositoryImpl$allLanguages$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC1529t0 abstractC1529t2 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$allLanguages$1.f19686d = null;
            languageRepositoryImpl$allLanguages$1.f19689g = 3;
            objM18451j = abstractC1529t2.mo5179p0(languageRepositoryImpl$allLanguages$1);
            if (objM18451j == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = (List) objM18451j;
            if (!list.isEmpty()) {
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(list);
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            EmptyList emptyList2 = EmptyList.f38032a;
            c3303a2.getClass();
            return new Resource(Resource.Status.EMPTY, emptyList2, null);
        } catch (Exception e10) {
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        }
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: n */
    public final Object mo6028n(String str, List<String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo5185v0 = this.f19682b.mo5185v0(new LanguageCardsTags(list, str), interfaceC9968c);
        return objMo5185v0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5185v0 : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: o */
    public final InterfaceC7116c<List<LanguageToLearn>> mo6029o() {
        return this.f19682b.mo5176m0();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: p */
    public final Object mo6030p(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$getTopics$1 languageRepositoryImpl$getTopics$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        InterfaceC5179a interfaceC5179a;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$getTopics$1) {
            languageRepositoryImpl$getTopics$1 = (LanguageRepositoryImpl$getTopics$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$getTopics$1.f19699g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$getTopics$1.f19699g = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$getTopics$1 = new LanguageRepositoryImpl$getTopics$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$getTopics$1 = new LanguageRepositoryImpl$getTopics$1(this, interfaceC9968c);
        }
        Object objMo5181r0 = languageRepositoryImpl$getTopics$1.f19697e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$getTopics$1.f19699g;
        if (i11 != 0) {
            if (i11 == 1) {
                languageRepositoryImpl = languageRepositoryImpl$getTopics$1.f19696d;
                C7499b.m14977z0(objMo5181r0);
            } else if (i11 == 2) {
                languageRepositoryImpl = languageRepositoryImpl$getTopics$1.f19696d;
                C7499b.m14977z0(objMo5181r0);
                interfaceC5179a = languageRepositoryImpl.f19684d;
                languageRepositoryImpl$getTopics$1.f19696d = null;
                languageRepositoryImpl$getTopics$1.f19699g = 3;
                if (interfaceC5179a.mo9556C((Set) objMo5181r0, languageRepositoryImpl$getTopics$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo5181r0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo5181r0);
        languageRepositoryImpl$getTopics$1.f19696d = this;
        languageRepositoryImpl$getTopics$1.f19699g = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str, languageRepositoryImpl$getTopics$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(languageContext.f16995b);
            languageRepositoryImpl$getTopics$1.f19696d = languageRepositoryImpl;
            languageRepositoryImpl$getTopics$1.f19699g = 2;
            objMo5181r0 = interfaceC9937e.m18454m(num, languageRepositoryImpl$getTopics$1);
            if (objMo5181r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC5179a = languageRepositoryImpl.f19684d;
            languageRepositoryImpl$getTopics$1.f19696d = null;
            languageRepositoryImpl$getTopics$1.f19699g = 3;
            if (interfaceC5179a.mo9556C((Set) objMo5181r0, languageRepositoryImpl$getTopics$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d8 A[LOOP:0: B:27:0x00d6->B:28:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: q */
    public final Object mo6031q(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateIntensity$1 languageRepositoryImpl$updateIntensity$1;
        String str3;
        Object objMo5181r0;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str4;
        String str5;
        LanguageRepositoryImpl languageRepositoryImpl2;
        Pair[] pairArr;
        int i10;
        C1244b.a aVar;
        String str6 = str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateIntensity$1) {
            languageRepositoryImpl$updateIntensity$1 = (LanguageRepositoryImpl$updateIntensity$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$updateIntensity$1.f19759i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateIntensity$1.f19759i = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateIntensity$1 = new LanguageRepositoryImpl$updateIntensity$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateIntensity$1 = new LanguageRepositoryImpl$updateIntensity$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateIntensity$1.f19757g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$updateIntensity$1.f19759i;
        if (i12 != 0) {
            if (i12 == 1) {
                String str7 = languageRepositoryImpl$updateIntensity$1.f19756f;
                String str8 = languageRepositoryImpl$updateIntensity$1.f19755e;
                languageRepositoryImpl = languageRepositoryImpl$updateIntensity$1.f19754d;
                C7499b.m14977z0(obj);
                str3 = str7;
                str6 = str8;
                objMo5181r0 = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str5 = languageRepositoryImpl$updateIntensity$1.f19756f;
                str4 = languageRepositoryImpl$updateIntensity$1.f19755e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateIntensity$1.f19754d;
                C7499b.m14977z0(obj);
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageIntensityUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str4);
            pairArr = new Pair[]{pair, new Pair("intensity", str5)};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 2; i10++) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateIntensity$1.f19754d = this;
        languageRepositoryImpl$updateIntensity$1.f19755e = str6;
        str3 = str2;
        languageRepositoryImpl$updateIntensity$1.f19756f = str3;
        languageRepositoryImpl$updateIntensity$1.f19759i = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str6, languageRepositoryImpl$updateIntensity$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext = (LanguageContext) objMo5181r0;
        if (languageContext != null) {
            languageContext.f17002i = str3;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateIntensity$1.f19754d = languageRepositoryImpl;
            languageRepositoryImpl$updateIntensity$1.f19755e = str6;
            languageRepositoryImpl$updateIntensity$1.f19756f = str3;
            languageRepositoryImpl$updateIntensity$1.f19759i = 2;
            if (abstractC1529t0.mo598h0(languageContext, languageRepositoryImpl$updateIntensity$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str4 = str6;
            str5 = str3;
            languageRepositoryImpl2 = languageRepositoryImpl;
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageIntensityUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str4);
            pairArr = new Pair[]{pair3, new Pair("intensity", str5)};
            aVar = new C1244b.a();
            while (i10 < 2) {
                Pair pair4 = pairArr[i10];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: r */
    public final Object mo6032r(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateIntensity$1 languageRepositoryImpl$networkUpdateIntensity$1;
        Object obj;
        String str3;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateIntensity$1) {
            languageRepositoryImpl$networkUpdateIntensity$1 = (LanguageRepositoryImpl$networkUpdateIntensity$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateIntensity$1.f19716i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateIntensity$1.f19716i = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateIntensity$1 = new LanguageRepositoryImpl$networkUpdateIntensity$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateIntensity$1 = new LanguageRepositoryImpl$networkUpdateIntensity$1(this, interfaceC9968c);
        }
        Object objM18447f = languageRepositoryImpl$networkUpdateIntensity$1.f19714g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateIntensity$1.f19716i;
        if (i11 != 0) {
            if (i11 == 1) {
                String str4 = languageRepositoryImpl$networkUpdateIntensity$1.f19713f;
                str = languageRepositoryImpl$networkUpdateIntensity$1.f19712e;
                LanguageRepositoryImpl languageRepositoryImpl2 = languageRepositoryImpl$networkUpdateIntensity$1.f19711d;
                C7499b.m14977z0(objM18447f);
                str3 = str4;
                languageRepositoryImpl = languageRepositoryImpl2;
                obj = objM18447f;
            } else if (i11 == 2) {
                str = languageRepositoryImpl$networkUpdateIntensity$1.f19712e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateIntensity$1.f19711d;
                C7499b.m14977z0(objM18447f);
                AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
                LanguageContext languageContextM19387a = C10366c.m19387a((ResultLanguageContext) objM18447f, str);
                languageRepositoryImpl$networkUpdateIntensity$1.f19711d = null;
                languageRepositoryImpl$networkUpdateIntensity$1.f19712e = null;
                languageRepositoryImpl$networkUpdateIntensity$1.f19716i = 3;
                objM18447f = abstractC1529t0.mo598h0(languageContextM19387a, languageRepositoryImpl$networkUpdateIntensity$1);
                if (objM18447f == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18447f);
            }
            C5206f.m11026v0(((Number) objM18447f).longValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18447f);
        C7136q c7136qMo5175l0 = this.f19682b.mo5175l0(str);
        languageRepositoryImpl$networkUpdateIntensity$1.f19711d = this;
        languageRepositoryImpl$networkUpdateIntensity$1.f19712e = str;
        languageRepositoryImpl$networkUpdateIntensity$1.f19713f = str2;
        languageRepositoryImpl$networkUpdateIntensity$1.f19716i = 1;
        Object objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5175l0, languageRepositoryImpl$networkUpdateIntensity$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objM14360a;
        str3 = str2;
        languageRepositoryImpl = this;
        UserLanguage userLanguage = (UserLanguage) obj;
        if (userLanguage != null) {
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(userLanguage.f21727b);
            languageRepositoryImpl$networkUpdateIntensity$1.f19711d = languageRepositoryImpl;
            languageRepositoryImpl$networkUpdateIntensity$1.f19712e = str;
            languageRepositoryImpl$networkUpdateIntensity$1.f19713f = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f19716i = 2;
            objM18447f = interfaceC9937e.m18447f(num, str3, languageRepositoryImpl$networkUpdateIntensity$1);
            if (objM18447f == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC1529t0 abstractC1529t1 = languageRepositoryImpl.f19682b;
            LanguageContext languageContextM19387a2 = C10366c.m19387a((ResultLanguageContext) objM18447f, str);
            languageRepositoryImpl$networkUpdateIntensity$1.f19711d = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f19712e = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f19716i = 3;
            objM18447f = abstractC1529t1.mo598h0(languageContextM19387a2, languageRepositoryImpl$networkUpdateIntensity$1);
            if (objM18447f == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5206f.m11026v0(((Number) objM18447f).longValue());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: s */
    public final Object mo6033s(String str, InterfaceC9968c<? super LanguageToLearn> interfaceC9968c) {
        return this.f19682b.mo5180q0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: t */
    public final Object mo6034t(String str, List<String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateFeedLevels$1 languageRepositoryImpl$networkUpdateFeedLevels$1;
        Object obj;
        List<String> list2;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateFeedLevels$1) {
            languageRepositoryImpl$networkUpdateFeedLevels$1 = (LanguageRepositoryImpl$networkUpdateFeedLevels$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateFeedLevels$1 = new LanguageRepositoryImpl$networkUpdateFeedLevels$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateFeedLevels$1 = new LanguageRepositoryImpl$networkUpdateFeedLevels$1(this, interfaceC9968c);
        }
        Object objM18449h = languageRepositoryImpl$networkUpdateFeedLevels$1.f19708g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i;
        if (i11 != 0) {
            if (i11 == 1) {
                List<String> list3 = languageRepositoryImpl$networkUpdateFeedLevels$1.f19707f;
                str = languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e;
                LanguageRepositoryImpl languageRepositoryImpl2 = languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d;
                C7499b.m14977z0(objM18449h);
                list2 = list3;
                languageRepositoryImpl = languageRepositoryImpl2;
                obj = objM18449h;
            } else if (i11 == 2) {
                str = languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d;
                C7499b.m14977z0(objM18449h);
                AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
                LanguageContext languageContextM19387a = C10366c.m19387a((ResultLanguageContext) objM18449h, str);
                languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d = null;
                languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e = null;
                languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i = 3;
                objM18449h = abstractC1529t0.mo598h0(languageContextM19387a, languageRepositoryImpl$networkUpdateFeedLevels$1);
                if (objM18449h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18449h);
            }
            C5206f.m11026v0(((Number) objM18449h).longValue());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18449h);
        C7136q c7136qMo5175l0 = this.f19682b.mo5175l0(str);
        languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d = this;
        languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e = str;
        languageRepositoryImpl$networkUpdateFeedLevels$1.f19707f = list;
        languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i = 1;
        Object objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5175l0, languageRepositoryImpl$networkUpdateFeedLevels$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        obj = objM14360a;
        list2 = list;
        languageRepositoryImpl = this;
        UserLanguage userLanguage = (UserLanguage) obj;
        if (userLanguage != null) {
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(userLanguage.f21727b);
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d = languageRepositoryImpl;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e = str;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19707f = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i = 2;
            objM18449h = interfaceC9937e.m18449h(num, list2, languageRepositoryImpl$networkUpdateFeedLevels$1);
            if (objM18449h == coroutineSingletons) {
                return coroutineSingletons;
            }
            AbstractC1529t0 abstractC1529t1 = languageRepositoryImpl.f19682b;
            LanguageContext languageContextM19387a2 = C10366c.m19387a((ResultLanguageContext) objM18449h, str);
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19705d = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19706e = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f19710i = 3;
            objM18449h = abstractC1529t1.mo598h0(languageContextM19387a2, languageRepositoryImpl$networkUpdateFeedLevels$1);
            if (objM18449h == coroutineSingletons) {
                return coroutineSingletons;
            }
            C5206f.m11026v0(((Number) objM18449h).longValue());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d7 A[LOOP:0: B:27:0x00d5->B:28:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: u */
    public final Object mo6035u(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateRepetitionLingqs$1 languageRepositoryImpl$updateRepetitionLingqs$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str2;
        int i11;
        String str3;
        LanguageRepositoryImpl languageRepositoryImpl2;
        Pair[] pairArr;
        int i12;
        C1244b.a aVar;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateRepetitionLingqs$1) {
            languageRepositoryImpl$updateRepetitionLingqs$1 = (LanguageRepositoryImpl$updateRepetitionLingqs$1) interfaceC9968c;
            int i13 = languageRepositoryImpl$updateRepetitionLingqs$1.f19765i;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateRepetitionLingqs$1.f19765i = i13 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateRepetitionLingqs$1 = new LanguageRepositoryImpl$updateRepetitionLingqs$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateRepetitionLingqs$1 = new LanguageRepositoryImpl$updateRepetitionLingqs$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateRepetitionLingqs$1.f19763g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = languageRepositoryImpl$updateRepetitionLingqs$1.f19765i;
        if (i14 != 0) {
            if (i14 == 1) {
                i11 = languageRepositoryImpl$updateRepetitionLingqs$1.f19762f;
                str2 = languageRepositoryImpl$updateRepetitionLingqs$1.f19761e;
                languageRepositoryImpl = languageRepositoryImpl$updateRepetitionLingqs$1.f19760d;
                C7499b.m14977z0(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = languageRepositoryImpl$updateRepetitionLingqs$1.f19762f;
                str3 = languageRepositoryImpl$updateRepetitionLingqs$1.f19761e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateRepetitionLingqs$1.f19760d;
                C7499b.m14977z0(obj);
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageRepetitionLingqsUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str3);
            pairArr = new Pair[]{pair, new Pair("repetitionLingqs", Integer.valueOf(i11))};
            aVar = new C1244b.a();
            for (i12 = 0; i12 < 2; i12++) {
                Pair pair2 = pairArr[i12];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateRepetitionLingqs$1.f19760d = this;
        languageRepositoryImpl$updateRepetitionLingqs$1.f19761e = str;
        languageRepositoryImpl$updateRepetitionLingqs$1.f19762f = i10;
        languageRepositoryImpl$updateRepetitionLingqs$1.f19765i = 1;
        Object objMo5181r0 = this.f19682b.mo5181r0(str, languageRepositoryImpl$updateRepetitionLingqs$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        str2 = str;
        i11 = i10;
        obj = objMo5181r0;
        LanguageContext languageContext = (LanguageContext) obj;
        if (languageContext != null) {
            languageContext.f16997d = i11;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateRepetitionLingqs$1.f19760d = languageRepositoryImpl;
            languageRepositoryImpl$updateRepetitionLingqs$1.f19761e = str2;
            languageRepositoryImpl$updateRepetitionLingqs$1.f19762f = i11;
            languageRepositoryImpl$updateRepetitionLingqs$1.f19765i = 2;
            if (abstractC1529t0.mo598h0(languageContext, languageRepositoryImpl$updateRepetitionLingqs$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str3 = str2;
            languageRepositoryImpl2 = languageRepositoryImpl;
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageRepetitionLingqsUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str3);
            pairArr = new Pair[]{pair3, new Pair("repetitionLingqs", Integer.valueOf(i11))};
            aVar = new C1244b.a();
            while (i12 < 2) {
                Pair pair4 = pairArr[i12];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: v */
    public final InterfaceC7116c<UserLanguage> mo6036v(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19682b.mo5175l0(str));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00dc A[LOOP:0: B:27:0x00da->B:28:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: w */
    public final Object mo6037w(String str, Set<String> set, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateTopics$1 languageRepositoryImpl$updateTopics$1;
        Set<String> set2;
        Object objMo5181r0;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str2;
        Set<String> set3;
        LanguageRepositoryImpl languageRepositoryImpl2;
        Pair[] pairArr;
        int i10;
        C1244b.a aVar;
        String str3 = str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateTopics$1) {
            languageRepositoryImpl$updateTopics$1 = (LanguageRepositoryImpl$updateTopics$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$updateTopics$1.f19778i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateTopics$1.f19778i = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateTopics$1 = new LanguageRepositoryImpl$updateTopics$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateTopics$1 = new LanguageRepositoryImpl$updateTopics$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateTopics$1.f19776g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$updateTopics$1.f19778i;
        if (i12 != 0) {
            if (i12 == 1) {
                Set<String> set4 = languageRepositoryImpl$updateTopics$1.f19775f;
                String str4 = languageRepositoryImpl$updateTopics$1.f19774e;
                languageRepositoryImpl = languageRepositoryImpl$updateTopics$1.f19773d;
                C7499b.m14977z0(obj);
                set2 = set4;
                str3 = str4;
                objMo5181r0 = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set3 = languageRepositoryImpl$updateTopics$1.f19775f;
                str2 = languageRepositoryImpl$updateTopics$1.f19774e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateTopics$1.f19773d;
                C7499b.m14977z0(obj);
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageTopicsUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str2);
            pairArr = new Pair[]{pair, new Pair("topics", set3.toArray(new String[0]))};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 2; i10++) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateTopics$1.f19773d = this;
        languageRepositoryImpl$updateTopics$1.f19774e = str3;
        set2 = set;
        languageRepositoryImpl$updateTopics$1.f19775f = set2;
        languageRepositoryImpl$updateTopics$1.f19778i = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str3, languageRepositoryImpl$updateTopics$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        if (((LanguageContext) objMo5181r0) != null) {
            InterfaceC5179a interfaceC5179a = languageRepositoryImpl.f19684d;
            languageRepositoryImpl$updateTopics$1.f19773d = languageRepositoryImpl;
            languageRepositoryImpl$updateTopics$1.f19774e = str3;
            languageRepositoryImpl$updateTopics$1.f19775f = set2;
            languageRepositoryImpl$updateTopics$1.f19778i = 2;
            if (interfaceC5179a.mo9556C(set2, languageRepositoryImpl$updateTopics$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
            set3 = set2;
            languageRepositoryImpl2 = languageRepositoryImpl;
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageTopicsUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str2);
            pairArr = new Pair[]{pair3, new Pair("topics", set3.toArray(new String[0]))};
            aVar = new C1244b.a();
            while (i10 < 2) {
                Pair pair4 = pairArr[i10];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: x */
    public final Object mo6038x(String str, Set<String> set, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$networkUpdateTopics$1 languageRepositoryImpl$networkUpdateTopics$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        InterfaceC5179a interfaceC5179a;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$networkUpdateTopics$1) {
            languageRepositoryImpl$networkUpdateTopics$1 = (LanguageRepositoryImpl$networkUpdateTopics$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$networkUpdateTopics$1.f19736h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateTopics$1.f19736h = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateTopics$1 = new LanguageRepositoryImpl$networkUpdateTopics$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$networkUpdateTopics$1 = new LanguageRepositoryImpl$networkUpdateTopics$1(this, interfaceC9968c);
        }
        Object objM14360a = languageRepositoryImpl$networkUpdateTopics$1.f19734f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$networkUpdateTopics$1.f19736h;
        if (i11 != 0) {
            if (i11 == 1) {
                set = languageRepositoryImpl$networkUpdateTopics$1.f19733e;
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateTopics$1.f19732d;
                C7499b.m14977z0(objM14360a);
            } else if (i11 == 2) {
                languageRepositoryImpl = languageRepositoryImpl$networkUpdateTopics$1.f19732d;
                C7499b.m14977z0(objM14360a);
                interfaceC5179a = languageRepositoryImpl.f19684d;
                languageRepositoryImpl$networkUpdateTopics$1.f19732d = null;
                languageRepositoryImpl$networkUpdateTopics$1.f19736h = 3;
                if (interfaceC5179a.mo9556C((Set) objM14360a, languageRepositoryImpl$networkUpdateTopics$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        C7136q c7136qMo5175l0 = this.f19682b.mo5175l0(str);
        languageRepositoryImpl$networkUpdateTopics$1.f19732d = this;
        languageRepositoryImpl$networkUpdateTopics$1.f19733e = set;
        languageRepositoryImpl$networkUpdateTopics$1.f19736h = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(c7136qMo5175l0, languageRepositoryImpl$networkUpdateTopics$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        UserLanguage userLanguage = (UserLanguage) objM14360a;
        if (userLanguage != null) {
            InterfaceC9937e interfaceC9937e = languageRepositoryImpl.f19683c;
            Integer num = new Integer(userLanguage.f21727b);
            languageRepositoryImpl$networkUpdateTopics$1.f19732d = languageRepositoryImpl;
            languageRepositoryImpl$networkUpdateTopics$1.f19733e = null;
            languageRepositoryImpl$networkUpdateTopics$1.f19736h = 2;
            objM14360a = interfaceC9937e.m18446e(num, set, languageRepositoryImpl$networkUpdateTopics$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC5179a = languageRepositoryImpl.f19684d;
            languageRepositoryImpl$networkUpdateTopics$1.f19732d = null;
            languageRepositoryImpl$networkUpdateTopics$1.f19736h = 3;
            if (interfaceC5179a.mo9556C((Set) objM14360a, languageRepositoryImpl$networkUpdateTopics$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00eb A[LOOP:0: B:32:0x00e9->B:33:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: y */
    public final Object mo6039y(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateFeedLevels$1 languageRepositoryImpl$updateFeedLevels$1;
        List<String> list;
        Object objMo5181r0;
        LanguageRepositoryImpl languageRepositoryImpl;
        String str2;
        LanguageContext languageContext;
        LanguageRepositoryImpl languageRepositoryImpl2;
        List<String> list2;
        int i10;
        String[] strArr;
        Pair[] pairArr;
        C1244b.a aVar;
        String str3 = str;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateFeedLevels$1) {
            languageRepositoryImpl$updateFeedLevels$1 = (LanguageRepositoryImpl$updateFeedLevels$1) interfaceC9968c;
            int i11 = languageRepositoryImpl$updateFeedLevels$1.f19753i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateFeedLevels$1.f19753i = i11 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateFeedLevels$1 = new LanguageRepositoryImpl$updateFeedLevels$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateFeedLevels$1 = new LanguageRepositoryImpl$updateFeedLevels$1(this, interfaceC9968c);
        }
        Object obj = languageRepositoryImpl$updateFeedLevels$1.f19751g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageRepositoryImpl$updateFeedLevels$1.f19753i;
        if (i12 != 0) {
            if (i12 == 1) {
                List<String> list3 = (List) languageRepositoryImpl$updateFeedLevels$1.f19750f;
                String str4 = languageRepositoryImpl$updateFeedLevels$1.f19749e;
                languageRepositoryImpl = languageRepositoryImpl$updateFeedLevels$1.f19748d;
                C7499b.m14977z0(obj);
                list = list3;
                str3 = str4;
                objMo5181r0 = obj;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                languageContext = (LanguageContext) languageRepositoryImpl$updateFeedLevels$1.f19750f;
                str2 = languageRepositoryImpl$updateFeedLevels$1.f19749e;
                languageRepositoryImpl2 = languageRepositoryImpl$updateFeedLevels$1.f19748d;
                C7499b.m14977z0(obj);
            }
            list2 = languageContext.f17010q;
            if (list2 != null || (strArr = (String[]) list2.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(LanguageFeedLevelUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            pairArr = new Pair[]{new Pair("language", str2), new Pair("levels", strArr)};
            aVar = new C1244b.a();
            for (i10 = 0; i10 < 2; i10++) {
                Pair pair = pairArr[i10];
                aVar.m4709b(pair.f38013b, (String) pair.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        languageRepositoryImpl$updateFeedLevels$1.f19748d = this;
        languageRepositoryImpl$updateFeedLevels$1.f19749e = str3;
        list = arrayList;
        languageRepositoryImpl$updateFeedLevels$1.f19750f = list;
        languageRepositoryImpl$updateFeedLevels$1.f19753i = 1;
        objMo5181r0 = this.f19682b.mo5181r0(str3, languageRepositoryImpl$updateFeedLevels$1);
        if (objMo5181r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageRepositoryImpl = this;
        LanguageContext languageContext2 = (LanguageContext) objMo5181r0;
        if (languageContext2 != null) {
            languageContext2.f17010q = list;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateFeedLevels$1.f19748d = languageRepositoryImpl;
            languageRepositoryImpl$updateFeedLevels$1.f19749e = str3;
            languageRepositoryImpl$updateFeedLevels$1.f19750f = languageContext2;
            languageRepositoryImpl$updateFeedLevels$1.f19753i = 2;
            if (abstractC1529t0.mo598h0(languageContext2, languageRepositoryImpl$updateFeedLevels$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str2 = str3;
            languageContext = languageContext2;
            languageRepositoryImpl2 = languageRepositoryImpl;
            list2 = languageContext.f17010q;
            if (list2 != null) {
                strArr = new String[0];
            } else {
                strArr = new String[0];
            }
            languageRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(LanguageFeedLevelUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            pairArr = new Pair[]{new Pair("language", str2), new Pair("levels", strArr)};
            aVar = new C1244b.a();
            while (i10 < 2) {
                Pair pair2 = pairArr[i10];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            languageRepositoryImpl2.f19685e.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2012e
    /* JADX INFO: renamed from: z */
    public final Object mo6040z(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageRepositoryImpl$updateAllLanguages$1 languageRepositoryImpl$updateAllLanguages$1;
        LanguageRepositoryImpl languageRepositoryImpl;
        if (interfaceC9968c instanceof LanguageRepositoryImpl$updateAllLanguages$1) {
            languageRepositoryImpl$updateAllLanguages$1 = (LanguageRepositoryImpl$updateAllLanguages$1) interfaceC9968c;
            int i10 = languageRepositoryImpl$updateAllLanguages$1.f19740g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateAllLanguages$1.f19740g = i10 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateAllLanguages$1 = new LanguageRepositoryImpl$updateAllLanguages$1(this, interfaceC9968c);
            }
        } else {
            languageRepositoryImpl$updateAllLanguages$1 = new LanguageRepositoryImpl$updateAllLanguages$1(this, interfaceC9968c);
        }
        Object objM18451j = languageRepositoryImpl$updateAllLanguages$1.f19738e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageRepositoryImpl$updateAllLanguages$1.f19740g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    languageRepositoryImpl = languageRepositoryImpl$updateAllLanguages$1.f19737d;
                    C7499b.m14977z0(objM18451j);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18451j);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(objM18451j);
            InterfaceC9937e interfaceC9937e = this.f19683c;
            languageRepositoryImpl$updateAllLanguages$1.f19737d = this;
            languageRepositoryImpl$updateAllLanguages$1.f19740g = 1;
            objM18451j = interfaceC9937e.m18451j(languageRepositoryImpl$updateAllLanguages$1);
            if (objM18451j == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageRepositoryImpl = this;
            AbstractC1529t0 abstractC1529t0 = languageRepositoryImpl.f19682b;
            languageRepositoryImpl$updateAllLanguages$1.f19737d = null;
            languageRepositoryImpl$updateAllLanguages$1.f19740g = 2;
            if (abstractC1529t0.mo5184u0((List) objM18451j, languageRepositoryImpl$updateAllLanguages$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
