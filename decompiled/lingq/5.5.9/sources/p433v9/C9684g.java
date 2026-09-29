package p433v9;

import com.google.android.exoplayer2.C2416m;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p261m9.C7525z;
import p338qd.C8573r0;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10151t;

/* JADX INFO: renamed from: v9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9684g extends AbstractC9685h {

    /* JADX INFO: renamed from: o */
    public static final byte[] f49576o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p */
    public static final byte[] f49577p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n */
    public boolean f49578n;

    /* JADX INFO: renamed from: e */
    public static boolean m18195e(C10151t c10151t, byte[] bArr) {
        int i10 = c10151t.f51440c;
        int i11 = c10151t.f51439b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c10151t.m19127b(bArr2, 0, bArr.length);
        c10151t.m19124E(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: b */
    public final long mo18188b(C10151t c10151t) {
        byte[] bArr = c10151t.f51438a;
        byte b10 = 0;
        byte b11 = bArr[0];
        if (bArr.length > 1) {
            b10 = bArr[1];
        }
        return (((long) this.f49587i) * C8573r0.m16753r0(b11, b10)) / 1000000;
    }

    @Override // p433v9.AbstractC9685h
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: c */
    public final boolean mo18189c(C10151t c10151t, long j10, AbstractC9685h.a aVar) throws ParserException {
        if (m18195e(c10151t, f49576o)) {
            byte[] bArrCopyOf = Arrays.copyOf(c10151t.f51438a, c10151t.f51440c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListM16669E = C8573r0.m16669E(bArrCopyOf);
            if (aVar.f49592a != null) {
                return true;
            }
            C2416m.a aVar2 = new C2416m.a();
            aVar2.f12501k = "audio/opus";
            aVar2.f12514x = i10;
            aVar2.f12515y = 48000;
            aVar2.f12503m = arrayListM16669E;
            aVar.f49592a = new C2416m(aVar2);
            return true;
        }
        if (!m18195e(c10151t, f49577p)) {
            C10129a.m18993e(aVar.f49592a);
            return false;
        }
        C10129a.m18993e(aVar.f49592a);
        if (this.f49578n) {
            return true;
        }
        this.f49578n = true;
        c10151t.m19125F(8);
        Metadata metadataM15031a = C7525z.m15031a(ImmutableList.m9061U(C7525z.m15032b(c10151t, false, false).f41539a));
        if (metadataM15031a == null) {
            return true;
        }
        C2416m c2416m = aVar.f49592a;
        c2416m.getClass();
        C2416m.a aVar3 = new C2416m.a(c2416m);
        Metadata metadata = aVar.f49592a.f12482j;
        if (metadata != null) {
            Metadata.Entry[] entryArr = metadata.f12627a;
            if (entryArr.length != 0) {
                int i11 = C10134c0.f51354a;
                Metadata.Entry[] entryArr2 = metadataM15031a.f12627a;
                Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
                System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
                metadataM15031a = new Metadata(metadataM15031a.f12628b, (Metadata.Entry[]) objArrCopyOf);
            }
        }
        aVar3.f12499i = metadataM15031a;
        aVar.f49592a = new C2416m(aVar3);
        return true;
    }

    @Override // p433v9.AbstractC9685h
    /* JADX INFO: renamed from: d */
    public final void mo18190d(boolean z10) {
        super.mo18190d(z10);
        if (z10) {
            this.f49578n = false;
        }
    }
}
