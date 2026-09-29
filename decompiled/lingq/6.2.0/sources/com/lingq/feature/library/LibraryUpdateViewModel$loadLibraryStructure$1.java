package com.lingq.feature.library;

import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.a69;
import p000.c32;
import p000.fa4;
import p000.u91;
import p000.v59;
import p000.v91;
import p000.vz1;
import p000.wq1;
import p000.xfa;
import p000.y59;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$loadLibraryStructure$1", m4291f = "LibraryUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateViewModel$loadLibraryStructure$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2146e f26492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f26493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$loadLibraryStructure$1(C2146e c2146e, List list, Continuation continuation) {
        super(2, continuation);
        this.f26492b = c2146e;
        this.f26493c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LibraryUpdateViewModel$loadLibraryStructure$1 libraryUpdateViewModel$loadLibraryStructure$1 = new LibraryUpdateViewModel$loadLibraryStructure$1(this.f26492b, this.f26493c, continuation);
        libraryUpdateViewModel$loadLibraryStructure$1.f26491a = obj;
        return libraryUpdateViewModel$loadLibraryStructure$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        LibraryUpdateViewModel$loadLibraryStructure$1 libraryUpdateViewModel$loadLibraryStructure$1 = (LibraryUpdateViewModel$loadLibraryStructure$1) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        libraryUpdateViewModel$loadLibraryStructure$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object next;
        Iterator it;
        Iterator it2;
        LibraryShelf libraryShelf;
        Object next2;
        int i;
        LibraryShelf libraryShelfM8093a;
        Object next3;
        List list = (List) this.f26491a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<LibraryShelf> list2 = list;
        C2146e c2146e = this.f26492b;
        C3244l c3244l = c2146e.f26661J;
        ArrayList<LibraryShelf> arrayList = new ArrayList();
        for (Object obj2 : list2) {
            if (fa4.m11650l(((LibraryShelf) obj2).f19496d, "paid")) {
                c2146e.f26657F.m17896j();
            }
            arrayList.add(obj2);
        }
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (LibraryShelf libraryShelf2 : arrayList) {
            Iterator it3 = this.f26493c.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!fa4.m11650l(((LibraryShelf) next2).f19496d, libraryShelf2.f19496d));
            LibraryShelf libraryShelf3 = (LibraryShelf) next2;
            if (libraryShelf3 != null) {
                List<LibraryTab> list3 = libraryShelf2.f19495c;
                ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, i2));
                for (LibraryTab libraryTab : list3) {
                    Iterator it4 = libraryShelf3.f19495c.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it4.next();
                    } while (!fa4.m11650l(((LibraryTab) next3).f19506f, libraryTab.f19506f));
                    LibraryTab libraryTab2 = (LibraryTab) next3;
                    arrayList3.add(LibraryTab.m8094a(libraryTab, libraryTab2 != null ? libraryTab2.f19504d : fa4.m11650l(libraryTab.f19506f, AbstractC3423or.m18268n(libraryShelf2).f19506f), 0, 55));
                }
                libraryShelfM8093a = LibraryShelf.m8093a(libraryShelf2, arrayList3);
                i = 10;
            } else {
                List<LibraryTab> list4 = libraryShelf2.f19495c;
                i = 10;
                ArrayList arrayList4 = new ArrayList(v91.m23189q0(list4, 10));
                for (LibraryTab libraryTab3 : list4) {
                    arrayList4.add(LibraryTab.m8094a(libraryTab3, fa4.m11650l(libraryTab3.f19506f, AbstractC3423or.m18268n(libraryShelf2).f19506f), 0, 55));
                }
                libraryShelfM8093a = LibraryShelf.m8093a(libraryShelf2, arrayList4);
            }
            arrayList2.add(libraryShelfM8093a);
            i2 = i;
        }
        C3244l c3244l2 = c2146e.f26660I;
        do {
            value = c3244l2.getValue();
        } while (!c3244l2.m15570h(value, arrayList2));
        C3244l c3244l3 = c2146e.f26669R;
        do {
            value2 = c3244l3.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l3.m15570h(value2, Boolean.FALSE));
        boolean zIsEmpty = ((Map) c3244l.getValue()).isEmpty();
        a69 a69Var = a69.f298a;
        if (zIsEmpty) {
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                LibraryShelf libraryShelf4 = (LibraryShelf) it5.next();
                for (LibraryTab libraryTab4 : libraryShelf4.f19495c) {
                    while (true) {
                        Object value3 = c3244l.getValue();
                        it2 = it5;
                        libraryShelf = libraryShelf4;
                        if (c3244l.m15570h(value3, AbstractC3194a.m15368U((Map) value3, new Pair(AbstractC3423or.m18220E(libraryShelf4, libraryTab4), new y59(vz1.m23604J(new v59(fa4.m11650l(AbstractC3423or.m18268n(libraryShelf4).f19502b, LibraryContentType.Lessons.getValue()), wq1.m24119o("loading_", libraryShelf4.f19496d, "_", AbstractC3423or.m18268n(libraryShelf).f19502b))), a69Var))))) {
                            break;
                        }
                        it5 = it2;
                        libraryShelf4 = libraryShelf;
                    }
                    it5 = it2;
                    libraryShelf4 = libraryShelf;
                }
            }
            Iterator it6 = u91.m22615g1(list2, 5).iterator();
            while (it6.hasNext()) {
                LibraryShelf libraryShelf5 = (LibraryShelf) it6.next();
                for (LibraryTab libraryTab5 : libraryShelf5.f19495c) {
                    while (true) {
                        Object value4 = c3244l.getValue();
                        it = it6;
                        if (c3244l.m15570h(value4, AbstractC3194a.m15368U((Map) value4, new Pair(AbstractC3423or.m18220E(libraryShelf5, libraryTab5), new y59(vz1.m23604J(new v59(fa4.m11650l(AbstractC3423or.m18268n(libraryShelf5).f19502b, LibraryContentType.Lessons.getValue()), wq1.m24119o("loading_", libraryShelf5.f19496d, "_", AbstractC3423or.m18268n(libraryShelf5).f19502b))), a69Var))))) {
                            break;
                        }
                        it6 = it;
                    }
                    c2146e.m9066X2(libraryShelf5, AbstractC3423or.m18268n(libraryShelf5));
                    it6 = it;
                }
            }
        } else {
            for (LibraryShelf libraryShelf6 : list2) {
                y59 y59Var = (y59) ((Map) c3244l.getValue()).get(AbstractC3423or.m18219D(libraryShelf6));
                if (!fa4.m11650l(y59Var != null ? y59Var.f69327b : null, a69Var)) {
                    Iterator it7 = libraryShelf6.f19495c.iterator();
                    do {
                        if (!it7.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it7.next();
                    } while (!((LibraryTab) next).f19504d);
                    LibraryTab libraryTabM18268n = (LibraryTab) next;
                    if (libraryTabM18268n == null) {
                        libraryTabM18268n = AbstractC3423or.m18268n(libraryShelf6);
                    }
                    c2146e.m9066X2(libraryShelf6, libraryTabM18268n);
                }
            }
        }
        return xfa.f68157a;
    }
}
