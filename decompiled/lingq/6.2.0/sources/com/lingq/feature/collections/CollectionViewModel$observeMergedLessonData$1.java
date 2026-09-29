package com.lingq.feature.collections;

import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemCounter;
import com.lingq.core.domain.model.library.LibraryItemDownload;
import com.lingq.core.domain.model.library.LibraryLessonAudioDownload;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C2907cy;
import p000.C2981ey;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.c32;
import p000.c61;
import p000.dj3;
import p000.e65;
import p000.h81;
import p000.n83;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeMergedLessonData$1", m4291f = "CollectionViewModel.kt", m4292l = {908}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeMergedLessonData$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2034d f25498b;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeMergedLessonData$1$1 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeMergedLessonData$1$1", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20271 extends SuspendLambda implements dj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f25499a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ List f25500b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ List f25501c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ List f25502d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Map f25503e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C2034d f25504f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20271(C2034d c2034d, Continuation continuation) {
            super(6, continuation);
            this.f25504f = c2034d;
        }

        @Override // p000.dj3
        /* JADX INFO: renamed from: h */
        public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            C20271 c20271 = new C20271(this.f25504f, (Continuation) obj6);
            c20271.f25499a = (List) obj;
            c20271.f25500b = (List) obj2;
            c20271.f25501c = (List) obj3;
            c20271.f25502d = (List) obj4;
            c20271.f25503e = (Map) obj5;
            return c20271.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            LibraryLessonAudioDownload libraryLessonAudioDownload;
            Object next2;
            List list = this.f25499a;
            List list2 = this.f25500b;
            List list3 = this.f25501c;
            List list4 = this.f25502d;
            Map map = this.f25503e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            List<LibraryItem> list5 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list5, 10));
            for (LibraryItem libraryItem : list5) {
                int i = libraryItem.f19426a;
                InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) e65.m10872d(i, map);
                Object obj2 = null;
                if (interfaceC3055gy instanceof C2907cy) {
                    libraryLessonAudioDownload = new LibraryLessonAudioDownload(i, Math.max(1, ((C2907cy) interfaceC3055gy).f34700c), false);
                } else if (interfaceC3055gy instanceof C2981ey) {
                    libraryLessonAudioDownload = new LibraryLessonAudioDownload(i, 1, false);
                } else {
                    Iterator it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((LibraryLessonAudioDownload) next).f19475a != i);
                    libraryLessonAudioDownload = (LibraryLessonAudioDownload) next;
                }
                LibraryLessonAudioDownload libraryLessonAudioDownload2 = libraryLessonAudioDownload;
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((LibraryItemCounter) next2).f19455a != i);
                LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next2;
                for (Object obj3 : list4) {
                    if (((LibraryItemDownload) obj3).f19472a == i) {
                        obj2 = obj3;
                        break;
                    }
                }
                arrayList.add(new h81(libraryItem, libraryItemCounter, (LibraryItemDownload) obj2, libraryLessonAudioDownload2, "", this.f25504f.f25568a0));
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeMergedLessonData$1$2 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeMergedLessonData$1$2", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20282 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25505a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20282(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25506b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20282 c20282 = new C20282(this.f25506b, continuation);
            c20282.f25505a = obj;
            return c20282;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20282 c20282 = (C20282) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20282.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            boolean z2;
            Object value;
            List list = (List) this.f25505a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LibraryItemCounter libraryItemCounter = ((h81) it.next()).f41931b;
                if (libraryItemCounter != null) {
                    arrayList.add(libraryItemCounter);
                }
            }
            if (arrayList.isEmpty()) {
                z = false;
            } else {
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((LibraryItemCounter) it2.next()).f19460f) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            }
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (((LibraryItemCounter) it3.next()).f19460f) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            C3244l c3244l = this.f25506b.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, list, null, false, false, false, false, false, false, false, false, z, z2, false, false, null, 117755)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeMergedLessonData$1(C2034d c2034d, Continuation continuation) {
        super(2, continuation);
        this.f25498b = c2034d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeMergedLessonData$1(this.f25498b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeMergedLessonData$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25497a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2034d c2034d = this.f25498b;
            n83 n83VarM15530i = AbstractC3224d.m15530i(c2034d.f25562U, c2034d.f25563V, c2034d.f25564W, c2034d.f25565X, c2034d.f25566Y, new C20271(c2034d, null));
            C20282 c20282 = new C20282(c2034d, null);
            this.f25497a = 1;
            if (AbstractC3224d.m15529h(n83VarM15530i, c20282, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
