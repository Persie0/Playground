package com.lingq.core.token.domain;

import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.domain.GetAsianScriptUseCase", m4291f = "GetAsianScriptUseCase.kt", m4292l = {123}, m4293m = "createTransliterationForPhrase", m4294v = 2)
final class GetAsianScriptUseCase$createTransliterationForPhrase$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f23763a;

    /* JADX INFO: renamed from: b */
    public Collection f23764b;

    /* JADX INFO: renamed from: c */
    public Iterator f23765c;

    /* JADX INFO: renamed from: d */
    public int f23766d;

    /* JADX INFO: renamed from: e */
    public int f23767e;

    /* JADX INFO: renamed from: f */
    public int f23768f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f23769g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1905b f23770h;

    /* JADX INFO: renamed from: i */
    public int f23771i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetAsianScriptUseCase$createTransliterationForPhrase$1(C1905b c1905b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f23770h = c1905b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23769g = obj;
        this.f23771i |= Integer.MIN_VALUE;
        return this.f23770h.m8716b(null, null, this);
    }
}
