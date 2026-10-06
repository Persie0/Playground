package com.google.android.libraries.vision.visionkit.pipeline;

import java.util.List;
import p000.mev;
import p000.mfa;
import p000.mkv;
import p000.mqu;
import p000.mrm;
import p000.msa;
import p000.mws;
import p000.mzr;
import p000.nxf;
import p000.nxq;
import p000.nyb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final mev statusCode;
    private final String statusMessage;
    private final mfa visionkitStatus;

    public PipelineException(int i, String str) {
        super(mev.values()[i].f40253r + ": " + str);
        this.statusCode = mev.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public List getComponentStatuses() {
        mfa mfaVar = this.visionkitStatus;
        if (mfaVar != null) {
            return mfaVar.f40295c;
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    public mrm getRootCauseMessage() {
        return this.statusMessage.contains(ROOT_CAUSE_DELIMITER) ? mrm.m16829i((String) mkv.m16515W(msa.m16847c(ROOT_CAUSE_DELIMITER).m16851f(this.statusMessage))) : mqu.f41450a;
    }

    public mev getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    private PipelineException(mfa mfaVar) {
        super(mev.values()[mfaVar.f40293a].f40253r + ": " + mfaVar.f40294b);
        this.statusCode = mev.values()[mfaVar.f40293a];
        this.statusMessage = mfaVar.f40294b;
        this.visionkitStatus = mfaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    PipelineException(byte[] bArr) throws nyb {
        nxq nxqVarM18123Q = nxq.m18123Q(mfa.f40291d, bArr, 0, bArr.length, nxf.f44904a);
        nxq.m18132ae(nxqVarM18123Q);
        this((mfa) nxqVarM18123Q);
    }
}
