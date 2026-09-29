package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultLibraryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8801o;
import p367rh.C8803q;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl$updateLibraryItems$2$1", m19206f = "LibraryRepository.kt", m19207l = {245, 248, 255, 271}, m19208m = "invokeSuspend")
public final class LibraryRepositoryImpl$updateLibraryItems$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f20117e;

    /* JADX INFO: renamed from: f */
    public int f20118f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<ResultLibraryItem> f20119g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibraryRepositoryImpl f20120h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f20121i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20122j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f20123k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f20124l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryItems$2$1(List<ResultLibraryItem> list, LibraryRepositoryImpl libraryRepositoryImpl, int i10, String str, String str2, String str3, InterfaceC9968c<? super LibraryRepositoryImpl$updateLibraryItems$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20119g = list;
        this.f20120h = libraryRepositoryImpl;
        this.f20121i = i10;
        this.f20122j = str;
        this.f20123k = str2;
        this.f20124l = str3;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryRepositoryImpl$updateLibraryItems$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryRepositoryImpl$updateLibraryItems$2$1(this.f20119g, this.f20120h, this.f20121i, this.f20122j, this.f20123k, this.f20124l, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009d  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[LOOP:2: B:26:0x0097->B:30:0x00a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117 A[LOOP:1: B:42:0x0111->B:44:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d5 A[SYNTHETIC] */
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
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List list;
        String str;
        String str2;
        ArrayList arrayList;
        int i10;
        AbstractC1454i2 abstractC1454i2;
        int i11;
        List<LibraryData> list2;
        ArrayList arrayList2;
        AbstractC1495o1 abstractC1495o1;
        List<String> list3;
        ArrayList arrayList3;
        Iterator<T> it;
        List list4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f20118f;
        int i13 = this.f20121i;
        List<ResultLibraryItem> list5 = this.f20119g;
        LibraryRepositoryImpl libraryRepositoryImpl = this.f20120h;
        if (i12 != 0) {
            if (i12 == 1) {
                list4 = this.f20117e;
                C7499b.m14977z0(obj);
            } else if (i12 == 2) {
                list = this.f20117e;
                C7499b.m14977z0(obj);
                list = list4;
                list = list4;
                str = this.f20122j;
                str2 = this.f20123k;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                i10 = 0;
                for (Object obj2 : list5) {
                    i11 = i10 + 1;
                    if (i10 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    ResultLibraryItem resultLibraryItem = (ResultLibraryItem) obj2;
                    ArrayList arrayList4 = arrayList;
                    String str3 = str2;
                    arrayList4.add(new C8803q(str, resultLibraryItem.f18712a, resultLibraryItem.f18714b, ((i13 - 1) * 20) + i10, str3));
                    arrayList = arrayList4;
                    i10 = i11;
                    str2 = str3;
                }
                abstractC1454i2 = libraryRepositoryImpl.f20065c;
                this.f20117e = list;
                this.f20118f = 3;
                list2 = list;
                if (abstractC1454i2.mo5057H0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList2 = new ArrayList();
                for (LibraryData libraryData : list2) {
                    list3 = libraryData.f17227F;
                    if (list3 != null) {
                        arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new C8801o(this.f20124l, Integer.parseInt((String) it.next()), libraryData.f17238a));
                        }
                        arrayList2.addAll(arrayList3);
                    }
                }
                abstractC1495o1 = libraryRepositoryImpl.f20066d;
                this.f20117e = null;
                this.f20118f = 4;
                if (abstractC1495o1.mo5137J0(arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 3) {
                List list6 = this.f20117e;
                C7499b.m14977z0(obj);
                list2 = list6;
                arrayList2 = new ArrayList();
                while (r2.hasNext()) {
                    list3 = libraryData.f17227F;
                    if (list3 != null) {
                        arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                        it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(new C8801o(this.f20124l, Integer.parseInt((String) it.next()), libraryData.f17238a));
                        }
                        arrayList2.addAll(arrayList3);
                    }
                }
                abstractC1495o1 = libraryRepositoryImpl.f20066d;
                this.f20117e = null;
                this.f20118f = 4;
                if (abstractC1495o1.mo5137J0(arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList5 = new ArrayList(C9325m.m17681z(list5, 10));
        Iterator<T> it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList5.add(C0062b.m294O((ResultLibraryItem) it2.next()));
        }
        AbstractC1454i2 abstractC1454i3 = libraryRepositoryImpl.f20065c;
        this.f20117e = arrayList5;
        this.f20118f = 1;
        Object objMo599i0 = abstractC1454i3.mo599i0(arrayList5, this);
        list = arrayList5;
        if (objMo599i0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (i13 == 1) {
            AbstractC1454i2 abstractC1454i4 = libraryRepositoryImpl.f20065c;
            this.f20117e = list;
            this.f20118f = 2;
            if (abstractC1454i4.mo5069l0(this.f20122j, this) == coroutineSingletons) {
                list = list4;
                return coroutineSingletons;
            }
        }
        list = list4;
        list = list4;
        str = this.f20122j;
        str2 = this.f20123k;
        arrayList = new ArrayList(C9325m.m17681z(list5, 10));
        i10 = 0;
        while (r5.hasNext()) {
            i11 = i10 + 1;
            if (i10 >= 0) {
                C9000b.m17257w();
                throw null;
            }
            ResultLibraryItem resultLibraryItem2 = (ResultLibraryItem) obj2;
            ArrayList arrayList6 = arrayList;
            String str4 = str2;
            arrayList6.add(new C8803q(str, resultLibraryItem2.f18712a, resultLibraryItem2.f18714b, ((i13 - 1) * 20) + i10, str4));
            arrayList = arrayList6;
            i10 = i11;
            str2 = str4;
        }
        abstractC1454i2 = libraryRepositoryImpl.f20065c;
        this.f20117e = list;
        this.f20118f = 3;
        list2 = list;
        if (abstractC1454i2.mo5057H0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            list3 = libraryData.f17227F;
            if (list3 != null) {
                arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new C8801o(this.f20124l, Integer.parseInt((String) it.next()), libraryData.f17238a));
                }
                arrayList2.addAll(arrayList3);
            }
        }
        abstractC1495o1 = libraryRepositoryImpl.f20066d;
        this.f20117e = null;
        this.f20118f = 4;
        if (abstractC1495o1.mo5137J0(arrayList2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
