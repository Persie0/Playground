package com.lingq.feature.library;

import com.lingq.core.domain.library.C1386a;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$tabSelected$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {517}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$tabSelected$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LibraryShelf f26611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LibraryTab f26612d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$tabSelected$1(C2146e c2146e, LibraryShelf libraryShelf, LibraryTab libraryTab, Continuation continuation) {
        super(2, continuation);
        this.f26610b = c2146e;
        this.f26611c = libraryShelf;
        this.f26612d = libraryTab;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateViewModel$tabSelected$1(this.f26610b, this.f26611c, this.f26612d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateViewModel$tabSelected$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        ArrayList arrayList;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26609a;
        LibraryShelf libraryShelf = this.f26611c;
        C2146e c2146e = this.f26610b;
        LibraryTab libraryTab = this.f26612d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1386a c1386a = c2146e.f26695t;
            this.f26609a = 1;
            if (c1386a.m7999c(libraryShelf, libraryTab, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3244l c3244l = c2146e.f26660I;
        do {
            value = c3244l.getValue();
            List<LibraryShelf> list = (List) value;
            arrayList = new ArrayList(v91.m23189q0(list, 10));
            for (LibraryShelf libraryShelfM8093a : list) {
                if (fa4.m11650l(libraryShelfM8093a.f19496d, libraryShelf.f19496d)) {
                    List<LibraryTab> list2 = libraryShelfM8093a.f19495c;
                    ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
                    for (LibraryTab libraryTab2 : list2) {
                        arrayList2.add(LibraryTab.m8094a(libraryTab2, fa4.m11650l(libraryTab2.f19506f, libraryTab.f19506f), 0, 55));
                    }
                    libraryShelfM8093a = LibraryShelf.m8093a(libraryShelfM8093a, arrayList2);
                }
                arrayList.add(libraryShelfM8093a);
            }
        } while (!c3244l.m15570h(value, arrayList));
        List<LibraryTab> list3 = libraryShelf.f19495c;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, 10));
        for (LibraryTab libraryTab3 : list3) {
            arrayList3.add(LibraryTab.m8094a(libraryTab3, fa4.m11650l(libraryTab3.f19506f, libraryTab.f19506f), 0, 55));
        }
        c2146e.m9066X2(LibraryShelf.m8093a(libraryShelf, arrayList3), libraryTab);
        return xfa.f68157a;
    }
}
