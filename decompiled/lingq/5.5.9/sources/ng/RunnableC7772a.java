package ng;

import ag.C0076c;
import android.os.Bundle;
import gh.C5795c;
import gh.C5797e;
import p300og.InterfaceC8041a;
import p341qg.C8618d;
import p341qg.InterfaceC8619e;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: ng.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7772a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8619e f42698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7773b f42699b;

    public RunnableC7772a(C7773b c7773b, InterfaceC8619e interfaceC8619e) {
        this.f42699b = c7773b;
        this.f42698a = interfaceC8619e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        byte b10;
        InterfaceC10488f interfaceC10488f;
        InterfaceC10488f interfaceC10488f2;
        while (true) {
            Bundle bundle = (Bundle) this.f42699b.f42708f.poll();
            if (bundle != null) {
                try {
                    String string = bundle.getString("method", "");
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1145074941) {
                        if (iHashCode != -1053259179) {
                            b10 = (iHashCode == -97843184 && string.equals("setPushNotificationsWatchedValuesOverride")) ? (byte) 2 : (byte) -1;
                        } else if (string.equals("setActiveStateOverride")) {
                            b10 = 0;
                        }
                    } else if (string.equals("setInstallWatchedValuesOverride")) {
                        b10 = 1;
                    }
                    if (b10 == 0) {
                        boolean z10 = bundle.getBoolean("activeState", false);
                        C8618d c8618d = (C8618d) this.f42698a;
                        synchronized (c8618d) {
                            c8618d.f46107e.mo12962h(z10);
                            c8618d.mo12962h(z10);
                        }
                    } else if (b10 == 1) {
                        C10487e c10487eM19446v = C10487e.m19446v(bundle.getString("installWatchedValues", ""), true);
                        C8618d c8618d2 = (C8618d) this.f42698a;
                        synchronized (c8618d2) {
                            C5797e c5797eM12186l = c8618d2.f46106d.m12186l();
                            synchronized (c5797eM12186l) {
                                try {
                                    interfaceC10488f2 = c5797eM12186l.f35034g;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            C10487e c10487eMo19451a = interfaceC10488f2.mo19451a();
                            c10487eMo19451a.mo19464n(c10487eM19446v);
                            c8618d2.f46106d.m12186l().m12207p(c10487eMo19451a);
                        }
                    } else if (b10 == 2) {
                        C10487e c10487eM19446v2 = C10487e.m19446v(bundle.getString("pushNotificationsWatchedValues", ""), true);
                        C8618d c8618d3 = (C8618d) this.f42698a;
                        synchronized (c8618d3) {
                            C5795c c5795cM12182h = c8618d3.f46106d.m12182h();
                            synchronized (c5795cM12182h) {
                                try {
                                    interfaceC10488f = c5795cM12182h.f35017c;
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                            C10487e c10487eMo19451a2 = interfaceC10488f.mo19451a();
                            c10487eMo19451a2.mo19464n(c10487eM19446v2);
                            c8618d3.f46106d.m12182h().m12195h(c10487eMo19451a2);
                        }
                    }
                } catch (Throwable th4) {
                    C0076c c0076c = C7773b.f42700i;
                    c0076c.m460d("action failed, unknown error occurred");
                    c0076c.m460d(th4);
                }
            } else {
                while (((C7773b.a) this.f42699b.f42707e.poll()) != null) {
                    try {
                        ((C8618d) this.f42698a).m16841r();
                        throw null;
                    } catch (Throwable th5) {
                        C0076c c0076c2 = C7773b.f42700i;
                        c0076c2.m460d("processDeeplink failed, unknown error occurred");
                        c0076c2.m460d(th5);
                    }
                }
                while (true) {
                    InterfaceC8041a interfaceC8041a = (InterfaceC8041a) this.f42699b.f42706d.poll();
                    if (interfaceC8041a == null) {
                        return;
                    }
                    try {
                        ((C8618d) this.f42698a).m16842s(interfaceC8041a);
                    } catch (Throwable th6) {
                        C0076c c0076c3 = C7773b.f42700i;
                        c0076c3.m460d("retrieveAttribution failed, unknown error occurred");
                        c0076c3.m460d(th6);
                    }
                }
            }
        }
    }
}
