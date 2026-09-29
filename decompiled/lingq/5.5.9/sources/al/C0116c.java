package al;

import android.os.Handler;
import android.os.Looper;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2core.Downloader;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import p033bl.C1614e;
import p033bl.InterfaceC1611b;
import p099el.C5427b;
import p099el.C5428c;
import p122fl.InterfaceC5581d;
import p122fl.InterfaceC5582e;
import p122fl.InterfaceC5587j;
import p122fl.InterfaceC5589l;
import p170i5.C6195n;
import p260m8.C7499b;
import p385sf.C9000b;
import p463wk.InterfaceC9963f;
import p463wk.InterfaceC9964g;
import p489xk.C10221i;
import p489xk.InterfaceC10219g;
import p539zk.C10512b;
import p539zk.InterfaceC10511a;
import sl.C9072e;

/* JADX INFO: renamed from: al.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C0116c implements InterfaceC0114a {

    /* JADX INFO: renamed from: H */
    public final PrioritySort f279H;

    /* JADX INFO: renamed from: I */
    public final boolean f280I;

    /* JADX INFO: renamed from: a */
    public final int f281a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f282b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f283c;

    /* JADX INFO: renamed from: d */
    public final String f284d;

    /* JADX INFO: renamed from: e */
    public final C10221i f285e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC10511a f286f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC1611b<Download> f287g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5587j f288h;

    /* JADX INFO: renamed from: i */
    public final boolean f289i;

    /* JADX INFO: renamed from: j */
    public final ListenerCoordinator f290j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5589l f291k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC9964g f292l;

    public C0116c(String str, C10221i c10221i, C10512b c10512b, C1614e c1614e, InterfaceC5587j interfaceC5587j, boolean z10, Downloader downloader, InterfaceC5582e interfaceC5582e, ListenerCoordinator listenerCoordinator, Handler handler, InterfaceC5589l interfaceC5589l, InterfaceC9964g interfaceC9964g, C6195n c6195n, PrioritySort prioritySort, boolean z11) {
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(c10221i, "fetchDatabaseManagerWrapper");
        C5207g.m11112g(interfaceC5587j, "logger");
        C5207g.m11112g(downloader, "httpDownloader");
        C5207g.m11112g(interfaceC5582e, "fileServerDownloader");
        C5207g.m11112g(listenerCoordinator, "listenerCoordinator");
        C5207g.m11112g(handler, "uiHandler");
        C5207g.m11112g(interfaceC5589l, "storageResolver");
        C5207g.m11112g(c6195n, "groupInfoProvider");
        C5207g.m11112g(prioritySort, "prioritySort");
        this.f284d = str;
        this.f285e = c10221i;
        this.f286f = c10512b;
        this.f287g = c1614e;
        this.f288h = interfaceC5587j;
        this.f289i = z10;
        this.f290j = listenerCoordinator;
        this.f291k = interfaceC5589l;
        this.f292l = interfaceC9964g;
        this.f279H = prioritySort;
        this.f280I = z11;
        this.f281a = UUID.randomUUID().hashCode();
        this.f282b = new LinkedHashSet();
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: A0 */
    public final void mo510A0() {
        InterfaceC9964g interfaceC9964g = this.f292l;
        if (interfaceC9964g != null) {
            ListenerCoordinator listenerCoordinator = this.f290j;
            listenerCoordinator.getClass();
            synchronized (listenerCoordinator.f32441a) {
                try {
                    if (!listenerCoordinator.f32444d.contains(interfaceC9964g)) {
                        listenerCoordinator.f32444d.add(interfaceC9964g);
                    }
                    C9072e c9072e = C9072e.f47360a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f285e.mo10628n();
        if (this.f289i) {
            this.f287g.start();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m516a(List<? extends DownloadInfo> list) {
        Iterator<? extends DownloadInfo> it = list.iterator();
        while (it.hasNext()) {
            this.f286f.mo19483H0(it.next().f32331a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m517b(List list) {
        m516a(list);
        C10221i c10221i = this.f285e;
        c10221i.mo10623h1(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DownloadInfo downloadInfo = (DownloadInfo) it.next();
            downloadInfo.m10610r(Status.DELETED);
            this.f291k.mo11806d(downloadInfo.f32334d);
            InterfaceC10219g.a<DownloadInfo> aVarMo10626j = c10221i.mo10626j();
            if (aVarMo10626j != null) {
                aVarMo10626j.mo522a(downloadInfo);
            }
        }
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: c */
    public final ArrayList mo511c() {
        C10221i c10221i = this.f285e;
        List<DownloadInfo> list = c10221i.get();
        m516a(list);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    c10221i.mo10621e0(arrayList);
                    return arrayList;
                }
                DownloadInfo downloadInfo = (DownloadInfo) it.next();
                C5207g.m11112g(downloadInfo, "download");
                int i10 = C5428c.f33973a[downloadInfo.f32340j.ordinal()];
                boolean z10 = true;
                if (i10 == 1 || i10 == 2 || i10 == 3) {
                    z10 = false;
                }
                if (z10) {
                    downloadInfo.m10610r(Status.CANCELLED);
                    downloadInfo.m10604h(C5427b.f33967d);
                    arrayList.add(downloadInfo);
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f283c) {
            return;
        }
        this.f283c = true;
        synchronized (this.f282b) {
            try {
                Iterator it = this.f282b.iterator();
                while (it.hasNext()) {
                    this.f290j.m10656b(this.f281a, (InterfaceC9963f) it.next());
                }
                this.f282b.clear();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        InterfaceC9964g interfaceC9964g = this.f292l;
        if (interfaceC9964g != null) {
            ListenerCoordinator listenerCoordinator = this.f290j;
            listenerCoordinator.getClass();
            synchronized (listenerCoordinator.f32441a) {
                try {
                    listenerCoordinator.f32444d.remove(interfaceC9964g);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            ListenerCoordinator listenerCoordinator2 = this.f290j;
            InterfaceC9964g interfaceC9964g2 = this.f292l;
            listenerCoordinator2.getClass();
            C5207g.m11112g(interfaceC9964g2, "fetchNotificationManager");
            synchronized (listenerCoordinator2.f32441a) {
                try {
                    listenerCoordinator2.f32445e.post(new RunnableC0124k(listenerCoordinator2, interfaceC9964g2));
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        this.f287g.stop();
        this.f287g.close();
        this.f286f.close();
        Object obj = C0122i.f302a;
        C0122i.m521a(this.f284d);
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: g1 */
    public final ArrayList mo512g1(List list) {
        C5207g.m11112g(list, "requests");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            C10221i c10221i = this.f285e;
            DownloadInfo downloadInfoMo10620e = c10221i.mo10620e();
            C5207g.m11112g(request, "$this$toDownloadInfo");
            C5207g.m11112g(downloadInfoMo10620e, "downloadInfo");
            downloadInfoMo10620e.f32331a = request.f32307k;
            downloadInfoMo10620e.m10612x(request.f32308l);
            downloadInfoMo10620e.m10606k(request.f32306H);
            downloadInfoMo10620e.m10609q(request.f32312d);
            downloadInfoMo10620e.f32337g = C6753d.m13465R0(request.f32311c);
            downloadInfoMo10620e.f32335e = request.f32310b;
            downloadInfoMo10620e.m10608n(request.f32313e);
            downloadInfoMo10620e.m10610r(C5427b.f33968e);
            downloadInfoMo10620e.m10604h(C5427b.f33967d);
            downloadInfoMo10620e.f32338h = 0L;
            downloadInfoMo10620e.f32322I = request.f32314f;
            downloadInfoMo10620e.m10603e(request.f32315g);
            downloadInfoMo10620e.f32324K = request.f32309a;
            downloadInfoMo10620e.f32325L = request.f32316h;
            Extras extras = request.f32318j;
            C5207g.m11112g(extras, "<set-?>");
            downloadInfoMo10620e.f32326M = extras;
            downloadInfoMo10620e.f32327N = request.f32317i;
            downloadInfoMo10620e.f32328O = 0;
            downloadInfoMo10620e.m10607l(this.f284d);
            try {
                boolean zM518l = m518l(downloadInfoMo10620e);
                if (downloadInfoMo10620e.f32340j != Status.COMPLETED) {
                    downloadInfoMo10620e.m10610r(request.f32316h ? Status.QUEUED : Status.ADDED);
                    InterfaceC5587j interfaceC5587j = this.f288h;
                    if (zM518l) {
                        c10221i.mo10615T(downloadInfoMo10620e);
                        interfaceC5587j.mo11829b("Updated download " + downloadInfoMo10620e);
                        arrayList.add(new Pair(downloadInfoMo10620e, Error.NONE));
                    } else {
                        Pair<DownloadInfo, Boolean> pairMo10624i0 = c10221i.mo10624i0(downloadInfoMo10620e);
                        interfaceC5587j.mo11829b("Enqueued download " + pairMo10624i0.f38012a);
                        arrayList.add(new Pair(pairMo10624i0.f38012a, Error.NONE));
                        m519q();
                    }
                } else {
                    arrayList.add(new Pair(downloadInfoMo10620e, Error.NONE));
                }
                if (this.f279H == PrioritySort.DESC && !this.f286f.mo19487l0()) {
                    this.f287g.pause();
                }
            } catch (Exception e10) {
                Error errorM17247m = C9000b.m17247m(e10);
                errorM17247m.setThrowable(e10);
                arrayList.add(new Pair(downloadInfoMo10620e, errorM17247m));
            }
        }
        m519q();
        return arrayList;
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: h */
    public final void mo513h(int i10, InterfaceC5581d<Download>... interfaceC5581dArr) {
        C5207g.m11112g(interfaceC5581dArr, "fetchObservers");
        ListenerCoordinator listenerCoordinator = this.f290j;
        InterfaceC5581d[] interfaceC5581dArr2 = (InterfaceC5581d[]) Arrays.copyOf(interfaceC5581dArr, interfaceC5581dArr.length);
        listenerCoordinator.getClass();
        C5207g.m11112g(interfaceC5581dArr2, "fetchObservers");
        synchronized (listenerCoordinator.f32441a) {
            try {
                for (InterfaceC5581d interfaceC5581d : interfaceC5581dArr2) {
                    List list = (List) listenerCoordinator.f32446f.get(Integer.valueOf(i10));
                    Iterator it = list != null ? list.iterator() : null;
                    if (it != null) {
                        while (it.hasNext()) {
                            if (C5207g.m11106a((InterfaceC5581d) ((WeakReference) it.next()).get(), interfaceC5581d)) {
                                it.remove();
                                break;
                            }
                        }
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m518l(DownloadInfo downloadInfo) {
        m516a(C9000b.m17251q(downloadInfo));
        String str = downloadInfo.f32334d;
        C10221i c10221i = this.f285e;
        DownloadInfo downloadInfoMo10625i1 = c10221i.mo10625i1(str);
        boolean z10 = this.f280I;
        InterfaceC5589l interfaceC5589l = this.f291k;
        if (downloadInfoMo10625i1 != null) {
            m516a(C9000b.m17251q(downloadInfoMo10625i1));
            downloadInfoMo10625i1 = c10221i.mo10625i1(downloadInfo.f32334d);
            InterfaceC5587j interfaceC5587j = this.f288h;
            if (downloadInfoMo10625i1 == null || downloadInfoMo10625i1.f32340j != Status.DOWNLOADING) {
                if ((downloadInfoMo10625i1 != null ? downloadInfoMo10625i1.f32340j : null) == Status.COMPLETED && downloadInfo.f32323J == EnqueueAction.UPDATE_ACCORDINGLY && !interfaceC5589l.mo11804b(downloadInfoMo10625i1.f32334d)) {
                    try {
                        c10221i.mo10627m(downloadInfoMo10625i1);
                    } catch (Exception e10) {
                        String message = e10.getMessage();
                        interfaceC5587j.mo11831d(message != null ? message : "", e10);
                    }
                    if (downloadInfo.f32323J != EnqueueAction.INCREMENT_FILE_NAME && z10) {
                        interfaceC5589l.mo11807e(downloadInfo.f32334d, false);
                    }
                    downloadInfoMo10625i1 = null;
                }
            } else {
                downloadInfoMo10625i1.m10610r(Status.QUEUED);
                try {
                    c10221i.mo10615T(downloadInfoMo10625i1);
                } catch (Exception e11) {
                    String message2 = e11.getMessage();
                    interfaceC5587j.mo11831d(message2 != null ? message2 : "", e11);
                }
            }
        } else if (downloadInfo.f32323J != EnqueueAction.INCREMENT_FILE_NAME && z10) {
            interfaceC5589l.mo11807e(downloadInfo.f32334d, false);
        }
        int i10 = C0115b.f278a[downloadInfo.f32323J.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (downloadInfoMo10625i1 == null) {
                    return false;
                }
                throw new FetchException("request_with_file_path_already_exist");
            }
            if (i10 == 3) {
                if (downloadInfoMo10625i1 != null) {
                    m517b(C9000b.m17251q(downloadInfoMo10625i1));
                }
                m517b(C9000b.m17251q(downloadInfo));
                return false;
            }
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (z10) {
                interfaceC5589l.mo11807e(downloadInfo.f32334d, true);
            }
            downloadInfo.m10606k(downloadInfo.f32334d);
            String str2 = downloadInfo.f32333c;
            String str3 = downloadInfo.f32334d;
            C5207g.m11112g(str2, "url");
            C5207g.m11112g(str3, "file");
            downloadInfo.f32331a = str3.hashCode() + (str2.hashCode() * 31);
            return false;
        }
        if (downloadInfoMo10625i1 == null) {
            return false;
        }
        downloadInfo.f32338h = downloadInfoMo10625i1.f32338h;
        downloadInfo.f32339i = downloadInfoMo10625i1.f32339i;
        downloadInfo.m10604h(downloadInfoMo10625i1.f32341k);
        downloadInfo.m10610r(downloadInfoMo10625i1.f32340j);
        Status status = downloadInfo.f32340j;
        Status status2 = Status.COMPLETED;
        if (status != status2) {
            downloadInfo.m10610r(Status.QUEUED);
            downloadInfo.m10604h(C5427b.f33967d);
        }
        if (downloadInfo.f32340j == status2 && !interfaceC5589l.mo11804b(downloadInfo.f32334d)) {
            if (z10) {
                interfaceC5589l.mo11807e(downloadInfo.f32334d, false);
            }
            downloadInfo.f32338h = 0L;
            downloadInfo.f32339i = -1L;
            downloadInfo.m10610r(Status.QUEUED);
            downloadInfo.m10604h(C5427b.f33967d);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m519q() {
        this.f287g.mo5267V0();
        if (this.f287g.mo5268i() && !this.f283c) {
            this.f287g.start();
        }
        if (this.f287g.mo5266R0() && !this.f283c) {
            this.f287g.mo5265F();
        }
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: x */
    public final boolean mo514x(boolean z10) {
        Thread threadCurrentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C5207g.m11107b(mainLooper, "Looper.getMainLooper()");
        if (C5207g.m11106a(threadCurrentThread, mainLooper.getThread())) {
            throw new FetchException("blocking_call_on_ui_thread");
        }
        return this.f285e.mo10629v1(z10) > 0;
    }

    @Override // al.InterfaceC0114a
    /* JADX INFO: renamed from: z */
    public final void mo515z(int i10, InterfaceC5581d<Download>... interfaceC5581dArr) {
        C5207g.m11112g(interfaceC5581dArr, "fetchObservers");
        ListenerCoordinator listenerCoordinator = this.f290j;
        InterfaceC5581d[] interfaceC5581dArr2 = (InterfaceC5581d[]) Arrays.copyOf(interfaceC5581dArr, interfaceC5581dArr.length);
        listenerCoordinator.getClass();
        C5207g.m11112g(interfaceC5581dArr2, "fetchObservers");
        synchronized (listenerCoordinator.f32441a) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(interfaceC5581dArr2.length));
                C6744b.m13390v0(linkedHashSet, interfaceC5581dArr2);
                List listM13453u0 = C6752c.m13453u0(linkedHashSet);
                List arrayList = (List) listenerCoordinator.f32446f.get(Integer.valueOf(i10));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it.next()).get();
                        if (interfaceC5581d != null) {
                            arrayList2.add(interfaceC5581d);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = listM13453u0.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        InterfaceC5581d interfaceC5581d2 = (InterfaceC5581d) it2.next();
                        if (!arrayList2.contains(interfaceC5581d2)) {
                            arrayList.add(new WeakReference(interfaceC5581d2));
                            arrayList3.add(interfaceC5581d2);
                        }
                    }
                }
                DownloadInfo downloadInfo = ((C10221i) listenerCoordinator.f32449i.f9487a).get(i10);
                if (downloadInfo != null) {
                    listenerCoordinator.f32450j.post(new RunnableC0123j(arrayList3, downloadInfo));
                }
                listenerCoordinator.f32446f.put(Integer.valueOf(i10), arrayList);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
