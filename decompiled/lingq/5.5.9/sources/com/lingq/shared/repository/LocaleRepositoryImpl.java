package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1440g3;
import ci.InterfaceC2015h;
import com.lingq.entity.DictionaryLocale;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p460wh.InterfaceC9936d;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleRepositoryImpl implements InterfaceC2015h {

    /* JADX INFO: renamed from: a */
    public final AbstractC1440g3 f20138a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9936d f20139b;

    public LocaleRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1440g3 abstractC1440g3, InterfaceC9936d interfaceC9936d) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1440g3, "localeDao");
        C5207g.m11111f(interfaceC9936d, "dictionaryService");
        this.f20138a = abstractC1440g3;
        this.f20139b = interfaceC9936d;
    }

    @Override // ci.InterfaceC2015h
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<List<UserDictionaryLocale>> mo6077a() {
        return C0062b.m273H0(this.f20138a.mo5039k0());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0033, B:29:0x006d, B:31:0x0075, B:33:0x0085, B:18:0x0044, B:25:0x005c, B:21:0x004d), top: B:38:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0085 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #0 {Exception -> 0x0092, blocks: (B:13:0x0033, B:29:0x006d, B:31:0x0075, B:33:0x0085, B:18:0x0044, B:25:0x005c, B:21:0x004d), top: B:38:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2015h
    /* JADX INFO: renamed from: b */
    public final Object mo6078b(InterfaceC9968c<? super Resource<? extends List<UserDictionaryLocale>>> interfaceC9968c) throws Throwable {
        LocaleRepositoryImpl$availableLocales$1 localeRepositoryImpl$availableLocales$1;
        LocaleRepositoryImpl localeRepositoryImpl;
        List list;
        if (interfaceC9968c instanceof LocaleRepositoryImpl$availableLocales$1) {
            localeRepositoryImpl$availableLocales$1 = (LocaleRepositoryImpl$availableLocales$1) interfaceC9968c;
            int i10 = localeRepositoryImpl$availableLocales$1.f20143g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                localeRepositoryImpl$availableLocales$1.f20143g = i10 - Integer.MIN_VALUE;
            } else {
                localeRepositoryImpl$availableLocales$1 = new LocaleRepositoryImpl$availableLocales$1(this, interfaceC9968c);
            }
        } else {
            localeRepositoryImpl$availableLocales$1 = new LocaleRepositoryImpl$availableLocales$1(this, interfaceC9968c);
        }
        Object objMo5040l0 = localeRepositoryImpl$availableLocales$1.f20141e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = localeRepositoryImpl$availableLocales$1.f20143g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    localeRepositoryImpl = localeRepositoryImpl$availableLocales$1.f20140d;
                    C7499b.m14977z0(objMo5040l0);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objMo5040l0);
                }
                list = (List) objMo5040l0;
                if (list.isEmpty()) {
                    return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Empty available locales"));
                }
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(list);
            }
            C7499b.m14977z0(objMo5040l0);
            localeRepositoryImpl$availableLocales$1.f20140d = this;
            localeRepositoryImpl$availableLocales$1.f20143g = 1;
            if (mo6079c(localeRepositoryImpl$availableLocales$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            localeRepositoryImpl = this;
            AbstractC1440g3 abstractC1440g3 = localeRepositoryImpl.f20138a;
            localeRepositoryImpl$availableLocales$1.f20140d = null;
            localeRepositoryImpl$availableLocales$1.f20143g = 2;
            objMo5040l0 = abstractC1440g3.mo5040l0(localeRepositoryImpl$availableLocales$1);
            if (objMo5040l0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = (List) objMo5040l0;
            if (list.isEmpty()) {
                return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Empty available locales"));
            }
            Resource.f17861d.getClass();
            return Resource.C3303a.m9437c(list);
        } catch (Exception e10) {
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2015h
    /* JADX INFO: renamed from: c */
    public final Object mo6079c(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LocaleRepositoryImpl$networkUpdateAvailableLocales$1 localeRepositoryImpl$networkUpdateAvailableLocales$1;
        LocaleRepositoryImpl localeRepositoryImpl;
        if (interfaceC9968c instanceof LocaleRepositoryImpl$networkUpdateAvailableLocales$1) {
            localeRepositoryImpl$networkUpdateAvailableLocales$1 = (LocaleRepositoryImpl$networkUpdateAvailableLocales$1) interfaceC9968c;
            int i10 = localeRepositoryImpl$networkUpdateAvailableLocales$1.f20147g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                localeRepositoryImpl$networkUpdateAvailableLocales$1.f20147g = i10 - Integer.MIN_VALUE;
            } else {
                localeRepositoryImpl$networkUpdateAvailableLocales$1 = new LocaleRepositoryImpl$networkUpdateAvailableLocales$1(this, interfaceC9968c);
            }
        } else {
            localeRepositoryImpl$networkUpdateAvailableLocales$1 = new LocaleRepositoryImpl$networkUpdateAvailableLocales$1(this, interfaceC9968c);
        }
        Object objM18440d = localeRepositoryImpl$networkUpdateAvailableLocales$1.f20145e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = localeRepositoryImpl$networkUpdateAvailableLocales$1.f20147g;
        if (i11 != 0) {
            if (i11 == 1) {
                localeRepositoryImpl = localeRepositoryImpl$networkUpdateAvailableLocales$1.f20144d;
                C7499b.m14977z0(objM18440d);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18440d);
            }
        }
        C7499b.m14977z0(objM18440d);
        localeRepositoryImpl$networkUpdateAvailableLocales$1.f20144d = this;
        localeRepositoryImpl$networkUpdateAvailableLocales$1.f20147g = 1;
        objM18440d = this.f20139b.m18440d(localeRepositoryImpl$networkUpdateAvailableLocales$1);
        if (objM18440d == coroutineSingletons) {
            return coroutineSingletons;
        }
        localeRepositoryImpl = this;
        List<DictionaryLocale> list = (List) objM18440d;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (DictionaryLocale dictionaryLocale : list) {
            arrayList.add(new DictionaryLocale(dictionaryLocale.f16968a, dictionaryLocale.f16969b));
        }
        localeRepositoryImpl$networkUpdateAvailableLocales$1.f20144d = null;
        localeRepositoryImpl$networkUpdateAvailableLocales$1.f20147g = 2;
        Object objMo599i0 = localeRepositoryImpl.f20138a.mo599i0(arrayList, localeRepositoryImpl$networkUpdateAvailableLocales$1);
        if (objMo599i0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo599i0 = C9072e.f47360a;
        }
        return objMo599i0 == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
