package com.lingq.p055ui.home.search;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.FastSearchData;
import com.lingq.shared.uimodel.library.LibraryShelf;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.search.SearchViewModel$navigate$1", m19206f = "SearchViewModel.kt", m19207l = {308, 313}, m19208m = "invokeSuspend")
final class SearchViewModel$navigate$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26034e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchViewModel f26035f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FastSearchData f26036g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$navigate$1(SearchViewModel searchViewModel, FastSearchData fastSearchData, InterfaceC9968c<? super SearchViewModel$navigate$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26035f = searchViewModel;
        this.f26036g = fastSearchData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SearchViewModel$navigate$1(this.f26035f, this.f26036g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchViewModel$navigate$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26034e;
        SearchViewModel searchViewModel = this.f26035f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2014g interfaceC2014g = searchViewModel.f26007g;
        String strMo498E1 = searchViewModel.mo498E1();
        String str = this.f26036g.f21941a;
        this.f26034e = 1;
        obj = interfaceC2014g.mo6073s(strMo498E1, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LibraryShelf libraryShelf = (LibraryShelf) obj;
        if (libraryShelf != null) {
            C7138s c7138s = searchViewModel.f26002P;
            AbstractC3986b.d dVar = new AbstractC3986b.d(libraryShelf, (String) searchViewModel.f25995I.getValue());
            this.f26034e = 2;
            if (c7138s.mo1339r(dVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
