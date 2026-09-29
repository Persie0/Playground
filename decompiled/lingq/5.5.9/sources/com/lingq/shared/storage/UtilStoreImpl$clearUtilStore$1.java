package com.lingq.shared.storage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl", m19206f = "UtilStore.kt", m19207l = {328, 329, 330, 331, 332, 333, 334, 335}, m19208m = "clearUtilStore")
public final class UtilStoreImpl$clearUtilStore$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public UtilStoreImpl f21486d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21487e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UtilStoreImpl f21488f;

    /* JADX INFO: renamed from: g */
    public int f21489g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilStoreImpl$clearUtilStore$1(UtilStoreImpl utilStoreImpl, InterfaceC9968c<? super UtilStoreImpl$clearUtilStore$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f21488f = utilStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f21487e = obj;
        this.f21489g |= Integer.MIN_VALUE;
        return this.f21488f.mo9683g(this);
    }
}
