package com.lingq.feature.library;

import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.LibraryPlacement;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.a69;
import p000.a95;
import p000.aj3;
import p000.am4;
import p000.b95;
import p000.c32;
import p000.c95;
import p000.d95;
import p000.e83;
import p000.e85;
import p000.e95;
import p000.f95;
import p000.fa4;
import p000.g95;
import p000.gcd;
import p000.ja5;
import p000.je2;
import p000.ux5;
import p000.vz1;
import p000.xfa;
import p000.y59;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$combine$1$3", m4291f = "LibraryUpdateViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class LibraryUpdateViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26591a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26592b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f26593c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2146e f26594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateViewModel$special$$inlined$combine$1$3(C2146e c2146e, Continuation continuation) {
        super(3, continuation);
        this.f26594d = c2146e;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LibraryUpdateViewModel$special$$inlined$combine$1$3 libraryUpdateViewModel$special$$inlined$combine$1$3 = new LibraryUpdateViewModel$special$$inlined$combine$1$3(this.f26594d, (Continuation) obj3);
        libraryUpdateViewModel$special$$inlined$combine$1$3.f26592b = (e83) obj;
        libraryUpdateViewModel$special$$inlined$combine$1$3.f26593c = (Object[]) obj2;
        return libraryUpdateViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:77:0x018d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapM15370W;
        Pair pair;
        ?? arrayList;
        ?? arrayList2;
        e85 e85Var;
        ja5 ja5Var;
        float f;
        float f2;
        char c;
        e83 e83Var = this.f26592b;
        Object[] objArr = this.f26593c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26591a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = objArr[0];
            obj2.getClass();
            Language language = (Language) obj2;
            Object obj3 = objArr[1];
            Map map = obj3 instanceof Map ? (Map) obj3 : null;
            if (map == null) {
                mapM15370W = AbstractC3194a.m15360M();
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        if (!(value instanceof y59)) {
                            value = null;
                        }
                        y59 y59Var = (y59) value;
                        if (y59Var == null) {
                            pair = null;
                        } else {
                            pair = new Pair(str, y59Var);
                        }
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                mapM15370W = AbstractC3194a.m15370W(arrayList3);
            }
            Object obj4 = objArr[2];
            obj4.getClass();
            f95 f95Var = (f95) obj4;
            g95 g95Var = (g95) objArr[3];
            Object obj5 = objArr[4];
            Object obj6 = objArr[5];
            List list = obj6 instanceof List ? (List) obj6 : null;
            EmptyList emptyList = EmptyList.f47638a;
            if (list == null) {
                arrayList = emptyList;
            } else {
                arrayList = new ArrayList();
                for (Object obj7 : list) {
                    if (!(obj7 instanceof EmbeddedMessage)) {
                        obj7 = null;
                    }
                    EmbeddedMessage embeddedMessage = (EmbeddedMessage) obj7;
                    if (embeddedMessage != null) {
                        arrayList.add(embeddedMessage);
                    }
                }
            }
            Object obj8 = objArr[6];
            obj8.getClass();
            boolean zBooleanValue = ((Boolean) obj8).booleanValue();
            Object obj9 = objArr[7];
            obj9.getClass();
            boolean zBooleanValue2 = ((Boolean) obj9).booleanValue();
            Object obj10 = objArr[8];
            obj10.getClass();
            boolean zBooleanValue3 = ((Boolean) obj10).booleanValue();
            Object obj11 = objArr[9];
            obj11.getClass();
            String str2 = (String) obj11;
            Object obj12 = objArr[10];
            List list2 = obj12 instanceof List ? (List) obj12 : null;
            if (list2 == null) {
                arrayList2 = emptyList;
            } else {
                arrayList2 = new ArrayList();
                for (Object obj13 : list2) {
                    if (!(obj13 instanceof LibraryShelf)) {
                        obj13 = null;
                    }
                    LibraryShelf libraryShelf = (LibraryShelf) obj13;
                    if (libraryShelf != null) {
                        arrayList2.add(libraryShelf);
                    }
                }
            }
            Object obj14 = objArr[11];
            obj14.getClass();
            je2 je2Var = (je2) obj14;
            e85 e85Var2 = (e85) objArr[12];
            C2146e c2146e = this.f26594d;
            ja5 ja5Var2 = (ja5) c2146e.f26658G.getValue();
            am4 am4Var = new am4(language.f19024a);
            ArrayList arrayList4 = new ArrayList();
            if (e85Var2 == null) {
                e85Var = e85Var2;
                ja5Var = ja5Var2;
                f = 16.0f;
            } else {
                e85 e85Var3 = (!e85Var2.m10919b().f67228d || e85Var2.m10920c()) ? null : e85Var2;
                if (e85Var3 != null) {
                    e85Var = e85Var2;
                    ja5Var = ja5Var2;
                    e85 e85Var4 = e85Var3;
                    f = 16.0f;
                    arrayList4.add(new e95("spacer_pre_cup_banner", 16.0f));
                    arrayList4.add(new a95(e85Var4.m10919b()));
                    if (g95Var == null) {
                        arrayList4.add(new e95("spacer_post_cup_banner", 16.0f));
                    }
                } else {
                    e85Var = e85Var2;
                    ja5Var = ja5Var2;
                    f = 16.0f;
                }
            }
            if (g95Var != null) {
                arrayList4.add(new e95("spacer_pre_banner", f));
                arrayList4.add(g95Var);
                arrayList4.add(new e95("spacer_post_banner", f));
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList5 = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Iterator it2 = it;
                if (gcd.m12482b(((EmbeddedMessage) next).m7035b()) == LibraryPlacement.Top) {
                    arrayList5.add(next);
                }
                it = it2;
            }
            if (arrayList5.isEmpty()) {
                arrayList5 = null;
            }
            if (arrayList5 != null) {
                arrayList4.add(new e95("spacer_pre_embed_top", 8.0f));
                arrayList4.add(new b95(arrayList5));
                f2 = 16.0f;
                arrayList4.add(new e95("spacer_post_embed_top", 16.0f));
            } else {
                f2 = 16.0f;
            }
            arrayList4.add(f95Var);
            if (zBooleanValue) {
                arrayList4.add(new e95("spacer_post_stats", f2));
            } else {
                arrayList4.add(new e95("spacer_pre_offline", f2));
                arrayList4.add(c95.f9761b);
                arrayList4.add(new e95("spacer_post_offline", f2));
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj15 : iterable) {
                if (gcd.m12482b(((EmbeddedMessage) obj15).m7035b()) == LibraryPlacement.AboveContinueStudying) {
                    arrayList6.add(obj15);
                }
            }
            if (arrayList6.isEmpty()) {
                arrayList6 = null;
            }
            if (arrayList6 != null) {
                arrayList4.add(new b95(arrayList6));
                arrayList4.add(new e95("spacer_post_embed_above", 24.0f));
            }
            int i2 = 0;
            boolean z = false;
            for (Iterator it3 = ((Iterable) arrayList2).iterator(); it3.hasNext(); it3 = it3) {
                Object next2 = it3.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                LibraryShelf libraryShelf2 = (LibraryShelf) next2;
                y59 y59Var2 = (y59) mapM15370W.get(AbstractC3423or.m18219D(libraryShelf2));
                if (y59Var2 == null) {
                    y59Var2 = new y59(emptyList, a69.f298a);
                }
                arrayList4.add(new d95(libraryShelf2, y59Var2));
                arrayList4.add(new e95(ux5.m22988k(i2, "spacer_post_shelf_"), 16.0f));
                if (!fa4.m11650l(libraryShelf2.f19496d, LibraryShelfType.MyLessons.getValue()) || z) {
                    c = 0;
                } else {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj16 : iterable) {
                        if (gcd.m12482b(((EmbeddedMessage) obj16).m7035b()) == LibraryPlacement.BelowContinueStudying) {
                            arrayList7.add(obj16);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        arrayList7 = null;
                    }
                    if (arrayList7 != null) {
                        arrayList4.add(new b95(arrayList7));
                        c = 0;
                        arrayList4.add(new e95("spacer_post_embed_below", 24.0f));
                    } else {
                        c = 0;
                    }
                    z = true;
                }
                i2 = i3;
            }
            ja5 ja5VarM14361a = ja5.m14361a(ja5Var, am4Var, arrayList4, zBooleanValue2, str2, zBooleanValue3, je2Var, null, null, false, c2146e.f26657F.m17896j(), e85Var != null && (e85Var.m10920c() || !e85Var.m10919b().f67228d), 448);
            this.f26592b = null;
            this.f26593c = null;
            this.f26591a = 1;
            if (e83Var.emit(ja5VarM14361a, this) == coroutineSingletons) {
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
