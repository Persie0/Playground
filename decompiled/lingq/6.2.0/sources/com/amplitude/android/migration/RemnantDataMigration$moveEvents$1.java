package com.amplitude.android.migration;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.migration.RemnantDataMigration", m4291f = "RemnantDataMigration.kt", m4292l = {102}, m4293m = "moveEvents")
final class RemnantDataMigration$moveEvents$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0893c f10903a;

    /* JADX INFO: renamed from: b */
    public Iterator f10904b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f10905c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0893c f10906d;

    /* JADX INFO: renamed from: e */
    public int f10907e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemnantDataMigration$moveEvents$1(C0893c c0893c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f10906d = c0893c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f10905c = obj;
        this.f10907e |= Integer.MIN_VALUE;
        return this.f10906d.m5085d(this);
    }
}
