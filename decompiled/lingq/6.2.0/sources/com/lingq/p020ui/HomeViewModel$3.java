package com.lingq.p020ui;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.library.C1386a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.eh9;
import p000.lda;
import p000.qn3;
import p000.si7;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xv7;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel$3", m4291f = "HomeViewModel.kt", m4292l = {140}, m4293m = "invokeSuspend", m4294v = 2)
final class HomeViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2888d f33943b;

    /* JADX INFO: renamed from: com.lingq.ui.HomeViewModel$3$1 */
    @c32(m4290c = "com.lingq.ui.HomeViewModel$3$1", m4291f = "HomeViewModel.kt", m4292l = {147, 153, 157, 158, 160, 165, 168}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28791 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public C2888d f33944a;

        /* JADX INFO: renamed from: b */
        public Language f33945b;

        /* JADX INFO: renamed from: c */
        public int f33946c;

        /* JADX INFO: renamed from: d */
        public int f33947d;

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f33948e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C2888d f33949f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28791(C2888d c2888d, Continuation continuation) {
            super(2, continuation);
            this.f33949f = c2888d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28791 c28791 = new C28791(this.f33949f, continuation);
            c28791.f33948e = obj;
            return c28791;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C28791) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00c9 A[LOOP:0: B:24:0x00c7->B:25:0x00c9, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:33:0x0124 A[PHI: r3 r5 r7 r9
          0x0124: PHI (r3v7 int) = (r3v5 int), (r3v8 int) binds: [B:31:0x0120, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x0124: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v10 java.lang.Object) binds: [B:31:0x0120, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x0124: PHI (r7v9 com.lingq.core.domain.model.language.Language) = (r7v7 com.lingq.core.domain.model.language.Language), (r7v11 com.lingq.core.domain.model.language.Language) binds: [B:31:0x0120, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]
          0x0124: PHI (r9v17 com.lingq.ui.d) = (r9v15 com.lingq.ui.d), (r9v18 com.lingq.ui.d) binds: [B:31:0x0120, B:10:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x0132  */
        /* JADX WARN: Code duplicated, block: B:38:0x014b A[PHI: r3 r5 r7 r9
          0x014b: PHI (r3v9 int) = (r3v7 int), (r3v11 int) binds: [B:36:0x0147, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x014b: PHI (r5v11 java.lang.Object) = (r5v8 java.lang.Object), (r5v16 java.lang.Object) binds: [B:36:0x0147, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x014b: PHI (r7v12 com.lingq.core.domain.model.language.Language) = (r7v9 com.lingq.core.domain.model.language.Language), (r7v14 com.lingq.core.domain.model.language.Language) binds: [B:36:0x0147, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]
          0x014b: PHI (r9v19 com.lingq.ui.d) = (r9v17 com.lingq.ui.d), (r9v20 com.lingq.ui.d) binds: [B:36:0x0147, B:9:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:41:0x017b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0181  */
        /* JADX WARN: Code duplicated, block: B:47:0x01a5  */
        /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
        /* JADX WARN: Code duplicated, block: B:53:0x01b0  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0106, code lost:
        
            if (((com.lingq.core.datastore.C1368a) r6).m7844C(r7, r18) == r2) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x01cb, code lost:
        
            if (r0 == r2) goto L57;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15541t;
            Language language;
            C2888d c2888d;
            int i;
            Language language2;
            C2888d c2888d2;
            List list;
            LinkedHashMap linkedHashMap;
            LearningLevel[] learningLevelArrValues;
            int length;
            int i2;
            Object objM15541t2;
            int i3;
            Object objM15541t3;
            LinkedHashMap linkedHashMapM15372Y;
            si7 si7Var;
            Language language3;
            C2888d c2888d3;
            Object objM7156f;
            int i4;
            Language language4;
            C2888d c2888d4;
            Object objM8000d;
            Language language5 = (Language) this.f33948e;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f33947d;
            xfa xfaVar = xfa.f68157a;
            int i6 = 0;
            switch (i5) {
                case 0:
                    AbstractC3193b.m15359b(obj);
                    C2888d c2888d5 = this.f33949f;
                    c2888d5.f34182q.m8450M(false);
                    wfb.m23926u(lda.m16103C(c2888d5), null, null, new HomeViewModel$initiateSettings$1(c2888d5, null), 3);
                    if (language5 != null) {
                        c83 c83Var = ((C1368a) c2888d5.f34178m).f18407f1;
                        this.f33948e = language5;
                        this.f33944a = c2888d5;
                        this.f33945b = language5;
                        this.f33946c = 0;
                        this.f33947d = 1;
                        objM15541t = AbstractC3224d.m15541t(c83Var, this);
                        if (objM15541t != coroutineSingletons) {
                            language = language5;
                            c2888d = c2888d5;
                            i = 0;
                            if (((Map) objM15541t).get(c2888d.f34167b.mo4589b2()) == null && (list = language5.f19041r) != null) {
                                linkedHashMap = new LinkedHashMap();
                                learningLevelArrValues = LearningLevel.values();
                                length = learningLevelArrValues.length;
                                i2 = 0;
                                while (i6 < length) {
                                    linkedHashMap.put(learningLevelArrValues[i6], Boolean.valueOf(Boolean.parseBoolean((String) list.get(i2))));
                                    i6++;
                                    i2++;
                                }
                                si7 si7Var2 = c2888d.f34178m;
                                Map mapM15364Q = AbstractC3194a.m15364Q(new Pair(c2888d.f34167b.mo4589b2(), linkedHashMap));
                                this.f33948e = language5;
                                this.f33944a = c2888d;
                                this.f33945b = language;
                                this.f33946c = i;
                                this.f33947d = 2;
                            }
                            language2 = language;
                            c2888d2 = c2888d;
                            c83 c83Var2 = ((C1368a) c2888d2.f34178m).f18466z0;
                            this.f33948e = language5;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i;
                            this.f33947d = 3;
                            objM15541t2 = AbstractC3224d.m15541t(c83Var2, this);
                            if (objM15541t2 != coroutineSingletons) {
                                if (((Map) objM15541t2).get(c2888d2.f34167b.mo4589b2()) != null) {
                                    i3 = i;
                                    c2888d2.f34179n.mo8485c2();
                                    qn3 qn3Var = c2888d2.f34180o;
                                    String str = language2.f19024a;
                                    this.f33948e = null;
                                    this.f33944a = c2888d2;
                                    this.f33945b = language2;
                                    this.f33946c = i3;
                                    this.f33947d = 6;
                                    objM7156f = ((C1289e) ((zw0) qn3Var.f57974a)).m7156f(str, this);
                                    if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM7156f = xfaVar;
                                    }
                                    if (objM7156f != coroutineSingletons) {
                                        i4 = i3;
                                        language4 = language2;
                                        c2888d4 = c2888d2;
                                        if (!language4.f19028e) {
                                            C1386a c1386a = c2888d4.f34175j;
                                            String str2 = language4.f19024a;
                                            this.f33948e = null;
                                            this.f33944a = c2888d4;
                                            this.f33945b = language4;
                                            this.f33946c = i4;
                                            this.f33947d = 7;
                                            objM8000d = c1386a.m8000d(str2, this);
                                        }
                                    }
                                } else {
                                    c83 c83Var3 = ((C1368a) c2888d2.f34178m).f18466z0;
                                    this.f33948e = language5;
                                    this.f33944a = c2888d2;
                                    this.f33945b = language2;
                                    this.f33946c = i;
                                    this.f33947d = 4;
                                    objM15541t3 = AbstractC3224d.m15541t(c83Var3, this);
                                    if (objM15541t3 != coroutineSingletons) {
                                        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t3);
                                        String strMo4589b2 = c2888d2.f34167b.mo4589b2();
                                        xv7 xv7Var = ReaderFont.Companion;
                                        String str3 = language5.f19024a;
                                        xv7Var.getClass();
                                        linkedHashMapM15372Y.put(strMo4589b2, xv7.m24710a(str3));
                                        si7Var = c2888d2.f34178m;
                                        this.f33948e = null;
                                        this.f33944a = c2888d2;
                                        this.f33945b = language2;
                                        this.f33946c = i;
                                        this.f33947d = 5;
                                        if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, this) != coroutineSingletons) {
                                            i3 = i;
                                            language3 = language2;
                                            c2888d3 = c2888d2;
                                            language2 = language3;
                                            c2888d2 = c2888d3;
                                            c2888d2.f34179n.mo8485c2();
                                            qn3 qn3Var2 = c2888d2.f34180o;
                                            String str4 = language2.f19024a;
                                            this.f33948e = null;
                                            this.f33944a = c2888d2;
                                            this.f33945b = language2;
                                            this.f33946c = i3;
                                            this.f33947d = 6;
                                            objM7156f = ((C1289e) ((zw0) qn3Var2.f57974a)).m7156f(str4, this);
                                            if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                                objM7156f = xfaVar;
                                            }
                                            if (objM7156f != coroutineSingletons) {
                                                i4 = i3;
                                                language4 = language2;
                                                c2888d4 = c2888d2;
                                                if (!language4.f19028e && c2888d4.f34185t.m17896j()) {
                                                    C1386a c1386a2 = c2888d4.f34175j;
                                                    String str5 = language4.f19024a;
                                                    this.f33948e = null;
                                                    this.f33944a = c2888d4;
                                                    this.f33945b = language4;
                                                    this.f33946c = i4;
                                                    this.f33947d = 7;
                                                    objM8000d = c1386a2.m8000d(str5, this);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return coroutineSingletons;
                    }
                    return xfaVar;
                case 1:
                    i = this.f33946c;
                    Language language6 = this.f33945b;
                    C2888d c2888d6 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    c2888d = c2888d6;
                    language = language6;
                    objM15541t = obj;
                    if (((Map) objM15541t).get(c2888d.f34167b.mo4589b2()) == null) {
                        linkedHashMap = new LinkedHashMap();
                        learningLevelArrValues = LearningLevel.values();
                        length = learningLevelArrValues.length;
                        i2 = 0;
                        while (i6 < length) {
                            linkedHashMap.put(learningLevelArrValues[i6], Boolean.valueOf(Boolean.parseBoolean((String) list.get(i2))));
                            i6++;
                            i2++;
                        }
                        si7 si7Var3 = c2888d.f34178m;
                        Map mapM15364Q2 = AbstractC3194a.m15364Q(new Pair(c2888d.f34167b.mo4589b2(), linkedHashMap));
                        this.f33948e = language5;
                        this.f33944a = c2888d;
                        this.f33945b = language;
                        this.f33946c = i;
                        this.f33947d = 2;
                        break;
                    }
                    language2 = language;
                    c2888d2 = c2888d;
                    c83 c83Var4 = ((C1368a) c2888d2.f34178m).f18466z0;
                    this.f33948e = language5;
                    this.f33944a = c2888d2;
                    this.f33945b = language2;
                    this.f33946c = i;
                    this.f33947d = 3;
                    objM15541t2 = AbstractC3224d.m15541t(c83Var4, this);
                    if (objM15541t2 != coroutineSingletons) {
                        if (((Map) objM15541t2).get(c2888d2.f34167b.mo4589b2()) != null) {
                            c83 c83Var5 = ((C1368a) c2888d2.f34178m).f18466z0;
                            this.f33948e = language5;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i;
                            this.f33947d = 4;
                            objM15541t3 = AbstractC3224d.m15541t(c83Var5, this);
                            if (objM15541t3 != coroutineSingletons) {
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t3);
                                String strMo4589b3 = c2888d2.f34167b.mo4589b2();
                                xv7 xv7Var2 = ReaderFont.Companion;
                                String str6 = language5.f19024a;
                                xv7Var2.getClass();
                                linkedHashMapM15372Y.put(strMo4589b3, xv7.m24710a(str6));
                                si7Var = c2888d2.f34178m;
                                this.f33948e = null;
                                this.f33944a = c2888d2;
                                this.f33945b = language2;
                                this.f33946c = i;
                                this.f33947d = 5;
                                if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, this) != coroutineSingletons) {
                                    i3 = i;
                                    language3 = language2;
                                    c2888d3 = c2888d2;
                                    language2 = language3;
                                    c2888d2 = c2888d3;
                                    c2888d2.f34179n.mo8485c2();
                                    qn3 qn3Var3 = c2888d2.f34180o;
                                    String str7 = language2.f19024a;
                                    this.f33948e = null;
                                    this.f33944a = c2888d2;
                                    this.f33945b = language2;
                                    this.f33946c = i3;
                                    this.f33947d = 6;
                                    objM7156f = ((C1289e) ((zw0) qn3Var3.f57974a)).m7156f(str7, this);
                                    if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM7156f = xfaVar;
                                    }
                                    if (objM7156f != coroutineSingletons) {
                                        i4 = i3;
                                        language4 = language2;
                                        c2888d4 = c2888d2;
                                        if (!language4.f19028e) {
                                            C1386a c1386a3 = c2888d4.f34175j;
                                            String str8 = language4.f19024a;
                                            this.f33948e = null;
                                            this.f33944a = c2888d4;
                                            this.f33945b = language4;
                                            this.f33946c = i4;
                                            this.f33947d = 7;
                                            objM8000d = c1386a3.m8000d(str8, this);
                                            break;
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        } else {
                            i3 = i;
                            c2888d2.f34179n.mo8485c2();
                            qn3 qn3Var4 = c2888d2.f34180o;
                            String str9 = language2.f19024a;
                            this.f33948e = null;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i3;
                            this.f33947d = 6;
                            objM7156f = ((C1289e) ((zw0) qn3Var4.f57974a)).m7156f(str9, this);
                            if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM7156f = xfaVar;
                            }
                            if (objM7156f != coroutineSingletons) {
                                i4 = i3;
                                language4 = language2;
                                c2888d4 = c2888d2;
                                if (!language4.f19028e) {
                                    C1386a c1386a4 = c2888d4.f34175j;
                                    String str10 = language4.f19024a;
                                    this.f33948e = null;
                                    this.f33944a = c2888d4;
                                    this.f33945b = language4;
                                    this.f33946c = i4;
                                    this.f33947d = 7;
                                    objM8000d = c1386a4.m8000d(str10, this);
                                    break;
                                }
                                return xfaVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    i = this.f33946c;
                    language2 = this.f33945b;
                    c2888d2 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    c83 c83Var6 = ((C1368a) c2888d2.f34178m).f18466z0;
                    this.f33948e = language5;
                    this.f33944a = c2888d2;
                    this.f33945b = language2;
                    this.f33946c = i;
                    this.f33947d = 3;
                    objM15541t2 = AbstractC3224d.m15541t(c83Var6, this);
                    if (objM15541t2 != coroutineSingletons) {
                        if (((Map) objM15541t2).get(c2888d2.f34167b.mo4589b2()) != null) {
                            c83 c83Var7 = ((C1368a) c2888d2.f34178m).f18466z0;
                            this.f33948e = language5;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i;
                            this.f33947d = 4;
                            objM15541t3 = AbstractC3224d.m15541t(c83Var7, this);
                            if (objM15541t3 != coroutineSingletons) {
                                linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t3);
                                String strMo4589b4 = c2888d2.f34167b.mo4589b2();
                                xv7 xv7Var3 = ReaderFont.Companion;
                                String str11 = language5.f19024a;
                                xv7Var3.getClass();
                                linkedHashMapM15372Y.put(strMo4589b4, xv7.m24710a(str11));
                                si7Var = c2888d2.f34178m;
                                this.f33948e = null;
                                this.f33944a = c2888d2;
                                this.f33945b = language2;
                                this.f33946c = i;
                                this.f33947d = 5;
                                if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, this) != coroutineSingletons) {
                                    i3 = i;
                                    language3 = language2;
                                    c2888d3 = c2888d2;
                                    language2 = language3;
                                    c2888d2 = c2888d3;
                                    c2888d2.f34179n.mo8485c2();
                                    qn3 qn3Var5 = c2888d2.f34180o;
                                    String str12 = language2.f19024a;
                                    this.f33948e = null;
                                    this.f33944a = c2888d2;
                                    this.f33945b = language2;
                                    this.f33946c = i3;
                                    this.f33947d = 6;
                                    objM7156f = ((C1289e) ((zw0) qn3Var5.f57974a)).m7156f(str12, this);
                                    if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                        objM7156f = xfaVar;
                                    }
                                    if (objM7156f != coroutineSingletons) {
                                        i4 = i3;
                                        language4 = language2;
                                        c2888d4 = c2888d2;
                                        if (!language4.f19028e) {
                                            C1386a c1386a5 = c2888d4.f34175j;
                                            String str13 = language4.f19024a;
                                            this.f33948e = null;
                                            this.f33944a = c2888d4;
                                            this.f33945b = language4;
                                            this.f33946c = i4;
                                            this.f33947d = 7;
                                            objM8000d = c1386a5.m8000d(str13, this);
                                            break;
                                        }
                                        return xfaVar;
                                    }
                                }
                            }
                        } else {
                            i3 = i;
                            c2888d2.f34179n.mo8485c2();
                            qn3 qn3Var6 = c2888d2.f34180o;
                            String str14 = language2.f19024a;
                            this.f33948e = null;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i3;
                            this.f33947d = 6;
                            objM7156f = ((C1289e) ((zw0) qn3Var6.f57974a)).m7156f(str14, this);
                            if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM7156f = xfaVar;
                            }
                            if (objM7156f != coroutineSingletons) {
                                i4 = i3;
                                language4 = language2;
                                c2888d4 = c2888d2;
                                if (!language4.f19028e) {
                                    C1386a c1386a6 = c2888d4.f34175j;
                                    String str15 = language4.f19024a;
                                    this.f33948e = null;
                                    this.f33944a = c2888d4;
                                    this.f33945b = language4;
                                    this.f33946c = i4;
                                    this.f33947d = 7;
                                    objM8000d = c1386a6.m8000d(str15, this);
                                    break;
                                }
                                return xfaVar;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    i = this.f33946c;
                    Language language7 = this.f33945b;
                    C2888d c2888d7 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    c2888d2 = c2888d7;
                    language2 = language7;
                    objM15541t2 = obj;
                    if (((Map) objM15541t2).get(c2888d2.f34167b.mo4589b2()) != null) {
                        c83 c83Var8 = ((C1368a) c2888d2.f34178m).f18466z0;
                        this.f33948e = language5;
                        this.f33944a = c2888d2;
                        this.f33945b = language2;
                        this.f33946c = i;
                        this.f33947d = 4;
                        objM15541t3 = AbstractC3224d.m15541t(c83Var8, this);
                        if (objM15541t3 != coroutineSingletons) {
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t3);
                            String strMo4589b5 = c2888d2.f34167b.mo4589b2();
                            xv7 xv7Var4 = ReaderFont.Companion;
                            String str16 = language5.f19024a;
                            xv7Var4.getClass();
                            linkedHashMapM15372Y.put(strMo4589b5, xv7.m24710a(str16));
                            si7Var = c2888d2.f34178m;
                            this.f33948e = null;
                            this.f33944a = c2888d2;
                            this.f33945b = language2;
                            this.f33946c = i;
                            this.f33947d = 5;
                            if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, this) != coroutineSingletons) {
                                i3 = i;
                                language3 = language2;
                                c2888d3 = c2888d2;
                                language2 = language3;
                                c2888d2 = c2888d3;
                                c2888d2.f34179n.mo8485c2();
                                qn3 qn3Var7 = c2888d2.f34180o;
                                String str17 = language2.f19024a;
                                this.f33948e = null;
                                this.f33944a = c2888d2;
                                this.f33945b = language2;
                                this.f33946c = i3;
                                this.f33947d = 6;
                                objM7156f = ((C1289e) ((zw0) qn3Var7.f57974a)).m7156f(str17, this);
                                if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM7156f = xfaVar;
                                }
                                if (objM7156f != coroutineSingletons) {
                                    i4 = i3;
                                    language4 = language2;
                                    c2888d4 = c2888d2;
                                    if (!language4.f19028e) {
                                        C1386a c1386a7 = c2888d4.f34175j;
                                        String str18 = language4.f19024a;
                                        this.f33948e = null;
                                        this.f33944a = c2888d4;
                                        this.f33945b = language4;
                                        this.f33946c = i4;
                                        this.f33947d = 7;
                                        objM8000d = c1386a7.m8000d(str18, this);
                                        break;
                                    }
                                    return xfaVar;
                                }
                            }
                        }
                    } else {
                        i3 = i;
                        c2888d2.f34179n.mo8485c2();
                        qn3 qn3Var8 = c2888d2.f34180o;
                        String str19 = language2.f19024a;
                        this.f33948e = null;
                        this.f33944a = c2888d2;
                        this.f33945b = language2;
                        this.f33946c = i3;
                        this.f33947d = 6;
                        objM7156f = ((C1289e) ((zw0) qn3Var8.f57974a)).m7156f(str19, this);
                        if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM7156f = xfaVar;
                        }
                        if (objM7156f != coroutineSingletons) {
                            i4 = i3;
                            language4 = language2;
                            c2888d4 = c2888d2;
                            if (!language4.f19028e) {
                                C1386a c1386a8 = c2888d4.f34175j;
                                String str110 = language4.f19024a;
                                this.f33948e = null;
                                this.f33944a = c2888d4;
                                this.f33945b = language4;
                                this.f33946c = i4;
                                this.f33947d = 7;
                                objM8000d = c1386a8.m8000d(str110, this);
                                break;
                            }
                            return xfaVar;
                        }
                    }
                    return coroutineSingletons;
                case 4:
                    i = this.f33946c;
                    Language language8 = this.f33945b;
                    C2888d c2888d8 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    c2888d2 = c2888d8;
                    language2 = language8;
                    objM15541t3 = obj;
                    linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t3);
                    String strMo4589b6 = c2888d2.f34167b.mo4589b2();
                    xv7 xv7Var5 = ReaderFont.Companion;
                    String str111 = language5.f19024a;
                    xv7Var5.getClass();
                    linkedHashMapM15372Y.put(strMo4589b6, xv7.m24710a(str111));
                    si7Var = c2888d2.f34178m;
                    this.f33948e = null;
                    this.f33944a = c2888d2;
                    this.f33945b = language2;
                    this.f33946c = i;
                    this.f33947d = 5;
                    if (((C1368a) si7Var).m7854M(linkedHashMapM15372Y, this) != coroutineSingletons) {
                        i3 = i;
                        language3 = language2;
                        c2888d3 = c2888d2;
                        language2 = language3;
                        c2888d2 = c2888d3;
                        c2888d2.f34179n.mo8485c2();
                        qn3 qn3Var9 = c2888d2.f34180o;
                        String str112 = language2.f19024a;
                        this.f33948e = null;
                        this.f33944a = c2888d2;
                        this.f33945b = language2;
                        this.f33946c = i3;
                        this.f33947d = 6;
                        objM7156f = ((C1289e) ((zw0) qn3Var9.f57974a)).m7156f(str112, this);
                        if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM7156f = xfaVar;
                        }
                        if (objM7156f != coroutineSingletons) {
                            i4 = i3;
                            language4 = language2;
                            c2888d4 = c2888d2;
                            if (!language4.f19028e) {
                                C1386a c1386a9 = c2888d4.f34175j;
                                String str113 = language4.f19024a;
                                this.f33948e = null;
                                this.f33944a = c2888d4;
                                this.f33945b = language4;
                                this.f33946c = i4;
                                this.f33947d = 7;
                                objM8000d = c1386a9.m8000d(str113, this);
                                break;
                            }
                            return xfaVar;
                        }
                    }
                    return coroutineSingletons;
                case 5:
                    i3 = this.f33946c;
                    language3 = this.f33945b;
                    c2888d3 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    language2 = language3;
                    c2888d2 = c2888d3;
                    c2888d2.f34179n.mo8485c2();
                    qn3 qn3Var10 = c2888d2.f34180o;
                    String str114 = language2.f19024a;
                    this.f33948e = null;
                    this.f33944a = c2888d2;
                    this.f33945b = language2;
                    this.f33946c = i3;
                    this.f33947d = 6;
                    objM7156f = ((C1289e) ((zw0) qn3Var10.f57974a)).m7156f(str114, this);
                    if (objM7156f != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        objM7156f = xfaVar;
                    }
                    if (objM7156f != coroutineSingletons) {
                        i4 = i3;
                        language4 = language2;
                        c2888d4 = c2888d2;
                        if (!language4.f19028e) {
                            C1386a c1386a10 = c2888d4.f34175j;
                            String str115 = language4.f19024a;
                            this.f33948e = null;
                            this.f33944a = c2888d4;
                            this.f33945b = language4;
                            this.f33946c = i4;
                            this.f33947d = 7;
                            objM8000d = c1386a10.m8000d(str115, this);
                            break;
                        }
                        return xfaVar;
                    }
                    return coroutineSingletons;
                case 6:
                    int i7 = this.f33946c;
                    Language language9 = this.f33945b;
                    c2888d4 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    i4 = i7;
                    language4 = language9;
                    if (!language4.f19028e) {
                        C1386a c1386a11 = c2888d4.f34175j;
                        String str116 = language4.f19024a;
                        this.f33948e = null;
                        this.f33944a = c2888d4;
                        this.f33945b = language4;
                        this.f33946c = i4;
                        this.f33947d = 7;
                        objM8000d = c1386a11.m8000d(str116, this);
                        break;
                    }
                    return xfaVar;
                case 7:
                    language4 = this.f33945b;
                    C2888d c2888d9 = this.f33944a;
                    AbstractC3193b.m15359b(obj);
                    c2888d4 = c2888d9;
                    objM8000d = obj;
                    if (((Boolean) objM8000d).booleanValue()) {
                        c2888d4.m9813b3(language4.f19024a, true);
                    }
                    return xfaVar;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$3(C2888d c2888d, Continuation continuation) {
        super(2, continuation);
        this.f33943b = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeViewModel$3(this.f33943b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33942a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2888d c2888d = this.f33943b;
            eh9 eh9VarMo4572B0 = c2888d.f34167b.mo4572B0();
            C28791 c28791 = new C28791(c2888d, null);
            this.f33942a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c28791, this) == coroutineSingletons) {
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
