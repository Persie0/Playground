package com.lingq.core.domain.playlist;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.e83;
import p000.ql4;
import p000.xd7;
import p000.xfa;
import p000.xo1;
import p000.y95;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.FetchPlaylistLessonsUseCase$invoke$1", m4291f = "FetchPlaylistLessonsUseCase.kt", m4292l = {20, 21, 26, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 32}, m4293m = "invokeSuspend", m4294v = 2)
final class FetchPlaylistLessonsUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public List f19892a;

    /* JADX INFO: renamed from: b */
    public int f19893b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f19894c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1520c f19895d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f19896e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f19897f;

    /* JADX INFO: renamed from: com.lingq.core.domain.playlist.FetchPlaylistLessonsUseCase$invoke$1$1 */
    @c32(m4290c = "com.lingq.core.domain.playlist.FetchPlaylistLessonsUseCase$invoke$1$1", m4291f = "FetchPlaylistLessonsUseCase.kt", m4292l = {34, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
    final class C15171 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public C1520c f19898a;

        /* JADX INFO: renamed from: b */
        public Iterator f19899b;

        /* JADX INFO: renamed from: c */
        public int f19900c;

        /* JADX INFO: renamed from: d */
        public int f19901d;

        /* JADX INFO: renamed from: e */
        public int f19902e;

        /* JADX INFO: renamed from: f */
        public int f19903f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object f19904g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C1520c f19905h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15171(C1520c c1520c, Continuation continuation) {
            super(2, continuation);
            this.f19905h = c1520c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C15171 c15171 = new C15171(this.f19905h, continuation);
            c15171.f19904g = obj;
            return c15171;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C15171) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0035 A[PHI: r0 r2 r8 r9 r10 r15
          0x0035: PHI (r0v4 int) = (r0v6 int), (r0v13 int) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r2v1 int) = (r2v3 int), (r2v8 int) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r8v1 int) = (r8v3 int), (r8v7 int) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r9v1 java.util.Iterator) = (r9v2 java.util.Iterator), (r9v6 java.util.Iterator) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r10v1 com.lingq.core.domain.playlist.c) = (r10v2 com.lingq.core.domain.playlist.c), (r10v6 com.lingq.core.domain.playlist.c) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]
          0x0035: PHI (r15v2 java.lang.Object) = (r15v7 java.lang.Object), (r15v0 java.lang.Object) binds: [B:22:0x00a4, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:20:0x0086  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c8  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00c5, code lost:
        
            if (((com.lingq.core.data.repository.C1296l) r11).m7311f(r12, (java.util.List) r15, r14) == r1) goto L26;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c5 -> B:8:0x0020). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Iterator it;
            C1520c c1520c;
            int i;
            int i2;
            int i3;
            int i4;
            int iIntValue;
            xo1 xo1Var;
            String strMo4589b2;
            List list = (List) this.f19904g;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f19903f;
            if (i5 == 0) {
                AbstractC3193b.m15359b(obj);
                it = list.iterator();
                c1520c = this.f19905h;
                i = 0;
                if (it.hasNext()) {
                    return xfa.f68157a;
                }
                iIntValue = ((Number) it.next()).intValue();
                xo1Var = c1520c.f19940c;
                strMo4589b2 = c1520c.f19938a.mo4589b2();
                this.f19904g = null;
                this.f19898a = c1520c;
                this.f19899b = it;
                this.f19900c = i;
                this.f19901d = iIntValue;
                this.f19902e = 0;
                this.f19903f = 1;
                if (((C1290f) xo1Var).m7179c(iIntValue, strMo4589b2, this) != coroutineSingletons) {
                    i2 = iIntValue;
                    i3 = 0;
                    xd7 xd7Var = c1520c.f19939b;
                    String strMo4589b3 = c1520c.f19938a.mo4589b2();
                    this.f19904g = null;
                    this.f19898a = c1520c;
                    this.f19899b = it;
                    this.f19900c = i;
                    this.f19901d = i2;
                    this.f19902e = i3;
                    this.f19903f = 2;
                    obj = ((C1302r) xd7Var).m7352l(i2, strMo4589b3, this);
                    if (obj != coroutineSingletons) {
                        int i6 = i2;
                        int i7 = i3;
                        i4 = i;
                        y95 y95Var = c1520c.f19941d;
                        String strMo4589b4 = c1520c.f19938a.mo4589b2();
                        this.f19904g = null;
                        this.f19898a = c1520c;
                        this.f19899b = it;
                        this.f19900c = i4;
                        this.f19901d = i6;
                        this.f19902e = i7;
                        this.f19903f = 3;
                    }
                }
                return coroutineSingletons;
            }
            if (i5 == 1) {
                i3 = this.f19902e;
                i2 = this.f19901d;
                i = this.f19900c;
                it = this.f19899b;
                c1520c = this.f19898a;
                AbstractC3193b.m15359b(obj);
                xd7 xd7Var2 = c1520c.f19939b;
                String strMo4589b5 = c1520c.f19938a.mo4589b2();
                this.f19904g = null;
                this.f19898a = c1520c;
                this.f19899b = it;
                this.f19900c = i;
                this.f19901d = i2;
                this.f19902e = i3;
                this.f19903f = 2;
                obj = ((C1302r) xd7Var2).m7352l(i2, strMo4589b5, this);
                if (obj != coroutineSingletons) {
                    int i8 = i2;
                    int i9 = i3;
                    i4 = i;
                    y95 y95Var2 = c1520c.f19941d;
                    String strMo4589b6 = c1520c.f19938a.mo4589b2();
                    this.f19904g = null;
                    this.f19898a = c1520c;
                    this.f19899b = it;
                    this.f19900c = i4;
                    this.f19901d = i8;
                    this.f19902e = i9;
                    this.f19903f = 3;
                }
                return coroutineSingletons;
            }
            if (i5 == 2) {
                i3 = this.f19902e;
                i2 = this.f19901d;
                i = this.f19900c;
                it = this.f19899b;
                c1520c = this.f19898a;
                AbstractC3193b.m15359b(obj);
                int i10 = i2;
                int i11 = i3;
                i4 = i;
                y95 y95Var3 = c1520c.f19941d;
                String strMo4589b7 = c1520c.f19938a.mo4589b2();
                this.f19904g = null;
                this.f19898a = c1520c;
                this.f19899b = it;
                this.f19900c = i4;
                this.f19901d = i10;
                this.f19902e = i11;
                this.f19903f = 3;
            } else {
                if (i5 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i4 = this.f19900c;
                Iterator it2 = this.f19899b;
                C1520c c1520c2 = this.f19898a;
                AbstractC3193b.m15359b(obj);
                it = it2;
                c1520c = c1520c2;
            }
            i = i4;
            if (it.hasNext()) {
                return xfa.f68157a;
            }
            iIntValue = ((Number) it.next()).intValue();
            xo1Var = c1520c.f19940c;
            strMo4589b2 = c1520c.f19938a.mo4589b2();
            this.f19904g = null;
            this.f19898a = c1520c;
            this.f19899b = it;
            this.f19900c = i;
            this.f19901d = iIntValue;
            this.f19902e = 0;
            this.f19903f = 1;
            if (((C1290f) xo1Var).m7179c(iIntValue, strMo4589b2, this) != coroutineSingletons) {
                i2 = iIntValue;
                i3 = 0;
                xd7 xd7Var3 = c1520c.f19939b;
                String strMo4589b8 = c1520c.f19938a.mo4589b2();
                this.f19904g = null;
                this.f19898a = c1520c;
                this.f19899b = it;
                this.f19900c = i;
                this.f19901d = i2;
                this.f19902e = i3;
                this.f19903f = 2;
                obj = ((C1302r) xd7Var3).m7352l(i2, strMo4589b8, this);
                if (obj != coroutineSingletons) {
                    int i12 = i2;
                    int i13 = i3;
                    i4 = i;
                    y95 y95Var4 = c1520c.f19941d;
                    String strMo4589b9 = c1520c.f19938a.mo4589b2();
                    this.f19904g = null;
                    this.f19898a = c1520c;
                    this.f19899b = it;
                    this.f19900c = i4;
                    this.f19901d = i12;
                    this.f19902e = i13;
                    this.f19903f = 3;
                }
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchPlaylistLessonsUseCase$invoke$1(C1520c c1520c, int i, String str, Continuation continuation) {
        super(2, continuation);
        this.f19895d = c1520c;
        this.f19896e = i;
        this.f19897f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FetchPlaylistLessonsUseCase$invoke$1 fetchPlaylistLessonsUseCase$invoke$1 = new FetchPlaylistLessonsUseCase$invoke$1(this.f19895d, this.f19896e, this.f19897f, continuation);
        fetchPlaylistLessonsUseCase$invoke$1.f19894c = obj;
        return fetchPlaylistLessonsUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((FetchPlaylistLessonsUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r14, r1, r13) == r4) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Integer num;
        List list2;
        y95 y95Var;
        String strMo4589b2;
        C1520c c1520c = this.f19895d;
        cma cmaVar = c1520c.f19938a;
        xd7 xd7Var = c1520c.f19939b;
        e83 e83Var = (e83) this.f19894c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19893b;
        String str = this.f19897f;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String strMo4589b3 = cmaVar.mo4589b2();
            this.f19894c = e83Var;
            this.f19893b = 1;
            if (((C1302r) xd7Var).m7354n(strMo4589b3, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                list = (List) obj;
                num = new Integer(list.size());
                this.f19894c = null;
                this.f19892a = list;
                this.f19893b = 3;
                if (e83Var.emit(num, this) != coroutineSingletons) {
                    list2 = list;
                    y95Var = c1520c.f19941d;
                    strMo4589b2 = cmaVar.mo4589b2();
                    this.f19894c = null;
                    this.f19892a = null;
                    this.f19893b = 4;
                    if (((C1296l) y95Var).m7311f(strMo4589b2, list2, this) != coroutineSingletons) {
                        C1302r c1302r = (C1302r) xd7Var;
                        c1302r.getClass();
                        str.getClass();
                        C1322j c1322j = c1302r.f16534c;
                        c1322j.getClass();
                        c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, true, new String[]{"PlaylistAndLessonsJoin"}, new ql4(str, 11)));
                        C15171 c15171 = new C15171(c1520c, null);
                        this.f19894c = null;
                        this.f19892a = null;
                        this.f19893b = 5;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                list2 = this.f19892a;
                AbstractC3193b.m15359b(obj);
                y95Var = c1520c.f19941d;
                strMo4589b2 = cmaVar.mo4589b2();
                this.f19894c = null;
                this.f19892a = null;
                this.f19893b = 4;
                if (((C1296l) y95Var).m7311f(strMo4589b2, list2, this) != coroutineSingletons) {
                    C1302r c1302r2 = (C1302r) xd7Var;
                    c1302r2.getClass();
                    str.getClass();
                    C1322j c1322j2 = c1302r2.f16534c;
                    c1322j2.getClass();
                    c83 c83VarM15536o2 = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j2.f17045K, true, new String[]{"PlaylistAndLessonsJoin"}, new ql4(str, 11)));
                    C15171 c15172 = new C15171(c1520c, null);
                    this.f19894c = null;
                    this.f19892a = null;
                    this.f19893b = 5;
                }
                return coroutineSingletons;
            }
            if (i == 4) {
                List list3 = this.f19892a;
                AbstractC3193b.m15359b(obj);
                C1302r c1302r3 = (C1302r) xd7Var;
                c1302r3.getClass();
                str.getClass();
                C1322j c1322j3 = c1302r3.f16534c;
                c1322j3.getClass();
                c83 c83VarM15536o3 = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j3.f17045K, true, new String[]{"PlaylistAndLessonsJoin"}, new ql4(str, 11)));
                C15171 c15173 = new C15171(c1520c, null);
                this.f19894c = null;
                this.f19892a = null;
                this.f19893b = 5;
            } else {
                if (i != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list4 = this.f19892a;
                AbstractC3193b.m15359b(obj);
            }
        }
        return xfa.f68157a;
        String strMo4589b4 = cmaVar.mo4589b2();
        this.f19894c = e83Var;
        this.f19893b = 2;
        obj = ((C1302r) xd7Var).m7353m(this.f19896e, strMo4589b4, str, this);
        if (obj != coroutineSingletons) {
            list = (List) obj;
            num = new Integer(list.size());
            this.f19894c = null;
            this.f19892a = list;
            this.f19893b = 3;
            if (e83Var.emit(num, this) != coroutineSingletons) {
                list2 = list;
                y95Var = c1520c.f19941d;
                strMo4589b2 = cmaVar.mo4589b2();
                this.f19894c = null;
                this.f19892a = null;
                this.f19893b = 4;
                if (((C1296l) y95Var).m7311f(strMo4589b2, list2, this) != coroutineSingletons) {
                    C1302r c1302r4 = (C1302r) xd7Var;
                    c1302r4.getClass();
                    str.getClass();
                    C1322j c1322j4 = c1302r4.f16534c;
                    c1322j4.getClass();
                    c83 c83VarM15536o4 = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j4.f17045K, true, new String[]{"PlaylistAndLessonsJoin"}, new ql4(str, 11)));
                    C15171 c15174 = new C15171(c1520c, null);
                    this.f19894c = null;
                    this.f19892a = null;
                    this.f19893b = 5;
                }
            }
        }
        return coroutineSingletons;
    }
}
