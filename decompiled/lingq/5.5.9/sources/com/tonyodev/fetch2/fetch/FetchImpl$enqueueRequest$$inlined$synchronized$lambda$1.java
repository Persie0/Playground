package com.tonyodev.fetch2.fetch;

import al.C0117d;
import al.C0121h;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p122fl.InterfaceC5585h;
import p122fl.InterfaceC5587j;
import p385sf.C9000b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m13365d2 = {"Lsl/e;", "invoke", "()V", "com/tonyodev/fetch2/fetch/FetchImpl$enqueueRequest$1$1", "<anonymous>"}, m13366k = 3, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
final class FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1 extends Lambda implements InterfaceC2041a<C9072e> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FetchImpl f32430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f32431c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC5585h f32432d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC5585h f32433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1(FetchImpl fetchImpl, List list, C0121h c0121h, InterfaceC5585h interfaceC5585h) {
        super(0);
        this.f32430b = fetchImpl;
        this.f32431c = list;
        this.f32432d = c0121h;
        this.f32433e = interfaceC5585h;
    }

    @Override // cm.InterfaceC2041a
    /* JADX INFO: renamed from: E */
    public final C9072e mo807E() {
        List list = this.f32431c;
        FetchImpl fetchImpl = this.f32430b;
        try {
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    Object next = it.next();
                    if (hashSet.add(((Request) next).f32306H)) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.size() != list.size()) {
                throw new FetchException("request_list_not_distinct");
            }
            ArrayList arrayListMo512g1 = fetchImpl.f32419h.mo512g1(list);
            Iterator it2 = arrayListMo512g1.iterator();
            while (it2.hasNext()) {
                Download download = (Download) ((Pair) it2.next()).f38012a;
                int i10 = C0117d.f293a[download.mo10588m().ordinal()];
                InterfaceC5587j interfaceC5587j = fetchImpl.f32420i;
                ListenerCoordinator listenerCoordinator = fetchImpl.f32421j;
                if (i10 == 1) {
                    listenerCoordinator.f32447g.mo10660k(download);
                    interfaceC5587j.mo11829b("Added " + download);
                } else if (i10 == 2) {
                    DownloadInfo downloadInfoMo10620e = fetchImpl.f32422k.mo10620e();
                    C9000b.m17258x(download, downloadInfoMo10620e);
                    downloadInfoMo10620e.m10610r(Status.ADDED);
                    listenerCoordinator.f32447g.mo10660k(downloadInfoMo10620e);
                    interfaceC5587j.mo11829b("Added " + download);
                    listenerCoordinator.f32447g.mo10665r(download, false);
                    interfaceC5587j.mo11829b("Queued " + download + " for download");
                } else if (i10 == 3) {
                    listenerCoordinator.f32447g.mo10664q(download);
                    interfaceC5587j.mo11829b("Completed download " + download);
                }
            }
            fetchImpl.f32418g.post(new RunnableC4973a(this, arrayListMo512g1));
            return C9072e.f47360a;
        } catch (Exception e10) {
            fetchImpl.f32420i.mo11828a("Failed to enqueue list " + list);
            Error errorM17246l = C9000b.m17246l(e10.getMessage());
            errorM17246l.setThrowable(e10);
            if (this.f32433e != null) {
                fetchImpl.f32418g.post(new RunnableC4974b(this, errorM17246l));
            }
        }
    }
}
