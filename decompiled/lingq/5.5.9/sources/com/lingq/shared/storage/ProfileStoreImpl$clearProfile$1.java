package com.lingq.shared.storage;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl", m19206f = "ProfileStore.kt", m19207l = {96, 97, 98, 99}, m19208m = "clearProfile")
public final class ProfileStoreImpl$clearProfile$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public ProfileStoreImpl f21085d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f21086e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProfileStoreImpl f21087f;

    /* JADX INFO: renamed from: g */
    public int f21088g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStoreImpl$clearProfile$1(ProfileStoreImpl profileStoreImpl, InterfaceC9968c<? super ProfileStoreImpl$clearProfile$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f21087f = profileStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f21086e = obj;
        this.f21088g |= Integer.MIN_VALUE;
        return this.f21087f.mo9617f(this);
    }
}
