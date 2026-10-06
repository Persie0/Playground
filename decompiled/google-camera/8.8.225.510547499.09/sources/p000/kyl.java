package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.nio.ByteBuffer;
import java.util.Locale;
import p021j$.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyl {

    /* JADX INFO: renamed from: a */
    public final int f37729a;

    /* JADX INFO: renamed from: b */
    public final Object f37730b;

    /* JADX INFO: renamed from: c */
    public final Object f37731c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f37732d;

    public kyl(jgb jgbVar, jfx jfxVar, jcw[] jcwVarArr, int i) {
        this.f37732d = jgbVar;
        this.f37731c = jfxVar;
        this.f37730b = jcwVarArr;
        this.f37729a = i;
    }

    public kyl(lpe lpeVar, kyo kyoVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f37732d = lpeVar;
        int i = ((ByteBuffer) lpeVar.f38883b).getInt(kyoVar.f37737a);
        lku.m15613H(i > 0);
        boolean z = i == 1 || i >= 8;
        lku.m15614I(z, EArqVBjecl.yLD);
        byte[] bArr4 = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr4[i2] = ((ByteBuffer) lpeVar.f38883b).get(kyoVar.f37737a + 4 + i2);
        }
        String str = new String(bArr4, StandardCharsets.US_ASCII);
        this.f37730b = str;
        lku.m15613H(str.length() == 4);
        if (i == 1) {
            long j = ((ByteBuffer) lpeVar.f38883b).getLong(kyoVar.f37737a + 8);
            lku.m15670x(j < 2147483647L, "We don't support >2GB boxes (since we're using ByteBuffers).");
            i = (int) j;
            this.f37729a = 16;
        } else {
            this.f37729a = 8;
        }
        lku.m15614I(i <= kyoVar.f37738b, String.format(Locale.US, "Signalled box length %d does not fit length of %d", Integer.valueOf(this.f37729a + i), Integer.valueOf(kyoVar.f37738b)));
        int i3 = kyoVar.f37737a;
        int i4 = this.f37729a;
        this.f37731c = new kyo(i3 + i4, i - i4);
    }

    /* JADX INFO: renamed from: a */
    public final jfv m15062a() {
        return ((jfx) this.f37731c).f33922b;
    }

    /* JADX INFO: renamed from: b */
    public final void m15063b(jdp jdpVar, khb khbVar) {
        ((jgb) this.f37732d).f33938a.mo13128a(jdpVar, khbVar);
    }
}
