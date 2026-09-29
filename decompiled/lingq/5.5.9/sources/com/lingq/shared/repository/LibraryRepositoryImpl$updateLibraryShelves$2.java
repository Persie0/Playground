package com.lingq.shared.repository;

import bi.AbstractC1454i2;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Shelf;
import com.lingq.shared.network.result.ResultShelf;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7793a;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl$updateLibraryShelves$2", m19206f = "LibraryRepository.kt", m19207l = {144, 146}, m19208m = "invokeSuspend")
final class LibraryRepositoryImpl$updateLibraryShelves$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f20132e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List<Shelf> f20133f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryRepositoryImpl f20134g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<ResultShelf> f20135h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20136i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20137j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryShelves$2(List<Shelf> list, LibraryRepositoryImpl libraryRepositoryImpl, List<ResultShelf> list2, String str, String str2, InterfaceC9968c<? super LibraryRepositoryImpl$updateLibraryShelves$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20133f = list;
        this.f20134g = libraryRepositoryImpl;
        this.f20135h = list2;
        this.f20136i = str;
        this.f20137j = str2;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryRepositoryImpl$updateLibraryShelves$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryRepositoryImpl$updateLibraryShelves$2(this.f20133f, this.f20134g, this.f20135h, this.f20136i, this.f20137j, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20132e;
        LibraryRepositoryImpl libraryRepositoryImpl = this.f20134g;
        List<ResultShelf> list = this.f20135h;
        int i11 = 2;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : this.f20133f) {
            Shelf shelf = (Shelf) obj2;
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!C5207g.m11106a(((ResultShelf) next).f18952c, shelf.f17429e));
            if (next == null) {
                arrayList.add(obj2);
            }
        }
        AbstractC1454i2 abstractC1454i2 = libraryRepositoryImpl.f20065c;
        this.f20132e = 1;
        if (abstractC1454i2.mo5073p0(arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        AbstractC1454i2 abstractC1454i3 = libraryRepositoryImpl.f20065c;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        int i12 = 0;
        for (Object obj3 : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C9000b.m17257w();
                throw null;
            }
            ResultShelf resultShelf = (ResultShelf) obj3;
            String str = resultShelf.f18952c;
            String str2 = this.f20136i;
            String strM15498b = C7793a.m15498b(str2, str);
            C5207g.m11111f(str2, "language");
            C5207g.m11111f(strM15498b, "codeWithLanguage");
            String str3 = this.f20137j;
            C5207g.m11111f(str3, "levels");
            arrayList2.add(new Shelf(strM15498b, str2, resultShelf.f18950a, resultShelf.f18951b, resultShelf.f18952c, resultShelf.f18953d, resultShelf.f18954e, i12, str3));
            i12 = i13;
            i11 = 2;
        }
        this.f20132e = i11;
        if (abstractC1454i3.mo5053D0(arrayList2, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
