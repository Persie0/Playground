package com.lingq.p055ui;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$initLibrary$1", m19206f = "MainViewModel.kt", m19207l = {159}, m19208m = "invokeSuspend")
public final class MainViewModel$initLibrary$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22322e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22323f;

    /* JADX INFO: renamed from: com.lingq.ui.MainViewModel$initLibrary$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "language", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$initLibrary$1$1", m19206f = "MainViewModel.kt", m19207l = {161, 167, 171, 176, 189}, m19208m = "invokeSuspend")
    public static final class C34271 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public MainViewModel f22324e;

        /* JADX INFO: renamed from: f */
        public Object f22325f;

        /* JADX INFO: renamed from: g */
        public int f22326g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f22327h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ MainViewModel f22328i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34271(MainViewModel mainViewModel, InterfaceC9968c<? super C34271> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22328i = mainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34271 c34271 = new C34271(this.f22328i, interfaceC9968c);
            c34271.f22327h = obj;
            return c34271;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34271) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00a3 A[LOOP:3: B:27:0x00a1->B:28:0x00a3, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:31:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:42:0x010c  */
        /* JADX WARN: Code duplicated, block: B:48:0x0141 A[LOOP:1: B:46:0x013b->B:48:0x0141, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:49:0x0151  */
        /* JADX WARN: Code duplicated, block: B:53:0x016a A[LOOP:2: B:51:0x0164->B:53:0x016a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:56:0x0188 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:57:0x0189  */
        /* JADX WARN: Code duplicated, block: B:60:0x01be A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x011e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x0106 A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r16v1 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v8 */
        /* JADX WARN: Type inference failed for: r2v9, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r5v12, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v7, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Iterable, java.lang.Object] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Object objM14360a;
            UserLanguage userLanguage;
            MainViewModel mainViewModel;
            List<String> list;
            LinkedHashMap linkedHashMap;
            LearningLevel[] learningLevelArrValues;
            int length;
            int i10;
            int i11;
            Map<String, ? extends Map<LearningLevel, Boolean>> mapM14943h0;
            UserLanguage userLanguage2;
            Object objM14360a2;
            Map map;
            ?? arrayList;
            ArrayList arrayList2;
            Iterator it;
            Object objMo6066l;
            MainViewModel mainViewModel2;
            ?? r10;
            LinkedHashMap linkedHashMap2;
            Iterator it2;
            InterfaceC7116c interfaceC7116cM307S0;
            MainViewModel$initLibrary$1$1$1$5 mainViewModel$initLibrary$1$1$1$5;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i12 = this.f22326g;
            if (i12 == 0) {
                C7499b.m14977z0(obj);
                UserLanguage userLanguage3 = (UserLanguage) this.f22327h;
                if (userLanguage3 != null) {
                    MainViewModel mainViewModel3 = this.f22328i;
                    InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i = mainViewModel3.f22287f.mo9594i();
                    this.f22327h = userLanguage3;
                    this.f22324e = mainViewModel3;
                    this.f22326g = 1;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguage = userLanguage3;
                    mainViewModel = mainViewModel3;
                    if (((Map) objM14360a).get(mainViewModel.mo498E1()) == null) {
                        linkedHashMap = new LinkedHashMap();
                        learningLevelArrValues = LearningLevel.values();
                        length = learningLevelArrValues.length;
                        i10 = 0;
                        i11 = 0;
                        while (i10 < length) {
                            linkedHashMap.put(learningLevelArrValues[i10], Boolean.valueOf(Boolean.parseBoolean(list.get(i11))));
                            i10++;
                            i11++;
                        }
                        mapM14943h0 = C7499b.m14943h0(new Pair(mainViewModel.mo498E1(), linkedHashMap));
                        this.f22327h = userLanguage;
                        this.f22324e = mainViewModel;
                        this.f22326g = 2;
                        if (mainViewModel.f22287f.mo9569P(mapM14943h0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        userLanguage2 = userLanguage;
                        userLanguage = userLanguage2;
                    }
                    InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i2 = mainViewModel.f22287f.mo9594i();
                    this.f22327h = userLanguage;
                    this.f22324e = mainViewModel;
                    this.f22326g = 3;
                    objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i2, this);
                    if (objM14360a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = (Map) ((Map) objM14360a2).get(userLanguage.f21726a);
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
                        arrayList = EmptyList.f38032a;
                    }
                    InterfaceC2014g interfaceC2014g = mainViewModel.f22297k;
                    arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((LearningLevel) it.next()).getServerName());
                    }
                    this.f22327h = userLanguage;
                    this.f22324e = mainViewModel;
                    this.f22325f = arrayList;
                    this.f22326g = 4;
                    objMo6066l = interfaceC2014g.mo6066l(userLanguage.f21726a, arrayList2);
                    if (objMo6066l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ?? r16 = arrayList;
                    mainViewModel2 = mainViewModel;
                    r10 = r16;
                    interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$initLibrary$1$1$1$3(mainViewModel2, userLanguage, r10, null), (InterfaceC7116c) objMo6066l), new MainViewModel$initLibrary$1$1$1$4(null)), mainViewModel2.f22261H);
                    mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(mainViewModel2, null);
                    this.f22327h = null;
                    this.f22324e = null;
                    this.f22325f = null;
                    this.f22326g = 5;
                    if (C0062b.m369m0(interfaceC7116cM307S0, mainViewModel$initLibrary$1$1$1$5, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i12 == 1) {
                mainViewModel = this.f22324e;
                UserLanguage userLanguage4 = (UserLanguage) this.f22327h;
                C7499b.m14977z0(obj);
                userLanguage = userLanguage4;
                objM14360a = obj;
                if (((Map) objM14360a).get(mainViewModel.mo498E1()) == null && (list = userLanguage.f21742q) != null) {
                    linkedHashMap = new LinkedHashMap();
                    learningLevelArrValues = LearningLevel.values();
                    length = learningLevelArrValues.length;
                    i10 = 0;
                    i11 = 0;
                    while (i10 < length) {
                        linkedHashMap.put(learningLevelArrValues[i10], Boolean.valueOf(Boolean.parseBoolean(list.get(i11))));
                        i10++;
                        i11++;
                    }
                    mapM14943h0 = C7499b.m14943h0(new Pair(mainViewModel.mo498E1(), linkedHashMap));
                    this.f22327h = userLanguage;
                    this.f22324e = mainViewModel;
                    this.f22326g = 2;
                    if (mainViewModel.f22287f.mo9569P(mapM14943h0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    userLanguage2 = userLanguage;
                    userLanguage = userLanguage2;
                }
                InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i3 = mainViewModel.f22287f.mo9594i();
                this.f22327h = userLanguage;
                this.f22324e = mainViewModel;
                this.f22326g = 3;
                objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i3, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map = (Map) ((Map) objM14360a2).get(userLanguage.f21726a);
                if (map != null) {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
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
                    arrayList = EmptyList.f38032a;
                }
                InterfaceC2014g interfaceC2014g2 = mainViewModel.f22297k;
                arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                }
                this.f22327h = userLanguage;
                this.f22324e = mainViewModel;
                this.f22325f = arrayList;
                this.f22326g = 4;
                objMo6066l = interfaceC2014g2.mo6066l(userLanguage.f21726a, arrayList2);
                if (objMo6066l == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ?? r17 = arrayList;
                mainViewModel2 = mainViewModel;
                r10 = r17;
                interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$initLibrary$1$1$1$3(mainViewModel2, userLanguage, r10, null), (InterfaceC7116c) objMo6066l), new MainViewModel$initLibrary$1$1$1$4(null)), mainViewModel2.f22261H);
                mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(mainViewModel2, null);
                this.f22327h = null;
                this.f22324e = null;
                this.f22325f = null;
                this.f22326g = 5;
                if (C0062b.m369m0(interfaceC7116cM307S0, mainViewModel$initLibrary$1$1$1$5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 2) {
                mainViewModel = this.f22324e;
                userLanguage2 = (UserLanguage) this.f22327h;
                C7499b.m14977z0(obj);
                userLanguage = userLanguage2;
                InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i4 = mainViewModel.f22287f.mo9594i();
                this.f22327h = userLanguage;
                this.f22324e = mainViewModel;
                this.f22326g = 3;
                objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i4, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                map = (Map) ((Map) objM14360a2).get(userLanguage.f21726a);
                if (map != null) {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
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
                    arrayList = EmptyList.f38032a;
                }
                InterfaceC2014g interfaceC2014g3 = mainViewModel.f22297k;
                arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                }
                this.f22327h = userLanguage;
                this.f22324e = mainViewModel;
                this.f22325f = arrayList;
                this.f22326g = 4;
                objMo6066l = interfaceC2014g3.mo6066l(userLanguage.f21726a, arrayList2);
                if (objMo6066l == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ?? r18 = arrayList;
                mainViewModel2 = mainViewModel;
                r10 = r18;
                interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$initLibrary$1$1$1$3(mainViewModel2, userLanguage, r10, null), (InterfaceC7116c) objMo6066l), new MainViewModel$initLibrary$1$1$1$4(null)), mainViewModel2.f22261H);
                mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(mainViewModel2, null);
                this.f22327h = null;
                this.f22324e = null;
                this.f22325f = null;
                this.f22326g = 5;
                if (C0062b.m369m0(interfaceC7116cM307S0, mainViewModel$initLibrary$1$1$1$5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 3) {
                mainViewModel = this.f22324e;
                UserLanguage userLanguage5 = (UserLanguage) this.f22327h;
                C7499b.m14977z0(obj);
                userLanguage = userLanguage5;
                objM14360a2 = obj;
                map = (Map) ((Map) objM14360a2).get(userLanguage.f21726a);
                if (map != null) {
                    linkedHashMap2 = new LinkedHashMap();
                    while (r5.hasNext()) {
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
                    arrayList = EmptyList.f38032a;
                }
                InterfaceC2014g interfaceC2014g4 = mainViewModel.f22297k;
                arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((LearningLevel) it.next()).getServerName());
                }
                this.f22327h = userLanguage;
                this.f22324e = mainViewModel;
                this.f22325f = arrayList;
                this.f22326g = 4;
                objMo6066l = interfaceC2014g4.mo6066l(userLanguage.f21726a, arrayList2);
                if (objMo6066l == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ?? r19 = arrayList;
                mainViewModel2 = mainViewModel;
                r10 = r19;
                interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$initLibrary$1$1$1$3(mainViewModel2, userLanguage, r10, null), (InterfaceC7116c) objMo6066l), new MainViewModel$initLibrary$1$1$1$4(null)), mainViewModel2.f22261H);
                mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(mainViewModel2, null);
                this.f22327h = null;
                this.f22324e = null;
                this.f22325f = null;
                this.f22326g = 5;
                if (C0062b.m369m0(interfaceC7116cM307S0, mainViewModel$initLibrary$1$1$1$5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 4) {
                List list2 = (List) this.f22325f;
                MainViewModel mainViewModel4 = this.f22324e;
                UserLanguage userLanguage6 = (UserLanguage) this.f22327h;
                C7499b.m14977z0(obj);
                userLanguage = userLanguage6;
                mainViewModel2 = mainViewModel4;
                objMo6066l = obj;
                r10 = list2;
                interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new MainViewModel$initLibrary$1$1$1$3(mainViewModel2, userLanguage, r10, null), (InterfaceC7116c) objMo6066l), new MainViewModel$initLibrary$1$1$1$4(null)), mainViewModel2.f22261H);
                mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(mainViewModel2, null);
                this.f22327h = null;
                this.f22324e = null;
                this.f22325f = null;
                this.f22326g = 5;
                if (C0062b.m369m0(interfaceC7116cM307S0, mainViewModel$initLibrary$1$1$1$5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$initLibrary$1(MainViewModel mainViewModel, InterfaceC9968c<? super MainViewModel$initLibrary$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22323f = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$initLibrary$1(this.f22323f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$initLibrary$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22322e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            MainViewModel mainViewModel = this.f22323f;
            InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = mainViewModel.mo509w0();
            C34271 c34271 = new C34271(mainViewModel, null);
            this.f22322e = 1;
            if (C0062b.m369m0(interfaceC7142wMo509w0, c34271, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
