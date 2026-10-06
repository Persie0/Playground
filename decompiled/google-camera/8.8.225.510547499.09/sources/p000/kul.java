package p000;

import androidx.wear.ambient.AmbientMode;
import p021j$.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kul {

    /* JADX INFO: renamed from: a */
    private final kun f37230a;

    /* JADX INFO: renamed from: b */
    private final kun f37231b;

    /* JADX INFO: renamed from: c */
    private final kun f37232c;

    /* JADX INFO: renamed from: d */
    private final kun f37233d;

    /* JADX INFO: renamed from: e */
    private double f37234e = -1.0d;

    /* JADX INFO: renamed from: f */
    private double f37235f = -1.0d;

    public kul(final AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        kun kunVar = new kun();
        this.f37230a = kunVar;
        final int i = 1;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        final byte[] bArr7 = null;
        final byte[] bArr8 = null;
        kunVar.m14898b(70.0d, new kum(ambientController, i, bArr5, bArr6, bArr7, bArr8) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        final int i2 = 0;
        final byte[] bArr9 = null;
        final byte[] bArr10 = null;
        final byte[] bArr11 = null;
        final byte[] bArr12 = null;
        kunVar.m14899c(new kum(ambientController, i2, bArr9, bArr10, bArr11, bArr12) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        kun kunVar2 = new kun();
        this.f37231b = kunVar2;
        final int i3 = 2;
        final byte[] bArr13 = null;
        final byte[] bArr14 = null;
        kunVar2.m14898b(1.1d, new kum(ambientController, i3, bArr7, bArr8, bArr13, bArr14) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        kun kunVar3 = new kun();
        this.f37232c = kunVar3;
        final int i4 = 3;
        kunVar3.m14898b(70.0d, new kum(ambientController, i4, bArr7, bArr8, bArr13, bArr14) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        final int i5 = 4;
        final byte[] bArr15 = null;
        final byte[] bArr16 = null;
        kunVar3.m14899c(new kum(ambientController, i5, bArr11, bArr12, bArr15, bArr16) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        kun kunVar4 = new kun();
        this.f37233d = kunVar4;
        final int i6 = 5;
        final byte[] bArr17 = null;
        final byte[] bArr18 = null;
        kunVar4.m14898b(125.0d, new kum(ambientController, i6, bArr17, bArr18, bArr7, bArr8) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
        final int i7 = 6;
        final byte[] bArr19 = null;
        final byte[] bArr20 = null;
        kunVar4.m14899c(new kum(ambientController, i7, bArr19, bArr20, bArr11, bArr12) { // from class: kuk

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AmbientMode.AmbientController f37228a;

            /* JADX INFO: renamed from: b */
            private final /* synthetic */ int f37229b;

            @Override // p000.kum
            /* JADX INFO: renamed from: a */
            public final void mo14895a(double d) {
                switch (this.f37229b) {
                    case 0:
                        this.f37228a.m1629b(1, d, 0.25d);
                        return;
                    case 1:
                        this.f37228a.m1629b(0, d, 70.0d);
                        return;
                    case 2:
                        AmbientMode.AmbientController ambientController2 = this.f37228a;
                        ambientController2.m1629b(2, d, 1.1d);
                        if (d > 1.7d) {
                            synchronized (ambientController2.f1697a) {
                                for (dlf dlfVar : ((dlg) ambientController2.f1697a).f11935b) {
                                    dlfVar.f11931c.put(8, Integer.valueOf(((Integer) Map.EL.getOrDefault(dlfVar.f11931c, 8, 0)).intValue() + 1));
                                }
                                break;
                            }
                            ((nbe) ((nbe) dlg.f11934a.m17252c()).mo17276G(976)).mo17301z("%s > %s", ((dlg) ambientController2.f1697a).f11937d, "unknown jank type 8");
                            return;
                        }
                        return;
                    case 3:
                        this.f37228a.m1629b(3, d, 70.0d);
                        return;
                    case 4:
                        this.f37228a.m1629b(4, d, 0.25d);
                        return;
                    case 5:
                        this.f37228a.m1629b(5, d, 125.0d);
                        return;
                    default:
                        this.f37228a.m1629b(6, d, 0.25d);
                        return;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m14896a(long j, long j2) {
        double d = this.f37234e;
        double d2 = j;
        Double.isNaN(d2);
        double d3 = d2 / 1000000.0d;
        if (d > 0.0d) {
            double d4 = d3 - d;
            this.f37230a.m14897a(d4);
            this.f37231b.m14897a(d4 / this.f37235f);
        }
        double d5 = j2;
        Double.isNaN(d5);
        double d6 = d5 / 1000000.0d;
        this.f37234e = d3;
        this.f37235f = d6;
    }
}
