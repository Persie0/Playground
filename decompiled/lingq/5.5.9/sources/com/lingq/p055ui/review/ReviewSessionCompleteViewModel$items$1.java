package com.lingq.p055ui.review;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import li.C7374a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/review/ReviewSessionCompleteAdapter$a;", "", "Lli/a;", "cards", "", "", "", "timesCorrect", "timesIncorrect", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteViewModel$items$1", m19206f = "ReviewSessionCompleteViewModel.kt", m19207l = {56}, m19208m = "invokeSuspend")
public final class ReviewSessionCompleteViewModel$items$1 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super List<ReviewSessionCompleteAdapter.AbstractC4530a>>, List<? extends C7374a>, Map<String, ? extends Integer>, Map<String, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29591e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f29592f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f29593g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Map f29594h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Map f29595i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ReviewSessionCompleteViewModel f29596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$items$1(ReviewSessionCompleteViewModel reviewSessionCompleteViewModel, InterfaceC9968c<? super ReviewSessionCompleteViewModel$items$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f29596j = reviewSessionCompleteViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super List<ReviewSessionCompleteAdapter.AbstractC4530a>> interfaceC7117d, List<? extends C7374a> list, Map<String, ? extends Integer> map, Map<String, ? extends Integer> map2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        ReviewSessionCompleteViewModel$items$1 reviewSessionCompleteViewModel$items$1 = new ReviewSessionCompleteViewModel$items$1(this.f29596j, interfaceC9968c);
        reviewSessionCompleteViewModel$items$1.f29592f = interfaceC7117d;
        reviewSessionCompleteViewModel$items$1.f29593g = list;
        reviewSessionCompleteViewModel$items$1.f29594h = map;
        reviewSessionCompleteViewModel$items$1.f29595i = map2;
        return reviewSessionCompleteViewModel$items$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29591e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f29592f;
            List<C7374a> list = this.f29593g;
            Map map = this.f29594h;
            Map map2 = this.f29595i;
            ArrayList arrayList = new ArrayList();
            ReviewSessionCompleteViewModel reviewSessionCompleteViewModel = this.f29596j;
            arrayList.add(new ReviewSessionCompleteAdapter.AbstractC4530a.a(reviewSessionCompleteViewModel.f29581g, reviewSessionCompleteViewModel.f29580f));
            arrayList.add(new ReviewSessionCompleteAdapter.AbstractC4530a.c());
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
            for (C7374a c7374a : list) {
                Integer num = (Integer) map.get(c7374a.f41142a);
                int iIntValue = 0;
                int iIntValue2 = num != null ? num.intValue() : 0;
                Integer num2 = (Integer) map2.get(c7374a.f41142a);
                if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                arrayList2.add(new ReviewSessionCompleteAdapter.AbstractC4530a.b(c7374a, iIntValue2, iIntValue));
            }
            arrayList.addAll(arrayList2);
            this.f29592f = null;
            this.f29593g = null;
            this.f29594h = null;
            this.f29591e = 1;
            if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
