package p000;

import com.lingq.core.datastore.DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1;
import com.lingq.core.domain.library.GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final class d51 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35005d;

    public /* synthetic */ d51(Object obj, Object obj2, Object obj3, int i) {
        this.f35002a = i;
        this.f35003b = obj;
        this.f35004c = obj2;
        this.f35005d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Object objInvoke;
        DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1 downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1;
        Object objM15360M;
        GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1 getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1;
        int i = this.f35002a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f35005d;
        Object obj3 = this.f35004c;
        Object obj4 = this.f35003b;
        switch (i) {
            case 0:
                LessonBookmark lessonBookmark = (LessonBookmark) obj;
                boolean z = false;
                if (lessonBookmark != null && fa4.m11650l(lessonBookmark.f19171d, "Android")) {
                    z = true;
                }
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj4;
                boolean z2 = ref$BooleanRef.f47713a;
                if (z2 && z) {
                    objInvoke = ((zi3) obj3).invoke(lessonBookmark, continuation);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return xfaVar;
                    }
                } else {
                    ref$BooleanRef.f47713a = true;
                    objInvoke = ((aj3) obj2).invoke(lessonBookmark, Boolean.valueOf(!z2), continuation);
                    if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return xfaVar;
                    }
                }
                return objInvoke;
            case 1:
                nz0 nz0Var = (nz0) obj;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj2;
                e83 e83Var = (e83) obj3;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj4;
                if (nz0Var instanceof mz0) {
                    int i2 = ((mz0) nz0Var).f52057a;
                    ref$IntRef.f47716a = i2;
                    Object objEmit = e83Var.emit(new hr1(i2), continuation);
                    if (objEmit == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objEmit;
                    }
                } else if (nz0Var instanceof iz0) {
                    Object objEmit2 = e83Var.emit(new ir1(ref$IntRef.f47716a, ((iz0) nz0Var).f44793a), continuation);
                    if (objEmit2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objEmit2;
                    }
                } else if (!(nz0Var instanceof jz0)) {
                    if (fa4.m11650l(nz0Var, lz0.f50326a)) {
                        ref$ObjectRef.f47718a = gr1.f41230a;
                    } else {
                        if (!(nz0Var instanceof kz0)) {
                            gm5.m12750e();
                            return null;
                        }
                        ref$ObjectRef.f47718a = new fr1(((kz0) nz0Var).f48788a);
                    }
                }
                return xfaVar;
            case 2:
                if (continuation instanceof DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1) {
                    downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1 = (DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1) continuation;
                    int i3 = downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1.f17509b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1.f17509b = i3 - Integer.MIN_VALUE;
                    } else {
                        downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1 = new DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1 = new DownloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1(this, continuation);
                }
                Object obj5 = downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1.f17508a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1.f17509b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    e83 e83Var2 = (e83) obj4;
                    Map map = (Map) obj;
                    LinkedHashSet linkedHashSet = (LinkedHashSet) obj2;
                    ((lj2) obj3).getClass();
                    if (map.isEmpty() || linkedHashSet.isEmpty()) {
                        objM15360M = AbstractC3194a.m15360M();
                    } else if (map.size() <= linkedHashSet.size()) {
                        MapBuilder mapBuilder = new MapBuilder(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) entry.getValue();
                            if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                mapBuilder.put(Integer.valueOf(iIntValue), interfaceC3055gy);
                            }
                        }
                        objM15360M = mapBuilder.m15392b();
                    } else {
                        MapBuilder mapBuilder2 = new MapBuilder(linkedHashSet.size());
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            InterfaceC3055gy interfaceC3055gy2 = (InterfaceC3055gy) map.get(Integer.valueOf(iIntValue2));
                            if (interfaceC3055gy2 != null) {
                            }
                        }
                        objM15360M = mapBuilder2.m15392b();
                    }
                    downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1.f17509b = 1;
                    if (e83Var2.emit(objM15360M, downloadProgressStoreImpl$observeProgress$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i4 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj5);
                }
                return xfaVar;
            default:
                if (continuation instanceof GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1) {
                    getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1 = (GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i5 = getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1.f18753b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1.f18753b = i5 - Integer.MIN_VALUE;
                    } else {
                        getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1 = new GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1 = new GetLibraryLevelsUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                }
                Object obj6 = getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1.f18752a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1.f18753b;
                if (i6 == 0) {
                    AbstractC3193b.m15359b(obj6);
                    e83 e83Var3 = (e83) obj4;
                    Map map2 = (Map) ((Map) obj).get((String) obj2);
                    lm3 lm3Var = mm3.Companion;
                    ((mm3) obj3).getClass();
                    Pair pair = mm3.f51513b;
                    if (map2 != null) {
                        LearningLevel learningLevel = LearningLevel.Beginner1;
                        LearningLevel learningLevel2 = LearningLevel.Advanced2;
                        LearningLevel[] learningLevelArrValues = LearningLevel.values();
                        while (learningLevel.ordinal() < learningLevelArrValues.length - 1 && fa4.m11650l(map2.get(learningLevel), Boolean.FALSE)) {
                            learningLevel = learningLevelArrValues[learningLevel.ordinal() + 1];
                        }
                        while (learningLevel2.ordinal() > 0 && fa4.m11650l(map2.get(learningLevel2), Boolean.FALSE)) {
                            learningLevel2 = learningLevelArrValues[learningLevel2.ordinal() - 1];
                        }
                        if (learningLevel.ordinal() <= learningLevel2.ordinal()) {
                            pair = new Pair(learningLevel, learningLevel2);
                        }
                    }
                    getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1.f18753b = 1;
                    if (e83Var3.emit(pair, getLibraryLevelsUseCase$invoke$$inlined$map$1$2$1) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i6 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj6);
                }
                return xfaVar;
        }
    }
}
