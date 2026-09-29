package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.ContentType;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.util.C4924a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$storeContentType$1", m19206f = "CollectionsSearchFilterViewModel.kt", m19207l = {149}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterViewModel$storeContentType$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23628e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterViewModel f23629f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Integer f23630g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterViewModel$storeContentType$1(CollectionsSearchFilterViewModel collectionsSearchFilterViewModel, Integer num, InterfaceC9968c<? super CollectionsSearchFilterViewModel$storeContentType$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23629f = collectionsSearchFilterViewModel;
        this.f23630g = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterViewModel$storeContentType$1(this.f23629f, this.f23630g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterViewModel$storeContentType$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ContentType contentType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23628e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = this.f23629f;
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) collectionsSearchFilterViewModel.f23623j.getValue());
            Map map = (Map) collectionsSearchFilterViewModel.f23623j.getValue();
            String str = collectionsSearchFilterViewModel.f23621h;
            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) map.get(str);
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
            }
            ContentType[] contentTypeArrValues = ContentType.values();
            int length = contentTypeArrValues.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    contentType = null;
                    break;
                }
                contentType = contentTypeArrValues[i11];
                int iM10430I = C4924a.m10430I(contentType);
                Integer num = this.f23630g;
                if (num != null && iM10430I == num.intValue()) {
                    break;
                }
                i11++;
            }
            librarySearchQuery.f22032i = contentType;
            linkedHashMapM13467T0.put(str, librarySearchQuery);
            this.f23628e = 1;
            if (collectionsSearchFilterViewModel.f23617d.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
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
