package com.google.android.libraries.lens.lenslite.api;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.kvr;
import p000.kwf;
import p000.kwt;
import p000.kwu;
import p000.kwv;
import p000.kww;
import p000.kwx;
import p000.kwy;
import p000.kwz;
import p000.kxa;
import p000.kxj;
import p000.kxk;
import p000.lme;
import p000.nwb;
import p000.nwr;
import p000.nww;
import p000.nwx;
import p000.nxf;
import p000.nxl;
import p000.nxq;
import p000.nxy;
import p000.nyb;
import p000.nzf;
import p000.nzm;
import p000.nzx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class LinkConfig {
    private static final String TAG = "LinkConfig";

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public abstract class Builder {
        /* JADX INFO: renamed from: a */
        public abstract void mo4698a(kwt kwtVar);

        public abstract LinkConfig build();
    }

    public static Builder builder() {
        kvr kvrVar = new kvr();
        kvrVar.mo4698a(kwf.f37504b);
        kvrVar.f37396G = (byte) 3;
        return kvrVar;
    }

    public static LinkConfig fromByteArray(byte[] bArr) throws nyb {
        kwt kwtVarM14949b;
        nxq nxqVarM18123Q = nxq.m18123Q(kwv.f37540L, bArr, 0, bArr.length, nxf.m18011a());
        nxq.m18132ae(nxqVarM18123Q);
        kwv kwvVar = (kwv) nxqVarM18123Q;
        Builder builder = builder();
        if ((kwvVar.f37553a & 1) != 0) {
            ((kvr) builder).f37398a = Boolean.valueOf(kwvVar.f37555c);
        }
        if ((kwvVar.f37553a & 8388608) != 0) {
            ((kvr) builder).f37399b = Boolean.valueOf(kwvVar.f37555c);
        }
        if ((kwvVar.f37553a & 2) != 0) {
            ((kvr) builder).f37400c = Boolean.valueOf(kwvVar.f37556d);
        }
        if ((kwvVar.f37553a & 16) != 0) {
            kvr kvrVar = (kvr) builder;
            kvrVar.f37402e = Boolean.valueOf(kwvVar.f37559g);
            kwx kwxVar = kwvVar.f37570r;
            if (kwxVar == null) {
                kwxVar = kwx.f37581b;
            }
            kvrVar.f37403f = kwxVar.f37583a;
        }
        if ((kwvVar.f37553a & 32) != 0) {
            ((kvr) builder).f37404g = Integer.valueOf(kwvVar.f37560h);
        }
        kwy kwyVar = kwvVar.f37561i;
        if (kwyVar == null) {
            kwyVar = kwy.f37584c;
        }
        if ((kwyVar.f37586a & 2) != 0) {
            kwy kwyVar2 = kwvVar.f37561i;
            if (kwyVar2 == null) {
                kwyVar2 = kwy.f37584c;
            }
            ((kvr) builder).f37401d = Boolean.valueOf(kwyVar2.f37587b);
        }
        if ((kwvVar.f37553a & 2) != 0) {
            kvr kvrVar2 = (kvr) builder;
            kvrVar2.f37400c = Boolean.valueOf(kwvVar.f37556d);
            if (kwvVar.f37568p.size() > 0) {
                HashMap map = new HashMap();
                for (kxa kxaVar : kwvVar.f37568p) {
                    map.put(kxaVar.f37598b, Float.valueOf(kxaVar.f37599c));
                }
                kvrVar2.f37409l = map;
            }
        }
        if ((kwvVar.f37553a & 128) != 0) {
            int iM14981a = kxk.m14981a(kwvVar.f37562j);
            if (iM14981a == 0) {
                iM14981a = 2;
            }
            ((kvr) builder).f37405h = Integer.valueOf(iM14981a - 1);
        }
        if ((kwvVar.f37553a & 256) != 0) {
            ((kvr) builder).f37406i = Boolean.valueOf(kwvVar.f37563k);
        }
        if ((kwvVar.f37553a & 1048576) != 0) {
            kvr kvrVar3 = (kvr) builder;
            kvrVar3.f37418u = Boolean.valueOf(kwvVar.f37576x);
            if ((kwvVar.f37553a & 4194304) != 0) {
                kwu kwuVar = kwvVar.f37578z;
                if (kwuVar == null) {
                    kwuVar = kwu.f37538a;
                }
                kvrVar3.f37419v = kwuVar;
            }
        }
        if ((kwvVar.f37553a & 512) != 0) {
            ((kvr) builder).f37407j = Integer.valueOf(kwvVar.f37564l);
        }
        if ((kwvVar.f37553a & 1024) != 0) {
            ((kvr) builder).f37408k = Boolean.valueOf(kwvVar.f37565m);
        }
        if ((kwvVar.f37553a & 2048) != 0) {
            ((kvr) builder).f37410m = Boolean.valueOf(kwvVar.f37566n);
        }
        if ((kwvVar.f37553a & 4096) != 0) {
            ((kvr) builder).f37411n = Boolean.valueOf(kwvVar.f37567o);
        }
        if ((kwvVar.f37553a & 4) != 0) {
            ((kvr) builder).f37412o = true;
        }
        if ((kwvVar.f37553a & 65536) != 0) {
            ((kvr) builder).f37413p = Boolean.valueOf(kwvVar.f37572t);
        }
        kwt kwtVarM14949b2 = kwt.m14949b(kwvVar.f37569q);
        if (kwtVarM14949b2 == null) {
            kwtVarM14949b2 = kwt.UNKNOWN_DYNAMIC_LOADING_MODE;
        }
        if (kwtVarM14949b2 == kwt.UNKNOWN_DYNAMIC_LOADING_MODE) {
            kwtVarM14949b = kwf.f37504b;
        } else {
            kwtVarM14949b = kwt.m14949b(kwvVar.f37569q);
            if (kwtVarM14949b == null) {
                kwtVarM14949b = kwt.UNKNOWN_DYNAMIC_LOADING_MODE;
            }
        }
        builder.mo4698a(kwtVarM14949b);
        if ((kwvVar.f37553a & 131072) != 0) {
            int iM15717c = lme.m15717c(kwvVar.f37573u);
            if (iM15717c == 0) {
                iM15717c = 1;
            }
            ((kvr) builder).f37414q = Integer.valueOf(iM15717c - 1);
        }
        if ((kwvVar.f37553a & 262144) != 0) {
            ((kvr) builder).f37415r = Boolean.valueOf(kwvVar.f37574v);
        }
        if ((kwvVar.f37554b & 2) != 0) {
            ((kvr) builder).f37416s = Long.valueOf(kwvVar.f37552K);
        }
        if ((kwvVar.f37553a & 524288) != 0) {
            ((kvr) builder).f37417t = Boolean.valueOf(kwvVar.f37575w);
        }
        if ((kwvVar.f37553a & 2097152) != 0) {
            ((kvr) builder).f37420w = Long.valueOf(kwvVar.f37577y);
        }
        if ((kwvVar.f37553a & 16777216) != 0) {
            ((kvr) builder).f37421x = Boolean.valueOf(kwvVar.f37543B);
        }
        if ((kwvVar.f37553a & 33554432) != 0) {
            kxj kxjVar = kwvVar.f37544C;
            if (kxjVar == null) {
                kxjVar = kxj.f37650a;
            }
            ((kvr) builder).f37422y = ByteBuffer.wrap(kxjVar.mo17760J());
        }
        if ((kwvVar.f37553a & 67108864) != 0) {
            ((kvr) builder).f37423z = Boolean.valueOf(kwvVar.f37545D);
        }
        if ((kwvVar.f37553a & 134217728) != 0) {
            ((kvr) builder).f37390A = ByteBuffer.wrap(kwvVar.f37546E.m17804A());
        }
        if ((kwvVar.f37553a & 268435456) != 0) {
            ((kvr) builder).f37391B = Boolean.valueOf(kwvVar.f37547F);
        }
        if ((kwvVar.f37554b & 1) != 0) {
            ((kvr) builder).f37392C = Boolean.valueOf(kwvVar.f37551J);
        }
        if ((kwvVar.f37553a & 536870912) != 0) {
            kwz kwzVar = kwvVar.f37548G;
            if (kwzVar == null) {
                kwzVar = kwz.f37588a;
            }
            ((kvr) builder).f37394E = kwzVar;
        }
        if ((kwvVar.f37553a & 1073741824) != 0) {
            ((kvr) builder).f37393D = Boolean.valueOf(kwvVar.f37549H);
        }
        if ((kwvVar.f37553a & Integer.MIN_VALUE) != 0) {
            ((kvr) builder).f37395F = Boolean.valueOf(kwvVar.f37550I);
        }
        return builder.build();
    }

    public abstract boolean aiAiShoppingDetectionEnabled();

    public abstract boolean aiAiTranslateDetectionEnabled();

    public abstract Boolean apparelDetectionEnabled();

    @Deprecated
    public abstract Integer apparelMode();

    public abstract Boolean barcodeEnabled();

    public abstract Boolean documentScanningEnabled();

    public abstract Integer dutyCycleMode();

    public abstract kwt dynamicLoadingMode();

    public abstract Boolean embedderModeEnabled();

    public abstract Boolean foreignLanguageDetectionEnabled();

    public abstract Boolean freeTextCopyEnabled();

    public abstract Boolean gleamEngineEnabled();

    public abstract Boolean legacyPixelParity();

    public abstract Boolean lens2020ModeEnabled();

    public abstract kwu lens2020Params();

    public abstract Boolean lightweightSuggestionsModeEnabled();

    public abstract ByteBuffer linkEvalConfigMetadata();

    public abstract Boolean linkModelDownloadEnabled();

    public abstract Long minimumDynamicLoadingHostVersion();

    public abstract kwz mobileRaidParams();

    public abstract Long modelDownloadCheckTimeoutMs();

    public abstract Boolean modelDownloadEnabled();

    public abstract Boolean nonEnPersonNameDetectionEnabled();

    public abstract Boolean pdpTextExtractionEnabled();

    public abstract Boolean pixelChipMode();

    public abstract Integer processorImagePoolSize();

    public abstract Integer processorMode();

    @Deprecated
    public abstract Boolean productDetectionEnabled();

    @Deprecated
    public abstract String productIndex();

    @Deprecated
    public abstract Integer productMode();

    public abstract Map sceneClassificationMap();

    public abstract Boolean sceneDetectionEnabled();

    public abstract ByteBuffer serializedPipelineConfig();

    public abstract Boolean stopPipelineOnPause();

    public abstract List supportedTranslateLanguages();

    @Deprecated
    public abstract Boolean textSelectionEnabled();

    public final byte[] toByteArray() throws nyb {
        nxl nxlVarM18137O = kwv.f37540L.m18137O();
        Boolean boolWifiConnectionEnabled = wifiConnectionEnabled();
        if (boolWifiConnectionEnabled != null) {
            boolean zBooleanValue = boolWifiConnectionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar = (kwv) nxlVarM18137O.f44974b;
            kwvVar.f37553a |= 1;
            kwvVar.f37555c = zBooleanValue;
        }
        Boolean boolWifiScanEnabled = wifiScanEnabled();
        if (boolWifiScanEnabled != null) {
            boolean zBooleanValue2 = boolWifiScanEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar2 = (kwv) nxlVarM18137O.f44974b;
            kwvVar2.f37553a |= 8388608;
            kwvVar2.f37542A = zBooleanValue2;
        }
        Boolean boolSceneDetectionEnabled = sceneDetectionEnabled();
        if (boolSceneDetectionEnabled != null) {
            boolean zBooleanValue3 = boolSceneDetectionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar3 = (kwv) nxlVarM18137O.f44974b;
            kwvVar3.f37553a |= 2;
            kwvVar3.f37556d = zBooleanValue3;
        }
        Boolean boolFreeTextCopyEnabled = freeTextCopyEnabled();
        if (boolFreeTextCopyEnabled != null) {
            boolean zBooleanValue4 = boolFreeTextCopyEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar4 = (kwv) nxlVarM18137O.f44974b;
            kwvVar4.f37553a |= 8;
            kwvVar4.f37558f = zBooleanValue4;
        }
        Boolean boolForeignLanguageDetectionEnabled = foreignLanguageDetectionEnabled();
        if (boolForeignLanguageDetectionEnabled != null) {
            boolean zBooleanValue5 = boolForeignLanguageDetectionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar5 = (kwv) nxlVarM18137O.f44974b;
            kwvVar5.f37553a |= 16;
            kwvVar5.f37559g = zBooleanValue5;
            List listSupportedTranslateLanguages = supportedTranslateLanguages();
            if (listSupportedTranslateLanguages != null) {
                nxl nxlVarM18137O2 = kwx.f37581b.m18137O();
                if (!nxlVarM18137O2.f44974b.m18142ac()) {
                    nxlVarM18137O2.mo18106p();
                }
                kwx kwxVar = (kwx) nxlVarM18137O2.f44974b;
                nxy nxyVar = kwxVar.f37583a;
                if (!nxyVar.mo17770c()) {
                    kwxVar.f37583a = nxq.m18127U(nxyVar);
                }
                nwb.m17749e(listSupportedTranslateLanguages, kwxVar.f37583a);
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                kwv kwvVar6 = (kwv) nxlVarM18137O.f44974b;
                kwx kwxVar2 = (kwx) nxlVarM18137O2.mo18103l();
                kwxVar2.getClass();
                kwvVar6.f37570r = kwxVar2;
                kwvVar6.f37553a |= 16384;
            }
        }
        Integer numProcessorMode = processorMode();
        if (numProcessorMode != null) {
            int iIntValue = numProcessorMode.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar7 = (kwv) nxlVarM18137O.f44974b;
            kwvVar7.f37553a |= 32;
            kwvVar7.f37560h = iIntValue;
        }
        Boolean boolFreeTextCopyEnabled2 = freeTextCopyEnabled();
        if (boolFreeTextCopyEnabled2 != null && boolFreeTextCopyEnabled2.booleanValue()) {
            nxl nxlVarM18137O3 = kwy.f37584c.m18137O();
            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                nxlVarM18137O3.mo18106p();
            }
            kwy kwyVar = (kwy) nxlVarM18137O3.f44974b;
            kwyVar.f37586a |= 2;
            kwyVar.f37587b = true;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar8 = (kwv) nxlVarM18137O.f44974b;
            kwy kwyVar2 = (kwy) nxlVarM18137O3.mo18103l();
            kwyVar2.getClass();
            kwvVar8.f37561i = kwyVar2;
            kwvVar8.f37553a |= 64;
        }
        Boolean boolSceneDetectionEnabled2 = sceneDetectionEnabled();
        if (boolSceneDetectionEnabled2 != null) {
            boolean zBooleanValue6 = boolSceneDetectionEnabled2.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar9 = (kwv) nxlVarM18137O.f44974b;
            kwvVar9.f37553a |= 2;
            kwvVar9.f37556d = zBooleanValue6;
            Map mapSceneClassificationMap = sceneClassificationMap();
            if (mapSceneClassificationMap != null) {
                for (Map.Entry entry : mapSceneClassificationMap.entrySet()) {
                    nxl nxlVarM18137O4 = kxa.f37595d.m18137O();
                    String str = (String) entry.getKey();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    kxa kxaVar = (kxa) nxlVarM18137O4.f44974b;
                    str.getClass();
                    kxaVar.f37597a |= 1;
                    kxaVar.f37598b = str;
                    float fFloatValue = ((Float) entry.getValue()).floatValue();
                    if (!nxlVarM18137O4.f44974b.m18142ac()) {
                        nxlVarM18137O4.mo18106p();
                    }
                    kxa kxaVar2 = (kxa) nxlVarM18137O4.f44974b;
                    kxaVar2.f37597a |= 2;
                    kxaVar2.f37599c = fFloatValue;
                    kxa kxaVar3 = (kxa) nxlVarM18137O4.mo18103l();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    kwv kwvVar10 = (kwv) nxlVarM18137O.f44974b;
                    kxaVar3.getClass();
                    nxy nxyVar2 = kwvVar10.f37568p;
                    if (!nxyVar2.mo17770c()) {
                        kwvVar10.f37568p = nxq.m18127U(nxyVar2);
                    }
                    kwvVar10.f37568p.add(kxaVar3);
                }
            }
        }
        Integer numTriggerMode = triggerMode();
        if (numTriggerMode != null) {
            int iM14981a = kxk.m14981a(numTriggerMode.intValue());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar11 = (kwv) nxlVarM18137O.f44974b;
            int i = iM14981a - 1;
            if (iM14981a == 0) {
                throw null;
            }
            kwvVar11.f37562j = i;
            kwvVar11.f37553a |= 128;
        }
        Boolean boolApparelDetectionEnabled = apparelDetectionEnabled();
        if (boolApparelDetectionEnabled != null) {
            boolean zBooleanValue7 = boolApparelDetectionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            nxq nxqVar = nxlVarM18137O.f44974b;
            kwv kwvVar12 = (kwv) nxqVar;
            kwvVar12.f37553a |= 256;
            kwvVar12.f37563k = zBooleanValue7;
            if (!nxqVar.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar13 = (kwv) nxlVarM18137O.f44974b;
            kwvVar13.f37571s = 1;
            kwvVar13.f37553a |= 32768;
        }
        Integer numProcessorImagePoolSize = processorImagePoolSize();
        if (numProcessorImagePoolSize != null) {
            int iIntValue2 = numProcessorImagePoolSize.intValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar14 = (kwv) nxlVarM18137O.f44974b;
            kwvVar14.f37553a |= 512;
            kwvVar14.f37564l = iIntValue2;
        }
        Boolean boolNonEnPersonNameDetectionEnabled = nonEnPersonNameDetectionEnabled();
        if (boolNonEnPersonNameDetectionEnabled != null) {
            boolean zBooleanValue8 = boolNonEnPersonNameDetectionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar15 = (kwv) nxlVarM18137O.f44974b;
            kwvVar15.f37553a |= 1024;
            kwvVar15.f37565m = zBooleanValue8;
        }
        Boolean boolLegacyPixelParity = legacyPixelParity();
        if (boolLegacyPixelParity != null) {
            boolean zBooleanValue9 = boolLegacyPixelParity.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar16 = (kwv) nxlVarM18137O.f44974b;
            kwvVar16.f37553a |= 2048;
            kwvVar16.f37566n = zBooleanValue9;
        }
        Boolean boolPixelChipMode = pixelChipMode();
        if (boolPixelChipMode != null) {
            boolean zBooleanValue10 = boolPixelChipMode.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar17 = (kwv) nxlVarM18137O.f44974b;
            kwvVar17.f37553a |= 4096;
            kwvVar17.f37567o = zBooleanValue10;
        }
        Boolean boolDocumentScanningEnabled = documentScanningEnabled();
        if (boolDocumentScanningEnabled != null && boolDocumentScanningEnabled.booleanValue()) {
            kww kwwVar = kww.f37579a;
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar18 = (kwv) nxlVarM18137O.f44974b;
            kwwVar.getClass();
            kwvVar18.f37557e = kwwVar;
            kwvVar18.f37553a |= 4;
        }
        Boolean boolGleamEngineEnabled = gleamEngineEnabled();
        if (boolGleamEngineEnabled != null) {
            boolean zBooleanValue11 = boolGleamEngineEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar19 = (kwv) nxlVarM18137O.f44974b;
            kwvVar19.f37553a |= 65536;
            kwvVar19.f37572t = zBooleanValue11;
        }
        kwt kwtVarDynamicLoadingMode = dynamicLoadingMode();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        kwv kwvVar20 = (kwv) nxlVarM18137O.f44974b;
        kwvVar20.f37569q = kwtVarDynamicLoadingMode.f37537f;
        kwvVar20.f37553a |= 8192;
        Integer numDutyCycleMode = dutyCycleMode();
        if (numDutyCycleMode != null) {
            int iM15717c = lme.m15717c(numDutyCycleMode.intValue());
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar21 = (kwv) nxlVarM18137O.f44974b;
            int i2 = iM15717c - 1;
            if (iM15717c == 0) {
                throw null;
            }
            kwvVar21.f37573u = i2;
            kwvVar21.f37553a |= 131072;
        }
        Boolean boolModelDownloadEnabled = modelDownloadEnabled();
        if (boolModelDownloadEnabled != null) {
            boolean zBooleanValue12 = boolModelDownloadEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar22 = (kwv) nxlVarM18137O.f44974b;
            kwvVar22.f37553a |= 262144;
            kwvVar22.f37574v = zBooleanValue12;
        }
        Long lModelDownloadCheckTimeoutMs = modelDownloadCheckTimeoutMs();
        if (lModelDownloadCheckTimeoutMs != null) {
            long jLongValue = lModelDownloadCheckTimeoutMs.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar23 = (kwv) nxlVarM18137O.f44974b;
            kwvVar23.f37554b |= 2;
            kwvVar23.f37552K = jLongValue;
        }
        Boolean boolBarcodeEnabled = barcodeEnabled();
        if (boolBarcodeEnabled != null) {
            boolean zBooleanValue13 = boolBarcodeEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar24 = (kwv) nxlVarM18137O.f44974b;
            kwvVar24.f37553a |= 524288;
            kwvVar24.f37575w = zBooleanValue13;
        }
        Boolean boolLens2020ModeEnabled = lens2020ModeEnabled();
        if (boolLens2020ModeEnabled != null) {
            boolean zBooleanValue14 = boolLens2020ModeEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar25 = (kwv) nxlVarM18137O.f44974b;
            kwvVar25.f37553a |= 1048576;
            kwvVar25.f37576x = zBooleanValue14;
            kwu kwuVarLens2020Params = lens2020Params();
            if (kwuVarLens2020Params != null) {
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                kwv kwvVar26 = (kwv) nxlVarM18137O.f44974b;
                kwvVar26.f37578z = kwuVarLens2020Params;
                kwvVar26.f37553a |= 4194304;
            }
        }
        Long lTrivialFeatureEnabledBits = trivialFeatureEnabledBits();
        if (lTrivialFeatureEnabledBits != null) {
            long jLongValue2 = lTrivialFeatureEnabledBits.longValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar27 = (kwv) nxlVarM18137O.f44974b;
            kwvVar27.f37553a |= 2097152;
            kwvVar27.f37577y = jLongValue2;
        }
        Boolean boolPdpTextExtractionEnabled = pdpTextExtractionEnabled();
        if (boolPdpTextExtractionEnabled != null) {
            boolean zBooleanValue15 = boolPdpTextExtractionEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar28 = (kwv) nxlVarM18137O.f44974b;
            kwvVar28.f37553a |= 16777216;
            kwvVar28.f37543B = zBooleanValue15;
        }
        ByteBuffer byteBufferLinkEvalConfigMetadata = linkEvalConfigMetadata();
        if (byteBufferLinkEvalConfigMetadata != null) {
            try {
                nxf nxfVarM18011a = nxf.m18011a();
                kxj kxjVar = kxj.f37650a;
                nww nwwVarM17877J = nww.m17877J(byteBufferLinkEvalConfigMetadata);
                nxq nxqVarM18138P = kxjVar.m18138P();
                try {
                    try {
                        try {
                            try {
                                nzm nzmVarM18260b = nzf.f45060a.m18260b(nxqVarM18138P);
                                nzmVarM18260b.mo18252h(nxqVarM18138P, nwx.m17885p(nwwVarM17877J), nxfVarM18011a);
                                nzmVarM18260b.mo18250f(nxqVarM18138P);
                                nxq.m18132ae(nxqVarM18138P);
                                nxq.m18132ae(nxqVarM18138P);
                                kxj kxjVar2 = (kxj) nxqVarM18138P;
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                kwv kwvVar29 = (kwv) nxlVarM18137O.f44974b;
                                kxjVar2.getClass();
                                kwvVar29.f37544C = kxjVar2;
                                kwvVar29.f37553a |= 33554432;
                            } catch (IOException e) {
                                if (e.getCause() instanceof nyb) {
                                    throw ((nyb) e.getCause());
                                }
                                throw new nyb(e);
                            }
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof nyb) {
                                throw ((nyb) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (nyb e3) {
                        if (e3.f44994a) {
                            throw new nyb(e3);
                        }
                        throw e3;
                    }
                } catch (nzx e4) {
                    throw e4.m18328a();
                }
            } catch (nyb e5) {
                Object[] objArr = new Object[0];
                if (Log.isLoggable(TAG, 6)) {
                    Log.e(TAG, lme.m15722h("Unable to parse LinkEvalConfigMetadata.", objArr));
                }
            }
        }
        Boolean boolLinkModelDownloadEnabled = linkModelDownloadEnabled();
        if (boolLinkModelDownloadEnabled != null) {
            boolean zBooleanValue16 = boolLinkModelDownloadEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar30 = (kwv) nxlVarM18137O.f44974b;
            kwvVar30.f37553a |= 67108864;
            kwvVar30.f37545D = zBooleanValue16;
        }
        ByteBuffer byteBufferSerializedPipelineConfig = serializedPipelineConfig();
        if (byteBufferSerializedPipelineConfig != null) {
            nwr nwrVarM17798t = nwr.m17798t(byteBufferSerializedPipelineConfig);
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar31 = (kwv) nxlVarM18137O.f44974b;
            kwvVar31.f37553a |= 134217728;
            kwvVar31.f37546E = nwrVarM17798t;
        }
        Boolean boolStopPipelineOnPause = stopPipelineOnPause();
        if (boolStopPipelineOnPause != null) {
            boolean zBooleanValue17 = boolStopPipelineOnPause.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar32 = (kwv) nxlVarM18137O.f44974b;
            kwvVar32.f37554b = 1 | kwvVar32.f37554b;
            kwvVar32.f37551J = zBooleanValue17;
        }
        Boolean boolLightweightSuggestionsModeEnabled = lightweightSuggestionsModeEnabled();
        if (boolLightweightSuggestionsModeEnabled != null) {
            boolean zBooleanValue18 = boolLightweightSuggestionsModeEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar33 = (kwv) nxlVarM18137O.f44974b;
            kwvVar33.f37553a |= 268435456;
            kwvVar33.f37547F = zBooleanValue18;
        }
        kwz kwzVarMobileRaidParams = mobileRaidParams();
        if (kwzVarMobileRaidParams != null) {
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar34 = (kwv) nxlVarM18137O.f44974b;
            kwvVar34.f37548G = kwzVarMobileRaidParams;
            kwvVar34.f37553a |= 536870912;
        }
        Boolean boolEmbedderModeEnabled = embedderModeEnabled();
        if (boolEmbedderModeEnabled != null) {
            boolean zBooleanValue19 = boolEmbedderModeEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar35 = (kwv) nxlVarM18137O.f44974b;
            kwvVar35.f37553a |= 1073741824;
            kwvVar35.f37549H = zBooleanValue19;
        }
        Boolean boolWaitForVkpStartEnabled = waitForVkpStartEnabled();
        if (boolWaitForVkpStartEnabled != null) {
            boolean zBooleanValue20 = boolWaitForVkpStartEnabled.booleanValue();
            if (!nxlVarM18137O.f44974b.m18142ac()) {
                nxlVarM18137O.mo18106p();
            }
            kwv kwvVar36 = (kwv) nxlVarM18137O.f44974b;
            kwvVar36.f37553a |= Integer.MIN_VALUE;
            kwvVar36.f37550I = zBooleanValue20;
        }
        return ((kwv) nxlVarM18137O.mo18103l()).mo17760J();
    }

    public abstract Integer triggerMode();

    public abstract Long trivialFeatureEnabledBits();

    public abstract Boolean waitForVkpStartEnabled();

    public abstract Boolean wifiConnectionEnabled();

    public abstract Boolean wifiScanEnabled();
}
