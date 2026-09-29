package com.tonyodev.fetch2.fetch;

import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p122fl.InterfaceC5585h;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lsl/e;", "invoke", "()V", "com/tonyodev/fetch2/fetch/FetchImpl$executeCancelAction$1$1", "<anonymous>"}, m13366k = 3, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1 extends Lambda implements InterfaceC2041a<C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FetchImpl f32434b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2041a f32435c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC5585h f32436d = null;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC5585h f32437e = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchImpl$executeCancelAction$$inlined$synchronized$lambda$1(FetchImpl fetchImpl, InterfaceC2041a interfaceC2041a) {
        super(0);
        this.f32434b = fetchImpl;
        this.f32435c = interfaceC2041a;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final C9072e mo807E() {
        FetchImpl fetchImpl = this.f32434b;
        try {
            List<Download> list = (List) this.f32435c.mo807E();
            for (Download download : list) {
                fetchImpl.f32420i.mo11829b("Cancelled download " + download);
                fetchImpl.f32421j.f32447g.mo10663o(download);
            }
            fetchImpl.f32418g.post(new RunnableC4975c(this, list));
        } catch (Exception e10) {
            fetchImpl.f32420i.mo11831d("Fetch with namespace " + fetchImpl.f32415d + " error", e10);
            Error errorM17246l = C9000b.m17246l(e10.getMessage());
            errorM17246l.setThrowable(e10);
            if (this.f32437e != null) {
                fetchImpl.f32418g.post(new RunnableC4976d(this, errorM17246l));
            }
        }
        return C9072e.f47360a;
    }
}
