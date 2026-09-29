package p463wk;

import al.InterfaceC0114a;
import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.C0166e;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.database.DownloadInfo;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import kotlin.TypeCastException;
import p122fl.C5578a;
import p122fl.C5580c;
import p122fl.InterfaceC5582e;
import p122fl.InterfaceC5587j;
import p122fl.InterfaceC5589l;
import p489xk.InterfaceC10219g;

/* JADX INFO: renamed from: wk.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C9959b {

    /* JADX INFO: renamed from: a */
    public final Context f50655a;

    /* JADX INFO: renamed from: b */
    public final String f50656b;

    /* JADX INFO: renamed from: c */
    public final int f50657c;

    /* JADX INFO: renamed from: d */
    public final long f50658d;

    /* JADX INFO: renamed from: e */
    public final boolean f50659e;

    /* JADX INFO: renamed from: f */
    public final Downloader<?, ?> f50660f;

    /* JADX INFO: renamed from: g */
    public final NetworkType f50661g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5587j f50662h;

    /* JADX INFO: renamed from: i */
    public final boolean f50663i;

    /* JADX INFO: renamed from: j */
    public final boolean f50664j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5582e f50665k;

    /* JADX INFO: renamed from: l */
    public final boolean f50666l;

    /* JADX INFO: renamed from: m */
    public final boolean f50667m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC5589l f50668n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC9964g f50669o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC10219g<DownloadInfo> f50670p;

    /* JADX INFO: renamed from: q */
    public final Handler f50671q;

    /* JADX INFO: renamed from: r */
    public final PrioritySort f50672r;

    /* JADX INFO: renamed from: s */
    public final String f50673s;

    /* JADX INFO: renamed from: t */
    public final long f50674t;

    /* JADX INFO: renamed from: u */
    public final boolean f50675u;

    /* JADX INFO: renamed from: v */
    public final int f50676v;

    /* JADX INFO: renamed from: w */
    public final boolean f50677w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC0114a f50678x;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C9959b() {
        throw null;
    }

    public C9959b(Context context, String str, int i10, long j10, boolean z10, Downloader downloader, NetworkType networkType, C5580c c5580c, boolean z11, boolean z12, C9960c c9960c, boolean z13, C5578a c5578a, PrioritySort prioritySort, long j11, boolean z14, int i11, boolean z15) {
        this.f50655a = context;
        this.f50656b = str;
        this.f50657c = i10;
        this.f50658d = j10;
        this.f50659e = z10;
        this.f50660f = downloader;
        this.f50661g = networkType;
        this.f50662h = c5580c;
        this.f50663i = z11;
        this.f50664j = z12;
        this.f50665k = c9960c;
        this.f50666l = false;
        this.f50667m = z13;
        this.f50668n = c5578a;
        this.f50669o = null;
        this.f50670p = null;
        this.f50671q = null;
        this.f50672r = prioritySort;
        this.f50673s = null;
        this.f50674t = j11;
        this.f50675u = z14;
        this.f50676v = i11;
        this.f50677w = z15;
        this.f50678x = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C9959b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.FetchConfiguration");
        }
        C9959b c9959b = (C9959b) obj;
        return !(C5207g.m11106a(this.f50655a, c9959b.f50655a) ^ true) && !(C5207g.m11106a(this.f50656b, c9959b.f50656b) ^ true) && this.f50657c == c9959b.f50657c && this.f50658d == c9959b.f50658d && this.f50659e == c9959b.f50659e && !(C5207g.m11106a(this.f50660f, c9959b.f50660f) ^ true) && this.f50661g == c9959b.f50661g && !(C5207g.m11106a(this.f50662h, c9959b.f50662h) ^ true) && this.f50663i == c9959b.f50663i && this.f50664j == c9959b.f50664j && !(C5207g.m11106a(this.f50665k, c9959b.f50665k) ^ true) && this.f50666l == c9959b.f50666l && this.f50667m == c9959b.f50667m && !(C5207g.m11106a(this.f50668n, c9959b.f50668n) ^ true) && !(C5207g.m11106a(this.f50669o, c9959b.f50669o) ^ true) && !(C5207g.m11106a(this.f50670p, c9959b.f50670p) ^ true) && !(C5207g.m11106a(this.f50671q, c9959b.f50671q) ^ true) && this.f50672r == c9959b.f50672r && !(C5207g.m11106a(this.f50673s, c9959b.f50673s) ^ true) && this.f50674t == c9959b.f50674t && this.f50675u == c9959b.f50675u && this.f50676v == c9959b.f50676v && this.f50677w == c9959b.f50677w && !(C5207g.m11106a(this.f50678x, c9959b.f50678x) ^ true);
    }

    public final int hashCode() {
        int iHashCode = this.f50668n.hashCode() + ((Boolean.valueOf(this.f50667m).hashCode() + ((Boolean.valueOf(this.f50666l).hashCode() + ((this.f50665k.hashCode() + ((Boolean.valueOf(this.f50664j).hashCode() + ((Boolean.valueOf(this.f50663i).hashCode() + ((this.f50662h.hashCode() + ((this.f50661g.hashCode() + ((this.f50660f.hashCode() + ((Boolean.valueOf(this.f50659e).hashCode() + ((Long.valueOf(this.f50658d).hashCode() + ((C0166e.m758d(this.f50656b, this.f50655a.hashCode() * 31, 31) + this.f50657c) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
        InterfaceC9964g interfaceC9964g = this.f50669o;
        if (interfaceC9964g != null) {
            iHashCode = (iHashCode * 31) + interfaceC9964g.hashCode();
        }
        InterfaceC10219g<DownloadInfo> interfaceC10219g = this.f50670p;
        if (interfaceC10219g != null) {
            iHashCode = (iHashCode * 31) + interfaceC10219g.hashCode();
        }
        Handler handler = this.f50671q;
        if (handler != null) {
            iHashCode = (iHashCode * 31) + handler.hashCode();
        }
        InterfaceC0114a interfaceC0114a = this.f50678x;
        if (interfaceC0114a != null) {
            iHashCode = (iHashCode * 31) + interfaceC0114a.hashCode();
        }
        int iHashCode2 = this.f50672r.hashCode() + (iHashCode * 31);
        String str = this.f50673s;
        if (str != null) {
            iHashCode2 = (iHashCode2 * 31) + str.hashCode();
        }
        return Boolean.valueOf(this.f50677w).hashCode() + ((Integer.valueOf(this.f50676v).hashCode() + ((Boolean.valueOf(this.f50675u).hashCode() + ((Long.valueOf(this.f50674t).hashCode() + (iHashCode2 * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FetchConfiguration(appContext=" + this.f50655a + ", namespace='" + this.f50656b + "', concurrentLimit=" + this.f50657c + ", progressReportingIntervalMillis=" + this.f50658d + ", loggingEnabled=" + this.f50659e + ", httpDownloader=" + this.f50660f + ", globalNetworkType=" + this.f50661g + ", logger=" + this.f50662h + ", autoStart=" + this.f50663i + ", retryOnNetworkGain=" + this.f50664j + ", fileServerDownloader=" + this.f50665k + ", hashCheckingEnabled=" + this.f50666l + ", fileExistChecksEnabled=" + this.f50667m + ", storageResolver=" + this.f50668n + ", fetchNotificationManager=" + this.f50669o + ", fetchDatabaseManager=" + this.f50670p + ", backgroundHandler=" + this.f50671q + ", prioritySort=" + this.f50672r + ", internetCheckUrl=" + this.f50673s + ", activeDownloadsCheckInterval=" + this.f50674t + ", createFileOnEnqueue=" + this.f50675u + ", preAllocateFileOnCreation=" + this.f50677w + ", maxAutoRetryAttempts=" + this.f50676v + ", fetchHandler=" + this.f50678x + ')';
    }
}
