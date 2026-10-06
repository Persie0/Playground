package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.system.Os;
import android.util.Log;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kij implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f36164a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f36165b;

    public /* synthetic */ kij(BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f36165b = i;
        this.f36164a = pendingResult;
    }

    public /* synthetic */ kij(Context context, int i) {
        this.f36165b = i;
        this.f36164a = context;
    }

    public /* synthetic */ kij(FileDescriptor fileDescriptor, int i) {
        this.f36165b = i;
        this.f36164a = fileDescriptor;
    }

    public /* synthetic */ kij(String str, int i) {
        this.f36165b = i;
        this.f36164a = str;
    }

    public /* synthetic */ kij(kae kaeVar, int i) {
        this.f36165b = i;
        this.f36164a = kaeVar;
    }

    public /* synthetic */ kij(kih kihVar, int i) {
        this.f36165b = i;
        this.f36164a = kihVar;
    }

    public /* synthetic */ kij(kwp kwpVar, int i) {
        this.f36165b = i;
        this.f36164a = kwpVar;
    }

    public /* synthetic */ kij(lgl lglVar, int i) {
        this.f36165b = i;
        this.f36164a = lglVar;
    }

    public /* synthetic */ kij(lto ltoVar, int i) {
        this.f36165b = i;
        this.f36164a = ltoVar;
    }

    public /* synthetic */ kij(nps npsVar, int i) {
        this.f36165b = i;
        this.f36164a = npsVar;
    }

    public /* synthetic */ kij(oek oekVar, int i) {
        this.f36165b = i;
        this.f36164a = oekVar;
    }

    public /* synthetic */ kij(oem oemVar, int i) {
        this.f36165b = i;
        this.f36164a = oemVar;
    }

    /* JADX WARN: Code duplicated, block: B:177:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, nps] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, oeo] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        lqq lqqVarM18426f;
        boolean z;
        mbb mbbVar;
        oep oepVar;
        switch (this.f36165b) {
            case 0:
                return (kfd) this.f36164a.get();
            case 1:
                Object obj = this.f36164a;
                synchronized (((kae) obj).f35459a) {
                    int i = ((kae) obj).f35462d;
                    if (i != 4) {
                        Log.e("VidRecMedRec", "PAUSED is expected but we get " + kbd.m13919h(i));
                    } else {
                        ((kae) obj).f35462d = 4;
                        ((kae) obj).f35460b.mo5594g();
                    }
                }
                return null;
            case 2:
                return (kfd) ((kih) this.f36164a).f36161a.get();
            case 3:
                return (kfd) ((kih) this.f36164a).f36161a.get();
            case 4:
                return ((kwp) this.f36164a).f37521a.mo8060a().toByteArray();
            case 5:
                return ((kwp) this.f36164a).f37521a.mo8060a().toByteArray();
            case 6:
                ((lgl) this.f36164a).m15319b();
                return null;
            case 7:
                ((lgl) this.f36164a).m15319b();
                return null;
            case 8:
                ((BroadcastReceiver.PendingResult) this.f36164a).finish();
                return null;
            case 9:
                return abx.m172d((Context) this.f36164a);
            case 10:
                return abs.m151a((Context) this.f36164a);
            case 11:
                return Os.lstat((String) this.f36164a);
            case 12:
                return Os.fstat((FileDescriptor) this.f36164a);
            case 13:
                Object obj2 = this.f36164a;
                synchronized (((lto) obj2).f39188b.f39192d) {
                    ((lto) obj2).f39187a = null;
                    break;
                }
                return null;
            case 14:
                Object obj3 = this.f36164a;
                try {
                    synchronized (obj3) {
                        break;
                    }
                    ((oek) obj3).m18423c();
                    try {
                        try {
                            OutputStream outputStream = ((oek) obj3).f45738a.getOutputStream();
                            ((oek) obj3).f45738a.connect();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            int i2 = 0;
                            while (((oek) obj3).m18425e()) {
                                ((oek) obj3).m18423c();
                                int i3 = 0;
                                while (i3 < 65536 && ((oek) obj3).m18425e()) {
                                    try {
                                        int iMo18407a = ((oek) obj3).f45739b.mo18407a(((oek) obj3).f45740c, i3, 65536 - i3);
                                        ((oek) obj3).f45741d += (long) iMo18407a;
                                        i3 += iMo18407a;
                                        try {
                                            outputStream.write(((oek) obj3).f45740c, i3 - iMo18407a, iMo18407a);
                                        } catch (IOException e) {
                                            lqqVarM18426f = ((oek) obj3).m18426f();
                                            synchronized (obj3) {
                                                return new mbb(lqqVarM18426f, (byte[]) null, (byte[]) null);
                                            }
                                        }
                                    } catch (IOException e2) {
                                        throw new oeq(oep.f45766c, e2);
                                    }
                                }
                                i2 += i3;
                                if (i2 >= ((oek) obj3).f45742e) {
                                    if (((oek) obj3).f45743f > 0) {
                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                        if (jCurrentTimeMillis2 - jCurrentTimeMillis >= ((oek) obj3).f45743f) {
                                            jCurrentTimeMillis = jCurrentTimeMillis2;
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        synchronized (obj3) {
                                            lij lijVar = ((oek) obj3).f45745h;
                                            if (lijVar != null) {
                                                ((oel) lijVar).f45747b.mo15457M(((oel) lijVar).f45746a);
                                            }
                                        }
                                        i2 = 0;
                                    }
                                }
                            }
                            lqqVarM18426f = ((oek) obj3).m18426f();
                        } catch (IOException e3) {
                            try {
                                lqqVarM18426f = ((oek) obj3).m18426f();
                            } catch (oeq e4) {
                                throw new oeq(oep.CONNECTION_ERROR, e3);
                            }
                            break;
                        }
                        synchronized (obj3) {
                            break;
                        }
                        return new mbb(lqqVarM18426f, (byte[]) null, (byte[]) null);
                    } catch (FileNotFoundException e5) {
                        throw new oeq(oep.BAD_URL, e5);
                    }
                } catch (oeq e6) {
                    synchronized (obj3) {
                        return new mbb(e6);
                    }
                }
            default:
                ?? r0 = this.f36164a;
                try {
                    mbbVar = new mbb(((oem) r0).f45748a == null ? ((oem) r0).m18437e() : ((oem) r0).m18436c(true), (byte[]) null, (byte[]) null);
                    break;
                } catch (oeq e7) {
                    mbbVar = new mbb(e7);
                } catch (Throwable th) {
                    mbbVar = new mbb(new oeq(oep.UNKNOWN, th));
                }
                synchronized (r0) {
                    lij lijVar2 = ((oem) r0).f45751d;
                    if (lijVar2 != null) {
                        Object obj4 = mbbVar.f39761b;
                        if (obj4 != null) {
                            int i4 = ((lqq) obj4).f39001a;
                            if (i4 != 200) {
                                Integer numValueOf = Integer.valueOf(i4);
                                if (numValueOf.intValue() != 503) {
                                    numValueOf = null;
                                }
                                if (numValueOf != null) {
                                    numValueOf.intValue();
                                    oepVar = oep.CONNECTION_ERROR;
                                } else {
                                    oepVar = null;
                                }
                                ((mcl) lijVar2).m16311a((oeo) r0, new oeq(oepVar, "Bad response code " + i4 + " with body " + mcj.m16310a((lqq) obj4)));
                            }
                            Object obj5 = ((lqq) obj4).f39003c;
                            if (((oej) obj5).m18420f("X-F250-Blob-ID")) {
                                String strM18415a = ((oej) obj5).m18415a("X-F250-Blob-ID");
                                strM18415a.getClass();
                                ooc.m18750p(((mcl) lijVar2).f39954a, new meb(strM18415a));
                                ((mcl) lijVar2).f39954a.mo19062x(null);
                            } else if (((oej) obj5).m18420f("X-F250-Resource-ID")) {
                                String strM18415a2 = ((oej) obj5).m18415a("X-F250-Resource-ID");
                                strM18415a2.getClass();
                                ooc.m18750p(((mcl) lijVar2).f39954a, new mee(strM18415a2));
                                ((mcl) lijVar2).f39954a.mo19062x(null);
                            } else {
                                ((mcl) lijVar2).m16311a((oeo) r0, new oeq((oep) null, "Invalid response headers " + obj5 + hiCTUJiAxf.HZpRsN + mcj.m16310a((lqq) obj4)));
                            }
                        } else {
                            Object obj6 = mbbVar.f39760a;
                            obj6.getClass();
                            ((mcl) lijVar2).m16311a((oeo) r0, (oeq) obj6);
                        }
                    }
                    break;
                }
                return mbbVar;
        }
    }
}
