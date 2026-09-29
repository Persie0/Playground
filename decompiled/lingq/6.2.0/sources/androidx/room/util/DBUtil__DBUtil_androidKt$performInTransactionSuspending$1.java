package androidx.room.util;

import androidx.room.AbstractC0746d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt", m4291f = "DBUtil.android.kt", m4292l = {97, 262, 264, 264}, m4293m = "performInTransactionSuspending")
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC0746d f7007a;

    /* JADX INFO: renamed from: b */
    public SuspendLambda f7008b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f7009c;

    /* JADX INFO: renamed from: d */
    public int f7010d;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7009c = obj;
        this.f7010d |= Integer.MIN_VALUE;
        return AbstractC0758a.m2860c(null, null, this);
    }
}
