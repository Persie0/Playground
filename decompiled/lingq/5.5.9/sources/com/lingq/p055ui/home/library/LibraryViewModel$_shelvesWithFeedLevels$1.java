package com.lingq.p055ui.home.library;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "language", "", "", "", "Lcom/lingq/shared/uimodel/LearningLevel;", "", "languageLevels", "Lkotlin/Pair;", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$_shelvesWithFeedLevels$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LibraryViewModel$_shelvesWithFeedLevels$1 extends SuspendLambda implements InterfaceC2057q<UserLanguage, Map<String, ? extends Map<LearningLevel, Boolean>>, InterfaceC9968c<? super Pair<? extends String, ? extends List<? extends LearningLevel>>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ UserLanguage f24821e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Map f24822f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryViewModel f24823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$_shelvesWithFeedLevels$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$_shelvesWithFeedLevels$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f24823g = libraryViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(UserLanguage userLanguage, Map<String, ? extends Map<LearningLevel, Boolean>> map, InterfaceC9968c<? super Pair<? extends String, ? extends List<? extends LearningLevel>>> interfaceC9968c) {
        LibraryViewModel$_shelvesWithFeedLevels$1 libraryViewModel$_shelvesWithFeedLevels$1 = new LibraryViewModel$_shelvesWithFeedLevels$1(this.f24823g, interfaceC9968c);
        libraryViewModel$_shelvesWithFeedLevels$1.f24821e = userLanguage;
        libraryViewModel$_shelvesWithFeedLevels$1.f24822f = map;
        return libraryViewModel$_shelvesWithFeedLevels$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [kotlin.collections.EmptyList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo498E1;
        String strMo498E2;
        Object arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        UserLanguage userLanguage = this.f24821e;
        Map map = this.f24822f;
        LibraryViewModel libraryViewModel = this.f24823g;
        if (userLanguage == null || (strMo498E1 = userLanguage.f21726a) == null) {
            strMo498E1 = libraryViewModel.mo498E1();
        }
        if (userLanguage == null || (strMo498E2 = userLanguage.f21726a) == null) {
            strMo498E2 = libraryViewModel.mo498E1();
        }
        Map map2 = (Map) map.get(strMo498E2);
        if (map2 != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            arrayList = new ArrayList(linkedHashMap.size());
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
            }
        } else {
            arrayList = EmptyList.f38032a;
        }
        return new Pair(strMo498E1, arrayList);
    }
}
