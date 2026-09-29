package com.lingq.p055ui.review;

import ae.C0062b;
import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p264mi.C7563c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$getCards$1", m19206f = "ReviewViewModel.kt", m19207l = {410, 412}, m19208m = "invokeSuspend")
final class ReviewViewModel$getCards$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29752e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29753f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$getCards$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$getCards$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29753f = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$getCards$1(this.f29753f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$getCards$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[LOOP:0: B:22:0x0071->B:24:0x0077, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List list;
        ArrayList arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29752e;
        ReviewViewModel reviewViewModel = this.f29753f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            list = (List) obj;
            if (list != null) {
                if (list.isEmpty()) {
                    ReviewViewModel.m10248n2(reviewViewModel, EmptyList.f38032a);
                } else {
                    arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((C7563c) it.next()).f41680b);
                    }
                    reviewViewModel.f29616L = arrayList;
                    reviewViewModel.f29618M.mo14371k(arrayList);
                }
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2025r interfaceC2025r = reviewViewModel.f29645d;
        String strMo498E1 = reviewViewModel.mo498E1();
        this.f29752e = 1;
        obj = interfaceC2025r.mo6182d(strMo498E1, 1, (96 & 4) != 0 ? "" : null, (96 & 8) != 0 ? false : false, (96 & 16) != 0 ? false : false, null, (96 & 64) != 0 ? -1 : 200, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0((InterfaceC7116c) obj, reviewViewModel.f29651g);
        this.f29752e = 2;
        obj = FlowKt__ReduceKt.m14362c(interfaceC7116cM307S0, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        list = (List) obj;
        if (list != null) {
            if (list.isEmpty()) {
                ReviewViewModel.m10248n2(reviewViewModel, EmptyList.f38032a);
            } else {
                arrayList = new ArrayList(C9325m.m17681z(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7563c) it.next()).f41680b);
                }
                reviewViewModel.f29616L = arrayList;
                reviewViewModel.f29618M.mo14371k(arrayList);
            }
        }
        return C9072e.f47360a;
    }
}
