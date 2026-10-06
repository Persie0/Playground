package p000;

import android.content.res.AssetFileDescriptor;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.util.Log;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import com.google.android.libraries.vision.visionkit.pipeline.PipelineException;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class den implements dek, dfe {

    /* JADX INFO: renamed from: b */
    public final dff f10661b;

    /* JADX INFO: renamed from: c */
    public dej f10662c = f10659a;

    /* JADX INFO: renamed from: e */
    private meu f10663e;

    /* JADX INFO: renamed from: f */
    private final dec f10664f;

    /* JADX INFO: renamed from: g */
    private dem f10665g;

    /* JADX INFO: renamed from: h */
    private final jvb f10666h;

    /* JADX INFO: renamed from: i */
    private final kbz f10667i;

    /* JADX INFO: renamed from: j */
    private final dja f10668j;

    /* JADX INFO: renamed from: k */
    private int f10669k;

    /* JADX INFO: renamed from: d */
    private static final nbh f10660d = nbh.m17259h("com/google/android/apps/camera/cameravisionkit/CameraVisionKitPipelineImpl");

    /* JADX INFO: renamed from: a */
    public static final dej f10659a = new del();

    public den(dec decVar, dff dffVar, kbz kbzVar, dja djaVar) {
        kbi.m13938a(dfm.class);
        this.f10664f = decVar;
        this.f10661b = dffVar;
        this.f10667i = kbzVar;
        this.f10668j = djaVar;
        this.f10666h = new jvb();
    }

    /* JADX INFO: renamed from: l */
    private final void m6007l(Exception exc, String str) {
        ((nbe) ((nbe) ((nbe) f10660d.m17251b()).mo17283h(exc)).mo17276G((char) 841)).mo17293r("%s", str);
        if (this.f10668j.m6200b(dja.DOGFOOD)) {
            throw new def(str, exc);
        }
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: a */
    public final kba mo5995a(dej dejVar) {
        this.f10662c = dejVar;
        return new cft(this, 20);
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: b */
    public final void mo5996b() {
        this.f10666h.close();
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: c */
    public final void mo5997c() {
        jvb jvbVar = this.f10666h;
        dff dffVar = this.f10661b;
        dffVar.f10770f = this;
        dex dexVar = dffVar.f10767c;
        dexVar.f10754c = dffVar;
        jvbVar.m13537d(new cic(dffVar, new dev(dexVar, 0), 11));
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: d */
    public final void mo5998d() {
        String string;
        this.f10667i.mo13961e("camera_vkp_initialize");
        if (this.f10665g == null) {
            try {
                dec decVar = this.f10664f;
                nxn nxnVarM5989k = decVar.m5989k();
                decVar.m5991m(nxnVarM5989k);
                decVar.m5990l(nxnVarM5989k);
                if (decVar.m5986h() || decVar.m5982d()) {
                    boolean zM5986h = decVar.m5986h();
                    boolean zM5982d = decVar.m5982d();
                    boolean zM5984f = decVar.m5984f();
                    boolean zM5983e = decVar.m5983e();
                    AssetFileDescriptor assetFileDescriptorM5979a = decVar.m5979a("camera_vkp/mobile_ica_v2_classifier_embedder.tflite.uncompressed");
                    mws mwsVar = dei.f10657a;
                    nxl nxlVarM18137O = pbv.f47359c.m18137O();
                    nxl nxlVarM18137O2 = mfj.f40337c.m18137O();
                    nxl nxlVarM18137O3 = mfk.f40341e.m18137O();
                    int fd = assetFileDescriptorM5979a.getParcelFileDescriptor().getFd();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    mfk mfkVar = (mfk) nxlVarM18137O3.f44974b;
                    mfkVar.f40343a |= 1;
                    mfkVar.f40344b = fd;
                    long startOffset = assetFileDescriptorM5979a.getStartOffset();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    mfk mfkVar2 = (mfk) nxlVarM18137O3.f44974b;
                    mfkVar2.f40343a |= 4;
                    mfkVar2.f40346d = startOffset;
                    long length = assetFileDescriptorM5979a.getLength();
                    if (!nxlVarM18137O3.f44974b.m18142ac()) {
                        nxlVarM18137O3.mo18106p();
                    }
                    mfk mfkVar3 = (mfk) nxlVarM18137O3.f44974b;
                    mfkVar3.f40343a |= 2;
                    mfkVar3.f40345c = length;
                    mfk mfkVar4 = (mfk) nxlVarM18137O3.mo18103l();
                    if (!nxlVarM18137O2.f44974b.m18142ac()) {
                        nxlVarM18137O2.mo18106p();
                    }
                    mfj mfjVar = (mfj) nxlVarM18137O2.f44974b;
                    mfkVar4.getClass();
                    mfjVar.f40340b = mfkVar4;
                    mfjVar.f40339a |= 4;
                    mfj mfjVar2 = (mfj) nxlVarM18137O2.mo18103l();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    pbv pbvVar = (pbv) nxlVarM18137O.f44974b;
                    mfjVar2.getClass();
                    pbvVar.f47362b = mfjVar2;
                    pbvVar.f47361a |= 1;
                    pbv pbvVar2 = (pbv) nxlVarM18137O.mo18103l();
                    nxl nxlVarM18137O4 = pby.f47374c.m18137O();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    pby pbyVar = (pby) nxlVarM18137O4.f44974b;
                    pbyVar.f47376a |= 2;
                    pbyVar.f47377b = false;
                    pby pbyVar2 = (pby) nxlVarM18137O4.mo18103l();
                    nxl nxlVarM18137O5 = pbx.f47369d.m18137O();
                    if (zM5984f) {
                        mws mwsVar2 = dei.f10657a;
                        if (!nxlVarM18137O5.f44974b.m18142ac()) {
                            nxlVarM18137O5.mo18106p();
                        }
                        pbx pbxVar = (pbx) nxlVarM18137O5.f44974b;
                        pbxVar.m19311c();
                        nwb.m17749e(mwsVar2, pbxVar.f47373c);
                        if (!nxlVarM18137O5.f44974b.m18142ac()) {
                            nxlVarM18137O5.mo18106p();
                        }
                        pbx pbxVar2 = (pbx) nxlVarM18137O5.f44974b;
                        pbxVar2.f47371a |= 4;
                        pbxVar2.f47372b = 0.4f;
                    }
                    if (zM5983e) {
                        if (!nxlVarM18137O5.f44974b.m18142ac()) {
                            nxlVarM18137O5.mo18106p();
                        }
                        pbx pbxVar3 = (pbx) nxlVarM18137O5.f44974b;
                        pbxVar3.m19311c();
                        pbxVar3.f47373c.add("/m/015bv3");
                        if (!nxlVarM18137O5.f44974b.m18142ac()) {
                            nxlVarM18137O5.mo18106p();
                        }
                        pbx pbxVar4 = (pbx) nxlVarM18137O5.f44974b;
                        pbxVar4.f47371a |= 4;
                        pbxVar4.f47372b = 0.25f;
                    }
                    nxl nxlVarM18137O6 = pbw.f47363e.m18137O();
                    if (zM5986h) {
                        if (!nxlVarM18137O6.f44974b.m18142ac()) {
                            nxlVarM18137O6.mo18106p();
                        }
                        pbw pbwVar = (pbw) nxlVarM18137O6.f44974b;
                        pbx pbxVar5 = (pbx) nxlVarM18137O5.mo18103l();
                        pbxVar5.getClass();
                        pbwVar.f47367c = pbxVar5;
                        pbwVar.f47365a |= 2;
                    }
                    if (zM5982d) {
                        if (!nxlVarM18137O6.f44974b.m18142ac()) {
                            nxlVarM18137O6.mo18106p();
                        }
                        pbw pbwVar2 = (pbw) nxlVarM18137O6.f44974b;
                        pbyVar2.getClass();
                        pbwVar2.f47368d = pbyVar2;
                        pbwVar2.f47365a |= 4;
                    }
                    if (!nxlVarM18137O6.f44974b.m18142ac()) {
                        nxlVarM18137O6.mo18106p();
                    }
                    pbw pbwVar3 = (pbw) nxlVarM18137O6.f44974b;
                    pbvVar2.getClass();
                    pbwVar3.f47366b = pbvVar2;
                    pbwVar3.f47365a |= 1;
                    pbw pbwVar4 = (pbw) nxlVarM18137O6.mo18103l();
                    if (!nxnVarM5989k.f44974b.m18142ac()) {
                        nxnVarM5989k.mo18106p();
                    }
                    mex mexVar = (mex) nxnVarM5989k.f44974b;
                    mex mexVar2 = mex.f40265k;
                    pbwVar4.getClass();
                    nxy nxyVar = mexVar.f40270d;
                    if (!nxyVar.mo17770c()) {
                        mexVar.f40270d = nxq.m18127U(nxyVar);
                    }
                    mexVar.f40270d.add(pbwVar4);
                }
                if (decVar.m5983e()) {
                    AssetFileDescriptor assetFileDescriptorM5979a2 = decVar.m5979a("camera_vkp/corner_detector_fixed_input_shape_with_partial_metadata.tflite.uncompressed");
                    AssetFileDescriptor assetFileDescriptorM5979a3 = decVar.m5979a("camera_vkp/corner_detector_label_map.uncompressed");
                    AssetFileDescriptor assetFileDescriptorM5979a4 = decVar.m5979a("camera_vkp/corner_detector_anchor.uncompressed");
                    mws mwsVar3 = dei.f10657a;
                    nxn nxnVar = (nxn) oct.f45527j.m18137O();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar = (oct) nxnVar.f44974b;
                    octVar.f45529a |= 2;
                    octVar.f45531c = 1;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar2 = (oct) nxnVar.f44974b;
                    octVar2.f45529a |= 4;
                    octVar2.f45532d = 1;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar3 = (oct) nxnVar.f44974b;
                    octVar3.f45529a |= 8;
                    octVar3.f45533e = -2.0f;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar4 = (oct) nxnVar.f44974b;
                    octVar4.f45529a |= 16;
                    octVar4.f45534f = 0.3f;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar5 = (oct) nxnVar.f44974b;
                    octVar5.f45529a |= 256;
                    octVar5.f45536h = 4;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar6 = (oct) nxnVar.f44974b;
                    octVar6.f45529a |= 128;
                    octVar6.f45535g = true;
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar7 = (oct) nxnVar.f44974b;
                    octVar7.f45529a |= 1;
                    octVar7.f45530b = "MobileSSDTfLiteClient";
                    nxl nxlVarM18137O7 = ocr.f45515e.m18137O();
                    nxl nxlVarM18137O8 = ocs.f45521e.m18137O();
                    int fd2 = assetFileDescriptorM5979a2.getParcelFileDescriptor().getFd();
                    if (!nxlVarM18137O8.f44974b.m18142ac()) {
                        nxlVarM18137O8.mo18106p();
                    }
                    ocs ocsVar = (ocs) nxlVarM18137O8.f44974b;
                    ocsVar.f45523a |= 1;
                    ocsVar.f45524b = fd2;
                    long startOffset2 = assetFileDescriptorM5979a2.getStartOffset();
                    if (!nxlVarM18137O8.f44974b.m18142ac()) {
                        nxlVarM18137O8.mo18106p();
                    }
                    ocs ocsVar2 = (ocs) nxlVarM18137O8.f44974b;
                    ocsVar2.f45523a |= 4;
                    ocsVar2.f45526d = startOffset2;
                    long length2 = assetFileDescriptorM5979a2.getLength();
                    if (!nxlVarM18137O8.f44974b.m18142ac()) {
                        nxlVarM18137O8.mo18106p();
                    }
                    ocs ocsVar3 = (ocs) nxlVarM18137O8.f44974b;
                    ocsVar3.f45523a |= 2;
                    ocsVar3.f45525c = length2;
                    ocs ocsVar4 = (ocs) nxlVarM18137O8.mo18103l();
                    if (!nxlVarM18137O7.f44974b.m18142ac()) {
                        nxlVarM18137O7.mo18106p();
                    }
                    ocr ocrVar = (ocr) nxlVarM18137O7.f44974b;
                    ocsVar4.getClass();
                    ocrVar.f45518b = ocsVar4;
                    ocrVar.f45517a |= 4;
                    nxl nxlVarM18137O9 = ocs.f45521e.m18137O();
                    int fd3 = assetFileDescriptorM5979a3.getParcelFileDescriptor().getFd();
                    if (!nxlVarM18137O9.f44974b.m18142ac()) {
                        nxlVarM18137O9.mo18106p();
                    }
                    ocs ocsVar5 = (ocs) nxlVarM18137O9.f44974b;
                    ocsVar5.f45523a |= 1;
                    ocsVar5.f45524b = fd3;
                    long startOffset3 = assetFileDescriptorM5979a3.getStartOffset();
                    if (!nxlVarM18137O9.f44974b.m18142ac()) {
                        nxlVarM18137O9.mo18106p();
                    }
                    ocs ocsVar6 = (ocs) nxlVarM18137O9.f44974b;
                    ocsVar6.f45523a |= 4;
                    ocsVar6.f45526d = startOffset3;
                    long length3 = assetFileDescriptorM5979a3.getLength();
                    if (!nxlVarM18137O9.f44974b.m18142ac()) {
                        nxlVarM18137O9.mo18106p();
                    }
                    ocs ocsVar7 = (ocs) nxlVarM18137O9.f44974b;
                    ocsVar7.f45523a |= 2;
                    ocsVar7.f45525c = length3;
                    ocs ocsVar8 = (ocs) nxlVarM18137O9.mo18103l();
                    if (!nxlVarM18137O7.f44974b.m18142ac()) {
                        nxlVarM18137O7.mo18106p();
                    }
                    ocr ocrVar2 = (ocr) nxlVarM18137O7.f44974b;
                    ocsVar8.getClass();
                    ocrVar2.f45519c = ocsVar8;
                    ocrVar2.f45517a |= 32;
                    nxl nxlVarM18137O10 = ocs.f45521e.m18137O();
                    int fd4 = assetFileDescriptorM5979a4.getParcelFileDescriptor().getFd();
                    if (!nxlVarM18137O10.f44974b.m18142ac()) {
                        nxlVarM18137O10.mo18106p();
                    }
                    ocs ocsVar9 = (ocs) nxlVarM18137O10.f44974b;
                    ocsVar9.f45523a |= 1;
                    ocsVar9.f45524b = fd4;
                    long startOffset4 = assetFileDescriptorM5979a4.getStartOffset();
                    if (!nxlVarM18137O10.f44974b.m18142ac()) {
                        nxlVarM18137O10.mo18106p();
                    }
                    ocs ocsVar10 = (ocs) nxlVarM18137O10.f44974b;
                    ocsVar10.f45523a |= 4;
                    ocsVar10.f45526d = startOffset4;
                    long length4 = assetFileDescriptorM5979a4.getLength();
                    if (!nxlVarM18137O10.f44974b.m18142ac()) {
                        nxlVarM18137O10.mo18106p();
                    }
                    ocs ocsVar11 = (ocs) nxlVarM18137O10.f44974b;
                    ocsVar11.f45523a |= 2;
                    ocsVar11.f45525c = length4;
                    ocs ocsVar12 = (ocs) nxlVarM18137O10.mo18103l();
                    if (!nxlVarM18137O7.f44974b.m18142ac()) {
                        nxlVarM18137O7.mo18106p();
                    }
                    ocr ocrVar3 = (ocr) nxlVarM18137O7.f44974b;
                    ocsVar12.getClass();
                    ocrVar3.f45520d = ocsVar12;
                    ocrVar3.f45517a |= 256;
                    ocr ocrVar4 = (ocr) nxlVarM18137O7.mo18103l();
                    if (!nxnVar.f44974b.m18142ac()) {
                        nxnVar.mo18106p();
                    }
                    oct octVar8 = (oct) nxnVar.f44974b;
                    ocrVar4.getClass();
                    octVar8.f45537i = ocrVar4;
                    octVar8.f45529a |= 8192;
                    nxl nxlVarM18137O11 = mfl.f40347k.m18137O();
                    nxl nxlVarM18137O12 = mfm.f40360d.m18137O();
                    if (!nxlVarM18137O12.f44974b.m18142ac()) {
                        nxlVarM18137O12.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O12.f44974b;
                    mfm mfmVar = (mfm) nxqVar;
                    mfmVar.f40362a |= 2;
                    mfmVar.f40364c = 0.997f;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O12.mo18106p();
                    }
                    mfm mfmVar2 = (mfm) nxlVarM18137O12.f44974b;
                    oct octVar9 = (oct) nxnVar.mo18103l();
                    octVar9.getClass();
                    mfmVar2.f40363b = octVar9;
                    mfmVar2.f40362a |= 1;
                    if (!nxlVarM18137O11.f44974b.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    mfl mflVar = (mfl) nxlVarM18137O11.f44974b;
                    mfm mfmVar3 = (mfm) nxlVarM18137O12.mo18103l();
                    mfmVar3.getClass();
                    mflVar.f40351c = mfmVar3;
                    mflVar.f40350b = 2;
                    if (!nxlVarM18137O11.f44974b.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    mfl mflVar2 = (mfl) nxlVarM18137O11.f44974b;
                    mflVar2.f40349a |= 1;
                    mflVar2.f40352d = true;
                    nxl nxlVarM18137O13 = mfi.f40330f.m18137O();
                    if (!nxlVarM18137O13.f44974b.m18142ac()) {
                        nxlVarM18137O13.mo18106p();
                    }
                    nxq nxqVar2 = nxlVarM18137O13.f44974b;
                    mfi mfiVar = (mfi) nxqVar2;
                    mfiVar.f40332a |= 8;
                    mfiVar.f40336e = "MobileIca8bitV2";
                    if (!nxqVar2.m18142ac()) {
                        nxlVarM18137O13.mo18106p();
                    }
                    nxq nxqVar3 = nxlVarM18137O13.f44974b;
                    mfi mfiVar2 = (mfi) nxqVar3;
                    mfiVar2.f40333b = 1;
                    mfiVar2.f40334c = "/m/015bv3";
                    if (!nxqVar3.m18142ac()) {
                        nxlVarM18137O13.mo18106p();
                    }
                    mfi mfiVar3 = (mfi) nxlVarM18137O13.f44974b;
                    mfiVar3.f40332a |= 4;
                    mfiVar3.f40335d = 0.25f;
                    nxlVarM18137O11.m18069aF(nxlVarM18137O13);
                    nxl nxlVarM18137O14 = mfi.f40330f.m18137O();
                    if (!nxlVarM18137O14.f44974b.m18142ac()) {
                        nxlVarM18137O14.mo18106p();
                    }
                    nxq nxqVar4 = nxlVarM18137O14.f44974b;
                    mfi mfiVar4 = (mfi) nxqVar4;
                    mfiVar4.f40332a |= 8;
                    mfiVar4.f40336e = "CoarseClassifierTexto128V2_3";
                    if (!nxqVar4.m18142ac()) {
                        nxlVarM18137O14.mo18106p();
                    }
                    nxq nxqVar5 = nxlVarM18137O14.f44974b;
                    mfi mfiVar5 = (mfi) nxqVar5;
                    mfiVar5.f40333b = 3;
                    mfiVar5.f40334c = "text";
                    if (!nxqVar5.m18142ac()) {
                        nxlVarM18137O14.mo18106p();
                    }
                    mfi mfiVar6 = (mfi) nxlVarM18137O14.f44974b;
                    mfiVar6.f40332a |= 4;
                    mfiVar6.f40335d = 0.4f;
                    nxlVarM18137O11.m18069aF(nxlVarM18137O14);
                    if (!nxlVarM18137O11.f44974b.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    mfl mflVar3 = (mfl) nxlVarM18137O11.f44974b;
                    nxv nxvVar = mflVar3.f40354f;
                    if (!nxvVar.mo17770c()) {
                        mflVar3.f40354f = nxq.m18124R(nxvVar);
                    }
                    mflVar3.f40354f.mo18034g(0.70744234f);
                    if (!nxlVarM18137O11.f44974b.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    nxq nxqVar6 = nxlVarM18137O11.f44974b;
                    mfl mflVar4 = (mfl) nxqVar6;
                    mflVar4.f40349a |= 8;
                    mflVar4.f40355g = 0.2f;
                    if (!nxqVar6.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    nxq nxqVar7 = nxlVarM18137O11.f44974b;
                    mfl mflVar5 = (mfl) nxqVar7;
                    mflVar5.f40349a |= 64;
                    mflVar5.f40358j = 0.025f;
                    if (!nxqVar7.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    nxq nxqVar8 = nxlVarM18137O11.f44974b;
                    mfl mflVar6 = (mfl) nxqVar8;
                    mflVar6.f40349a |= 32;
                    mflVar6.f40357i = 0.5f;
                    if (!nxqVar8.m18142ac()) {
                        nxlVarM18137O11.mo18106p();
                    }
                    mfl mflVar7 = (mfl) nxlVarM18137O11.f44974b;
                    mflVar7.f40349a |= 16;
                    mflVar7.f40356h = 0.5f;
                    mfl mflVar8 = (mfl) nxlVarM18137O11.mo18103l();
                    if (!nxnVarM5989k.f44974b.m18142ac()) {
                        nxnVarM5989k.mo18106p();
                    }
                    mex mexVar3 = (mex) nxnVarM5989k.f44974b;
                    mex mexVar4 = mex.f40265k;
                    mflVar8.getClass();
                    mexVar3.f40271e = mflVar8;
                    mexVar3.f40267a |= 8;
                }
                mey meyVarM5987i = decVar.m5987i(1);
                if (!nxnVarM5989k.f44974b.m18142ac()) {
                    nxnVarM5989k.mo18106p();
                }
                mex mexVar5 = (mex) nxnVarM5989k.f44974b;
                mex mexVar6 = mex.f40265k;
                meyVarM5987i.getClass();
                mexVar5.f40273g = meyVarM5987i;
                mexVar5.f40267a |= 32768;
                if (decVar.f10645c.mo6184l(dig.f11512z)) {
                    if (!nxnVarM5989k.f44974b.m18142ac()) {
                        nxnVarM5989k.mo18106p();
                    }
                    mex mexVar7 = (mex) nxnVarM5989k.f44974b;
                    mexVar7.f40274h = 0;
                    mexVar7.f40267a = 1048576 | mexVar7.f40267a;
                    nxl nxlVarM18137O15 = oay.f45221d.m18137O();
                    nxlVarM18137O15.m18048K("oriole");
                    nxlVarM18137O15.m18048K(pIeXJQLZLfgIN.PwuvBTcXYwUL);
                    nxlVarM18137O15.m18048K("bluejay");
                    if (!nxlVarM18137O15.f44974b.m18142ac()) {
                        nxlVarM18137O15.mo18106p();
                    }
                    oay oayVar = (oay) nxlVarM18137O15.f44974b;
                    oayVar.f45223a |= 32;
                    oayVar.f45225c = 30;
                    oay oayVar2 = (oay) nxlVarM18137O15.mo18103l();
                    nxl nxlVarM18137O16 = oar.f45172d.m18137O();
                    if (!nxlVarM18137O16.f44974b.m18142ac()) {
                        nxlVarM18137O16.mo18106p();
                    }
                    oar oarVar = (oar) nxlVarM18137O16.f44974b;
                    oarVar.f45175b = 0;
                    oarVar.f45174a |= 1;
                    nxl nxlVarM18137O17 = oaz.f45226e.m18137O();
                    if (!nxlVarM18137O17.f44974b.m18142ac()) {
                        nxlVarM18137O17.mo18106p();
                    }
                    oaz oazVar = (oaz) nxlVarM18137O17.f44974b;
                    oazVar.f45229b = 4;
                    oazVar.f45228a |= 1;
                    nxl nxlVarM18137O18 = oav.f45208c.m18137O();
                    if (!nxlVarM18137O18.f44974b.m18142ac()) {
                        nxlVarM18137O18.mo18106p();
                    }
                    oav oavVar = (oav) nxlVarM18137O18.f44974b;
                    oavVar.f45211b = 2;
                    oavVar.f45210a |= 1;
                    if (!nxlVarM18137O17.f44974b.m18142ac()) {
                        nxlVarM18137O17.mo18106p();
                    }
                    oaz oazVar2 = (oaz) nxlVarM18137O17.f44974b;
                    oav oavVar2 = (oav) nxlVarM18137O18.mo18103l();
                    oavVar2.getClass();
                    oazVar2.f45230c = oavVar2;
                    oazVar2.f45228a |= 1024;
                    nxl nxlVarM18137O19 = oav.f45208c.m18137O();
                    if (!nxlVarM18137O19.f44974b.m18142ac()) {
                        nxlVarM18137O19.mo18106p();
                    }
                    oav oavVar3 = (oav) nxlVarM18137O19.f44974b;
                    oavVar3.f45211b = 2;
                    oavVar3.f45210a |= 1;
                    if (!nxlVarM18137O17.f44974b.m18142ac()) {
                        nxlVarM18137O17.mo18106p();
                    }
                    oaz oazVar3 = (oaz) nxlVarM18137O17.f44974b;
                    oav oavVar4 = (oav) nxlVarM18137O19.mo18103l();
                    oavVar4.getClass();
                    oazVar3.f45231d = oavVar4;
                    oazVar3.f45228a |= 2048;
                    if (!nxlVarM18137O16.f44974b.m18142ac()) {
                        nxlVarM18137O16.mo18106p();
                    }
                    oar oarVar2 = (oar) nxlVarM18137O16.f44974b;
                    oaz oazVar4 = (oaz) nxlVarM18137O17.mo18103l();
                    oazVar4.getClass();
                    oarVar2.f45176c = oazVar4;
                    oarVar2.f45174a |= 2;
                    oar oarVar3 = (oar) nxlVarM18137O16.mo18103l();
                    nxl nxlVarM18137O20 = oas.f45177b.m18137O();
                    String[] strArr = dec.f10644b;
                    int length5 = strArr.length;
                    for (int i = 0; i < 3; i++) {
                        String str = strArr[i];
                        nxl nxlVarM18137O21 = oat.f45180e.m18137O();
                        nxl nxlVarM18137O22 = oaw.f45212d.m18137O();
                        if (!nxlVarM18137O22.f44974b.m18142ac()) {
                            nxlVarM18137O22.mo18106p();
                        }
                        oaw oawVar = (oaw) nxlVarM18137O22.f44974b;
                        oawVar.f45214a |= 1;
                        oawVar.f45215b = "com.google.perception";
                        nxl nxlVarM18137O23 = oax.f45217c.m18137O();
                        if (!nxlVarM18137O23.f44974b.m18142ac()) {
                            nxlVarM18137O23.mo18106p();
                        }
                        oax oaxVar = (oax) nxlVarM18137O23.f44974b;
                        str.getClass();
                        oaxVar.f45219a |= 2;
                        oaxVar.f45220b = str;
                        if (!nxlVarM18137O22.f44974b.m18142ac()) {
                            nxlVarM18137O22.mo18106p();
                        }
                        oaw oawVar2 = (oaw) nxlVarM18137O22.f44974b;
                        oax oaxVar2 = (oax) nxlVarM18137O23.mo18103l();
                        oaxVar2.getClass();
                        oawVar2.f45216c = oaxVar2;
                        oawVar2.f45214a |= 2;
                        if (!nxlVarM18137O21.f44974b.m18142ac()) {
                            nxlVarM18137O21.mo18106p();
                        }
                        oat oatVar = (oat) nxlVarM18137O21.f44974b;
                        oaw oawVar3 = (oaw) nxlVarM18137O22.mo18103l();
                        oawVar3.getClass();
                        oatVar.f45183b = oawVar3;
                        oatVar.f45182a |= 1;
                        if (!nxlVarM18137O21.f44974b.m18142ac()) {
                            nxlVarM18137O21.mo18106p();
                        }
                        oat oatVar2 = (oat) nxlVarM18137O21.f44974b;
                        oayVar2.getClass();
                        nxy nxyVar2 = oatVar2.f45184c;
                        if (!nxyVar2.mo17770c()) {
                            oatVar2.f45184c = nxq.m18127U(nxyVar2);
                        }
                        oatVar2.f45184c.add(oayVar2);
                        if (!nxlVarM18137O21.f44974b.m18142ac()) {
                            nxlVarM18137O21.mo18106p();
                        }
                        oat oatVar3 = (oat) nxlVarM18137O21.f44974b;
                        oarVar3.getClass();
                        nxy nxyVar3 = oatVar3.f45185d;
                        if (!nxyVar3.mo17770c()) {
                            oatVar3.f45185d = nxq.m18127U(nxyVar3);
                        }
                        oatVar3.f45185d.add(oarVar3);
                        if (!nxlVarM18137O20.f44974b.m18142ac()) {
                            nxlVarM18137O20.mo18106p();
                        }
                        oas oasVar = (oas) nxlVarM18137O20.f44974b;
                        oat oatVar4 = (oat) nxlVarM18137O21.mo18103l();
                        oatVar4.getClass();
                        nxy nxyVar4 = oasVar.f45179a;
                        if (!nxyVar4.mo17770c()) {
                            oasVar.f45179a = nxq.m18127U(nxyVar4);
                        }
                        oasVar.f45179a.add(oatVar4);
                    }
                    oas oasVar2 = (oas) nxlVarM18137O20.mo18103l();
                    if (!nxnVarM5989k.f44974b.m18142ac()) {
                        nxnVarM5989k.mo18106p();
                    }
                    mex mexVar8 = (mex) nxnVarM5989k.f44974b;
                    oasVar2.getClass();
                    mexVar8.f40275i = oasVar2;
                    mexVar8.f40267a |= 2097152;
                    File file = new File(decVar.f10646d.getCodeCacheDir(), "cvk_model_cache/v1");
                    if (file.mkdirs() || file.exists()) {
                        string = file.toString();
                    } else {
                        Log.e("CacheUtil", "Unable to create accelerator cache directory ".concat(file.toString()));
                        string = null;
                    }
                    if (!mro.m16832b(string)) {
                        if (!nxnVarM5989k.f44974b.m18142ac()) {
                            nxnVarM5989k.mo18106p();
                        }
                        mex mexVar9 = (mex) nxnVarM5989k.f44974b;
                        string.getClass();
                        mexVar9.f40267a |= 8388608;
                        mexVar9.f40276j = string;
                    }
                } else {
                    if (!nxnVarM5989k.f44974b.m18142ac()) {
                        nxnVarM5989k.mo18106p();
                    }
                    mex mexVar10 = (mex) nxnVarM5989k.f44974b;
                    mexVar10.f40274h = 2;
                    mexVar10.f40267a = 1048576 | mexVar10.f40267a;
                }
                this.f10663e = decVar.m5988j(nxnVarM5989k);
            } catch (IOException e) {
                ((nbe) ((nbe) ((nbe) f10660d.m17251b()).mo17283h(e)).mo17276G((char) 842)).mo17290o("Failed to read assets for Non Barcode engines. Starting VisionKit with barcode only configuration");
                dec decVar2 = this.f10664f;
                nxn nxnVarM5989k2 = decVar2.m5989k();
                decVar2.m5991m(nxnVarM5989k2);
                decVar2.m5990l(nxnVarM5989k2);
                mey meyVarM5987i2 = decVar2.m5987i(3);
                if (!nxnVarM5989k2.f44974b.m18142ac()) {
                    nxnVarM5989k2.mo18106p();
                }
                mex mexVar11 = (mex) nxnVarM5989k2.f44974b;
                mex mexVar12 = mex.f40265k;
                meyVarM5987i2.getClass();
                mexVar11.f40273g = meyVarM5987i2;
                mexVar11.f40267a |= 32768;
                this.f10663e = decVar2.m5988j(nxnVarM5989k2);
            }
            this.f10665g = new dem(this, this.f10663e);
        }
        this.f10667i.mo13963g("camera_vkp_start");
        try {
            dem demVar = this.f10665g;
            lku.m15661o(demVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
            long j = demVar.f40222c;
            if (j == 0) {
                throw new PipelineException(mev.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
            }
            try {
                demVar.f40221b.start(j);
                demVar.f40221b.waitUntilIdle(demVar.f40222c);
            } catch (PipelineException e2) {
                demVar.f40221b.stop(demVar.f40222c);
                throw e2;
            }
        } catch (PipelineException e3) {
            m6007l(e3, hIAHJKEnGsNbz.SselGXInSAA);
        }
        this.f10667i.mo13962f();
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: e */
    public final void mo5999e() {
        this.f10667i.mo13961e(voNZjxiJou.WYkeaYA);
        dem demVar = this.f10665g;
        lku.m15661o(demVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        long j = demVar.f40222c;
        if (j == 0) {
            Log.w("VKP", "enableSubpipeline called but pipeline is not available. Ignoring call.");
        } else {
            demVar.f40221b.enableSubpipeline(j, "LazyPipeline");
        }
        this.f10667i.mo13962f();
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: f */
    public final void mo6000f() {
        dem demVar = this.f10665g;
        if (demVar != null) {
            try {
                lku.m15662p(demVar);
                demVar.m16339c();
                this.f10664f.m5980b();
            } catch (IOException | RuntimeException e) {
                m6007l(e, "Unable to close Vision kit");
            }
            this.f10665g = null;
        }
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: g */
    public final void mo6001g() {
        this.f10667i.mo13961e("camera_vkp_disable_sub_pipeline");
        dem demVar = this.f10665g;
        lku.m15661o(demVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        long j = demVar.f40222c;
        if (j == 0) {
            Log.w("VKP", "disableSubpipeline called but pipeline is not available. Ignoring call.");
        } else {
            demVar.f40221b.disableSubpipeline(j, "LazyPipeline");
        }
        this.f10667i.mo13962f();
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: h */
    public final boolean mo6002h(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        det detVar = this.f10661b.f10766b;
        detVar.f10744h = i;
        detVar.f10745i = i2;
        dfh dfhVar = detVar.f10742f;
        dfhVar.f10782d = i;
        dfhVar.f10783e = i2;
        dem demVar = this.f10665g;
        lku.m15661o(demVar, "CameraVisionKitPipeline needs to be initialized first", new Object[0]);
        if (demVar.f40222c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        }
        if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
            return demVar.f40221b.receiveYuvFrame(demVar.f40222c, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6);
        }
        throw new IllegalStateException("Byte buffers are not direct.");
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: i */
    public final synchronized void mo6003i() {
        if (this.f10669k == 1) {
            return;
        }
        this.f10669k = 1;
        dem demVar = this.f10665g;
        lku.m15662p(demVar);
        demVar.f40221b.resetSchedulingOptimizerOptions(demVar.f40222c, this.f10664f.m5987i(1).mo17760J());
    }

    @Override // p000.dek
    /* JADX INFO: renamed from: j */
    public final void mo6004j(oyo oyoVar) {
        det detVar = this.f10661b.f10766b;
        detVar.f10747k = oyoVar;
        detVar.f10742f.f10784f = oyoVar;
    }

    @Override // p000.dfe
    /* JADX INFO: renamed from: k */
    public final void mo6008k(des desVar) {
        this.f10662c.mo5994d(desVar);
    }
}
