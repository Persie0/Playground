package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ftz {

    /* JADX INFO: renamed from: a */
    public byte[] f23561a;

    /* JADX INFO: renamed from: b */
    public jvb f23562b;

    /* JADX INFO: renamed from: c */
    public mrm f23563c;

    /* JADX INFO: renamed from: d */
    private int f23564d;

    /* JADX INFO: renamed from: e */
    private fub f23565e;

    /* JADX INFO: renamed from: f */
    private int f23566f;

    /* JADX INFO: renamed from: g */
    private kmq f23567g;

    /* JADX INFO: renamed from: h */
    private jww f23568h;

    /* JADX INFO: renamed from: i */
    private boolean f23569i;

    /* JADX INFO: renamed from: j */
    private boolean f23570j;

    /* JADX INFO: renamed from: k */
    private byte f23571k;

    public ftz() {
    }

    public ftz(fua fuaVar) {
        this.f23563c = mqu.f41450a;
        this.f23564d = fuaVar.f23573a;
        this.f23565e = fuaVar.f23574b;
        this.f23566f = fuaVar.f23575c;
        this.f23567g = fuaVar.f23576d;
        this.f23561a = fuaVar.f23577e;
        this.f23562b = fuaVar.f23578f;
        this.f23568h = fuaVar.f23579g;
        this.f23569i = fuaVar.f23580h;
        this.f23570j = fuaVar.f23581i;
        this.f23563c = fuaVar.f23582j;
        this.f23571k = (byte) 15;
    }

    public ftz(byte[] bArr) {
        this.f23563c = mqu.f41450a;
    }

    /* JADX INFO: renamed from: a */
    public final fua m8800a() {
        fub fubVar;
        kmq kmqVar;
        byte[] bArr;
        jvb jvbVar;
        jww jwwVar;
        if (this.f23571k == 15 && (fubVar = this.f23565e) != null && (kmqVar = this.f23567g) != null && (bArr = this.f23561a) != null && (jvbVar = this.f23562b) != null && (jwwVar = this.f23568h) != null) {
            return new fua(this.f23564d, fubVar, this.f23566f, kmqVar, bArr, jvbVar, jwwVar, this.f23569i, this.f23570j, this.f23563c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f23571k & 1) == 0) {
            sb.append(" orientation");
        }
        if (this.f23565e == null) {
            sb.append(" callback");
        }
        if ((this.f23571k & 2) == 0) {
            sb.append(" heading");
        }
        if (this.f23567g == null) {
            sb.append(" facing");
        }
        if (this.f23561a == null) {
            sb.append(" sensorEepromInfo");
        }
        if (this.f23562b == null) {
            sb.append(" shotLifetime");
        }
        if (this.f23568h == null) {
            sb.append(" selfieFlashFired");
        }
        if ((this.f23571k & 4) == 0) {
            sb.append(" generateDngEnabled");
        }
        if ((this.f23571k & 8) == 0) {
            sb.append(" longPress");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m8801b(fub fubVar) {
        if (fubVar == null) {
            throw new NullPointerException("Null callback");
        }
        this.f23565e = fubVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m8802c(kmq kmqVar) {
        if (kmqVar == null) {
            throw new NullPointerException("Null facing");
        }
        this.f23567g = kmqVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m8803d(boolean z) {
        this.f23569i = z;
        this.f23571k = (byte) (this.f23571k | 4);
    }

    /* JADX INFO: renamed from: e */
    public final void m8804e(int i) {
        this.f23566f = i;
        this.f23571k = (byte) (this.f23571k | 2);
    }

    /* JADX INFO: renamed from: f */
    public final void m8805f(boolean z) {
        this.f23570j = z;
        this.f23571k = (byte) (this.f23571k | 8);
    }

    /* JADX INFO: renamed from: g */
    public final void m8806g(int i) {
        this.f23564d = i;
        this.f23571k = (byte) (this.f23571k | 1);
    }

    /* JADX INFO: renamed from: h */
    public final void m8807h(jww jwwVar) {
        if (jwwVar == null) {
            throw new NullPointerException("Null selfieFlashFired");
        }
        this.f23568h = jwwVar;
    }
}
