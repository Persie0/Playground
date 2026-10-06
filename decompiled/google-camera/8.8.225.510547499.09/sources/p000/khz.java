package p000;

import android.os.Handler;
import android.util.Size;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class khz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f36119a;

    /* JADX INFO: renamed from: b */
    private final oju f36120b;

    /* JADX INFO: renamed from: c */
    private final oju f36121c;

    /* JADX INFO: renamed from: d */
    private final oju f36122d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f36123e;

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i) {
        this.f36123e = i;
        this.f36119a = ojuVar;
        this.f36120b = ojuVar2;
        this.f36121c = ojuVar3;
        this.f36122d = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[] bArr) {
        this.f36123e = i;
        this.f36119a = ojuVar;
        this.f36121c = ojuVar2;
        this.f36120b = ojuVar3;
        this.f36122d = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[] cArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36122d = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[] fArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36119a = ojuVar2;
        this.f36122d = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[] iArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36120b = ojuVar2;
        this.f36122d = ojuVar3;
        this.f36119a = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[] sArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36122d = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[] zArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36122d = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, byte[][] bArr) {
        this.f36123e = i;
        this.f36122d = ojuVar;
        this.f36121c = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, char[][] cArr) {
        this.f36123e = i;
        this.f36120b = ojuVar;
        this.f36121c = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36122d = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, float[][] fArr) {
        this.f36123e = i;
        this.f36119a = ojuVar;
        this.f36122d = ojuVar2;
        this.f36120b = ojuVar3;
        this.f36121c = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, int[][] iArr) {
        this.f36123e = i;
        this.f36122d = ojuVar;
        this.f36120b = ojuVar2;
        this.f36119a = ojuVar3;
        this.f36121c = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, short[][] sArr) {
        this.f36123e = i;
        this.f36122d = ojuVar;
        this.f36119a = ojuVar2;
        this.f36121c = ojuVar3;
        this.f36120b = ojuVar4;
    }

    public khz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, int i, boolean[][] zArr) {
        this.f36123e = i;
        this.f36121c = ojuVar;
        this.f36122d = ojuVar2;
        this.f36120b = ojuVar3;
        this.f36119a = ojuVar4;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f36123e) {
            case 0:
                Object obj = this.f36119a.get();
                kme kmeVar = ((kak) this.f36120b).get();
                return new khy((kia) obj, kmeVar);
            case 1:
                jvb jvbVar = (jvb) this.f36119a.get();
                kbo kboVar = ((kbm) this.f36121c).get();
                ((khc) this.f36122d).get();
                return new khu(jvbVar, kboVar);
            case 2:
                return new kie((kiv) this.f36121c.get(), (jvb) this.f36122d.get(), ((kid) this.f36119a).get(), this.f36120b, null, null);
            case 3:
                return new ktz(this.f36121c, this.f36122d, this.f36119a, this.f36120b);
            case 4:
                return new kjf((kkz) this.f36121c.get(), (kkk) this.f36120b.get(), ((kbm) this.f36122d).get(), (kbz) this.f36119a.get());
            case 5:
                jvb jvbVar2 = (jvb) this.f36121c.get();
                kka kkaVar = new kka((Handler) this.f36122d.get(), ((kbm) this.f36120b).get(), (kiw) this.f36119a.get());
                jvbVar2.m13537d(kkaVar);
                return kkaVar;
            case 6:
                kfn kfnVar = ((khc) this.f36121c).get();
                Map map = (Map) this.f36119a.get();
                C0957rh c0957rh = (C0957rh) this.f36122d.get();
                jvb jvbVar3 = (jvb) this.f36120b.get();
                map.getClass();
                c0957rh.getClass();
                jvbVar3.getClass();
                ArrayList arrayList = new ArrayList();
                mws mwsVar = kfnVar.f35843g;
                int i = ((mzr) mwsVar).f41859c;
                for (int i2 = 0; i2 < i; i2++) {
                    kgi kgiVar = (kgi) mwsVar.get(i2);
                    kbc kbcVar = kgiVar.f35902d;
                    arrayList.add(C0236hg.m10229b(new Size(kbcVar.f35517a, kbcVar.f35518b), kgiVar.f35903e));
                }
                String str = kfnVar.f35837a.f36540a;
                str.getClass();
                List listM18673M = omn.m18673M(map.values());
                okv okvVar = okv.f46215a;
                okw okwVar = okw.f46216a;
                InterfaceC0951rb interfaceC0951rb = (InterfaceC0951rb) new C1062ve(((C1064vg) c0957rh.f47550a).f47827a, new bkn(new C0948qz(str, listM18673M, okvVar, okwVar, okwVar, okvVar, okwVar, new C0967rr(null), new C0950ra(null))), null, null, null).f47821k.get();
                jvbVar3.m13537d(new kap(interfaceC0951rb, 6));
                interfaceC0951rb.getClass();
                return interfaceC0951rb;
            case 7:
                return new kmt(((kaj) this.f36122d).get(), (kmj) this.f36121c.get(), (kbz) this.f36119a.get(), ((kbm) this.f36120b).get(), null, null, null, null);
            case 8:
                return new lkt(ohh.m18485a(this.f36120b), this.f36121c, (mrm) ((ohj) this.f36119a).f46012a, (Executor) this.f36122d.get());
            case 9:
                return new lmm((lhz) this.f36122d.get(), this.f36119a, this.f36121c, this.f36120b);
            case 10:
                return new lie(this.f36122d, this.f36120b, this.f36119a, this.f36121c, (byte[]) null);
            case 11:
                lvh lvhVar = (lvh) this.f36121c.get();
                lvg lvgVar = (lvg) this.f36122d.get();
                mav mavVar = (mav) this.f36120b.get();
                lzd lzdVar = (lzd) this.f36119a.get();
                lvhVar.getClass();
                lvgVar.getClass();
                mavVar.getClass();
                lzdVar.getClass();
                return new lme();
            default:
                return new lwz((mav) this.f36119a.get(), (lxd) this.f36122d.get(), (File) this.f36120b.get(), (lwo) this.f36121c.get());
        }
    }
}
