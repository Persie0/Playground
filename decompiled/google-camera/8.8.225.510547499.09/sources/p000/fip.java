package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fip implements kyt {

    /* JADX INFO: renamed from: c */
    private final kyt f22143c;

    /* JADX INFO: renamed from: d */
    private final int f22144d;

    /* JADX INFO: renamed from: e */
    private final List f22145e = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final nqf f22141a = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    public final nqf f22142b = nqf.m17621g();

    /* JADX INFO: renamed from: f */
    private boolean f22146f = false;

    /* JADX INFO: renamed from: g */
    private int f22147g = 0;

    public fip(kyt kytVar, int i) {
        this.f22143c = kytVar;
        this.f22144d = i;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final synchronized void mo8408a(final nps npsVar) {
        this.f22141a.mo16665f(npsVar);
        final MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "application/motionphoto-highres");
        final nqf nqfVarM17621g = nqf.m17621g();
        npsVar.mo2282d(new Runnable() { // from class: fio
            @Override // java.lang.Runnable
            public final void run() {
                nps npsVar2 = npsVar;
                nqf nqfVar = nqfVarM17621g;
                MediaFormat mediaFormat2 = mediaFormat;
                if (npsVar2.isCancelled()) {
                    nqfVar.cancel(false);
                } else {
                    nqfVar.mo14894e(mediaFormat2);
                }
            }
        }, not.INSTANCE);
        this.f22143c.mo8408a(nqfVarM17621g);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final synchronized void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if ((bufferInfo.flags & 1) != 0) {
            this.f22145e.add(Integer.valueOf(this.f22147g));
        }
        this.f22147g++;
        this.f22143c.mo8409b(byteBuffer, bufferInfo);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8465c() {
        if (this.f22142b.isDone()) {
            return;
        }
        if (this.f22141a.isCancelled()) {
            this.f22142b.mo14894e(mqu.f41450a);
        } else if (this.f22146f) {
            if (this.f22147g == 0) {
                this.f22142b.mo14894e(mqu.f41450a);
                return;
            }
            if (this.f22141a.isDone()) {
                try {
                    MediaFormat mediaFormat = (MediaFormat) kxk.m14973S(this.f22141a);
                    nqf nqfVar = this.f22142b;
                    nxl nxlVarM18137O = obn.f45328i.m18137O();
                    int integer = mediaFormat.getInteger("width");
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obn obnVar = (obn) nxlVarM18137O.f44974b;
                    obnVar.f45330a |= 1;
                    obnVar.f45331b = integer;
                    int integer2 = mediaFormat.getInteger("height");
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obn obnVar2 = (obn) nxlVarM18137O.f44974b;
                    obnVar2.f45330a |= 2;
                    obnVar2.f45332c = integer2;
                    String string = mediaFormat.getString("mime");
                    string.getClass();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    obn obnVar3 = (obn) nxqVar;
                    obnVar3.f45330a |= 32;
                    obnVar3.f45336g = string;
                    List list = this.f22145e;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obn obnVar4 = (obn) nxlVarM18137O.f44974b;
                    nxw nxwVar = obnVar4.f45337h;
                    if (!nxwVar.mo17770c()) {
                        obnVar4.f45337h = nxq.m18125S(nxwVar);
                    }
                    nwb.m17749e(list, obnVar4.f45337h);
                    ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
                    byteBuffer.getClass();
                    nwr nwrVarM17798t = nwr.m17798t(byteBuffer);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obn obnVar5 = (obn) nxlVarM18137O.f44974b;
                    obnVar5.f45330a |= 8;
                    obnVar5.f45334e = nwrVarM17798t;
                    ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
                    byteBuffer2.getClass();
                    nwr nwrVarM17798t2 = nwr.m17798t(byteBuffer2);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar2 = nxlVarM18137O.f44974b;
                    obn obnVar6 = (obn) nxqVar2;
                    obnVar6.f45330a |= 16;
                    obnVar6.f45335f = nwrVarM17798t2;
                    int i = this.f22144d;
                    if (!nxqVar2.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    obn obnVar7 = (obn) nxlVarM18137O.f44974b;
                    obnVar7.f45330a |= 4;
                    obnVar7.f45333d = i;
                    nqfVar.mo14894e(mrm.m16829i((obn) nxlVarM18137O.mo18103l()));
                } catch (ExecutionException e) {
                    throw new IllegalStateException("Format should be done by now", e);
                }
            }
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22143c.close();
        this.f22146f = true;
        m8465c();
    }
}
