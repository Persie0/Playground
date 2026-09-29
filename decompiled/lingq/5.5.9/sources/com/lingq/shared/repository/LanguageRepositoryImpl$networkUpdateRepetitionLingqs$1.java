package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LanguageRepositoryImpl", m19206f = "LanguageRepository.kt", m19207l = {317, 321}, m19208m = "networkUpdateRepetitionLingqs")
final class LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LanguageRepositoryImpl f19722d;

    /* JADX INFO: renamed from: e */
    public int f19723e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19724f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LanguageRepositoryImpl f19725g;

    /* JADX INFO: renamed from: h */
    public int f19726h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(LanguageRepositoryImpl languageRepositoryImpl, InterfaceC9968c<? super LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19725g = languageRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19724f = obj;
        this.f19726h |= Integer.MIN_VALUE;
        return this.f19725g.mo6017c(0, null, this);
    }
}
