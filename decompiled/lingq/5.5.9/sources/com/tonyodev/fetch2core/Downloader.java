package com.tonyodev.fetch2core;

import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p122fl.InterfaceC5586i;

/* JADX INFO: loaded from: classes2.dex */
public interface Downloader<T, R> extends Closeable {

    @Metadata(m13363bv = {1, InstallReferrerClient.InstallReferrerResponse.f10530OK, 3}, m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/tonyodev/fetch2core/Downloader$FileDownloaderType;", "", "(Ljava/lang/String;I)V", "SEQUENTIAL", "PARALLEL", "fetch2core_release"}, m13366k = 1, m13367mv = {1, 1, 16})
    public enum FileDownloaderType {
        SEQUENTIAL,
        PARALLEL
    }

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.Downloader$a */
    public static class C4979a {

        /* JADX INFO: renamed from: a */
        public final int f32521a;

        /* JADX INFO: renamed from: b */
        public final boolean f32522b;

        /* JADX INFO: renamed from: c */
        public final long f32523c;

        /* JADX INFO: renamed from: d */
        public final InputStream f32524d;

        /* JADX INFO: renamed from: e */
        public final C4980b f32525e;

        /* JADX INFO: renamed from: f */
        public final String f32526f;

        /* JADX INFO: renamed from: g */
        public final Map<String, List<String>> f32527g;

        /* JADX INFO: renamed from: h */
        public final boolean f32528h;

        /* JADX INFO: renamed from: i */
        public final String f32529i;

        /* JADX WARN: Multi-variable type inference failed */
        public C4979a(int i10, boolean z10, long j10, InputStream inputStream, C4980b c4980b, String str, Map<String, ? extends List<String>> map, boolean z11, String str2) {
            C5207g.m11112g(c4980b, "request");
            C5207g.m11112g(str, "hash");
            C5207g.m11112g(map, "responseHeaders");
            this.f32521a = i10;
            this.f32522b = z10;
            this.f32523c = j10;
            this.f32524d = inputStream;
            this.f32525e = c4980b;
            this.f32526f = str;
            this.f32527g = map;
            this.f32528h = z11;
            this.f32529i = str2;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m10680a() {
            return this.f32528h;
        }

        /* JADX INFO: renamed from: b */
        public final long m10681b() {
            return this.f32523c;
        }

        /* JADX INFO: renamed from: c */
        public final String m10682c() {
            return this.f32526f;
        }

        /* JADX INFO: renamed from: d */
        public final C4980b m10683d() {
            return this.f32525e;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m10684e() {
            return this.f32522b;
        }
    }

    /* JADX INFO: renamed from: com.tonyodev.fetch2core.Downloader$b */
    public static class C4980b {

        /* JADX INFO: renamed from: a */
        public final int f32530a;

        /* JADX INFO: renamed from: b */
        public final String f32531b;

        /* JADX INFO: renamed from: c */
        public final Map<String, String> f32532c;

        /* JADX INFO: renamed from: d */
        public final String f32533d;

        /* JADX INFO: renamed from: e */
        public final Uri f32534e;

        /* JADX INFO: renamed from: f */
        public final String f32535f;

        /* JADX INFO: renamed from: g */
        public final long f32536g;

        /* JADX INFO: renamed from: h */
        public final String f32537h;

        /* JADX INFO: renamed from: i */
        public final Extras f32538i;

        /* JADX INFO: renamed from: j */
        public final int f32539j;

        public C4980b(int i10, String str, Map map, String str2, Uri uri, String str3, long j10, String str4, Extras extras, String str5, int i11) {
            C5207g.m11112g(str, "url");
            C5207g.m11112g(map, "headers");
            C5207g.m11112g(str2, "file");
            C5207g.m11112g(uri, "fileUri");
            C5207g.m11112g(str4, "requestMethod");
            C5207g.m11112g(extras, "extras");
            this.f32530a = i10;
            this.f32531b = str;
            this.f32532c = map;
            this.f32533d = str2;
            this.f32534e = uri;
            this.f32535f = str3;
            this.f32536g = j10;
            this.f32537h = str4;
            this.f32538i = extras;
            this.f32539j = i11;
        }
    }

    /* JADX INFO: renamed from: D0 */
    void mo10672D0(C4980b c4980b);

    /* JADX INFO: renamed from: K */
    boolean mo10673K(C4980b c4980b, String str);

    /* JADX INFO: renamed from: Y0 */
    Set<FileDownloaderType> mo10674Y0(C4980b c4980b);

    /* JADX INFO: renamed from: p */
    C4979a mo10675p(C4980b c4980b, InterfaceC5586i interfaceC5586i);

    /* JADX INFO: renamed from: p0 */
    void mo10676p0(C4979a c4979a);

    /* JADX INFO: renamed from: s */
    void mo10677s(C4980b c4980b);

    /* JADX INFO: renamed from: t0 */
    void mo10678t0(C4980b c4980b);

    /* JADX INFO: renamed from: u0 */
    FileDownloaderType mo10679u0(C4980b c4980b, Set<? extends FileDownloaderType> set);
}
