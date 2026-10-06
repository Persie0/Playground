package p000;

import java.util.Map;

/* JADX INFO: renamed from: sz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1002sz implements InterfaceC0946qx {

    /* JADX INFO: renamed from: a */
    public InterfaceC1041uk f47621a;

    /* JADX INFO: renamed from: b */
    public C1028ty f47622b;

    /* JADX INFO: renamed from: c */
    private final oqs f47623c;

    /* JADX INFO: renamed from: d */
    private final C0948qz f47624d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1082vy f47625e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC1023tt f47626f;

    /* JADX INFO: renamed from: g */
    private boolean f47627g;

    /* JADX INFO: renamed from: h */
    private Map f47628h;

    /* JADX INFO: renamed from: i */
    private final C1058va f47629i;

    /* JADX INFO: renamed from: j */
    private final drj f47630j;

    /* JADX INFO: renamed from: k */
    private final bck f47631k;

    public C1002sz(oqs oqsVar, C0948qz c0948qz, InterfaceC1082vy interfaceC1082vy, InterfaceC1023tt interfaceC1023tt, bck bckVar, drj drjVar, C1058va c1058va, C0846ne c0846ne, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        oqsVar.getClass();
        interfaceC1023tt.getClass();
        drjVar.getClass();
        c1058va.getClass();
        c0846ne.getClass();
        this.f47623c = oqsVar;
        this.f47624d = c0948qz;
        this.f47625e = interfaceC1082vy;
        this.f47626f = interfaceC1023tt;
        this.f47631k = bckVar;
        this.f47630j = drjVar;
        this.f47629i = c1058va;
    }

    @Override // p000.InterfaceC0946qx
    /* JADX INFO: renamed from: a */
    public final void mo19361a() {
        ooi ooiVar = new ooi();
        ooi ooiVar2 = new ooi();
        synchronized (this) {
            if (this.f47627g) {
                return;
            }
            this.f47627g = true;
            ooiVar.f46351a = this.f47621a;
            ooiVar2.f46351a = this.f47622b;
            this.f47621a = null;
            this.f47622b = null;
            ooc.m18746l(this.f47623c, null, new C1000sx(ooiVar2, ooiVar, null), 3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, otq] */
    @Override // p000.InterfaceC0946qx
    /* JADX INFO: renamed from: b */
    public final void mo19362b() {
        drj drjVar = this.f47630j;
        String str = this.f47624d.f47514a;
        InterfaceC1082vy interfaceC1082vy = this.f47625e;
        C1056uz c1056uz = new C1056uz(str);
        if (!otu.m19066b(drjVar.f12395a.mo19057s(new C1037ug(c1056uz, interfaceC1082vy)))) {
            throw new IllegalStateException("There are more than 8 requests buffered!");
        }
        synchronized (this) {
            if (this.f47627g) {
                return;
            }
            if (this.f47621a != null) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f47622b != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f47621a = c1056uz;
            C1028ty c1028ty = new C1028ty(this.f47625e, this.f47626f, this.f47631k, this.f47629i, this.f47623c, null, null);
            this.f47622b = c1028ty;
            Map map = this.f47628h;
            if (map != null) {
                c1028ty.m19452c(map);
            }
            ooc.m18746l(this.f47623c, null, new C1001sy(this, null), 3);
        }
    }

    @Override // p000.InterfaceC0946qx
    /* JADX INFO: renamed from: c */
    public final void mo19363c(Map map) {
        synchronized (this) {
            if (this.f47627g) {
                return;
            }
            this.f47628h = map;
            C1028ty c1028ty = this.f47622b;
            if (c1028ty != null) {
                c1028ty.m19452c(map);
            }
        }
    }
}
