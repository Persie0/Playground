package com.lingq.p055ui;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$fetchLessonsNetwork$1", m19206f = "MainViewModel.kt", m19207l = {243}, m19208m = "invokeSuspend")
final class MainViewModel$fetchLessonsNetwork$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22309e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22310f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22311g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibraryShelf f22312h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LibraryTab f22313i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f22314j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f22315k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$fetchLessonsNetwork$1(MainViewModel mainViewModel, String str, LibraryShelf libraryShelf, LibraryTab libraryTab, String str2, String str3, InterfaceC9968c<? super MainViewModel$fetchLessonsNetwork$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22310f = mainViewModel;
        this.f22311g = str;
        this.f22312h = libraryShelf;
        this.f22313i = libraryTab;
        this.f22314j = str2;
        this.f22315k = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$fetchLessonsNetwork$1(this.f22310f, this.f22311g, this.f22312h, this.f22313i, this.f22314j, this.f22315k, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$fetchLessonsNetwork$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22309e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2014g interfaceC2014g = this.f22310f.f22297k;
                String str = this.f22311g;
                String strM16880G = C8656b.m16880G(this.f22312h, this.f22313i);
                String str2 = this.f22314j;
                String str3 = this.f22315k;
                this.f22309e = 1;
                if (interfaceC2014g.mo6064j(str, strM16880G, (224 & 4) != 0 ? "" : str2, (224 & 8) != 0 ? true : true, (224 & 16) != 0 ? "" : str3, (224 & 32) != 0 ? "" : null, (224 & 64) != 0 ? "" : null, (224 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 1 : 0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
