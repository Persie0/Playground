package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1321i;
import com.lingq.core.database.entity.LibraryShelfEntity;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.network.api.result.ResultLibraryTab;
import com.lingq.core.network.api.result.ResultShelf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.k85;
import p000.v91;
import p000.vi3;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.data.repository.LibraryRepositoryImpl$updateLibraryShelves$2", m4291f = "LibraryRepositoryImpl.kt", m4292l = {68, 70}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryRepositoryImpl$updateLibraryShelves$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f15807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f15808b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1296l f15809c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f15810d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f15811e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f15812f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryShelves$2(List list, C1296l c1296l, List list2, String str, String str2, Continuation continuation) {
        super(1, continuation);
        this.f15808b = list;
        this.f15809c = c1296l;
        this.f15810d = list2;
        this.f15811e = str;
        this.f15812f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryRepositoryImpl$updateLibraryShelves$2(this.f15808b, this.f15809c, this.f15810d, this.f15811e, this.f15812f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryRepositoryImpl$updateLibraryShelves$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        Throwable th2;
        Object next;
        C1321i c1321i = this.f15809c.f16514d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f15807a;
        List list = this.f15810d;
        int i2 = 2;
        xfa xfaVar = xfa.f68157a;
        int i3 = 0;
        Throwable th3 = null;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list2 = this.f15808b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                LibraryShelfEntity libraryShelfEntity = (LibraryShelfEntity) obj2;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        th2 = th3;
                        next = th2;
                        break;
                    }
                    next = it.next();
                    th2 = th3;
                    if (fa4.m11650l(((ResultShelf) next).f21506d, libraryShelfEntity.f17386f)) {
                        break;
                    }
                    th3 = th2;
                }
                if (next == null) {
                    arrayList.add(obj2);
                }
                th3 = th2;
            }
            th = th3;
            this.f15807a = 1;
            Object objM2861d = AbstractC0758a.m2861d(new k85(c1321i, arrayList, i3), c1321i.f17034K, this, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        th = null;
        List list3 = list;
        int i4 = 10;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it2 = list3.iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            Object next2 = it2.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                vz1.m23628e0();
                throw th;
            }
            ResultShelf resultShelf = (ResultShelf) next2;
            String str = resultShelf.f21506d;
            String str2 = this.f15811e;
            String strM23629f = vz1.m23629f(str2, str);
            str2.getClass();
            String str3 = this.f15812f;
            str3.getClass();
            Boolean bool = resultShelf.f21503a;
            Boolean bool2 = resultShelf.f21504b;
            List list4 = resultShelf.f21505c;
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(list4, i4));
            int i7 = 0;
            for (Object obj3 : list4) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    vz1.m23628e0();
                    throw th;
                }
                ResultLibraryTab resultLibraryTab = (ResultLibraryTab) obj3;
                resultLibraryTab.getClass();
                arrayList3.add(LibraryTab.m8094a(new LibraryTab(resultLibraryTab.f21302a, resultLibraryTab.f21303b, resultLibraryTab.f21304c, resultLibraryTab.f21305d, resultLibraryTab.f21306e, resultLibraryTab.f21307f), false, i7, 47));
                i7 = i8;
                xfaVar = xfaVar;
                it2 = it2;
            }
            Iterator it3 = it2;
            xfa xfaVar2 = xfaVar;
            String str4 = resultShelf.f21506d;
            int i9 = resultShelf.f21507e;
            String str5 = resultShelf.f21508f;
            String str6 = resultShelf.f21509g;
            arrayList2.add(new LibraryShelfEntity(strM23629f, str2, bool, bool2, arrayList3, str4, i9, str5, i5, str3, str6 == null ? str5 : str6));
            i5 = i6;
            xfaVar = xfaVar2;
            it2 = it3;
            i2 = 2;
            i4 = 10;
        }
        int i10 = i2;
        xfa xfaVar3 = xfaVar;
        this.f15807a = i10;
        Object objM2861d2 = AbstractC0758a.m2861d(new k85(c1321i, arrayList2, i10), c1321i.f17034K, this, false, true);
        if (objM2861d2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objM2861d2 = xfaVar3;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar3;
    }
}
