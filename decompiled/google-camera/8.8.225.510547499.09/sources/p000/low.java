package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class low extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final low f38855j;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f38856l;

    /* JADX INFO: renamed from: a */
    public int f38857a;

    /* JADX INFO: renamed from: b */
    public ozj f38858b;

    /* JADX INFO: renamed from: c */
    public long f38859c;

    /* JADX INFO: renamed from: d */
    public long f38860d;

    /* JADX INFO: renamed from: e */
    public long f38861e;

    /* JADX INFO: renamed from: f */
    public long f38862f;

    /* JADX INFO: renamed from: g */
    public int f38863g;

    /* JADX INFO: renamed from: i */
    public ozk f38865i;

    /* JADX INFO: renamed from: k */
    private byte f38866k = 2;

    /* JADX INFO: renamed from: h */
    public String f38864h = "";

    static {
        low lowVar = new low();
        f38855j = lowVar;
        nxq.m18130aa(low.class, lowVar);
    }

    private low() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f38866k);
            case 1:
            default:
                this.f38866k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f38855j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{TVkaNXnfP.iKflqh, xRFdVyfdeve.nZYWSnODldXRYP, "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new low();
            case 4:
                return new nxl(f38855j);
            case 5:
                return f38855j;
            case 6:
                nzd nxmVar = f38856l;
                if (nxmVar == null) {
                    synchronized (low.class) {
                        nxmVar = f38856l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38855j);
                            f38856l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
