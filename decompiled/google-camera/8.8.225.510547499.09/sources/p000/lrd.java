package p000;

import android.content.Context;
import android.hardware.camera2.CaptureResult;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrd {

    /* JADX INFO: renamed from: a */
    public final boolean f39056a;

    /* JADX INFO: renamed from: b */
    public final Object f39057b;

    /* JADX INFO: renamed from: c */
    public final Object f39058c;

    /* JADX INFO: renamed from: d */
    public final Object f39059d;

    /* JADX INFO: renamed from: e */
    public final Object f39060e;

    public lrd(kpp kppVar) {
        this.f39057b = (byte[]) m15909f(ivv.f32405n, kppVar);
        this.f39060e = (byte[]) m15909f(ivv.f32406o, kppVar);
        this.f39059d = (byte[]) m15909f(ivv.f32407p, kppVar);
        this.f39058c = (byte[]) m15909f(ivt.f32366t, kppVar);
        Integer num = (Integer) m15909f(ivx.f32444g, kppVar);
        boolean z = false;
        if (num != null && num.intValue() == 2) {
            z = true;
        }
        this.f39056a = z;
    }

    /* JADX INFO: renamed from: a */
    public static mwx m15907a(lre lreVar) {
        int i;
        mwt mwtVarM17116j = mwx.m17116j(lreVar.f39069g.size() + 3);
        for (lrf lrfVar : lreVar.f39069g) {
            int i2 = lrfVar.f39073b;
            switch (i2) {
                case 0:
                    i = 6;
                    break;
                case 1:
                default:
                    i = 0;
                    break;
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                    i = 3;
                    break;
                case 5:
                    i = 4;
                    break;
                case 6:
                    i = 5;
                    break;
            }
            if (i == 0) {
                throw null;
            }
            switch (i - 1) {
                case 0:
                    mwtVarM17116j.mo17110e(lrfVar.f39075d, Long.valueOf(i2 == 2 ? ((Long) lrfVar.f39074c).longValue() : 0L));
                    break;
                case 1:
                    mwtVarM17116j.mo17110e(lrfVar.f39075d, Boolean.valueOf(i2 == 3 ? ((Boolean) lrfVar.f39074c).booleanValue() : false));
                    break;
                case 2:
                    mwtVarM17116j.mo17110e(lrfVar.f39075d, Double.valueOf(i2 == 4 ? ((Double) lrfVar.f39074c).doubleValue() : 0.0d));
                    break;
                case 3:
                    mwtVarM17116j.mo17110e(lrfVar.f39075d, i2 == 5 ? (String) lrfVar.f39074c : "");
                    break;
                case 4:
                    mwtVarM17116j.mo17110e(lrfVar.f39075d, (i2 == 6 ? (nwr) lrfVar.f39074c : nwr.f44839b).m17804A());
                    break;
            }
        }
        mwtVarM17116j.mo17110e("__phenotype_server_token", lreVar.f39066d);
        mwtVarM17116j.mo17110e("__phenotype_snapshot_token", lreVar.f39064b);
        mwtVarM17116j.mo17110e("__phenotype_configuration_version", Long.valueOf(lreVar.f39067e));
        return mwtVarM17116j.m17109d();
    }

    /* JADX INFO: renamed from: e */
    public static final byte[] m15908e(byte[] bArr, byte b, boolean z) {
        int length = bArr.length;
        ByteBuffer byteBufferPut = ByteBuffer.allocate((true != z ? 2 : 5) + length).order(ByteOrder.nativeOrder()).put(b);
        if (z) {
            byteBufferPut.put(ByteBuffer.allocate(4).order(ByteOrder.nativeOrder()).putInt(length).array());
        } else {
            byteBufferPut.put((byte) length);
        }
        return byteBufferPut.put(bArr).array();
    }

    /* JADX INFO: renamed from: f */
    private static Object m15909f(CaptureResult.Key key, kpp kppVar) {
        if (key != null) {
            return kppVar.mo9517d(key);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    final nps m15910b(String str) {
        return nod.m17553i(((lpj) this.f39057b).m15828e().m15480c((String) this.f39059d, str), new mrf() { // from class: lrc
            @Override // p000.mrf
            public final Object apply(Object obj) {
                int i;
                lpy lpyVar = (lpy) obj;
                nxl nxlVarM18137O = lre.f39061h.m18137O();
                if (lpyVar == null) {
                    return (lre) nxlVarM18137O.mo18103l();
                }
                for (lpz lpzVar : lpyVar.f38937e) {
                    nxl nxlVarM18137O2 = lrf.f39070e.m18137O();
                    String str2 = lpzVar.f38946d;
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O2.f44974b;
                    lrf lrfVar = (lrf) nxqVar;
                    str2.getClass();
                    lrfVar.f39072a |= 1;
                    lrfVar.f39075d = str2;
                    int i2 = lpzVar.f38944b;
                    switch (i2) {
                        case 0:
                            i = 6;
                            break;
                        case 1:
                            i = 1;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    if (i == 0) {
                        throw null;
                    }
                    switch (i - 1) {
                        case 0:
                            long jLongValue = i2 == 1 ? ((Long) lpzVar.f38945c).longValue() : 0L;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            lrf lrfVar2 = (lrf) nxlVarM18137O2.f44974b;
                            lrfVar2.f39073b = 2;
                            lrfVar2.f39074c = Long.valueOf(jLongValue);
                            break;
                        case 1:
                            boolean zBooleanValue = i2 == 2 ? ((Boolean) lpzVar.f38945c).booleanValue() : false;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            lrf lrfVar3 = (lrf) nxlVarM18137O2.f44974b;
                            lrfVar3.f39073b = 3;
                            lrfVar3.f39074c = Boolean.valueOf(zBooleanValue);
                            break;
                        case 2:
                            double dDoubleValue = i2 == 3 ? ((Double) lpzVar.f38945c).doubleValue() : 0.0d;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            lrf lrfVar4 = (lrf) nxlVarM18137O2.f44974b;
                            lrfVar4.f39073b = 4;
                            lrfVar4.f39074c = Double.valueOf(dDoubleValue);
                            break;
                        case 3:
                            String str3 = i2 == 4 ? (String) lpzVar.f38945c : "";
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            lrf lrfVar5 = (lrf) nxlVarM18137O2.f44974b;
                            str3.getClass();
                            lrfVar5.f39073b = 5;
                            lrfVar5.f39074c = str3;
                            break;
                        case 4:
                            nwr nwrVar = i2 == 5 ? (nwr) lpzVar.f38945c : nwr.f44839b;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            lrf lrfVar6 = (lrf) nxlVarM18137O2.f44974b;
                            nwrVar.getClass();
                            lrfVar6.f39073b = 6;
                            lrfVar6.f39074c = nwrVar;
                            break;
                        default:
                            throw new IllegalStateException("No known flag type");
                    }
                    lrf lrfVar7 = (lrf) nxlVarM18137O2.mo18103l();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    lre lreVar = (lre) nxlVarM18137O.f44974b;
                    lrfVar7.getClass();
                    nxy nxyVar = lreVar.f39069g;
                    if (!nxyVar.mo17770c()) {
                        lreVar.f39069g = nxq.m18127U(nxyVar);
                    }
                    lreVar.f39069g.add(lrfVar7);
                }
                String str4 = lpyVar.f38936d;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                lre lreVar2 = (lre) nxqVar2;
                str4.getClass();
                lreVar2.f39063a = 4 | lreVar2.f39063a;
                lreVar2.f39066d = str4;
                String str5 = lpyVar.f38934b;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar3 = nxlVarM18137O.f44974b;
                lre lreVar3 = (lre) nxqVar3;
                str5.getClass();
                lreVar3.f39063a = 1 | lreVar3.f39063a;
                lreVar3.f39064b = str5;
                long j = lpyVar.f38940h;
                if (!nxqVar3.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar4 = nxlVarM18137O.f44974b;
                lre lreVar4 = (lre) nxqVar4;
                lreVar4.f39063a |= 8;
                lreVar4.f39067e = j;
                if ((lpyVar.f38933a & 2) != 0) {
                    nwr nwrVar2 = lpyVar.f38935c;
                    if (!nxqVar4.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    lre lreVar5 = (lre) nxlVarM18137O.f44974b;
                    nwrVar2.getClass();
                    lreVar5.f39063a |= 2;
                    lreVar5.f39065c = nwrVar2;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                lre lreVar6 = (lre) nxlVarM18137O.f44974b;
                lreVar6.f39063a |= 16;
                lreVar6.f39068f = jCurrentTimeMillis;
                return (lre) nxlVarM18137O.mo18103l();
            }
        }, ((lpj) this.f39057b).m15826b());
    }

    /* JADX INFO: renamed from: c */
    public final nps m15911c(lre lreVar) {
        return kxk.m14969O(new cpb(this, lreVar, 11), ((lpj) this.f39057b).m15826b());
    }

    /* JADX INFO: renamed from: d */
    public final void m15912d() {
        ((hst) this.f39058c).m10713l(9, -1, (View) this.f39057b);
    }

    public lrd(Context context, hst hstVar, oju ojuVar, boolean z, gvo gvoVar) {
        this.f39058c = hstVar;
        this.f39056a = z;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39057b = frameLayout;
        View.inflate(context, C0100R.layout.edu_bottomsheet, frameLayout);
        frameLayout.findViewById(C0100R.id.learn_more_button).setOnClickListener(new flr(context, 17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f39059d = frameLayout2;
        View.inflate(context, C0100R.layout.setup_flow_bottomsheet, frameLayout2);
        frameLayout2.findViewById(C0100R.id.photos_button).setOnClickListener(new iae(this, gvoVar, ojuVar, 0, null));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f39060e = frameLayout3;
        View.inflate(context, C0100R.layout.ineligible_bottomsheet, frameLayout3);
        frameLayout3.findViewById(C0100R.id.learn_more_button).setOnClickListener(new flr(context, 18));
    }

    public lrd(lpj lpjVar, String str, String str2, boolean z) {
        this.f39057b = lpjVar;
        this.f39059d = str;
        this.f39060e = str2;
        this.f39056a = z;
        lsd lsdVarM15942a = lse.m15942a(lpjVar.f38894c);
        lsdVarM15942a.m15940b("phenotype");
        lsdVarM15942a.m15941c(str2 + "/" + str + ".pb");
        if (z) {
            int i = kuh.f37221a;
            lij.m15448r(lse.f39131d.contains("directboot-files"), "The only supported locations are %s: %s", lse.f39131d, "directboot-files");
            lsdVarM15942a.f39122a = "directboot-files";
        }
        this.f39058c = lsdVarM15942a.m15939a();
    }
}
