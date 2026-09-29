package com.lingq.feature.onboarding;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.language.Language;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.eh9;
import p000.l83;
import p000.m83;
import p000.si7;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {347}, m4293m = "invokeSuspend", m4294v = 2)
final class OnboardingEndViewModel$initLibrary$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2197b f26950b;

    /* JADX INFO: renamed from: com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1$1 */
    @c32(m4290c = "com.lingq.feature.onboarding.OnboardingEndViewModel$initLibrary$1$1", m4291f = "OnboardingEndViewModel.kt", m4292l = {152, 158, 162, ModuleDescriptor.MODULE_VERSION}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21721 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public C2197b f26951a;

        /* JADX INFO: renamed from: b */
        public int f26952b;

        /* JADX INFO: renamed from: c */
        public int f26953c;

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f26954d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C2197b f26955e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21721(C2197b c2197b, Continuation continuation) {
            super(2, continuation);
            this.f26955e = c2197b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21721 c21721 = new C21721(this.f26955e, continuation);
            c21721.f26954d = obj;
            return c21721;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C21721) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0086 A[LOOP:3: B:25:0x0084->B:26:0x0086, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x00db A[PHI: r3 r4 r5
          0x00db: PHI (r3v5 int) = (r3v4 int), (r3v9 int) binds: [B:32:0x00d7, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r4v10 java.lang.Object) = (r4v9 java.lang.Object), (r4v27 java.lang.Object) binds: [B:32:0x00d7, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x00db: PHI (r5v3 com.lingq.feature.onboarding.b) = (r5v2 com.lingq.feature.onboarding.b), (r5v5 com.lingq.feature.onboarding.b) binds: [B:32:0x00d7, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:45:0x012f A[LOOP:1: B:43:0x0129->B:45:0x012f, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:46:0x013f  */
        /* JADX WARN: Code duplicated, block: B:50:0x0158 A[LOOP:2: B:48:0x0152->B:50:0x0158, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:53:0x0174  */
        /* JADX WARN: Code duplicated, block: B:60:0x010c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:62:0x00f4 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
        
            if (((com.lingq.core.datastore.C1368a) r4).m7844C(r7, r17) == r2) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x01ab, code lost:
        
            if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r1, r4, r17) == r2) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v14, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM15541t;
            C2197b c2197b;
            int i;
            C2197b c2197b2;
            List list;
            LinkedHashMap linkedHashMap;
            LearningLevel[] learningLevelArrValues;
            int length;
            int i2;
            Object objM15541t2;
            Map map;
            ?? arrayList;
            ArrayList arrayList2;
            Iterator it;
            LinkedHashMap linkedHashMap2;
            Iterator it2;
            Language language = (Language) this.f26954d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.f26953c;
            int i4 = 0;
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                if (language != null) {
                    C2197b c2197b3 = this.f26955e;
                    c83 c83Var = ((C1368a) c2197b3.f27171l).f18407f1;
                    this.f26954d = language;
                    this.f26951a = c2197b3;
                    this.f26952b = 0;
                    this.f26953c = 1;
                    objM15541t = AbstractC3224d.m15541t(c83Var, this);
                    if (objM15541t != coroutineSingletons) {
                        c2197b = c2197b3;
                        i = 0;
                        if (((Map) objM15541t).get(c2197b.f27161b.mo4589b2()) == null) {
                            linkedHashMap = new LinkedHashMap();
                            learningLevelArrValues = LearningLevel.values();
                            length = learningLevelArrValues.length;
                            i2 = 0;
                            while (i4 < length) {
                                linkedHashMap.put(learningLevelArrValues[i4], Boolean.valueOf(Boolean.parseBoolean((String) list.get(i2))));
                                i4++;
                                i2++;
                            }
                            si7 si7Var = c2197b.f27171l;
                            Map mapM15364Q = AbstractC3194a.m15364Q(new Pair(c2197b.f27161b.mo4589b2(), linkedHashMap));
                            this.f26954d = language;
                            this.f26951a = c2197b;
                            this.f26952b = i;
                            this.f26953c = 2;
                        }
                        c2197b2 = c2197b;
                        c83 c83Var2 = ((C1368a) c2197b2.f27171l).f18407f1;
                        this.f26954d = language;
                        this.f26951a = c2197b2;
                        this.f26952b = i;
                        this.f26953c = 3;
                        objM15541t2 = AbstractC3224d.m15541t(c83Var2, this);
                        if (objM15541t2 != coroutineSingletons) {
                            map = (Map) ((Map) objM15541t2).get(language.f19024a);
                            if (map != null) {
                                linkedHashMap2 = new LinkedHashMap();
                                for (Map.Entry entry : map.entrySet()) {
                                    if (((Boolean) entry.getValue()).booleanValue()) {
                                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                arrayList = new ArrayList(linkedHashMap2.size());
                                it2 = linkedHashMap2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                                }
                            } else {
                                arrayList = EmptyList.f47638a;
                            }
                            Iterable iterable = (Iterable) arrayList;
                            arrayList2 = new ArrayList(v91.m23189q0(iterable, 10));
                            it = iterable.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((LearningLevel) it.next()).getServerName());
                            }
                            if (arrayList2.size() == LearningLevel.getEntries().size()) {
                                arrayList2 = null;
                            }
                            c83 c83VarM15544w = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2197b2.f27167h).m7320o(language.f19024a, arrayList2), new OnboardingEndViewModel$initLibrary$1$1$1$2(c2197b2, language, arrayList2, null)), new OnboardingEndViewModel$initLibrary$1$1$1$3(3, null), 1), c2197b2.f27170k);
                            OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$4 = new OnboardingEndViewModel$initLibrary$1$1$1$4(c2197b2, null);
                            this.f26954d = null;
                            this.f26951a = null;
                            this.f26952b = i;
                            this.f26953c = 4;
                        }
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            }
            if (i3 == 1) {
                i = this.f26952b;
                C2197b c2197b4 = this.f26951a;
                AbstractC3193b.m15359b(obj);
                c2197b = c2197b4;
                objM15541t = obj;
                if (((Map) objM15541t).get(c2197b.f27161b.mo4589b2()) == null && (list = language.f19041r) != null) {
                    linkedHashMap = new LinkedHashMap();
                    learningLevelArrValues = LearningLevel.values();
                    length = learningLevelArrValues.length;
                    i2 = 0;
                    while (i4 < length) {
                        linkedHashMap.put(learningLevelArrValues[i4], Boolean.valueOf(Boolean.parseBoolean((String) list.get(i2))));
                        i4++;
                        i2++;
                    }
                    si7 si7Var2 = c2197b.f27171l;
                    Map mapM15364Q2 = AbstractC3194a.m15364Q(new Pair(c2197b.f27161b.mo4589b2(), linkedHashMap));
                    this.f26954d = language;
                    this.f26951a = c2197b;
                    this.f26952b = i;
                    this.f26953c = 2;
                }
                c2197b2 = c2197b;
                c83 c83Var3 = ((C1368a) c2197b2.f27171l).f18407f1;
                this.f26954d = language;
                this.f26951a = c2197b2;
                this.f26952b = i;
                this.f26953c = 3;
                objM15541t2 = AbstractC3224d.m15541t(c83Var3, this);
                if (objM15541t2 != coroutineSingletons) {
                    map = (Map) ((Map) objM15541t2).get(language.f19024a);
                    if (map != null) {
                        linkedHashMap2 = new LinkedHashMap();
                        while (r4.hasNext()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        arrayList = new ArrayList(linkedHashMap2.size());
                        it2 = linkedHashMap2.entrySet().iterator();
                        while (it2.hasNext()) {
                            arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                        }
                    } else {
                        arrayList = EmptyList.f47638a;
                    }
                    Iterable iterable2 = (Iterable) arrayList;
                    arrayList2 = new ArrayList(v91.m23189q0(iterable2, 10));
                    it = iterable2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((LearningLevel) it.next()).getServerName());
                    }
                    if (arrayList2.size() == LearningLevel.getEntries().size()) {
                        arrayList2 = null;
                    }
                    c83 c83VarM15544w2 = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2197b2.f27167h).m7320o(language.f19024a, arrayList2), new OnboardingEndViewModel$initLibrary$1$1$1$2(c2197b2, language, arrayList2, null)), new OnboardingEndViewModel$initLibrary$1$1$1$3(3, null), 1), c2197b2.f27170k);
                    OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$5 = new OnboardingEndViewModel$initLibrary$1$1$1$4(c2197b2, null);
                    this.f26954d = null;
                    this.f26951a = null;
                    this.f26952b = i;
                    this.f26953c = 4;
                }
                return coroutineSingletons;
            }
            if (i3 == 2) {
                i = this.f26952b;
                c2197b2 = this.f26951a;
                AbstractC3193b.m15359b(obj);
                c83 c83Var4 = ((C1368a) c2197b2.f27171l).f18407f1;
                this.f26954d = language;
                this.f26951a = c2197b2;
                this.f26952b = i;
                this.f26953c = 3;
                objM15541t2 = AbstractC3224d.m15541t(c83Var4, this);
                if (objM15541t2 != coroutineSingletons) {
                    map = (Map) ((Map) objM15541t2).get(language.f19024a);
                    if (map != null) {
                        linkedHashMap2 = new LinkedHashMap();
                        while (r4.hasNext()) {
                            if (((Boolean) entry.getValue()).booleanValue()) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                        arrayList = new ArrayList(linkedHashMap2.size());
                        it2 = linkedHashMap2.entrySet().iterator();
                        while (it2.hasNext()) {
                            arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                        }
                    } else {
                        arrayList = EmptyList.f47638a;
                    }
                    Iterable iterable3 = (Iterable) arrayList;
                    arrayList2 = new ArrayList(v91.m23189q0(iterable3, 10));
                    it = iterable3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((LearningLevel) it.next()).getServerName());
                    }
                    if (arrayList2.size() == LearningLevel.getEntries().size()) {
                        arrayList2 = null;
                    }
                    c83 c83VarM15544w3 = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2197b2.f27167h).m7320o(language.f19024a, arrayList2), new OnboardingEndViewModel$initLibrary$1$1$1$2(c2197b2, language, arrayList2, null)), new OnboardingEndViewModel$initLibrary$1$1$1$3(3, null), 1), c2197b2.f27170k);
                    OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$6 = new OnboardingEndViewModel$initLibrary$1$1$1$4(c2197b2, null);
                    this.f26954d = null;
                    this.f26951a = null;
                    this.f26952b = i;
                    this.f26953c = 4;
                }
                return coroutineSingletons;
            }
            if (i3 == 3) {
                i = this.f26952b;
                c2197b2 = this.f26951a;
                AbstractC3193b.m15359b(obj);
                objM15541t2 = obj;
                map = (Map) ((Map) objM15541t2).get(language.f19024a);
                if (map != null) {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r4.hasNext()) {
                        if (((Boolean) entry.getValue()).booleanValue()) {
                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap2.size());
                    it2 = linkedHashMap2.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.add((LearningLevel) ((Map.Entry) it2.next()).getKey());
                    }
                } else {
                    arrayList = EmptyList.f47638a;
                }
                Iterable iterable4 = (Iterable) arrayList;
                arrayList2 = new ArrayList(v91.m23189q0(iterable4, 10));
                it = iterable4.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                }
                if (arrayList2.size() == LearningLevel.getEntries().size()) {
                    arrayList2 = null;
                }
                c83 c83VarM15544w4 = AbstractC3224d.m15544w(new l83(new m83(((C1296l) c2197b2.f27167h).m7320o(language.f19024a, arrayList2), new OnboardingEndViewModel$initLibrary$1$1$1$2(c2197b2, language, arrayList2, null)), new OnboardingEndViewModel$initLibrary$1$1$1$3(3, null), 1), c2197b2.f27170k);
                OnboardingEndViewModel$initLibrary$1$1$1$4 onboardingEndViewModel$initLibrary$1$1$1$7 = new OnboardingEndViewModel$initLibrary$1$1$1$4(c2197b2, null);
                this.f26954d = null;
                this.f26951a = null;
                this.f26952b = i;
                this.f26953c = 4;
            } else {
                if (i3 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingEndViewModel$initLibrary$1(C2197b c2197b, Continuation continuation) {
        super(2, continuation);
        this.f26950b = c2197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OnboardingEndViewModel$initLibrary$1(this.f26950b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((OnboardingEndViewModel$initLibrary$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26949a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2197b c2197b = this.f26950b;
            eh9 eh9VarMo4572B0 = c2197b.f27161b.mo4572B0();
            C21721 c21721 = new C21721(c2197b, null);
            eh9VarMo4572B0.getClass();
            this.f26949a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c21721, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
