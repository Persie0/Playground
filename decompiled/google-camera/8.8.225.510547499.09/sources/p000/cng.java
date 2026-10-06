package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cng implements cnf {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f6337a;

    public cng(int i) {
        this.f6337a = i;
    }

    @Override // p000.cnf
    /* JADX INFO: renamed from: a */
    public final mrm mo3980a(byte[] bArr) {
        switch (this.f6337a) {
            case 0:
                try {
                    nxq nxqVarM18123Q = nxq.m18123Q(pbp.f47342b, bArr, 0, bArr.length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q);
                    pbs pbsVar = ((pbp) nxqVarM18123Q).f47344a;
                    if (pbsVar == null) {
                        pbsVar = pbs.f47350b;
                    }
                    return mrm.m16829i(pbsVar);
                } catch (nyb e) {
                    return mqu.f41450a;
                }
            default:
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    int width = bitmapDecodeByteArray.getWidth();
                    int height = bitmapDecodeByteArray.getHeight();
                    nxl nxlVarM18137O = pbs.f47350b.m18137O();
                    nxl nxlVarM18137O2 = pbq.f47345c.m18137O();
                    nxl nxlVarM18137O3 = pbu.f47356b.m18137O();
                    nxlVarM18137O3.m18066aC(width);
                    pbu pbuVar = (pbu) nxlVarM18137O3.mo18103l();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    pbq pbqVar = (pbq) nxlVarM18137O2.f44974b;
                    pbuVar.getClass();
                    pbqVar.f47348b = pbuVar;
                    pbqVar.f47347a = 3;
                    nxlVarM18137O.m18064aA("image/width", (pbq) nxlVarM18137O2.mo18103l());
                    nxl nxlVarM18137O4 = pbq.f47345c.m18137O();
                    nxl nxlVarM18137O5 = pbu.f47356b.m18137O();
                    nxlVarM18137O5.m18066aC(height);
                    pbu pbuVar2 = (pbu) nxlVarM18137O5.mo18103l();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    pbq pbqVar2 = (pbq) nxlVarM18137O4.f44974b;
                    pbuVar2.getClass();
                    pbqVar2.f47348b = pbuVar2;
                    pbqVar2.f47347a = 3;
                    nxlVarM18137O.m18064aA("image/height", (pbq) nxlVarM18137O4.mo18103l());
                    String str = voNZjxiJou.ZVfjsfEqyey;
                    lfw lfwVarM15293a = lfy.m15293a(bitmapDecodeByteArray);
                    nxl nxlVarM18137O6 = pbq.f47345c.m18137O();
                    nxl nxlVarM18137O7 = pbo.f47339b.m18137O();
                    nxlVarM18137O7.m18096az(nwr.m17798t((ByteBuffer) ((lfx) lfwVarM15293a).mo4710c().mo15294c()));
                    pbo pboVar = (pbo) nxlVarM18137O7.mo18103l();
                    if (!nxlVarM18137O6.f44974b.m18142ac()) {
                        nxlVarM18137O6.mo18106p();
                    }
                    pbq pbqVar3 = (pbq) nxlVarM18137O6.f44974b;
                    pboVar.getClass();
                    pbqVar3.f47348b = pboVar;
                    pbqVar3.f47347a = 1;
                    nxlVarM18137O.m18064aA(str, (pbq) nxlVarM18137O6.mo18103l());
                    bitmapDecodeByteArray.recycle();
                    return mrm.m16829i((pbs) nxlVarM18137O.mo18103l());
                } catch (RuntimeException e2) {
                    return mqu.f41450a;
                }
        }
    }
}
