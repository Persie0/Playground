package com.lingq.core.settings;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel", m4291f = "ReaderSettingsViewModel.kt", m4292l = {267, 268, 269}, m4293m = "buildTtsVoiceItems", m4294v = 2)
final class ReaderSettingsViewModel$buildTtsVoiceItems$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22584a;

    /* JADX INFO: renamed from: b */
    public String f22585b;

    /* JADX INFO: renamed from: c */
    public List f22586c;

    /* JADX INFO: renamed from: d */
    public List f22587d;

    /* JADX INFO: renamed from: e */
    public List f22588e;

    /* JADX INFO: renamed from: f */
    public List f22589f;

    /* JADX INFO: renamed from: g */
    public int f22590g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f22591h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1859b f22592i;

    /* JADX INFO: renamed from: j */
    public int f22593j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$buildTtsVoiceItems$1(C1859b c1859b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22592i = c1859b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22591h = obj;
        this.f22593j |= Integer.MIN_VALUE;
        return C1859b.m8611W2(this.f22592i, null, null, this);
    }
}
