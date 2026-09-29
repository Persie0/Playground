package com.google.android.exoplayer2.extractor.flv;

import android.support.v4.media.session.C0166e;
import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import p261m9.InterfaceC7522w;
import p479xa.C10148q;
import p479xa.C10151t;
import p505ya.C10319a;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2408b extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public final C10151t f12237b;

    /* JADX INFO: renamed from: c */
    public final C10151t f12238c;

    /* JADX INFO: renamed from: d */
    public int f12239d;

    /* JADX INFO: renamed from: e */
    public boolean f12240e;

    /* JADX INFO: renamed from: f */
    public boolean f12241f;

    /* JADX INFO: renamed from: g */
    public int f12242g;

    public C2408b(InterfaceC7522w interfaceC7522w) {
        super(interfaceC7522w);
        this.f12237b = new C10151t(C10148q.f51402a);
        this.f12238c = new C10151t(4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m7012a(C10151t c10151t) throws TagPayloadReader.UnsupportedFormatException {
        int iM19145t = c10151t.m19145t();
        int i10 = (iM19145t >> 4) & 15;
        int i11 = iM19145t & 15;
        if (i11 != 7) {
            throw new TagPayloadReader.UnsupportedFormatException(C0166e.m761g("Video format not supported: ", i11));
        }
        this.f12242g = i10;
        return i10 != 5;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7013b(long j10, C10151t c10151t) throws ParserException {
        int iM19145t = c10151t.m19145t();
        byte[] bArr = c10151t.f51438a;
        int i10 = c10151t.f51439b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (((bArr[i10] & 255) << 24) >> 8) | ((bArr[i11] & 255) << 8);
        c10151t.f51439b = i12 + 1;
        long j11 = (((long) ((bArr[i12] & 255) | i13)) * 1000) + j10;
        InterfaceC7522w interfaceC7522w = this.f12232a;
        if (iM19145t == 0 && !this.f12240e) {
            C10151t c10151t2 = new C10151t(new byte[c10151t.f51440c - c10151t.f51439b]);
            c10151t.m19127b(c10151t2.f51438a, 0, c10151t.f51440c - c10151t.f51439b);
            C10319a c10319aM19319a = C10319a.m19319a(c10151t2);
            this.f12239d = c10319aM19319a.f51886b;
            C2416m.a aVar = new C2416m.a();
            aVar.f12501k = "video/avc";
            aVar.f12498h = c10319aM19319a.f51890f;
            aVar.f12506p = c10319aM19319a.f51887c;
            aVar.f12507q = c10319aM19319a.f51888d;
            aVar.f12510t = c10319aM19319a.f51889e;
            aVar.f12503m = c10319aM19319a.f51885a;
            interfaceC7522w.mo7388f(new C2416m(aVar));
            this.f12240e = true;
            return false;
        }
        if (iM19145t != 1 || !this.f12240e) {
            return false;
        }
        int i14 = this.f12242g == 1 ? 1 : 0;
        if (!this.f12241f && i14 == 0) {
            return false;
        }
        C10151t c10151t3 = this.f12238c;
        byte[] bArr2 = c10151t3.f51438a;
        bArr2[0] = 0;
        bArr2[1] = 0;
        bArr2[2] = 0;
        int i15 = 4 - this.f12239d;
        int i16 = 0;
        while (c10151t.f51440c - c10151t.f51439b > 0) {
            c10151t.m19127b(c10151t3.f51438a, i15, this.f12239d);
            c10151t3.m19124E(0);
            int iM19148w = c10151t3.m19148w();
            C10151t c10151t4 = this.f12237b;
            c10151t4.m19124E(0);
            interfaceC7522w.m15021c(4, c10151t4);
            interfaceC7522w.m15021c(iM19148w, c10151t);
            i16 = i16 + 4 + iM19148w;
        }
        this.f12232a.mo7387e(j11, i14, i16, 0, null);
        this.f12241f = true;
        return true;
    }
}
