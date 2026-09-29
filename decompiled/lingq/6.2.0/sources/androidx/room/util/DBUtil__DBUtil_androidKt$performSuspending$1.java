package androidx.room.util;

import androidx.room.AbstractC0746d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt", m4291f = "DBUtil.android.kt", m4292l = {262, 264, 264}, m4293m = "performSuspending")
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AbstractC0746d f7035a;

    /* JADX INFO: renamed from: b */
    public vi3 f7036b;

    /* JADX INFO: renamed from: c */
    public boolean f7037c;

    /* JADX INFO: renamed from: d */
    public boolean f7038d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f7039e;

    /* JADX INFO: renamed from: f */
    public int f7040f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7039e = obj;
        this.f7040f |= Integer.MIN_VALUE;
        return AbstractC0758a.m2861d(null, null, this, false, false);
    }
}
