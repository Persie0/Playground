package com.google.firebase.sessions.settings;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.google.firebase.sessions.settings.SettingsCacheImpl", m4291f = "SettingsCache.kt", m4292l = {98}, m4293m = "updateConfigs")
final class SettingsCacheImpl$updateConfigs$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13889a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1171c f13890b;

    /* JADX INFO: renamed from: c */
    public int f13891c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCacheImpl$updateConfigs$1(C1171c c1171c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13890b = c1171c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f13889a = obj;
        this.f13891c |= Integer.MIN_VALUE;
        return this.f13890b.m6769c(null, this);
    }
}
