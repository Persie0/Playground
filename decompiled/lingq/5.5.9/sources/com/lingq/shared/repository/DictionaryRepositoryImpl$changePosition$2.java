package com.lingq.shared.repository;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.persistent.dao.DictionaryDao;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl$changePosition$2", m19206f = "DictionaryRepository.kt", m19207l = {120, 121, 125, 126}, m19208m = "invokeSuspend")
public final class DictionaryRepositoryImpl$changePosition$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public UserDictionaryData f19642e;

    /* JADX INFO: renamed from: f */
    public DictionaryRepositoryImpl f19643f;

    /* JADX INFO: renamed from: g */
    public int f19644g;

    /* JADX INFO: renamed from: h */
    public int f19645h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DictionaryRepositoryImpl f19646i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f19647j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f19648k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f19649l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$changePosition$2(DictionaryRepositoryImpl dictionaryRepositoryImpl, String str, int i10, int i11, InterfaceC9968c<? super DictionaryRepositoryImpl$changePosition$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19646i = dictionaryRepositoryImpl;
        this.f19647j = str;
        this.f19648k = i10;
        this.f19649l = i11;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionaryRepositoryImpl$changePosition$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new DictionaryRepositoryImpl$changePosition$2(this.f19646i, this.f19647j, this.f19648k, this.f19649l, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        UserDictionaryData userDictionaryData;
        UserDictionaryData userDictionaryData2;
        DictionaryDao dictionaryDao;
        UserDictionaryData userDictionaryData3;
        DictionaryDao dictionaryDao2;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f19645h;
        int i12 = this.f19649l;
        int i13 = this.f19648k;
        String str = this.f19647j;
        DictionaryRepositoryImpl dictionaryRepositoryImpl = this.f19646i;
        C9072e c9072e = null;
        if (i11 != 0) {
            if (i11 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i11 == 2) {
                    userDictionaryData = this.f19642e;
                    C7499b.m14977z0(obj);
                    userDictionaryData2 = (UserDictionaryData) obj;
                    if (userDictionaryData != null && userDictionaryData2 != null) {
                        dictionaryDao = dictionaryRepositoryImpl.f19626b;
                        this.f19642e = userDictionaryData2;
                        this.f19643f = dictionaryRepositoryImpl;
                        this.f19644g = i13;
                        this.f19645h = 3;
                        if (dictionaryDao.mo5099w0(userDictionaryData.f21703a, i12, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        userDictionaryData3 = userDictionaryData2;
                        dictionaryDao2 = dictionaryRepositoryImpl.f19626b;
                        i10 = userDictionaryData3.f21703a;
                        this.f19642e = null;
                        this.f19643f = null;
                        this.f19645h = 4;
                        if (dictionaryDao2.mo5099w0(i10, i13, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return c9072e;
                }
                if (i11 == 3) {
                    i13 = this.f19644g;
                    dictionaryRepositoryImpl = this.f19643f;
                    userDictionaryData3 = this.f19642e;
                    C7499b.m14977z0(obj);
                    dictionaryDao2 = dictionaryRepositoryImpl.f19626b;
                    i10 = userDictionaryData3.f21703a;
                    this.f19642e = null;
                    this.f19643f = null;
                    this.f19645h = 4;
                    if (dictionaryDao2.mo5099w0(i10, i13, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            c9072e = C9072e.f47360a;
            return c9072e;
        }
        C7499b.m14977z0(obj);
        DictionaryDao dictionaryDao3 = dictionaryRepositoryImpl.f19626b;
        this.f19645h = 1;
        obj = dictionaryDao3.mo5093p0(i13, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        userDictionaryData = (UserDictionaryData) obj;
        DictionaryDao dictionaryDao4 = dictionaryRepositoryImpl.f19626b;
        this.f19642e = userDictionaryData;
        this.f19645h = 2;
        obj = dictionaryDao4.mo5093p0(i12, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        userDictionaryData2 = (UserDictionaryData) obj;
        if (userDictionaryData != null) {
            dictionaryDao = dictionaryRepositoryImpl.f19626b;
            this.f19642e = userDictionaryData2;
            this.f19643f = dictionaryRepositoryImpl;
            this.f19644g = i13;
            this.f19645h = 3;
            if (dictionaryDao.mo5099w0(userDictionaryData.f21703a, i12, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            userDictionaryData3 = userDictionaryData2;
            dictionaryDao2 = dictionaryRepositoryImpl.f19626b;
            i10 = userDictionaryData3.f21703a;
            this.f19642e = null;
            this.f19643f = null;
            this.f19645h = 4;
            if (dictionaryDao2.mo5099w0(i10, i13, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c9072e = C9072e.f47360a;
        }
        return c9072e;
    }
}
