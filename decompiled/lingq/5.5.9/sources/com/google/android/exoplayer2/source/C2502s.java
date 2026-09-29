package com.google.android.exoplayer2.source;

import android.net.Uri;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.upstream.InterfaceC2528b;
import com.google.common.collect.ImmutableList;
import ga.C5733p;
import java.util.Collections;
import java.util.Map;
import p454wa.C9884i;
import p454wa.InterfaceC9877b;
import p454wa.InterfaceC9882g;
import p454wa.InterfaceC9894s;
import p479xa.C10129a;
import p482xd.C10172d;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2502s extends AbstractC2471a {

    /* JADX INFO: renamed from: a */
    public final C9884i f13460a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9882g.a f13461b;

    /* JADX INFO: renamed from: c */
    public final C2416m f13462c;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2528b f13464e;

    /* JADX INFO: renamed from: g */
    public final C5733p f13466g;

    /* JADX INFO: renamed from: h */
    public final C2466p f13467h;

    /* JADX INFO: renamed from: i */
    public InterfaceC9894s f13468i;

    /* JADX INFO: renamed from: d */
    public final long f13463d = -9223372036854775807L;

    /* JADX INFO: renamed from: f */
    public final boolean f13465f = true;

    public C2502s(C2466p.j jVar, InterfaceC9882g.a aVar, InterfaceC2528b interfaceC2528b) {
        this.f13461b = aVar;
        this.f13464e = interfaceC2528b;
        C2466p.a aVar2 = new C2466p.a();
        aVar2.f12778b = Uri.EMPTY;
        String string = jVar.f12857a.toString();
        string.getClass();
        aVar2.f12777a = string;
        aVar2.f12784h = ImmutableList.m9060Q(ImmutableList.m9064b0(jVar));
        aVar2.f12785i = null;
        C2466p c2466pM7213a = aVar2.m7213a();
        this.f13467h = c2466pM7213a;
        C2416m.a aVar3 = new C2416m.a();
        aVar3.f12501k = (String) C10172d.m19190a(jVar.f12858b, "text/x-unknown");
        aVar3.f12493c = jVar.f12859c;
        aVar3.f12494d = jVar.f12860d;
        aVar3.f12495e = jVar.f12861e;
        aVar3.f12492b = jVar.f12862f;
        String str = jVar.f12863g;
        aVar3.f12491a = str != null ? str : null;
        this.f13462c = new C2416m(aVar3);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = jVar.f12857a;
        C10129a.m18994f(uri, "The uri must be set.");
        this.f13460a = new C9884i(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f13466g = new C5733p(-9223372036854775807L, true, false, c2466pM7213a);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final InterfaceC2480h createPeriod(InterfaceC2492i.b bVar, InterfaceC9877b interfaceC9877b, long j10) {
        return new C2501r(this.f13460a, this.f13461b, this.f13468i, this.f13462c, this.f13463d, this.f13464e, createEventDispatcher(bVar), this.f13465f);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final C2466p getMediaItem() {
        return this.f13467h;
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void maybeThrowSourceInfoRefreshError() {
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void prepareSourceInternal(InterfaceC9894s interfaceC9894s) {
        this.f13468i = interfaceC9894s;
        refreshSourceInfo(this.f13466g);
    }

    @Override // com.google.android.exoplayer2.source.InterfaceC2492i
    public final void releasePeriod(InterfaceC2480h interfaceC2480h) {
        ((C2501r) interfaceC2480h).f13449i.m7468c(null);
    }

    @Override // com.google.android.exoplayer2.source.AbstractC2471a
    public final void releaseSourceInternal() {
    }
}
