package com.lingq.feature.reader.reader;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3602t8;
import p000.c32;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.ReaderComposeViewModel$promotedCourse$lambda$1$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$promotedCourse$lambda$1$$inlined$map$1$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2492xbbf6dda1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30076a;

    /* JADX INFO: renamed from: b */
    public int f30077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3602t8 f30078c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2492xbbf6dda1(C3602t8 c3602t8, Continuation continuation) {
        super(continuation);
        this.f30078c = c3602t8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30076a = obj;
        this.f30077b |= Integer.MIN_VALUE;
        return this.f30078c.emit(null, this);
    }
}
