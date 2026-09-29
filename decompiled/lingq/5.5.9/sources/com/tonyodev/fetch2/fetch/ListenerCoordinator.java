package com.tonyodev.fetch2.fetch;

import android.os.Handler;
import cl.C2040a;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.DownloadBlockInfo;
import com.tonyodev.fetch2core.Reason;
import dm.C5207g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import p041c5.C1702c;
import p122fl.InterfaceC5581d;
import p170i5.C6195n;
import p463wk.InterfaceC9961d;
import p463wk.InterfaceC9963f;
import p463wk.InterfaceC9964g;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class ListenerCoordinator {

    /* JADX INFO: renamed from: a */
    public final Object f32441a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f32442b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f32443c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f32444d;

    /* JADX INFO: renamed from: e */
    public final Handler f32445e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f32446f;

    /* JADX INFO: renamed from: g */
    public final C4972a f32447g;

    /* JADX INFO: renamed from: h */
    public final C6195n f32448h;

    /* JADX INFO: renamed from: i */
    public final C1702c f32449i;

    /* JADX INFO: renamed from: j */
    public final Handler f32450j;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a */
    public static final class C4972a implements InterfaceC9963f {

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32452a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32453b;

            public a(InterfaceC9963f interfaceC9963f, Download download) {
                this.f32452a = interfaceC9963f;
                this.f32453b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32452a.mo10660k(this.f32453b);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$b */
        public static final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9961d f32454a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32455b;

            public b(InterfaceC9961d interfaceC9961d, int i10, C2040a c2040a, Download download) {
                this.f32454a = interfaceC9961d;
                this.f32455b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32454a.m18541j();
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$c */
        public static final class c implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32456a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32457b;

            public c(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32456a = interfaceC5581d;
                this.f32457b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32456a.mo11833b(this.f32457b, Reason.DOWNLOAD_ADDED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$d */
        public static final class d implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32459b;

            public d(Download download) {
                this.f32459b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ListenerCoordinator.this.f32441a) {
                    Iterator it = ListenerCoordinator.this.f32444d.iterator();
                    while (it.hasNext() && !((InterfaceC9964g) it.next()).m18545a()) {
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$e */
        public static final class e implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32460a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32461b;

            public e(InterfaceC9963f interfaceC9963f, Download download) {
                this.f32460a = interfaceC9963f;
                this.f32461b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32460a.mo10663o(this.f32461b);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$f */
        public static final class f implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32462a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32463b;

            public f(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32462a = interfaceC5581d;
                this.f32463b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32462a.mo11833b(this.f32463b, Reason.DOWNLOAD_CANCELLED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$g */
        public static final class g implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32465b;

            public g(Download download) {
                this.f32465b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ListenerCoordinator.this.f32441a) {
                    Iterator it = ListenerCoordinator.this.f32444d.iterator();
                    while (it.hasNext() && !((InterfaceC9964g) it.next()).m18545a()) {
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$h */
        public static final class h implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32466a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32467b;

            public h(InterfaceC9963f interfaceC9963f, Download download) {
                this.f32466a = interfaceC9963f;
                this.f32467b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32466a.mo10664q(this.f32467b);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$i */
        public static final class i implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32468a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32469b;

            public i(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32468a = interfaceC5581d;
                this.f32469b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32468a.mo11833b(this.f32469b, Reason.DOWNLOAD_COMPLETED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$j */
        public static final class j implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32471b;

            public j(Download download) {
                this.f32471b = download;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ListenerCoordinator.this.f32441a) {
                    Iterator it = ListenerCoordinator.this.f32444d.iterator();
                    while (it.hasNext() && !((InterfaceC9964g) it.next()).m18545a()) {
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$k */
        public static final class k implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32472a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32473b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ Error f32474c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Throwable f32475d;

            public k(InterfaceC9963f interfaceC9963f, Download download, Error error, Throwable th2) {
                this.f32472a = interfaceC9963f;
                this.f32473b = download;
                this.f32474c = error;
                this.f32475d = th2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32472a.mo10659g(this.f32473b, this.f32474c, this.f32475d);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$l */
        public static final class l implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32476a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32477b;

            public l(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32476a = interfaceC5581d;
                this.f32477b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32476a.mo11833b(this.f32477b, Reason.DOWNLOAD_ERROR);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$m */
        public static final class m implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32479b;

            public m(Download download) {
                this.f32479b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ListenerCoordinator.this.f32441a) {
                    try {
                        Iterator it = ListenerCoordinator.this.f32444d.iterator();
                        while (it.hasNext() && !((InterfaceC9964g) it.next()).m18545a()) {
                        }
                        C9072e c9072e = C9072e.f47360a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$n */
        public static final class n implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32480a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32481b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ long f32482c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ long f32483d;

            public n(InterfaceC9963f interfaceC9963f, Download download, long j10, long j11) {
                this.f32480a = interfaceC9963f;
                this.f32481b = download;
                this.f32482c = j10;
                this.f32483d = j11;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32480a.mo10662n(this.f32481b, this.f32482c, this.f32483d);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$o */
        public static final class o implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32484a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32485b;

            public o(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32484a = interfaceC5581d;
                this.f32485b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32484a.mo11833b(this.f32485b, Reason.DOWNLOAD_PROGRESS_CHANGED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$p */
        public static final class p implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32486a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32487b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ boolean f32488c;

            public p(InterfaceC9963f interfaceC9963f, Download download, boolean z10) {
                this.f32486a = interfaceC9963f;
                this.f32487b = download;
                this.f32488c = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32486a.mo10665r(this.f32487b, this.f32488c);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$q */
        public static final class q implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32489a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32490b;

            public q(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32489a = interfaceC5581d;
                this.f32490b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32489a.mo11833b(this.f32490b, Reason.DOWNLOAD_QUEUED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$r */
        public static final class r implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32492b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List f32493c;

            public r(Download download, List list) {
                this.f32492b = download;
                this.f32493c = list;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ListenerCoordinator.this.f32441a) {
                    Iterator it = ListenerCoordinator.this.f32444d.iterator();
                    while (it.hasNext() && !((InterfaceC9964g) it.next()).m18545a()) {
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$s */
        public static final class s implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32494a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32495b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List f32496c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f32497d;

            public s(InterfaceC9963f interfaceC9963f, Download download, List list, int i10) {
                this.f32494a = interfaceC9963f;
                this.f32495b = download;
                this.f32496c = list;
                this.f32497d = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32494a.mo10658e(this.f32495b, this.f32496c, this.f32497d);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$t */
        public static final class t implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32498a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32499b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ List f32500c;

            public t(InterfaceC5581d interfaceC5581d, Download download, List list) {
                this.f32498a = interfaceC5581d;
                this.f32499b = download;
                this.f32500c = list;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32498a.mo11833b(this.f32499b, Reason.DOWNLOAD_STARTED);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$u */
        public static final class u implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9963f f32501a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32502b;

            public u(InterfaceC9963f interfaceC9963f, Download download) {
                this.f32501a = interfaceC9963f;
                this.f32502b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32501a.mo10661m(this.f32502b);
            }
        }

        /* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.ListenerCoordinator$a$v */
        public static final class v implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC5581d f32503a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Download f32504b;

            public v(InterfaceC5581d interfaceC5581d, Download download) {
                this.f32503a = interfaceC5581d;
                this.f32504b = download;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f32503a.mo11833b(this.f32504b, Reason.DOWNLOAD_WAITING_ON_NETWORK);
            }
        }

        public C4972a() {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: b */
        public final void mo10657b(DownloadInfo downloadInfo, DownloadBlockInfo downloadBlockInfo, int i10) {
            C5207g.m11112g(downloadInfo, "download");
            C5207g.m11112g(downloadBlockInfo, "downloadBlock");
            synchronized (ListenerCoordinator.this.f32441a) {
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            interfaceC9963f.mo10657b(downloadInfo, downloadBlockInfo, i10);
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    ListenerCoordinator.this.f32448h.m12713c(downloadInfo.f32335e, downloadInfo, Reason.DOWNLOAD_BLOCK_UPDATED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                interfaceC9961d.m18539h();
                            }
                        }
                    }
                }
                C9072e c9072e = C9072e.f47360a;
            }
        }

        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: e */
        public final void mo10658e(Download download, List<Object> list, int i10) {
            C5207g.m11112g(download, "download");
            C5207g.m11112g(list, "downloadBlocks");
            synchronized (ListenerCoordinator.this.f32441a) {
                ListenerCoordinator.this.f32445e.post(new r(download, list));
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            ListenerCoordinator.this.f32450j.post(new s(interfaceC9963f, download, list, i10));
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_STARTED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                interfaceC9961d.m18542l();
                            }
                        }
                    }
                } else {
                    ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_STARTED);
                }
                List list2 = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                if (list2 != null) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                        if (interfaceC5581d != null) {
                            ListenerCoordinator.this.f32450j.post(new t(interfaceC5581d, download, list));
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: g */
        public final void mo10659g(Download download, Error error, Throwable th2) {
            C5207g.m11112g(download, "download");
            C5207g.m11112g(error, "error");
            synchronized (ListenerCoordinator.this.f32441a) {
                try {
                    ListenerCoordinator.this.f32445e.post(new j(download));
                    Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((Set) it.next()).iterator();
                        while (it2.hasNext()) {
                            InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                            if (interfaceC9963f == null) {
                                it2.remove();
                            } else {
                                ListenerCoordinator.this.f32450j.post(new k(interfaceC9963f, download, error, th2));
                            }
                        }
                    }
                    if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                        ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_ERROR);
                        Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((Set) it3.next()).iterator();
                            while (it4.hasNext()) {
                                InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                                if (interfaceC9961d == null) {
                                    it4.remove();
                                } else {
                                    interfaceC9961d.m18535a();
                                }
                            }
                        }
                    } else {
                        ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_ERROR);
                    }
                    List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                    if (list != null) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new l(interfaceC5581d, download));
                            }
                        }
                        C9072e c9072e = C9072e.f47360a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: k */
        public final void mo10660k(Download download) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            ListenerCoordinator.this.f32450j.post(new a(interfaceC9963f, download));
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    int f32335e = download.getF32335e();
                    C2040a c2040aM12713c = ListenerCoordinator.this.f32448h.m12713c(f32335e, download, Reason.DOWNLOAD_ADDED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                ListenerCoordinator.this.f32450j.post(new b(interfaceC9961d, f32335e, c2040aM12713c, download));
                            }
                        }
                    }
                } else {
                    ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_ADDED);
                }
                List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    loop4: while (true) {
                        while (true) {
                            if (!it5.hasNext()) {
                                break loop4;
                            }
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new c(interfaceC5581d, download));
                            }
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: m */
        public final void mo10661m(Download download) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                try {
                    Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((Set) it.next()).iterator();
                        while (it2.hasNext()) {
                            InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                            if (interfaceC9963f == null) {
                                it2.remove();
                            } else {
                                ListenerCoordinator.this.f32450j.post(new u(interfaceC9963f, download));
                            }
                        }
                    }
                    if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                        ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_WAITING_ON_NETWORK);
                        Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((Set) it3.next()).iterator();
                            while (it4.hasNext()) {
                                InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                                if (interfaceC9961d == null) {
                                    it4.remove();
                                } else {
                                    interfaceC9961d.m18540i();
                                }
                            }
                        }
                    } else {
                        ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_WAITING_ON_NETWORK);
                    }
                    List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                    if (list != null) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new v(interfaceC5581d, download));
                            }
                        }
                        C9072e c9072e = C9072e.f47360a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: n */
        public final void mo10662n(Download download, long j10, long j11) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                ListenerCoordinator.this.f32445e.post(new m(download));
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            ListenerCoordinator.this.f32450j.post(new n(interfaceC9963f, download, j10, j11));
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_PROGRESS_CHANGED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                interfaceC9961d.m18536c();
                            }
                        }
                    }
                } else {
                    ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_PROGRESS_CHANGED);
                }
                List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                        if (interfaceC5581d != null) {
                            ListenerCoordinator.this.f32450j.post(new o(interfaceC5581d, download));
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: o */
        public final void mo10663o(Download download) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                ListenerCoordinator.this.f32445e.post(new d(download));
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            ListenerCoordinator.this.f32450j.post(new e(interfaceC9963f, download));
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_CANCELLED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                interfaceC9961d.m18543p();
                            }
                        }
                    }
                } else {
                    ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_CANCELLED);
                }
                List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    loop4: while (true) {
                        while (true) {
                            if (!it5.hasNext()) {
                                break loop4;
                            }
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new f(interfaceC5581d, download));
                            }
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }

        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: q */
        public final void mo10664q(Download download) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                try {
                    ListenerCoordinator.this.f32445e.post(new g(download));
                    Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((Set) it.next()).iterator();
                        while (it2.hasNext()) {
                            InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                            if (interfaceC9963f == null) {
                                it2.remove();
                            } else {
                                ListenerCoordinator.this.f32450j.post(new h(interfaceC9963f, download));
                            }
                        }
                    }
                    if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                        ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_COMPLETED);
                        Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                        while (it3.hasNext()) {
                            Iterator it4 = ((Set) it3.next()).iterator();
                            while (it4.hasNext()) {
                                InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                                if (interfaceC9961d == null) {
                                    it4.remove();
                                } else {
                                    interfaceC9961d.m18537d();
                                }
                            }
                        }
                    } else {
                        ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_COMPLETED);
                    }
                    List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                    if (list != null) {
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new i(interfaceC5581d, download));
                            }
                        }
                        C9072e c9072e = C9072e.f47360a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p463wk.InterfaceC9963f
        /* JADX INFO: renamed from: r */
        public final void mo10665r(Download download, boolean z10) {
            C5207g.m11112g(download, "download");
            synchronized (ListenerCoordinator.this.f32441a) {
                Iterator it = ListenerCoordinator.this.f32442b.values().iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((Set) it.next()).iterator();
                    while (it2.hasNext()) {
                        InterfaceC9963f interfaceC9963f = (InterfaceC9963f) ((WeakReference) it2.next()).get();
                        if (interfaceC9963f == null) {
                            it2.remove();
                        } else {
                            ListenerCoordinator.this.f32450j.post(new p(interfaceC9963f, download, z10));
                        }
                    }
                }
                if (!ListenerCoordinator.this.f32443c.isEmpty()) {
                    ListenerCoordinator.this.f32448h.m12713c(download.getF32335e(), download, Reason.DOWNLOAD_QUEUED);
                    Iterator it3 = ListenerCoordinator.this.f32443c.values().iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((Set) it3.next()).iterator();
                        while (it4.hasNext()) {
                            InterfaceC9961d interfaceC9961d = (InterfaceC9961d) ((WeakReference) it4.next()).get();
                            if (interfaceC9961d == null) {
                                it4.remove();
                            } else {
                                interfaceC9961d.m18538f();
                            }
                        }
                    }
                } else {
                    ListenerCoordinator.this.f32448h.m12714d(download.getF32335e(), download, Reason.DOWNLOAD_QUEUED);
                }
                List list = (List) ListenerCoordinator.this.f32446f.get(Integer.valueOf(download.getF32331a()));
                if (list != null) {
                    Iterator it5 = list.iterator();
                    loop4: while (true) {
                        while (true) {
                            if (!it5.hasNext()) {
                                break loop4;
                            }
                            InterfaceC5581d interfaceC5581d = (InterfaceC5581d) ((WeakReference) it5.next()).get();
                            if (interfaceC5581d != null) {
                                ListenerCoordinator.this.f32450j.post(new q(interfaceC5581d, download));
                            }
                        }
                    }
                    C9072e c9072e = C9072e.f47360a;
                }
            }
        }
    }

    public ListenerCoordinator(String str, C6195n c6195n, C1702c c1702c, Handler handler) {
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(handler, "uiHandler");
        this.f32448h = c6195n;
        this.f32449i = c1702c;
        this.f32450j = handler;
        this.f32441a = new Object();
        this.f32442b = new LinkedHashMap();
        this.f32443c = new LinkedHashMap();
        this.f32444d = new ArrayList();
        this.f32445e = (Handler) ListenerCoordinator$fetchNotificationHandler$1.f32505b.mo807E();
        this.f32446f = new LinkedHashMap();
        this.f32447g = new C4972a();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m10655a() {
        synchronized (this.f32441a) {
            try {
                this.f32442b.clear();
                this.f32443c.clear();
                this.f32444d.clear();
                this.f32446f.clear();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10656b(int i10, InterfaceC9963f interfaceC9963f) {
        C5207g.m11112g(interfaceC9963f, "fetchListener");
        synchronized (this.f32441a) {
            try {
                Set set = (Set) this.f32442b.get(Integer.valueOf(i10));
                Iterator it = null;
                Iterator it2 = set != null ? set.iterator() : null;
                if (it2 != null) {
                    while (it2.hasNext()) {
                        if (C5207g.m11106a((InterfaceC9963f) ((WeakReference) it2.next()).get(), interfaceC9963f)) {
                            it2.remove();
                            break;
                        }
                    }
                }
                if (interfaceC9963f instanceof InterfaceC9961d) {
                    Set set2 = (Set) this.f32443c.get(Integer.valueOf(i10));
                    if (set2 != null) {
                        it = set2.iterator();
                    }
                    if (it != null) {
                        while (it.hasNext()) {
                            if (C5207g.m11106a((InterfaceC9961d) ((WeakReference) it.next()).get(), interfaceC9963f)) {
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
}
