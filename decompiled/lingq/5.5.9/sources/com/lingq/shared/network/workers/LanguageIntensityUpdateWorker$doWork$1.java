package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.LanguageIntensityUpdateWorker", m19206f = "LanguageIntensityUpdateWorker.kt", m19207l = {31}, m19208m = "doWork")
public final class LanguageIntensityUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19231d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LanguageIntensityUpdateWorker f19232e;

    /* JADX INFO: renamed from: f */
    public int f19233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageIntensityUpdateWorker$doWork$1(LanguageIntensityUpdateWorker languageIntensityUpdateWorker, InterfaceC9968c<? super LanguageIntensityUpdateWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19232e = languageIntensityUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19231d = obj;
        this.f19233f |= Integer.MIN_VALUE;
        return this.f19232e.mo4698g(this);
    }
}
