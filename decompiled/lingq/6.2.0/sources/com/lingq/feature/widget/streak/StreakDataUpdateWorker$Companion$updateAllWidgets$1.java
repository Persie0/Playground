package com.lingq.feature.widget.streak;

import android.content.Context;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.widget.streak.StreakDataUpdateWorker$Companion", m4291f = "StreakDataUpdateWorker.kt", m4292l = {108, 110}, m4293m = "updateAllWidgets", m4294v = 2)
final class StreakDataUpdateWorker$Companion$updateAllWidgets$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f33859a;

    /* JADX INFO: renamed from: b */
    public Iterator f33860b;

    /* JADX INFO: renamed from: c */
    public int f33861c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f33862d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2870a f33863e;

    /* JADX INFO: renamed from: f */
    public int f33864f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreakDataUpdateWorker$Companion$updateAllWidgets$1(C2870a c2870a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33863e = c2870a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33862d = obj;
        this.f33864f |= Integer.MIN_VALUE;
        return this.f33863e.m9790e(null, this);
    }
}
