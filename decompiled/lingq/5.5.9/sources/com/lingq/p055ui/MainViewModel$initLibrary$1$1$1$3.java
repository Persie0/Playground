package com.lingq.p055ui;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.library.LibraryShelf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$initLibrary$1$1$1$3", m19206f = "MainViewModel.kt", m19207l = {181}, m19208m = "invokeSuspend")
public final class MainViewModel$initLibrary$1$1$1$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends LibraryShelf>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22329e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22330f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UserLanguage f22331g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<LearningLevel> f22332h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$initLibrary$1$1$1$3(MainViewModel mainViewModel, UserLanguage userLanguage, List<? extends LearningLevel> list, InterfaceC9968c<? super MainViewModel$initLibrary$1$1$1$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22330f = mainViewModel;
        this.f22331g = userLanguage;
        this.f22332h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$initLibrary$1$1$1$3(this.f22330f, this.f22331g, this.f22332h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super List<? extends LibraryShelf>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$initLibrary$1$1$1$3) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22329e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2014g interfaceC2014g = this.f22330f.f22297k;
            String str = this.f22331g.f21726a;
            List<LearningLevel> list = this.f22332h;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((LearningLevel) it.next()).getServerName());
            }
            this.f22329e = 1;
            if (interfaceC2014g.mo6070p(str, arrayList, this) == coroutineSingletons) {
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
