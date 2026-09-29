package com.lingq.shared.repository;

import ae.C0062b;
import bi.AbstractC1454i2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.LibraryData;
import com.lingq.shared.network.result.ResultLibraryItem;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p367rh.C8793g;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl$networkCourseLessonsSearch$2$1", m19206f = "LibraryRepository.kt", m19207l = {335, 338, 339, 341, 346}, m19208m = "invokeSuspend")
public final class LibraryRepositoryImpl$networkCourseLessonsSearch$2$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public LibraryRepositoryImpl f20091e;

    /* JADX INFO: renamed from: f */
    public List f20092f;

    /* JADX INFO: renamed from: g */
    public List f20093g;

    /* JADX INFO: renamed from: h */
    public int f20094h;

    /* JADX INFO: renamed from: i */
    public int f20095i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Results<ResultLibraryItem> f20096j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ LibraryRepositoryImpl f20097k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f20098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$networkCourseLessonsSearch$2$1(Results<ResultLibraryItem> results, LibraryRepositoryImpl libraryRepositoryImpl, int i10, InterfaceC9968c<? super LibraryRepositoryImpl$networkCourseLessonsSearch$2$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20096j = results;
        this.f20097k = libraryRepositoryImpl;
        this.f20098l = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryRepositoryImpl$networkCourseLessonsSearch$2$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryRepositoryImpl$networkCourseLessonsSearch$2$1(this.f20096j, this.f20097k, this.f20098l, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0114  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0127  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0146 A[LOOP:0: B:59:0x0138->B:63:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0166 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x0154 A[SYNTHETIC] */
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
        Object objMo5078u0;
        LibraryRepositoryImpl libraryRepositoryImpl;
        int i10;
        List list;
        List list2;
        LibraryRepositoryImpl libraryRepositoryImpl2;
        List<Integer> list3;
        Object next;
        AbstractC1454i2 abstractC1454i2;
        List list4;
        LibraryRepositoryImpl libraryRepositoryImpl3;
        AbstractC1454i2 abstractC1454i3;
        List list5;
        LibraryRepositoryImpl libraryRepositoryImpl4;
        ArrayList arrayList;
        int i11;
        AbstractC1454i2 abstractC1454i4;
        int i12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = this.f20095i;
        if (i13 != 0) {
            if (i13 == 1) {
                i10 = this.f20094h;
                List list6 = this.f20092f;
                LibraryRepositoryImpl libraryRepositoryImpl5 = this.f20091e;
                C7499b.m14977z0(obj);
                libraryRepositoryImpl = libraryRepositoryImpl5;
                objMo5078u0 = obj;
                list = list6;
            } else if (i13 == 2) {
                i10 = this.f20094h;
                List list7 = this.f20093g;
                list3 = this.f20092f;
                libraryRepositoryImpl2 = this.f20091e;
                C7499b.m14977z0(obj);
                list2 = list7;
                abstractC1454i2 = libraryRepositoryImpl2.f20065c;
                this.f20091e = libraryRepositoryImpl2;
                this.f20092f = list2;
                this.f20093g = null;
                this.f20094h = i10;
                this.f20095i = 3;
                if (abstractC1454i2.mo5071n0(i10, list3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list4 = list2;
                libraryRepositoryImpl3 = libraryRepositoryImpl2;
                abstractC1454i3 = libraryRepositoryImpl3.f20065c;
                this.f20091e = libraryRepositoryImpl3;
                this.f20092f = list4;
                this.f20094h = i10;
                this.f20095i = 4;
                if (abstractC1454i3.mo599i0(list4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list5 = list4;
                libraryRepositoryImpl4 = libraryRepositoryImpl3;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                i11 = 0;
                for (Object obj2 : list5) {
                    i12 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    arrayList.add(new C8793g(i10, ((LibraryData) obj2).f17238a, i11));
                    i11 = i12;
                }
                abstractC1454i4 = libraryRepositoryImpl4.f20065c;
                this.f20091e = null;
                this.f20092f = null;
                this.f20095i = 5;
                if (abstractC1454i4.mo5056G0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i13 == 3) {
                i10 = this.f20094h;
                List list8 = this.f20092f;
                libraryRepositoryImpl3 = this.f20091e;
                C7499b.m14977z0(obj);
                list4 = list8;
                abstractC1454i3 = libraryRepositoryImpl3.f20065c;
                this.f20091e = libraryRepositoryImpl3;
                this.f20092f = list4;
                this.f20094h = i10;
                this.f20095i = 4;
                if (abstractC1454i3.mo599i0(list4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list5 = list4;
                libraryRepositoryImpl4 = libraryRepositoryImpl3;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                i11 = 0;
                while (r4.hasNext()) {
                    i12 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    arrayList.add(new C8793g(i10, ((LibraryData) obj2).f17238a, i11));
                    i11 = i12;
                }
                abstractC1454i4 = libraryRepositoryImpl4.f20065c;
                this.f20091e = null;
                this.f20092f = null;
                this.f20095i = 5;
                if (abstractC1454i4.mo5056G0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i13 == 4) {
                i10 = this.f20094h;
                List list9 = this.f20092f;
                libraryRepositoryImpl4 = this.f20091e;
                C7499b.m14977z0(obj);
                list5 = list9;
                arrayList = new ArrayList(C9325m.m17681z(list5, 10));
                i11 = 0;
                while (r4.hasNext()) {
                    i12 = i11 + 1;
                    if (i11 >= 0) {
                        C9000b.m17257w();
                        throw null;
                    }
                    arrayList.add(new C8793g(i10, ((LibraryData) obj2).f17238a, i11));
                    i11 = i12;
                }
                abstractC1454i4 = libraryRepositoryImpl4.f20065c;
                this.f20091e = null;
                this.f20092f = null;
                this.f20095i = 5;
                if (abstractC1454i4.mo5056G0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i13 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        List<? extends ResultLibraryItem> list10 = this.f20096j.f19136d;
        if (list10 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list10, 10));
        Iterator<T> it = list10.iterator();
        while (it.hasNext()) {
            arrayList2.add(C0062b.m294O((ResultLibraryItem) it.next()));
        }
        LibraryRepositoryImpl libraryRepositoryImpl6 = this.f20097k;
        AbstractC1454i2 abstractC1454i5 = libraryRepositoryImpl6.f20065c;
        this.f20091e = libraryRepositoryImpl6;
        this.f20092f = arrayList2;
        int i14 = this.f20098l;
        this.f20094h = i14;
        this.f20095i = 1;
        objMo5078u0 = abstractC1454i5.mo5078u0(i14, LibraryItemType.Content.getValue(), this);
        if (objMo5078u0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        libraryRepositoryImpl = libraryRepositoryImpl6;
        i10 = i14;
        list = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : (List) objMo5078u0) {
            int iIntValue = ((Number) obj3).intValue();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((LibraryData) next).f17238a == iIntValue));
            if (next == null) {
                arrayList3.add(obj3);
            }
        }
        AbstractC1454i2 abstractC1454i6 = libraryRepositoryImpl.f20065c;
        this.f20091e = libraryRepositoryImpl;
        this.f20092f = arrayList3;
        this.f20093g = list;
        this.f20094h = i10;
        this.f20095i = 2;
        if (abstractC1454i6.mo5072o0(arrayList3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list2 = list;
        libraryRepositoryImpl2 = libraryRepositoryImpl;
        list3 = arrayList3;
        abstractC1454i2 = libraryRepositoryImpl2.f20065c;
        this.f20091e = libraryRepositoryImpl2;
        this.f20092f = list2;
        this.f20093g = null;
        this.f20094h = i10;
        this.f20095i = 3;
        if (abstractC1454i2.mo5071n0(i10, list3, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list4 = list2;
        libraryRepositoryImpl3 = libraryRepositoryImpl2;
        abstractC1454i3 = libraryRepositoryImpl3.f20065c;
        this.f20091e = libraryRepositoryImpl3;
        this.f20092f = list4;
        this.f20094h = i10;
        this.f20095i = 4;
        if (abstractC1454i3.mo599i0(list4, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list5 = list4;
        libraryRepositoryImpl4 = libraryRepositoryImpl3;
        arrayList = new ArrayList(C9325m.m17681z(list5, 10));
        i11 = 0;
        while (r4.hasNext()) {
            i12 = i11 + 1;
            if (i11 >= 0) {
                C9000b.m17257w();
                throw null;
            }
            arrayList.add(new C8793g(i10, ((LibraryData) obj2).f17238a, i11));
            i11 = i12;
        }
        abstractC1454i4 = libraryRepositoryImpl4.f20065c;
        this.f20091e = null;
        this.f20092f = null;
        this.f20095i = 5;
        if (abstractC1454i4.mo5056G0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
