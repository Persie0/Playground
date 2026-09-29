package com.lingq.shared.download;

import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {504, 513}, m19208m = "invokeSuspend")
final class DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f17939e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DownloadManagerDelegateImpl f17940f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f17941g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17942h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1(int i10, DownloadManagerDelegateImpl downloadManagerDelegateImpl, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f17940f = downloadManagerDelegateImpl;
        this.f17941g = str;
        this.f17942h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1(this.f17942h, this.f17940f, this.f17941g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DownloadManagerDelegateImpl$cancelAllDownloadsFor$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f17939e;
        int i11 = this.f17942h;
        String str = this.f17941g;
        DownloadManagerDelegateImpl downloadManagerDelegateImpl = this.f17940f;
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
        InterfaceC2019l interfaceC2019l = downloadManagerDelegateImpl.f17879b;
        this.f17939e = 1;
        obj = interfaceC2019l.mo6112g(i11, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C6698d c6698d = (C6698d) obj;
        if (c6698d != null && !c6698d.f37876b && c6698d.f37877c < 100) {
            DownloadItem downloadItem = new DownloadItem(str, i11, "", false);
            InterfaceC2019l interfaceC2019l2 = downloadManagerDelegateImpl.f17879b;
            String str2 = downloadItem.f17865a;
            int i12 = downloadItem.f17866b;
            this.f17939e = 2;
            if (interfaceC2019l2.mo6129x(i12, 0, str2, this, false) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
