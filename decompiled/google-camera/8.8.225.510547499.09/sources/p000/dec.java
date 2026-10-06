package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dec {

    /* JADX INFO: renamed from: a */
    public static final long f10643a = TimeUnit.SECONDS.toMicros(120);

    /* JADX INFO: renamed from: b */
    public static final String[] f10644b = {"BarhopperV2", "DocumentCornerFixedInputShapeClient", "MobileIcaV2ClassifierEmbedder"};

    /* JADX INFO: renamed from: c */
    public final dhv f10645c;

    /* JADX INFO: renamed from: d */
    public final Context f10646d;

    /* JADX INFO: renamed from: e */
    private final boolean f10647e;

    /* JADX INFO: renamed from: f */
    private final boolean f10648f;

    /* JADX INFO: renamed from: g */
    private final List f10649g = new ArrayList();

    /* JADX INFO: renamed from: h */
    private final cwd f10650h;

    public dec(dhv dhvVar, boolean z, boolean z2, cwd cwdVar, Context context, byte[] bArr, byte[] bArr2) {
        this.f10645c = dhvVar;
        this.f10647e = z;
        this.f10648f = z2;
        this.f10646d = context;
        this.f10650h = cwdVar;
    }

    /* JADX INFO: renamed from: n */
    private final mfb m5975n() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(zuAgeeF.LmzqMuTtzmsXvMO);
        if (this.f10645c.mo6184l(dig.f11503q)) {
            arrayList.add("BarcodeReader");
        }
        nxl nxlVarM18137O = mfb.f40297e.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        mfb mfbVar = (mfb) nxqVar;
        mfbVar.f40299a |= 2;
        mfbVar.f40302d = true;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        mfb mfbVar2 = (mfb) nxlVarM18137O.f44974b;
        mfbVar2.f40299a |= 1;
        mfbVar2.f40300b = "EarlyPipeline";
        nxlVarM18137O.m18038A(arrayList);
        return (mfb) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: o */
    private final mws m5976o() {
        long micros = TimeUnit.SECONDS.toMicros(1L) / ((long) ((Integer) this.f10645c.mo6173a(dig.f11489c).get()).intValue());
        nxl nxlVarM18137O = meo.f40205e.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        meo.m16338b((meo) nxlVarM18137O.f44974b);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        meo meoVar = (meo) nxqVar;
        meoVar.f40207a |= 8;
        meoVar.f40210d = micros;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        meo meoVar2 = (meo) nxlVarM18137O.f44974b;
        meoVar2.f40207a |= 4;
        meoVar2.f40209c = micros;
        long micros2 = TimeUnit.SECONDS.toMicros(15L);
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        meo meoVar3 = (meo) nxlVarM18137O.f44974b;
        meoVar3.f40207a |= 2;
        meoVar3.f40208b = micros2;
        meo meoVar4 = (meo) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = meo.f40205e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        meo.m16338b((meo) nxlVarM18137O2.f44974b);
        long micros3 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        meo meoVar5 = (meo) nxlVarM18137O2.f44974b;
        meoVar5.f40207a |= 8;
        meoVar5.f40210d = micros3;
        long micros4 = TimeUnit.MILLISECONDS.toMicros(1000L);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        meo meoVar6 = (meo) nxlVarM18137O2.f44974b;
        meoVar6.f40207a |= 4;
        meoVar6.f40209c = micros4;
        long micros5 = TimeUnit.SECONDS.toMicros(15L);
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        meo meoVar7 = (meo) nxlVarM18137O2.f44974b;
        meoVar7.f40207a |= 2;
        meoVar7.f40208b = micros5;
        meo meoVar8 = (meo) nxlVarM18137O2.mo18103l();
        nxl nxlVarM18137O3 = meo.f40205e.m18137O();
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        meo.m16338b((meo) nxlVarM18137O3.f44974b);
        long micros6 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        meo meoVar9 = (meo) nxlVarM18137O3.f44974b;
        meoVar9.f40207a |= 8;
        meoVar9.f40210d = micros6;
        long micros7 = TimeUnit.MILLISECONDS.toMicros(1500L);
        if (!nxlVarM18137O3.f44974b.m18142ac()) {
            nxlVarM18137O3.mo18106p();
        }
        meo meoVar10 = (meo) nxlVarM18137O3.f44974b;
        meoVar10.f40207a |= 4;
        meoVar10.f40209c = micros7;
        return mws.m17099n(meoVar4, meoVar8, (meo) nxlVarM18137O3.mo18103l());
    }

    /* JADX INFO: renamed from: p */
    private final boolean m5977p() {
        return this.f10645c.mo6184l(dig.f11505s) && this.f10645c.mo6184l(dig.f11504r);
    }

    /* JADX INFO: renamed from: q */
    private final nxl m5978q() {
        nxl nxlVarM18137O = mfc.f40303b.m18137O();
        nxlVarM18137O.m18115z(m5975n());
        nxl nxlVarM18137O2 = mfb.f40297e.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O2.f44974b;
        mfb mfbVar = (mfb) nxqVar;
        mfbVar.f40299a |= 2;
        mfbVar.f40302d = false;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        mfb mfbVar2 = (mfb) nxlVarM18137O2.f44974b;
        mfbVar2.f40299a |= 1;
        mfbVar2.f40300b = "LazyPipeline";
        nxlVarM18137O.m18115z((mfb) nxlVarM18137O2.mo18103l());
        return nxlVarM18137O;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized AssetFileDescriptor m5979a(String str) {
        AssetFileDescriptor assetFileDescriptorOpenFd;
        assetFileDescriptorOpenFd = ((Context) this.f10650h.f9866a).getAssets().openFd(str);
        this.f10649g.add(assetFileDescriptorOpenFd);
        return assetFileDescriptorOpenFd;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5980b() {
        Iterator it = this.f10649g.iterator();
        while (it.hasNext()) {
            ((AssetFileDescriptor) it.next()).close();
        }
        this.f10649g.clear();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5981c() {
        if (m5977p()) {
            return m5984f() || m5982d() || m5983e();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5982d() {
        return this.f10648f && m5977p() && this.f10645c.mo6184l(dig.f11510x);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5983e() {
        return this.f10645c.mo6184l(dig.f11511y) && m5977p();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5984f() {
        return this.f10647e && m5977p() && this.f10645c.mo6184l(dig.f11509w);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5985g() {
        return this.f10645c.mo6184l(dig.f11503q) || m5981c();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5986h() {
        return m5984f() || m5983e();
    }

    /* JADX INFO: renamed from: i */
    public final mey m5987i(int i) {
        switch (i - 1) {
            case 1:
                nxl nxlVarM18137O = mey.f40280d.m18137O();
                nxl nxlVarM18137O2 = men.f40198e.m18137O();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                men.m16337b((men) nxlVarM18137O2.f44974b);
                nxlVarM18137O2.m18114y("CoarseClassifierTexto128V2_3");
                nxlVarM18137O2.m18114y("BarcodeReader");
                long j = f10643a;
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                men menVar = (men) nxlVarM18137O2.f44974b;
                menVar.f40200a |= 2;
                menVar.f40203d = j;
                long micros = TimeUnit.SECONDS.toMicros(1L) / ((long) ((Integer) this.f10645c.mo6173a(dig.f11490d).get()).intValue());
                nxl nxlVarM18137O3 = meo.f40205e.m18137O();
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                meo.m16338b((meo) nxlVarM18137O3.f44974b);
                if (!nxlVarM18137O3.f44974b.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O3.f44974b;
                meo meoVar = (meo) nxqVar;
                meoVar.f40207a |= 8;
                meoVar.f40210d = micros;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O3.mo18106p();
                }
                meo meoVar2 = (meo) nxlVarM18137O3.f44974b;
                meoVar2.f40207a |= 4;
                meoVar2.f40209c = micros;
                nxlVarM18137O2.m18113x(mws.m17097l((meo) nxlVarM18137O3.mo18103l()));
                nxl nxlVarM18137O4 = mep.f40212b.m18137O();
                nxlVarM18137O4.m18068aE(nxlVarM18137O2);
                mep mepVar = (mep) nxlVarM18137O4.mo18103l();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                mey meyVar = (mey) nxlVarM18137O.f44974b;
                mepVar.getClass();
                meyVar.f40283b = mepVar;
                meyVar.f40282a |= 2;
                nxl nxlVarM5978q = m5978q();
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                mey meyVar2 = (mey) nxlVarM18137O.f44974b;
                mfc mfcVar = (mfc) nxlVarM5978q.mo18103l();
                mfcVar.getClass();
                meyVar2.f40284c = mfcVar;
                meyVar2.f40282a |= 8;
                return (mey) nxlVarM18137O.mo18103l();
            case 2:
                if (!this.f10645c.mo6184l(dig.f11503q)) {
                    return mey.f40280d;
                }
                nxl nxlVarM18137O5 = mey.f40280d.m18137O();
                nxl nxlVarM18137O6 = men.f40198e.m18137O();
                if (!nxlVarM18137O6.f44974b.m18142ac()) {
                    nxlVarM18137O6.mo18106p();
                }
                men.m16337b((men) nxlVarM18137O6.f44974b);
                nxlVarM18137O6.m18114y("CoarseClassifierTexto128V2_3");
                nxlVarM18137O6.m18114y("BarcodeReader");
                long j2 = f10643a;
                if (!nxlVarM18137O6.f44974b.m18142ac()) {
                    nxlVarM18137O6.mo18106p();
                }
                men menVar2 = (men) nxlVarM18137O6.f44974b;
                menVar2.f40200a |= 2;
                menVar2.f40203d = j2;
                nxlVarM18137O6.m18113x(m5976o());
                nxl nxlVarM18137O7 = mep.f40212b.m18137O();
                nxlVarM18137O7.m18068aE(nxlVarM18137O6);
                mep mepVar2 = (mep) nxlVarM18137O7.mo18103l();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                mey meyVar3 = (mey) nxlVarM18137O5.f44974b;
                mepVar2.getClass();
                meyVar3.f40283b = mepVar2;
                meyVar3.f40282a |= 2;
                nxl nxlVarM5978q2 = m5978q();
                if (!nxlVarM18137O5.f44974b.m18142ac()) {
                    nxlVarM18137O5.mo18106p();
                }
                mey meyVar4 = (mey) nxlVarM18137O5.f44974b;
                mfc mfcVar2 = (mfc) nxlVarM5978q2.mo18103l();
                mfcVar2.getClass();
                meyVar4.f40284c = mfcVar2;
                meyVar4.f40282a |= 8;
                return (mey) nxlVarM18137O5.mo18103l();
            default:
                nxl nxlVarM18137O8 = mey.f40280d.m18137O();
                nxl nxlVarM18137O9 = men.f40198e.m18137O();
                if (!nxlVarM18137O9.f44974b.m18142ac()) {
                    nxlVarM18137O9.mo18106p();
                }
                men.m16337b((men) nxlVarM18137O9.f44974b);
                nxlVarM18137O9.m18114y("CoarseClassifierTexto128V2_3");
                if (this.f10645c.mo6184l(dig.f11503q)) {
                    nxlVarM18137O9.m18114y("BarcodeReader");
                }
                if (m5986h() || m5982d()) {
                    nxlVarM18137O9.m18114y("MobileIcaV2ClassifierEmbedder");
                }
                long j3 = f10643a;
                if (!nxlVarM18137O9.f44974b.m18142ac()) {
                    nxlVarM18137O9.mo18106p();
                }
                men menVar3 = (men) nxlVarM18137O9.f44974b;
                menVar3.f40200a |= 2;
                menVar3.f40203d = j3;
                nxlVarM18137O9.m18113x(m5976o());
                nxl nxlVarM18137O10 = mep.f40212b.m18137O();
                nxlVarM18137O10.m18068aE(nxlVarM18137O9);
                mep mepVar3 = (mep) nxlVarM18137O10.mo18103l();
                if (!nxlVarM18137O8.f44974b.m18142ac()) {
                    nxlVarM18137O8.mo18106p();
                }
                mey meyVar5 = (mey) nxlVarM18137O8.f44974b;
                mepVar3.getClass();
                meyVar5.f40283b = mepVar3;
                meyVar5.f40282a |= 2;
                nxl nxlVarM18137O11 = mfc.f40303b.m18137O();
                nxlVarM18137O11.m18115z(m5975n());
                ArrayList arrayList = new ArrayList();
                if (m5986h() || m5982d()) {
                    arrayList.add("MobileIcaV2ClassifierEmbedder");
                }
                if (m5983e()) {
                    arrayList.add("DocumentCornerFixedInputShapeClient");
                }
                nxl nxlVarM18137O12 = mfb.f40297e.m18137O();
                nxlVarM18137O12.m18038A(arrayList);
                if (!nxlVarM18137O12.f44974b.m18142ac()) {
                    nxlVarM18137O12.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O12.f44974b;
                mfb mfbVar = (mfb) nxqVar2;
                mfbVar.f40299a |= 2;
                mfbVar.f40302d = false;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O12.mo18106p();
                }
                mfb mfbVar2 = (mfb) nxlVarM18137O12.f44974b;
                mfbVar2.f40299a |= 1;
                mfbVar2.f40300b = "LazyPipeline";
                nxlVarM18137O11.m18115z((mfb) nxlVarM18137O12.mo18103l());
                if (!nxlVarM18137O8.f44974b.m18142ac()) {
                    nxlVarM18137O8.mo18106p();
                }
                mey meyVar6 = (mey) nxlVarM18137O8.f44974b;
                mfc mfcVar3 = (mfc) nxlVarM18137O11.mo18103l();
                mfcVar3.getClass();
                meyVar6.f40284c = mfcVar3;
                meyVar6.f40282a |= 8;
                return (mey) nxlVarM18137O8.mo18103l();
        }
    }

    /* JADX INFO: renamed from: j */
    public final meu m5988j(nxn nxnVar) {
        nxl nxlVarM18137O = meu.f40226g.m18137O();
        dhv dhvVar = this.f10645c;
        String[] strArr = dig.f11487a;
        dhvVar.mo6177e();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        meu meuVar = (meu) nxqVar;
        meuVar.f40228a |= 2;
        meuVar.f40232e = false;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        meu meuVar2 = (meu) nxlVarM18137O.f44974b;
        mex mexVar = (mex) nxnVar.mo18103l();
        mexVar.getClass();
        meuVar2.f40231d = mexVar;
        meuVar2.f40228a |= 1;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        meu meuVar3 = (meu) nxlVarM18137O.f44974b;
        meuVar3.f40229b = 6;
        meuVar3.f40230c = true;
        return (meu) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: k */
    public final nxn m5989k() {
        nxn nxnVar = (nxn) mex.f40265k.m18137O();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        mex mexVar = (mex) nxnVar.f44974b;
        mexVar.f40267a |= 1024;
        mexVar.f40272f = true;
        dhv dhvVar = this.f10645c;
        String[] strArr = dig.f11487a;
        dhvVar.mo6177e();
        return nxnVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m5990l(nxn nxnVar) {
        if (this.f10645c.mo6184l(dig.f11503q)) {
            mws mwsVar = dei.f10657a;
            nxl nxlVarM18137O = mff.f40317d.m18137O();
            nxlVarM18137O.m18039B(8);
            nxlVarM18137O.m18039B(7);
            nxlVarM18137O.m18039B(10);
            nxlVarM18137O.m18039B(11);
            nxlVarM18137O.m18039B(12);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            mff mffVar = (mff) nxlVarM18137O.f44974b;
            mffVar.f40321c = 2;
            mffVar.f40319a |= 4;
            mff mffVar2 = (mff) nxlVarM18137O.mo18103l();
            if (!nxnVar.f44974b.m18142ac()) {
                nxnVar.mo18106p();
            }
            mex mexVar = (mex) nxnVar.f44974b;
            mex mexVar2 = mex.f40265k;
            mffVar2.getClass();
            mexVar.f40269c = mffVar2;
            mexVar.f40267a |= 2;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5991m(nxn nxnVar) {
        boolean zMo6184l = this.f10645c.mo6184l(dig.f11507u);
        float fFloatValue = ((Float) this.f10645c.mo6180h(dig.f11508v).get()).floatValue();
        int iIntValue = ((Integer) this.f10645c.mo6173a(dig.f11489c).get()).intValue();
        mws mwsVar = dei.f10657a;
        nxl nxlVarM18137O = mel.f40191d.m18137O();
        if (zMo6184l) {
            float f = iIntValue * fFloatValue;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            mel melVar = (mel) nxqVar;
            melVar.f40193a |= 1;
            melVar.f40194b = (int) f;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            mel melVar2 = (mel) nxlVarM18137O.f44974b;
            nxy nxyVar = melVar2.f40195c;
            if (!nxyVar.mo17770c()) {
                melVar2.f40195c = nxq.m18127U(nxyVar);
            }
            melVar2.f40195c.add("barcode");
        }
        mel melVar3 = (mel) nxlVarM18137O.mo18103l();
        if (!nxnVar.f44974b.m18142ac()) {
            nxnVar.mo18106p();
        }
        mex mexVar = (mex) nxnVar.f44974b;
        mex mexVar2 = mex.f40265k;
        melVar3.getClass();
        mexVar.f40268b = melVar3;
        mexVar.f40267a |= 1;
    }
}
