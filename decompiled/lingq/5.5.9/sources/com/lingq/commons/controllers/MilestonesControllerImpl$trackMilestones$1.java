package com.lingq.commons.controllers;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p096ei.C5409b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.MilestonesControllerImpl", m19206f = "MilestonesController.kt", m19207l = {27, 29, 31, 38, 40, 65}, m19208m = "trackMilestones")
public final class MilestonesControllerImpl$trackMilestones$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public MilestonesControllerImpl f16537d;

    /* JADX INFO: renamed from: e */
    public Serializable f16538e;

    /* JADX INFO: renamed from: f */
    public C5409b f16539f;

    /* JADX INFO: renamed from: g */
    public List f16540g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f16541h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ MilestonesControllerImpl f16542i;

    /* JADX INFO: renamed from: j */
    public int f16543j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestonesControllerImpl$trackMilestones$1(MilestonesControllerImpl milestonesControllerImpl, InterfaceC9968c<? super MilestonesControllerImpl$trackMilestones$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f16542i = milestonesControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f16541h = obj;
        this.f16543j |= Integer.MIN_VALUE;
        return this.f16542i.mo9326s(this);
    }
}
