package com.lingq.core.settings;

import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel", m4291f = "ReaderSettingsViewModel.kt", m4292l = {314}, m4293m = "buildDictionaryLocaleItems", m4294v = 2)
final class ReaderSettingsViewModel$buildDictionaryLocaleItems$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22579a;

    /* JADX INFO: renamed from: b */
    public Set f22580b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22581c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1859b f22582d;

    /* JADX INFO: renamed from: e */
    public int f22583e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$buildDictionaryLocaleItems$1(C1859b c1859b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22582d = c1859b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22581c = obj;
        this.f22583e |= Integer.MIN_VALUE;
        return C1859b.m8610V2(this.f22582d, null, this);
    }
}
