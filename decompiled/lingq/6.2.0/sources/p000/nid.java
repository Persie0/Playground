package p000;

import android.content.Context;
import android.graphics.Rect;
import androidx.media3.common.C0713b;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.vision.C1041z;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class nid implements gb2, jy2, p9b, bn9, xoc, lkd {

    /* JADX INFO: renamed from: a */
    public static nid f52784a;

    /* JADX INFO: renamed from: b */
    public static final nid f52785b = new nid();

    /* JADX INFO: renamed from: c */
    public static final nid f52786c = new nid();

    /* JADX INFO: renamed from: d */
    public static final nid f52787d = new nid();

    /* JADX INFO: renamed from: a */
    public static ou5 m17446a(nid nidVar) {
        return new ou5();
    }

    /* JADX INFO: renamed from: g */
    public static a34 m17447g() {
        Class clsM3246l = b34.m3246l("com.android.billingclient.api.SkuDetailsParams");
        Class clsM3246l2 = b34.m3246l("com.android.billingclient.api.SkuDetailsParams$Builder");
        if (clsM3246l == null || clsM3246l2 == null) {
            return null;
        }
        Method methodM3249p = b34.m3249p(clsM3246l, "newBuilder", new Class[0]);
        Method methodM3249p2 = b34.m3249p(clsM3246l2, "setType", String.class);
        Method methodM3249p3 = b34.m3249p(clsM3246l2, "setSkusList", List.class);
        Method methodM3249p4 = b34.m3249p(clsM3246l2, "build", new Class[0]);
        if (methodM3249p == null || methodM3249p2 == null || methodM3249p3 == null || methodM3249p4 == null) {
            return null;
        }
        a34 a34Var = new a34(clsM3246l, clsM3246l2, methodM3249p, methodM3249p2, methodM3249p3, methodM3249p4);
        if (!lp1.f49971a.contains(a34.class)) {
            try {
                a34.f172h = a34Var;
            } catch (Throwable th) {
                lp1.m16420a(a34.class, th);
            }
        }
        if (lp1.f49971a.contains(a34.class)) {
            return null;
        }
        try {
            return a34.f172h;
        } catch (Throwable th2) {
            lp1.m16420a(a34.class, th2);
            return null;
        }
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: b */
    public int mo82b(C0713b c0713b) {
        return 1;
    }

    @Override // p000.gb2
    /* JADX INFO: renamed from: c */
    public float mo12459c(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: d */
    public void m17448d(zr2 zr2Var) {
        zr2Var.mo12901e(z5d.class, mbc.f50974a);
        zr2Var.mo12901e(lhd.class, qwc.f58307a);
        zr2Var.mo12901e(a6d.class, pbc.f55934a);
        zr2Var.mo12901e(p6d.class, ybc.f69616a);
        zr2Var.mo12901e(f6d.class, ubc.f63685a);
        zr2Var.mo12901e(g6d.class, dcc.f35415a);
        zr2Var.mo12901e(m1d.class, j4c.f45055a);
        zr2Var.mo12901e(i1d.class, x3c.f67735a);
        zr2Var.mo12901e(o4d.class, o9c.f54092a);
        zr2Var.mo12901e(ydd.class, vpc.f65774a);
        zr2Var.mo12901e(d1d.class, s3c.f60250a);
        zr2Var.mo12901e(z0d.class, p3c.f55537a);
        zr2Var.mo12901e(v9d.class, lic.f49724a);
        zr2Var.mo12901e(ljd.class, d8c.f35189a);
        zr2Var.mo12901e(c4d.class, q8c.f57401a);
        zr2Var.mo12901e(w3d.class, z7c.f71038a);
        zr2Var.mo12901e(w9d.class, qic.f57838a);
        zr2Var.mo12901e(pdd.class, kpc.f48307a);
        zr2Var.mo12901e(sdd.class, qpc.f58035a);
        zr2Var.mo12901e(ndd.class, ipc.f44414a);
        zr2Var.mo12901e(z6d.class, gdc.f40600a);
        zr2Var.mo12901e(kjd.class, q1c.f57134a);
        zr2Var.mo12901e(b7d.class, ldc.f49526a);
        zr2Var.mo12901e(sad.class, gkc.f40921a);
        zr2Var.mo12901e(zad.class, tkc.f62460a);
        zr2Var.mo12901e(xad.class, okc.f54501a);
        zr2Var.mo12901e(uad.class, jkc.f45656a);
        zr2Var.mo12901e(zbd.class, cmc.f10291a);
        zr2Var.mo12901e(acd.class, gmc.f41032a);
        zr2Var.mo12901e(gcd.class, nmc.f52976a);
        zr2Var.mo12901e(dcd.class, kmc.f47525a);
        zr2Var.mo12901e(u6d.class, zcc.f71375a);
        zr2Var.mo12901e(icd.class, qmc.f57951a);
        zr2Var.mo12901e(kcd.class, umc.f64091a);
        zr2Var.mo12901e(ncd.class, anc.f936a);
        zr2Var.mo12901e(rcd.class, mnc.f51591a);
        zr2Var.mo12901e(add.class, boc.f8778a);
        zr2Var.mo12901e(xcd.class, hoc.f42718a);
        zr2Var.mo12901e(vbd.class, mlc.f51502a);
        zr2Var.mo12901e(a5d.class, jac.f45366a);
        zr2Var.mo12901e(lbd.class, tlc.f62489a);
        zr2Var.mo12901e(jbd.class, qlc.f57919a);
        zr2Var.mo12901e(sbd.class, ylc.f70045a);
        zr2Var.mo12901e(vdd.class, tpc.f62717a);
        zr2Var.mo12901e(bid.class, mxc.f52013a);
        zr2Var.mo12901e(zyc.class, i2c.f43392a);
        zr2Var.mo12901e(tyc.class, b2c.f7825a);
        zr2Var.mo12901e(qyc.class, y1c.f69112a);
        zr2Var.mo12901e(wyc.class, f2c.f38317a);
        zr2Var.mo12901e(gzc.class, p2c.f55502a);
        zr2Var.mo12901e(ezc.class, m2c.f50476a);
        zr2Var.mo12901e(mzc.class, s2c.f60220a);
        zr2Var.mo12901e(qzc.class, v2c.f64754a);
        zr2Var.mo12901e(szc.class, y2c.f69195a);
        zr2Var.mo12901e(d0d.class, a3c.f188a);
        zr2Var.mo12901e(h0d.class, e3c.f36667a);
        zr2Var.mo12901e(jtb.class, c1c.f9323a);
        zr2Var.mo12901e(xtb.class, k1c.f46561a);
        zr2Var.mo12901e(otb.class, h1c.f41666a);
        zr2Var.mo12901e(t4d.class, aac.f430a);
        zr2Var.mo12901e(q1d.class, o4c.f53855a);
        zr2Var.mo12901e(tnb.class, gub.f41356a);
        zr2Var.mo12901e(qnb.class, jub.f46170a);
        zr2Var.mo12901e(t3d.class, s7c.f60496a);
        zr2Var.mo12901e(lob.class, mub.f51868a);
        zr2Var.mo12901e(xnb.class, qub.f58233a);
        zr2Var.mo12901e(ypb.class, ywb.f70602a);
        zr2Var.mo12901e(tpb.class, bxb.f9151a);
        zr2Var.mo12901e(tob.class, uub.f64384a);
        zr2Var.mo12901e(oob.class, xub.f68830a);
        zr2Var.mo12901e(qqb.class, vxb.f66070a);
        zr2Var.mo12901e(mqb.class, zxb.f72362a);
        zr2Var.mo12901e(drb.class, lyb.f50320a);
        zr2Var.mo12901e(brb.class, oyb.f55312a);
        zr2Var.mo12901e(atb.class, f0c.f38157a);
        zr2Var.mo12901e(xsb.class, p0c.f55401a);
        zr2Var.mo12901e(krb.class, ryb.f60054a);
        zr2Var.mo12901e(hrb.class, vyb.f66104a);
        zr2Var.mo12901e(csb.class, azb.f7701a);
        zr2Var.mo12901e(mrb.class, dzb.f36475a);
        zr2Var.mo12901e(wid.class, hqc.f42815a);
        zr2Var.mo12901e(did.class, s4c.f60309a);
        zr2Var.mo12901e(oid.class, vcc.f65202a);
        zr2Var.mo12901e(kid.class, qcc.f57597a);
        zr2Var.mo12901e(fid.class, h8c.f42001a);
        zr2Var.mo12901e(sid.class, cqc.f34395a);
        zr2Var.mo12901e(rid.class, zpc.f71951a);
        zr2Var.mo12901e(yid.class, jqc.f46020a);
        zr2Var.mo12901e(hid.class, s9c.f60571a);
        zr2Var.mo12901e(ijd.class, wxc.f67491a);
        zr2Var.mo12901e(gjd.class, ayc.f7676a);
        zr2Var.mo12901e(ejd.class, rxc.f60019a);
        zr2Var.mo12901e(ded.class, qqc.f58093a);
        zr2Var.mo12901e(q4d.class, x9c.f67984a);
        zr2Var.mo12901e(e5d.class, mac.f50858a);
        zr2Var.mo12901e(myc.class, u1c.f63258a);
        zr2Var.mo12901e(g4d.class, w8c.f66539a);
        zr2Var.mo12901e(w4d.class, eac.f36950a);
        zr2Var.mo12901e(v3d.class, w7c.f66504a);
        zr2Var.mo12901e(u1d.class, f5c.f38500a);
        zr2Var.mo12901e(y1d.class, m5c.f50625a);
        zr2Var.mo12901e(r1d.class, z4c.f70929a);
        zr2Var.mo12901e(b2d.class, s5c.f60393a);
        zr2Var.mo12901e(u8d.class, hhc.f42389a);
        zr2Var.mo12901e(gtb.class, x0c.f67609a);
        zr2Var.mo12901e(dtb.class, t0c.f61728a);
        zr2Var.mo12901e(t6d.class, mcc.f51091a);
        zr2Var.mo12901e(q6d.class, hcc.f42194a);
        zr2Var.mo12901e(lnb.class, cub.f34561a);
        zr2Var.mo12901e(shd.class, dxc.f36409a);
        zr2Var.mo12901e(yhd.class, kxc.f48570a);
        zr2Var.mo12901e(vhd.class, hxc.f43136a);
        zr2Var.mo12901e(iyc.class, n1c.f52202a);
        zr2Var.mo12901e(u0d.class, m3c.f50549a);
        zr2Var.mo12901e(r0d.class, j3c.f45028a);
        zr2Var.mo12901e(m0d.class, g3c.f40151a);
        zr2Var.mo12901e(m9d.class, yhc.f69858a);
        zr2Var.mo12901e(r9d.class, hic.f42412a);
        zr2Var.mo12901e(p9d.class, cic.f10147a);
        zr2Var.mo12901e(ppb.class, qwb.f58306a);
        zr2Var.mo12901e(opb.class, uwb.f64480a);
        zr2Var.mo12901e(bad.class, ajc.f733a);
        zr2Var.mo12901e(iad.class, njc.f52862a);
        zr2Var.mo12901e(cad.class, djc.f35737a);
        zr2Var.mo12901e(ead.class, hjc.f42513a);
        zr2Var.mo12901e(cqb.class, fxb.f39905a);
        zr2Var.mo12901e(aqb.class, jxb.f46369a);
        zr2Var.mo12901e(qgd.class, avc.f7598a);
        zr2Var.mo12901e(lgd.class, uuc.f64385a);
        zr2Var.mo12901e(mhd.class, vwc.f66035a);
        zr2Var.mo12901e(phd.class, zwc.f72326a);
        zr2Var.mo12901e(bbd.class, ykc.f69967a);
        zr2Var.mo12901e(hbd.class, ilc.f44281a);
        zr2Var.mo12901e(dbd.class, clc.f10243a);
        zr2Var.mo12901e(fbd.class, elc.f37453a);
        zr2Var.mo12901e(l4d.class, k9c.f46920a);
        zr2Var.mo12901e(xqb.class, eyb.f38089a);
        zr2Var.mo12901e(tqb.class, hyb.f43222a);
        zr2Var.mo12901e(i4d.class, c9c.f9775a);
        zr2Var.mo12901e(a4d.class, l8c.f49312a);
        zr2Var.mo12901e(jad.class, rjc.f59417a);
        zr2Var.mo12901e(pad.class, akc.f786a);
        zr2Var.mo12901e(mad.class, wjc.f66951a);
        zr2Var.mo12901e(jqb.class, nxb.f53374a);
        zr2Var.mo12901e(fqb.class, sxb.f61571a);
        zr2Var.mo12901e(j8d.class, jgc.f45533a);
        zr2Var.mo12901e(l8d.class, ogc.f54328a);
        zr2Var.mo12901e(o8d.class, qgc.f57771a);
        zr2Var.mo12901e(hpb.class, jvb.f46237a);
        zr2Var.mo12901e(fpb.class, pvb.f56869a);
        zr2Var.mo12901e(b8d.class, tfc.f62238a);
        zr2Var.mo12901e(d8d.class, xfc.f68159a);
        zr2Var.mo12901e(f8d.class, dgc.f35635a);
        zr2Var.mo12901e(bpb.class, avb.f7597a);
        zr2Var.mo12901e(xob.class, fvb.f39770a);
        zr2Var.mo12901e(p8d.class, ugc.f63910a);
        zr2Var.mo12901e(r8d.class, ygc.f69832a);
        zr2Var.mo12901e(s8d.class, dhc.f35665a);
        zr2Var.mo12901e(lpb.class, tvb.f62970a);
        zr2Var.mo12901e(jpb.class, mwb.f51982a);
        zr2Var.mo12901e(igd.class, iuc.f44624a);
        zr2Var.mo12901e(ggd.class, luc.f50165a);
        zr2Var.mo12901e(j5d.class, rac.f59000a);
        zr2Var.mo12901e(n5d.class, bbc.f8306a);
        zr2Var.mo12901e(k5d.class, wac.f66576a);
        zr2Var.mo12901e(q5d.class, gbc.f40510a);
        zr2Var.mo12901e(edd.class, loc.f49953a);
        zr2Var.mo12901e(fdd.class, roc.f59669a);
        zr2Var.mo12901e(nsb.class, pzb.f57061a);
        zr2Var.mo12901e(jsb.class, szb.f61683a);
        zr2Var.mo12901e(zgd.class, yvc.f70563a);
        zr2Var.mo12901e(tcd.class, tnc.f62617a);
        zr2Var.mo12901e(ucd.class, ync.f70130a);
        zr2Var.mo12901e(gsb.class, izb.f44816a);
        zr2Var.mo12901e(fsb.class, mzb.f52091a);
        zr2Var.mo12901e(kgd.class, quc.f58234a);
        zr2Var.mo12901e(y7d.class, vdc.f65263a);
        zr2Var.mo12901e(v7d.class, nfc.f52692a);
        zr2Var.mo12901e(n7d.class, afc.f592a);
        zr2Var.mo12901e(j7d.class, xec.f68143a);
        zr2Var.mo12901e(q7d.class, efc.f37200a);
        zr2Var.mo12901e(s7d.class, jfc.f45510a);
        zr2Var.mo12901e(h7d.class, sec.f60773a);
        zr2Var.mo12901e(c7d.class, qdc.f57629a);
        zr2Var.mo12901e(f7d.class, oec.f54255a);
        zr2Var.mo12901e(e7d.class, kec.f47115a);
        zr2Var.mo12901e(e9d.class, qhc.f57798a);
        zr2Var.mo12901e(i3d.class, l7c.f49263a);
        zr2Var.mo12901e(d9d.class, mhc.f51342a);
        zr2Var.mo12901e(j9d.class, uhc.f63951a);
        zr2Var.mo12901e(rw4.class, y6c.f69388a);
        zr2Var.mo12901e(r3d.class, n7c.f52468a);
        zr2Var.mo12901e(bed.class, nqc.f53155a);
        zr2Var.mo12901e(v2d.class, h7c.f41924a);
        zr2Var.mo12901e(u2d.class, c7c.f9680a);
        zr2Var.mo12901e(idd.class, voc.f65735a);
        zr2Var.mo12901e(ihd.class, mwc.f51983a);
        zr2Var.mo12901e(mdd.class, dpc.f36011a);
        zr2Var.mo12901e(kdd.class, apc.f7351a);
        zr2Var.mo12901e(dhd.class, bwc.f9107a);
        zr2Var.mo12901e(wsb.class, wzb.f67575a);
        zr2Var.mo12901e(rsb.class, a0c.f40a);
        zr2Var.mo12901e(ehd.class, gwc.f41439a);
        zr2Var.mo12901e(r2d.class, u6c.f63501a);
        zr2Var.mo12901e(n2d.class, o6c.f53913a);
        zr2Var.mo12901e(k2d.class, m6c.f50683a);
        zr2Var.mo12901e(h2d.class, w5c.f66437a);
        zr2Var.mo12901e(e2d.class, i6c.f43613a);
        zr2Var.mo12901e(cgd.class, buc.f9037a);
        zr2Var.mo12901e(egd.class, fuc.f39723a);
        zr2Var.mo12901e(cfd.class, msc.f51816a);
        zr2Var.mo12901e(jfd.class, btc.f8996a);
        zr2Var.mo12901e(efd.class, qsc.f58170a);
        zr2Var.mo12901e(ufd.class, ttc.f62875a);
        zr2Var.mo12901e(mfd.class, etc.f37834a);
        zr2Var.mo12901e(yfd.class, ytc.f70461a);
        zr2Var.mo12901e(wfd.class, vtc.f65907a);
        zr2Var.mo12901e(ifd.class, ysc.f70432a);
        zr2Var.mo12901e(gfd.class, usc.f64314a);
        zr2Var.mo12901e(rfd.class, ntc.f53243a);
        zr2Var.mo12901e(nfd.class, jtc.f46148a);
        zr2Var.mo12901e(afd.class, isc.f44516a);
        zr2Var.mo12901e(ts3.class, rlb.f59512e);
        zr2Var.mo12901e(xed.class, rlb.f59511d);
        zr2Var.mo12901e(oed.class, irc.f44467a);
        zr2Var.mo12901e(ted.class, yrc.f70355a);
        zr2Var.mo12901e(red.class, nrc.f53176a);
        zr2Var.mo12901e(hed.class, wqc.f67196a);
        zr2Var.mo12901e(C1041z.class, erc.f37761a);
        zr2Var.mo12901e(ked.class, arc.f7409a);
        zr2Var.mo12901e(tgd.class, jvc.f46238a);
        zr2Var.mo12901e(xgd.class, qvc.f58259a);
        zr2Var.mo12901e(ugd.class, mvc.f51903a);
        zr2Var.mo12901e(sgd.class, fvc.f39771a);
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: e */
    public cn9 mo85e(C0713b c0713b) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:398:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x0096  */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad A[EDGE_INSN: B:52:0x00ad->B:56:0x00b7 BREAK  A[LOOP:0: B:37:0x008a->B:49:0x00a5]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[EDGE_INSN: B:54:0x00b2->B:56:0x00b7 BREAK  A[LOOP:0: B:37:0x008a->B:49:0x00a5]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b5 A[EDGE_INSN: B:55:0x00b5->B:56:0x00b7 BREAK  A[LOOP:0: B:37:0x008a->B:49:0x00a5]] */
    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        Mode mode;
        int i;
        int i2;
        jpa jpaVarM14582a;
        int i3;
        char c;
        int i4;
        CharacterSetECI characterSetECIByName;
        int i5;
        boolean z;
        boolean z2;
        char cCharAt;
        int i6;
        if (str.isEmpty()) {
            C3386nv.m17626m("Found empty contents");
            return null;
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            C3386nv.m17626m("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
        if (enumMap.containsKey(encodeHintType)) {
            errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
        int i7 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 4;
        EncodeHintType encodeHintType3 = EncodeHintType.CHARACTER_SET;
        boolean zContainsKey = enumMap.containsKey(encodeHintType3);
        String string = zContainsKey ? enumMap.get(encodeHintType3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string);
        int[] iArr = huc.f42962a;
        if (!zEquals) {
            i5 = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i5 >= str.length()) {
                    if (!z) {
                        if (!z2) {
                            mode = Mode.BYTE;
                            break;
                        }
                        mode = Mode.NUMERIC;
                        break;
                    }
                    mode = Mode.ALPHANUMERIC;
                    break;
                }
                cCharAt = str.charAt(i5);
                if (cCharAt >= '0') {
                    if (cCharAt < '`') {
                        i6 = iArr[cCharAt];
                    } else {
                        i6 = -1;
                    }
                    if (i6 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z = true;
                } else {
                    if (cCharAt < '`') {
                        i6 = iArr[cCharAt];
                    } else {
                        i6 = -1;
                    }
                    if (i6 == -1) {
                        mode = Mode.BYTE;
                        break;
                    }
                    z = true;
                }
                i5++;
            }
        } else {
            try {
                byte[] bytes = str.getBytes("Shift_JIS");
                int length = bytes.length;
                if (length % 2 != 0) {
                    i5 = 0;
                    z = false;
                    z2 = false;
                    while (true) {
                        if (i5 >= str.length()) {
                            if (!z) {
                                if (!z2) {
                                    mode = Mode.BYTE;
                                    break;
                                }
                                mode = Mode.NUMERIC;
                                break;
                            }
                            mode = Mode.ALPHANUMERIC;
                            break;
                        }
                        cCharAt = str.charAt(i5);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i6 = iArr[cCharAt];
                            } else {
                                i6 = -1;
                            }
                            if (i6 == -1) {
                                mode = Mode.BYTE;
                                break;
                            }
                            z = true;
                        } else {
                            z2 = true;
                        }
                        i5++;
                    }
                } else {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            mode = Mode.KANJI;
                        } else {
                            int i9 = bytes[i8] & 255;
                            if ((i9 < 129 || i9 > 159) && (i9 < 224 || i9 > 235)) {
                                i5 = 0;
                                z = false;
                                z2 = false;
                                while (true) {
                                    if (i5 >= str.length()) {
                                        if (!z) {
                                            if (!z2) {
                                                mode = Mode.BYTE;
                                                break;
                                            }
                                            mode = Mode.NUMERIC;
                                            break;
                                        }
                                        mode = Mode.ALPHANUMERIC;
                                        break;
                                    }
                                    cCharAt = str.charAt(i5);
                                    if (cCharAt >= '0') {
                                        if (cCharAt < '`') {
                                            i6 = iArr[cCharAt];
                                        } else {
                                            i6 = -1;
                                        }
                                        if (i6 == -1) {
                                            mode = Mode.BYTE;
                                            break;
                                        }
                                        z = true;
                                    } else {
                                        if (cCharAt < '`') {
                                            i6 = iArr[cCharAt];
                                        } else {
                                            i6 = -1;
                                        }
                                        if (i6 == -1) {
                                            mode = Mode.BYTE;
                                            break;
                                        }
                                        z = true;
                                    }
                                    i5++;
                                }
                            } else {
                                i8 += 2;
                            }
                        }
                    }
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        zc0 zc0Var = new zc0();
        int i10 = 8;
        if (mode == Mode.BYTE && zContainsKey && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(string)) != null) {
            zc0Var.m25545b(Mode.ECI.getBits(), 4);
            zc0Var.m25545b(characterSetECIByName.getValue(), 8);
        }
        EncodeHintType encodeHintType4 = EncodeHintType.GS1_FORMAT;
        if (enumMap.containsKey(encodeHintType4) && Boolean.valueOf(enumMap.get(encodeHintType4).toString()).booleanValue()) {
            i = 4;
            zc0Var.m25545b(Mode.FNC1_FIRST_POSITION.getBits(), 4);
        } else {
            i = 4;
        }
        zc0Var.m25545b(mode.getBits(), i);
        zc0 zc0Var2 = new zc0();
        int i11 = wr2.f67199a[mode.ordinal()];
        char c2 = 2;
        int i12 = 10;
        if (i11 == 1) {
            int length2 = str.length();
            int i13 = 0;
            while (i13 < length2) {
                int iCharAt = str.charAt(i13) - '0';
                int i14 = i13 + 2;
                if (i14 < length2) {
                    zc0Var2.m25545b(((str.charAt(i13 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i14) - '0'), i12);
                    i13 += 3;
                } else {
                    i13++;
                    if (i13 < length2) {
                        zc0Var2.m25545b((iCharAt * 10) + (str.charAt(i13) - '0'), 7);
                        i13 = i14;
                    } else {
                        zc0Var2.m25545b(iCharAt, 4);
                    }
                }
                i12 = 10;
            }
        } else if (i11 == 2) {
            int length3 = str.length();
            int i15 = 0;
            while (i15 < length3) {
                char cCharAt2 = str.charAt(i15);
                int i16 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                if (i16 == -1) {
                    throw new WriterException();
                }
                int i17 = i15 + 1;
                if (i17 < length3) {
                    char cCharAt3 = str.charAt(i17);
                    int i18 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                    if (i18 == -1) {
                        throw new WriterException();
                    }
                    zc0Var2.m25545b((i16 * 45) + i18, 11);
                    i15 += 2;
                } else {
                    zc0Var2.m25545b(i16, 6);
                    i15 = i17;
                }
            }
        } else if (i11 == 3) {
            try {
                for (byte b : str.getBytes(string)) {
                    zc0Var2.m25545b(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new WriterException(e);
            }
        } else {
            if (i11 != 4) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i19 = 0; i19 < length4; i19 += 2) {
                    int i20 = ((bytes2[i19] & 255) << 8) | (bytes2[i19 + 1] & 255);
                    int i21 = 33088;
                    if (i20 >= 33088 && i20 <= 40956) {
                        i4 = i20 - i21;
                    } else if (i20 < 57408 || i20 > 60351) {
                        i4 = -1;
                    } else {
                        i21 = 49472;
                        i4 = i20 - i21;
                    }
                    if (i4 == -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    zc0Var2.m25545b(((i4 >> 8) * 192) + (i4 & 255), 13);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new WriterException(e2);
            }
        }
        EncodeHintType encodeHintType5 = EncodeHintType.QR_VERSION;
        if (enumMap.containsKey(encodeHintType5)) {
            jpaVarM14582a = jpa.m14582a(Integer.parseInt(enumMap.get(encodeHintType5).toString()));
            int characterCountBits = mode.getCharacterCountBits(jpaVarM14582a) + zc0Var.f71347b + zc0Var2.f71347b;
            int i22 = jpaVarM14582a.f45980c;
            ztb ztbVar = jpaVarM14582a.f45979b[errorCorrectionLevelValueOf.ordinal()];
            int i23 = ztbVar.f72161b;
            int i24 = 0;
            for (qg3 qg3Var : (qg3[]) ztbVar.f72162c) {
                i24 += qg3Var.f57750a;
            }
            if (i22 - (i24 * i23) < (characterCountBits + 7) / 8) {
                throw new WriterException("Data too big for requested version");
            }
            i2 = 8;
        } else {
            int characterCountBits2 = mode.getCharacterCountBits(jpa.m14582a(1)) + zc0Var.f71347b + zc0Var2.f71347b;
            int i25 = 1;
            while (true) {
                if (i25 > 40) {
                    throw new WriterException("Data too big");
                }
                jpa jpaVarM14582a2 = jpa.m14582a(i25);
                int i26 = jpaVarM14582a2.f45980c;
                ztb ztbVar2 = jpaVarM14582a2.f45979b[errorCorrectionLevelValueOf.ordinal()];
                int i27 = ztbVar2.f72161b;
                char c3 = c2;
                i2 = i10;
                int i28 = 0;
                for (qg3 qg3Var2 : (qg3[]) ztbVar2.f72162c) {
                    i28 += qg3Var2.f57750a;
                }
                if (i26 - (i28 * i27) >= (characterCountBits2 + 7) / 8) {
                    int characterCountBits3 = mode.getCharacterCountBits(jpaVarM14582a2) + zc0Var.f71347b + zc0Var2.f71347b;
                    int i29 = 1;
                    while (true) {
                        if (i29 > 40) {
                            throw new WriterException("Data too big");
                        }
                        jpa jpaVarM14582a3 = jpa.m14582a(i29);
                        int i30 = jpaVarM14582a3.f45980c;
                        ztb ztbVar3 = jpaVarM14582a3.f45979b[errorCorrectionLevelValueOf.ordinal()];
                        int i31 = ztbVar3.f72161b;
                        int i32 = 0;
                        for (qg3 qg3Var3 : (qg3[]) ztbVar3.f72162c) {
                            i32 += qg3Var3.f57750a;
                        }
                        if (i30 - (i32 * i31) >= (characterCountBits3 + 7) / 8) {
                            jpaVarM14582a = jpaVarM14582a3;
                            break;
                        }
                        i29++;
                        i2 = 8;
                    }
                } else {
                    i25++;
                    c2 = c3;
                    i10 = 8;
                }
            }
        }
        int i33 = jpaVarM14582a.f45980c;
        zc0 zc0Var3 = new zc0();
        int i34 = zc0Var.f71347b;
        zc0Var3.m25546c(i34);
        for (int i35 = 0; i35 < i34; i35++) {
            zc0Var3.m25544a(zc0Var.m25547d(i35));
        }
        int iM25548e = mode == Mode.BYTE ? zc0Var2.m25548e() : str.length();
        int characterCountBits4 = mode.getCharacterCountBits(jpaVarM14582a);
        int i36 = 1 << characterCountBits4;
        if (iM25548e >= i36) {
            throw new WriterException(iM25548e + " is bigger than " + (i36 - 1));
        }
        zc0Var3.m25545b(iM25548e, characterCountBits4);
        int i37 = zc0Var2.f71347b;
        zc0Var3.m25546c(zc0Var3.f71347b + i37);
        for (int i38 = 0; i38 < i37; i38++) {
            zc0Var3.m25544a(zc0Var2.m25547d(i38));
        }
        ztb ztbVar4 = jpaVarM14582a.f45979b[errorCorrectionLevelValueOf.ordinal()];
        int i39 = ztbVar4.f72161b;
        qg3[] qg3VarArr = (qg3[]) ztbVar4.f72162c;
        int i40 = 0;
        for (qg3 qg3Var4 : qg3VarArr) {
            i40 += qg3Var4.f57750a;
        }
        int i41 = i33 - (i40 * i39);
        int i42 = i41 << 3;
        if (zc0Var3.f71347b > i42) {
            throw new WriterException("data bits cannot fit in the QR Code" + zc0Var3.f71347b + " > " + i42);
        }
        for (int i43 = 0; i43 < 4 && zc0Var3.f71347b < i42; i43++) {
            zc0Var3.m25544a(false);
        }
        boolean z3 = false;
        int i44 = zc0Var3.f71347b & 7;
        if (i44 > 0) {
            for (int i45 = i2; i44 < i45; i45 = 8) {
                zc0Var3.m25544a(z3);
                i44++;
                z3 = false;
            }
        }
        int iM25548e2 = i41 - zc0Var3.m25548e();
        for (int i46 = 0; i46 < iM25548e2; i46++) {
            zc0Var3.m25545b((i46 & 1) == 0 ? 236 : 17, 8);
        }
        if (zc0Var3.f71347b != i42) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i47 = 0;
        for (qg3 qg3Var5 : qg3VarArr) {
            i47 += qg3Var5.f57750a;
        }
        if (zc0Var3.m25548e() != i41) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i47);
        int i48 = 0;
        int i49 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i48 < i47) {
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            if (i48 >= i47) {
                throw new WriterException("Block ID too large");
            }
            int i50 = i33 % i47;
            int i51 = i47 - i50;
            int i52 = i33 / i47;
            int i53 = i41 / i47;
            int i54 = i53 + 1;
            int i55 = i7;
            int i56 = i52 - i53;
            int i57 = (i52 + 1) - i54;
            if (i56 != i57) {
                throw new WriterException("EC bytes mismatch");
            }
            if (i47 != i51 + i50) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i33 != ((i54 + i57) * i50) + ((i53 + i56) * i51)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i48 < i51) {
                c = 0;
                iArr2[0] = i53;
                iArr3[0] = i56;
            } else {
                c = 0;
                iArr2[0] = i54;
                iArr3[0] = i57;
            }
            int i58 = iArr2[c];
            byte[] bArr = new byte[i58];
            int i59 = i49 << 3;
            int i60 = 0;
            while (i60 < i58) {
                int i61 = i48;
                int i62 = i47;
                int i63 = i60;
                int i64 = i59;
                int i65 = 0;
                for (int i66 = 0; i66 < 8; i66++) {
                    if (zc0Var3.m25547d(i64)) {
                        i65 |= 1 << (7 - i66);
                    }
                    i64++;
                }
                bArr[i63] = (byte) i65;
                i60 = i63 + 1;
                i59 = i64;
                i48 = i61;
                i47 = i62;
            }
            int i67 = i48;
            int i68 = i47;
            int i69 = iArr3[0];
            int[] iArr4 = new int[i58 + i69];
            for (int i70 = 0; i70 < i58; i70++) {
                iArr4[i70] = bArr[i70] & 255;
            }
            new p33(el3.f37422k).m18868J(iArr4, i69);
            byte[] bArr2 = new byte[i69];
            for (int i71 = 0; i71 < i69; i71++) {
                bArr2[i71] = (byte) iArr4[i58 + i71];
            }
            arrayList.add(new sd0(bArr, bArr2));
            iMax = Math.max(iMax, i58);
            iMax2 = Math.max(iMax2, i69);
            i49 += iArr2[0];
            i48 = i67 + 1;
            i47 = i68;
            i7 = i55;
        }
        int i72 = i7;
        if (i41 != i49) {
            throw new WriterException("Data bytes does not match offset");
        }
        zc0 zc0Var4 = new zc0();
        for (int i73 = 0; i73 < iMax; i73++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((sd0) it.next()).f60703a;
                if (i73 < bArr3.length) {
                    zc0Var4.m25545b(bArr3[i73], 8);
                }
            }
        }
        for (int i74 = 0; i74 < iMax2; i74++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((sd0) it2.next()).f60704b;
                if (i74 < bArr4.length) {
                    zc0Var4.m25545b(bArr4[i74], 8);
                }
            }
        }
        if (i33 != zc0Var4.m25548e()) {
            StringBuilder sbM22998u = ux5.m22998u("Interleaving error: ", i33, " and ");
            sbM22998u.append(zc0Var4.m25548e());
            sbM22998u.append(" differ.");
            throw new WriterException(sbM22998u.toString());
        }
        int i75 = (jpaVarM14582a.f45978a * 4) + 17;
        doa doaVar = new doa(i75, i75);
        int i76 = doaVar.f35973c;
        int i77 = doaVar.f35972b;
        int i78 = Integer.MAX_VALUE;
        int i79 = 0;
        int i80 = -1;
        while (i79 < 8) {
            puc.m19484a(zc0Var4, errorCorrectionLevelValueOf, jpaVarM14582a, i79, doaVar);
            int iM14057a = iob.m14057a(doaVar, false) + iob.m14057a(doaVar, true);
            byte[][] bArr5 = (byte[][]) doaVar.f35974d;
            int i81 = 0;
            int i82 = 0;
            while (i81 < i76 - 1) {
                byte[] bArr6 = bArr5[i81];
                int i83 = i82;
                int i84 = 0;
                while (i84 < i77 - 1) {
                    byte b2 = bArr6[i84];
                    int i85 = i84 + 1;
                    int i86 = i81;
                    if (b2 == bArr6[i85]) {
                        byte[] bArr7 = bArr5[i86 + 1];
                        if (b2 == bArr7[i84] && b2 == bArr7[i85]) {
                            i83++;
                        }
                    }
                    i84 = i85;
                    i81 = i86;
                }
                i81++;
                i82 = i83;
            }
            int i87 = (i82 * 3) + iM14057a;
            int i88 = 0;
            int i89 = 0;
            while (i88 < i76) {
                int i90 = i89;
                int i91 = 0;
                while (i91 < i77) {
                    byte[] bArr8 = bArr5[i88];
                    int i92 = i91 + 6;
                    int i93 = i79;
                    if (i92 < i77) {
                        i3 = i87;
                        byte b3 = 1;
                        if (bArr8[i91] == 1 && bArr8[i91 + 1] == 0 && bArr8[i91 + 2] == 1 && bArr8[i91 + 3] == 1 && bArr8[i91 + 4] == 1 && bArr8[i91 + 5] == 0 && bArr8[i92] == 1) {
                            int iMax3 = Math.max(i91 - 4, 0);
                            int iMin = Math.min(i91, bArr8.length);
                            while (true) {
                                if (iMax3 < iMin) {
                                    int i94 = iMax3;
                                    if (bArr8[i94] == b3) {
                                        int iMax4 = Math.max(i91 + 7, 0);
                                        int iMin2 = Math.min(i91 + 11, bArr8.length);
                                        while (true) {
                                            if (iMax4 < iMin2) {
                                                int i95 = iMax4;
                                                if (bArr8[iMax4] == 1) {
                                                    break;
                                                }
                                                iMax4 = i95 + 1;
                                            }
                                        }
                                    } else {
                                        iMax3 = i94 + 1;
                                        b3 = 1;
                                    }
                                }
                                i90++;
                                break;
                            }
                        }
                    } else {
                        i3 = i87;
                    }
                    int i96 = i88 + 6;
                    if (i96 < i76) {
                        byte b4 = 1;
                        if (bArr5[i88][i91] == 1 && bArr5[i88 + 1][i91] == 0 && bArr5[i88 + 2][i91] == 1 && bArr5[i88 + 3][i91] == 1 && bArr5[i88 + 4][i91] == 1 && bArr5[i88 + 5][i91] == 0 && bArr5[i96][i91] == 1) {
                            int iMax5 = Math.max(i88 - 4, 0);
                            int iMin3 = Math.min(i88, bArr5.length);
                            while (true) {
                                if (iMax5 < iMin3) {
                                    if (bArr5[iMax5][i91] == b4) {
                                        int iMax6 = Math.max(i88 + 7, 0);
                                        int iMin4 = Math.min(i88 + 11, bArr5.length);
                                        while (true) {
                                            if (iMax6 < iMin4) {
                                                if (bArr5[iMax6][i91] == 1) {
                                                    break;
                                                }
                                                iMax6++;
                                            }
                                        }
                                    } else {
                                        iMax5++;
                                        b4 = 1;
                                    }
                                }
                                i90++;
                                break;
                            }
                        }
                    }
                    i91++;
                    i87 = i3;
                    i79 = i93;
                }
                i88++;
                i89 = i90;
            }
            int i97 = i79;
            int i98 = (i89 * 40) + i87;
            int i99 = 0;
            for (int i100 = 0; i100 < i76; i100++) {
                byte[] bArr9 = bArr5[i100];
                for (int i101 = 0; i101 < i77; i101++) {
                    if (bArr9[i101] == 1) {
                        i99++;
                    }
                }
            }
            int i102 = i76 * i77;
            int iAbs = (((Math.abs((i99 << 1) - i102) * 10) / i102) * 10) + i98;
            if (iAbs < i78) {
                i78 = iAbs;
                i80 = i97;
            }
            i79 = i97 + 1;
        }
        puc.m19484a(zc0Var4, errorCorrectionLevelValueOf, jpaVarM14582a, i80, doaVar);
        int i103 = i72 << 1;
        int i104 = i77 + i103;
        int i105 = i103 + i76;
        int iMax7 = Math.max(200, i104);
        int iMax8 = Math.max(200, i105);
        int iMin5 = Math.min(iMax7 / i104, iMax8 / i105);
        int i106 = (iMax7 - (i77 * iMin5)) / 2;
        int i107 = (iMax8 - (i76 * iMin5)) / 2;
        ad0 ad0Var = new ad0(iMax7, iMax8);
        int i108 = 0;
        while (i108 < i76) {
            int i109 = i106;
            int i110 = 0;
            while (i110 < i77) {
                if (doaVar.m10557f(i110, i108) == 1) {
                    ad0Var.m274c(i109, i107, iMin5, iMin5);
                }
                i110++;
                i109 += iMin5;
            }
            i108++;
            i107 += iMin5;
        }
        return ad0Var;
    }

    @Override // p000.lkd
    /* JADX INFO: renamed from: h */
    public Object mo4203h(Object obj) {
        zzr zzrVar = (zzr) obj;
        zzf zzfVar = zzrVar.f12132b;
        String str = zzrVar.f12136f;
        List listM14398c = jcd.m14398c(zzfVar);
        String str2 = zzrVar.f12134d;
        if (cfd.m4634i(str2)) {
            str2 = "";
        }
        String str3 = str2;
        Rect rectM14397b = jcd.m14397b(listM14398c);
        if (cfd.m4634i(str)) {
            str = "und";
        }
        float f = zzrVar.f12132b.f12118e;
        return new fs9(str3, rectM14397b, listM14398c, str, zzbk.m5498k());
    }

    @Override // p000.bn9
    /* JADX INFO: renamed from: i */
    public boolean mo89i(C0713b c0713b) {
        return false;
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: j */
    public void mo2551j() {
        throw new UnsupportedOperationException();
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: n */
    public n8a mo2555n(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // p000.jy2
    /* JADX INFO: renamed from: q */
    public void mo2558q(st8 st8Var) {
        throw new UnsupportedOperationException();
    }
}
