package p000;

/* JADX INFO: renamed from: vc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1060vc implements oju {

    /* JADX INFO: renamed from: a */
    private final C1064vg f47805a;

    /* JADX INFO: renamed from: b */
    private final int f47806b;

    /* JADX INFO: renamed from: c */
    private final ljf f47807c;

    public C1060vc(C1064vg c1064vg, ljf ljfVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f47805a = c1064vg;
        this.f47807c = ljfVar;
        this.f47806b = i;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, vy] */
    @Override // p000.oju
    public final Object get() {
        switch (this.f47806b) {
            case 0:
                oqs oqsVar = (oqs) this.f47807c.f38371c.get();
                ljf ljfVar = this.f47807c;
                C1058va c1058va = (C1058va) ljfVar.f38373e;
                Object obj = c1058va.f47802a;
                ?? r5 = c1058va.f47803b;
                InterfaceC1023tt interfaceC1023tt = (InterfaceC1023tt) ljfVar.f38370b.get();
                ljf ljfVar2 = this.f47807c;
                drj drjVar = (drj) ((C1064vg) ljfVar2.f38374f).f47828b.get();
                C1058va c1058va2 = (C1058va) ljfVar2.f38373e;
                Object obj2 = c1058va2.f47802a;
                return new C1002sz(oqsVar, (C0948qz) obj, r5, interfaceC1023tt, new bck(drjVar, (C1097wm) c1058va2.f47804c, (byte[]) null, (byte[]) null), (drj) this.f47805a.f47835i.get(), (C1058va) this.f47805a.f47839m.get(), (C0846ne) this.f47805a.f47832f.get(), null, null, null, null);
            case 1:
                drj drjVar2 = (drj) this.f47805a.f47828b.get();
                drjVar2.getClass();
                return oqv.m18925f(((oln) drjVar2.f12399e).plus(new oqr("CXCP-Camera2Controller")));
            case 2:
                ljf ljfVar3 = this.f47807c;
                ?? r2 = ljfVar3.f38369a;
                Object obj3 = ((C1058va) ljfVar3.f38373e).f47802a;
                return (InterfaceC1023tt) r2.get();
            case 3:
                return new C0990sn((drj) this.f47805a.f47828b.get(), 1, (byte[]) null, (byte[]) null, (byte[]) null);
            case 4:
                drj drjVar3 = (drj) this.f47805a.f47828b.get();
                Object obj4 = ((C1058va) this.f47807c.f38373e).f47802a;
                return new C0990sn(drjVar3, 2, (char[]) null, (byte[]) null, (byte[]) null);
            case 5:
                return new C0990sn((drj) this.f47805a.f47828b.get(), 0, null, null);
            case 6:
                drj drjVar4 = (drj) this.f47805a.f47828b.get();
                C1058va c1058va3 = (C1058va) this.f47807c.f38373e;
                Object obj5 = c1058va3.f47804c;
                Object obj6 = c1058va3.f47802a;
                return new C0992sp(drjVar4, (C1097wm) obj5, (C0948qz) obj6, (InterfaceC1012ti) this.f47805a.f47833g.get(), 1, (byte[]) null, (byte[]) null);
            default:
                drj drjVar5 = (drj) this.f47805a.f47828b.get();
                C1058va c1058va4 = (C1058va) this.f47807c.f38373e;
                Object obj7 = c1058va4.f47802a;
                return new C0992sp(drjVar5, (C0948qz) obj7, (C1097wm) c1058va4.f47804c, (InterfaceC1012ti) this.f47805a.f47833g.get(), 0, (byte[]) null, (byte[]) null);
        }
    }
}
