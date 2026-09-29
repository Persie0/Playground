package com.lingq.feature.edit.domain;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.domain.SyncSentenceEditsUseCase", m4291f = "SyncSentenceEditsUseCase.kt", m4292l = {15, 18}, m4293m = "invoke", m4294v = 2)
final class SyncSentenceEditsUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f25972a;

    /* JADX INFO: renamed from: b */
    public List f25973b;

    /* JADX INFO: renamed from: c */
    public Iterator f25974c;

    /* JADX INFO: renamed from: d */
    public int f25975d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f25976e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2081a f25977f;

    /* JADX INFO: renamed from: g */
    public int f25978g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncSentenceEditsUseCase$invoke$1(C2081a c2081a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25977f = c2081a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25976e = obj;
        this.f25978g |= Integer.MIN_VALUE;
        return this.f25977f.m8995b(null, 0, null, this);
    }
}
