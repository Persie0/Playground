package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import dm.C5206f;
import java.util.List;
import java.util.Map;
import p196ja.AbstractC6440c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2490c extends AbstractC6440c {

    /* JADX INFO: renamed from: d */
    public final int f13227d;

    /* JADX INFO: renamed from: e */
    public final long f13228e;

    /* JADX INFO: renamed from: f */
    public final boolean f13229f;

    /* JADX INFO: renamed from: g */
    public final boolean f13230g;

    /* JADX INFO: renamed from: h */
    public final long f13231h;

    /* JADX INFO: renamed from: i */
    public final boolean f13232i;

    /* JADX INFO: renamed from: j */
    public final int f13233j;

    /* JADX INFO: renamed from: k */
    public final long f13234k;

    /* JADX INFO: renamed from: l */
    public final int f13235l;

    /* JADX INFO: renamed from: m */
    public final long f13236m;

    /* JADX INFO: renamed from: n */
    public final long f13237n;

    /* JADX INFO: renamed from: o */
    public final boolean f13238o;

    /* JADX INFO: renamed from: p */
    public final boolean f13239p;

    /* JADX INFO: renamed from: q */
    public final DrmInitData f13240q;

    /* JADX INFO: renamed from: r */
    public final ImmutableList f13241r;

    /* JADX INFO: renamed from: s */
    public final ImmutableList f13242s;

    /* JADX INFO: renamed from: t */
    public final ImmutableMap f13243t;

    /* JADX INFO: renamed from: u */
    public final long f13244u;

    /* JADX INFO: renamed from: v */
    public final e f13245v;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$a */
    public static final class a extends d {

        /* JADX INFO: renamed from: H */
        public final boolean f13246H;

        /* JADX INFO: renamed from: l */
        public final boolean f13247l;

        public a(String str, c cVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10, boolean z11, boolean z12) {
            super(str, cVar, j10, i10, j11, drmInitData, str2, str3, j12, j13, z10);
            this.f13247l = z11;
            this.f13246H = z12;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final Uri f13248a;

        /* JADX INFO: renamed from: b */
        public final long f13249b;

        /* JADX INFO: renamed from: c */
        public final int f13250c;

        public b(Uri uri, long j10, int i10) {
            this.f13248a = uri;
            this.f13249b = j10;
            this.f13250c = i10;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$c */
    public static final class c extends d {

        /* JADX INFO: renamed from: H */
        public final ImmutableList f13251H;

        /* JADX INFO: renamed from: l */
        public final String f13252l;

        public c(long j10, long j11, String str, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j10, j11, false, ImmutableList.m9062Y());
        }

        public c(String str, c cVar, String str2, long j10, int i10, long j11, DrmInitData drmInitData, String str3, String str4, long j12, long j13, boolean z10, List<a> list) {
            super(str, cVar, j10, i10, j11, drmInitData, str3, str4, j12, j13, z10);
            this.f13252l = str2;
            this.f13251H = ImmutableList.m9060Q(list);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$d */
    public static class d implements Comparable<Long> {

        /* JADX INFO: renamed from: a */
        public final String f13253a;

        /* JADX INFO: renamed from: b */
        public final c f13254b;

        /* JADX INFO: renamed from: c */
        public final long f13255c;

        /* JADX INFO: renamed from: d */
        public final int f13256d;

        /* JADX INFO: renamed from: e */
        public final long f13257e;

        /* JADX INFO: renamed from: f */
        public final DrmInitData f13258f;

        /* JADX INFO: renamed from: g */
        public final String f13259g;

        /* JADX INFO: renamed from: h */
        public final String f13260h;

        /* JADX INFO: renamed from: i */
        public final long f13261i;

        /* JADX INFO: renamed from: j */
        public final long f13262j;

        /* JADX INFO: renamed from: k */
        public final boolean f13263k;

        public d(String str, c cVar, long j10, int i10, long j11, DrmInitData drmInitData, String str2, String str3, long j12, long j13, boolean z10) {
            this.f13253a = str;
            this.f13254b = cVar;
            this.f13255c = j10;
            this.f13256d = i10;
            this.f13257e = j11;
            this.f13258f = drmInitData;
            this.f13259g = str2;
            this.f13260h = str3;
            this.f13261i = j12;
            this.f13262j = j13;
            this.f13263k = z10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l10) {
            Long l11 = l10;
            long jLongValue = l11.longValue();
            long j10 = this.f13257e;
            if (j10 > jLongValue) {
                return 1;
            }
            return j10 < l11.longValue() ? -1 : 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.c$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public final long f13264a;

        /* JADX INFO: renamed from: b */
        public final boolean f13265b;

        /* JADX INFO: renamed from: c */
        public final long f13266c;

        /* JADX INFO: renamed from: d */
        public final long f13267d;

        /* JADX INFO: renamed from: e */
        public final boolean f13268e;

        public e(long j10, boolean z10, long j11, long j12, boolean z11) {
            this.f13264a = j10;
            this.f13265b = z10;
            this.f13266c = j11;
            this.f13267d = j12;
            this.f13268e = z11;
        }
    }

    public C2490c(int i10, String str, List<String> list, long j10, boolean z10, long j11, boolean z11, int i11, long j12, int i12, long j13, long j14, boolean z12, boolean z13, boolean z14, DrmInitData drmInitData, List<c> list2, List<a> list3, e eVar, Map<Uri, b> map) {
        super(str, list, z12);
        this.f13227d = i10;
        this.f13231h = j11;
        this.f13230g = z10;
        this.f13232i = z11;
        this.f13233j = i11;
        this.f13234k = j12;
        this.f13235l = i12;
        this.f13236m = j13;
        this.f13237n = j14;
        this.f13238o = z13;
        this.f13239p = z14;
        this.f13240q = drmInitData;
        this.f13241r = ImmutableList.m9060Q(list2);
        this.f13242s = ImmutableList.m9060Q(list3);
        this.f13243t = ImmutableMap.m9069a(map);
        if (!list3.isEmpty()) {
            a aVar = (a) C5206f.m11002X0(list3);
            this.f13244u = aVar.f13257e + aVar.f13255c;
        } else if (list2.isEmpty()) {
            this.f13244u = 0L;
        } else {
            c cVar = (c) C5206f.m11002X0(list2);
            this.f13244u = cVar.f13257e + cVar.f13255c;
        }
        this.f13228e = j10 != -9223372036854775807L ? j10 >= 0 ? Math.min(this.f13244u, j10) : Math.max(0L, this.f13244u + j10) : -9223372036854775807L;
        this.f13229f = j10 >= 0;
        this.f13245v = eVar;
    }

    @Override // p114fa.InterfaceC5483a
    /* JADX INFO: renamed from: a */
    public final AbstractC6440c mo7321a(List list) {
        return this;
    }
}
