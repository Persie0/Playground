package p261m9;

import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.List;
import p479xa.C10134c0;
import p479xa.C10145n;
import p479xa.C10151t;

/* JADX INFO: renamed from: m9.z */
/* JADX INFO: loaded from: classes.dex */
public final class C7525z {

    /* JADX INFO: renamed from: m9.z$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String[] f41539a;

        public a(String[] strArr) {
            this.f41539a = strArr;
        }
    }

    /* JADX INFO: renamed from: m9.z$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final boolean f41540a;

        public b(boolean z10) {
            this.f41540a = z10;
        }
    }

    /* JADX INFO: renamed from: m9.z$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f41541a;

        /* JADX INFO: renamed from: b */
        public final int f41542b;

        /* JADX INFO: renamed from: c */
        public final int f41543c;

        /* JADX INFO: renamed from: d */
        public final int f41544d;

        /* JADX INFO: renamed from: e */
        public final int f41545e;

        /* JADX INFO: renamed from: f */
        public final int f41546f;

        /* JADX INFO: renamed from: g */
        public final byte[] f41547g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, byte[] bArr) {
            this.f41541a = i10;
            this.f41542b = i11;
            this.f41543c = i12;
            this.f41544d = i13;
            this.f41545e = i14;
            this.f41546f = i15;
            this.f41547g = bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Metadata m15031a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            int i11 = C10134c0.f51354a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                C10145n.m19099g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.m7209a(new C10151t(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e10) {
                    C10145n.m19100h("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public static a m15032b(C10151t c10151t, boolean z10, boolean z11) throws ParserException {
        if (z10) {
            m15033c(3, c10151t, false);
        }
        c10151t.m19142q((int) c10151t.m19135j());
        long jM19135j = c10151t.m19135j();
        String[] strArr = new String[(int) jM19135j];
        for (int i10 = 0; i10 < jM19135j; i10++) {
            strArr[i10] = c10151t.m19142q((int) c10151t.m19135j());
        }
        if (z11 && (c10151t.m19145t() & 1) == 0) {
            throw ParserException.m6770a("framing bit expected to be set", null);
        }
        return new a(strArr);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static boolean m15033c(int i10, C10151t c10151t, boolean z10) throws ParserException {
        if (c10151t.f51440c - c10151t.f51439b < 7) {
            if (z10) {
                return false;
            }
            throw ParserException.m6770a("too short header: " + (c10151t.f51440c - c10151t.f51439b), null);
        }
        if (c10151t.m19145t() != i10) {
            if (z10) {
                return false;
            }
            throw ParserException.m6770a("expected header type " + Integer.toHexString(i10), null);
        }
        if (c10151t.m19145t() == 118 && c10151t.m19145t() == 111 && c10151t.m19145t() == 114 && c10151t.m19145t() == 98 && c10151t.m19145t() == 105) {
            if (c10151t.m19145t() == 115) {
                return true;
            }
        }
        if (z10) {
            return false;
        }
        throw ParserException.m6770a("expected characters 'vorbis'", null);
    }
}
