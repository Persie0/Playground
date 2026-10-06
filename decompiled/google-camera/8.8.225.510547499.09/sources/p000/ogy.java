package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogy extends nxo implements nyx {

    /* JADX INFO: renamed from: i */
    public static final ogy f45974i;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f45975k;

    /* JADX INFO: renamed from: a */
    public int f45976a;

    /* JADX INFO: renamed from: b */
    public long f45977b;

    /* JADX INFO: renamed from: c */
    public long f45978c;

    /* JADX INFO: renamed from: d */
    public int f45979d;

    /* JADX INFO: renamed from: e */
    public nwr f45980e;

    /* JADX INFO: renamed from: f */
    public long f45981f;

    /* JADX INFO: renamed from: g */
    public boolean f45982g;

    /* JADX INFO: renamed from: h */
    public String f45983h;

    /* JADX INFO: renamed from: j */
    private byte f45984j = 2;

    static {
        ogy ogyVar = new ogy();
        f45974i = ogyVar;
        nxq.m18130aa(ogy.class, ogyVar);
    }

    private ogy() {
        nzg nzgVar = nzg.f45063b;
        nwr nwrVar = nwr.f44839b;
        this.f45980e = nwr.f44839b;
        this.f45981f = 180000L;
        nxr nxrVar = nxr.f44982b;
        this.f45983h = "";
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45984j);
            case 1:
            default:
                this.f45984j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45974i, "\u0001\u0007\u0000\u0001\u0001\u001c\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0019ဇ\u0017\u001cဈ\u0018", new Object[]{"a", "b", "e", "d", "f", "c", JrxsYuVZZqnFC.IUphjTepOIYsKV, "h"});
            case 3:
                return new ogy();
            case 4:
                return new nxn(f45974i);
            case 5:
                return f45974i;
            case 6:
                nzd nxmVar = f45975k;
                if (nxmVar == null) {
                    synchronized (ogy.class) {
                        nxmVar = f45975k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45974i);
                            f45975k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
