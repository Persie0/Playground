package com.lingq.shared.repository;

import ae.C0062b;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1440g3;
import ci.InterfaceC2011d;
import com.lingq.entity.DictionaryLocale;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestDictionariesAdd;
import com.lingq.shared.network.requests.RequestDictionariesOrder;
import com.lingq.shared.network.result.ResultDictionariesForUser;
import com.lingq.shared.network.workers.DictionaryAddWorker;
import com.lingq.shared.network.workers.DictionaryDeleteWorker;
import com.lingq.shared.network.workers.DictionaryOrderWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.persistent.dao.DictionaryDao;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
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
import p260m8.C7499b;
import p367rh.C8794h;
import p367rh.C8797k;
import p460wh.InterfaceC9936d;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class DictionaryRepositoryImpl implements InterfaceC2011d {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f19625a;

    /* JADX INFO: renamed from: b */
    public final DictionaryDao f19626b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1440g3 f19627c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9936d f19628d;

    /* JADX INFO: renamed from: e */
    public final AbstractC1317j f19629e;

    /* JADX INFO: renamed from: f */
    public final C4955q f19630f;

    public DictionaryRepositoryImpl(LingQDatabase lingQDatabase, DictionaryDao dictionaryDao, AbstractC1440g3 abstractC1440g3, InterfaceC9936d interfaceC9936d, AbstractC1317j abstractC1317j, C4955q c4955q) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(dictionaryDao, "dictionaryDao");
        C5207g.m11111f(abstractC1440g3, "localeDao");
        C5207g.m11111f(interfaceC9936d, "dictionaryService");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        this.f19625a = lingQDatabase;
        this.f19626b = dictionaryDao;
        this.f19627c = abstractC1440g3;
        this.f19628d = interfaceC9936d;
        this.f19629e = abstractC1317j;
        this.f19630f = c4955q;
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<List<UserDictionaryData>> mo6001a(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19626b.mo5091n0(str));
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: b */
    public final Object mo6002b(int i10, String str, InterfaceC9968c interfaceC9968c) {
        Object objM18437a = this.f19628d.m18437a(str, new Integer(i10), interfaceC9968c);
        return objM18437a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18437a : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:17:0x0041, B:51:0x00d8, B:53:0x00dd, B:54:0x00e0, B:56:0x00e8, B:58:0x00f0, B:22:0x0059, B:44:0x00b7, B:46:0x00bc, B:47:0x00c0, B:25:0x0065, B:40:0x009e, B:28:0x0070, B:36:0x008c, B:31:0x0078), top: B:65:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:17:0x0041, B:51:0x00d8, B:53:0x00dd, B:54:0x00e0, B:56:0x00e8, B:58:0x00f0, B:22:0x0059, B:44:0x00b7, B:46:0x00bc, B:47:0x00c0, B:25:0x0065, B:40:0x009e, B:28:0x0070, B:36:0x008c, B:31:0x0078), top: B:65:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: c */
    public final Object mo6003c(String str, InterfaceC9968c<? super Resource<? extends List<UserDictionaryData>>> interfaceC9968c) throws Throwable {
        DictionaryRepositoryImpl$activeAndAvailableDictionaries$1 dictionaryRepositoryImpl$activeAndAvailableDictionaries$1;
        DictionaryRepositoryImpl dictionaryRepositoryImpl;
        List list;
        Object objM14362c;
        List list2;
        Collection collection;
        if (interfaceC9968c instanceof DictionaryRepositoryImpl$activeAndAvailableDictionaries$1) {
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = (DictionaryRepositoryImpl$activeAndAvailableDictionaries$1) interfaceC9968c;
            int i10 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = i10 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = new DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(this, interfaceC9968c);
            }
        } else {
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = new DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(this, interfaceC9968c);
        }
        Object objM18438b = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19633f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    str = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e;
                    dictionaryRepositoryImpl = (DictionaryRepositoryImpl) dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d;
                    C7499b.m14977z0(objM18438b);
                } else if (i11 == 2) {
                    str = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e;
                    dictionaryRepositoryImpl = (DictionaryRepositoryImpl) dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d;
                    C7499b.m14977z0(objM18438b);
                    C7136q c7136qMo5089l0 = dictionaryRepositoryImpl.f19626b.mo5089l0(str);
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = dictionaryRepositoryImpl;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = str;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 3;
                    objM18438b = FlowKt__ReduceKt.m14362c(c7136qMo5089l0, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM18438b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) objM18438b;
                    if (list == null) {
                        list = EmptyList.f38032a;
                    }
                    C7136q c7136qMo5091n0 = dictionaryRepositoryImpl.f19626b.mo5091n0(str);
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = list;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = null;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 4;
                    objM14362c = FlowKt__ReduceKt.m14362c(c7136qMo5091n0, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM14362c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list3 = list;
                    objM18438b = objM14362c;
                    list2 = list3;
                } else if (i11 == 3) {
                    str = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e;
                    dictionaryRepositoryImpl = (DictionaryRepositoryImpl) dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d;
                    C7499b.m14977z0(objM18438b);
                    list = (List) objM18438b;
                    if (list == null) {
                        list = EmptyList.f38032a;
                    }
                    C7136q c7136qMo5091n1 = dictionaryRepositoryImpl.f19626b.mo5091n0(str);
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = list;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = null;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 4;
                    objM14362c = FlowKt__ReduceKt.m14362c(c7136qMo5091n1, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM14362c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    List list4 = list;
                    objM18438b = objM14362c;
                    list2 = list4;
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d;
                    C7499b.m14977z0(objM18438b);
                }
                collection = (List) objM18438b;
                if (collection == null) {
                    collection = EmptyList.f38032a;
                }
                if (!(!list2.isEmpty()) && (!collection.isEmpty())) {
                    Resource.f17861d.getClass();
                    return Resource.C3303a.m9437c(null);
                }
                Resource.C3303a c3303a = Resource.f17861d;
                EmptyList emptyList = EmptyList.f38032a;
                c3303a.getClass();
                return new Resource(Resource.Status.EMPTY, emptyList, null);
            }
            C7499b.m14977z0(objM18438b);
            InterfaceC9936d interfaceC9936d = this.f19628d;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = this;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = str;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 1;
            objM18438b = interfaceC9936d.m18438b(str, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
            if (objM18438b == coroutineSingletons) {
                return coroutineSingletons;
            }
            dictionaryRepositoryImpl = this;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = dictionaryRepositoryImpl;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = str;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 2;
            if (dictionaryRepositoryImpl.m9476o(str, (ResultDictionariesForUser) objM18438b, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            C7136q c7136qMo5089l1 = dictionaryRepositoryImpl.f19626b.mo5089l0(str);
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = dictionaryRepositoryImpl;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = str;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 3;
            objM18438b = FlowKt__ReduceKt.m14362c(c7136qMo5089l1, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
            if (objM18438b == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = (List) objM18438b;
            if (list == null) {
                list = EmptyList.f38032a;
            }
            C7136q c7136qMo5091n2 = dictionaryRepositoryImpl.f19626b.mo5091n0(str);
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19631d = list;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19632e = null;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f19635h = 4;
            objM14362c = FlowKt__ReduceKt.m14362c(c7136qMo5091n2, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
            if (objM14362c == coroutineSingletons) {
                return coroutineSingletons;
            }
            List list5 = list;
            objM18438b = objM14362c;
            list2 = list5;
            collection = (List) objM18438b;
            if (collection == null) {
                collection = EmptyList.f38032a;
            }
            if (!(!list2.isEmpty())) {
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            EmptyList emptyList2 = EmptyList.f38032a;
            c3303a2.getClass();
            return new Resource(Resource.Status.EMPTY, emptyList2, null);
        } catch (Exception e10) {
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        }
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: d */
    public final Object mo6004d(int i10, String str, InterfaceC9968c interfaceC9968c) {
        RequestDictionariesAdd requestDictionariesAdd = new RequestDictionariesAdd();
        requestDictionariesAdd.f18060a = i10;
        Object objM18439c = this.f19628d.m18439c(str, requestDictionariesAdd, interfaceC9968c);
        return objM18439c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18439c : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: e */
    public final Object mo6005e(String str, RequestDictionariesOrder requestDictionariesOrder, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18441e = this.f19628d.m18441e(str, requestDictionariesOrder, interfaceC9968c);
        return objM18441e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18441e : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<List<UserDictionaryData>> mo6006f(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19626b.mo5089l0(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: g */
    public final C9072e mo6007g(String str, ArrayList arrayList) {
        RequestDictionariesOrder requestDictionariesOrder = new RequestDictionariesOrder();
        requestDictionariesOrder.f18063a = arrayList;
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(DictionaryOrderWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str);
        Pair[] pairArr = {pair, new Pair("data", this.f19630f.m10563a(RequestDictionariesOrder.class).m10535e(requestDictionariesOrder))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i10 = 0; i10 < 2; i10++) {
            Pair pair2 = pairArr[i10];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19629e.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: h */
    public final Object mo6008h(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DictionaryRepositoryImpl$networkUpdateDictionaries$1 dictionaryRepositoryImpl$networkUpdateDictionaries$1;
        DictionaryRepositoryImpl dictionaryRepositoryImpl;
        if (interfaceC9968c instanceof DictionaryRepositoryImpl$networkUpdateDictionaries$1) {
            dictionaryRepositoryImpl$networkUpdateDictionaries$1 = (DictionaryRepositoryImpl$networkUpdateDictionaries$1) interfaceC9968c;
            int i10 = dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19660h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19660h = i10 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$networkUpdateDictionaries$1 = new DictionaryRepositoryImpl$networkUpdateDictionaries$1(this, interfaceC9968c);
            }
        } else {
            dictionaryRepositoryImpl$networkUpdateDictionaries$1 = new DictionaryRepositoryImpl$networkUpdateDictionaries$1(this, interfaceC9968c);
        }
        Object objM18438b = dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19658f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19660h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19657e;
                dictionaryRepositoryImpl = dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19656d;
                C7499b.m14977z0(objM18438b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18438b);
            }
        }
        C7499b.m14977z0(objM18438b);
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19656d = this;
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19657e = str;
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19660h = 1;
        objM18438b = this.f19628d.m18438b(str, dictionaryRepositoryImpl$networkUpdateDictionaries$1);
        if (objM18438b == coroutineSingletons) {
            return coroutineSingletons;
        }
        dictionaryRepositoryImpl = this;
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19656d = null;
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19657e = null;
        dictionaryRepositoryImpl$networkUpdateDictionaries$1.f19660h = 2;
        return dictionaryRepositoryImpl.m9476o(str, (ResultDictionariesForUser) objM18438b, dictionaryRepositoryImpl$networkUpdateDictionaries$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c<List<UserDictionaryData>> mo6009i(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "languageTo");
        return C0062b.m273H0(this.f19626b.mo5092o0(str, str2));
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: j */
    public final InterfaceC7116c<List<UserDictionaryLocale>> mo6010j(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19626b.mo5088k0(str));
    }

    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: k */
    public final Object mo6011k(int i10, int i11, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return RoomDatabaseKt.m4573a(this.f19625a, new DictionaryRepositoryImpl$changePosition$2(this, str, i10, i11, null), interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x0102 A[LOOP:0: B:34:0x0100->B:35:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: l */
    public final Object mo6012l(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        DictionaryRepositoryImpl$addDictionaryActive$1 dictionaryRepositoryImpl$addDictionaryActive$1;
        DictionaryRepositoryImpl dictionaryRepositoryImpl;
        String str2;
        int i11;
        DictionaryDao dictionaryDao;
        C8794h c8794h;
        String str3;
        DictionaryRepositoryImpl dictionaryRepositoryImpl2;
        Pair[] pairArr;
        C1244b.a aVar;
        if (interfaceC9968c instanceof DictionaryRepositoryImpl$addDictionaryActive$1) {
            dictionaryRepositoryImpl$addDictionaryActive$1 = (DictionaryRepositoryImpl$addDictionaryActive$1) interfaceC9968c;
            int i12 = dictionaryRepositoryImpl$addDictionaryActive$1.f19641i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$addDictionaryActive$1.f19641i = i12 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$addDictionaryActive$1 = new DictionaryRepositoryImpl$addDictionaryActive$1(this, interfaceC9968c);
            }
        } else {
            dictionaryRepositoryImpl$addDictionaryActive$1 = new DictionaryRepositoryImpl$addDictionaryActive$1(this, interfaceC9968c);
        }
        Object obj = dictionaryRepositoryImpl$addDictionaryActive$1.f19639g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = dictionaryRepositoryImpl$addDictionaryActive$1.f19641i;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = dictionaryRepositoryImpl$addDictionaryActive$1.f19638f;
                str2 = dictionaryRepositoryImpl$addDictionaryActive$1.f19637e;
                dictionaryRepositoryImpl = dictionaryRepositoryImpl$addDictionaryActive$1.f19636d;
                C7499b.m14977z0(obj);
            } else if (i13 == 2) {
                i11 = dictionaryRepositoryImpl$addDictionaryActive$1.f19638f;
                str2 = dictionaryRepositoryImpl$addDictionaryActive$1.f19637e;
                dictionaryRepositoryImpl = dictionaryRepositoryImpl$addDictionaryActive$1.f19636d;
                C7499b.m14977z0(obj);
                dictionaryDao = dictionaryRepositoryImpl.f19626b;
                c8794h = new C8794h(str2, i11);
                dictionaryRepositoryImpl$addDictionaryActive$1.f19636d = dictionaryRepositoryImpl;
                dictionaryRepositoryImpl$addDictionaryActive$1.f19637e = str2;
                dictionaryRepositoryImpl$addDictionaryActive$1.f19638f = i11;
                dictionaryRepositoryImpl$addDictionaryActive$1.f19641i = 3;
                if (dictionaryDao.mo5095r0(c8794h, dictionaryRepositoryImpl$addDictionaryActive$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str3 = str2;
                dictionaryRepositoryImpl2 = dictionaryRepositoryImpl;
            } else {
                if (i13 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = dictionaryRepositoryImpl$addDictionaryActive$1.f19638f;
                str3 = dictionaryRepositoryImpl$addDictionaryActive$1.f19637e;
                dictionaryRepositoryImpl2 = dictionaryRepositoryImpl$addDictionaryActive$1.f19636d;
                C7499b.m14977z0(obj);
            }
            dictionaryRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(DictionaryAddWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            pairArr = new Pair[]{new Pair("language", str3), new Pair("id", Integer.valueOf(i11))};
            aVar = new C1244b.a();
            for (int i14 = 0; i14 < 2; i14++) {
                Pair pair = pairArr[i14];
                aVar.m4709b(pair.f38013b, (String) pair.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            dictionaryRepositoryImpl2.f19629e.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        dictionaryRepositoryImpl$addDictionaryActive$1.f19636d = this;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19637e = str;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19638f = i10;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19641i = 1;
        Object objMo5090m0 = this.f19626b.mo5090m0(str, dictionaryRepositoryImpl$addDictionaryActive$1);
        if (objMo5090m0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        dictionaryRepositoryImpl = this;
        str2 = str;
        i11 = i10;
        obj = objMo5090m0;
        Integer num = (Integer) obj;
        int iIntValue = num == null ? 0 : num.intValue() + 1;
        DictionaryDao dictionaryDao2 = dictionaryRepositoryImpl.f19626b;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19636d = dictionaryRepositoryImpl;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19637e = str2;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19638f = i11;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19641i = 2;
        if (dictionaryDao2.mo5100x0(iIntValue, i11, dictionaryRepositoryImpl$addDictionaryActive$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        dictionaryDao = dictionaryRepositoryImpl.f19626b;
        c8794h = new C8794h(str2, i11);
        dictionaryRepositoryImpl$addDictionaryActive$1.f19636d = dictionaryRepositoryImpl;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19637e = str2;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19638f = i11;
        dictionaryRepositoryImpl$addDictionaryActive$1.f19641i = 3;
        if (dictionaryDao.mo5095r0(c8794h, dictionaryRepositoryImpl$addDictionaryActive$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = str2;
        dictionaryRepositoryImpl2 = dictionaryRepositoryImpl;
        dictionaryRepositoryImpl2.getClass();
        NetworkType networkType3 = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        NetworkType networkType4 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType4, "networkType");
        C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
        C1315h.a aVar3 = (C1315h.a) new C1315h.a(DictionaryAddWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar3.f8071c.f37533j = c1309b2;
        pairArr = new Pair[]{new Pair("language", str3), new Pair("id", Integer.valueOf(i11))};
        aVar = new C1244b.a();
        while (i14 < 2) {
            Pair pair2 = pairArr[i14];
            aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar3.f8071c.f37528e = aVar.m4708a();
        dictionaryRepositoryImpl2.f19629e.m4877b(aVar3.m4879a());
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0141 A[LOOP:0: B:55:0x0142->B:54:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: m */
    public final Object mo6013m(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DictionaryRepositoryImpl$networkUpdateAvailableLocales$1 dictionaryRepositoryImpl$networkUpdateAvailableLocales$1;
        DictionaryRepositoryImpl dictionaryRepositoryImpl;
        DictionaryRepositoryImpl dictionaryRepositoryImpl2;
        String str2;
        List list;
        Iterator it;
        AbstractC1440g3 abstractC1440g3;
        C8797k c8797k;
        if (interfaceC9968c instanceof DictionaryRepositoryImpl$networkUpdateAvailableLocales$1) {
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1 = (DictionaryRepositoryImpl$networkUpdateAvailableLocales$1) interfaceC9968c;
            int i10 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i = i10 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1 = new DictionaryRepositoryImpl$networkUpdateAvailableLocales$1(this, interfaceC9968c);
            }
        } else {
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1 = new DictionaryRepositoryImpl$networkUpdateAvailableLocales$1(this, interfaceC9968c);
        }
        Object objM18438b = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19653g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i;
        if (i11 != 0) {
            if (i11 == 1) {
                str = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e;
                dictionaryRepositoryImpl = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d;
                C7499b.m14977z0(objM18438b);
            } else if (i11 == 2) {
                list = (List) dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19652f;
                str2 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e;
                dictionaryRepositoryImpl2 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d;
                C7499b.m14977z0(objM18438b);
                it = list.iterator();
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19652f;
                str2 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e;
                dictionaryRepositoryImpl2 = dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d;
                C7499b.m14977z0(objM18438b);
            }
            while (it.hasNext()) {
                DictionaryLocale dictionaryLocale = (DictionaryLocale) it.next();
                abstractC1440g3 = dictionaryRepositoryImpl2.f19627c;
                c8797k = new C8797k(str2, dictionaryLocale.f16968a);
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d = dictionaryRepositoryImpl2;
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e = str2;
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19652f = it;
                dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i = 3;
                if (abstractC1440g3.mo5041m0(c8797k, dictionaryRepositoryImpl$networkUpdateAvailableLocales$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18438b);
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d = this;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e = str;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i = 1;
        objM18438b = this.f19628d.m18438b(str, dictionaryRepositoryImpl$networkUpdateAvailableLocales$1);
        if (objM18438b == coroutineSingletons) {
            return coroutineSingletons;
        }
        dictionaryRepositoryImpl = this;
        Map<String, String> map = ((ResultDictionariesForUser) objM18438b).f18389c;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        loop1: while (true) {
            while (true) {
                if (!it2.hasNext()) {
                    break loop1;
                }
                Map.Entry<String, String> next = it2.next();
                String value = next.getValue();
                Pair pair = value != null ? new Pair(next.getKey(), value) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
        }
        ArrayList<Pair> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(((CharSequence) ((Pair) obj).f38013b).length() == 0)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
        for (Pair pair2 : arrayList2) {
            arrayList3.add(new DictionaryLocale((String) pair2.f38012a, (String) pair2.f38013b));
        }
        AbstractC1440g3 abstractC1440g4 = dictionaryRepositoryImpl.f19627c;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d = dictionaryRepositoryImpl;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e = str;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19652f = arrayList3;
        dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i = 2;
        if (abstractC1440g4.mo599i0(arrayList3, dictionaryRepositoryImpl$networkUpdateAvailableLocales$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        dictionaryRepositoryImpl2 = dictionaryRepositoryImpl;
        str2 = str;
        list = arrayList3;
        it = list.iterator();
        while (it.hasNext()) {
            DictionaryLocale dictionaryLocale2 = (DictionaryLocale) it.next();
            abstractC1440g3 = dictionaryRepositoryImpl2.f19627c;
            c8797k = new C8797k(str2, dictionaryLocale2.f16968a);
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19650d = dictionaryRepositoryImpl2;
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19651e = str2;
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19652f = it;
            dictionaryRepositoryImpl$networkUpdateAvailableLocales$1.f19655i = 3;
            if (abstractC1440g3.mo5041m0(c8797k, dictionaryRepositoryImpl$networkUpdateAvailableLocales$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2011d
    /* JADX INFO: renamed from: n */
    public final Object mo6014n(int i10, String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DictionaryRepositoryImpl$removeActiveDictionary$1 dictionaryRepositoryImpl$removeActiveDictionary$1;
        DictionaryRepositoryImpl dictionaryRepositoryImpl;
        int i11 = i10;
        String str2 = str;
        if (interfaceC9968c instanceof DictionaryRepositoryImpl$removeActiveDictionary$1) {
            dictionaryRepositoryImpl$removeActiveDictionary$1 = (DictionaryRepositoryImpl$removeActiveDictionary$1) interfaceC9968c;
            int i12 = dictionaryRepositoryImpl$removeActiveDictionary$1.f19666i;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$removeActiveDictionary$1.f19666i = i12 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$removeActiveDictionary$1 = new DictionaryRepositoryImpl$removeActiveDictionary$1(this, interfaceC9968c);
            }
        } else {
            dictionaryRepositoryImpl$removeActiveDictionary$1 = new DictionaryRepositoryImpl$removeActiveDictionary$1(this, interfaceC9968c);
        }
        Object obj = dictionaryRepositoryImpl$removeActiveDictionary$1.f19664g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = dictionaryRepositoryImpl$removeActiveDictionary$1.f19666i;
        if (i13 == 0) {
            C7499b.m14977z0(obj);
            dictionaryRepositoryImpl$removeActiveDictionary$1.f19661d = this;
            dictionaryRepositoryImpl$removeActiveDictionary$1.f19662e = str2;
            dictionaryRepositoryImpl$removeActiveDictionary$1.f19663f = i11;
            dictionaryRepositoryImpl$removeActiveDictionary$1.f19666i = 1;
            if (this.f19626b.mo5097t0(i11, str2, dictionaryRepositoryImpl$removeActiveDictionary$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            dictionaryRepositoryImpl = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = dictionaryRepositoryImpl$removeActiveDictionary$1.f19663f;
            str2 = dictionaryRepositoryImpl$removeActiveDictionary$1.f19662e;
            dictionaryRepositoryImpl = dictionaryRepositoryImpl$removeActiveDictionary$1.f19661d;
            C7499b.m14977z0(obj);
        }
        dictionaryRepositoryImpl.getClass();
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(DictionaryDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str2);
        Pair[] pairArr = {pair, new Pair("pk", Integer.valueOf(i11))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i14 = 0; i14 < 2; i14++) {
            Pair pair2 = pairArr[i14];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        dictionaryRepositoryImpl.f19629e.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x011c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0144 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0145  */
    /* JADX WARN: Code duplicated, block: B:29:0x0155  */
    /* JADX WARN: Code duplicated, block: B:30:0x015a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0145 -> B:27:0x0151). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0209 -> B:47:0x0216). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: o */
    public final java.lang.Object m9476o(java.lang.String r20, com.lingq.shared.network.result.ResultDictionariesForUser r21, p464wl.InterfaceC9968c<? super sl.C9072e> r22) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.DictionaryRepositoryImpl.m9476o(java.lang.String, com.lingq.shared.network.result.ResultDictionariesForUser, wl.c):java.lang.Object");
    }
}
