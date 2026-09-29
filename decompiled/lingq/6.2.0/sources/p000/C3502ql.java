package p000;

import androidx.compose.material3.adaptive.C0220x452dcd97;
import coil.compose.ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1;
import com.lingq.core.data.repository.C1269x2a189445;
import com.lingq.core.data.repository.C1270xd1426548;
import com.lingq.core.data.repository.C1279x78d5a7fc;
import com.lingq.core.data.repository.CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1;
import com.lingq.core.data.repository.OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1;
import com.lingq.core.domain.util.FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1;
import com.lingq.core.user.UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1;
import com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$map$1$2$1;
import com.lingq.feature.library.LibraryUpdateViewModel$special$$inlined$map$2$2$1;
import com.lingq.feature.library.domain.ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1;
import com.lingq.p020ui.MainViewModel$special$$inlined$filter$3$2$1;
import com.lingq.p020ui.MainViewModel$special$$inlined$map$1$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;

/* JADX INFO: renamed from: ql */
/* JADX INFO: loaded from: classes.dex */
public final class C3502ql implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f57889b;

    public /* synthetic */ C3502ql(e83 e83Var, int i) {
        this.f57888a = i;
        this.f57889b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:126:0x0201  */
    /* JADX WARN: Code duplicated, block: B:145:0x025d  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:180:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:195:0x030f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0354  */
    /* JADX WARN: Code duplicated, block: B:232:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:247:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:280:0x048f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:96:0x0184  */
    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        C0220x452dcd97 c0220x452dcd97;
        ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1;
        C1269x2a189445 c1269x2a189445;
        CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1 cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1;
        FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1;
        FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1 flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1;
        FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1;
        C1270xd1426548 c1270xd1426548;
        C1279x78d5a7fc c1279x78d5a7fc;
        LibraryUpdateViewModel$special$$inlined$map$1$2$1 libraryUpdateViewModel$special$$inlined$map$1$2$1;
        LibraryUpdateViewModel$special$$inlined$map$2$2$1 libraryUpdateViewModel$special$$inlined$map$2$2$1;
        MainViewModel$special$$inlined$filter$3$2$1 mainViewModel$special$$inlined$filter$3$2$1;
        MainViewModel$special$$inlined$map$1$2$1 mainViewModel$special$$inlined$map$1$2$1;
        ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1 managePromoBannerServiceImpl$special$$inlined$map$1$2$1;
        OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1 offerRepositoryImpl$observableOffers$$inlined$map$1$2$1;
        UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1 userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1;
        int i = this.f57888a;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f57889b;
        Object w89Var = null;
        switch (i) {
            case 0:
                if (continuation instanceof C0220x452dcd97) {
                    c0220x452dcd97 = (C0220x452dcd97) continuation;
                    int i2 = c0220x452dcd97.f3371b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0220x452dcd97.f3371b = i2 - Integer.MIN_VALUE;
                    } else {
                        c0220x452dcd97 = new C0220x452dcd97(this, continuation);
                    }
                } else {
                    c0220x452dcd97 = new C0220x452dcd97(this, continuation);
                }
                Object obj2 = c0220x452dcd97.f3370a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = c0220x452dcd97.f3371b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj2);
                List list = ((q6b) obj).f57330a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof fr3) {
                        arrayList.add(obj3);
                    }
                }
                c0220x452dcd97.f3371b = 1;
                return e83Var.emit(arrayList, c0220x452dcd97) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                if (continuation instanceof ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) {
                    constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = (ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) continuation;
                    int i4 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.f10422b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.f10422b = i4 - Integer.MIN_VALUE;
                    } else {
                        constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = new ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                } else {
                    constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1 = new ConstraintsSizeResolver$size$$inlined$mapNotNull$1$2$1(this, continuation);
                }
                Object obj4 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.f10421a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.f10422b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                long j = ((bk1) obj).f8631a;
                q18 q18Var = kna.f47564b;
                pvc lg2Var = ng2.f52701n;
                int i6 = (int) (3 & j);
                int i7 = (((i6 & 2) >> 1) * 3) + ((i6 & 1) << 1);
                if (!(((((1 << (18 - i7)) - 1) & ((int) (j >> (i7 + 46)))) - 1 == 0) | ((((int) (j >> 33)) & ((1 << (i7 + 13)) - 1)) - 1 == 0))) {
                    pvc lg2Var2 = bk1.m3797e(j) ? new lg2(bk1.m3801i(j)) : lg2Var;
                    if (bk1.m3796d(j)) {
                        lg2Var = new lg2(bk1.m3800h(j));
                    }
                    w89Var = new w89(lg2Var2, lg2Var);
                }
                if (w89Var == null) {
                    return xfaVar;
                }
                constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1.f10422b = 1;
                return e83Var.emit(w89Var, constraintsSizeResolver$size$$inlined$mapNotNull$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : xfaVar;
            case 2:
                if (continuation instanceof C1269x2a189445) {
                    c1269x2a189445 = (C1269x2a189445) continuation;
                    int i8 = c1269x2a189445.f15060b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c1269x2a189445.f15060b = i8 - Integer.MIN_VALUE;
                    } else {
                        c1269x2a189445 = new C1269x2a189445(this, continuation);
                    }
                } else {
                    c1269x2a189445 = new C1269x2a189445(this, continuation);
                }
                Object obj5 = c1269x2a189445.f15059a;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = c1269x2a189445.f15060b;
                if (i9 == 0) {
                    AbstractC3193b.m15359b(obj5);
                    Set setM22627s1 = u91.m22627s1((List) obj);
                    c1269x2a189445.f15060b = 1;
                    return e83Var.emit(setM22627s1, c1269x2a189445) == coroutineSingletons3 ? coroutineSingletons3 : xfaVar;
                }
                if (i9 == 1) {
                    AbstractC3193b.m15359b(obj5);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                if (continuation instanceof CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1) {
                    cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1 = (CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1) continuation;
                    int i10 = cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1.f15101b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1.f15101b = i10 - Integer.MIN_VALUE;
                    } else {
                        cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1 = new CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1 = new CupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1(this, continuation);
                }
                Object obj6 = cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1.f15100a;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1.f15101b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC3193b.m15359b(obj6);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj6);
                xt1 xt1Var = (xt1) obj;
                w89Var = xt1Var != null ? new ew1(xt1Var.f68683b, xt1Var.f68684c, xt1Var.f68685d, xt1Var.f68686e, xt1Var.f68688g, xt1Var.f68687f, xt1Var.f68689h, xt1Var.f68690i, xt1Var.f68691j, xt1Var.f68692k) : null;
                cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1.f15101b = 1;
                return e83Var.emit(w89Var, cupRepositoryImpl$observeCupSummary$$inlined$map$1$2$1) == coroutineSingletons4 ? coroutineSingletons4 : xfaVar;
            case 4:
                Object objEmit = e83Var.emit(obj, continuation);
                return objEmit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEmit : xfaVar;
            case 5:
                if (continuation instanceof FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1) {
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 = (FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1) continuation;
                    int i12 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1.f20131b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1.f20131b = i12 - Integer.MIN_VALUE;
                    } else {
                        flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 = new FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1 = new FlowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1(this, continuation);
                }
                Object obj7 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1.f20130a;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1.f20131b;
                if (i13 == 0) {
                    AbstractC3193b.m15359b(obj7);
                    j83 j83Var = new j83(obj, 0);
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1.f20131b = 1;
                    return e83Var.emit(j83Var, flowExtensionsKt$withDataFetchAndResults$$inlined$map$1$2$1) == coroutineSingletons5 ? coroutineSingletons5 : xfaVar;
                }
                if (i13 == 1) {
                    AbstractC3193b.m15359b(obj7);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                if (continuation instanceof FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1) {
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1 = (FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1) continuation;
                    int i14 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1.f20134b;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1.f20134b = i14 - Integer.MIN_VALUE;
                    } else {
                        flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1 = new FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1 = new FlowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1(this, continuation);
                }
                Object obj8 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1.f20133a;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1.f20134b;
                if (i15 == 0) {
                    AbstractC3193b.m15359b(obj8);
                    j83 j83Var2 = new j83(obj, 1);
                    flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1.f20134b = 1;
                    return e83Var.emit(j83Var2, flowExtensionsKt$withDataFetchAndResults$$inlined$map$2$2$1) == coroutineSingletons6 ? coroutineSingletons6 : xfaVar;
                }
                if (i15 == 1) {
                    AbstractC3193b.m15359b(obj8);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 7:
                if (continuation instanceof FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) {
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) continuation;
                    int i16 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.f47941b;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.f47941b = i16 - Integer.MIN_VALUE;
                    } else {
                        flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, continuation);
                    }
                } else {
                    flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1(this, continuation);
                }
                Object obj9 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.f47940a;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.f47941b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        AbstractC3193b.m15359b(obj9);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj9);
                if (obj == null) {
                    return xfaVar;
                }
                flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1.f47941b = 1;
                return e83Var.emit(obj, flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1) == coroutineSingletons7 ? coroutineSingletons7 : xfaVar;
            case 8:
                if (continuation instanceof C1270xd1426548) {
                    c1270xd1426548 = (C1270xd1426548) continuation;
                    int i18 = c1270xd1426548.f15214b;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        c1270xd1426548.f15214b = i18 - Integer.MIN_VALUE;
                    } else {
                        c1270xd1426548 = new C1270xd1426548(this, continuation);
                    }
                } else {
                    c1270xd1426548 = new C1270xd1426548(this, continuation);
                }
                Object obj10 = c1270xd1426548.f15213a;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = c1270xd1426548.f15214b;
                if (i19 != 0) {
                    if (i19 == 1) {
                        AbstractC3193b.m15359b(obj10);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj10);
                LanguageContextEntity languageContextEntity = (LanguageContextEntity) obj;
                w89Var = languageContextEntity != null ? AbstractC3423or.m18265l0(languageContextEntity) : null;
                c1270xd1426548.f15214b = 1;
                return e83Var.emit(w89Var, c1270xd1426548) == coroutineSingletons8 ? coroutineSingletons8 : xfaVar;
            case 9:
                if (continuation instanceof C1279x78d5a7fc) {
                    c1279x78d5a7fc = (C1279x78d5a7fc) continuation;
                    int i20 = c1279x78d5a7fc.f15759b;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        c1279x78d5a7fc.f15759b = i20 - Integer.MIN_VALUE;
                    } else {
                        c1279x78d5a7fc = new C1279x78d5a7fc(this, continuation);
                    }
                } else {
                    c1279x78d5a7fc = new C1279x78d5a7fc(this, continuation);
                }
                Object obj11 = c1279x78d5a7fc.f15758a;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = c1279x78d5a7fc.f15759b;
                if (i21 != 0) {
                    if (i21 == 1) {
                        AbstractC3193b.m15359b(obj11);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj11);
                List list2 = (List) obj;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(AbstractC3423or.m18273p0((u85) it.next()));
                }
                c1279x78d5a7fc.f15759b = 1;
                return e83Var.emit(arrayList2, c1279x78d5a7fc) == coroutineSingletons9 ? coroutineSingletons9 : xfaVar;
            case 10:
                if (continuation instanceof LibraryUpdateViewModel$special$$inlined$map$1$2$1) {
                    libraryUpdateViewModel$special$$inlined$map$1$2$1 = (LibraryUpdateViewModel$special$$inlined$map$1$2$1) continuation;
                    int i22 = libraryUpdateViewModel$special$$inlined$map$1$2$1.f26604b;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        libraryUpdateViewModel$special$$inlined$map$1$2$1.f26604b = i22 - Integer.MIN_VALUE;
                    } else {
                        libraryUpdateViewModel$special$$inlined$map$1$2$1 = new LibraryUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    libraryUpdateViewModel$special$$inlined$map$1$2$1 = new LibraryUpdateViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj12 = libraryUpdateViewModel$special$$inlined$map$1$2$1.f26603a;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = libraryUpdateViewModel$special$$inlined$map$1$2$1.f26604b;
                if (i23 != 0) {
                    if (i23 == 1) {
                        AbstractC3193b.m15359b(obj12);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj12);
                Profile profile = (Profile) obj;
                xl7 xl7Var = new xl7(profile.f19652a, profile.f19654c);
                libraryUpdateViewModel$special$$inlined$map$1$2$1.f26604b = 1;
                return e83Var.emit(xl7Var, libraryUpdateViewModel$special$$inlined$map$1$2$1) == coroutineSingletons10 ? coroutineSingletons10 : xfaVar;
            case 11:
                if (continuation instanceof LibraryUpdateViewModel$special$$inlined$map$2$2$1) {
                    libraryUpdateViewModel$special$$inlined$map$2$2$1 = (LibraryUpdateViewModel$special$$inlined$map$2$2$1) continuation;
                    int i24 = libraryUpdateViewModel$special$$inlined$map$2$2$1.f26607b;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        libraryUpdateViewModel$special$$inlined$map$2$2$1.f26607b = i24 - Integer.MIN_VALUE;
                    } else {
                        libraryUpdateViewModel$special$$inlined$map$2$2$1 = new LibraryUpdateViewModel$special$$inlined$map$2$2$1(this, continuation);
                    }
                } else {
                    libraryUpdateViewModel$special$$inlined$map$2$2$1 = new LibraryUpdateViewModel$special$$inlined$map$2$2$1(this, continuation);
                }
                Object obj13 = libraryUpdateViewModel$special$$inlined$map$2$2$1.f26606a;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = libraryUpdateViewModel$special$$inlined$map$2$2$1.f26607b;
                if (i25 == 0) {
                    AbstractC3193b.m15359b(obj13);
                    String str = ((Language) obj).f19024a;
                    libraryUpdateViewModel$special$$inlined$map$2$2$1.f26607b = 1;
                    return e83Var.emit(str, libraryUpdateViewModel$special$$inlined$map$2$2$1) == coroutineSingletons11 ? coroutineSingletons11 : xfaVar;
                }
                if (i25 == 1) {
                    AbstractC3193b.m15359b(obj13);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 12:
                if (continuation instanceof MainViewModel$special$$inlined$filter$3$2$1) {
                    mainViewModel$special$$inlined$filter$3$2$1 = (MainViewModel$special$$inlined$filter$3$2$1) continuation;
                    int i26 = mainViewModel$special$$inlined$filter$3$2$1.f34149b;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        mainViewModel$special$$inlined$filter$3$2$1.f34149b = i26 - Integer.MIN_VALUE;
                    } else {
                        mainViewModel$special$$inlined$filter$3$2$1 = new MainViewModel$special$$inlined$filter$3$2$1(this, continuation);
                    }
                } else {
                    mainViewModel$special$$inlined$filter$3$2$1 = new MainViewModel$special$$inlined$filter$3$2$1(this, continuation);
                }
                Object obj14 = mainViewModel$special$$inlined$filter$3$2$1.f34148a;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i27 = mainViewModel$special$$inlined$filter$3$2$1.f34149b;
                if (i27 != 0) {
                    if (i27 == 1) {
                        AbstractC3193b.m15359b(obj14);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj14);
                if (((rn7) obj).f59593c.f61064b == null) {
                    return xfaVar;
                }
                mainViewModel$special$$inlined$filter$3$2$1.f34149b = 1;
                return e83Var.emit(obj, mainViewModel$special$$inlined$filter$3$2$1) == coroutineSingletons12 ? coroutineSingletons12 : xfaVar;
            case 13:
                if (continuation instanceof MainViewModel$special$$inlined$map$1$2$1) {
                    mainViewModel$special$$inlined$map$1$2$1 = (MainViewModel$special$$inlined$map$1$2$1) continuation;
                    int i28 = mainViewModel$special$$inlined$map$1$2$1.f34156b;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        mainViewModel$special$$inlined$map$1$2$1.f34156b = i28 - Integer.MIN_VALUE;
                    } else {
                        mainViewModel$special$$inlined$map$1$2$1 = new MainViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    mainViewModel$special$$inlined$map$1$2$1 = new MainViewModel$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj15 = mainViewModel$special$$inlined$map$1$2$1.f34155a;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = mainViewModel$special$$inlined$map$1$2$1.f34156b;
                if (i29 != 0) {
                    if (i29 == 1) {
                        AbstractC3193b.m15359b(obj15);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj15);
                String str2 = ((Profile) obj).f19672u;
                if (str2 == null) {
                    str2 = "";
                }
                mainViewModel$special$$inlined$map$1$2$1.f34156b = 1;
                return e83Var.emit(str2, mainViewModel$special$$inlined$map$1$2$1) == coroutineSingletons13 ? coroutineSingletons13 : xfaVar;
            case 14:
                if (continuation instanceof ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1) {
                    managePromoBannerServiceImpl$special$$inlined$map$1$2$1 = (ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1) continuation;
                    int i30 = managePromoBannerServiceImpl$special$$inlined$map$1$2$1.f26645b;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        managePromoBannerServiceImpl$special$$inlined$map$1$2$1.f26645b = i30 - Integer.MIN_VALUE;
                    } else {
                        managePromoBannerServiceImpl$special$$inlined$map$1$2$1 = new ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    managePromoBannerServiceImpl$special$$inlined$map$1$2$1 = new ManagePromoBannerServiceImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj16 = managePromoBannerServiceImpl$special$$inlined$map$1$2$1.f26644a;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = managePromoBannerServiceImpl$special$$inlined$map$1$2$1.f26645b;
                if (i31 != 0) {
                    if (i31 == 1) {
                        AbstractC3193b.m15359b(obj16);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj16);
                rn7 rn7Var = (rn7) obj;
                w89Var = rn7Var.f59591a ? new g95(rn7Var.f59593c, rn7Var.f59592b) : null;
                managePromoBannerServiceImpl$special$$inlined$map$1$2$1.f26645b = 1;
                return e83Var.emit(w89Var, managePromoBannerServiceImpl$special$$inlined$map$1$2$1) == coroutineSingletons14 ? coroutineSingletons14 : xfaVar;
            case 15:
                if (continuation instanceof OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1) {
                    offerRepositoryImpl$observableOffers$$inlined$map$1$2$1 = (OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1) continuation;
                    int i32 = offerRepositoryImpl$observableOffers$$inlined$map$1$2$1.f15869b;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        offerRepositoryImpl$observableOffers$$inlined$map$1$2$1.f15869b = i32 - Integer.MIN_VALUE;
                    } else {
                        offerRepositoryImpl$observableOffers$$inlined$map$1$2$1 = new OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    offerRepositoryImpl$observableOffers$$inlined$map$1$2$1 = new OfferRepositoryImpl$observableOffers$$inlined$map$1$2$1(this, continuation);
                }
                Object obj17 = offerRepositoryImpl$observableOffers$$inlined$map$1$2$1.f15868a;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = offerRepositoryImpl$observableOffers$$inlined$map$1$2$1.f15869b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        AbstractC3193b.m15359b(obj17);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj17);
                List list3 = (List) obj;
                ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(gtb.m12862a((yp6) it2.next()));
                }
                offerRepositoryImpl$observableOffers$$inlined$map$1$2$1.f15869b = 1;
                return e83Var.emit(arrayList3, offerRepositoryImpl$observableOffers$$inlined$map$1$2$1) == coroutineSingletons15 ? coroutineSingletons15 : xfaVar;
            default:
                if (continuation instanceof UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1) {
                    userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1 = (UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1) continuation;
                    int i34 = userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1.f24249b;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1.f24249b = i34 - Integer.MIN_VALUE;
                    } else {
                        userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1 = new UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1 = new UserSessionViewModelDelegateImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj18 = userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1.f24248a;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1.f24249b;
                if (i35 == 0) {
                    AbstractC3193b.m15359b(obj18);
                    String str3 = ((Profile) obj).f19666o;
                    userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1.f24249b = 1;
                    return e83Var.emit(str3, userSessionViewModelDelegateImpl$special$$inlined$map$1$2$1) == coroutineSingletons16 ? coroutineSingletons16 : xfaVar;
                }
                if (i35 == 1) {
                    AbstractC3193b.m15359b(obj18);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
