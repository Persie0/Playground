package com.lingq.p055ui.home.collections;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.domain.Resource;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$fetchLibraryItemsNetwork$1", m19206f = "CollectionsViewModel.kt", m19207l = {444}, m19208m = "invokeSuspend")
final class CollectionsViewModel$fetchLibraryItemsNetwork$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23335e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23336f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23337g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23338h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f23339i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f23340j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f23341k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f23342l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$fetchLibraryItemsNetwork$1(CollectionsViewModel collectionsViewModel, String str, String str2, String str3, String str4, String str5, int i10, InterfaceC9968c<? super CollectionsViewModel$fetchLibraryItemsNetwork$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23336f = collectionsViewModel;
        this.f23337g = str;
        this.f23338h = str2;
        this.f23339i = str3;
        this.f23340j = str4;
        this.f23341k = str5;
        this.f23342l = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$fetchLibraryItemsNetwork$1(this.f23336f, this.f23337g, this.f23338h, this.f23339i, this.f23340j, this.f23341k, this.f23342l, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$fetchLibraryItemsNetwork$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objMo6064j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23335e;
        CollectionsViewModel collectionsViewModel = this.f23336f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2014g interfaceC2014g = collectionsViewModel.f23251f;
                String str = this.f23337g;
                String str2 = this.f23338h;
                String str3 = this.f23339i;
                String str4 = this.f23340j;
                String str5 = this.f23341k;
                int i11 = this.f23342l;
                this.f23335e = 1;
                objMo6064j = interfaceC2014g.mo6064j(str, str2, (224 & 4) != 0 ? "" : str3, (224 & 8) != 0, (224 & 16) != 0 ? "" : null, (224 & 32) != 0 ? "" : str4, (224 & 64) != 0 ? "" : str5, (224 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 1 : i11, this);
                if (objMo6064j == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                objMo6064j = obj;
            }
            int iIntValue = ((Number) objMo6064j).intValue();
            StateFlowImpl stateFlowImpl = collectionsViewModel.f23238U;
            int i12 = this.f23342l;
            stateFlowImpl.setValue(Boolean.valueOf(iIntValue == 0 && i12 == 1));
            if (iIntValue == 0 && i12 == 1) {
                collectionsViewModel.f23246c0.setValue(Resource.Status.EMPTY);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
