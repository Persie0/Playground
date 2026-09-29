package com.lingq.shared.repository;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestClozeTest;
import com.lingq.shared.network.requests.SentenceFragment;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p264mi.C7561a;
import p264mi.C7562b;
import p460wh.InterfaceC9933a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lmi/b;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.VocabularyRepositoryImpl$networkClozeTest$2", m19206f = "VocabularyRepository.kt", m19207l = {426, 427, 428}, m19208m = "invokeSuspend")
final class VocabularyRepositoryImpl$networkClozeTest$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends C7562b>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20641e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20642f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ VocabularyRepositoryImpl f20643g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f20644h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f20645i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyRepositoryImpl$networkClozeTest$2(VocabularyRepositoryImpl vocabularyRepositoryImpl, String str, int i10, InterfaceC9968c<? super VocabularyRepositoryImpl$networkClozeTest$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20643g = vocabularyRepositoryImpl;
        this.f20644h = str;
        this.f20645i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        VocabularyRepositoryImpl$networkClozeTest$2 vocabularyRepositoryImpl$networkClozeTest$2 = new VocabularyRepositoryImpl$networkClozeTest$2(this.f20643g, this.f20644h, this.f20645i, interfaceC9968c);
        vocabularyRepositoryImpl$networkClozeTest$2.f20642f = obj;
        return vocabularyRepositoryImpl$networkClozeTest$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends C7562b>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((VocabularyRepositoryImpl$networkClozeTest$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        String str;
        List<SentenceFragment> list;
        ?? arrayList;
        List list2;
        Resource resourceM9437c;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20641e;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7117d = (InterfaceC7117d) this.f20642f;
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                interfaceC7117d = (InterfaceC7117d) this.f20642f;
                C7499b.m14977z0(obj);
                RequestClozeTest requestClozeTest = (RequestClozeTest) obj;
                Resource.C3303a c3303a = Resource.f17861d;
                C5207g.m11111f(requestClozeTest, "<this>");
                str = requestClozeTest.f18037a;
                if (str == null) {
                    str = "";
                }
                list = requestClozeTest.f18038b;
                if (list != null) {
                    arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    for (SentenceFragment sentenceFragment : list) {
                        str2 = sentenceFragment.f18240a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList.add(new C7561a(str2, sentenceFragment.f18241b));
                    }
                } else {
                    arrayList = EmptyList.f38032a;
                }
                list2 = requestClozeTest.f18039c;
                if (list2 == null) {
                    list2 = EmptyList.f38032a;
                }
                C7562b c7562b = new C7562b(str, arrayList, list2);
                c3303a.getClass();
                resourceM9437c = Resource.C3303a.m9437c(c7562b);
                this.f20642f = null;
                this.f20641e = 3;
                if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7117d interfaceC7117d2 = (InterfaceC7117d) this.f20642f;
        Resource.f17861d.getClass();
        Resource resource = new Resource(Resource.Status.LOADING, null, null);
        this.f20642f = interfaceC7117d2;
        this.f20641e = 1;
        if (interfaceC7117d2.mo1339r(resource, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC7117d = interfaceC7117d2;
        InterfaceC9933a interfaceC9933a = this.f20643g.f20621e;
        Integer num = new Integer(this.f20645i);
        this.f20642f = interfaceC7117d;
        this.f20641e = 2;
        obj = interfaceC9933a.m18419d(this.f20644h, num, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        RequestClozeTest requestClozeTest2 = (RequestClozeTest) obj;
        Resource.C3303a c3303a2 = Resource.f17861d;
        C5207g.m11111f(requestClozeTest2, "<this>");
        str = requestClozeTest2.f18037a;
        if (str == null) {
            str = "";
        }
        list = requestClozeTest2.f18038b;
        if (list != null) {
            arrayList = new ArrayList(C9325m.m17681z(list, 10));
            while (r7.hasNext()) {
                str2 = sentenceFragment.f18240a;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new C7561a(str2, sentenceFragment.f18241b));
            }
        } else {
            arrayList = EmptyList.f38032a;
        }
        list2 = requestClozeTest2.f18039c;
        if (list2 == null) {
            list2 = EmptyList.f38032a;
        }
        C7562b c7562b2 = new C7562b(str, arrayList, list2);
        c3303a2.getClass();
        resourceM9437c = Resource.C3303a.m9437c(c7562b2);
        this.f20642f = null;
        this.f20641e = 3;
        if (interfaceC7117d.mo1339r(resourceM9437c, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
