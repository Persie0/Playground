package com.lingq.feature.search.search;

import com.lingq.core.domain.model.library.LibrarySearchQuery;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.ar8;
import p000.c32;
import p000.s23;
import p000.un1;
import p000.xfa;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$fetchLibraryItemsNetwork$1", m4291f = "SearchViewModel.kt", m4292l = {645}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$fetchLibraryItemsNetwork$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33003a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2779e f33004b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33005c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f33006d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f33007e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f33008f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f33009g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibrarySearchQuery f33010h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f33011i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f33012j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$fetchLibraryItemsNetwork$1(C2779e c2779e, String str, String str2, String str3, String str4, String str5, LibrarySearchQuery librarySearchQuery, int i, long j, Continuation continuation) {
        super(2, continuation);
        this.f33004b = c2779e;
        this.f33005c = str;
        this.f33006d = str2;
        this.f33007e = str3;
        this.f33008f = str4;
        this.f33009g = str5;
        this.f33010h = librarySearchQuery;
        this.f33011i = i;
        this.f33012j = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SearchViewModel$fetchLibraryItemsNetwork$1(this.f33004b, this.f33005c, this.f33006d, this.f33007e, this.f33008f, this.f33009g, this.f33010h, this.f33011i, this.f33012j, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SearchViewModel$fetchLibraryItemsNetwork$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00e5 A[LOOP:1: B:56:0x00e5->B:79:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10, types: [long] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v2, types: [long] */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [kotlinx.coroutines.flow.l] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [int] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v0, types: [long] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v3 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ?? r17;
        ?? r20;
        Object value;
        ar8 ar8Var;
        int i;
        ?? r29;
        Object objM24995a;
        Object value2;
        ar8 ar8Var2;
        C2779e c2779e = this.f33004b;
        C3244l c3244l = c2779e.f33114v;
        ?? r13 = c2779e.f33117y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f33003a;
        int i3 = this.f33011i;
        ?? r2 = this.f33012j;
        xfa xfaVar = xfa.f68157a;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                s23 s23Var = c2779e.f33100h;
                String str = this.f33005c;
                try {
                    String str2 = this.f33006d;
                    String str3 = this.f33007e;
                    try {
                        String str4 = this.f33008f;
                        try {
                            String str5 = this.f33009g;
                            r17 = r2;
                            try {
                                LibrarySearchQuery librarySearchQuery = this.f33010h;
                                int i4 = this.f33011i;
                                this.f33003a = 1;
                                z = false;
                                r20 = r13;
                                r13 = 1;
                                try {
                                    objM24995a = y95.m24995a(s23Var.f60177a, str, str2, str3, false, null, str4, str5, librarySearchQuery, i4, this, 16);
                                    r2 = str2;
                                    r13 = r13;
                                    r17 = r17;
                                    r20 = r20;
                                    if (objM24995a == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (r17 == ((Number) r20.getValue()).longValue()) {
                                        do {
                                            value = c3244l.getValue();
                                            ar8Var = (ar8) value;
                                            i = i3 - 1;
                                            if (i < r13) {
                                                r29 = r13;
                                            } else {
                                                r29 = i;
                                            }
                                        } while (!c3244l.m15570h(value, ar8.m3015a(ar8Var, null, null, null, null, null, null, null, false, false, false, true, r29, null, null, null, null, 62079)));
                                        e.printStackTrace();
                                        return xfaVar;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                r20 = r13;
                                r13 = z;
                                if (r17 == ((Number) r20.getValue()).longValue()) {
                                    do {
                                        value = c3244l.getValue();
                                        ar8Var = (ar8) value;
                                        i = i3 - 1;
                                        if (i < r13) {
                                            r29 = r13;
                                        } else {
                                            r29 = i;
                                        }
                                    } while (!c3244l.m15570h(value, ar8.m3015a(ar8Var, null, null, null, null, null, null, null, false, false, false, true, r29, null, null, null, null, 62079)));
                                    e.printStackTrace();
                                    return xfaVar;
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r17 = r2;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r17 = r2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    r17 = r2;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM24995a = obj;
                r17 = r2;
                r20 = r13;
                r13 = 1;
                r2 = r2;
            }
            int iIntValue = ((Number) objM24995a).intValue();
            if (r17 == ((Number) r20.getValue()).longValue()) {
                do {
                    value2 = c3244l.getValue();
                    ar8Var2 = (ar8) value2;
                } while (!c3244l.m15570h(value2, ar8.m3015a(ar8Var2, null, null, null, null, null, null, null, iIntValue >= 20 ? ar8Var2.f7396h : false, false, (iIntValue == 0 && i3 == r13) ? r13 : 0, iIntValue < 20 ? false : ar8Var2.f7399k, 0, null, null, null, null, 63615)));
            }
        } catch (Exception e6) {
            e = e6;
            r17 = r2;
        }
        return xfaVar;
    }
}
