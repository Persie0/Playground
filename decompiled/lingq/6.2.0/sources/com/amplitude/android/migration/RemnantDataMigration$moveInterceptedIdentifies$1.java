package com.amplitude.android.migration;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.RemnantDataMigration", m4291f = "RemnantDataMigration.kt", m4292l = {130}, m4293m = "moveInterceptedIdentifies")
final class RemnantDataMigration$moveInterceptedIdentifies$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0893c f10913a;

    /* JADX INFO: renamed from: b */
    public Iterator f10914b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10915c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0893c f10916d;

    /* JADX INFO: renamed from: e */
    public int f10917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemnantDataMigration$moveInterceptedIdentifies$1(C0893c c0893c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10916d = c0893c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10915c = obj;
        this.f10917e |= Integer.MIN_VALUE;
        return this.f10916d.m5087f(this);
    }
}
