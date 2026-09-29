package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import p195j9.C6424a;
import p261m9.InterfaceC7522w;
import p357r6.C8739a;
import p479xa.C10151t;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.flv.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2407a extends TagPayloadReader {

    /* JADX INFO: renamed from: e */
    public static final int[] f12233e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b */
    public boolean f12234b;

    /* JADX INFO: renamed from: c */
    public boolean f12235c;

    /* JADX INFO: renamed from: d */
    public int f12236d;

    public C2407a(InterfaceC7522w interfaceC7522w) {
        super(interfaceC7522w);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m7010a(C10151t c10151t) throws TagPayloadReader.UnsupportedFormatException {
        if (this.f12234b) {
            c10151t.m19125F(1);
        } else {
            int iM19145t = c10151t.m19145t();
            int i10 = (iM19145t >> 4) & 15;
            this.f12236d = i10;
            InterfaceC7522w interfaceC7522w = this.f12232a;
            if (i10 == 2) {
                int i11 = f12233e[(iM19145t >> 2) & 3];
                C2416m.a aVar = new C2416m.a();
                aVar.f12501k = "audio/mpeg";
                aVar.f12514x = 1;
                aVar.f12515y = i11;
                interfaceC7522w.mo7388f(aVar.m7128a());
                this.f12235c = true;
            } else if (i10 == 7 || i10 == 8) {
                String str = i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C2416m.a aVar2 = new C2416m.a();
                aVar2.f12501k = str;
                aVar2.f12514x = 1;
                aVar2.f12515y = 8000;
                interfaceC7522w.mo7388f(aVar2.m7128a());
                this.f12235c = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f12236d);
            }
            this.f12234b = true;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7011b(long j10, C10151t c10151t) throws ParserException {
        int i10 = this.f12236d;
        InterfaceC7522w interfaceC7522w = this.f12232a;
        if (i10 == 2) {
            int i11 = c10151t.f51440c - c10151t.f51439b;
            interfaceC7522w.m15021c(i11, c10151t);
            this.f12232a.mo7387e(j10, 1, i11, 0, null);
            return true;
        }
        int iM19145t = c10151t.m19145t();
        if (iM19145t != 0 || this.f12235c) {
            if (this.f12236d == 10 && iM19145t != 1) {
                return false;
            }
            int i12 = c10151t.f51440c - c10151t.f51439b;
            interfaceC7522w.m15021c(i12, c10151t);
            this.f12232a.mo7387e(j10, 1, i12, 0, null);
            return true;
        }
        int i13 = c10151t.f51440c - c10151t.f51439b;
        byte[] bArr = new byte[i13];
        c10151t.m19127b(bArr, 0, i13);
        C6424a.a aVarM13046b = C6424a.m13046b(new C8739a(bArr, i13), false);
        C2416m.a aVar = new C2416m.a();
        aVar.f12501k = "audio/mp4a-latm";
        aVar.f12498h = aVarM13046b.f36905c;
        aVar.f12514x = aVarM13046b.f36904b;
        aVar.f12515y = aVarM13046b.f36903a;
        aVar.f12503m = Collections.singletonList(bArr);
        interfaceC7522w.mo7388f(new C2416m(aVar));
        this.f12235c = true;
        return false;
    }
}
