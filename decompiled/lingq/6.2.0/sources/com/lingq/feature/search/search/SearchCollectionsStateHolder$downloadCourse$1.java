package com.lingq.feature.search.search;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.Sort;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c23;
import p000.c32;
import p000.r23;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1", m4291f = "SearchCollectionsStateHolder.kt", m4292l = {366, 373, 376, 383, 384, 389}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchCollectionsStateHolder$downloadCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f32927a;

    /* JADX INFO: renamed from: b */
    public int f32928b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2775b f32929c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f32930d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchCollectionsStateHolder$downloadCourse$1(C2775b c2775b, int i, Continuation continuation) {
        super(1, continuation);
        this.f32929c = c2775b;
        this.f32930d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchCollectionsStateHolder$downloadCourse$1(this.f32929c, this.f32930d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchCollectionsStateHolder$downloadCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[PHI: r10 r13
      0x006a: PHI (r10v3 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1) = 
      (r10v1 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1)
      (r10v6 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1)
     binds: [B:23:0x0067, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x006a: PHI (r13v4 java.lang.Object) = (r13v3 java.lang.Object), (r13v0 java.lang.Object) binds: [B:23:0x0067, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0072 A[Catch: Exception -> 0x00be, TRY_ENTER, TryCatch #0 {Exception -> 0x00be, blocks: (B:8:0x001a, B:11:0x0020, B:36:0x00a8, B:12:0x0026, B:30:0x008f, B:32:0x0097, B:27:0x0072), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f A[Catch: Exception -> 0x00be, PHI: r10 r13
      0x008f: PHI (r10v7 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1) = 
      (r10v5 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1)
      (r10v8 com.lingq.feature.search.search.SearchCollectionsStateHolder$downloadCourse$1)
     binds: [B:28:0x008c, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x008f: PHI (r13v9 java.lang.Object) = (r13v8 java.lang.Object), (r13v0 java.lang.Object) binds: [B:28:0x008c, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00be, blocks: (B:8:0x001a, B:11:0x0020, B:36:0x00a8, B:12:0x0026, B:30:0x008f, B:32:0x0097, B:27:0x0072), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0097 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:8:0x001a, B:11:0x0020, B:36:0x00a8, B:12:0x0026, B:30:0x008f, B:32:0x0097, B:27:0x0072), top: B:44:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SearchCollectionsStateHolder$downloadCourse$1 searchCollectionsStateHolder$downloadCourse$1;
        List list;
        SearchCollectionsStateHolder$downloadCourse$1 searchCollectionsStateHolder$downloadCourse$2;
        int iIntValue;
        int i;
        C2775b c2775b = this.f32929c;
        r23 r23Var = c2775b.f33071g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f32928b;
        xfa xfaVar = xfa.f68157a;
        int i3 = this.f32930d;
        try {
            switch (i2) {
                case 0:
                    AbstractC3193b.m15359b(obj);
                    c23 c23Var = c2775b.f33070f;
                    String str = c2775b.f33086v.f72109a;
                    String value = LibraryItemType.Collection.getValue();
                    this.f32928b = 1;
                    searchCollectionsStateHolder$downloadCourse$1 = this;
                    Object objM7322q = ((C1296l) c23Var.f9349a).m7322q(this.f32930d, str, value, searchCollectionsStateHolder$downloadCourse$1, false);
                    if (objM7322q != coroutineSingletons) {
                        objM7322q = xfaVar;
                    }
                    if (objM7322q != coroutineSingletons) {
                        searchCollectionsStateHolder$downloadCourse$1.f32928b = 2;
                        obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$1);
                        if (obj != coroutineSingletons) {
                            list = (List) obj;
                            if (list.isEmpty()) {
                                c23 c23Var2 = c2775b.f33072h;
                                String str2 = c2775b.f33086v.f72109a;
                                int i4 = searchCollectionsStateHolder$downloadCourse$1.f32930d;
                                Sort sort = Sort.Position;
                                SearchCollectionsStateHolder$downloadCourse$1 searchCollectionsStateHolder$downloadCourse$3 = searchCollectionsStateHolder$downloadCourse$1;
                                EmptyList emptyList = EmptyList.f47638a;
                                searchCollectionsStateHolder$downloadCourse$3.f32928b = 3;
                                obj = ((C1296l) c23Var2.f9349a).m7309d(str2, i4, sort, emptyList, searchCollectionsStateHolder$downloadCourse$3);
                                searchCollectionsStateHolder$downloadCourse$2 = searchCollectionsStateHolder$downloadCourse$3;
                                if (obj != coroutineSingletons) {
                                    iIntValue = ((Number) obj).intValue();
                                    if (iIntValue > 0) {
                                        searchCollectionsStateHolder$downloadCourse$2.f32927a = iIntValue;
                                        searchCollectionsStateHolder$downloadCourse$2.f32928b = 4;
                                        obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$2);
                                        if (obj == coroutineSingletons) {
                                            i = iIntValue;
                                            searchCollectionsStateHolder$downloadCourse$2.f32927a = i;
                                            searchCollectionsStateHolder$downloadCourse$2.f32928b = 5;
                                            C2775b.m9698a(c2775b, i3, (List) obj);
                                            if (xfaVar == coroutineSingletons) {
                                            }
                                        }
                                    }
                                    return xfaVar;
                                }
                            } else {
                                searchCollectionsStateHolder$downloadCourse$1.f32928b = 6;
                                C2775b.m9698a(c2775b, i3, list);
                                if (xfaVar != coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    AbstractC3193b.m15359b(obj);
                    searchCollectionsStateHolder$downloadCourse$1 = this;
                    searchCollectionsStateHolder$downloadCourse$1.f32928b = 2;
                    obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$1);
                    if (obj != coroutineSingletons) {
                        list = (List) obj;
                        if (list.isEmpty()) {
                            c23 c23Var3 = c2775b.f33072h;
                            String str3 = c2775b.f33086v.f72109a;
                            int i5 = searchCollectionsStateHolder$downloadCourse$1.f32930d;
                            Sort sort2 = Sort.Position;
                            SearchCollectionsStateHolder$downloadCourse$1 searchCollectionsStateHolder$downloadCourse$4 = searchCollectionsStateHolder$downloadCourse$1;
                            EmptyList emptyList2 = EmptyList.f47638a;
                            searchCollectionsStateHolder$downloadCourse$4.f32928b = 3;
                            obj = ((C1296l) c23Var3.f9349a).m7309d(str3, i5, sort2, emptyList2, searchCollectionsStateHolder$downloadCourse$4);
                            searchCollectionsStateHolder$downloadCourse$2 = searchCollectionsStateHolder$downloadCourse$4;
                            if (obj != coroutineSingletons) {
                                iIntValue = ((Number) obj).intValue();
                                if (iIntValue > 0) {
                                    searchCollectionsStateHolder$downloadCourse$2.f32927a = iIntValue;
                                    searchCollectionsStateHolder$downloadCourse$2.f32928b = 4;
                                    obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$2);
                                    if (obj == coroutineSingletons) {
                                        i = iIntValue;
                                        searchCollectionsStateHolder$downloadCourse$2.f32927a = i;
                                        searchCollectionsStateHolder$downloadCourse$2.f32928b = 5;
                                        C2775b.m9698a(c2775b, i3, (List) obj);
                                        if (xfaVar == coroutineSingletons) {
                                        }
                                    }
                                }
                                return xfaVar;
                            }
                        } else {
                            searchCollectionsStateHolder$downloadCourse$1.f32928b = 6;
                            C2775b.m9698a(c2775b, i3, list);
                            if (xfaVar != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    AbstractC3193b.m15359b(obj);
                    searchCollectionsStateHolder$downloadCourse$1 = this;
                    list = (List) obj;
                    if (list.isEmpty()) {
                        c23 c23Var4 = c2775b.f33072h;
                        String str4 = c2775b.f33086v.f72109a;
                        int i6 = searchCollectionsStateHolder$downloadCourse$1.f32930d;
                        Sort sort3 = Sort.Position;
                        SearchCollectionsStateHolder$downloadCourse$1 searchCollectionsStateHolder$downloadCourse$5 = searchCollectionsStateHolder$downloadCourse$1;
                        EmptyList emptyList3 = EmptyList.f47638a;
                        searchCollectionsStateHolder$downloadCourse$5.f32928b = 3;
                        obj = ((C1296l) c23Var4.f9349a).m7309d(str4, i6, sort3, emptyList3, searchCollectionsStateHolder$downloadCourse$5);
                        searchCollectionsStateHolder$downloadCourse$2 = searchCollectionsStateHolder$downloadCourse$5;
                        if (obj != coroutineSingletons) {
                            iIntValue = ((Number) obj).intValue();
                            if (iIntValue > 0) {
                                searchCollectionsStateHolder$downloadCourse$2.f32927a = iIntValue;
                                searchCollectionsStateHolder$downloadCourse$2.f32928b = 4;
                                obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$2);
                                if (obj == coroutineSingletons) {
                                    i = iIntValue;
                                    searchCollectionsStateHolder$downloadCourse$2.f32927a = i;
                                    searchCollectionsStateHolder$downloadCourse$2.f32928b = 5;
                                    C2775b.m9698a(c2775b, i3, (List) obj);
                                    if (xfaVar == coroutineSingletons) {
                                    }
                                }
                            }
                            return xfaVar;
                        }
                    } else {
                        searchCollectionsStateHolder$downloadCourse$1.f32928b = 6;
                        C2775b.m9698a(c2775b, i3, list);
                        if (xfaVar != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    AbstractC3193b.m15359b(obj);
                    searchCollectionsStateHolder$downloadCourse$2 = this;
                    iIntValue = ((Number) obj).intValue();
                    if (iIntValue > 0) {
                        searchCollectionsStateHolder$downloadCourse$2.f32927a = iIntValue;
                        searchCollectionsStateHolder$downloadCourse$2.f32928b = 4;
                        obj = ((C1296l) r23Var.f58517a).m7312g(i3, searchCollectionsStateHolder$downloadCourse$2);
                        if (obj == coroutineSingletons) {
                            i = iIntValue;
                            searchCollectionsStateHolder$downloadCourse$2.f32927a = i;
                            searchCollectionsStateHolder$downloadCourse$2.f32928b = 5;
                            C2775b.m9698a(c2775b, i3, (List) obj);
                            if (xfaVar == coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return xfaVar;
                case 4:
                    i = this.f32927a;
                    AbstractC3193b.m15359b(obj);
                    searchCollectionsStateHolder$downloadCourse$2 = this;
                    searchCollectionsStateHolder$downloadCourse$2.f32927a = i;
                    searchCollectionsStateHolder$downloadCourse$2.f32928b = 5;
                    C2775b.m9698a(c2775b, i3, (List) obj);
                    if (xfaVar == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return xfaVar;
                case 5:
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                case 6:
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Exception unused) {
        }
    }
}
