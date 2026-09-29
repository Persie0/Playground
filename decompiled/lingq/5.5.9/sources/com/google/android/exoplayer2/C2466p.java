package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import ge.C5789m;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p150h9.C5931p;
import p291o7.C8002l;
import p402u0.C9362e;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2466p implements InterfaceC2409f {

    /* JADX INFO: renamed from: a */
    public final String f12771a;

    /* JADX INFO: renamed from: b */
    public final g f12772b;

    /* JADX INFO: renamed from: c */
    public final e f12773c;

    /* JADX INFO: renamed from: d */
    public final C2467q f12774d;

    /* JADX INFO: renamed from: e */
    public final c f12775e;

    /* JADX INFO: renamed from: f */
    public final h f12776f;

    /* JADX INFO: renamed from: g */
    public static final C2466p f12765g = new a().m7213a();

    /* JADX INFO: renamed from: h */
    public static final String f12766h = C10134c0.m19021F(0);

    /* JADX INFO: renamed from: i */
    public static final String f12767i = C10134c0.m19021F(1);

    /* JADX INFO: renamed from: j */
    public static final String f12768j = C10134c0.m19021F(2);

    /* JADX INFO: renamed from: k */
    public static final String f12769k = C10134c0.m19021F(3);

    /* JADX INFO: renamed from: l */
    public static final String f12770l = C10134c0.m19021F(4);

    /* JADX INFO: renamed from: H */
    public static final C5789m f12764H = new C5789m(5);

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f12777a;

        /* JADX INFO: renamed from: b */
        public Uri f12778b;

        /* JADX INFO: renamed from: c */
        public final String f12779c;

        /* JADX INFO: renamed from: d */
        public final b.a f12780d;

        /* JADX INFO: renamed from: e */
        public d.a f12781e;

        /* JADX INFO: renamed from: f */
        public final List<StreamKey> f12782f;

        /* JADX INFO: renamed from: g */
        public String f12783g;

        /* JADX INFO: renamed from: h */
        public ImmutableList<j> f12784h;

        /* JADX INFO: renamed from: i */
        public Object f12785i;

        /* JADX INFO: renamed from: j */
        public final C2467q f12786j;

        /* JADX INFO: renamed from: k */
        public e.a f12787k;

        /* JADX INFO: renamed from: l */
        public final h f12788l;

        public a() {
            this.f12780d = new b.a();
            this.f12781e = new d.a();
            this.f12782f = Collections.emptyList();
            this.f12784h = ImmutableList.m9062Y();
            this.f12787k = new e.a();
            this.f12788l = h.f12847c;
        }

        public a(C2466p c2466p) {
            this();
            c cVar = c2466p.f12775e;
            cVar.getClass();
            this.f12780d = new b.a(cVar);
            this.f12777a = c2466p.f12771a;
            this.f12786j = c2466p.f12774d;
            e eVar = c2466p.f12773c;
            eVar.getClass();
            this.f12787k = new e.a(eVar);
            this.f12788l = c2466p.f12776f;
            g gVar = c2466p.f12772b;
            if (gVar != null) {
                this.f12783g = gVar.f12844e;
                this.f12779c = gVar.f12841b;
                this.f12778b = gVar.f12840a;
                this.f12782f = gVar.f12843d;
                this.f12784h = gVar.f12845f;
                this.f12785i = gVar.f12846g;
                d dVar = gVar.f12842c;
                this.f12781e = dVar != null ? new d.a(dVar) : new d.a();
            }
        }

        /* JADX INFO: renamed from: a */
        public final C2466p m7213a() {
            g gVar;
            d.a aVar = this.f12781e;
            C10129a.m18992d(aVar.f12816b == null || aVar.f12815a != null);
            Uri uri = this.f12778b;
            if (uri != null) {
                String str = this.f12779c;
                d.a aVar2 = this.f12781e;
                gVar = new g(uri, str, aVar2.f12815a != null ? new d(aVar2) : null, this.f12782f, this.f12783g, this.f12784h, this.f12785i);
            } else {
                gVar = null;
            }
            String str2 = this.f12777a;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            b.a aVar3 = this.f12780d;
            aVar3.getClass();
            c cVar = new c(aVar3);
            e.a aVar4 = this.f12787k;
            aVar4.getClass();
            e eVar = new e(aVar4.f12835a, aVar4.f12836b, aVar4.f12837c, aVar4.f12838d, aVar4.f12839e);
            C2467q c2467q = this.f12786j;
            if (c2467q == null) {
                c2467q = C2467q.f12883d0;
            }
            return new C2466p(str3, cVar, gVar, eVar, c2467q, this.f12788l);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$b */
    public static class b implements InterfaceC2409f {

        /* JADX INFO: renamed from: f */
        public static final c f12789f = new c(new a());

        /* JADX INFO: renamed from: g */
        public static final String f12790g = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: h */
        public static final String f12791h = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: i */
        public static final String f12792i = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: j */
        public static final String f12793j = C10134c0.m19021F(3);

        /* JADX INFO: renamed from: k */
        public static final String f12794k = C10134c0.m19021F(4);

        /* JADX INFO: renamed from: l */
        public static final C9362e f12795l = new C9362e(13);

        /* JADX INFO: renamed from: a */
        public final long f12796a;

        /* JADX INFO: renamed from: b */
        public final long f12797b;

        /* JADX INFO: renamed from: c */
        public final boolean f12798c;

        /* JADX INFO: renamed from: d */
        public final boolean f12799d;

        /* JADX INFO: renamed from: e */
        public final boolean f12800e;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.p$b$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f12801a;

            /* JADX INFO: renamed from: b */
            public long f12802b;

            /* JADX INFO: renamed from: c */
            public boolean f12803c;

            /* JADX INFO: renamed from: d */
            public boolean f12804d;

            /* JADX INFO: renamed from: e */
            public boolean f12805e;

            public a() {
                this.f12802b = Long.MIN_VALUE;
            }

            public a(c cVar) {
                this.f12801a = cVar.f12796a;
                this.f12802b = cVar.f12797b;
                this.f12803c = cVar.f12798c;
                this.f12804d = cVar.f12799d;
                this.f12805e = cVar.f12800e;
            }
        }

        public b(a aVar) {
            this.f12796a = aVar.f12801a;
            this.f12797b = aVar.f12802b;
            this.f12798c = aVar.f12803c;
            this.f12799d = aVar.f12804d;
            this.f12800e = aVar.f12805e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f12796a == bVar.f12796a && this.f12797b == bVar.f12797b && this.f12798c == bVar.f12798c && this.f12799d == bVar.f12799d && this.f12800e == bVar.f12800e;
        }

        public final int hashCode() {
            long j10 = this.f12796a;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f12797b;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f12798c ? 1 : 0)) * 31) + (this.f12799d ? 1 : 0)) * 31) + (this.f12800e ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$c */
    @Deprecated
    public static final class c extends b {

        /* JADX INFO: renamed from: H */
        public static final c f12806H = new c(new b.a());

        public c(b.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final UUID f12807a;

        /* JADX INFO: renamed from: b */
        public final Uri f12808b;

        /* JADX INFO: renamed from: c */
        public final ImmutableMap<String, String> f12809c;

        /* JADX INFO: renamed from: d */
        public final boolean f12810d;

        /* JADX INFO: renamed from: e */
        public final boolean f12811e;

        /* JADX INFO: renamed from: f */
        public final boolean f12812f;

        /* JADX INFO: renamed from: g */
        public final ImmutableList<Integer> f12813g;

        /* JADX INFO: renamed from: h */
        public final byte[] f12814h;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.p$d$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final UUID f12815a;

            /* JADX INFO: renamed from: b */
            public final Uri f12816b;

            /* JADX INFO: renamed from: c */
            public final ImmutableMap<String, String> f12817c;

            /* JADX INFO: renamed from: d */
            public final boolean f12818d;

            /* JADX INFO: renamed from: e */
            public final boolean f12819e;

            /* JADX INFO: renamed from: f */
            public final boolean f12820f;

            /* JADX INFO: renamed from: g */
            public final ImmutableList<Integer> f12821g;

            /* JADX INFO: renamed from: h */
            public final byte[] f12822h;

            public a() {
                this.f12817c = ImmutableMap.m9070h();
                this.f12821g = ImmutableList.m9062Y();
            }

            public a(d dVar) {
                this.f12815a = dVar.f12807a;
                this.f12816b = dVar.f12808b;
                this.f12817c = dVar.f12809c;
                this.f12818d = dVar.f12810d;
                this.f12819e = dVar.f12811e;
                this.f12820f = dVar.f12812f;
                this.f12821g = dVar.f12813g;
                this.f12822h = dVar.f12814h;
            }
        }

        public d(a aVar) {
            boolean z10 = aVar.f12820f;
            Uri uri = aVar.f12816b;
            C10129a.m18992d((z10 && uri == null) ? false : true);
            UUID uuid = aVar.f12815a;
            uuid.getClass();
            this.f12807a = uuid;
            this.f12808b = uri;
            this.f12809c = aVar.f12817c;
            this.f12810d = aVar.f12818d;
            this.f12812f = z10;
            this.f12811e = aVar.f12819e;
            this.f12813g = aVar.f12821g;
            byte[] bArr = aVar.f12822h;
            this.f12814h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f12807a.equals(dVar.f12807a) && C10134c0.m19034a(this.f12808b, dVar.f12808b) && C10134c0.m19034a(this.f12809c, dVar.f12809c) && this.f12810d == dVar.f12810d && this.f12812f == dVar.f12812f && this.f12811e == dVar.f12811e && this.f12813g.equals(dVar.f12813g) && Arrays.equals(this.f12814h, dVar.f12814h);
        }

        public final int hashCode() {
            int iHashCode = this.f12807a.hashCode() * 31;
            Uri uri = this.f12808b;
            return Arrays.hashCode(this.f12814h) + ((this.f12813g.hashCode() + ((((((((this.f12809c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.f12810d ? 1 : 0)) * 31) + (this.f12812f ? 1 : 0)) * 31) + (this.f12811e ? 1 : 0)) * 31)) * 31);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$e */
    public static final class e implements InterfaceC2409f {

        /* JADX INFO: renamed from: f */
        public static final e f12823f = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

        /* JADX INFO: renamed from: g */
        public static final String f12824g = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: h */
        public static final String f12825h = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: i */
        public static final String f12826i = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: j */
        public static final String f12827j = C10134c0.m19021F(3);

        /* JADX INFO: renamed from: k */
        public static final String f12828k = C10134c0.m19021F(4);

        /* JADX INFO: renamed from: l */
        public static final C5931p f12829l = new C5931p(10);

        /* JADX INFO: renamed from: a */
        public final long f12830a;

        /* JADX INFO: renamed from: b */
        public final long f12831b;

        /* JADX INFO: renamed from: c */
        public final long f12832c;

        /* JADX INFO: renamed from: d */
        public final float f12833d;

        /* JADX INFO: renamed from: e */
        public final float f12834e;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.p$e$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public long f12835a;

            /* JADX INFO: renamed from: b */
            public long f12836b;

            /* JADX INFO: renamed from: c */
            public long f12837c;

            /* JADX INFO: renamed from: d */
            public float f12838d;

            /* JADX INFO: renamed from: e */
            public float f12839e;

            public a() {
                this.f12835a = -9223372036854775807L;
                this.f12836b = -9223372036854775807L;
                this.f12837c = -9223372036854775807L;
                this.f12838d = -3.4028235E38f;
                this.f12839e = -3.4028235E38f;
            }

            public a(e eVar) {
                this.f12835a = eVar.f12830a;
                this.f12836b = eVar.f12831b;
                this.f12837c = eVar.f12832c;
                this.f12838d = eVar.f12833d;
                this.f12839e = eVar.f12834e;
            }
        }

        @Deprecated
        public e(long j10, long j11, long j12, float f3, float f10) {
            this.f12830a = j10;
            this.f12831b = j11;
            this.f12832c = j12;
            this.f12833d = f3;
            this.f12834e = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f12830a == eVar.f12830a && this.f12831b == eVar.f12831b && this.f12832c == eVar.f12832c && this.f12833d == eVar.f12833d && this.f12834e == eVar.f12834e;
        }

        public final int hashCode() {
            long j10 = this.f12830a;
            long j11 = this.f12831b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f12832c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f3 = this.f12833d;
            int iFloatToIntBits = (i11 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f10 = this.f12834e;
            return iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Uri f12840a;

        /* JADX INFO: renamed from: b */
        public final String f12841b;

        /* JADX INFO: renamed from: c */
        public final d f12842c;

        /* JADX INFO: renamed from: d */
        public final List<StreamKey> f12843d;

        /* JADX INFO: renamed from: e */
        public final String f12844e;

        /* JADX INFO: renamed from: f */
        public final ImmutableList<j> f12845f;

        /* JADX INFO: renamed from: g */
        public final Object f12846g;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public f() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Uri uri, String str, d dVar, List list, String str2, ImmutableList immutableList, Object obj) {
            this.f12840a = uri;
            this.f12841b = str;
            this.f12842c = dVar;
            this.f12843d = list;
            this.f12844e = str2;
            this.f12845f = immutableList;
            ImmutableList.C3147b c3147b = ImmutableList.f16043b;
            ImmutableList.C3146a c3146a = new ImmutableList.C3146a();
            for (int i10 = 0; i10 < immutableList.size(); i10++) {
                j jVar = (j) immutableList.get(i10);
                jVar.getClass();
                c3146a.m9055b(new i(new j.a(jVar)));
            }
            c3146a.m9068e();
            this.f12846g = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f12840a.equals(fVar.f12840a) && C10134c0.m19034a(this.f12841b, fVar.f12841b) && C10134c0.m19034a(this.f12842c, fVar.f12842c) && C10134c0.m19034a(null, null) && this.f12843d.equals(fVar.f12843d) && C10134c0.m19034a(this.f12844e, fVar.f12844e) && this.f12845f.equals(fVar.f12845f) && C10134c0.m19034a(this.f12846g, fVar.f12846g);
        }

        public final int hashCode() {
            int iHashCode = this.f12840a.hashCode() * 31;
            String str = this.f12841b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            d dVar = this.f12842c;
            int iHashCode3 = (this.f12843d.hashCode() + ((((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31) + 0) * 31)) * 31;
            String str2 = this.f12844e;
            int iHashCode4 = (this.f12845f.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Object obj = this.f12846g;
            return iHashCode4 + (obj != null ? obj.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$g */
    @Deprecated
    public static final class g extends f {
        public g(Uri uri, String str, d dVar, List list, String str2, ImmutableList immutableList, Object obj) {
            super(uri, str, dVar, list, str2, immutableList, obj);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$h */
    public static final class h implements InterfaceC2409f {

        /* JADX INFO: renamed from: c */
        public static final h f12847c = new h(new a());

        /* JADX INFO: renamed from: d */
        public static final String f12848d = C10134c0.m19021F(0);

        /* JADX INFO: renamed from: e */
        public static final String f12849e = C10134c0.m19021F(1);

        /* JADX INFO: renamed from: f */
        public static final String f12850f = C10134c0.m19021F(2);

        /* JADX INFO: renamed from: g */
        public static final C8002l f12851g = new C8002l(10);

        /* JADX INFO: renamed from: a */
        public final Uri f12852a;

        /* JADX INFO: renamed from: b */
        public final String f12853b;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.p$h$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public Uri f12854a;

            /* JADX INFO: renamed from: b */
            public String f12855b;

            /* JADX INFO: renamed from: c */
            public Bundle f12856c;
        }

        public h(a aVar) {
            this.f12852a = aVar.f12854a;
            this.f12853b = aVar.f12855b;
            Bundle bundle = aVar.f12856c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C10134c0.m19034a(this.f12852a, hVar.f12852a) && C10134c0.m19034a(this.f12853b, hVar.f12853b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Uri uri = this.f12852a;
            int iHashCode2 = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f12853b;
            if (str != null) {
                iHashCode = str.hashCode();
            }
            return iHashCode2 + iHashCode;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$i */
    @Deprecated
    public static final class i extends j {
        public i(j.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.p$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public final Uri f12857a;

        /* JADX INFO: renamed from: b */
        public final String f12858b;

        /* JADX INFO: renamed from: c */
        public final String f12859c;

        /* JADX INFO: renamed from: d */
        public final int f12860d;

        /* JADX INFO: renamed from: e */
        public final int f12861e;

        /* JADX INFO: renamed from: f */
        public final String f12862f;

        /* JADX INFO: renamed from: g */
        public final String f12863g;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.p$j$a */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public final Uri f12864a;

            /* JADX INFO: renamed from: b */
            public final String f12865b;

            /* JADX INFO: renamed from: c */
            public final String f12866c;

            /* JADX INFO: renamed from: d */
            public final int f12867d;

            /* JADX INFO: renamed from: e */
            public final int f12868e;

            /* JADX INFO: renamed from: f */
            public final String f12869f;

            /* JADX INFO: renamed from: g */
            public final String f12870g;

            public a(j jVar) {
                this.f12864a = jVar.f12857a;
                this.f12865b = jVar.f12858b;
                this.f12866c = jVar.f12859c;
                this.f12867d = jVar.f12860d;
                this.f12868e = jVar.f12861e;
                this.f12869f = jVar.f12862f;
                this.f12870g = jVar.f12863g;
            }
        }

        public j(a aVar) {
            this.f12857a = aVar.f12864a;
            this.f12858b = aVar.f12865b;
            this.f12859c = aVar.f12866c;
            this.f12860d = aVar.f12867d;
            this.f12861e = aVar.f12868e;
            this.f12862f = aVar.f12869f;
            this.f12863g = aVar.f12870g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f12857a.equals(jVar.f12857a) && C10134c0.m19034a(this.f12858b, jVar.f12858b) && C10134c0.m19034a(this.f12859c, jVar.f12859c) && this.f12860d == jVar.f12860d && this.f12861e == jVar.f12861e && C10134c0.m19034a(this.f12862f, jVar.f12862f) && C10134c0.m19034a(this.f12863g, jVar.f12863g);
        }

        public final int hashCode() {
            int iHashCode = this.f12857a.hashCode() * 31;
            int iHashCode2 = 0;
            String str = this.f12858b;
            int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f12859c;
            int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f12860d) * 31) + this.f12861e) * 31;
            String str3 = this.f12862f;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f12863g;
            if (str4 != null) {
                iHashCode2 = str4.hashCode();
            }
            return iHashCode5 + iHashCode2;
        }
    }

    public C2466p(String str, c cVar, g gVar, e eVar, C2467q c2467q, h hVar) {
        this.f12771a = str;
        this.f12772b = gVar;
        this.f12773c = eVar;
        this.f12774d = c2467q;
        this.f12775e = cVar;
        this.f12776f = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2466p)) {
            return false;
        }
        C2466p c2466p = (C2466p) obj;
        return C10134c0.m19034a(this.f12771a, c2466p.f12771a) && this.f12775e.equals(c2466p.f12775e) && C10134c0.m19034a(this.f12772b, c2466p.f12772b) && C10134c0.m19034a(this.f12773c, c2466p.f12773c) && C10134c0.m19034a(this.f12774d, c2466p.f12774d) && C10134c0.m19034a(this.f12776f, c2466p.f12776f);
    }

    public final int hashCode() {
        int iHashCode = this.f12771a.hashCode() * 31;
        g gVar = this.f12772b;
        return this.f12776f.hashCode() + ((this.f12774d.hashCode() + ((this.f12775e.hashCode() + ((this.f12773c.hashCode() + ((iHashCode + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
